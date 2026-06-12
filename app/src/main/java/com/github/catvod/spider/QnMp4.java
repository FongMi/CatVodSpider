package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C0011;
import com.github.catvod.spider.merge.C0243;
import com.github.catvod.spider.merge.C0287;
import com.github.catvod.spider.merge.C0295;
import com.github.catvod.spider.merge.C0455;
import com.github.catvod.spider.merge.SOY;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
public class QnMp4 extends Spider {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private String f49 = "https://www.qnmp4.com";

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private HashMap<String, String> m49(String str) {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
        map.put("Referer", this.f49 + "/");
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            String strReplace = this.f49 + "/ms/{cateId}--------" + str2 + "---.html";
            if (z && map != null && map.size() > 0) {
                for (String str3 : map.keySet()) {
                    String str4 = map.get(str3);
                    if (str4.length() > 0) {
                        strReplace = strReplace.replace("{" + str3 + "}", str4);
                    }
                }
            }
            C0455 c0455M199 = C0243.m884(C0295.m1089(strReplace.replaceAll("\\{cateId\\}", str), m49(this.f49))).m199("ul.content-list li");
            for (int i = 0; i < c0455M199.size(); i++) {
                C0011 c0011 = c0455M199.get(i);
                String strM1693 = c0011.m199("h3").m1693();
                String strM1054 = C0287.m1054(this.f49, c0011.m199("img").m1686("src"));
                String strM16932 = c0011.m199(".bottom2").m1693();
                String strM1686 = c0011.m199("a").m1686("href");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vod_id", strM1686);
                jSONObject2.put("vod_name", strM1693);
                jSONObject2.put("vod_pic", strM1054);
                jSONObject2.put("vod_remarks", strM16932);
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

    /* JADX WARN: Removed duplicated region for block: B:34:0x0142 A[Catch: Exception -> 0x01d3, TryCatch #4 {Exception -> 0x01d3, blocks: (B:32:0x0136, B:34:0x0142, B:35:0x0157, B:37:0x015d, B:38:0x017d, B:40:0x0183, B:41:0x01be), top: B:62:0x0136, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r24) {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        // TODO: Method not decompiled by JADX - needs manual reconstruction
        return "";
    }

    public String homeContent(boolean z) {
        String strD = "&";
        try {
            JSONArray jSONArray = new JSONArray();
            String[] strArrSplit = "电影&电视剧&综艺&动漫&短剧".split(strD);
            String[] strArrSplit2 = "1&2&3&4&30".split(strD);
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
            StringUtils.printStackTrace();
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context, str);
        if (str.isEmpty()) {
            return;
        }
        this.f49 = str;
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
        try {
            JSONArray jSONArray = new JSONArray();
            C0455 c0455M199 = C0243.m884(C0295.m1089(this.f49 + "/vs/-------------.html?wd=" + str, m49(this.f49))).m199("div.sr_lists li");
            for (int i = 0; i < c0455M199.size(); i++) {
                C0011 c0011 = c0455M199.get(i);
                String strM1693 = c0011.m199("h3").m1693();
                String strM1054 = C0287.m1054(this.f49, c0011.m199("img").m1686("src"));
                String strM16932 = c0011.m199(".bottom2").m1693();
                String strM1686 = c0011.m199("a").m1686("href");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("vod_id", strM1686);
                jSONObject.put("vod_name", strM1693);
                jSONObject.put("vod_pic", strM1054);
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
