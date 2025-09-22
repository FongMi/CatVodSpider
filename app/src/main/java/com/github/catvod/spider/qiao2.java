package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.C0165;
import com.github.catvod.parser.C0166;
import com.github.catvod.spider.merge.AbstractC0099V3;
import com.github.catvod.spider.merge.C0106ZJ;
import com.github.catvod.spider.merge.C0114dC;
import com.github.catvod.spider.merge.C0117f4;
import com.github.catvod.spider.merge.C0152vp;
import com.github.catvod.spider.merge.C0168;
import com.github.catvod.spider.merge.C0169;
import com.github.catvod.spider.merge.C0170;
import com.github.catvod.spider.merge.C0171;
import com.github.catvod.spider.merge.C0172;
import com.github.catvod.spider.merge.C0174;
import com.github.catvod.spider.merge.C0175;
import com.github.catvod.spider.merge.C0176;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class qiao2 extends Spider {

    /* renamed from: q */
    public static String f794q = "";

    /* renamed from: short, reason: not valid java name */
    private static final short[] f887short = {665, 671, 649, 670, 705, 653, 651, 649, 642, 664, 2829, 2856, 2875, 2877, 2918, 2939, 2919, 2936, 2928, 2921, 2913, 2861, 2856, 2875, 2877, 2931, 2848, 2854, 2912, 2556, 2541, 2541, 2537, 2546, 2480, 2545, 2546, 2558, 2556, 2545, 2480, 2536, 2536, 2548, 2553, 2757, 2793, 2792, 2802, 2787, 2792, 2802, 2731, 2770, 2815, 2806, 2787, 1684, 1669, 1669, 1689, 1692, 1686, 1684, 1665, 1692, 1690, 1691, 1754, 1695, 1670, 1690, 1691, 1202, 1193, 1197, 1187, 1192, 835, 857, 836, 853, 1225, 1220, 1229, 1240, 2863, 2863, 2918, 2923, 2925, 2863, 2912, 2925, 2935, 2924, 2918, 2915, 2928, 2939, 2863, 2784, 2808, 2785, 2809, 2788, 2813, 2796, 2815, 2809, 2722, 2795, 2786, 2815, 2784, 2720, 2793, 2796, 2809, 2796, 2742, 2733, 1339, 1339, 2830, 2825, 2880, 2924, 2925, 2935, 2918, 2925, 2935, 2862, 2887, 2922, 2928, 2931, 2924, 2928, 2922, 2935, 2922, 2924, 2925, 2873, 2851, 2917, 2924, 2929, 2926, 2862, 2919, 2914, 2935, 2914, 2872, 2851, 2925, 2914, 2926, 2918, 2878, 2849, 2931, 2927, 2914, 2938, 2908, 2934, 2929, 2927, 2849, 2830, 2825, 2830, 2825, 1113, 1118, 1145, 1145, 870, 865, 808, 772, 773, 799, 782, 773, 799, 838, 815, 770, 792, 795, 772, 792, 770, 799, 770, 772, 773, 849, 843, 781, 772, 793, 774, 838, 783, 778, 799, 778, 848, 843, 773, 778, 774, 782, 854, 841, 775, 778, 777, 782, 775, 841, 870, 865, 870, 865, 2350, 2345, 2400, 2380, 2381, 2391, 2374, 2381, 2391, 2318, 2407, 2378, 2384, 2387, 2380, 2384, 2378, 2391, 2378, 2380, 2381, 2329, 2307, 2373, 2380, 2385, 2382, 2318, 2375, 2370, 2391, 2370, 2328, 2307, 2381, 2370, 2382, 2374, 2334, 2305, 2376, 2374, 2394, 2305, 2350, 2345, 2350, 2345, 3087, 3087, 3119, 3112, 3119, 3112, 2583, 2609, 2599, 2608, 2671, 2563, 2597, 2599, 2604, 2614, 706, 729, 733, 723, 728, 1131, 1139, 1130, 1138, 1135, 1142, 1127, 1140, 1138, 1065, 1120, 1129, 1140, 1131, 1067, 1122, 1127, 1138, 1127, 1085, 1062, 1124, 1129, 1139, 1128, 1122, 1127, 1140, 1151, 1083, 808, 804, 805, 831, 814, 805, 831, 870, 831, 818, 827, 814, 1878, 1878, 1878, -29201, 25500, 23869, -30423, 736, 736, 681, 676, 674, 736, 687, 674, 696, 675, 681, 684, 703, 692, 736, 2502, 2526, 2503, 2527, 2498, 2523, 2506, 2521, 2527, 2436, 2509, 2500, 2521, 2502, 2438, 2511, 2506, 2527, 2506, 2448, 2443, 3197, 3197, 2390, 2385, 2328, 2356, 2357, 2351, 2366, 2357, 2351, 2422, 2335, 2354, 2344, 2347, 2356, 2344, 2354, 2351, 2354, 2356, 2357, 2401, 2427, 2365, 2356, 2345, 2358, 2422, 2367, 2362, 2351, 2362, 2400, 2427, 2357, 2362, 2358, 2366, 2406, 2425, 2347, 2359, 2362, 2338, 2308, 2350, 2345, 2359, 2425, 2390, 2385, 2390, 2385, 2291, 2292, 2259, 2259, 3160, 3167, 3094, 3130, 3131, 3105, 3120, 3131, 3105, 3192, 3089, 3132, 3110, 3109, 3130, 3110, 3132, 3105, 3132, 3130, 3131, 3183, 3189, 3123, 3130, 3111, 3128, 3192, 3121, 3124, 3105, 3124, 3182, 3189, 3131, 3124, 3128, 3120, 3176, 3191, 3129, 3124, 3127, 3120, 3129, 3191, 3160, 3167, 3160, 3167, 870, 865, 808, 772, 773, 799, 782, 773, 799, 838, 815, 770, 792, 795, 772, 792, 770, 799, 770, 772, 773, 849, 843, 781, 772, 793, 774, 838, 783, 778, 799, 778, 848, 843, 773, 778, 774, 782, 854, 841, 768, 782, 786, 841, 870, 865, 870, 865, 427, 428, 485, 457, 456, 466, 451, 456, 466, 395, 482, 463, 469, 470, 457, 469, 463, 466, 463, 457, 456, 412, 390, 448, 457, 468, 459, 395, 450, 455, 466, 455, 413, 390, 456, 455, 459, 451, 411, 388, 469, 463, 449, 456, 388, 427, 428, 427, 428, 612, 612, 580, 579, 580, 579, 970, 977, 981, 987, 976, 2595, 2565, 2579, 2564, 2651, 2615, 2577, 2579, 2584, 2562, 2900, 2929, 2914, 2916, 2879, 2850, 2878, 2849, 2857, 2864, 2872, 2932, 2929, 2914, 2916, 2858, 2937, 2943, 2873, 2538, 2555, 2555, 2559, 2532, 2470, 2535, 2532, 2536, 2538, 2535, 2470, 2558, 2558, 2530, 2543, 2032, 2024, 2033, 2025, 2036, 2029, 2044, 2031, 2025, 1970, 2043, 2034, 2031, 2032, 1968, 2041, 2044, 2025, 2044, 1958, 1981, 2047, 2034, 2024, 2035, 2041, 2044, 2031, 2020, 1952, 523, 519, 518, 540, 525, 518, 540, 581, 540, 529, 536, 525, 558, 544, 572, 2299, 2299, 2279, 2282, 1137, 1134, 2344, 2354, 2364, 2357, 2350, 2345, 2359, 2015, 1998, 1998, 2000, 2015, 2003, 2011, 1464, 1443, 1447, 1449, 1442, 2461, 2491, 2477, 2490, 2533, 2441, 2479, 2477, 2470, 2492, 2588, 2617, 2602, 2604, 2679, 2667, 2678, 2664, 2680, 2672, 2620, 2617, 2602, 2604, 2658, 2609, 2615, 2673, 1721, 1717, 1716, 1724, 1715, 1725, 1193, 1186, 1184, 1196, 1188, 1187, 2118, 2135, 2126, 3069, 3057, 3056, 3064, 3063, 3065, 3051, 3052, 3058, 1470, 1432, 1422, 1433, 1478, 1450, 1420, 1422, 1413, 1439, 911, 938, 953, 959, 996, 1016, 997, 1019, 1003, 995, 943, 938, 953, 959, 1009, 930, 932, 994, 1549, 1556, 1567, 1572, 1545, 1566, 1558, 1562, 1545, 1552, 1544, 889, 864, 875, 848, 895, 870, 876, 2074, 2051, 2056, 2099, 2050, 2061, 2049, 2057, 1728, 1753, 1746, 1769, 1759, 1746, 2216, 2227, 2216, 2237, 2224, 2521, 2518, 2523, 2505, 2505, 2244, 2264, 2268, 2255, 2354, 2337, 2358, 2354, 1695, 1682, 1691, 1678, 1487, 1430, 1423, 1412, 1487, 1420, 1417, 1427, 1428, 1427, 1999, 1924, 1929, 1920, 1941, 1967, 1945, 1940, 1997, 1558, 1617, 1602, 1621, 1617, 1549, 2462, 2516, 2521, 2518, 2527, 2437, 2645, 2570, 2582, 2578, 2561, 2638, 612, 557, 560, 550, 551, 560, 639, 566, 555, 559, 551, 2220, 2302, 2291, 2298, 2287, 2261, 2276, 2283, 2279, 2287, 2231, 433, 487, 502, 496, 498, 426, 1508, 1458, 1443, 1445, 1447, 1425, 1451, 1464, 1447, 1535, 1520, 1523, 1910, 1807, 1807, 1824, 1852, 1841, 1828, 1846, 1855, 1826, 1853, 1901, 1841, 1854, 1844, 1826, 1855, 1849, 1844, 1910, 1827, 1849, 1847, 1854, 1901, 1881, 1874, 1887, 1870, 1861, 1868, 1864, 1877, 1875, 1874, 846, 843, 862, 843, 2126, 2127, 2121, 1324, 1314, 1342, 1218, 1245, 2045, 2045, 1978, 2033, 309, 329, 270, 308, 316, 316, 316, 316, 316, 316, 316, 316, 316, 863, 846, 840, 842, 1884, 1869, 1867, 1865, 
    1871, 1859, 1881, 1858, 1880, 1164, 1161, 1165, 1161, 1172, 619, 622, 628, 627, 1361, 1357, 1344, 1368, 1348, 1363, 1406, 1352, 1359, 1351, 1358, 574, 574, 574, 1761, 1784, 1779, 1736, 1780, 1784, 1785, 1763, 1778, 1785, 1763, 570, 547, 552, 531, 552, 549, 574, 553, 559, 568, 547, 574, 938, 947, 952, 899, 957, 959, 936, 947, 942, 3262, 3239, 3244, 3223, 3258, 3245, 3237, 3241, 3258, 3235, 3259, 3042, 3067, 3056, 3019, 3061, 3046, 3057, 3061, 702, 679, 684, 663, 689, 685, 681, 698, 386, 411, 400, 427, 388, 413, 407, 1425, 1416, 1411, 1464, 1417, 1414, 1418, 1410, 810, 819, 824, 771, 821, 824, 571, 610, 635, 624, 571, 627, 625, 608, 578, 635, 624, 555, 637, 624, 553, 2756, 2749, 2749, 2706, 2702, 2691, 2710, 2692, 2701, 2704, 2703, 2783, 2691, 2700, 2694, 2704, 2701, 2699, 2694, 2756, 2705, 2699, 2693, 2700, 2783, 2615, 2614, 2599, 2610, 2618, 2623, 1356, 1351, 1354, 1371, 1360, 1369, 1373, 1344, 1350, 1351, 3269, 3264, 3285, 3264, 1635, 1634, 1636, 1663, 1649, 1645, 1091, 1116, 1463, 1463, 1520, 1467, 3113, 3157, 3090, 3112, 3104, 3104, 3104, 3104, 3104, 3104, 3104, 3104, 3104, 1028, 1033, 1024, 1045, 1071, 1054, 1041, 1053, 1045, 2571, 2578, 2585, 2594, 2590, 2577, 2588, 2574, 2574, 27697, 25840, 21686, 23769, 22077, 22040, -30100, -1959, -29534, 21930, 18783, 22534, 21634, -25150, -1964, -1964, 1676, 1685, 1694, 1701, 1674, 1686, 1691, 1667, 1701, 1686, 1683, 1673, 1678, 272, 267, 268, 276, 2351, 2363, 2342, 2340, 27455, 21065, 22652, 2933, 2930, 2924, 2931, 1198, 1185, 1197, 1189, 2041, 3119, 3112, 3126, 683, 431, 669, 644, 655, 692, 667, 647, 650, 658, 692, 653, 665, 644, 646, 278, 271, 260, 319, 272, 268, 257, 281, 319, 277, 274, 268, 1516, 1513, 1523, 1524, 2514, 2512, 2501, 2516, 656, 709, 735, 721, 728, 651, 556, 544, 545, 553, 550, 552, 2482, 2489, 2484, 2469, 2478, 2471, 2467, 2494, 2488, 2489, 1864, 1866, 1883, 1904, 1863, 1856, 1858, 1866, 1904, 1868, 1870, 1883, 1866, 2753, 2756, 2769, 2756, 660, 661, 659, 2928, 2942, 2914, 2814, 2785, 1356, 1356, 1291, 1344, 2258, 2222, 2281, 2259, 2267, 2267, 2267, 2267, 2267, 2267, 2267, 2267, 2267, 3027, 3038, 1784, 1786, 1785, 1777, 2799, 2786, 2795, 2814, 2756, 2802, 2815, 2877, 2864, 2873, 2860, 2838, 2855, 2856, 2852, 2860, 3291, 3270, 3291, 3267, 3274, 2970, 2965, 2968, 2954, 2954, 3104, 3119, 3114, 3122, 3107, 3124, 3125, 882, 875, 864, 859, 886, 865, 873, 869, 886, 879, 887, 2943, 2918, 2925, 2902, 2937, 2912, 2922, 2846, 2823, 2828, 2871, 2822, 2825, 2821, 2829, 2744, 2721, 2730, 2705, 2727, 2730, 832, 775, 768, 770, 778, 832, 779, 782, 795, 782, 848, 774, 779, 850, 1487, 1412, 1414, 1413, 1421, 1492, 2257, 2216, 2216, 2183, 2203, 2198, 2179, 2193, 2200, 2181, 2202, 2250, 2198, 2201, 2195, 2181, 2200, 2206, 2195, 2257, 2180, 2206, 2192, 2201, 2250, 2315, 2316, 2318, 2310, 912, 923, 918, 903, 908, 901, 897, 924, 922, 923, 2397, 2368, 2385, 2393, 2375, 1828, 1842, 1844, 1827, 1854, 1848, 1849, 1828, 1312, 1317, 1328, 1317, 2225, 2224, 2230, 2334, 2320, 2316, 2134, 2121, 1403, 1403, 1340, 1399, 395, 503, 432, 394, 386, 386, 386, 386, 386, 386, 386, 386, 386, 2405, 2400, 2426, 2429, 2009, 1992, 2011, 2010, 1996, 1733, 1890, 1853, 1836, 1855, 1854, 1828, 1827, 1834, 1890, 1853, 1855, 1826, 1845, 1844, 1906, 1810, 1810, 1853, 1825, 1836, 1849, 1835, 1826, 1855, 1824, 1904, 1836, 1827, 1833, 1855, 1826, 1828, 1833, 1899, 1854, 1828, 1834, 1827, 1904, 1502, 1442, 1509, 1503, 1495, 1495, 1495, 1495, 1495, 1495, 1495, 1495, 1495, 1182, 1182, 1241, 1170, 709, 730, 2409, 2408, 2414, 1434, 1425, 1436, 1421, 1414, 1423, 1419, 1430, 1424, 1425, 2090, 2086, 2087, 2095, 2080, 2094, 917, 923, 903, 1816, 1821, 1800, 1821, 2728, 2813, 2791, 2793, 2784, 2739, 527, 522, 528, 535, 528, 731, 729, 712, 739, 716, 733, 718, 719, 725, 722, 731, 3186, 3189, 3179, 505, 500, 503, 496, 505, 1459, 1450, 1441, 1434, 1463, 1440, 1448, 1444, 1463, 1454, 1462, 3173, 3196, 3191, 3148, 3171, 3194, 3184, 299, 306, 313, 258, 307, 316, 304, 312, 2716, 2693, 2702, 2741, 2691, 2702, 1839, 1907, 1893, 1889, 1906, 1891, 1896, 1839, 1900, 1897, 1907, 1908, 1907, 1855, 1911, 1892, 1853, 765, 683, 698, 700, 702, 742, 746, 765, 687, 674, 683, 702, 742, 765, 644, 644, 683, 695, 698, 687, 701, 692, 681, 694, 742, 698, 693, 703, 681, 692, 690, 703, 765, 680, 690, 700, 693, 742, 2621, 2603, 2607, 2620, 2605, 2598, 2947, 2952, 2949, 2964, 2975, 2966, 2962, 2959, 2953, 2952, 2420, 2417, 2404, 2417, 1466, 1467, 1469, 1447, 1449, 1461, 1064, 1079, 2698, 2698, 2765, 2694, 527, 627, 564, 526, 518, 518, 518, 518, 518, 518, 518, 518, 518, 1554, 1559, 1549, 1546};

    /* renamed from: xC */
    private String f806xC = "";

    /* renamed from: QU */
    private String f799QU = "";

    /* renamed from: UJ */
    private String f800UJ = "";

    /* renamed from: u */
    private String f804u = "";

    /* renamed from: Mo */
    private String f798Mo = "";

    /* renamed from: i */
    private String f802i = "";

    /* renamed from: MH */
    private String f797MH = "";

    /* renamed from: se */
    private String f803se = "";

    /* renamed from: W */
    private String f801W = "";

    /* renamed from: FN */
    private String f796FN = "";

    /* renamed from: B */
    private String f795B = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDA+5YTt3w1q/0WGw+TWyCSHTAeYiwBqAqDWot1u/1hoeANpED8gtW1AxB1mYNDQ+9eR8Ml+JC13+ME6RHjEbN4+n9V9OP90c81G0qSjBQ/DKQiMIFjbTH97RjVMtswf96tqwe4Rs/DT2ym6MP4P7QvJcxrFz5VVQXyOtUxhpMc9oktWuk0XKE8Mozu1FM879RknlM6WmJL85Wl/BnZrd+/AQbzziceELGrBfjbc1UOFAxYq2kA10H3o+Z4oOIODxUtXeh4R2oH3vHb4Ynnw6reXED5KsE3u1EO5HMQZyN16TZMTIps32bPe+vQlAT6V5nGcqXGT9fntjqIxJB0T9G3AgMBAAECggEBAKP6Yuh4BZP5g0CwV8jHKuLc6FE469mwdtZsLooo5cF68c3Fnu6xIXQAmZDDk3SpmhCLe7edASF5jwZSIL/H/68xcteQEdZP2/htKy1g16dHT4Q5oQfh9hOkznACGZuZW5ZH+HRNvyZfK5ybtkEPqERTouHwSyfo6feMpDDD/+cf3h1//7JKXKA7JPEU420YucsjQwjMuu5xdPa0TPqEc5mIbOBj753Pzn4GCScM+FRqJWr2x8e+KDPcPY8CUDLBSWxGLsB0A7+bEq/EiAQkbx09QKTwwxRLgVXjBbvyPB8BOuJpPM9BHx+vFcm5WSbkJdRI4qVFtEdsN/gDfFkwcjkCgYEA8Z8i/fTFRnzyvp9Pp8E+bSaYlvpTLUZ1KYNStaDg/BqlYGgGK1Jh90qjvRbBoiIjeBQd3IFLT4pFdd7Z9drLFdvqB22SNeVQU57kir/B6NY5G7yOjXB4qN17F4S3GubYIEcjF0W1tG/uOqqzb8FxrLJTK8WiFudbBt2ioCO4pJsCgYEAzHd8MctmD1Z1eM/xusvX1yCwGpxBuHT+ymThzLXyI6Ej0Q50jOQlf3cTyY/FgGbvAMz+oBybkEwE80gu7CPi0WPs+yCpAIB4+Th7afsrRylQI1ZWoRovaRmsyjnkIw0Mnj06VYNYPtkzm/OViRIqf4ESTTGas24bDm5DuwM9gxUCgYBwg4BR7gdnWYvYRGtdXNlrDowD0jGlZaftWt/LAE2EWAwmpooo5kYEV9eDl/M3QtptckCti++77FGIH+wzVl03op6KMvXg7xXGurkF+2GawRb62YUwS+2EBQ7q1rxFZLXD4hxvG+EPUwgGfbLtGZGLr8aXHYLrU3TJ769pDvlOfQKBgAFlAzzXtU9/eHele3GZuFQoTeswi6Y1bhN1UrDxwMALdlITtinL2JGg/0qNp3wzt4ea3lW7PDhkvFfocyF7MS3ab6Ba3aw6NBkHEJhtdSMcHgbPrPGWWyJtYWdTs8GlciOWKVKx/aUYGCkFJUz1CcMq3zQVlYeJxbd4ew/Iet/tAoGBAMRfvG1iLQAlS3AGaQeRwVxnvpciDn+7/sUCf8DEOk8Bqg4/ytJDTDrWufCtwmpsXmp6AUQig9mNKj7z26wSNbwYdzPsncK+sGRlS7eLAzzcv1a+1pghOOGDuQNzwlFOcauhkrcqjeKmu7OiKD48pvh3ZICiIWS1YL7LuMfUwHRJ";

    /* renamed from: w8 */
    JSONArray f805w8 = null;

    public qiao2() {
        int iM844 = C0178.m844();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = iM844 >= 0 ? 1709 : 1678;
                case 204:
                    System.out.println(Long.parseLong(C0168.m808("KBYPi")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* renamed from: QU */
    private HashMap<String, String> m793QU(String str) {
        String str2 = "ۥۨۡ";
        HashMap<String, String> map = null;
        String strM861 = null;
        String strM8612 = null;
        short[] sArr = null;
        while (true) {
            switch (C0174.m829(str2)) {
                case 56570:
                    str2 = "ۥۢۢ";
                    sArr = f887short;
                    break;
                case 1746688:
                    str2 = "ۣ۠ۨ";
                    sArr = f887short;
                    break;
                case 1746693:
                    str2 = "۠۟ۥ";
                    strM8612 = C0174.m828(sArr, 10, 19, 2889);
                    break;
                case 1747654:
                    map.put(strM861, strM8612);
                    str2 = "ۣۣۧ";
                    break;
                case 1747682:
                    str2 = "۟۟ۥ";
                    sArr = f887short;
                    break;
                case 1748678:
                    str2 = "ۨۥۦ";
                    strM8612 = C0174.m828(sArr, 29, 16, 2461);
                    break;
                case 1748765:
                    str2 = "ۣۣۧ";
                    sArr = f887short;
                    break;
                case 1748771:
                    map.put(strM8612, strM861);
                    str2 = "ۨ۠ۢ";
                    break;
                case 1748893:
                    str2 = "ۣۢۡ";
                    sArr = f887short;
                    break;
                case 1750626:
                    str2 = "۠۠ۢ";
                    strM861 = C0165.m798(sArr, 0, 10, 748);
                    break;
                case 1750663:
                    str2 = "ۨ۟ۢ";
                    strM861 = f794q;
                    break;
                case 1750783:
                    str2 = "ۣۤ۠";
                    strM861 = C0172.m820(sArr, 73, 5, 1222);
                    break;
                case 1751493:
                    return map;
                case 1751617:
                    map.put(strM861, strM8612);
                    str2 = "ۤ۟۠";
                    break;
                case 1752549:
                    str2 = "ۡۤۦ";
                    strM861 = C0182.m861(sArr, 57, 16, 1781);
                    break;
                case 1752734:
                    map = new HashMap<>();
                    str2 = "ۡۨۤ";
                    break;
                case 1755339:
                    str2 = "ۡۡۦ";
                    sArr = f887short;
                    break;
                case 1755370:
                    str2 = "ۡۤ۠";
                    strM8612 = this.f796FN;
                    break;
                case 1755529:
                    map.put(strM8612, strM861);
                    str2 = "۟۟۠";
                    break;
                default:
                    str2 = "ۨۢ";
                    strM8612 = C0182.m861(sArr, 45, 12, 2694);
                    break;
            }
        }
    }

    /* renamed from: UJ */
    private String m794UJ(String str) {
        AbstractC0099V3.Qe qe = new AbstractC0099V3.Qe(this) { // from class: com.github.catvod.spider.qiao2.1

            /* renamed from: xC */
            final qiao2 f807xC;

            {
                this.f807xC = this;
                int iM844 = C0178.m844();
                int i = 1616;
                while (true) {
                    i ^= 1633;
                    switch (i) {
                        case 14:
                        case 49:
                            i = iM844 >= 0 ? 1709 : 1678;
                        case 204:
                            System.out.println(Long.decode(C0168.m808("xcltgQJyEBKj7tgiz")));
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
            public String onResponse(String str2) {
                return str2;
            }
        };
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0176.m836(f887short, 78, 4, 816), this.f801W);
            jSONObject.put(C0179.m849(f887short, 82, 4, 1213), str);
            C0106ZJ.m486MH(C0106ZJ.m488QU(), this.f803se, jSONObject.toString(), m796xC(), qe);
            return qe.getResult();
        } catch (Throwable th) {
            return "";
        }
    }

    public static String formUpload(String str, String str2, String str3, String str4, String str5) {
        OkHttpClient okHttpClient = new OkHttpClient();
        String str6 = C0176.m836(f887short, 86, 15, 2818) + getRandomNickname(10);
        MediaType mediaType = MediaType.parse(C0182.m861(f887short, 101, 21, 2701) + str6);
        StringBuilder sb = new StringBuilder();
        sb.append(C0165.m798(f887short, 122, 2, 1302));
        sb.append(str6);
        sb.append(C0171.m816(f887short, 124, 53, 2819));
        sb.append(str2);
        String strM861 = C0182.m861(f887short, 177, 4, 1108);
        sb.append(strM861);
        sb.append(str6);
        sb.append(C0183.m866(f887short, 181, 50, 875));
        sb.append(str3);
        sb.append(strM861);
        sb.append(str6);
        sb.append(C0170.m814(f887short, 231, 48, 2339));
        sb.append(str4);
        sb.append(strM861);
        sb.append(str6);
        sb.append(C0182.m861(f887short, 279, 6, 3106));
        try {
            return okHttpClient.newCall(new Request.Builder().url(str).post(RequestBody.create(mediaType, sb.toString())).addHeader(C0172.m820(f887short, 285, 10, 2626), "").addHeader(C0170.m814(f887short, 295, 5, 694), str5).addHeader(C0180.m851(f887short, 330, 12, 843), C0181.m856(f887short, 300, 30, 1030) + str6).build()).execute().body().string();
        } catch (IOException e) {
            System.out.println(C0165.m798(f887short, 342, 3, 1889) + e);
            return C0174.m828(f887short, 345, 4, 1036);
        }
    }

    public static String formUploadV5(String str, String str2, String str3, String str4, String str5, String str6) {
        OkHttpClient okHttpClient = new OkHttpClient();
        String str7 = C0178.m845(f887short, 349, 15, 717) + getRandomNickname(10);
        MediaType mediaType = MediaType.parse(C0169.m809(f887short, 364, 21, 2475) + str7);
        StringBuilder sb = new StringBuilder();
        sb.append(C0170.m814(f887short, 385, 2, 3152));
        sb.append(str7);
        sb.append(C0181.m856(f887short, 387, 53, 2395));
        sb.append(str2);
        String strM820 = C0172.m820(f887short, 440, 4, 2302);
        sb.append(strM820);
        sb.append(str7);
        sb.append(C0174.m828(f887short, 444, 50, 3157));
        sb.append(str3);
        sb.append(strM820);
        sb.append(str7);
        sb.append(C0170.m814(f887short, 494, 48, 875));
        sb.append(str4);
        sb.append(strM820);
        sb.append(str7);
        sb.append(C0169.m809(f887short, 542, 49, 422));
        sb.append(str5);
        sb.append(strM820);
        sb.append(str7);
        sb.append(C0179.m849(f887short, 591, 6, 585));
        try {
            return okHttpClient.newCall(new Request.Builder().url(str).post(RequestBody.create(mediaType, sb.toString())).addHeader(C0182.m861(f887short, 597, 5, 958), str6).addHeader(C0174.m828(f887short, 602, 10, 2678), C0175.m834(f887short, 612, 19, 2832)).addHeader(C0180.m851(f887short, 631, 16, 2443), f794q).addHeader(C0170.m814(f887short, 677, 12, 616), C0166.m801(f887short, 647, 30, 1949) + str7).build()).execute().body().string();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000c. Please report as an issue. */
    public static String getRandomNickname(int i) {
        Random random = new Random();
        String str = "";
        int i2 = 0;
        while (true) {
            int i3 = 1616;
            while (true) {
                i3 ^= 1633;
                switch (i3) {
                    case 14:
                    case 49:
                        i3 = i2 < i ? 1709 : 1678;
                    case 204:
                        str = str + String.valueOf(random.nextInt(10));
                        i2++;
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
                        break;
                    case 239:
                        break;
                }
                return str;
            }
        }
    }

    /* renamed from: q */
    private void m795q() {
        JSONObject jSONObject = new JSONObject(C0114dC.m577q(this.f797MH.substring(1), this.f795B));
        this.f802i = jSONObject.optString(C0176.m836(f887short, 689, 3, 581));
        f794q = jSONObject.optString(C0169.m809(f887short, 692, 4, 2190));
        this.f800UJ = jSONObject.optString(C0166.m801(f887short, 696, 2, 1048));
        this.f803se = jSONObject.optString(C0181.m856(f887short, 698, 7, 2395));
        this.f801W = jSONObject.optString(C0180.m851(f887short, 705, 7, 1982));
        String strM866 = C0183.m866(f887short, 712, 5, 1484);
        boolean zHas = jSONObject.has(strM866);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = zHas ? 1709 : 1678;
                case 204:
                    this.f796FN = jSONObject.optString(strM866);
                    break;
                case 239:
                    break;
            }
        }
        HashMap map = new HashMap();
        map.put(C0165.m798(f887short, 717, 10, 2504), C0177.m841(f887short, 727, 18, 2648));
        String strM484FN = C0106ZJ.m484FN(jSONObject.optString(C0177.m841(f887short, 745, 6, 1754)), map);
        StringBuilder sb = new StringBuilder();
        JSONObject jSONObject2 = new JSONObject(strM484FN);
        String strM820 = C0172.m820(f887short, 751, 6, 1229);
        sb.append(jSONObject2.optString(strM820));
        sb.append(jSONObject.optString(C0182.m861(f887short, 757, 3, 2087)));
        this.f806xC = sb.toString();
        this.f799QU = new JSONObject(strM484FN).optString(strM820) + jSONObject.optString(C0181.m856(f887short, 760, 9, 2974));
        int iM840 = C0177.m840();
        int i2 = 1740;
        while (true) {
            i2 ^= 1757;
            switch (i2) {
                case 17:
                    i2 = iM840 >= 0 ? 1833 : 1802;
                case 54:
                case 471:
                    break;
                case 500:
                    System.out.println(Long.valueOf(C0176.m789("7hh8cSUPwuJPyiv")));
                    break;
            }
            return;
        }
    }

    /* renamed from: xC */
    private HashMap<String, String> m796xC() {
        String str = "۟ۢۥ";
        String strM866 = null;
        String strM849 = null;
        HashMap<String, String> map = null;
        short[] sArr = null;
        while (true) {
            switch (C0174.m829(str)) {
                case 1746694:
                    str = "۟ۥۢ";
                    sArr = f887short;
                    break;
                case 1746786:
                    str = "۟۟ۦ";
                    map = new HashMap<>();
                    break;
                case 1746816:
                    map.put(strM849, strM866);
                    str = "ۣۨۨ";
                    break;
                case 1746876:
                    str = "ۨۡۨ";
                    strM849 = C0179.m849(sArr, 769, 10, 1515);
                    break;
                case 1748610:
                    strM866 = C0183.m866(sArr, 779, 18, 971);
                    str = "ۣ۟ۤ";
                    break;
                case 1755469:
                    return map;
                default:
                    str = "ۡ۟۠";
                    sArr = f887short;
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:72:0x02e0. Please report as an issue. */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        JSONObject jSONObject;
        String strM845 = C0178.m845(f887short, 797, 11, 1659);
        String strM861 = C0182.m861(f887short, 808, 7, 783);
        String strM851 = C0180.m851(f887short, 815, 8, 2156);
        String strM849 = C0179.m849(f887short, 823, 6, 1718);
        String strM805 = C0168.m805(f887short, 829, 5, 2268);
        String strM841 = C0177.m841(f887short, 834, 5, 2490);
        String strM834 = C0175.m834(f887short, 839, 4, 2237);
        String strM798 = C0165.m798(f887short, 843, 4, 2387);
        String strM8412 = C0177.m841(f887short, 847, 4, 1771);
        try {
            boolean zIsEmpty = this.f806xC.isEmpty();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = zIsEmpty ? 1709 : 1678;
                    case 204:
                        m795q();
                        break;
                    case 239:
                        break;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            String str3 = this.f806xC + C0175.m834(f887short, 851, 10, 1504);
            int i2 = 1740;
            while (true) {
                i2 ^= 1757;
                switch (i2) {
                    case 17:
                        i2 = map == null ? 1833 : 1802;
                    case 54:
                    case 471:
                        break;
                    case 500:
                        map = new HashMap<>();
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
            boolean zContainsKey = map.containsKey(strM798);
            int i4 = 48767;
            while (true) {
                i4 ^= 48784;
                switch (i4) {
                    case 14:
                    case 45:
                        break;
                    case 76:
                        map.put(strM798, "");
                        break;
                    case 239:
                        i4 = !zContainsKey ? 48860 : 48829;
                }
            }
            boolean zContainsKey2 = map.containsKey(strM8412);
            int i5 = 48891;
            while (true) {
                i5 ^= 48908;
                switch (i5) {
                    case 22:
                    case 53:
                        break;
                    case 503:
                        i5 = !zContainsKey2 ? 49635 : 48953;
                    case 32495:
                        map.put(strM8412, "");
                        break;
                }
            }
            boolean zContainsKey3 = map.containsKey(strM834);
            int i6 = 49666;
            while (true) {
                i6 ^= 49683;
                switch (i6) {
                    case 17:
                        i6 = !zContainsKey3 ? 49759 : 49728;
                    case 50:
                    case 76:
                        map.put(strM834, "");
                        break;
                    case 83:
                        break;
                }
            }
            boolean zContainsKey4 = map.containsKey(strM841);
            int i7 = 49790;
            while (true) {
                i7 ^= 49807;
                switch (i7) {
                    case 18:
                    case 51:
                        break;
                    case 84:
                        map.put(strM841, "");
                        break;
                    case 241:
                        i7 = !zContainsKey4 ? 49883 : 49852;
                }
            }
            JSONObject jSONObject3 = new JSONObject(C0106ZJ.m484FN(((((((((str3 + C0179.m849(f887short, 861, 9, 2032) + str) + C0182.m861(f887short, 870, 6, 1584) + map.get(strM798)) + C0175.m834(f887short, 876, 6, 2488)) + C0177.m841(f887short, 882, 6, 2675) + map.get(strM834)) + C0175.m834(f887short, 888, 11, 578)) + C0177.m841(f887short, 899, 11, 2186) + map.get(strM8412)) + C0181.m856(f887short, 910, 6, 407) + str2) + C0166.m801(f887short, 916, 12, 1474)) + C0183.m866(f887short, 928, 25, 1872) + m794UJ(strM8412), m793QU("")));
            int i8 = jSONObject3.getInt(C0168.m805(f887short, 953, 10, 1820));
            String strM7982 = C0165.m798(f887short, 963, 4, 810);
            int i9 = 49914;
            while (true) {
                i9 ^= 49931;
                switch (i9) {
                    case 497:
                        i9 = i8 == 0 ? 50658 : 50627;
                    case 1711:
                    case 1736:
                        String strM577q = C0114dC.m577q(m794UJ(C0165.m798(f887short, 967, 3, 2090)).substring(1), this.f795B);
                        jSONObject = new JSONObject(C0152vp.m722FN(C0117f4.m599xC(jSONObject3.optString(strM7982).replace(C0166.m801(f887short, 975, 4, 2014), C0183.m866(f887short, 979, 13, 381))), new JSONObject(strM577q).optString(C0170.m814(f887short, 970, 3, 1351)), new JSONObject(strM577q).optString(C0177.m841(f887short, 973, 2, 1195))));
                        break;
                    case 1769:
                        JSONObject jSONObject4 = new JSONObject(jSONObject3.optString(strM7982));
                        int i10 = 50689;
                        while (true) {
                            i10 ^= 50706;
                            switch (i10) {
                                case 19:
                                    i10 = 50720;
                                    continue;
                                case 50:
                                    jSONObject = jSONObject4;
                                    break;
                                default:
                                    continue;
                            }
                        }
                }
            }
            JSONArray jSONArray = jSONObject.getJSONArray(strM7982);
            JSONArray jSONArray2 = new JSONArray();
            int i11 = 0;
            while (true) {
                int length = jSONArray.length();
                int i12 = 50813;
                while (true) {
                    i12 ^= 50830;
                    switch (i12) {
                        case 18:
                        case 53:
                            break;
                        case 243:
                            i12 = i11 < length ? 51557 : 50875;
                        case 4075:
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i11);
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put(strM849, jSONObjectOptJSONObject.optString(strM849));
                            jSONObject5.put(strM851, jSONObjectOptJSONObject.optString(strM851));
                            jSONObject5.put(strM861, jSONObjectOptJSONObject.optString(strM861));
                            jSONObject5.put(strM845, jSONObjectOptJSONObject.optString(strM845));
                            jSONArray2.put(jSONObject5);
                            int i13 = i11 + 1;
                            int i14 = 51588;
                            while (true) {
                                i14 ^= 51605;
                                switch (i14) {
                                    case 17:
                                        i14 = 51619;
                                        break;
                                    case 54:
                                        break;
                                }
                            }
                            i11 = i13;
                            break;
                    }
                    int i15 = jSONObject.getInt(strM805);
                    jSONObject2.put(C0170.m814(f887short, 992, 4, 815), str2);
                    jSONObject2.put(C0178.m845(f887short, 996, 9, 1836), i15 / 21);
                    jSONObject2.put(C0170.m814(f887short, 1005, 5, 1248), 21);
                    jSONObject2.put(strM805, i15);
                    jSONObject2.put(C0166.m801(f887short, 1010, 4, 519), jSONArray2);
                    return jSONObject2.toString();
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x02d8. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x033b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:50:0x0364. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:57:0x03e8. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:70:0x0413. Please report as an issue. */
    public String detailContent(List<String> list) {
        JSONObject jSONObject;
        String strM820 = C0172.m820(f887short, 1014, 11, 1313);
        String strM801 = C0166.m801(f887short, 1025, 3, 538);
        String strM798 = C0165.m798(f887short, 1028, 11, 1687);
        String strM809 = C0169.m809(f887short, 1039, 12, 588);
        String strM856 = C0181.m856(f887short, 1051, 9, 988);
        String strM7982 = C0165.m798(f887short, 1060, 11, 3272);
        String strM8012 = C0166.m801(f887short, 1071, 8, 2964);
        String strM8562 = C0181.m856(f887short, 1079, 8, 712);
        String strM805 = C0168.m805(f887short, 1087, 7, 500);
        String strM8563 = C0181.m856(f887short, 1094, 8, 1511);
        String strM845 = C0178.m845(f887short, 1102, 6, 860);
        try {
            boolean zIsEmpty = this.f806xC.isEmpty();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = zIsEmpty ? 1709 : 1678;
                    case 204:
                        m795q();
                        break;
                    case 239:
                        break;
                }
            }
            Init.m46lj();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject(C0106ZJ.m484FN(this.f806xC + C0165.m798(f887short, 1108, 15, 532) + list.get(0) + C0166.m801(f887short, 1123, 25, 2786) + m794UJ(C0183.m866(f887short, 1148, 6, 2643)), m793QU("")));
            int i2 = jSONObject4.getInt(C0178.m845(f887short, 1154, 10, 1289));
            String strM834 = C0175.m834(f887short, 1164, 4, 3233);
            int i3 = 1740;
            while (true) {
                i3 ^= 1757;
                switch (i3) {
                    case 17:
                        i3 = i2 == 0 ? 1833 : 1802;
                    case 54:
                    case 471:
                        try {
                            String strM577q = C0114dC.m577q(m794UJ(C0172.m820(f887short, 1168, 3, 1543)).substring(1), this.f795B);
                            jSONObject = new JSONObject(C0152vp.m722FN(C0117f4.m599xC(jSONObject4.optString(strM834).replace(C0169.m809(f887short, 1176, 4, 1428), C0171.m816(f887short, 1180, 13, 3169))), new JSONObject(strM577q).optString(C0179.m849(f887short, 1171, 3, 1556)), new JSONObject(strM577q).optString(C0171.m816(f887short, 1174, 2, 1066))));
                            break;
                        } catch (Throwable th) {
                            int i4 = 51712;
                            while (true) {
                                i4 ^= 51729;
                                switch (i4) {
                                    case 14:
                                        return "";
                                    case 17:
                                        i4 = 51743;
                                        continue;
                                }
                            }
                        }
                        break;
                    case 500:
                        jSONObject = new JSONObject(jSONObject4.optString(strM834));
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
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            jSONObject2.put(strM845, jSONObject.optString(strM845));
            jSONObject2.put(strM8563, jSONObject.optString(strM8563));
            jSONObject2.put(strM805, jSONObject.optString(strM805));
            jSONObject2.put(C0183.m866(f887short, 1193, 9, 1136), jSONObject.optString(C0172.m820(f887short, 1202, 9, 2685)));
            jSONObject2.put(strM8562, jSONObject.optString(strM8562));
            jSONObject2.put(strM8012, jSONObject.optString(strM8012));
            jSONObject2.put(strM7982, jSONObject.optString(strM7982));
            jSONObject2.put(strM856, jSONObject.optString(strM856));
            jSONObject2.put(strM809, jSONObject.optString(strM809));
            jSONObject2.put(strM798, C0172.m820(f887short, 1211, 16, 1877) + jSONObject.optString(strM798));
            JSONArray jSONArray = jSONObject.getJSONArray(C0168.m805(f887short, 1227, 13, 1786));
            int i6 = 0;
            while (true) {
                int i7 = i6;
                int length = jSONArray.length();
                int i8 = 48767;
                while (true) {
                    i8 ^= 48784;
                    switch (i8) {
                        case 14:
                        case 45:
                            break;
                        case 76:
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i7);
                            String strOptString = jSONObjectOptJSONObject.optJSONObject(strM820).optString(C0181.m856(f887short, 1240, 4, 355));
                            String strOptString2 = jSONObjectOptJSONObject.optJSONObject(strM820).optString(C0169.m809(f887short, 1244, 4, 2377));
                            boolean zContains = strOptString.contains(C0172.m820(f887short, 1248, 3, 3126));
                            int i9 = 48891;
                            while (true) {
                                i9 ^= 48908;
                                switch (i9) {
                                    case 22:
                                    case 53:
                                        ArrayList arrayList3 = new ArrayList();
                                        JSONArray jSONArray2 = jSONObjectOptJSONObject.getJSONArray(C0170.m814(f887short, 1251, 4, 2816));
                                        int i10 = 0;
                                        while (true) {
                                            int length2 = jSONArray2.length();
                                            int i11 = 49790;
                                            while (true) {
                                                i11 ^= 49807;
                                                switch (i11) {
                                                    case 18:
                                                    case 51:
                                                        break;
                                                    case 84:
                                                        JSONObject jSONObjectOptJSONObject2 = jSONArray2.optJSONObject(i10);
                                                        arrayList3.add(jSONObjectOptJSONObject2.optString(C0179.m849(f887short, 1255, 4, 1216)) + C0174.m828(f887short, 1259, 1, 2013) + jSONObjectOptJSONObject2.optString(C0171.m816(f887short, 1260, 3, 3162)) + C0172.m820(f887short, 1263, 1, 653) + strOptString2);
                                                        int i12 = i10 + 1;
                                                        int i13 = 49914;
                                                        while (true) {
                                                            i13 ^= 49931;
                                                            switch (i13) {
                                                                case 497:
                                                                    i13 = 50596;
                                                                case 1711:
                                                                    break;
                                                            }
                                                        }
                                                        i10 = i12;
                                                        break;
                                                    case 241:
                                                        i11 = i10 < length2 ? 49883 : 49852;
                                                }
                                                boolean zIsEmpty2 = arrayList3.isEmpty();
                                                int i14 = 50689;
                                                while (true) {
                                                    i14 ^= 50706;
                                                    switch (i14) {
                                                        case 19:
                                                            i14 = zIsEmpty2 ? 50782 : 50751;
                                                        case 45:
                                                            arrayList.add(strOptString);
                                                            arrayList2.add(TextUtils.join(C0177.m841(f887short, 1264, 1, 396), arrayList3));
                                                            break;
                                                        case 50:
                                                        case 76:
                                                            int i15 = 50813;
                                                            while (true) {
                                                                i15 ^= 50830;
                                                                switch (i15) {
                                                                    case 18:
                                                                        break;
                                                                    case 243:
                                                                        i15 = 50844;
                                                                }
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                    case 503:
                                        i9 = zContains ? 49635 : 48953;
                                    case 32495:
                                        int i16 = 49666;
                                        while (true) {
                                            i16 ^= 49683;
                                            switch (i16) {
                                                case 17:
                                                    i16 = 49697;
                                                case 50:
                                                    break;
                                            }
                                            break;
                                        }
                                }
                            }
                            i6 = i7 + 1;
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
                            break;
                        case 239:
                            i8 = i7 < length ? 48860 : 48829;
                    }
                    String strJoin = TextUtils.join(strM801, arrayList);
                    String strJoin2 = TextUtils.join(strM801, arrayList2);
                    jSONObject2.put(C0183.m866(f887short, 1265, 13, 747), strJoin);
                    jSONObject2.put(C0176.m836(f887short, 1278, 12, 352), strJoin2);
                    JSONArray jSONArray3 = new JSONArray();
                    jSONArray3.put(jSONObject2);
                    jSONObject3.put(C0178.m845(f887short, 1290, 4, 1408), jSONArray3);
                    return jSONObject3.toString();
                }
            }
        } catch (Throwable th2) {
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x013a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:43:0x018d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x01cc. Please report as an issue. */
    public String homeContent(boolean z) {
        JSONArray jSONArray;
        String strM828 = C0174.m828(f887short, 1294, 4, 2481);
        try {
            boolean zIsEmpty = this.f806xC.isEmpty();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = zIsEmpty ? 1709 : 1678;
                    case 204:
                        m795q();
                        break;
                    case 239:
                        break;
                }
            }
            String strM484FN = C0106ZJ.m484FN(this.f799QU + C0165.m798(f887short, 1298, 6, 694) + m794UJ(C0169.m809(f887short, 1304, 6, 591)), m793QU(""));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            JSONObject jSONObject2 = new JSONObject(strM484FN);
            int i2 = jSONObject2.getInt(C0166.m801(f887short, 1310, 10, 2551));
            String strM861 = C0182.m861(f887short, 1320, 13, 1839);
            String strM836 = C0176.m836(f887short, 1333, 4, 2725);
            int i3 = 1740;
            while (true) {
                i3 ^= 1757;
                switch (i3) {
                    case 17:
                        i3 = i2 == 0 ? 1833 : 1802;
                    case 54:
                    case 471:
                        String strM577q = C0114dC.m577q(m794UJ(C0172.m820(f887short, 1337, 3, 752)).substring(1), this.f795B);
                        jSONArray = new JSONObject(C0152vp.m722FN(C0117f4.m599xC(jSONObject2.optString(strM836).replace(C0174.m828(f887short, 1345, 4, 1391), C0175.m834(f887short, 1349, 13, 2202))), new JSONObject(strM577q).optString(C0170.m814(f887short, 1340, 3, 2843)), new JSONObject(strM577q).optString(C0176.m836(f887short, 1343, 2, 2711)))).getJSONArray(strM861);
                        break;
                    case 500:
                        jSONArray = new JSONObject(jSONObject2.optString(strM836)).getJSONArray(strM861);
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
            int i5 = 0;
            while (true) {
                int length = jSONArray.length();
                int i6 = 48767;
                while (true) {
                    i6 ^= 48784;
                    switch (i6) {
                        case 14:
                        case 45:
                            break;
                        case 76:
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i5);
                            boolean zHas = jSONObjectOptJSONObject.has(strM828);
                            String strM851 = C0180.m851(f887short, 1362, 2, 3002);
                            int i7 = 48891;
                            while (true) {
                                i7 ^= 48908;
                                switch (i7) {
                                    case 22:
                                    case 53:
                                        JSONObject jSONObject3 = new JSONObject();
                                        boolean zHas2 = jSONObjectOptJSONObject.has(strM828);
                                        String strM809 = C0169.m809(f887short, 1368, 7, 2715);
                                        int i8 = 49790;
                                        while (true) {
                                            i8 ^= 49807;
                                            switch (i8) {
                                                case 18:
                                                case 51:
                                                    jSONObject3.put(strM809, jSONObjectOptJSONObject.optString(strM851));
                                                    break;
                                                case 84:
                                                    jSONObject3.put(strM809, jSONObjectOptJSONObject.optString(strM828));
                                                    int i9 = 49914;
                                                    while (true) {
                                                        i9 ^= 49931;
                                                        switch (i9) {
                                                            case 497:
                                                                i9 = 50596;
                                                            case 1711:
                                                                break;
                                                        }
                                                        break;
                                                    }
                                                case 241:
                                                    i8 = zHas2 ? 49883 : 49852;
                                            }
                                        }
                                        jSONObject3.put(C0175.m834(f887short, 1375, 9, 2889), jSONObjectOptJSONObject.optString(C0178.m845(f887short, 1384, 5, 3247)));
                                        jSONArray2.put(jSONObject3);
                                        break;
                                    case 503:
                                        i7 = !zHas ? 49635 : 48953;
                                    case 32495:
                                        this.f804u = jSONObjectOptJSONObject.optString(strM851);
                                        this.f798Mo = jSONObjectOptJSONObject.optString(C0181.m856(f887short, 1364, 4, 1685));
                                        int i10 = 49666;
                                        while (true) {
                                            i10 ^= 49683;
                                            switch (i10) {
                                                case 17:
                                                    i10 = 49697;
                                                case 50:
                                                    break;
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                            i5++;
                            int i11 = 50689;
                            while (true) {
                                i11 ^= 50706;
                                switch (i11) {
                                    case 19:
                                        i11 = 50720;
                                        break;
                                    case 50:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            i6 = i5 < length ? 48860 : 48829;
                    }
                    jSONObject.put(C0171.m816(f887short, 1389, 5, 3065), jSONArray2);
                    int i12 = 50813;
                    while (true) {
                        i12 ^= 50830;
                        switch (i12) {
                            case 18:
                                break;
                            case 53:
                                break;
                            case 243:
                                if (!z) {
                                    break;
                                } else {
                                    i12 = 51557;
                                }
                            case 4075:
                                jSONObject.put(C0171.m816(f887short, 1394, 7, 3142), new JSONObject("{\"1\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"警匪\",\"v\":\"警匪\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动画\",\"v\":\"动画\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"枪战\",\"v\":\"枪战\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"青春\",\"v\":\"青春\"},{\"n\":\"文艺\",\"v\":\"文艺\"},{\"n\":\"微电影\",\"v\":\"微电影\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"农村\",\"v\":\"农村\"},{\"n\":\"儿童\",\"v\":\"儿童\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"中国大陆\",\"v\":\"大陆\"},{\"n\":\"中国香港\",\"v\":\"香港\"},{\"n\":\"中国台湾\",\"v\":\"台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]}],\"2\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"青春偶像\",\"v\":\"青春偶像\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"家庭\",\"v\":\"家庭\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"乡村\",\"v\":\"乡村\"},{\"n\":\"情景\",\"v\":\"情景\"},{\"n\":\"商战\",\"v\":\"商战\"},{\"n\":\"网剧\",\"v\":\"网剧\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"中国大陆\",\"v\":\"大陆\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]}],\"4\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"热血\",\"v\":\"热血\"},{\"n\":\"推理\",\"v\":\"推理\"},{\"n\":\"搞笑\",\"v\":\"搞笑\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"萝莉\",\"v\":\"萝莉\"},{\"n\":\"校园\",\"v\":\"校园\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"机战\",\"v\":\"机战\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"少年\",\"v\":\"少年\"},{\"n\":\"少女\",\"v\":\"少女\"},{\"n\":\"社会\",\"v\":\"社会\"},{\"n\":\"原创\",\"v\":\"原创\"},{\"n\":\"亲子\",\"v\":\"亲子\"},{\"n\":\"益智\",\"v\":\"益智\"},{\"n\":\"励志\",\"v\":\"励志\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国\",\"v\":\"内地\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"欧美\",\"v\":\"欧美\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}],\"3\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"选秀\",\"v\":\"选秀\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"访谈\",\"v\":\"访谈\"},{\"n\":\"播报\",\"v\":\"播报\"},{\"n\":\"旅游\",\"v\":\"旅游\"},{\"n\":\"音乐\",\"v\":\"音乐\"},{\"n\":\"美食\",\"v\":\"美食\"},{\"n\":\"纪实\",\"v\":\"纪实\"},{\"n\":\"曲艺\",\"v\":\"曲艺\"},{\"n\":\"生活\",\"v\":\"生活\"},{\"n\":\"游戏互动\",\"v\":\"游戏互动\"},{\"n\":\"财经\",\"v\":\"财经\"},{\"n\":\"求职\",\"v\":\"求职\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"港台\",\"v\":\"港台\"},{\"n\":\"日韩\",\"v\":\"日韩\"},{\"n\":\"欧美\",\"v\":\"欧美\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]}]}]}"));
                                break;
                            default:
                                continue;
                        }
                        i12 = 50875;
                    }
                    return jSONObject.toString();
                }
            }
        } catch (Throwable th) {
            System.out.println(th);
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x018e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x01cd. Please report as an issue. */
    public String homeVideoContent() {
        JSONArray jSONArray;
        String strM841 = C0177.m841(f887short, 1401, 11, 772);
        String strM856 = C0181.m856(f887short, 1412, 7, 2825);
        String strM836 = C0176.m836(f887short, 1419, 8, 2920);
        String strM814 = C0170.m814(f887short, 1427, 6, 2766);
        try {
            JSONObject jSONObject = new JSONObject(C0106ZJ.m484FN(this.f806xC + C0176.m836(f887short, 1433, 14, 879) + this.f804u + C0180.m851(f887short, 1447, 6, 1513) + this.f798Mo + C0183.m866(f887short, 1453, 25, 2295) + m794UJ(C0183.m866(f887short, 1478, 4, 2403)), m793QU("")));
            JSONArray jSONArray2 = new JSONArray();
            int i = jSONObject.getInt(C0174.m828(f887short, 1482, 10, 981));
            String strM861 = C0182.m861(f887short, 1492, 5, 2356);
            String strM8612 = C0182.m861(f887short, 1497, 8, 1879);
            String strM845 = C0178.m845(f887short, 1505, 4, 1348);
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                    case 49:
                        i2 = i == 0 ? 1709 : 1678;
                    case 204:
                        jSONArray = new JSONObject(jSONObject.optString(strM845)).getJSONArray(strM8612).optJSONObject(1).getJSONArray(strM861);
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = 1771;
                                    continue;
                                case 54:
                                    break;
                                default:
                                    continue;
                            }
                        }
                    case 239:
                        String strM577q = C0114dC.m577q(m794UJ(C0183.m866(f887short, 1509, 3, 2261)).substring(1), this.f795B);
                        jSONArray = new JSONObject(C0152vp.m722FN(C0117f4.m599xC(jSONObject.optString(strM845).replace(C0176.m836(f887short, 1517, 4, 1368), C0170.m814(f887short, 1521, 13, 451))), new JSONObject(strM577q).optString(C0170.m814(f887short, 1512, 3, 2421)), new JSONObject(strM577q).optString(C0178.m845(f887short, 1515, 2, 2111)))).getJSONArray(strM8612).optJSONObject(1).getJSONArray(strM861);
                        break;
                }
            }
            int i4 = 0;
            while (true) {
                int length = jSONArray.length();
                int i5 = 1864;
                while (true) {
                    i5 ^= 1881;
                    switch (i5) {
                        case 17:
                            i5 = i4 < length ? 48736 : 48705;
                        case 47384:
                            break;
                        case 47417:
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i4);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(strM814, jSONObjectOptJSONObject.optString(strM814));
                            jSONObject2.put(strM836, jSONObjectOptJSONObject.optString(strM836));
                            jSONObject2.put(strM856, jSONObjectOptJSONObject.optString(strM856));
                            jSONObject2.put(strM841, jSONObjectOptJSONObject.optString(strM841));
                            jSONArray2.put(jSONObject2);
                            int i6 = i4 + 1;
                            int i7 = 48767;
                            while (true) {
                                i7 ^= 48784;
                                switch (i7) {
                                    case 14:
                                        break;
                                    case 239:
                                        i7 = 48798;
                                }
                            }
                            i4 = i6;
                            break;
                        case 47483:
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(C0169.m809(f887short, 1534, 4, 2313), jSONArray2);
                    return jSONObject3.toString();
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }

    public void init(Context context, String str) {
        String str2 = "ۦۦ۟";
        HashMap<String, String> mapM796xC = null;
        String strM724Mo = null;
        while (true) {
            switch (C0174.m829(str2)) {
                case 1747750:
                    this.f797MH = str;
                    str2 = "ۥ۠۠";
                    break;
                case 1748768:
                    mapM796xC = m796xC();
                    str2 = "ۧۤۢ";
                    break;
                case 1752485:
                    return;
                case 1754533:
                    str = C0106ZJ.m484FN(strM724Mo, mapM796xC);
                    str2 = "۠ۢۨ";
                    break;
                case 1754595:
                    str2 = "ۣۡۤ";
                    strM724Mo = C0152vp.m724Mo(str);
                    break;
                default:
                    super.init(context, str);
                    str2 = "ۧۦۢ";
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x0426, code lost:
    
        r4 = 54657;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0429, code lost:
    
        r4 = r4 ^ 54674;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x042d, code lost:
    
        switch(r4) {
            case 19: goto L232;
            case 50: goto L231;
            default: goto L234;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0431, code lost:
    
        r4 = 54688;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:119:0x0366. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:84:0x02aa. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String playerContent(java.lang.String r26, java.lang.String r27, java.util.List<java.lang.String> r28) {
        /*
            Method dump skipped, instructions count: 1418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.qiao2.playerContent(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0174. Please report as an issue. */
    public String searchContent(String str, boolean z) {
        JSONArray jSONArray;
        String strM866 = C0183.m866(f887short, 1658, 11, 1477);
        String strM841 = C0177.m841(f887short, 1669, 7, 3091);
        String strM809 = C0169.m809(f887short, 1676, 8, 349);
        String strM801 = C0166.m801(f887short, 1684, 6, 2794);
        try {
            boolean zIsEmpty = this.f806xC.isEmpty();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = zIsEmpty ? 1709 : 1678;
                    case 204:
                        m795q();
                        break;
                    case 239:
                        break;
                }
            }
            JSONObject jSONObject = new JSONObject();
            String strM484FN = C0106ZJ.m484FN(this.f806xC + C0180.m851(f887short, 1690, 17, 1792) + URLEncoder.encode(str) + C0178.m845(f887short, 1707, 38, 731) + m794UJ(C0170.m814(f887short, 1745, 6, 2638)), m793QU(""));
            JSONArray jSONArray2 = new JSONArray();
            JSONObject jSONObject2 = new JSONObject(strM484FN);
            int i2 = jSONObject2.getInt(C0172.m820(f887short, 1751, 10, 3014));
            String strM8092 = C0169.m809(f887short, 1761, 4, 2320);
            int i3 = 1740;
            while (true) {
                i3 ^= 1757;
                switch (i3) {
                    case 17:
                        i3 = i2 == 0 ? 1833 : 1802;
                    case 54:
                    case 471:
                        String strM577q = C0114dC.m577q(m794UJ(C0182.m861(f887short, 1765, 3, 1502)).substring(1), this.f795B);
                        jSONArray = new JSONObject(C0152vp.m722FN(C0117f4.m599xC(jSONObject2.optString(strM8092).replace(C0170.m814(f887short, 1773, 4, 2729), C0168.m805(f887short, 1777, 13, 583))), new JSONObject(strM577q).optString(C0170.m814(f887short, 1768, 3, 1484)), new JSONObject(strM577q).optString(C0179.m849(f887short, 1771, 2, 1089)))).getJSONArray(strM8092);
                        break;
                    case 500:
                        jSONArray = new JSONObject(jSONObject2.optString(strM8092)).getJSONArray(strM8092);
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
            int i5 = 0;
            while (true) {
                int length = jSONArray.length();
                int i6 = 48767;
                while (true) {
                    i6 ^= 48784;
                    switch (i6) {
                        case 14:
                        case 45:
                            break;
                        case 76:
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i5);
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put(strM801, jSONObjectOptJSONObject.optString(strM801));
                            jSONObject3.put(strM809, jSONObjectOptJSONObject.optString(strM809));
                            jSONObject3.put(strM841, jSONObjectOptJSONObject.optString(strM841));
                            jSONObject3.put(strM866, jSONObjectOptJSONObject.optString(strM866));
                            jSONArray2.put(jSONObject3);
                            int i7 = i5 + 1;
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
                            i5 = i7;
                            break;
                        case 239:
                            i6 = i5 < length ? 48860 : 48829;
                    }
                    jSONObject.put(C0169.m809(f887short, 1790, 4, 1662), jSONArray2);
                    return jSONObject.toString();
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }
}
