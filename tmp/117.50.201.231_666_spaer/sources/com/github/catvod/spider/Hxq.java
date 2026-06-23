package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.a.C0531c;
import com.github.catvod.spider.merge.b.C0544h;
import com.github.catvod.spider.merge.b.u;
import com.github.catvod.spider.merge.b.v;
import com.github.catvod.spider.merge.c.C0550a;
import com.github.catvod.spider.merge.c.C0551b;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.k.C0575b;
import java.io.ByteArrayInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class Hxq extends Spider {
    public static final String[][] d = {new String[]{"蓝光HDR", "11"}, new String[]{"蓝光1080P", "10"}, new String[]{"高清", "2"}, new String[]{"标清", "1"}};
    public static final SecretKeySpec e;
    public static final IvParameterSpec f;
    public String a = "";
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();

    class V4Result {
        public int a;
        public final ArrayList b = new ArrayList();
        public final ArrayList c = new ArrayList();
    }

    static {
        SecretKeySpec secretKeySpec;
        IvParameterSpec ivParameterSpec = null;
        try {
            secretKeySpec = new SecretKeySpec("FishHxq@Transit!".getBytes("UTF-8"), "AES");
            try {
                ivParameterSpec = new IvParameterSpec("Hxqfish20260000!".getBytes("UTF-8"));
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            secretKeySpec = null;
        }
        e = secretKeySpec;
        f = ivParameterSpec;
    }

    public static void a(LinkedHashMap linkedHashMap, String str, ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        if (!arrayList.isEmpty()) {
            arrayList3.add(new C0551b("sort", "排序", arrayList));
        }
        if (!arrayList2.isEmpty()) {
            arrayList3.add(new C0551b("year", "年份", arrayList2));
        }
        linkedHashMap.put(str, arrayList3);
    }

    public static HashMap g(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (jSONObject == null) {
            return map;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject.optString(next, ""));
        }
        return map;
    }

    public static String h(JSONObject jSONObject) {
        String strEncodeToString;
        JSONObject jSONObject2 = new JSONObject();
        String string = jSONObject.toString();
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, e, f);
            strEncodeToString = Base64.encodeToString(cipher.doFinal(string.getBytes("UTF-8")), 2);
        } catch (Exception e2) {
            com.github.catvod.spider.merge.A.a.r(e2, new StringBuilder("[FishHxq] 加密失败: "));
            strEncodeToString = null;
        }
        return jSONObject2.put("moyufucking", strEncodeToString).toString();
    }

    public static JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("v7m", "MoYu@HxqFish2026!");
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static String j(JSONObject jSONObject) {
        Object objOpt = jSONObject.opt("image");
        if (objOpt instanceof JSONObject) {
            JSONObject jSONObject2 = (JSONObject) objOpt;
            String strOptString = jSONObject2.optString("url", "");
            return strOptString.isEmpty() ? jSONObject2.optString("thumb", "") : strOptString;
        }
        if (objOpt instanceof String) {
            return (String) objOpt;
        }
        String strOptString2 = jSONObject.optString("poster", "");
        return strOptString2.isEmpty() ? jSONObject.optString("thumb", "") : strOptString2;
    }

    public static JSONObject k(String str) {
        String str2;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String strOptString = new JSONObject(str).optString("moyufucking", "");
            if (TextUtils.isEmpty(strOptString)) {
                return null;
            }
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(2, e, f);
                str2 = new String(cipher.doFinal(Base64.decode(strOptString, 0)), "UTF-8");
            } catch (Exception e2) {
                com.github.catvod.spider.merge.A.a.r(e2, new StringBuilder("[FishHxq] 解密失败: "));
                str2 = null;
            }
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str2);
            if (!jSONObject.has("error")) {
                return jSONObject;
            }
            SpiderDebug.log("[FishHxq] PHP错误: " + jSONObject.optString("error"));
            return null;
        } catch (Exception e3) {
            com.github.catvod.spider.merge.A.a.r(e3, new StringBuilder("[FishHxq] 解析响应失败: "));
            return null;
        }
    }

    public static ArrayList l(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                arrayList.add(new C0551b.a(jSONObject.optString("name"), jSONObject.optString("value")));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public static C0554e m(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("conerMemo", "");
        if (strOptString.isEmpty()) {
            strOptString = jSONObject.optString("detailMemo", "");
        }
        if (strOptString.isEmpty()) {
            strOptString = jSONObject.optString("shorthand", "");
        }
        return new C0554e(String.valueOf(jSONObject.opt("sid")), jSONObject.optString("name", ""), j(jSONObject), strOptString);
    }

    public static ArrayList n(JSONArray jSONArray, int i) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        int iMin = i > 0 ? Math.min(jSONArray.length(), i) : jSONArray.length();
        for (int i2 = 0; i2 < iMin; i2++) {
            try {
                arrayList.add(m(jSONArray.getJSONObject(i2)));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public static String processEpisodeList(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] strArrSplit = str.split("#");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArrSplit.length; i++) {
            String strTrim = strArrSplit[i].trim();
            if (!TextUtils.isEmpty(strTrim)) {
                sb.append("第" + (i + 1) + "集 " + strTrim);
                if (i + 1 < strArrSplit.length) {
                    sb.append("#");
                }
            }
        }
        return sb.toString();
    }

    public static Object[] proxy(Map<String, String> map) {
        int i;
        String[] strArr;
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i3;
        int i4;
        String str6;
        String strS;
        int i5;
        int i6;
        String str7 = map.get("url");
        if (str7 == null || str7.isEmpty()) {
            return r(400, "Missing url");
        }
        String str8 = "UTF-8";
        String[] strArrSplit = new String(Base64.decode(str7, 11), "UTF-8").split("\\|\\|\\|");
        try {
            i = Integer.parseInt(map.get("fmt"));
        } catch (Exception unused) {
            i = 2;
        }
        int length = strArrSplit.length;
        int[] iArr = new int[length];
        String str9 = map.get("dur");
        if (str9 != null && !str9.isEmpty()) {
            String[] strArrSplit2 = str9.split(",");
            for (int i7 = 0; i7 < Math.min(strArrSplit2.length, length); i7++) {
                try {
                    iArr[i7] = Integer.parseInt(strArrSplit2[i7].trim());
                } catch (Exception unused2) {
                }
            }
        }
        String str10 = "application/x-mpegurl";
        String str11 = "#EXT-X-ENDLIST\n";
        String str12 = "#EXT-X-VERSION:3\n";
        String str13 = "\n#EXT-X-MEDIA-SEQUENCE:0\n";
        String str14 = "#EXT-X-VERSION:3\n#EXT-X-TARGETDURATION:";
        if (i == 1) {
            StringBuilder sb = new StringBuilder("#EXTM3U\n#EXT-X-VERSION:3\n#EXT-X-PLAYLIST-TYPE:VOD\n");
            int i8 = 0;
            int i9 = 10;
            int i10 = 0;
            boolean z = true;
            while (i8 < strArrSplit.length) {
                String strTrim = strArrSplit[i8].trim();
                if (strTrim.isEmpty() || !strTrim.startsWith("http")) {
                    i5 = length;
                } else {
                    if (i8 >= length || (i6 = iArr[i8]) <= 0) {
                        i6 = 600;
                    }
                    if (i6 > i9) {
                        i9 = i6;
                    }
                    if (!z) {
                        sb.append("#EXT-X-DISCONTINUITY\n");
                    }
                    i10++;
                    i5 = length;
                    sb.append("#EXTINF:");
                    sb.append(i6);
                    sb.append(".000,\n");
                    sb.append(strTrim);
                    sb.append("\n");
                    z = false;
                }
                i8++;
                length = i5;
            }
            if (i10 == 0) {
                return r(502, "No valid MP4 URLs");
            }
            return new Object[]{200, "application/x-mpegurl", new ByteArrayInputStream(C0531c.a(sb.toString().replace("#EXT-X-VERSION:3\n", "#EXT-X-VERSION:3\n#EXT-X-TARGETDURATION:" + i9 + "\n#EXT-X-MEDIA-SEQUENCE:0\n"), "#EXT-X-ENDLIST\n").getBytes("UTF-8"))};
        }
        HashMap mapB = v.b("User-Agent", "tdc.8260");
        StringBuilder sb2 = new StringBuilder("#EXTM3U\n#EXT-X-VERSION:3\n");
        int length2 = strArrSplit.length;
        int i11 = 0;
        int i12 = 10;
        boolean z2 = true;
        while (i11 < length2) {
            String strTrim2 = strArrSplit[i11].trim();
            if (strTrim2.isEmpty()) {
                str = str10;
                strArr = strArrSplit;
                i2 = length2;
                str2 = str8;
                i4 = i11;
                i3 = i12;
                str3 = str11;
                str4 = str12;
                str5 = str13;
            } else {
                strArr = strArrSplit;
                URL url = new URL(strTrim2);
                i2 = length2;
                StringBuilder sb3 = new StringBuilder();
                str = str10;
                sb3.append(url.getProtocol());
                sb3.append("://");
                str2 = str8;
                sb3.append(url.getHost());
                String string = sb3.toString();
                str3 = str11;
                String query = url.getQuery() != null ? url.getQuery() : "";
                str4 = str12;
                str5 = str13;
                i3 = i12;
                String strSubstring = url.getPath().contains("/") ? url.getPath().substring(0, url.getPath().lastIndexOf(47)) : "";
                String strL = C0575b.l(strTrim2, mapB);
                if (strL == null || strL.isEmpty()) {
                    i4 = i11;
                } else {
                    str6 = str14;
                    if (strL.contains("#EXT-X-STREAM-INF")) {
                        String[] strArrSplit3 = strL.split("\\r?\\n");
                        int length3 = strArrSplit3.length;
                        i4 = i11;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= length3) {
                                strS = null;
                                break;
                            }
                            String[] strArr2 = strArrSplit3;
                            String strTrim3 = strArrSplit3[i13].trim();
                            if (!strTrim3.isEmpty() && !strTrim3.startsWith("#")) {
                                strS = s(strTrim3, string, strSubstring, "");
                                break;
                            }
                            i13++;
                            strArrSplit3 = strArr2;
                        }
                        if (strS != null && (strL = C0575b.l(strS, mapB)) != null && !strL.isEmpty()) {
                            URL url2 = new URL(strS);
                            String str15 = url2.getProtocol() + "://" + url2.getHost();
                            String strSubstring2 = url2.getPath().contains("/") ? url2.getPath().substring(0, url2.getPath().lastIndexOf(47)) : "";
                            string = str15;
                            strSubstring = strSubstring2;
                        }
                        i12 = i3;
                        i11 = i4 + 1;
                        strArrSplit = strArr;
                        length2 = i2;
                        str10 = str;
                        str8 = str2;
                        str11 = str3;
                        str12 = str4;
                        str13 = str5;
                        str14 = str6;
                    } else {
                        i4 = i11;
                    }
                    if (!z2) {
                        sb2.append("#EXT-X-DISCONTINUITY\n");
                    }
                    int i14 = i3;
                    for (String str16 : strL.split("\\r?\\n")) {
                        String strTrim4 = str16.trim();
                        if (strTrim4.startsWith("#EXTM3U") || strTrim4.startsWith("#EXT-X-VERSION") || strTrim4.startsWith("#EXT-X-TARGETDURATION") || strTrim4.startsWith("#EXT-X-MEDIA-SEQUENCE") || strTrim4.startsWith("#EXT-X-ENDLIST")) {
                            if (strTrim4.startsWith("#EXT-X-TARGETDURATION:")) {
                                try {
                                    int i15 = Integer.parseInt(strTrim4.substring(21).trim());
                                    if (i15 > i14) {
                                        i14 = i15;
                                    }
                                } catch (Exception unused3) {
                                }
                            }
                        } else if (strTrim4.startsWith("#EXT-X-KEY:") && strTrim4.contains("URI=")) {
                            sb2.append(t(strTrim4, string, strSubstring, query));
                            sb2.append("\n");
                        } else if (strTrim4.startsWith("#EXT-X-MAP:") && strTrim4.contains("URI=")) {
                            sb2.append(t(strTrim4, string, strSubstring, query));
                            sb2.append("\n");
                        } else if (strTrim4.isEmpty() || strTrim4.startsWith("#")) {
                            sb2.append(str16);
                            sb2.append("\n");
                        } else {
                            sb2.append(s(strTrim4, string, strSubstring, query));
                            sb2.append("\n");
                        }
                    }
                    i12 = i14;
                    z2 = false;
                    i11 = i4 + 1;
                    strArrSplit = strArr;
                    length2 = i2;
                    str10 = str;
                    str8 = str2;
                    str11 = str3;
                    str12 = str4;
                    str13 = str5;
                    str14 = str6;
                }
            }
            str6 = str14;
            i12 = i3;
            i11 = i4 + 1;
            strArrSplit = strArr;
            length2 = i2;
            str10 = str;
            str8 = str2;
            str11 = str3;
            str12 = str4;
            str13 = str5;
            str14 = str6;
        }
        String str17 = str10;
        String str18 = str8;
        int i16 = i12;
        String str19 = str11;
        String str20 = str12;
        String str21 = str13;
        String str22 = str14;
        if (z2) {
            return r(502, "All m3u8 segments failed to load");
        }
        return new Object[]{200, str17, new ByteArrayInputStream(C0531c.a(sb2.toString().replace(str20, str22 + i16 + str21), str19).getBytes(str18))};
    }

    public static Object[] r(int i, String str) {
        return new Object[]{Integer.valueOf(i), "text/plain", new ByteArrayInputStream(str.getBytes("UTF-8"))};
    }

    public static String s(String str, String str2, String str3, String str4) {
        if (!str.startsWith("http")) {
            if (str.startsWith("/")) {
                str = C0531c.a(str2, str);
            } else {
                str = str2 + str3 + "/" + str;
            }
        }
        if (str4.isEmpty()) {
            return str;
        }
        return C0544h.b(C0529a.a(str), str.contains("?") ? "&" : "?", str4);
    }

    public static String t(String str, String str2, String str3, String str4) {
        int i;
        int iIndexOf;
        int iIndexOf2 = str.indexOf("URI=\"");
        if (iIndexOf2 < 0 || (iIndexOf = str.indexOf(34, (i = iIndexOf2 + 5))) < 0) {
            return str;
        }
        return str.substring(0, i) + s(str.substring(i, iIndexOf), str2, str3, str4) + str.substring(iIndexOf);
    }

    public final JSONObject b(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pid", str);
            jSONObject.put("scid", str2);
            jSONObject.put("sq", str3);
            jSONObject.put("re", "1");
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("ttk", str4);
            }
            JSONObject jSONObjectQ = q(jSONObject, "/api/series/rslvV4", "sign");
            if (jSONObjectQ == null) {
                return null;
            }
            String strL = C0575b.l(jSONObjectQ.getString("url"), g(jSONObjectQ.getJSONObject("headers")));
            if (TextUtils.isEmpty(strL)) {
                return null;
            }
            return new JSONObject(strL);
        } catch (Exception unused) {
            return null;
        }
    }

    public final JSONObject c(String str, JSONObject jSONObject) {
        JSONObject jSONObjectD = d(str, jSONObject);
        if (jSONObjectD == null) {
            return null;
        }
        String strOptString = jSONObjectD.optString("data", "");
        if (strOptString.length() > 20) {
            return o(strOptString, String.valueOf(jSONObjectD.opt("ts")));
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException {
        String str3;
        int i;
        if (str.contains("_")) {
            String[] strArrSplit = str.split("_", 2);
            String str4 = strArrSplit[0];
            str3 = strArrSplit[1];
            str = str4;
        } else {
            str3 = "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stype", str);
        jSONObject.put("page", str2);
        if (!str3.isEmpty()) {
            jSONObject.put("cid", str3);
        }
        if (map != null) {
            if (map.containsKey("sort")) {
                jSONObject.put("sort", map.get("sort"));
            }
            if (map.containsKey("year")) {
                jSONObject.put("year", map.get("year"));
            }
        }
        JSONObject jSONObjectC = c("/api/series2/arrange/cate", jSONObject);
        if (jSONObjectC == null) {
            return com.github.catvod.spider.merge.A.a.b();
        }
        ArrayList arrayListN = n(jSONObjectC.optJSONArray("seriesList"), 0);
        try {
            i = Integer.parseInt(str2);
        } catch (Exception unused) {
            i = 1;
        }
        int i2 = jSONObjectC.optInt("more", 0) > 0 ? i + 1 : i;
        return C0552c.m(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(Math.max(arrayListN.size(), 1)), Integer.valueOf(Math.max(arrayListN.size(), 1) * i2), arrayListN);
    }

    public final JSONObject d(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObjectQ = q(jSONObject, str, "sign");
            if (jSONObjectQ == null) {
                return null;
            }
            String strL = C0575b.l(jSONObjectQ.getString("url"), g(jSONObjectQ.getJSONObject("headers")));
            if (TextUtils.isEmpty(strL)) {
                return null;
            }
            JSONObject jSONObject2 = new JSONObject(strL);
            if (jSONObject2.optInt("rescode", -1) == 0) {
                return jSONObject2;
            }
            return null;
        } catch (Exception e2) {
            com.github.catvod.spider.merge.A.a.r(e2, new StringBuilder("[FishHxq] API调用失败: "));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1 A[PHI: r2 r11 r13
      0x00b1: PHI (r2v6 org.json.JSONObject) = (r2v5 org.json.JSONObject), (r2v5 org.json.JSONObject), (r2v5 org.json.JSONObject), (r2v11 org.json.JSONObject) binds: [B:28:0x0090, B:29:0x0092, B:31:0x009c, B:35:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r11v14 int) = (r11v13 int), (r11v13 int), (r11v13 int), (r11v18 int) binds: [B:28:0x0090, B:29:0x0092, B:31:0x009c, B:35:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r13v3 java.lang.String) = (r13v2 java.lang.String), (r13v2 java.lang.String), (r13v4 java.lang.String), (r13v4 java.lang.String) binds: [B:28:0x0090, B:29:0x0092, B:31:0x009c, B:35:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r22) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 740
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Hxq.detailContent(java.util.List):java.lang.String");
    }

    public final String e(String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArray;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pid", str);
            jSONObject.put("refer", "");
            JSONObject jSONObjectC = c("/api/series2/episode/detail", jSONObject);
            if (jSONObjectC == null || (jSONObjectOptJSONObject = jSONObjectC.optJSONObject("playItem")) == null) {
                return "";
            }
            Object objOpt = jSONObjectOptJSONObject.opt("sources");
            if (objOpt instanceof JSONArray) {
                jSONArray = (JSONArray) objOpt;
            } else if (objOpt instanceof String) {
                try {
                    jSONArray = new JSONArray((String) objOpt);
                } catch (Exception unused) {
                    jSONArray = null;
                }
            } else {
                jSONArray = null;
            }
            return (jSONArray == null || jSONArray.length() <= 0) ? "" : jSONArray.getJSONObject(0).optString("scid", "");
        } catch (Exception e2) {
            com.github.catvod.spider.merge.A.a.r(e2, new StringBuilder("[FishHxq] 获取scid失败: "));
            return "";
        }
    }

    public final String f(String str) {
        String strOptString;
        JSONObject jSONObjectO;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectO2;
        HashMap map = this.b;
        String str2 = (String) map.get(str);
        HashMap map2 = this.c;
        Long l = (Long) map2.get(str);
        if (!TextUtils.isEmpty(str2) && l != null && System.currentTimeMillis() < l.longValue()) {
            return str2;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene", "ad_series_play");
            JSONObject jSONObjectQ = q(jSONObject, "/api/carp/reward/v2", "login");
            if (jSONObjectQ == null) {
                return "";
            }
            String strL = C0575b.l(jSONObjectQ.getString("url"), g(jSONObjectQ.getJSONObject("headers")));
            if (TextUtils.isEmpty(strL)) {
                return "";
            }
            JSONObject jSONObject2 = new JSONObject(strL);
            if (jSONObject2.optInt("rescode", -1) != 0) {
                return "";
            }
            String strOptString2 = jSONObject2.optString("traceId", "");
            if (TextUtils.isEmpty(strOptString2) && jSONObject2.has("data") && (jSONObjectO2 = o(jSONObject2.optString("data", ""), String.valueOf(jSONObject2.opt("ts")))) != null) {
                strOptString2 = jSONObjectO2.optString("traceId", "");
            }
            if (TextUtils.isEmpty(strOptString2)) {
                return "";
            }
            JSONObject jSONObjectI = i();
            jSONObjectI.put("traceId", strOptString2);
            jSONObjectI.put("scene", "ad_series_play");
            jSONObjectI.put("pid", str);
            JSONObject jSONObjectP = p("fishhxq6", jSONObjectI);
            if (jSONObjectP == null) {
                return "";
            }
            String strA = C0575b.f(jSONObjectP.getString("url"), jSONObjectP.getString("body"), g(jSONObjectP.getJSONObject("headers"))).a();
            if (TextUtils.isEmpty(strA)) {
                return "";
            }
            JSONObject jSONObject3 = new JSONObject(strA);
            if (jSONObject3.optInt("rescode", -1) != 0) {
                return "";
            }
            int iOptInt = 21600;
            if (!jSONObject3.has("data") || !(jSONObject3.opt("data") instanceof String) || (jSONObjectO = o(jSONObject3.optString("data", ""), String.valueOf(jSONObject3.opt("ts")))) == null || (jSONObjectOptJSONObject = jSONObjectO.optJSONObject("rewardTokenInfo")) == null) {
                strOptString = "";
            } else {
                strOptString = jSONObjectOptJSONObject.optString("token", "");
                iOptInt = jSONObjectOptJSONObject.optInt("expireTime", jSONObjectOptJSONObject.optInt("expires", 21600));
            }
            if (TextUtils.isEmpty(strOptString)) {
                return "";
            }
            map.put(str, strOptString);
            map2.put(str, Long.valueOf(((((long) iOptInt) * 1000) + System.currentTimeMillis()) - 60000));
            return strOptString;
        } catch (Exception e2) {
            com.github.catvod.spider.merge.A.a.r(e2, new StringBuilder("[FishHxq] 获取rewardToken失败: "));
            return "";
        }
    }

    public String homeContent(boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = "stype";
        jSONObject.put("stype", "1");
        jSONObject.put("page", "1");
        JSONObject jSONObjectC = c("/api/series2/arrange/cate", jSONObject);
        if (jSONObjectC == null) {
            return com.github.catvod.spider.merge.A.a.b();
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayListL = l(jSONObjectC.optJSONArray("sorts"));
        ArrayList arrayListL2 = l(jSONObjectC.optJSONArray("years"));
        JSONArray jSONArrayOptJSONArray = jSONObjectC.optJSONArray("groups");
        if (jSONArrayOptJSONArray != null) {
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                String strValueOf = String.valueOf(jSONObject2.opt(str));
                String str2 = str;
                arrayList.add(new C0550a(strValueOf, jSONObject2.optString("name", "") + "全部", null));
                if (z) {
                    a(linkedHashMap, strValueOf, arrayListL, arrayListL2);
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("cates");
                if (jSONArrayOptJSONArray2 != null) {
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < jSONArrayOptJSONArray2.length() && i3 < 5) {
                        JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i2);
                        String strOptString = jSONObject3.optString("name", "");
                        JSONArray jSONArray = jSONArrayOptJSONArray;
                        String strValueOf2 = String.valueOf(jSONObject3.opt("value"));
                        if (!"-1".equals(strValueOf2) && !"全部".equals(strOptString) && !"伦理".equals(strOptString)) {
                            String strA = u.a(strValueOf, "_", strValueOf2);
                            com.github.catvod.spider.merge.A.a.s(strA, strOptString, null, arrayList);
                            if (z) {
                                a(linkedHashMap, strA, arrayListL, arrayListL2);
                            }
                            i3++;
                        }
                        i2++;
                        jSONArrayOptJSONArray = jSONArray;
                    }
                }
                i++;
                str = str2;
                jSONArrayOptJSONArray = jSONArrayOptJSONArray;
            }
        }
        return C0552c.q(arrayList, (List) n(jSONObjectC.optJSONArray("seriesList"), 20), linkedHashMap);
    }

    public void init(Context context, String str) {
        super.init(context, str);
        if (!TextUtils.isEmpty(str)) {
            String strJ = com.github.catvod.spider.merge.A.a.j(str);
            if (!TextUtils.isEmpty(strJ)) {
                str = strJ;
            }
            this.a = str;
            if (str.endsWith("/")) {
                this.a = this.a.substring(0, r2.length() - 1);
            }
        }
        try {
            JSONObject jSONObjectP = p("fishhxq1", i());
            if (jSONObjectP != null) {
                jSONObjectP.optString("host", "");
            }
        } catch (Exception e2) {
            com.github.catvod.spider.merge.A.a.r(e2, new StringBuilder("[FishHxq] 初始化失败: "));
        }
    }

    public final JSONObject o(String str, String str2) {
        JSONObject jSONObjectI = i();
        try {
            jSONObjectI.put("data", str);
            jSONObjectI.put("ts", str2);
        } catch (Exception unused) {
        }
        JSONObject jSONObjectP = p("fishhxq4", jSONObjectI);
        if (jSONObjectP != null) {
            return jSONObjectP.optJSONObject("result");
        }
        return null;
    }

    public final JSONObject p(String str, JSONObject jSONObject) {
        try {
            return k(C0575b.f(this.a + "?do=" + str, h(jSONObject), null).a());
        } catch (Exception e2) {
            com.github.catvod.spider.merge.A.a.r(e2, com.github.catvod.spider.merge.A.a.e("[FishHxq] php.", str, "失败: "));
            return null;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        JSONArray jSONArrayOptJSONArray;
        if (TextUtils.isEmpty(str2) || !str2.contains("|||")) {
            return new C0552c().toString();
        }
        String[] strArrSplit = str2.split("\\|\\|\\|", -1);
        String str3 = strArrSplit.length > 1 ? strArrSplit[1] : "";
        String strE = strArrSplit.length > 2 ? strArrSplit[2] : "";
        String str4 = strArrSplit.length > 3 ? strArrSplit[3] : "10";
        if (TextUtils.isEmpty(str3)) {
            return new C0552c().toString();
        }
        if (TextUtils.isEmpty(strE)) {
            strE = e(str3);
        }
        if (!TextUtils.isEmpty(strE)) {
            int i = 0;
            V4Result v4Result = null;
            try {
                JSONObject jSONObjectB = b(str3, strE, str4, null);
                if (jSONObjectB != null && jSONObjectB.optInt("rescode", -1) == 10401) {
                    String strF = f(str3);
                    if (!TextUtils.isEmpty(strF)) {
                        jSONObjectB = b(str3, strE, str4, strF);
                    }
                }
                if (jSONObjectB != null && jSONObjectB.optInt("rescode", -1) == 0 && (jSONArrayOptJSONArray = jSONObjectB.optJSONArray("datas")) != null && jSONArrayOptJSONArray.length() != 0) {
                    V4Result v4Result2 = new V4Result();
                    v4Result2.a = jSONObjectB.optInt("format", 2);
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i2);
                        int iOptInt = jSONObject.optInt("duration", 0);
                        String strOptString = jSONObject.optString("data", "");
                        if (!TextUtils.isEmpty(strOptString)) {
                            JSONObject jSONObjectI = i();
                            try {
                                jSONObjectI.put("data", strOptString);
                            } catch (Exception unused) {
                            }
                            JSONObject jSONObjectP = p("fishhxq5", jSONObjectI);
                            JSONObject jSONObjectOptJSONObject = jSONObjectP != null ? jSONObjectP.optJSONObject("result") : null;
                            if (jSONObjectOptJSONObject != null) {
                                String strOptString2 = jSONObjectOptJSONObject.optString("playUrl", "");
                                if (!strOptString2.isEmpty()) {
                                    v4Result2.b.add(strOptString2);
                                    v4Result2.c.add(Integer.valueOf(iOptInt));
                                }
                            }
                        }
                    }
                    if (!v4Result2.b.isEmpty()) {
                        v4Result = v4Result2;
                    }
                }
            } catch (Exception e2) {
                com.github.catvod.spider.merge.A.a.r(e2, new StringBuilder("[FishHxq] V4播放失败: "));
            }
            if (v4Result != null) {
                ArrayList arrayList = v4Result.b;
                if (!arrayList.isEmpty()) {
                    HashMap mapB = v.b("User-Agent", "tdc.8260");
                    if (v4Result.a == 1 && arrayList.size() == 1) {
                        C0552c c0552c = new C0552c();
                        c0552c.w((String) arrayList.get(0));
                        c0552c.m94e((Map) mapB);
                        return C0529a.addDanmaku(c0552c.toString());
                    }
                    String strEncodeToString = Base64.encodeToString(TextUtils.join("|||", arrayList).getBytes("UTF-8"), 11);
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        ArrayList arrayList2 = v4Result.c;
                        if (i >= arrayList2.size()) {
                            String str5 = Proxy.getUrl() + "?do=hxq&url=" + strEncodeToString + "&fmt=" + v4Result.a + "&dur=" + ((Object) sb);
                            C0552c c0552c2 = new C0552c();
                            c0552c2.w(str5);
                            c0552c2.m94e((Map) mapB);
                            return C0529a.addDanmaku(c0552c2.toString());
                        }
                        if (i > 0) {
                            sb.append(",");
                        }
                        sb.append(arrayList2.get(i));
                        i++;
                    }
                }
            }
        }
        return new C0552c().toString();
    }

    public final JSONObject q(JSONObject jSONObject, String str, String str2) {
        JSONObject jSONObjectI = i();
        try {
            jSONObjectI.put("path", str);
            jSONObjectI.put("params", jSONObject);
            jSONObjectI.put("htype", str2);
        } catch (Exception unused) {
        }
        return p("fishhxq2", jSONObjectI);
    }

    public String searchContent(String str, boolean z) throws JSONException {
        JSONObject jSONObjectI = i();
        jSONObjectI.put("keyword", str);
        jSONObjectI.put("type", "0");
        jSONObjectI.put("page", "1");
        JSONObject jSONObjectP = p("fishhxq3", jSONObjectI);
        if (jSONObjectP == null) {
            return com.github.catvod.spider.merge.A.a.b();
        }
        JSONObject jSONObjectO = null;
        try {
            String strL = C0575b.l(jSONObjectP.getString("url"), g(jSONObjectP.getJSONObject("headers")));
            if (!TextUtils.isEmpty(strL)) {
                JSONObject jSONObject = new JSONObject(strL);
                if (jSONObject.optInt("rescode", -1) == 0) {
                    String strOptString = jSONObject.optString("data", "");
                    if (strOptString.length() > 20) {
                        jSONObjectO = o(strOptString, String.valueOf(jSONObject.opt("ts")));
                    }
                }
            }
        } catch (Exception unused) {
        }
        return jSONObjectO == null ? com.github.catvod.spider.merge.A.a.b() : C0552c.n(n(jSONObjectO.optJSONArray("seriesList"), 0));
    }
}
