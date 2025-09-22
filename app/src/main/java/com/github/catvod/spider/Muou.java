package com.github.catvod.spider;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0165;
import com.github.catvod.parser.C0166;
import com.github.catvod.spider.merge.AbstractC0099V3;
import com.github.catvod.spider.merge.C0106ZJ;
import com.github.catvod.spider.merge.C0118ga;
import com.github.catvod.spider.merge.C0152vp;
import com.github.catvod.spider.merge.C0154wT;
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
import okhttp3.Call;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class Muou extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f845short = {2494, 2456, 2446, 2457, 2502, 2474, 2444, 2446, 2437, 2463, 2575, 2605, 2616, 2603, 2606, 2606, 2595, 2669, 2679, 2668, 2674, 2658, 2666, 2574, 2603, 2604, 2615, 2618, 2681, 2658, 2563, 2604, 2598, 2608, 2605, 2603, 2598, 2658, 2675, 2672, 2667, 2658, 2563, 2610, 2610, 2606, 2599, 2581, 2599, 2592, 2569, 2603, 2614, 2669, 2679, 2673, 2677, 2668, 2673, 2676, 2658, 2666, 2569, 2570, 2582, 2575, 2574, 2670, 2658, 2606, 2603, 2601, 2599, 2658, 2565, 2599, 2593, 2601, 2605, 2667, 2658, 2561, 2602, 2608, 2605, 2607, 2599, 2669, 2683, 2672, 2668, 2674, 2668, 2678, 2679, 2675, 2679, 2668, 2675, 2674, 2679, 2658, 2575, 2583, 2573, 2583, 2563, 2578, 2578, 2669, 2675, 2674, 2668, 2682, 2668, 2678, 2679, 2674, 2676, 2668, 2678, 2674, 2674, 1355, 1371, 1352, 1351, 1357, 1284, 1348, 1350, 1357, 1356, 1349, 1494, 1479, 1479, 1434, 1491, 1490, 1473, 1502, 1492, 1490, 796, 797, 790, 787, 774, 787, 1849, 1832, 1832, 1909, 1836, 1841, 1845, 1853, 1763, 1769, 1763, 1725, 1766, 1781, 1762, 1763, 1785, 1791, 1790, 2318, 2319, 2402, 2403, 2416, 2415, 2405, 2403, 1228, 1232, 2540, 2499, 2505, 2527, 2498, 2500, 2505, 3018, 3035, 3035, 2950, 3037, 3022, 3033, 3032, 3010, 3012, 3013, 781, 813, 3307, 3249, 3261, 3249, 1784, 1724, 1701, 1721, 1720, 1531, 1469, 1466, 1458, 1467, 1530, 1444, 1468, 1444, 511, 2929, 1015, 20900, 26390, 19563, -32101, 19548, -28807, 26390, 2217, 2229, 2232, 2208, 2236, 2219, 2231, 2232, 2228, 2236, 535, 523, 518, 542, 514, 533, 525, 526, 514, 524, 520, 530, 2828, 2836, 2844, 2834, 2839, 2836, 2194, 2226, 1971, 2025, 2021, 2025, 2697, 2765, 2772, 2760, 2761, 2242, 2188, 2205, 2205, 2226, 2180, 2179, 2187, 2178, 2243, 2205, 2181, 2205, 3324, 3300, 3326, 3300, 3312, 3297, 3297, 2698, 521, 3095, 266, 275, 280, 291, 270, 281, 273, 285, 270, 279, 271, 2659, 2682, 2673, 2634, 2661, 2684, 2678, 1554, 1547, 1536, 1595, 1546, 1541, 1545, 1537, 744, 753, 762, 705, 759, 762, 3002, 3007, 2981, 2978, 952, 928, 936, 934, 931, 928, 2724, 2794, 2811, 2786, 2725, 2811, 2787, 2811, 2724, 2813, 2746, 2725, 2813, 2788, 2799, 2740, 2815, 2802, 2811, 2798, 2742, 2665, 2604, 2595, 2606, 2620, 2620, 2674, 2665, 2606, 2621, 2602, 2606, 2674, 2665, 2614, 2602, 2606, 2621, 2674, 2665, 2605, 2614, 2674, 2619, 2598, 2594, 2602, 2665, 2623, 2606, 2600, 2602, 2674, 1539, 1609, 1612, 1608, 1612, 1617, 1560, 2150, 2147, 2166, 2147, 3118, 3125, 3116, 3116, 1159, 1174, 1168, 1170, 2335, 2318, 2312, 2314, 2316, 2304, 2330, 2305, 2331, 1635, 1638, 1634, 1638, 1659, 840, 851, 840, 861, 848, 1346, 1374, 1363, 1355, 1367, 1344, 1389, 1371, 1372, 1364, 1373, 2587, 2587, 2587, 2645, 2636, 2631, 2684, 2624, 2636, 2637, 2647, 2630, 2637, 2647, 2354, 2347, 2336, 2331, 2336, 2349, 2358, 2337, 2343, 2352, 2347, 2358, 1447, 1470, 1461, 1422, 1456, 1458, 1445, 1470, 1443, 1773, 1782, 1775, 1775, 3145, 3152, 3163, 3168, 3166, 3149, 3162, 3166, 2898, 2891, 2880, 2939, 2909, 2881, 2885, 2902, 2037, 2028, 2023, 2012, 2035, 2026, 2016, 2057, 2064, 2075, 2080, 2065, 2078, 2066, 2074, 2566, 2591, 2580, 2607, 2585, 2580, 1447, 1442, 1464, 1471, 2342, 2366, 2358, 2360, 2365, 2366, 3128, 3190, 3175, 3198, 3129, 3175, 3199, 3175, 3128, 3169, 3110, 3129, 3169, 3192, 3187, 3128, 3187, 3186, 3171, 3190, 3198, 3195, 3112, 3169, 3192, 3187, 3144, 3198, 3187, 3114, 2133, 2128, 2117, 2128, 1069, 1056, 1065, 1084, 1030, 1079, 1080, 1076, 1084, 2822, 2847, 2836, 2863, 2835, 2844, 2833, 2819, 2819, 405, 396, 391, 444, 401, 390, 398, 386, 401, 392, 400, 451, 1612, 1621, 1630, 1637, 1608, 1631, 1623, 1627, 1608, 1617, 1609, 28479, 26622, 22456, 24535, 21811, 21782, -30366, -1193, -28756, 22180, 19025, 23304, 22412, -24884, -1190, -1190, 1620, 1613, 1606, 1661, 1618, 1614, 1603, 1627, 1661, 1614, 1611, 1617, 1622, 1350, 1373, 1370, 1346, 2607, 2619, 2598, 2596, 453, 450, 476, 451, 1800, 1807, 1809, 1591, 1592, 1588, 1596, 1166, 1521, 2865, 919, 910, 901, 958, 913, 909, 896, 920, 958, 903, 915, 910, 908, 1264, 1257, 1250, 1241, 1270, 1258, 1255, 1279, 1241, 1267, 1268, 1258, 1308, 1297, 1304, 1293, 1335, 1281, 1292, 3132, 3121, 3128, 3117, 3095, 3110, 3113, 3109, 3117, 821, 824, 817, 804, 813, 808, 818, 821, 1661, 1637, 1645, 1635, 1638, 1637, 1968, 2046, 2031, 2038, 1969, 2031, 2039, 2031, 1968, 2025, 1966, 1969, 2025, 2032, 2043, 1968, 2027, 2022, 2031, 2042, 2028, 908, 905, 924, 905, 1558, 1561, 1556, 1542, 1542, 1543, 1566, 1557, 1582, 1539, 1556, 1564, 1552, 1539, 1562, 1538, 496, 489, 482, 473, 502, 495, 485, 1960, 1969, 1978, 1921, 1968, 1983, 1971, 1979, 802, 827, 816, 779, 829, 816, 2398, 2375, 2380, 2423, 2372, 2369, 2395, 2396, 1624, 1600, 1608, 1606, 1603, 1600, 1837, 1891, 1906, 1899, 1836, 1906, 1898, 1906, 1837, 1908, 1843, 1836, 1908, 1901, 1894, 1837, 1866, 1901, 1903, 1895, 1867, 1900, 1894, 1895, 1914, 1853, 1906, 1891, 1893, 1895, 1855, 1828, 1902, 1899, 1903, 1899, 1910, 1855, 1844, 3080, 3085, 3096, 3085, 788, 785, 779, 780, 2549, 2537, 2532, 2556, 2528, 2551, 2540, 2539, 2531, 2538, 573, 627, 610, 635, 572, 610, 634, 610, 557, 627, 625, 614, 635, 637, 636, 559, 610, 638, 627, 619, 631, 608, 635, 636, 628, 637, 1165, 1160, 1181, 1160, 689, 3282, 3278, 3278, 3274, 2287, 2302, 2285, 2284, 2298, 2463, 2456, 2438, 1114, 2887, 2841, 2911, 2834, 2950, 2971, 3039, 2915, 2938, 2929, 2890, 2919, 2928, 2936, 2932, 2919, 2942, 2918, 3074, 3099, 3088, 3115, 3076, 3101, 3095, 1174, 1167, 1156, 1215, 1166, 1153, 1165, 1157, 1678, 1687, 1692, 1703, 1681, 1692, 1540, 1537, 1563, 1564, 3126, 3118, 3110, 3112, 3117, 3118, 340, 282, 267, 274, 341, 267, 275, 267, 340, 269, 330, 341, 269, 276, 287, 324, 268, 287, 326, 1686, 1756, 1753, 1757, 1753, 1732, 1677, 1665, 1672, 1686, 1728, 1745, 1751, 1749, 1677, 1665, 2052, 2049, 2068, 2049, 3030, 3021, 3028, 3028};

    /* renamed from: se */
    JSONArray f176se;

    /* renamed from: q */
    private String f175q = "";

    /* renamed from: xC */
    private String f178xC = "";

    /* renamed from: QU */
    private String f171QU = "";

    /* renamed from: UJ */
    private String f172UJ = Build.BRAND;

    /* renamed from: u */
    private String f177u = "";

    /* renamed from: Mo */
    private String f170Mo = "";

    /* renamed from: i */
    private String f174i = "";

    /* renamed from: MH */
    private String f169MH = "";

    /* renamed from: W */
    private String f173W = "";

    /* renamed from: FN */
    private String f168FN = "";

    public Muou() {
        int iM840 = C0177.m840();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = iM840 >= 0 ? 1709 : 1678;
                case 204:
                    System.out.println(Double.valueOf(C0169.m810("0ssvW6gCqoUAoj")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000e. Please report as an issue. */
    /* renamed from: MH */
    private HashMap<String, String> m69MH(String str) {
        boolean zIsEmpty = str.isEmpty();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = zIsEmpty ? 1709 : 1678;
                case 204:
                    str = String.valueOf(System.currentTimeMillis() / 1000);
                    break;
                case 239:
                    break;
            }
        }
        HashMap<String, String> map = new HashMap<>();
        map.put(C0178.m845(f845short, 0, 10, 2539), C0174.m828(f845short, 10, 113, 2626));
        map.put(C0171.m816(f845short, 123, 11, 1321), this.f172UJ);
        map.put(C0175.m834(f845short, 134, 10, 1463), C0177.m841(f845short, 144, 6, 882));
        map.put(C0177.m841(f845short, 150, 8, 1880), str);
        map.put(C0168.m805(f845short, 158, 11, 1680), C0177.m841(f845short, 169, 2, 2367));
        map.put(C0183.m866(f845short, 171, 6, 2310), this.f177u);
        map.put(C0182.m861(f845short, 177, 2, 1187), C0178.m845(f845short, 179, 7, 2477));
        map.put(C0176.m836(f845short, 186, 11, 2987), this.f171QU);
        return map;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x004d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x002c. Please report as an issue. */
    /* renamed from: Mo */
    private void m70Mo() {
        String[] strArrSplit = C0152vp.m724Mo(this.f169MH).split(C0170.m814(f845short, 197, 2, 849));
        boolean zEndsWith = strArrSplit[0].endsWith(C0179.m849(f845short, 199, 4, 3269));
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = !zEndsWith ? 1709 : 1678;
                case 204:
                    boolean zEndsWith2 = strArrSplit[0].endsWith(C0177.m841(f845short, 203, 5, 1750));
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = zEndsWith2 ? 1833 : 1802;
                            case 54:
                            case 471:
                                this.f168FN = strArrSplit[0];
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
        this.f168FN = C0106ZJ.m484FN(strArrSplit[0], null);
        this.f178xC = strArrSplit[1];
        this.f171QU = strArrSplit[2];
        String str = this.f168FN + C0175.m834(f845short, 208, 9, 1492);
        HashMap map = new HashMap();
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        String lowerCase = C0118ga.m606xC(strValueOf + this.f178xC).toLowerCase();
        String lowerCase2 = C0118ga.m606xC(strValueOf + lowerCase).toLowerCase();
        map.put(C0179.m849(f845short, 217, 1, 395), strValueOf);
        map.put(C0179.m849(f845short, 218, 1, 2844), lowerCase2);
        map.put(C0169.m809(f845short, 219, 1, 921), lowerCase);
        C0106ZJ.m492i(C0106ZJ.m488QU(), str, map, m69MH(strValueOf), new AbstractC0099V3.Qe(this, lowerCase2) { // from class: com.github.catvod.spider.Muou.1

            /* renamed from: short, reason: not valid java name */
            private static final short[] f846short = {672, 701, 697, 689, 925, 920, 909, 920, 959, 945, 941, 1530, 1509, 2012, 2006, 2021, 2021, 2673, 2683, 2635, 2643, 2643, 2654};

            /* renamed from: QU */
            final Muou f179QU;

            /* renamed from: xC */
            final String f180xC;

            {
                this.f179QU = this;
                this.f180xC = lowerCase2;
                int iM853 = C0180.m853();
                int i5 = 1616;
                while (true) {
                    i5 ^= 1633;
                    switch (i5) {
                        case 14:
                        case 49:
                            i5 = iM853 <= 0 ? 1709 : 1678;
                        case 204:
                            System.out.println(Integer.parseInt(C0176.m789("mw")));
                            break;
                        case 239:
                            break;
                    }
                    return;
                }
            }

            @Override // com.github.catvod.spider.merge.AbstractC0099V3
            public void onFailure(Call call, Exception exc) {
                int iM822 = C0172.m822();
                int i5 = 1616;
                while (true) {
                    i5 ^= 1633;
                    switch (i5) {
                        case 14:
                        case 49:
                            i5 = iM822 >= 0 ? 1709 : 1678;
                        case 204:
                            System.out.println(Long.decode(C0180.m852("Jr3fwmT5e")));
                            break;
                        case 239:
                            break;
                    }
                    return;
                }
            }

            @Override // com.github.catvod.spider.merge.AbstractC0099V3
            public String onResponse(String str2) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    JSONObject jSONObject2 = new JSONObject(C0152vp.m728W(jSONObject.optString(C0166.m801(f846short, 4, 4, 1017)), C0118ga.m604q(String.valueOf(jSONObject.getLong(C0168.m805(f846short, 0, 4, 724))), C0118ga.f677xC).substring(0, 16), C0118ga.m604q(this.f180xC, C0118ga.f677xC).substring(0, 16)));
                    this.f179QU.f170Mo = C0118ga.m604q(jSONObject2.optString(C0176.m836(f846short, 8, 3, 980)), C0118ga.f677xC).substring(0, 16);
                    this.f179QU.f174i = C0118ga.m604q(jSONObject2.optString(C0168.m805(f846short, 11, 2, 1427)), C0118ga.f677xC).substring(0, 16);
                    this.f179QU.f175q = jSONObject2.optString(C0175.m834(f846short, 13, 4, 1940));
                    this.f179QU.f173W = jSONObject2.optString(C0176.m836(f846short, 17, 6, 2617));
                } catch (Exception e) {
                    int i5 = 1616;
                    while (true) {
                        i5 ^= 1633;
                        switch (i5) {
                            case 14:
                                break;
                            case 49:
                                i5 = 1647;
                                break;
                        }
                    }
                }
                return str2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public String m73W(String str, int i, int i2) {
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                case 49:
                    i3 = str != null ? 1709 : 1678;
                case 204:
                    boolean zIsEmpty = str.isEmpty();
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = zIsEmpty ? 1833 : 1802;
                            case 54:
                            case 471:
                                int length = str.length();
                                int i5 = 48767;
                                while (true) {
                                    i5 ^= 48784;
                                    switch (i5) {
                                        case 14:
                                            i5 = 48829;
                                            break;
                                        case 45:
                                            break;
                                        case 76:
                                            int i6 = 48891;
                                            while (true) {
                                                i6 ^= 48908;
                                                switch (i6) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        break;
                                                    case 503:
                                                        if (i2 < 0) {
                                                            break;
                                                        } else {
                                                            i6 = 49635;
                                                        }
                                                    case 32495:
                                                        int i7 = 49666;
                                                        while (true) {
                                                            i7 ^= 49683;
                                                            switch (i7) {
                                                                case 17:
                                                                    i7 = i + i2 > length ? 49759 : 49728;
                                                                case 50:
                                                                case 76:
                                                                    return "";
                                                                case 83:
                                                                    return str.substring(i, length - i2);
                                                            }
                                                        }
                                                        break;
                                                }
                                                i6 = 48953;
                                            }
                                            break;
                                        case 239:
                                            if (i < 0) {
                                                i5 = 48829;
                                                break;
                                            } else {
                                                i5 = 48860;
                                                break;
                                            }
                                    }
                                }
                                throw new IllegalArgumentException(C0168.m805(f845short, 220, 7, 614));
                            case 500:
                                int i8 = 1864;
                                while (true) {
                                    i8 ^= 1881;
                                    switch (i8) {
                                        case 17:
                                            i8 = 48674;
                                            break;
                                        case 47483:
                                            return str;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 239:
                    return str;
            }
        }
    }

    /* renamed from: i */
    private String m74i(String str) {
        int i = 0;
        while (true) {
            int length = this.f176se.length();
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                    case 49:
                        i2 = i < length ? 1709 : 1678;
                    case 204:
                        JSONObject jSONObjectOptJSONObject = this.f176se.optJSONObject(i);
                        boolean zEquals = str.equals(jSONObjectOptJSONObject.optString(C0176.m836(f845short, 227, 10, 2265)));
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
                                    return jSONObjectOptJSONObject.optString(C0183.m866(f845short, 237, 12, 615));
                            }
                        }
                        break;
                    case 239:
                        return null;
                }
            }
        }
    }

    /* renamed from: se */
    private void m76se() {
        String[] strArrSplit = C0152vp.m724Mo(this.f169MH.replace(C0179.m849(f845short, 249, 6, 2941), "")).split(C0174.m828(f845short, 255, 2, 2254));
        boolean zEndsWith = strArrSplit[0].endsWith(C0169.m809(f845short, 257, 4, 1949));
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = !zEndsWith ? 1709 : 1678;
                case 204:
                    boolean zEndsWith2 = strArrSplit[0].endsWith(C0168.m805(f845short, 261, 5, 2727));
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = zEndsWith2 ? 1833 : 1802;
                            case 54:
                            case 471:
                                this.f168FN = strArrSplit[0];
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
        this.f168FN = C0106ZJ.m484FN(strArrSplit[0], null);
        this.f178xC = strArrSplit[1];
        this.f171QU = strArrSplit[2];
        String str = this.f168FN + C0174.m828(f845short, 266, 13, 2285);
        HashMap map = new HashMap();
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        String lowerCase = C0118ga.m606xC(strValueOf + this.f178xC).toLowerCase();
        String lowerCase2 = C0118ga.m606xC(strValueOf + lowerCase + C0178.m845(f845short, 279, 7, 3217)).toLowerCase();
        map.put(C0170.m814(f845short, 286, 1, 2814), strValueOf);
        map.put(C0175.m834(f845short, 287, 1, 612), lowerCase2);
        map.put(C0178.m845(f845short, 288, 1, 3193), lowerCase);
        C0106ZJ.m492i(C0106ZJ.m488QU(), str, map, m69MH(strValueOf), new AbstractC0099V3.Qe(this, lowerCase2) { // from class: com.github.catvod.spider.Muou.2

            /* renamed from: short, reason: not valid java name */
            private static final short[] f847short = {1193, 2358, 2355, 2342, 2355, 2561, 2566, 914, 924, 896, 2775, 2760, 2286, 2276, 2263, 2263, 1068, 1062, 1046, 1038, 1038, 1027};

            /* renamed from: QU */
            final Muou f181QU;

            /* renamed from: xC */
            final String f182xC;

            {
                this.f181QU = this;
                this.f182xC = lowerCase2;
                int iM830 = C0174.m830();
                int i5 = 1616;
                while (true) {
                    i5 ^= 1633;
                    switch (i5) {
                        case 14:
                        case 49:
                            i5 = iM830 <= 0 ? 1709 : 1678;
                        case 204:
                            System.out.println(Integer.valueOf(C0177.m839("EmEoB2Op")));
                            break;
                        case 239:
                            break;
                    }
                    return;
                }
            }

            @Override // com.github.catvod.spider.merge.AbstractC0099V3
            public void onFailure(Call call, Exception exc) {
                int iM830 = C0174.m830();
                int i5 = 1616;
                while (true) {
                    i5 ^= 1633;
                    switch (i5) {
                        case 14:
                        case 49:
                            i5 = iM830 <= 0 ? 1709 : 1678;
                        case 204:
                            System.out.println(C0180.m852("p1nCiYLdtAED2ncpVR3c"));
                            break;
                        case 239:
                            break;
                    }
                    return;
                }
            }

            @Override // com.github.catvod.spider.merge.AbstractC0099V3
            public String onResponse(String str2) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    JSONObject jSONObject2 = new JSONObject(C0152vp.m728W(this.f181QU.m73W(jSONObject.optString(C0178.m845(f847short, 1, 4, 2386)), jSONObject.optInt(C0175.m834(f847short, 5, 1, 2674)), jSONObject.optInt(C0178.m845(f847short, 6, 1, 2659))), C0118ga.m604q(jSONObject.getString(C0180.m851(f847short, 0, 1, 1224)), C0118ga.f677xC).substring(0, 16), C0118ga.m604q(this.f182xC, C0118ga.f677xC).substring(0, 16)));
                    this.f181QU.f170Mo = C0118ga.m604q(jSONObject2.optString(C0169.m809(f847short, 7, 3, 1017)), C0118ga.f677xC).substring(0, 16);
                    this.f181QU.f174i = C0118ga.m604q(jSONObject2.optString(C0175.m834(f847short, 10, 2, 2750)), C0118ga.f677xC).substring(0, 16);
                    this.f181QU.f175q = jSONObject2.optString(C0172.m820(f847short, 12, 4, 2214));
                    this.f181QU.f173W = jSONObject2.optString(C0177.m841(f847short, 16, 6, 1124));
                } catch (Exception e) {
                    int i5 = 1616;
                    while (true) {
                        i5 ^= 1633;
                        switch (i5) {
                            case 14:
                                break;
                            case 49:
                                i5 = 1647;
                                break;
                        }
                    }
                }
                return str2;
            }
        });
        int iM864 = C0183.m864();
        int i5 = 48891;
        while (true) {
            i5 ^= 48908;
            switch (i5) {
                case 22:
                case 53:
                    break;
                case 503:
                    i5 = iM864 <= 0 ? 49635 : 48953;
                case 32495:
                    System.out.println(Float.decode(C0172.m823("oWXMX4Ri8K5suomd5MceXBJ8R3e")));
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:48:0x0162. Please report as an issue. */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException, NumberFormatException {
        JSONArray jSONArray;
        int i;
        String strM816 = C0171.m816(f845short, 289, 11, 380);
        String strM849 = C0179.m849(f845short, 300, 7, 2581);
        String strM801 = C0166.m801(f845short, 307, 8, 1636);
        String strM836 = C0176.m836(f845short, 315, 6, 670);
        String strM809 = C0169.m809(f845short, 321, 4, 3030);
        try {
            boolean zIsEmpty = this.f175q.isEmpty();
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                    case 49:
                        i2 = zIsEmpty ? 1709 : 1678;
                    case 204:
                        boolean zContains = this.f169MH.contains(C0175.m834(f845short, 325, 6, 969));
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = !zContains ? 1833 : 1802;
                                case 54:
                                case 471:
                                    break;
                                case 500:
                                    m70Mo();
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                i4 = 48674;
                                                continue;
                                            case 47483:
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                            }
                        }
                        break;
                    case 239:
                        break;
                }
            }
            m76se();
            int i5 = Integer.parseInt(str2);
            int i6 = 48767;
            while (true) {
                i6 ^= 48784;
                switch (i6) {
                    case 14:
                    case 45:
                        break;
                    case 76:
                        i5 = 1;
                        break;
                    case 239:
                        i6 = i5 == 0 ? 48860 : 48829;
                }
            }
            String str3 = this.f175q + C0179.m849(f845short, 331, 21, 2699) + str + C0176.m836(f845short, 352, 33, 2639) + str2 + C0177.m841(f845short, 385, 7, 1573) + 18;
            JSONArray jSONArray2 = new JSONArray();
            String strM484FN = C0106ZJ.m484FN(str3, m69MH(""));
            boolean zContains2 = strM484FN.contains(strM809);
            String strM814 = C0170.m814(f845short, 392, 4, 2050);
            int i7 = 48891;
            while (true) {
                i7 ^= 48908;
                switch (i7) {
                    case 22:
                    case 53:
                        jSONArray = new JSONObject(C0152vp.m728W(strM484FN, this.f170Mo, this.f174i)).optJSONObject(strM814).getJSONArray(strM809);
                        break;
                    case 503:
                        i7 = zContains2 ? 49635 : 48953;
                    case 32495:
                        jSONArray = new JSONObject(strM484FN).optJSONObject(strM814).getJSONArray(strM809);
                        int i8 = 49666;
                        while (true) {
                            i8 ^= 49683;
                            switch (i8) {
                                case 17:
                                    i8 = 49697;
                                    continue;
                                case 50:
                                    break;
                                default:
                                    continue;
                            }
                        }
                }
            }
            int i9 = 0;
            while (true) {
                int length = jSONArray.length();
                int i10 = 49790;
                while (true) {
                    i10 ^= 49807;
                    switch (i10) {
                        case 18:
                        case 51:
                            break;
                        case 84:
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(strM836, jSONObjectOptJSONObject.optString(strM836));
                            jSONObject.put(strM801, jSONObjectOptJSONObject.optString(strM801));
                            jSONObject.put(strM849, jSONObjectOptJSONObject.optString(strM849));
                            String strOptString = jSONObjectOptJSONObject.optString(strM816);
                            boolean zEquals = strOptString.equals(C0177.m841(f845short, 396, 4, 3136));
                            int i11 = 49914;
                            while (true) {
                                i11 ^= 49931;
                                switch (i11) {
                                    case 497:
                                        i11 = zEquals ? 50658 : 50627;
                                    case 1711:
                                    case 1736:
                                        break;
                                    case 1769:
                                        strOptString = "";
                                        break;
                                }
                            }
                            jSONObject.put(strM816, strOptString);
                            jSONArray2.put(jSONObject);
                            int i12 = i9 + 1;
                            int i13 = 50689;
                            while (true) {
                                i13 ^= 50706;
                                switch (i13) {
                                    case 19:
                                        i13 = 50720;
                                        break;
                                    case 50:
                                        break;
                                }
                            }
                            i9 = i12;
                            break;
                        case 241:
                            i10 = i9 < length ? 49883 : 49852;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(C0180.m851(f845short, 400, 4, 1271), i5);
                    int length2 = jSONArray2.length();
                    int i14 = 50813;
                    while (true) {
                        i14 ^= 50830;
                        switch (i14) {
                            case 18:
                                break;
                            case 53:
                                i = i5;
                                break;
                            case 243:
                                if (length2 != 18) {
                                    break;
                                } else {
                                    i14 = 51557;
                                }
                            case 4075:
                                i = i5 + 1;
                                break;
                            default:
                                continue;
                        }
                        i14 = 50875;
                    }
                    jSONObject2.put(C0171.m816(f845short, 404, 9, 2415), i);
                    jSONObject2.put(C0177.m841(f845short, 413, 5, 1551), 18);
                    jSONObject2.put(C0171.m816(f845short, 418, 5, 828), Integer.MAX_VALUE);
                    jSONObject2.put(strM809, jSONArray2);
                    return jSONObject2.toString();
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x02a5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:69:0x0313. Please report as an issue. */
    public String detailContent(List<String> list) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        String strM801 = C0166.m801(f845short, 423, 11, 1330);
        String strM814 = C0170.m814(f845short, 434, 3, 2623);
        String strM834 = C0175.m834(f845short, 437, 11, 2595);
        String strM866 = C0183.m866(f845short, 448, 12, 2372);
        String strM8142 = C0170.m814(f845short, 460, 9, 1489);
        String strM820 = C0172.m820(f845short, 469, 4, 1667);
        String strM861 = C0182.m861(f845short, 473, 8, 3135);
        String strM8143 = C0170.m814(f845short, 481, 8, 2852);
        String strM828 = C0174.m828(f845short, 489, 7, 1923);
        String strM8202 = C0172.m820(f845short, 496, 8, 2175);
        String strM845 = C0178.m845(f845short, 504, 6, 2672);
        String strM841 = C0177.m841(f845short, 510, 4, 1483);
        try {
            boolean zIsEmpty = this.f175q.isEmpty();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = zIsEmpty ? 1709 : 1678;
                    case 204:
                        boolean zContains = this.f169MH.contains(C0177.m841(f845short, 514, 6, 2391));
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = !zContains ? 1833 : 1802;
                                case 54:
                                case 471:
                                    break;
                                case 500:
                                    m70Mo();
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                i3 = 48674;
                                                continue;
                                            case 47483:
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                            }
                        }
                        break;
                    case 239:
                        break;
                }
            }
            m76se();
            Init.m46lj();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            String str = this.f175q + C0165.m798(f845short, 520, 30, 3095) + list.get(0);
            JSONObject jSONObject = new JSONObject();
            String strM484FN = C0106ZJ.m484FN(str, m69MH(""));
            boolean zContains2 = strM484FN.contains(strM841);
            String strM836 = C0176.m836(f845short, 550, 4, 2097);
            int i4 = 48767;
            while (true) {
                i4 ^= 48784;
                switch (i4) {
                    case 14:
                    case 45:
                        jSONObjectOptJSONObject = new JSONObject(C0152vp.m728W(strM484FN, this.f170Mo, this.f174i)).optJSONObject(strM836);
                        break;
                    case 76:
                        JSONObject jSONObjectOptJSONObject2 = new JSONObject(strM484FN).optJSONObject(strM836);
                        int i5 = 48891;
                        while (true) {
                            i5 ^= 48908;
                            switch (i5) {
                                case 22:
                                    jSONObjectOptJSONObject = jSONObjectOptJSONObject2;
                                    break;
                                case 503:
                                    i5 = 48922;
                                    continue;
                                default:
                                    continue;
                            }
                        }
                    case 239:
                        i4 = zContains2 ? 48860 : 48829;
                }
            }
            jSONObject.put(strM845, jSONObjectOptJSONObject.optString(strM845));
            jSONObject.put(strM8202, jSONObjectOptJSONObject.optString(strM8202));
            jSONObject.put(strM828, jSONObjectOptJSONObject.optString(strM828));
            jSONObject.put(C0168.m805(f845short, 554, 9, 1113), jSONObjectOptJSONObject.optString(C0174.m828(f845short, 563, 9, 2928)));
            jSONObject.put(strM8143, jSONObjectOptJSONObject.optString(strM8143));
            jSONObject.put(strM861, jSONObjectOptJSONObject.optString(strM861));
            String strOptString = jSONObjectOptJSONObject.optString(C0179.m849(f845short, 572, 12, 483));
            boolean zEquals = strOptString.equals(strM820);
            int i6 = 49666;
            while (true) {
                i6 ^= 49683;
                switch (i6) {
                    case 17:
                        i6 = zEquals ? 49759 : 49728;
                    case 50:
                    case 76:
                        strOptString = "";
                        break;
                    case 83:
                        break;
                }
            }
            jSONObject.put(C0182.m861(f845short, 584, 11, 1594), strOptString);
            jSONObject.put(strM8142, jSONObjectOptJSONObject.optString(strM8142));
            jSONObject.put(strM866, jSONObjectOptJSONObject.optString(strM866));
            String strOptString2 = jSONObjectOptJSONObject.optString(strM834);
            boolean zEquals2 = strOptString2.equals(strM820);
            int i7 = 49790;
            while (true) {
                i7 ^= 49807;
                switch (i7) {
                    case 18:
                    case 51:
                        break;
                    case 84:
                        strOptString2 = "";
                        int i8 = 49914;
                        while (true) {
                            i8 ^= 49931;
                            switch (i8) {
                                case 497:
                                    i8 = 50596;
                                    continue;
                                case 1711:
                                    break;
                                default:
                                    continue;
                            }
                        }
                    case 241:
                        i7 = zEquals2 ? 49883 : 49852;
                }
            }
            jSONObject.put(strM834, C0168.m805(f845short, 595, 16, 1115) + strOptString2);
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject(C0176.m836(f845short, 611, 13, 1570));
            Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
            while (true) {
                boolean zHasNext = itKeys.hasNext();
                int i9 = 50689;
                while (true) {
                    i9 ^= 50706;
                    switch (i9) {
                        case 19:
                            i9 = zHasNext ? 50782 : 50751;
                        case 45:
                            break;
                        case 50:
                        case 76:
                            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject(itKeys.next());
                            String strTrim = jSONObjectOptJSONObject4.optJSONObject(strM801).optString(C0172.m820(f845short, 624, 4, 1333)).trim();
                            String strTrim2 = jSONObjectOptJSONObject4.optJSONObject(strM801).optString(C0177.m841(f845short, 628, 4, 2633)).trim();
                            arrayList2.add(strTrim);
                            JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject4.optJSONObject(C0171.m816(f845short, 632, 4, 432));
                            ArrayList arrayList3 = new ArrayList();
                            Iterator<String> itKeys2 = jSONObjectOptJSONObject5.keys();
                            while (true) {
                                boolean zHasNext2 = itKeys2.hasNext();
                                int i10 = 50813;
                                while (true) {
                                    i10 ^= 50830;
                                    switch (i10) {
                                        case 18:
                                        case 53:
                                            break;
                                        case 243:
                                            i10 = zHasNext2 ? 51557 : 50875;
                                        case 4075:
                                            JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject5.optJSONObject(itKeys2.next());
                                            String strOptString3 = jSONObjectOptJSONObject6.optString(C0171.m816(f845short, 636, 3, 1917));
                                            arrayList3.add(jSONObjectOptJSONObject6.optString(C0182.m861(f845short, 639, 4, 1625)) + C0166.m801(f845short, 643, 1, 1194) + strOptString3 + C0170.m814(f845short, 644, 1, 1495) + strTrim2);
                                            int i11 = 51588;
                                            while (true) {
                                                i11 ^= 51605;
                                                switch (i11) {
                                                    case 17:
                                                        i11 = 51619;
                                                        break;
                                                    case 54:
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                    arrayList.add(TextUtils.join(C0177.m841(f845short, 645, 1, 2834), arrayList3));
                                    int i12 = 51712;
                                    while (true) {
                                        i12 ^= 51729;
                                        switch (i12) {
                                            case 17:
                                                i12 = 51743;
                                                break;
                                        }
                                    }
                                }
                            }
                            break;
                    }
                    String strJoin = TextUtils.join(strM814, arrayList2);
                    String strJoin2 = TextUtils.join(strM814, arrayList);
                    jSONObject.put(C0166.m801(f845short, 646, 13, 993), strJoin);
                    jSONObject.put(C0177.m841(f845short, 659, 12, 1158), strJoin2);
                    JSONObject jSONObject2 = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    jSONObject2.put(strM841, jSONArray);
                    return jSONObject2.toString();
                }
            }
        } catch (JSONException e) {
            RuntimeException runtimeException = new RuntimeException(e);
            int i13 = 51836;
            while (true) {
                i13 ^= 51853;
                switch (i13) {
                    case 241:
                        i13 = 52518;
                        break;
                    case 1963:
                        int i14 = 52611;
                        while (true) {
                            i14 ^= 52628;
                            switch (i14) {
                                case 23:
                                    i14 = 52642;
                                    break;
                                case 54:
                                    throw runtimeException;
                            }
                        }
                        break;
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x00e2. Please report as an issue. */
    public String homeContent(boolean z) throws JSONException {
        JSONArray jSONArray;
        String strM836 = C0176.m836(f845short, 671, 7, 1384);
        String strM8362 = C0176.m836(f845short, 678, 9, 3144);
        String strM841 = C0177.m841(f845short, 687, 8, 833);
        try {
            boolean zIsEmpty = this.f175q.isEmpty();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = zIsEmpty ? 1709 : 1678;
                    case 204:
                        boolean zContains = this.f169MH.contains(C0179.m849(f845short, 695, 6, 1548));
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    if (zContains) {
                                        break;
                                    } else {
                                        i2 = 1833;
                                    }
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    m70Mo();
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
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                        break;
                    case 239:
                        break;
                }
            }
            m76se();
            String strM484FN = C0106ZJ.m484FN(this.f175q + C0171.m816(f845short, 701, 21, 1951), m69MH(""));
            boolean zContains2 = strM484FN.contains(strM841);
            String strM866 = C0183.m866(f845short, 722, 4, 1000);
            int i4 = 48767;
            while (true) {
                i4 ^= 48784;
                switch (i4) {
                    case 14:
                    case 45:
                        jSONArray = new JSONObject(C0152vp.m728W(strM484FN, this.f170Mo, this.f174i)).optJSONObject(strM866).getJSONArray(strM841);
                        break;
                    case 76:
                        JSONArray jSONArray2 = new JSONObject(strM484FN).optJSONObject(strM866).getJSONArray(strM841);
                        int i5 = 48891;
                        while (true) {
                            i5 ^= 48908;
                            switch (i5) {
                                case 22:
                                    jSONArray = jSONArray2;
                                    break;
                                case 503:
                                    i5 = 48922;
                                    continue;
                                default:
                                    continue;
                            }
                        }
                    case 239:
                        i4 = zContains2 ? 48860 : 48829;
                }
            }
            JSONArray jSONArray3 = new JSONArray();
            int i6 = 0;
            while (true) {
                int length = jSONArray.length();
                int i7 = 49666;
                while (true) {
                    i7 ^= 49683;
                    switch (i7) {
                        case 17:
                            i7 = i6 < length ? 49759 : 49728;
                        case 50:
                        case 76:
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i6);
                            String strOptString = jSONObjectOptJSONObject.optString(strM8362);
                            String strOptString2 = jSONObjectOptJSONObject.optString(strM836);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(strM836, strOptString2);
                            jSONObject.put(strM8362, strOptString);
                            jSONArray3.put(jSONObject);
                            int i8 = i6 + 1;
                            int i9 = 49790;
                            while (true) {
                                i9 ^= 49807;
                                switch (i9) {
                                    case 18:
                                        break;
                                    case 241:
                                        i9 = 49821;
                                        break;
                                }
                            }
                            i6 = i8;
                            break;
                        case 83:
                            break;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(C0177.m841(f845short, 726, 5, 1653), jSONArray3);
                    return jSONObject2.toString();
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x00fb. Please report as an issue. */
    public String homeVideoContent() throws JSONException {
        JSONArray jSONArray;
        String strM828 = C0174.m828(f845short, 731, 11, 1649);
        String strM849 = C0179.m849(f845short, 742, 7, 390);
        String strM8282 = C0174.m828(f845short, 749, 8, 2014);
        String strM845 = C0178.m845(f845short, 757, 6, 852);
        String strM8492 = C0179.m849(f845short, 763, 8, 2344);
        try {
            boolean zIsEmpty = this.f175q.isEmpty();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = zIsEmpty ? 1709 : 1678;
                    case 204:
                        boolean zContains = this.f169MH.contains(C0176.m836(f845short, 771, 6, 1577));
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = !zContains ? 1833 : 1802;
                                case 54:
                                case 471:
                                    break;
                                case 500:
                                    m70Mo();
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                i3 = 48674;
                                                continue;
                                            case 47483:
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                            }
                        }
                        break;
                    case 239:
                        break;
                }
            }
            m76se();
            JSONArray jSONArray2 = new JSONArray();
            String strM484FN = C0106ZJ.m484FN(this.f175q + C0180.m851(f845short, 777, 39, 1794), m69MH(""));
            boolean zContains2 = strM484FN.contains(strM8492);
            String strM801 = C0166.m801(f845short, 816, 4, 3180);
            int i4 = 48767;
            while (true) {
                i4 ^= 48784;
                switch (i4) {
                    case 14:
                    case 45:
                        jSONArray = new JSONObject(C0152vp.m728W(strM484FN, this.f170Mo, this.f174i)).getJSONArray(strM801).optJSONObject(2).getJSONArray(strM8492);
                        break;
                    case 76:
                        jSONArray = new JSONObject(strM484FN).getJSONArray(strM801).optJSONObject(2).getJSONArray(strM8492);
                        int i5 = 48891;
                        while (true) {
                            i5 ^= 48908;
                            switch (i5) {
                                case 22:
                                    break;
                                case 503:
                                    i5 = 48922;
                                    continue;
                                default:
                                    continue;
                            }
                        }
                    case 239:
                        i4 = zContains2 ? 48860 : 48829;
                }
            }
            int i6 = 0;
            while (true) {
                int length = jSONArray.length();
                int i7 = 49666;
                while (true) {
                    i7 ^= 49683;
                    switch (i7) {
                        case 17:
                            i7 = i6 < length ? 49759 : 49728;
                        case 50:
                        case 76:
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i6);
                            String strOptString = jSONObjectOptJSONObject.optString(strM845);
                            String strOptString2 = jSONObjectOptJSONObject.optString(strM8282);
                            String strOptString3 = jSONObjectOptJSONObject.optString(strM849);
                            String strOptString4 = jSONObjectOptJSONObject.optString(strM828);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(strM845, strOptString);
                            jSONObject.put(strM8282, strOptString2);
                            jSONObject.put(strM849, strOptString3);
                            jSONObject.put(strM828, strOptString4);
                            jSONArray2.put(jSONObject);
                            int i8 = i6 + 1;
                            int i9 = 49790;
                            while (true) {
                                i9 ^= 49807;
                                switch (i9) {
                                    case 18:
                                        break;
                                    case 241:
                                        i9 = 49821;
                                        break;
                                }
                            }
                            i6 = i8;
                            break;
                        case 83:
                            break;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(C0177.m841(f845short, 820, 4, 888), jSONArray2);
                    return jSONObject2.toString();
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context);
        this.f169MH = str;
        this.f177u = C0154wT.m739xC(16);
        int iM853 = C0180.m853();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = iM853 <= 0 ? 1709 : 1678;
                case 204:
                    System.out.println(Long.valueOf(C0170.m815("VXSJvOoEyVinz2J")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public String playerContent(String str, String str2, List<String> list) throws JSONException {
        String str3;
        JSONObject jSONObject;
        String strM856 = C0181.m856(f845short, 824, 10, 2437);
        try {
            String strM484FN = C0106ZJ.m484FN(this.f168FN + C0181.m856(f845short, 834, 26, 530), m69MH(""));
            boolean zContains = strM484FN.contains(strM856);
            String strM841 = C0177.m841(f845short, 860, 4, 1257);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = zContains ? 1709 : 1678;
                    case 204:
                        this.f176se = new JSONObject(strM484FN).optJSONObject(strM841).getJSONArray(strM856);
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = 1771;
                                    continue;
                                case 54:
                                    break;
                                default:
                                    continue;
                            }
                        }
                    case 239:
                        this.f176se = new JSONObject(C0152vp.m728W(strM484FN, this.f170Mo, this.f174i)).optJSONObject(strM841).getJSONArray(strM856);
                        break;
                }
            }
            String[] strArrSplit = str2.split(C0175.m834(f845short, 864, 1, 663));
            String str4 = strArrSplit[1];
            String str5 = strArrSplit[0];
            String strM74i = m74i(str4);
            int i3 = 1864;
            while (true) {
                i3 ^= 1881;
                switch (i3) {
                    case 17:
                        i3 = strM74i != null ? 48736 : 48705;
                    case 47384:
                        str3 = this.f173W;
                        break;
                    case 47417:
                        int i4 = 48767;
                        while (true) {
                            i4 ^= 48784;
                            switch (i4) {
                                case 14:
                                    str3 = strM74i;
                                    break;
                                case 239:
                                    i4 = 48798;
                                    continue;
                                default:
                                    continue;
                            }
                        }
                    case 47483:
                }
            }
            boolean zContains2 = str3.contains(C0171.m816(f845short, 865, 4, 3258));
            String strM805 = C0168.m805(f845short, 869, 5, 2207);
            String strM866 = C0183.m866(f845short, 874, 3, 2538);
            int i5 = 48891;
            while (true) {
                i5 ^= 48908;
                switch (i5) {
                    case 22:
                    case 53:
                        boolean zContains3 = str5.contains(C0180.m851(f845short, 878, 4, 2858));
                        int i6 = 50689;
                        while (true) {
                            i6 ^= 50706;
                            switch (i6) {
                                case 19:
                                    i6 = !zContains3 ? 50782 : 50751;
                                case 45:
                                    break;
                                case 50:
                                case 76:
                                    boolean zContains4 = str5.contains(C0171.m816(f845short, 882, 3, 3051));
                                    int i7 = 50813;
                                    while (true) {
                                        i7 ^= 50830;
                                        switch (i7) {
                                            case 18:
                                            case 53:
                                                break;
                                            case 243:
                                                i7 = zContains4 ? 51557 : 50875;
                                            case 4075:
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(strM866, str5);
                        jSONObject2.put(strM805, 0);
                        return jSONObject2.toString();
                    case 503:
                        i5 = zContains2 ? 49635 : 48953;
                    case 32495:
                        String strM484FN2 = C0106ZJ.m484FN(str3 + str5, m69MH(""));
                        boolean zContains5 = strM484FN2.contains(C0172.m820(f845short, 877, 1, 1057));
                        int i8 = 49666;
                        while (true) {
                            i8 ^= 49683;
                            switch (i8) {
                                case 17:
                                    if (zContains5) {
                                        break;
                                    } else {
                                        i8 = 49759;
                                    }
                                case 50:
                                    break;
                                case 76:
                                    JSONObject jSONObject3 = new JSONObject(C0152vp.m728W(strM484FN2, this.f170Mo, this.f174i));
                                    int i9 = 49790;
                                    while (true) {
                                        i9 ^= 49807;
                                        switch (i9) {
                                            case 18:
                                                jSONObject = jSONObject3;
                                                break;
                                            case 241:
                                                i9 = 49821;
                                                break;
                                        }
                                    }
                                    break;
                                case 83:
                                    jSONObject = new JSONObject(strM484FN2);
                                    break;
                                default:
                                    continue;
                            }
                            i8 = 49728;
                        }
                        boolean zHas = jSONObject.has(strM866);
                        int i10 = 49914;
                        while (true) {
                            i10 ^= 49931;
                            switch (i10) {
                                case 497:
                                    if (!zHas) {
                                        break;
                                    } else {
                                        i10 = 50658;
                                    }
                                case 1711:
                                    break;
                                case 1736:
                                    String strOptString = jSONObject.optJSONObject(strM841).optString(strM866);
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put(strM866, strOptString);
                                    jSONObject4.put(strM805, 0);
                                    return jSONObject4.toString();
                                case 1769:
                                    String strOptString2 = jSONObject.optString(strM866);
                                    JSONObject jSONObject5 = new JSONObject();
                                    jSONObject5.put(strM866, strOptString2);
                                    jSONObject5.put(strM805, 0);
                                    return jSONObject5.toString();
                                default:
                                    continue;
                            }
                            i10 = 50627;
                        }
                        break;
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x010d. Please report as an issue. */
    public String searchContent(String str, boolean z) throws JSONException {
        JSONArray jSONArray;
        String strM809 = C0169.m809(f845short, 885, 11, 2837);
        String strM828 = C0174.m828(f845short, 896, 7, 3188);
        String strM836 = C0176.m836(f845short, 903, 8, 1248);
        String strM820 = C0172.m820(f845short, 911, 6, 1784);
        String strM8202 = C0172.m820(f845short, 917, 4, 1640);
        try {
            JSONArray jSONArray2 = new JSONArray();
            boolean zIsEmpty = this.f175q.isEmpty();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = zIsEmpty ? 1709 : 1678;
                    case 204:
                        boolean zContains = this.f169MH.contains(C0175.m834(f845short, 921, 6, 3143));
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = !zContains ? 1833 : 1802;
                                case 54:
                                case 471:
                                    break;
                                case 500:
                                    m70Mo();
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                i3 = 48674;
                                                continue;
                                            case 47483:
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                            }
                        }
                        break;
                    case 239:
                        break;
                }
            }
            m76se();
            String strM484FN = C0106ZJ.m484FN(this.f175q + C0181.m856(f845short, 927, 19, 379) + URLEncoder.encode(str) + C0175.m834(f845short, 946, 16, 1712), m69MH(""));
            boolean zContains2 = strM484FN.contains(strM8202);
            String strM8282 = C0174.m828(f845short, 962, 4, 2144);
            int i4 = 48767;
            while (true) {
                i4 ^= 48784;
                switch (i4) {
                    case 14:
                    case 45:
                        jSONArray = new JSONObject(C0152vp.m728W(strM484FN, this.f170Mo, this.f174i)).optJSONObject(strM8282).getJSONArray(strM8202);
                        break;
                    case 76:
                        jSONArray = new JSONObject(strM484FN).optJSONObject(strM8282).getJSONArray(strM8202);
                        int i5 = 48891;
                        while (true) {
                            i5 ^= 48908;
                            switch (i5) {
                                case 22:
                                    break;
                                case 503:
                                    i5 = 48922;
                                    continue;
                                default:
                                    continue;
                            }
                        }
                    case 239:
                        i4 = zContains2 ? 48860 : 48829;
                }
            }
            int i6 = 0;
            while (true) {
                int length = jSONArray.length();
                int i7 = 49666;
                while (true) {
                    i7 ^= 49683;
                    switch (i7) {
                        case 17:
                            i7 = i6 < length ? 49759 : 49728;
                        case 50:
                        case 76:
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i6);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(strM820, jSONObjectOptJSONObject.optString(strM820));
                            jSONObject.put(strM836, jSONObjectOptJSONObject.optString(strM836));
                            jSONObject.put(strM828, jSONObjectOptJSONObject.optString(strM828));
                            String strOptString = jSONObjectOptJSONObject.optString(strM809);
                            boolean zEquals = strOptString.equals(C0180.m851(f845short, 966, 4, 3000));
                            int i8 = 49790;
                            while (true) {
                                i8 ^= 49807;
                                switch (i8) {
                                    case 18:
                                    case 51:
                                        break;
                                    case 84:
                                        strOptString = "";
                                        break;
                                    case 241:
                                        i8 = zEquals ? 49883 : 49852;
                                }
                            }
                            jSONObject.put(strM809, strOptString);
                            jSONArray2.put(jSONObject);
                            int i9 = i6 + 1;
                            int i10 = 49914;
                            while (true) {
                                i10 ^= 49931;
                                switch (i10) {
                                    case 497:
                                        i10 = 50596;
                                        break;
                                    case 1711:
                                        break;
                                }
                            }
                            i6 = i9;
                            break;
                        case 83:
                            break;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(strM8202, jSONArray2);
                    return jSONObject2.toString();
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
