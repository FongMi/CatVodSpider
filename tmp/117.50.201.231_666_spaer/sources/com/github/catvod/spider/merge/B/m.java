package com.github.catvod.spider.merge.b;

import com.github.catvod.spider.C0052;
import com.github.catvod.spider.merge.E.C0006;
import com.github.catvod.spider.merge.G.C0007;
import com.github.catvod.spider.merge.H.C0011;
import com.github.catvod.spider.merge.J.C0017;
import com.github.catvod.spider.merge.M.C0019;
import com.github.catvod.spider.merge.Q.C0024;
import com.github.catvod.spider.merge.a.C0029;
import com.github.catvod.spider.merge.h.C0034;
import com.github.catvod.spider.merge.l.C0039;
import com.github.catvod.spider.merge.m.C0602k;
import com.github.catvod.spider.merge.q.C0041;
import com.github.catvod.spider.merge.u.C0044;
import com.github.catvod.spider.merge.w.C0045;
import com.github.catvod.spider.merge.x.C0046;
import com.github.catvod.spider.merge.x.C0047;
import java.io.File;
import np.protect.C0054;
import np.protect.C0058;
import np.protect.C0061;
import np.protect.C0066;
import np.protect.C0068;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class m {
    private static String b;
    private static String c;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f33short = {2216, 2271, 2216, 2211, 2219, 2265, 2216, 2221, 1372, 1325, 1372, 1375, 1374, 1370, 1372, 1373, 1373, 1375, 1375, 1369, 2421, 2308, 2421, 2422, 2423, 2419, 2421, 2420, 2420, 2417, 2422, 2421, 2421, 2416, 2421, 2307, 1200, 1220, 1201, 1217, 1202, 1211, 1200, 1203, 532, 542, 528, 613, 535, 532, 533, 532, 535, 534, 532, 530, 533, 529, 533, 542, 535, 609, 700, 694, 701, 702, 702, 701, 701, 700, 1358, 1337, 1359, 1341, 1356, 1357, 1359, 1356, 1357, 1336, 1359, 1341, 1358, 1337, 2336, 2336, 2337, 2385, 2339, 2385, 2337, 2340, 2338, 2384, 2342, 2347, 2340, 2343, 2340, 2341, 2339, 2388, 2337, 2339, 2338, 2388, 2343, 2390, 2341, 2384, 2341, 2387, 2343, 2384, 2337, 2340, 2339, 2347, 2339, 2390, 2340, 2342, 2336, 2384, 2338, 2341, 2336, 2384, 2343, 2341, 2339, 2339, 2340, 2343, 2336, 2347, 2339, 2346, 2336, 2388, 2343, 2341, 2339, 2343, 2336, 2337, 2336, 2342, 2338, 2390, 2340, 2347, 2339, 2385, 2339, 2385, 2337, 2390, 2336, 2340, 2338, 2342, 2336, 2347, 2339, 2347, 2339, 2341, 2339, 2343, 2336, 2339, 2338, 2340, 2336, 2338, 2339, 2341, 2971, 2960, 2971, 2974, 2969, 3050, 2971, 2970, 2842, 2927, 2840, 2845, 2843, 2924, 2840, 2834, 2843, 2846, 2843, 2921, 2840, 2920, 2840, 2921, 2841, 2926, 2841, 2846, 2843, 2846, 2051, 2166, 1666, 1776, 1667, 1672, 1664, 1776, 1667, 1670, 1664, 1668, 1665, 1665, 1670, 1670, 893, 778, 893, 783, 894, 777, 890, 782, 888, 892, 545, 552, 546, 596, 544, 597, 546, 547, 544, 593, 545, 550, 547, 552, 768, 768, 769, 881, 771, 881, 769, 772, 770, 880, 774, 779, 772, 775, 772, 773, 771, 884, 769, 771, 770, 884, 775, 886, 773, 880, 773, 883, 775, 880, 769, 772, 771, 779, 771, 886, 772, 774, 768, 880, 770, 773, 768, 880, 775, 773, 1727, 1716, 1726, 1736, 1724, 1743, 1726, 1738, 1724, 1741, 1725, 1722, 1726, 1717, 1727, 1743, 1727, 1723, 1727, 1727, 1724, 1741, 1725, 1738, 3214, 3208, 3212, 3209, 3214, 3324, 3212, 3209, 3214, 3325, 3215, 3327, 3212, 3211, 3212, 3208, 2785, 2790, 2784, 2706, 2787, 2786, 2785, 2786, 2786, 2786, 2786, 2711, 1563, 1563, 1562, 1642, 1560, 1642, 1562, 1567, 1561, 1643, 1565, 1552, 1567, 1564, 1567, 1566, 1560, 1647, 1562, 1560, 1561, 1647, 1564, 1645, 1566, 1643, 1566, 1640, 1564, 1643, 1562, 1567, 1560, 1552, 1560, 1645, 1567, 1565, 1563, 1643, 1561, 1566, 1563, 1643, 2240, 2251, 2241, 2231, 2243, 2230, 2241, 2240, 2243, 2226, 2242, 2245, 2240, 2251, 401, 401, 400, 480, 402, 480, 400, 405, 403, 481, 407, 410, 405, 406, 405, 404, 402, 485, 400, 402, 403, 485, 406, 487, 404, 481, 404, 482, 406, 481, 400, 405, 402, 410, 402, 487, 405, 407, 401, 481, 403, 404, 401, 481, 406, 404, 681, 732, 681, 728, 682, 734, 681, 686, 687, 687, 683, 680, 680, 734, 680, 734, 682, 684, 681, 680, 594, 551, 592, 603, 595, 547, 593, 592, 599, 597, 598, 595, 596, 598, 597, 603, 599, 595, 596, 551, 595, 545, 595, 592, 593, 602, 593, 545, 599, 592, 592, 548, 595, 597, 599, 547, 596, 597, 592, 603, 594, 598, 592, 548, 594, 544, 594, 597, 502, 388, 503, 497, 501, 508, 502, 503, 500, 384, 500, 390, 502, 509, 503, 496, 2730, 2778, 2730, 2734, 2728, 2779, 2731, 2732, 2729, 2735, 2729, 2777, 2730, 2781, 1428, 1508, 1429, 1438, 1431, 1438, 1424, 1508, 1430, 1507, 1431, 1424, 1429, 1438, 1429, 1508, 1430, 1431, 1428, 1439, 1431, 1424, 1743, 1729, 861, 853, 863, 809, 861, 852, 862, 857, 860, 809, 861, 860, 859, 812, 1826, 1872, 1825, 1878, 1827, 1873, 1824, 1879, 1827, 1829, 1826, 1827, 1824, 1825, 1825, 1824, 1826, 1835, 1825, 1824, 1827, 1827, 1827, 1873, 1824, 1830, 3071, 3071, 3070, 2958, 3068, 2958, 3070, 3067, 3069, 2959, 3065, 3060, 3067, 3064, 3067, 3066, 3068, 2955, 3070, 3068, 3069, 2955, 3064, 2953, 3066, 2959, 3066, 2956, 3064, 2959, 3070, 3067, 3068, 3060, 3068, 2953, 3067, 3065, 3071, 2959, 3069, 3066, 3071, 2959, 3064, 3066, 3068, 3068, 3067, 3064, 3071, 3060, 3068, 3061, 3071, 2955, 3064, 3066, 3069, 3069, 3071, 3071, 3071, 3060, 3068, 2956, 3071, 3070, 3064, 3066, 3068, 3065, 3071, 2955, 3070, 2958, 3064, 3066, 3071, 2956, 3068, 3068, 3068, 2952, 3071, 3070, 3070, 2958, 3064, 3064, 3066, 3066, 3065, 3061, 3065, 3070, 3067, 2958, 3068, 3061, 3069, 3060, 3071, 3068, 3068, 2953, 3065, 2952, 411, 494, 415, 411, 413, 489, 414, 488, 413, 494, 409, 488, 410, 492, 411, 488, 413, 410, 414, 409, 412, 494, 412, 411, 414, 405, 413, 492, 412, 412, 410, 495, 412, 488, 412, 492, 415, 411, 415, 489, 414, 410, 415, 405, 412, 404, 412, 488, 415, 491, 411, 488, 413, 410, 414, 409, 412, 494, 412, 411, 414, 405, 413, 494, 413, 412, 414, 409, 412, 489, 412, 413, 414, 488, 415, 412, 413, 410, 415, 405, 409, 408, 412, 415, 414, 404, 415, 495, 409, 488, 414, 411, 412, 404, 413, 412, 415, 491, 415, 411, 412, 494, 413, 413, 412, 412, 412, 491, 415, 491, 413, 412, 413, 494, 410, 495, 624, 517, 629, 516, 630, 630, 628, 625, 630, 519, 631, 624, 630, 631, 628, 514, 631, 631, 625, 516, 2908, 2907, 2910, 2863, 2905, 2910, 1963, 2014, 1964, 2015, 1965, 1965, 1967, 1962, 1965, 2012, 1964, 1963, 1964, 2012, 1966, 2011, 1965, 2014, 1962, 2015, 2006, 1952, 3135, 3134, 3134, 3120, 375, 261, 373, 261, 375, 261, 373, 372, 375, 261, 375, 375, 374, 258, 373, 368, 375, 372, 373, 372, 374, 369, 1394, 1393, 1398, 1286, 1396, 1392, 1398, 1405, 1396, 1280, 1397, 1395, 1395, 1286, 1395, 1285, 1393, 1286, 1394, 1404, 1396, 1287, 1396, 1286, 1399, 1281, 3210, 3210, 3211, 3323, 3209, 3323, 3211, 3214, 3208, 3322, 3212, 3201, 3214, 3213, 3214, 3215, 3208, 3215, 3211, 3214, 3209, 3324, 3209, 3324, 3214, 3215, 3210, 3201, 3209, 3200, 3210, 3326, 3213, 3214, 3212, 3210, 3215, 3200, 3215, 3322, 3209, 3200, 3210, 3215, 3209, 3214, 3213, 3324, 3210, 3201, 3210, 3215, 3208, 3213, 3214, 3201, 3209, 3201, 3208, 3211, 3210, 3211, 3214, 3215, 
    3209, 3325, 3215, 3215, 3213, 3215, 3208, 3214, 3211, 3201, 3210, 3324, 3209, 3321, 3214, 3201, 3209, 3209, 3209, 3324, 3210, 3323, 3210, 3215, 551, 599, 548, 546, 550, 559, 549, 548, 551, 595, 551, 597, 549, 558, 548, 547, 1997, 1994, 1996, 1991, 1999, 1979, 1997, 1991, 1997, 1992, 1999, 1996, 1997, 1993, 1997, 1990, 1998, 1980, 1997, 1999, 1998, 1992, 1999, 1998, 1997, 1992, 1300, 1309, 1302, 1299, 1300, 1298, 1303, 1302, 1301, 1376, 1301, 1376, 1303, 1377, 1298, 1297, 1303, 1383, 1303, 1378, 1300, 1308, 1301, 1298, 3256, 3272, 3257, 3250, 3259, 3250, 3256, 3275, 3259, 3259, 3259, 3258, 3256, 3272, 3257, 3273, 3258, 3259, 3256, 3251, 3259, 3260, 3263, 3273, 3256, 3258, 3257, 3272, 3258, 3261, 3256, 3250, 3084, 3198, 3087, 3192, 3085, 3199, 3086, 3193, 3085, 3083, 3084, 3085, 3086, 3087, 3087, 3086, 3084, 3077, 3087, 3086, 3085, 3085, 3085, 3199, 3086, 3080, 2450, 2458, 2448, 2534, 2450, 2459, 2449, 2454, 2451, 2534, 2450, 2451, 2452, 2531, 2412, 2407, 2412, 2409, 2414, 2333, 2412, 2413, 3207, 3312, 3207, 3212, 3204, 3318, 3207, 3202, 526, 636, 524, 636, 526, 636, 524, 525, 526, 636, 526, 526, 527, 635, 524, 521, 526, 525, 524, 525, 527, 520, 2816, 2931, 2816, 2933, 2818, 2933, 3153, 3158, 1601, 1591, 2543, 2460, 449, 434, 448, 463, 451, 452, 448, 449, 450, 452, 451, 452, 449, 454, 448, 463, 451, 452, 448, 449, 2295, 2296, 2446, 2446, 2447, 2559, 2445, 2559, 2447, 2442, 2444, 2558, 2440, 2437, 2442, 2441, 2442, 2443, 2445, 2554, 2447, 2445, 2444, 2554, 2441, 2552, 2447, 2557, 2446, 2558, 2444, 2443, 2446, 2437, 2445, 2553, 2441, 2552, 2446, 2437, 2446, 2443, 2444, 2441, 2442, 2437, 2444, 2554, 2444, 2447, 2442, 2443, 2446, 2558, 2444, 2443, 2446, 2436, 2444, 2559, 2445, 2442, 2446, 2440, 2447, 2559, 2440, 2443, 2447, 2447, 2444, 2436, 2445, 2554, 2446, 2441, 2446, 2437, 2444, 2559, 2447, 2441, 2441, 2443, 2440, 2445, 2443, 2557, 2443, 2557, 2441, 2558, 2442, 2437, 2440, 2436, 2440, 2444, 2442, 2441, 2443, 2559, 2444, 2558, 2446, 2446, 2440, 2553, 2440, 2558, 2443, 2559, 2446, 2557, 2441, 2436, 2443, 2445, 2440, 2557, 2440, 2446, 2443, 2553, 2443, 2557, 2441, 2558, 2443, 2442, 2440, 2437, 2441, 2552, 2447, 2557, 2446, 2442, 2444, 2554, 3191, 3076, 3187, 3184, 3187, 3187, 3191, 3184, 3186, 3191, 3187, 3076, 3191, 3184, 3186, 3086, 3187, 3075, 3191, 3079, 3186, 3184, 3189, 3077, 3191, 3076, 3189, 3072, 3186, 3184, 3191, 3077, 3184, 3073, 3187, 3075, 3191, 3184, 3187, 3189, 3186, 3087, 3191, 3187, 3189, 3189, 3186, 3072, 645, 756, 2631, 2613, 2630, 2637, 2629, 2614, 2631, 2625, 2628, 2610, 2629, 2615, 2631, 2636, 2630, 2615, 3059, 3062, 3059, 3064, 3057, 3056, 3059, 2944, 1537, 1655, 1537, 1539, 1539, 1546, 1536, 1537, 578, 560, 579, 584, 576, 563, 578, 580, 577, 585, 576, 562, 578, 585, 578, 562, 2923, 2912, 2922, 2844, 2920, 2925, 2922, 2923, 2921, 2925, 2921, 2921, 2922, 2846, 2923, 2841, 2143, 2093, 2142, 2136, 2140, 2133, 2143, 2142, 2141, 2089, 2141, 2095, 2143, 2132, 2142, 2137, 2751, 2760, 2750, 2760, 2748, 2765, 1063, 1063, 1062, 1110, 1060, 1110, 1062, 1059, 1061, 1111, 1057, 1068, 1059, 1056, 1059, 1058, 1061, 1057, 1063, 1068, 1060, 1107, 1060, 1108, 1063, 1057, 1059, 1059, 1056, 1068, 1058, 1057, 1057, 1111, 1061, 1062, 1063, 1111, 1063, 1059, 1057, 1059, 1063, 1056, 1060, 1058, 1060, 1104, 1059, 1056, 1063, 1068, 1060, 1069, 1063, 1107, 1056, 1058, 1061, 1059, 1062, 1068, 1063, 1105, 1060, 1108, 1059, 1068, 1061, 1111, 1060, 1108, 1063, 1105, 1063, 1059, 1062, 1058, 1063, 1107, 1060, 1059, 700, 695, 700, 697, 702, 717, 700, 701, 3195, 3198, 3195, 3085, 3192, 3083, 3194, 3196, 3192, 3184, 3192, 3197, 3195, 3087, 1462, 1473, 1462, 1469, 1461, 1479, 1462, 1459, 335, 313, 334, 331, 332, 335, 334, 335, 333, 330, 2235, 2248, 2236, 2253, 2236, 2250, 2235, 2250, 2239, 2254, 2238, 2243, 2235, 2238, 2238, 2251, 2238, 2249, 2235, 2249, 2233, 2255, 2239, 2252, 2253, 2232, 2253, 2235, 2255, 2232, 2235, 2248, 2233, 2248, 2239, 2248, 2235, 2238, 2238, 2249, 2236, 2250, 2235, 2239, 2233, 2233, 2238, 2255, 2235, 2236, 2233, 2253, 2238, 2236, 2252, 2235, 2243, 2250, 2238, 2233, 2236, 2238, 2235, 2238, 2239, 2251, 2233, 2232, 2243, 2238, 2233, 2238, 2233, 2235, 2235, 2232, 2239, 2242, 2238, 2252, 2243, 2250, 2233, 2238, 2233, 2236, 2235, 2238, 2239, 2248, 2239, 2236, 2250, 2254, 2243, 2235, 2233, 2236, 2233, 2255, 2242, 2236, 2236, 2232, 2238, 2252, 2243, 2250, 2233, 2235, 2238, 2243, 2242, 2236, 2238, 2236, 2233, 2249, 2243, 2252, 2236, 2253, 2238, 2238, 2778, 2733, 2778, 2769, 2776, 2782, 2778, 2730, 2776, 2732, 2776, 2781, 2778, 2781, 2778, 2731, 2776, 2777, 2778, 2768, 2777, 2731, 2777, 2782, 2779, 2778, 1903, 1901, 1898, 1819, 1896, 1903, 1903, 1818, 1897, 1819, 1897, 1898, 1898, 1900, 1898, 1901, 1897, 1820, 1902, 1896, 1896, 1818, 1897, 1817, 1899, 1821, 1898, 1820, 1901, 1901, 1899, 1897, 1897, 1889, 1897, 1820, 1898, 1820, 1899, 1888, 1896, 1889, 1898, 1888};
    private String a;

    private static final class a {
        static volatile m a = new m();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.b.m.<init>():void");
    }

    public static m a() {
        return a.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:263:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x004e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x06fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x06ed A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String d(java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.b.m.d(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.Map<java.lang.String, java.lang.String> e(boolean r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.b.m.e(boolean):java.util.Map");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0021. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x002b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0a45 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x07c0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x07b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x01df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x07f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x038d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x037f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x048d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x07ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x049b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0a4f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i(java.lang.String r37, java.lang.String r38, java.lang.String r39, java.util.List<com.github.catvod.spider.merge.h.C0566a> r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.b.m.i(java.lang.String, java.lang.String, java.lang.String, java.util.List):void");
    }

    private String r(String str) {
        try {
            return new JSONObject(C0602k.a(a.a.c())).optString(str);
        } catch (Exception unused) {
            return "";
        }
    }

    public final String b() {
        int iM48 = C0017.m48("ۧ۟");
        JSONObject jSONObject = null;
        String str = null;
        while (true) {
            switch (iM48) {
                case 56386:
                    try {
                        String str2 = (String) C0058.n(18346, jSONObject, new Object[]{(String) C0068.n(10418, null, new Object[]{(String) C0054.n(7750, null, new Object[]{(short[]) C0066.n(18106), 888, 22, 327})})});
                        iM48 = 1754167 + C0017.f18 + C0017.f18;
                        str = str2;
                    } catch (Exception e) {
                        return (String) C0058.n(87933);
                    }
                    break;
                case 56536:
                    iM48 = C0029.m84("ۣ۠ۨ");
                    break;
                case 1746820:
                    if (C0024.m73() > 0) {
                        iM48 = (C0045.f46 ^ C0034.f37) ^ (-1752395);
                    } else {
                        C0047.f48 = 5;
                        iM48 = C0011.m34("ۧۥۢ");
                    }
                    break;
                case 1747710:
                    if (C0039.m121() < 0) {
                        iM48 = (C0044.f45 * C0006.f12) ^ (-32844);
                    } else {
                        C0019.f19 = 39;
                        iM48 = C0046.m150("ۣۨ۠");
                    }
                    break;
                case 1750571:
                    jSONObject = new JSONObject((String) C0061.n(87642, null, new Object[]{(File) C0066.n(46460, this, new Object[0])}));
                    iM48 = (C0041.f43 | C0006.f12) ^ (-56524);
                    break;
                case 1752461:
                    if (C0044.m143() < 0) {
                        iM48 = (C0039.f41 ^ C0044.f45) ^ 1750189;
                    } else {
                        C0052.m168();
                        iM48 = C0007.m27("ۡ۠ۤ");
                    }
                    break;
                case 1752611:
                    return str;
            }
        }
    }

    public final File c() {
        return C0602k.b("/cloud123.txt");
    }

    public final String f() {
        return (String) C0066.n(33620, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x044d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.b.m.g(java.lang.String):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x002a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0552 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0544 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.github.catvod.spider.merge.c.C0554e h(java.lang.String r40, java.lang.String r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3062
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.b.m.h(java.lang.String, java.lang.String):com.github.catvod.spider.merge.c.e");
    }

    public final String j() {
        return r("AccessToken");
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x06c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x045b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0461 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(java.lang.String r26, java.lang.String r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1954
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.b.m.j(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String k(java.lang.String[] r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 882
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.b.m.k(java.lang.String[]):java.lang.String");
    }
}
