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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class Xunlei8 extends Spider {
    public static String a = "https://xunlei8.cc";

    public static String b(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36");
            jSONObject.put("Referer", a);
            return str + "@Headers=" + jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static HashMap c() {
        HashMap mapF = wb.f("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36");
        mapF.put("Referer", a.concat("/"));
        return mapF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            String[] strArr = {"", "0", "0", "0", "date", ""};
            strArr[0] = str;
            strArr[5] = str2;
            if (map != null && map.size() > 0) {
                for (String str3 : map.keySet()) {
                    strArr[Integer.parseInt(str3)] = map.get(str3);
                }
            }
            String strG = a + "/" + TextUtils.join("-", strArr) + "-30.html";
            if (!str.contains("http")) {
                strG = wh.g(a, strG);
            }
            rp rpVarAh = oj.a(wh.e(strG, "utf-8", c())).ah("div.bc3ba");
            for (int i = 0; i < rpVarAh.size(); i++) {
                ed edVar = (ed) rpVarAh.get(i);
                String strA = edVar.ah("a").a("title");
                String strA2 = edVar.ah("img").a("src");
                String strF = edVar.ah(".b9b4a").f();
                String strA3 = edVar.ah("a").a("href");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vod_id", strA3);
                jSONObject2.put("vod_name", strA);
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
            em emVarA = oj.a(wh.e(wh.g(a, list.get(0)), "utf-8", c()));
            String strAu = ((ed) emVarA.ah("div.ba330 img").get(0)).au("src");
            String strF = emVarA.ah("div.b586afc9>h1").f();
            ArrayList arrayList = new ArrayList();
            try {
                rp rpVarAh = emVarA.ah("div.bf8243b9 li");
                Collections.reverse(rpVarAh);
                for (int i = 0; i < rpVarAh.size(); i++) {
                    ed edVar = (ed) rpVarAh.get(i);
                    String strF2 = edVar.ah("a").f();
                    String strA = edVar.ah("a").a("href");
                    if (!strA.isEmpty() && !strA.startsWith("http")) {
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
            jSONObject2.put("vod_play_from", "迅雷电影天堂");
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
            String[] strArrSplit = "电影&电视剧".split("&");
            String[] strArrSplit2 = "list&tv".split("&");
            for (int i = 0; i < strArrSplit.length; i++) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type_id", strArrSplit2[i]);
                jSONObject.put("type_name", strArrSplit[i]);
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("class", jSONArray);
            if (z) {
                jSONObject2.put("filters", new JSONObject("{\"tv\":[{\"name\":\"类型\",\"value\":[{\"v\":\"0\",\"n\":\"全部\"},{\"v\":\"科 幻\",\"n\":\"科幻\"},{\"v\":\"悬疑\",\"n\":\"悬疑\"},{\"v\":\"情色\",\"n\":\"情 色\"},{\"v\":\"恐怖\",\"n\":\"恐怖\"},{\"v\":\"奇幻\",\"n\":\"奇幻\"},{\"v\":\" 喜剧\",\"n\":\"喜剧\"},{\"v\":\"战争\",\"n\":\"战争\"},{\"v\":\"动作\",\"n\":\" 动作\"},{\"v\":\"动画\",\"n\":\"动画\"},{\"v\":\"冒险\",\"n\":\"冒险\"},{\"v\":\"爱情\",\"n\":\"爱情\"},{\"v\":\"武侠\",\"n\":\"武侠\"},{\"v\":\"犯罪\",\"n\":\"犯罪\"},{\"v\":\"惊悚\",\"n\":\"惊悚\"},{\"v\":\"剧情\",\"n\":\"剧情\"},{\"v\":\"纪录片\",\"n\":\"纪录片\"},{\"v\":\"运动\",\"n\":\"运动\"},{\"v\":\"历史\",\"n\":\"历史\"},{\"v\":\"西部\",\"n\":\"西部\"},{\"v\":\"家庭\",\"n\":\"家庭\"},{\"v\":\"音乐\",\"n\":\"音乐\"},{\"v\":\"同性\",\"n\":\"同性\"}],\"key\":\"1\"},{\"name\":\"地区\",\"value\":[{\"v\":\"0\",\"n\":\"全部\"},{\"v\":\"美国\",\"n\":\"美国\"},{\"v\":\"中国大陆\",\"n\":\"中国大陆\"},{\"v\":\"韩国\",\"n\":\"韩国\"},{\"v\":\"日本\",\"n\":\"日本\"},{\"v\":\"英国\",\"n\":\"英国\"},{\"v\":\"印度\",\"n\":\"印度\"},{\"v\":\"法国\",\"n\":\"法国\"},{\"v\":\"俄罗斯\",\"n\":\"俄罗斯\"},{\"v\":\"加拿大\",\"n\":\"加拿大\"},{\"v\":\"德国\",\"n\":\"德 \"},{\"v\":\"泰国\",\"n\":\"泰国\"},{\"v\":\"西班牙\",\"n\":\"西班牙\"},{\"v\":\"澳大利亚\",\"n\":\"澳大利亚\"},{\"v\":\"意大利\",\"n\":\"意大利\"},{\"v\":\"比利时\",\"n\":\"比利时\"},{\"v\":\"中国台湾\",\"n\":\"中国台湾\"},{\"v\":\"中国香港\",\"n\":\"中国香港\"}],\"key\":\"3\"},{\"name\":\"年份\",\"value\":[{\"v\":\"0\",\"n\":\"全部\"},{\"v\":\"2026\",\"n\":\"2026\"},{\"v\":\"2025\",\"n\":\"2025\"},{\"v\":\"2024\",\"n\":\"2024\"},{\"v\":\"2023\",\"n\":\"2023\"},{\"v\":\"2022\",\"n\":\"2022\"},{\"v\":\"2021\",\"n\":\"2021\"},{\"v\":\"2020\",\"n\":\"2020\"},{\"v\":\"2019\",\"n\":\"2019\"},{\"v\":\"2018\",\"n\":\"2018\"},{\"v\":\"2017\",\"n\":\"2017\"},{\"v\":\"2016\",\"n\":\"2016\"},{\"v\":\"2015\",\"n\":\"2015\"},{\"v\":\"2014\",\"n\":\"2014\"},{\"v\":\"2013\",\"n\":\"2013\"},{\"v\":\"2012\",\"n\":\"2012\"},{\"v\":\"2011\",\"n\":\"2011\"},{\"v\":\"2010\",\"n\":\"2010\"},{\"v\":\"2009\",\"n\":\"2009\"},{\"v\":\"2008\",\"n\":\"2008\"},{\"v\":\"更早\",\"n\":\"更早\"}],\"key\":\"2\"},{\"name\":\"排序\",\"value\":[{\"v\":\"date\",\"n\":\"默认\"},{\"v\":\"date\",\"n\":\"最近更新\"},{\"v\":\"hot\",\"n\":\"精彩热播\"},{\"v\":\"rating\",\"n\":\"高分好评\"}],\"key\":\"4\"}],\"list\":[{\"name\":\"类 型\",\"value\":[{\"v\":\"0\",\"n\":\"全部\"},{\"v\":\"科幻\",\"n\":\"科幻\"},{\"v\":\"悬疑\",\"n\":\"悬疑\"},{\"v\":\"情色\",\"n\":\"情色\"},{\"v\":\"恐怖\",\"n\":\"恐怖\"},{\"v\":\"奇幻\",\"n\":\"奇幻\"},{\"v\":\"喜剧\",\"n\":\"喜剧\"},{\"v\":\"战争\",\"n\":\"战争\"},{\"v\":\"动作\",\"n\":\"动作\"},{\"v\":\"动画\",\"n\":\"动画\"},{\"v\":\"冒险\",\"n\":\"冒险\"},{\"v\":\"爱情\",\"n\":\"爱情\"},{\"v\":\"武侠\",\"n\":\"武侠\"},{\"v\":\"犯罪\",\"n\":\"犯罪\"},{\"v\":\"惊悚\",\"n\":\"惊悚\"},{\"v\":\"剧情\",\"n\":\"剧情\"},{\"v\":\"纪录片\",\"n\":\"纪录片\"},{\"v\":\"运动\",\"n\":\"运动\"},{\"v\":\"历史\",\"n\":\"历史\"},{\"v\":\"西部\",\"n\":\"西部\"},{\"v\":\"家庭\",\"n\":\"家庭\"},{\"v\":\"音乐\",\"n\":\"音乐\"},{\"v\":\"同性\",\"n\":\"同性\"}],\"key\":\"1\"},{\"name\":\"地区\",\"value\":[{\"v\":\"0\",\"n\":\"全部\"},{\"v\":\"美国\",\"n\":\"美国\"},{\"v\":\"中国 大陆\",\"n\":\"中国大陆\"},{\"v\":\"韩国\",\"n\":\"韩国\"},{\"v\":\"日本\",\"n\":\"日本\"},{\"v\":\"英国\",\"n\":\"英国\"},{\"v\":\"印度\",\"n\":\"印度\"},{\"v\":\"法国\",\"n\":\"法国\"},{\"v\":\"俄罗斯\",\"n\":\"俄罗斯\"},{\"v\":\"加拿大\",\"n\":\"加拿大\"},{\"v\":\"德国\",\"n\":\"德国\"},{\"v\":\"泰国\",\"n\":\" 泰国\"},{\"v\":\"西班牙\",\"n\":\"西班牙\"},{\"v\":\"澳大利亚\",\"n\":\"澳大利亚\"},{\"v\":\"意大利\",\"n\":\"意大利\"},{\"v\":\"比利时\",\"n\":\"比利 \"},{\"v\":\"中国台湾\",\"n\":\"中国台湾\"},{\"v\":\"中国香港\",\"n\":\"中国 香港\"}],\"key\":\"3\"},{\"name\":\"年份\",\"value\":[{\"v\":\"0\",\"n\":\" 全部\"},{\"v\":\"2026\",\"n\":\"2026\"},{\"v\":\"2025\",\"n\":\"2025\"},{\"v\":\"2024\",\"n\":\"2024\"},{\"v\":\"2023\",\"n\":\"2023\"},{\"v\":\"2022\",\"n\":\"2022\"},{\"v\":\"2021\",\"n\":\"2021\"},{\"v\":\"2020\",\"n\":\"2020\"},{\"v\":\"2019\",\"n\":\"2019\"},{\"v\":\"2018\",\"n\":\"2018\"},{\"v\":\"2017\",\"n\":\"2017\"},{\"v\":\"2016\",\"n\":\"2016\"},{\"v\":\"2015\",\"n\":\"2015\"},{\"v\":\"2014\",\"n\":\"2014\"},{\"v\":\"2013\",\"n\":\"2013\"},{\"v\":\"2012\",\"n\":\"2012\"},{\"v\":\"2011\",\"n\":\"2011\"},{\"v\":\"2010\",\"n\":\"2010\"},{\"v\":\"2009\",\"n\":\"2009\"},{\"v\":\"2008\",\"n\":\"2008\"},{\"v\":\"更早\",\"n\":\"更早\"}],\"key\":\"2\"},{\"name\":\"排序\",\"value\":[{\"v\":\"date\",\"n\":\"默认\"},{\"v\":\"date\",\"n\":\"最近更新\"},{\"v\":\"hot\",\"n\":\"精彩热播\"},{\"v\":\"rating\",\"n\":\"高分好评\"}],\"key\":\"4\"}]}"));
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
            jSONObject2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36");
            jSONObject.put("url", str2);
            if (str2.startsWith("tvbox") || str2.startsWith("ed2k") || str2.startsWith("thunder")) {
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
            rp rpVarAh = oj.a(wh.e(a + "/s/" + str + ".html", "utf-8", c())).ah("div.b59a2b64df1");
            for (int i = 0; i < rpVarAh.size(); i++) {
                ed edVar = (ed) rpVarAh.get(i);
                String strAk = edVar.ai("h2").ak();
                String strAu = edVar.ai("img").au("src");
                String strAu2 = edVar.ai("a").au("href");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("vod_id", strAu2);
                jSONObject.put("vod_name", strAk);
                jSONObject.put("vod_pic", b(strAu));
                jSONObject.put("vod_remarks", "");
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
