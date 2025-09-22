package com.github.catvod.spider;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.C0165;
import com.github.catvod.parser.C0166;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * NanGua Spider - A spider implementation for video content crawling
 * Readable version with improved naming and structure
 */
public class NanGua extends Spider {

    // Encryption/decryption key array - contains encoded values for string decryption
    private static final short[] ENCRYPTION_KEYS = {1379, 1407, 1407, 1403, 1329, 1316, 1316, 1381, 1388, 1379, 1391, 1317, 1384, 1379, 1386, 1381, 1388, 1382, 1390, 1381, 1388, 1394, 1406, 1381, 1317, 1384, 1380, 1382, 1834, 1855, 1834, 1824, 1133, 1122, 1128, 1150, 1123, 1125, 1128, 2775, 2775, 2589, 2561, 2591, 2561, 2591, 2793, 2796, 344, 350, 346, 346, 320, 347, 346, 338, 346, 1206, 1202, 1201, 1197, 1197, 1193, 1270, 1261, 1271, 1263, 1271, 1257, 2001, 2013, 2015, 1948, 2003, 1986, 1986, 1948, 2012, 2003, 2012, 2005, 1991, 2003, 1990, 1988, 2945, 3023, 3020, 3063, 3035, 3046, 3058, 3056, 2948, 3050, 3028, 3046, 2965, 3020, 3066, 2971, 2964, 3042, 2853, 2923, 2938, 2915, 2852, 2938, 2914, 2938, 2853, 2938, 2936, 2917, 2940, 2915, 2926, 2927, 2853, 2936, 2927, 2938, 2917, 2936, 2942, 2901, 2926, 2927, 2940, 2915, 2921, 2927, 2869, 2923, 2938, 2938, 2871, 2050, 2120, 2122, 2115, 2073, 3059, 3055, 3056, 3054, 2513, 2451, 2450, 2433, 2462, 2452, 2450, 2436, 2506, 1359, 1290, 1280, 1309, 1296, 1364, 571, 636, 633, 638, 626, 633, 632, 544, 1834, 1903, 1892, 1901, 1890, 1890, 1897, 1888, 1841, 2278, 2297, 2278, 2303, 1667, 1729, 1728, 1747, 1740, 1734, 1728, 1779, 1728, 1751, 1750, 1740, 1738, 1739, 1688, 2846, 2905, 2888, 2888, 2926, 2909, 2890, 2891, 2897, 2903, 2902, 2934, 2905, 2901, 2909, 2821, 2449, 2522, 2514, 2500, 2500, 2518, 2512, 2514, 2442, 32405, 27018, 27799, 26677, 27902, 20519, 17648, 1612, 1547, 1562, 1562, 1596, 1551, 1560, 1561, 1539, 1541, 1540, 1577, 1541, 1550, 1551, 1623, 417, 503, 501, 488, 497, 494, 489, 484, 482, 442, 402, 464, 477, 455, 448, 454, 477, 471, 448, 393, 775, 840, 844, 836, 840, 796, 2045, 1983, 1982, 1965, 1970, 1976, 1982, 1942, 1972, 1983, 1982, 1975, 2022, 782, 860, 833, 837, 845, 789, 3221, 3271, 3282, 3284, 3214, 2506, 2520, 2513, 2526, 2514, 2512, 2520, 458, 392, 393, 410, 389, 399, 393, 447, 399, 414, 393, 393, 386, 465, 2989, 3055, 3054, 3069, 3042, 3048, 3054, 3017, 3065, 3050, 3045, 3055, 2998, 2714, 2771, 2781, 2773, 2776, 2689, 1931, 1996, 1987, 1993, 2015, 1986, 1988, 1993, 2020, 2025, 1936, 378, 304, 317, 296, 353, 2482, 2484, 2466, 2468, 2482, 2482, 28407, 21395, 24591, 20608, 580, 577, 596, 577, 2222, 2217, 2231, 662, 671, 655, 665, 659, 642, 655, 671, 662, 654, 655, 671, 659, 641, 662, 671, 2202, 2195, 2179, 2178, 2207, 2197, 2184, 2192, 2200, 2195, 2185, 2197, 2207, 2193, 2200, 2178, 2920, 2939, 2924, 2925, 2935, 2929, 2928, 2881, 2928, 2943, 2931, 2939, 1063, 1076, 1059, 1058, 1080, 1086, 1087, 1038, 1074, 1086, 1077, 1076, 2073, 2056, 2058, 2050, 2056, 2062, 2060, 2102, 2055, 2056, 2052, 2060, 1012, 1019, 1009, 999, 1018, 1020, 1009, 988, 977, 1698, 1708, 1700, 1705, 2465, 2469, 2477, 2465, 3150, 3156, 3162, 3155, 3117, 3134, 3121, 3131, 3120, 3122, 1328, 1325, 1321, 1313, 1289, 1325, 1320, 1320, 1325, 1335, 2639, 2633, 2655, 2632, 2583, 2651, 2653, 2655, 2644, 2638, 3325, 3308, 3306, 3304, 3310, 3298, 3320, 3299, 3321, 2442, 2449, 2442, 2463, 2450, 3267, 3282, 3284, 3286, 821, 816, 810, 813, 812, 866, 883, 874, 813, 883, 875, 883, 812, 883, 881, 876, 885, 874, 871, 870, 812, 885, 876, 871, 860, 879, 874, 880, 887, 828, 866, 883, 883, 830, 1596, 1659, 1640, 1663, 1659, 1575, 1599, 1631, 1583, 1599, 1571, 1625, 1599, 1624, 1578, 1599, 1631, 1583, 1599, 1570, 1625, 1599, 1624, 1627, 1596, 1662, 1663, 1644, 1651, 1657, 1663, 1641, 1575, 3243, 3316, 3304, 3308, 3327, 3248, 3240, 3272, 3256, 3240, 3279, 3252, 3240, 3279, 3257, 3240, 3272, 3257, 3240, 3279, 3279, 3240, 3279, 3273, 3243, 3305, 3304, 3323, 3300, 3310, 3304, 3291, 3304, 3327, 3326, 3300, 3298, 3299, 3248, 691, 756, 741, 741, 707, 752, 743, 742, 764, 762, 763, 731, 756, 760, 752, 680, 2800, 2722, 2735, 2726, 2739, 2795, 2803, 2707, 2785, 2803, 2708, 2791, 2803, 2708, 2708, 2803, 2707, 2787, 2803, 2799, 2707, 2803, 2798, 2708, 2800, 2743, 2726, 2726, 2688, 2739, 2724, 2725, 2751, 2745, 2744, 2709, 2745, 2738, 2739, 2795, 3101, 3154, 3158, 3166, 3154, 3078, 1272, 1210, 1211, 1192, 1207, 1213, 1211, 1171, 1201, 1210, 1211, 1202, 1251, 378, 296, 309, 305, 313, 353, 417, 494, 483, 442, 1271, 1185, 1200, 1206, 1204, 1260, 1267, 1201, 1200, 1187, 1212, 1206, 1200, 1158, 1206, 1191, 1200, 1200, 1211, 1256, 627, 561, 560, 547, 572, 566, 560, 535, 551, 564, 571, 561, 616, 921, 976, 990, 982, 987, 898, 330, 269, 258, 264, 286, 259, 261, 264, 293, 296, 337, 27164, 27883, 685, 692, 703, 644, 690, 703, 3309, 3296, 1507, 1530, 1521, 1482, 1531, 1524, 1528, 1520, 3041, 3054, 3042, 3050, 2282, 2291, 2296, 2243, 2284, 2293, 2303, 2821, 2817, 2827, 1307, 1282, 1289, 1330, 1311, 1288, 1280, 1292, 1311, 1286, 1310, 2746, 2724, 2736, 3054, 3055, 3055, 866, 871, 867, 871, 890, 2154, 2154, 2154, 670, 657, 669, 661, 1208, 1213, 1192, 1213, 967, 905, 920, 897, 966, 920, 896, 920, 967, 920, 922, 903, 926, 897, 908, 909, 967, 926, 903, 908, 951, 908, 909, 924, 905, 897, 900, 983, 905, 920, 920, 981, 534, 596, 597, 582, 601, 595, 597, 579, 525, 1868, 1806, 1807, 1820, 1795, 1801, 1807, 1852, 1807, 1816, 1817, 1795, 1797, 1796, 1879, 2253, 2186, 2203, 2203, 2237, 2190, 2201, 2200, 2178, 2180, 2181, 2213, 2186, 2182, 2190, 2262, 753, 694, 679, 679, 641, 690, 677, 676, 702, 696, 697, 660, 696, 691, 690, 746, 1390, 1313, 1317, 1325, 1313, 1397, 887, 821, 820, 807, 824, 818, 820, 796, 830, 821, 820, 829, 876, 3108, 3190, 3179, 3183, 3175, 3135, 492, 419, 430, 503, 414, 476, 477, 462, 465, 475, 477, 491, 475, 458, 477, 477, 470, 389, 1291, 1353, 1352, 1371, 1348, 1358, 1352, 1391, 1375, 1356, 1347, 1353, 1296, 2526, 2455, 2457, 2449, 2460, 2501, 465, 406, 409, 403, 389, 408, 414, 403, 446, 435, 458, 823, 814, 805, 798, 808, 805, 1198, 1207, 1212, 1159, 1206, 1209, 1205, 1213, 2124, 2133, 2142, 2149, 2122, 2131, 2137, 832, 836, 846, 1762, 1775, 1766, 1779, 1737, 1784, 1783, 1787, 1779, 3160, 3157, 3164, 3145, 1680, 1673, 1666, 1721, 1695, 1667, 1671, 1684, 2920, 2932, 2928, 2915, 816, 809, 802, 793, 807, 820, 803, 807, 880, 873, 866, 857, 884, 867, 875, 871, 884, 877, 885, 2822, 2840, 2828, 1907, 1898, 1889, 1882, 1892, 1894, 1905, 1898, 1911, 1851, 1826, 1833, 1810, 1833, 1828, 1855, 1832, 1838, 1849, 1826, 1855, 867, 890, 881, 842, 886, 890, 891, 865, 880, 891, 865, 28580, 26469, 22307, 24396, 21928, 21901, -30215, -1076, -28873, 22079, 19146, 23443, 22295, -25001, -1087, -1087, 1233, 1238, 1246, 1239, 2813, 2785, 2796, 2804, 2792, 2815, 2770, 2788, 2787, 2795, 2786, 2484, 2479, 2472, 2480, 2743, 2728, 2725, 2724, 2734, 2718, 2728, 2735, 2727, 2734, 572, 1592, 1599, 1569, 2329, 2572, 2581, 2590, 2597, 2570, 2582, 2587, 2563, 2597, 2588, 2568, 2581, 2583, 1498, 1475, 1480, 1523, 1500, 1472, 1485, 1493, 1523, 1497, 1502, 1472, 1515, 1518, 1524, 1523, 2116, 2148, 2109, 2155, 2150, 2159, 2170, 2112, 2166, 2171, 2109, 2085, 2109, 2094, 2109, 2099, 2109, 2155, 2150, 2159, 2170, 2112, 2161, 2174, 2162, 2170, 2109, 2085, 2109, 32042, 22382, 2109, 2146, 2099, 2148, 2109, 2155, 2150, 2159, 2170, 2112, 2166, 2171, 2109, 2085, 2109, 2093, 2109, 2099, 2109, 2155, 2150, 2159, 2170, 2112, 2161, 2174, 2162, 2170, 2109, 2085, 2109, 32042, -32295, 23160, 2109, 2146, 2099, 2148, 2109, 2155, 2150, 2159, 2170, 2112, 2166, 2171, 2109, 2085, 2109, 2092, 2109, 2099, 2109, 2155, 2150, 2159, 2170, 2112, 2161, 2174, 2162, 2170, 2109, 2085, 2109, 30435, -30107, 2109, 2146, 2099, 2148, 2109, 2155, 2150, 2159, 2170, 2112, 2166, 2171, 2109, 2085, 2109, 2091, 2109, 2099, 2109, 2155, 2150, 2159, 2170, 2112, 2161, 2174, 2162, 2170, 2109, 2085, 2109, 23223, 26420, 2109, 2146, 2099, 2148, 2109, 2155, 2150, 2159, 2170, 2112, 2166, 2171, 2109, 2085, 2109, 2091, 2089, 2109, 2099, 2109, 2155, 2150, 2159, 2170, 2112, 2161, 2174, 2162, 2170, 2109, 2085, 2109, 20745, 23160, 2109, 2146, 2114, 2622, 2609, 2620, 2606, 2606, 2977, 451, 397, 412, 389, 450, 412, 388, 412, 451, 412, 414, 387, 410, 389, 392, 393, 451, 388, 387, 385, 393, 435, 392, 397, 408, 397, 467, 397, 412, 412, 465, 1831, 1893, 1892, 1911, 1896, 1890, 1892, 1906, 1852, 1890, 1824, 1825, 1842, 1837, 1831, 1825, 1810, 1825, 1846, 1847, 1837, 1835, 1834, 1913, 1256, 1199, 1214, 1214, 1176, 1195, 1212, 1213, 1191, 1185, 1184, 1152, 1199, 1187, 1195, 1267, 1286, 1345, 1360, 1360, 1398, 1349, 1362, 1363, 1353, 1359, 1358, 1379, 1359, 1348, 1349, 1309, 2692, 2763, 2767, 2759, 2763, 2719, 1141, 1079, 1078, 1061, 1082, 1072, 1078, 1054, 1084, 1079, 1078, 1087, 1134, 2182, 2260, 2249, 2253, 2245, 2205, 2908, 2835, 2846, 2887, 631, 565, 564, 551, 568, 562, 564, 514, 562, 547, 564, 564, 575, 620, 1882, 1816, 1817, 1802, 1813, 1823, 1817, 1854, 1806, 1821, 1810, 1816, 1857, 591, 518, 520, 512, 525, 596, 2542, 2473, 2470, 2476, 2490, 2471, 2465, 2476, 2433, 2444, 2549, 3083, 3092, 3089, 3100, 3101, 259, 262, 275, 262, 2289, 2302, 2290, 2298, 1589, 1580, 1575, 1564, 1578, 1575, 1741, 1728, 3104, 3129, 3122, 3081, 3128, 3127, 3131, 3123, 1466, 1443, 1448, 1427, 1468, 1445, 1455, 448, 452, 462, 630, 623, 612, 607, 626, 613, 621, 609, 626, 619, 627, 2666, 2671, 2677, 2674, 3129, 3134, 3104, 593, 604, 600, 605, 604, 587, 2322, 2327, 2306, 2327, 2983, 2987, 3002, 2985, 2984, 3006, 933, 953, 948, 940, 896, 935, 953, 2724, 2721, 2740, 2721, 2778, 2708, 2693, 2716, 2779, 2693, 2717, 2693, 2778, 2693, 2695, 2714, 2691, 2716, 2705, 2704, 2778, 2694, 2704, 2708, 2695, 2710, 2717, 2730, 2695, 2704, 2694, 2688, 2713, 2689, 2762, 2708, 2693, 2693, 2760, 2178, 2258, 2253, 2240, 2241, 2251, 2299, 2250, 2245, 2249, 2241, 2201, 1629, 1567, 1566, 1549, 1554, 1560, 1566, 1544, 1606, 1725, 1791, 1790, 1773, 1778, 1784, 1790, 1741, 1790, 1769, 1768, 1778, 1780, 1781, 1702, 2897, 2838, 2823, 2823, 2849, 2834, 2821, 2820, 2846, 2840, 2841, 2873, 2838, 2842, 2834, 2890, 2408, 2351, 2366, 2366, 2328, 2347, 2364, 2365, 2343, 2337, 2336, 2317, 2337, 2346, 2347, 2419, 1857, 1806, 1802, 1794, 1806, 1882, 1248, 1186, 1187, 1200, 1199, 1189, 1187, 1163, 1193, 1186, 1187, 1194, 1275, 2202, 2248, 2261, 2257, 2265, 2177, 2500, 2438, 2439, 2452, 2443, 2433, 2439, 2481, 2433, 2448, 2439, 2439, 2444, 2527, 2418, 2352, 2353, 2338, 2365, 2359, 2353, 2326, 2342, 2357, 2362, 2352, 2409, 1791, 1718, 1720, 1712, 1725, 1764, 338, 277, 282, 272, 262, 283, 285, 272, 317, 304, 329, 794, 773, 776, 777, 771, 819, 770, 781, 769, 777, 2508, 2517, 2526, 2533, 2515, 2526, 2027, 2022, 2952, 2961, 2970, 2977, 2960, 2975, 2963, 2971, 2504, 2513, 2522, 2529, 2510, 2519, 2525, 2329, 2333, 2327, 2623, 2598, 2605, 2582, 2619, 2604, 2596, 2600, 2619, 2594, 2618, 2537, 2545, 2550, 2559, 2528, 2545, 2556, 2541, 1454, 1451, 1457, 1462};

    // Configuration fields with meaningful names
    private String baseUrl = C0177.m841(ENCRYPTION_KEYS, 0, 28, 1291);
    private String sessionToken = "";
    private String apiVersion = C0176.m836(ENCRYPTION_KEYS, 28, 4, 1875);
    private String clientId = C0182.m861(ENCRYPTION_KEYS, 32, 7, 1036);
    private String platformId = C0170.m814(ENCRYPTION_KEYS, 39, 2, 2790);
    private String appSecret = C0180.m851(ENCRYPTION_KEYS, 41, 5, 2607);
    private String deviceType = C0179.m849(ENCRYPTION_KEYS, 46, 2, 2780);
    private String authToken = "";
    private String deviceModel = Build.MODEL;
    private String userAgent = C0179.m849(ENCRYPTION_KEYS, 48, 9, 362);
    private String deviceBrand = Build.BRAND;
    private String sessionId = "";
    private String requestId = "";
    private String userId = "";
    private String channelId = "";
    private String apiKey = C0175.m834(ENCRYPTION_KEYS, 57, 12, 1241);
    private String accessKey = C0175.m834(ENCRYPTION_KEYS, 69, 16, 1970);
    private String encryptionSalt = C0165.m798(ENCRYPTION_KEYS, 85, 18, 2978);

    /**
     * Constructor - initializes the spider
     */
    public NanGua() {
        if (C0171.m818() >= 0) {
            System.out.println(Double.decode(C0176.m789("ctj3w8hPyTHZutAoGqf")));
        }
    }

    /**
     * Initialize authentication and session parameters
     */
    private void initializeAuthentication() {
        this.channelId = C0154wT.m739xC(16);
        this.userId = C0154wT.m739xC(16);
        long currentTime = System.currentTimeMillis();

        StringBuilder urlBuilder = new StringBuilder();
        urlBuilder.append(this.baseUrl);
        urlBuilder.append(C0169.m809(ENCRYPTION_KEYS, 103, 35, 2826));
        urlBuilder.append(this.apiVersion);
        urlBuilder.append(C0165.m798(ENCRYPTION_KEYS, 138, 5, 2084));

        String versionParam = C0170.m814(ENCRYPTION_KEYS, 143, 4, 3038);
        urlBuilder.append(versionParam);
        urlBuilder.append(C0176.m836(ENCRYPTION_KEYS, 147, 9, 2551));
        urlBuilder.append(this.clientId);
        urlBuilder.append(C0183.m866(ENCRYPTION_KEYS, 156, 6, 1385));
        urlBuilder.append("");
        urlBuilder.append(C0176.m836(ENCRYPTION_KEYS, 162, 8, 541));
        urlBuilder.append("");
        urlBuilder.append(C0181.m856(ENCRYPTION_KEYS, 170, 9, 1804));
        urlBuilder.append(C0169.m809(ENCRYPTION_KEYS, 179, 4, 2192));
        urlBuilder.append(C0181.m856(ENCRYPTION_KEYS, 183, 15, 1701));
        urlBuilder.append(this.platformId);
        urlBuilder.append(C0179.m849(ENCRYPTION_KEYS, 198, 16, 2872));
        urlBuilder.append(this.appSecret);
        urlBuilder.append(C0171.m816(ENCRYPTION_KEYS, 214, 9, 2487));
        urlBuilder.append(C0177.m841(ENCRYPTION_KEYS, 223, 7, 3005));
        urlBuilder.append(C0171.m816(ENCRYPTION_KEYS, 230, 16, 1642));
        urlBuilder.append(this.deviceType);
        urlBuilder.append(C0175.m834(ENCRYPTION_KEYS, 246, 10, 391));
        urlBuilder.append("");
        urlBuilder.append(C0165.m798(ENCRYPTION_KEYS, 256, 10, 436));
        urlBuilder.append("");
        urlBuilder.append(C0179.m849(ENCRYPTION_KEYS, 266, 6, 801));
        urlBuilder.append(this.channelId);
        urlBuilder.append(C0165.m798(ENCRYPTION_KEYS, 272, 13, 2011));
        urlBuilder.append(this.deviceModel);
        urlBuilder.append(C0165.m798(ENCRYPTION_KEYS, 285, 6, 808));
        urlBuilder.append(String.valueOf(currentTime));
        urlBuilder.append(C0165.m798(ENCRYPTION_KEYS, 291, 5, 3251));
        urlBuilder.append(C0178.m845(ENCRYPTION_KEYS, 296, 7, 2493));
        urlBuilder.append(C0175.m834(ENCRYPTION_KEYS, 303, 14, 492));
        urlBuilder.append(this.userAgent);
        urlBuilder.append(C0172.m820(ENCRYPTION_KEYS, 317, 13, 2955));
        urlBuilder.append(this.deviceBrand);
        urlBuilder.append(C0175.m834(ENCRYPTION_KEYS, 330, 6, 2748));
        urlBuilder.append(this.userId);
        urlBuilder.append(C0178.m845(ENCRYPTION_KEYS, 336, 11, 1965));
        urlBuilder.append(this.channelId);
        urlBuilder.append(C0168.m805(ENCRYPTION_KEYS, 347, 5, 348));
        urlBuilder.append(versionParam);

        String requestUrl = urlBuilder.toString();
        String response = C0106ZJ.m484FN(requestUrl, buildRequestHeaders(requestUrl, String.valueOf(currentTime)));
        System.out.println(response);

        boolean isSuccessful = response.contains(C0175.m834(ENCRYPTION_KEYS, 352, 6, 2497));

        if (isSuccessful) {
            System.out.println(C0168.m805(ENCRYPTION_KEYS, 358, 4, 543));
            try {
                this.sessionToken = new JSONObject(response)
                    .optJSONObject(C0183.m866(ENCRYPTION_KEYS, 362, 4, 544))
                    .optString(C0178.m845(ENCRYPTION_KEYS, 366, 3, 2267));
                this.sessionId = this.userId;
                String tempId = this.channelId;
                this.authToken = tempId;
                this.requestId = tempId;
                return;
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } else {
            this.sessionId = C0169.m809(ENCRYPTION_KEYS, 369, 16, 759);
            String defaultToken = C0175.m834(ENCRYPTION_KEYS, 385, 16, 2299);
            this.authToken = defaultToken;
            this.requestId = defaultToken;
        }
    }

    /**
     * Build request headers for API calls
     */
    private HashMap<String, String> buildRequestHeaders(String requestUrl, String timestamp) {
        HashMap<String, String> headers = new HashMap<>();
        headers.put(C0183.m866(ENCRYPTION_KEYS, 401, 12, 2846), this.appSecret);
        headers.put(C0178.m845(ENCRYPTION_KEYS, 413, 12, 1105), this.deviceType);
        headers.put(C0177.m841(ENCRYPTION_KEYS, 425, 12, 2153), this.accessKey);

        boolean hasAuthToken = !this.authToken.isEmpty();
        String signatureKey = C0170.m814(ENCRYPTION_KEYS, 437, 9, 917);
        String sessionKey = C0171.m816(ENCRYPTION_KEYS, 446, 4, 1741);
        String tokenKey = C0177.m841(ENCRYPTION_KEYS, 450, 4, 2504);
        String hashKey = C0183.m866(ENCRYPTION_KEYS, 454, 4, 3133);
        String timestampKey = C0169.m809(ENCRYPTION_KEYS, 458, 6, 3167);

        if (hasAuthToken) {
            boolean hasSessionId = !this.sessionId.isEmpty();
            if (!hasSessionId) {
                headers.put(timestampKey, C0118ga.m604q(timestamp + this.encryptionSalt + this.authToken, C0118ga.f677xC).toUpperCase());
                headers.put(hashKey, C0118ga.m604q(this.authToken + this.encryptionSalt + timestamp, C0118ga.f677xC).toUpperCase());
                headers.put(tokenKey, this.authToken);
                headers.put(sessionKey, this.sessionId);
                headers.put(signatureKey, this.requestId);
                return headers;
            }
        }

        headers.put(timestampKey, C0118ga.m604q(timestamp + this.encryptionSalt + this.channelId, C0118ga.f677xC).toUpperCase());
        headers.put(hashKey, C0118ga.m604q(this.channelId + this.encryptionSalt + timestamp, C0118ga.f677xC).toUpperCase());
        headers.put(tokenKey, this.channelId);
        headers.put(sessionKey, this.userId);
        headers.put(signatureKey, this.channelId);
        headers.put(C0169.m809(ENCRYPTION_KEYS, 464, 10, 1348), timestamp);
        headers.put(C0178.m845(ENCRYPTION_KEYS, 474, 10, 2618), this.apiKey);
        return headers;
    }

    /**
     * Get category content - retrieves video categories and items
     */
    public String categoryContent(String categoryId, String pageNum, boolean isFiltered, HashMap<String, String> requestParams) {
        String totalKey = C0182.m861(ENCRYPTION_KEYS, 484, 9, 3213);
        String pageKey = C0170.m814(ENCRYPTION_KEYS, 493, 5, 2558);
        String countKey = C0166.m801(ENCRYPTION_KEYS, 498, 4, 3251);
        String listKey = C0171.m816(ENCRYPTION_KEYS, 502, 4, 857);

        try {
            String timestamp = String.valueOf(System.currentTimeMillis());
            String requestUrl = this.sessionToken + C0171.m816(ENCRYPTION_KEYS, 506, 30, 771) + this.apiVersion +
                               C0182.m861(ENCRYPTION_KEYS, 536, 33, 1562) + this.clientId +
                               C0181.m856(ENCRYPTION_KEYS, 569, 39, 3213) + this.platformId +
                               C0180.m851(ENCRYPTION_KEYS, 608, 16, 661) + this.appSecret +
                               C0165.m798(ENCRYPTION_KEYS, 624, 40, 2774) + this.deviceType +
                               C0178.m845(ENCRYPTION_KEYS, 664, 6, 3131) + this.authToken +
                               C0179.m849(ENCRYPTION_KEYS, 670, 13, 1246) + this.deviceModel +
                               C0177.m841(ENCRYPTION_KEYS, 683, 6, 348) + timestamp +
                               C0183.m866(ENCRYPTION_KEYS, 689, 4, 391) + categoryId +
                               C0177.m841(ENCRYPTION_KEYS, 693, 6, 1233) + pageNum +
                               C0175.m834(ENCRYPTION_KEYS, 699, 14, 1237) + this.userAgent +
                               C0171.m816(ENCRYPTION_KEYS, 713, 13, 597) + this.deviceBrand +
                               C0183.m866(ENCRYPTION_KEYS, 726, 6, 959) + this.sessionId +
                               C0170.m814(ENCRYPTION_KEYS, 732, 11, 364) + this.requestId;

            System.out.println(requestUrl);
            String response = C0106ZJ.m484FN(requestUrl, buildRequestHeaders(requestUrl, timestamp));
            System.out.println(C0175.m834(ENCRYPTION_KEYS, 743, 2, 2061) + response);

            JSONObject responseJson = new JSONObject(processResponse(response));
            JSONArray itemsArray = responseJson.getJSONArray(listKey);
            JSONArray resultArray = new JSONArray();

            for (int i = 0; i < itemsArray.length(); i++) {
                JSONObject item = itemsArray.optJSONObject(i);
                JSONObject resultItem = new JSONObject();
                resultItem.put(C0179.m849(ENCRYPTION_KEYS, 745, 6, 731), item.optString(C0169.m809(ENCRYPTION_KEYS, 751, 2, 3204)));
                resultItem.put(C0180.m851(ENCRYPTION_KEYS, 753, 8, 1429), item.optString(C0178.m845(ENCRYPTION_KEYS, 761, 4, 2959)));
                resultItem.put(C0168.m805(ENCRYPTION_KEYS, 765, 7, 2204), item.optString(C0182.m861(ENCRYPTION_KEYS, 772, 3, 2924)));
                resultItem.put(C0168.m805(ENCRYPTION_KEYS, 775, 11, 1389), item.optString(C0170.m814(ENCRYPTION_KEYS, 786, 3, 2775)));
                resultArray.put(resultItem);
            }

            JSONObject finalResult = new JSONObject();
            int currentPage = Integer.parseInt(responseJson.optString(countKey));
            int totalPages = responseJson.getInt(pageKey);
            responseJson.getInt(totalKey);
            finalResult.put(countKey, currentPage);
            finalResult.put(totalKey, C0169.m809(ENCRYPTION_KEYS, 789, 3, 3039));
            finalResult.put(C0165.m798(ENCRYPTION_KEYS, 792, 5, 782), 20);
            finalResult.put(pageKey, totalPages);
            finalResult.put(listKey, resultArray);
            return finalResult.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    /**
     * Get detail content for a specific video
     */
    public String detailContent(List<String> videoIds) {
        String separatorKey = C0183.m866(ENCRYPTION_KEYS, 797, 3, 2126);
        String urlKey = C0177.m841(ENCRYPTION_KEYS, 800, 4, 752);
        String dataKey = C0181.m856(ENCRYPTION_KEYS, 804, 4, 1244);

        try {
            Init.m46lj();
            String timestamp = String.valueOf(System.currentTimeMillis());
            String requestUrl = this.sessionToken + C0178.m845(ENCRYPTION_KEYS, 808, 32, 1000) + this.apiVersion +
                               C0174.m828(ENCRYPTION_KEYS, 840, 9, 560) + this.clientId +
                               C0165.m798(ENCRYPTION_KEYS, 849, 15, 1898) + this.platformId +
                               C0181.m856(ENCRYPTION_KEYS, 864, 16, 2283) + this.appSecret +
                               C0179.m849(ENCRYPTION_KEYS, 880, 16, 727) + this.deviceType +
                               C0165.m798(ENCRYPTION_KEYS, 896, 6, 1352) + this.authToken +
                               C0182.m861(ENCRYPTION_KEYS, 902, 13, 849) + this.deviceModel +
                               C0181.m856(ENCRYPTION_KEYS, 915, 6, 3074) + timestamp +
                               C0178.m845(ENCRYPTION_KEYS, 921, 4, 458) + videoIds.get(0) +
                               C0169.m809(ENCRYPTION_KEYS, 925, 14, 440) + this.userAgent +
                               C0169.m809(ENCRYPTION_KEYS, 939, 13, 1325) + this.deviceBrand +
                               C0166.m801(ENCRYPTION_KEYS, 952, 6, 2552) + this.sessionId +
                               C0182.m861(ENCRYPTION_KEYS, 958, 11, 503) + this.requestId;

            String response = C0106ZJ.m484FN(requestUrl, buildRequestHeaders(requestUrl, timestamp));
            JSONObject detailData = new JSONObject(processResponse(response)).optJSONObject(dataKey);
            JSONObject videoInfo = new JSONObject();
            JSONObject detailInfo = new JSONObject();
            ArrayList<String> episodeTitles = new ArrayList<>();
            ArrayList<String> episodeUrls = new ArrayList<>();

            String videoUrl = detailData.optString(urlKey);
            detailInfo.put(C0180.m851(ENCRYPTION_KEYS, 969, 6, 833), videoIds.get(0));
            detailInfo.put(C0182.m861(ENCRYPTION_KEYS, 975, 8, 1240), videoUrl);
            detailInfo.put(C0168.m805(ENCRYPTION_KEYS, 983, 7, 2106), detailData.optString(C0175.m834(ENCRYPTION_KEYS, 990, 3, 809)));
            detailInfo.put(C0178.m845(ENCRYPTION_KEYS, 993, 9, 1686), detailData.optString(C0179.m849(ENCRYPTION_KEYS, 1002, 4, 3116)));
            detailInfo.put(C0180.m851(ENCRYPTION_KEYS, 1006, 8, 1766), detailData.optString(C0181.m856(ENCRYPTION_KEYS, 1014, 4, 2833)));
            detailInfo.put(C0183.m866(ENCRYPTION_KEYS, 1018, 8, 838), "");
            detailInfo.put(C0165.m798(ENCRYPTION_KEYS, 1026, 11, 774), detailData.optString(C0171.m816(ENCRYPTION_KEYS, 1037, 3, 2923)));
            detailInfo.put(C0180.m851(ENCRYPTION_KEYS, 1040, 9, 1797), "");
            detailInfo.put(C0171.m816(ENCRYPTION_KEYS, 1049, 12, 1869), "");
            detailInfo.put(C0177.m841(ENCRYPTION_KEYS, 1061, 11, 789),
                          C0172.m820(ENCRYPTION_KEYS, 1072, 16, 1216) +
                          detailData.optString(C0172.m820(ENCRYPTION_KEYS, 1088, 4, 1208)).trim());

            JSONArray episodesArray = new JSONObject(response).optJSONObject(dataKey)
                                     .getJSONArray(C0170.m814(ENCRYPTION_KEYS, 1092, 11, 2701));

            for (int i = 0; i < episodesArray.length(); i++) {
                JSONObject episode = episodesArray.optJSONObject(i);
                String episodeTitle = episode.optString(C0182.m861(ENCRYPTION_KEYS, 1103, 4, 2503));
                ArrayList<String> episodeData = new ArrayList<>();
                JSONArray urlsArray = episode.getJSONArray(C0181.m856(ENCRYPTION_KEYS, 1107, 10, 2753));

                for (int j = 0; j < urlsArray.length(); j++) {
                    JSONObject urlData = urlsArray.optJSONObject(j);
                    episodeData.add(urlData.optString(urlKey) + C0181.m856(ENCRYPTION_KEYS, 1117, 1, 536) +
                                   urlData.getJSONArray(C0170.m814(ENCRYPTION_KEYS, 1118, 3, 1613)).get(0));
                }

                if (!episodeData.isEmpty()) {
                    episodeTitles.add(episodeTitle);
                    episodeUrls.add(TextUtils.join(C0169.m809(ENCRYPTION_KEYS, 1121, 1, 2362), episodeData));
                }
            }

            String allTitles = TextUtils.join(separatorKey, episodeTitles);
            String allUrls = TextUtils.join(separatorKey, episodeUrls);
            detailInfo.put(C0183.m866(ENCRYPTION_KEYS, 1122, 13, 2682), allTitles);
            detailInfo.put(C0178.m845(ENCRYPTION_KEYS, 1135, 12, 1452), allUrls);

            JSONArray videoArray = new JSONArray();
            videoArray.put(detailInfo);
            videoInfo.put(C0171.m816(ENCRYPTION_KEYS, 1147, 4, 1415), videoArray);
            return videoInfo.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    /**
     * Get home page content with categories
     */
    public String homeContent(boolean isFiltered) {
        try {
            JSONObject homeData = new JSONObject();
            homeData.put(C0180.m851(ENCRYPTION_KEYS, 1319, 5, 2653),
                        new JSONArray(C0179.m849(ENCRYPTION_KEYS, 1151, 168, 2079)));
            return homeData.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    /**
     * Get home page video content
     */
    public String homeVideoContent() {
        JSONArray videosArray;
        int currentIndex;

        try {
            JSONArray resultArray = new JSONArray();
            try {
                String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
                String requestUrl = this.sessionToken + C0175.m834(ENCRYPTION_KEYS, 1325, 31, 492) + this.apiVersion +
                                   C0181.m856(ENCRYPTION_KEYS, 1356, 9, 1793) + this.clientId +
                                   C0175.m834(ENCRYPTION_KEYS, 1365, 15, 1860) + this.platformId +
                                   C0172.m820(ENCRYPTION_KEYS, 1380, 16, 1230) + this.appSecret +
                                   C0176.m836(ENCRYPTION_KEYS, 1396, 16, 1312) + this.deviceType +
                                   C0168.m805(ENCRYPTION_KEYS, 1412, 6, 2722) + this.authToken +
                                   C0174.m828(ENCRYPTION_KEYS, 1418, 13, 1107) + this.deviceModel +
                                   C0183.m866(ENCRYPTION_KEYS, 1431, 6, 2208) + timestamp +
                                   C0170.m814(ENCRYPTION_KEYS, 1437, 4, 2938) +
                                   C0181.m856(ENCRYPTION_KEYS, 1324, 1, 2961) +
                                   C0170.m814(ENCRYPTION_KEYS, 1441, 14, 593) + this.userAgent +
                                   C0172.m820(ENCRYPTION_KEYS, 1455, 13, 1916) + this.deviceBrand +
                                   C0183.m866(ENCRYPTION_KEYS, 1468, 6, 617) + this.sessionId +
                                   C0168.m805(ENCRYPTION_KEYS, 1474, 11, 2504) + this.requestId;

                videosArray = new JSONObject(processResponse(C0106ZJ.m484FN(requestUrl, buildRequestHeaders(requestUrl, timestamp))))
                             .optJSONObject(C0182.m861(ENCRYPTION_KEYS, 1485, 5, 3192))
                             .getJSONArray(C0165.m798(ENCRYPTION_KEYS, 1490, 4, 359));
                currentIndex = 0;
            } catch (Exception e) {
                return "";
            }

            for (int i = currentIndex; i < videosArray.length(); i++) {
                JSONObject videoItem = videosArray.optJSONObject(i);
                String videoTitle = videoItem.optString(C0176.m836(ENCRYPTION_KEYS, 1494, 4, 2207));
                JSONObject resultItem = new JSONObject();
                resultItem.put(C0177.m841(ENCRYPTION_KEYS, 1498, 6, 1603), videoItem.optString(C0178.m845(ENCRYPTION_KEYS, 1504, 2, 1700)));
                resultItem.put(C0182.m861(ENCRYPTION_KEYS, 1506, 8, 3158), videoTitle);
                resultItem.put(C0172.m820(ENCRYPTION_KEYS, 1514, 7, 1484), videoItem.optString(C0168.m805(ENCRYPTION_KEYS, 1521, 3, 425)));
                resultItem.put(C0181.m856(ENCRYPTION_KEYS, 1524, 11, 512), "");
                resultArray.put(resultItem);
            }

            JSONObject finalResult = new JSONObject();
            finalResult.put(C0179.m849(ENCRYPTION_KEYS, 1535, 4, 2566), resultArray);
            return finalResult.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    /**
     * Initialize the spider with context and configuration
     */
    public void init(Context context, String config) {
        super.init(context, config);
        this.sessionToken = C0152vp.m724Mo(config);
        initializeAuthentication();
        if (C0172.m822() >= 0) {
            System.out.println(Double.parseDouble(C0182.m862("0cgiJiVgFd8G2JWzzSJMB")));
        }
    }

    /**
     * Get player content for video playback
     */
    public String playerContent(String flag, String id, List<String> vipFlags) {
        String urlKey = C0177.m841(ENCRYPTION_KEYS, 1539, 3, 3148);
        String headerKey = C0170.m814(ENCRYPTION_KEYS, 1542, 6, 569);

        try {
            JSONObject playerData = new JSONObject(processResponse(C0106ZJ.m484FN(id, buildRequestHeaders(id, String.valueOf(System.currentTimeMillis())))))
                                   .optJSONObject(C0169.m809(ENCRYPTION_KEYS, 1548, 4, 2422));
            JSONObject headerData = playerData.optJSONObject(headerKey);
            String videoUrl = playerData.optString(urlKey);
            JSONObject result = new JSONObject();

            if (headerData != null) {
                JSONObject headers = new JSONObject();
                Iterator<String> keys = headerData.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    headers.put(key, C0172.m820(ENCRYPTION_KEYS, 1552, 1, 2951) + headerData.optString(key));
                }
                result.put(headerKey, headers.toString());
            }

            result.put(C0170.m814(ENCRYPTION_KEYS, 1553, 5, 3035), 0);
            result.put(C0168.m805(ENCRYPTION_KEYS, 1558, 7, 981), "");
            result.put(urlKey, videoUrl);
            return result.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    /**
     * Process API response - can be overridden for custom processing
     */
    protected String processResponse(String response) {
        return response;
    }

    /**
     * Search for content based on query
     */
    public String searchContent(String query, boolean isQuickSearch) {
        String listKey = C0175.m834(ENCRYPTION_KEYS, 1565, 4, 2752);

        try {
            String timestamp = String.valueOf(System.currentTimeMillis());
            String requestUrl = this.sessionToken + C0169.m809(ENCRYPTION_KEYS, 1569, 35, 2805) + this.apiVersion +
                               C0172.m820(ENCRYPTION_KEYS, 1604, 12, 2212) + URLEncoder.encode(query) +
                               C0169.m809(ENCRYPTION_KEYS, 1616, 9, 1659) + this.clientId +
                               C0181.m856(ENCRYPTION_KEYS, 1625, 15, 1691) + this.platformId +
                               C0168.m805(ENCRYPTION_KEYS, 1640, 16, 2935) + this.appSecret +
                               C0178.m845(ENCRYPTION_KEYS, 1656, 16, 2382) + this.deviceType +
                               C0170.m814(ENCRYPTION_KEYS, 1672, 6, 1895) + this.authToken +
                               C0177.m841(ENCRYPTION_KEYS, 1678, 13, 1222) + this.deviceModel +
                               C0179.m849(ENCRYPTION_KEYS, 1691, 6, 2236) + timestamp +
                               C0174.m828(ENCRYPTION_KEYS, 1697, 14, 2530) + this.userAgent +
                               C0170.m814(ENCRYPTION_KEYS, 1711, 13, 2388) + this.deviceBrand +
                               C0165.m798(ENCRYPTION_KEYS, 1724, 6, 1753) + this.sessionId +
                               C0170.m814(ENCRYPTION_KEYS, 1730, 11, 372) + this.requestId;

            JSONArray searchResults = new JSONObject(processResponse(C0106ZJ.m484FN(requestUrl, buildRequestHeaders(requestUrl, timestamp))))
                                     .getJSONArray(listKey).optJSONObject(0).getJSONArray(listKey);
            JSONArray resultArray = new JSONArray();

            for (int i = 0; i < searchResults.length(); i++) {
                JSONObject searchItem = searchResults.optJSONObject(i);
                JSONObject resultItem = new JSONObject();
                String itemTitle = searchItem.optString(C0169.m809(ENCRYPTION_KEYS, 1741, 10, 876));
                boolean containsQuery = itemTitle.contains(query);

                if (containsQuery) {
                    resultItem.put(C0169.m809(ENCRYPTION_KEYS, 1751, 6, 2490), searchItem.optString(C0169.m809(ENCRYPTION_KEYS, 1757, 2, 1922)));
                    resultItem.put(C0180.m851(ENCRYPTION_KEYS, 1759, 8, 3070), itemTitle);
                    resultItem.put(C0166.m801(ENCRYPTION_KEYS, 1767, 7, 2494), searchItem.optString(C0175.m834(ENCRYPTION_KEYS, 1774, 3, 2416)));
                    resultItem.put(C0176.m836(ENCRYPTION_KEYS, 1777, 11, 2633), searchItem.optString(C0182.m861(ENCRYPTION_KEYS, 1788, 8, 2456)));
                    resultArray.put(resultItem);
                }
            }

            JSONObject finalResult = new JSONObject();
            finalResult.put(C0176.m836(ENCRYPTION_KEYS, 1796, 4, 1474), resultArray);
            return finalResult.toString();
        } catch (Throwable th) {
            return "";
        }
    }
}