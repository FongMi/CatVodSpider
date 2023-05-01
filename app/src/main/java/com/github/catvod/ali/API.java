package com.github.catvod.ali;

import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.github.catvod.BuildConfig;
import com.github.catvod.bean.Sub;
import com.github.catvod.bean.Vod;
import com.github.catvod.bean.ali.Code;
import com.github.catvod.bean.ali.Data;
import com.github.catvod.bean.ali.Item;
import com.github.catvod.bean.ali.OAuth;
import com.github.catvod.bean.ali.Sorter;
import com.github.catvod.bean.ali.User;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.net.OkHttp;
import com.github.catvod.spider.Ctx;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.utils.Prefers;
import com.github.catvod.utils.QRCode;
import com.github.catvod.utils.Utils;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.ByteArrayInputStream;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class API {

    private final Map<String, String> quality;
    private ScheduledExecutorService service;
    private final List<String> tempIds;
    private AlertDialog dialog;
    private String refreshToken;
    private String shareToken;
    private String shareId;
    private OAuth oauth;
    private User user;

    private static class Loader {
        static volatile API INSTANCE = new API();
    }

    public static API get() {
        return Loader.INSTANCE;
    }

    private API() {
        tempIds = new ArrayList<>();
        oauth = OAuth.objectFrom(Prefers.getString("aliyundrive_oauth"));
        user = User.objectFrom(Prefers.getString("aliyundrive_user"));
        quality = new HashMap<>();
        quality.put("4K", "UHD");
        quality.put("2k", "QHD");
        quality.put("超清", "FHD");
        quality.put("高清", "HD");
        quality.put("標清", "SD");
        quality.put("流暢", "LD");
    }

    public void setRefreshToken(String token) {
        this.refreshToken = token;
    }

    public void setShareId(String shareId) {
        this.shareId = shareId;
        refreshShareToken();
        checkAccessToken();
    }

    public HashMap<String, String> getHeader() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", Utils.CHROME);
        headers.put("Referer", "https://www.aliyundrive.com/");
        return headers;
    }

    private HashMap<String, String> getHeaderAuth() {
        HashMap<String, String> headers = getHeader();
        headers.put("authorization", user.getAuthorization());
        headers.put("x-share-token", shareToken);
        return headers;
    }

    private HashMap<String, String> getHeaderOpen() {
        HashMap<String, String> headers = getHeader();
        headers.put("authorization", oauth.getAuthorization());
        return headers;
    }

    private String post(String url, JSONObject body) {
        url = url.startsWith("https") ? url : "https://api.aliyundrive.com/" + url;
        return OkHttp.postJson(url, body.toString(), getHeader());
    }

    private String auth(String url, String json, boolean retry) {
        url = url.startsWith("https") ? url : "https://api.aliyundrive.com/" + url;
        String result = OkHttp.postJson(url, json, getHeaderAuth());
        if (retry && checkAuth(result)) return auth(url, json, false);
        return result;
    }

    private String oauth(String url, String json, boolean retry) {
        url = url.startsWith("https") ? url : "https://open.aliyundrive.com/adrive/v1.0/" + url;
        String result = OkHttp.postJson(url, json, getHeaderOpen());
        if (retry && checkOpen(result)) return oauth(url, json, false);
        return result;
    }

    private boolean checkAuth(String result) {
        if (result.contains("AccessTokenInvalid")) return refreshAccessToken();
        if (result.contains("ShareLinkTokenInvalid") || result.contains("InvalidParameterNotMatch")) return refreshShareToken();
        return checkQuotaExhausted(result);
    }

    private boolean checkOpen(String result) {
        if (result.contains("AccessTokenInvalid")) return refreshOpenToken();
        return false;
    }

    private boolean checkQuotaExhausted(String result) {
        if (!result.contains("QuotaExhausted")) return false;
        Init.show("容量不夠拉。");
        user.clean().save();
        refreshAccessToken();
        return false;
    }

    private boolean isManyRequest(String result) {
        if (!result.contains("Too Many Requests")) return false;
        Init.show("洗洗睡吧，Too Many Requests。");
        return true;
    }

    private boolean isInvalidOpenToken(String result) {
        if (!result.contains("invalid refresh_token")) return false;
        oauth.clean().save();
        oauthRequest();
        return true;
    }

    public void checkAccessToken() {
        if (user.getAccessToken().isEmpty()) refreshAccessToken();
    }

    private boolean refreshAccessToken() {
        try {
            SpiderDebug.log("refreshAccessToken...");
            JSONObject body = new JSONObject();
            String token = user.getRefreshToken();
            if (token.isEmpty()) token = refreshToken;
            if (token.startsWith("http")) token = OkHttp.string(token).trim();
            body.put("refresh_token", token);
            body.put("grant_type", "refresh_token");
            String result = post("https://auth.aliyundrive.com/v2/account/token", body);
            user = User.objectFrom(result).save();
            SpiderDebug.log(user.toString());
            if (user.getAccessToken().isEmpty()) throw new Exception(result);
            if (oauth.getAccessToken().isEmpty()) oauthRequest();
            return true;
        } catch (Exception e) {
            user.clean().save();
            SpiderDebug.log(e);
            stopService();
            getQRCode();
            return true;
        } finally {
            while (user.getAccessToken().isEmpty()) SystemClock.sleep(250);
        }
    }

    private void oauthRequest() {
        try {
            SpiderDebug.log("OAuth Request...");
            JSONObject body = new JSONObject();
            body.put("authorize", 1);
            body.put("scope", "user:base,file:all:read,file:all:write");
            String url = "https://open.aliyundrive.com/oauth/users/authorize?client_id=" + BuildConfig.CLIENT_ID + "&redirect_uri=https://alist.nn.ci/tool/aliyundrive/callback&scope=user:base,file:all:read,file:all:write&state=";
            String result = auth(url, body.toString(), true);
            oauthRedirect(Code.objectFrom(result).getCode());
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
    }

    private void oauthRedirect(String code) {
        try {
            SpiderDebug.log("OAuth Redirect...");
            JSONObject body = new JSONObject();
            body.put("code", code);
            body.put("grant_type", "authorization_code");
            String result = post("https://api.nn.ci/alist/ali_open/code", body);
            if (isManyRequest(result)) return;
            oauth = OAuth.objectFrom(result).save();
            SpiderDebug.log(oauth.toString());
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
    }

    private boolean refreshOpenToken() {
        try {
            SpiderDebug.log("refreshOpenToken...");
            JSONObject body = new JSONObject();
            body.put("grant_type", "refresh_token");
            body.put("refresh_token", oauth.getRefreshToken());
            String result = post("https://api.nn.ci/alist/ali_open/token", body);
            if (isManyRequest(result)) return false;
            if (isInvalidOpenToken(result)) return true;
            oauth = OAuth.objectFrom(result).save();
            SpiderDebug.log(oauth.toString());
            return true;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return false;
        }
    }

    public boolean refreshShareToken() {
        try {
            SpiderDebug.log("refreshShareToken...");
            JSONObject body = new JSONObject();
            body.put("share_id", shareId);
            body.put("share_pwd", "");
            JSONObject object = new JSONObject(post("v2/share_link/get_share_token", body));
            shareToken = object.getString("share_token");
            return true;
        } catch (Exception e) {
            Init.show("來晚啦，該分享已失效。");
            e.printStackTrace();
            return false;
        }
    }

    public Vod getVod(String url, String fileId) throws Exception {
        JSONObject body = new JSONObject();
        body.put("share_id", shareId);
        String json = post("adrive/v3/share_link/get_share_by_anonymous", body);
        JSONObject object = new JSONObject(json);
        List<Item> files = new ArrayList<>();
        LinkedHashMap<String, List<String>> subMap = new LinkedHashMap<>();
        listFiles(new Item(getParentFileId(fileId, object)), files, subMap);
        List<String> playFrom = Arrays.asList("原畫", "超清", "高清");
        List<String> episode = new ArrayList<>();
        List<String> playUrl = new ArrayList<>();
        Sorter.sort(files);
        for (Item file : files) episode.add(file.getDisplayName() + "$" + file.getFileId() + findSubs(file.getName(), subMap));
        for (int i = 0; i < playFrom.size(); i++) playUrl.add(TextUtils.join("#", episode));
        Vod vod = new Vod();
        vod.setVodId(url);
        vod.setVodContent(url);
        vod.setVodPic(object.getString("avatar"));
        vod.setVodName(object.getString("share_name"));
        vod.setVodPlayUrl(TextUtils.join("$$$", playUrl));
        vod.setVodPlayFrom(TextUtils.join("$$$", playFrom));
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
        body.put("share_id", shareId);
        body.put("parent_file_id", parent.getFileId());
        body.put("order_by", "name");
        body.put("order_direction", "ASC");
        if (marker.length() > 0) body.put("marker", marker);
        Item item = Item.objectFrom(auth("adrive/v3/file/list", body.toString(), true));
        for (Item file : item.getItems()) {
            if (file.getType().equals("folder")) {
                folders.add(file);
            } else if (file.getCategory().equals("video") || file.getCategory().equals("audio")) {
                files.add(file.parent(parent.getName()));
            } else if (Utils.isSub(file.getExt())) {
                String key = Utils.removeExt(file.getName());
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

    public List<Sub> getSub(String[] ids) {
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

    public String getDownloadUrl(String fileId) {
        try {
            SpiderDebug.log("getDownloadUrl..." + fileId);
            tempIds.add(0, copy(fileId));
            JSONObject body = new JSONObject();
            body.put("file_id", tempIds.get(0));
            body.put("drive_id", user.getDriveId());
            String json = oauth("openFile/getDownloadUrl", body.toString(), true);
            SpiderDebug.log(json);
            return new JSONObject(json).getString("url");
        } catch (Exception e) {
            Init.execute(this::deleteAll);
            e.printStackTrace();
            return "";
        } finally {
            Init.execute(this::deleteAll);
        }
    }

    public String getPreviewUrl(String fileId, String flag) {
        try {
            SpiderDebug.log("getPreviewUrl..." + fileId);
            tempIds.add(0, copy(fileId));
            JSONObject body = new JSONObject();
            body.put("file_id", tempIds.get(0));
            body.put("drive_id", user.getDriveId());
            body.put("category", "live_transcoding");
            body.put("url_expire_sec", "14400");
            String json = oauth("openFile/getVideoPreviewPlayInfo", body.toString(), true);
            SpiderDebug.log(json);
            JSONArray taskList = new JSONObject(json).getJSONObject("video_preview_play_info").getJSONArray("live_transcoding_task_list");
            return getPreviewQuality(taskList, flag);
        } catch (Exception e) {
            Init.execute(this::deleteAll);
            e.printStackTrace();
            return "";
        } finally {
            Init.execute(this::deleteAll);
        }
    }

    private String getPreviewQuality(JSONArray taskList, String flag) throws Exception {
        for (int i = 0; i < taskList.length(); ++i) {
            JSONObject task = taskList.getJSONObject(i);
            if (task.getString("template_id").equals(quality.get(flag))) {
                return task.getString("url");
            }
        }
        return taskList.getJSONObject(0).getString("url");
    }

    private String copy(String fileId) throws Exception {
        SpiderDebug.log("Copy..." + fileId);
        String json = "{\"requests\":[{\"body\":{\"file_id\":\"%s\",\"share_id\":\"%s\",\"auto_rename\":true,\"to_parent_file_id\":\"root\",\"to_drive_id\":\"%s\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"0\",\"method\":\"POST\",\"url\":\"/file/copy\"}],\"resource\":\"file\"}";
        json = String.format(json, fileId, shareId, user.getDriveId());
        String result = auth("adrive/v2/batch", json, true);
        return new JSONObject(result).getJSONArray("responses").getJSONObject(0).getJSONObject("body").getString("file_id");
    }

    private void deleteAll() {
        Iterator<String> iterator = tempIds.iterator();
        while (iterator.hasNext()) {
            boolean deleted = delete(iterator.next());
            if (deleted) iterator.remove();
        }
    }

    private boolean delete(String fileId) {
        try {
            SpiderDebug.log("Delete..." + fileId);
            String json = "{\"requests\":[{\"body\":{\"drive_id\":\"%s\",\"file_id\":\"%s\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"%s\",\"method\":\"POST\",\"url\":\"/file/delete\"}],\"resource\":\"file\"}";
            json = String.format(json, user.getDriveId(), fileId, fileId);
            String result = auth("adrive/v2/batch", json, true);
            return result.length() == 211;
        } catch (Exception ignored) {
            return false;
        }
    }

    public Object[] proxySub(Map<String, String> params) {
        String fileId = params.get("file_id");
        String text = OkHttp.string(getDownloadUrl(fileId), getHeaderAuth());
        Object[] result = new Object[3];
        result[0] = 200;
        result[1] = "application/octet-stream";
        result[2] = new ByteArrayInputStream(text.getBytes());
        return result;
    }

    private void getQRCode() {
        Data data = Data.objectFrom(OkHttp.string("https://passport.aliyundrive.com/newlogin/qrcode/generate.do?appName=aliyun_drive&fromSite=52&appName=aliyun_drive&appEntrance=web&isMobile=false&lang=zh_CN&returnUrl=&bizParams=&_bx-v=2.2.3")).getContent().getData();
        Init.run(() -> showQRCode(data));
    }

    private void showQRCode(Data data) {
        try {
            FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(Utils.dp2px(240), Utils.dp2px(240));
            ImageView image = new ImageView(Init.context());
            image.setScaleType(ImageView.ScaleType.CENTER_CROP);
            image.setImageBitmap(QRCode.getBitmap(data.getCodeContent(), 240, 2));
            FrameLayout frame = new FrameLayout(Init.context());
            params.gravity = Gravity.CENTER;
            frame.addView(image, params);
            dialog = new AlertDialog.Builder(Init.getActivity()).setView(frame).setOnDismissListener(this::dismiss).show();
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            Init.execute(() -> startService(data.getParams()));
            Init.show("請使用阿里雲盤 App 掃描二維碼");
            Intent intent = new Intent().setComponent(new ComponentName(new Ctx(Init.context()), "com.alicloud.databox.biz.scan.CustomizeCaptureActivity"));
            intent.putExtra("qr_scan_result", data.getCodeContent());
            Init.getActivity().startActivity(intent);
        } catch (Exception ignored) {
        }
    }

    private void startService(Map<String, String> params) {
        service = Executors.newScheduledThreadPool(1);
        service.scheduleAtFixedRate(() -> {
            Data result = Data.objectFrom(OkHttp.post("https://passport.aliyundrive.com/newlogin/qrcode/query.do?appName=aliyun_drive&fromSite=52&_bx-v=2.2.3", params)).getContent().getData();
            if (result.hasToken()) setToken(result.getToken());
        }, 1, 1, TimeUnit.SECONDS);
    }

    private void setToken(String value) {
        Init.show("請重新進入播放頁");
        this.refreshToken = value;
        refreshAccessToken();
        stopService();
    }

    private void stopService() {
        if (service != null) service.shutdownNow();
        Init.run(this::dismiss);
    }

    private void dismiss(DialogInterface dialog) {
        stopService();
    }

    private void dismiss() {
        try {
            if (dialog != null) dialog.dismiss();
        } catch (Exception ignored) {
        }
    }
}
