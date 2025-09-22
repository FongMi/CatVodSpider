package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0165;
import com.github.catvod.parser.C0166;
import com.github.catvod.spider.merge.AbstractC0099V3;
import com.github.catvod.spider.merge.C0106ZJ;
import com.github.catvod.spider.merge.C0152vp;
import com.github.catvod.spider.merge.C0168;
import com.github.catvod.spider.merge.C0169;
import com.github.catvod.spider.merge.C0170;
import com.github.catvod.spider.merge.C0171;
import com.github.catvod.spider.merge.C0172;
import com.github.catvod.spider.merge.C0173;
import com.github.catvod.spider.merge.C0174;
import com.github.catvod.spider.merge.C0175;
import com.github.catvod.spider.merge.C0176;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import okhttp3.Call;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class Qiji extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f852short = {2543, 2539, 2536, 2548, 2548, 2544, 2479, 2483, 2478, 2481, 2484, 2478, 2489, 1373, 1405, 1116, 1030, 1034, 1030, 1017, 957, 932, 952, 953, 916, 2129, 2063, 2071, 2063, 1658, 1588, 1573, 1596, 1659, 1573, 1597, 1573, 3049, 3048, 3048, 2126, 2143, 2143, 2050, 2126, 2143, 2118, 2050, 2137, 2122, 2141, 2118, 2121, 2134, 2050, 2140, 2118, 2120, 2113, 2004, 1989, 1989, 1944, 1984, 2012, 1944, 2008, 2010, 2001, 2000, 567, 562, 572, 563, 559, 611, 613, 627, 612, 571, 631, 625, 627, 632, 610, 2090, 2107, 2107, 2150, 2110, 2104, 2094, 2105, 2150, 2095, 2094, 2109, 2082, 2088, 2094, 2150, 2082, 2095, 855, 838, 838, 795, 855, 838, 863, 795, 832, 851, 836, 863, 848, 847, 795, 834, 863, 859, 851, 2833, 2816, 2816, 2909, 2822, 2837, 2818, 2819, 2841, 2847, 2846, 2909, 2835, 2847, 2836, 2837, 2123, 2138, 2140, 2142, 22022, -26746, 633, 551, 575, 572, 575, 567, 550, 550, 567, 550, 575, 632, 575, 568, 562, 563, 558, 633, 546, 559, 550, 563, 528, 575, 570, 546, 563, 548, 512, 569, 562, 538, 575, 549, 546, 1690, 1685, 1688, 1674, 1674, 1871, 1884, 1867, 1871, 698, 695, 696, 689, 731, 711, 730, 732, 28187, 27819, 1936, 1949, 1940, 1921, 1979, 1933, 1920, 1733, 1753, 1757, 1742, 2926, 2943, 2937, 2939, 2941, 2929, 2923, 2928, 2922, 1902, 1899, 1903, 1899, 1910, 3297, 3322, 3297, 3316, 3321, 1224, 1229, 1239, 1232, 2327, 2377, 2385, 2386, 2385, 2393, 2376, 2376, 2393, 2376, 2385, 2326, 2385, 2390, 2396, 2397, 2368, 2327, 2382, 2391, 2396, 2428, 2397, 2380, 2393, 2385, 2388, 2314, 426, 435, 440, 387, 437, 440, 1907, 1910, 1900, 1899, 1531, 1445, 1469, 1470, 1469, 1461, 1444, 1444, 1461, 1444, 1469, 1530, 1469, 1466, 1456, 1457, 1452, 1531, 1469, 1466, 1469, 1440, 452, 459, 454, 468, 468, 3216, 3278, 3286, 3285, 3286, 3294, 3279, 3279, 3294, 3279, 3286, 3217, 3286, 3281, 3291, 3290, 3271, 3216, 3286, 3281, 3286, 3275, 748, 745, 755, 756, 3000, 2976, 2984, 2982, 2988, 3003, 3092, 3170, 1526, 1999, 2025, 2047, 2024, 1975, 2011, 2045, 2047, 2036, 2030, 1253, 1277, 1269, 1275, 1278, 1277, 3301, 3321, 3321, 3325, 2354, 2400, 2427, 2431, 2417, 2426, 2345, 1572, 1658, 1596, 1649, 533, 530, 524, 2178, 2207, 2267, 1019, 933, 957, 958, 957, 949, 932, 932, 949, 932, 957, 1018, 957, 954, 944, 945, 940, 1019, 930, 955, 944, 900, 949, 934, 935, 945, 1590, 1575, 1588, 1589, 1571, 1561, 1575, 1590, 1583, 2173, 2150, 2146, 2156, 2151, 807, 822, 805, 804, 818, 1432, 1478, 1502, 1501, 1502, 1494, 1479, 1479, 1494, 1479, 1502, 1433, 1502, 1497, 1491, 1490, 1487, 1432, 1476, 1490, 1494, 1477, 1492, 1503, 1531, 1502, 1476, 1475, 2373, 2388, 2386, 2384, 1266, 2474, 2471, 2478, 2491, 2433, 2487, 2490, 2579, 917, 923, 903, 905, 913, 908, 922, 909, 466, 471, 461, 458};

    /* renamed from: q */
    private String f231q = "";

    /* renamed from: xC */
    private String f233xC = C0169.m809(f852short, 0, 13, 2432);

    /* renamed from: QU */
    private String f229QU = "";

    /* renamed from: UJ */
    private String f230UJ = "";

    /* renamed from: u */
    private String f232u = "";

    /* renamed from: Mo */
    private String f228Mo = "";

    public Qiji() {
        int iM807 = C0168.m807();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = iM807 <= 0 ? 1709 : 1678;
                case 204:
                    System.out.println(Integer.decode(C0183.m863("whoEQGModbP0v")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* renamed from: UJ */
    private void m93UJ() {
        String[] strArrSplit = C0152vp.m724Mo(this.f228Mo).split(C0165.m798(f852short, 13, 2, 1281));
        boolean zEndsWith = strArrSplit[0].endsWith(C0175.m834(f852short, 15, 4, 1138));
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = !zEndsWith ? 1709 : 1678;
                case 204:
                    boolean zEndsWith2 = strArrSplit[0].endsWith(C0177.m841(f852short, 19, 5, 983));
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = zEndsWith2 ? 1833 : 1802;
                            case 54:
                            case 471:
                                this.f231q = strArrSplit[0];
                                int i3 = 48767;
                                while (true) {
                                    i3 ^= 48784;
                                    switch (i3) {
                                        case 14:
                                            break;
                                        case 239:
                                            i3 = 48798;
                                            continue;
                                    }
                                }
                                break;
                            case 500:
                                int i4 = 1864;
                                while (true) {
                                    i4 ^= 1881;
                                    switch (i4) {
                                        case 17:
                                            i4 = 48674;
                                            continue;
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 239:
                    break;
            }
        }
        this.f231q = C0106ZJ.m484FN(strArrSplit[0], null).split(C0171.m816(f852short, 24, 1, 926))[0].trim();
        boolean zContains = this.f231q.contains(C0178.m845(f852short, 25, 4, 2175));
        int i5 = 48891;
        while (true) {
            i5 ^= 48908;
            switch (i5) {
                case 22:
                case 53:
                    break;
                case 503:
                    i5 = !zContains ? 49635 : 48953;
                case 32495:
                    this.f231q += C0177.m841(f852short, 29, 8, 1621);
                    break;
            }
        }
        this.f229QU = strArrSplit[1];
        this.f230UJ = strArrSplit[2];
        int length = strArrSplit.length;
        int i6 = 49666;
        while (true) {
            i6 ^= 49683;
            switch (i6) {
                case 17:
                    i6 = length > 3 ? 49759 : 49728;
                case 50:
                case 76:
                    this.f232u = strArrSplit[3];
                    int i7 = 49790;
                    while (true) {
                        i7 ^= 49807;
                        switch (i7) {
                            case 18:
                                break;
                            case 241:
                                i7 = 49821;
                                break;
                        }
                    }
                    break;
                case 83:
                    this.f232u = C0166.m801(f852short, 37, 3, 3032);
                    break;
            }
            return;
        }
    }

    /* renamed from: u */
    private HashMap<String, String> m95u(String str) {
        int i;
        String strM849 = C0179.m849(f852short, 40, 19, 2095);
        HashMap<String, String> map = new HashMap<>();
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        map.put(C0168.m805(f852short, 59, 11, 1973), C0183.m866(f852short, 70, 5, 603));
        map.put(C0180.m851(f852short, 75, 10, 534), str);
        map.put(C0165.m798(f852short, 85, 18, 2123), "");
        map.put(C0176.m836(f852short, 103, 19, 822), strValueOf);
        try {
            map.put(strM849, C0152vp.m720B(strValueOf, this.f229QU, this.f230UJ));
            i = 1616;
        } catch (Exception e) {
            map.put(strM849, "");
        }
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    map.put(C0165.m798(f852short, 122, 16, 2928), this.f232u);
                    return map;
                case 49:
                    i = 1647;
                    break;
            }
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException, NumberFormatException {
        String strM866 = C0183.m866(f852short, 138, 4, 2107);
        String strM841 = C0177.m841(f852short, 142, 2, 1902);
        try {
            boolean zIsEmpty = this.f231q.isEmpty();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = zIsEmpty ? 1709 : 1678;
                    case 204:
                        m93UJ();
                        break;
                    case 239:
                        break;
                }
            }
            int i2 = Integer.parseInt(str2);
            int i3 = 1740;
            while (true) {
                i3 ^= 1757;
                switch (i3) {
                    case 17:
                        i3 = i2 == 0 ? 1833 : 1802;
                    case 54:
                    case 471:
                        break;
                    case 500:
                        i2 = 1;
                        break;
                }
            }
            String str3 = this.f231q + C0183.m866(f852short, 144, 35, 598);
            HashMap map2 = new HashMap();
            map2.put(C0178.m845(f852short, 179, 5, 1785), strM841);
            map2.put(C0174.m828(f852short, 184, 4, 1838), strM841);
            map2.put(C0183.m866(f852short, 188, 4, 726), strM841);
            map2.put(C0177.m841(f852short, 192, 4, 680), C0182.m861(f852short, 196, 2, 2331));
            map2.put(C0165.m798(f852short, 198, 7, 2020), str);
            map2.put(strM866, str2);
            map2.put(C0178.m845(f852short, 205, 4, 1724), strM841);
            JSONArray jSONArray = new JSONArray();
            C0106ZJ.m492i(C0106ZJ.m488QU(), str3, map2, m95u(this.f233xC), new AbstractC0099V3.Qe(this, jSONArray) { // from class: com.github.catvod.spider.Qiji.3

                /* renamed from: short, reason: not valid java name */
                private static final short[] f855short = {891, 866, 873, 850, 895, 872, 864, 876, 895, 870, 894, 2384, 2377, 2370, 2425, 2390, 2383, 2373, 1407, 1382, 1389, 1366, 1383, 1384, 1380, 1388, 2004, 1997, 1990, 2045, 1995, 1990, 1629, 1624, 1613, 1624, 2267, 2252, 2250, 2246, 2244, 2244, 2252, 2247, 2253, 2294, 2245, 2240, 2266, 2269, 3319, 3308, 3317, 3317};

                /* renamed from: QU */
                final Qiji f238QU;

                /* renamed from: xC */
                final JSONArray f239xC;

                {
                    this.f238QU = this;
                    this.f239xC = jSONArray;
                    int iM818 = C0171.m818();
                    int i4 = 1616;
                    while (true) {
                        i4 ^= 1633;
                        switch (i4) {
                            case 14:
                            case 49:
                                i4 = iM818 >= 0 ? 1709 : 1678;
                            case 204:
                                System.out.println(Long.parseLong(C0170.m815("0bk867nUvop")));
                                break;
                            case 239:
                                break;
                        }
                        return;
                    }
                }

                @Override // com.github.catvod.spider.merge.AbstractC0099V3
                public void onFailure(Call call, Exception exc) {
                }

                /* JADX WARN: Failed to find 'out' block for switch in B:22:0x00ca. Please report as an issue. */
                /* JADX WARN: Failed to find 'out' block for switch in B:6:0x006d. Please report as an issue. */
                @Override // com.github.catvod.spider.merge.AbstractC0099V3
                public String onResponse(String str4) throws JSONException {
                    JSONArray jSONArray2;
                    int i4 = 0;
                    String strM8412 = C0177.m841(f855short, 0, 11, 781);
                    String strM805 = C0168.m805(f855short, 11, 7, 2342);
                    String strM8052 = C0168.m805(f855short, 18, 8, 1289);
                    String strM851 = C0180.m851(f855short, 26, 6, 1954);
                    try {
                        jSONArray2 = new JSONObject(C0152vp.m728W(new JSONObject(str4).optString(C0171.m816(f855short, 32, 4, 1593)), this.f238QU.f229QU, this.f238QU.f230UJ)).getJSONArray(C0182.m861(f855short, 36, 14, 2217));
                    } catch (JSONException e) {
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
                    }
                    while (true) {
                        int i6 = i4;
                        int length = jSONArray2.length();
                        int i7 = 1616;
                        while (true) {
                            i7 ^= 1633;
                            switch (i7) {
                                case 14:
                                case 49:
                                    i7 = i6 < length ? 1709 : 1678;
                                case 204:
                                    JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i6);
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put(strM851, jSONObjectOptJSONObject.optString(strM851));
                                    jSONObject.put(strM8052, jSONObjectOptJSONObject.optString(strM8052));
                                    jSONObject.put(strM805, jSONObjectOptJSONObject.optString(strM805));
                                    String strOptString = jSONObjectOptJSONObject.optString(strM8412);
                                    boolean zEquals = strOptString.equals(C0172.m820(f855short, 50, 4, 3225));
                                    int i8 = 1740;
                                    while (true) {
                                        i8 ^= 1757;
                                        switch (i8) {
                                            case 17:
                                                i8 = zEquals ? 1833 : 1802;
                                            case 54:
                                            case 471:
                                                break;
                                            case 500:
                                                strOptString = "";
                                                break;
                                        }
                                    }
                                    jSONObject.put(strM8412, strOptString);
                                    this.f239xC.put(jSONObject);
                                    i4 = i6 + 1;
                                    int i9 = 1864;
                                    while (true) {
                                        i9 ^= 1881;
                                        switch (i9) {
                                            case 17:
                                                i9 = 48674;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                                case 239:
                                    break;
                            }
                        }
                        return str4;
                    }
                }
            });
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(strM866, i2);
            int length = jSONArray.length();
            int i4 = 1864;
            while (true) {
                i4 ^= 1881;
                switch (i4) {
                    case 17:
                        if (length != 12) {
                            break;
                        } else {
                            i4 = 48736;
                        }
                    case 47384:
                        break;
                    case 47417:
                        i2++;
                        break;
                    case 47483:
                        break;
                    default:
                        continue;
                }
                i4 = 48705;
            }
            jSONObject.put(C0170.m814(f852short, 209, 9, 2846), i2);
            jSONObject.put(C0168.m805(f852short, 218, 5, 1794), 12);
            jSONObject.put(C0178.m845(f852short, 223, 5, 3221), Integer.MAX_VALUE);
            jSONObject.put(C0172.m820(f852short, 228, 4, 1188), jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String detailContent(List<String> list) throws JSONException {
        try {
            boolean zIsEmpty = this.f231q.isEmpty();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (!zIsEmpty) {
                            break;
                        } else {
                            i = 1709;
                        }
                    case 204:
                        m93UJ();
                        break;
                    case 239:
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
            Init.m46lj();
            String str = this.f231q + C0165.m798(f852short, 232, 28, 2360);
            HashMap map = new HashMap();
            map.put(C0166.m801(f852short, 260, 6, 476), list.get(0));
            JSONObject jSONObject = new JSONObject();
            C0106ZJ.m492i(C0106ZJ.m488QU(), str, map, m95u(this.f233xC), new AbstractC0099V3.Qe(this, jSONObject, new ArrayList(), new ArrayList()) { // from class: com.github.catvod.spider.Qiji.4

                /* renamed from: short, reason: not valid java name */
                private static final short[] f856short = {2160, 2155, 2159, 2145, 2154, 1082, 1082, 1082, 1195, 1202, 1209, 1154, 1214, 1202, 1203, 1193, 1208, 1203, 1193, 803, 826, 817, 778, 817, 828, 807, 816, 822, 801, 826, 807, 1771, 1778, 1785, 1730, 1788, 1790, 1769, 1778, 1775, 2435, 2456, 2433, 2433, 3312, 3305, 3298, 3289, 3303, 3316, 3299, 3303, 3143, 3166, 3157, 3182, 3144, 3156, 3152, 3139, 1486, 1495, 1500, 1511, 1480, 1489, 1499, 3155, 3146, 3137, 3194, 3147, 3140, 3144, 3136, 1465, 1440, 1451, 1424, 1446, 1451, 771, 2322, 3259, 3239, 3242, 3250, 3246, 3257, 3220, 3234, 3237, 3245, 3236, 1254, 1251, 1270, 1251, 2073, 2048, 2059, 2017, 2028, 2021, 2032, 1994, 2043, 2036, 2040, 2032, 2357, 2348, 2343, 2332, 2336, 2351, 2338, 2352, 2352, 3176, 3185, 3194, 3137, 3180, 3195, 3187, 3199, 3180, 3189, 3181, 3134, 2352, 2345, 2338, 2329, 2356, 2339, 2347, 2343, 2356, 2349, 2357, 25502, 27487, 23321, 21366, 22930, 22967, -31293, -2058, -31987, 23045, 18160, 22441, 23341, -28051, -2053, -2053, 1918, 1895, 1900, 1879, 1912, 1892, 1897, 1905, 1879, 1892, 1889, 1915, 1916, 2749, 2746, 2724, 2747, 1729, 1754, 1757, 1733, 2487, 2470, 2485, 2484, 2466, 1045, 1037, 1029, 1035, 1025, 1046, 956, 954, 940, 955, 918, 936, 942, 940, 935, 957, 953, 929, 937, 935, 1415, 1439, 1431, 1433, 1436, 1439, 2870, 2873, 2869, 2877, 750, 745, 759, 925, 2555, 2530, 2537, 2514, 2557, 2529, 2540, 2548, 2514, 2539, 2559, 2530, 2528, 2037, 2028, 2023, 2012, 2035, 2031, 2018, 2042, 2012, 2038, 2033, 2031};

                /* renamed from: QU */
                final ArrayList f240QU;

                /* renamed from: UJ */
                final ArrayList f241UJ;

                /* renamed from: u */
                final Qiji f242u;

                /* renamed from: xC */
                final JSONObject f243xC;

                {
                    this.f242u = this;
                    this.f243xC = jSONObject;
                    this.f240QU = arrayList;
                    this.f241UJ = arrayList;
                    int iM850 = C0179.m850();
                    int i2 = 1616;
                    while (true) {
                        i2 ^= 1633;
                        switch (i2) {
                            case 14:
                            case 49:
                                i2 = iM850 <= 0 ? 1709 : 1678;
                            case 204:
                                System.out.println(Double.decode(C0179.m847("fq")));
                                break;
                            case 239:
                                break;
                        }
                        return;
                    }
                }

                @Override // com.github.catvod.spider.merge.AbstractC0099V3
                public void onFailure(Call call, Exception exc) {
                }

                /* JADX WARN: Failed to find 'out' block for switch in B:28:0x023d. Please report as an issue. */
                /* JADX WARN: Failed to find 'out' block for switch in B:60:0x032b. Please report as an issue. */
                /* JADX WARN: Failed to find 'out' block for switch in B:75:0x03c9. Please report as an issue. */
                @Override // com.github.catvod.spider.merge.AbstractC0099V3
                public String onResponse(String str2) throws JSONException {
                    JSONArray jSONArray;
                    int i2;
                    String str3;
                    String strM861 = C0182.m861(f856short, 0, 5, 2052);
                    String strM809 = C0169.m809(f856short, 5, 3, 1054);
                    String strM8092 = C0169.m809(f856short, 8, 11, 1245);
                    String strM856 = C0181.m856(f856short, 19, 12, 853);
                    String strM834 = C0175.m834(f856short, 31, 9, 1693);
                    String strM841 = C0177.m841(f856short, 40, 4, 2541);
                    String strM8093 = C0169.m809(f856short, 44, 8, 3206);
                    String strM836 = C0176.m836(f856short, 52, 8, 3121);
                    String strM816 = C0171.m816(f856short, 60, 7, 1464);
                    String strM845 = C0178.m845(f856short, 67, 8, 3109);
                    String strM8562 = C0181.m856(f856short, 75, 6, 1487);
                    String strM8342 = C0175.m834(f856short, 81, 1, 809);
                    String strM8412 = C0177.m841(f856short, 82, 1, 2358);
                    String strM8413 = C0177.m841(f856short, 83, 11, 3275);
                    try {
                        JSONObject jSONObject2 = new JSONObject(C0152vp.m728W(new JSONObject(str2).optString(C0171.m816(f856short, 94, 4, 1154)), this.f242u.f229QU, this.f242u.f230UJ));
                        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(C0174.m828(f856short, 98, 3, 2159));
                        this.f243xC.put(strM8562, jSONObjectOptJSONObject.optString(strM8562));
                        this.f243xC.put(strM845, jSONObjectOptJSONObject.optString(strM845));
                        this.f243xC.put(strM816, jSONObjectOptJSONObject.optString(strM816));
                        this.f243xC.put(C0171.m816(f856short, 101, 9, 1941), jSONObjectOptJSONObject.optString(C0169.m809(f856short, 110, 9, 2371)));
                        this.f243xC.put(strM836, jSONObjectOptJSONObject.optString(strM836));
                        this.f243xC.put(strM8093, jSONObjectOptJSONObject.optString(strM8093));
                        String strOptString = jSONObjectOptJSONObject.optString(C0182.m861(f856short, 119, 12, 3102));
                        boolean zEquals = strOptString.equals(strM841);
                        String str4 = "";
                        int i3 = 1616;
                        while (true) {
                            i3 ^= 1633;
                            switch (i3) {
                                case 14:
                                case 49:
                                    i3 = zEquals ? 1709 : 1678;
                                case 204:
                                    strOptString = "";
                                    break;
                                case 239:
                                    break;
                            }
                        }
                        this.f243xC.put(C0168.m805(f856short, 131, 11, 2374), strOptString);
                        this.f243xC.put(strM834, jSONObjectOptJSONObject.optString(strM834));
                        this.f243xC.put(strM856, jSONObjectOptJSONObject.optString(strM856));
                        String strOptString2 = jSONObjectOptJSONObject.optString(strM8092);
                        boolean zEquals2 = strOptString2.equals(strM841);
                        int i4 = 1740;
                        while (true) {
                            i4 ^= 1757;
                            switch (i4) {
                                case 17:
                                    i4 = zEquals2 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    str4 = strOptString2;
                                    break;
                                case 500:
                                    int i5 = 1864;
                                    while (true) {
                                        i5 ^= 1881;
                                        switch (i5) {
                                            case 17:
                                                i5 = 48674;
                                                continue;
                                            case 47483:
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                            }
                        }
                        this.f243xC.put(strM8092, C0170.m814(f856short, 142, 16, 2298) + str4);
                        jSONArray = jSONObject2.getJSONArray(C0166.m801(f856short, 158, 13, 1800));
                        i2 = 0;
                    } catch (JSONException e) {
                        int i6 = 51712;
                        while (true) {
                            i6 ^= 51729;
                            switch (i6) {
                                case 17:
                                    i6 = 51743;
                                    break;
                            }
                        }
                    }
                    while (true) {
                        int length = jSONArray.length();
                        int i7 = 48767;
                        while (true) {
                            i7 ^= 48784;
                            switch (i7) {
                                case 14:
                                case 45:
                                    break;
                                case 76:
                                    JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i2);
                                    JSONArray jSONArray2 = jSONObjectOptJSONObject2.getJSONArray(C0180.m851(f856short, 171, 4, 2760));
                                    ArrayList arrayList = new ArrayList();
                                    String strOptString3 = jSONObjectOptJSONObject2.optJSONObject(strM8413).optString(C0178.m845(f856short, 175, 4, 1714));
                                    String strOptString4 = jSONObjectOptJSONObject2.optJSONObject(strM8413).optString(C0166.m801(f856short, 179, 5, 2503));
                                    boolean zContains = strOptString4.contains(strM8412);
                                    int i8 = 48891;
                                    while (true) {
                                        i8 ^= 48908;
                                        switch (i8) {
                                            case 22:
                                            case 53:
                                                break;
                                            case 503:
                                                i8 = zContains ? 49635 : 48953;
                                            case 32495:
                                                strOptString4 = strOptString4.replace(strM8412, C0177.m841(f856short, 184, 6, 1124));
                                                break;
                                        }
                                    }
                                    String strOptString5 = jSONObjectOptJSONObject2.optJSONObject(strM8413).optString(C0171.m816(f856short, 190, 10, 969));
                                    boolean zIsEmpty2 = strOptString5.isEmpty();
                                    int i9 = 49666;
                                    while (true) {
                                        i9 ^= 49683;
                                        switch (i9) {
                                            case 17:
                                                i9 = zIsEmpty2 ? 49759 : 49728;
                                            case 50:
                                            case 76:
                                                str3 = this.f242u.f233xC;
                                                break;
                                            case 83:
                                                str3 = strOptString5;
                                                break;
                                        }
                                    }
                                    boolean zIsEmpty3 = strOptString4.isEmpty();
                                    int i10 = 49790;
                                    while (true) {
                                        i10 ^= 49807;
                                        switch (i10) {
                                            case 18:
                                            case 51:
                                                break;
                                            case 84:
                                                strOptString4 = C0177.m841(f856short, 200, 4, 968);
                                                break;
                                            case 241:
                                                i10 = zIsEmpty3 ? 49883 : 49852;
                                        }
                                    }
                                    int i11 = 0;
                                    while (true) {
                                        int length2 = jSONArray2.length();
                                        int i12 = 49914;
                                        while (true) {
                                            i12 ^= 49931;
                                            switch (i12) {
                                                case 497:
                                                    i12 = i11 < length2 ? 50658 : 50627;
                                                case 1711:
                                                case 1736:
                                                    break;
                                                case 1769:
                                                    JSONObject jSONObjectOptJSONObject3 = jSONArray2.optJSONObject(i11);
                                                    String strOptString6 = jSONObjectOptJSONObject3.optString(strM861);
                                                    boolean zIsEmpty4 = jSONObjectOptJSONObject3.optString(strM861).isEmpty();
                                                    int i13 = 50689;
                                                    while (true) {
                                                        i13 ^= 50706;
                                                        switch (i13) {
                                                            case 19:
                                                                i13 = zIsEmpty4 ? 50782 : 50751;
                                                            case 45:
                                                                break;
                                                            case 50:
                                                            case 76:
                                                                strOptString6 = C0172.m820(f856short, 204, 6, 1526);
                                                                break;
                                                        }
                                                    }
                                                    arrayList.add(jSONObjectOptJSONObject3.optString(C0183.m866(f856short, 210, 4, 2904)) + strM8412 + jSONObjectOptJSONObject3.optString(C0169.m809(f856short, 214, 3, 667)) + strM8342 + strOptString4 + strM8342 + strOptString6 + strM8342 + str3);
                                                    int i14 = i11 + 1;
                                                    int i15 = 50813;
                                                    while (true) {
                                                        i15 ^= 50830;
                                                        switch (i15) {
                                                            case 18:
                                                                break;
                                                            case 243:
                                                                i15 = 50844;
                                                        }
                                                    }
                                                    i11 = i14;
                                                    break;
                                            }
                                            this.f240QU.add(strOptString3);
                                            this.f241UJ.add(TextUtils.join(C0181.m856(f856short, 217, 1, 958), arrayList));
                                            int i16 = i2 + 1;
                                            int i17 = 51588;
                                            while (true) {
                                                i17 ^= 51605;
                                                switch (i17) {
                                                    case 17:
                                                        i17 = 51619;
                                                        break;
                                                    case 54:
                                                        break;
                                                }
                                            }
                                            i2 = i16;
                                        }
                                    }
                                    break;
                                case 239:
                                    i7 = i2 < length ? 48860 : 48829;
                            }
                            String strJoin = TextUtils.join(strM809, this.f240QU);
                            String strJoin2 = TextUtils.join(strM809, this.f241UJ);
                            this.f243xC.put(C0177.m841(f856short, 218, 13, 2445), strJoin);
                            this.f243xC.put(C0175.m834(f856short, 231, 12, 1923), strJoin2);
                        }
                        return str2;
                    }
                }
            });
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            jSONObject2.put(C0180.m851(f852short, 266, 4, 1823), jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String homeContent(boolean z) throws JSONException {
        try {
            boolean zIsEmpty = this.f231q.isEmpty();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (!zIsEmpty) {
                            break;
                        } else {
                            i = 1709;
                        }
                    case 204:
                        m93UJ();
                        break;
                    case 239:
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
            String str = this.f231q + C0177.m841(f852short, 270, 22, 1492);
            System.out.println(str);
            HashMap map = new HashMap();
            JSONArray jSONArray = new JSONArray();
            C0106ZJ.m492i(C0106ZJ.m488QU(), str, map, m95u(this.f233xC), new AbstractC0099V3.Qe(this, jSONArray) { // from class: com.github.catvod.spider.Qiji.1

                /* renamed from: short, reason: not valid java name */
                private static final short[] f853short = {1538, 1551, 1542, 1555, 1577, 1567, 1554, 2560, 2573, 2564, 2577, 2603, 2586, 2581, 2585, 2577, 2439, 2434, 2455, 2434, 2432, 2445, 2436, 2449, 2475, 2456, 2461, 2439, 2432};

                /* renamed from: QU */
                final Qiji f234QU;

                /* renamed from: xC */
                final JSONArray f235xC;

                {
                    this.f234QU = this;
                    this.f235xC = jSONArray;
                    int iM830 = C0174.m830();
                    int i2 = 1616;
                    while (true) {
                        i2 ^= 1633;
                        switch (i2) {
                            case 14:
                            case 49:
                                i2 = iM830 <= 0 ? 1709 : 1678;
                            case 204:
                                System.out.println(Long.parseLong(C0175.m835("Vxv5OeC8k7wi06EqGi2wbUJl9c5A5")));
                                break;
                            case 239:
                                break;
                        }
                        return;
                    }
                }

                @Override // com.github.catvod.spider.merge.AbstractC0099V3
                public void onFailure(Call call, Exception exc) {
                }

                /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0056. Please report as an issue. */
                @Override // com.github.catvod.spider.merge.AbstractC0099V3
                public String onResponse(String str2) throws JSONException {
                    JSONArray jSONArray2;
                    int i2 = 0;
                    String strM841 = C0177.m841(f853short, 0, 7, 1654);
                    String strM828 = C0174.m828(f853short, 7, 9, 2676);
                    try {
                        jSONArray2 = new JSONObject(C0152vp.m728W(new JSONObject(str2).optString(C0169.m809(f853short, 16, 4, 2531)), this.f234QU.f229QU, this.f234QU.f230UJ)).getJSONArray(C0180.m851(f853short, 20, 9, 2548));
                    } catch (JSONException e) {
                        int i3 = 1864;
                        while (true) {
                            i3 ^= 1881;
                            switch (i3) {
                                case 17:
                                    i3 = 48674;
                                    break;
                                case 47483:
                                    break;
                            }
                        }
                    }
                    while (true) {
                        int i4 = i2;
                        int length = jSONArray2.length();
                        int i5 = 1616;
                        while (true) {
                            i5 ^= 1633;
                            switch (i5) {
                                case 14:
                                case 49:
                                    i5 = i4 < length ? 1709 : 1678;
                                case 204:
                                    JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i4);
                                    String strOptString = jSONObjectOptJSONObject.optString(strM828);
                                    String strOptString2 = jSONObjectOptJSONObject.optString(strM841);
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put(strM841, strOptString2);
                                    jSONObject.put(strM828, strOptString);
                                    this.f235xC.put(jSONObject);
                                    i2 = i4 + 1;
                                    int i6 = 1740;
                                    while (true) {
                                        i6 ^= 1757;
                                        switch (i6) {
                                            case 17:
                                                i6 = 1771;
                                                break;
                                            case 54:
                                                break;
                                        }
                                    }
                                    break;
                                case 239:
                                    break;
                            }
                        }
                        return str2;
                    }
                }
            });
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0172.m820(f852short, 292, 5, 423), jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String homeVideoContent() throws JSONException {
        try {
            boolean zIsEmpty = this.f231q.isEmpty();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (!zIsEmpty) {
                            break;
                        } else {
                            i = 1709;
                        }
                    case 204:
                        m93UJ();
                        break;
                    case 239:
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
            JSONArray jSONArray = new JSONArray();
            C0106ZJ.m492i(C0106ZJ.m488QU(), this.f231q + C0177.m841(f852short, 297, 22, 3263), new HashMap(), m95u(this.f233xC), new AbstractC0099V3.Qe(this, jSONArray) { // from class: com.github.catvod.spider.Qiji.2

                /* renamed from: short, reason: not valid java name */
                private static final short[] f854short = {2561, 2584, 2579, 2600, 2565, 2578, 2586, 2582, 2565, 2588, 2564, 2246, 2271, 2260, 2287, 2240, 2265, 2259, 2354, 2347, 2336, 2331, 2346, 2341, 2345, 2337, 1503, 1478, 1485, 1526, 1472, 1485, 1564, 1561, 1548, 1561, 453, 454, 457, 457, 450, 469, 504, 459, 462, 468, 467};

                /* renamed from: QU */
                final Qiji f236QU;

                /* renamed from: xC */
                final JSONArray f237xC;

                {
                    this.f236QU = this;
                    this.f237xC = jSONArray;
                    int iM788 = C0170.m788();
                    int i2 = 1616;
                    while (true) {
                        i2 ^= 1633;
                        switch (i2) {
                            case 14:
                            case 49:
                                i2 = iM788 <= 0 ? 1709 : 1678;
                            case 204:
                                System.out.println(Integer.parseInt(C0182.m862("8LN0goybj44jB6lQG0XQer")));
                                break;
                            case 239:
                                break;
                        }
                        return;
                    }
                }

                @Override // com.github.catvod.spider.merge.AbstractC0099V3
                public void onFailure(Call call, Exception exc) {
                    int iM853 = C0180.m853();
                    int i2 = 1616;
                    while (true) {
                        i2 ^= 1633;
                        switch (i2) {
                            case 14:
                            case 49:
                                i2 = iM853 <= 0 ? 1709 : 1678;
                            case 204:
                                System.out.println(Double.valueOf(C0177.m839("6HhK2e9Fkdd0d")));
                                break;
                            case 239:
                                break;
                        }
                        return;
                    }
                }

                /* JADX WARN: Failed to find 'out' block for switch in B:6:0x006d. Please report as an issue. */
                @Override // com.github.catvod.spider.merge.AbstractC0099V3
                public String onResponse(String str) throws JSONException {
                    JSONArray jSONArray2;
                    int i2 = 0;
                    String strM861 = C0182.m861(f854short, 0, 11, 2679);
                    String strM845 = C0178.m845(f854short, 11, 7, 2224);
                    String strM809 = C0169.m809(f854short, 18, 8, 2372);
                    String strM851 = C0180.m851(f854short, 26, 6, 1449);
                    try {
                        jSONArray2 = new JSONObject(C0152vp.m728W(new JSONObject(str).optString(C0175.m834(f854short, 32, 4, 1656)), this.f236QU.f229QU, this.f236QU.f230UJ)).getJSONArray(C0180.m851(f854short, 36, 11, 423));
                    } catch (JSONException e) {
                        int i3 = 1864;
                        while (true) {
                            i3 ^= 1881;
                            switch (i3) {
                                case 17:
                                    i3 = 48674;
                                    break;
                                case 47483:
                                    break;
                            }
                        }
                    }
                    while (true) {
                        int i4 = i2;
                        int length = jSONArray2.length();
                        int i5 = 1616;
                        while (true) {
                            i5 ^= 1633;
                            switch (i5) {
                                case 14:
                                case 49:
                                    i5 = i4 < length ? 1709 : 1678;
                                case 204:
                                    JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i4);
                                    String strOptString = jSONObjectOptJSONObject.optString(strM851);
                                    String strOptString2 = jSONObjectOptJSONObject.optString(strM809);
                                    String strOptString3 = jSONObjectOptJSONObject.optString(strM845);
                                    String strOptString4 = jSONObjectOptJSONObject.optString(strM861);
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put(strM851, strOptString);
                                    jSONObject.put(strM809, strOptString2);
                                    jSONObject.put(strM845, strOptString3);
                                    jSONObject.put(strM861, strOptString4);
                                    this.f237xC.put(jSONObject);
                                    i2 = i4 + 1;
                                    int i6 = 1740;
                                    while (true) {
                                        i6 ^= 1757;
                                        switch (i6) {
                                            case 17:
                                                i6 = 1771;
                                                break;
                                            case 54:
                                                break;
                                        }
                                    }
                                    break;
                                case 239:
                                    break;
                            }
                        }
                        return str;
                    }
                }
            });
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0168.m805(f852short, 319, 4, 640), jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context);
        this.f228Mo = str;
        int iM830 = C0174.m830();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = iM830 <= 0 ? 1709 : 1678;
                case 204:
                    System.out.println(Long.decode(C0170.m815("hfuaqlY4eTDogKOe0oC")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public String playerContent(String str, String str2, List<String> list) throws JSONException {
        String str3;
        String str4;
        String strM851 = C0180.m851(f852short, 323, 6, 3017);
        try {
            String[] strArrSplit = str2.split(C0175.m834(f852short, 329, 2, 3144));
            String strReplace = strArrSplit[1];
            boolean zContains = strReplace.contains(strM851);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = zContains ? 1709 : 1678;
                    case 204:
                        strReplace = strReplace.replace(strM851, C0181.m856(f852short, 331, 1, 1490));
                        break;
                    case 239:
                        break;
                }
            }
            String str5 = strArrSplit[0];
            String str6 = strArrSplit[2];
            String str7 = strArrSplit[3];
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0171.m816(f852short, 332, 10, 1946), str7);
            boolean zContains2 = str6.contains(C0169.m809(f852short, 342, 6, 1172));
            int i2 = 1740;
            while (true) {
                i2 ^= 1757;
                switch (i2) {
                    case 17:
                        i2 = zContains2 ? 1833 : 1802;
                    case 54:
                    case 471:
                        str3 = str6;
                        break;
                    case 500:
                        str3 = "";
                        break;
                }
            }
            boolean zContains3 = strReplace.contains(C0183.m866(f852short, 348, 4, 3213));
            int i3 = 1864;
            while (true) {
                i3 ^= 1881;
                switch (i3) {
                    case 17:
                        if (!zContains3) {
                            break;
                        } else {
                            i3 = 48736;
                        }
                    case 47384:
                        boolean zContains4 = str5.contains(C0165.m798(f852short, 359, 4, 1609));
                        String strM816 = C0171.m816(f852short, 363, 3, 608);
                        int i4 = 49666;
                        while (true) {
                            i4 ^= 49683;
                            switch (i4) {
                                case 17:
                                    i4 = !zContains4 ? 49759 : 49728;
                                case 50:
                                case 76:
                                    boolean zContains5 = str5.contains(C0170.m814(f852short, 366, 3, 2287));
                                    int i5 = 49790;
                                    while (true) {
                                        i5 ^= 49807;
                                        switch (i5) {
                                            case 18:
                                            case 51:
                                                String str8 = this.f231q + C0172.m820(f852short, 369, 26, 980);
                                                HashMap map = new HashMap();
                                                map.put(C0181.m856(f852short, 395, 9, 1606), strReplace);
                                                map.put(strM816, C0152vp.m720B(str5, this.f229QU, this.f230UJ));
                                                map.put(C0178.m845(f852short, 404, 5, 2057), str3);
                                                JSONObject jSONObject2 = new JSONObject();
                                                C0106ZJ.m492i(C0106ZJ.m488QU(), str8, map, m95u(str7), new AbstractC0099V3.Qe(this, jSONObject2, str7, jSONObject) { // from class: com.github.catvod.spider.Qiji.6

                                                    /* renamed from: short, reason: not valid java name */
                                                    private static final short[] f858short = {2831, 2824, 2838, 562, 567, 546, 567, 2322, 2315, 2327, 2326, 3001, 2984, 3003, 3002, 2988, 2288, 2301, 2297, 2300, 2301, 2282};

                                                    /* renamed from: QU */
                                                    final String f250QU;

                                                    /* renamed from: UJ */
                                                    final JSONObject f251UJ;

                                                    /* renamed from: u */
                                                    final Qiji f252u;

                                                    /* renamed from: xC */
                                                    final JSONObject f253xC;

                                                    {
                                                        this.f252u = this;
                                                        this.f253xC = jSONObject2;
                                                        this.f250QU = str7;
                                                        this.f251UJ = jSONObject;
                                                        int iM812 = C0169.m812();
                                                        int i6 = 1616;
                                                        while (true) {
                                                            i6 ^= 1633;
                                                            switch (i6) {
                                                                case 14:
                                                                case 49:
                                                                    i6 = iM812 >= 0 ? 1709 : 1678;
                                                                case 204:
                                                                    System.out.println(C0169.m810("X4ZWAfHpdpzDoRnhhHUCJiP"));
                                                                    break;
                                                                case 239:
                                                                    break;
                                                            }
                                                            return;
                                                        }
                                                    }

                                                    @Override // com.github.catvod.spider.merge.AbstractC0099V3
                                                    public void onFailure(Call call, Exception exc) {
                                                    }

                                                    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x006f. Please report as an issue. */
                                                    @Override // com.github.catvod.spider.merge.AbstractC0099V3
                                                    public String onResponse(String str9) throws JSONException {
                                                        String strM828 = C0174.m828(f858short, 0, 3, 2938);
                                                        try {
                                                            this.f253xC.put(strM828, new JSONObject(new JSONObject(C0152vp.m728W(new JSONObject(str9).optString(C0175.m834(f858short, 3, 4, 598)), this.f252u.f229QU, this.f252u.f230UJ)).optString(C0175.m834(f858short, 7, 4, 2424))).optString(strM828));
                                                            this.f253xC.put(C0183.m866(f858short, 11, 5, 3017), 0);
                                                            boolean zEquals = this.f250QU.equals(this.f252u.f233xC);
                                                            int i6 = 1616;
                                                            while (true) {
                                                                i6 ^= 1633;
                                                                switch (i6) {
                                                                    case 14:
                                                                    case 49:
                                                                        i6 = !zEquals ? 1709 : 1678;
                                                                    case 204:
                                                                        this.f253xC.put(C0169.m809(f858short, 16, 6, 2200), this.f251UJ.toString());
                                                                        break;
                                                                    case 239:
                                                                        break;
                                                                }
                                                            }
                                                        } catch (JSONException e) {
                                                            int i7 = 1740;
                                                            while (true) {
                                                                i7 ^= 1757;
                                                                switch (i7) {
                                                                    case 17:
                                                                        i7 = 1771;
                                                                        break;
                                                                    case 54:
                                                                        break;
                                                                }
                                                            }
                                                        }
                                                        return str9;
                                                    }
                                                });
                                                return jSONObject2.toString();
                                            case 84:
                                                int i6 = 49914;
                                                while (true) {
                                                    i6 ^= 49931;
                                                    switch (i6) {
                                                        case 497:
                                                            i6 = 50596;
                                                            continue;
                                                        case 1711:
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                }
                                            case 241:
                                                i5 = zContains5 ? 49883 : 49852;
                                        }
                                    }
                                    break;
                                case 83:
                                    break;
                            }
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(strM816, str5);
                        jSONObject3.put(C0176.m836(f852short, 409, 5, 855), 0);
                        return jSONObject3.toString();
                    case 47417:
                        boolean zIsEmpty = str3.isEmpty();
                        int i7 = 48767;
                        while (true) {
                            i7 ^= 48784;
                            switch (i7) {
                                case 14:
                                    break;
                                case 45:
                                    str4 = strReplace + str5;
                                    break;
                                case 76:
                                    String str9 = strReplace + str5 + C0165.m798(f852short, 352, 7, 2324) + str3;
                                    int i8 = 48891;
                                    while (true) {
                                        i8 ^= 48908;
                                        switch (i8) {
                                            case 22:
                                                str4 = str9;
                                                break;
                                            case 503:
                                                i8 = 48922;
                                                break;
                                        }
                                    }
                                    break;
                                case 239:
                                    if (zIsEmpty) {
                                        break;
                                    } else {
                                        i7 = 48860;
                                    }
                                default:
                                    continue;
                            }
                            i7 = 48829;
                        }
                        JSONObject jSONObject4 = new JSONObject();
                        C0106ZJ.m492i(C0106ZJ.m488QU(), str4, new HashMap(), m95u(str7), new AbstractC0099V3.Qe(this, jSONObject4, strReplace, str5, str7, jSONObject) { // from class: com.github.catvod.spider.Qiji.5

                            /* renamed from: short, reason: not valid java name */
                            private static final short[] f857short = {2103, 2108, 2096, 2087, 2090, 2083, 2102, 2131, 2075, 2055, 2078, 2079, 1820, 1809, 1813, 1808, 1809, 1798, 1826, 1843, 1824, 1825, 1847, 3051, 3052, 3058, 1130, 1135, 1146, 1135};

                            /* renamed from: Mo */
                            final JSONObject f244Mo;

                            /* renamed from: QU */
                            final String f245QU;

                            /* renamed from: UJ */
                            final String f246UJ;

                            /* renamed from: i */
                            final Qiji f247i;

                            /* renamed from: u */
                            final String f248u;

                            /* renamed from: xC */
                            final JSONObject f249xC;

                            {
                                this.f247i = this;
                                this.f249xC = jSONObject4;
                                this.f245QU = strReplace;
                                this.f246UJ = str5;
                                this.f248u = str7;
                                this.f244Mo = jSONObject;
                                int iM818 = C0171.m818();
                                int i9 = 1616;
                                while (true) {
                                    i9 ^= 1633;
                                    switch (i9) {
                                        case 14:
                                        case 49:
                                            i9 = iM818 >= 0 ? 1709 : 1678;
                                        case 204:
                                            System.out.println(Integer.decode(C0178.m846("YvDQvbbKjq")));
                                            break;
                                        case 239:
                                            break;
                                    }
                                    return;
                                }
                            }

                            @Override // com.github.catvod.spider.merge.AbstractC0099V3
                            public void onFailure(Call call, Exception exc) {
                                int iM844 = C0178.m844();
                                int i9 = 1616;
                                while (true) {
                                    i9 ^= 1633;
                                    switch (i9) {
                                        case 14:
                                        case 49:
                                            i9 = iM844 >= 0 ? 1709 : 1678;
                                        case 204:
                                            System.out.println(Integer.valueOf(C0165.m797("EKjZCDKDf96QKlklTm")));
                                            break;
                                        case 239:
                                            break;
                                    }
                                    return;
                                }
                            }

                            /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0073. Please report as an issue. */
                            /* JADX WARN: Failed to find 'out' block for switch in B:32:0x00d1. Please report as an issue. */
                            /* JADX WARN: Failed to find 'out' block for switch in B:44:0x012a. Please report as an issue. */
                            /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0039. Please report as an issue. */
                            /* JADX WARN: Removed duplicated region for block: B:121:0x0150 A[SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:122:0x0143 A[SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:124:0x0148 A[SYNTHETIC] */
                            @Override // com.github.catvod.spider.merge.AbstractC0099V3
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public java.lang.String onResponse(java.lang.String r9) throws org.json.JSONException {
                                /*
                                    Method dump skipped, instructions count: 460
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Qiji.C00415.onResponse(java.lang.String):java.lang.String");
                            }
                        });
                        return jSONObject4.toString();
                    case 47483:
                        break;
                    default:
                        continue;
                }
                i3 = 48705;
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    public String searchContent(String str, boolean z) throws JSONException {
        try {
            boolean zIsEmpty = this.f231q.isEmpty();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = zIsEmpty ? 1709 : 1678;
                    case 204:
                        m93UJ();
                        break;
                    case 239:
                        break;
                }
            }
            JSONArray jSONArray = new JSONArray();
            try {
                String str2 = this.f231q + C0170.m814(f852short, 414, 28, 1463);
                System.out.println(str2);
                HashMap map = new HashMap();
                map.put(C0174.m828(f852short, 442, 4, 2357), C0181.m856(f852short, 446, 1, 1219));
                map.put(C0169.m809(f852short, 447, 7, 2526), C0169.m809(f852short, 454, 1, 2595));
                map.put(C0179.m849(f852short, 455, 8, 1022), str);
                C0106ZJ.m492i(C0106ZJ.m488QU(), str2, map, m95u(this.f233xC), new AbstractC0099V3.Qe(this, jSONArray) { // from class: com.github.catvod.spider.Qiji.7

                    /* renamed from: short, reason: not valid java name */
                    private static final short[] f859short = {2487, 2478, 2469, 2462, 2483, 2468, 2476, 2464, 2483, 2474, 2482, 1510, 1535, 1524, 1487, 1504, 1529, 1523, 2344, 2353, 2362, 2305, 2352, 2367, 2355, 2363, 1726, 1703, 1708, 1687, 1697, 1708, 1509, 1504, 1525, 1504, 1847, 1825, 1829, 1846, 1831, 1836, 1819, 1832, 1837, 1847, 1840, 2216, 2227, 2218, 2218};

                    /* renamed from: QU */
                    final Qiji f254QU;

                    /* renamed from: xC */
                    final JSONArray f255xC;

                    {
                        this.f254QU = this;
                        this.f255xC = jSONArray;
                        int iM825 = C0173.m825();
                        int i2 = 1616;
                        while (true) {
                            i2 ^= 1633;
                            switch (i2) {
                                case 14:
                                case 49:
                                    i2 = iM825 <= 0 ? 1709 : 1678;
                                case 204:
                                    System.out.println(C0179.m847("3fQJfa7RB73nqslKfH"));
                                    break;
                                case 239:
                                    break;
                            }
                            return;
                        }
                    }

                    @Override // com.github.catvod.spider.merge.AbstractC0099V3
                    public void onFailure(Call call, Exception exc) {
                        int iM833 = C0175.m833();
                        int i2 = 1616;
                        while (true) {
                            i2 ^= 1633;
                            switch (i2) {
                                case 14:
                                case 49:
                                    i2 = iM833 <= 0 ? 1709 : 1678;
                                case 204:
                                    System.out.println(Double.valueOf(C0168.m808("WDB9YdMN0WeCeMyGWZ2if1ltNGUg")));
                                    break;
                                case 239:
                                    break;
                            }
                            return;
                        }
                    }

                    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x00ca. Please report as an issue. */
                    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x006d. Please report as an issue. */
                    @Override // com.github.catvod.spider.merge.AbstractC0099V3
                    public String onResponse(String str3) throws JSONException {
                        JSONArray jSONArray2;
                        int i2 = 0;
                        String strM845 = C0178.m845(f859short, 0, 11, 2497);
                        String strM828 = C0174.m828(f859short, 11, 7, 1424);
                        String strM856 = C0181.m856(f859short, 18, 8, 2398);
                        String strM801 = C0166.m801(f859short, 26, 6, 1736);
                        try {
                            jSONArray2 = new JSONObject(C0152vp.m728W(new JSONObject(str3).optString(C0178.m845(f859short, 32, 4, 1409)), this.f254QU.f229QU, this.f254QU.f230UJ)).getJSONArray(C0176.m836(f859short, 36, 11, 1860));
                        } catch (JSONException e) {
                            int i3 = 48767;
                            while (true) {
                                i3 ^= 48784;
                                switch (i3) {
                                    case 14:
                                        break;
                                    case 239:
                                        i3 = 48798;
                                        break;
                                }
                            }
                        }
                        while (true) {
                            int i4 = i2;
                            int length = jSONArray2.length();
                            int i5 = 1616;
                            while (true) {
                                i5 ^= 1633;
                                switch (i5) {
                                    case 14:
                                    case 49:
                                        i5 = i4 < length ? 1709 : 1678;
                                    case 204:
                                        JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i4);
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put(strM801, jSONObjectOptJSONObject.optString(strM801));
                                        jSONObject.put(strM856, jSONObjectOptJSONObject.optString(strM856));
                                        jSONObject.put(strM828, jSONObjectOptJSONObject.optString(strM828));
                                        String strOptString = jSONObjectOptJSONObject.optString(strM845);
                                        boolean zEquals = strOptString.equals(C0176.m836(f859short, 47, 4, 2246));
                                        int i6 = 1740;
                                        while (true) {
                                            i6 ^= 1757;
                                            switch (i6) {
                                                case 17:
                                                    i6 = zEquals ? 1833 : 1802;
                                                case 54:
                                                case 471:
                                                    break;
                                                case 500:
                                                    strOptString = "";
                                                    break;
                                            }
                                        }
                                        jSONObject.put(strM845, strOptString);
                                        this.f255xC.put(jSONObject);
                                        i2 = i4 + 1;
                                        int i7 = 1864;
                                        while (true) {
                                            i7 ^= 1881;
                                            switch (i7) {
                                                case 17:
                                                    i7 = 48674;
                                                case 47483:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 239:
                                        break;
                                }
                            }
                            return str3;
                        }
                    }
                });
            } catch (Exception e) {
                int i2 = 1740;
                while (true) {
                    i2 ^= 1757;
                    switch (i2) {
                        case 17:
                            i2 = 1771;
                            break;
                        case 54:
                            break;
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0183.m866(f852short, 463, 4, 446), jSONArray);
            return jSONObject.toString();
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }
}
