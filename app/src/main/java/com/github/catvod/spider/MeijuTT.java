package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.*;
import com.github.catvod.spider.merge.q1.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MeijuTT extends Spider {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static String f35 = "https://www.meijutt.tv";

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static String m44(String str) {
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
    private static HashMap<String, String> m45(String str) {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
        map.put("Referer", f35 + "/");
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strD = "a";
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            String strReplace = f35 + "/" + str2 + "_{cateId}______.html";
            if (z && map != null && map.size() > 0) {
                for (String str3 : map.keySet()) {
                    String str4 = map.get(str3);
                    if (str4.length() > 0) {
                        strReplace = strReplace.replace("{" + str3 + "}", str4);
                    }
                }
            }
            C0455 c0455M199 = C0243.m884(C0287.m1052(strReplace.replaceAll("\\{cateId\\}", str), "gb2312", m45(f35))).m199("div.list3_cn_box div.cn_box2");
            for (int i = 0; i < c0455M199.size(); i++) {
                C0011 c0011 = c0455M199.get(i);
                String strM1686 = c0011.m199(strD).m1686("title");
                String strM16862 = c0011.m199("img").m1686("src");
                String strM204 = c0011.m199(".list_20 li").get(1).m204();
                String strM16863 = c0011.m199(strD).m1686("href");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vod_id", strM16863);
                jSONObject2.put("vod_name", strM1686);
                jSONObject2.put("vod_pic", m44(strM16862));
                jSONObject2.put("vod_remarks", strM204);
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
        String strD2 = "$$$";
        try {
            String strM1052 = C0287.m1052(f35 + list.get(0), "gb2312", m45(f35));
            C0035 c0035M884 = C0243.m884(strM1052);
            String strM1686 = c0035M884.m199("div.o_big_img_bg_b>img").m1686("src");
            String strM1693 = c0035M884.m199("div.info-title>h1").m1693();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            try {
                if (strM1052.contains("class=\"down_list")) {
                    C0455 c0455M199 = c0035M884.m199("div.down_list");
                    C0455 c0455M1992 = c0035M884.m199("div.from-tabs .downcili-ico,.down-ico");
                    int i = 0;
                    while (i < c0455M199.size()) {
                        String strM204 = c0455M1992.get(i).m204();
                        C0455 c0455M1993 = c0455M199.get(i).m199("li");
                        ArrayList arrayList3 = new ArrayList();
                        int i2 = 0;
                        while (i2 < c0455M1993.size()) {
                            C0011 c0011 = c0455M1993.get(i2);
                            C0455 c0455 = c0455M199;
                            String str = strD;
                            arrayList3.add(c0011.m199(strD).m1693() + "$" + c0011.m199(strD).m1686("href"));
                            i2++;
                            strD = str;
                            c0455M199 = c0455;
                        }
                        String str2 = strD;
                        C0455 c04552 = c0455M199;
                        arrayList2.add(TextUtils.join("#", arrayList3));
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            if (strM204.equals(arrayList.get(i3))) {
                                strM204 = strM204 + "" + (i + 1);
                            }
                        }
                        arrayList.add(strM204);
                        i++;
                        strD = str2;
                        c0455M199 = c04552;
                    }
                }
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
            String strJoin = TextUtils.join(strD2, arrayList);
            String strJoin2 = TextUtils.join(strD2, arrayList2);
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("vod_id", list.get(0));
            jSONObject2.put("vod_name", strM1693);
            jSONObject2.put("vod_pic", m44(strM1686));
            jSONObject2.put("vod_content", "");
            jSONObject2.put("type_name", "");
            jSONObject2.put("vod_play_from", strJoin);
            jSONObject2.put("vod_play_url", strJoin2);
            jSONArray.put(jSONObject2);
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    public String homeContent(boolean z) {
        String strD = "&";
        try {
            JSONArray jSONArray = new JSONArray();
            String[] strArrSplit = "全部&魔幻科幻&灵异惊悚&都市情感&犯罪历史&选秀综艺&动漫卡通".split(strD);
            String[] strArrSplit2 = "&1&2&3&4&5&6".split(strD);
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

    public void init(Context context, String str) throws Exception {
        super.init(context, str);
        if (str.isEmpty()) {
            return;
        }
        f35 = str;
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
        String strD2 = "gb2312";
        try {
            JSONArray jSONArray = new JSONArray();
            C0455 c0455M199 = C0243.m884(C0287.m1052(f35 + "/sousuo/index.asp?page=1&searchword=" + URLEncoder.encode(str, strD2) + "&searchtype=-1", strD2, m45(f35))).m199("div.list3_cn_box div.cn_box2");
            for (int i = 0; i < c0455M199.size(); i++) {
                C0011 c0011 = c0455M199.get(i);
                String strM1686 = c0011.m199(strD).m1686("title");
                String strM16862 = c0011.m199("img").m1686("src");
                String strM204 = c0011.m199(".list_20 li").get(1).m204();
                String strM16863 = c0011.m199(strD).m1686("href");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("vod_id", strM16863);
                jSONObject.put("vod_name", strM1686);
                jSONObject.put("vod_pic", m44(strM16862));
                jSONObject.put("vod_remarks", strM204);
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
