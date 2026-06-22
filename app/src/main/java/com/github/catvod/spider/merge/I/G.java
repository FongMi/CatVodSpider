package com.github.catvod.spider.merge.I;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.g.C1201a;
import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.utils.server.Server;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class BilibiliApi extends Spider {
    private ScheduledExecutorService a;
    private Map<String, String> b;
    private AlertDialog c;
    public JsonObject d;
    public String e;
    public boolean f;
    private com.github.catvod.spider.merge.O.j g;
    public Map<String, String> h = new HashMap();

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public G() {
        HashMap map = new HashMap();
        this.b = map;
        map.put("30280", "192000");
        this.b.put("30232", "132000");
        this.b.put("30216", "64000");
    }

    public static void a(BilibiliApi g, com.github.catvod.spider.merge.O.b bVar) {
        g.getClass();
        try {
            try {
                Init.getActivity().startActivity(g.m(bVar));
                Init.execute(new C(g, bVar, 0));
            } catch (Exception unused) {
                g.s(bVar);
                Init.execute(new RunnableC0747c(g, bVar, 2));
            }
        } catch (Throwable th) {
            Init.execute(new D(g, bVar, 0));
            throw th;
        }
    }

    public static void b(BilibiliApi g, com.github.catvod.spider.merge.O.b bVar) {
        g.getClass();
        String strK = com.github.catvod.spider.merge.O.h.b(com.github.catvod.spider.merge.f0.d.m("https://passport.bilibili.com/x/passport-login/web/qrcode/poll?qrcode_key=" + bVar.h() + "&source=main_mini", g.k(), null)).a().k();
        if (strK.length() > 0) {
            StringBuilder sb = new StringBuilder();
            for (String str : Uri.parse(strK).getQuery().split("&")) {
                sb.append(str);
                sb.append(";");
            }
            File fileQ = g.q();
            String string = sb.toString();
            g.e = string;
            com.github.catvod.spider.merge.g.b.h(fileQ, string);
            com.github.catvod.spider.merge.i0.m.w("請重新進入播放頁");
            g.t();
        }
    }

    public static void c(BilibiliApi g) {
        File fileQ = g.q();
        g.e = "buvid3=84B0395D-C9F2-C490-E92E-A09AB48FE26E71636infoc";
        com.github.catvod.spider.merge.g.b.h(fileQ, "buvid3=84B0395D-C9F2-C490-E92E-A09AB48FE26E71636infoc");
        g.t();
    }

    public static void d(BilibiliApi g) {
        g.getClass();
        try {
            AlertDialog alertDialog = g.c;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    public static void e(BilibiliApi g, com.github.catvod.spider.merge.O.b bVar) {
        g.getClass();
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        g.a = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new RunnableC0751e(g, bVar, 1), 1L, 1L, TimeUnit.SECONDS);
    }

    public static void f(BilibiliApi g) {
        g.t();
    }

    private void h(com.github.catvod.spider.merge.O.a aVar, StringBuilder sb, String str) {
        for (com.github.catvod.spider.merge.O.c cVar : aVar.d()) {
            if (cVar.g().equals(str)) {
                sb.append(n(cVar));
            }
        }
    }

    public static BilibiliApi i() {
        return F.a;
    }

    private String j(com.github.catvod.spider.merge.O.c cVar, String str) {
        return String.format(Locale.getDefault(), "<AdaptationSet>\n<ContentComponent contentType=\"%s\"/>\n<Representation id=\"%s\" bandwidth=\"%s\" codecs=\"%s\" mimeType=\"%s\" %s startWithSAP=\"%s\">\n<BaseURL>%s</BaseURL>\n<SegmentBase indexRange=\"%s\">\n<Initialization range=\"%s\"/>\n</SegmentBase>\n</Representation>\n</AdaptationSet>", cVar.h().split("/")[0], cVar.g() + "_" + cVar.c(), cVar.a(), cVar.d(), cVar.h(), str, cVar.k(), cVar.b().replace("&", "&amp;"), cVar.j().a(), cVar.j().b());
    }

    private Map<String, String> k() {
        return l("buvid3=84B0395D-C9F2-C490-E92E-A09AB48FE26E71636infoc");
    }

    private Map<String, String> l(String str) {
        HashMap mapB = com.github.catvod.spider.merge.B.e.b("cookie", str, "User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
        mapB.put("Referer", "https://www.bilibili.com");
        return mapB;
    }

    private Intent m(com.github.catvod.spider.merge.O.b bVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setClassName("tv.danmaku.bili", "tv.danmaku.bili.ui.intent.IntentHandlerActivity");
        intent.setData(Uri.parse(bVar.k()));
        return intent;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    private String n(com.github.catvod.spider.merge.O.c cVar) {
        String str;
        if (cVar.h().startsWith("video")) {
            str = String.format(Locale.getDefault(), "height='%s' width='%s' frameRate='%s' sar='%s'", cVar.f(), cVar.l(), cVar.e(), cVar.i());
        } else {
            if (!cVar.h().startsWith("audio")) {
                return "";
            }
            str = String.format("numChannels='2' sampleRate='%s'", this.b.get(cVar.g()));
        }
        return j(cVar, str);
    }

    private File q() {
        return com.github.catvod.spider.merge.g.b.f("bilibili_user");
    }

    private void s(com.github.catvod.spider.merge.O.b bVar) {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(com.github.catvod.spider.merge.i0.m.f(240), com.github.catvod.spider.merge.i0.m.f(240));
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(C1201a.a(bVar.k(), 240, 2));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new DialogInterfaceOnCancelListenerC0784z(this, 0)).setOnDismissListener(new A(this, 0)).show();
            this.c = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            com.github.catvod.spider.merge.i0.m.w("請使用 BiliBili App 掃描二維碼");
        } catch (Exception unused) {
        }
    }

    private void t() {
        ScheduledExecutorService scheduledExecutorService = this.a;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new B(this, 0));
    }

    public final java.lang.String categoryContent(java.lang.String r20, java.lang.String r21, boolean r22, java.util.HashMap<java.lang.String, java.lang.String> r23) {
        /*
            Method dump skipped, instruction units count: 927
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.I.G.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    public final String detailContent(List<String> list) throws JSONException {
        String str;
        String str2;
        String[] strArrSplit = list.get(0).split("@");
        String str3 = strArrSplit[0];
        String str4 = strArrSplit[1];
        String str5 = "https:";
        String str6 = "//";
        String str7 = "pic";
        if (str3.startsWith("recmheji")) {
            SpiderDebug.log("RECM_HEJI start");
            com.github.catvod.spider.merge.K.VodItem iVar = new com.github.catvod.spider.merge.K.VodItem();
            iVar.n("https://ts1.cn.mm.bing.net/th/id/R-C.1aada2475d9851291fc5bef3879ea8ce?rik=9H3yELyeynR2wA&riu=http%3a%2f%2fpic.3h3.com%2fup%2f2015-12%2f2015121227270835514629.jpg&ehk=Sg1VqYsgoeYzuAnVMRjm6zYCrBGLYM8CQn5%2fwJPtbg0%3d&risl=&pid=ImgRaw&r=0");
            iVar.m("推荐合集");
            iVar.g("推荐");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONObject(com.github.catvod.spider.merge.k0.e.d("https://api.bilibili.com/x/web-interface/index/top/feed/rcmd?fresh_type=3&feed_version=SEO_VIDEO&fresh_idx_1h=1&fetch_row=1&fresh_idx=1&brush=0&homepage_ver=1&ps=20&y_num=", o())).getJSONObject("data").getJSONArray("item");
            int i = 0;
            while (i < jSONArray.length()) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray2 = jSONArray;
                String string = jSONObject.getString("pic");
                if (string.startsWith(str6)) {
                    string = C1290c.a(str5, string);
                }
                String str8 = str5;
                String string2 = jSONObject.getString("id");
                if (com.github.catvod.spider.merge.P0.e.b(string)) {
                    str2 = str6;
                } else {
                    StringBuilder sb = new StringBuilder();
                    str2 = str6;
                    sb.append(jSONObject.getString("bvid"));
                    sb.append("@");
                    sb.append(string2);
                    jSONObject2.put("vod_id", sb.toString());
                    jSONObject2.put("vod_name", com.github.catvod.spider.merge.L1.l.e(jSONObject.getString("title")).s0());
                    for (com.github.catvod.spider.merge.O.e eVar : com.github.catvod.spider.merge.O.h.b(com.github.catvod.spider.merge.f0.d.m("https://api.bilibili.com/x/web-interface/view?aid=" + string2, o(), null)).a().f()) {
                        arrayList.add(eVar.b() + "$" + string2 + "+" + eVar.a());
                    }
                }
                i++;
                jSONArray = jSONArray2;
                str5 = str8;
                str6 = str2;
            }
            linkedHashMap.put("B站", TextUtils.join("#", arrayList));
            iVar.o(TextUtils.join("$$$", linkedHashMap.keySet()));
            iVar.p(TextUtils.join("$$$", linkedHashMap.values()));
            return com.github.catvod.spider.merge.K.g.m(iVar);
        }
        String str9 = "//";
        String str10 = "aid";
        if (str3.startsWith("hotHeji")) {
            SpiderDebug.log("HOT_HEJI start");
            com.github.catvod.spider.merge.K.VodItem iVar2 = new com.github.catvod.spider.merge.K.VodItem();
            iVar2.n("https://ts1.cn.mm.bing.net/th/id/R-C.1aada2475d9851291fc5bef3879ea8ce?rik=9H3yELyeynR2wA&riu=http%3a%2f%2fpic.3h3.com%2fup%2f2015-12%2f2015121227270835514629.jpg&ehk=Sg1VqYsgoeYzuAnVMRjm6zYCrBGLYM8CQn5%2fwJPtbg0%3d&risl=&pid=ImgRaw&r=0");
            iVar2.m("热门合集");
            iVar2.g("热门");
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArray3 = new JSONObject(com.github.catvod.spider.merge.k0.e.d("https://api.bilibili.com/x/web-interface/popular?ps=20&pn=", o())).getJSONObject("data").getJSONArray("list");
            int i2 = 0;
            while (i2 < jSONArray3.length()) {
                JSONObject jSONObject3 = jSONArray3.getJSONObject(i2);
                JSONObject jSONObject4 = new JSONObject();
                String string3 = jSONObject3.getString("pic");
                JSONArray jSONArray4 = jSONArray3;
                String str11 = str9;
                if (string3.startsWith(str11)) {
                    str9 = str11;
                    string3 = C1290c.a("https:", string3);
                } else {
                    str9 = str11;
                }
                String string4 = jSONObject3.getString(str10);
                if (com.github.catvod.spider.merge.P0.e.b(string3)) {
                    str = str10;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    str = str10;
                    sb2.append(jSONObject3.getString("bvid"));
                    sb2.append("@");
                    sb2.append(string4);
                    jSONObject4.put("vod_id", sb2.toString());
                    jSONObject4.put("vod_name", com.github.catvod.spider.merge.L1.l.e(jSONObject3.getString("title")).s0());
                    for (com.github.catvod.spider.merge.O.e eVar2 : com.github.catvod.spider.merge.O.h.b(com.github.catvod.spider.merge.f0.d.m("https://api.bilibili.com/x/web-interface/view?aid=" + string4, o(), null)).a().f()) {
                        arrayList2.add(eVar2.b() + "$" + string4 + "+" + eVar2.a());
                    }
                }
                i2++;
                jSONArray3 = jSONArray4;
                str10 = str;
            }
            linkedHashMap2.put("B站", TextUtils.join("#", arrayList2));
            iVar2.o(TextUtils.join("$$$", linkedHashMap2.keySet()));
            iVar2.p(TextUtils.join("$$$", linkedHashMap2.values()));
            return com.github.catvod.spider.merge.K.g.m(iVar2);
        }
        String str12 = "aid";
        if (!str3.startsWith("rankHeji")) {
            com.github.catvod.spider.merge.O.b bVarA = com.github.catvod.spider.merge.O.h.b(com.github.catvod.spider.merge.f0.d.m(C1290c.a("https://api.bilibili.com/x/web-interface/view?aid=", str4), o(), null)).a();
            com.github.catvod.spider.merge.K.VodItem iVar3 = new com.github.catvod.spider.merge.K.VodItem();
            iVar3.l(list.get(0));
            iVar3.n(bVarA.g());
            iVar3.m(bVarA.i());
            iVar3.g(bVarA.j());
            iVar3.j(bVarA.b());
            iVar3.q((bVarA.c().longValue() / 60) + "分鐘");
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            ArrayList arrayList3 = new ArrayList();
            for (com.github.catvod.spider.merge.O.e eVar3 : bVarA.f()) {
                arrayList3.add(eVar3.b() + "$" + str4 + "+" + eVar3.a());
            }
            linkedHashMap3.put("B站", TextUtils.join("#", arrayList3));
            JSONArray jSONArrayOptJSONArray = new JSONObject(com.github.catvod.spider.merge.f0.d.m("https://api.bilibili.com/x/web-interface/archive/related?bvid=" + str3, o(), null)).optJSONArray("data");
            ArrayList arrayList4 = new ArrayList();
            for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                JSONObject jSONObject5 = jSONArrayOptJSONArray.getJSONObject(i3);
                arrayList4.add(jSONObject5.getString("title") + "$" + jSONObject5.optLong(str12) + "+" + jSONObject5.optLong("cid"));
            }
            linkedHashMap3.put("相关推荐", TextUtils.join("#", arrayList4));
            iVar3.o(TextUtils.join("$$$", linkedHashMap3.keySet()));
            iVar3.p(TextUtils.join("$$$", linkedHashMap3.values()));
            return com.github.catvod.spider.merge.K.g.m(iVar3);
        }
        SpiderDebug.log("RANK_HEJI start");
        com.github.catvod.spider.merge.K.VodItem iVar4 = new com.github.catvod.spider.merge.K.VodItem();
        iVar4.n("https://ts1.cn.mm.bing.net/th/id/R-C.1aada2475d9851291fc5bef3879ea8ce?rik=9H3yELyeynR2wA&riu=http%3a%2f%2fpic.3h3.com%2fup%2f2015-12%2f2015121227270835514629.jpg&ehk=Sg1VqYsgoeYzuAnVMRjm6zYCrBGLYM8CQn5%2fwJPtbg0%3d&risl=&pid=ImgRaw&r=0");
        iVar4.m("排行榜合集");
        iVar4.g("排行榜");
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        ArrayList arrayList5 = new ArrayList();
        JSONArray jSONArray5 = new JSONObject(com.github.catvod.spider.merge.k0.e.d("https://api.bilibili.com/x/web-interface/ranking/v2?rid=0&type=all", o())).getJSONObject("data").getJSONArray("list");
        int i4 = 0;
        while (i4 < jSONArray5.length()) {
            JSONObject jSONObject6 = jSONArray5.getJSONObject(i4);
            JSONObject jSONObject7 = new JSONObject();
            String string5 = jSONObject6.getString(str7);
            JSONArray jSONArray6 = jSONArray5;
            if (string5.startsWith(str9)) {
                string5 = C1290c.a("https:", string5);
            }
            String str13 = str7;
            String str14 = str12;
            String string6 = jSONObject6.getString(str14);
            if (com.github.catvod.spider.merge.P0.e.b(string5)) {
                str12 = str14;
            } else {
                StringBuilder sb3 = new StringBuilder();
                str12 = str14;
                sb3.append(jSONObject6.getString("bvid"));
                sb3.append("@");
                sb3.append(string6);
                jSONObject7.put("vod_id", sb3.toString());
                jSONObject7.put("vod_name", com.github.catvod.spider.merge.L1.l.e(jSONObject6.getString("title")).s0());
                for (com.github.catvod.spider.merge.O.e eVar4 : com.github.catvod.spider.merge.O.h.b(com.github.catvod.spider.merge.f0.d.m("https://api.bilibili.com/x/web-interface/view?aid=" + string6, o(), null)).a().f()) {
                    arrayList5.add(eVar4.b() + "$" + string6 + "+" + eVar4.a());
                }
            }
            i4++;
            jSONArray5 = jSONArray6;
            str7 = str13;
        }
        linkedHashMap4.put("B站", TextUtils.join("#", arrayList5));
        iVar4.o(TextUtils.join("$$$", linkedHashMap4.keySet()));
        iVar4.p(TextUtils.join("$$$", linkedHashMap4.values()));
        return com.github.catvod.spider.merge.K.g.m(iVar4);
    }

    public final void g() {
        com.github.catvod.spider.merge.O.b bVarA = com.github.catvod.spider.merge.O.h.b(com.github.catvod.spider.merge.f0.d.m("https://api.bilibili.com/x/web-interface/nav", o(), null)).a();
        bVarA.n();
        this.f = bVarA.m();
        this.g = bVarA.l();
        StringBuilder sbB = t0.b("login:");
        sbB.append(this.f);
        com.github.catvod.spider.merge.i0.m.w(sbB.toString());
        SpiderDebug.log("login:" + this.g.a());
        if (this.f) {
            return;
        }
        Init.run(new E(this, com.github.catvod.spider.merge.O.h.b(com.github.catvod.spider.merge.f0.d.l("https://passport.bilibili.com/x/passport-login/web/qrcode/generate?source=main-mini")).a(), 0));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final String getBiliMpd(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("https://api.bilibili.com/x/player/playurl?avid=");
        sb.append(str);
        sb.append("&cid=");
        sb.append(str2);
        sb.append("&qn=");
        String strB = C1290c.b(sb, str3, "&fnval=4048&fourk=1");
        SpiderDebug.log("playerContent:" + strB);
        SpiderDebug.log("getBigMember():" + o());
        com.github.catvod.spider.merge.O.a aVarA = com.github.catvod.spider.merge.O.h.b(new JSONObject(com.github.catvod.spider.merge.f0.d.m(strB, o(), null)).toString()).a().a();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for (com.github.catvod.spider.merge.O.c cVar : aVarA.a()) {
            Iterator it = this.b.keySet().iterator();
            while (it.hasNext()) {
                if (cVar.g().equals((String) it.next())) {
                    sb3.append(n(cVar));
                }
            }
        }
        h(aVarA, sb2, str3);
        if (sb2.length() == 0 && aVarA.d().size() > 0) {
            h(aVarA, sb2, aVarA.d().get(0).g());
        }
        String str4 = String.format(Locale.getDefault(), "<MPD xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"urn:mpeg:dash:schema:mpd:2011\" xsi:schemaLocation=\"urn:mpeg:dash:schema:mpd:2011 DASH-MPD.xsd\" type=\"static\" mediaPresentationDuration=\"PT%sS\" minBufferTime=\"PT%sS\" profiles=\"urn:mpeg:dash:profile:isoff-on-demand:2011\">\n<Period duration=\"PT%sS\" start=\"PT0S\">\n%s\n%s\n</Period>\n</MPD>", aVarA.b(), aVarA.c(), aVarA.b(), sb2.toString(), sb3.toString());
        com.github.catvod.spider.merge.B.h.b("mpd", str4);
        return str4;
    }

    public final String homeContent(boolean z) {
        if (this.d.has("json")) {
            return com.github.catvod.spider.merge.f0.d.l(this.d.get("json").getAsString());
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : this.d.get("type").getAsString().split("#")) {
            arrayList.add(new com.github.catvod.spider.merge.K.b(str, str));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new com.github.catvod.spider.merge.K.d("order", "排序", Arrays.asList(new com.github.catvod.spider.merge.K.c("預設", "totalrank"), new com.github.catvod.spider.merge.K.c("最多點擊", "click"), new com.github.catvod.spider.merge.K.c("最新發布", "pubdate"), new com.github.catvod.spider.merge.K.c("最多彈幕", "dm"), new com.github.catvod.spider.merge.K.c("最多收藏", "stow"))));
            arrayList2.add(new com.github.catvod.spider.merge.K.d("duration", "時長", Arrays.asList(new com.github.catvod.spider.merge.K.c("全部時長", "0"), new com.github.catvod.spider.merge.K.c("60分鐘以上", "4"), new com.github.catvod.spider.merge.K.c("30~60分鐘", "3"), new com.github.catvod.spider.merge.K.c("10~30分鐘", "2"), new com.github.catvod.spider.merge.K.c("10分鐘以下", "1"))));
            linkedHashMap.put(str, arrayList2);
        }
        return com.github.catvod.spider.merge.K.g.p(arrayList, linkedHashMap);
    }

    public final String homeVideoContent() {
        com.github.catvod.spider.merge.O.h hVarB = com.github.catvod.spider.merge.O.h.b(com.github.catvod.spider.merge.f0.d.m("https://api.bilibili.com/x/web-interface/popular?ps=20", k(), null));
        ArrayList arrayList = new ArrayList();
        Iterator<com.github.catvod.spider.merge.O.g> it = com.github.catvod.spider.merge.O.g.a(hVarB.a().d()).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        return com.github.catvod.spider.merge.K.g.n(arrayList);
    }

    public final void init(Context context, String str) {
        this.d = JsonParser.parseString(str).getAsJsonObject();
    }

    public final Map<String, String> o() {
        return com.github.catvod.spider.merge.P0.e.b(this.e) ? k() : l(this.e);
    }

    public final String p(String str) {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("mid", str);
        StringBuilder sbB = t0.b("https://api.bilibili.com/x/space/wbi/arc/search?");
        sbB.append(this.g.b(linkedHashMap));
        String strM = com.github.catvod.spider.merge.f0.d.m(sbB.toString(), o(), null);
        SpiderDebug.log(strM);
        return strM;
    }

    public final String playerContent(String str, String str2, List<String> list) {
        String[] strArrSplit = str2.split("\\+");
        String str3 = strArrSplit[0];
        String str4 = strArrSplit[1];
        StringBuilder sbB = t0.b("http://127.0.0.1:9966/api/danmu/?do=danmuku&vodName=");
        sbB.append("https://api.bilibili.com/x/v1/dm/list.so?oid=".concat(str4));
        String string = sbB.toString();
        com.github.catvod.spider.merge.K.g gVar = new com.github.catvod.spider.merge.K.g();
        gVar.w(Server.y(str3, str4, "127"));
        if (!C0773p.a.a.booleanValue()) {
            string = "";
        }
        gVar.a(string);
        gVar.b();
        gVar.g(o());
        return gVar.toString();
    }

    public final void r(JsonObject jsonObject) {
        if (jsonObject != null) {
            String strE = com.github.catvod.spider.merge.g.b.e(q());
            if (TextUtils.isEmpty(strE)) {
                String asString = jsonObject.get("cookie").getAsString();
                this.e = asString;
                if (asString.startsWith("http")) {
                    this.e = com.github.catvod.spider.merge.f0.d.l(this.e).trim();
                }
                if (TextUtils.isEmpty(this.e)) {
                    this.e = "buvid3=84B0395D-C9F2-C490-E92E-A09AB48FE26E71636infoc";
                }
            } else {
                this.e = strE;
            }
        }
        StringBuilder sbB = t0.b("BiliApi >>cookie");
        sbB.append(this.e);
        SpiderDebug.log(sbB.toString());
    }

    public final String searchContent(String str, boolean z) {
        return categoryContent(str, "1", true, new HashMap<>());
    }

    public final String searchContent(String str, boolean z, String str2) {
        return categoryContent(str, str2, true, new HashMap<>());
    }
}
