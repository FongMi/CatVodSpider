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
    private Map<String, String> header;
    private Map<String, String> audios;
    private AlertDialog dialog;
    private String extend;
    private boolean login;
    private boolean vip;

    private void setHeader() {
        header = new HashMap<>();
        header.put("cookie", getCookie());
        header.put("User-Agent", Utils.CHROME);
        header.put("Referer", "https://www.bilibili.com");
    }

    private void setAudio() {
        audios = new HashMap<>();
        audios.put("30280", "192000");
        audios.put("30232", "132000");
        audios.put("30216", "64000");
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

    private String getCookie() {
        String cookie = FileUtil.read(getUserCache());
        return TextUtils.isEmpty(cookie) ? COOKIE : cookie;
    }

    @Override
    public void init(Context context, String extend) {
        try {
            this.extend = extend;
            setHeader();
            setAudio();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        LinkedHashMap<String, List<Filter>> filters = new LinkedHashMap<>();
        String[] types = extend.split("#");
        for (String type : types) {
            classes.add(new Class(type));
            filters.put(type, getFilter());
        }
        return Result.string(classes, filters);
    }

    @Override
    public String homeVideoContent() throws Exception {
        return categoryContent(extend.split("#")[0], "1", true, new HashMap<>());
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        String order = extend.containsKey("order") ? extend.get("order") : "totalrank";
        String duration = extend.containsKey("duration") ? extend.get("duration") : "0";
        String api = "https://api.bilibili.com/x/web-interface/search/type?search_type=video&keyword=" + URLEncoder.encode(tid) + "&order=" + order + "&duration=" + duration + "&page=" + pg;
        String json = OkHttp.string(api, header);
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
        String json = OkHttp.string(api, header);
        Resp resp = Resp.objectFrom(json);
        String aid = resp.getData().getAid();

        api = "https://api.bilibili.com/x/web-interface/view?aid=" + aid;
        json = OkHttp.string(api, header);
        Data detail = Resp.objectFrom(json).getData();
        Vod vod = new Vod();
        vod.setVodId(id);
        vod.setVodPic(detail.getPic());
        vod.setVodName(detail.getTitle());
        vod.setTypeName(detail.getType());
        vod.setVodContent(detail.getDesc());
        vod.setVodRemarks(detail.getDuration() / 60 + "分鐘");

        api = "https://api.bilibili.com/x/player/playurl?avid=" + aid + "&cid=" + detail.getCid() + "&qn=127&fnval=4048&fourk=1";
        json = OkHttp.string(api, header);
        Data play = Resp.objectFrom(json).getData();
        List<String> playList = new ArrayList<>();
        List<String> playFrom = new ArrayList<>();
        for (int i = 0; i < play.getAcceptQuality().size(); i++) {
            int quality = play.getAcceptQuality().get(i);
            List<String> vodItems = new ArrayList<>();
            if (!login && quality > 32) continue;
            if (!vip && quality > 80) continue;
            for (Page page : detail.getPages()) vodItems.add(page.getPart() + "$" + aid + "+" + page.getCid() + "+" + quality);
            playList.add(TextUtils.join("#", vodItems));
            playFrom.add(play.getAcceptDescription().get(i));
        }

        vod.setVodPlayFrom(TextUtils.join("$$$", playFrom));
        vod.setVodPlayUrl(TextUtils.join("$$$", playList));
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
        String qn = ids[2];

        String api = "https://api.bilibili.com/x/player/playurl?avid=" + aid + "&cid=" + cid + "&qn=" + qn + "&fnval=4048&fourk=1";
        String json = OkHttp.string(api, header);
        Resp resp = Resp.objectFrom(json);
        Dash dash = resp.getData().getDash();

        StringBuilder videoList = new StringBuilder();
        StringBuilder audioList = new StringBuilder();
        for (Media video : dash.getVideo()) {
            if (video.getId().equals(qn)) {
                videoList.append(getMedia(video));
            }
        }
        for (Media audio : dash.getAudio()) {
            for (String key : audios.keySet()) {
                if (audio.getId().equals(key)) {
                    audioList.append(getMedia(audio));
                }
            }
        }

        String mpd = getMpd(dash, videoList.toString(), audioList.toString());
        String url = "data:application/dash+xml;base64," + Base64.encodeToString(mpd.getBytes(), 0);
        return Result.get().url(url).header(header).string();
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
        return String.format(Locale.getDefault(),
                "<AdaptationSet>\n" +
                        "<ContentComponent contentType=\"%s\"/>\n" +
                        "<Representation id=\"%s\" bandwidth=\"%s\" codecs=\"%s\" mimeType=\"%s\" %s startWithSAP=\"%s\">\n" +
                        "<BaseURL>%s</BaseURL>\n" +
                        "<SegmentBase indexRange=\"%s\">\n" +
                        "<Initialization range=\"%s\"/>\n" +
                        "</SegmentBase>\n" +
                        "</Representation>\n" +
                        "</AdaptationSet>",
                type,
                id, media.getBandWidth(), media.getCodecs(), media.getMimeType(), params, media.getStartWithSap(),
                baseUrl,
                media.getSegmentBase().getIndexRange(),
                media.getSegmentBase().getInitialization());
    }

    private String getMpd(Dash dash, String videoList, String audioList) {
        return String.format(Locale.getDefault(),
                "<MPD xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"urn:mpeg:dash:schema:mpd:2011\" xsi:schemaLocation=\"urn:mpeg:dash:schema:mpd:2011 DASH-MPD.xsd\" type=\"static\" mediaPresentationDuration=\"PT%sS\" minBufferTime=\"PT%sS\" profiles=\"urn:mpeg:dash:profile:isoff-on-demand:2011\">\n" +
                        "<Period duration=\"PT%sS\" start=\"PT0S\">\n" +
                        "%s\n" +
                        "%s\n" +
                        "</Period>\n" +
                        "</MPD>",
                dash.getDuration(), dash.getMinBufferTime(),
                dash.getDuration(),
                videoList,
                audioList);
    }

    private void checkLogin() {
        String json = OkHttp.string("https://api.bilibili.com/x/web-interface/nav", header);
        Data data = Resp.objectFrom(json).getData();
        login = data.isLogin();
        vip = data.getVipType() > 0;
        if (!login && !getUserCache().exists()) getQRCode();
    }

    private void getQRCode() {
        String json = OkHttp.string("https://passport.bilibili.com/x/passport-login/web/qrcode/generate?source=main-mini");
        Data data = Resp.objectFrom(json).getData();
        Init.run(() -> showQRCode(data));
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
            dialog = new AlertDialog.Builder(Init.getActivity()).setView(frame).setOnDismissListener(this::dismiss).show();
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            Init.show("請使用 BiliBili App 掃描二維碼");
            Init.execute(() -> startService(data));
        } catch (Exception ignored) {
        }
    }

    private void startService(Data data) {
        service = Executors.newScheduledThreadPool(1);
        service.scheduleAtFixedRate(() -> {
            String url = "https://passport.bilibili.com/x/passport-login/web/qrcode/poll?qrcode_key=" + data.getQrcodeKey() + "&source=main_mini";
            String json = OkHttp.string(url, header);
            url = Resp.objectFrom(json).getData().getUrl();
            if (url.length() > 0) setCookie(url);
        }, 1, 1, TimeUnit.SECONDS);
    }

    private void setCookie(String url) {
        StringBuilder cookie = new StringBuilder();
        String[] splits = Uri.parse(url).getQuery().split("&");
        for (String split : splits) cookie.append(split).append(";");
        FileUtil.write(getUserCache(), cookie.toString());
        Init.show("請重新進入播放頁");
        stopService();
    }

    private void stopService() {
        if (service != null) service.shutdownNow();
        Init.run(this::dismiss);
    }

    private void dismiss(DialogInterface dialog) {
        FileUtil.write(getUserCache(), COOKIE);
        stopService();
    }

    private void dismiss() {
        try {
            if (dialog != null) dialog.dismiss();
        } catch (Exception ignored) {
        }
    }
}