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
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class MeijuMi extends Spider {
    public static String a = "https://www.meijumi.net";

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
        int i;
        int iIndexOf;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            String strReplace = str2.equals("1") ? "{cateId}" : "{cateId}page/" + str2 + "/";
            if (z && map != null && map.size() > 0) {
                for (String str3 : map.keySet()) {
                    String str4 = map.get(str3);
                    if (str4.length() > 0) {
                        strReplace = strReplace.replace("{" + str3 + "}", str4);
                    }
                }
            }
            rp rpVarAh = oj.a(wh.e(strReplace.replaceAll("\\{cateId\\}", str), "utf-8", c())).ah("div#post_list_box article");
            for (int i2 = 0; i2 < rpVarAh.size(); i2++) {
                ed edVar = (ed) rpVarAh.get(i2);
                String strA = edVar.ah("a").a("title");
                int iIndexOf2 = strA.indexOf("《");
                if (iIndexOf2 >= 0 && (iIndexOf = strA.indexOf("》", (i = iIndexOf2 + 1))) >= 0) {
                    strA = strA.substring(i + 0, iIndexOf - i);
                }
                String strTrim = strA.replace("迅雷下载", "").trim();
                String strA2 = edVar.ah("img").a("src");
                String strF = edVar.ah(".gxts").f();
                String strA3 = edVar.ah("a").a("href");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vod_id", strA3);
                jSONObject2.put("vod_name", strTrim);
                jSONObject2.put("vod_pic", b(strA2));
                jSONObject2.put("vod_remarks", strF);
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
            em emVarA = oj.a(wh.e(list.get(0), "utf-8", c()));
            String strAu = ((ed) emVarA.ah("div.single-content img").get(0)).au("src");
            String strTrim = emVarA.ah(".entry-title").f().replace("迅雷下载", "").trim();
            ArrayList arrayList = new ArrayList();
            try {
                rp rpVarAh = emVarA.ah("div.single-content a[href^=magnet],a[href^=ed2k]");
                for (int i = 0; i < rpVarAh.size(); i++) {
                    ed edVar = (ed) rpVarAh.get(i);
                    String strF = edVar.ah("a").f();
                    String strA = edVar.ah("a").a("href");
                    if (strA.startsWith("ed2k:")) {
                        Matcher matcher = Pattern.compile("\\|file\\|(.*?)\\|").matcher(URLDecoder.decode(strA));
                        if (matcher.find()) {
                            strF = matcher.group(1);
                        }
                    } else if (strA.startsWith("magnet:")) {
                        Matcher matcher2 = Pattern.compile("(^|&)dn=([^&]*)(&|$)").matcher(URLDecoder.decode(strA));
                        if (matcher2.find()) {
                            strF = matcher2.group(2);
                        }
                    }
                    arrayList.add(strF + "$" + strA);
                }
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
            String strJoin = arrayList.size() > 0 ? TextUtils.join("#", arrayList) : "";
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("vod_id", list.get(0));
            jSONObject2.put("vod_name", strTrim);
            jSONObject2.put("vod_pic", b(strAu));
            jSONObject2.put("vod_content", "");
            jSONObject2.put("vod_play_from", "美剧迷");
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
            for (ed edVar : oj.a(wh.e(a, "utf-8", c())).ah("ul.nav-menu a")) {
                String strAk = edVar.ak();
                if (!strAk.contains("更新") && !strAk.contains("推荐") && !strAk.contains("首页") && !strAk.contains("韩剧") && !strAk.contains("即将")) {
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
            rp rpVarAh = oj.a(wh.e(a + "/?s=" + URLEncoder.encode(str), "utf-8", c())).ah("ul.search-page article");
            for (int i = 0; i < rpVarAh.size(); i++) {
                ed edVar = (ed) rpVarAh.get(i);
                String strTrim = edVar.ah("a").a("title").replace("迅雷下载", "").trim();
                String strA = edVar.ah("img").a("src");
                String strF = edVar.ah(".gxts").f();
                String strA2 = edVar.ah("a").a("href");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("vod_id", strA2);
                jSONObject.put("vod_name", strTrim);
                jSONObject.put("vod_pic", b(strA));
                jSONObject.put("vod_remarks", strF);
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
