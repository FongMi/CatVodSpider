package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.b.v;
import com.github.catvod.spider.merge.k.C0575b;
import com.github.catvod.spider.merge.m.C0590I;
import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class TingShijie extends Spider {
    public static String a;

    public static HashMap b() {
        return v.b("User-Agent", "TingShiJie/1.8.8 (m.i275.com)");
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = "1";
            }
            JSONObject jSONObject = new JSONObject(C0575b.l(a + "appHomeByCategory?categoryId=" + str + "&page=" + str2 + "&size=120", b()));
            if (jSONObject.getInt("status") != 0) {
                return "{\"list\":[],\"page\":1,\"pagecount\":1,\"limit\":20,\"total\":0}";
            }
            JSONArray jSONArray = jSONObject.getJSONArray("data");
            if (jSONArray.length() == 0) {
                return "{\"list\":[],\"page\":1,\"pagecount\":1,\"limit\":20,\"total\":0}";
            }
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("vod_id", jSONObject2.optString("id"));
                jSONObject3.put("vod_name", jSONObject2.optString("bookTitle"));
                jSONObject3.put("vod_pic", jSONObject2.optString("bookImage"));
                jSONObject3.put("vod_remarks", jSONObject2.optString("bookAnchor"));
                jSONArray2.put(jSONObject3);
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("list", jSONArray2);
            jSONObject4.put("page", Integer.parseInt(str2));
            jSONObject4.put("pagecount", 100);
            jSONObject4.put("limit", 20);
            jSONObject4.put("total", 2000);
            return jSONObject4.toString();
        } catch (Exception e) {
            return "{\"list\":[],\"page\":1,\"pagecount\":1,\"limit\":20,\"total\":0}";
        }
    }

    public String detailContent(List<String> list) {
        String str = list.get(0);
        try {
            String str2 = a;
            JSONObject jSONObject = new JSONObject(C0575b.l(str2 + "book?bookId=" + str, b()));
            if (jSONObject.getInt("status") != 0) {
                return "{\"list\":[]}";
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("data").getJSONObject("bookData");
            String string = jSONObject2.getString("bookTitle");
            String string2 = jSONObject2.getString("bookDesc");
            String string3 = jSONObject2.getString("bookImage");
            int i = jSONObject2.getInt("count");
            StringBuilder sb = new StringBuilder();
            int i2 = (i + 999) / DescriptorProtos.Edition.EDITION_2023_VALUE;
            for (int i3 = 1; i3 <= i2; i3++) {
                JSONObject jSONObject3 = new JSONObject(C0575b.l(str2 + "chapter?size=1000&page=" + i3 + "&sort=asc&bookId=" + str, b()));
                if (jSONObject3.getInt("status") == 0) {
                    JSONArray jSONArray = jSONObject3.getJSONObject("data").getJSONArray("list");
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i4);
                        if (sb.length() > 0) {
                            sb.append("#");
                        }
                        sb.append(jSONObject4.getInt("position"));
                        sb.append("$");
                        sb.append(str);
                        sb.append("|");
                        sb.append(jSONObject4.getString("chapterId"));
                    }
                }
            }
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("vod_id", str);
            jSONObject5.put("vod_name", string);
            jSONObject5.put("vod_pic", string3);
            jSONObject5.put("vod_play_from", "世界听书");
            jSONObject5.put("vod_play_url", sb.toString());
            jSONObject5.put("vod_content", string2);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONObject5);
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("list", jSONArray2);
            return jSONObject6.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"list\":[]}";
        }
    }

    public String homeContent(boolean z) {
        JSONArray jSONArray = new JSONArray();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(Arrays.asList("6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "49"));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(Arrays.asList("玄幻奇幻", "都市言情", "宫斗女频", "官场商战", "武侠仙侠", "刑侦推理", "探险科幻", "重生穿越", "恐怖惊悚", "文学历史", "两性情感"));
            for (int i = 0; i < arrayList.size(); i++) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type_id", (String) arrayList.get(i));
                jSONObject.put("type_name", (String) arrayList2.get(i));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("class", jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            return "{\"class\":[]}";
        }
    }

    public void init(Context context, String str) {
        try {
            super.init(context, str);
            HashMap map = new HashMap();
            map.put("User-Agent", "TingShiJie/1.8.8 (m.i275.com)");
            String strL = C0575b.l("http://101.43.48.231:8090/config/tingchina2025.txt", map);
            if (TextUtils.isEmpty(strL)) {
                strL = "https://app.365ting.com/listen/Apitzg2025/";
            }
            a = strL;
        } catch (Exception e) {
            e.printStackTrace();
            a = "https://app.365ting.com/listen/Apitzg2025/";
        }
    }

    public String playerContent(String str, String str2, List<String> list) throws JSONException {
        try {
            String str3 = a;
            HashMap mapB = b();
            String[] strArrSplit = str2.split("\\|");
            if (strArrSplit.length >= 2) {
                String str4 = strArrSplit[0];
                String str5 = strArrSplit[1];
                String strValueOf = String.valueOf(System.currentTimeMillis());
                StringBuilder sb = new StringBuilder(str3);
                sb.append("AppGetChapterUrl2023?timeStamp=");
                sb.append(strValueOf);
                sb.append("&uid=&chapterId=");
                sb.append(str5);
                sb.append("&addItParapet=");
                sb.append(C0590I.a(C0590I.a(strValueOf + "J9gSpfUlzYxE8Hn5IXiGaD2jVMrwAm0K") + "J9gSpfUlzYxE8Hn5IXiGaD2jVMrwAm0K"));
                sb.append("&bookId=");
                sb.append(str4);
                JSONObject jSONObject = new JSONObject(C0575b.l(sb.toString(), mapB));
                if (jSONObject.getInt("status") == 0) {
                    String string = jSONObject.getString("src");
                    if (!TextUtils.isEmpty(string)) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("parse", 0);
                        jSONObject2.put("url", string);
                        jSONObject2.put("header", new JSONObject());
                        return jSONObject2.toString();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("parse", 0);
        jSONObject3.put("url", "");
        jSONObject3.put("header", new JSONObject());
        return jSONObject3.toString();
    }

    public String searchContent(String str, boolean z) {
        try {
            String str2 = a;
            JSONObject jSONObject = new JSONObject(C0575b.l(str2 + "appSearch?client=babala-android&search=" + str + "&app_token=abcSEARCH-2025", b()));
            if (jSONObject.getInt("status") != 0) {
                return "{\"list\":[],\"page\":1,\"pagecount\":1,\"limit\":20,\"total\":0}";
            }
            JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("bookData");
            if (jSONArray.length() == 0) {
                return "{\"list\":[],\"page\":1,\"pagecount\":1,\"limit\":20,\"total\":0}";
            }
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("vod_id", jSONObject2.optString("id"));
                jSONObject3.put("vod_name", jSONObject2.optString("bookTitle"));
                jSONObject3.put("vod_pic", jSONObject2.optString("bookImage"));
                jSONObject3.put("vod_remarks", jSONObject2.optString("bookAnchor"));
                jSONArray2.put(jSONObject3);
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("list", jSONArray2);
            jSONObject4.put("page", 1);
            jSONObject4.put("pagecount", 100);
            jSONObject4.put("limit", 20);
            jSONObject4.put("total", 2000);
            return jSONObject4.toString();
        } catch (Exception e) {
            return "{\"list\":[],\"page\":1,\"pagecount\":1,\"limit\":20,\"total\":0}";
        }
    }
}
