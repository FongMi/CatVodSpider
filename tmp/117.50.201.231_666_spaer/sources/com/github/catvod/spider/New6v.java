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
import com.github.catvod.spider.merge.A0.yi;
import com.github.catvod.spider.merge.a.C0529a;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class New6v extends Spider {
    public static String a = "http://www.xb6v.com";

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
            String strReplace = "{cateId}";
            if (!str2.equals("1")) {
                strReplace = "{cateId}index_" + str2 + ".html";
                if (str.contains(".html")) {
                    return "";
                }
            }
            if (z && map != null && map.size() > 0) {
                for (String str3 : map.keySet()) {
                    String str4 = map.get(str3);
                    if (str4.length() > 0) {
                        strReplace = strReplace.replace("{" + str3 + "}", str4);
                    }
                }
            }
            String strReplaceAll = strReplace.replaceAll("\\{cateId\\}", str);
            if (!str.contains("http")) {
                strReplaceAll = wh.g(a, strReplaceAll);
            }
            em emVarA = oj.a(wh.e(strReplaceAll, "utf-8", c()));
            int i = 0;
            if (str.contains("/qian")) {
                rp rpVarAh = emVarA.ah("div#tab-content li");
                while (i < rpVarAh.size()) {
                    ed edVar = (ed) rpVarAh.get(i);
                    String strF = edVar.ah("a").f();
                    if (strF.contains("《") && strF.contains("》")) {
                        strF = strF.substring(strF.indexOf("《"));
                    }
                    String strA = edVar.ah("a").a("href");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("vod_id", strA);
                    jSONObject2.put("vod_name", strF);
                    jSONObject2.put("vod_pic", "");
                    jSONObject2.put("vod_remarks", "");
                    jSONArray.put(jSONObject2);
                    i++;
                }
            } else {
                rp rpVarAh2 = emVarA.ah("ul#post_container li");
                while (i < rpVarAh2.size()) {
                    ed edVar2 = (ed) rpVarAh2.get(i);
                    String strF2 = edVar2.ah("h2").f();
                    String strA2 = edVar2.ah("img").a("src");
                    String strF3 = edVar2.ah(".info_date").f();
                    String strA3 = edVar2.ah("a").a("href");
                    rp rpVar = rpVarAh2;
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("vod_id", strA3);
                    jSONObject3.put("vod_name", strF2);
                    jSONObject3.put("vod_pic", b(strA2));
                    jSONObject3.put("vod_remarks", strF3);
                    jSONArray.put(jSONObject3);
                    i++;
                    rpVarAh2 = rpVar;
                }
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
            em emVarA = oj.a(wh.e(wh.g(a, list.get(0)), "utf-8", c()));
            String strAu = ((ed) emVarA.ah("div#post_content img").get(0)).au("src");
            String strF = emVarA.ah("div#content>div>h1").f();
            ArrayList arrayList = new ArrayList();
            try {
                rp rpVarAh = emVarA.ah("div#post_content a[href^=magnet],a[href^=ed2k]");
                for (int i = 0; i < rpVarAh.size(); i++) {
                    ed edVar = (ed) rpVarAh.get(i);
                    String strF2 = edVar.ah("a").f();
                    String strA = edVar.ah("a").a("href");
                    if (strA.startsWith("ed2k:")) {
                        Matcher matcher = Pattern.compile("\\|file\\|(.*?)\\|").matcher(URLDecoder.decode(strA));
                        if (matcher.find()) {
                            strF2 = matcher.group(1);
                        }
                    } else if (strA.startsWith("magnet:")) {
                        Matcher matcher2 = Pattern.compile("(^|&)dn=([^&]*)(&|$)").matcher(URLDecoder.decode(strA));
                        if (matcher2.find()) {
                            strF2 = matcher2.group(2);
                        }
                    }
                    arrayList.add(strF2 + "$" + strA);
                }
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
            String strJoin = arrayList.size() > 0 ? TextUtils.join("#", arrayList) : "";
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("vod_id", list.get(0));
            jSONObject2.put("vod_name", strF);
            jSONObject2.put("vod_pic", b(strAu));
            jSONObject2.put("vod_content", "");
            jSONObject2.put("vod_play_from", "新6V");
            jSONObject2.put("vod_play_url", strJoin);
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
            for (ed edVar : oj.a(wh.e(a, "utf-8", c())).ah("ul#menus a")) {
                String strAk = edVar.ak();
                if (!strAk.contains("首页") && !strAk.contains("最新") && !strAk.contains("旧版")) {
                    String strAu = edVar.au("href");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type_id", strAu);
                    jSONObject.put("type_name", strAk);
                    jSONArray.put(jSONObject);
                }
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
            jSONObject2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
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
        try {
            JSONArray jSONArray = new JSONArray();
            String strConcat = a.concat("/e/search/1index.php");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("show", "title");
            linkedHashMap.put("tempid", "1");
            linkedHashMap.put("tbname", "article");
            linkedHashMap.put("mid", "1");
            linkedHashMap.put("dopost", "search");
            linkedHashMap.put("submit", "");
            linkedHashMap.put("keyboard", str);
            yi.c.clear();
            rp rpVarAh = oj.a(wh.f(strConcat, linkedHashMap, c())).ah("ul#post_container li");
            for (int i = 0; i < rpVarAh.size(); i++) {
                ed edVar = (ed) rpVarAh.get(i);
                String strF = edVar.ah("h2").f();
                if (strF.contains("《") && strF.contains("》")) {
                    strF = strF.substring(strF.indexOf("《"));
                }
                String strA = edVar.ah("img").a("src");
                String strF2 = edVar.ah(".info_date").f();
                String strA2 = edVar.ah("a").a("href");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("vod_id", strA2);
                jSONObject.put("vod_name", strF);
                jSONObject.put("vod_pic", b(strA));
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
