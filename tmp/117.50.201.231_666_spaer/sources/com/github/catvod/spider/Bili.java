package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.FM.c.C0323a;
import com.github.catvod.spider.merge.FM.c.C0324b;
import com.github.catvod.spider.merge.FM.c.C0325c;
import com.github.catvod.spider.merge.FM.c.C0329g;
import com.github.catvod.spider.merge.FM.c.C0332j;
import com.github.catvod.spider.merge.FM.g.C0345a;
import com.github.catvod.spider.merge.FM.g.C0346b;
import com.github.catvod.spider.merge.FM.g.C0347c;
import com.github.catvod.spider.merge.FM.g.C0349e;
import com.github.catvod.spider.merge.FM.g.C0351g;
import com.github.catvod.spider.merge.FM.g.C0352h;
import com.github.catvod.spider.merge.FM.g.C0355k;
import com.github.catvod.spider.merge.FM.m.C0378c;
import com.github.catvod.spider.merge.FM.o.C0385a;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.ByteArrayInputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Marker;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class Bili extends Spider {
    private static final String g = "buvid3=84B0395D-C9F2-C490-E92E-A09AB48FE26E71636infoc";
    private static String h;
    private JsonObject a;
    private boolean b;
    private boolean c;
    private C0355k d;

    class Loader {
        static volatile Bili a = new Bili();

        private Loader() {
        }
    }

    private static String g(C0347c c0347c, String str) {
        return String.format(Locale.getDefault(), "<AdaptationSet>\n<ContentComponent contentType=\"%s\"/>\n<Representation id=\"%s\" bandwidth=\"%s\" codecs=\"%s\" mimeType=\"%s\" %s startWithSAP=\"%s\">\n<BaseURL>%s</BaseURL>\n<SegmentBase indexRange=\"%s\">\n<Initialization range=\"%s\"/>\n</SegmentBase>\n</Representation>\n</AdaptationSet>", c0347c.h().split("/")[0], c0347c.g() + "_" + c0347c.c(), c0347c.a(), c0347c.d(), c0347c.h(), str, c0347c.k(), c0347c.b().replace("&", "&amp;"), c0347c.j().a(), c0347c.j().b());
    }

    public static Bili get() {
        return Loader.a;
    }

    private static HashMap<String, String> h() {
        HashMap<String, String> map = new HashMap<>();
        map.put("30280", "192000");
        map.put("30232", "132000");
        map.put("30216", "64000");
        return map;
    }

    private static Map<String, String> i() {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
        map.put("Referer", "https://www.bilibili.com");
        if (h != null) {
            map.put("cookie", h);
        }
        return map;
    }

    private static String j(C0347c c0347c) {
        String str;
        if (c0347c.h().startsWith("video")) {
            str = String.format(Locale.getDefault(), "height='%s' width='%s' frameRate='%s' sar='%s'", c0347c.f(), c0347c.l(), c0347c.e(), c0347c.i());
        } else {
            if (!c0347c.h().startsWith("audio")) {
                return "";
            }
            str = String.format("numChannels='2' sampleRate='%s'", h().get(c0347c.g()));
        }
        return g(c0347c, str);
    }

    static Map<String, String> j() {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
        map.put("Referer", "https://www.bilibili.com");
        map.put("cookie", "buvid3=84B0395D-C9F2-C490-E92E-A09AB48FE26E71636infoc");
        return map;
    }

    public static Object[] proxy(Map<String, String> map) {
        String str = map.get("aid");
        String str2 = map.get("cid");
        Map<String, String> mapI = i();
        List listAsList = Arrays.asList("referer", "icy-metadata", "range", "connection", "accept-encoding", "user-agent", "cookie", "range");
        for (String str3 : map.keySet()) {
            if (listAsList.contains(str3)) {
                ((HashMap) mapI).put(str3, map.get(str3));
            }
        }
        String str4 = map.get("qn");
        C0345a c0345aD = C0352h.b(C0378c.n("https://api.bilibili.com/x/player/playurl?avid=" + str + "&cid=" + str2 + "&qn=" + str4 + "&fnval=4048&fourk=1", i())).a().d();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (C0347c c0347c : c0345aD.a()) {
            Iterator<String> it = h().keySet().iterator();
            while (it.hasNext()) {
                if (c0347c.g().equals(it.next())) {
                    sb2.append(j(c0347c));
                }
            }
        }
        for (C0347c c0347c2 : c0345aD.d()) {
            if (c0347c2.g().equals(str4)) {
                sb.append(j(c0347c2));
            }
        }
        return new Object[]{200, "application/dash+xml", new ByteArrayInputStream(String.format(Locale.getDefault(), "<MPD xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"urn:mpeg:dash:schema:mpd:2011\" xsi:schemaLocation=\"urn:mpeg:dash:schema:mpd:2011 DASH-MPD.xsd\" type=\"static\" mediaPresentationDuration=\"PT%sS\" minBufferTime=\"PT%sS\" profiles=\"urn:mpeg:dash:profile:isoff-on-demand:2011\">\n<Period duration=\"PT%sS\" start=\"PT0S\">\n%s\n%s\n</Period>\n</MPD>", c0345aD.b(), c0345aD.c(), c0345aD.b(), sb.toString(), sb2.toString()).getBytes())};
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        if (str.endsWith("/{pg}")) {
            LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put("mid", str.split("/")[0]);
            linkedHashMap.put("pn", str2);
            ArrayList arrayList = new ArrayList();
            Iterator<C0351g> it = C0351g.a(C0352h.b(C0378c.n("https://api.bilibili.com/x/space/wbi/arc/search?" + this.d.a(linkedHashMap), j())).a().g().getAsJsonObject().get("vlist")).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().c());
            }
            return C0329g.q(arrayList);
        }
        String str3 = map.containsKey("order") ? map.get("order") : "totalrank";
        String str4 = map.containsKey("duration") ? map.get("duration") : "0";
        if (map.containsKey("tid")) {
            str = str + " " + map.get("tid");
        }
        C0352h c0352hB = C0352h.b(C0378c.n("https://api.bilibili.com/x/web-interface/search/type?search_type=video&keyword=" + URLEncoder.encode(str) + "&order=" + str3 + "&duration=" + str4 + "&page=" + str2, j()));
        ArrayList arrayList2 = new ArrayList();
        Iterator<C0351g> it2 = C0351g.a(c0352hB.a().l()).iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().c());
        }
        return C0329g.q(arrayList2);
    }

    public String detailContent(List<String> list) {
        if (!this.b) {
            h = TextUtils.isEmpty(h) ? C0385a.i(C0385a.l("/bili_cookie.txt")) : h;
            C0346b c0346bA = C0352h.b(C0378c.n("https://api.bilibili.com/x/web-interface/nav", i())).a();
            this.b = c0346bA.q();
            this.c = c0346bA.r();
            this.d = c0346bA.p();
        }
        SpiderDebug.log("Bili detailContent id: " + list.get(0));
        String[] strArrSplit = list.get(0).split("@");
        String str = strArrSplit[0];
        String str2 = strArrSplit[1];
        C0346b c0346bA2 = C0352h.b(C0378c.n("https://api.bilibili.com/x/web-interface/view?aid=" + str2, i())).a();
        C0332j c0332j = new C0332j();
        c0332j.g(list.get(0));
        c0332j.i(c0346bA2.j());
        c0332j.h(c0346bA2.m());
        c0332j.b(c0346bA2.n());
        c0332j.e(c0346bA2.e());
        c0332j.f(c0346bA2.h().a());
        c0332j.l((c0346bA2.f().longValue() / 60) + "分鐘");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C0346b c0346bA3 = C0352h.b(C0378c.n("https://api.bilibili.com/x/player/playurl?avid=" + str2 + "&cid=" + c0346bA2.c() + "&qn=127&fnval=4048&fourk=1", i())).a();
        for (int i = 0; i < c0346bA3.b().size(); i++) {
            int iIntValue = c0346bA3.b().get(i).intValue();
            if ((this.b || iIntValue <= 32) && (this.c || iIntValue <= 80)) {
                arrayList2.add(c0346bA3.b().get(i));
                arrayList.add(c0346bA3.a().get(i));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C0349e c0349e : c0346bA2.i()) {
            arrayList3.add(c0349e.b() + "$" + str2 + Marker.ANY_NON_NULL_MARKER + c0349e.a() + Marker.ANY_NON_NULL_MARKER + TextUtils.join(":", arrayList2) + Marker.ANY_NON_NULL_MARKER + TextUtils.join(":", arrayList));
        }
        linkedHashMap.put("B站", TextUtils.join("#", arrayList3));
        c0332j.j(TextUtils.join("$$$", linkedHashMap.keySet()));
        c0332j.k(TextUtils.join("$$$", linkedHashMap.values()));
        return C0329g.p(c0332j);
    }

    public String homeContent(boolean z) {
        if (this.a.has("json")) {
            return C0378c.n(this.a.get("json").getAsString(), null);
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : this.a.get("type").getAsString().split("#")) {
            arrayList.add(new C0323a(str, str));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new C0325c("order", "排序", Arrays.asList(new C0324b("預設", "totalrank"), new C0324b("最多點擊", "click"), new C0324b("最新發布", "pubdate"), new C0324b("最多彈幕", "dm"), new C0324b("最多收藏", "stow"))));
            arrayList2.add(new C0325c("duration", "時長", Arrays.asList(new C0324b("全部時長", "0"), new C0324b("60分鐘以上", "4"), new C0324b("30~60分鐘", "3"), new C0324b("10~30分鐘", "2"), new C0324b("10分鐘以下", "1"))));
            linkedHashMap.put(str, arrayList2);
        }
        return C0329g.r(arrayList, linkedHashMap);
    }

    public String homeVideoContent() {
        C0352h c0352hB = C0352h.b(C0378c.n("https://api.bilibili.com/x/web-interface/popular?ps=20", j()));
        ArrayList arrayList = new ArrayList();
        Iterator<C0351g> it = C0351g.a(c0352hB.a().g()).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        return C0329g.q(arrayList);
    }

    public void init(Context context, String str) {
        JsonObject jsonObject;
        JsonElement string;
        try {
            try {
                string = JsonParser.parseString(str);
            } catch (Throwable unused) {
                string = new JsonParser().parse(str);
            }
            jsonObject = string.getAsJsonObject();
            if (jsonObject == null) {
                jsonObject = new JsonObject();
            }
        } catch (Throwable unused2) {
            jsonObject = new JsonObject();
        }
        this.a = jsonObject;
        String asString = jsonObject.has("cookie") ? jsonObject.get("cookie").getAsString() : "";
        h = asString;
        if (asString.startsWith("http")) {
            String strN = C0378c.n(h, null);
            try {
                strN = JsonParser.parseString(strN).getAsJsonObject().get("cookie").getAsString();
            } catch (Throwable th) {
            }
            h = strN.trim();
        }
        if (TextUtils.isEmpty(h)) {
            String strI = C0385a.i(C0385a.l("/bili_cookie.txt"));
            try {
                strI = JsonParser.parseString(strI).getAsJsonObject().get("cookie").getAsString();
            } catch (Throwable th2) {
            }
            h = strI;
        }
        if (TextUtils.isEmpty(h)) {
            h = g;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String[] strArrSplit = str2.split("\\+");
        String str3 = strArrSplit[0];
        String str4 = strArrSplit[1];
        String[] strArrSplit2 = strArrSplit[3].split(":");
        String[] strArrSplit3 = strArrSplit[2].split(":");
        ArrayList arrayList = new ArrayList();
        String strConcat = "https://api.bilibili.com/x/v1/dm/list.so?oid=".concat(str4);
        for (int i = 0; i < strArrSplit2.length; i++) {
            arrayList.add(strArrSplit2[i]);
            arrayList.add(Proxy.getUrl() + "?do=bili&aid=" + str3 + "&cid=" + str4 + "&qn=" + strArrSplit3[i] + "&type=mpd");
        }
        C0329g c0329g = new C0329g();
        c0329g.y(arrayList);
        c0329g.a(strConcat);
        c0329g.b();
        c0329g.f(i());
        return c0329g.toString();
    }

    public String searchContent(String str, boolean z) {
        return categoryContent(str, "1", true, new HashMap<>());
    }

    public String searchContent(String str, boolean z, String str2) {
        return categoryContent(str, str2, true, new HashMap<>());
    }
}
