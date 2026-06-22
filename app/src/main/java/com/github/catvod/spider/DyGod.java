package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.*;
import com.github.catvod.spider.merge.q1.StringUtils;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URLDecoder;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DyGod extends Spider {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private String f25 = "https://www.dygod.net";

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private HashMap<String, String> m35(String str) {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
        map.put("Referer", this.f25 + "/");
        return map;
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private String m36(String str) {
        try {
            if (str.startsWith("ed2k:")) {
                Matcher matcher = Pattern.compile("\\|file\\|(.*?)\\|").matcher(URLDecoder.decode(str));
                if (matcher.find()) {
                    str = "电驴-" + matcher.group(1);
                }
            } else if (str.startsWith("magnet:")) {
                Matcher matcher2 = Pattern.compile("(^|&)dn=([^&]*)(&|$)").matcher(URLDecoder.decode(str));
                if (matcher2.find()) {
                    str = "磁力-" + matcher2.group(2);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return str;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strD = "table a";
        String strD2 = "《";
        String strD3 = ".html";
        String strD4 = "》";
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            String strReplace = this.f25 + "/html/{cateId}/index.html";
            if (!str2.equals("1")) {
                strReplace = this.f25 + "/html/{cateId}/index_" + str2 + strD3;
                if (str.contains(strD3)) {
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
            C0455 c0455M199 = C0243.m884(m37(strReplace.replaceAll("\\{cateId\\}", str), m35(this.f25))).m199("div.co_content8 table");
            for (int i = 0; i < c0455M199.size(); i++) {
                C0011 c0011 = c0455M199.get(i);
                String strM1693 = c0011.m199("tr:contains(点击：)").m1693();
                String strM16932 = c0011.m199("b").m1693();
                if (strM16932.contains(strD2) && strM16932.contains(strD4)) {
                    strM1693 = strM16932.split(strD4)[1];
                    strM16932 = strM16932.split(strD2)[1].split(strD4)[0];
                }
                String strMo117 = c0011.m199(strD).get(c0011.m199(strD).size() - 1).mo117("href");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vod_id", strMo117);
                jSONObject2.put("vod_name", strM16932);
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
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String strD = "$$$";
        try {
            String strM37 = m37(this.f25 + list.get(0), m35(this.f25));
            C0035 c0035M884 = C0243.m884(strM37);
            String strM1054 = C0287.m1054(this.f25, c0035M884.m199("div#Zoom>img").m1686("src"));
            String strM1693 = c0035M884.m199("div.title_all>h1").m1693();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            boolean zContains = strM37.contains("player_list");
            String strD2 = "$";
            String strD3 = "href";
            String strD4 = "#";
            String strD5 = "a";
            if (zContains) {
                String strD6 = "视频播列表";
                C0455 c0455M199 = c0035M884.m199("div.player_list li");
                Collections.reverse(c0455M199);
                str3 = "";
                try {
                    ArrayList arrayList3 = new ArrayList();
                    str4 = strM1054;
                    str5 = strM1693;
                    int i = 0;
                    while (i < c0455M199.size()) {
                        C0011 c0011 = c0455M199.get(i);
                        C0455 c0455 = c0455M199;
                        String strM16932 = c0011.m199(strD5).m1693();
                        String strM1686 = c0011.m199(strD5).m1686(strD3);
                        if (strM1686.contains("jianpian")) {
                            StringBuilder sb = new StringBuilder();
                            str6 = strD;
                            sb.append("tvbox-xg:");
                            sb.append(strM1686.split("path=")[1]);
                            strM1686 = sb.toString();
                        } else {
                            str6 = strD;
                        }
                        arrayList3.add(strM16932 + strD2 + strM1686);
                        i++;
                        strD = str6;
                        c0455M199 = c0455;
                    }
                    str2 = strD;
                    arrayList2.add(TextUtils.join(strD4, arrayList3));
                    arrayList.add(strD6);
                } catch (Exception e) {
                    e = e;
                    str = str3;
                    SpiderDebug.log(e);
                    return str;
                }
            } else {
                str2 = strD;
                str3 = "";
                str4 = strM1054;
                str5 = strM1693;
            }
            if (strM37.contains("id=\"downlist")) {
                String strD7 = "磁力列表一";
                C0455 c0455M1992 = c0035M884.m199("div#downlist table");
                Collections.reverse(c0455M1992);
                ArrayList arrayList4 = new ArrayList();
                for (int i2 = 0; i2 < c0455M1992.size(); i2++) {
                    C0011 c00112 = c0455M1992.get(i2);
                    arrayList4.add(m36(c00112.m199("td").m1693()) + strD2 + c00112.m199(strD5).m1686(strD3));
                }
                arrayList2.add(TextUtils.join(strD4, arrayList4));
                arrayList.add(strD7);
            } else if (strM37.contains("href=\"ftp") || strM37.contains("href=\"magnet") || strM37.contains("href=\"ed2k")) {
                String strD8 = "磁力列表二";
                C0455 c0455M1993 = c0035M884.m199("div#Zoom table");
                Collections.reverse(c0455M1993);
                ArrayList arrayList5 = new ArrayList();
                for (int i3 = 0; i3 < c0455M1993.size(); i3++) {
                    C0011 c00113 = c0455M1993.get(i3);
                    arrayList5.add(m36(c00113.m199(strD5).m1693()) + strD2 + c00113.m199(strD5).m1686(strD3));
                }
                arrayList2.add(TextUtils.join(strD4, arrayList5));
                arrayList.add(strD8);
            }
            String str7 = str2;
            String strJoin = TextUtils.join(str7, arrayList);
            String strJoin2 = TextUtils.join(str7, arrayList2);
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("vod_id", list.get(0));
            jSONObject2.put("vod_name", str5);
            jSONObject2.put("vod_pic", str4);
            str = str3;
            try {
                jSONObject2.put("vod_content", str);
                jSONObject2.put("type_name", str);
                jSONObject2.put("vod_play_from", strJoin);
                jSONObject2.put("vod_play_url", strJoin2);
                jSONArray.put(jSONObject2);
                jSONObject.put("list", jSONArray);
                return jSONObject.toString();
            } catch (Exception e2) {
                SpiderDebug.log(e2);
                return str;
            }
        } catch (Exception e3) {
            str = "";
        }
        return str;
    }

    public String homeContent(boolean z) {
        String strD = "&";
        try {
            JSONArray jSONArray = new JSONArray();
            String[] strArrSplit = "最新影片&国内电影&欧美电影&华语电视&日韩电视&欧美电视&最新综艺&旧版综艺&动漫资源&手机电影".split(strD);
            String[] strArrSplit2 = "gndy/dyzz&gndy/china&gndy/oumei&tv/hytv&tv/rihantv&tv/oumeitv&zongyi2013&2009zongyi&dongman&3gp/3gpmovie".split(strD);
            for (int i = 0; i < strArrSplit.length; i++) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type_id", strArrSplit2[i]);
                jSONObject.put("type_name", strArrSplit[i]);
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("class", jSONArray);
            if (z) {
                jSONObject2.put("filters", new JSONObject("{}]}"));
            }
            return jSONObject2.toString();
        } catch (Exception e) {
            StringUtils.printStackTrace(e);
            return "";
        }
    }

    public void init(Context context, String str) throws Exception {
        super.init(context, str);
        if (str.isEmpty()) {
            return;
        }
        this.f25 = str;
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
        String strD = "table a";
        String strD2 = "《";
        String strD3 = "》";
        try {
            JSONArray jSONArray = new JSONArray();
            String str2 = this.f25 + "/e/search/index.php";
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("show", "title");
            linkedHashMap.put("tempid", "1");
            linkedHashMap.put("keyboard", str);
            linkedHashMap.put("Submit", "立即搜索");
            HashMap<String, String> mapM35 = m35(this.f25);
            mapM35.put("Content-Type", "application/x-www-form-urlencoded; charset=gb2312");
            C0455 c0455M199 = C0243.m884(m38(str2, linkedHashMap, mapM35)).m199("div.co_content8 table");
            for (int i = 0; i < c0455M199.size(); i++) {
                C0011 c0011 = c0455M199.get(i);
                String strM1693 = c0011.m199("tr:contains(点击：)").m1693();
                String strM16932 = c0011.m199("b").m1693();
                if (strM16932.contains(strD2) && strM16932.contains(strD3)) {
                    strM1693 = strM16932.split(strD3)[1];
                    strM16932 = strM16932.split(strD2)[1].split(strD3)[0];
                }
                String strMo117 = c0011.m199(strD).get(c0011.m199(strD).size() - 1).mo117("href");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("vod_id", strMo117);
                jSONObject.put("vod_name", strM16932);
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

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    protected String m37(String str, Map<String, String> map) {
        try {
            AbstractC0291.AbstractC0292 abstractC0292 = new AbstractC0291.AbstractC0292() { // from class: com.github.catvod.spider.DyGod.1
                @Override // com.github.catvod.spider.merge.AbstractC0291
                protected void onFailure(Call call, Exception exc) {
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.github.catvod.spider.merge.AbstractC0291
                public void onResponse(Response response) {
                }
            };
            C0295.m1083(C0295.m1082(), str, null, map, abstractC0292);
            return new String(abstractC0292.getResult().body().bytes(), "gb2312").replaceAll("\r|\n", "");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    protected String m38(String str, Map<String, String> map, Map<String, String> map2) {
        try {
            AbstractC0291.AbstractC0292 abstractC0292 = new AbstractC0291.AbstractC0292() { // from class: com.github.catvod.spider.DyGod.2
                @Override // com.github.catvod.spider.merge.AbstractC0291
                protected void onFailure(Call call, Exception exc) {
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.github.catvod.spider.merge.AbstractC0291
                public void onResponse(Response response) {
                }
            };
            C0295.m1086(C0295.m1082(), str, map, map2, abstractC0292);
            return new String(abstractC0292.getResult().body().bytes(), "gb2312").replaceAll("\r|\n", "");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
