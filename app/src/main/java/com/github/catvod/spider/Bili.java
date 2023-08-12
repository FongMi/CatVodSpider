package com.github.catvod.spider;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Filter;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.bean.bili.Dash;
import com.github.catvod.bean.bili.Data;
import com.github.catvod.bean.bili.Media;
import com.github.catvod.bean.bili.Page;
import com.github.catvod.bean.bili.Resp;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.FileUtil;
import com.github.catvod.utils.QRCode;
import com.github.catvod.utils.Utils;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author ColaMint & FongMi & 唐三
 */
public class Bili extends Spider {

    private static final String COOKIE = "buvid3=84B0395D-C9F2-C490-E92E-A09AB48FE26E71636infoc";
    private ScheduledExecutorService service;
    private Map<String, String> audios;
    private AlertDialog dialog;
    private JsonObject extend;
    private String cookie;
    private boolean login;
    private boolean vip;

    private Map<String, String> getHeader(String cookie) {
        Map<String, String> headers = new HashMap<>();
        headers.put("cookie", cookie);
        headers.put("User-Agent", Utils.CHROME);
        headers.put("Referer", "https://www.bilibili.com");
        return headers;
    }

    private Map<String, String> getGuest() {
        return getHeader(COOKIE);
    }

    private Map<String, String> getMember() {
        return getHeader(cookie);
    }

    private void setAudio() {
        audios = new HashMap<>();
        audios.put("30280", "192000");
        audios.put("30232", "132000");
        audios.put("30216", "64000");
    }

    private void setCookie() {
        cookie = extend.get("cookie").getAsString();
        if (cookie.startsWith("http")) cookie = OkHttp.string(cookie).trim();
        if (TextUtils.isEmpty(cookie)) cookie = FileUtil.read(getUserCache());
        if (TextUtils.isEmpty(cookie)) cookie = COOKIE;
    }

    private List<Filter> getFilter() {
        List<Filter> items = new ArrayList<>();
        items.add(new Filter("order", "排序", Arrays.asList(new Filter.Value("預設", "totalrank"), new Filter.Value("最多點擊", "click"), new Filter.Value("最新發布", "pubdate"), new Filter.Value("最多彈幕", "dm"), new Filter.Value("最多收藏", "stow"))));
        items.add(new Filter("duration", "時長", Arrays.asList(new Filter.Value("全部時長", "0"), new Filter.Value("60分鐘以上", "4"), new Filter.Value("30~60分鐘", "3"), new Filter.Value("10~30分鐘", "2"), new Filter.Value("10分鐘以下", "1"))));
        return items;
    }

    private File getUserCache() {
        return FileUtil.getCacheFile("bilibili_user");
    }

    @Override
    public void init(Context context, String extend) {
        this.extend = JsonParser.parseString(extend).getAsJsonObject();
        setCookie();
        setAudio();
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        if (extend.has("json")) return OkHttp.string(extend.get("json").getAsString());
        List<Class> classes = new ArrayList<>();
        LinkedHashMap<String, List<Filter>> filters = new LinkedHashMap<>();
        String[] types = extend.get("type").getAsString().split("#");
        for (String type : types) {
            classes.add(new Class(type));
            filters.put(type, getFilter());
        }
        return Result.string(classes, filters);
    }

    @Override
    public String homeVideoContent() {
        String api = "https://api.bilibili.com/x/web-interface/popular?ps=20";
        String json = OkHttp.string(api, getGuest());
        Resp resp = Resp.objectFrom(json);
        List<Vod> list = new ArrayList<>();
        for (Resp.Result item : Resp.Result.arrayFrom(resp.getData().getList())) list.add(item.getVod());
        return Result.string(list);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        String order = extend.containsKey("order") ? extend.get("order") : "totalrank";
        String duration = extend.containsKey("duration") ? extend.get("duration") : "0";
        if (extend.containsKey("tid")) tid = tid + " " + extend.get("tid");
        String api = "https://api.bilibili.com/x/web-interface/search/type?search_type=video&keyword=" + URLEncoder.encode(tid) + "&order=" + order + "&duration=" + duration + "&page=" + pg;
        String json = OkHttp.string(api, getGuest());
        Resp resp = Resp.objectFrom(json);
        List<Vod> list = new ArrayList<>();
        for (Resp.Result item : Resp.Result.arrayFrom(resp.getData().getResult())) list.add(item.getVod());
        return Result.string(list);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        if (!login) checkLogin();

        String id = ids.get(0);
        String api = "https://api.bilibili.com/x/web-interface/archive/stat?bvid=" + id;
        String json = OkHttp.string(api, getMember());
        Resp resp = Resp.objectFrom(json);
        String aid = resp.getData().getAid();

        api = "https://api.bilibili.com/x/web-interface/view?aid=" + aid;
        json = OkHttp.string(api, getMember());
        Data detail = Resp.objectFrom(json).getData();
        Vod vod = new Vod();
        vod.setVodId(id);
        vod.setVodPic(detail.getPic());
        vod.setVodName(detail.getTitle());
        vod.setTypeName(detail.getType());
        vod.setVodContent(detail.getDesc());
        vod.setVodRemarks(detail.getDuration() / 60 + "分鐘");

        Map<String, String> vod_play = new LinkedHashMap<>();
        ArrayList<String> playList = new ArrayList<>();
        for (Page page : detail.getPages()) playList.add(page.getPart() + "$" + aid + "+" + page.getCid());
        vod_play.put("B站", TextUtils.join("#", playList));

        api = "https://api.bilibili.com/x/web-interface/archive/related?bvid=" + id;
        JSONArray related = new JSONObject(OkHttp.string(api, getMember())).optJSONArray("data");
        playList = new ArrayList<>();
        for (int i = 0; i < related.length(); i++) {
            JSONObject relatedData = related.getJSONObject(i);
            playList.add(relatedData.getString("title") + "$" + relatedData.optLong("aid") + "+" + relatedData.optLong("cid"));
        }
        vod_play.put("相关推荐", TextUtils.join("#", playList));

        vod.setVodPlayFrom(TextUtils.join("$$$", vod_play.keySet()));
        vod.setVodPlayUrl(TextUtils.join("$$$", vod_play.values()));
        return Result.string(vod);
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        return categoryContent(key, "1", true, new HashMap<>());
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) throws Exception {
        return categoryContent(key, pg, true, new HashMap<>());
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        String[] ids = id.split("\\+");
        String aid = ids[0];
        String cid = ids[1];
        String qn = "127";

        String api = "https://api.bilibili.com/x/player/playurl?avid=" + aid + "&cid=" + cid + "&qn=" + qn + "&fnval=4048&fourk=1";
        String json = OkHttp.string(api, getMember());
        Resp resp = Resp.objectFrom(json);
        Dash dash = resp.getData().getDash();

        StringBuilder video = new StringBuilder();
        StringBuilder audio = new StringBuilder();
        findAudio(dash, audio);
        findVideo(dash, video, qn);
        boolean empty = video.length() == 0 && dash.getVideo().size() > 0;
        if (empty) findVideo(dash, video, dash.getVideo().get(0).getId());

        String mpd = getMpd(dash, video.toString(), audio.toString());
        String url = "data:application/dash+xml;base64," + Base64.encodeToString(mpd.getBytes(), 0);
        return Result.get().url(url).dash().header(getMember()).string();
    }

    private void findAudio(Dash dash, StringBuilder sb) {
        for (Media audio : dash.getAudio()) {
            for (String key : audios.keySet()) {
                if (audio.getId().equals(key)) {
                    sb.append(getMedia(audio));
                }
            }
        }
    }

    private void findVideo(Dash dash, StringBuilder sb, String qn) {
        for (Media video : dash.getVideo()) {
            if (video.getId().equals(qn)) {
                sb.append(getMedia(video));
            }
        }
    }

    private String getMedia(Media media) {
        if (media.getMimeType().startsWith("video")) {
            return getAdaptationSet(media, String.format(Locale.getDefault(), "height='%s' width='%s' frameRate='%s' sar='%s'", media.getHeight(), media.getWidth(), media.getFrameRate(), media.getSar()));
        } else if (media.getMimeType().startsWith("audio")) {
            return getAdaptationSet(media, String.format("numChannels='2' sampleRate='%s'", audios.get(media.getId())));
        } else {
            return "";
        }
    }

    private String getAdaptationSet(Media media, String params) {
        String id = media.getId() + "_" + media.getCodecId();
        String type = media.getMimeType().split("/")[0];
        String baseUrl = media.getBaseUrl().replace("&", "&amp;");
        return String.format(Locale.getDefault(), "<AdaptationSet>\n" + "<ContentComponent contentType=\"%s\"/>\n" + "<Representation id=\"%s\" bandwidth=\"%s\" codecs=\"%s\" mimeType=\"%s\" %s startWithSAP=\"%s\">\n" + "<BaseURL>%s</BaseURL>\n" + "<SegmentBase indexRange=\"%s\">\n" + "<Initialization range=\"%s\"/>\n" + "</SegmentBase>\n" + "</Representation>\n" + "</AdaptationSet>", type, id, media.getBandWidth(), media.getCodecs(), media.getMimeType(), params, media.getStartWithSap(), baseUrl, media.getSegmentBase().getIndexRange(), media.getSegmentBase().getInitialization());
    }

    private String getMpd(Dash dash, String videoList, String audioList) {
        return String.format(Locale.getDefault(), "<MPD xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"urn:mpeg:dash:schema:mpd:2011\" xsi:schemaLocation=\"urn:mpeg:dash:schema:mpd:2011 DASH-MPD.xsd\" type=\"static\" mediaPresentationDuration=\"PT%sS\" minBufferTime=\"PT%sS\" profiles=\"urn:mpeg:dash:profile:isoff-on-demand:2011\">\n" + "<Period duration=\"PT%sS\" start=\"PT0S\">\n" + "%s\n" + "%s\n" + "</Period>\n" + "</MPD>", dash.getDuration(), dash.getMinBufferTime(), dash.getDuration(), videoList, audioList);
    }

    private void checkLogin() {
        String json = OkHttp.string("https://api.bilibili.com/x/web-interface/nav", getMember());
        Data data = Resp.objectFrom(json).getData();
        vip = data.getVipType() > 0;
        login = data.isLogin();
        getQRCode();
    }

    private void getQRCode() {
        if (login || getUserCache().exists() && COOKIE.equals(cookie)) return;
        String json = OkHttp.string("https://passport.bilibili.com/x/passport-login/web/qrcode/generate?source=main-mini");
        Data data = Resp.objectFrom(json).getData();
        Init.run(() -> openApp(data));
    }

    private Intent getIntent(String pkgName, Data data) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setClassName(pkgName, "tv.danmaku.bili.ui.intent.IntentHandlerActivity");
        intent.setData(Uri.parse(data.getUrl()));
        return intent;
    }

    private void openApp(Data data) {
        try {
            Init.getActivity().startActivity(getIntent("com.bilibili.app.in", data));
        } catch (Exception e) {
            showQRCode(data);
        } finally {
            Init.execute(() -> startService(data));
        }
    }

    private void showQRCode(Data data) {
        try {
            FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(Utils.dp2px(240), Utils.dp2px(240));
            ImageView image = new ImageView(Init.context());
            image.setScaleType(ImageView.ScaleType.CENTER_CROP);
            image.setImageBitmap(QRCode.getBitmap(data.getUrl(), 240, 2));
            FrameLayout frame = new FrameLayout(Init.context());
            params.gravity = Gravity.CENTER;
            frame.addView(image, params);
            dialog = new AlertDialog.Builder(Init.getActivity()).setView(frame).setOnCancelListener(this::cancel).setOnDismissListener(this::dismiss).show();
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            Utils.notify("請使用 BiliBili App 掃描二維碼");
        } catch (Exception ignored) {
        }
    }

    private void startService(Data data) {
        service = Executors.newScheduledThreadPool(1);
        service.scheduleAtFixedRate(() -> {
            String url = "https://passport.bilibili.com/x/passport-login/web/qrcode/poll?qrcode_key=" + data.getQrcodeKey() + "&source=main_mini";
            String json = OkHttp.string(url, getGuest());
            url = Resp.objectFrom(json).getData().getUrl();
            if (url.length() > 0) setCookie(url);
        }, 1, 1, TimeUnit.SECONDS);
    }

    private void stopService() {
        if (service != null) service.shutdownNow();
        Init.run(this::dismiss);
    }

    private void setCookie(String url) {
        StringBuilder sb = new StringBuilder();
        String[] splits = Uri.parse(url).getQuery().split("&");
        for (String split : splits) sb.append(split).append(";");
        FileUtil.write(getUserCache(), cookie = sb.toString());
        Utils.notify("請重新進入播放頁");
        stopService();
    }

    private void cancel(DialogInterface dialog) {
        FileUtil.write(getUserCache(), cookie = COOKIE);
        stopService();
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