package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A0.ed;
import com.github.catvod.spider.merge.A0.em;
import com.github.catvod.spider.merge.A0.oj;
import com.github.catvod.spider.merge.A0.rp;
import com.github.catvod.spider.merge.A0.wb;
import com.github.catvod.spider.merge.A0.wh;
import com.github.catvod.spider.merge.A0.ya;
import com.github.catvod.spider.merge.A0.yi;
import com.github.catvod.spider.merge.a.C0529a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class KubaCL extends Spider {
    public static String a = "https://www.kubady.com";

    /* JADX INFO: renamed from: com.github.catvod.spider.KubaCL$1, reason: invalid class name */
    class AnonymousClass1 extends ya {
        @Override // com.github.catvod.spider.merge.A0.xh
        public final void onFailure(Call call, Exception exc) {
        }

        @Override // com.github.catvod.spider.merge.A0.xh
        public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        }
    }

    public static String b(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
            return str + "@Headers=" + jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static HashMap c() {
        HashMap mapF = wb.f("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
        mapF.put("Referer", a.concat("/"));
        return mapF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            String strConcat = a.concat("/vod{cateId}.html");
            if (!str2.equals("1")) {
                strConcat = a + "/vod{cateId}-" + str2 + ".html";
                if (str.contains("vodhtml")) {
                    return "";
                }
            }
            if (z && map != null && map.size() > 0) {
                for (String str3 : map.keySet()) {
                    String str4 = map.get(str3);
                    if (str4.length() > 0) {
                        strConcat = strConcat.replace("{" + str3 + "}", str4);
                    }
                }
            }
            rp rpVarAh = oj.a(yi.k(strConcat.replaceAll("\\{cateId\\}", str), c())).ah("ul.stui-vodlist li");
            for (int i = 0; i < rpVarAh.size(); i++) {
                ed edVar = (ed) rpVarAh.get(i);
                String strF = edVar.ah("h4").f();
                String strG = wh.g(a, edVar.ah(".lazyload").a("data-original"));
                String strF2 = edVar.ah(".pic-text").f();
                String strA = edVar.ah("a").a("href");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vod_id", strA);
                jSONObject2.put("vod_name", strF);
                jSONObject2.put("vod_pic", b(strG));
                jSONObject2.put("vod_remarks", strF2);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("page", str2);
            jSONObject.put("pagecount", Integer.MAX_VALUE);
            jSONObject.put("limit", jSONArray.length());
            jSONObject.put("total", Integer.MAX_VALUE);
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String detailContent(List<String> list) {
        try {
            em emVarA = oj.a(yi.k(wh.g(a, list.get(0)), c()));
            String strG = wh.g(a, emVarA.ah("div.stui-content__thumb>a>img.lazyload").a("data-original"));
            String strF = emVarA.ah("div.stui-content__detail>h3").f();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            try {
                rp rpVarAh = emVarA.ah("ul.downlist");
                int i = 0;
                while (i < rpVarAh.size()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("酷吧列表");
                    int i2 = i + 1;
                    sb.append(i2);
                    String string = sb.toString();
                    String[] strArrSplit = ((String) wh.q(((ed) rpVarAh.get(i)).ah("script").c().trim(), "GvodUrls1 =\"", "\"").get(0)).split("\\#\\#\\#");
                    ArrayList arrayList3 = new ArrayList();
                    for (String str : strArrSplit) {
                        arrayList3.add(str);
                    }
                    Collections.reverse(arrayList3);
                    arrayList2.add(TextUtils.join("#", arrayList3));
                    arrayList.add(string);
                    i = i2;
                }
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
            String strJoin = TextUtils.join("$$$", arrayList);
            String strJoin2 = TextUtils.join("$$$", arrayList2);
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("vod_id", list.get(0));
            jSONObject2.put("vod_name", strF);
            jSONObject2.put("vod_pic", b(strG));
            jSONObject2.put("vod_content", "");
            jSONObject2.put("type_name", "");
            jSONObject2.put("vod_play_from", strJoin);
            jSONObject2.put("vod_play_url", strJoin2);
            jSONArray.put(jSONObject2);
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    public String homeContent(boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            String[] strArrSplit = "4K&电影&电视剧&动漫&纪录片".split("&");
            String[] strArrSplit2 = "topichtml/11&typehtml/1&typehtml/31&typehtml/4&typehtml/16".split("&");
            for (int i = 0; i < strArrSplit.length; i++) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type_id", strArrSplit2[i]);
                jSONObject.put("type_name", strArrSplit[i]);
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("class", jSONArray);
            if (z) {
                jSONObject2.put("filters", new JSONObject("{}"));
            }
            return jSONObject2.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context, str);
        if (str.isEmpty()) {
            return;
        }
        a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("User-Agent", "Mozilla/5.0 (Linux; Android 13; Xiaomi 13 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/113.0.5672.131 Mobile Safari/537.36");
            jSONObject.put("url", str2);
            if (str2.startsWith("tvbox") || str2.startsWith("ed2k")) {
                jSONObject.put("parse", 0);
            } else {
                jSONObject.put("header", jSONObject2.toString());
                jSONObject.put("parse", 1);
            }
            jSONObject.put("playUrl", "");
            return C0529a.addDanmaku(jSONObject.toString());
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String searchContent(String str, boolean z) {
        String strString;
        try {
            JSONArray jSONArray = new JSONArray();
            String strConcat = a.concat("/index.php?m=vod-search");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("wd", str);
            linkedHashMap.put("submit", "");
            HashMap mapC = c();
            try {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1();
                yi.i(yi.f(), strConcat, linkedHashMap, mapC, anonymousClass1);
                strString = ((Response) anonymousClass1.getResult()).body().string();
            } catch (Throwable th) {
                th.printStackTrace();
                strString = null;
            }
            rp rpVarAh = oj.a(strString).ah("ul.stui-vodlist__media li");
            for (int i = 0; i < rpVarAh.size(); i++) {
                ed edVar = (ed) rpVarAh.get(i);
                String strF = edVar.ah("h3").f();
                String strG = wh.g(a, edVar.ah(".lazyload").a("data-original"));
                String strF2 = edVar.ah(".pic-text").f();
                String strA = edVar.ah("a").a("href");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("vod_id", strA);
                jSONObject.put("vod_name", strF);
                jSONObject.put("vod_pic", b(strG));
                jSONObject.put("vod_remarks", strF2);
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("list", jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
