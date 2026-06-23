package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.c.C0550a;
import com.github.catvod.spider.merge.c.C0551b;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.c.C0555f;
import com.github.catvod.spider.merge.c.C0556g;
import com.github.catvod.spider.merge.k.C0575b;
import com.github.catvod.spider.merge.m.C0592a;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class AppQi extends Spider {
    private static Map<String, Boolean> f = new HashMap();
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private String f4f;
    private String g;
    private String h;

    static {
        Pattern.compile("data=([^&]*)");
    }

    private String a(String str, String str2) {
        try {
            String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
            Map<String, String> mapB = b();
            HashMap map = (HashMap) mapB;
            map.put("Content-Type", "application/x-www-form-urlencoded");
            map.put("app-user-device-id", this.d);
            map.put("app-version-code", this.e);
            map.put("app-api-verify-time", strValueOf);
            map.put("app-ui-mode", "light");
            return C0592a.a(new JSONObject(C0575b.f(this.a + "/api.php" + str, str2, mapB).a()).getString("data"), this.b, this.c);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private Map<String, String> b() {
        HashMap map = new HashMap();
        map.put("User-Agent", TextUtils.isEmpty(this.f4f) ? "okhttp/3.14.9" : this.f4f);
        return map;
    }

    private String c(String str) {
        try {
            String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
            return new JSONObject((String) ((Map) new Gson().fromJson(C0592a.a(new JSONObject(C0575b.a().newCall(new Request.Builder().url(this.a + "/api.php/qijiappapi.index/vodParse").method("POST", RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"), str)).addHeader("User-Agent", this.f4f).addHeader("Connection", "Keep-Alive").addHeader("Content-Type", "application/x-www-form-urlencoded").addHeader("app-version-code", this.e).addHeader("app-ui-mode", "light").addHeader("app-user-device-id", this.d).addHeader("app-api-verify-time", strValueOf).addHeader("app-api-verify-sign", Base64.encodeToString(C0592a.l(strValueOf, this.b, this.c), 2)).build()).execute().body().string()).getString("data"), this.b, this.c), Map.class)).get("json")).getString("url");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private C0556g createFilterItem(String str, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String strOptString = jSONArray.optString(i);
            C0555f c0555f = new C0555f();
            c0555f.c(strOptString);
            c0555f.d(strOptString);
            arrayList.add(c0555f);
        }
        C0556g c0556g = new C0556g();
        if ("sort".equals(str)) {
            str = "by";
        }
        c0556g.a(str);
        if ("class".equals(str)) {
            c0556g.b("类型");
        } else if ("lang".equals(str)) {
            c0556g.b("语言");
        } else if ("area".equals(str)) {
            c0556g.b("地区");
        } else if ("year".equals(str)) {
            c0556g.b("年份");
        }
        if ("sort".equals(str)) {
            c0556g.b("排序");
        }
        c0556g.a(arrayList);
        return c0556g;
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
            Log.e("AppQi", "URL validation failed: ", e);
            return false;
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        List<C0554e> arrayList = new ArrayList<>();
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("type_id", str);
            if (map != null) {
                if (map.containsKey("class")) {
                    String str3 = map.get("class");
                    if (!str3.isEmpty()) {
                        jsonObject.addProperty("class", str3);
                    }
                }
                if (map.containsKey("lang")) {
                    String str4 = map.get("lang");
                    if (!str4.isEmpty()) {
                        jsonObject.addProperty("lang", str4);
                    }
                }
                if (map.containsKey("area")) {
                    String str5 = map.get("area");
                    if (!str5.isEmpty()) {
                        jsonObject.addProperty("area", str5);
                    }
                }
                if (map.containsKey("year")) {
                    String str6 = map.get("year");
                    if (!str6.isEmpty()) {
                        jsonObject.addProperty("year", str6);
                    }
                }
                if (map.containsKey("by")) {
                    String str7 = map.get("by");
                    if (!str7.isEmpty()) {
                        jsonObject.addProperty("sort", str7);
                    }
                }
            }
            jsonObject.addProperty("page", str2);
            arrayList = parseVodList(new JSONObject(a("/qijiappapi.index/typeFilterVodList?page=" + jsonObject.get("page").getAsString(), jsonObject.toString())).optJSONArray("recommend_list"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return C0552c.n(arrayList);
    }

    public String detailContent(List<String> list) {
        C0554e c0554e;
        ArrayList arrayList;
        ArrayList arrayList2;
        C0554e c0554e2;
        String str;
        String str2;
        String str3 = "player_info";
        String str4 = "$$$";
        C0554e c0554e3 = new C0554e();
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("vod_id", list.get(0));
            JSONObject jSONObject = new JSONObject(a("/qijiappapi.index/vodDetail", jsonObject.toString()));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("vod");
            c0554e3.j(list.get(0));
            c0554e3.k(jSONObjectOptJSONObject.optString("vod_name"));
            c0554e3.l(jSONObjectOptJSONObject.optString("vod_pic"));
            c0554e3.o(jSONObjectOptJSONObject.optString("vod_remarks"));
            c0554e3.h(jSONObjectOptJSONObject.optString("vod_content"));
            c0554e3.f(jSONObjectOptJSONObject.optString("vod_actor"));
            c0554e3.i(jSONObjectOptJSONObject.optString("vod_director"));
            c0554e3.e(jSONObjectOptJSONObject.optString("vod_class"));
            ArrayList arrayList3 = new ArrayList();
            arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("vod_play_list");
            jSONArrayOptJSONArray.length();
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                String strOptString = jSONObjectOptJSONObject2.optJSONObject(str3).optString("show");
                String strOptString2 = jSONObjectOptJSONObject2.optJSONObject(str3).optString("parse");
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("urls");
                ArrayList arrayList4 = new ArrayList();
                int i2 = 0;
                while (i2 < jSONArrayOptJSONArray2.length()) {
                    JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i2);
                    String str5 = str3;
                    String strOptString3 = jSONObjectOptJSONObject3.optString("url");
                    JSONArray jSONArray = jSONArrayOptJSONArray;
                    String strOptString4 = jSONObjectOptJSONObject3.optString("parse_api_url");
                    JSONArray jSONArray2 = jSONArrayOptJSONArray2;
                    String strOptString5 = jSONObjectOptJSONObject3.optString("token");
                    c0554e2 = c0554e3;
                    try {
                        String strOptString6 = jSONObjectOptJSONObject3.optString("name");
                        String str6 = str4;
                        int i3 = i;
                        ArrayList arrayList5 = arrayList3;
                        if (strOptString4.matches("^https?://.*")) {
                            str2 = strOptString6 + "$" + strOptString4 + "|" + jSONObjectOptJSONObject.optString("vod_name") + "|" + jSONObjectOptJSONObject3.optString("nid");
                        } else {
                            str2 = strOptString6 + "$parse_api=" + strOptString2 + "&url=" + Base64.encodeToString(C0592a.l(strOptString3, this.b, this.c), 2) + "&token=" + strOptString5 + "|" + jSONObjectOptJSONObject.optString("vod_name") + "|" + jSONObjectOptJSONObject3.optString("nid");
                        }
                        arrayList4.add(str2);
                        i2++;
                        jSONArrayOptJSONArray = jSONArray;
                        str3 = str5;
                        jSONArrayOptJSONArray2 = jSONArray2;
                        c0554e3 = c0554e2;
                        str4 = str6;
                        i = i3;
                        arrayList3 = arrayList5;
                    } catch (Exception e) {
                        e = e;
                        c0554e = c0554e2;
                        e.printStackTrace();
                        return C0552c.m(c0554e);
                    }
                }
                ArrayList arrayList6 = arrayList3;
                arrayList.add(strOptString);
                arrayList6.add(TextUtils.join("#", arrayList4));
                i++;
                jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                arrayList3 = arrayList6;
                str3 = str3;
                c0554e3 = c0554e3;
                str4 = str4;
            }
            arrayList2 = arrayList3;
            c0554e2 = c0554e3;
            str = str4;
            c0554e = c0554e2;
        } catch (Exception e2) {
            e = e2;
            c0554e = c0554e3;
        }
        try {
            c0554e.m(TextUtils.join(str, arrayList));
            c0554e.n(TextUtils.join(str, arrayList2));
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
        }
        return C0552c.m(c0554e);
    }

    public String edu(String str) {
        Matcher matcher = Pattern.compile("(url=)(.*?)(?=&token)(&token)").matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            try {
                matcher.appendReplacement(stringBuffer, matcher.group(1) + URLEncoder.encode(matcher.group(2), "UTF-8") + matcher.group(3));
            } catch (Exception e) {
                e.printStackTrace();
                return str;
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public String eduAesDecode(String str) {
        Matcher matcher = Pattern.compile("(&url=)(.*?)(?=&token)(&token)").matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            try {
                matcher.appendReplacement(stringBuffer, matcher.group(1) + C0592a.a(matcher.group(2), this.b, this.c) + matcher.group(3));
            } catch (Exception e) {
                e.printStackTrace();
                return str;
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public String homeContent(boolean z) {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        List<C0554e> arrayList2 = new ArrayList<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            JsonObject jsonObject = new JsonObject();
            StringBuilder sb = new StringBuilder();
            sb.append("/qijiappapi.index/");
            String str = this.h;
            if (TextUtils.isEmpty(str)) {
                str = "initV120";
            }
            sb.append(str);
            JSONObject jSONObject = new JSONObject(a(sb.toString(), jsonObject.toString()));
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("recommend_list");
            JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("type_list");
            for (int i = 0; i < jSONArrayOptJSONArray3.length(); i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray3.getJSONObject(i);
                String string = jSONObject2.getString("type_id");
                String string2 = jSONObject2.getString("type_name");
                if (!"伦理".equals(string2) && !"福利".equals(string2) && !"小影院".equals(string2)) {
                    arrayList.add(new C0550a(string, string2));
                    JSONArray jSONArrayOptJSONArray4 = jSONObject2.optJSONArray("filter_type_list");
                    if (jSONArrayOptJSONArray4 != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray4.length(); i2++) {
                            JSONObject jSONObject3 = jSONArrayOptJSONArray4.getJSONObject(i2);
                            String strOptString = jSONObject3.optString("name");
                            if (("class".equals(strOptString) || "area".equals(strOptString) || "lang".equals(strOptString) || "year".equals(strOptString) || "sort".equals(strOptString)) && (jSONArrayOptJSONArray = jSONObject3.optJSONArray("list")) != null) {
                                arrayList3.add(createFilterItem(strOptString, jSONArrayOptJSONArray));
                            }
                        }
                        linkedHashMap.put(string, arrayList3);
                    }
                }
            }
            arrayList2 = parseVodList(jSONArrayOptJSONArray2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return C0552c.q((List<C0550a>) arrayList, arrayList2, (LinkedHashMap<String, List<C0551b>>) linkedHashMap);
    }

    public void init(Context context, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url", "");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = C0575b.l(jSONObject.optString("site"), new HashMap());
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
                            Log.i("AppQi", "Using valid URL: " + strTrim);
                            strOptString = strTrim;
                            break;
                        }
                        i++;
                    }
                } else {
                    Log.e("AppQi", "Both url and site are invalid!");
                }
            }
            this.a = strOptString;
            this.b = jSONObject.optString("dataKey");
            this.c = jSONObject.optString("dataIv");
            this.d = jSONObject.optString("deviceId");
            this.e = jSONObject.optString("version");
            this.f4f = jSONObject.optString("ua");
            this.g = jSONObject.optString("search");
            this.h = jSONObject.optString("init");
            f = Init.getKeywordsMap();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<C0554e> parseVodList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            try {
                jSONArray.getClass();
                if (i >= jSONArray.length()) {
                    break;
                }
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String strOptString = jSONObject.optString("vod_name");
                if (f.isEmpty() || !f.containsKey(strOptString)) {
                    arrayList.add(new C0554e(jSONObject.optString("vod_id"), strOptString, jSONObject.optString("vod_pic"), jSONObject.optString("vod_remarks")));
                }
                i++;
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.github.catvod.spider.AppQi] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
    public String playerContent(String str, String str2, List<String> list) {
        try {
            String[] strArrSplit = str2.split("\\|");
            if (strArrSplit.length == 4) {
                strArrSplit = (strArrSplit[0] + "|" + strArrSplit[2] + "|" + strArrSplit[3]).split("\\|");
            }
            String strGroup = strArrSplit[0];
            String str3 = Proxy.getUrl() + "?do=appdanmu&vodName=" + strArrSplit[1] + "&vodIndex=" + strArrSplit[2] + "&vodUrl=";
            Map<String, String> mapB = b();
            ((HashMap) mapB).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
            if (strGroup.matches("^https?://.*")) {
                try {
                } catch (JSONException unused) {
                    Matcher matcher = Pattern.compile("\"url\"\\s*:\\s*\"([^\"]+)\"").matcher(this);
                    if (matcher.find()) {
                        strGroup = matcher.group(1);
                    }
                }
                if (strGroup.contains("?url=") || strGroup.contains("?key=")) {
                    this = C0575b.l(strGroup, b());
                    strGroup = new JSONObject((String) this).optString("url");
                    C0552c c0552c = new C0552c();
                    c0552c.u(strGroup);
                    c0552c.a(str3);
                    c0552c.e(mapB);
                    return c0552c.toString();
                }
            }
            if (strGroup.matches(".*(m3u8|mp4|mkv).*")) {
                C0552c c0552c2 = new C0552c();
                c0552c2.u(strGroup);
                c0552c2.a(str3);
                c0552c2.e(b());
                return c0552c2.toString();
            }
            if (strGroup.contains("?url=") || strGroup.contains("?key=") || strGroup.contains("html")) {
                strGroup = eduAesDecode(strGroup);
                Matcher matcher2 = Pattern.compile("(parse_api=)(.*?)(?=&token)(&token)").matcher(strGroup);
                if (matcher2.find()) {
                    String strOptString = new JSONObject(C0575b.l(matcher2.group(2), null)).optJSONObject("data").optString("url");
                    if (!strOptString.isEmpty()) {
                        C0552c c0552c3 = new C0552c();
                        c0552c3.u(strOptString);
                        c0552c3.a(str3);
                        c0552c3.e(mapB);
                        return c0552c3.toString();
                    }
                    String strB = C0575b.b(strOptString, b());
                    C0552c c0552c4 = new C0552c();
                    c0552c4.u(strB);
                    c0552c4.a(str3);
                    c0552c4.e(mapB);
                    return c0552c4.toString();
                }
            }
            String strC = c(edu(strGroup));
            if (!strC.isEmpty()) {
                C0552c c0552c5 = new C0552c();
                c0552c5.u(strC);
                c0552c5.a(str3);
                c0552c5.e(mapB);
                return c0552c5.toString();
            }
            String strB2 = C0575b.b(strC, b());
            C0552c c0552c6 = new C0552c();
            c0552c6.u(strB2);
            c0552c6.a(str3);
            c0552c6.e(mapB);
            return c0552c6.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        List<C0554e> arrayList = new ArrayList<>();
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("type_id", 0);
            jsonObject.addProperty("keywords", str);
            jsonObject.addProperty("page", 1);
            StringBuilder sb = new StringBuilder();
            sb.append("/qijiappapi.index/");
            String str2 = this.g;
            if (TextUtils.isEmpty(str2)) {
                str2 = "searchList";
            }
            sb.append(str2);
            arrayList = parseVodList(new JSONObject(a(sb.toString(), jsonObject.toString())).optJSONArray("search_list"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return C0552c.n(arrayList);
    }
}
