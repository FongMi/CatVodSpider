package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.a.C0531c;
import com.github.catvod.spider.merge.b.C0544h;
import com.github.catvod.spider.merge.b.C0547k;
import com.github.catvod.spider.merge.b.v;
import com.github.catvod.spider.merge.c.C0550a;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.f.C0562a;
import com.github.catvod.spider.merge.f.C0563b;
import com.github.catvod.spider.merge.k.C0575b;
import com.github.catvod.spider.merge.m.C0602k;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class BiliYS extends Spider {
    private static String a;
    private static HashMap b;
    private static final String g = "buvid3=84B0395D-C9F2-C490-E92E-A09AB48FE26E71636infoc";

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private JsonObject f5a;
    private boolean c;
    private boolean d;

    private static Map<String, String> e() {
        HashMap mapB = v.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/143.0.0.0 Safari/537.36 Edg/143.0.0.0");
        String strReplace = a.replace(",", "%2C");
        if (strReplace != null) {
            mapB.put("cookie", strReplace);
        }
        mapB.put("Referer", "https://www.bilibili.com");
        return mapB;
    }

    private static String g(com.github.catvod.spider.merge.f.c cVar) {
        String str;
        if (cVar.h().startsWith("video")) {
            str = String.format(Locale.getDefault(), "height='%s' width='%s' frameRate='%s' sar='%s'", cVar.f(), cVar.l(), cVar.e(), cVar.i());
        } else {
            if (!cVar.h().startsWith("audio")) {
                return "";
            }
            str = String.format("numChannels='2' sampleRate='%s'", h().get(cVar.g()));
        }
        return h(cVar, str);
    }

    private static String h(com.github.catvod.spider.merge.f.c cVar, String str) {
        return String.format(Locale.getDefault(), "<AdaptationSet>\n<ContentComponent contentType=\"%s\"/>\n<Representation id=\"%s\" bandwidth=\"%s\" codecs=\"%s\" mimeType=\"%s\" %s startWithSAP=\"%s\">\n<BaseURL>%s</BaseURL>\n<SegmentBase indexRange=\"%s\">\n<Initialization range=\"%s\"/>\n</SegmentBase>\n</Representation>\n</AdaptationSet>", cVar.h().split("/")[0], cVar.g() + "_" + cVar.c(), cVar.a(), cVar.d(), cVar.h(), str, cVar.k(), cVar.b().replace("&", "&amp;"), cVar.j().a(), cVar.j().b());
    }

    private static HashMap<String, String> h() {
        HashMap<String, String> map = new HashMap<>();
        map.put("30280", "192000");
        map.put("30232", "132000");
        map.put("30216", "64000");
        return map;
    }

    public static Object[] proxy(Map<String, String> map) {
        String str = map.get("aid");
        String str2 = map.get("cid");
        String str3 = map.get("qn");
        C0562a c0562aE = com.github.catvod.spider.merge.f.e.b(C0575b.l(C0544h.b(C0547k.a("https://api.bilibili.com/pgc/player/web/playurl?avid=", str, "&cid=", str2, "&qn="), str3, "&fnval=4048&fourk=1"), e())).b().e();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (com.github.catvod.spider.merge.f.c cVar : c0562aE.a()) {
            Iterator<String> it = h().keySet().iterator();
            while (it.hasNext()) {
                if (cVar.g().equals(it.next())) {
                    sb2.append(g(cVar));
                }
            }
        }
        for (com.github.catvod.spider.merge.f.c cVar2 : c0562aE.d()) {
            if (cVar2.g().equals(str3)) {
                sb.append(g(cVar2));
            }
        }
        return new Object[]{200, "application/dash+xml", new ByteArrayInputStream(String.format(Locale.getDefault(), "<MPD xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"urn:mpeg:dash:schema:mpd:2011\" xsi:schemaLocation=\"urn:mpeg:dash:schema:mpd:2011 DASH-MPD.xsd\" type=\"static\" mediaPresentationDuration=\"PT%sS\" minBufferTime=\"PT%sS\" profiles=\"urn:mpeg:dash:profile:isoff-on-demand:2011\">\n<Period duration=\"PT%sS\" start=\"PT0S\">\n%s\n%s\n</Period>\n</MPD>", c0562aE.b(), c0562aE.c(), c0562aE.b(), sb.toString(), sb2.toString()).getBytes())};
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException {
        HashMap map2 = new HashMap();
        if (map != null && map.size() > 0) {
            map2.putAll(map);
        }
        if (map2.get("cateId") != null) {
            str = (String) map2.get("cateId");
        }
        String strL = C0575b.l(String.format("https://api.bilibili.com/pgc/season/index/result?order=2&sort=0&pagesize=20&type=1&st=%s&season_type=%s&page=%s", str, str, str2), e());
        int i = Integer.parseInt(str2);
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayB = com.github.catvod.spider.merge.A.a.b(strL, "data", "list");
        int iC = 0;
        while (iC < jSONArrayB.length()) {
            JSONObject jSONObject = jSONArrayB.getJSONObject(iC);
            iC = C0547k.c(jSONObject.getString("season_id"), jSONObject.getString("title"), jSONObject.getString("cover"), jSONObject.getString("index_show"), arrayList, iC, 1);
        }
        return com.github.catvod.spider.merge.A.a.d(arrayList, i, arrayList.size() < 20 ? i : i + 1, 20, 0);
    }

    public String detailContent(List<String> list) throws JSONException {
        if (!this.d) {
            C0563b c0563bA = com.github.catvod.spider.merge.f.e.b(C0575b.l("https://api.bilibili.com/x/web-interface/nav", e())).a();
            this.d = c0563bA.m97k();
            this.c = c0563bA.s();
        }
        String str = list.get(0);
        JSONObject jSONObjectM8c = com.github.catvod.spider.merge.A.a.m8c(C0575b.l(C0531c.a("https://api.bilibili.com/pgc/view/web/season?season_id=", str), e()), "result");
        C0554e c0554eB = com.github.catvod.spider.merge.A.a.b(str);
        c0554eB.k(jSONObjectM8c.getString("title"));
        c0554eB.l(jSONObjectM8c.getString("cover"));
        c0554eB.h(jSONObjectM8c.getString("evaluate"));
        c0554eB.i("");
        c0554eB.f(jSONObjectM8c.getString("actors"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = jSONObjectM8c.getJSONArray("episodes");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getJSONObject(i).getString("share_copy") + "$" + jSONArray.getJSONObject(i).getString("aid") + Marker.ANY_NON_NULL_MARKER + jSONArray.getJSONObject(i).getString("cid"));
        }
        if (arrayList.size() > 0) {
            linkedHashMap.put("哔哩影视", TextUtils.join("#", arrayList));
        }
        if (linkedHashMap.size() > 0) {
            com.github.catvod.spider.merge.A.a.b(linkedHashMap, "$$$", c0554eB, "$$$");
        }
        return C0554e.e(c0554eB);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("1", "4", "2", "7", "5");
        List listAsList2 = Arrays.asList("番剧", "国创", "电影", "综艺", "电视剧");
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new C0550a((String) listAsList.get(i), (String) listAsList2.get(i), null));
        }
        return com.github.catvod.spider.merge.A.a.a("{}", arrayList);
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
        this.f5a = jsonObject;
        String asString = jsonObject.has("cookie") ? jsonObject.get("cookie").getAsString() : "";
        a = asString;
        if (asString.startsWith("http")) {
            String strL = C0575b.l(a, null);
            try {
                strL = JsonParser.parseString(strL).getAsJsonObject().get("cookie").getAsString();
            } catch (Throwable th) {
            }
            a = strL.trim();
        }
        if (TextUtils.isEmpty(a)) {
            String strA = C0602k.a(C0602k.b("/bili_cookie.txt"));
            try {
                strA = JsonParser.parseString(strA).getAsJsonObject().get("cookie").getAsString();
            } catch (Throwable th2) {
            }
            a = strA;
        }
        if (TextUtils.isEmpty(a)) {
            a = g;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String[] strArrSplit = str2.split("\\+");
        String str3 = strArrSplit[0];
        String str4 = strArrSplit[1];
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C0563b c0563bB = com.github.catvod.spider.merge.f.e.b(C0575b.l(C0544h.a("https://api.bilibili.com/pgc/player/web/playurl?avid=", str3, "&cid=", str4, "&qn=127&fnval=4048&fourk=1"), e())).b();
        for (int i = 0; i < c0563bB.b().size(); i++) {
            int iIntValue = c0563bB.b().get(i).intValue();
            if ((this.d || iIntValue <= 32) && (this.c || iIntValue <= 80)) {
                arrayList2.add(c0563bB.b().get(i));
                arrayList.add(c0563bB.a().get(i));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        String strConcat = "https://api.bilibili.com/x/v1/dm/list.so?oid=".concat(str4);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList3.add((String) arrayList.get(i2));
            arrayList3.add(Proxy.getUrl() + "?do=biliys&aid=" + str3 + "&cid=" + str4 + "&qn=" + arrayList2.get(i2) + "&type=mpd");
        }
        C0552c c0552c = new C0552c();
        c0552c.v(arrayList3);
        c0552c.a(strConcat);
        c0552c.b();
        c0552c.e(e());
        return c0552c.toString();
    }

    public String searchContent(String str, String str2) throws JSONException {
        f();
        ArrayList arrayList = new ArrayList();
        StringBuilder sbA = C0529a.a("https://api.bilibili.com/x/web-interface/search/type?search_type=media_ft&keyword=");
        sbA.append(URLEncoder.encode(str));
        sbA.append("&page=");
        sbA.append(str2);
        JSONObject jSONObject = new JSONObject(C0575b.l(sbA.toString(), e()));
        String str3 = "index_show";
        String str4 = "cover";
        String str5 = "season_id";
        if (jSONObject.getJSONObject("data").has("result")) {
            JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("result");
            int iC = 0;
            while (iC < jSONArray.length()) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(iC);
                String string = jSONObject2.getString(str5);
                String string2 = jSONObject2.getString(str4);
                int i = iC;
                JSONArray jSONArray2 = jSONArray;
                iC = C0547k.c(string, jSONObject2.getString("title").replaceAll("<[^>]*>", ""), string2, jSONObject2.getString(str3), arrayList, i, 1);
                str5 = str5;
                str4 = str4;
                str3 = str3;
                jSONArray = jSONArray2;
                arrayList = arrayList;
            }
        }
        ArrayList arrayList2 = arrayList;
        String str6 = str3;
        String str7 = str5;
        String str8 = str4;
        StringBuilder sbA2 = C0529a.a("https://api.bilibili.com/x/web-interface/search/type?search_type=media_bangumi&keyword=");
        sbA2.append(URLEncoder.encode(str));
        sbA2.append("&page=");
        sbA2.append(str2);
        JSONObject jSONObject3 = new JSONObject(C0575b.l(sbA2.toString(), e()));
        if (jSONObject3.getJSONObject("data").has("result")) {
            JSONArray jSONArray3 = jSONObject3.getJSONObject("data").getJSONArray("result");
            int iC2 = 0;
            while (iC2 < jSONArray3.length()) {
                JSONObject jSONObject4 = jSONArray3.getJSONObject(iC2);
                iC2 = C0547k.c(jSONObject4.getString(str7), jSONObject4.getString("title").replaceAll("<[^>]*>", ""), jSONObject4.getString(str8), jSONObject4.getString(str6), arrayList2, iC2, 1);
            }
        }
        return C0552c.n(arrayList2);
    }

    public String searchContent(String str, boolean z) {
        return searchContent(str, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        return searchContent(str, str2);
    }
}
