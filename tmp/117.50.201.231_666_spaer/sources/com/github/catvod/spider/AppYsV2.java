package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A0.ku;
import com.github.catvod.spider.merge.A0.yi;
import com.github.catvod.spider.merge.a.C0529a;
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
import org.slf4j.Marker;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class AppYsV2 extends Spider {
    public static final Pattern a = Pattern.compile("api\\.php/.*?/vod");
    public static final Pattern b;
    public static final Pattern c;
    public static final Pattern[] d;
    public final HashMap e = new HashMap();
    public String[] f = null;

    static {
        Pattern.compile("api\\.php/.+?\\.vod");
        Pattern.compile("/.+\\?.+=");
        b = Pattern.compile(".*(url|v|vid|php\\?id)=");
        c = Pattern.compile("https?://[^/]*");
        d = new Pattern[]{Pattern.compile("player=new"), Pattern.compile("<div id=\"video\""), Pattern.compile("<div id=\"[^\"]*?player\""), Pattern.compile("//视频链接"), Pattern.compile("HlsJsPlayer\\("), Pattern.compile("<iframe[\\s\\S]*?src=\"[^\"]+?\""), Pattern.compile("<video[\\s\\S]*?src=\"[^\"]+?\"")};
    }

    public static void g(JSONObject jSONObject, String str, ArrayList arrayList) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = jSONObject.get(next);
                if (next.equals(str) && (obj instanceof JSONArray)) {
                    arrayList.add((JSONArray) obj);
                }
                if (obj instanceof JSONObject) {
                    g((JSONObject) obj, str, arrayList);
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    for (int i = 0; i < jSONArray.length(); i++) {
                        g(jSONArray.getJSONObject(i), str, arrayList);
                    }
                }
            } catch (JSONException e) {
                SpiderDebug.log(e);
            }
        }
    }

    public static HashMap h(String str) {
        HashMap map = new HashMap();
        map.put("User-Agent", (str.contains("api.php/app") || str.contains("xgapp") || str.contains("freekan")) ? "Dart/2.14 (dart:io)" : (str.contains("zsb") || str.contains("fkxs") || str.contains("xays") || str.contains("xcys") || str.contains("szys") || str.contains("dxys") || str.contains("ytys") || str.contains("qnys")) ? "Dart/2.15 (dart:io)" : str.contains(".vod") ? "okhttp/4.1.0" : "Dalvik/2.1.0");
        return map;
    }

    public static String i(String str, String str2) {
        if (str.contains(".vod")) {
            if (str.contains("iopenyun.com")) {
                return str + "/list?wd=" + str2 + "&page=";
            }
            return str + "?wd=" + str2 + "&page=";
        }
        if (str.contains("api.php/app") || str.contains("xgapp")) {
            return str + "search?text=" + str2 + "&pg=";
        }
        if (!a.matcher(str).find()) {
            return "";
        }
        if (str.contains("esellauto") || str.contains("1.14.63.101") || str.contains("zjys") || str.contains("dcd") || str.contains("lxue") || str.contains("weetai.cn") || str.contains("haokanju1") || str.contains("fit:8") || str.contains("zjj.life") || str.contains("love9989") || str.contains("8d8q") || str.contains("lk.pxun") || str.contains("hgyx") || str.contains("521x5") || str.contains("lxyyy") || str.contains("0818tv") || str.contains("diyoui") || str.contains("diliktv") || str.contains("ppzhu") || str.contains("aitesucai") || str.contains("zz.ci") || str.contains("chxjon") || str.contains("watchmi") || str.contains("vipbp") || str.contains("bhtv") || str.contains("xfykl")) {
            return str + "?ac=list&wd=" + str2 + "&page=";
        }
        return str + "?ac=list&zm=" + str2 + "&page=";
    }

    public static boolean j(String str) {
        return str.equals("伦理") || str.equals("情色") || str.equals("福利");
    }

    public static String k(JSONArray jSONArray) {
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
        String strN;
        int i;
        try {
            strN = n();
            str3 = "";
        } catch (Exception e) {
            e = e;
            str3 = "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            String str4 = "vod_id";
            sb.append(o(strN));
            sb.append(str);
            sb.append((strN.contains("api.php/app") || strN.contains("xgapp")) ? "&class=筛选class&area=筛选area&lang=筛选lang&year=筛选year&limit=18&pg=#PN#" : strN.contains(".vod") ? "&class=筛选class&area=筛选area&lang=筛选lang&year=筛选year&by=排序&limit=18&page=#PN#" : "&page=#PN#&area=筛选area&type=筛选class&start=筛选year");
            String strReplace = sb.toString().replace("#PN#", str2).replace("筛选class", (map == null || !map.containsKey("class")) ? str3 : map.get("class")).replace("筛选area", (map == null || !map.containsKey("area")) ? str3 : map.get("area")).replace("筛选lang", (map == null || !map.containsKey("lang")) ? str3 : map.get("lang")).replace("筛选year", (map == null || !map.containsKey("year")) ? str3 : map.get("year")).replace("排序", (map == null || !map.containsKey("排序")) ? str3 : map.get("排序"));
            SpiderDebug.log(strReplace);
            String strK = yi.k(strReplace, h(strReplace));
            l(strK);
            JSONObject jSONObject = new JSONObject(strK);
            try {
            } catch (Exception e2) {
                SpiderDebug.log(e2);
            }
            if (jSONObject.has("totalpage") && (jSONObject.get("totalpage") instanceof Integer)) {
                i = jSONObject.getInt("totalpage");
            } else if (jSONObject.has("pagecount") && (jSONObject.get("pagecount") instanceof Integer)) {
                i = jSONObject.getInt("pagecount");
            } else if (jSONObject.has("data") && (jSONObject.get("data") instanceof JSONObject) && jSONObject.getJSONObject("data").has("total") && (jSONObject.getJSONObject("data").get("total") instanceof Integer) && jSONObject.getJSONObject("data").has("limit") && (jSONObject.getJSONObject("data").get("limit") instanceof Integer)) {
                int i2 = jSONObject.getJSONObject("data").getInt("limit");
                int i3 = jSONObject.getJSONObject("data").getInt("total");
                i = i3 % i2 == 0 ? i3 / i2 : (i3 / i2) + 1;
            } else {
                i = Integer.MAX_VALUE;
            }
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = (jSONObject.has("list") && (jSONObject.get("list") instanceof JSONArray)) ? jSONObject.getJSONArray("list") : (jSONObject.has("data") && (jSONObject.get("data") instanceof JSONObject) && jSONObject.getJSONObject("data").has("list") && (jSONObject.getJSONObject("data").get("list") instanceof JSONArray)) ? jSONObject.getJSONObject("data").getJSONArray("list") : (jSONObject.has("data") && (jSONObject.get("data") instanceof JSONArray)) ? jSONObject.getJSONArray("data") : null;
            if (jSONArray2 != null) {
                int i4 = 0;
                while (i4 < jSONArray2.length()) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i4);
                    String str5 = str4;
                    if (jSONObject2.has(str5)) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(str5, jSONObject2.getString(str5));
                        jSONObject3.put("vod_name", jSONObject2.getString("vod_name"));
                        jSONObject3.put("vod_pic", jSONObject2.getString("vod_pic"));
                        jSONObject3.put("vod_remarks", jSONObject2.getString("vod_remarks"));
                        jSONArray.put(jSONObject3);
                    } else {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put(str5, jSONObject2.getString("nextlink"));
                        jSONObject4.put("vod_name", jSONObject2.getString("title"));
                        jSONObject4.put("vod_pic", jSONObject2.getString("pic"));
                        jSONObject4.put("vod_remarks", jSONObject2.getString("state"));
                        jSONArray.put(jSONObject4);
                    }
                    i4++;
                    str4 = str5;
                }
            }
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("page", str2);
            jSONObject5.put("pagecount", i);
            jSONObject5.put("limit", 90);
            jSONObject5.put("total", Integer.MAX_VALUE);
            jSONObject5.put("list", jSONArray);
            return jSONObject5.toString();
        } catch (Exception e3) {
            e = e3;
            SpiderDebug.log(e);
            return str3;
        }
    }

    public String detailContent(List<String> list) {
        try {
            String strN = n();
            String str = s(strN) + list.get(0);
            SpiderDebug.log(str);
            String strK = yi.k(str, h(str));
            l(strK);
            JSONObject jSONObject = new JSONObject(strK);
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            m(strN, jSONObject, jSONObject3, list.get(0));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject3);
            jSONObject2.put("list", jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
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
        JSONArray jSONArray;
        String str10;
        String str11;
        String str12;
        String str13;
        String[] strArr;
        String str14;
        String str15;
        String str16;
        String str17;
        AppYsV2 appYsV2 = this;
        String str18 = "";
        String str19 = "筛选";
        try {
            String strP = appYsV2.p(n());
            String str20 = "=";
            String str21 = "\\+";
            String str22 = "\n";
            JSONArray jSONArray2 = null;
            String str23 = "type_id";
            String str24 = "type_name";
            if (strP.isEmpty()) {
                String[] strArrSplit = appYsV2.q(strP, null).split("\n")[0].split("\\+");
                jSONArray2 = new JSONArray();
                for (int i2 = 1; i2 < strArrSplit.length; i2++) {
                    String[] strArrSplit2 = strArrSplit[i2].trim().split("=");
                    if (strArrSplit2.length >= 2) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("type_name", strArrSplit2[0].trim());
                        jSONObject.put("type_id", strArrSplit2[1].trim());
                        jSONArray2.put(jSONObject);
                    }
                }
            } else {
                SpiderDebug.log(strP);
                String strK = yi.k(strP, h(strP));
                appYsV2.l(strK);
                JSONObject jSONObject2 = new JSONObject(strK);
                if (jSONObject2.has("list") && (jSONObject2.get("list") instanceof JSONArray)) {
                    jSONArray2 = jSONObject2.getJSONArray("list");
                } else if (jSONObject2.has("data") && (jSONObject2.get("data") instanceof JSONObject) && jSONObject2.getJSONObject("data").has("list") && (jSONObject2.getJSONObject("data").get("list") instanceof JSONArray)) {
                    jSONArray2 = jSONObject2.getJSONObject("data").getJSONArray("list");
                } else if (jSONObject2.has("data") && (jSONObject2.get("data") instanceof JSONArray)) {
                    jSONArray2 = jSONObject2.getJSONArray("data");
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArray3 = new JSONArray();
            if (jSONArray2 != null) {
                int i3 = 0;
                while (i3 < jSONArray2.length()) {
                    JSONObject jSONObject4 = jSONArray2.getJSONObject(i3);
                    JSONArray jSONArray4 = jSONArray2;
                    String string = jSONObject4.getString(str24);
                    if (j(string)) {
                        str2 = str19;
                        str3 = str18;
                        jSONArray = jSONArray3;
                        str4 = strP;
                        i = i3;
                        str5 = str20;
                        str6 = str21;
                        str7 = str22;
                        str8 = str23;
                        str9 = str24;
                    } else {
                        i = i3;
                        String string2 = jSONObject4.getString(str23);
                        JSONArray jSONArray5 = jSONArray3;
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put(str23, string2);
                        jSONObject5.put(str24, string);
                        JSONObject jSONObjectOptJSONObject = jSONObject4.optJSONObject("type_extend");
                        if (z) {
                            String[] strArrSplit3 = appYsV2.q(strP, jSONObjectOptJSONObject).split(str22);
                            ?? jSONArray6 = new JSONArray();
                            str4 = strP;
                            for (?? IsEmpty = strP.isEmpty(); IsEmpty < strArrSplit3.length; IsEmpty++) {
                                String strTrim = strArrSplit3[IsEmpty].trim();
                                if (strTrim.isEmpty()) {
                                    str11 = str19;
                                    str14 = str18;
                                    str15 = str20;
                                    str10 = str21;
                                    str12 = str22;
                                    strArr = strArrSplit3;
                                    str16 = str23;
                                    str17 = str24;
                                } else {
                                    String[] strArrSplit4 = strTrim.split(str21);
                                    str10 = str21;
                                    String strTrim2 = strArrSplit4[0].trim();
                                    if (strTrim2.contains(str19)) {
                                        str12 = str22;
                                        String strReplace = strTrim2.replace(str19, str18);
                                        if (strReplace.equals("class")) {
                                            strTrim2 = "类型";
                                            str11 = str19;
                                        } else {
                                            str11 = str19;
                                            if (strReplace.equals("area")) {
                                                strTrim2 = "地区";
                                            } else if (strReplace.equals("lang")) {
                                                strTrim2 = "语言";
                                            } else if (strReplace.equals("year")) {
                                                strTrim2 = "年份";
                                            }
                                        }
                                        str13 = strTrim2;
                                        strTrim2 = strReplace;
                                    } else {
                                        str11 = str19;
                                        str12 = str22;
                                        str13 = strTrim2;
                                    }
                                    ?? jSONObject6 = new JSONObject();
                                    strArr = strArrSplit3;
                                    jSONObject6.put("key", strTrim2);
                                    jSONObject6.put("name", str13);
                                    JSONArray jSONArray7 = new JSONArray();
                                    int i4 = 1;
                                    while (i4 < strArrSplit4.length) {
                                        JSONObject jSONObject7 = new JSONObject();
                                        String[] strArr2 = strArrSplit4;
                                        String strTrim3 = strArrSplit4[i4].trim();
                                        String str25 = str23;
                                        int iIndexOf = strTrim3.indexOf(str20);
                                        String str26 = str20;
                                        String str27 = str24;
                                        str = str18;
                                        if (iIndexOf == -1) {
                                            try {
                                                if (!j(strTrim3)) {
                                                    jSONObject7.put("n", strTrim3);
                                                    jSONObject7.put("v", strTrim3);
                                                    jSONArray7.put(jSONObject7);
                                                }
                                            } catch (Exception e) {
                                                e = e;
                                                SpiderDebug.log(e);
                                                return str;
                                            }
                                        } else {
                                            String strSubstring = strTrim3.substring(0, iIndexOf);
                                            if (!j(strSubstring)) {
                                                jSONObject7.put("n", strSubstring.trim());
                                                jSONObject7.put("v", strTrim3.substring(iIndexOf + 1).trim());
                                                jSONArray7.put(jSONObject7);
                                            }
                                        }
                                        i4++;
                                        str23 = str25;
                                        strArrSplit4 = strArr2;
                                        str20 = str26;
                                        str24 = str27;
                                        str18 = str;
                                    }
                                    str14 = str18;
                                    str15 = str20;
                                    str16 = str23;
                                    str17 = str24;
                                    jSONObject6.put("value", jSONArray7);
                                    jSONArray6.put(jSONObject6);
                                }
                                str22 = str12;
                                str21 = str10;
                                str19 = str11;
                                strArrSplit3 = strArr;
                                str23 = str16;
                                str20 = str15;
                                str24 = str17;
                                str18 = str14;
                            }
                            str2 = str19;
                            str3 = str18;
                            str5 = str20;
                            str6 = str21;
                            str7 = str22;
                            str8 = str23;
                            str9 = str24;
                            if (!jSONObject3.has("filters")) {
                                jSONObject3.put("filters", new JSONObject());
                            }
                            jSONObject3.getJSONObject("filters").put(string2, jSONArray6);
                        } else {
                            str2 = str19;
                            str3 = str18;
                            str4 = strP;
                            str5 = str20;
                            str6 = str21;
                            str7 = str22;
                            str8 = str23;
                            str9 = str24;
                        }
                        jSONArray = jSONArray5;
                        jSONArray.put(jSONObject5);
                    }
                    i3 = i + 1;
                    appYsV2 = this;
                    jSONArray3 = jSONArray;
                    jSONArray2 = jSONArray4;
                    strP = str4;
                    str22 = str7;
                    str21 = str6;
                    str19 = str2;
                    str23 = str8;
                    str20 = str5;
                    str24 = str9;
                    str18 = str3;
                }
            }
            str = str18;
            jSONObject3.put("class", jSONArray3);
            return jSONObject3.toString();
        } catch (Exception e2) {
            e = e2;
            str = str18;
        }
    }

    public String homeVideoContent() {
        boolean z;
        try {
            String strN = n();
            String strConcat = (strN.contains("api.php/app") || strN.contains("xgapp")) ? strN.concat("index_video?token=") : strN.contains(".vod") ? strN.concat("/vodPhbAll") : "";
            if (strConcat.isEmpty()) {
                strConcat = o(strN) + "movie&page=1&area=&type=&start=";
                z = true;
            } else {
                z = false;
            }
            SpiderDebug.log(strConcat);
            String strK = yi.k(strConcat, h(strConcat));
            l(strK);
            JSONObject jSONObject = new JSONObject(strK);
            JSONArray jSONArray = new JSONArray();
            if (z) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("data");
                for (int i = 0; i < jSONArray2.length(); i++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("vod_id", jSONObject2.getString("nextlink"));
                    jSONObject3.put("vod_name", jSONObject2.getString("title"));
                    jSONObject3.put("vod_pic", jSONObject2.getString("pic"));
                    jSONObject3.put("vod_remarks", jSONObject2.getString("state"));
                    jSONArray.put(jSONObject3);
                }
            } else {
                ArrayList<JSONArray> arrayList = new ArrayList();
                g(jSONObject, "vlist", arrayList);
                if (arrayList.isEmpty()) {
                    g(jSONObject, "vod_list", arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                for (JSONArray jSONArray3 : arrayList) {
                    for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                        JSONObject jSONObject4 = jSONArray3.getJSONObject(i2);
                        String string = jSONObject4.getString("vod_id");
                        if (!arrayList2.contains(string)) {
                            arrayList2.add(string);
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("vod_id", string);
                            jSONObject5.put("vod_name", jSONObject4.getString("vod_name"));
                            jSONObject5.put("vod_pic", jSONObject4.getString("vod_pic"));
                            jSONObject5.put("vod_remarks", jSONObject4.getString("vod_remarks"));
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
            this.f = str.split("###");
        } catch (Throwable unused) {
        }
    }

    public boolean isVideoFormat(String str) {
        return ku.e(str);
    }

    public final void l(String str) {
        String[] strArr = this.f;
        if (strArr.length > 1) {
            strArr[1].equals("nftv");
        }
    }

    public final void m(String str, JSONObject jSONObject, JSONObject jSONObject2, String str2) throws JSONException {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str3;
        HashMap map;
        ArrayList<String> arrayList3;
        String str4;
        String str5;
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        boolean zContains = str.contains("api.php/app/");
        String str6 = ",";
        HashMap map2 = this.e;
        String str7 = "parse_api";
        ArrayList arrayList6 = arrayList4;
        String str8 = "url";
        ArrayList arrayList7 = arrayList5;
        String str9 = "name";
        String str10 = "code";
        if (zContains) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("data");
            jSONObject2.put("vod_id", jSONObject3.optString("vod_id", str2));
            jSONObject2.put("vod_name", jSONObject3.getString("vod_name"));
            jSONObject2.put("vod_pic", jSONObject3.getString("vod_pic"));
            jSONObject2.put("type_name", jSONObject3.optString("vod_class"));
            jSONObject2.put("vod_year", jSONObject3.optString("vod_year"));
            jSONObject2.put("vod_area", jSONObject3.optString("vod_area"));
            jSONObject2.put("vod_remarks", jSONObject3.optString("vod_remarks"));
            jSONObject2.put("vod_actor", jSONObject3.optString("vod_actor"));
            jSONObject2.put("vod_director", jSONObject3.optString("vod_director"));
            jSONObject2.put("vod_content", jSONObject3.optString("vod_content"));
            JSONArray jSONArray = jSONObject3.getJSONArray("vod_url_with_player");
            int i = 0;
            while (i < jSONArray.length()) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                String str11 = str10;
                String strTrim = jSONObject4.optString(str11).trim();
                if (strTrim.isEmpty()) {
                    str5 = str9;
                    strTrim = jSONObject4.getString(str5).trim();
                } else {
                    str5 = str9;
                }
                ArrayList arrayList8 = arrayList7;
                arrayList8.add(strTrim);
                String str12 = str8;
                ArrayList arrayList9 = arrayList6;
                arrayList9.add(jSONObject4.getString(str12));
                String str13 = str7;
                String strTrim2 = jSONObject4.optString(str13).trim();
                HashMap map3 = map2;
                ArrayList arrayList10 = (ArrayList) map3.get(strTrim);
                if (arrayList10 == null) {
                    arrayList10 = new ArrayList();
                    map3.put(strTrim, arrayList10);
                }
                if (!strTrim2.isEmpty() && !arrayList10.contains(strTrim2)) {
                    arrayList10.add(strTrim2);
                }
                i++;
                str10 = str11;
                str9 = str5;
                arrayList7 = arrayList8;
                str8 = str12;
                str7 = str13;
                arrayList6 = arrayList9;
                map2 = map3;
            }
        } else {
            HashMap map4 = map2;
            String str14 = str7;
            String str15 = str8;
            if (!str.contains("xgapp")) {
                ArrayList arrayList11 = arrayList6;
                ArrayList arrayList12 = arrayList7;
                HashMap map5 = map4;
                String str16 = str15;
                if (str.contains(".vod")) {
                    JSONObject jSONObject5 = jSONObject.getJSONObject("data");
                    jSONObject2.put("vod_id", jSONObject5.optString("vod_id", str2));
                    jSONObject2.put("vod_name", jSONObject5.getString("vod_name"));
                    jSONObject2.put("vod_pic", jSONObject5.getString("vod_pic"));
                    jSONObject2.put("type_name", jSONObject5.optString("vod_class"));
                    jSONObject2.put("vod_year", jSONObject5.optString("vod_year"));
                    jSONObject2.put("vod_area", jSONObject5.optString("vod_area"));
                    jSONObject2.put("vod_remarks", jSONObject5.optString("vod_remarks"));
                    jSONObject2.put("vod_actor", jSONObject5.optString("vod_actor"));
                    jSONObject2.put("vod_director", jSONObject5.optString("vod_director"));
                    jSONObject2.put("vod_content", jSONObject5.optString("vod_content"));
                    JSONArray jSONArray2 = jSONObject5.getJSONArray("vod_play_list");
                    int i2 = 0;
                    while (i2 < jSONArray2.length()) {
                        JSONObject jSONObject6 = jSONArray2.getJSONObject(i2);
                        String strTrim3 = jSONObject6.getJSONObject("player_info").optString("from").trim();
                        if (strTrim3.isEmpty()) {
                            strTrim3 = jSONObject6.getJSONObject("player_info").optString("show").trim();
                        }
                        ArrayList arrayList13 = arrayList12;
                        arrayList13.add(strTrim3);
                        String str17 = str16;
                        ArrayList arrayList14 = arrayList11;
                        arrayList14.add(jSONObject6.getString(str17));
                        try {
                            arrayList3 = new ArrayList();
                            str3 = str6;
                        } catch (Exception e) {
                            e = e;
                            str3 = str6;
                        }
                        try {
                            String[] strArrSplit = jSONObject6.getJSONObject("player_info").optString("parse").split(str3);
                            String[] strArrSplit2 = jSONObject6.getJSONObject("player_info").optString("parse2").split(str3);
                            arrayList3.addAll(Arrays.asList(strArrSplit));
                            arrayList3.addAll(Arrays.asList(strArrSplit2));
                            map = map5;
                        } catch (Exception e2) {
                            e = e2;
                            map = map5;
                            SpiderDebug.log(e);
                            i2++;
                            map5 = map;
                            arrayList11 = arrayList14;
                            str6 = str3;
                            arrayList12 = arrayList13;
                            str16 = str17;
                        }
                        try {
                            ArrayList arrayList15 = (ArrayList) map.get(strTrim3);
                            if (arrayList15 == null) {
                                arrayList15 = new ArrayList();
                                map.put(strTrim3, arrayList15);
                            }
                            for (String strGroup : arrayList3) {
                                boolean zContains2 = strGroup.contains("http");
                                Pattern pattern = b;
                                if (zContains2) {
                                    Matcher matcher = pattern.matcher(strGroup);
                                    if (matcher.find()) {
                                        strGroup = matcher.group(0);
                                    }
                                } else if (strGroup.contains("//")) {
                                    Matcher matcher2 = pattern.matcher(strGroup);
                                    if (matcher2.find()) {
                                        strGroup = "http:" + matcher2.group(0);
                                    }
                                } else {
                                    Matcher matcher3 = c.matcher(str);
                                    if (matcher3.find()) {
                                        Matcher matcher4 = pattern.matcher(str);
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
                        } catch (Exception e3) {
                            e = e3;
                            SpiderDebug.log(e);
                        }
                        i2++;
                        map5 = map;
                        arrayList11 = arrayList14;
                        str6 = str3;
                        arrayList12 = arrayList13;
                        str16 = str17;
                    }
                    arrayList2 = arrayList11;
                    arrayList = arrayList12;
                } else {
                    String str18 = str16;
                    if (a.matcher(str).find()) {
                        jSONObject2.put("vod_id", jSONObject.optString("vod_id", str2));
                        jSONObject2.put("vod_name", jSONObject.getString("title"));
                        jSONObject2.put("vod_pic", jSONObject.getString("img_url"));
                        jSONObject2.put("type_name", k(jSONObject.optJSONArray("type")));
                        jSONObject2.put("vod_year", jSONObject.optString("pubtime"));
                        jSONObject2.put("vod_area", k(jSONObject.optJSONArray("area")));
                        jSONObject2.put("vod_remarks", jSONObject.optString("trunk"));
                        jSONObject2.put("vod_actor", k(jSONObject.optJSONArray("actor")));
                        jSONObject2.put("vod_director", k(jSONObject.optJSONArray("director")));
                        jSONObject2.put("vod_content", jSONObject.optString("intro"));
                        JSONObject jSONObject7 = jSONObject.getJSONObject("videolist");
                        Iterator<String> itKeys = jSONObject7.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            ArrayList arrayList16 = (ArrayList) map5.get(next);
                            if (arrayList16 == null) {
                                arrayList16 = new ArrayList();
                                map5.put(next, arrayList16);
                            }
                            JSONArray jSONArray3 = jSONObject7.getJSONArray(next);
                            ArrayList arrayList17 = new ArrayList();
                            int i3 = 0;
                            while (i3 < jSONArray3.length()) {
                                JSONObject jSONObject8 = jSONArray3.getJSONObject(i3);
                                String str19 = str18;
                                String string = jSONObject8.getString(str19);
                                if (string.contains("url=")) {
                                    int iIndexOf = string.indexOf("url=") + 4;
                                    String strTrim5 = string.substring(0, iIndexOf).trim();
                                    if (!strTrim5.isEmpty() && !arrayList16.contains(strTrim5)) {
                                        arrayList16.add(strTrim5);
                                    }
                                    arrayList17.add(jSONObject8.getString("title") + "$" + string.substring(iIndexOf).trim());
                                } else {
                                    arrayList17.add(jSONObject8.getString("title") + "$" + string);
                                }
                                i3++;
                                str18 = str19;
                            }
                            arrayList12.add(next);
                            arrayList11.add(TextUtils.join("#", arrayList17));
                        }
                    }
                    arrayList = arrayList12;
                    arrayList2 = arrayList11;
                }
                jSONObject2.put("vod_play_from", TextUtils.join("$$$", arrayList));
                jSONObject2.put("vod_play_url", TextUtils.join("$$$", arrayList2));
            }
            JSONObject jSONObject9 = jSONObject.getJSONObject("data").getJSONObject("vod_info");
            jSONObject2.put("vod_id", jSONObject9.optString("vod_id", str2));
            jSONObject2.put("vod_name", jSONObject9.getString("vod_name"));
            jSONObject2.put("vod_pic", jSONObject9.getString("vod_pic"));
            jSONObject2.put("type_name", jSONObject9.optString("vod_class"));
            jSONObject2.put("vod_year", jSONObject9.optString("vod_year"));
            jSONObject2.put("vod_area", jSONObject9.optString("vod_area"));
            jSONObject2.put("vod_remarks", jSONObject9.optString("vod_remarks"));
            jSONObject2.put("vod_actor", jSONObject9.optString("vod_actor"));
            jSONObject2.put("vod_director", jSONObject9.optString("vod_director"));
            jSONObject2.put("vod_content", jSONObject9.optString("vod_content"));
            JSONArray jSONArray4 = jSONObject9.getJSONArray("vod_url_with_player");
            int i4 = 0;
            while (i4 < jSONArray4.length()) {
                JSONObject jSONObject10 = jSONArray4.getJSONObject(i4);
                String str20 = str10;
                String strTrim6 = jSONObject10.optString(str20).trim();
                if (strTrim6.isEmpty()) {
                    str4 = str9;
                    strTrim6 = jSONObject10.getString(str4).trim();
                } else {
                    str4 = str9;
                }
                ArrayList arrayList18 = arrayList7;
                arrayList18.add(strTrim6);
                String str21 = str15;
                ArrayList arrayList19 = arrayList6;
                arrayList19.add(jSONObject10.getString(str21));
                String str22 = str14;
                String strTrim7 = jSONObject10.optString(str22).trim();
                HashMap map6 = map4;
                ArrayList arrayList20 = (ArrayList) map6.get(strTrim6);
                if (arrayList20 == null) {
                    arrayList20 = new ArrayList();
                    map6.put(strTrim6, arrayList20);
                }
                if (!strTrim7.isEmpty() && !arrayList20.contains(strTrim7)) {
                    arrayList20.add(strTrim7);
                }
                i4++;
                str10 = str20;
                str9 = str4;
                arrayList7 = arrayList18;
                str15 = str21;
                str14 = str22;
                arrayList6 = arrayList19;
                map4 = map6;
            }
        }
        arrayList2 = arrayList6;
        arrayList = arrayList7;
        jSONObject2.put("vod_play_from", TextUtils.join("$$$", arrayList));
        jSONObject2.put("vod_play_url", TextUtils.join("$$$", arrayList2));
    }

    public boolean manualVideoCheck() {
        return true;
    }

    public final String n() {
        String[] strArr = this.f;
        return (strArr == null || strArr.length < 1) ? "" : strArr[0].trim();
    }

    public final String o(String str) {
        return (str.contains("api.php/app") || str.contains("xgapp")) ? str.contains("dijiaxia") ? "http://www.dijiaxia.com/api.php/app/video?tid=" : str.concat("video?tid=") : str.contains(".vod") ? str.contains("iopenyun") ? str.concat("/list?type=") : str.concat("?type=") : str.concat("?ac=list&class=");
    }

    public final String p(String str) {
        return (str.contains("api.php/app") || str.contains("xgapp")) ? str.concat("nav?token=") : str.contains(".vod") ? str.contains("iopenyun.com") ? str.concat("/list?type") : str.concat("/types") : "";
    }

    public String playerContent(String str, String str2, List<String> list) {
        JSONObject jSONObjectR;
        try {
            ArrayList arrayList = (ArrayList) this.e.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.isEmpty() && (jSONObjectR = r(arrayList, str2)) != null) {
                return C0529a.addDanmaku(jSONObjectR.toString());
            }
            if (ku.e(str2)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("parse", 0);
                jSONObject.put("playUrl", "");
                jSONObject.put("url", str2);
                return C0529a.addDanmaku(jSONObject.toString());
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("parse", 1);
            jSONObject2.put("jx", "1");
            jSONObject2.put("url", str2);
            return C0529a.addDanmaku(jSONObject2.toString());
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public final String q(String str, JSONObject jSONObject) {
        String str2 = "";
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.equals("class") || next.equals("area") || next.equals("lang") || next.equals("year")) {
                    try {
                        str2 = str2 + "筛选" + next + "+全部=+" + jSONObject.getString(next).replace(",", Marker.ANY_NON_NULL_MARKER) + "\n";
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

    public final JSONObject r(ArrayList arrayList, String str) throws JSONException {
        Iterator it = arrayList.iterator();
        String str2 = "";
        while (true) {
            JSONObject jSONObjectG = null;
            if (!it.hasNext()) {
                if (str2.isEmpty()) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("parse", 1);
                jSONObject.put("playUrl", str2);
                jSONObject.put("url", str);
                return jSONObject;
            }
            String str3 = (String) it.next();
            if (!str3.isEmpty() && !str3.equals("null")) {
                String strK = yi.k(str3 + str, null);
                l(strK);
                try {
                    jSONObjectG = ku.g(str, strK);
                } catch (Throwable unused) {
                }
                if (jSONObjectG != null && jSONObjectG.has("url") && jSONObjectG.has("header")) {
                    jSONObjectG.put("header", jSONObjectG.getJSONObject("header").toString());
                    return jSONObjectG;
                }
                if (strK.contains("<html")) {
                    Pattern[] patternArr = d;
                    int length = patternArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        if (patternArr[i].matcher(strK).find()) {
                            str2 = str3;
                            break;
                        }
                        i++;
                    }
                }
            }
        }
    }

    public final String s(String str) {
        return (str.contains("api.php/app") || str.contains("xgapp")) ? str.contains("dijiaxia") ? "https://www.dijiaxia.com/api.php/app/video_detail?id=" : str.contains("1010dy") ? "http://www.1010dy.cc/api.php/app/video_detail?id=" : str.concat("video_detail?id=") : str.contains(".vod") ? str.contains("iopenyun") ? str.concat("/detailID?vod_id=") : str.concat("/detail?vod_id=") : "";
    }

    public String searchContent(String str, boolean z) {
        try {
            String strI = i(n(), URLEncoder.encode(str));
            String strK = yi.k(strI, h(strI));
            l(strK);
            JSONObject jSONObject = new JSONObject(strK);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = (jSONObject.has("list") && (jSONObject.get("list") instanceof JSONArray)) ? jSONObject.getJSONArray("list") : (jSONObject.has("data") && (jSONObject.get("data") instanceof JSONObject) && jSONObject.getJSONObject("data").has("list") && (jSONObject.getJSONObject("data").get("list") instanceof JSONArray)) ? jSONObject.getJSONObject("data").getJSONArray("list") : (jSONObject.has("data") && (jSONObject.get("data") instanceof JSONArray)) ? jSONObject.getJSONArray("data") : null;
            if (jSONArray2 != null) {
                for (int i = 0; i < jSONArray2.length(); i++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                    if (jSONObject2.has("vod_id")) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("vod_id", jSONObject2.getString("vod_id"));
                        jSONObject3.put("vod_name", jSONObject2.getString("vod_name"));
                        jSONObject3.put("vod_pic", jSONObject2.getString("vod_pic"));
                        jSONObject3.put("vod_remarks", jSONObject2.getString("vod_remarks"));
                        jSONArray.put(jSONObject3);
                    } else {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("vod_id", jSONObject2.getString("nextlink"));
                        jSONObject4.put("vod_name", jSONObject2.getString("title"));
                        jSONObject4.put("vod_pic", jSONObject2.getString("pic"));
                        jSONObject4.put("vod_remarks", jSONObject2.getString("state"));
                        jSONArray.put(jSONObject4);
                    }
                }
            }
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("list", jSONArray);
            return jSONObject5.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
