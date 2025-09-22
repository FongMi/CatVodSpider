package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.C0165;
import com.github.catvod.parser.C0166;
import com.github.catvod.spider.merge.C0106ZJ;
import com.github.catvod.spider.merge.C0118ga;
import com.github.catvod.spider.merge.C0152vp;
import com.github.catvod.spider.merge.C0168;
import com.github.catvod.spider.merge.C0169;
import com.github.catvod.spider.merge.C0171;
import com.github.catvod.spider.merge.C0172;
import com.github.catvod.spider.merge.C0174;
import com.github.catvod.spider.merge.C0175;
import com.github.catvod.spider.merge.C0176;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class AI2 extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f811short = {3073, 3091, 3099, 3082, 3103, 3075, 2157, 2123, 2141, 2122, 2069, 2169, 2143, 2141, 2134, 2124, 1955, 684, 731, 731, 731, 2866, 2859, 2848, 2843, 2855, 2859, 2858, 2864, 2849, 2858, 2864, 2779, 2754, 2761, 2802, 2761, 2756, 2783, 2760, 2766, 2777, 2754, 2783, 2997, 2988, 2983, 2972, 2978, 2976, 2999, 2988, 2993, 2028, 2037, 2046, 1989, 2024, 2047, 2039, 2043, 2024, 2033, 2025, 1962, 1971, 1976, 1923, 1981, 1966, 1977, 1981, 1993, 2000, 2011, 2016, 1990, 2010, 2014, 1997, 1926, 1951, 1940, 1967, 1920, 1945, 1939, 952, 929, 938, 913, 928, 943, 931, 939, 616, 625, 634, 577, 631, 634, 3200, 3278, 3295, 3270, 3201, 3295, 3271, 3295, 3200, 3278, 3295, 3295, 3200, 3289, 3270, 3275, 3274, 3264, 3312, 3275, 3274, 3291, 3278, 3270, 3267, 3216, 3270, 3275, 3218, 1052, 1049, 1036, 1049, 724, 717, 710, 765, 727, 720, 718, 765, 725, 715, 726, 714, 765, 722, 718, 707, 731, 711, 720, 1594, 1591, 1598, 1579, 1553, 1568, 1583, 1571, 1579, 3134, 3111, 3116, 3095, 3115, 3108, 3113, 3131, 3131, 24877, 27116, 22954, 20933, 23329, 23300, -30864, -2747, -32322, 22710, 17475, 21786, 22942, -28450, -2744, -2744, 1359, 1344, 1356, 1348, 2268, 2256, 2267, 2266, 2990, 2985, 2999, 3167, 3142, 3149, 3190, 3161, 3141, 3144, 3152, 3190, 3151, 3163, 3142, 3140, 1097, 1104, 1115, 1120, 1103, 1107, 1118, 1094, 1120, 1098, 1101, 1107, 1716, 1713, 1707, 1708, -31778, 28077, 23374, -24813, -32272, -29004, 24775, -27110, 30777, 1734, 1748, 1741, 1756, 1733, 2250, 2282, 298, 348, 2367, 2329, 2319, 2328, 2375, 2347, 2317, 2319, 2308, 2334, 1224, 1189, 1159, 1170, 1153, 1156, 1156, 1161, 1223, 1245, 1222, 1240, 1224, 1216, 1163, 1159, 1157, 1176, 1161, 1180, 1153, 1162, 1156, 1165, 1235, 1224, 1189, 1211, 1185, 1197, 1224, 1247, 1222, 1240, 1235, 1224, 1215, 1153, 1158, 1164, 1159, 1183, 1179, 1224, 1233, 1245, 1235, 1224, 1212, 1178, 1153, 1164, 1165, 1158, 1180, 1223, 1245, 1222, 1240, 1217, 1221, 1211, 1212, 1172, 1214, 862, 834, 834, 838, 3024, 3009, 3026, 3027, 3013, 3282, 3285, 3275, 2472, 2589, 2576, 2580, 2577, 2576, 2567, 1143, 1151, 1143, 1151, 1143, 1151, 1143, 1066, 1797, 1792, 1813, 1792, 1039, 1053, 2267, 2181, 2243, 2190, 629, 616, 556, 3107, 3130, 3121, 3082, 3111, 3120, 3128, 3124, 3111, 3134, 3110, 617, 624, 635, 576, 623, 630, 636, 1681, 1672, 1667, 1720, 1673, 1670, 1674, 1666, 2626, 2651, 2640, 2667, 2653, 2640, 1752, 1757, 1735, 1728, 2265, 2199, 2182, 2207, 2264, 2182, 2206, 2182, 2265, 2199, 2182, 2182, 2265, 2181, 2195, 2199, 2180, 2197, 2206, 2249, 2182, 2193, 2251, 2247, 2256, 2178, 2195, 2190, 2178, 2251};

    /* renamed from: Mo */
    JSONArray f10Mo;

    /* renamed from: q */
    private String f13q = "";

    /* renamed from: xC */
    private String f15xC = "";

    /* renamed from: QU */
    private String f11QU = "";

    /* renamed from: UJ */
    private String f12UJ = "";

    /* renamed from: u */
    private String f14u = "";

    public AI2() {
        int iM844 = C0178.m844();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = iM844 >= 0 ? 1709 : 1678;
                case 204:
                    System.out.println(Integer.decode(C0180.m852("VIrf5YuY5otvv4eQAZAmrLy4")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* renamed from: q */
    private void m2q() {
        try {
            String str = this.f14u;
            this.f10Mo = new JSONObject(C0152vp.m730q(C0106ZJ.m484FN(str, m3xC(str)), this.f12UJ)).getJSONArray(C0181.m856(f811short, 0, 6, 3179));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: xC */
    private HashMap<String, String> m3xC(String str) {
        String str2 = "۠ۧ۠";
        String str3 = null;
        String strM845 = null;
        short[] sArr = null;
        HashMap<String, String> map = null;
        while (true) {
            switch (C0174.m829(str2)) {
                case 1747897:
                    str2 = "ۦۧۨ";
                    map = new HashMap<>();
                    break;
                case 1752583:
                    str2 = "ۨۡۤ";
                    sArr = f811short;
                    break;
                case 1752675:
                    return map;
                case 1753671:
                    str3 = this.f15xC;
                    str2 = "ۥۣۥ";
                    break;
                case 1755403:
                    str2 = "ۨ۠ۢ";
                    strM845 = C0178.m845(sArr, 6, 10, 2104);
                    break;
                default:
                    map.put(strM845, str3);
                    str2 = "ۥۦۤ";
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x01c8. Please report as an issue. */
    public String detailContent(List<String> list) {
        String strM836 = C0176.m836(f811short, 16, 1, 1920);
        String strM834 = C0175.m834(f811short, 17, 1, 646);
        String strM828 = C0174.m828(f811short, 18, 3, 767);
        String strM856 = C0181.m856(f811short, 21, 11, 2884);
        String strM841 = C0177.m841(f811short, 32, 12, 2733);
        String strM798 = C0165.m798(f811short, 44, 9, 3011);
        String strM8562 = C0181.m856(f811short, 53, 11, 1946);
        String strM820 = C0172.m820(f811short, 64, 8, 2012);
        String strM809 = C0169.m809(f811short, 72, 8, 1983);
        String strM8412 = C0177.m841(f811short, 80, 7, 2032);
        String strM8342 = C0175.m834(f811short, 87, 8, 974);
        String strM8202 = C0172.m820(f811short, 95, 6, 542);
        try {
            Init.m46lj();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f13q);
            sb.append(C0169.m809(f811short, 101, 29, 3247));
            sb.append(list.get(0));
            String string = sb.toString();
            JSONObject jSONObject3 = new JSONObject(C0152vp.m730q(C0106ZJ.m484FN(string, m3xC(string)), this.f11QU)).getJSONObject(C0168.m805(f811short, 130, 4, 1144));
            JSONArray jSONArray = jSONObject3.getJSONArray(C0168.m805(f811short, 134, 19, 674));
            jSONObject.put(strM8202, jSONObject3.optString(strM8202));
            jSONObject.put(strM8342, jSONObject3.optString(strM8342));
            jSONObject.put(strM8412, jSONObject3.optString(strM8412));
            jSONObject.put(C0169.m809(f811short, 153, 9, 1614), jSONObject3.optString(C0168.m805(f811short, 162, 9, 3144)));
            jSONObject.put(strM809, jSONObject3.optString(strM809));
            jSONObject.put(strM820, jSONObject3.optString(strM820));
            jSONObject.put(strM8562, jSONObject3.optString(strM8562));
            jSONObject.put(strM798, jSONObject3.optString(strM798));
            jSONObject.put(strM841, jSONObject3.optString(strM841));
            jSONObject.put(strM856, C0174.m828(f811short, 171, 16, 2633) + jSONObject3.optString(strM856));
            int i = 0;
            while (true) {
                int length = jSONArray.length();
                int i2 = 1616;
                while (true) {
                    i2 ^= 1633;
                    switch (i2) {
                        case 14:
                        case 49:
                            i2 = i < length ? 1709 : 1678;
                        case 204:
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                            String strOptString = jSONObjectOptJSONObject.optString(C0176.m836(f811short, 187, 4, 1313));
                            String strOptString2 = jSONObjectOptJSONObject.optString(C0177.m841(f811short, 191, 4, 2239));
                            String str = jSONObjectOptJSONObject.optString(C0177.m841(f811short, 195, 3, 3035)) + strM834 + strOptString2;
                            arrayList.add(strOptString);
                            arrayList2.add(str.replaceAll(strM836, strM834 + strOptString2 + strM836));
                            int i3 = i + 1;
                            int i4 = 1740;
                            while (true) {
                                i4 ^= 1757;
                                switch (i4) {
                                    case 17:
                                        i4 = 1771;
                                        break;
                                    case 54:
                                        break;
                                }
                            }
                            i = i3;
                            break;
                        case 239:
                            break;
                    }
                    String strJoin = TextUtils.join(strM828, arrayList);
                    String strJoin2 = TextUtils.join(strM828, arrayList2);
                    jSONObject.put(C0171.m816(f811short, 198, 13, 3113), strJoin);
                    jSONObject.put(C0183.m866(f811short, 211, 12, 1087), strJoin2);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(jSONObject);
                    jSONObject2.put(C0176.m836(f811short, 223, 4, 1752), jSONArray2);
                    return jSONObject2.toString();
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }

    public String findJxApi(JSONArray jSONArray, String str) throws JSONException {
        int i = 0;
        while (true) {
            try {
                int length = jSONArray.length();
                int i2 = 1616;
                while (true) {
                    i2 ^= 1633;
                    switch (i2) {
                        case 14:
                        case 49:
                            i2 = i < length ? 1709 : 1678;
                        case 204:
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            boolean zEqualsIgnoreCase = jSONObject.getString(C0176.m836(f811short, 227, 5, 2621)).equalsIgnoreCase(str);
                            int i3 = 1740;
                            while (true) {
                                i3 ^= 1757;
                                switch (i3) {
                                    case 17:
                                        i3 = zEqualsIgnoreCase ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case 500:
                                        JSONArray jSONArray2 = jSONObject.getJSONArray(C0183.m866(f811short, 232, 4, 1879));
                                        int length2 = jSONArray2.length();
                                        int i4 = 1864;
                                        while (true) {
                                            i4 ^= 1881;
                                            switch (i4) {
                                                case 17:
                                                    i4 = length2 > 0 ? 48736 : 48705;
                                                case 47384:
                                                    break;
                                                case 47417:
                                                    return jSONArray2.getJSONObject(0).getString(C0165.m798(f811short, 236, 5, 1708));
                                                case 47483:
                                            }
                                        }
                                        break;
                                }
                            }
                            i++;
                            int i5 = 48767;
                            while (true) {
                                i5 ^= 48784;
                                switch (i5) {
                                    case 14:
                                        break;
                                    case 239:
                                        i5 = 48798;
                                        break;
                                }
                            }
                            break;
                        case 239:
                            break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public void init(Context context, String str) {
        super.init(context, str);
        String[] strArrSplit = C0152vp.m724Mo(str).split(C0165.m798(f811short, 241, 2, 2198));
        this.f13q = strArrSplit[0];
        this.f11QU = strArrSplit[1];
        this.f14u = strArrSplit[2];
        this.f12UJ = strArrSplit[3];
        this.f15xC = strArrSplit[4];
        m2q();
        int iM864 = C0183.m864();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = iM864 <= 0 ? 1709 : 1678;
                case 204:
                    System.out.println(Integer.valueOf(C0181.m858("mPu9eN76LExdKIK8I3cOI")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        JSONObject jSONObject;
        try {
            String[] strArrSplit = str2.split(C0176.m836(f811short, 243, 2, 374));
            String str3 = strArrSplit[1];
            String str4 = strArrSplit[0];
            String strFindJxApi = findJxApi(this.f10Mo, str3);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C0180.m851(f811short, 245, 10, 2410), C0179.m849(f811short, 255, 65, 1256));
            boolean zContains = strFindJxApi.contains(C0180.m851(f811short, 320, 4, 822));
            String strM805 = C0168.m805(f811short, 324, 5, 2976);
            String strM851 = C0180.m851(f811short, 329, 3, 3239);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = zContains ? 1709 : 1678;
                    case 204:
                        String strM484FN = C0106ZJ.m484FN(strFindJxApi + str4, m3xC(""));
                        boolean zContains2 = strM484FN.contains(C0177.m841(f811short, 332, 1, 2515));
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = !zContains2 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    jSONObject = new JSONObject(strM484FN);
                                    break;
                                case 500:
                                    JSONObject jSONObject3 = new JSONObject(C0152vp.m730q(strM484FN, this.f11QU));
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                i3 = 48674;
                                                continue;
                                            case 47483:
                                                jSONObject = jSONObject3;
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                            }
                        }
                        boolean zHas = jSONObject.has(strM851);
                        String strM861 = C0182.m861(f811short, 333, 6, 2677);
                        int i4 = 48767;
                        while (true) {
                            i4 ^= 48784;
                            switch (i4) {
                                case 14:
                                case 45:
                                    String strOptString = jSONObject.optJSONObject(C0168.m805(f811short, 347, 4, 1889)).optString(strM851);
                                    int i5 = 48891;
                                    while (true) {
                                        i5 ^= 48908;
                                        switch (i5) {
                                            case 22:
                                            case 53:
                                                break;
                                            case 503:
                                                i5 = strOptString == null ? 49635 : 48953;
                                            case 32495:
                                                boolean zM600Mo = C0118ga.m600Mo(str4);
                                                int i6 = 49666;
                                                while (true) {
                                                    i6 ^= 49683;
                                                    switch (i6) {
                                                        case 17:
                                                            i6 = zM600Mo ? 49759 : 49728;
                                                        case 50:
                                                        case 76:
                                                            JSONObject jSONObject4 = new JSONObject();
                                                            jSONObject4.put(strM851, str4);
                                                            jSONObject4.put(C0172.m820(f811short, 351, 2, 1125), 1);
                                                            jSONObject4.put(strM861, jSONObject2.toString());
                                                            return jSONObject4.toString();
                                                        case 83:
                                                            break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    JSONObject jSONObject5 = new JSONObject();
                                    jSONObject5.put(strM851, strOptString);
                                    jSONObject5.put(strM805, 0);
                                    jSONObject5.put(strM861, jSONObject2.toString());
                                    return jSONObject5.toString();
                                case 76:
                                    String strOptString2 = jSONObject.optString(strM851);
                                    System.out.println(C0175.m834(f811short, 339, 8, 1040) + strOptString2);
                                    JSONObject jSONObject6 = new JSONObject();
                                    jSONObject6.put(strM851, strOptString2);
                                    jSONObject6.put(strM805, 0);
                                    jSONObject6.put(strM861, jSONObject2.toString());
                                    return jSONObject6.toString();
                                case 239:
                                    i4 = zHas ? 48860 : 48829;
                            }
                        }
                        break;
                    case 239:
                        boolean zContains3 = str4.contains(C0172.m820(f811short, 353, 4, 2230));
                        int i7 = 49790;
                        while (true) {
                            i7 ^= 49807;
                            switch (i7) {
                                case 18:
                                    break;
                                case 51:
                                    break;
                                case 84:
                                    boolean zContains4 = str4.contains(C0172.m820(f811short, 357, 3, 536));
                                    int i8 = 49914;
                                    while (true) {
                                        i8 ^= 49931;
                                        switch (i8) {
                                            case 497:
                                                if (!zContains4) {
                                                    break;
                                                } else {
                                                    i8 = 50658;
                                                }
                                            case 1711:
                                                break;
                                            case 1736:
                                                return "";
                                            case 1769:
                                                break;
                                            default:
                                                continue;
                                        }
                                        i8 = 50627;
                                    }
                                case 241:
                                    if (zContains3) {
                                        break;
                                    } else {
                                        i7 = 49883;
                                    }
                                default:
                                    continue;
                            }
                            i7 = 49852;
                        }
                        JSONObject jSONObject7 = new JSONObject();
                        jSONObject7.put(strM851, str4);
                        jSONObject7.put(strM805, 0);
                        return jSONObject7.toString();
                }
            }
        } catch (Throwable th) {
            int i9 = 50689;
            while (true) {
                i9 ^= 50706;
                switch (i9) {
                    case 19:
                        i9 = 50720;
                        break;
                    case 50:
                        return "";
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0084. Please report as an issue. */
    public String searchContent(String str, boolean z) {
        String strM836 = C0176.m836(f811short, 360, 11, 3157);
        String strM8362 = C0176.m836(f811short, 371, 7, 543);
        String strM851 = C0180.m851(f811short, 378, 8, 1767);
        String strM834 = C0175.m834(f811short, 386, 6, 2612);
        String strM866 = C0183.m866(f811short, 392, 4, 1716);
        try {
            JSONObject jSONObject = new JSONObject();
            String str2 = this.f13q + C0166.m801(f811short, 396, 30, 2294) + str;
            String strM730q = C0152vp.m730q(C0106ZJ.m484FN(str2, m3xC(str2)), this.f11QU);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONObject(strM730q).getJSONArray(strM866);
            int i = 0;
            while (true) {
                int length = jSONArray2.length();
                int i2 = 1616;
                while (true) {
                    i2 ^= 1633;
                    switch (i2) {
                        case 14:
                        case 49:
                            i2 = i < length ? 1709 : 1678;
                        case 204:
                            JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(strM834, jSONObjectOptJSONObject.optString(strM834));
                            jSONObject2.put(strM851, jSONObjectOptJSONObject.optString(strM851));
                            jSONObject2.put(strM8362, jSONObjectOptJSONObject.optString(strM8362));
                            jSONObject2.put(strM836, jSONObjectOptJSONObject.optString(strM836));
                            jSONArray.put(jSONObject2);
                            int i3 = i + 1;
                            int i4 = 1740;
                            while (true) {
                                i4 ^= 1757;
                                switch (i4) {
                                    case 17:
                                        i4 = 1771;
                                        break;
                                    case 54:
                                        break;
                                }
                            }
                            i = i3;
                            break;
                        case 239:
                            break;
                    }
                    jSONObject.put(strM866, jSONArray);
                    return jSONObject.toString();
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }
}
