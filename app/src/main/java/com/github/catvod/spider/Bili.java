package com.github.catvod.spider;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

import android.view.Gravity;
import android.webkit.CookieManager;
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
import com.github.catvod.utils.Trans;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author ColaMint & FongMi
 */
public class Bili extends Spider {

    private static final String url = "https://www.bilibili.com";
    private JSONObject ext;
    private ScheduledExecutorService service;
    private ImageView view;
    private static boolean login;
    private static String finalUrl = "";
    private static boolean FirstTime = false;
    private static String cookie = "";

    private void getCookie() {
        cookie = Prefers.getString("BiliCookie", "");
        HashMap<String, List<String>> respHeaderMap = new HashMap<>();
        OkHttp.string(url, getHeaders(), respHeaderMap);
        if (cookie.isEmpty()) {
            for (String kk : Objects.requireNonNull(respHeaderMap.get("set-cookie"))) {
                cookie += kk.split(";")[0] + ";";
            }
        }
    }

    private static HashMap<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", Utils.CHROME);
        headers.put("Referer", url);
        if (!cookie.isEmpty()) headers.put("cookie", cookie);
        return headers;
    }

    @Override
    public void init(Context context, String extend) {
        try {
            if (extend.startsWith("http")) {
                extend = OkHttp.string(extend);
            }
            ext = new JSONObject(extend);
            if (ext.optString("cookie").length() > 0) {
                cookie = ext.optString("cookie");
            } else {
                getCookie();
            }
            String content = OkHttp.string("https://api.bilibili.com/x/web-interface/nav", getHeaders());
            login = new JSONObject(content).getJSONObject("data").getBoolean("isLogin");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        return Result.string(Class.arrayFrom(ext.getJSONArray("classes").toString()), ext.getJSONObject("filter"));
    }

    @Override
    public String homeVideoContent() throws Exception {
        return categoryContent("窗 白噪音", "1", true, new HashMap<>());
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        String duration = extend.containsKey("duration") ? extend.get("duration") : "0";
        if (extend.containsKey("tid")) tid = tid + " " + extend.get("tid");
        String url = "https://api.bilibili.com/x/web-interface/search/type?search_type=video&keyword=" + URLEncoder.encode(tid) + "&duration=" + duration + "&page=" + pg;
        JSONObject resp = new JSONObject(OkHttp.string(url, getHeaders()));
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
        String bvid = ids.get(0);
        String bvid2aidUrl = "https://api.bilibili.com/x/web-interface/archive/stat?bvid=" + bvid;
        JSONObject bvid2aidResp = new JSONObject(OkHttp.string(bvid2aidUrl, getHeaders()));
        String aid = bvid2aidResp.getJSONObject("data").getLong("aid") + "";
        String detailUrl = "https://api.bilibili.com/x/web-interface/view?aid=" + aid;
        JSONObject detailResp = new JSONObject(OkHttp.string(detailUrl, getHeaders()));
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
        if (!login && !FirstTime) {
            FirstTime = true;
            checkService();
            getQRCode();
        }
        String[] ids = id.split("\\+");
        String aid = ids[0];
        String cid = ids[1];
        String url = "https://api.bilibili.com/x/player/playurl?avid=" + aid + "&cid=" + cid + "&qn=120&fourk=1";
        JSONObject resp = new JSONObject(OkHttp.string(url, getHeaders()));
        url = resp.getJSONObject("data").getJSONArray("durl").getJSONObject(0).getString("url");
        return Result.get().url(url).header(getHeaders()).string();
    }

    private void checkService() {
        if (service != null) service.shutdownNow();
        if (view != null) Init.run(() -> Utils.removeView(view));
    }

    private void getQRCode() throws JSONException {
        JSONObject data = new JSONObject(OkHttp.string("https://passport.bilibili.com/x/passport-login/web/qrcode/generate?source=main-mini", null));
        String qrcode = data.getJSONObject("data").getString("url");
        Init.run(() -> showCode(qrcode));
        service = Executors.newScheduledThreadPool(1);
        service.scheduleAtFixedRate(() -> {
            try {
                String qr = data.getJSONObject("data").getString("qrcode_key");
                String url = "https://passport.bilibili.com/x/passport-login/web/qrcode/poll?qrcode_key=" + qr + "&source=main_mini";
                String content = OkHttp.string(url, getHeaders());
                finalUrl = new JSONObject(content).getJSONObject("data").getString("url");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (!finalUrl.isEmpty()) setCookie(finalUrl);
        }, 1, 1, TimeUnit.SECONDS);
    }

    private void setCookie(String value) {
        finalUrl = value;
        loadWebView();
        Init.show("请重新进入播放页");
        checkService();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void loadWebView() {
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.flush();
        cookieManager.removeAllCookies(null);
        cookieManager.removeSessionCookies(null);
        HashMap<String, List<String>> respHeaderMap = new HashMap<>();
        OkHttp.stringNoRedirect(finalUrl, getHeaders(), respHeaderMap);
        cookie = "";
        for (String kk : Objects.requireNonNull(respHeaderMap.get("set-cookie"))) {
            cookie = cookie.concat(kk.split(";")[0] + ";");
        }
        Prefers.put("BiliCookie", cookie);
    }

    private void showCode(String text) {
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.CENTER;
        Utils.addView(view = create(text), params);
        Init.show("请使用 BiliBili App 扫描二维码");
    }

    private ImageView create(String value) {
        ImageView view = new ImageView(Init.context());
        view.setScaleType(ImageView.ScaleType.CENTER_CROP);
        view.setImageBitmap(QRCode.getBitmap(value, 250, 2));
        return view;
    }
}
