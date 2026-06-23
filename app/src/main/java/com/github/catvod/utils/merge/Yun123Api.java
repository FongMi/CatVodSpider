package com.github.catvod.utils.merge;

import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Proxy;
import com.github.catvod.utils.okhttp.OkHttpUtil;
import com.github.catvod.utils.server.Server;
import com.google.gson.Gson;
import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URLDecoder;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 123 盘 API 客户端
 */
public final class Yun123Api {
    private static class Holder { static final Yun123Api INSTANCE = new Yun123Api(); }

    // ==================== 常量 ====================

    private static final Pattern SHARE_URL_PATTERN = Pattern.compile(
            "https://(?:www\\.123684\\.com|www\\.123865\\.com|www\\.123912\\.com|www\\.123pan\\.com|www\\.123pan\\.cn|www\\.123592\\.com)/s/([^/?]+)");
    private static final String API_BASE = "https://www.123684.com/b/api/share";
    private static final String LOGIN_URL = "https://login.123pan.com/api/user/sign_in";

    // ==================== 实例字段 ====================

    /**
     * 下载链接缓存 {shareKey+fileId → downloadUrl}
     */
    public final Map<String, String> downloadCache = new ConcurrentHashMap<>();
    private final OkHttpClient httpClient = OkHttpUtil.defaultClient();
    private String shareKey;
    private String sharePwd;
    private String shareTitle;
    public Yun123UserInfo userInfo;

    // ==================== 构造与单例 ====================

    public Yun123Api() {
        try {
            Yun123UserInfo saved = new Gson().fromJson(
                    LocalStorage.readJson("p123_user"),
                    Yun123UserInfo.class);
            this.userInfo = saved != null ? saved : new Yun123UserInfo();
        } catch (Exception e) {
            SpiderDebug.log("p123授权初始化失败，请删除根目录TV文件夹下授权文件后重试");
        }
    }

    public static Yun123Api getInstance() {
        return Holder.INSTANCE;
    }

    // ==================== 登录 ====================

    /**
     * 确保已登录（token 过期时自动重新登录）
     */
    public final ApiResult ensureLoggedIn() {
        try {
            if (Long.parseLong(userInfo.b()) > System.currentTimeMillis() / 1000) {
                return ApiResult.success("");
            }
        } catch (Exception ignored) {
        }
        try {
            String username = userInfo.d();
            String password = userInfo.e();
            if (username == null || password == null) {
                return ApiResult.error("Credentials not found");
            }
            JSONObject body = new JSONObject();
            body.put("passport", username);
            body.put("password", password);
            body.put("remember", true);
            try (Response resp = httpClient.newCall(new Request.Builder()
                    .url(LOGIN_URL)
                    .post(RequestBody.create(MediaType.parse("application/json"), body.toString()))
                    .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36")
                    .addHeader("Content-Type", "application/json")
                    .addHeader("App-Version", "43")
                    .addHeader("Referer", "https://login.123pan.com/centerlogin?redirect_url=https%3A%2F%2Fwww.123684.com&source_page=website")
                    .build()).execute()) {
                if (!resp.isSuccessful()) {
                    return ApiResult.error("HTTP error: " + resp.code());
                }
                JSONObject json = new JSONObject(resp.body().string());
                if (json.getInt("code") == 200) {
                    JSONObject data = json.getJSONObject("data");
                    userInfo.h(data.getString("token"));
                    userInfo.g(data.getString("refresh_token_expire_time"));
                    userInfo.f();
                }
                return ApiResult.success("");
            }
        } catch (Exception e) {
            return ApiResult.error("Login failed: " + e.getMessage());
        }
    }

    // ==================== URL 解析 ====================

    /**
     * 解析分享链接，提取 shareKey 和 sharePwd
     *
     * @param url 分享 URL，如 "https://www.123684.com/s/xxx?pwd=yyy"
     * @return shareKey（失败返回 null）
     */
    public final ApiResult parseShareUrl(String url) {
        try {
            String normalized = url.replace("//123", "//www.123");
            Matcher matcher = SHARE_URL_PATTERN.matcher(normalized);
            if (!matcher.find()) {
                return ApiResult.error("Invalid share URL");
            }
            Matcher keyMatcher = Pattern.compile("([A-Za-z0-9-]+)").matcher(matcher.group(1));
            if (keyMatcher.find()) {
                this.shareKey = keyMatcher.group(1);
            }
            // 提取密码
            String pwdPart = normalized.replace("pwd=", "提取码:");
            int pwdIndex = pwdPart.indexOf("提取码");
            if (pwdIndex != -1) {
                Matcher pwdMatcher = Pattern.compile("([A-Za-z0-9]+)").matcher(pwdPart.substring(pwdIndex + 1));
                this.sharePwd = pwdMatcher.find() ? pwdMatcher.group(1) : "";
            }
            return ApiResult.success(this.shareKey);
        } catch (Exception e) {
            return null;
        }
    }

    // ==================== 文件列表 ====================

    /**
     * 获取分享根目录文件列表
     */
    private ApiResult fetchRootFiles(String shareKey, List<Yun123File> fileList) {
        try {
            try (Response resp = httpClient.newCall(new Request.Builder()
                    .url(HttpUrl.parse(API_BASE + "/get").newBuilder()
                            .addQueryParameter("limit", "10000")
                            .addQueryParameter("next", "0")
                            .addQueryParameter("orderBy", "file_name")
                            .addQueryParameter("orderDirection", "asc")
                            .addQueryParameter("shareKey", shareKey)
                            .addQueryParameter("SharePwd", this.sharePwd)
                            .addQueryParameter("ParentFileId", "0")
                            .addQueryParameter("Page", "1")
                            .build()).get().build()).execute()) {
                if (!resp.isSuccessful()) {
                    return ApiResult.error("HTTP error: " + resp.code());
                }
                JSONObject data = new JSONObject(resp.body().string()).getJSONObject("data");
                ArrayList<Yun123FolderRef> folders = new ArrayList<>();
                JSONArray infoList = data.getJSONArray("InfoList");
                this.shareTitle = infoList.getJSONObject(0).getString("FileName");
                for (int i = 0; i < infoList.length(); i++) {
                    JSONObject item = infoList.getJSONObject(i);
                    if (item.getInt("Category") == 0) {
                        // 文件夹
                        long fileId = item.getLong("FileId");
                        folders.add(new Yun123FolderRef(shareKey, fileId));
                    } else if (BaseApi.get().d.booleanValue()
                            || (getFileExtension(item.getString("FileName")) != null
                            && !getFileExtension(item.getString("FileName")).isEmpty())) {
                        // 视频文件
                        fileList.add(new Gson().fromJson(item.toString(), Yun123File.class));
                    }
                }
                if (!fileList.isEmpty()) {
                    Collections.sort(fileList);
                }
                return ApiResult.success(folders);
            }
        } catch (Exception e) {
            return ApiResult.error("Failed to get share info: " + e.getMessage());
        }
    }

    /**
     * 获取指定文件夹中的文件列表（递归）
     */
    private ApiResult fetchFiles(String shareKey, long folderId, int page) {
        try {
            Response resp = httpClient.newCall(new Request.Builder()
                    .url(HttpUrl.parse(API_BASE + "/get").newBuilder()
                            .addQueryParameter("limit", "100")
                            .addQueryParameter("next", "0")
                            .addQueryParameter("orderBy", "file_name")
                            .addQueryParameter("orderDirection", "asc")
                            .addQueryParameter("shareKey", shareKey)
                            .addQueryParameter("SharePwd", this.sharePwd)
                            .addQueryParameter("ParentFileId", String.valueOf(folderId))
                            .addQueryParameter("Page", String.valueOf(page))
                            .build()).get().build()).execute();
            try {
                if (!resp.isSuccessful()) {
                    return ApiResult.error("HTTP error: " + resp.code());
                }
                Yun123File folder = (Yun123File) new Gson().fromJson(
                        new JSONObject(resp.body().string()).getJSONObject("data").toString(),
                        Yun123File.class);
                if (folder.children().isEmpty()) {
                    return ApiResult.error("file list isEmpty");
                }
                Collections.sort(folder.children());
                ArrayList<Yun123File> result = new ArrayList<>();
                for (Yun123File file : folder.children()) {
                    if (file.type().equals("file") && (BaseApi.get().d.booleanValue()
                            || (getFileExtension(file.name()) != null
                            && !getFileExtension(file.name()).isEmpty()))) {
                        result.add(file);
                    } else if (file.type().equals("folder")) {
                        // 递归获取子文件夹
                        for (int p = 1; p < Integer.MAX_VALUE; p++) {
                            ApiResult subResult = fetchFiles(shareKey, file.fileId().longValue(), p);
                            if (!subResult.isSuccess()) break;
                            result.addAll((Collection<Yun123File>) subResult.getValue());
                        }
                    }
                }
                return ApiResult.success(result);
            } finally {
                resp.close();
            }
        } catch (Exception e) {
            return ApiResult.error("Failed to get file list: " + e.getMessage());
        }
    }

    /**
     * 递归获取所有文件
     */
    public final ApiResult getAllFiles(String shareKey) {
        try {
            ArrayList<Yun123File> allFiles = new ArrayList<>();
            for (Yun123FolderRef folder : (List<Yun123FolderRef>) fetchRootFiles(shareKey, allFiles).getValue()) {
                for (int page = 1; page < Integer.MAX_VALUE; page++) {
                    ApiResult pageResult = fetchFiles(folder.shareKey, folder.folderId, page);
                    if (!pageResult.isSuccess()) break;
                    allFiles.addAll((Collection<Yun123File>) pageResult.getValue());
                }
            }
            return ApiResult.success(allFiles);
        } catch (Exception e) {
            return ApiResult.error("Failed to get files: " + e.getMessage());
        }
    }

    // ==================== 下载链接 ====================

    /**
     * 获取文件下载链接
     */
    public final ApiResult getDownloadInfo(String shareKey, long fileId, String s3KeyFlag, long size, String etag) {
        try {
            ensureLoggedIn();
            JSONObject body = new JSONObject();
            body.put("ShareKey", shareKey);
            body.put("FileID", fileId);
            body.put("S3KeyFlag", s3KeyFlag);
            body.put("Size", size);
            body.put("Etag", etag);
            try (Response resp = httpClient.newCall(new Request.Builder()
                    .url(API_BASE + "/download/info")
                    .post(RequestBody.create(MediaType.parse("application/json"), body.toString()))
                    .addHeader("Authorization", "Bearer " + userInfo.c())
                    .addHeader("User-Agent", "Mozilla/5.0")
                    .addHeader("platform", "android")
                    .build()).execute()) {
                if (!resp.isSuccessful()) {
                    SpiderDebug.log(resp.body().string());
                    return ApiResult.error("HTTP error: " + resp.code());
                }
                String downloadUrl = new JSONObject(resp.body().string())
                        .getJSONObject("data").getString("DownloadURL");
                // 从 URL 中提取 Base64 编码的参数
                String[] queryParams = downloadUrl.split("\\?")[1].split("&");
                String encodedParams = null;
                for (String param : queryParams) {
                    String[] kv = param.split("=");
                    if (kv[0].equals("params")) {
                        encodedParams = kv[1];
                        break;
                    }
                }
                String decoded = new String(Base64.decode(URLDecoder.decode(encodedParams, "UTF-8"), 0));
                return ApiResult.success(decoded);
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return ApiResult.error("Download failed: " + e.getMessage());
        }
    }

    /**
     * 获取缓存的下载 URL
     */
    public final String getCachedUrl(String shareKey, String fileId) {
        try {
            return downloadCache.get(shareKey + fileId);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    // ==================== VodItem 构建 ====================

    /**
     * 构建视频详情 VodItem
     */
    public final com.github.catvod.bean.VodItem buildVodItem(String shareId) {
        ArrayList<String> sourceNames = new ArrayList<>();
        sourceNames.add("p123原畫");
        if (NetPan.containPuHua()) {
            sourceNames.add("p123普畫");
        }
        try {
            String key = (String) getInstance().parseShareUrl(shareId).getValue();
            com.github.catvod.bean.VodItem vod = new com.github.catvod.bean.VodItem();
            List<Yun123File> files = (List<Yun123File>) getInstance().getAllFiles(key).getValue();
            // 过滤出有扩展名的文件
            ArrayList<Yun123File> videoFiles = new ArrayList<>();
            for (Yun123File file : files) {
                String ext = getFileExtension(file.name());
                if (ext != null && !ext.isEmpty()) {
                    videoFiles.add(file);
                }
            }
            SpiderDebug.log("Comparator.comparing");
            // 构建播放列表
            ArrayList<String> episodeList = new ArrayList<>();
            for (Yun123File file : videoFiles) {
                episodeList.add(file.display() + "$" + key + "+" + sharePwd + "+"
                        + getCleanFileName(shareTitle) + "+"
                        + file.name() + "+" + file.etag() + "+" + file.fileId() + "+"
                        + file.s3KeyFlag() + "+" + file.size());
            }
            ArrayList<String> playUrls = new ArrayList<>();
            for (int i = 0; i < sourceNames.size(); i++) {
                playUrls.add(TextUtils.join("#", episodeList));
            }
            // 组装 VodItem
            vod.l(shareId);
            vod.j(shareId);
            vod.n("https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c3/2b/fa/c32bfa72-c460-e1a4-d8a1-ba175f59bbce/AppIcon-0-0-1x_U007emarketing-0-8-0-85-220.png/350x350.png");
            vod.m(getCleanFileName(shareTitle));
            vod.p(TextUtils.join("$$$", playUrls));
            vod.o(TextUtils.join("$$$", sourceNames));
            vod.g("p123");
            return vod;
        } catch (Exception e) {
            SpiderDebug.log(e.getMessage());
            return BaseApi.fakeVod(sourceNames, "p123");
        }
    }

    // ==================== 播放地址 ====================

    /**
     * 获取播放地址
     *
     * @param params 参数数组 [shareKey, ?, fileName, fileSize, etag, fileId, s3KeyFlag, size, ...]
     * @return 播放信息 JSON
     */
    public final String getPlayUrl(String[] params) {
        String playUrl;
        try {
            if (!downloadCache.containsKey(params[0] + params[5])) {
                String url = (String) getDownloadInfo(params[0], Long.parseLong(params[5]),
                        params[6], Long.parseLong(params[7]), params[4]).getValue();
                SpiderDebug.log("p123 playerContent:" + url);
                downloadCache.put(params[0] + params[5], url);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String cachedUrl = getCachedUrl(params[0], params[5]);
        if (BaseApi.get().d.booleanValue()) {
            String fileName = params[2] + params[3];
            BaseApi.get().downloadFileWithDownloadManager(cachedUrl, fileName, buildDefaultHeaders());
            SpiderDebug.log("正在下载 " + fileName);
            playUrl = Server.B();
        } else {
            playUrl = NetPan.getIsoDownloadUrl(cachedUrl);
        }
        // 组装结果
        PlayResult result = new PlayResult();
        result.setUrl(playUrl);
        result.setOctetStream();
        result.setExtra(AliDriveHelper.getDanmakuUrl(params));
        result.setHeaders(buildDefaultHeaders());
        // 字幕
        ArrayList<com.github.catvod.bean.h> subtitles = new ArrayList<>();
        for (String param : params) {
            if (param.contains("@@@")) {
                String[] parts = param.split("@@@");
                String subName = parts[0];
                String subExt = parts[1];
                String subUrl = Proxy.getUrl() + "?do=ali&type=sub&shareId=" + params[0] + "&fileId=" + parts[2];
                com.github.catvod.bean.h sub = new com.github.catvod.bean.h();
                sub.b(subName);
                sub.a(subExt);
                sub.c(subUrl);
                subtitles.add(sub);
            }
        }
        result.setSubtitles(subtitles);
        return result.toString();
    }

    // ==================== 凭据管理 ====================

    /**
     * 设置 123 盘用户名和密码
     *
     * @param credentials "username|password" 格式
     * @param force       是否强制更新
     */
    public final void setCredentials(String credentials, boolean force) {
        if ((userInfo.d() == null || userInfo.d().isEmpty()) || force) {
            SpiderDebug.log("set new UserName:" + credentials);
            if (credentials != null && credentials.startsWith("http")) {
                credentials = OkHttpUtil.string(credentials, new HashMap<>()).trim();
            }
            if (credentials != null && !credentials.isEmpty()) {
                userInfo.i(credentials.split("\\|")[0]);
                userInfo.j(credentials.split("\\|")[1]);
                userInfo.f();
            }
        }
    }

    // ==================== 辅助方法 ====================

    /** 获取文件扩展名（小写），无扩展名返回 null */
    private static String getFileExtension(String fileName) {
        if (fileName == null || !fileName.contains(".")) return null;
        String ext = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
        return ext.isEmpty() ? null : ext;
    }

    /** 返回清理后的文件名（去除 # + $ 特殊字符） */
    private static String getCleanFileName(String fileName) {
        if (fileName == null || fileName.isEmpty()) return "";
        return fileName.replaceAll("#", "").replaceAll("\\+", "").replaceAll("\\$", "");
    }

    /** 构建默认请求头 */
    private static Map<String, String> buildDefaultHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
        return headers;
    }
}
