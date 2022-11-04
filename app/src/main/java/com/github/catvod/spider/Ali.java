package com.github.catvod.spider;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.bean.ali.Data;
import com.github.catvod.bean.ali.Item;
import com.github.catvod.net.OkHttpUtil;
import com.github.catvod.utils.Misc;
import com.github.catvod.utils.Prefers;
import com.github.catvod.utils.QRCode;
import com.github.catvod.utils.Trans;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ColaMint & Adam & FongMi
 */
public class Ali {

    private final Pattern pattern = Pattern.compile("www.aliyundrive.com/s/([^/]+)(/folder/([^/]+))?");
    private ScheduledExecutorService service;
    private static String accessToken;
    private String refreshToken;
    private ImageView view;

    public Ali(String token) {
        if (TextUtils.isEmpty(token)) Init.show("尚未設定 Token");
        if (token.startsWith("http")) token = OkHttpUtil.string(token);
        refreshToken = Prefers.getString("token", token);
    }

    private static HashMap<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", Misc.CHROME);
        headers.put("Referer", "https://www.aliyundrive.com/");
        return headers;
    }

    private static HashMap<String, String> getHeaders(String shareToken) {
        HashMap<String, String> headers = getHeaders();
        if (accessToken != null) headers.put("authorization", accessToken);
        headers.put("x-share-token", shareToken);
        return headers;
    }

    private String post(String url, JSONObject body) {
        url = url.startsWith("https") ? url : "https://api.aliyundrive.com/" + url;
        return OkHttpUtil.postJson(url, body.toString(), getHeaders());
    }

    private static String post(String url, JSONObject body, String shareToken) {
        url = url.startsWith("https") ? url : "https://api.aliyundrive.com/" + url;
        return OkHttpUtil.postJson(url, body.toString(), getHeaders(shareToken));
    }

    public String detailContent(List<String> ids) throws Exception {
        String url = ids.get(0).trim();
        Matcher matcher = pattern.matcher(url);
        if (matcher.find()) return Result.string(getVod(matcher, url));
        return "";
    }

    public String playerContent(String flag, String id) {
        String[] ids = id.split("\\+");
        String shareId = ids[0];
        String shareToken = ids[1];
        String fileId = ids[2];
        String sub = getSub(shareId, shareToken, ids);
        refreshAccessToken();
        while (TextUtils.isEmpty(accessToken)) SystemClock.sleep(250);
        if (flag.equals("原畫")) {
            return Result.get().url(getDownloadUrl(shareId, shareToken, fileId)).sub(sub).header(getHeaders()).string();
        } else {
            return Result.get().url(getPreviewUrl(shareId, shareToken, fileId)).sub(sub).header(getHeaders()).string();
        }
    }

    private Vod getVod(Matcher matcher, String url) throws Exception {
        String shareId = matcher.group(1);
        String shareToken = getShareToken(shareId);
        String fileId = matcher.groupCount() == 3 ? matcher.group(3) : "";
        JSONObject body = new JSONObject();
        body.put("share_id", shareId);
        String json = post("adrive/v3/share_link/get_share_by_anonymous", body);
        JSONObject object = new JSONObject(json);
        LinkedHashMap<String, String> name2id = new LinkedHashMap<>();
        Map<String, List<String>> subMap = new HashMap<>();
        listFiles(new Item(getParentFileId(fileId, object)), name2id, subMap, shareId, shareToken);
        List<String> playUrls = new ArrayList<>();
        List<String> names = new ArrayList<>(name2id.keySet());
        for (String name : names) playUrls.add(Trans.get(name) + "$" + name2id.get(name) + findSubs(name, subMap));
        if (playUrls.isEmpty()) Init.show("來晚啦，該分享已失效。");
        List<String> sourceUrls = new ArrayList<>();
        sourceUrls.add(TextUtils.join("#", playUrls));
        sourceUrls.add(TextUtils.join("#", playUrls));
        Vod vod = new Vod();
        vod.setVodId(url);
        vod.setVodContent(url);
        vod.setVodPic(object.getString("avatar"));
        vod.setVodName(object.getString("share_name"));
        vod.setVodPlayUrl(TextUtils.join("$$$", sourceUrls));
        vod.setVodPlayFrom("原畫$$$普畫");
        vod.setTypeName("阿里雲盤");
        return vod;
    }

    private void listFiles(Item folder, LinkedHashMap<String, String> name2id, Map<String, List<String>> subMap, String shareId, String shareToken) throws Exception {
        JSONObject body = new JSONObject();
        body.put("share_id", shareId);
        body.put("parent_file_id", folder.getId());
        body.put("order_by", "name");
        body.put("order_direction", "ASC");
        String json = post("adrive/v3/file/list", body, shareToken);
        JSONArray items = new JSONObject(json).getJSONArray("items");
        for (int j = 0; j < items.length(); ++j) {
            JSONObject item = items.getJSONObject(j);
            String type = item.optString("type");
            String name = item.optString("name");
            String fileId = item.optString("file_id");
            String category = item.optString("category", "");
            String ext = item.optString("file_extension", "");
            if (type.equals("folder")) {
                listFiles(new Item(fileId, name), name2id, subMap, shareId, shareToken);
                continue;
            }
            if (category.equals("video")) {
                name2id.put(folder.getName(name), shareId + "+" + shareToken + "+" + fileId);
                continue;
            }
            if (Misc.isSub(ext)) {
                name = name.replace("." + ext, "");
                if (!subMap.containsKey(name)) subMap.put(name, new ArrayList<>());
                Objects.requireNonNull(subMap.get(name)).add(name + "@" + fileId + "@" + ext);
            }
        }
    }

    private String getParentFileId(String fileId, JSONObject shareInfo) throws Exception {
        JSONArray array = shareInfo.getJSONArray("file_infos");
        if (!TextUtils.isEmpty(fileId)) return fileId;
        if (array.length() == 0) return "";
        JSONObject fileInfo = array.getJSONObject(0);
        if (fileInfo.getString("type").equals("folder")) return fileInfo.getString("file_id");
        if (fileInfo.getString("type").equals("file") && fileInfo.getString("category").equals("video")) return "root";
        return "";
    }

    private void refreshAccessToken() {
        try {
            JSONObject body = new JSONObject();
            body.put("refresh_token", refreshToken);
            body.put("grant_type", "refresh_token");
            JSONObject object = new JSONObject(post("https://auth.aliyundrive.com/v2/account/token", body));
            accessToken = object.getString("token_type") + " " + object.getString("access_token");
        } catch (JSONException e) {
            accessToken = null;
            e.printStackTrace();
            checkService();
            getQRCode();
        }
    }

    private String findSubs(String name, Map<String, List<String>> subMap) {
        name = name.substring(0, name.lastIndexOf("."));
        List<String> subs = subMap.get(name);
        if (subs != null && subs.size() > 0) return combineSubs(subs);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : subMap.entrySet()) sb.append(combineSubs(entry.getValue()));
        return sb.toString();
    }

    private String combineSubs(List<String> subs) {
        StringBuilder sb = new StringBuilder();
        for (String sub : subs) sb.append("+").append(sub);
        return sb.toString();
    }

    private String getSub(String shareId, String shareToken, String[] ids) {
        StringBuilder sb = new StringBuilder();
        for (String text : ids) {
            if (!text.contains("@")) continue;
            String[] arr = text.split("@");
            String url = Proxy.getUrl() + "?do=ali&type=sub&share_id=" + shareId + "&share_token=" + shareToken + "&file_id=" + arr[1];
            sb.append(Trans.get(arr[0])).append("#").append(Misc.getSubMimeType(arr[2])).append("#").append(url).append("$$$");
        }
        return Misc.substring(sb.toString(), 3);
    }

    private String getShareToken(String shareId) {
        try {
            JSONObject body = new JSONObject();
            body.put("share_id", shareId);
            body.put("share_pwd", "");
            String json = post("v2/share_link/get_share_token", body);
            return new JSONObject(json).getString("share_token");
        } catch (JSONException e) {
            Init.show("來晚啦，該分享已失效。");
            e.printStackTrace();
            return "";
        }
    }

    private String getPreviewQuality(JSONArray taskList) throws Exception {
        for (String templateId : Arrays.asList("UHD", "QHD", "FHD", "HD", "SD", "LD")) {
            for (int i = 0; i < taskList.length(); ++i) {
                JSONObject task = taskList.getJSONObject(i);
                if (task.getString("template_id").equals(templateId)) {
                    return task.getString("url");
                }
            }
        }
        return taskList.getJSONObject(0).getString("url");
    }

    private String getPreviewUrl(String shareId, String shareToken, String fileId) {
        try {
            JSONObject body = new JSONObject();
            body.put("file_id", fileId);
            body.put("share_id", shareId);
            body.put("template_id", "");
            body.put("category", "live_transcoding");
            String json = post("v2/file/get_share_link_video_preview_play_info", body, shareToken);
            JSONArray taskList = new JSONObject(json).getJSONObject("video_preview_play_info").getJSONArray("live_transcoding_task_list");
            Map<String, List<String>> respHeaders = new HashMap<>();
            OkHttpUtil.stringNoRedirect(getPreviewQuality(taskList), getHeaders(), respHeaders);
            return OkHttpUtil.getRedirectLocation(respHeaders);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String getDownloadUrl(String shareId, String shareToken, String fileId) {
        try {
            JSONObject body = new JSONObject();
            body.put("file_id", fileId);
            body.put("share_id", shareId);
            body.put("expire_sec", 600);
            String json = post("v2/file/get_share_link_download_url", body, shareToken);
            String url = new JSONObject(json).optString("download_url");
            Map<String, List<String>> respHeaders = new HashMap<>();
            OkHttpUtil.stringNoRedirect(url, getHeaders(), respHeaders);
            return OkHttpUtil.getRedirectLocation(respHeaders);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static Object[] vod(Map<String, String> params) {
        String shareId = params.get("share_id");
        String shareToken = params.get("share_token");
        String fileId = params.get("file_id");
        String text = OkHttpUtil.string(getDownloadUrl(shareId, shareToken, fileId), getHeaders(shareToken));
        Object[] result = new Object[3];
        result[0] = 200;
        result[1] = "application/octet-stream";
        result[2] = new ByteArrayInputStream(text.getBytes());
        return result;
    }

    private void checkService() {
        if (service != null) service.shutdownNow();
        if (view != null) Init.run(() -> Misc.removeView(view));
    }

    private void getQRCode() {
        Data data = Data.objectFrom(OkHttpUtil.string("https://easy-token.cooluc.com/qr"));
        if (data != null) Init.run(() -> showCode(data));
        service = Executors.newScheduledThreadPool(1);
        if (data != null) service.scheduleAtFixedRate(() -> {
            JsonObject params = new JsonObject();
            params.addProperty("t", data.getData().getT());
            params.addProperty("ck", data.getData().getCk());
            Data result = Data.objectFrom(OkHttpUtil.postJson("https://easy-token.cooluc.com/ck", params.toString()));
            if (result.hasToken()) setToken(result.getData().getRefreshToken());
        }, 1, 1, TimeUnit.SECONDS);
    }

    private void setToken(String value) {
        Prefers.put("token", refreshToken = value);
        Init.show("請重新進入播放頁");
        checkService();
    }

    private void showCode(Data data) {
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.CENTER;
        Misc.addView(view = create(data.getData().getCodeContent()), params);
        Init.show("請使用阿里雲盤 App 掃描二維碼");
    }

    private ImageView create(String value) {
        ImageView view = new ImageView(Init.context());
        view.setScaleType(ImageView.ScaleType.CENTER_CROP);
        view.setImageBitmap(QRCode.getBitmap(value, 250, 2));
        return view;
    }
}