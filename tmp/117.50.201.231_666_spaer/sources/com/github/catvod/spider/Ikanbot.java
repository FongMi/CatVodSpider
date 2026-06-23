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
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class Ikanbot extends Spider {
    public static String a = "https://v.ikanbot.com";
    public String b = "";

    public static String d(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("@Headers=");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("User-Agent", "Mozilla/5.0 (Linux; Android 13; V2049A Build/TP1A.220624.014; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/116.0.0.0 Mobile Safari/537.36");
            jSONObject.put("Referer", "https://www.douban.com");
            sb.append(jSONObject.toString());
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static String get_tks(String str, String str2) {
        try {
            int length = str.length();
            String[] strArrSplit = str.substring(length - 4, length).split("");
            StringBuilder sb = new StringBuilder();
            for (String str3 : strArrSplit) {
                if (!str3.isEmpty()) {
                    int i = Integer.parseInt(str3) % 3;
                    int i2 = i + 1;
                    int i3 = i + 9;
                    sb.append(str2.substring(i2, i3));
                    str2 = str2.substring(i3, str2.length());
                }
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public final String c(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("@Headers=");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("User-Agent", "Mozilla/5.0 (Linux; Android 13; V2049A Build/TP1A.220624.014; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/116.0.0.0 Mobile Safari/537.36");
            jSONObject.put("Referer", "https://www.douban.com");
            sb.append(jSONObject.toString());
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strF;
        String strA;
        rp rpVar;
        String str3 = str;
        try {
            String strReplace = a + "/{cateId}.html";
            if (str3.contains("kanlist")) {
                strReplace = a + "/{cateId}-p-" + str2 + ".html";
            }
            if (str3.contains("article")) {
                strReplace = a + str3;
            }
            if (!str2.equals("1")) {
                strReplace = a + "/{cateId}-p-" + str2 + ".html";
                if (str3.contains("billboard") || str3.contains("article")) {
                    return "";
                }
            }
            if (z && map != null && map.size() > 0) {
                for (String str4 : map.keySet()) {
                    String str5 = map.get(str4);
                    if (str5.length() > 0) {
                        strReplace = strReplace.replace("{" + str4 + "}", str5);
                    }
                }
            }
            em emVarA = oj.a(yi.k(strReplace.replaceAll("\\{cateId\\}", str3), m4d(a)));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            rp rpVarAh = str3.contains("kanlist") ? emVarA.ah("div.reslut-list div.media") : (str3.contains("billboard") || str3.contains("article")) ? emVarA.ah("div#video-list div.item") : emVarA.ah("div.v-list div.item");
            int i = 0;
            while (i < rpVarAh.size()) {
                ed edVar = (ed) rpVarAh.get(i);
                if (str3.contains("kanlist")) {
                    strF = edVar.ah("h5").f();
                    strA = edVar.ah("img").a("data-src");
                } else if (str3.contains("billboard") || str3.contains("article")) {
                    strF = edVar.ah(".title").f();
                    strA = edVar.ah("img").a("data-src");
                } else {
                    strF = edVar.ah("p").f();
                    strA = edVar.ah("img").a("data-src");
                }
                String strA2 = edVar.ah("a").a("href");
                JSONObject jSONObject2 = new JSONObject();
                if (str3.contains("kanlist")) {
                    rpVar = rpVarAh;
                    jSONObject2.put("vod_tag", "folder");
                    jSONObject2.put("vod_id", strA2);
                } else {
                    rpVar = rpVarAh;
                    jSONObject2.put("vod_tag", "file");
                    StringBuilder sb = new StringBuilder();
                    sb.append(strA2);
                    sb.append("$$$");
                    sb.append(strF);
                    sb.append("$$$");
                    strA = d(strA);
                    sb.append(strA);
                    jSONObject2.put("vod_id", sb.toString());
                }
                jSONObject2.put("vod_name", strF);
                jSONObject2.put("vod_pic", strA);
                jSONArray.put(jSONObject2);
                i++;
                str3 = str;
                rpVarAh = rpVar;
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

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public final HashMap m4d(String str) {
        HashMap mapF = wb.f("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36 Edg/110.0.1587.57");
        mapF.put("Referer", a);
        return mapF;
    }

    public String detailContent(List<String> list) {
        JSONArray jSONArray;
        try {
            String[] strArrSplit = list.get(0).split("\\$\\$\\$");
            String str = a + strArrSplit[0];
            String strK = yi.k(str, m4d(a));
            String str2 = (String) wh.q(strK, "id=\"current_id\" value=\"", "\"").get(0);
            String str3 = (String) wh.q(strK, "id=\"mtype\" value=\"", "\"").get(0);
            String str4 = (String) wh.q(strK, "id=\"e_token\" value=\"", "\"").get(0);
            em emVarA = oj.a(strK);
            String strF = emVarA.ah("div.detail > .year").f();
            String strF2 = emVarA.ah("div.detail > .country").f();
            String strF3 = emVarA.ah("div.detail > .celebrity").f();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vod_year", strF);
            jSONObject.put("vod_area", strF2);
            jSONObject.put("vod_actor", strF3);
            jSONObject.put("vod_id", list.get(0));
            jSONObject.put("vod_name", strArrSplit[1]);
            jSONObject.put("vod_pic", strArrSplit[2]);
            jSONObject.put("vod_content", "");
            jSONObject.put("type_name", "");
            jSONObject.put("vod_remarks", "");
            jSONObject.put("vod_director", "");
            HashMap mapM4d = m4d(a);
            mapM4d.put("Accept", "*/*");
            mapM4d.put("Referer", str);
            mapM4d.put("X-Requested-With", "XMLHttpRequest");
            String strK2 = yi.k(a + "/api/getResN?videoId=" + str2 + "&mtype=" + str3 + "&token=" + get_tks(str2, str4), mapM4d);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArray2 = new JSONObject(strK2).getJSONObject("data").getJSONArray("list");
            int i = 0;
            while (i < jSONArray2.length()) {
                ArrayList arrayList3 = new ArrayList();
                String strOptString = jSONArray2.getJSONObject(i).optString("resData", "");
                if (strOptString.isEmpty()) {
                    jSONArray = jSONArray2;
                } else {
                    JSONArray jSONArray3 = new JSONArray(strOptString);
                    String strOptString2 = jSONArray3.getJSONObject(0).optString("flag");
                    arrayList2.add(strOptString2.replace("m3u8", "线路"));
                    int i2 = 0;
                    while (i2 < jSONArray3.length()) {
                        String strOptString3 = jSONArray3.getJSONObject(i2).optString("url");
                        StringBuilder sb = new StringBuilder();
                        sb.append("\\$");
                        sb.append(strOptString2);
                        sb.append("\\#");
                        arrayList3.add(strOptString3.replaceAll(sb.toString(), "").replaceAll("\\$" + strOptString2, ""));
                        i2++;
                        jSONArray2 = jSONArray2;
                    }
                    jSONArray = jSONArray2;
                    arrayList.add(TextUtils.join("#", arrayList3));
                }
                i++;
                jSONArray2 = jSONArray;
            }
            if (this.b.contains("[排序:")) {
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                for (String str5 : this.b.split("\\[排序:")[1].split("\\]")[0].split(",")) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        if (((String) arrayList2.get(i3)).contains(str5)) {
                            arrayList5.add((String) arrayList2.get(i3));
                            arrayList4.add((String) arrayList.get(i3));
                            arrayList2.remove(i3);
                            arrayList.remove(i3);
                        }
                    }
                }
                arrayList.addAll(0, arrayList4);
                arrayList2.addAll(0, arrayList5);
            }
            String strJoin = TextUtils.join("$$$", arrayList2);
            String strJoin2 = TextUtils.join("$$$", arrayList);
            jSONObject.put("vod_play_from", strJoin);
            jSONObject.put("vod_play_url", strJoin2);
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray4 = new JSONArray();
            jSONArray4.put(jSONObject);
            jSONObject2.put("list", jSONArray4);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String e(String str, String str2) {
        try {
            String str3 = a + "/search?q=" + URLEncoder.encode(str);
            if (!str2.equals("1")) {
                str3 = a + "/search?q=" + URLEncoder.encode(str) + "&p=" + str2;
            }
            em emVarA = oj.a(yi.k(str3, m4d(a)));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            rp rpVarAh = emVarA.ah("body .media");
            for (int i = 0; i < rpVarAh.size(); i++) {
                ed edVar = (ed) rpVarAh.get(i);
                String strTrim = edVar.ah(".title-text").f().replaceAll("\\s\\d{4}$", "").trim();
                String strA = edVar.ah("img").a("data-src");
                String strAk = edVar.ai("span.label").ak();
                String strA2 = edVar.ah("a").a("href");
                JSONObject jSONObject2 = new JSONObject();
                StringBuilder sb = new StringBuilder();
                sb.append(strA2);
                sb.append("$$$");
                sb.append(strTrim);
                sb.append("$$$");
                String strD = d(strA);
                sb.append(strD);
                jSONObject2.put("vod_id", sb.toString());
                jSONObject2.put("vod_name", strTrim);
                jSONObject2.put("vod_pic", strD);
                jSONObject2.put("vod_tag", "file");
                jSONObject2.put("vod_remarks", strAk);
                jSONArray.put(jSONObject2);
            }
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
            String[] strArrSplit = "电影&剧集&榜单&片单".split("&");
            String[] strArrSplit2 = "hot/index-movie-热门&hot/index-tv-热门&billboard&kanlist/全部".split("&");
            for (int i = 0; i < strArrSplit.length; i++) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type_id", strArrSplit2[i]);
                jSONObject.put("type_name", strArrSplit[i]);
                if (strArrSplit[i].contains("片单")) {
                    jSONObject.put("type_flag", "2");
                }
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("class", jSONArray);
            jSONObject2.put("filters", new JSONObject("{\"kanlist/全部\":[{\"name\":\"分类\",\"value\":[{\"v\":\"\",\"n\":\"全部\"},{\"v\":\"kanlist/剧情\",\"n\":\"剧情\"},{\"v\":\"kanlist/情感\",\"n\":\"情感\"},{\"v\":\"kanlist/治愈\",\"n\":\"治愈\"},{\"v\":\"kanlist/爱情\",\"n\":\"爱情\"},{\"v\":\"kanlist/颁奖\",\"n\":\"颁奖\"},{\"v\":\"kanlist/喜剧\",\"n\":\"喜剧\"},{\"v\":\"kanlist/获奖\",\"n\":\"获奖\"},{\"v\":\"kanlist/ 科幻\",\"n\":\"科幻\"},{\"v\":\"kanlist/漫威\",\"n\":\"漫威\"},{\"v\":\"kanlist/甜蜜\",\"n\":\"甜蜜\"},{\"v\":\"kanlist/悬疑\",\"n\":\"悬疑\"},{\"v\":\"kanlist/励志\",\"n\":\"励志\"},{\"v\":\"kanlist/烧脑\",\"n\":\"烧脑\"},{\"v\":\"kanlist/友情\",\"n\":\"友情\"}],\"key\":\"cateId\"}],\"billboard\":[],\"hot/index-movie-热门\":[{\"name\":\"分类\",\"value\":[{\"v\":\"\",\"n\":\"全部\"},{\"v\":\"hot/index-movie-最新\",\"n\":\"最新\"},{\"v\":\"hot/index-movie-经典\",\"n\":\"经典\"},{\"v\":\"hot/index-movie-豆瓣高 分\",\"n\":\"豆瓣高分\"},{\"v\":\"hot/index-movie-冷门佳片\",\"n\":\"冷 门佳片\"},{\"v\":\"hot/index-movie-华语\",\"n\":\"华语\"},{\"v\":\"hot/index-movie-欧美\",\"n\":\"欧美\"},{\"v\":\"hot/index-movie-韩国\",\"n\":\"韩国\"},{\"v\":\"hot/index-movie-日本\",\"n\":\"日本\"},{\"v\":\"hot/index-movie-动作\",\"n\":\"动作\"},{\"v\":\"hot/index-movie-喜剧\",\"n\":\"喜剧\"},{\"v\":\"hot/index-movie-爱情\",\"n\":\"爱情\"},{\"v\":\"hot/index-movie-科幻\",\"n\":\"科幻\"},{\"v\":\"hot/index-movie-悬疑\",\"n\":\"悬疑\"},{\"v\":\"hot/index-movie-恐怖\",\"n\":\"恐怖\"},{\"v\":\"hot/index-movie-成长\",\"n\":\"成长\"},{\"v\":\"hot/index-movie-豆瓣top250\",\"n\":\"豆瓣top250\"}],\"key\":\"cateId\"}],\"hot/index-tv-热门\":[{\"name\":\"分类\",\"value\":[{\"v\":\"\",\"n\":\"全部\"},{\"v\":\"hot/index-tv-美剧\",\"n\":\"美剧\"},{\"v\":\"hot/index-tv-英剧\",\"n\":\"英剧\"},{\"v\":\"hot/index-tv-韩剧\",\"n\":\"韩剧\"},{\"v\":\"hot/index-tv-日剧\",\"n\":\"日剧\"},{\"v\":\"hot/index-tv-国产剧\",\"n\":\"国产剧\"},{\"v\":\"hot/index-tv-港剧\",\"n\":\"港剧\"},{\"v\":\"hot/index-tv-日本动画\",\"n\":\"日本动画\"},{\"v\":\"hot/index-tv-综艺\",\"n\":\"综艺\"},{\"v\":\"hot/index-tv-纪录片\",\"n\":\"纪录片\"}],\"key\":\"cateId\"}]}"));
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String homeVideoContent() {
        try {
            String str = a;
            em emVarA = oj.a(yi.k(str, m4d(str)));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            rp rpVarAh = emVarA.ah("body div.v-list");
            for (int i = 0; i < rpVarAh.size(); i++) {
                rp rpVarAh2 = ((ed) rpVarAh.get(i)).ah("div.item");
                for (int i2 = 0; i2 < rpVarAh2.size(); i2++) {
                    ed edVar = (ed) rpVarAh2.get(i2);
                    String strF = edVar.ah("p").f();
                    String strA = edVar.ah("img").a("data-src");
                    String strA2 = edVar.ah("a").a("href");
                    JSONObject jSONObject2 = new JSONObject();
                    StringBuilder sb = new StringBuilder();
                    sb.append(strA2);
                    sb.append("$$$");
                    sb.append(strF);
                    sb.append("$$$");
                    String strD = d(strA);
                    sb.append(strD);
                    jSONObject2.put("vod_id", sb.toString());
                    jSONObject2.put("vod_name", strF);
                    jSONObject2.put("vod_pic", strD);
                    jSONArray.put(jSONObject2);
                }
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
        if (str.startsWith("http")) {
            a = str.split("\\[")[0];
        }
        if (str.contains("[排序:")) {
            this.b = "[" + str.split("\\[")[1];
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("url", str2);
            jSONObject2.put("parse", 0);
            jSONObject2.put("playUrl", "");
            jSONObject2.put("header", jSONObject.toString());
            return C0529a.addDanmaku(jSONObject2.toString());
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        return e(str, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        return e(str, str2);
    }
}
