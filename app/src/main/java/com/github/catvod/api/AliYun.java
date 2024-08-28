package com.github.catvod.api;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.UrlQuerySanitizer;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.github.catvod.bean.Result;
import com.github.catvod.bean.Sub;
import com.github.catvod.bean.Vod;
import com.github.catvod.bean.ali.Cache;
import com.github.catvod.bean.ali.Code;
import com.github.catvod.bean.ali.Data;
import com.github.catvod.bean.ali.Download;
import com.github.catvod.bean.ali.Drive;
import com.github.catvod.bean.ali.Item;
import com.github.catvod.bean.ali.OAuth;
import com.github.catvod.bean.ali.Preview;
import com.github.catvod.bean.ali.Resp;
import com.github.catvod.bean.ali.Share;
import com.github.catvod.bean.ali.User;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.net.OkHttp;
import com.github.catvod.net.OkResult;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.utils.Json;
import com.github.catvod.utils.Notify;
import com.github.catvod.utils.Path;
import com.github.catvod.utils.ProxyVideo;
import com.github.catvod.utils.QRCode;
import com.github.catvod.utils.ResUtil;
import com.github.catvod.utils.Util;
import com.google.gson.JsonObject;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;

import okhttp3.Response;

public class AliYun {

    private final Map<String, Map<String, String>> m3u8MediaMap;
    private final Map<String, String> shareDownloadMap;
    private final Map<String, String> downloadMap;
    private final List<String> tempIds;
    private final ReentrantLock lock;
    private final Cache cache;
    private ScheduledExecutorService service;
    private String refreshToken;
    private AlertDialog dialog;
    private Share share;

    private static class Loader {
        static volatile AliYun INSTANCE = new AliYun();
    }

    public static AliYun get() {
        return Loader.INSTANCE;
    }

    public File getCache() {
        return Path.tv("aliyun");
    }

    private AliYun() {
        Init.checkPermission();
        lock = new ReentrantLock();
        tempIds = new ArrayList<>();
        downloadMap = new HashMap<>();
        m3u8MediaMap = new HashMap<>();
        shareDownloadMap = new HashMap<>();
        cache = Cache.objectFrom(Path.read(getCache()));
    }

    public void setRefreshToken(String token) {
        this.refreshToken = token;
    }

    public HashMap<String, String> getHeader() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", Util.CHROME);
        headers.put("Referer", "https://www.aliyundrive.com/");
        return headers;
    }

    private HashMap<String, String> getHeaders() {
        HashMap<String, String> headers = getHeader();
        headers.put("x-share-token", share.getShareToken());
        headers.put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
        return headers;
    }

    private HashMap<String, String> getHeaderAuth() {
        HashMap<String, String> headers = getHeader();
        headers.put("x-share-token", share.getShareToken());
        headers.put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
        if (cache.getUser().isAuthed()) headers.put("authorization", cache.getUser().getAuthorization());
        return headers;
    }

    private HashMap<String, String> getHeaderOpen() {
        HashMap<String, String> headers = getHeader();
        headers.put("authorization", cache.getOAuth().getAuthorization());
        return headers;
    }

    private boolean alist(String url, JsonObject param) {
        String api = "https://api.xhofe.top/alist/ali_open/" + url;
        OkResult result = OkHttp.post(api, param.toString(), getHeader());
        SpiderDebug.log(result.getCode() + "," + api + "," + result.getBody());
        if (isManyRequest(result.getBody())) return false;
        cache.setOAuth(OAuth.objectFrom(result.getBody()));
        return true;
    }

    private String post(String url, JsonObject param) {
        url = url.startsWith("https") ? url : "https://api.aliyundrive.com/" + url;
        OkResult result = OkHttp.post(url, param.toString(), getHeader());
        SpiderDebug.log(result.getCode() + "," + url + "," + result.getBody());
        return result.getBody();
    }

    private String auth(String url, String json, boolean retry) {
        url = url.startsWith("https") ? url : "https://api.aliyundrive.com/" + url;
        OkResult result = OkHttp.post(url, json, url.contains("file/list") ? getHeaders() : getHeaderAuth());
        SpiderDebug.log(result.getCode() + "," + url + "," + result.getBody());
        if (retry && result.getCode() == 401 && refreshAccessToken()) return auth(url, json, false);
        if (retry && result.getCode() == 429) return auth(url, json, false);
        return result.getBody();
    }

    private String oauth(String url, String json, boolean retry) {
        url = url.startsWith("https") ? url : "https://open.aliyundrive.com/adrive/v1.0/" + url;
        OkResult result = OkHttp.post(url, json, getHeaderOpen());
        SpiderDebug.log(result.getCode() + "," + url + "," + result.getBody());
        if (retry && (result.getCode() == 400 || result.getCode() == 401) && refreshOpenToken()) return oauth(url, json, false);
        return result.getBody();
    }

    private boolean isManyRequest(String result) {
        if (!result.contains("Too Many Requests")) return false;
        Notify.show("洗洗睡吧，Too Many Requests。");
        cache.getOAuth().clean();
        return true;
    }

    private boolean onTimeout() {
        stopService();
        return false;
    }

    private void refreshShareToken(String shareId) {
        if (share != null && share.alive(shareId)) return;
        SpiderDebug.log("refreshShareToken...");
        JsonObject param = new JsonObject();
        param.addProperty("share_id", shareId);
        param.addProperty("share_pwd", "");
        String json = post("v2/share_link/get_share_token", param);
        share = Share.objectFrom(json).setShareId(shareId).setTime();
        if (share.getShareToken().isEmpty()) Notify.show("來晚啦，該分享已失效。");
    }

    private boolean refreshAccessToken() {
        try {
            SpiderDebug.log("refreshAccessToken...");
            JsonObject param = new JsonObject();
            String token = cache.getUser().getRefreshToken();
            if (token.isEmpty()) token = refreshToken;
            if (token != null && token.startsWith("http")) token = OkHttp.string(token).trim();
            param.addProperty("refresh_token", token);
            param.addProperty("grant_type", "refresh_token");
            String json = post("https://auth.aliyundrive.com/v2/account/token", param);
            cache.setUser(User.objectFrom(json));
            if (cache.getUser().getAccessToken().isEmpty()) throw new Exception(json);
            return true;
        } catch (Exception e) {
            if (e instanceof TimeoutException) return onTimeout();
            cache.getUser().clean();
            e.printStackTrace();
            stopService();
            startFlow();
            return true;
        } finally {
            while (cache.getUser().getAccessToken().isEmpty()) SystemClock.sleep(250);
        }
    }

    private void getDriveId() {
        SpiderDebug.log("Get Drive Id...");
        String json = auth("https://user.aliyundrive.com/v2/user/get", "{}", true);
        cache.setDrive(Drive.objectFrom(json));
    }

    private boolean oauthRequest() {
        SpiderDebug.log("OAuth Request...");
        JsonObject param = new JsonObject();
        param.addProperty("authorize", 1);
        param.addProperty("scope", "user:base,file:all:read,file:all:write");
        String url = "https://open.aliyundrive.com/oauth/users/authorize?client_id=76917ccccd4441c39457a04f6084fb2f&redirect_uri=https://alist.nn.ci/tool/aliyundrive/callback&scope=user:base,file:all:read,file:all:write&state=";
        String json = auth(url, param.toString(), true);
        return oauthRedirect(Code.objectFrom(json).getCode());
    }

    private boolean oauthRedirect(String code) {
        SpiderDebug.log("OAuth Redirect...");
        JsonObject param = new JsonObject();
        param.addProperty("code", code);
        param.addProperty("grant_type", "authorization_code");
        return alist("code", param);
    }

    private boolean refreshOpenToken() {
        if (cache.getOAuth().getRefreshToken().isEmpty()) return oauthRequest();
        SpiderDebug.log("refreshOpenToken...");
        JsonObject param = new JsonObject();
        param.addProperty("grant_type", "refresh_token");
        param.addProperty("refresh_token", cache.getOAuth().getRefreshToken());
        return alist("token", param);
    }

    public Vod getVod(String url, String shareId, String fileId) {
        refreshShareToken(shareId);
        JsonObject param = new JsonObject();
        param.addProperty("share_id", shareId);
        Share share = Share.objectFrom(post("adrive/v3/share_link/get_share_by_anonymous", param));
        List<Item> files = new ArrayList<>();
        List<Item> subs = new ArrayList<>();
        listFiles(shareId, new Item(getParentFileId(fileId, share)), files, subs);
        Collections.sort(files);
        List<String> playFrom = Arrays.asList("轉存原畫", "分享原畫", "代理普畫");
        List<String> episode = new ArrayList<>();
        List<String> playUrl = new ArrayList<>();
        for (Item file : files) episode.add(file.getDisplayName() + "$" + shareId + "+" + file.getFileId() + findSubs(file.getName(), subs));
        for (int i = 0; i < playFrom.size(); i++) playUrl.add(TextUtils.join("#", episode));
        Vod vod = new Vod();
        vod.setVodId(url);
        vod.setVodContent(url);
        vod.setVodPic(share.getAvatar());
        vod.setVodName(share.getShareName());
        vod.setVodPlayUrl(TextUtils.join("$$$", playUrl));
        vod.setVodPlayFrom(TextUtils.join("$$$", playFrom));
        vod.setTypeName("阿里雲盤");
        return vod;
    }

    private void listFiles(String shareId, Item folder, List<Item> files, List<Item> subs) {
        listFiles(shareId, folder, files, subs, "");
    }

    private void listFiles(String shareId, Item parent, List<Item> files, List<Item> subs, String marker) {
        List<Item> folders = new ArrayList<>();
        JsonObject param = new JsonObject();
        param.addProperty("limit", 200);
        param.addProperty("share_id", shareId);
        param.addProperty("parent_file_id", parent.getFileId());
        param.addProperty("order_by", "name");
        param.addProperty("order_direction", "ASC");
        if (marker.length() > 0) param.addProperty("marker", marker);
        Item item = Item.objectFrom(auth("adrive/v3/file/list", param.toString(), true));
        for (Item file : item.getItems()) {
            if (file.getType().equals("folder")) {
                folders.add(file);
            } else if (file.getCategory().equals("video") || file.getCategory().equals("audio")) {
                files.add(file.parent(parent.getName()));
            } else if (Util.isSub(file.getExt())) {
                subs.add(file);
            }
        }
        if (item.getNextMarker().length() > 0) {
            listFiles(shareId, parent, files, subs, item.getNextMarker());
        }
        for (Item folder : folders) {
            listFiles(shareId, folder, files, subs);
        }
    }

    private String getParentFileId(String fileId, Share share) {
        if (!TextUtils.isEmpty(fileId)) return fileId;
        if (share.getFileInfos().isEmpty()) return "";
        Item item = share.getFileInfos().get(0);
        return item.getType().equals("folder") ? item.getFileId() : "root";
    }

    private void pair(String name1, List<Item> items, List<Item> subs) {
        for (Item item : items) {
            String name2 = Util.removeExt(item.getName()).toLowerCase();
            if (name1.contains(name2) || name2.contains(name1)) subs.add(item);
        }
    }

    private String findSubs(String name1, List<Item> items) {
        List<Item> subs = new ArrayList<>();
        pair(Util.removeExt(name1).toLowerCase(), items, subs);
        if (subs.isEmpty()) subs.addAll(items);
        StringBuilder sb = new StringBuilder();
        for (Item sub : subs) sb.append("+").append(Util.removeExt(sub.getName())).append("@@@").append(sub.getExt()).append("@@@").append(sub.getFileId());
        return sb.toString();
    }

    public List<Sub> getSubs(String[] ids) {
        List<Sub> sub = new ArrayList<>();
        for (String text : ids) {
            if (!text.contains("@@@")) continue;
            String[] split = text.split("@@@");
            String name = split[0];
            String ext = split[1];
            String url = Proxy.getUrl() + "?do=ali&type=sub&shareId=" + ids[0] + "&fileId=" + split[2];
            sub.add(Sub.create().name(name).ext(ext).url(url));
        }
        return sub;
    }

    public String getShareDownloadUrl(String shareId, String fileId) {
        try {
            if (shareDownloadMap.containsKey(fileId) && shareDownloadMap.get(fileId) != null && !isExpire(shareDownloadMap.get(fileId))) return shareDownloadMap.get(fileId);
            refreshShareToken(shareId);
            SpiderDebug.log("getShareDownloadUrl..." + fileId);
            JsonObject param = new JsonObject();
            param.addProperty("file_id", fileId);
            param.addProperty("share_id", shareId);
            param.addProperty("expire_sec", 600);
            String json = auth("v2/file/get_share_link_download_url", param.toString(), false);
            String url = Json.parse(json).getAsJsonObject().get("download_url").getAsString();
            shareDownloadMap.put(fileId, url);
            return url;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String getDownloadUrl(String shareId, String fileId) {
        try {
            if (downloadMap.containsKey(fileId) && downloadMap.get(fileId) != null && !isExpire(downloadMap.get(fileId))) return downloadMap.get(fileId);
            refreshShareToken(shareId);
            SpiderDebug.log("getDownloadUrl..." + fileId);
            tempIds.add(0, copy(shareId, fileId));
            JsonObject param = new JsonObject();
            param.addProperty("file_id", tempIds.get(0));
            param.addProperty("drive_id", cache.getDrive().getDriveId());
            param.addProperty("expire_sec", 900);
            String json = oauth("openFile/getDownloadUrl", param.toString(), true);
            String url = Download.objectFrom(json).getUrl();
            downloadMap.put(fileId, url);
            return url;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        } finally {
            Init.execute(this::deleteAll);
        }
    }

    public Preview.Info getVideoPreviewPlayInfo(String shareId, String fileId) {
        try {
            refreshShareToken(shareId);
            SpiderDebug.log("getVideoPreviewPlayInfo..." + fileId);
            tempIds.add(0, copy(shareId, fileId));
            JsonObject param = new JsonObject();
            param.addProperty("file_id", tempIds.get(0));
            param.addProperty("drive_id", cache.getDrive().getDriveId());
            param.addProperty("category", "live_transcoding");
            param.addProperty("url_expire_sec", 900);
            String json = oauth("openFile/getVideoPreviewPlayInfo", param.toString(), true);
            return Preview.objectFrom(json).getVideoPreviewPlayInfo();
        } catch (Exception e) {
            e.printStackTrace();
            return new Preview.Info();
        } finally {
            Init.execute(this::deleteAll);
        }
    }

    public String playerContent(String[] ids, String flag) {
        if (flag.split("#")[0].equals("代理普畫")) {
            return getPreviewContent(ids);
        } else if (flag.split("#")[0].equals("轉存原畫")) {
            return Result.get().url(proxyVideoUrl("open", ids[0], ids[1])).octet().subs(getSubs(ids)).header(getHeader()).string();
        } else if (flag.split("#")[0].equals("分享原畫")) {
            return Result.get().url(proxyVideoUrl("share", ids[0], ids[1])).octet().subs(getSubs(ids)).header(getHeader()).string();
        } else {
            return "";
        }
    }

    private String getPreviewContent(String[] ids) {
        Preview.Info info = getVideoPreviewPlayInfo(ids[0], ids[1]);
        List<String> url = getPreviewUrl(info, ids[0], ids[1], true);
        List<Sub> subs = getSubs(ids);
        subs.addAll(getSubs(info));
        return Result.get().url(url).m3u8().subs(subs).header(getHeader()).string();
    }

    private List<String> getPreviewUrl(Preview.Info info, String shareId, String fileId, boolean proxy) {
        List<Preview.LiveTranscodingTask> tasks = info.getLiveTranscodingTaskList();
        List<String> url = new ArrayList<>();
        for (int i = tasks.size() - 1; i >= 0; i--) {
            url.add(tasks.get(i).getTemplateId());
            url.add(proxy ? proxyVideoUrl("preview", shareId, fileId, tasks.get(i).getTemplateId()) : tasks.get(i).getUrl());
        }
        return url;
    }

    private List<Sub> getSubs(Preview.Info info) {
        List<Sub> subs = new ArrayList<>();
        for (Preview.LiveTranscodingTask task : info.getLiveTranscodingSubtitleTaskList()) subs.add(task.getSub());
        return subs;
    }

    private String copy(String shareId, String fileId) {
        if (cache.getDrive().getDriveId().isEmpty()) getDriveId();
        SpiderDebug.log("Copy..." + fileId);
        String json = "{\"requests\":[{\"body\":{\"file_id\":\"%s\",\"share_id\":\"%s\",\"auto_rename\":true,\"to_parent_file_id\":\"root\",\"to_drive_id\":\"%s\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"0\",\"method\":\"POST\",\"url\":\"/file/copy\"}],\"resource\":\"file\"}";
        json = String.format(json, fileId, shareId, cache.getDrive().getDriveId());
        Resp resp = Resp.objectFrom(auth("adrive/v2/batch", json, true));
        return resp.getResponse().getBody().getFileId();
    }

    private void deleteAll() {
        List<String> ids = new ArrayList<>(tempIds);
        for (String id : ids) {
            boolean deleted = delete(id);
            if (deleted) tempIds.remove(id);
        }
    }

    private boolean delete(String fileId) {
        SpiderDebug.log("Delete..." + fileId);
        String json = "{\"requests\":[{\"body\":{\"drive_id\":\"%s\",\"file_id\":\"%s\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"%s\",\"method\":\"POST\",\"url\":\"/file/delete\"}],\"resource\":\"file\"}";
        json = String.format(json, cache.getDrive().getDriveId(), fileId, fileId);
        Resp resp = Resp.objectFrom(auth("adrive/v2/batch", json, true));
        return resp.getResponse().getStatus() == 404;
    }

    private String proxyVideoUrl(String cate, String shareId, String fileId) {
        return String.format(Proxy.getUrl() + "?do=ali&type=video&cate=%s&shareId=%s&fileId=%s", cate, shareId, fileId);
    }

    private String proxyVideoUrl(String cate, String shareId, String fileId, String templateId) {
        return String.format(Proxy.getUrl() + "?do=ali&type=video&cate=%s&shareId=%s&fileId=%s&templateId=%s", cate, shareId, fileId, templateId);
    }

    private String proxyVideoUrl(String cate, String shareId, String fileId, String templateId, String mediaId) {
        return String.format(Proxy.getUrl() + "?do=ali&type=video&cate=%s&shareId=%s&fileId=%s&templateId=%s&mediaId=%s", cate, shareId, fileId, templateId, mediaId);
    }

    private static boolean isExpire(String url) {
        String expires = new UrlQuerySanitizer(url).getValue("x-oss-expires");
        if (TextUtils.isEmpty(expires)) return false;
        return Long.parseLong(expires) - getTimeStamp() <= 60;
    }

    private static long getTimeStamp() {
        return System.currentTimeMillis() / 1000;
    }

    public Object[] proxyVideo(Map<String, String> params) throws Exception {
        if (dialog != null && dialog.isShowing()) return null;
        String templateId = params.get("templateId");
        String shareId = params.get("shareId");
        String mediaId = params.get("mediaId");
        String fileId = params.get("fileId");
        String cate = params.get("cate");
        String downloadUrl = "";

        if ("preview".equals(cate)) {
            return new Object[]{200, "application/vnd.apple.mpegurl", new ByteArrayInputStream(getM3u8(shareId, fileId, templateId).getBytes())};
        }

        if ("open".equals(cate)) {
            downloadUrl = getDownloadUrl(shareId, fileId);
        } else if ("share".equals(cate)) {
            downloadUrl = getShareDownloadUrl(shareId, fileId);
        } else if ("m3u8".equals(cate)) {
            lock.lock();
            String mediaUrl = m3u8MediaMap.get(fileId).get(mediaId);
            if (isExpire(mediaUrl)) {
                getM3u8(shareId, fileId, templateId);
                mediaUrl = m3u8MediaMap.get(fileId).get(mediaId);
            }
            lock.unlock();
            downloadUrl = mediaUrl;
        }

        Map<String, String> headers = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        List<String> keys = Arrays.asList("referer", "icy-metadata", "range", "connection", "accept-encoding", "user-agent");
        for (String key : params.keySet()) if (keys.contains(key)) headers.put(key, params.get(key));
        return ProxyVideo.proxy(downloadUrl, headers);
    }

    private String getM3u8Url(String shareId, String fileId, String templateId) {
        Preview.Info info = getVideoPreviewPlayInfo(shareId, fileId);
        List<String> url = getPreviewUrl(info, shareId, fileId, false);
        Map<String, String> previewMap = new HashMap<>();
        for (int i = 0; i < url.size(); i = i + 2) {
            previewMap.put(url.get(i), url.get(i + 1));
        }
        return previewMap.get(templateId);
    }

    private String getM3u8(String shareId, String fileId, String templateId) {
        String m3u8Url = getM3u8Url(shareId, fileId, templateId);
        String m3u8 = OkHttp.string(m3u8Url, getHeader());
        String[] m3u8Arr = m3u8.split("\n");
        List<String> listM3u8 = new ArrayList<>();
        Map<String, String> media = new HashMap<>();
        String site = m3u8Url.substring(0, m3u8Url.lastIndexOf("/")) + "/";
        int mediaId = 0;
        for (String oneLine : m3u8Arr) {
            String thisOne = oneLine;
            if (oneLine.contains("x-oss-expires")) {
                media.put(String.valueOf(mediaId), site + thisOne);
                thisOne = proxyVideoUrl("m3u8", shareId, fileId, templateId, String.valueOf(mediaId));
                mediaId++;
            }
            listM3u8.add(thisOne);
        }
        m3u8MediaMap.put(fileId, media);
        return TextUtils.join("\n", listM3u8);
    }

    public Object[] proxySub(Map<String, String> params) throws Exception {
        String fileId = params.get("fileId");
        String shareId = params.get("shareId");
        Response res = OkHttp.newCall(getDownloadUrl(shareId, fileId), getHeaderAuth());
        Object[] result = new Object[3];
        result[0] = 200;
        result[1] = "application/octet-stream";
        result[2] = new ByteArrayInputStream(res.body().bytes());
        return result;
    }

    private void startFlow() {
        Init.run(this::showInput);
    }

    private void showInput() {
        try {
            int margin = ResUtil.dp2px(16);
            FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            FrameLayout frame = new FrameLayout(Init.context());
            params.setMargins(margin, margin, margin, margin);
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
            else setToken(text);
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
            int size = ResUtil.dp2px(240);
            FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(size, size);
            ImageView image = new ImageView(Init.context());
            image.setScaleType(ImageView.ScaleType.CENTER_CROP);
            image.setImageBitmap(QRCode.getBitmap(data.getCodeContent(), size, 2));
            FrameLayout frame = new FrameLayout(Init.context());
            params.gravity = Gravity.CENTER;
            frame.addView(image, params);
            dialog = new AlertDialog.Builder(Init.getActivity()).setView(frame).setOnCancelListener(this::dismiss).setOnDismissListener(this::dismiss).show();
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            Notify.show("請使用阿里雲盤 App 掃描二維碼");
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
        cache.getUser().setRefreshToken(value);
        SpiderDebug.log("Token:" + value);
        Notify.show("Token:" + value);
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
