package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.k.C0575b;
import com.github.catvod.spider.merge.m.C0603l;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class Jike extends Pan {
    public static String E(String str) throws JSONException {
        String str2 = "https://api.uuuka.com/api/search?keyword=" + URLEncoder.encode(str) + "&page=1&limit=20";
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36");
        JSONObject jSONObject = new JSONObject(C0575b.l(str2, map));
        if (!jSONObject.getBoolean("success")) {
            return "[]";
        }
        JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("items");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            C0554e c0554e = new C0554e();
            String string = jSONObject2.getString("source_link");
            c0554e.j(string);
            String string2 = jSONObject2.getString("title");
            String str3 = "";
            if (string.contains("pan.quark.cn")) {
                str3 = "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/El1L/1200X800/quark.jpg";
            } else if (string.contains("drive.uc.cn")) {
                str3 = "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/OSYH/1200X800/uc.jpg";
            } else if (string.contains("pan.baidu.com")) {
                str3 = "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/0rBz/1200X800/baidu.jpg";
            } else if (string.contains("www.123")) {
                str3 = "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/wF1k/1200X800/123.jpg";
            } else if (string.contains("cloud.189.cn")) {
                str3 = "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/xiFH/1200X800/189.jpg";
            } else if (string.contains("aliyundrive.com") && string.contains("alipan.com")) {
                str3 = "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/50zE/1200X800/aliyun.jpg";
            }
            int iIndexOf = string2.indexOf("《");
            int iIndexOf2 = string2.indexOf("》");
            if (iIndexOf == -1) {
                c0554e.k(string2);
            } else if (iIndexOf2 == -1 || iIndexOf >= iIndexOf2) {
                int length = string2.length();
                int i2 = iIndexOf + 1;
                if (i2 < length) {
                    c0554e.k(string2.substring(i2, length));
                } else {
                    c0554e.k(string2);
                }
            } else {
                c0554e.k(string2.substring(iIndexOf + 1, iIndexOf2));
            }
            c0554e.o(jSONObject2.getString("update_time"));
            if (TextUtils.isEmpty(str3)) {
                c0554e.l("https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/El1L/1200X800/quark.jpg");
            } else {
                c0554e.l(str3);
            }
            arrayList.add(c0554e);
        }
        return C0552c.n(arrayList);
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        HashMap map2 = new HashMap();
        map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36");
        JSONObject jSONObject2 = new JSONObject(C0575b.l("https://api.uuuka.com/api/contents/" + str + "?page=" + str2 + "&limit=20", map2));
        if (!jSONObject2.getBoolean("success")) {
            jSONObject.put("list", jSONArray);
            jSONObject.put("page", 1);
            jSONObject.put("pagecount", 1);
            jSONObject.put("limit", 20);
            jSONObject.put("total", 0);
            return jSONObject.toString();
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
        JSONArray jSONArray2 = jSONObject3.getJSONArray("items");
        int i = jSONObject3.getInt("total");
        int i2 = jSONObject3.getInt("page");
        int i3 = jSONObject3.getInt("total_pages");
        for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
            JSONObject jSONObject4 = jSONArray2.getJSONObject(i4);
            String string = jSONObject4.getString("source_link");
            String string2 = jSONObject4.getString("title");
            String string3 = jSONObject4.getString("update_time");
            String str3 = "";
            if (string.contains("pan.quark.cn")) {
                str3 = "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/El1L/1200X800/quark.jpg";
            } else if (string.contains("drive.uc.cn")) {
                str3 = "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/OSYH/1200X800/uc.jpg";
            } else if (string.contains("pan.baidu.com")) {
                str3 = "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/0rBz/1200X800/baidu.jpg";
            } else if (string.contains("www.123")) {
                str3 = "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/wF1k/1200X800/123.jpg";
            } else if (string.contains("cloud.189.cn")) {
                str3 = "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/xiFH/1200X800/189.jpg";
            } else if (string.contains("aliyundrive.com") || string.contains("alipan.com")) {
                str3 = "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/50zE/1200X800/aliyun.jpg";
            }
            int iIndexOf = string2.indexOf("《");
            if (iIndexOf != -1) {
                int iIndexOf2 = string2.indexOf("》", iIndexOf);
                if (iIndexOf2 == -1 || iIndexOf2 <= iIndexOf) {
                    int length = string2.length();
                    int i5 = iIndexOf + 1;
                    if (i5 < length) {
                        string2 = string2.substring(i5, length);
                    }
                } else {
                    string2 = string2.substring(iIndexOf + 1, iIndexOf2);
                }
            }
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("vod_id", string);
            jSONObject5.put("vod_name", string2);
            jSONObject5.put("vod_pic", str3);
            jSONObject5.put("vod_remarks", string3);
            jSONArray.put(jSONObject5);
        }
        jSONObject.put("list", jSONArray);
        jSONObject.put("page", i2);
        jSONObject.put("pagecount", i3);
        jSONObject.put("limit", 20);
        jSONObject.put("total", i);
        return jSONObject.toString();
    }

    public String homeContent(boolean z) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        List listAsList = Arrays.asList("movie", "tv", "dongman", "post");
        List listAsList2 = Arrays.asList("电影", "电视剧", "动漫", "短剧");
        for (int i = 0; i < listAsList.size(); i++) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type_id", listAsList.get(i));
            jSONObject.put("type_name", listAsList2.get(i));
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("class", jSONArray);
        jSONObject3.put("filters", jSONObject2);
        return jSONObject3.toString();
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        try {
            super.init(context, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String searchContent(String str, boolean z) {
        C0603l.a("searchvodname", str);
        return E(str);
    }

    public String searchContent(String str, boolean z, String str2) {
        return E(str);
    }
}
