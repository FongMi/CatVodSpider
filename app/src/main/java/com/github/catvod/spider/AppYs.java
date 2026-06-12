package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C0284;
import com.github.catvod.spider.merge.C0295;
import com.github.catvod.spider.merge.SOY;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
public class AppYs extends Spider {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static HashMap<String, String> f4;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private static final Object f5 = new Object();

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private static final Pattern f6 = Pattern.compile("api\\.php/.*?/vod");

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private static final Pattern f7 = Pattern.compile("api\\.php/.+?\\.vod");

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private static final Pattern f8 = Pattern.compile("/.+\\?.+=");

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    private static final Pattern f9 = Pattern.compile(".*(url|v|vid|php\\?id)=");

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    private static final Pattern f10 = Pattern.compile("https?://[^/]*");

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    private static final Pattern[] f11 = {Pattern.compile("jx\\.+huimaojia\\.+com/player"), Pattern.compile("py\\.+789pan\\.+cn/player/tm\\.php\\?url="), Pattern.compile("ztys\\.+waruanzy\\.+com/player/\\?url="), Pattern.compile("yingshi\\.+waruanzy\\.+com/789pan/\\?url="), Pattern.compile("vip\\.+parwix\\.+com:4433/player/\\?url="), Pattern.compile("api\\.+cxitco\\.+cn"), Pattern.compile("/vip\\.+renrenmi.cc"), Pattern.compile("yanbing\\.+parwix\\.+com:4433/player"), Pattern.compile("json\\.+cantin\\.+cc/apijson\\.php"), Pattern.compile("ffdm\\.+miaoletv\\.+com/\\?url="), Pattern.compile("vip\\.+sylwl\\.+cn/api/\\?key="), Pattern.compile("jx\\.+dikotv\\.+com/\\?url="), Pattern.compile("zly\\.+xjqxz\\.+top/player/\\?url="), Pattern.compile("5znn\\.+xyz/m3u8\\.+php"), Pattern.compile("uid=1735&my="), Pattern.compile("api\\.+xkvideo\\.+design/m3u8\\.+php\\?url="), Pattern.compile("play\\.+szbodankyy\\.+com/xxoocnmb"), Pattern.compile("vip\\.+fj6080\\.+xyz/player/\\?url="), Pattern.compile("a\\.+dxzj88\\.+com/jiexi"), Pattern.compile("host\\.+q-q\\.+wang/api"), Pattern.compile("保佑")};

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    private static final Pattern[] f12 = {Pattern.compile("player=new"), Pattern.compile("<div id=\"video\""), Pattern.compile("<div id=\"[^\"]*?player\""), Pattern.compile("//视频链接"), Pattern.compile("HlsJsPlayer\\("), Pattern.compile("<iframe[\\s\\S]*?src=\"[^\"]+?\""), Pattern.compile("<video[\\s\\S]*?src=\"[^\"]+?\"")};

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    private String f13 = "";

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    private final HashMap<String, String> f14 = new HashMap<>();

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private String m0(String str) {
        return (str.contains("api.php/app") || str.contains("xgapp") || str.contains("freekan")) ? "Dart/2.14 (dart:io)" : (str.contains("zsb") || str.contains("fkxs") || str.contains("xays") || str.contains("xcys") || str.contains("szys") || str.contains("dxys") || str.contains("ytys") || str.contains("qnys")) ? "Dart/2.15 (dart:io)" : str.contains(".vod") ? "okhttp/4.1.0" : "Dalvik/2.1.0";
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private void m1(JSONObject jSONObject, String str, ArrayList<JSONArray> arrayList) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = jSONObject.get(next);
                if (next.equals(str) && (obj instanceof JSONArray)) {
                    arrayList.add((JSONArray) obj);
                }
                if (obj instanceof JSONObject) {
                    m1((JSONObject) obj, str, arrayList);
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    for (int i = 0; i < jSONArray.length(); i++) {
                        m1(jSONArray.getJSONObject(i), str, arrayList);
                    }
                }
            } catch (JSONException e) {
                SpiderDebug.log(e);
            }
        }
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private void m2(String str, JSONObject jSONObject, String str2, JSONObject jSONObject2, String str3) throws JSONException {
        ArrayList arrayList;
        ArrayList arrayList2;
        JSONArray jSONArray;
        boolean z;
        int i;
        boolean z2;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        boolean zContains = str.contains("api.php/app/");
        String strD = "jpg.hou.lu/jm/za/index.php";
        String strD2 = "parse_api";
        String strD3 = "name";
        String strD4 = "vod_url_with_player";
        String strD5 = "vod_class";
        String strD6 = "data";
        String strD7 = "url";
        String strD8 = "type_name";
        String strD9 = "vod_content";
        String strD10 = "vod_director";
        String str4 = strD;
        String strD11 = "vod_actor";
        String str5 = strD2;
        String strD12 = "vod_remarks";
        ArrayList arrayList5 = arrayList3;
        String strD13 = "vod_area";
        String str6 = strD7;
        String strD14 = "vod_year";
        ArrayList arrayList6 = arrayList4;
        String strD15 = "vod_pic";
        String str7 = strD3;
        String strD16 = "vod_name";
        String strD17 = "vod_id";
        if (zContains) {
            JSONObject jSONObject3 = jSONObject.getJSONObject(strD6);
            jSONObject2.put(strD17, jSONObject3.optString(strD17, str3));
            jSONObject2.put(strD16, jSONObject3.getString(strD16));
            jSONObject2.put(strD15, jSONObject3.getString(strD15));
            jSONObject2.put(strD8, jSONObject3.optString(strD5));
            jSONObject2.put(strD14, jSONObject3.optString(strD14));
            jSONObject2.put(strD13, jSONObject3.optString(strD13));
            jSONObject2.put(strD12, jSONObject3.optString(strD12));
            jSONObject2.put(strD11, jSONObject3.optString(strD11));
            jSONObject2.put(strD10, jSONObject3.optString(strD10));
            jSONObject2.put(strD9, jSONObject3.optString(strD9));
            JSONArray jSONArray2 = jSONObject3.getJSONArray(strD4);
            int i2 = 0;
            while (i2 < jSONArray2.length()) {
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                String str8 = str7;
                String strM10 = m10(jSONObject4.getString(str8));
                ArrayList arrayList7 = arrayList6;
                arrayList7.add(strM10);
                String str9 = str6;
                ArrayList arrayList8 = arrayList5;
                arrayList8.add(jSONObject4.getString(str9));
                String str10 = str5;
                String strOptString = jSONObject4.optString(str10);
                String str11 = str4;
                if (strOptString.contains(str11)) {
                    strOptString = "http://vip.mengx.vip/home/api?type=ys&uid=3249696&key=aefqrtuwxyEFHKNOQY&url=";
                }
                this.f14.put(strM10, strOptString);
                i2++;
                str7 = str8;
                arrayList6 = arrayList7;
                str6 = str9;
                str5 = str10;
                arrayList5 = arrayList8;
                str4 = str11;
            }
        } else {
            String str12 = str4;
            String str13 = str5;
            String str14 = str6;
            if (!str.contains("xgapp")) {
                ArrayList arrayList9 = arrayList5;
                ArrayList arrayList10 = arrayList6;
                String str15 = str14;
                if (str.contains(".vod")) {
                    JSONObject jSONObject5 = jSONObject.getJSONObject(strD6);
                    jSONObject2.put(strD17, jSONObject5.optString(strD17, str3));
                    jSONObject2.put(strD16, jSONObject5.getString(strD16));
                    jSONObject2.put(strD15, jSONObject5.getString(strD15));
                    jSONObject2.put(strD8, jSONObject5.optString(strD5));
                    jSONObject2.put(strD14, jSONObject5.optString(strD14));
                    jSONObject2.put(strD13, jSONObject5.optString(strD13));
                    jSONObject2.put(strD12, jSONObject5.optString(strD12));
                    jSONObject2.put(strD11, jSONObject5.optString(strD11));
                    jSONObject2.put(strD10, jSONObject5.optString(strD10));
                    jSONObject2.put(strD9, jSONObject5.optString(strD9));
                    JSONArray jSONArray3 = jSONObject5.getJSONArray("vod_play_list");
                    int i3 = 0;
                    while (i3 < jSONArray3.length()) {
                        JSONObject jSONObject6 = jSONArray3.getJSONObject(i3);
                        String strD18 = "player_info";
                        String strM102 = m10(jSONObject6.getJSONObject(strD18).getString("show"));
                        ArrayList arrayList11 = arrayList10;
                        arrayList11.add(strM102);
                        String str16 = str15;
                        ArrayList arrayList12 = arrayList9;
                        arrayList12.add(jSONObject6.getString(str16));
                        try {
                            ArrayList arrayList13 = new ArrayList();
                            String[] strArrSplit = jSONObject6.getJSONObject(strD18).optString("parse").split(",");
                            String[] strArrSplit2 = jSONObject6.getJSONObject(strD18).optString("parse2").split(",");
                            int length = strArrSplit.length;
                            int i4 = 0;
                            while (i4 < length) {
                                try {
                                    String str17 = strArrSplit[i4];
                                    if (f8.matcher(str17).find()) {
                                        Pattern[] patternArr = f11;
                                        int length2 = patternArr.length;
                                        jSONArray = jSONArray3;
                                        int i5 = 0;
                                        while (true) {
                                            if (i5 >= length2) {
                                                i = length;
                                                z2 = true;
                                                break;
                                            }
                                            i = length;
                                            try {
                                                if (patternArr[i5].matcher(str17).find()) {
                                                    z2 = false;
                                                    break;
                                                } else {
                                                    i5++;
                                                    length = i;
                                                }
                                            } catch (Exception e) {
                                                e = e;
                                                SpiderDebug.log(e);
                                                i3++;
                                                jSONArray3 = jSONArray;
                                                arrayList9 = arrayList12;
                                                arrayList10 = arrayList11;
                                                str15 = str16;
                                            }
                                        }
                                        if (z2) {
                                            arrayList13.add(str17);
                                        }
                                    } else {
                                        jSONArray = jSONArray3;
                                        i = length;
                                    }
                                    i4++;
                                    jSONArray3 = jSONArray;
                                    length = i;
                                } catch (Exception e2) {
                                    e = e2;
                                    jSONArray = jSONArray3;
                                }
                            }
                            jSONArray = jSONArray3;
                            for (String str18 : strArrSplit2) {
                                if (f8.matcher(str18).find()) {
                                    Pattern[] patternArr2 = f11;
                                    int length3 = patternArr2.length;
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 >= length3) {
                                            z = true;
                                            break;
                                        } else {
                                            if (patternArr2[i6].matcher(str18).find()) {
                                                z = false;
                                                break;
                                            }
                                            i6++;
                                        }
                                    }
                                    if (z) {
                                        arrayList13.add(str18);
                                    }
                                }
                            }
                            if (arrayList13.size() <= 0 || !((String) arrayList13.get(0)).contains("=")) {
                                this.f14.put(strM102, "http://1.117.152.239:39000/?url=");
                            } else {
                                String string = (String) arrayList13.get(0);
                                boolean zContains2 = string.contains("http");
                                String strD19 = ".";
                                String strD20 = "..";
                                try {
                                    if (zContains2) {
                                        Matcher matcher = f9.matcher(string);
                                        if (matcher.find()) {
                                            string = matcher.group(0).replace(strD20, strD19).replace("vip.aotian.love", "vip.gaotian.love");
                                        }
                                    } else if (string.contains("//")) {
                                        Matcher matcher2 = f9.matcher(string);
                                        if (matcher2.find()) {
                                            string = "http:" + matcher2.group(0).replace(strD20, strD19);
                                        }
                                    } else {
                                        Matcher matcher3 = f10.matcher(str);
                                        if (matcher3.find()) {
                                            Matcher matcher4 = f9.matcher(str);
                                            if (matcher4.find()) {
                                                StringBuilder sb = new StringBuilder();
                                                try {
                                                    sb.append(matcher3.group(0));
                                                    sb.append(matcher4.group(0).replace(strD20, strD19));
                                                    string = sb.toString();
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    SpiderDebug.log(e);
                                                    i3++;
                                                    jSONArray3 = jSONArray;
                                                    arrayList9 = arrayList12;
                                                    arrayList10 = arrayList11;
                                                    str15 = str16;
                                                }
                                            }
                                            this.f14.put(strM102, string);
                                        }
                                    }
                                    this.f14.put(strM102, string);
                                } catch (Exception e4) {
                                    e = e4;
                                    SpiderDebug.log(e);
                                }
                            }
                        } catch (Exception e5) {
                            e = e5;
                            jSONArray = jSONArray3;
                        }
                        i3++;
                        jSONArray3 = jSONArray;
                        arrayList9 = arrayList12;
                        arrayList10 = arrayList11;
                        str15 = str16;
                    }
                    arrayList2 = arrayList9;
                    arrayList = arrayList10;
                } else {
                    if (f6.matcher(str).find()) {
                        jSONObject2.put(strD17, jSONObject.optString(strD17, str3));
                        jSONObject2.put(strD16, jSONObject.getString("title"));
                        jSONObject2.put(strD15, jSONObject.getString("img_url"));
                        jSONObject2.put(strD8, m9(jSONObject.optJSONArray("type")));
                        jSONObject2.put(strD14, jSONObject.optString("pubtime"));
                        jSONObject2.put(strD13, m9(jSONObject.optJSONArray("area")));
                        jSONObject2.put(strD12, jSONObject.optString("trunk"));
                        jSONObject2.put(strD11, m9(jSONObject.optJSONArray("actor")));
                        jSONObject2.put(strD10, m9(jSONObject.optJSONArray("director")));
                        jSONObject2.put(strD9, jSONObject.optString("intro"));
                        JSONObject jSONObject7 = jSONObject.getJSONObject("videolist");
                        Iterator<String> itKeys = jSONObject7.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            JSONArray jSONArray4 = jSONObject7.getJSONArray(next);
                            ArrayList arrayList14 = new ArrayList();
                            for (int i7 = 0; i7 < jSONArray4.length(); i7++) {
                                JSONObject jSONObject8 = jSONArray4.getJSONObject(i7);
                                arrayList14.add(jSONObject8.getString("title") + "$" + jSONObject8.getString(str15));
                            }
                            arrayList10.add(m10(next));
                            arrayList9.add(TextUtils.join("#", arrayList14));
                        }
                    }
                    arrayList = arrayList10;
                    arrayList2 = arrayList9;
                }
                jSONObject2.put("vod_play_from", TextUtils.join("$$$", arrayList));
                jSONObject2.put("vod_play_url", TextUtils.join("$$$", arrayList2));
            }
            JSONObject jSONObject9 = jSONObject.getJSONObject(strD6).getJSONObject("vod_info");
            jSONObject2.put(strD17, jSONObject9.optString(strD17, str3));
            jSONObject2.put(strD16, jSONObject9.getString(strD16));
            jSONObject2.put(strD15, jSONObject9.getString(strD15));
            jSONObject2.put(strD8, jSONObject9.optString(strD5));
            jSONObject2.put(strD14, jSONObject9.optString(strD14));
            jSONObject2.put(strD13, jSONObject9.optString(strD13));
            jSONObject2.put(strD12, jSONObject9.optString(strD12));
            jSONObject2.put(strD11, jSONObject9.optString(strD11));
            jSONObject2.put(strD10, jSONObject9.optString(strD10));
            jSONObject2.put(strD9, jSONObject9.optString(strD9));
            JSONArray jSONArray5 = jSONObject9.getJSONArray(strD4);
            int i8 = 0;
            while (i8 < jSONArray5.length()) {
                JSONObject jSONObject10 = jSONArray5.getJSONObject(i8);
                String str19 = str7;
                String strM103 = m10(jSONObject10.getString(str19));
                ArrayList arrayList15 = arrayList6;
                arrayList15.add(strM103);
                String str20 = str14;
                ArrayList arrayList16 = arrayList5;
                arrayList16.add(jSONObject10.getString(str20));
                String str21 = str13;
                String strOptString2 = jSONObject10.optString(str21);
                String str22 = str12;
                if (strOptString2.contains(str22)) {
                    strOptString2 = "http://vip.mengx.vip/home/api?type=ys&uid=3249696&key=aefqrtuwxyEFHKNOQY&url=";
                }
                this.f14.put(strM103, strOptString2);
                i8++;
                str7 = str19;
                str14 = str20;
                str13 = str21;
                arrayList5 = arrayList16;
                str12 = str22;
                arrayList6 = arrayList15;
            }
        }
        arrayList2 = arrayList5;
        arrayList = arrayList6;
        jSONObject2.put("vod_play_from", TextUtils.join("$$$", arrayList));
        jSONObject2.put("vod_play_url", TextUtils.join("$$$", arrayList2));
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    private void m3(String str, JSONObject jSONObject) throws JSONException {
        String strOptString;
        boolean z;
        String str2;
        boolean zContains = str.contains("baidu.com");
        String strD = "playUrl";
        String strD2 = "parse";
        String strD3 = "url";
        if (!zContains) {
            jSONObject.put(strD2, 1);
            jSONObject.put(strD, "");
            jSONObject.put(strD3, str);
            return;
        }
        String str3 = str.split("wd=")[1];
        boolean zContains2 = str3.contains("duoduozy.com");
        String strD4 = "header";
        if (zContains2 || str3.contains("suoyo.cc")) {
            JSONObject jSONObject2 = new JSONObject(C0295.m1089("https://www.6080kan.cc/app.php?url=" + str3, null));
            jSONObject.put(strD2, 0);
            jSONObject.put(strD, "");
            jSONObject.put(strD3, jSONObject2.getString(strD3));
            jSONObject.put(strD4, "{\"User-Agent\":\" Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.81 Safari/537.36 SE 2.X MetaSr 1.0\",\"referer\":\" https://player.duoduozy.com\",\"origin\":\" https://dp.duoduozy.com\",\"Host\":\" cache.m3u8.suoyo.cc\"}");
            return;
        }
        if (str3.contains("xfy")) {
            JSONObject jSONObject3 = new JSONObject(C0295.m1089(str3, null));
            jSONObject.put(strD2, 0);
            jSONObject.put(strD, "");
            jSONObject.put(strD3, jSONObject3.getString(strD3));
            jSONObject.put(strD4, "{\"referer\":\" appguapi.lihaoyun.top:11543\",\"User-Agent\":\" Dart/2.14 (dart:io)\"}}");
            return;
        }
        boolean zContains3 = str3.contains("api.iopenyun.com:88");
        String strD5 = "=";
        if (zContains3) {
            if (!str3.contains("html")) {
                jSONObject.put(strD2, 1);
                jSONObject.put(strD, "");
                jSONObject.put(strD3, str3);
                jSONObject.put("ua", "Mozilla/5.0 Windows10");
                jSONObject.put(strD4, "{\"Referer\":\"https://user.iopenyun.com:520/user/video/\"}");
                return;
            }
            Object string = new JSONObject(C0295.m1089("https://api.m3u8.tv:5678/home/api?type=ys&uid=233711&key=dgilouvFKNRSWX2467&url=" + str3.split(strD5)[1], null)).getString(strD3);
            jSONObject.put(strD2, 0);
            jSONObject.put(strD, "");
            jSONObject.put(strD3, string);
            return;
        }
        if (str3.contains("cat.wkfile.com")) {
            jSONObject.put(strD2, 0);
            jSONObject.put(strD, "");
            jSONObject.put(strD3, str3);
            jSONObject.put(strD4, "{\"User-Agent\":\" Lavf/58.12.100\",\"Referer\":\" wkfile.com\"}");
            return;
        }
        if (str3.contains(strD5) || str3.indexOf(".m3u8") <= 15) {
            String strD6 = ".mp4";
            if (str3.indexOf(strD6) <= 15 && !str3.contains("/obj/tos")) {
                if (!str3.contains(strD5)) {
                    jSONObject.put(strD2, 0);
                    jSONObject.put(strD, "");
                    jSONObject.put(strD3, str3);
                    return;
                }
                HashMap map = new HashMap();
                String strD7 = "User-Agent";
                String strD8 = "Mozilla/5.0 Android";
                map.put(strD7, strD8);
                TreeMap treeMap = new TreeMap();
                String strM1092 = C0295.m1092(str3, map, treeMap);
                String strM1084 = C0295.m1084(treeMap);
                String strD9 = "bilibili.com";
                String strD10 = "mgtv.com";
                String strD11 = "<html";
                Object objD = "{\"User-Agent\":\" Mozilla/5.0\", \"Referer\":\" \"}";
                String strD12 = "url=";
                if (strM1084 != null) {
                    String str4 = "";
                    String strM10842 = strM1084;
                    String strM10922 = strM1092;
                    while (true) {
                        str2 = strM10922;
                        if (strM10842 == null) {
                            strM10842 = str4;
                            break;
                        }
                        String str5 = strD6;
                        if (strM10842.indexOf(strD6) > 30) {
                            break;
                        }
                        map.put(strD7, strD8);
                        strM10922 = C0295.m1092(strM10842, map, treeMap);
                        str4 = strM10842;
                        strM10842 = C0295.m1084(treeMap);
                        strD6 = str5;
                    }
                    if (!strM10842.contains("=http") && !strM10842.contains(strD12)) {
                        if (!str3.contains("www.mgtv.com")) {
                            jSONObject.put(strD2, 0);
                            jSONObject.put(strD, "");
                            jSONObject.put(strD3, strM10842);
                            return;
                        } else {
                            jSONObject.put(strD2, 0);
                            jSONObject.put(strD, "");
                            jSONObject.put(strD3, strM10842);
                            jSONObject.put(strD4, objD);
                            return;
                        }
                    }
                    if (str2.contains(strD11)) {
                        jSONObject.put(strD2, 1);
                        jSONObject.put(strD, "");
                        jSONObject.put(strD3, strM10842);
                        return;
                    }
                    Object string2 = new JSONObject(str2).getString(strD3);
                    jSONObject.put(strD2, 0);
                    jSONObject.put(strD, "");
                    jSONObject.put(strD3, string2);
                    if (strM10842.contains(strD10)) {
                        jSONObject.put(strD4, objD);
                        return;
                    } else {
                        strM10842.contains(strD9);
                        return;
                    }
                }
                boolean zContains4 = strM1092.contains(strD11);
                String strD13 = "https://jx.banyung.xyz:7799/player/?url=";
                String strD14 = "http://1.117.152.239:39000/?url=";
                String strD15 = "renrenmi";
                String strD16 = "http";
                if (zContains4) {
                    Pattern[] patternArr = f12;
                    int length = patternArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = false;
                            break;
                        }
                        int i2 = length;
                        if (patternArr[i].matcher(strM1092).find()) {
                            z = true;
                            break;
                        } else {
                            i++;
                            length = i2;
                        }
                    }
                    if (z) {
                        jSONObject.put(strD2, 1);
                        jSONObject.put(strD, "");
                        jSONObject.put(strD3, str3);
                        return;
                    }
                    if (str3.split(strD12)[1].contains(strD16)) {
                        jSONObject.put(strD2, 1);
                        jSONObject.put(strD, "");
                        jSONObject.put(strD3, strD14 + str3.split(strD12)[1]);
                        return;
                    }
                    if (str3.split(strD12)[1].contains(strD15)) {
                        jSONObject.put(strD2, 1);
                        jSONObject.put(strD, "");
                        jSONObject.put(strD3, "http://www.1080kan.cc/jiexi/rrmi.php?url=" + str3.split(strD12)[1]);
                        jSONObject.put(strD4, "{\"Referer\":\"http://www.1080kan.cc/\"}");
                        return;
                    }
                    String str6 = str3.split(strD12)[1];
                    jSONObject.put(strD2, 1);
                    jSONObject.put(strD, "");
                    jSONObject.put(strD3, strD13 + str3.split(strD12)[1]);
                    return;
                }
                try {
                    strOptString = new JSONObject(strM1092).optString(strD3);
                } catch (Exception e) {
                    StringUtils.printStackTrace();
                    strOptString = "";
                }
                if (strOptString.length() > 1) {
                    if (str3.contains(strD10)) {
                        jSONObject.put(strD2, 0);
                        jSONObject.put(strD, "");
                        jSONObject.put(strD3, strOptString);
                        jSONObject.put(strD4, objD);
                        return;
                    }
                    if (str3.contains(strD9)) {
                        jSONObject.put(strD2, 0);
                        jSONObject.put(strD, "");
                        jSONObject.put(strD3, strOptString);
                        return;
                    } else {
                        jSONObject.put(strD2, 0);
                        jSONObject.put(strD, "");
                        jSONObject.put(strD3, strOptString);
                        return;
                    }
                }
                if (str3.split(strD12)[1].contains(strD16)) {
                    jSONObject.put(strD2, 1);
                    jSONObject.put(strD, "");
                    jSONObject.put(strD3, strD14 + str3.split(strD12)[1]);
                    return;
                }
                if (str3.split(strD12)[1].contains(strD15)) {
                    jSONObject.put(strD2, 1);
                    jSONObject.put(strD, "");
                    jSONObject.put(strD3, "http://www.1080kan.cc/jiexi/rrmi.php?url=" + str3.split(strD12)[1]);
                    jSONObject.put(strD4, "{\"Referer\":\"http://www.1080kan.cc/\"}");
                    return;
                }
                String str7 = str3.split(strD12)[1];
                jSONObject.put(strD2, 1);
                jSONObject.put(strD, "");
                jSONObject.put(strD3, strD13 + str3.split(strD12)[1]);
                return;
            }
        }
        if (str3.contains("hsl.ysgc.xyz")) {
            Object string3 = new JSONObject(C0295.m1089("https://jx.ysgc.xyz/?url=" + str3, null)).getString(strD3);
            jSONObject.put(strD2, 0);
            jSONObject.put(strD, "");
            jSONObject.put(strD3, string3);
            jSONObject.put(strD4, "{\"Referer\":\" https://ysgc.cc\"}");
            return;
        }
        if (str3.contains("1.ruifenglb.com")) {
            jSONObject.put(strD2, 0);
            jSONObject.put(strD, "");
            jSONObject.put(strD3, str3);
            jSONObject.put(strD4, "{\"Referer\":\" https://1.ruifenglb.com\"}");
            return;
        }
        Matcher matcher = Pattern.compile(".*(http.*)").matcher(str3);
        if (matcher.find()) {
            jSONObject.put(strD2, 0);
            jSONObject.put(strD, "");
            jSONObject.put(strD3, matcher.group(1));
        } else {
            jSONObject.put(strD2, 0);
            jSONObject.put(strD, "");
            jSONObject.put(strD3, str3);
        }
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    private HashMap<String, String> m4(String str) {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", m0(str));
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m5(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            java.util.regex.Pattern r0 = com.github.catvod.spider.AppYs.f7
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r0 = r0.find()
            if (r0 == 0) goto L1d
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r2.f14
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L46
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r2.f14
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            goto L48
        L1d:
            java.lang.String r0 = "1B223858041F0A7D30060458"
            java.lang.String r0 = com.github.catvod.spider.merge.SOY.d(r0)
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L35
            java.lang.String r0 = "0235300604"
            java.lang.String r0 = com.github.catvod.spider.merge.SOY.d(r0)
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L48
        L35:
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r2.f14
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L46
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r2.f14
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            goto L48
        L46:
            java.lang.String r3 = ""
        L48:
            java.lang.String r0 = "092438065A1D122B24185A1D027C3218"
            java.lang.String r0 = com.github.catvod.spider.merge.SOY.d(r0)
            boolean r0 = r3.contains(r0)
            java.lang.String r1 = "12262506074D557D3B0E5A071B20261F0C59193D3C4C404349617E061816033723594B02083E6C"
            java.lang.String r1 = com.github.catvod.spider.merge.SOY.d(r1)
            if (r0 != 0) goto L8e
            java.lang.String r0 = "092438065A1D123628015A011322"
            java.lang.String r0 = com.github.catvod.spider.merge.SOY.d(r0)
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L67
            goto L8e
        L67:
            java.lang.String r4 = "103A221C5A1A1B3C35031C0254313E1B"
            java.lang.String r4 = com.github.catvod.spider.merge.SOY.d(r4)
            boolean r4 = r3.contains(r4)
            if (r4 != 0) goto L8c
            java.lang.String r4 = "0C7C3B1E100E0D7C271F0458143A350C42414C"
            java.lang.String r4 = com.github.catvod.spider.merge.SOY.d(r4)
            boolean r4 = r3.contains(r4)
            if (r4 == 0) goto L80
            goto L8c
        L80:
            java.lang.String r4 = "027F3F581714"
            java.lang.String r4 = com.github.catvod.spider.merge.SOY.d(r4)
            boolean r4 = r3.contains(r4)
            if (r4 == 0) goto Lc6
        L8c:
            r3 = r1
            goto Lc6
        L8e:
            java.lang.String r3 = "9EE8EB92CECD92EDE6"
            java.lang.String r3 = com.github.catvod.spider.merge.SOY.d(r3)
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto La1
            java.lang.String r3 = "122625064E58552526015A464A6A611D1519543132591E1E1F2A38590605173B7F061C074527231A49"
            java.lang.String r3 = com.github.catvod.spider.merge.SOY.d(r3)
            goto Lc6
        La1:
            java.lang.String r3 = "9EE8EB92CECD"
            java.lang.String r3 = com.github.catvod.spider.merge.SOY.d(r3)
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto Lb4
            java.lang.String r3 = "122625064E58552526015A464A6A611D1519543132591E1E1F2A38590605542239064B02083E6C"
            java.lang.String r3 = com.github.catvod.spider.merge.SOY.d(r3)
            goto Lc6
        Lb4:
            java.lang.String r3 = "9DC7FB9EF8F3"
            java.lang.String r3 = com.github.catvod.spider.merge.SOY.d(r3)
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L8c
            java.lang.String r3 = "122625064E58552526015A464A6A611D1519543132591E1E1F2A38591206542239064B02083E6C"
            java.lang.String r3 = com.github.catvod.spider.merge.SOY.d(r3)
        Lc6:
            return r3
        */
        // TODO: Method not decompiled by JADX - needs manual reconstruction
        return "";
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    private String m6(String str, String str2, String str3) {
        boolean zContains = str.contains("xgapp");
        CharSequence charSequenceD = "xfy";
        CharSequence charSequenceD2 = "/obj/tos";
        String strD = ".mp4";
        String strD2 = ".m3u8";
        String strD3 = "https://www.baidu.com/s?wd=";
        String strD4 = "url=";
        if (zContains || str.contains("api.php/app/") || str.contains(".vod")) {
            if (str3.indexOf(strD2) > 15 || str3.indexOf(strD) > 15 || str3.contains(charSequenceD2)) {
                if (str3.contains(strD4)) {
                    return strD3 + str3.split(strD4)[1];
                }
                return strD3 + str3;
            }
            if (!str2.contains(strD4) && str3.contains("RongXingVR")) {
                return "https://www.baidu.com/s?wd=https://fast.rongxingvr.cn:8866/api/?key=nShWumGdMIbTwngTbI&url=" + str3;
            }
            if (!str2.contains(strD4) && str3.contains("LT")) {
                return "https://www.baidu.com/s?wd=https://f7.pyxddc.com/bcjx/4k.php?url=" + str3;
            }
            if (!str2.contains(strD4) && str3.contains("renrenmi")) {
                return "https://www.baidu.com/s?wd=https://kuba.renrenmi.cc:2266/api/?key=Y6UYLYtjImTCKe98JD&url=" + str3;
            }
            if (!str2.contains(strD4) && str3.contains(".html")) {
                return "https://www.baidu.com/s?wd=http://1.117.152.239:39000/?url=" + str3;
            }
            if (str3.contains(charSequenceD)) {
                return "https://www.baidu.com/s?wd=http://jiexi.yunl.cc/api/?key=xYNESYSvHp1DV2ckKs&url=" + str3;
            }
            return strD3 + str2 + str3;
        }
        if (!f6.matcher(str).find()) {
            return strD3 + str3;
        }
        if (str3.indexOf(strD2) > 15 || str3.indexOf(strD) > 15 || str3.contains(charSequenceD2)) {
            if (str3.contains(strD4)) {
                return strD3 + str3.split(strD4)[1];
            }
            return strD3 + str3;
        }
        if (str3.contains(charSequenceD)) {
            if (str3.contains(strD4)) {
                return "https://www.baidu.com/s?wd=http://cache.dmtt.xyz/xfyjx/xfyjx.php?url=" + str3.split(strD4)[1];
            }
            return "https://www.baidu.com/s?wd=https://json.hfyrw.com/mao.go?url=" + str3;
        }
        if (str3.contains("www.bilibili.com")) {
            return "https://www.baidu.com/s?wd=https://jx.parwix.com:4433/player/?url=" + str3.split(strD4)[1];
        }
        if (!str.contains("zhenfy")) {
            String strD5 = "cztv";
            if (!str.contains(strD5) && !str.contains("1.14.63.101") && !str.contains("fit:8") && !str.contains("diliktv.xyz") && !str.contains("ppzhu.vip") && !str.contains("api.8d8q.com") && !str.contains("haokanju1.cc") && !str.contains(strD5)) {
                if (str.contains("lxyyy") || str.contains("JsonUtils.zjj.life") || str.contains("lktv") || str.contains("0818tv") || str.contains("ruoxinew")) {
                    return "https://www.baidu.com/s?wd=https://play.tkys.tv/?url=" + str3.split(strD4)[1];
                }
                return strD3 + str3;
            }
        }
        return strD3 + str3 + "&app=10000&account=272775028&password=qq272775028";
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    private String m7(String str, String str2) {
        boolean zContains = str.contains(".vod");
        String strD = "&page=";
        if (zContains) {
            if (str.contains("iopenyun.com")) {
                return str + "/list?wd=" + str2 + strD;
            }
            return str + "?wd=" + str2 + strD;
        }
        if (str.contains("api.php/app") || str.contains("xgapp")) {
            return str + "search?text=" + str2 + "&pg=";
        }
        if (!f6.matcher(str).find()) {
            return "";
        }
        if (str.contains("esellauto") || str.contains("1.14.63.101") || str.contains("zjys") || str.contains("dcd") || str.contains("lxue") || str.contains("weetai.cn") || str.contains("haokanju1") || str.contains("fit:8") || str.contains("zjj.life") || str.contains("love9989") || str.contains("8d8q") || str.contains("lk.pxun") || str.contains("hgyx") || str.contains("521x5") || str.contains("lxyyy") || str.contains("0818tv") || str.contains("diyoui") || str.contains("diliktv") || str.contains("ppzhu") || str.contains("aitesucai") || str.contains("zz.ci") || str.contains("chxjon") || str.contains("watchmi") || str.contains("vipbp") || str.contains("bhtv") || str.contains("xfykl")) {
            return str + "?ac=list&wd=" + str2 + strD;
        }
        return str + "?ac=list&zm=" + str2 + strD;
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    private boolean m8(String str) {
        return str.equals("伦理") || str.equals("情色") || str.equals("福利");
    }

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    private String m9(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return TextUtils.join(",", arrayList);
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    private static String m10(String str) {
        synchronized (f5) {
            if (f4 == null) {
                HashMap<String, String> map = new HashMap<>();
                f4 = map;
                map.put("youku", "优酷M");
                f4.put("qq", "腾讯M");
                f4.put("iqiyi", "爱奇艺M");
                f4.put("qiyi", "奇艺M");
                f4.put("letv", "乐视M");
                f4.put("sohu", "搜狐M");
                f4.put("tudou", "土豆M");
                f4.put("pptv", "PPTVM");
                f4.put("mgtv", "芒果TVM");
                f4.put("wasu", "华数M");
                f4.put("bilibili", "哔哩M");
            }
            if (!f4.containsKey(str)) {
                return str;
            }
            return f4.get(str);
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3;
        String str4;
        int i;
        String strD = "year";
        String strD2 = "lang";
        String strD3 = "area";
        String strD4 = "class";
        String strD5 = "totalpage";
        String strD6 = "limit";
        String strD7 = "vod_id";
        String strD8 = "total";
        String strD9 = "pagecount";
        String strD10 = "list";
        String strD11 = "data";
        try {
            str4 = this.f13;
            str3 = "";
        } catch (Exception e) {
            e = e;
            str3 = "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            String str5 = strD7;
            sb.append(m11(str4));
            sb.append(str);
            sb.append(m12(str4));
            String strReplace = sb.toString().replace("#PN#", str2).replace("筛选class", (map == null || !map.containsKey(strD4)) ? str3 : map.get(strD4)).replace("筛选area", (map == null || !map.containsKey(strD3)) ? str3 : map.get(strD3)).replace("筛选lang", (map == null || !map.containsKey(strD2)) ? str3 : map.get(strD2)).replace("筛选year", (map == null || !map.containsKey(strD)) ? str3 : map.get(strD));
            String strD12 = "排序";
            String strReplace2 = strReplace.replace(strD12, (map == null || !map.containsKey(strD12)) ? str3 : map.get(strD12));
            SpiderDebug.log(strReplace2);
            JSONObject jSONObject = new JSONObject(C0295.m1089(strReplace2, m4(strReplace2)));
            try {
            } catch (Exception e2) {
                SpiderDebug.log(e2);
            }
            if (jSONObject.has(strD5) && (jSONObject.get(strD5) instanceof Integer)) {
                i = jSONObject.getInt(strD5);
            } else if (jSONObject.has(strD9) && (jSONObject.get(strD9) instanceof Integer)) {
                i = jSONObject.getInt(strD9);
            } else if (jSONObject.has(strD11) && (jSONObject.get(strD11) instanceof JSONObject) && jSONObject.getJSONObject(strD11).has(strD8) && (jSONObject.getJSONObject(strD11).get(strD8) instanceof Integer) && jSONObject.getJSONObject(strD11).has(strD6) && (jSONObject.getJSONObject(strD11).get(strD6) instanceof Integer)) {
                int i2 = jSONObject.getJSONObject(strD11).getInt(strD6);
                int i3 = jSONObject.getJSONObject(strD11).getInt(strD8);
                i = i3 % i2 == 0 ? i3 / i2 : (i3 / i2) + 1;
            } else {
                i = Integer.MAX_VALUE;
            }
            JSONArray jSONArray = null;
            JSONArray jSONArray2 = new JSONArray();
            if (jSONObject.has(strD10) && (jSONObject.get(strD10) instanceof JSONArray)) {
                jSONArray = jSONObject.getJSONArray(strD10);
            } else if (jSONObject.has(strD11) && (jSONObject.get(strD11) instanceof JSONObject) && jSONObject.getJSONObject(strD11).has(strD10) && (jSONObject.getJSONObject(strD11).get(strD10) instanceof JSONArray)) {
                jSONArray = jSONObject.getJSONObject(strD11).getJSONArray(strD10);
            } else if (jSONObject.has(strD11) && (jSONObject.get(strD11) instanceof JSONArray)) {
                jSONArray = jSONObject.getJSONArray(strD11);
            }
            if (jSONArray != null) {
                int i4 = 0;
                while (i4 < jSONArray.length()) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                    String str6 = str5;
                    boolean zHas = jSONObject2.has(str6);
                    String strD13 = "vod_remarks";
                    String strD14 = "vod_pic";
                    String strD15 = "vod_name";
                    if (zHas) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(str6, jSONObject2.getString(str6));
                        jSONObject3.put(strD15, jSONObject2.getString(strD15));
                        jSONObject3.put(strD14, jSONObject2.getString(strD14));
                        jSONObject3.put(strD13, jSONObject2.getString(strD13));
                        jSONArray2.put(jSONObject3);
                    } else {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put(str6, jSONObject2.getString("nextlink"));
                        jSONObject4.put(strD15, jSONObject2.getString("title"));
                        jSONObject4.put(strD14, jSONObject2.getString("pic"));
                        jSONObject4.put(strD13, jSONObject2.getString("state"));
                        jSONArray2.put(jSONObject4);
                    }
                    i4++;
                    str5 = str6;
                }
            }
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("page", str2);
            jSONObject5.put(strD9, i);
            jSONObject5.put(strD6, 90);
            jSONObject5.put(strD8, Integer.MAX_VALUE);
            jSONObject5.put(strD10, jSONArray2);
            return jSONObject5.toString();
        } catch (Exception e3) {
            e = e3;
            SpiderDebug.log(e);
            return str3;
        }
    }

    public String detailContent(List<String> list) {
        try {
            String str = this.f13;
            String str2 = m15(str) + list.get(0);
            SpiderDebug.log(str2);
            String strM1089 = C0295.m1089(str2, m4(str2));
            JSONObject jSONObject = new JSONObject(strM1089);
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            m2(str, jSONObject, strM1089, jSONObject3, list.get(0));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject3);
            jSONObject2.put("list", jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String homeContent(boolean z) {
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        JSONObject jSONObject;
        JSONArray jSONArray;
        String str11;
        String str12;
        String[] strArr;
        Object obj;
        String str13;
        String str14;
        JSONObject jSONObject2;
        String str15;
        String str16;
        String str17;
        JSONObject jSONObject3;
        String strD = "筛选";
        String str18 = "";
        String strD2 = "filters";
        String strD3 = "list";
        String strD4 = "data";
        try {
            String strM13 = m13(this.f13);
            boolean zIsEmpty = strM13.isEmpty();
            String strD5 = "=";
            String strD6 = "\\+";
            String strD7 = "\n";
            JSONArray jSONArray2 = null;
            String strD8 = "type_id";
            String strD9 = "type_name";
            if (zIsEmpty) {
                String[] strArrSplit = m14(strM13, null).split(strD7)[0].split(strD6);
                jSONArray2 = new JSONArray();
                for (int i2 = 1; i2 < strArrSplit.length; i2++) {
                    String[] strArrSplit2 = strArrSplit[i2].trim().split(strD5);
                    if (strArrSplit2.length >= 2) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put(strD9, strArrSplit2[0].trim());
                        jSONObject4.put(strD8, strArrSplit2[1].trim());
                        jSONArray2.put(jSONObject4);
                    }
                }
            } else {
                SpiderDebug.log(strM13);
                JSONObject jSONObject5 = new JSONObject(C0295.m1089(strM13, m4(strM13)));
                if (jSONObject5.has(strD3) && (jSONObject5.get(strD3) instanceof JSONArray)) {
                    jSONArray2 = jSONObject5.getJSONArray(strD3);
                } else if (jSONObject5.has(strD4) && (jSONObject5.get(strD4) instanceof JSONObject) && jSONObject5.getJSONObject(strD4).has(strD3) && (jSONObject5.getJSONObject(strD4).get(strD3) instanceof JSONArray)) {
                    jSONArray2 = jSONObject5.getJSONObject(strD4).getJSONArray(strD3);
                } else if (jSONObject5.has(strD4) && (jSONObject5.get(strD4) instanceof JSONArray)) {
                    jSONArray2 = jSONObject5.getJSONArray(strD4);
                }
            }
            JSONObject jSONObject6 = new JSONObject();
            JSONArray jSONArray3 = new JSONArray();
            String strD10 = "class";
            if (jSONArray2 != null) {
                int i3 = 0;
                while (i3 < jSONArray2.length()) {
                    JSONObject jSONObject7 = jSONArray2.getJSONObject(i3);
                    JSONArray jSONArray4 = jSONArray2;
                    String string = jSONObject7.getString(strD9);
                    if (m8(string)) {
                        str2 = strD;
                        str3 = str18;
                        jSONArray = jSONArray3;
                        str4 = strM13;
                        str5 = strD10;
                        str6 = strD5;
                        str7 = strD6;
                        str8 = strD7;
                        str9 = strD8;
                        str10 = strD9;
                        i = i3;
                    } else {
                        i = i3;
                        String string2 = jSONObject7.getString(strD8);
                        JSONArray jSONArray5 = jSONArray3;
                        JSONObject jSONObject8 = new JSONObject();
                        jSONObject8.put(strD8, string2);
                        jSONObject8.put(strD9, string);
                        JSONObject jSONObjectOptJSONObject = jSONObject7.optJSONObject("type_extend");
                        if (z) {
                            String[] strArrSplit3 = m14(strM13, jSONObjectOptJSONObject).split(strD7);
                            JSONArray jSONArray6 = new JSONArray();
                            str4 = strM13;
                            int i4 = strM13.isEmpty() ? 1 : 0;
                            str8 = strD7;
                            while (i4 < strArrSplit3.length) {
                                String strTrim = strArrSplit3[i4].trim();
                                if (strTrim.isEmpty()) {
                                    str12 = strD;
                                    str14 = str18;
                                    jSONObject2 = jSONObject8;
                                    str15 = strD10;
                                    str16 = strD5;
                                    str11 = strD6;
                                    strArr = strArrSplit3;
                                    str13 = strD8;
                                    str17 = strD9;
                                } else {
                                    String[] strArrSplit4 = strTrim.split(strD6);
                                    str11 = strD6;
                                    String strTrim2 = strArrSplit4[0].trim();
                                    if (strTrim2.contains(strD)) {
                                        strArr = strArrSplit3;
                                        String strReplace = strTrim2.replace(strD, str18);
                                        if (strReplace.equals(strD10)) {
                                            strTrim2 = "类型";
                                            str12 = strD;
                                        } else {
                                            str12 = strD;
                                            if (strReplace.equals("area")) {
                                                strTrim2 = "地区";
                                            } else if (strReplace.equals("lang")) {
                                                strTrim2 = "语言";
                                            } else if (strReplace.equals("year")) {
                                                strTrim2 = "年份";
                                            }
                                        }
                                        obj = strTrim2;
                                        strTrim2 = strReplace;
                                    } else {
                                        str12 = strD;
                                        strArr = strArrSplit3;
                                        obj = strTrim2;
                                    }
                                    JSONObject jSONObject9 = new JSONObject();
                                    str13 = strD8;
                                    jSONObject9.put("key", strTrim2);
                                    jSONObject9.put("name", obj);
                                    JSONArray jSONArray7 = new JSONArray();
                                    int i5 = 1;
                                    while (i5 < strArrSplit4.length) {
                                        JSONObject jSONObject10 = new JSONObject();
                                        String[] strArr2 = strArrSplit4;
                                        String strTrim3 = strArrSplit4[i5].trim();
                                        String str19 = strD9;
                                        int iIndexOf = strTrim3.indexOf(strD5);
                                        String str20 = strD5;
                                        str = str18;
                                        String strD11 = "v";
                                        String str21 = strD10;
                                        String strD12 = "n";
                                        if (iIndexOf == -1) {
                                            try {
                                                if (m8(strTrim3)) {
                                                    jSONObject3 = jSONObject8;
                                                } else {
                                                    jSONObject10.put(strD12, strTrim3);
                                                    jSONObject10.put(strD11, strTrim3);
                                                    jSONObject3 = jSONObject8;
                                                    jSONArray7.put(jSONObject10);
                                                }
                                            } catch (Exception e) {
                                                e = e;
                                                SpiderDebug.log(e);
                                                return str;
                                            }
                                        } else {
                                            jSONObject3 = jSONObject8;
                                            String strSubstring = strTrim3.substring(0, iIndexOf);
                                            if (!m8(strSubstring)) {
                                                jSONObject10.put(strD12, strSubstring.trim());
                                                jSONObject10.put(strD11, strTrim3.substring(iIndexOf + 1).trim());
                                                jSONArray7.put(jSONObject10);
                                            }
                                        }
                                        i5++;
                                        jSONObject8 = jSONObject3;
                                        strD9 = str19;
                                        strArrSplit4 = strArr2;
                                        strD5 = str20;
                                        str18 = str;
                                        strD10 = str21;
                                    }
                                    str14 = str18;
                                    jSONObject2 = jSONObject8;
                                    str15 = strD10;
                                    str16 = strD5;
                                    str17 = strD9;
                                    jSONObject9.put("value", jSONArray7);
                                    jSONArray6.put(jSONObject9);
                                }
                                i4++;
                                jSONObject8 = jSONObject2;
                                strArrSplit3 = strArr;
                                strD6 = str11;
                                strD = str12;
                                strD8 = str13;
                                strD9 = str17;
                                strD5 = str16;
                                str18 = str14;
                                strD10 = str15;
                            }
                            str2 = strD;
                            str3 = str18;
                            JSONObject jSONObject11 = jSONObject8;
                            str5 = strD10;
                            str6 = strD5;
                            str7 = strD6;
                            str9 = strD8;
                            str10 = strD9;
                            if (!jSONObject6.has(strD2)) {
                                jSONObject6.put(strD2, new JSONObject());
                            }
                            jSONObject6.getJSONObject(strD2).put(string2, jSONArray6);
                            jSONObject = jSONObject11;
                        } else {
                            str2 = strD;
                            str3 = str18;
                            str4 = strM13;
                            str5 = strD10;
                            str6 = strD5;
                            str7 = strD6;
                            str8 = strD7;
                            str9 = strD8;
                            str10 = strD9;
                            jSONObject = jSONObject8;
                        }
                        jSONArray = jSONArray5;
                        jSONArray.put(jSONObject);
                    }
                    i3 = i + 1;
                    jSONArray3 = jSONArray;
                    jSONArray2 = jSONArray4;
                    strD7 = str8;
                    strM13 = str4;
                    strD6 = str7;
                    strD = str2;
                    strD8 = str9;
                    strD9 = str10;
                    strD5 = str6;
                    str18 = str3;
                    strD10 = str5;
                }
            }
            str = str18;
            jSONObject6.put(strD10, jSONArray3);
            return jSONObject6.toString();
        } catch (Exception e2) {
            e = e2;
            str = str18;
        }
    }

    public String homeVideoContent() {
        boolean z;
        try {
            String str = this.f13;
            String strM16 = m16(str);
            if (strM16.isEmpty()) {
                strM16 = m11(str) + "movie&page=1&area=&type=&start=";
                z = true;
            } else {
                z = false;
            }
            SpiderDebug.log(strM16);
            JSONObject jSONObject = new JSONObject(C0295.m1089(strM16, m4(strM16)));
            JSONArray jSONArray = new JSONArray();
            String strD = "vod_remarks";
            String strD2 = "vod_pic";
            String strD3 = "vod_name";
            String strD4 = "vod_id";
            if (z) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("data");
                for (int i = 0; i < jSONArray2.length(); i++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(strD4, jSONObject2.getString("nextlink"));
                    jSONObject3.put(strD3, jSONObject2.getString("title"));
                    jSONObject3.put(strD2, jSONObject2.getString("pic"));
                    jSONObject3.put(strD, jSONObject2.getString("state"));
                    jSONArray.put(jSONObject3);
                }
            } else {
                ArrayList<JSONArray> arrayList = new ArrayList<>();
                m1(jSONObject, "vlist", arrayList);
                if (arrayList.isEmpty()) {
                    m1(jSONObject, "vod_list", arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                for (JSONArray jSONArray3 : arrayList) {
                    for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                        JSONObject jSONObject4 = jSONArray3.getJSONObject(i2);
                        String string = jSONObject4.getString(strD4);
                        if (!arrayList2.contains(string)) {
                            arrayList2.add(string);
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put(strD4, string);
                            jSONObject5.put(strD3, jSONObject4.getString(strD3));
                            jSONObject5.put(strD2, jSONObject4.getString(strD2));
                            jSONObject5.put(strD, jSONObject4.getString(strD));
                            jSONArray.put(jSONObject5);
                        }
                    }
                }
            }
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("list", jSONArray);
            return jSONObject6.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context, str);
        this.f13 = str;
    }

    public boolean isVideoFormat(String str) {
        return C0284.m1044(str);
    }

    public boolean manualVideoCheck() {
        return true;
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            String str3 = this.f13;
            String strM6 = m6(str3, m5(str3, str), str2);
            JSONObject jSONObject = new JSONObject();
            m3(strM6, jSONObject);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        String strD = "vod_id";
        String strD2 = "list";
        String strD3 = "data";
        try {
            String strM7 = m7(this.f13, URLEncoder.encode(str));
            JSONObject jSONObject = new JSONObject(C0295.m1089(strM7, m4(strM7)));
            JSONArray jSONArray = null;
            JSONArray jSONArray2 = new JSONArray();
            if (jSONObject.has(strD2) && (jSONObject.get(strD2) instanceof JSONArray)) {
                jSONArray = jSONObject.getJSONArray(strD2);
            } else if (jSONObject.has(strD3) && (jSONObject.get(strD3) instanceof JSONObject) && jSONObject.getJSONObject(strD3).has(strD2) && (jSONObject.getJSONObject(strD3).get(strD2) instanceof JSONArray)) {
                jSONArray = jSONObject.getJSONObject(strD3).getJSONArray(strD2);
            } else if (jSONObject.has(strD3) && (jSONObject.get(strD3) instanceof JSONArray)) {
                jSONArray = jSONObject.getJSONArray(strD3);
            }
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    boolean zHas = jSONObject2.has(strD);
                    String strD4 = "vod_remarks";
                    String strD5 = "vod_pic";
                    String strD6 = "vod_name";
                    if (zHas) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(strD, jSONObject2.getString(strD));
                        jSONObject3.put(strD6, jSONObject2.getString(strD6));
                        jSONObject3.put(strD5, jSONObject2.getString(strD5));
                        jSONObject3.put(strD4, jSONObject2.getString(strD4));
                        jSONArray2.put(jSONObject3);
                    } else {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put(strD, jSONObject2.getString("nextlink"));
                        jSONObject4.put(strD6, jSONObject2.getString("title"));
                        jSONObject4.put(strD5, jSONObject2.getString("pic"));
                        jSONObject4.put(strD4, jSONObject2.getString("state"));
                        jSONArray2.put(jSONObject4);
                    }
                }
            }
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(strD2, jSONArray2);
            return jSONObject5.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    String m11(String str) {
        if (str.contains("api.php/app") || str.contains("xgapp")) {
            boolean zContains = str.contains("dijiaxia");
            String strD = "video?tid=";
            if (zContains) {
                return "http://www.dijiaxia.com/api.php/app/" + strD;
            }
            return str + strD;
        }
        if (!str.contains(".vod")) {
            return str + "?ac=list&class=";
        }
        if (str.contains("iopenyun")) {
            return str + "/list?type=";
        }
        return str + "?type=";
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    String m12(String str) {
        return (str.contains("api.php/app") || str.contains("xgapp")) ? "&class=筛选class&area=筛选area&lang=筛选lang&year=筛选year&limit=18&pg=#PN#" : str.contains(".vod") ? "&class=筛选class&area=筛选area&lang=筛选lang&year=筛选year&by=排序&limit=18&page=#PN#" : "&page=#PN#&area=筛选area&type=筛选class&start=筛选year";
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    String m13(String str) {
        if (str.contains("api.php/app") || str.contains("xgapp")) {
            return str + "nav?token=";
        }
        if (!str.contains(".vod")) {
            return "";
        }
        if (str.contains("iopenyun.com")) {
            return str + "/list?type";
        }
        return str + "/types";
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    String m14(String str, JSONObject jSONObject) {
        String str2 = "";
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.equals("class") || next.equals("area") || next.equals("lang") || next.equals("year")) {
                    try {
                        str2 = str2 + "筛选" + next + "+全部=+" + jSONObject.getString(next).replace(",", "+") + "\n";
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        if (!str.contains(".vod")) {
            return (str.contains("api.php/app") || str.contains("xgapp")) ? str2 : "分类+全部=+电影=movie+连续剧=tvplay+综艺=tvshow+动漫=comic+4K=movie_4k+体育=tiyu\n筛选class+全部=+喜剧+爱情+恐怖+动作+科幻+剧情+战争+警匪+犯罪+动画+奇幻+武侠+冒险+枪战+恐怖+悬疑+惊悚+经典+青春+文艺+微电影+古装+历史+运动+农村+惊悚+惊悚+伦理+情色+福利+三级+儿童+网络电影\n筛选area+全部=+大陆+香港+台湾+美国+英国+法国+日本+韩国+德国+泰国+印度+西班牙+加拿大+其他\n筛选year+全部=+2022+2021+2020+2019+2018+2017+2016+2015+2014+2013+2012+2011+2010+2009+2008+2007+2006+2005+2004+2003+2002+2001+2000";
        }
        return str2 + "\n排序+全部=+最新=time+最热=hits+评分=score";
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    String m15(String str) {
        if (!str.contains("api.php/app") && !str.contains("xgapp")) {
            if (!str.contains(".vod")) {
                return "";
            }
            if (str.contains("iopenyun")) {
                return str + "/detailID?vod_id=";
            }
            return str + "/detail?vod_id=";
        }
        boolean zContains = str.contains("dijiaxia");
        String strD = "video_detail?id=";
        if (zContains) {
            return "https://www.dijiaxia.com/api.php/app/" + strD;
        }
        if (str.contains("1010dy")) {
            return "http://www.1010dy.cc/api.php/app/" + strD;
        }
        return str + strD;
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    String m16(String str) {
        if (str.contains("api.php/app") || str.contains("xgapp")) {
            return str + "index_video?token=";
        }
        if (!str.contains(".vod")) {
            return "";
        }
        return str + "/vodPhbAll";
    }
}
