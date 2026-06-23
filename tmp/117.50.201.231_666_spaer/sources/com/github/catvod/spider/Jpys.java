package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.FM.a.C0298a;
import com.github.catvod.spider.merge.FM.c.C0323a;
import com.github.catvod.spider.merge.FM.c.C0329g;
import com.github.catvod.spider.merge.FM.c.C0332j;
import com.github.catvod.spider.merge.FM.m.C0378c;
import com.github.catvod.spider.merge.FM.n.C0384b;
import com.github.catvod.spider.merge.FM.o.z;
import com.github.catvod.spider.merge.a.C0529a;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class Jpys extends Spider {
    private static Map<String, Boolean> d = new HashMap();
    private String a = "https://www.hkybqufgh.com";
    private String b = "";
    private String c;

    private boolean checkDomainValid(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setRequestMethod("HEAD");
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            int responseCode = httpURLConnection.getResponseCode();
            boolean z = responseCode >= 200 && responseCode <= 399;
            try {
                httpURLConnection.disconnect();
                return z;
            } catch (Exception e) {
                return z;
            }
        } catch (Exception e2) {
            return false;
        }
    }

    public static String getUUID() {
        return UUID.randomUUID().toString();
    }

    public static String sha1(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Boolean>] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Boolean>] */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (map.get("by") == null || map.get("by").equals("全部")) {
            map.put("by", "");
        }
        if (map.get("year") == null || map.get("year").equals("全部")) {
            map.put("year", "");
        }
        if (map.get("area") == null || map.get("area").equals("全部")) {
            map.put("area", "");
        }
        map.get("by");
        String str3 = map.get("year");
        String str4 = map.get("area");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        String strSha1 = sha1(z.a("area=" + str4 + "&pageNum=" + str2 + "&type1=" + str + "&year=" + str3 + "&key=" + this.c + "&t=" + strValueOf));
        HashMap map2 = new HashMap();
        map2.put("sign", strSha1);
        map2.put("T", strValueOf);
        map2.put("Deviceid", "Deviceid");
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("/api/mw-movie/anonymous/video/list?type1=%s&pageNum=%s&area=%s&year=%s");
        String strN = C0378c.n(String.format(sb.toString(), str, str2, str4, str3), map2);
        PrintStream printStream = System.out;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ddyy");
        sb2.append(strN);
        printStream.println(sb2.toString());
        JSONArray jSONArray = new JSONObject(strN).getJSONObject("data").getJSONArray("list");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("vodPic");
            String string2 = jSONObject.getString("vodName");
            String string3 = jSONObject.getString("vodVersion");
            String string4 = jSONObject.getString("vodId");
            if (d.isEmpty() || !d.containsKey(string2)) {
                C0384b.a(string4, string2, string, string3, arrayList);
            }
        }
        return C0329g.q(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x01b0 A[LOOP:0: B:7:0x01aa->B:9:0x01b0, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r15) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Jpys.detailContent(java.util.List):java.lang.String");
    }

    public String homeContent(boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        new LinkedHashMap();
        arrayList2.add(new C0323a(C0298a.b(new byte[]{0}, new byte[]{49, -128, -107, -84, 109, 92, 73, 53}), "电影"));
        arrayList2.add(new C0323a("2", "电视剧"));
        arrayList2.add(new C0323a("4", "动漫"));
        arrayList2.add(new C0323a("3", "综艺"));
        JSONObject jSONObject = new JSONObject("{\"1\":[{\"name\":\"地区\",\"key\":\"area\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"name\":\"年份\",\"key\":\"year\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009~2000\",\"v\":\"2009~2000\"},{\"n\":\"90年代\",\"v\":\"90年代\"},{\"n\":\"80年代\",\"v\":\"80年代\"}]}],\"2\":[{\"name\":\"地区\",\"key\":\"area\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"name\":\"年份\",\"key\":\"year\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009~2000\",\"v\":\"2009~2000\"},{\"n\":\"90年代\",\"v\":\"90年代\"},{\"n\":\"80年代\",\"v\":\"80年代\"}]}],\"3\":[{\"name\":\"地区\",\"key\":\"area\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"name\":\"年份\",\"key\":\"year\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"更早\",\"v\":\"更早\"}]}],\"4\":[{\"name\":\"地区\",\"key\":\"area\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"name\":\"年份\",\"key\":\"year\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009~2000\",\"v\":\"2009~2000\"},{\"n\":\"90年代\",\"v\":\"90年代\"},{\"n\":\"80年代\",\"v\":\"80年代\"},{\"n\":\"更早\",\"v\":\"更早\"}]}]}");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        String strSha1 = sha1(z.a(String.format("key=%s&t=%s", this.c, strValueOf)));
        HashMap map = new HashMap();
        map.put("sign", strSha1);
        map.put("T", strValueOf);
        map.put("Deviceid", "Deviceid");
        JSONArray jSONArray = new JSONObject(C0378c.n(this.a + "/api/mw-movie/anonymous/home/hotSearch", map)).getJSONArray("data");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            arrayList.add(new C0332j(jSONObject2.getString("vodId"), jSONObject2.getString("vodName"), jSONObject2.getString("vodPic"), jSONObject2.getString("vodVersion")));
        }
        return C0329g.u(arrayList2, arrayList, jSONObject);
    }

    public void init(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] strArrSplit = str.split(",");
        int length = strArrSplit.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String str2 = strArrSplit[i];
            if (checkDomainValid(str2)) {
                this.a = str2.trim();
                break;
            }
            i++;
        }
        this.c = "cb808529bae6b6be45ecfab29a4889bc";
        this.b = getUUID();
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            String[] strArrSplit = str2.split("@");
            String str3 = strArrSplit[0];
            String str4 = strArrSplit[1];
            String str5 = this.a + "/api/mw-movie/anonymous/v2/video/episode/url?id=" + str3 + "&nid=" + str4;
            String strValueOf = String.valueOf(System.currentTimeMillis());
            String strSha1 = sha1(z.a("id=" + str3 + "&nid=" + str4 + String.format("&key=%s&t=%s", this.c, strValueOf)));
            HashMap map = new HashMap();
            map.put("sign", strSha1);
            map.put("T", strValueOf);
            map.put("Deviceid", "Deviceid");
            String strN = C0378c.n(str5, map);
            JSONObject jSONObject = new JSONObject();
            String string = new JSONObject(strN).getJSONObject("data").getJSONArray("list").getJSONObject(0).getString("url");
            System.out.println("ssss" + string);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
            jSONObject2.put("Origin", this.a);
            jSONObject2.put("Referer", this.a);
            jSONObject.put("url", string);
            jSONObject.put("parse", "0");
            jSONObject.put("playUrl", "");
            jSONObject.put("header", jSONObject2.toString());
            return C0529a.addDanmaku(jSONObject.toString());
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String searchContent(String str, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList();
        String str2 = this.a + "/api/mw-movie/anonymous/video/searchByWord?keyword=" + URLEncoder.encode(str) + "&pageNum=1&pageSize=8";
        String strValueOf = String.valueOf(System.currentTimeMillis());
        String strSha1 = sha1(z.a("keyword=" + str + "&pageNum=1&pageSize=8" + String.format("&key=%s&t=%s", this.c, strValueOf)));
        HashMap map = new HashMap();
        map.put("sign", strSha1);
        map.put("T", strValueOf);
        map.put("Deviceid", "Deviceid");
        JSONArray jSONArray = new JSONObject(C0378c.n(str2, map)).getJSONObject("data").getJSONObject("result").getJSONArray("list");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (!jSONObject.getString("vodClass").equals("伦理")) {
                C0384b.a(jSONObject.getString("vodId"), jSONObject.getString("vodName"), jSONObject.getString("vodPic"), jSONObject.getString("vodRemarks"), arrayList);
            }
        }
        return C0329g.q(arrayList);
    }
}
