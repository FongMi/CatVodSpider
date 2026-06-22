package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.*;
import com.github.catvod.spider.merge.q1.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class New6v extends Spider {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static String f39 = "http://www.xb6v.com";

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static String m46(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
            return str + "@Headers=" + jSONObject.toString();
        } catch (Exception e) {
            StringUtils.printStackTrace();
            return str;
        }
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private static HashMap<String, String> m47(String str) {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
        map.put("Referer", f39 + "/");
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strD = "《";
        String strD2 = ".html";
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            String strD3 = "{cateId}";
            if (!str2.equals("1")) {
                strD3 = "{cateId}index_" + str2 + strD2;
                if (str.contains(strD2)) {
                    return "";
                }
            }
            if (z && map != null && map.size() > 0) {
                for (String str3 : map.keySet()) {
                    String str4 = map.get(str3);
                    if (str4.length() > 0) {
                        strD3 = strD3.replace("{" + str3 + "}", str4);
                    }
                }
            }
            String strReplaceAll = strD3.replaceAll("\\{cateId\\}", str);
            if (!str.contains("http")) {
                strReplaceAll = C0287.m1054(f39, strReplaceAll);
            }
            C0035 c0035M884 = C0243.m884(C0287.m1052(strReplaceAll, "utf-8", m47(f39)));
            boolean zContains = str.contains("/qian");
            String strD4 = "vod_remarks";
            String strD5 = "vod_pic";
            String strD6 = "vod_name";
            String strD7 = "vod_id";
            String strD8 = "href";
            int i = 0;
            String strD9 = "a";
            if (zContains) {
                C0455 c0455M199 = c0035M884.m199("div#tab-content li");
                while (i < c0455M199.size()) {
                    C0011 c0011 = c0455M199.get(i);
                    String strM1693 = c0011.m199(strD9).m1693();
                    if (strM1693.contains(strD) && strM1693.contains("》")) {
                        strM1693 = strM1693.substring(strM1693.indexOf(strD));
                    }
                    String strM1686 = c0011.m199(strD9).m1686(strD8);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(strD7, strM1686);
                    jSONObject2.put(strD6, strM1693);
                    jSONObject2.put(strD5, "");
                    jSONObject2.put(strD4, "");
                    jSONArray.put(jSONObject2);
                    i++;
                }
            } else {
                C0455 c0455M1992 = c0035M884.m199("ul#post_container li");
                while (i < c0455M1992.size()) {
                    C0011 c00112 = c0455M1992.get(i);
                    String strM16932 = c00112.m199("h2").m1693();
                    String strM16862 = c00112.m199("img").m1686("src");
                    String strM16933 = c00112.m199(".info_date").m1693();
                    String strM16863 = c00112.m199(strD9).m1686(strD8);
                    C0455 c0455 = c0455M1992;
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(strD7, strM16863);
                    jSONObject3.put(strD6, strM16932);
                    jSONObject3.put(strD5, m46(strM16862));
                    jSONObject3.put(strD4, strM16933);
                    jSONArray.put(jSONObject3);
                    i++;
                    c0455M1992 = c0455;
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

    public String detailContent(List<String> list) {
        String strD = "a";
        try {
            C0035 c0035M884 = C0243.m884(C0287.m1052(C0287.m1054(f39, list.get(0)), "utf-8", m47(f39)));
            String strMo117 = c0035M884.m199("div#post_content img").get(0).mo117("src");
            String strM1693 = c0035M884.m199("div#content>div>h1").m1693();
            ArrayList arrayList = new ArrayList();
            try {
                C0455 c0455M199 = c0035M884.m199("div#post_content a[href^=magnet],a[href^=ed2k]");
                for (int i = 0; i < c0455M199.size(); i++) {
                    C0011 c0011 = c0455M199.get(i);
                    String strM16932 = c0011.m199(strD).m1693();
                    String strM1686 = c0011.m199(strD).m1686("href");
                    if (strM1686.startsWith("ed2k:")) {
                        Matcher matcher = Pattern.compile("\\|file\\|(.*?)\\|").matcher(URLDecoder.decode(strM1686));
                        if (matcher.find()) {
                            strM16932 = matcher.group(1);
                        }
                    } else if (strM1686.startsWith("magnet:")) {
                        Matcher matcher2 = Pattern.compile("(^|&)dn=([^&]*)(&|$)").matcher(URLDecoder.decode(strM1686));
                        if (matcher2.find()) {
                            strM16932 = matcher2.group(2);
                        }
                    }
                    arrayList.add(strM16932 + "$" + strM1686);
                }
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
            String strJoin = arrayList.size() > 0 ? TextUtils.join("#", arrayList) : "";
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("vod_id", list.get(0));
            jSONObject2.put("vod_name", strM1693);
            jSONObject2.put("vod_pic", m46(strMo117));
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
            String str = f39;
            for (C0011 c0011 : C0243.m884(C0287.m1052(str, "utf-8", m47(str))).m199("ul#menus a")) {
                String strM204 = c0011.m204();
                if ((strM204.contains("首页") || strM204.contains("最新") || strM204.contains("旧版")) ? false : true) {
                    String strMo117 = c0011.mo117("href");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type_id", strMo117);
                    jSONObject.put("type_name", strM204);
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
            StringUtils.printStackTrace();
            return "";
        }
    }

    public void init(Context context, String str) throws Exception {
        super.init(context, str);
        if (str.isEmpty()) {
            return;
        }
        f39 = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
            jSONObject.put("url", str2);
            boolean zStartsWith = str2.startsWith("tvbox");
            String strD = "parse";
            if (zStartsWith || str2.startsWith("ed2k")) {
                jSONObject.put(strD, 0);
            } else {
                jSONObject.put("header", jSONObject2.toString());
                jSONObject.put(strD, 1);
            }
            jSONObject.put("playUrl", "");
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        String strD = "《";
        String strD2 = "1";
        try {
            JSONArray jSONArray = new JSONArray();
            String str2 = f39 + "/e/search/1index.php";
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("show", "title");
            linkedHashMap.put("tempid", strD2);
            linkedHashMap.put("tbname", "article");
            linkedHashMap.put("mid", strD2);
            linkedHashMap.put("dopost", "search");
            linkedHashMap.put("submit", "");
            linkedHashMap.put("keyboard", str);
            C0295.f729.clear();
            C0455 c0455M199 = C0243.m884(C0287.m1053(str2, linkedHashMap, "utf-8", m47(f39))).m199("ul#post_container li");
            for (int i = 0; i < c0455M199.size(); i++) {
                C0011 c0011 = c0455M199.get(i);
                String strM1693 = c0011.m199("h2").m1693();
                if (strM1693.contains(strD) && strM1693.contains("》")) {
                    strM1693 = strM1693.substring(strM1693.indexOf(strD));
                }
                String strM1686 = c0011.m199("img").m1686("src");
                String strM16932 = c0011.m199(".info_date").m1693();
                String strM16862 = c0011.m199("a").m1686("href");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("vod_id", strM16862);
                jSONObject.put("vod_name", strM1693);
                jSONObject.put("vod_pic", m46(strM1686));
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
