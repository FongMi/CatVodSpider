package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.FM.c.C0323a;
import com.github.catvod.spider.merge.FM.c.C0324b;
import com.github.catvod.spider.merge.FM.c.C0325c;
import com.github.catvod.spider.merge.FM.c.C0329g;
import com.github.catvod.spider.merge.FM.c.C0332j;
import com.github.catvod.spider.merge.FM.m.C0378c;
import com.github.catvod.spider.merge.FM.o.C0385a;
import com.github.catvod.spider.merge.FM.o.z;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class AppMuou extends Spider {
    private String a;
    private String b;
    private String d;
    private String e;
    private String f;
    private Map<String, String> c = new HashMap();
    private String g = "";
    private String h = "";

    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    private void a(String str, String str2) {
        try {
            String str3 = (System.currentTimeMillis() / 1000) + "";
            String strI = com.github.catvod.spider.merge.A.a.i(str3 + str2);
            String strI2 = com.github.catvod.spider.merge.A.a.i(str3 + strI + "muouapp");
            HashMap map = new HashMap();
            map.put("t", str3);
            map.put("n", strI);
            map.put("m", strI2);
            JSONObject jSONObject = new JSONObject(C0378c.i(str + "/app_info.php", map));
            String strOptString = jSONObject.optString("a");
            int iOptInt = jSONObject.optInt("s");
            int iOptInt2 = jSONObject.optInt("e");
            String strOptString2 = jSONObject.optString("data");
            String strSubstring = strOptString2.substring(iOptInt, strOptString2.length() - iOptInt2);
            JSONObject jSONObject2 = new JSONObject(C0385a.a(strSubstring, z.a(strOptString).substring(0, 16), z.a(strI2).substring(0, 16)));
            this.d = z.a(jSONObject2.optString("key")).substring(0, 16);
            this.e = z.a(jSONObject2.optString("iv")).substring(0, 16);
            this.b = jSONObject2.optString("HBqq");
            this.h = jSONObject2.optString("HBrjjg");
            JSONArray jSONArrayOptJSONArray = new JSONObject(C0385a.a(C0378c.n(this.a + "/api.php?action=playerinfo", e()), this.d, this.e)).optJSONObject("data").optJSONArray("playerinfo");
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i);
                this.c.put(jSONObject3.optString("playername"), jSONObject3.optString("playerjiekou"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String b(String str) {
        return new JSONObject(str).optString("url");
    }

    private String c(String str) {
        try {
            String strN = C0378c.n(this.b + str, d());
            String strA = C0385a.a(strN, this.d, this.e);
            return strA != null ? strA : new JSONObject(strN).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private Map<String, String> d() {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Linux; Android 10; SM-G975F) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.120 Mobile Safari/537.36");
        map.put("app-version", "4.2.0");
        map.put("app-device", "nodata");
        map.put("sys-version", "12");
        map.put("brand-model", "SM-E5658");
        map.put("os", "Android");
        map.put("Cookie", "X_CACHE_KEY=16ad0ae42479c326edfc7436e7ea2f46");
        return map;
    }

    private Map<String, String> e() {
        HashMap map = new HashMap();
        map.put("User-Agent", "okhttp/3.14.9");
        return map;
    }

    private boolean isUrlValid(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setRequestMethod("HEAD");
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            int responseCode = httpURLConnection.getResponseCode();
            return responseCode == 200 || responseCode == 302 || responseCode == 301;
        } catch (Exception e) {
            Log.e("AppMuou", "URL validation failed: ", e);
            return false;
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3;
        String str4;
        String str5;
        String str6 = "/api.php/v1.vod?type=" + str + "&page=" + str2;
        String str7 = "";
        if (map == null || !map.containsKey("area")) {
            str3 = "";
        } else {
            str3 = "&area=" + map.get("area");
        }
        if (map == null || !map.containsKey("year")) {
            str4 = "";
        } else {
            str4 = "&year=" + map.get("year");
        }
        if (map == null || !map.containsKey("by")) {
            str5 = "";
        } else {
            str5 = "&by=" + map.get("sort");
        }
        if (map != null && map.containsKey("class")) {
            str7 = "&class=" + map.get("class");
        }
        new ArrayList();
        List<C0332j> vodList = parseVodList(new JSONObject(c(str6 + str3 + str4 + str5 + str7)).optJSONObject("data").optJSONArray("list"));
        C0329g c0329g = new C0329g();
        c0329g.k(Integer.valueOf(str2).intValue(), 0, 0, 0);
        c0329g.z(vodList);
        return c0329g.toString();
    }

    public String detailContent(List<String> list) {
        String str = "/api.php/v1.vod/detail?vod_id=" + list.get(0);
        C0332j c0332j = new C0332j();
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(c(str)).optJSONObject("data");
            c0332j.g(list.get(0));
            String strOptString = jSONObjectOptJSONObject.optString("vod_name");
            this.g = strOptString;
            c0332j.h(strOptString);
            c0332j.i(jSONObjectOptJSONObject.optString("vod_pic"));
            c0332j.b(jSONObjectOptJSONObject.optString("vod_class"));
            c0332j.l(jSONObjectOptJSONObject.optString("vod_remarks"));
            c0332j.e(jSONObjectOptJSONObject.optString("vod_content"));
            c0332j.c(jSONObjectOptJSONObject.optString("vod_actor"));
            c0332j.f(jSONObjectOptJSONObject.optString("vod_director"));
            c0332j.d(jSONObjectOptJSONObject.optString("vod_area"));
            c0332j.n(jSONObjectOptJSONObject.optString("vod_year"));
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("vod_play_list");
            Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
            while (itKeys.hasNext()) {
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(itKeys.next());
                linkedList2.add(jSONObjectOptJSONObject3.optJSONObject("player_info").optString("show"));
                ArrayList arrayList = new ArrayList();
                JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("urls");
                Iterator<String> itKeys2 = jSONObjectOptJSONObject4.keys();
                while (itKeys2.hasNext()) {
                    JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject4.optJSONObject(itKeys2.next());
                    arrayList.add(jSONObjectOptJSONObject5.optString("name") + "$" + jSONObjectOptJSONObject5.toString());
                }
                linkedList.add(TextUtils.join("#", arrayList));
            }
            c0332j.j(TextUtils.join("$$$", linkedList2));
            c0332j.k(TextUtils.join("$$$", linkedList));
            return C0329g.p(c0332j);
        } catch (Exception e) {
            e.printStackTrace();
            return C0329g.p(c0332j);
        }
    }

    public String homeContent(boolean z) throws JSONException {
        JSONObject jSONObject;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray = new JSONObject(c("/api.php/v1.vod/types")).optJSONObject("data").optJSONArray("typelist");
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
            String strOptString = jSONObject2.optString("type_name");
            String strOptString2 = jSONObject2.optString("type_id");
            if (!"伦理片".equals(strOptString)) {
                arrayList.add(new C0323a(strOptString2, strOptString));
                ArrayList arrayList3 = new ArrayList();
                Iterator<String> itKeys = jSONObject2.optJSONObject("type_extend").keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String str = next.equals("class") ? "类型" : next.equals("area") ? "地区" : next.equals("year") ? "年份" : next.equals("lang") ? "语言" : "";
                    if (!TextUtils.isEmpty(str)) {
                        String[] strArrSplit = jSONObject2.optJSONObject("type_extend").optString(next).split(",");
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = arrayList2;
                        JSONArray jSONArray = jSONArrayOptJSONArray;
                        int i2 = 0;
                        while (i2 < strArrSplit.length) {
                            if (TextUtils.isEmpty(strArrSplit[i2])) {
                                jSONObject = jSONObject2;
                            } else {
                                jSONObject = jSONObject2;
                                String str2 = strArrSplit[i2];
                                arrayList4.add(new C0324b(str2, str2));
                            }
                            i2++;
                            jSONObject2 = jSONObject;
                        }
                        JSONObject jSONObject3 = jSONObject2;
                        if (arrayList4.size() > 1) {
                            arrayList3.add(new C0325c(next, str, arrayList4));
                        }
                        arrayList2 = arrayList5;
                        jSONArrayOptJSONArray = jSONArray;
                        jSONObject2 = jSONObject3;
                    }
                }
                linkedHashMap.put(strOptString2, arrayList3);
            }
        }
        ArrayList arrayList6 = arrayList2;
        JSONArray jSONArrayOptJSONArray2 = new JSONObject(c("/api.php/v1.vod/HomeIndex?page=&limit=6")).optJSONArray("data").optJSONObject(1).optJSONArray("vod_list");
        return C0329g.t(arrayList, (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) ? arrayList6 : parseVodList(jSONArrayOptJSONArray2), linkedHashMap);
    }

    public void init(Context context, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url", "");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = C0378c.n(jSONObject.optString("site"), new HashMap());
                if (!TextUtils.isEmpty(strOptString)) {
                    String[] strArrSplit = strOptString.split("\n");
                    int length = strArrSplit.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        String strTrim = strArrSplit[i].trim();
                        if (!TextUtils.isEmpty(strTrim) && isUrlValid(strTrim)) {
                            Log.i("AppMuou", "Using valid URL: " + strTrim);
                            strOptString = strTrim;
                            break;
                        }
                        i++;
                    }
                } else {
                    Log.e("AppMuou", "Both host and site are invalid!");
                }
            }
            this.a = strOptString;
            this.f = jSONObject.optString("name", "");
            a(this.a, this.f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<C0332j> parseVodList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            try {
                jSONArray.getClass();
                if (i >= jSONArray.length()) {
                    break;
                }
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                arrayList.add(new C0332j(jSONObject.optString("vod_id"), jSONObject.optString("vod_name"), jSONObject.optString("vod_pic"), jSONObject.optString("vod_remarks")));
                i++;
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0098 A[Catch: Exception -> 0x00b0, TryCatch #0 {Exception -> 0x00b0, blocks: (B:2:0x0000, B:4:0x004c, B:6:0x0057, B:8:0x005f, B:9:0x006a, B:10:0x006f, B:12:0x008e, B:15:0x00a4, B:14:0x0098, B:5:0x004f), top: B:20:0x0000 }] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String playerContent(java.lang.String r3, java.lang.String r4, java.util.List<java.lang.String> r5) {
        /*
            r2 = this;
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lb0
            r3.<init>(r4)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r4 = "url"
            java.lang.String r4 = r3.optString(r4)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r5 = "from"
            java.lang.String r5 = r3.optString(r5)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r0 = "nid"
            java.lang.String r3 = r3.optString(r0)     // Catch: java.lang.Exception -> Lb0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb0
            r0.<init>()     // Catch: java.lang.Exception -> Lb0
            java.lang.String r1 = com.github.catvod.spider.Proxy.getUrl()     // Catch: java.lang.Exception -> Lb0
            r0.append(r1)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r1 = "?do=appdanmu&vodName="
            r0.append(r1)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r1 = r2.g     // Catch: java.lang.Exception -> Lb0
            r0.append(r1)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r1 = "&vodIndex="
            r0.append(r1)     // Catch: java.lang.Exception -> Lb0
            r0.append(r3)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r3 = "&vodUrl="
            r0.append(r3)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Exception -> Lb0
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.c     // Catch: java.lang.Exception -> Lb0
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Exception -> Lb0
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch: java.lang.Exception -> Lb0
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> Lb0
            if (r0 == 0) goto L4f
            java.lang.String r5 = r2.h     // Catch: java.lang.Exception -> Lb0
            goto L57
        L4f:
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.c     // Catch: java.lang.Exception -> Lb0
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> Lb0
        L57:
            java.lang.String r0 = ".*(m3u8|mp4).*"
            boolean r0 = r4.matches(r0)     // Catch: java.lang.Exception -> Lb0
            if (r0 == 0) goto L6f
            com.github.catvod.spider.merge.FM.c.g r2 = new com.github.catvod.spider.merge.FM.c.g     // Catch: java.lang.Exception -> Lb0
            r2.<init>()     // Catch: java.lang.Exception -> Lb0
            r2.x(r4)     // Catch: java.lang.Exception -> Lb0
            r2.a(r3)     // Catch: java.lang.Exception -> Lb0
        L6a:
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Lb0
            goto Lb6
        L6f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb0
            r0.<init>()     // Catch: java.lang.Exception -> Lb0
            r0.append(r5)     // Catch: java.lang.Exception -> Lb0
            r0.append(r4)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Exception -> Lb0
            java.util.Map r5 = r2.e()     // Catch: java.lang.Exception -> Lb0
            java.lang.String r4 = com.github.catvod.spider.merge.FM.m.C0378c.n(r4, r5)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r0 = "{"
            boolean r0 = r4.startsWith(r0)     // Catch: java.lang.Exception -> Lb0
            if (r0 == 0) goto L98
            java.lang.String r5 = r2.b(r4)     // Catch: java.lang.Exception -> Lb0
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Exception -> Lb0
            if (r0 == 0) goto La4
        L98:
            java.lang.String r5 = r2.d     // Catch: java.lang.Exception -> Lb0
            java.lang.String r0 = r2.e     // Catch: java.lang.Exception -> Lb0
            java.lang.String r4 = com.github.catvod.spider.merge.FM.o.C0385a.a(r4, r5, r0)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r5 = r2.b(r4)     // Catch: java.lang.Exception -> Lb0
        La4:
            com.github.catvod.spider.merge.FM.c.g r2 = new com.github.catvod.spider.merge.FM.c.g     // Catch: java.lang.Exception -> Lb0
            r2.<init>()     // Catch: java.lang.Exception -> Lb0
            r2.x(r5)     // Catch: java.lang.Exception -> Lb0
            r2.a(r3)     // Catch: java.lang.Exception -> Lb0
            goto L6a
        Lb0:
            r2 = move-exception
            r2.printStackTrace()
            java.lang.String r2 = "{\"parse\":0,\"url\":\"\",\"msg\":\"播放链接解析失败,请更换其他源播放\",\"errMsg\":\"播放链接解析失败,请更换其他源播放\"}"
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppMuou.playerContent(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }

    public String searchContent(String str, boolean z) {
        JSONArray jSONArrayOptJSONArray = new JSONObject(c("/api.php/v1.vod?wd= " + URLEncoder.encode(str) + "&limit=18&page=1")).optJSONObject("data").optJSONArray("list");
        new ArrayList();
        return C0329g.q(parseVodList(jSONArrayOptJSONArray));
    }
}
