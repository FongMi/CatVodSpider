package com.github.catvod.spider;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
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
import com.github.catvod.utils.Trans;
import com.github.catvod.utils.Utils;

import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author ColaMint & FongMi
 */
public class Bili extends Spider {

    private ScheduledExecutorService service;
    private HashMap<String, String> header;
    private AlertDialog dialog;
    private JSONObject ext;
    private String extend;
    private boolean login;

    private String getCookie(String cookie) {
        String cache = Prefers.getString("BiliCookie");
        if (!TextUtils.isEmpty(cache)) return cache;
        if (cookie.startsWith("http")) return OkHttp.string(cookie).replace("\n", "").trim();
        return cookie.isEmpty() ? "buvid3=84B0395D-C9F2-C490-E92E-A09AB48FE26E71636infoc" : cookie;
    }

    private void setHeader() {
        header.put("cookie", getCookie(ext.optString("cookie")));
        header.put("Referer", "https://www.bilibili.com");
        header.put("User-Agent", Utils.CHROME);
    }

    private void fetchRule() throws Exception {
        if (header.containsKey("cookie") && header.get("cookie").length() > 0) return;
        if (extend.startsWith("http")) extend = OkHttp.string(extend);
        ext = new JSONObject(extend);
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
        return categoryContent("窗 白噪音", "1", true, new HashMap<>());
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        String duration = extend.containsKey("duration") ? extend.get("duration") : "0";
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
            playlist.add(Trans.get(title) + "$" + aid + "+" + page.getLong("cid"));
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
        String url = "https://api.bilibili.com/x/player/playurl?avid=" + aid + "&cid=" + cid + "&qn=120&fourk=1";
        JSONObject resp = new JSONObject(OkHttp.string(url, header));
        url = resp.getJSONObject("data").getJSONArray("durl").getJSONObject(0).getString("url");
        return Result.get().url(url).header(header).string();
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
        Map<String, List<String>> respHeader = new HashMap<>();
        OkHttp.stringNoRedirect(url, header, respHeader);
        StringBuilder sb = new StringBuilder();
        for (String value : Objects.requireNonNull(respHeader.get("set-cookie"))) sb.append(value.split(";")[0]).append(";");
        Init.run(() -> Prefers.put("BiliQRCode", true), 5000);
        Prefers.put("BiliCookie", sb.toString());
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
