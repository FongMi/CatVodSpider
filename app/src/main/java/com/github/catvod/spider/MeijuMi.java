package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C0011;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0243;
import com.github.catvod.spider.merge.C0287;
import com.github.catvod.spider.merge.C0455;
import com.github.catvod.spider.merge.SOY;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
public class MeijuMi extends Spider {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static String f34 = "https://www.meijumi.xyz";

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static String m42(String str) {
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
    private static HashMap<String, String> m43(String str) {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
        map.put("Referer", f34 + "/");
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strD = "a";
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            String strD2 = "{cateId}";
            if (!str2.equals("1")) {
                strD2 = "{cateId}page/" + str2 + "/";
            }
            if (z && map != null && map.size() > 0) {
                for (String str3 : map.keySet()) {
                    String str4 = map.get(str3);
                    if (str4.length() > 0) {
                        strD2 = strD2.replace("{" + str3 + "}", str4);
                    }
                }
            }
            C0455 c0455M199 = C0243.m884(C0287.m1052(strD2.replaceAll("\\{cateId\\}", str), "utf-8", m43(f34))).m199("div#post_list_box article");
            for (int i = 0; i < c0455M199.size(); i++) {
                C0011 c0011 = c0455M199.get(i);
                String strTrim = c0011.m199(strD).m1686("title").replace("迅雷下载", "").trim();
                String strM1686 = c0011.m199("img").m1686("src");
                String strM1693 = c0011.m199(".gxts").m1693();
                String strM16862 = c0011.m199(strD).m1686("href");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vod_id", strM16862);
                jSONObject2.put("vod_name", strTrim);
                jSONObject2.put("vod_pic", m42(strM1686));
                jSONObject2.put("vod_remarks", strM1693);
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
        String strD = "a";
        try {
            C0035 c0035M884 = C0243.m884(C0287.m1052(list.get(0), "utf-8", m43(f34)));
            String strMo117 = c0035M884.m199("div.single-content img").get(0).mo117("src");
            String strTrim = c0035M884.m199(".entry-title").m1693().replace("迅雷下载", "").trim();
            ArrayList arrayList = new ArrayList();
            try {
                C0455 c0455M199 = c0035M884.m199("div.single-content a[href^=magnet],a[href^=ed2k]");
                for (int i = 0; i < c0455M199.size(); i++) {
                    C0011 c0011 = c0455M199.get(i);
                    String strM1693 = c0011.m199(strD).m1693();
                    String strM1686 = c0011.m199(strD).m1686("href");
                    if (strM1686.startsWith("ed2k:")) {
                        Matcher matcher = Pattern.compile("\\|file\\|(.*?)\\|").matcher(URLDecoder.decode(strM1686));
                        if (matcher.find()) {
                            strM1693 = matcher.group(1);
                        }
                    } else if (strM1686.startsWith("magnet:")) {
                        Matcher matcher2 = Pattern.compile("(^|&)dn=([^&]*)(&|$)").matcher(URLDecoder.decode(strM1686));
                        if (matcher2.find()) {
                            strM1693 = matcher2.group(2);
                        }
                    }
                    arrayList.add(strM1693 + "$" + strM1686);
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
            jSONObject2.put("vod_pic", m42(strMo117));
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
            String str = f34;
            for (C0011 c0011 : C0243.m884(C0287.m1052(str, "utf-8", m43(str))).m199("ul.nav-menu a")) {
                String strM204 = c0011.m204();
                if ((strM204.contains("更新") || strM204.contains("推荐") || strM204.contains("首页") || strM204.contains("韩剧") || strM204.contains("即将")) ? false : true) {
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

    public void init(Context context, String str) {
        super.init(context, str);
        if (str.isEmpty()) {
            return;
        }
        f34 = str;
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
        String strD = "a";
        try {
            JSONArray jSONArray = new JSONArray();
            C0455 c0455M199 = C0243.m884(C0287.m1052(f34 + "/?s=" + URLEncoder.encode(str), "utf-8", m43(f34))).m199("ul.search-page article");
            for (int i = 0; i < c0455M199.size(); i++) {
                C0011 c0011 = c0455M199.get(i);
                String strTrim = c0011.m199(strD).m1686("title").replace("迅雷下载", "").trim();
                String strM1686 = c0011.m199("img").m1686("src");
                String strM1693 = c0011.m199(".gxts").m1693();
                String strM16862 = c0011.m199(strD).m1686("href");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("vod_id", strM16862);
                jSONObject.put("vod_name", strTrim);
                jSONObject.put("vod_pic", m42(strM1686));
                jSONObject.put("vod_remarks", strM1693);
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
