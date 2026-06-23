package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.k.C0575b;
import com.github.catvod.spider.merge.m.C0590I;
import com.github.catvod.spider.merge.m.C0592a;
import com.google.gson.JsonObject;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class Gz360 extends Spider {
    private static final String a = "97630f5f85d9f3c639fb7790ca881ef2.4cccf48dc340fe8bded39cfe4ef9ac2adb27425a9069e6cd121210fc7ba518ea8c1cc5629261e94bb6ccb66d8548449c72076c956a2fb46c253008909a6c66347eb458fe3c06d1fcc993ca03a298328f9229f1994a608250c7d1ae124c4520e6e14ce8bf9f4404119a6bbf53cf592a8df2e9145de92ec43ec87cf4bdc563f6e919fe32861b0e93b118ec37d8035fbb3c.473433979755ccd5ec1b4581ccef76e8209b9e0c6ff819917f12dffad47d0d5e";
    private static final String b = "https://api.w32z7vtd.com";
    private static final Map<String, String> c = new HashMap();

    private String a(String str, String str2) {
        try {
            HashMap map = new HashMap();
            map.put("Version", "2406025");
            map.put("PackageName", "com.j64f4b21072.ha69699879.dfea0a9826ba.ibf50c9b1d");
            map.put("Ver", "1.9.2");
            String str3 = b;
            map.put("Referer", str3);
            map.put("Content-Type", "application/x-www-form-urlencoded");
            map.put("User-Agent", "okhttp/3.12.0");
            String str4 = (System.currentTimeMillis() / 1000) + "";
            String strE = C0592a.e(str2, "U823n8pKnAAbWOST".getBytes(), "wgr8N6BCs7426wf1".getBytes());
            String upperCase = C0590I.a("token_id=,token=97630f5f85d9f3c639fb7790ca881ef2.4cccf48dc340fe8bded39cfe4ef9ac2adb27425a9069e6cd121210fc7ba518ea8c1cc5629261e94bb6ccb66d8548449c72076c956a2fb46c253008909a6c66347eb458fe3c06d1fcc993ca03a298328f9229f1994a608250c7d1ae124c4520e6e14ce8bf9f4404119a6bbf53cf592a8df2e9145de92ec43ec87cf4bdc563f6e919fe32861b0e93b118ec37d8035fbb3c.473433979755ccd5ec1b4581ccef76e8209b9e0c6ff819917f12dffad47d0d5e,phone_type=1,request_key=" + strE + ",app_id=1,time=" + str4 + ",keys=bMTqITVqBsbq9UjLufsQuBvRiIyfqHLqAWUx0gj0ZUe9DMNDTmJDVZzAh45AZ5LtkC39Y0DU4Ufqm/9gliIJaj7cI/dhmoM5fib5HcslzyGONEwZY5fHBvokBreGaT8bPoaxmnWdTRjRfJzYZV6T06O7GsYVa6DuKTVArb0g48Q=*&zvdvdvddbfikkkumtmdwqppp?|4Y!s!2br").toUpperCase();
            URLEncoder.encode("bMTqITVqBsbq9UjLufsQuBvRiIyfqHLqAWUx0gj0ZUe9DMNDTmJDVZzAh45AZ5LtkC39Y0DU4Ufqm/9gliIJaj7cI/dhmoM5fib5HcslzyGONEwZY5fHBvokBreGaT8bPoaxmnWdTRjRfJzYZV6T06O7GsYVa6DuKTVArb0g48Q=");
            HashMap map2 = new HashMap();
            map2.put("token", a);
            map2.put("token_id", "");
            map2.put("phone_type", "1");
            map2.put("time", str4);
            map2.put("phone_model", "xiaomi-2206123sc");
            map2.put("keys", "bMTqITVqBsbq9UjLufsQuBvRiIyfqHLqAWUx0gj0ZUe9DMNDTmJDVZzAh45AZ5LtkC39Y0DU4Ufqm/9gliIJaj7cI/dhmoM5fib5HcslzyGONEwZY5fHBvokBreGaT8bPoaxmnWdTRjRfJzYZV6T06O7GsYVa6DuKTVArb0g48Q=");
            map2.put("request_key", strE);
            map2.put("signature", upperCase);
            map2.put("app_id", "1");
            map2.put("ad_version", "1");
            String strA = C0575b.g(str3 + str, map2, map).a();
            SpiderDebug.log("result:" + strA);
            JSONObject jSONObjectOptJSONObject = new JSONObject(strA).optJSONObject("data");
            SpiderDebug.log(jSONObjectOptJSONObject.toString());
            JSONObject jSONObject = new JSONObject(com.github.catvod.spider.merge.A.a.c(jSONObjectOptJSONObject.optString("keys"), "RSA/None/PKCS1Padding"));
            SpiderDebug.log(jSONObject.toString());
            return com.github.catvod.spider.merge.A.a.a(jSONObjectOptJSONObject.optString("response_key"), jSONObject.optString("key"), jSONObject.optString("iv"));
        } catch (Exception e) {
            SpiderDebug.log(e.toString());
            e.printStackTrace();
            return "";
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("tid", str);
        jsonObject.addProperty("page", str2);
        jsonObject.addProperty("sort", (map == null || !map.containsKey("sort")) ? "d_id" : map.get("sort"));
        jsonObject.addProperty("area", (map == null || !map.containsKey("area")) ? "0" : map.get("area"));
        jsonObject.addProperty("sub", (String) ((map == null || !map.containsKey("sub")) ? c.get(str) : map.get("sub")));
        jsonObject.addProperty("year", (map == null || !map.containsKey("year")) ? "0" : map.get("year"));
        jsonObject.addProperty("pageSize", "30");
        String strA = a("/App/IndexList/indexList", jsonObject.toString());
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = new JSONObject(strA).optJSONArray("list");
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            arrayList.add(new C0554e(jSONObjectOptJSONObject.optString("vod_id"), jSONObjectOptJSONObject.optString("vod_name"), jSONObjectOptJSONObject.optString("vod_pic"), jSONObjectOptJSONObject.optString("vod_scroe")));
        }
        C0552c c0552c = new C0552c();
        c0552c.i(Integer.valueOf(str2).intValue(), 0, 0, 0);
        c0552c.w(arrayList);
        return c0552c.toString();
    }

    public String detailContent(List<String> list) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("token_id", "1009464");
        jsonObject.addProperty("vod_id", list.get(0));
        jsonObject.addProperty("mobile_time", (System.currentTimeMillis() / 1000) + "");
        jsonObject.addProperty("token", a);
        String strA = a("/App/IndexPlay/playInfo", jsonObject.toString());
        C0554e c0554e = new C0554e();
        JSONObject jSONObjectOptJSONObject = new JSONObject(strA).optJSONObject("vodInfo");
        c0554e.j(list.get(0));
        c0554e.k(jSONObjectOptJSONObject.optString("vod_name"));
        c0554e.l(jSONObjectOptJSONObject.optString("vod_pic"));
        c0554e.h(jSONObjectOptJSONObject.optString("vod_use_content"));
        c0554e.f(jSONObjectOptJSONObject.optString("vod_actor"));
        c0554e.i(jSONObjectOptJSONObject.optString("vod_director"));
        c0554e.g(jSONObjectOptJSONObject.optString("vod_area"));
        c0554e.q(jSONObjectOptJSONObject.optString("vod_year"));
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("vurl_cloud_id", "2");
        jsonObject2.addProperty("vod_d_id", list.get(0));
        String strA2 = a("/App/Resource/Vurl/show", jsonObject2.toString());
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray = new JSONObject(strA2).optJSONArray("list");
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= jSONArrayOptJSONArray.length()) {
                break;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("play");
            Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!"2".equals(jSONObjectOptJSONObject3.optJSONObject(next).optString("show_type"))) {
                    List arrayList3 = map.containsKey(next) ? (List) map.get(next) : new ArrayList();
                    arrayList3.add(jSONObjectOptJSONObject2.optString("title") + "$" + jSONObjectOptJSONObject3.optJSONObject(next).optString("param"));
                    map.put(next, arrayList3);
                }
            }
            i = i2 + 1;
        }
        for (String str : map.keySet()) {
            arrayList2.add(str);
            arrayList.add(TextUtils.join("#", (Iterable) map.get(str)));
        }
        c0554e.m(TextUtils.join("$$$", arrayList2));
        c0554e.n(TextUtils.join("$$$", arrayList));
        return C0552c.m(c0554e);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0341 A[Catch: Exception -> 0x039a, TryCatch #0 {Exception -> 0x039a, blocks: (B:3:0x000f, B:4:0x0018, B:6:0x001f, B:9:0x0032, B:10:0x0036, B:11:0x0068, B:14:0x0070, B:16:0x008b, B:18:0x00bf, B:20:0x00cb, B:22:0x00eb, B:24:0x011b, B:26:0x0120, B:63:0x0341, B:64:0x034b, B:66:0x0353, B:67:0x0380, B:69:0x0387, B:30:0x012a, B:32:0x0145, B:34:0x0179, B:36:0x0185, B:38:0x01a7, B:40:0x01d7, B:41:0x01dd, B:43:0x01f8, B:45:0x022c, B:47:0x0238, B:49:0x025a, B:51:0x028a, B:52:0x0290, B:54:0x02ab, B:56:0x02df, B:58:0x02eb, B:60:0x030c, B:62:0x033a, B:71:0x0394), top: B:76:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String homeContent(boolean r22) {
        /*
            Method dump skipped, instruction units count: 928
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Gz360.homeContent(boolean):java.lang.String");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public void init(Context context, String str) {
        super.init(context, str);
        ?? r0 = c;
        r0.put("1", "5");
        r0.put("2", "12");
        r0.put("3", "30");
        r0.put("4", "22");
        r0.put("64", "");
    }

    public String playerContent(String str, String str2, List<String> list) throws JSONException {
        JsonObject jsonObject = new JsonObject();
        for (String str3 : str2.split("&")) {
            int iIndexOf = str3.indexOf("=");
            jsonObject.addProperty(str3.substring(0, iIndexOf), str3.substring(iIndexOf + 1));
        }
        String strOptString = new JSONObject(a("/App/Resource/VurlDetail/showOne", jsonObject.toString())).optString("url");
        if (!C0529a.m82a(strOptString)) {
            return C0552c.l("播放链接解析失败");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("parse", 0);
        jSONObject.put("playUrl", "");
        jSONObject.put("url", strOptString);
        return C0529a.addDanmaku(jSONObject.toString());
    }

    public String searchContent(String str, boolean z) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("keywords", str);
        jsonObject.addProperty("order_val", "1");
        String strA = a("/App/Index/findMoreVod", jsonObject.toString());
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = new JSONObject(strA).optJSONArray("list");
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            arrayList.add(new C0554e(jSONObjectOptJSONObject.optString("vod_id"), jSONObjectOptJSONObject.optString("vod_name"), jSONObjectOptJSONObject.optString("vod_pic"), jSONObjectOptJSONObject.optString("vod_scroe")));
        }
        return C0552c.n(arrayList);
    }
}
