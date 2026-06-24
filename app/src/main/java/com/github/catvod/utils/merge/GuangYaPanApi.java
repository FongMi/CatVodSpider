package com.github.catvod.utils.merge;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.github.catvod.bean.guangya.GuangYaUser;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.Init;
import com.github.catvod.utils.GsonHelper;
import com.github.catvod.utils.PanHttpClient;
import com.github.catvod.utils.PanStringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 光鸭云盘 API 客户端
 */
public final class GuangYaPanApi {
    private static class Holder { static final GuangYaPanApi INSTANCE = new GuangYaPanApi(); }

    private static final String CLIENT_ID = "aMe-8VSlkrbQXpUR";
    private static final String API_BASE = "https://api.guangyapan.com/nd.bizuserres.s/v1";
    private static final String AUTH_BASE = "https://account.guangyapan.com/v1/auth";
    private static final long TOKEN_TTL_MS = 3_000_000; // 50 分钟
    private static final String[] VIDEO_EXTENSIONS = {
            ".mp4", ".mkv", ".avi", ".wmv", ".flv", ".mov", ".rmvb", ".rm",
            ".3gp", ".ts", ".m4v", ".webm", ".mpg", ".mpeg", ".m2ts"
    };

    // ==================== 实例字段 ====================

    private String lastShareId;
    private String cachedAccessToken;
    private long tokenExpiryTime;
    private String shareTitle;
    private final String deviceId = UUID.randomUUID().toString().replace("-", "");
    private GuangYaUser userInfo;
    private ScheduledExecutorService pollingExecutor;
    private AlertDialog qrDialog;

    // ==================== 构造与单例 ====================

    GuangYaPanApi() {
        try {
            GuangYaUser saved = (GuangYaUser) GsonHelper.fromJson(
                    LocalStorage.readJson("guangya_user"),
                    GuangYaUser.class);
            this.userInfo = saved != null ? saved : new GuangYaUser();
        } catch (Exception e) {
            this.userInfo = new GuangYaUser();
        }
    }

    public static GuangYaPanApi getInstance() {
        return Holder.INSTANCE;
    }

    // ==================== 设备授权流程 ====================

    /**
     * 启动设备授权流程：显示二维码 → 轮询 → 获取 token
     */
    public static void startDeviceAuth(GuangYaPanApi client) {
        client.dismissDialog();
        Init.execute(new L(client, 0));
    }

    /**
     * 取消授权流程：停止轮询，关闭对话框
     */
    public static void cancelAuth(GuangYaPanApi client) {
        stopPolling(client);
        Init.run(new B(client, 1));
    }

    /**
     * 开始轮询设备码授权结果
     */
    public static void startPolling(GuangYaPanApi client, String deviceCode) {
        stopPolling(client);
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        client.pollingExecutor = executor;
        executor.scheduleWithFixedDelay(new D(client, deviceCode, 1), 1L, 2L, TimeUnit.SECONDS);
    }

    /**
     * 显示二维码对话框
     */
    public static void showQrDialog(final GuangYaPanApi client, String qrUrl) {
        try {
            int sizePx = PanStringUtils.dpToPx(240);
            FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(sizePx, sizePx);
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(QrCodeUtils.generateQrCode(qrUrl, 240, 2));
            FrameLayout container = new FrameLayout(Init.context());
            params.gravity = 17;
            container.addView(imageView, params);
            AlertDialog dialog = new AlertDialog.Builder(Init.getActivity())
                    .setView(container)
                    .setOnCancelListener(dialogInterface -> GuangYaPanApi.onDialogCancelled(client))
                    .setOnDismissListener(dialogInterface -> GuangYaPanApi.cancelAuth(client))
                    .show();
            client.qrDialog = dialog;
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            SpiderDebug.log("請使用光鸭云盘 App 或浏览器掃描二維碼");
        } catch (Exception ignored) {
        }
    }

    /**
     * 请求设备码并显示二维码
     */
    public static void requestDeviceCode(GuangYaPanApi client) {
        try {
            JSONObject body = new JSONObject();
            body.put("scope", "user");
            body.put("client_id", CLIENT_ID);
            JSONObject resp = new JSONObject(
                    PanHttpClient.post(AUTH_BASE + "/device/code", body.toString(), client.buildHeaders()).a());
            String verificationUrl = resp.getString("verification_uri_complete");
            String deviceCode = resp.getString("device_code");
            Init.run(new RunnableC0755g(client, verificationUrl, 2));
            Init.execute(new E(client, deviceCode, 1));
        } catch (Exception e) {
            SpiderDebug.log("光鸭获取二维码失败: " + e.getMessage());
        }
    }

    /**
     * 对话框取消回调
     */
    public static void onDialogCancelled(GuangYaPanApi client) {
        stopPolling(client);
        Init.run(new B(client, 1));
    }

    /**
     * 从输入框提交 token
     */
    public static void submitToken(GuangYaPanApi client, EditText editText) {
        String token = editText.getText().toString();
        client.dismissDialog();
        Init.execute(new RunnableC0751e(client, token, 2));
    }

    /**
     * 轮询设备码换取 token
     */
    public static void pollForToken(GuangYaPanApi client, String deviceCode) {
        try {
            JSONObject body = new JSONObject();
            body.put("grant_type", "urn:ietf:params:oauth:grant-type:device_code");
            body.put("device_code", deviceCode);
            body.put("client_id", CLIENT_ID);
            String resp = PanHttpClient.post(AUTH_BASE + "/token", body.toString(), client.buildHeaders()).a();
            if (resp.contains("access_token") && resp.contains("refresh_token")) {
                JSONObject json = new JSONObject(resp);
                client.onTokenReceived(json.getString("access_token"), json.getString("refresh_token"));
            }
        } catch (Exception ignored) {
        }
    }

    private static void stopPolling(GuangYaPanApi client) {
        if (client.pollingExecutor != null) {
            client.pollingExecutor.shutdownNow();
        }
    }

    private void dismissDialog() {
        try {
            if (qrDialog != null) {
                qrDialog.dismiss();
            }
        } catch (Exception ignored) {
        }
    }

    private void onTokenReceived(String accessToken, String refreshToken) {
        SpiderDebug.log("光鸭Token获取成功: " + refreshToken);
        userInfo.e("Bearer " + accessToken);
        userInfo.f(refreshToken);
        userInfo.d();
        stopPolling(this);
        Init.run(new B(this, 1));
    }

    // ==================== Token 管理 ====================

    /**
     * 获取 AccessToken（带缓存）
     */
    private String getAccessToken(String shareId, String code) {
        try {
            if (shareId.equals(lastShareId) && (cachedAccessToken != null && !cachedAccessToken.isEmpty())
                    && System.currentTimeMillis() < tokenExpiryTime) {
                return cachedAccessToken;
            }
            JSONObject body = new JSONObject();
            body.put("shareId", shareId);
            if (code != null && !code.isEmpty()) {
                body.put("code", code);
            }
            String resp = apiPost(API_BASE + "/get_share_access_token", body, true);
            if (resp == null || resp.isEmpty()) return "";
            JSONObject json = new JSONObject(resp);
            if (!"success".equals(json.optString("msg"))) return "";
            cachedAccessToken = json.getJSONObject("data").getString("accessToken");
            lastShareId = shareId;
            tokenExpiryTime = System.currentTimeMillis() + TOKEN_TTL_MS;
            return cachedAccessToken;
        } catch (Exception e) {
            logError("光鸭云盘 getAccessToken 异常: ", e);
            return "";
        }
    }

    /**
     * 刷新 AccessToken
     */
    boolean refreshAccessToken() {
        try {
            SpiderDebug.log("光鸭云盘 refreshAccessToken...");
            String refreshToken = userInfo.c();
            if (refreshToken == null || refreshToken.isEmpty()) return false;
            Map<String, String> headers = buildHeaders();
            ((HashMap) headers).put("x-action", "401");
            JSONObject body = new JSONObject();
            body.put("client_id", CLIENT_ID);
            body.put("grant_type", "refresh_token");
            body.put("refresh_token", refreshToken);
            String resp = PanHttpClient.post(AUTH_BASE + "/token", body.toString(), headers).a();
            if (resp != null && !resp.isEmpty() && resp.contains("access_token")) {
                JSONObject json = new JSONObject(resp);
                String newAccess = json.getString("access_token");
                String newRefresh = json.optString("refresh_token", refreshToken);
                SpiderDebug.log("光鸭云盘 refreshAccessToken accessToken..." + newAccess);
                onTokenReceived(newAccess, newRefresh);
                return true;
            }
        } catch (Exception e) {
            logError("光鸭云盘 refreshAccessToken 异常: ", e);
        }
        return false;
    }

    /**
     * 设置用户 token（从配置读取）
     */
    public void setUser(String tokenOrUrl, boolean force) {
        if ((userInfo.c() == null || userInfo.c().isEmpty()) || force) {
            SpiderDebug.log("光鸭云盘 setUser: " + tokenOrUrl);
            if (tokenOrUrl != null && tokenOrUrl.startsWith("http")) {
                try {
                    tokenOrUrl = PanHttpClient.get(tokenOrUrl).trim();
                } catch (Exception e) {
                    logError("光鸭云盘 setUser fetching error: ", e);
                }
            }
            if (tokenOrUrl != null && !tokenOrUrl.isEmpty()) {
                userInfo.f(tokenOrUrl);
                userInfo.d();
            }
        }
    }

    // ==================== HTTP 请求 ====================

    private Map<String, String> buildHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36");
        headers.put("Referer", "https://www.guangyapan.com/");
        headers.put("Origin", "https://www.guangyapan.com");
        headers.put("dt", "4");
        headers.put("did", deviceId);
        String auth = userInfo.b();
        if (auth != null && !auth.isEmpty()) {
            headers.put("Authorization", auth);
        }
        return headers;
    }

    /**
     * POST 请求（带自动 token 刷新重试）
     *
     * @param url       API 地址
     * @param body      请求体
     * @param retry401  是否在 401 时自动刷新 token 重试
     * @return 响应字符串，失败返回空串
     */
    private String apiPost(String url, JSONObject body, boolean retry401) {
        try {
            String bodyStr = body.toString();
            Map<String, String> headers = buildHeaders();
            PanHttpClient.HttpResponse resp = PanHttpClient.post(url, bodyStr, headers);
            SpiderDebug.log("光鸭云盘 POST " + url + " body:" + body + " result:" + resp.a());
            if (retry401) {
                boolean needRetry = false;
                if (resp.code() == 401) {
                    needRetry = true;
                } else {
                    String respBody = resp.a();
                    if (respBody != null && !respBody.isEmpty()) {
                        int code = new JSONObject(respBody).optInt("code", 200);
                        if (code == 401 || code == 207) {
                            needRetry = true;
                        }
                    }
                }
                if (needRetry && refreshAccessToken()) {
                    return apiPost(url, body, false);
                }
            }
            return resp.a();
        } catch (Exception e) {
            logError("光鸭云盘 POST 异常: ", e);
            return "";
        }
    }

    // ==================== 文件列表 ====================

    /**
     * 获取分享目录下的文件列表
     */
    private JSONArray getFileList(String accessToken, String parentId) {
        try {
            JSONObject body = new JSONObject();
            body.put("pageSize", 200);
            body.put("accessToken", accessToken);
            body.put("parentId", parentId);
            body.put("orderBy", 0);
            body.put("sortType", 0);
            String resp = apiPost(API_BASE + "/get_share_page_files_list", body, true);
            if (resp != null && !resp.isEmpty()) {
                JSONObject json = new JSONObject(resp);
                if ("success".equals(json.optString("msg"))) {
                    return json.getJSONObject("data").optJSONArray("list");
                }
            }
        } catch (Exception e) {
            logError("光鸭云盘 getFilesList 异常: ", e);
        }
        return new JSONArray();
    }

    /**
     * 获取分享摘要信息
     */
    public JSONObject getShareSummary(String shareId, String code) {
        try {
            JSONObject body = new JSONObject();
            body.put("shareId", shareId);
            if (code != null && !code.isEmpty()) {
                body.put("code", code);
            }
            String resp = apiPost(API_BASE + "/get_share_summary", body, true);
            if (resp != null && !resp.isEmpty()) {
                JSONObject json = new JSONObject(resp);
                if ("success".equals(json.optString("msg"))) {
                    return json.optJSONObject("data");
                }
            }
        } catch (Exception e) {
            logError("光鸭云盘 getShareSummary 异常: ", e);
        }
        return null;
    }

    /**
     * 递归列出所有视频文件
     */
    private void listAllVideoFiles(String accessToken, String parentId, List<JSONObject> result, String parentPath) {
        try {
            JSONArray files = getFileList(accessToken, parentId);
            if (files == null) return;
            for (int i = 0; i < files.length(); i++) {
                JSONObject file = files.getJSONObject(i);
                if (file.optInt("resType") == 2) {
                    // 文件夹，递归
                    String folderName = file.getString("fileName");
                    String folderId = file.getString("fileId");
                    String path = (parentPath != null && !parentPath.isEmpty()) ? parentPath + "/" + folderName : folderName;
                    listAllVideoFiles(accessToken, folderId, result, path);
                } else if (isVideoFile(file)) {
                    file.put("_parentName", parentPath != null ? parentPath : "");
                    result.add(file);
                }
            }
        } catch (Exception e) {
            logError("光鸭云盘 listAllVideoFiles 异常: ", e);
        }
    }

    /**
     * 判断文件是否为视频类型
     */
    private boolean isVideoFile(JSONObject file) {
        String mimeType = file.optString("mineType", "");
        String ext = file.optString("ext", "").toLowerCase();
        if (mimeType.startsWith("video/")) return true;
        for (String videoExt : VIDEO_EXTENSIONS) {
            if (ext.equals(videoExt)) return true;
        }
        return false;
    }

    // ==================== 搜索 ====================

    /**
     * 搜索分享文件
     */
    public JSONArray searchFiles(String shareId, String code, String keyword) {
        try {
            String accessToken = getAccessToken(shareId, code);
            if (accessToken == null || accessToken.isEmpty()) return new JSONArray();
            JSONObject body = new JSONObject();
            body.put("accessToken", accessToken);
            body.put("keyword", keyword);
            body.put("page", 0);
            body.put("pageSize", 100);
            String resp = apiPost(API_BASE + "/share_page_search_files", body, true);
            if (resp != null && !resp.isEmpty()) {
                JSONObject json = new JSONObject(resp);
                if ("success".equals(json.optString("msg"))) {
                    return json.optJSONObject("data").optJSONArray("list");
                }
            }
        } catch (Exception e) {
            logError("光鸭云盘 searchFiles 异常: ", e);
        }
        return new JSONArray();
    }

    // ==================== 获取下载链接 ====================

    /**
     * 获取文件下载链接
     */
    public String getDownloadUrl(String shareId, String fileId, String code) {
        try {
            String accessToken = getAccessToken(shareId, code);
            if (accessToken == null || accessToken.isEmpty()) return "";
            JSONObject body = new JSONObject();
            body.put("fileId", fileId);
            body.put("accessToken", accessToken);
            String resp = apiPost(API_BASE + "/get_share_download_url", body, true);
            if (resp != null && !resp.isEmpty()) {
                JSONObject json = new JSONObject(resp);
                if ("success".equals(json.optString("msg"))) {
                    return json.getJSONObject("data").optString("downloadUrl", "");
                }
                SpiderDebug.log("光鸭云盘 下载失败: " + json.optString("msg") + " code:" + json.optInt("code"));
            }
        } catch (Exception e) {
            logError("光鸭云盘 getDownloadUrl 异常: ", e);
        }
        return "";
    }

    // ==================== VodItem 构建 ====================

    /**
     * 构建 VodItem（视频详情页）
     */
    public com.github.catvod.bean.VodItem buildVodItem(String shareId, String fileId, String folderId, String code, String name) {
        try {
            String accessToken = getAccessToken(shareId, code);
            if (accessToken == null || accessToken.isEmpty()) {
                return createErrorVod(shareId, name);
            }
            String displayName = name;
            JSONObject summary = getShareSummary(shareId, code);
            if (summary != null) {
                this.shareTitle = summary.optString("title", "光鸭云盘");
                if (name == null || name.isEmpty()) {
                    displayName = this.shareTitle;
                }
            }
            ArrayList<JSONObject> videoFiles = new ArrayList<>();
            String targetFolder = (folderId != null && !folderId.isEmpty()) ? folderId : "";
            listAllVideoFiles(accessToken, targetFolder, videoFiles, "");
            if (videoFiles.isEmpty()) {
                return createErrorVod(shareId, displayName);
            }
            // 构建播放列表
            ArrayList<String> sourceNames = new ArrayList<>();
            sourceNames.add("光鸭原畫");
            ArrayList<String> playUrls = new ArrayList<>();
            ArrayList<String> episodeList = new ArrayList<>();
            for (JSONObject file : videoFiles) {
                String fileName = PanStringUtils.cleanFilename(file.getString("fileName"));
                String videoFileId = file.getString("fileId");
                double fileSize = file.optDouble("fileSize", file.optDouble("size", 0.0d));
                String sizeStr = fileSize == 0.0d ? "" : "[" + PanStringUtils.formatFileSize(fileSize) + "]";
                String display = TextUtils.join(" ", Arrays.asList(
                        PanStringUtils.extractEpisodeNumber(fileName), sizeStr, fileName)).trim();
                episodeList.add(display + "$" + shareId + "+" + videoFileId + "+" + code + "+" + displayName);
            }
            playUrls.add(TextUtils.join("#", episodeList));
            // 组装 VodItem
            com.github.catvod.bean.VodItem vod = new com.github.catvod.bean.VodItem();
            vod.l(shareId);
            vod.j(shareId);
            String title = (displayName != null && !displayName.isEmpty()) ? displayName : this.shareTitle;
            vod.m(title);
            vod.p(TextUtils.join("$$$", playUrls));
            vod.o(TextUtils.join("$$$", sourceNames));
            vod.g("光鸭雲盤");
            return vod;
        } catch (Exception e) {
            logError("光鸭云盘 getVod 异常: ", e);
            return createErrorVod(shareId, name);
        }
    }

    /**
     * 构建文件夹浏览列表
     */
    public List<com.github.catvod.bean.VodItem> buildFolderList(com.github.catvod.bean.JsonUtils params) {
        String shareCode = params.d();
        String shareId = params.c();
        String folderId = params.f();
        String pathPrefix = params.e();
        String currentFolderId = params.b();
        ArrayList<com.github.catvod.bean.VodItem> result = new ArrayList<>();
        try {
            String accessToken = getAccessToken(shareId, shareCode);
            if (accessToken == null || accessToken.isEmpty()) return result;
            if ((folderId == null || folderId.isEmpty() || currentFolderId == null || currentFolderId.isEmpty())) {
                JSONObject summary = getShareSummary(shareId, shareCode);
                if (summary != null) {
                    summary.optString("title", "光鸭云盘");
                }
            }
            if (currentFolderId == null || currentFolderId.isEmpty()) {
                currentFolderId = "";
            }
            JSONArray files = getFileList(accessToken, currentFolderId);
            if (files == null) return result;
            for (int i = 0; i < files.length(); i++) {
                JSONObject file = files.getJSONObject(i);
                com.github.catvod.bean.VodItem vod = new com.github.catvod.bean.VodItem();
                String fileName = file.getString("fileName");
                String fileId = file.getString("fileId");
                if (file.optInt("resType") == 2) {
                    vod.l(shareId + "*#" + fileId + "*#" + fileName);
                    vod.m(fileName);
                    vod.r("folder");
                } else if (isVideoFile(file) || BaseApi.get().d.booleanValue()
                        || (PanStringUtils.getMimeType(fileName) != null
                        && !PanStringUtils.getMimeType(fileName).isEmpty())) {
                    vod.l(pathPrefix + file.getString("parentId") + "*#" + fileId + "*#" + fileName);
                    vod.m(fileName);
                    vod.r("file");
                }
                result.add(vod);
            }
        } catch (Exception e) {
            logError("光鸭云盘 getVodFolder 异常: ", e);
        }
        return result;
    }

    private com.github.catvod.bean.VodItem createErrorVod(String id, String name) {
        com.github.catvod.bean.VodItem vod = new com.github.catvod.bean.VodItem();
        vod.l(id);
        vod.m((name != null && !name.isEmpty()) ? name : "光鸭云盘");
        vod.j("无法获取文件列表");
        vod.g("光鸭雲盤");
        return vod;
    }

    private static void logError(String message, Exception e) {
        SpiderDebug.log(message + e.getMessage());
    }
}
