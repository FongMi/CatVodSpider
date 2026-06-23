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
import com.github.catvod.spider.merge.a.C0529a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class BLSGod extends Spider {
    public static String a = "https://www.80sgod.com";

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
        String strTrim;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            String strReplace = a + "/{cateId}--p/" + str2;
            if (z && map != null && map.size() > 0) {
                for (String str3 : map.keySet()) {
                    String str4 = map.get(str3);
                    if (str4.length() > 0) {
                        strReplace = strReplace.replace("{" + str3 + "}", str4);
                    }
                }
            }
            em emVarA = oj.a(wh.e(strReplace.replaceAll("\\{cateId\\}", str), "utf-8", c()));
            String[] strArrSplit = ".me1||.me3&&li".split("&&");
            ed edVarK = wh.k(strArrSplit[0], emVarA);
            for (int i = 1; i < strArrSplit.length - 1; i++) {
                edVarK = wh.k(strArrSplit[i], edVarK);
            }
            String[] strArrSplit2 = strArrSplit[strArrSplit.length - 1].split("\\|\\|");
            rp rpVar = new rp();
            for (String str5 : strArrSplit2) {
                try {
                    rpVar.addAll(wh.o(edVarK, str5));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            for (int i2 = 0; i2 < rpVar.size(); i2++) {
                ed edVar = (ed) rpVar.get(i2);
                String strF = edVar.ah("h3").f();
                String strTrim2 = wh.i(edVar, "img&&_src||src").trim();
                try {
                    strTrim = wh.i(edVar, "span,-1&&Text").trim();
                } catch (Exception unused) {
                    strTrim = "";
                }
                String strA = edVar.ah("a").a("href");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vod_id", strA);
                jSONObject2.put("vod_name", strF);
                jSONObject2.put("vod_pic", b(strTrim2));
                jSONObject2.put("vod_remarks", strTrim);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("page", str2);
            jSONObject.put("pagecount", Integer.MAX_VALUE);
            jSONObject.put("limit", jSONArray.length());
            jSONObject.put("total", Integer.MAX_VALUE);
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String detailContent(List<String> list) {
        String strA;
        String strF;
        String strF2;
        String[] strArr;
        String str = "li";
        String str2 = "utf-8";
        try {
            String str3 = a + list.get(0);
            em emVarA = oj.a(wh.e(str3, "utf-8", c()));
            try {
                strA = emVarA.ah("div.img img").a("src");
                try {
                    strF = emVarA.ah(".info>h1").f();
                } catch (Exception unused) {
                    strF = "";
                }
                try {
                    strF2 = emVarA.ah("#movie_content").f();
                } catch (Exception unused2) {
                    strF2 = "";
                }
            } catch (Exception unused3) {
                strA = "";
                strF = strA;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            String[] strArr2 = {"", "", "mp4", "hd", "bd", "bt", "jp"};
            rp rpVarAh = emVarA.ah("ul#cpage>li");
            int i = 0;
            while (i < rpVarAh.size()) {
                ed edVar = (ed) rpVarAh.get(i);
                rp rpVar = rpVarAh;
                String strA2 = edVar.ah(str).a("id");
                String strF3 = edVar.ah(str).f();
                int i2 = Integer.parseInt(strA2.substring(4));
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                String str4 = str;
                sb.append("/");
                sb.append(strArr2[i2]);
                sb.append("-1");
                rp rpVarAh2 = oj.a(wh.e(sb.toString(), str2, c())).ah("li:has([rel])");
                if (!strArr2[i2].equals("jp")) {
                    Collections.reverse(rpVarAh2);
                }
                ArrayList arrayList3 = new ArrayList();
                String str5 = str2;
                int i3 = 0;
                while (i3 < rpVarAh2.size()) {
                    ed edVar2 = (ed) rpVarAh2.get(i3);
                    rp rpVar2 = rpVarAh2;
                    String str6 = str3;
                    String strAk = ((ed) edVar2.ah("span").get(1)).ak();
                    String strA3 = edVar2.ah("a").a("href");
                    if (strA3.contains("jianpian")) {
                        StringBuilder sb2 = new StringBuilder();
                        strArr = strArr2;
                        sb2.append("tvbox-xg:");
                        sb2.append(strA3.split("path=")[1]);
                        strA3 = sb2.toString();
                    } else {
                        strArr = strArr2;
                    }
                    arrayList3.add(strAk + "$" + strA3);
                    i3++;
                    rpVarAh2 = rpVar2;
                    str3 = str6;
                    strArr2 = strArr;
                }
                arrayList2.add(TextUtils.join("#", arrayList3));
                arrayList.add(strF3);
                i++;
                rpVarAh = rpVar;
                str = str4;
                str2 = str5;
                str3 = str3;
                strArr2 = strArr2;
            }
            String strJoin = TextUtils.join("$$$", arrayList);
            String strJoin2 = TextUtils.join("$$$", arrayList2);
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("vod_id", list.get(0));
            jSONObject2.put("vod_name", strF);
            jSONObject2.put("vod_pic", b(strA));
            jSONObject2.put("vod_content", strF2);
            jSONObject2.put("vod_play_from", strJoin);
            jSONObject2.put("vod_play_url", strJoin2);
            jSONArray.put(jSONObject2);
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String homeContent(boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            String[] strArrSplit = "电影&剧集&综艺&动漫&音乐MV".split("&");
            String[] strArrSplit2 = "movie/list/---&ju/list/----0&zy/list/----4&dm/list/----14&mv/list/---".split("&");
            for (int i = 0; i < strArrSplit.length; i++) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type_id", strArrSplit2[i]);
                jSONObject.put("type_name", strArrSplit[i]);
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("class", jSONArray);
            if (z) {
                jSONObject2.put("filters", new JSONObject("{\"movie/list/---\":[{\"name\":\"分类\",\"value\":[{\"v\":\"\",\"n\":\"全部\"},{\"v\":\"movie/list/---1-\",\"n\":\"国语电影\"},{\"v\":\"movie/list/2----\",\"n\":\"喜剧片\"},{\"v\":\"movie/list/1----\",\"n\":\"动作片\"},{\"v\":\"movie/list/6----\",\"n\":\"恐怖片\"},{\"v\":\"movie/list/3----\",\"n\":\"爱情片\"},{\"v\":\"movie/list/4----\",\"n\":\"科幻片\"}],\"key\":\"cateId\"}],\"dm/list/----14\":[{\"name\":\"分类\",\"value\":[{\"v\":\"\",\"n\":\"全部\"},{\"v\":\"dm/list/l----14\",\"n\":\"连载动漫\"},{\"v\":\"dm/list/j----14\",\"n\":\"剧场版动漫\"}],\"key\":\"cateId\"}],\"ju/list/----0\":[{\"name\":\"分类\",\"value\":[{\"v\":\"\",\"n\":\"全部\"},{\"v\":\"ju/list/----9\",\"n\":\"大陆剧\"},{\"v\":\"ju/list/----11\",\"n\":\"日韩剧\"},{\"v\":\"ju/list/----12\",\"n\":\"欧美剧\"},{\"v\":\"ju/list/----10\",\"n\":\"港台剧\"}],\"key\":\"cateId\"}],\"zy/list/----4\":[],\"mv/list/---\":[]}"));
            }
            return jSONObject2.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String homeVideoContent() {
        try {
            em emVarA = oj.a(wh.e(a, "utf-8", c()));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            rp rpVarAh = emVarA.ah("div.left li");
            for (int i = 0; i < rpVarAh.size(); i++) {
                ed edVar = (ed) rpVarAh.get(i);
                String strTrim = edVar.ah("h3").f().trim();
                String strB = b(edVar.ah("img").a("src"));
                String strReplace = edVar.ai("span.tip").ak().replace(strTrim, "");
                String strA = edVar.ah("a").a("href");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vod_id", strA);
                jSONObject2.put("vod_name", strTrim);
                jSONObject2.put("vod_pic", strB);
                jSONObject2.put("vod_remarks", strReplace);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
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
            jSONObject.put("url", str2);
            jSONObject.put("parse", 0);
            jSONObject.put("playUrl", "");
            return C0529a.addDanmaku(jSONObject.toString());
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String searchContent(String str, boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            String strConcat = a.concat("/search");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("keyword", str);
            rp rpVarAh = oj.a(wh.f(strConcat, linkedHashMap, c())).ah("ul.search_list li");
            for (int i = 0; i < rpVarAh.size(); i++) {
                ed edVar = (ed) rpVarAh.get(i);
                String strF = edVar.ah("a").f();
                String strF2 = edVar.ah("em").f();
                String strA = edVar.ah("a").a("href");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("vod_id", strA);
                jSONObject.put("vod_name", strF);
                jSONObject.put("vod_pic", "");
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
