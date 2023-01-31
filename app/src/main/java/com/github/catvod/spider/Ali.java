package com.github.catvod.spider;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.github.catvod.bean.Result;
import com.github.catvod.bean.Sub;
import com.github.catvod.bean.Vod;
import com.github.catvod.bean.ali.Auth;
import com.github.catvod.bean.ali.Data;
import com.github.catvod.bean.ali.Item;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Misc;
import com.github.catvod.utils.Prefers;
import com.github.catvod.utils.QRCode;
import com.github.catvod.utils.Trans;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ColaMint & Adam & FongMi
 */
public class Ali {

    public static final Pattern pattern = Pattern.compile("www.aliyundrive.com/s/([^/]+)(/folder/([^/]+))?");
    private ScheduledExecutorService service;
    private final Auth auth;

    private static class Loader {
        static volatile Ali INSTANCE = new Ali();
    }

    public static Ali get() {
        return Loader.INSTANCE;
    }

    public Ali() {
        this.auth = new Auth();
    }

    public Ali init(String token) {
        auth.setRefreshToken(Prefers.getString("token", token));
        return this;
    }

    private HashMap<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", Misc.CHROME);
        headers.put("Referer", "https://www.aliyundrive.com/");
        return headers;
    }

    private HashMap<String, String> getAuthHeader() {
        HashMap<String, String> headers = getHeaders();
        headers.put("authorization", auth.getAccessToken());
        headers.put("x-share-token", auth.getShareToken());
        return headers;
    }

    private String post(String url, JSONObject body) {
        url = url.startsWith("https") ? url : "https://api.aliyundrive.com/" + url;
        return OkHttp.postJson(url, body.toString(), getHeaders());
    }

    private String postAuth(String url, JSONObject body) {
        url = url.startsWith("https") ? url : "https://api.aliyundrive.com/" + url;
        String result = OkHttp.postJson(url, body.toString(), getAuthHeader());
        if (check401(result)) return postAuth(url, body);
        return result;
    }

    private boolean check401(String result) {
        if (result.contains("AccessTokenInvalid")) return refreshAccessToken();
        if (result.contains("ShareLinkTokenInvalid")) return refreshShareToken();
        if (result.contains("InvalidParameterNotMatch")) return refreshShareToken();
        return false;
    }

    public String detailContent(List<String> ids) throws Exception {
        String url = ids.get(0).trim();
        Matcher matcher = pattern.matcher(url);
        if (!matcher.find()) return "";
        String shareId = matcher.group(1);
        String fileId = matcher.groupCount() == 3 ? matcher.group(3) : "";
        auth.setShareId(shareId); refreshShareToken();
        return Result.string(getVod(url, fileId));
    }

    public String playerContent(String flag, String id) {
        String[] ids = id.split("\\+");
        if (auth.isEmpty()) refreshAccessToken();
        if (flag.equals("原畫")) {
            return Result.get().url(getDownloadUrl(ids[0])).subs(getSub(ids)).header(getHeaders()).string();
        } else {
            return Result.get().url(getPreviewUrl(ids[0])).subs(getSub(ids)).header(getHeaders()).string();
        }
    }

    private Vod getVod(String url, String fileId) throws Exception {
        JSONObject body = new JSONObject();
        body.put("share_id", auth.getShareId());
        String json = post("adrive/v3/share_link/get_share_by_anonymous", body);
        JSONObject object = new JSONObject(json);
        List<Item> files = new ArrayList<>();
        LinkedHashMap<String, List<String>> subMap = new LinkedHashMap<>();
        listFiles(new Item(getParentFileId(fileId, object)), files, subMap);
        List<String> playUrls = new ArrayList<>();
        for (Item file : files) playUrls.add(Trans.get(file.getDisplayName()) + "$" + file.getFileId() + findSubs(file.getName(), subMap));
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

    private void listFiles(Item folder, List<Item> files, LinkedHashMap<String, List<String>> subMap) throws Exception {
        listFiles(folder, files, subMap, "");
    }

    private void listFiles(Item parent, List<Item> files, LinkedHashMap<String, List<String>> subMap, String marker) throws Exception {
        JSONObject body = new JSONObject();
        List<Item> folders = new ArrayList<>();
        body.put("limit", 200);
        body.put("share_id", auth.getShareId());
        body.put("parent_file_id", parent.getFileId());
        body.put("order_by", "name");
        body.put("order_direction", "ASC");
        if (marker.length() > 0) body.put("marker", marker);
        Item item = Item.objectFrom(postAuth("adrive/v3/file/list", body));
        for (Item file : item.getItems()) {
            if (file.getType().equals("folder")) {
                folders.add(file);
            } else if (file.getCategory().equals("video") || file.getCategory().equals("audio")) {
                files.add(file.parent(parent.getName()));
            } else if (Misc.isSub(file.getExt())) {
                String key = file.removeExt();
                if (!subMap.containsKey(key)) subMap.put(key, new ArrayList<>());
                subMap.get(key).add(key + "@@@" + file.getExt() + "@@@" + file.getFileId());
            }
        }
        if (item.getNextMarker().length() > 0) {
            listFiles(parent, files, subMap, item.getNextMarker());
        }
        for (Item folder : folders) {
            listFiles(folder, files, subMap);
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

    private boolean refreshAccessToken() {
        try {
            JSONObject body = new JSONObject();
            String token = auth.getRefreshToken();
            if (token.startsWith("http")) token = OkHttp.string(token).replaceAll("[^A-Za-z0-9]", "");
            body.put("refresh_token", token);
            body.put("grant_type", "refresh_token");
            JSONObject object = new JSONObject(post("https://auth.aliyundrive.com/v2/account/token", body));
            auth.setAccessToken(object.getString("token_type") + " " + object.getString("access_token"));
            auth.setRefreshToken(object.getString("refresh_token"));
            return true;
        } catch (Exception e) {
            checkService();
            auth.clean();
            getQRCode();
            return true;
        } finally {
            while (auth.isEmpty()) SystemClock.sleep(250);
        }
    }

    private boolean refreshShareToken() {
        try {
            JSONObject body = new JSONObject();
            body.put("share_id", auth.getShareId());
            body.put("share_pwd", "");
            JSONObject object = new JSONObject(post("v2/share_link/get_share_token", body));
            auth.setShareToken(object.getString("share_token"));
            return true;
        } catch (Exception e) {
            Init.show("來晚啦，該分享已失效。");
            e.printStackTrace();
            return false;
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

    private List<Sub> getSub(String[] ids) {
        List<Sub> sub = new ArrayList<>();
        for (String text : ids) {
            if (!text.contains("@@@")) continue;
            String[] split = text.split("@@@");
            String name = split[0];
            String ext = split[1];
            String url = Proxy.getUrl() + "?do=ali&type=sub" + "&file_id=" + split[2];
            sub.add(Sub.create().name(name).ext(ext).url(url));
        }
        return sub;
    }

    private String getPreviewQuality(JSONArray taskList) throws Exception {
        for (String templateId : Arrays.asList("FHD", "HD", "SD", "LD")) {
            for (int i = 0; i < taskList.length(); ++i) {
                JSONObject task = taskList.getJSONObject(i);
                if (task.getString("template_id").equals(templateId)) {
                    return task.getString("url");
                }
            }
        }
        return taskList.getJSONObject(0).getString("url");
    }

    private String getPreviewUrl(String fileId) {
        try {
            JSONObject body = new JSONObject();
            body.put("file_id", fileId);
            body.put("share_id", auth.getShareId());
            body.put("template_id", "");
            body.put("category", "live_transcoding");
            String json = postAuth("v2/file/get_share_link_video_preview_play_info", body);
            JSONArray taskList = new JSONObject(json).getJSONObject("video_preview_play_info").getJSONArray("live_transcoding_task_list");
            Map<String, List<String>> respHeaders = new HashMap<>();
            OkHttp.stringNoRedirect(getPreviewQuality(taskList), getHeaders(), respHeaders);
            return OkHttp.getRedirectLocation(respHeaders);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private String getDownloadUrl(String fileId) {
        try {
            JSONObject body = new JSONObject();
            body.put("file_id", fileId);
            body.put("share_id", auth.getShareId());
            body.put("expire_sec", 600);
            String json = postAuth("v2/file/get_share_link_download_url", body);
            String url = new JSONObject(json).optString("download_url");
            Map<String, List<String>> respHeaders = new HashMap<>();
            OkHttp.stringNoRedirect(url, getHeaders(), respHeaders);
            return OkHttp.getRedirectLocation(respHeaders);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public Object[] vod(Map<String, String> params) {
        String fileId = params.get("file_id");
        String text = OkHttp.string(getDownloadUrl(fileId), getAuthHeader());
        Object[] result = new Object[3];
        result[0] = 200;
        result[1] = "application/octet-stream";
        result[2] = new ByteArrayInputStream(text.getBytes());
        return result;
    }

    private void checkService() {
        if (service != null) service.shutdownNow();
        if (auth.getView() != null) Init.run(() -> Misc.removeView(auth.getView()));
    }

    private void getQRCode() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", Misc.CHROME);
        Data data = Data.objectFrom(OkHttp.string("https://easy-token.cooluc.com/qr", headers));
        if (data != null) Init.run(() -> showCode(data));
        service = Executors.newScheduledThreadPool(1);
        if (data != null) service.scheduleAtFixedRate(() -> {
            JsonObject params = new JsonObject();
            params.addProperty("t", data.getData().getT());
            params.addProperty("ck", data.getData().getCk());
            Data result = Data.objectFrom(OkHttp.postJson("https://easy-token.cooluc.com/ck", params.toString(), headers));
            if (result.hasToken()) setToken(result.getData().getRefreshToken());
        }, 1, 1, TimeUnit.SECONDS);
    }

    private void setToken(String value) {
        Prefers.put("token", value);
        Init.show("請重新進入播放頁");
        auth.setRefreshToken(value);
        checkService();
    }

    private void showCode(Data data) {
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.CENTER;
        Misc.addView(create(data.getData().getCodeContent()), params);
        Init.show("請使用阿里雲盤 App 掃描二維碼");
    }

    private ImageView create(String value) {
        ImageView view = new ImageView(Init.context());
        view.setScaleType(ImageView.ScaleType.CENTER_CROP);
        view.setImageBitmap(QRCode.getBitmap(value, 250, 2));
        auth.setView(view);
        return view;
    }
}