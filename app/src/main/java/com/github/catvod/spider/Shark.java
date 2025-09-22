package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0165;
import com.github.catvod.parser.C0166;
import com.github.catvod.spider.merge.AbstractC0099V3;
import com.github.catvod.spider.merge.C0106ZJ;
import com.github.catvod.spider.merge.C0118ga;
import com.github.catvod.spider.merge.C0152vp;
import com.github.catvod.spider.merge.C0168;
import com.github.catvod.spider.merge.C0169;
import com.github.catvod.spider.merge.C0170;
import com.github.catvod.spider.merge.C0171;
import com.github.catvod.spider.merge.C0172;
import com.github.catvod.spider.merge.C0174;
import com.github.catvod.spider.merge.C0175;
import com.github.catvod.spider.merge.C0176;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import okhttp3.Call;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class Shark extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f861short = {1636, 1601, 1612, 1622, 1609, 1611, 1551, 1554, 1550, 1554, 1550, 1552, 1536, 1544, 1644, 1609, 1614, 1621, 1624, 1563, 1536, 1653, 1563, 1536, 1633, 1614, 1604, 1618, 1615, 1609, 1604, 1536, 1553, 1556, 1563, 1536, 1650, 1605, 1604, 1613, 1609, 1536, 1634, 1621, 1609, 1612, 1604, 1551, 1554, 1555, 1553, 1553, 1555, 1650, 1643, 1635, 1558, 1635, 1545, 2486, 2480, 2470, 2481, 2542, 2466, 2468, 2470, 2477, 2487, 1800, 1819, 1804, 1805, 1815, 1809, 1808, 1208, 1257, 1183, 1180, 1262, 1261, 1200, 1192, 1259, 1201, 1155, 1167, 1176, 1195, 1274, 1179, 1272, 1279, 1278, 1157, 1277, 1265, 1267, 1266, 1156, 1264, 1270, 1254, 1152, 1158, 1184, 1190, 1191, 1248, 1249, 1271, 1269, 1255, 1253, 1252, 1172, 2956, 3011, 2288, 2276, 620, 576, 576, 580, 582, 586, 3088, 3120, 1995, 1937, 1949, 1937, 1255, 1187, 1210, 1190, 1191, 2368, 2332, 2311, 2318, 2333, 2308, 2368, 2318, 2335, 2310, 2369, 2335, 2311, 2335, 2384, 2318, 2316, 2331, 2310, 2304, 2305, 2386, 2316, 2304, 2305, 2313, 2310, 2312, 2332, 2636, 2624, 2625, 2633, 2630, 2632, 1005, 1008, 1001, 1008, 992, 2372, 1558, 1546, 1543, 1567, 1539, 1556, 1551, 1544, 1536, 1545, 1557, 1481, 1493, 1496, 1472, 1500, 1483, 1495, 1496, 1492, 1500, 3019, 3031, 3034, 3010, 3038, 3017, 3025, 3026, 3038, 3024, 3028, 3022, 1615, 1617, 1622, 1628, 1623, 1615, 1558, 1620, 1623, 1627, 1625, 1612, 1617, 1623, 1622, 1558, 1616, 1610, 1629, 1630, 2240, 2262, 2247, 2206, 2256, 2268, 2268, 2264, 2266, 2262, 3139, 687, 753, 737, 691, 700, 685, 387, 477, 461, 415, 400, 385, 997, 939, 954, 931, 996, 954, 930, 954, 997, 956, 1019, 996, 937, 934, 939, 953, 953, 931, 940, 947, 997, 937, 933, 932, 958, 943, 932, 958, 1013, 954, 939, 941, 943, 1015, 1202, 1185, 1206, 1202, 22535, -26233, 24159, 23125, 2982, 2997, 3002, 3007, 24911, 19532, 26614, 820, 825, 816, 805, 23107, -25661, 30544, 23712, 2219, 2214, 2223, 2234, 2176, 2230, 2235, 2806, 2794, 2798, 2813, 21315, -27965, 23647, 19656, 1401, 1384, 1390, 1388, 2328, 2313, 2319, 2317, 2315, 2311, 2333, 2310, 2332, 1894, 1891, 1895, 1891, 1918, 1314, 1337, 1314, 1335, 1338, 3327, 3322, 3296, 3303, 1661, 594, 594, 594, 949, 940, 935, 924, 928, 940, 941, 951, 934, 941, 951, 2750, 2727, 2732, 2711, 2732, 2721, 2746, 2733, 2731, 2748, 2727, 2746, 305, 296, 291, 280, 294, 292, 307, 296, 309, 2976, 3001, 2994, 2953, 2980, 2995, 3003, 2999, 2980, 3005, 2981, 3265, 3288, 3283, 3304, 3286, 3269, 3282, 3286, 1424, 1417, 1410, 1465, 1439, 1411, 1415, 1428, 3187, 3178, 3169, 3162, 3189, 3180, 3174, 553, 560, 571, 512, 561, 574, 562, 570, 3031, 3022, 3013, 3070, 3016, 3013, 1260, 1186, 1203, 1194, 1261, 1203, 1195, 1203, 1260, 1205, 1266, 1261, 1203, 1199, 1186, 1210, 1190, 1201, 1260, 1191, 1190, 1207, 1186, 1194, 1199, 1200, 1276, 1205, 1196, 1191, 1180, 1194, 1191, 1278, 2179, 2182, 2195, 2182, 3317, 3316, 3301, 3312, 3320, 3325, 699, 694, 703, 682, 656, 673, 686, 674, 682, 3282, 3275, 3264, 3323, 3271, 3272, 3269, 3287, 3287, 28130, 25891, 21861, 23818, 22510, 22475, -29761, -1654, -29327, 21625, 18572, 22997, 21841, -25583, -1657, -1657, 557, 561, 572, 548, 514, 552, 559, 561, 514, 561, 564, 558, 553, 1925, 1922, 1948, 1923, 878, 885, 882, 874, 3264, 3284, 3273, 3275, 2390, 2393, 2389, 2397, 1403, 2304, 2311, 2329, 1352, 2846, 2823, 2828, 2871, 2840, 2820, 2825, 2833, 2871, 2830, 2842, 2823, 2821, 852, 845, 838, 893, 850, 846, 835, 859, 893, 855, 848, 846, 2150, 2147, 2169, 2174, 2877, 2864, 2873, 2860, 2838, 2855, 2856, 2852, 2860, 886, 824, 809, 816, 887, 809, 817, 809, 886, 815, 872, 887, 817, 822, 820, 828, 886, 813, 800, 809, 828, 810, 1928, 1933, 1944, 1933, 449, 460, 453, 464, 454, 25803, -31693, 2749, 2736, 2745, 2732, 2710, 2720, 2733, 870, 873, 868, 886, 886, 1733, 1756, 1751, 1772, 1729, 1750, 1758, 1746, 1729, 1752, 1728, 2975, 2950, 2957, 2998, 2969, 2944, 2954, 2413, 2420, 2431, 2372, 2421, 2426, 2422, 2430, 738, 763, 752, 715, 765, 752, 3004, 3007, 2797, 2723, 2738, 2731, 2796, 2738, 2730, 2738, 2797, 2740, 2803, 2796, 2730, 2733, 2735, 2727, 2797, 2726, 2723, 2742, 2723, 2813, 2742, 2747, 2738, 2727, 2717, 2731, 2726, 2815, 2800, 2805, 2784, 2805, 2681, 2666, 2685, 2627, 2670, 2657, 2667, 2627, 2662, 2684, 2683, 1720, 1707, 1724, 1722, 1703, 1709, 1711, 1698, 1681, 1698, 1711, 1696, 1706, 1725, 3129, 3132, 3110, 3105, 1911, 1793, 499, 499, 431, 436, 445, 430, 439, 499, 445, 428, 437, 498, 428, 436, 428, 483, 445, 447, 424, 437, 435, 434, 481, 428, 445, 430, 431, 441, 426, 435, 440, 852, 837, 854, 855, 833, 1692, 1691, 1669, 2056, 2052, 2065, 2054, 2061, 2060, 2059, 2050, 544, 569, 562, 521, 548, 563, 571, 567, 548, 573, 549, 677, 700, 695, 652, 675, 698, 688, 2699, 2706, 2713, 2722, 2708, 2713, 3072, 3097, 3090, 3113, 3096, 3095, 3099, 3091, 1335, 1401, 1384, 1393, 1334, 1384, 1392, 1384, 1335, 1390, 1321, 1334, 1387, 1405, 1401, 1386, 1403, 1392, 1335, 1404, 1401, 1388, 1401, 1319, 1391, 1404, 1317, 917, 967, 970, 963, 982, 1004, 986, 983, 910, 899, 917, 963, 978, 980, 982, 910, 898, 1129, 1132, 1145, 1132, 772, 786, 790, 773, 788, 799, 808, 787, 790, 771, 790, 2213, 2208, 2234, 2237};

    /* renamed from: B */
    JSONArray f257B;

    /* renamed from: W */
    private String f263W;

    /* renamed from: q */
    private String f265q = "";

    /* renamed from: xC */
    private String f268xC = C0171.m816(f861short, 0, 59, 1568);

    /* renamed from: QU */
    private String f261QU = "";

    /* renamed from: UJ */
    private String f262UJ = "";

    /* renamed from: u */
    private String f267u = "";

    /* renamed from: Mo */
    private String f260Mo = "";

    /* renamed from: i */
    private String f264i = "";

    /* renamed from: MH */
    private String f259MH = "";

    /* renamed from: se */
    private String f266se = "";

    /* renamed from: FN */
    private String f258FN = "";

    public Shark() {
        int iM804 = C0166.m804();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = iM804 <= 0 ? 1709 : 1678;
                case 204:
                    System.out.println(Long.valueOf(C0179.m847("W7WCQSqGCCeedhpVzf68Vj")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0087. Please report as an issue. */
    /* renamed from: Mo */
    private HashMap<String, String> m98Mo() {
        HashMap<String, String> map = new HashMap<>();
        map.put(C0175.m834(f861short, 59, 10, 2499), this.f268xC);
        map.put(C0168.m805(f861short, 69, 7, 1918), this.f259MH);
        StringBuilder sb = new StringBuilder();
        sb.append(C0118ga.m604q(this.f260Mo, C0118ga.f677xC));
        sb.append(C0165.m798(f861short, 76, 41, 1243));
        sb.append(C0118ga.m604q(C0165.m798(f861short, 117, 2, 3053) + System.currentTimeMillis(), C0118ga.f677xC));
        map.put(C0165.m798(f861short, 119, 2, 2181), sb.toString());
        int length = this.f258FN.length();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = length > 0 ? 1709 : 1678;
                case 204:
                    map.put(C0172.m820(f861short, 121, 6, 559), this.f258FN);
                    break;
                case 239:
                    break;
            }
        }
        return map;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x004d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x002d. Please report as an issue. */
    /* renamed from: QU */
    private void m99QU() {
        String[] strArrSplit = C0152vp.m724Mo(this.f266se).split(C0171.m816(f861short, 127, 2, 3148));
        boolean zContains = strArrSplit[0].contains(C0175.m834(f861short, 129, 4, 2021));
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = !zContains ? 1709 : 1678;
                case 204:
                    boolean zContains2 = strArrSplit[0].contains(C0183.m866(f861short, 133, 5, 1225));
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = zContains2 ? 1833 : 1802;
                            case 54:
                            case 471:
                                this.f265q = strArrSplit[0];
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
                                break;
                            case 500:
                                int i4 = 1864;
                                while (true) {
                                    i4 ^= 1881;
                                    switch (i4) {
                                        case 17:
                                            i4 = 48674;
                                            break;
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
        this.f267u = strArrSplit[3];
        this.f265q = new JSONArray(C0152vp.m730q(C0106ZJ.m484FN(strArrSplit[0], null), this.f267u)).getString(0);
        this.f262UJ = strArrSplit[1];
        this.f260Mo = strArrSplit[4];
        this.f261QU = C0118ga.m604q(strArrSplit[1] + strArrSplit[4], C0118ga.f677xC).substring(0, 16);
        this.f259MH = strArrSplit[2];
        JSONObject jSONObject = new JSONObject(C0152vp.m730q(m101i(this.f265q + C0178.m845(f861short, 138, 29, 2415)), this.f262UJ));
        this.f264i = jSONObject.optJSONObject(C0165.m798(f861short, 167, 6, 2607)).optString(C0177.m841(f861short, 173, 5, 901)).split(C0172.m820(f861short, 178, 1, 2402))[0];
        this.f257B = jSONObject.getJSONArray(C0176.m836(f861short, 179, 11, 1638));
    }

    /* renamed from: UJ */
    private String m100UJ(String str) {
        System.out.println(str);
        int i = 0;
        while (true) {
            int length = this.f257B.length();
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                    case 49:
                        i2 = i < length ? 1709 : 1678;
                    case 204:
                        JSONObject jSONObjectOptJSONObject = this.f257B.optJSONObject(i);
                        boolean zEquals = str.equals(jSONObjectOptJSONObject.optString(C0172.m820(f861short, 190, 10, 1465)));
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = zEquals ? 1833 : 1802;
                                case 54:
                                case 471:
                                    i++;
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                i4 = 48674;
                                                break;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                                case 500:
                                    return jSONObjectOptJSONObject.optString(C0174.m828(f861short, 200, 12, 3003));
                            }
                        }
                        break;
                    case 239:
                        return null;
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0056. Please report as an issue. */
    /* renamed from: i */
    private String m101i(String str) {
        this.f258FN = "";
        TreeMap treeMap = new TreeMap();
        String strM482B = C0106ZJ.m482B(str, m98Mo(), treeMap);
        boolean zContains = strM482B.contains(C0183.m866(f861short, 212, 20, 1592));
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = zContains ? 1709 : 1678;
                case 204:
                    this.f258FN = "";
                    List list = (List) treeMap.get(C0177.m841(f861short, 232, 10, 2227));
                    list.getClass();
                    Iterator it = list.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = zHasNext ? 1833 : 1802;
                                case 54:
                                case 471:
                                    break;
                                case 500:
                                    this.f258FN += ((String) it.next()).split(C0169.m809(f861short, 242, 1, 3192))[0];
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
                                    break;
                            }
                            return C0106ZJ.m484FN(str, m98Mo());
                        }
                    }
                    break;
                case 239:
                    String strM849 = C0179.m849(f861short, 243, 6, 659);
                    boolean zContains2 = strM482B.contains(strM849);
                    int i4 = 48767;
                    while (true) {
                        i4 ^= 48784;
                        switch (i4) {
                            case 14:
                            case 45:
                                return strM482B;
                            case 76:
                                return strM482B.split(strM849)[r0.length - 1].trim().trim();
                            case 239:
                                i4 = zContains2 ? 48860 : 48829;
                        }
                    }
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public String m103u(String str) {
        String strM809 = C0169.m809(f861short, 249, 6, 447);
        boolean zContains = str.contains(strM809);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = zContains ? 1709 : 1678;
                case 204:
                    return str.split(strM809)[r0.length - 1].trim().trim();
                case 239:
                    return str;
            }
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException, NumberFormatException {
        try {
            int i = Integer.parseInt(str2);
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                    case 49:
                        i2 = i == 0 ? 1709 : 1678;
                    case 204:
                        i = 1;
                        break;
                    case 239:
                        break;
                }
            }
            String str3 = this.f265q + C0169.m809(f861short, 255, 34, 970) + str2;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0166.m801(f861short, 289, 4, 1235), C0180.m851(f861short, 293, 4, 2415));
            jSONObject.put(C0170.m814(f861short, 297, 4, 3028), C0177.m841(f861short, 301, 3, 582));
            jSONObject.put(C0180.m851(f861short, 304, 4, 832), C0168.m805(f861short, 308, 4, 2859));
            jSONObject.put(C0169.m809(f861short, 312, 7, 2271), str);
            jSONObject.put(C0165.m798(f861short, 319, 4, 2703), C0177.m841(f861short, 323, 4, 555));
            JSONArray jSONArray = new JSONArray();
            C0106ZJ.m486MH(C0106ZJ.m488QU(), str3, jSONObject.toString(), m98Mo(), new AbstractC0099V3.Qe(this, jSONArray) { // from class: com.github.catvod.spider.Shark.1

                /* renamed from: short, reason: not valid java name */
                private static final short[] f862short = {3053, 3060, 3071, 3012, 3049, 3070, 3062, 3066, 3049, 3056, 3048, 1708, 1717, 1726, 1669, 1706, 1715, 1721, 3269, 3292, 3287, 3308, 3293, 3282, 3294, 3286, 1862, 1887, 1876, 1903, 1881, 1876, 2970, 2975, 2954, 2975, 3105, 3134, 3123, 3122, 3128, 3080, 3131, 3134, 3108, 3107, 1632, 1659, 1634, 1634};

                /* renamed from: QU */
                final Shark f269QU;

                /* renamed from: xC */
                final JSONArray f270xC;

                {
                    this.f269QU = this;
                    this.f270xC = jSONArray;
                    int iM818 = C0171.m818();
                    int i3 = 1616;
                    while (true) {
                        i3 ^= 1633;
                        switch (i3) {
                            case 14:
                            case 49:
                                i3 = iM818 >= 0 ? 1709 : 1678;
                            case 204:
                                System.out.println(Long.decode(C0176.m789("44r4x8bDTq")));
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

                /* JADX WARN: Failed to find 'out' block for switch in B:22:0x00c5. Please report as an issue. */
                /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0068. Please report as an issue. */
                @Override // com.github.catvod.spider.merge.AbstractC0099V3
                public String onResponse(String str4) throws JSONException {
                    JSONArray jSONArray2;
                    int i3 = 0;
                    String strM828 = C0174.m828(f862short, 0, 11, 2971);
                    String strM798 = C0165.m798(f862short, 11, 7, 1754);
                    String strM866 = C0183.m866(f862short, 18, 8, 3251);
                    String strM814 = C0170.m814(f862short, 26, 6, 1840);
                    try {
                        jSONArray2 = new JSONObject(C0152vp.m730q(this.f269QU.m103u(str4), this.f269QU.f261QU)).optJSONObject(C0176.m836(f862short, 32, 4, 3070)).getJSONArray(C0174.m828(f862short, 36, 10, 3159));
                    } catch (JSONException e) {
                        int i4 = 48767;
                        while (true) {
                            i4 ^= 48784;
                            switch (i4) {
                                case 14:
                                    break;
                                case 239:
                                    i4 = 48798;
                                    break;
                            }
                        }
                    }
                    while (true) {
                        int i5 = i3;
                        int length = jSONArray2.length();
                        int i6 = 1616;
                        while (true) {
                            i6 ^= 1633;
                            switch (i6) {
                                case 14:
                                case 49:
                                    i6 = i5 < length ? 1709 : 1678;
                                case 204:
                                    JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i5);
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put(strM814, jSONObjectOptJSONObject.optString(strM814));
                                    jSONObject2.put(strM866, jSONObjectOptJSONObject.optString(strM866));
                                    jSONObject2.put(strM798, jSONObjectOptJSONObject.optString(strM798));
                                    String strOptString = jSONObjectOptJSONObject.optString(strM828);
                                    boolean zEquals = strOptString.equals(C0165.m798(f862short, 46, 4, 1550));
                                    int i7 = 1740;
                                    while (true) {
                                        i7 ^= 1757;
                                        switch (i7) {
                                            case 17:
                                                i7 = zEquals ? 1833 : 1802;
                                            case 54:
                                            case 471:
                                                break;
                                            case 500:
                                                strOptString = "";
                                                break;
                                        }
                                    }
                                    jSONObject2.put(strM828, strOptString);
                                    this.f270xC.put(jSONObject2);
                                    i3 = i5 + 1;
                                    int i8 = 1864;
                                    while (true) {
                                        i8 ^= 1881;
                                        switch (i8) {
                                            case 17:
                                                i8 = 48674;
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
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C0183.m866(f861short, 327, 4, 1289), i);
            int length = jSONArray.length();
            int i3 = 1740;
            while (true) {
                i3 ^= 1757;
                switch (i3) {
                    case 17:
                        if (length != 30) {
                            break;
                        } else {
                            i3 = 1833;
                        }
                    case 54:
                        break;
                    case 471:
                        break;
                    case 500:
                        i++;
                        break;
                    default:
                        continue;
                }
                i3 = 1802;
            }
            jSONObject2.put(C0178.m845(f861short, 331, 9, 2408), i);
            jSONObject2.put(C0179.m849(f861short, 340, 5, 1802), 30);
            jSONObject2.put(C0183.m866(f861short, 345, 5, 1366), Integer.MAX_VALUE);
            jSONObject2.put(C0175.m834(f861short, 350, 4, 3219), jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0224. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x028f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x01cf. Please report as an issue. */
    public String detailContent(List<String> list) {
        String strM849 = C0179.m849(f861short, 354, 1, 1623);
        String strM798 = C0165.m798(f861short, 355, 3, 630);
        String strM834 = C0175.m834(f861short, 358, 11, 963);
        String strM8342 = C0175.m834(f861short, 369, 12, 2760);
        String strM836 = C0176.m836(f861short, 381, 9, 327);
        String strM816 = C0171.m816(f861short, 390, 11, 3030);
        String strM8492 = C0179.m849(f861short, 401, 8, 3255);
        String strM8493 = C0179.m849(f861short, 409, 8, 1510);
        String strM820 = C0172.m820(f861short, 417, 7, 3077);
        String strM8343 = C0175.m834(f861short, 424, 8, 607);
        String strM828 = C0174.m828(f861short, 432, 6, 2977);
        try {
            m99QU();
            Init.m46lj();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f265q);
            sb.append(C0165.m798(f861short, 438, 34, 1219));
            sb.append(list.get(0));
            JSONObject jSONObjectOptJSONObject = new JSONObject(C0152vp.m730q(m103u(C0106ZJ.m484FN(sb.toString(), m98Mo())), this.f261QU)).optJSONObject(C0179.m849(f861short, 472, 4, 2279)).optJSONObject(C0170.m814(f861short, 476, 6, 3217));
            jSONObject.put(strM828, jSONObjectOptJSONObject.optString(strM828));
            jSONObject.put(strM8343, jSONObjectOptJSONObject.optString(strM8343));
            jSONObject.put(strM820, jSONObjectOptJSONObject.optString(strM820));
            jSONObject.put(C0182.m861(f861short, 482, 9, 719), jSONObjectOptJSONObject.optString(C0179.m849(f861short, 491, 9, 3236)));
            jSONObject.put(strM8493, jSONObjectOptJSONObject.optString(strM8493));
            jSONObject.put(strM8492, jSONObjectOptJSONObject.optString(strM8492));
            jSONObject.put(strM816, jSONObjectOptJSONObject.optString(strM816));
            jSONObject.put(strM836, jSONObjectOptJSONObject.optString(strM836));
            jSONObject.put(strM8342, jSONObjectOptJSONObject.optString(strM8342));
            jSONObject.put(strM834, C0176.m836(f861short, 500, 16, 1670) + jSONObjectOptJSONObject.optString(strM834));
            JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray(C0174.m828(f861short, 516, 13, 605));
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
                            JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i);
                            JSONArray jSONArray2 = jSONObjectOptJSONObject2.getJSONArray(C0171.m816(f861short, 529, 4, 2032));
                            ArrayList arrayList3 = new ArrayList();
                            String strOptString = jSONObjectOptJSONObject2.optString(C0172.m820(f861short, 533, 4, 797));
                            String strOptString2 = jSONObjectOptJSONObject2.optString(C0165.m798(f861short, 537, 4, 3238));
                            String str = list.get(0);
                            int i3 = 0;
                            while (true) {
                                int length2 = jSONArray2.length();
                                int i4 = 1740;
                                while (true) {
                                    i4 ^= 1757;
                                    switch (i4) {
                                        case 17:
                                            i4 = i3 < length2 ? 1833 : 1802;
                                        case 54:
                                        case 471:
                                            break;
                                        case 500:
                                            JSONObject jSONObjectOptJSONObject3 = jSONArray2.optJSONObject(i3);
                                            arrayList3.add(jSONObjectOptJSONObject3.optString(C0177.m841(f861short, 541, 4, 2360)) + C0183.m866(f861short, 545, 1, 1375) + jSONObjectOptJSONObject3.optString(C0172.m820(f861short, 546, 3, 2421)) + strM849 + strOptString2 + strM849 + str);
                                            int i5 = i3 + 1;
                                            int i6 = 1864;
                                            while (true) {
                                                i6 ^= 1881;
                                                switch (i6) {
                                                    case 17:
                                                        i6 = 48674;
                                                    case 47483:
                                                        break;
                                                }
                                            }
                                            i3 = i5;
                                            break;
                                    }
                                    arrayList2.add(strOptString);
                                    arrayList.add(TextUtils.join(C0179.m849(f861short, 549, 1, 1387), arrayList3));
                                    int i7 = i + 1;
                                    int i8 = 48767;
                                    while (true) {
                                        i8 ^= 48784;
                                        switch (i8) {
                                            case 14:
                                                break;
                                            case 239:
                                                i8 = 48798;
                                                break;
                                        }
                                    }
                                    i = i7;
                                }
                            }
                            break;
                        case 239:
                            break;
                    }
                    String strJoin = TextUtils.join(strM798, arrayList2);
                    String strJoin2 = TextUtils.join(strM798, arrayList);
                    jSONObject.put(C0166.m801(f861short, 550, 13, 2920), strJoin);
                    jSONObject.put(C0177.m841(f861short, 563, 12, 802), strJoin2);
                    JSONArray jSONArray3 = new JSONArray();
                    jSONArray3.put(jSONObject);
                    jSONObject2.put(C0171.m816(f861short, 575, 4, 2058), jSONArray3);
                    return jSONObject2.toString();
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x00e0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0075. Please report as an issue. */
    public String homeContent(boolean z) {
        String strM834 = C0175.m834(f861short, 579, 9, 2889);
        try {
            m99QU();
            String strM103u = m103u(C0106ZJ.m484FN(this.f265q + C0174.m828(f861short, 588, 22, 857), m98Mo()));
            System.out.println(strM103u);
            JSONArray jSONArray = new JSONObject(C0152vp.m730q(strM103u, this.f261QU)).optJSONObject(C0182.m861(f861short, 610, 4, 2028)).getJSONArray(C0176.m836(f861short, 614, 5, 437));
            JSONArray jSONArray2 = new JSONArray();
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
                            JSONObject jSONObject = new JSONObject();
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                            String strOptString = jSONObjectOptJSONObject.optString(strM834);
                            boolean zContains = strOptString.contains(C0175.m834(f861short, 619, 2, 1891));
                            String strM805 = C0168.m805(f861short, 621, 7, 2761);
                            int i3 = 1740;
                            while (true) {
                                i3 ^= 1757;
                                switch (i3) {
                                    case 17:
                                        i3 = zContains ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        jSONObject.put(strM805, jSONObjectOptJSONObject.optString(strM805));
                                        jSONObject.put(strM834, strOptString);
                                        jSONArray2.put(jSONObject);
                                        break;
                                    case 500:
                                        this.f263W = jSONObjectOptJSONObject.optString(strM805);
                                        int i4 = 1864;
                                        while (true) {
                                            i4 ^= 1881;
                                            switch (i4) {
                                                case 17:
                                                    i4 = 48674;
                                                case 47483:
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                            int i5 = i + 1;
                            int i6 = 48767;
                            while (true) {
                                i6 ^= 48784;
                                switch (i6) {
                                    case 14:
                                        break;
                                    case 239:
                                        i6 = 48798;
                                }
                            }
                            i = i5;
                            break;
                        case 239:
                            break;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(C0182.m861(f861short, 628, 5, 773), jSONArray2);
                    return jSONObject2.toString();
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x00b4. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x00dd. Please report as an issue. */
    public String homeVideoContent() {
        String strM845 = C0178.m845(f861short, 633, 11, 1715);
        String strM814 = C0170.m814(f861short, 644, 7, 3049);
        String strM836 = C0176.m836(f861short, 651, 8, 2331);
        String strM828 = C0174.m828(f861short, 659, 6, 660);
        try {
            String str = this.f263W;
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = str == null ? 1709 : 1678;
                    case 204:
                        this.f263W = C0171.m816(f861short, 665, 2, 2958);
                        break;
                    case 239:
                        break;
                }
            }
            JSONObject jSONObject = new JSONObject(C0152vp.m730q(m103u(C0106ZJ.m484FN(this.f265q + C0183.m866(f861short, 667, 30, 2754) + this.f263W, m98Mo())), this.f261QU));
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = jSONObject.optJSONObject(C0165.m798(f861short, 697, 4, 2708)).getJSONArray(C0172.m820(f861short, 701, 11, 2575));
            int i2 = 0;
            while (true) {
                int length = jSONArray2.length();
                int i3 = 1740;
                while (true) {
                    i3 ^= 1757;
                    switch (i3) {
                        case 17:
                            i3 = i2 < length ? 1833 : 1802;
                        case 54:
                        case 471:
                            break;
                        case 500:
                            JSONArray jSONArray3 = jSONArray2.optJSONObject(i2).getJSONArray(C0166.m801(f861short, 712, 14, 1742));
                            int i4 = 0;
                            while (true) {
                                int length2 = jSONArray3.length();
                                int i5 = 1864;
                                while (true) {
                                    i5 ^= 1881;
                                    switch (i5) {
                                        case 17:
                                            i5 = i4 < length2 ? 48736 : 48705;
                                        case 47384:
                                            break;
                                        case 47417:
                                            JSONObject jSONObject2 = new JSONObject();
                                            JSONObject jSONObjectOptJSONObject = jSONArray3.optJSONObject(i4);
                                            jSONObject2.put(strM828, jSONObjectOptJSONObject.optString(strM828));
                                            jSONObject2.put(strM836, jSONObjectOptJSONObject.optString(strM836));
                                            jSONObject2.put(strM814, jSONObjectOptJSONObject.optString(strM814));
                                            jSONObject2.put(strM845, jSONObjectOptJSONObject.optString(strM845));
                                            jSONArray.put(jSONObject2);
                                            i4++;
                                            int i6 = 48767;
                                            while (true) {
                                                i6 ^= 48784;
                                                switch (i6) {
                                                    case 14:
                                                        break;
                                                    case 239:
                                                        i6 = 48798;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47483:
                                    }
                                    int i7 = i2 + 1;
                                    int i8 = 48891;
                                    while (true) {
                                        i8 ^= 48908;
                                        switch (i8) {
                                            case 22:
                                                break;
                                            case 503:
                                                i8 = 48922;
                                                break;
                                        }
                                    }
                                    i2 = i7;
                                }
                            }
                            break;
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(C0182.m861(f861short, 726, 4, 3157), jSONArray);
                    return jSONObject3.toString();
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }

    public void init(Context context, String str) {
        String str2 = "ۧۤۡ";
        while (true) {
            switch (C0174.m829(str2)) {
                case 1752615:
                    return;
                case 1754532:
                    super.init(context);
                    str2 = "۠۠ۢ";
                    break;
                default:
                    this.f266se = str;
                    str2 = "ۥۤۦ";
                    break;
            }
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            String[] strArrSplit = str2.split(C0181.m856(f861short, 730, 2, 1835));
            String str3 = strArrSplit[0];
            String str4 = strArrSplit[1];
            String str5 = strArrSplit[2];
            String strM734xC = C0152vp.m734xC(m100UJ(str4), this.f264i);
            String str6 = this.f265q + C0179.m849(f861short, 732, 31, 476);
            HashMap map = new HashMap();
            map.put(C0172.m820(f861short, 763, 5, 804), strM734xC);
            map.put(C0169.m809(f861short, 768, 3, 1769), str3);
            map.put(C0169.m809(f861short, 771, 8, 2149), "");
            JSONObject jSONObject = new JSONObject();
            C0106ZJ.m492i(C0106ZJ.m488QU(), str6, map, m98Mo(), new AbstractC0099V3.Qe(this, jSONObject) { // from class: com.github.catvod.spider.Shark.2

                /* renamed from: short, reason: not valid java name */
                private static final short[] f863short = {2514, 2517, 2507, 690, 675, 688, 689, 679};

                /* renamed from: QU */
                final Shark f271QU;

                /* renamed from: xC */
                final JSONObject f272xC;

                {
                    this.f271QU = this;
                    this.f272xC = jSONObject;
                    int iM837 = C0176.m837();
                    int i = 1616;
                    while (true) {
                        i ^= 1633;
                        switch (i) {
                            case 14:
                            case 49:
                                i = iM837 <= 0 ? 1709 : 1678;
                            case 204:
                                System.out.println(Integer.decode(C0170.m815("aNyl0Xrxj5CdbMcPP9xN1I4pwzt")));
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

                @Override // com.github.catvod.spider.merge.AbstractC0099V3
                public String onResponse(String str7) throws JSONException {
                    String strM866 = C0183.m866(f863short, 0, 3, 2471);
                    try {
                        this.f272xC.put(strM866, new JSONObject(C0152vp.m730q(this.f271QU.m103u(str7), this.f271QU.f261QU)).optString(strM866));
                        this.f272xC.put(C0170.m814(f863short, 3, 5, 706), 0);
                    } catch (JSONException e) {
                        int i = 1616;
                        while (true) {
                            i ^= 1633;
                            switch (i) {
                                case 14:
                                    break;
                                case 49:
                                    i = 1647;
                                    break;
                            }
                        }
                    }
                    return str7;
                }
            });
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x00ae. Please report as an issue. */
    public String searchContent(String str, boolean z) {
        String strM851 = C0180.m851(f861short, 779, 11, 598);
        String strM856 = C0181.m856(f861short, 790, 7, 723);
        String strM841 = C0177.m841(f861short, 797, 6, 2813);
        String strM845 = C0178.m845(f861short, 803, 8, 3190);
        try {
            m99QU();
            JSONObject jSONObject = new JSONObject();
            String strM103u = m103u(C0106ZJ.m484FN(this.f265q + C0180.m851(f861short, 811, 27, 1304) + URLEncoder.encode(str) + C0181.m856(f861short, 838, 17, 947), m98Mo()));
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONObject(C0152vp.m730q(strM103u, this.f261QU)).optJSONObject(C0165.m798(f861short, 855, 4, 1037)).getJSONArray(C0180.m851(f861short, 859, 11, 887));
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
                            jSONObject2.put(strM841, jSONObjectOptJSONObject.optString(strM841));
                            jSONObject2.put(strM845, jSONObjectOptJSONObject.optString(strM845));
                            boolean zContains = jSONObjectOptJSONObject.optString(strM845).contains(str);
                            int i3 = 1740;
                            while (true) {
                                i3 ^= 1757;
                                switch (i3) {
                                    case 17:
                                        i3 = !zContains ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        jSONObject2.put(strM856, jSONObjectOptJSONObject.optString(strM856));
                                        jSONObject2.put(strM851, jSONObjectOptJSONObject.optString(strM851));
                                        jSONArray.put(jSONObject2);
                                        break;
                                    case 500:
                                        int i4 = 1864;
                                        while (true) {
                                            i4 ^= 1881;
                                            switch (i4) {
                                                case 17:
                                                    i4 = 48674;
                                                case 47483:
                                                    break;
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
                    jSONObject.put(C0177.m841(f861short, 870, 4, 2249), jSONArray);
                    return jSONObject.toString();
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }
}
