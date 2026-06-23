package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.FM.L.P;
import com.github.catvod.spider.merge.FM.c.C0329g;
import com.github.catvod.spider.merge.FM.p.f;
import com.github.catvod.spider.merge.a.C0529a;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class SP360 extends Spider {
    private final String a = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.71 Safari/537.36";
    private String b = "";

    private String a(JSONArray jSONArray) {
        return jSONArray == null ? "" : jSONArray.toString().replace("\"", "").replace("[", "").replace("]", "");
    }

    private String b(String str, String str2) {
        Response responseExecute = f.b().newCall(new Request.Builder().url(str).get().addHeader("User-Agent", this.a).addHeader("Referer", str2).build()).execute();
        if (responseExecute.body() == null) {
            return "";
        }
        String strString = responseExecute.body().string();
        responseExecute.close();
        return strString;
    }

    private String c(String str, String str2) throws InterruptedException {
        String strB = "";
        for (int i = 0; i < 8; i++) {
            strB = b(str, "https://api.web.360kan.com");
            if (strB.contains(str2)) {
                break;
            }
            Thread.sleep(500L);
        }
        return strB;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String categoryContent(java.lang.String r19, java.lang.String r20, boolean r21, java.util.HashMap<java.lang.String, java.lang.String> r22) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.SP360.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    public String detailContent(List<String> list) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str;
        String str2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONArray jSONArray;
        String str3;
        int i;
        int i2;
        JSONObject jSONObject5 = new JSONObject(list.get(0));
        String strOptString = jSONObject5.optString("detailUrl");
        jSONObject5.optString("detailReferer");
        String str4 = "\"msg\":\"Success\"";
        JSONObject jSONObjectOptJSONObject = new JSONObject(c(strOptString, "\"msg\":\"Success\"")).optJSONObject("data");
        String strOptString2 = jSONObjectOptJSONObject.optString("title");
        boolean zHas = jSONObjectOptJSONObject.has("allepidetail");
        boolean zHas2 = jSONObjectOptJSONObject.has("defaultepisode");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("playlinksdetail");
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("playlink_sites");
        String strSubstring = strOptString.substring(0, strOptString.indexOf("&callback="));
        String str5 = "&site=";
        JSONObject jSONObject6 = jSONObjectOptJSONObject2;
        if (zHas) {
            int i3 = 0;
            while (i3 < jSONArrayOptJSONArray.length()) {
                String strValueOf = String.valueOf(jSONArrayOptJSONArray.get(i3));
                if (this.b.contains(strValueOf)) {
                    jSONObject4 = jSONObjectOptJSONObject;
                    str3 = strSubstring;
                    i = i3;
                    jSONArray = jSONArrayOptJSONArray;
                } else {
                    StringBuilder sbB = P.b(strSubstring);
                    sbB.append("&site=");
                    sbB.append(strValueOf);
                    sbB.append("&callback=");
                    jSONObject4 = jSONObjectOptJSONObject;
                    JSONObject jSONObjectOptJSONObject3 = new JSONObject(c(sbB.toString(), "\"msg\":\"Success\"")).optJSONObject("data").optJSONObject("allupinfo");
                    int i4 = jSONObjectOptJSONObject3.has(strValueOf) ? Integer.parseInt(String.valueOf(jSONObjectOptJSONObject3.get(strValueOf))) : 0;
                    ArrayList arrayList = new ArrayList();
                    jSONArray = jSONArrayOptJSONArray;
                    int i5 = 0;
                    while (i5 < i4) {
                        int i6 = i3;
                        int i7 = i5 + 200;
                        int i8 = i4;
                        if (i7 > i4) {
                            i2 = i7;
                        } else {
                            i4 = i7;
                            i2 = i4;
                        }
                        StringBuilder sbB2 = P.b(strSubstring);
                        String str6 = strSubstring;
                        sbB2.append("&start=");
                        sbB2.append(i5 + 1);
                        sbB2.append("&end=");
                        sbB2.append(i4);
                        sbB2.append("&site=");
                        sbB2.append(strValueOf);
                        sbB2.append("&callback=");
                        JSONArray jSONArrayOptJSONArray2 = new JSONObject(c(sbB2.toString(), "\"msg\":\"Success\"")).optJSONObject("data").optJSONObject("allepidetail").optJSONArray(strValueOf);
                        if (jSONArrayOptJSONArray2 != null) {
                            int i9 = 0;
                            while (i9 < jSONArrayOptJSONArray2.length()) {
                                JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray2.optJSONObject(i9);
                                JSONArray jSONArray2 = jSONArrayOptJSONArray2;
                                String str7 = "第" + jSONObjectOptJSONObject4.optString("playlink_num") + "集";
                                String strOptString3 = jSONObjectOptJSONObject4.optString("url");
                                StringBuilder sbB3 = P.b(str7);
                                sbB3.append("$");
                                sbB3.append(strOptString3);
                                arrayList.add(sbB3.toString());
                                i9++;
                                jSONArrayOptJSONArray2 = jSONArray2;
                            }
                        }
                        i3 = i6;
                        i4 = i8;
                        i5 = i2;
                        strSubstring = str6;
                    }
                    str3 = strSubstring;
                    i = i3;
                    if (arrayList.size() > 0) {
                        linkedHashMap.put(strValueOf, TextUtils.join("#", arrayList));
                    }
                }
                i3 = i + 1;
                jSONObjectOptJSONObject = jSONObject4;
                jSONArrayOptJSONArray = jSONArray;
                strSubstring = str3;
            }
            jSONObject = jSONObjectOptJSONObject;
        } else {
            JSONObject jSONObject7 = jSONObjectOptJSONObject;
            JSONArray jSONArray3 = jSONArrayOptJSONArray;
            if (zHas2) {
                int i10 = 0;
                while (i10 < jSONArray3.length()) {
                    JSONArray jSONArray4 = jSONArray3;
                    String strValueOf2 = String.valueOf(jSONArray4.get(i10));
                    if (this.b.contains(strValueOf2)) {
                        str = str5;
                        str2 = str4;
                        jSONObject3 = jSONObject7;
                    } else {
                        JSONObject jSONObject8 = jSONObject7;
                        if (jSONObject8.has("tag")) {
                            Iterator<String> itKeys = jSONObject8.optJSONObject("tag").keys();
                            ArrayList arrayList2 = new ArrayList();
                            while (itKeys.hasNext()) {
                                Iterator<String> it = itKeys;
                                String next = itKeys.next();
                                JSONObject jSONObject9 = jSONObject8;
                                StringBuilder sbB4 = P.b(strSubstring);
                                sbB4.append(str5);
                                sbB4.append(strValueOf2);
                                String str8 = str5;
                                sbB4.append("&year=");
                                sbB4.append(next);
                                sbB4.append("&callback=");
                                JSONArray jSONArrayOptJSONArray3 = new JSONObject(c(sbB4.toString(), str4)).optJSONObject("data").optJSONArray("defaultepisode");
                                if (jSONArrayOptJSONArray3 != null) {
                                    int i11 = 0;
                                    while (i11 < jSONArrayOptJSONArray3.length()) {
                                        JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray3.optJSONObject(i11);
                                        JSONArray jSONArray5 = jSONArrayOptJSONArray3;
                                        StringBuilder sb = new StringBuilder();
                                        String str9 = str4;
                                        sb.append(jSONObjectOptJSONObject5.optString("period"));
                                        sb.append(" ");
                                        sb.append(jSONObjectOptJSONObject5.optString("name"));
                                        String string = sb.toString();
                                        String strOptString4 = jSONObjectOptJSONObject5.optString("url");
                                        StringBuilder sbB5 = P.b(string);
                                        sbB5.append("$");
                                        sbB5.append(strOptString4);
                                        arrayList2.add(sbB5.toString());
                                        i11++;
                                        jSONArrayOptJSONArray3 = jSONArray5;
                                        str4 = str9;
                                    }
                                }
                                itKeys = it;
                                jSONObject8 = jSONObject9;
                                str5 = str8;
                            }
                            str = str5;
                            str2 = str4;
                            jSONObject3 = jSONObject8;
                            if (arrayList2.size() > 0) {
                                linkedHashMap.put(strValueOf2, TextUtils.join("#", arrayList2));
                            }
                        } else {
                            str = str5;
                            str2 = str4;
                            jSONObject3 = jSONObject8;
                        }
                    }
                    i10++;
                    jSONObject7 = jSONObject3;
                    str5 = str;
                    str4 = str2;
                    jSONArray3 = jSONArray4;
                }
                jSONObject = jSONObject7;
            } else {
                jSONObject = jSONObject7;
                int i12 = 0;
                while (i12 < jSONArray3.length()) {
                    String strValueOf3 = String.valueOf(jSONArray3.get(i12));
                    if (this.b.contains(strValueOf3)) {
                        jSONObject2 = jSONObject6;
                    } else {
                        jSONObject2 = jSONObject6;
                        String strOptString5 = jSONObject2.optJSONObject(strValueOf3).optString("default_url");
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add("正片$" + strOptString5);
                        linkedHashMap.put(strValueOf3, TextUtils.join("#", arrayList3));
                    }
                    i12++;
                    jSONObject6 = jSONObject2;
                }
            }
        }
        JSONObject jSONObject10 = jSONObject;
        String strOptString6 = jSONObject10.optString("cdncover");
        String strA = a(jSONObject10.optJSONArray("moviecategory"));
        String strOptString7 = jSONObject10.optString("pubdate");
        String strA2 = a(jSONObject10.optJSONArray("area"));
        String strA3 = a(jSONObject10.optJSONArray("actor"));
        String strA4 = a(jSONObject10.optJSONArray("director"));
        String strOptString8 = jSONObject10.optString("description");
        JSONObject jSONObject11 = new JSONObject();
        jSONObject11.put("vod_id", list.get(0));
        jSONObject11.put("vod_name", strOptString2);
        jSONObject11.put("vod_pic", strOptString6);
        jSONObject11.put("type_name", strA);
        jSONObject11.put("vod_year", strOptString7);
        jSONObject11.put("vod_area", strA2);
        jSONObject11.put("vod_remarks", "");
        jSONObject11.put("vod_actor", strA3);
        jSONObject11.put("vod_director", strA4);
        jSONObject11.put("vod_content", strOptString8);
        if (linkedHashMap.size() > 0) {
            jSONObject11.put("vod_play_from", TextUtils.join("$$$", linkedHashMap.keySet()));
            jSONObject11.put("vod_play_url", TextUtils.join("$$$", linkedHashMap.values()));
        }
        return new JSONObject().put("list", new JSONArray().put(jSONObject11)).toString();
    }

    public String homeContent(boolean z) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        List listAsList = Arrays.asList("1", "2", "3", "4");
        List listAsList2 = Arrays.asList("电影", "电视剧", "综艺", "动漫");
        for (int i = 0; i < listAsList.size(); i++) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type_id", listAsList.get(i));
            jSONObject.put("type_name", listAsList2.get(i));
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject("{\"1\": [{\"key\": \"class\", \"name\": \"类型\", \"value\": [{\"n\": \"全部类型\", \"v\": \"\"}, {\"n\": \"喜剧\", \"v\": \"喜剧\"}, {\"n\": \"爱情\", \"v\": \"爱情\"}, {\"n\": \"动作\", \"v\": \"动作\"}, {\"n\": \"恐怖\", \"v\": \"恐怖\"}, {\"n\": \"科幻\", \"v\": \"科幻\"}, {\"n\": \"剧情\", \"v\": \"剧情\"}, {\"n\": \"犯罪\", \"v\": \"犯罪\"}, {\"n\": \"奇幻\", \"v\": \"奇幻\"}, {\"n\": \"战争\", \"v\": \"战争\"}, {\"n\": \"悬疑\", \"v\": \"悬疑\"}, {\"n\": \"动画\", \"v\": \"动画\"}, {\"n\": \"文艺\", \"v\": \"文艺\"}, {\"n\": \"记录\", \"v\": \"记录\"}, {\"n\": \"传记\", \"v\": \"传记\"}, {\"n\": \"歌舞\", \"v\": \"歌舞\"}, {\"n\": \"古装\", \"v\": \"古装\"}, {\"n\": \"历史\", \"v\": \"历史\"}, {\"n\": \"惊悚\", \"v\": \"惊悚\"}, {\"n\": \"伦理\", \"v\": \"伦理\"}, {\"n\": \"其他\", \"v\": \"其他\"}]}, {\"key\": \"year\", \"name\": \"年代\", \"value\": [{\"n\": \"全部年代\", \"v\": \"\"}, {\"n\": \"2026\", \"v\": \"2026\"}, {\"n\": \"2025\", \"v\": \"2025\"}, {\"n\": \"2024\", \"v\": \"2024\"}, {\"n\": \"2023\", \"v\": \"2023\"}, {\"n\": \"2022\", \"v\": \"2022\"}, {\"n\": \"2021\", \"v\": \"2021\"}, {\"n\": \"2020\", \"v\": \"2020\"}, {\"n\": \"2019\", \"v\": \"2019\"}, {\"n\": \"2018\", \"v\": \"2018\"}, {\"n\": \"2017\", \"v\": \"2017\"}, {\"n\": \"2016\", \"v\": \"2016\"}, {\"n\": \"2015\", \"v\": \"2015\"}, {\"n\": \"2014\", \"v\": \"2014\"}, {\"n\": \"2013\", \"v\": \"2013\"}, {\"n\": \"2012\", \"v\": \"2012\"}, {\"n\": \"2011\", \"v\": \"2011\"}, {\"n\": \"2010\", \"v\": \"2010\"}, {\"n\": \"2009\", \"v\": \"2009\"}, {\"n\": \"2008\", \"v\": \"2008\"}, {\"n\": \"2007\", \"v\": \"2007\"}, {\"n\": \"更早\", \"v\": \"更早\"}]}, {\"key\": \"area\", \"name\": \"地区\", \"value\": [{\"n\": \"全部地区\", \"v\": \"\"}, {\"n\": \"内地\", \"v\": \"大陆\"}, {\"n\": \"中国香港\", \"v\": \"香港\"}, {\"n\": \"中国台湾\", \"v\": \"台湾\"}, {\"n\": \"泰国\", \"v\": \"泰国\"}, {\"n\": \"美国\", \"v\": \"美国\"}, {\"n\": \"韩国\", \"v\": \"韩国\"}, {\"n\": \"日本\", \"v\": \"日本\"}, {\"n\": \"法国\", \"v\": \"法国\"}, {\"n\": \"英国\", \"v\": \"英国\"}, {\"n\": \"德国\", \"v\": \"德国\"}, {\"n\": \"印度\", \"v\": \"印度\"}, {\"n\": \"其他\", \"v\": \"其他\"}]}, {\"key\": \"actor\", \"name\": \"明星\", \"value\": [{\"n\": \"全部明星\", \"v\": \"\"}, {\"n\": \"成龙\", \"v\": \"成龙\"}, {\"n\": \"周星驰\", \"v\": \"周星驰\"}, {\"n\": \"李连杰\", \"v\": \"李连杰\"}, {\"n\": \"林正英\", \"v\": \"林正英\"}, {\"n\": \"吴京\", \"v\": \"吴京\"}, {\"n\": \"徐峥\", \"v\": \"徐峥\"}, {\"n\": \"黄渤\", \"v\": \"黄渤\"}, {\"n\": \"王宝强\", \"v\": \"王宝强\"}, {\"n\": \"李小龙\", \"v\": \"李小龙\"}, {\"n\": \"张国荣\", \"v\": \"张国荣\"}, {\"n\": \"洪金宝\", \"v\": \"洪金宝\"}, {\"n\": \"姜文\", \"v\": \"姜文\"}, {\"n\": \"沈腾\", \"v\": \"沈腾\"}, {\"n\": \"邓超\", \"v\": \"邓超\"}, {\"n\": \"巩俐\", \"v\": \"巩俐\"}, {\"n\": \"马丽\", \"v\": \"马丽\"}, {\"n\": \"闫妮\", \"v\": \"闫妮\"}, {\"n\": \"周冬雨\", \"v\": \"周冬雨\"}, {\"n\": \"刘昊然\", \"v\": \"刘昊然\"}, {\"n\": \"汤唯\", \"v\": \"汤唯\"}, {\"n\": \"舒淇\", \"v\": \"舒淇\"}, {\"n\": \"白百何\", \"v\": \"白百何\"}]}, {\"key\": \"by\", \"name\": \"排序\", \"value\": [{\"n\": \"最近热映\", \"v\": \"rankhot\"}, {\"n\": \"最近上映\", \"v\": \"ranklatest\"}, {\"n\": \"最受好评\", \"v\": \"rankpoint\"}]}], \"2\": [{\"key\": \"class\", \"name\": \"类型\", \"value\": [{\"n\": \"全部类型\", \"v\": \"\"}, {\"n\": \"言情\", \"v\": \"言情\"}, {\"n\": \"剧情\", \"v\": \"剧情\"}, {\"n\": \"伦理\", \"v\": \"伦理\"}, {\"n\": \"喜剧\", \"v\": \"喜剧\"}, {\"n\": \"悬疑\", \"v\": \"悬疑\"}, {\"n\": \"都市\", \"v\": \"都市\"}, {\"n\": \"偶像\", \"v\": \"偶像\"}, {\"n\": \"古装\", \"v\": \"古装\"}, {\"n\": \"军事\", \"v\": \"军事\"}, {\"n\": \"警匪\", \"v\": \"警匪\"}, {\"n\": \"历史\", \"v\": \"历史\"}, {\"n\": \"励志\", \"v\": \"励志\"}, {\"n\": \"神话\", \"v\": \"神话\"}, {\"n\": \"谍战\", \"v\": \"谍战\"}, {\"n\": \"青春\", \"v\": \"青春\"}, {\"n\": \"家庭\", \"v\": \"家庭\"}, {\"n\": \"动作\", \"v\": \"动作\"}, {\"n\": \"情景\", \"v\": \"情景\"}, {\"n\": \"武侠\", \"v\": \"武侠\"}, {\"n\": \"科幻\", \"v\": \"科幻\"}, {\"n\": \"其他\", \"v\": \"其他\"}]}, {\"key\": \"year\", \"name\": \"年代\", \"value\": [{\"n\": \"全部年代\", \"v\": \"\"}, {\"n\": \"2026\", \"v\": \"2026\"}, {\"n\": \"2025\", \"v\": \"2025\"}, {\"n\": \"2024\", \"v\": \"2024\"}, {\"n\": \"2023\", \"v\": \"2023\"}, {\"n\": \"2022\", \"v\": \"2022\"}, {\"n\": \"2021\", \"v\": \"2021\"}, {\"n\": \"2020\", \"v\": \"2020\"}, {\"n\": \"2019\", \"v\": \"2019\"}, {\"n\": \"2018\", \"v\": \"2018\"}, {\"n\": \"2017\", \"v\": \"2017\"}, {\"n\": \"2016\", \"v\": \"2016\"}, {\"n\": \"2015\", \"v\": \"2015\"}, {\"n\": \"2014\", \"v\": \"2014\"}, {\"n\": \"2013\", \"v\": \"2013\"}, {\"n\": \"2012\", \"v\": \"2012\"}, {\"n\": \"2011\", \"v\": \"2011\"}, {\"n\": \"2010\", \"v\": \"2010\"}, {\"n\": \"2009\", \"v\": \"2009\"}, {\"n\": \"2008\", \"v\": \"2008\"}, {\"n\": \"2007\", \"v\": \"2007\"}, {\"n\": \"更早\", \"v\": \"更早\"}]}, {\"key\": \"area\", \"name\": \"地区\", \"value\": [{\"n\": \"全部地区\", \"v\": \"\"}, {\"n\": \"内地\", \"v\": \"内地\"}, {\"n\": \"中国香港\", \"v\": \"香港\"}, {\"n\": \"中国台湾\", \"v\": \"台湾\"}, {\"n\": \"泰国\", \"v\": \"泰国\"}, {\"n\": \"日本\", \"v\": \"日本\"}, {\"n\": \"韩国\", \"v\": \"韩国\"}, {\"n\": \"美国\", \"v\": \"美国\"}, {\"n\": \"英国\", \"v\": \"英国\"}, {\"n\": \"新加坡\", \"v\": \"新加坡\"}]}, {\"key\": \"actor\", \"name\": \"明星\", \"value\": [{\"n\": \"全部明星\", \"v\": \"\"}, {\"n\": \"杨幂\", \"v\": \"杨幂\"}, {\"n\": \"热巴\", \"v\": \"迪丽热巴\"}, {\"n\": \"张嘉译\", \"v\": \"张嘉译\"}, {\"n\": \"赵丽颖\", \"v\": \"赵丽颖\"}, {\"n\": \"赵又廷\", \"v\": \"赵又廷\"}, {\"n\": \"胡歌\", \"v\": \"胡歌\"}, {\"n\": \"孙俪\", \"v\": \"孙俪\"}, {\"n\": \"韩东君\", \"v\": \"韩东君\"}, {\"n\": \"周迅\", \"v\": \"周迅\"}, {\"n\": \"张一山\", \"v\": \"张一山\"}, {\"n\": \"李小璐\", \"v\": \"李小璐\"}, {\"n\": \"李沁\", \"v\": \"李沁\"}, {\"n\": \"陈坤\", \"v\": \"陈坤\"}, {\"n\": \"刘亦菲\", \"v\": \"刘亦菲\"}, {\"n\": \"唐嫣\", \"v\": \"唐嫣\"}, {\"n\": \"李小冉\", \"v\": \"李小冉\"}, {\"n\": \"周冬雨\", \"v\": \"周冬雨\"}, {\"n\": \"于和伟\", \"v\": \"于和伟\"}, {\"n\": \"李易峰\", \"v\": \"李易峰\"}, {\"n\": \"雷佳音\", \"v\": \"雷佳音\"}, {\"n\": \"何冰\", \"v\": \"何冰\"}, {\"n\": \"阮经天\", \"v\": \"阮经天\"}, {\"n\": \"梅婷\", \"v\": \"梅婷\"}, {\"n\": \"徐峥\", \"v\": \"徐峥\"}, {\"n\": \"祖峰\", \"v\": \"祖峰\"}, {\"n\": \"秦海璐\", \"v\": \"秦海璐\"}, {\"n\": \"杨紫\", \"v\": \"杨紫\"}, {\"n\": \"任嘉伦\", \"v\": \"任嘉伦\"}, {\"n\": \"贾乃亮\", \"v\": \"贾乃亮\"}, {\"n\": \"罗晋\", \"v\": \"罗晋\"}]}, {\"key\": \"by\", \"name\": \"排序\", \"value\": [{\"n\": \"最近热映\", \"v\": \"rankhot\"}, {\"n\": \"最近上映\", \"v\": \"ranklatest\"}, {\"n\": \"最受好评\", \"v\": \"rankpoint\"}]}], \"3\": [{\"key\": \"class\", \"name\": \"类型\", \"value\": [{\"n\": \"全部类型\", \"v\": \"\"}, {\"n\": \"脱口秀\", \"v\": \"脱口秀\"}, {\"n\": \"真人秀\", \"v\": \"真人秀\"}, {\"n\": \"搞笑\", \"v\": \"搞笑\"}, {\"n\": \"选秀\", \"v\": \"选秀\"}, {\"n\": \"八卦\", \"v\": \"八卦\"}, {\"n\": \"访谈\", \"v\": \"访谈\"}, {\"n\": \"情感\", \"v\": \"情感\"}, {\"n\": \"生活\", \"v\": \"生活\"}, {\"n\": \"晚会\", \"v\": \"晚会\"}, {\"n\": \"音乐\", \"v\": \"音乐\"}, {\"n\": \"职场\", \"v\": \"职场\"}, {\"n\": \"美食\", \"v\": \"美食\"}, {\"n\": \"时尚\", \"v\": \"时尚\"}, {\"n\": \"游戏\", \"v\": \"游戏\"}, {\"n\": \"少儿\", \"v\": \"少儿\"}, {\"n\": \"体育\", \"v\": \"体育\"}, {\"n\": \"纪实\", \"v\": \"纪实\"}, {\"n\": \"科教\", \"v\": \"科教\"}, {\"n\": \"曲艺\", \"v\": \"曲艺\"}, {\"n\": \"歌舞\", \"v\": \"歌舞\"}, {\"n\": \"财经\", \"v\": \"财经\"}, {\"n\": \"汽车\", \"v\": \"汽车\"}, {\"n\": \"播报\", \"v\": \"播报\"}, {\"n\": \"其他\", \"v\": \"其他\"}]}, {\"key\": \"area\", \"name\": \"地区\", \"value\": [{\"n\": \"全部地区\", \"v\": \"\"}, {\"n\": \"中国大陆\", \"v\": \"中国大陆\"}, {\"n\": \"美国\", \"v\": \"美国\"}, {\"n\": \"日本\", \"v\": \"日本\"}, {\"n\": \"中国香港\", \"v\": \"中国香港\"}, {\"n\": \"中国台湾\", \"v\": \"中国台湾\"}, {\"n\": \"韩国\", \"v\": \"韩国\"}, {\"n\": \"欧洲\", \"v\": \"欧洲\"}, {\"n\": \"其他\", \"v\": \"泰国\"}]}, {\"key\": \"actor\", \"name\": \"明星\", \"value\": [{\"n\": \"全部明星\", \"v\": \"\"}, {\"n\": \"邓超\", \"v\": \"邓超\"}, {\"n\": \"陈赫\", \"v\": \"陈赫\"}, {\"n\": \"何炅\", \"v\": \"何炅\"}, {\"n\": \"汪涵\", \"v\": \"汪涵\"}, {\"n\": \"王俊凯\", \"v\": \"王俊凯\"}, {\"n\": \"黄磊\", \"v\": \"黄磊\"}, {\"n\": \"谢娜\", \"v\": \"谢娜\"}, {\"n\": \"黄渤\", \"v\": \"黄渤\"}, {\"n\": \"周杰伦\", \"v\": \"周杰伦\"}, {\"n\": \"薛之谦\", \"v\": \"薛之谦\"}, {\"n\": \"Angelababy\", \"v\": \"Angelababy\"}, {\"n\": \"易烊千玺\", \"v\": \"易烊千玺\"}, {\"n\": \"岳云鹏\", \"v\": \"岳云鹏\"}, {\"n\": \"王嘉尔\", \"v\": \"王嘉尔\"}, {\"n\": \"鹿晗\", \"v\": \"鹿晗\"}, {\"n\": \"杨幂\", \"v\": \"杨幂\"}, {\"n\": \"沈腾\", \"v\": \"沈腾\"}, {\"n\": \"张艺兴\", \"v\": \"张艺兴\"}, {\"n\": \"潘玮柏\", \"v\": \"潘玮柏\"}, {\"n\": \"华晨宇\", \"v\": \"华晨宇\"}, {\"n\": \"李维嘉\", \"v\": \"李维嘉\"}, {\"n\": \"宋小宝\", \"v\": \"宋小宝\"}, {\"n\": \"贾玲\", \"v\": \"贾玲\"}, {\"n\": \"沙溢\", \"v\": \"沙溢\"}, {\"n\": \"撒贝宁\", \"v\": \"撒贝宁\"}, {\"n\": \"涂磊\", \"v\": \"涂磊\"}]}, {\"key\": \"by\", \"name\": \"排序\", \"value\": [{\"n\": \"最近热映\", \"v\": \"rankhot\"}, {\"n\": \"最近上映\", \"v\": \"ranklatest\"}]}], \"4\": [{\"key\": \"class\", \"name\": \"类型\", \"value\": [{\"n\": \"全部类型\", \"v\": \"\"}, {\"n\": \"热血\", \"v\": \"热血\"}, {\"n\": \"科幻\", \"v\": \"科幻\"}, {\"n\": \"美少女\", \"v\": \"美少女\"}, {\"n\": \"魔幻\", \"v\": \"魔幻\"}, {\"n\": \"经典\", \"v\": \"经典\"}, {\"n\": \"励志\", \"v\": \"励志\"}, {\"n\": \"少儿\", \"v\": \"少儿\"}, {\"n\": \"冒险\", \"v\": \"冒险\"}, {\"n\": \"搞笑\", \"v\": \"搞笑\"}, {\"n\": \"推理\", \"v\": \"推理\"}, {\"n\": \"恋爱\", \"v\": \"恋爱\"}, {\"n\": \"治愈\", \"v\": \"治愈\"}, {\"n\": \"幻想\", \"v\": \"幻想\"}, {\"n\": \"校园\", \"v\": \"校园\"}, {\"n\": \"动物\", \"v\": \"动物\"}, {\"n\": \"机战\", \"v\": \"机战\"}, {\"n\": \"亲子\", \"v\": \"亲子\"}, {\"n\": \"儿歌\", \"v\": \"儿歌\"}, {\"n\": \"运动\", \"v\": \"运动\"}, {\"n\": \"悬疑\", \"v\": \"悬疑\"}, {\"n\": \"怪物\", \"v\": \"怪物\"}, {\"n\": \"战争\", \"v\": \"战争\"}, {\"n\": \"益智\", \"v\": \"益智\"}, {\"n\": \"青春\", \"v\": \"青春\"}, {\"n\": \"童话\", \"v\": \"童话\"}, {\"n\": \"竞技\", \"v\": \"竞技\"}, {\"n\": \"动作\", \"v\": \"动作\"}, {\"n\": \"社会\", \"v\": \"社会\"}, {\"n\": \"友情\", \"v\": \"友情\"}, {\"n\": \"真人版\", \"v\": \"真人版\"}, {\"n\": \"电影版\", \"v\": \"电影版\"}, {\"n\": \"OVA版\", \"v\": \"OVA版\"}]}, {\"key\": \"year\", \"name\": \"年代\", \"value\": [{\"n\": \"全部年代\", \"v\": \"\"}, {\"n\": \"2026\", \"v\": \"2026\"}, {\"n\": \"2025\", \"v\": \"2025\"}, {\"n\": \"2024\", \"v\": \"2024\"}, {\"n\": \"2023\", \"v\": \"2023\"}, {\"n\": \"2022\", \"v\": \"2022\"}, {\"n\": \"2021\", \"v\": \"2021\"}, {\"n\": \"2020\", \"v\": \"2020\"}, {\"n\": \"2019\", \"v\": \"2019\"}, {\"n\": \"2018\", \"v\": \"2018\"}, {\"n\": \"2017\", \"v\": \"2017\"}, {\"n\": \"2016\", \"v\": \"2016\"}, {\"n\": \"2015\", \"v\": \"2015\"}, {\"n\": \"2014\", \"v\": \"2014\"}, {\"n\": \"2013\", \"v\": \"2013\"}, {\"n\": \"2012\", \"v\": \"2012\"}, {\"n\": \"2011\", \"v\": \"2011\"}, {\"n\": \"2010\", \"v\": \"2010\"}, {\"n\": \"2009\", \"v\": \"2009\"}, {\"n\": \"2008\", \"v\": \"2008\"}, {\"n\": \"2007\", \"v\": \"2007\"}, {\"n\": \"2006\", \"v\": \"2006\"}, {\"n\": \"2005\", \"v\": \"2005\"}, {\"n\": \"2004\", \"v\": \"2004\"}, {\"n\": \"更早\", \"v\": \"更早\"}]}, {\"key\": \"area\", \"name\": \"地区\", \"value\": [{\"n\": \"全部地区\", \"v\": \"\"}, {\"n\": \"内地\", \"v\": \"大陆\"}, {\"n\": \"美国\", \"v\": \"美国\"}, {\"n\": \"日本\", \"v\": \"日本\"}]}, {\"key\": \"by\", \"name\": \"排序\", \"value\": [{\"n\": \"最近热映\", \"v\": \"rankhot\"}, {\"n\": \"最近上映\", \"v\": \"ranklatest\"}]}]}");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("class", jSONArray);
        jSONObject3.put("filters", jSONObject2);
        return jSONObject3.toString();
    }

    public String homeVideoContent() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArrayOptJSONArray = new JSONObject(b("https://api.web.360kan.com/v1/rank?cat=2&callback=", "https://www.360kan.com/rank/dianying")).optJSONArray("data");
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
            String strOptString = jSONObject.optString("ent_id");
            JSONObject jSONObjectPut = new JSONObject().put("detailUrl", "https://api.web.360kan.com/v1/detail?cat=1&id=" + strOptString + "&callback=").put("detailReferer", "https://www.360kan.com/m/" + strOptString + ".html");
            String strOptString2 = jSONObject.optString("title");
            String strOptString3 = jSONObject.optString("cover");
            String strA = a(jSONObject.optJSONArray("moviecat"));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("vod_id", jSONObjectPut.toString());
            jSONObject2.put("vod_name", strOptString2);
            jSONObject2.put("vod_pic", strOptString3);
            jSONObject2.put("vod_remarks", strA);
            jSONArray.put(jSONObject2);
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("list", jSONArray);
        return jSONObject3.toString();
    }

    public void init(Context context, String str) {
        super.init(context, str);
        if (str == null) {
            str = "";
        }
        this.b = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        HashMap map = new HashMap();
        map.put("User-Agent", this.a);
        C0329g c0329g = new C0329g();
        c0329g.x(str2);
        c0329g.m(1);
        c0329g.g();
        c0329g.f(map);
        return C0529a.addDanmaku(c0329g.toString());
    }

    public String searchContent(String str, boolean z) throws JSONException {
        String strEncode = URLEncoder.encode(str);
        String strB = b("https://api.so.360kan.com/index?force_v=1&kw=" + strEncode + "&from=&pageno=1&v_ap=1&tab=all", "https://so.360kan.com/?kw=" + strEncode);
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArrayOptJSONArray = new JSONObject(strB).optJSONObject("data").optJSONObject("longData").optJSONArray("rows");
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            String strOptString = jSONObjectOptJSONObject.optString("en_id");
            JSONObject jSONObjectPut = new JSONObject().put("detailUrl", "https://api.web.360kan.com/v1/detail?cat=" + jSONObjectOptJSONObject.optString("cat_id") + "&id=" + strOptString + "&callback=").put("detailReferer", jSONObjectOptJSONObject.optString("url"));
            String strOptString2 = jSONObjectOptJSONObject.optString("titleTxt");
            String strOptString3 = jSONObjectOptJSONObject.optString("cover");
            String strOptString4 = jSONObjectOptJSONObject.optString("cat_name");
            String string = jSONObjectPut.toString();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vod_id", string);
            jSONObject.put("vod_name", strOptString2);
            jSONObject.put("vod_pic", strOptString3);
            jSONObject.put("vod_remarks", strOptString4);
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("list", jSONArray);
        return jSONObject2.toString();
    }
}
