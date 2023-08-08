package com.github.catvod.ali;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.github.catvod.BuildConfig;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Sub;
import com.github.catvod.bean.Vod;
import com.github.catvod.bean.ali.*;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.net.OkHttp;
import com.github.catvod.net.OkResult;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.utils.FileUtil;
import com.github.catvod.utils.QRCode;
import com.github.catvod.utils.Utils;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import okhttp3.Response;

public class API {

    private ScheduledExecutorService service;
    private final List<String> tempIds;
    private AlertDialog dialog;
    private String refreshToken;
    private String shareToken;
    private String shareId;
    private String driveId;
    private OAuth oauth;
    private User user;
    private Drive drive;

    private static class Loader {
        static volatile API INSTANCE = new API();
    }

    public static API get() {
        return Loader.INSTANCE;
    }

    public File getUserCache() {
        return FileUtil.getCacheFile("aliyundrive_user");
    }

    public File getOAuthCache() {
        return FileUtil.getCacheFile("aliyundrive_oauth");
    }

    public File getDriveCache() {
        return FileUtil.getCacheFile("aliyundrive_drive");
    }

    private API() {
        tempIds = new ArrayList<>();
        oauth = OAuth.objectFrom(FileUtil.read(getOAuthCache()));
        user = User.objectFrom(FileUtil.read(getUserCache()));
        drive = Drive.objectFrom(FileUtil.read(getDriveCache()));
    }

    public void setRefreshToken(String token) {
        this.refreshToken = token;
    }

    public Object[] getToken() {
        Object[] result = new Object[3];
        result[0] = 200;
        result[1] = "text/plain";
        result[2] = new ByteArrayInputStream(user.getRefreshToken().getBytes());
        return result;
    }

    public void setShareId(String shareId) {
        if (!getOAuthCache().exists()) oauth.clean().save();
        if (!getUserCache().exists()) user.clean().save();
        if (!getDriveCache().exists()) drive.clean().save();
        this.shareId = shareId;
        refreshShareToken();
    }

    public HashMap<String, String> getHeader() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", Utils.CHROME);
        headers.put("Referer", "https://www.aliyundrive.com/");
        return headers;
    }

    private HashMap<String, String> getHeaderAuth() {
        HashMap<String, String> headers = getHeader();
        headers.put("x-share-token", shareToken);
        headers.put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
        if (user.isAuthed()) headers.put("authorization", user.getAuthorization());
        return headers;
    }

    private HashMap<String, String> getHeaderOpen() {
        HashMap<String, String> headers = getHeader();
        headers.put("authorization", oauth.getAuthorization());
        return headers;
    }

    private boolean alist(String url, JSONObject body) {
        //https://api-cf.nn.ci/alist/ali_open/
        //https://api.xhofe.top/alist/ali_open/
        //https://sni_api_nn_ci.cooluc.com/alist/ali_open/
        String api = "https://aliapi.ewwe.gq/alist/ali_open/" + url;
        OkResult result = OkHttp.postJson(api, body.toString(), getHeader());
        SpiderDebug.log(result.getCode() + "," + api + "," + result.getBody());
        if (isManyRequest(result.getBody())) return false;
        oauth = OAuth.objectFrom(result.getBody()).save();
        return true;
    }

    private String post(String url, JSONObject body) {
        url = url.startsWith("https") ? url : "https://api.aliyundrive.com/" + url;
        OkResult result = OkHttp.postJson(url, body.toString(), getHeader());
        SpiderDebug.log(result.getCode() + "," + url + "," + result.getBody());
        return result.getBody();
    }

    private String auth(String url, String json, boolean retry) {
        url = url.startsWith("https") ? url : "https://api.aliyundrive.com/" + url;
        OkResult result = OkHttp.postJson(url, json, getHeaderAuth());
        SpiderDebug.log(result.getCode() + "," + url + "," + result.getBody());
        if (retry && (result.getCode() == 400 || result.getCode() == 401) && refreshAccessToken()) return auth(url, json, false);
        if (retry && result.getCode() == 429) return auth(url, json, false);
        return result.getBody();
    }

    private String oauth(String url, String json, boolean retry) {
        url = url.startsWith("https") ? url : "https://open.aliyundrive.com/adrive/v1.0/" + url;
        OkResult result = OkHttp.postJson(url, json, getHeaderOpen());
        SpiderDebug.log(result.getCode() + "," + url + "," + result.getBody());
        if (retry && (result.getCode() == 400 || result.getCode() == 401) && refreshOpenToken()) return oauth(url, json, false);
        return result.getBody();
    }

    private boolean isManyRequest(String result) {
        if (!result.contains("Too Many Requests")) return false;
        Utils.notify("洗洗睡吧，Too Many Requests。");
        oauth.clean().save();
        return true;
    }

    private boolean onTimeout() {
        stopService();
        return false;
    }

    private void refreshShareToken() {
        try {
            SpiderDebug.log("refreshShareToken...");
            JSONObject body = new JSONObject();
            body.put("share_id", shareId);
            body.put("share_pwd", "");
            String result = post("v2/share_link/get_share_token", body);
            shareToken = new JSONObject(result).getString("share_token");
        } catch (Exception e) {
            e.printStackTrace();
            Utils.notify("來晚啦，該分享已失效。");
        }
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
            if (user.getAccessToken().isEmpty()) throw new Exception(result);
            return true;
        } catch (Exception e) {
            if (e instanceof TimeoutException) return onTimeout();
            e.printStackTrace();
            user.clean().save();
            stopService();
            startFlow();
            return true;
        } finally {
            while (user.getAccessToken().isEmpty()) SystemClock.sleep(250);
        }
    }

    private boolean getDriveId() {
        try {
            SpiderDebug.log("Obtain drive id...");
            String result = auth("https://user.aliyundrive.com/v2/user/get", "{}", false);
            drive = Drive.objectFrom(result).save();
            driveId = drive.getResourceDriveId().isEmpty() ? drive.getDriveId() : drive.getResourceDriveId();
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            drive.clean().save();
            return true;
        }
    }

    private boolean oauthRequest() {
        try {
            SpiderDebug.log("OAuth Request...");
            JSONObject body = new JSONObject();
            body.put("authorize", 1);
            body.put("scope", "user:base,file:all:read,file:all:write");
            String url = "https://open.aliyundrive.com/oauth/users/authorize?client_id=" + BuildConfig.CLIENT_ID + "&redirect_uri=https://alist.nn.ci/tool/aliyundrive/callback&scope=user:base,file:all:read,file:all:write&state=";
            String result = auth(url, body.toString(), true);
            return oauthRedirect(Code.objectFrom(result).getCode());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean oauthRedirect(String code) {
        try {
            SpiderDebug.log("OAuth Redirect...");
            JSONObject body = new JSONObject();
            body.put("code", code);
            body.put("grant_type", "authorization_code");
            return alist("code", body);
        } catch (Exception e) {
            e.printStackTrace();
            oauth.clean().save();
            return false;
        }
    }

    private boolean refreshOpenToken() {
        try {
            if (oauth.getRefreshToken().isEmpty()) return oauthRequest();
            SpiderDebug.log("refreshOpenToken...");
            JSONObject body = new JSONObject();
            body.put("grant_type", "refresh_token");
            body.put("refresh_token", oauth.getRefreshToken());
            return alist("token", body);
        } catch (Exception e) {
            e.printStackTrace();
            oauth.clean().save();
            return false;
        }
    }

    public Vod getVod(String url, String fileId) throws Exception {
        JSONObject body = new JSONObject();
        body.put("share_id", shareId);
        String result = post("adrive/v3/share_link/get_share_by_anonymous", body);
        JSONObject object = new JSONObject(result);
        List<Item> files = new ArrayList<>();
        List<Item> subs = new ArrayList<>();
        listFiles(new Item(getParentFileId(fileId, object)), files, subs);
        List<String> playFrom = Arrays.asList("原畫", "普畫");
        List<String> episode = new ArrayList<>();
        List<String> playUrl = new ArrayList<>();
        for (Item file : files) episode.add(file.getDisplayName() + "$" + file.getFileId() + findSubs(file.getName(), subs));
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

    private void listFiles(Item folder, List<Item> files, List<Item> subs) throws Exception {
        listFiles(folder, files, subs, "");
    }

    private void listFiles(Item parent, List<Item> files, List<Item> subs, String marker) throws Exception {
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
                subs.add(file);
            }
        }
        if (item.getNextMarker().length() > 0) {
            listFiles(parent, files, subs, item.getNextMarker());
        }
        for (Item folder : folders) {
            listFiles(folder, files, subs);
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

    private void pair(String name1, List<Item> items, List<Item> subs) {
        for (Item item : items) {
            String name2 = Utils.removeExt(item.getName()).toLowerCase();
            if (name1.contains(name2) || name2.contains(name1)) subs.add(item);
        }
    }

    private String findSubs(String name1, List<Item> items) {
        List<Item> subs = new ArrayList<>();
        pair(Utils.removeExt(name1).toLowerCase(), items, subs);
        if (subs.isEmpty()) subs.addAll(items);
        StringBuilder sb = new StringBuilder();
        for (Item sub : subs) sb.append("+").append(Utils.removeExt(sub.getName())).append("@@@").append(sub.getExt()).append("@@@").append(sub.getFileId());
        return sb.toString();
    }

    public List<Sub> getSubs(String[] ids) {
        List<Sub> sub = new ArrayList<>();
        for (String text : ids) {
            if (!text.contains("@@@")) continue;
            String[] split = text.split("@@@");
            String name = split[0];
            String ext = split[1];
            String url = Proxy.getUrl() + "?do=ali&type=sub&file_id=" + split[2];
            sub.add(Sub.create().name(name).ext(ext).url(url));
        }
        return sub;
    }

    public String getDownloadUrl(String fileId) {
        try {
            SpiderDebug.log("getDownloadUrl..." + fileId);
            if (getDriveId()) throw new Exception("unable obtain drive id");
            tempIds.add(0, copy(fileId));
            JSONObject body = new JSONObject();
            body.put("file_id", tempIds.get(0));
            body.put("drive_id", driveId);
            String json = oauth("openFile/getDownloadUrl", body.toString(), true);
            return new JSONObject(json).getString("url");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        } finally {
            Init.execute(this::deleteAll);
        }
    }

    public JSONObject getVideoPreviewPlayInfo(String fileId) {
        try {
            SpiderDebug.log("getVideoPreviewPlayInfo..." + fileId);
            if (getDriveId()) throw new Exception("unable obtain drive id");
            tempIds.add(0, copy(fileId));
            JSONObject body = new JSONObject();
            body.put("file_id", tempIds.get(0));
            body.put("drive_id", driveId);
            body.put("category", "live_transcoding");
            body.put("url_expire_sec", "14400");
            String json = oauth("openFile/getVideoPreviewPlayInfo", body.toString(), true);
            return new JSONObject(json).getJSONObject("video_preview_play_info");
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        } finally {
            Init.execute(this::deleteAll);
        }
    }

    public String playerContent(String[] ids, boolean original) {
        if (original) return Result.get().url(getDownloadUrl(ids[0])).octet().subs(getSubs(ids)).header(getHeader()).string();
        else return getPreviewContent(ids);
    }

    private String getPreviewContent(String[] ids) {
        try {
            JSONObject playInfo = getVideoPreviewPlayInfo(ids[0]);
            String url = getPreviewUrl(playInfo);
            List<Sub> subs = getSubs(ids);
            subs.addAll(getSubs(playInfo));
            return Result.get().url(url).m3u8().subs(subs).header(getHeader()).string();
        } catch (Exception e) {
            e.printStackTrace();
            return Result.get().url("").string();
        }
    }

    private String getPreviewUrl(JSONObject playInfo) throws Exception {
        if (!playInfo.has("live_transcoding_task_list")) return "";
        JSONArray taskList = playInfo.getJSONArray("live_transcoding_task_list");
        List<String> templates = Arrays.asList("UHD", "QHD", "FHD", "HD", "SD", "LD");
        for (String template : templates) {
            for (int i = 0; i < taskList.length(); ++i) {
                JSONObject task = taskList.getJSONObject(i);
                if (task.getString("template_id").equals(template)) {
                    return task.getString("url");
                }
            }
        }
        return taskList.getJSONObject(0).getString("url");
    }

    private List<Sub> getSubs(JSONObject playInfo) throws Exception {
        if (!playInfo.has("live_transcoding_subtitle_task_list")) return Collections.emptyList();
        JSONArray taskList = playInfo.getJSONArray("live_transcoding_subtitle_task_list");
        List<Sub> subs = new ArrayList<>();
        for (int i = 0; i < taskList.length(); ++i) {
            JSONObject task = taskList.getJSONObject(i);
            String lang = task.getString("language");
            String url = task.getString("url");
            subs.add(Sub.create().url(url).name(lang).lang(lang).ext("vtt"));
        }
        return subs;
    }

    private String copy(String fileId) throws Exception {
        SpiderDebug.log("Copy..." + fileId);
        String json = "{\"requests\":[{\"body\":{\"file_id\":\"%s\",\"share_id\":\"%s\",\"auto_rename\":true,\"to_parent_file_id\":\"root\",\"to_drive_id\":\"%s\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"0\",\"method\":\"POST\",\"url\":\"/file/copy\"}],\"resource\":\"file\"}";
        json = String.format(json, fileId, shareId, driveId);
        String result = auth("adrive/v2/batch", json, true);
        if (result.contains("ForbiddenNoPermission.File")) return copy(fileId);
        return new JSONObject(result).getJSONArray("responses").getJSONObject(0).getJSONObject("body").getString("file_id");
    }

    private void deleteAll() {
        List<String> ids = new ArrayList<>(tempIds);
        for (String id : ids) {
            boolean deleted = delete(id);
            if (deleted) tempIds.remove(id);
        }
    }

    private boolean delete(String fileId) {
        try {
            SpiderDebug.log("Delete..." + fileId);
            String json = "{\"requests\":[{\"body\":{\"drive_id\":\"%s\",\"file_id\":\"%s\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"%s\",\"method\":\"POST\",\"url\":\"/file/delete\"}],\"resource\":\"file\"}";
            json = String.format(json, driveId, fileId, fileId);
            String result = auth("adrive/v2/batch", json, true);
            return result.length() == 211;
        } catch (Exception ignored) {
            return false;
        }
    }

    public Object[] proxySub(Map<String, String> params) throws Exception {
        String fileId = params.get("file_id");
        Response res = OkHttp.newCall(getDownloadUrl(fileId), getHeaderAuth());
        byte[] body = Utils.toUtf8(res.body().bytes());
        Object[] result = new Object[3];
        result[0] = 200;
        result[1] = "application/octet-stream";
        result[2] = new ByteArrayInputStream(body);
        return result;
    }

    private void startFlow() {
        if (Utils.isMobile()) {
            Init.run(this::showInput);
        } else {
            getQRCode();
        }
    }

    private void showInput() {
        try {
            FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params.setMargins(Utils.dp2px(16), Utils.dp2px(16), Utils.dp2px(16), Utils.dp2px(16));
            FrameLayout frame = new FrameLayout(Init.context());
            EditText input = new EditText(Init.context());
            frame.addView(input, params);
            dialog = new AlertDialog.Builder(Init.getActivity()).setTitle("請輸入Token").setView(frame).setNeutralButton("QRCode", (dialog, which) -> onNeutral()).setNegativeButton(android.R.string.cancel, null).setPositiveButton(android.R.string.ok, (dialog, which) -> onPositive(input.getText().toString())).show();
        } catch (Exception ignored) {
        }
    }

    private void onNeutral() {
        dismiss();
        Init.execute(this::getQRCode);
    }

    private void onPositive(String text) {
        dismiss();
        Init.execute(() -> {
            if (text.startsWith("http")) setToken(OkHttp.string(text));
            else if (text.length() == 32) setToken(text);
            else if (text.contains(":")) setToken(OkHttp.string("http://" + text + "/proxy?do=ali&type=token"));
        });
    }

    private void getQRCode() {
        String json = OkHttp.string("https://passport.aliyundrive.com/newlogin/qrcode/generate.do?appName=aliyun_drive&fromSite=52&appName=aliyun_drive&appEntrance=web&isMobile=false&lang=zh_CN&returnUrl=&bizParams=&_bx-v=2.2.3");
        Data data = Data.objectFrom(json).getContent().getData();
        Init.run(() -> openApp(json, data));
    }

    private void openApp(String json, Data data) {
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setClassName("com.alicloud.databox", "com.taobao.login4android.scan.QrScanActivity");
            intent.putExtra("key_scanParam", json);
            Init.getActivity().startActivity(intent);
        } catch (Exception e) {
            showQRCode(data);
        } finally {
            Init.execute(() -> startService(data.getParams()));
        }
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
            dialog = new AlertDialog.Builder(Init.getActivity()).setView(frame).setOnCancelListener(this::dismiss).setOnDismissListener(this::dismiss).show();
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            Utils.notify("請使用阿里雲盤 App 掃描二維碼");
        } catch (Exception ignored) {
        }
    }

    private void startService(Map<String, String> params) {
        service = Executors.newScheduledThreadPool(1);
        service.scheduleAtFixedRate(() -> {
            String result = OkHttp.post("https://passport.aliyundrive.com/newlogin/qrcode/query.do?appName=aliyun_drive&fromSite=52&_bx-v=2.2.3", params);
            Data data = Data.objectFrom(result).getContent().getData();
            if (data.hasToken()) setToken(data.getToken());
        }, 1, 1, TimeUnit.SECONDS);
    }

    private void setToken(String value) {
        SpiderDebug.log("Token:" + value);
        Utils.notify("Token:" + value);
        user.setRefreshToken(value);
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
