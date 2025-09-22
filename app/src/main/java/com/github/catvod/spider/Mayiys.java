package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.C0165;
import com.github.catvod.parser.C0166;
import com.github.catvod.spider.merge.C0106ZJ;
import com.github.catvod.spider.merge.C0114dC;
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
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class Mayiys extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f844short = {586, 598, 598, 594, 536, 525, 525, 597, 597, 597, 524, 592, 600, 603, 593, 524, 577, 577, 564, 560, 574, 541, 564, 568, 585, 574, 570, 554, 520, 574, 554, 560, 539, 586, 573, 552, 572, 571, 568, 552, 556, 568, 568, 589, 574, 565, 568, 573, 570, 571, 529, 526, 562, 571, 542, 552, 570, 568, 533, 528, 565, 535, 535, 567, 512, 587, 528, 553, 540, 539, 554, 528, 526, 522, 543, 554, 533, 538, 584, 541, 559, 587, 542, 512, 552, 547, 531, 571, 559, 559, 568, 568, 570, 564, 565, 532, 575, 536, 589, 522, 527, 515, 575, 587, 545, 522, 564, 587, 591, 541, 552, 587, 568, 520, 545, 531, 573, 560, 564, 524, 523, 573, 535, 577, 572, 543, 523, 540, 527, 573, 564, 524, 520, 588, 557, 574, 520, 560, 575, 570, 536, 536, 526, 572, 544, 541, 515, 558, 552, 575, 572, 586, 560, 564, 532, 535, 513, 572, 530, 513, 528, 540, 572, 562, 590, 565, 523, 585, 534, 585, 571, 531, 554, 547, 588, 567, 565, 538, 536, 557, 535, 534, 558, 565, 585, 598, 594, 557, 534, 577, 586, 590, 528, 588, 545, 553, 529, 515, 536, 547, 558, 561, 512, 589, 541, 576, 574, 594, 568, 536, 563, 576, 564, 563, 573, 568, 586, 575, 571, 555, 588, 570, 552, 590, 527, 528, 584, 526, 560, 571, 568, 526, 580, 580, 2625, 2663, 2673, 2662, 2617, 2645, 2675, 2673, 2682, 2656, 2625, 2629, 2630, 2650, 2650, 2654, 2561, 2586, 2560, 2583, 2560, 2589, 1971, 1962, 1953, 1946, 1975, 1952, 1960, 1956, 1975, 1966, 1974, 2283, 2290, 2297, 2242, 2285, 2292, 2302, 2956, 2953, 2957, 2953, 2964, 284, 261, 270, 309, 260, 267, 263, 271, 2274, 2299, 2288, 2251, 2301, 2288, 3048, 3065, 3071, 3069, 455, 476, 455, 466, 479, 1116, 1113, 1091, 1092, 501, 489, 493, 510, 1584, 1597, 1588, 1569, 3140, 3159, 3136, 3140, 1361, 1286, 1359, 1361, 1288, 1359, 1361, 1299, 1311, 1309, 1322, 1287, 1294, 1307, 1293, 1361, 1306, 1307, 1290, 1311, 1303, 1298, 1021, 929, 942, 931, 945, 945, 950, 955, 946, 935, 1023, 406, 465, 450, 469, 465, 397, 1008, 943, 947, 951, 932, 1003, 2668, 2622, 2611, 2618, 2607, 2595, 2606, 2679, 1677, 1755, 1738, 1740, 1742, 1686, 2631, 2573, 2568, 2572, 2568, 2581, 2652, 2642, 2641, 508, 425, 435, 445, 436, 487, 2672, 2617, 2597, 2667, 2663, 2073, 2076, 2057, 2076, 1949, 1932, 1930, 1928, 1934, 1922, 1944, 1923, 1945, 1773, 2746, 2746, 2746, 1124, 1149, 1142, 1101, 1137, 1149, 1148, 1126, 1143, 1148, 1126, 1418, 1427, 1432, 1443, 1437, 1439, 1416, 1427, 1422, 2209, 2232, 2227, 2184, 2213, 2226, 2234, 2230, 2213, 2236, 2212, 2311, 2334, 2325, 2350, 2320, 2307, 2324, 2320, 2069, 2060, 2055, 2108, 2074, 2054, 2050, 2065, 1749, 1740, 1735, 1788, 1747, 1738, 1728, 2976, 3001, 2994, 2953, 3000, 2999, 3003, 2995, 2413, 2420, 2431, 2372, 2418, 2431, 465, 390, 463, 465, 392, 463, 465, 392, 401, 410, 465, 410, 411, 394, 415, 407, 402, 397, 449, 392, 401, 410, 407, 410, 397, 394, 396, 451, 407, 450, 472, 470, 479, 396, 892, 821, 809, 871, 875, -29286, 19725, -650, 1192, 1197, 1208, 1197, 2907, 2902, 2911, 2890, 2928, 2881, 2894, 2882, 2890, 2970, 2947, 2952, 2995, 2959, 2944, 2957, 2975, 2975, 25293, 27148, 23114, 21029, 22721, 22756, -31600, -2395, -32162, 23382, 18339, 22266, 23166, -27842, -2392, -2392, 1835, 1842, 1849, 1794, 1837, 1841, 1852, 1828, 1794, 1841, 1844, 1838, 1833, 879, 872, 886, 873, 2242, 2270, 2259, 2251, 2263, 2240, 2285, 2267, 2268, 2260, 2269, 2598, 2621, 2618, 2594, 948, 955, 951, 959, 1763, 1783, 1770, 1768, 1434, 2868, 2867, 2861, 996, 832, 897, 920, 915, 936, 903, 923, 918, 910, 936, 913, 901, 920, 922, 2243, 2266, 2257, 2282, 2245, 2265, 2260, 2252, 2282, 2240, 2247, 2265, 1505, 1508, 1534, 1529, 3163, 3162, 3144, 3107, 3126, 1324, 1313, 1320, 1341, 1287, 1329, 1340, 2370, 2383, 2374, 2387, 2409, 2392, 2391, 2395, 2387, 1814, 1857, 1800, 1814, 1871, 1800, 1814, 1876, 1880, 1882, 1901, 1856, 1865, 1884, 1866, 1814, 1869, 1856, 1865, 1884, 1866, 1798, 1866, 1872, 1886, 1879, 1796, 1995, 1922, 1950, 2000, 2012, -31477, 17820, -2585, 805, 800, 821, 800, 2029, 2024, 2034, 2037, 29170, 23478, -29404, -28877, 1344, 1359, 1346, 1360, 1360, 492, 501, 510, 453, 488, 511, 503, 507, 488, 497, 489, 2976, 3001, 2994, 2953, 2982, 3007, 2997, 1698, 1723, 1712, 1675, 1722, 1717, 1721, 1713, 1954, 1979, 1968, 1931, 1981, 1968, 453, 448, 474, 477, 733, 650, 707, 733, 644, 707, 733, 640, 663, 657, 669, 671, 671, 663, 668, 662, 733, 640, 663, 657, 669, 671, 671, 663, 668, 662, 702, 667, 641, 646, 717, 642, 659, 661, 663, 719, 707, 724, 670, 667, 671, 667, 646, 719, 710, 724, 641, 667, 661, 668, 719, 666, 723, 719, 641, 653, 2719, 2714, 2703, 2714, 2947, 2970, 2961, 2986, 2969, 2972, 2950, 2945, 3140, 3172, 2500, 2451, 2522, 2500, 2461, 2522, 2500, 2442, 2459, 2459, 2500, 2444, 2446, 2463, 2488, 2516, 2436, 2456, 2518, 2522, 2509, 2461, 2446, 2457, 2456, 2434, 2436, 2437, 2518, 2522, 2515, 2521, 2509, 2439, 2446, 2461, 2446, 2439, 2518, 2522, 2527, 1103, 1098, 1119, 1098, 1377, 1827, 1795, 2518, 2513, 2511, 2889, 2846, 2903, 2889, 2832, 2903, 2889, 2823, 2824, 2823, 2826, 2847, 2837, 2831, 2837, 2889, 2824, 2819, 2833, 2855, 2824, 2823, 2826, 2847, 2837, 2831, 2837, 2905, 2835, 2836, 2826, 2907, 2976, 3040, 3060, 3049, 3051, 3003, 1229, 1181, 1166, 1177, 1176, 1154, 1156, 1157, 1238, 1242, 1235, 1241, 1229, 1176, 1152, 1154, 1179, 1238, 1243, 1229, 1183, 1154, 1158, 1166, 1238, 843, 798, 772, 778, 771, 848, 1881, 1880, 1866, 1825, 1844, 2398, 2327, 2315, 2373, 2377, 1457, 1460, 1441, 1460, 1696, 402, 490, 3294, 3279, 3292, 3293, 3275, 743, 766, 757, 718, 739, 756, 764, 752, 739, 762, 738, 2444, 2453, 2462, 2469, 2442, 2451, 2457, 3180, 3189, 3198, 3141, 3188, 3195, 3191, 3199, 2441, 2448, 2459, 2464, 2454, 2459, 1425, 1428, 1422, 1417, 3148, 3097, 3098, 3097, 3103, 3096, 
    2396, 2315, 2394, 2318, 2396, 2395, 2397, 2397, 2313, 2397, 2394, 2318, 2313, 2394, 2314, 2391, 2318, 2313, 2392, 2396, 2394, 2397, 2318, 2397, 2396, 2316, 2314, 2396, 2318, 2399, 2398, 2393, 2169, 2094, 2151, 2169, 2080, 2151, 2169, 2053, 2099, 2103, 2084, 2101, 2110, 2169, 2085, 2099, 2103, 2084, 2101, 2110, 2153, 2103, 2155, 2084, 2730, 2815, 2789, 2795, 2786, 2737, 3209, 3275, 3278, 3291, 3278, 3218, 3260, 3306, 3323, 3325, 3327, 3239, 3243, 3260, 3318, 3315, 3319, 3315, 3310, 3239, 3243, 3240, 3260, 3317, 3305, 3239, 3243, 613, 608, 629, 608};

    /* renamed from: q */
    private String f165q = C0171.m816(f844short, 0, 18, 546);

    /* renamed from: xC */
    private String f167xC = "";

    /* renamed from: QU */
    private String f163QU = "";

    /* renamed from: UJ */
    private String f164UJ = "";

    /* renamed from: u */
    private String f166u = "";

    /* renamed from: Mo */
    private String f162Mo = C0171.m816(f844short, 18, 216, 633);

    public Mayiys() {
        int iM844 = C0178.m844();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = iM844 >= 0 ? 1709 : 1678;
                case 204:
                    System.out.println(Integer.decode(C0174.m831("GDMEPZnHIi22V1HHyLO")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* renamed from: q */
    private HashMap<String, String> m68q(String str) {
        String str2 = "ۧ۠ۤ";
        HashMap<String, String> map = null;
        String strM841 = null;
        String strM814 = null;
        short[] sArr = null;
        while (true) {
            switch (C0174.m829(str2)) {
                case 56297:
                    str2 = "ۦ۠۟";
                    sArr = f844short;
                    break;
                case 56476:
                    map.put(strM814, strM841);
                    str2 = "ۣۦۧ";
                    break;
                case 1750756:
                    return map;
                case 1752609:
                    str2 = "ۥۡ";
                    strM841 = C0177.m841(sArr, 244, 12, 2606);
                    break;
                case 1753445:
                    str2 = "ۨۡۢ";
                    strM814 = C0170.m814(sArr, 234, 10, 2580);
                    break;
                case 1755401:
                    str2 = "ۥۤ۠";
                    sArr = f844short;
                    break;
                default:
                    map = new HashMap<>();
                    str2 = "۟ۨ";
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x0263. Please report as an issue. */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strM836 = C0176.m836(f844short, 256, 11, 1989);
        String strM8362 = C0176.m836(f844short, 267, 7, 2205);
        String strM856 = C0181.m856(f844short, 274, 5, 3040);
        String strM834 = C0175.m834(f844short, 279, 8, 362);
        String strM828 = C0174.m828(f844short, 287, 6, 2196);
        String strM8342 = C0175.m834(f844short, 293, 4, 2968);
        String strM8562 = C0181.m856(f844short, 297, 5, 435);
        String strM8282 = C0174.m828(f844short, 302, 4, 1072);
        String strM8563 = C0181.m856(f844short, 306, 4, 396);
        String strM8283 = C0174.m828(f844short, 310, 4, 1604);
        String strM8564 = C0181.m856(f844short, 314, 4, 3109);
        try {
            JSONObject jSONObject = new JSONObject();
            String str3 = this.f165q + C0179.m849(f844short, 318, 22, 1406);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = map == null ? 1709 : 1678;
                    case 204:
                        map = new HashMap<>();
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
                        break;
                }
            }
            boolean zContainsKey = map.containsKey(strM8564);
            int i3 = 1864;
            while (true) {
                i3 ^= 1881;
                switch (i3) {
                    case 17:
                        i3 = !zContainsKey ? 48736 : 48705;
                    case 47384:
                        break;
                    case 47417:
                        map.put(strM8564, "");
                        break;
                    case 47483:
                }
            }
            boolean zContainsKey2 = map.containsKey(strM8283);
            int i4 = 48767;
            while (true) {
                i4 ^= 48784;
                switch (i4) {
                    case 14:
                    case 45:
                        break;
                    case 76:
                        map.put(strM8283, "");
                        break;
                    case 239:
                        i4 = !zContainsKey2 ? 48860 : 48829;
                }
            }
            boolean zContainsKey3 = map.containsKey(strM8563);
            int i5 = 48891;
            while (true) {
                i5 ^= 48908;
                switch (i5) {
                    case 22:
                    case 53:
                        break;
                    case 503:
                        i5 = !zContainsKey3 ? 49635 : 48953;
                    case 32495:
                        map.put(strM8563, "");
                        break;
                }
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(C0181.m856(f844short, 340, 11, 962));
                sb.append(map.get(strM8283));
                String str4 = (((((sb.toString() + C0183.m866(f844short, 351, 6, 432) + map.get(strM8564)) + C0172.m820(f844short, 357, 6, 982) + map.get(strM8563)) + C0171.m816(f844short, 363, 8, 2634) + str) + C0180.m851(f844short, 371, 6, 1707) + str2) + C0169.m809(f844short, 377, 9, 2657)) + C0172.m820(f844short, 386, 6, 474) + getCsrf() + C0174.m828(f844short, 392, 5, 2646);
                JSONObject jSONObjectOptJSONObject = new JSONObject(C0106ZJ.m484FN(str4, m68q(str4))).optJSONObject(C0175.m834(f844short, 397, 4, 2173));
                JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray(strM8282);
                JSONArray jSONArray2 = new JSONArray();
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
                                JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i6);
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put(strM828, jSONObjectOptJSONObject2.optString(strM828));
                                jSONObject2.put(strM834, jSONObjectOptJSONObject2.optString(strM834));
                                jSONObject2.put(strM8362, jSONObjectOptJSONObject2.optString(strM8362));
                                jSONObject2.put(strM836, jSONObjectOptJSONObject2.optString(strM836));
                                jSONArray2.put(jSONObject2);
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
                        int i10 = jSONObjectOptJSONObject.getInt(strM8562);
                        jSONObject.put(strM8342, jSONObjectOptJSONObject.getInt(strM8342));
                        jSONObject.put(C0169.m809(f844short, 401, 9, 2029), i10);
                        jSONObject.put(strM856, jSONObjectOptJSONObject.getInt(strM856));
                        jSONObject.put(strM8562, i10 * 30);
                        jSONObject.put(strM8282, jSONArray2);
                        return jSONObject.toString();
                    }
                }
            } catch (Throwable th) {
                int i11 = 49914;
                while (true) {
                    i11 ^= 49931;
                    switch (i11) {
                        case 497:
                            i11 = 50596;
                            continue;
                        case 1711:
                            return "";
                    }
                }
            }
        } catch (Throwable th2) {
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x024e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x02e9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0201. Please report as an issue. */
    public String detailContent(List<String> list) {
        String strM866 = C0183.m866(f844short, 410, 1, 1737);
        String strM816 = C0171.m816(f844short, 411, 3, 2718);
        String strM814 = C0170.m814(f844short, 414, 11, 1042);
        String strM834 = C0175.m834(f844short, 425, 9, 1532);
        String strM841 = C0177.m841(f844short, 434, 11, 2263);
        String strM805 = C0168.m805(f844short, 445, 8, 2417);
        String strM8162 = C0171.m816(f844short, 453, 8, 2147);
        String strM8412 = C0177.m841(f844short, 461, 7, 1699);
        String strM845 = C0178.m845(f844short, 468, 8, 3030);
        String strM828 = C0174.m828(f844short, 476, 6, 2331);
        try {
            Init.m46lj();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f165q);
            sb.append(C0182.m861(f844short, 482, 28, 510));
            sb.append(list.get(0));
            sb.append(C0174.m828(f844short, 510, 6, 433));
            sb.append(getCsrf());
            sb.append(C0169.m809(f844short, 516, 5, 858));
            String string = sb.toString();
            PrintStream printStream = System.out;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C0172.m820(f844short, 521, 3, 621));
            sb2.append(string);
            printStream.println(sb2.toString());
            JSONObject jSONObject3 = new JSONObject(new JSONObject(C0106ZJ.m484FN(string, m68q(string))).optString(C0174.m828(f844short, 524, 4, 1228)));
            jSONObject.put(strM828, jSONObject3.optString(strM828));
            jSONObject.put(strM845, jSONObject3.optString(strM845));
            jSONObject.put(strM8412, jSONObject3.optString(strM8412));
            jSONObject.put(C0180.m851(f844short, 528, 9, 2863), jSONObject3.optString(C0174.m828(f844short, 537, 9, 3052)));
            jSONObject.put(strM8162, jSONObject3.optString(strM8162));
            jSONObject.put(strM805, jSONObject3.optString(strM805));
            jSONObject.put(strM841, jSONObject3.optString(strM841));
            jSONObject.put(strM834, jSONObject3.optString(strM834));
            jSONObject.put(strM814, C0177.m841(f844short, 546, 16, 2473) + jSONObject3.optString(strM814));
            JSONArray jSONArray = jSONObject3.getJSONArray(C0170.m814(f844short, 562, 13, 1885));
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
                            JSONArray jSONArray2 = jSONObjectOptJSONObject.getJSONArray(C0170.m814(f844short, 575, 4, 794));
                            ArrayList arrayList3 = new ArrayList();
                            String strOptString = jSONObjectOptJSONObject.optJSONObject(C0168.m805(f844short, 579, 11, 2226)).optString(C0166.m801(f844short, 590, 4, 2645));
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
                                            JSONObject jSONObjectOptJSONObject2 = jSONArray2.optJSONObject(i3);
                                            arrayList3.add(jSONObjectOptJSONObject2.optString(C0165.m798(f844short, 594, 4, 986)) + strM866 + jSONObjectOptJSONObject2.optString(C0170.m814(f844short, 598, 4, 1669)) + C0169.m809(f844short, 602, 1, 1510) + jSONObjectOptJSONObject2.optString(C0170.m814(f844short, 603, 3, 2881)).replace(strM866, C0172.m820(f844short, 606, 1, 932)));
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
                                    arrayList.add(TextUtils.join(C0177.m841(f844short, 607, 1, 867), arrayList3));
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
                    String strJoin = TextUtils.join(strM816, arrayList2);
                    String strJoin2 = TextUtils.join(strM816, arrayList);
                    jSONObject.put(C0179.m849(f844short, 608, 13, 1015), strJoin);
                    jSONObject.put(C0165.m798(f844short, 621, 12, 2229), strJoin2);
                    JSONArray jSONArray3 = new JSONArray();
                    jSONArray3.put(jSONObject);
                    jSONObject2.put(C0177.m841(f844short, 633, 4, 1421), jSONArray3);
                    return jSONObject2.toString();
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }

    public String getCsrf() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        String str = "۠۟ۧ";
        StringBuilder sb = null;
        short[] sArr = null;
        String strM578u = null;
        String string = null;
        String strEncode = null;
        long j = 0;
        long jCurrentTimeMillis = 0;
        while (true) {
            switch (C0174.m829(str)) {
                case 56482:
                    return strEncode;
                case 1746727:
                    sb.append(strEncode);
                    str = "ۦۧۥ";
                    break;
                case 1747656:
                    str = "ۧۨۦ";
                    jCurrentTimeMillis = System.currentTimeMillis();
                    break;
                case 1747748:
                    str = "۟۠ۨ";
                    strEncode = this.f164UJ;
                    break;
                case 1748644:
                    sb.append(string);
                    str = "۠ۢۦ";
                    break;
                case 1749756:
                    str = "ۣۨۨ";
                    strEncode = this.f163QU;
                    break;
                case 1749852:
                    sb = new StringBuilder();
                    str = "ۢۥ۟";
                    break;
                case 1750810:
                    str = "ۥۣۤ";
                    string = C0172.m820(sArr, 637, 5, 3086);
                    break;
                case 1752457:
                    str = "ۡۡ";
                    strM578u = C0114dC.m578u(string, strEncode);
                    break;
                case 1752612:
                    str = "ۥۧ";
                    strEncode = URLEncoder.encode(strM578u, string);
                    break;
                case 1752678:
                    str = "ۥۣ۟";
                    strEncode = this.f162Mo;
                    break;
                case 1753668:
                    str = "ۥۦۧ";
                    string = sb.toString();
                    break;
                case 1754661:
                    j = jCurrentTimeMillis / 1000;
                    str = "ۧۨۧ";
                    break;
                case 1754662:
                    str = "ۢۨۢ";
                    string = String.valueOf(j);
                    break;
                case 1755619:
                    sb.append(strEncode);
                    str = "ۣۡ۠";
                    break;
                default:
                    str = "ۣۨ۟";
                    sArr = f844short;
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x00de. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x00fc. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x00a2. Please report as an issue. */
    public String homeContent(boolean z) {
        String strM866 = C0183.m866(f844short, 642, 7, 1368);
        String strM828 = C0174.m828(f844short, 649, 9, 2358);
        try {
            String str = this.f165q + C0179.m849(f844short, 658, 27, 1849) + getCsrf() + C0168.m805(f844short, 685, 5, 2029);
            System.out.println(C0170.m814(f844short, 690, 3, 2812) + str);
            JSONArray jSONArray = new JSONObject(C0106ZJ.m484FN(str, m68q(str))).optJSONObject(C0183.m866(f844short, 693, 4, 833)).getJSONArray(C0172.m820(f844short, 697, 4, 1921));
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
                            String strOptString = jSONObjectOptJSONObject.optString(strM828);
                            boolean zContains = strOptString.contains(C0180.m851(f844short, 701, 4, 1223));
                            int i3 = 1740;
                            while (true) {
                                i3 ^= 1757;
                                switch (i3) {
                                    case 17:
                                        i3 = zContains ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        jSONObject.put(strM866, jSONObjectOptJSONObject.optString(strM866));
                                        jSONObject.put(strM828, strOptString);
                                        jSONArray2.put(jSONObject);
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
                                            break;
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
                    jSONObject2.put(C0168.m805(f844short, 705, 5, 1315), jSONArray2);
                    return jSONObject2.toString();
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x00c3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x009a. Please report as an issue. */
    public String homeVideoContent() {
        String strM849 = C0179.m849(f844short, 710, 11, 410);
        String strM820 = C0172.m820(f844short, 721, 7, 3030);
        String strM816 = C0171.m816(f844short, 728, 8, 1748);
        String strM8492 = C0179.m849(f844short, 736, 6, 2004);
        String strM834 = C0175.m834(f844short, 742, 4, 425);
        try {
            String str = this.f165q + C0170.m814(f844short, 746, 51, 754) + getCsrf() + C0168.m805(f844short, 797, 5, 700);
            JSONObject jSONObject = new JSONObject(C0106ZJ.m484FN(str, m68q(str)));
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = jSONObject.optJSONObject(C0182.m861(f844short, 802, 4, 2811)).getJSONArray(strM834);
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
                            JSONArray jSONArray3 = jSONArray2.optJSONObject(i).getJSONArray(C0174.m828(f844short, 806, 8, 3061));
                            int i3 = 0;
                            while (true) {
                                int length2 = jSONArray3.length();
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
                                            JSONObject jSONObject2 = new JSONObject();
                                            JSONObject jSONObjectOptJSONObject = jSONArray3.optJSONObject(i3);
                                            jSONObject2.put(strM8492, jSONObjectOptJSONObject.optString(strM8492));
                                            jSONObject2.put(strM816, jSONObjectOptJSONObject.optString(strM816));
                                            jSONObject2.put(strM820, jSONObjectOptJSONObject.optString(strM820));
                                            jSONObject2.put(strM849, jSONObjectOptJSONObject.optString(strM849));
                                            jSONArray.put(jSONObject2);
                                            i3++;
                                            int i5 = 1864;
                                            while (true) {
                                                i5 ^= 1881;
                                                switch (i5) {
                                                    case 17:
                                                        i5 = 48674;
                                                        break;
                                                    case 47483:
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                    int i6 = i + 1;
                                    int i7 = 48767;
                                    while (true) {
                                        i7 ^= 48784;
                                        switch (i7) {
                                            case 14:
                                                break;
                                            case 239:
                                                i7 = 48798;
                                                break;
                                        }
                                    }
                                    i = i6;
                                }
                            }
                            break;
                        case 239:
                            break;
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(strM834, jSONArray);
                    return jSONObject3.toString();
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }

    public void init(Context context, String str) {
        int i;
        super.init(context, str);
        String[] strArrSplit = C0106ZJ.m484FN(C0152vp.m724Mo(str), m68q("")).split(C0176.m836(f844short, 814, 2, 3096));
        this.f165q = strArrSplit[0];
        try {
            this.f163QU = C0114dC.m579xC(this.f162Mo, new JSONObject(C0106ZJ.m484FN(this.f165q + C0172.m820(f844short, 816, 41, 2539), m68q(""))).optString(C0166.m801(f844short, 857, 4, 1067)));
            i = 1616;
        } catch (Exception e) {
            this.f163QU = strArrSplit[1];
        }
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = 1647;
                    continue;
            }
            this.f164UJ = strArrSplit[2];
            this.f166u = strArrSplit[3];
            int iM812 = C0169.m812();
            int i2 = 1740;
            while (true) {
                i2 ^= 1757;
                switch (i2) {
                    case 17:
                        i2 = iM812 >= 0 ? 1833 : 1802;
                    case 54:
                    case 471:
                        break;
                    case 500:
                        System.out.println(Float.parseFloat(C0165.m797("VgutVJS9")));
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0046. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0095. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:43:0x019b. Please report as an issue. */
    public String playerContent(String str, String str2, List<String> list) {
        String strM579xC;
        String strM820 = C0172.m820(f844short, 861, 1, 1313);
        try {
            JSONObject jSONObject = new JSONObject();
            String[] strArrSplit = str2.split(C0171.m816(f844short, 862, 2, 1919));
            String str3 = strArrSplit[1];
            String str4 = strArrSplit[0];
            boolean zContains = str2.contains(strM820);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = zContains ? 1709 : 1678;
                    case 204:
                        String[] strArrSplit2 = str3.split(strM820);
                        strM579xC = "";
                        int i2 = 0;
                        while (true) {
                            int length = strArrSplit2.length;
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
                                        strM579xC = strM579xC + C0114dC.m579xC(this.f162Mo, strArrSplit2[i2]);
                                        int i4 = i2 + 1;
                                        int i5 = 1864;
                                        while (true) {
                                            i5 ^= 1881;
                                            switch (i5) {
                                                case 17:
                                                    i5 = 48674;
                                                    break;
                                                case 47483:
                                                    break;
                                            }
                                        }
                                        i2 = i4;
                                        break;
                                }
                                break;
                            }
                        }
                    case 239:
                        strM579xC = C0114dC.m579xC(this.f162Mo, str3);
                        break;
                }
            }
            boolean zM600Mo = C0118ga.m600Mo(strM579xC);
            String strM801 = C0166.m801(f844short, 864, 3, 2467);
            int i6 = 48767;
            while (true) {
                i6 ^= 48784;
                switch (i6) {
                    case 14:
                    case 45:
                        break;
                    case 76:
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        String str5 = this.f165q + C0178.m845(f844short, 867, 32, 2918) + URLEncoder.encode(strM579xC) + C0172.m820(f844short, 899, 6, 2950) + str4 + C0172.m820(f844short, 905, 25, 1259) + jCurrentTimeMillis + C0171.m816(f844short, 930, 6, 877) + URLEncoder.encode(C0114dC.m578u(this.f163QU + (jCurrentTimeMillis / 1000) + this.f164UJ, this.f162Mo), C0169.m809(f844short, 936, 5, 1804)) + C0170.m814(f844short, 941, 5, 2424);
                        String strOptString = new JSONObject(C0106ZJ.m484FN(str5, m68q(str5))).optJSONObject(C0179.m849(f844short, 946, 4, 1493)).optString(strM801);
                        boolean zContains2 = strOptString.contains(C0165.m798(f844short, 950, 1, 1668));
                        int i7 = 48891;
                        while (true) {
                            i7 ^= 48908;
                            switch (i7) {
                                case 22:
                                    break;
                                case 53:
                                    strM579xC = C0114dC.m574QU(this.f162Mo, strOptString);
                                    break;
                                case 503:
                                    if (!zContains2) {
                                        break;
                                    } else {
                                        i7 = 49635;
                                    }
                                case 32495:
                                    String[] strArrSplit3 = strOptString.split(C0178.m845(f844short, 951, 2, 462));
                                    strM579xC = "";
                                    int i8 = 0;
                                    while (true) {
                                        int length2 = strArrSplit3.length;
                                        int i9 = 49666;
                                        while (true) {
                                            i9 ^= 49683;
                                            switch (i9) {
                                                case 17:
                                                    i9 = i8 < length2 ? 49759 : 49728;
                                                case 50:
                                                case 76:
                                                    strM579xC = strM579xC + C0114dC.m579xC(this.f162Mo, strArrSplit3[i8]);
                                                    int i10 = i8 + 1;
                                                    int i11 = 49790;
                                                    while (true) {
                                                        i11 ^= 49807;
                                                        switch (i11) {
                                                            case 18:
                                                                break;
                                                            case 241:
                                                                i11 = 49821;
                                                                break;
                                                        }
                                                    }
                                                    i8 = i10;
                                                    break;
                                                case 83:
                                                    break;
                                            }
                                            break;
                                        }
                                    }
                                default:
                                    continue;
                            }
                            i7 = 48953;
                        }
                        break;
                    case 239:
                        i6 = zM600Mo ? 48860 : 48829;
                }
            }
            jSONObject.put(C0183.m866(f844short, 953, 5, 3246), 0);
            jSONObject.put(strM801, strM579xC);
            return jSONObject.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x013c. Please report as an issue. */
    public String searchContent(String str, boolean z) {
        String strM861 = C0182.m861(f844short, 958, 11, 657);
        String strM845 = C0178.m845(f844short, 969, 7, 2554);
        String strM801 = C0166.m801(f844short, 976, 8, 3098);
        String strM814 = C0170.m814(f844short, 984, 6, 2559);
        String strM8452 = C0178.m845(f844short, 990, 4, 1533);
        try {
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder(C0171.m816(f844short, 994, 6, 3112));
            sb.append((System.currentTimeMillis() / 1000) + 1549284568);
            String strValueOf = String.valueOf(sb);
            String strM805 = C0168.m805(f844short, 1000, 32, 2415);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f165q);
            sb2.append(C0178.m845(f844short, 1032, 23, 2134));
            sb2.append(URLEncoder.encode(C0114dC.m575UJ(this.f162Mo, strValueOf + C0179.m849(f844short, 1055, 1, 2048) + strM805)));
            sb2.append(C0183.m866(f844short, 1056, 6, 2700));
            sb2.append(URLEncoder.encode(C0152vp.m721F(this.f163QU + (System.currentTimeMillis() / 1000) + this.f166u, strValueOf, strM805)));
            sb2.append(C0177.m841(f844short, 1062, 6, 3247));
            sb2.append(URLEncoder.encode(str));
            sb2.append(C0172.m820(f844short, 1068, 21, 3226));
            String string = sb2.toString();
            String strM484FN = C0106ZJ.m484FN(string, m68q(string));
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONObject(strM484FN).optJSONObject(C0168.m805(f844short, 1089, 4, 513)).getJSONArray(strM8452);
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
                            jSONObject2.put(strM814, jSONObjectOptJSONObject.optString(strM814));
                            jSONObject2.put(strM801, jSONObjectOptJSONObject.optString(strM801));
                            jSONObject2.put(strM845, jSONObjectOptJSONObject.optString(strM845));
                            jSONObject2.put(strM861, jSONObjectOptJSONObject.optString(strM861));
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
                    jSONObject.put(strM8452, jSONArray);
                    return jSONObject.toString();
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }
}
