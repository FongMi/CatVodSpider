package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.b.C0544h;
import com.github.catvod.spider.merge.c.C0550a;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.k.C0575b;
import com.github.catvod.spider.merge.m.C0590I;
import com.google.gson.JsonObject;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class AppSy extends Spider {
    private String a;
    private String b;
    private String c;
    private String d;
    private Map<String, String> e;
    private String f;
    private String g = "";
    private String h = "";

    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    private void a() {
        try {
            JSONObject jSONObject = new JSONObject(C0529a.a(C0575b.l(this.a + "/shark/api.php?action=configs", e()), this.c));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("config");
            this.g = jSONObjectOptJSONObject.optString("versionName");
            this.f = jSONObjectOptJSONObject.optString("hulue").split("&")[0];
            this.h = jSONObjectOptJSONObject.optString("ua");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("playerinfos");
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                String strOptString = jSONObjectOptJSONObject2.optString("playerjiekou");
                if (!TextUtils.isEmpty(strOptString)) {
                    String strOptString2 = jSONObjectOptJSONObject2.optString("playername");
                    String strA = C0529a.a(strOptString, this.f);
                    if (!TextUtils.isEmpty(strA)) {
                        this.e.put(strOptString2, strA);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String b(String str) {
        if (!str.startsWith("http")) {
            str = C0544h.b(new StringBuilder(), this.a, str);
        }
        return C0529a.a(C0575b.l(str, e()), this.c);
    }

    private String c(String str, String str2) {
        Map<String, String> mapE = e();
        ((HashMap) mapE).put("Content-Type", "application/json; charset=utf-8");
        return C0529a.a(C0575b.f(this.a + str, str2, mapE).a(), this.c);
    }

    private String d(String str, Map<String, String> map, String str2) {
        Map<String, String> mapE = e();
        ((HashMap) mapE).put("Content-Type", "application/json; charset=utf-8");
        return C0529a.a(C0575b.g(str, map, mapE).a(), str2);
    }

    private Map<String, String> e() {
        String strA = C0590I.a(this.h);
        HashMap map = new HashMap();
        map.put("User-Agent", String.format("Dalvik/1.0.0 (Linux; U; Android 10; google Build/Pixel 3)", this.g));
        map.put("ua", strA);
        map.put("version", this.g);
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        JsonObject jsonObject;
        ArrayList arrayList = new ArrayList();
        try {
            jsonObject = new JsonObject();
            jsonObject.addProperty("area", "");
            jsonObject.addProperty("rank", "按上新");
            jsonObject.addProperty("type", "");
            jsonObject.addProperty("year", "");
            jsonObject.addProperty("type_id", str);
        } catch (Exception e) {
            e = e;
        }
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(c("/api.php/v1.classify/content?page=" + str2, jsonObject.toString())).optJSONObject("data").optJSONArray("video_list");
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                arrayList.add(new C0554e(jSONObjectOptJSONObject.optString("vod_id"), jSONObjectOptJSONObject.optString("vod_name"), jSONObjectOptJSONObject.optString("vod_pic"), jSONObjectOptJSONObject.optString("vod_remarks") + "|" + jSONObjectOptJSONObject.optString("vod_score")));
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
        }
        return C0552c.n(arrayList);
    }

    public String detailContent(List<String> list) {
        C0554e c0554e = new C0554e();
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(b("/api.php/v1.player/details?vod_id=" + list.get(0))).optJSONObject("data").optJSONObject("detail");
            SpiderDebug.log(jSONObjectOptJSONObject.toString());
            c0554e.j(list.get(0));
            c0554e.k(jSONObjectOptJSONObject.optString("vod_name"));
            c0554e.l(jSONObjectOptJSONObject.optString("vod_pic"));
            c0554e.o(jSONObjectOptJSONObject.optString("vod_remarks"));
            c0554e.h(jSONObjectOptJSONObject.optString("vod_content"));
            c0554e.f(jSONObjectOptJSONObject.optString("vod_actor"));
            c0554e.i(jSONObjectOptJSONObject.optString("vod_director"));
            c0554e.e(jSONObjectOptJSONObject.optString("vod_class"));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("play_url_list");
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                String strOptString = jSONObjectOptJSONObject2.optString("from");
                String strReplaceAll = jSONObjectOptJSONObject2.optString("show").replaceAll("\\(.*?\\)|（.*?）", "");
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("urls");
                ArrayList arrayList3 = new ArrayList();
                for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                    JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i2);
                    arrayList3.add(jSONObjectOptJSONObject3.optString("name") + "$" + strOptString + "|" + jSONObjectOptJSONObject3.optString("url") + "|" + jSONObjectOptJSONObject3.optString("name") + "|" + jSONObjectOptJSONObject.optString("vod_name"));
                }
                arrayList2.add(strReplaceAll);
                arrayList.add(TextUtils.join("#", arrayList3));
            }
            c0554e.m(TextUtils.join("$$$", arrayList2));
            c0554e.n(TextUtils.join("$$$", arrayList));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return C0552c.m(c0554e);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(b("/api.php/v1.home/types")).optJSONObject("data").optJSONArray("types");
            for (int i = 1; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                arrayList.add(new C0550a(jSONObjectOptJSONObject.optString("type_id"), jSONObjectOptJSONObject.optString("type_name")));
            }
            String strOptString = "";
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                strOptString = jSONArrayOptJSONArray.optJSONObject(i2).optString("type_id");
                if (!strOptString.isEmpty()) {
                    break;
                }
            }
            JSONArray jSONArrayOptJSONArray2 = new JSONObject(b("/api.php/v1.home/data?type_id=" + strOptString)).optJSONObject("data").optJSONArray("banners");
            for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i3);
                arrayList2.add(new C0554e(jSONObjectOptJSONObject2.optString("vod_id"), jSONObjectOptJSONObject2.optString("vod_name"), jSONObjectOptJSONObject2.optString("vod_pic"), jSONObjectOptJSONObject2.optString("vod_remarks") + "|" + jSONObjectOptJSONObject2.optString("vod_score")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return C0552c.p(arrayList, arrayList2);
    }

    public void init(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            this.b = jSONObject.optString("siteKey");
            this.c = jSONObject.optString("listKey");
            this.d = jSONObject.optString("parsesKey");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = jSONObject.optString("site");
                if (!TextUtils.isEmpty(strOptString)) {
                    HashMap map = new HashMap();
                    map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
                    map.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
                    strOptString = new JSONArray(C0529a.a(C0575b.l(strOptString, map), this.b)).getString(0);
                }
            }
            this.a = strOptString;
            this.e = new HashMap();
            a();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public String playerContent(String str, String str2, List<String> list) {
        String strD;
        try {
            String[] strArrSplit = str2.split("\\|");
            String str3 = strArrSplit[0];
            String str4 = strArrSplit[1];
            String str5 = strArrSplit[2];
            String str6 = Proxy.getUrl() + "?do=appdanmu&vodName=" + strArrSplit[3] + "&vodIndex=" + str5 + "&vodUrl=";
            if (C0529a.m82a(str4)) {
                C0552c c0552c = new C0552c();
                c0552c.u(str4);
                c0552c.a(str6);
                return c0552c.toString();
            }
            String str7 = (String) this.e.get(str3);
            if (TextUtils.isEmpty(str7)) {
                return C0552c.l("解析失败");
            }
            if (str7.startsWith("http")) {
                strD = C0575b.l(str7 + str4, null);
            } else {
                String str8 = this.a + "/shark/api.php?action=parsevod";
                HashMap map = new HashMap();
                map.put("parse", str7);
                map.put("url", str4);
                map.put("matching", "");
                strD = d(str8, map, this.d);
            }
            String strOptString = new JSONObject(strD).optString("url");
            if (TextUtils.isEmpty(strOptString)) {
                return C0552c.l("获取视频失败");
            }
            Map<String, String> mapE = e();
            ((HashMap) mapE).remove("Content-Type");
            C0552c c0552c2 = new C0552c();
            c0552c2.u(strOptString);
            c0552c2.a(str6);
            c0552c2.e(mapE);
            return c0552c2.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
        } catch (Exception e) {
            e = e;
        }
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(b("/api.php/v1.search/data?wd=" + URLEncoder.encode(str) + "&type_id=0&page=1")).optJSONObject("data").optJSONArray("search_data");
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                arrayList.add(new C0554e(jSONObjectOptJSONObject.optString("vod_id"), jSONObjectOptJSONObject.optString("vod_name"), jSONObjectOptJSONObject.optString("vod_pic"), jSONObjectOptJSONObject.optString("vod_remarks") + "|" + jSONObjectOptJSONObject.optString("vod_score")));
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
        }
        return C0552c.n(arrayList);
    }
}
