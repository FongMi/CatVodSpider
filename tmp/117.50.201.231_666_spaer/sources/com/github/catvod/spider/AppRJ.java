package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.b.C0544h;
import com.github.catvod.spider.merge.c.C0550a;
import com.github.catvod.spider.merge.c.C0551b;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.k.C0575b;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class AppRJ extends Spider {
    private String a;

    public static String a(String str) {
        try {
            StringBuilder sb = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"))).toString(16));
            while (sb.length() < 32) {
                sb.insert(0, "0");
            }
            return sb.toString().toLowerCase();
        } catch (Exception unused) {
            return "";
        }
    }

    private String a(String str, Map<String, String> map) {
        try {
            String str2 = this.a + str;
            MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                type.addFormDataPart(entry.getKey(), entry.getValue());
            }
            Response responseExecute = new OkHttpClient().newCall(new Request.Builder().url(str2).post(type.build()).addHeader("User-Agent", "okhttp-okgo/jeasonlzy").build()).execute();
            if (!responseExecute.isSuccessful()) {
                return "";
            }
            String strString = responseExecute.body().string();
            SpiderDebug.log("result\r\n" + strString);
            return strString;
        } catch (Exception e) {
            SpiderDebug.log(e.toString());
            return "";
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3 = (System.currentTimeMillis() / 1000) + "";
        HashMap mapC = C0544h.c("timestamp", str3, "sign", a("7gp0bnd2sr85ydii2j32pcypscoc4w6c7g5spl" + str3));
        mapC.put("type_id", str);
        mapC.put("limit", "12");
        mapC.put("page", str2);
        if (map != null && map.containsKey("area")) {
            mapC.put("area", map.get("area"));
        }
        if (map != null && map.containsKey("class")) {
            mapC.put("class", map.get("class"));
        }
        if (map != null && map.containsKey("lang")) {
            mapC.put("lang", map.get("lang"));
        }
        if (map != null && map.containsKey("year")) {
            mapC.put("year", map.get("year"));
        }
        JSONArray jSONArrayOptJSONArray = new JSONObject(a("/v3/home/type_search", mapC)).optJSONObject("data").optJSONArray("list");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            String strOptString = jSONObjectOptJSONObject.optString("vod_pic");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = jSONObjectOptJSONObject.optString("vod_pic_thumb");
            }
            arrayList.add(new C0554e(jSONObjectOptJSONObject.optString("vod_id"), jSONObjectOptJSONObject.optString("vod_name"), strOptString, jSONObjectOptJSONObject.optString("vod_remarks")));
        }
        C0552c c0552c = new C0552c();
        c0552c.i(Integer.valueOf(str2).intValue(), 0, 0, 0);
        c0552c.w(arrayList);
        return c0552c.toString();
    }

    public String detailContent(List<String> list) throws JSONException {
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis() / 1000);
        String str = "";
        sb.append("");
        String string = sb.toString();
        HashMap mapC = C0544h.c("timestamp", string, "sign", a("7gp0bnd2sr85ydii2j32pcypscoc4w6c7g5spl" + string));
        mapC.put("vod_id", list.get(0));
        JSONObject jSONObjectOptJSONObject = new JSONObject(a("/v3/home/vod_details", mapC)).optJSONObject("data");
        C0554e c0554e = new C0554e();
        c0554e.j(list.get(0));
        c0554e.k(jSONObjectOptJSONObject.optString("vod_name"));
        String strOptString = jSONObjectOptJSONObject.optString("vod_pic");
        if (TextUtils.isEmpty(strOptString)) {
            strOptString = jSONObjectOptJSONObject.optString("vod_pic_thumb");
        }
        c0554e.l(strOptString);
        c0554e.o(jSONObjectOptJSONObject.optString("vod_remarks"));
        c0554e.h(jSONObjectOptJSONObject.optString("vod_content"));
        c0554e.q(jSONObjectOptJSONObject.optString("vod_year"));
        c0554e.f(jSONObjectOptJSONObject.optString("vod_actor"));
        c0554e.i(jSONObjectOptJSONObject.optString("vod_director"));
        c0554e.p(jSONObjectOptJSONObject.optString("vod_class"));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("vod_play_list");
        int i = 0;
        while (i < jSONArrayOptJSONArray.length()) {
            ArrayList arrayList3 = new ArrayList();
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
            String str2 = "name";
            String string2 = jSONObjectOptJSONObject2.getString("name");
            String strOptString2 = jSONObjectOptJSONObject2.optString("ua");
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("urls");
            JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray("parse_urls");
            int i2 = 0;
            String string3 = str;
            while (i2 < jSONArrayOptJSONArray3.length()) {
                StringBuilder sbA = C0529a.a(string3);
                sbA.append(jSONArrayOptJSONArray3.optString(i2));
                sbA.append("@");
                i2++;
                string3 = sbA.toString();
            }
            int i3 = 0;
            while (i3 < jSONArrayOptJSONArray2.length()) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i3);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(jSONObjectOptJSONObject3.optString(str2));
                sb2.append("$");
                String str3 = string3;
                sb2.append(str3);
                sb2.append("|");
                sb2.append(jSONObjectOptJSONObject3.optString("url"));
                sb2.append("|");
                sb2.append(strOptString2);
                sb2.append("|");
                sb2.append(jSONObjectOptJSONObject.optString("vod_name"));
                sb2.append("|");
                sb2.append(jSONObjectOptJSONObject3.optString("nid"));
                arrayList3.add(sb2.toString());
                i3++;
                jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                string3 = str3;
                str2 = str2;
            }
            arrayList2.add(string2);
            arrayList.add(TextUtils.join("#", arrayList3));
            i++;
            str = string3;
        }
        c0554e.m(TextUtils.join("$$$", arrayList2));
        c0554e.n(TextUtils.join("$$$", arrayList));
        return C0552c.m(c0554e);
    }

    public String homeContent(boolean z) {
        Iterator<String> it;
        try {
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str = (System.currentTimeMillis() / 1000) + "";
            String strA = a("7gp0bnd2sr85ydii2j32pcypscoc4w6c7g5spl" + str);
            HashMap map = new HashMap();
            map.put("timestamp", str);
            map.put("sign", strA);
            JSONArray jSONArrayOptJSONArray = new JSONObject(a("/v3/type/top_type", map)).optJSONObject("data").optJSONArray("list");
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                arrayList.add(new C0550a(jSONObjectOptJSONObject.optString("type_id"), jSONObjectOptJSONObject.optString("type_name")));
                ArrayList arrayList2 = new ArrayList();
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String str2 = next.equals("extend") ? "类型" : next.equals("area") ? "地区" : next.equals("year") ? "年份" : next.equals("lang") ? "语言" : "";
                    if (!TextUtils.isEmpty(str2)) {
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(next);
                        ArrayList arrayList3 = new ArrayList();
                        JSONArray jSONArray = jSONArrayOptJSONArray;
                        int i2 = 0;
                        while (i2 < jSONArrayOptJSONArray2.length()) {
                            if (jSONArrayOptJSONArray2.optString(i2).length() > 1) {
                                it = itKeys;
                                arrayList3.add(new C0551b.a(jSONArrayOptJSONArray2.optString(i2), jSONArrayOptJSONArray2.optString(i2)));
                            } else {
                                it = itKeys;
                            }
                            i2++;
                            itKeys = it;
                        }
                        Iterator<String> it2 = itKeys;
                        if (arrayList3.size() > 1) {
                            arrayList2.add(new C0551b(next.replace("extend", "class"), str2, arrayList3));
                        }
                        jSONArrayOptJSONArray = jSONArray;
                        itKeys = it2;
                    }
                }
                linkedHashMap.put(jSONObjectOptJSONObject.optString("type_id"), arrayList2);
                i++;
                jSONArrayOptJSONArray = jSONArrayOptJSONArray;
            }
            return C0552c.q((List<C0550a>) arrayList, (List<C0554e>) new ArrayList(), (LinkedHashMap<String, List<C0551b>>) linkedHashMap);
        } catch (Exception e) {
            SpiderDebug.log(e.toString());
            return "";
        }
    }

    public void init(Context context, String str) {
        try {
            this.a = new JSONObject(str).getString("url");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            String[] strArrSplit = str2.split("\\|");
            if (strArrSplit.length == 5) {
                strArrSplit = (strArrSplit[0] + "|" + strArrSplit[1] + "|" + strArrSplit[2] + "||" + strArrSplit[3] + "|" + strArrSplit[4]).split("\\|");
            }
            String str3 = strArrSplit[0];
            String strOptString = strArrSplit[1];
            String strOptString2 = strArrSplit[2];
            String str4 = strArrSplit[3];
            String str5 = strArrSplit[4];
            String str6 = strArrSplit[5];
            if (!TextUtils.isEmpty(str3)) {
                for (String str7 : str3.split("@")) {
                    if (!TextUtils.isEmpty(str7)) {
                        HashMap map = new HashMap();
                        map.put("Referer", "");
                        String str8 = (System.currentTimeMillis() / 1000) + "";
                        JSONObject jSONObject = new JSONObject(C0575b.l(str7 + strOptString + "&sign=" + a("7gp0bnd2sr85ydii2j32pcypscoc4w6c7g5spl" + str8) + "&timestamp=" + str8, map));
                        strOptString = jSONObject.optString("url");
                        strOptString2 = jSONObject.optString("UA", strOptString2);
                        if (C0529a.m82a(strOptString)) {
                            break;
                        }
                    }
                }
            }
            if (!strOptString.startsWith("http")) {
                return "";
            }
            String str9 = Proxy.getUrl() + "?do=appdanmu&vodName=" + str5 + "&vodIndex=" + str6 + "&vodUrl=";
            HashMap map2 = new HashMap();
            if (!TextUtils.isEmpty(strOptString2)) {
                map2.put("User-Agent", strOptString2);
            }
            C0552c c0552c = new C0552c();
            c0552c.j();
            c0552c.u(strOptString);
            c0552c.a(str9);
            return c0552c.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        String str2 = (System.currentTimeMillis() / 1000) + "";
        HashMap mapC = C0544h.c("timestamp", str2, "sign", a("7gp0bnd2sr85ydii2j32pcypscoc4w6c7g5spl" + str2));
        mapC.put("keyword", str);
        mapC.put("limit", "12");
        mapC.put("page", "1");
        JSONArray jSONArrayOptJSONArray = new JSONObject(a("/v3/home/search", mapC)).optJSONObject("data").optJSONArray("list");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            String strOptString = jSONObjectOptJSONObject.optString("vod_pic");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = jSONObjectOptJSONObject.optString("vod_pic_thumb");
            }
            arrayList.add(new C0554e(jSONObjectOptJSONObject.optString("vod_id"), jSONObjectOptJSONObject.optString("vod_name"), strOptString, jSONObjectOptJSONObject.optString("vod_remarks")));
        }
        return C0552c.n(arrayList);
    }
}
