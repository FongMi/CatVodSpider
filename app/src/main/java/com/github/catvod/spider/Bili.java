package com.github.catvod.spider;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Prefers;
import com.github.catvod.utils.QRCode;
import com.github.catvod.utils.Utils;

import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author ColaMint & FongMi & 唐三
 */
public class Bili extends Spider {

    private ScheduledExecutorService service;
    private HashMap<String, String> header;
    private AlertDialog dialog;
    private JSONObject ext;
    private String extend;
    private boolean login;

    private String getCookie() {
        String cache = Prefers.getString("BiliCookie");
        if (!TextUtils.isEmpty(cache)) return cache;
        if (ext.optString("cookie").startsWith("http"))
            return OkHttp.string(ext.optString("cookie")).replace("\n", "").trim();
        return ext.optString("cookie", "buvid3=84B0395D-C9F2-C490-E92E-A09AB48FE26E71636infoc");
    }

    private void setHeader() {
        header.put("cookie", getCookie());
        header.put("Referer", "https://www.bilibili.com");
        header.put("User-Agent", Utils.CHROME);
    }

    private void generate() throws Exception {
        ext = new JSONObject();
        JSONArray classes = new JSONArray();
        JSONObject filters = new JSONObject();
        ext.put("classes", classes);
        ext.put("filter", filters);
        JSONArray filter = new JSONArray("[{\"key\":\"order\",\"name\":\"排序\",\"value\":[{\"n\":\"综合排序\",\"v\":\"0\"},{\"n\":\"最多点击\",\"v\":\"click\"},{\"n\":\"最新发布\",\"v\":\"pubdate\"},{\"n\":\"最多弹幕\",\"v\":\"dm\"},{\"n\":\"最多收藏\",\"v\":\"stow\"}]},{\"key\":\"duration\",\"name\":\"时长\",\"value\":[{\"n\":\"全部时长\",\"v\":\"0\"},{\"n\":\"60分钟以上\",\"v\":\"4\"},{\"n\":\"30~60分钟\",\"v\":\"3\"},{\"n\":\"10~30分钟\",\"v\":\"2\"},{\"n\":\"10分钟以下\",\"v\":\"1\"}]}]");
        String[] types = extend.split("#");
        for (String type : types) {
            JSONObject c = new JSONObject();
            c.put("type_name", type);
            c.put("type_id", type);
            filters.put(type, filter);
            classes.put(c);
        }
    }

    private void fetchRule() throws Exception {
        if (header.containsKey("cookie") && header.get("cookie").length() > 0) return;
        if (extend.startsWith("http")) ext = new JSONObject(extend = OkHttp.string(extend));
        else generate();
        setHeader();
    }

    @Override
    public void init(Context context, String extend) {
        try {
            this.extend = extend;
            this.header = new HashMap<>();
            fetchRule();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        fetchRule();
        return Result.string(Class.arrayFrom(ext.getJSONArray("classes").toString()), ext.getJSONObject("filter"));
    }

    @Override
    public String homeVideoContent() throws Exception {
        fetchRule();
        return categoryContent(ext.optJSONArray("classes").optJSONObject(0).optString("type_id"), "1", true, new HashMap<>());
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        String duration = extend.containsKey("duration") ? extend.get("duration") : "4";
        if (extend.containsKey("tid")) tid = tid + " " + extend.get("tid");
        String url = "https://api.bilibili.com/x/web-interface/search/type?search_type=video&keyword=" + URLEncoder.encode(tid) + "&duration=" + duration + "&page=" + pg;
        JSONObject resp = new JSONObject(OkHttp.string(url, header));
        JSONArray result = resp.getJSONObject("data").getJSONArray("result");
        List<Vod> list = new ArrayList<>();
        for (int i = 0; i < result.length(); ++i) {
            JSONObject object = result.getJSONObject(i);
            String pic = object.getString("pic");
            Vod vod = new Vod();
            vod.setVodId(object.getString("bvid"));
            vod.setVodName(Jsoup.parse(object.getString("title")).text());
            vod.setVodRemarks(object.getString("duration").split(":")[0] + "分鐘");
            vod.setVodPic(pic.startsWith("//") ? "https:" + pic : pic);
            list.add(vod);
        }
        return Result.string(list);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        if (!login) checkLogin();
        String bvid = ids.get(0);
        String bvid2aidUrl = "https://api.bilibili.com/x/web-interface/archive/stat?bvid=" + bvid;
        JSONObject bvid2aidResp = new JSONObject(OkHttp.string(bvid2aidUrl, header));
        String aid = bvid2aidResp.getJSONObject("data").getLong("aid") + "";
        String detailUrl = "https://api.bilibili.com/x/web-interface/view?aid=" + aid;
        JSONObject detailResp = new JSONObject(OkHttp.string(detailUrl, header));
        JSONObject detailData = detailResp.getJSONObject("data");
        List<String> playlist = new ArrayList<>();
        JSONArray pages = detailData.getJSONArray("pages");
        for (int i = 0; i < pages.length(); ++i) {
            JSONObject page = pages.getJSONObject(i);
            String title = page.getString("part").replace("$", "_").replace("#", "_");
            playlist.add(title + "$" + aid + "+" + page.getLong("cid"));
        }
        Vod vod = new Vod();
        vod.setVodId(bvid);
        vod.setVodName(detailData.getString("title"));
        vod.setVodPic(detailData.getString("pic"));
        vod.setTypeName(detailData.getString("tname"));
        vod.setVodRemarks(detailData.getLong("duration") / 60 + "分鐘");
        vod.setVodContent(detailData.getString("desc"));
        vod.setVodPlayFrom("B站");
        vod.setVodPlayUrl(TextUtils.join("#", playlist));
        return Result.string(vod);
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        return categoryContent(key, "1", true, new HashMap<>());
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        String[] ids = id.split("\\+");
        String aid = ids[0];
        String cid = ids[1];
        String url = "https://api.bilibili.com/x/player/playurl?avid=" + aid + "&cid=" + cid + "&qn=120&fnval=4048&fourk=1";
        JSONObject resp = new JSONObject(OkHttp.string(url, header));
        JSONObject dash = resp.optJSONObject("data").optJSONObject("dash");
        JSONArray video = dash.optJSONArray("video");
        JSONArray audio = dash.optJSONArray("audio");
        StringBuilder videoList = new StringBuilder();
        StringBuilder audioList = new StringBuilder();
        for (int i = 0; i < video.length(); i++) {
            JSONObject vjson = video.getJSONObject(i);
            videoList.append(getDashMedia(vjson));
        }
        for (int i = 0; i < audio.length(); i++) {
            JSONObject ajson = audio.getJSONObject(i);
            audioList.append(getDashMedia(ajson));
        }
        String mpd = getDash(dash, videoList.toString(), audioList.toString());
        String dashUrl = "data:application/dash+xml;base64," + Base64.encodeToString(mpd.getBytes(), 0);
        return Result.get().url(dashUrl).header(header).string();
    }

    public static String getDashMedia(JSONObject dash) throws Exception {
        JSONObject vod_audio_id = new JSONObject();
        vod_audio_id.put("30280", "192000");
        vod_audio_id.put("30232", "132000");
        vod_audio_id.put("30216", "64000");
        String qnid = dash.getString("id");
        int codecid = dash.getInt("codecid");
        String media_codecs = dash.getString("codecs");
        Integer media_bandwidth = dash.getInt("bandwidth");
        String media_startWithSAP = dash.getString("startWithSap");
        String media_mimeType = dash.getString("mimeType");
        String media_BaseURL = dash.getString("baseUrl").replace("&", "&amp;");
        String media_SegmentBase_indexRange = dash.getJSONObject("SegmentBase").getString("indexRange");
        String media_SegmentBase_Initialization = dash.getJSONObject("SegmentBase").getString("Initialization");
        String mediaType = media_mimeType.split("/")[0];
        String media_type_params = "";

        if (mediaType.equals("video")) {
            Integer media_frameRate = dash.getInt("frameRate");
            String media_sar = dash.getString("sar");
            Integer media_width = dash.getInt("width");
            Integer media_height = dash.getInt("height");
            media_type_params = String.format("height='%d' width='%d' frameRate='%d' sar='%s'", media_height, media_width, media_frameRate, media_sar);
        } else if (mediaType.equals("audio")) {
            String audioSamplingRate = vod_audio_id.getString(qnid);
            media_type_params = String.format("numChannels='2' sampleRate='%s'", audioSamplingRate);
        }

        qnid += "_" + codecid;

        return String.format(
                "<AdaptationSet>\n" +
                        "       <ContentComponent contentType=\"%s\"/>\n" +
                        "       <Representation id=\"%s\" bandwidth=\"%d\" codecs=\"%s\" mimeType=\"%s\" %s startWithSAP=\"%b\">\n" +
                        "           <BaseURL>%s</BaseURL>\n" +
                        "           <SegmentBase indexRange=\"%s\">\n" +
                        "           <Initialization range=\"%s\"/>\n" +
                        "           </SegmentBase>\n" +
                        "       </Representation>\n" +
                        "   </AdaptationSet>",
                mediaType, qnid, media_bandwidth, media_codecs, media_mimeType, media_type_params, media_startWithSAP, media_BaseURL,
                media_SegmentBase_indexRange, media_SegmentBase_Initialization);
    }


    public static String getDash(JSONObject ja, String videoList, String audioList) throws Exception {
        Integer duration = ja.getInt("duration");
        Integer minBufferTime = ja.getInt("minBufferTime");
        return String.format(
                "<MPD xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"urn:mpeg:dash:schema:mpd:2011\" xsi:schemaLocation=\"urn:mpeg:dash:schema:mpd:2011 DASH-MPD.xsd\" type=\"static\" mediaPresentationDuration=\"PT%dS\" minBufferTime=\"PT%dS\" profiles=\"urn:mpeg:dash:profile:isoff-on-demand:2011\">\n" +
                        "  <Period duration=\"PT%dS\" start=\"PT0S\">\n" +
                        "    %s\n" +
                        "    %s\n" +
                        "  </Period>\n" +
                        "</MPD>",
                duration, minBufferTime, duration, videoList, audioList);
    }

    private void checkLogin() throws Exception {
        login = new JSONObject(OkHttp.string("https://api.bilibili.com/x/web-interface/nav", header)).getJSONObject("data").getBoolean("isLogin");
        boolean qrCode = Prefers.getBoolean("BiliQRCode", true);
        if (!login && qrCode) getQRCode();
    }

    private void getQRCode() {
        try {
            String json = OkHttp.string("https://passport.bilibili.com/x/passport-login/web/qrcode/generate?source=main-mini", null);
            JSONObject data = new JSONObject(json).getJSONObject("data");
            Init.run(() -> showQRCode(data));
        } catch (Exception ignored) {
        }
    }

    private void showQRCode(JSONObject data) {
        try {
            FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(Utils.dp2px(240), Utils.dp2px(240));
            ImageView image = new ImageView(Init.context());
            image.setScaleType(ImageView.ScaleType.CENTER_CROP);
            image.setImageBitmap(QRCode.getBitmap(data.getString("url"), 240, 2));
            FrameLayout frame = new FrameLayout(Init.context());
            params.gravity = Gravity.CENTER;
            frame.addView(image, params);
            dialog = new AlertDialog.Builder(Init.getActivity()).setView(frame).setOnDismissListener(this::dismiss).show();
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            Init.execute(() -> startService(data));
            Init.show("請使用 BiliBili App 掃描二維碼");
        } catch (Exception ignored) {
        }
    }

    private void startService(JSONObject data) {
        service = Executors.newScheduledThreadPool(1);
        service.scheduleAtFixedRate(() -> {
            try {
                String qr = data.getString("qrcode_key");
                String url = "https://passport.bilibili.com/x/passport-login/web/qrcode/poll?qrcode_key=" + qr + "&source=main_mini";
                String json = OkHttp.string(url, header);
                url = new JSONObject(json).getJSONObject("data").getString("url");
                if (!TextUtils.isEmpty(url)) setCookie(url);
            } catch (Exception ignored) {
            }
        }, 1, 1, TimeUnit.SECONDS);
    }

    private void setCookie(String url) {
        StringBuilder cookie = new StringBuilder();
        String[] aa = Uri.parse(url).getQuery().split("&");
        for (String a : aa) cookie.append(a).append(";");
        Prefers.put("BiliCookie", cookie.toString());
        Init.show("請重新進入播放頁");
        stopService();
    }

    private void stopService() {
        if (service != null) service.shutdownNow();
        Init.run(this::dismiss);
    }

    private void dismiss(DialogInterface dialog) {
        Prefers.put("BiliQRCode", false);
        stopService();
    }

    private void dismiss() {
        try {
            if (dialog != null) dialog.dismiss();
        } catch (Exception ignored) {
        }
    }
}
