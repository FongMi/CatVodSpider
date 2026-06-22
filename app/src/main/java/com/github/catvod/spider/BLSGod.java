package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.*;
import com.github.catvod.spider.merge.q1.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.*;


public class BLSGod extends Spider {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static String baseUrl = "https://www.80sgod.com";

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static String m33(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
            return str + "@Headers=" + jSONObject.toString();
        } catch (Exception e) {
            StringUtils.printStackTrace(e);
            return str;
        }
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private static HashMap<String, String> buildHeader(String str) {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
        map.put("Referer", baseUrl + "/");
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strTrim;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            String strReplace = baseUrl + "/{cateId}--p/" + str2;
            if (z && map != null && map.size() > 0) {
                for (String str3 : map.keySet()) {
                    String str4 = map.get(str3);
                    if (str4.length() > 0) {
                        strReplace = strReplace.replace("{" + str3 + "}", str4);
                    }
                }
            }
            C0035 c0035M884 = C0243.m884(C0287.m1052(strReplace.replaceAll("\\{cateId\\}", str), "utf-8", buildHeader(baseUrl)));
            String[] strArrSplit = ".me1||.me3&&li".split("&&");
            C0011 c0011M1061 = C0287.m1061(strArrSplit[0], c0035M884);
            for (int i = 1; i < strArrSplit.length - 1; i++) {
                c0011M1061 = C0287.m1061(strArrSplit[i], c0011M1061);
            }
            C0455 c0455M1066 = C0287.m1066(c0011M1061, strArrSplit[strArrSplit.length - 1]);
            for (int i2 = 0; i2 < c0455M1066.size(); i2++) {
                C0011 c0011 = c0455M1066.get(i2);
                String strM1693 = c0011.m199("h3").m1693();
                String strTrim2 = C0287.m1059(c0011, "img&&_src||src").trim();
                try {
                    strTrim = C0287.m1059(c0011, "span,-1&&Text").trim();
                } catch (Exception unused) {
                    strTrim = "";
                }
                String strM1686 = c0011.m199("a").m1686("href");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vod_id", strM1686);
                jSONObject2.put("vod_name", strM1693);
                jSONObject2.put("vod_pic", m33(strTrim2));
                jSONObject2.put("vod_remarks", strTrim);
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

    public String detailContent(List<String> list) {
        String str;
        String strM1686;
        String strM1693;
        String strM16932 = null;
        String str2;
        String strD = "li";
        String strD2 = "$$$";
        String strD3 = "jp";
        String strD4 = "utf-8";
        String str3 = "";
        try {
            String str4 = baseUrl + list.get(0);
            C0035 c0035M884 = C0243.m884(C0287.m1052(str4, strD4, buildHeader(baseUrl)));
            try {
                strM1686 = c0035M884.m199("div.img img").m1686("src");
                try {
                    strM1693 = c0035M884.m199(".info>h1").m1693();
                    try {
                        strM16932 = c0035M884.m199("#movie_content").m1693();
                    } catch (Exception unused) {
                        strM16932 = "";
                    }
                } catch (Exception unused2) {
                    strM1693 = "";
                }
            } catch (Exception unused3) {
                strM1686 = "";
                strM1693 = strM1686;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            String[] strArr = {"", "", "mp4", "hd", "bd", "bt", strD3};
            C0455 c0455M199 = c0035M884.m199("ul#cpage>li");
            int i = 0;
            while (i < c0455M199.size()) {
                C0011 c0011 = c0455M199.get(i);
                C0455 c0455 = c0455M199;
                str = str3;
                try {
                    String strM16862 = c0011.m199(strD).m1686("id");
                    String strM16933 = c0011.m199(strD).m1693();
                    int i2 = Integer.parseInt(strM16862.substring(4));
                    StringBuilder sb = new StringBuilder();
                    sb.append(str4);
                    String str5 = strD;
                    sb.append("/");
                    sb.append(strArr[i2]);
                    sb.append("-1");
                    C0455 c0455M1992 = C0243.m884(C0287.m1052(sb.toString(), strD4, buildHeader(baseUrl))).m199("li:has([rel])");
                    if (!strArr[i2].equals(strD3)) {
                        Collections.reverse(c0455M1992);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    String str6 = strD3;
                    int i3 = 0;
                    while (i3 < c0455M1992.size()) {
                        C0011 c00112 = c0455M1992.get(i3);
                        C0455 c04552 = c0455M1992;
                        String str7 = strD4;
                        String strM204 = c00112.m199("span").get(1).m204();
                        String strM16863 = c00112.m199("a").m1686("href");
                        if (strM16863.contains("jianpian")) {
                            StringBuilder sb2 = new StringBuilder();
                            str2 = str4;
                            sb2.append("tvbox-xg:");
                            sb2.append(strM16863.split("path=")[1]);
                            strM16863 = sb2.toString();
                        } else {
                            str2 = str4;
                        }
                        arrayList3.add(strM204 + "$" + strM16863);
                        i3++;
                        c0455M1992 = c04552;
                        strD4 = str7;
                        str4 = str2;
                    }
                    arrayList2.add(TextUtils.join("#", arrayList3));
                    arrayList.add(strM16933);
                    i++;
                    c0455M199 = c0455;
                    str3 = str;
                    strD = str5;
                    strD3 = str6;
                    strD4 = strD4;
                    str4 = str4;
                } catch (Exception e) {
                    e = e;
                    SpiderDebug.log(e);
                    return str;
                }
            }
            str = str3;
            String strJoin = TextUtils.join(strD2, arrayList);
            String strJoin2 = TextUtils.join(strD2, arrayList2);
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("vod_id", list.get(0));
            jSONObject2.put("vod_name", strM1693);
            jSONObject2.put("vod_pic", m33(strM1686));
            jSONObject2.put("vod_content", strM16932);
            jSONObject2.put("vod_play_from", strJoin);
            jSONObject2.put("vod_play_url", strJoin2);
            jSONArray.put(jSONObject2);
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e2) {
            str = str3;
            StringUtils.printStackTrace(e2);
        }
        return "";
    }

    public String homeContent(boolean z) {
        String strD = "&";
        try {
            JSONArray jSONArray = new JSONArray();
            String[] strArrSplit = "电影&剧集&综艺&动漫&音乐MV".split(strD);
            String[] strArrSplit2 = "movie/list/---&ju/list/----0&zy/list/----4&dm/list/----14&mv/list/---".split(strD);
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
            StringUtils.printStackTrace();
            return "";
        }
    }

    public String homeVideoContent() {
        try {
            C0035 c0035M884 = C0243.m884(C0287.m1052(baseUrl, "utf-8", buildHeader(baseUrl)));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            C0455 c0455M199 = c0035M884.m199("div.left li");
            for (int i = 0; i < c0455M199.size(); i++) {
                C0011 c0011 = c0455M199.get(i);
                String strTrim = c0011.m199("h3").m1693().trim();
                String strM33 = m33(c0011.m199("img").m1686("src"));
                String strReplace = c0011.m200("span.tip").m204().replace(strTrim, "");
                String strM1686 = c0011.m199("a").m1686("href");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vod_id", strM1686);
                jSONObject2.put("vod_name", strTrim);
                jSONObject2.put("vod_pic", strM33);
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

    public void init(Context context, String str) throws Exception {
        super.init(context, str);
        if (str.isEmpty()) {
            return;
        }
        baseUrl = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", str2);
            jSONObject.put("parse", 0);
            jSONObject.put("playUrl", "");
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        String strD = "a";
        try {
            JSONArray jSONArray = new JSONArray();
            String str2 = baseUrl + "/search";
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("keyword", str);
            C0455 c0455M199 = C0243.m884(C0287.m1053(str2, linkedHashMap, "utf-8", buildHeader(baseUrl))).m199("ul.search_list li");
            for (int i = 0; i < c0455M199.size(); i++) {
                C0011 c0011 = c0455M199.get(i);
                String strM1693 = c0011.m199(strD).m1693();
                String strM16932 = c0011.m199("em").m1693();
                String strM1686 = c0011.m199(strD).m1686("href");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("vod_id", strM1686);
                jSONObject.put("vod_name", strM1693);
                jSONObject.put("vod_pic", "");
                jSONObject.put("vod_remarks", strM16932);
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
