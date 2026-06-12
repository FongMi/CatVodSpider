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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
public class AppYsV2 extends Spider {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static final Pattern f15 = Pattern.compile("api\\.php/.*?/vod");

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private static final Pattern f16 = Pattern.compile("api\\.php/.+?\\.vod");

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private static final Pattern f17 = Pattern.compile("/.+\\?.+=");

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private static final Pattern f18 = Pattern.compile(".*(url|v|vid|php\\?id)=");

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private static final Pattern f19 = Pattern.compile("https?://[^/]*");

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    private static final Pattern[] f20 = {Pattern.compile("player=new"), Pattern.compile("<div id=\"video\""), Pattern.compile("<div id=\"[^\"]*?player\""), Pattern.compile("//视频链接"), Pattern.compile("HlsJsPlayer\\("), Pattern.compile("<iframe[\\s\\S]*?src=\"[^\"]+?\""), Pattern.compile("<video[\\s\\S]*?src=\"[^\"]+?\"")};

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    private final HashMap<String, ArrayList<String>> f21 = new HashMap<>();

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    private String[] f22 = null;

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private String m17(String str) {
        return (str.contains("api.php/app") || str.contains("xgapp") || str.contains("freekan")) ? "Dart/2.14 (dart:io)" : (str.contains("zsb") || str.contains("fkxs") || str.contains("xays") || str.contains("xcys") || str.contains("szys") || str.contains("dxys") || str.contains("ytys") || str.contains("qnys")) ? "Dart/2.15 (dart:io)" : str.contains(".vod") ? "okhttp/4.1.0" : "Dalvik/2.1.0";
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private void m18(JSONObject jSONObject, String str, ArrayList<JSONArray> arrayList) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = jSONObject.get(next);
                if (next.equals(str) && (obj instanceof JSONArray)) {
                    arrayList.add((JSONArray) obj);
                }
                if (obj instanceof JSONObject) {
                    m18((JSONObject) obj, str, arrayList);
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    for (int i = 0; i < jSONArray.length(); i++) {
                        m18(jSONArray.getJSONObject(i), str, arrayList);
                    }
                }
            } catch (JSONException e) {
                SpiderDebug.log(e);
            }
        }
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private void m19(String str, JSONObject jSONObject, String str2, JSONObject jSONObject2, String str3) throws JSONException {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList<String> arrayList3;
        String str4;
        String str5;
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        boolean zContains = str.contains("api.php/app/");
        String strD = "name";
        String strD2 = "parse_api";
        String strD3 = "code";
        String strD4 = "vod_url_with_player";
        String strD5 = "vod_class";
        String strD6 = "data";
        String strD7 = "url";
        String strD8 = "type_name";
        String strD9 = "vod_content";
        String strD10 = "vod_director";
        String str6 = strD2;
        String strD11 = "vod_actor";
        ArrayList arrayList6 = arrayList4;
        String strD12 = "vod_remarks";
        String str7 = strD7;
        String strD13 = "vod_area";
        ArrayList arrayList7 = arrayList5;
        String strD14 = "vod_year";
        String str8 = strD;
        String strD15 = "vod_pic";
        String str9 = strD3;
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
            JSONArray jSONArray = jSONObject3.getJSONArray(strD4);
            int i = 0;
            while (i < jSONArray.length()) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                String str10 = str9;
                String strTrim = jSONObject4.optString(str10).trim();
                if (strTrim.isEmpty()) {
                    str5 = str8;
                    strTrim = jSONObject4.getString(str5).trim();
                } else {
                    str5 = str8;
                }
                ArrayList arrayList8 = arrayList7;
                arrayList8.add(strTrim);
                String str11 = str7;
                ArrayList arrayList9 = arrayList6;
                arrayList9.add(jSONObject4.getString(str11));
                String str12 = str6;
                String strTrim2 = jSONObject4.optString(str12).trim();
                ArrayList<String> arrayList10 = this.f21.get(strTrim);
                if (arrayList10 == null) {
                    arrayList10 = new ArrayList<>();
                    this.f21.put(strTrim, arrayList10);
                }
                if (!strTrim2.isEmpty() && !arrayList10.contains(strTrim2)) {
                    arrayList10.add(strTrim2);
                }
                i++;
                str9 = str10;
                str8 = str5;
                arrayList7 = arrayList8;
                str7 = str11;
                str6 = str12;
                arrayList6 = arrayList9;
            }
        } else {
            String str13 = str6;
            String str14 = str7;
            if (!str.contains("xgapp")) {
                ArrayList arrayList11 = arrayList6;
                ArrayList arrayList12 = arrayList7;
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
                    JSONArray jSONArray2 = jSONObject5.getJSONArray("vod_play_list");
                    int i2 = 0;
                    while (i2 < jSONArray2.length()) {
                        JSONObject jSONObject6 = jSONArray2.getJSONObject(i2);
                        String strD18 = "player_info";
                        String strTrim3 = jSONObject6.getJSONObject(strD18).optString("from").trim();
                        if (strTrim3.isEmpty()) {
                            strTrim3 = jSONObject6.getJSONObject(strD18).optString("show").trim();
                        }
                        ArrayList arrayList13 = arrayList12;
                        arrayList13.add(strTrim3);
                        String str16 = str15;
                        ArrayList arrayList14 = arrayList11;
                        arrayList14.add(jSONObject6.getString(str16));
                        try {
                            arrayList3 = new ArrayList();
                            String[] strArrSplit = jSONObject6.getJSONObject(strD18).optString("parse").split(",");
                            String[] strArrSplit2 = jSONObject6.getJSONObject(strD18).optString("parse2").split(",");
                            arrayList3.addAll(Arrays.asList(strArrSplit));
                            arrayList3.addAll(Arrays.asList(strArrSplit2));
                        } catch (Exception e) {
                            e = e;
                        }
                        try {
                            ArrayList<String> arrayList15 = this.f21.get(strTrim3);
                            if (arrayList15 == null) {
                                arrayList15 = new ArrayList<>();
                                this.f21.put(strTrim3, arrayList15);
                            }
                            for (String strGroup : arrayList3) {
                                if (strGroup.contains("http")) {
                                    Matcher matcher = f18.matcher(strGroup);
                                    if (matcher.find()) {
                                        strGroup = matcher.group(0);
                                    }
                                } else if (strGroup.contains("//")) {
                                    Matcher matcher2 = f18.matcher(strGroup);
                                    if (matcher2.find()) {
                                        strGroup = "http:" + matcher2.group(0);
                                    }
                                } else {
                                    Matcher matcher3 = f19.matcher(str);
                                    if (matcher3.find()) {
                                        Matcher matcher4 = f18.matcher(str);
                                        if (matcher4.find()) {
                                            strGroup = matcher3.group(0) + matcher4.group(0);
                                        }
                                    }
                                }
                                String strTrim4 = strGroup.replace("..", ".").trim();
                                if (!strTrim4.isEmpty() && !arrayList15.contains(strTrim4)) {
                                    arrayList15.add(strTrim4);
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            SpiderDebug.log(e);
                        }
                        i2++;
                        arrayList11 = arrayList14;
                        arrayList12 = arrayList13;
                        str15 = str16;
                    }
                    arrayList2 = arrayList11;
                    arrayList = arrayList12;
                } else {
                    String str17 = str15;
                    if (f15.matcher(str).find()) {
                        jSONObject2.put(strD17, jSONObject.optString(strD17, str3));
                        String strD19 = "title";
                        jSONObject2.put(strD16, jSONObject.getString(strD19));
                        jSONObject2.put(strD15, jSONObject.getString("img_url"));
                        jSONObject2.put(strD8, m25(jSONObject.optJSONArray("type")));
                        jSONObject2.put(strD14, jSONObject.optString("pubtime"));
                        jSONObject2.put(strD13, m25(jSONObject.optJSONArray("area")));
                        jSONObject2.put(strD12, jSONObject.optString("trunk"));
                        jSONObject2.put(strD11, m25(jSONObject.optJSONArray("actor")));
                        jSONObject2.put(strD10, m25(jSONObject.optJSONArray("director")));
                        jSONObject2.put(strD9, jSONObject.optString("intro"));
                        JSONObject jSONObject7 = jSONObject.getJSONObject("videolist");
                        Iterator<String> itKeys = jSONObject7.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            ArrayList<String> arrayList16 = this.f21.get(next);
                            if (arrayList16 == null) {
                                arrayList16 = new ArrayList<>();
                                this.f21.put(next, arrayList16);
                            }
                            JSONArray jSONArray3 = jSONObject7.getJSONArray(next);
                            ArrayList arrayList17 = new ArrayList();
                            int i3 = 0;
                            while (i3 < jSONArray3.length()) {
                                JSONObject jSONObject8 = jSONArray3.getJSONObject(i3);
                                String str18 = str17;
                                String string = jSONObject8.getString(str18);
                                if (string.contains("url=")) {
                                    int iIndexOf = string.indexOf("url=") + 4;
                                    String strTrim5 = string.substring(0, iIndexOf).trim();
                                    if (!strTrim5.isEmpty() && !arrayList16.contains(strTrim5)) {
                                        arrayList16.add(strTrim5);
                                    }
                                    arrayList17.add(jSONObject8.getString(strD19) + "$" + string.substring(iIndexOf).trim());
                                } else {
                                    arrayList17.add(jSONObject8.getString(strD19) + "$" + string);
                                }
                                i3++;
                                str17 = str18;
                            }
                            arrayList12.add(next);
                            arrayList11.add(TextUtils.join("#", arrayList17));
                        }
                    }
                    arrayList = arrayList12;
                    arrayList2 = arrayList11;
                }
                String strD20 = "$$$";
                jSONObject2.put("vod_play_from", TextUtils.join(strD20, arrayList));
                jSONObject2.put("vod_play_url", TextUtils.join(strD20, arrayList2));
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
            JSONArray jSONArray4 = jSONObject9.getJSONArray(strD4);
            int i4 = 0;
            while (i4 < jSONArray4.length()) {
                JSONObject jSONObject10 = jSONArray4.getJSONObject(i4);
                String str19 = str9;
                String strTrim6 = jSONObject10.optString(str19).trim();
                if (strTrim6.isEmpty()) {
                    str4 = str8;
                    strTrim6 = jSONObject10.getString(str4).trim();
                } else {
                    str4 = str8;
                }
                ArrayList arrayList18 = arrayList7;
                arrayList18.add(strTrim6);
                String str20 = str14;
                ArrayList arrayList19 = arrayList6;
                arrayList19.add(jSONObject10.getString(str20));
                String str21 = str13;
                String strTrim7 = jSONObject10.optString(str21).trim();
                ArrayList<String> arrayList20 = this.f21.get(strTrim6);
                if (arrayList20 == null) {
                    arrayList20 = new ArrayList<>();
                    this.f21.put(strTrim6, arrayList20);
                }
                if (!strTrim7.isEmpty() && !arrayList20.contains(strTrim7)) {
                    arrayList20.add(strTrim7);
                }
                i4++;
                str9 = str19;
                str8 = str4;
                str14 = str20;
                str13 = str21;
                arrayList6 = arrayList19;
                arrayList7 = arrayList18;
            }
        }
        arrayList2 = arrayList6;
        arrayList = arrayList7;
        String strD202 = "$$$";
        jSONObject2.put("vod_play_from", TextUtils.join(strD202, arrayList));
        jSONObject2.put("vod_play_url", TextUtils.join(strD202, arrayList2));
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private String m20() {
        String[] strArr = this.f22;
        return (strArr == null || strArr.length < 1) ? "" : strArr[0].trim();
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    private JSONObject m21(String str, ArrayList<String> arrayList, String str2) throws JSONException {
        Iterator<String> it = arrayList.iterator();
        String str3 = "";
        while (true) {
            boolean zHasNext = it.hasNext();
            String strD = "url";
            boolean z = true;
            JSONObject jSONObjectM1046 = null;
            if (!zHasNext) {
                if (str3.isEmpty()) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("parse", 1);
                jSONObject.put("playUrl", str3);
                jSONObject.put(strD, str2);
                return jSONObject;
            }
            String next = it.next();
            if (!next.isEmpty() && !next.equals("null")) {
                String strM26 = m26(C0295.m1089(next + str2, null), (byte) 4);
                try {
                    jSONObjectM1046 = C0284.m1046(str2, strM26);
                } catch (Throwable unused) {
                }
                if (jSONObjectM1046 != null && jSONObjectM1046.has(strD)) {
                    String strD2 = "header";
                    if (jSONObjectM1046.has(strD2)) {
                        jSONObjectM1046.put(strD2, jSONObjectM1046.getJSONObject(strD2).toString());
                        return jSONObjectM1046;
                    }
                }
                if (strM26.contains("<html")) {
                    Pattern[] patternArr = f20;
                    int length = patternArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = false;
                            break;
                        }
                        if (patternArr[i].matcher(strM26).find()) {
                            break;
                        }
                        i++;
                    }
                    if (z) {
                        str3 = next;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    private HashMap<String, String> m22(String str) {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", m17(str));
        return map;
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    private String m23(String str, String str2) {
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
        if (!f15.matcher(str).find()) {
            return "";
        }
        if (str.contains("esellauto") || str.contains("1.14.63.101") || str.contains("zjys") || str.contains("dcd") || str.contains("lxue") || str.contains("weetai.cn") || str.contains("haokanju1") || str.contains("fit:8") || str.contains("zjj.life") || str.contains("love9989") || str.contains("8d8q") || str.contains("lk.pxun") || str.contains("hgyx") || str.contains("521x5") || str.contains("lxyyy") || str.contains("0818tv") || str.contains("diyoui") || str.contains("diliktv") || str.contains("ppzhu") || str.contains("aitesucai") || str.contains("zz.ci") || str.contains("chxjon") || str.contains("watchmi") || str.contains("vipbp") || str.contains("bhtv") || str.contains("xfykl")) {
            return str + "?ac=list&wd=" + str2 + strD;
        }
        return str + "?ac=list&zm=" + str2 + strD;
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    private boolean m24(String str) {
        return str.equals("伦理") || str.equals("情色") || str.equals("福利");
    }

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    private String m25(JSONArray jSONArray) {
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

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3;
        String strM20;
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
            strM20 = m20();
            str3 = "";
        } catch (Exception e) {
            e = e;
            str3 = "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            String str4 = strD7;
            sb.append(m27(strM20));
            sb.append(str);
            sb.append(m28(strM20));
            String strReplace = sb.toString().replace("#PN#", str2).replace("筛选class", (map == null || !map.containsKey(strD4)) ? str3 : map.get(strD4)).replace("筛选area", (map == null || !map.containsKey(strD3)) ? str3 : map.get(strD3)).replace("筛选lang", (map == null || !map.containsKey(strD2)) ? str3 : map.get(strD2)).replace("筛选year", (map == null || !map.containsKey(strD)) ? str3 : map.get(strD));
            String strD12 = "排序";
            String strReplace2 = strReplace.replace(strD12, (map == null || !map.containsKey(strD12)) ? str3 : map.get(strD12));
            SpiderDebug.log(strReplace2);
            JSONObject jSONObject = new JSONObject(m26(C0295.m1089(strReplace2, m22(strReplace2)), (byte) 2));
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
                    String str5 = str4;
                    boolean zHas = jSONObject2.has(str5);
                    String strD13 = "vod_remarks";
                    String strD14 = "vod_pic";
                    String strD15 = "vod_name";
                    if (zHas) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(str5, jSONObject2.getString(str5));
                        jSONObject3.put(strD15, jSONObject2.getString(strD15));
                        jSONObject3.put(strD14, jSONObject2.getString(strD14));
                        jSONObject3.put(strD13, jSONObject2.getString(strD13));
                        jSONArray2.put(jSONObject3);
                    } else {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put(str5, jSONObject2.getString("nextlink"));
                        jSONObject4.put(strD15, jSONObject2.getString("title"));
                        jSONObject4.put(strD14, jSONObject2.getString("pic"));
                        jSONObject4.put(strD13, jSONObject2.getString("state"));
                        jSONArray2.put(jSONObject4);
                    }
                    i4++;
                    str4 = str5;
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
            String strM20 = m20();
            String str = m31(strM20) + list.get(0);
            SpiderDebug.log(str);
            String strM26 = m26(C0295.m1089(str, m22(str)), (byte) 3);
            JSONObject jSONObject = new JSONObject(strM26);
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            m19(strM20, jSONObject, strM26, jSONObject3, list.get(0));
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
            String strM29 = m29(m20());
            boolean zIsEmpty = strM29.isEmpty();
            String strD5 = "=";
            String strD6 = "\\+";
            String strD7 = "\n";
            JSONArray jSONArray2 = null;
            String strD8 = "type_id";
            String strD9 = "type_name";
            if (zIsEmpty) {
                String[] strArrSplit = m30(strM29, null).split(strD7)[0].split(strD6);
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
                SpiderDebug.log(strM29);
                JSONObject jSONObject5 = new JSONObject(m26(C0295.m1089(strM29, m22(strM29)), (byte) 0));
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
                    if (m24(string)) {
                        str2 = strD;
                        str3 = str18;
                        jSONArray = jSONArray3;
                        str4 = strM29;
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
                            String[] strArrSplit3 = m30(strM29, jSONObjectOptJSONObject).split(strD7);
                            JSONArray jSONArray6 = new JSONArray();
                            str4 = strM29;
                            int i4 = strM29.isEmpty() ? 1 : 0;
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
                                                if (m24(strTrim3)) {
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
                                            if (!m24(strSubstring)) {
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
                            str4 = strM29;
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
                    strM29 = str4;
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
            String strM20 = m20();
            String strM32 = m32(strM20);
            if (strM32.isEmpty()) {
                strM32 = m27(strM20) + "movie&page=1&area=&type=&start=";
                z = true;
            } else {
                z = false;
            }
            SpiderDebug.log(strM32);
            JSONObject jSONObject = new JSONObject(m26(C0295.m1089(strM32, m22(strM32)), (byte) 1));
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
                m18(jSONObject, "vlist", arrayList);
                if (arrayList.isEmpty()) {
                    m18(jSONObject, "vod_list", arrayList);
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
        try {
            this.f22 = str.split("###");
        } catch (Throwable unused) {
        }
    }

    public boolean isVideoFormat(String str) {
        return C0284.m1044(str);
    }

    public boolean manualVideoCheck() {
        return true;
    }

    public String playerContent(String str, String str2, List<String> list) {
        JSONObject jSONObjectM21;
        try {
            ArrayList<String> arrayList = this.f21.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.isEmpty() && (jSONObjectM21 = m21(str, arrayList, str2)) != null) {
                return jSONObjectM21.toString();
            }
            boolean zM1044 = C0284.m1044(str2);
            String strD = "url";
            String strD2 = "parse";
            if (zM1044) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(strD2, 0);
                jSONObject.put("playUrl", "");
                jSONObject.put(strD, str2);
                return jSONObject.toString();
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(strD2, 1);
            jSONObject2.put("jx", "1");
            jSONObject2.put(strD, str2);
            return jSONObject2.toString();
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
            String strM23 = m23(m20(), URLEncoder.encode(str));
            JSONObject jSONObject = new JSONObject(m26(C0295.m1089(strM23, m22(strM23)), (byte) 5));
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

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    protected String m26(String str, byte b) {
        String[] strArr = this.f22;
        if (strArr.length > 1) {
            strArr[1].equals("nftv");
        }
        return str;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    String m27(String str) {
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

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    String m28(String str) {
        return (str.contains("api.php/app") || str.contains("xgapp")) ? "&class=筛选class&area=筛选area&lang=筛选lang&year=筛选year&limit=18&pg=#PN#" : str.contains(".vod") ? "&class=筛选class&area=筛选area&lang=筛选lang&year=筛选year&by=排序&limit=18&page=#PN#" : "&page=#PN#&area=筛选area&type=筛选class&start=筛选year";
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    String m29(String str) {
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

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    String m30(String str, JSONObject jSONObject) {
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

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    String m31(String str) {
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
    String m32(String str) {
        if (str.contains("api.php/app") || str.contains("xgapp")) {
            return str + "index_video?token=";
        }
        if (!str.contains(".vod")) {
            return "";
        }
        return str + "/vodPhbAll";
    }
}
