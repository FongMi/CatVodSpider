package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.g;
import com.github.catvod.spider.merge.C0948d;
import com.github.catvod.spider.merge.C1024e;
import com.github.catvod.spider.merge.C1080f;
import com.github.catvod.spider.merge.C1200g;
import com.github.catvod.spider.merge.C1228h;
import com.github.catvod.spider.merge.C1370pv;
import com.github.catvod.spider.merge.Yy;
import com.github.catvod.spider.merge.ZP;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TTian extends Spider {

    private static final short[] f50short = {1878, 1798, 1809, 1873, 1795, 1807, 1797, 1875, 1810, 1811, 1881, 1876, 1816, 1797, 1800, 1800, 1875, 1803, 1874, 1875, 1809, 1794, 1816, 1809, 1810, 1794, 1806, 1794, 1877, 1814, 1879, 1794, 1878, 1798, 1876, 1810, 1809, 1805, 3283, 3317, 3299, 3316, 3243, 3271, 3297, 3299, 3304, 3314, 410, 414, 413, 385, 385, 389, 474, 449, 475, 460, 475, 454, 1494, 1505, 1506, 1505, 1526, 1505, 1526, 3173, 3106, 3131, 3120, 3083, 3110, 3121, 3129, 3125, 3110, 3135, 3111, 788, 781, 774, 829, 780, 771, 783, 775, 2569, 2576, 2587, 2592, 2582, 2587, 1813, 1808, 1802, 1805, 397, 404, 415, 420, 395, 402, 408, 2491, 2530, 2471, 2491, 2556, 2555, 2553, 2545, 2491, 2528, 2541, 2532, 2545, 2507, 2535, 2545, 2549, 2534, 2551, 2556, 746, 751, 762, 751, 2217, 2224, 2235, 2176, 2223, 2230, 2236, 2176, 2219, 2231, 2218, 2226, 2237, 933, 948, 946, 944, 2146, 2163, 2165, 2167, 2161, 2173, 2151, 2172, 2150, 2570, 2575, 2571, 2575, 2578, 2117, 2142, 2117, 2128, 2141, 2043, 2043, 2043, 1238, 1231, 1220, 1279, 1219, 1231, 1230, 1236, 1221, 1230, 1236, 314, 291, 296, 275, 296, 293, 318, 297, 303, 312, 291, 318, 1390, 1399, 1404, 1351, 1401, 1403, 1388, 1399, 1386, 3287, 3278, 3269, 3326, 3283, 3268, 3276, 3264, 3283, 3274, 3282, 425, 432, 443, 384, 446, 429, 442, 446, 1579, 1586, 1593, 1538, 1572, 1592, 1596, 1583, 2320, 2313, 2306, 2361, 2312, 2311, 2315, 2307, 2420, 2413, 2406, 2397, 2411, 2406, 1283, 1298, 1281, 1280, 1302, 1324, 1286, 1281, 1311, 1280, 1506, 1531, 1520, 1483, 1508, 1533, 1527, 1786, 1699, 1766, 1786, 1725, 1722, 1720, 1712, 1786, 1699, 1722, 1713, 1674, 1713, 1712, 1697, 1716, 1724, 1721, 1702, 429, 424, 445, 424, 3271, 3294, 3285, 3310, 3265, 3288, 3282, 3310, 3269, 3289, 3268, 3292, 3283, 2070, 2075, 2066, 2055, 2109, 2060, 2051, 2063, 2055, 2780, 2757, 2766, 2805, 2761, 2758, 2763, 2777, 2777, 28161, 26304, 22150, 24297, 21517, 21544, -30628, -1431, -29038, 22426, 19311, 23094, 22194, -24590, -1436, -1436, 2386, 2379, 2368, 2427, 2388, 2376, 2373, 2397, 2427, 2376, 2381, 2391, 2384, 2733, 2736, 2733, 2741, 2748, 2638, 2639, 1347, 2995, 3000, 2994, 2409, 2414, 2416, 2415, 1032, 1031, 1035, 1027, 1792, 2967, 2960, 2958, 3169, 3193, 3185, 3199, 3194, 3193, 1739, 653, 660, 671, 676, 651, 663, 666, 642, 676, 669, 649, 660, 662, 752, 745, 738, 729, 758, 746, 743, 767, 729, 755, 756, 746, 2740, 2737, 2731, 2732, 1195, 1211, 1206, 1197, 941, 941, 996, 1001, 1007, 941, 994, 1007, 1013, 1006, 996, 993, 1010, 1017, 941, 1543, 1567, 1542, 1566, 1539, 1562, 1547, 1560, 1566, 1605, 1548, 1541, 1560, 1543, 1607, 1550, 1547, 1566, 1547, 1617, 1610, 750, 750, 589, 586, 515, 559, 558, 564, 549, 558, 564, 621, 516, 553, 563, 560, 559, 563, 553, 564, 553, 559, 558, 634, 608, 550, 559, 562, 557, 621, 548, 545, 564, 545, 635, 608, 558, 545, 557, 549, 637, 610, 610, 589, 586, 589, 586, 589, 586, 621, 621, 2435, 2436, 2509, 2529, 2528, 2554, 2539, 2528, 2554, 2467, 2506, 2535, 2557, 2558, 2529, 2557, 2535, 2554, 2535, 2529, 2528, 2484, 2478, 2536, 2529, 2556, 2531, 2467, 2538, 2543, 2554, 2543, 2485, 2478, 2528, 2543, 2531, 2539, 2483, 2476, 2557, 2535, 2537, 2528, 2476, 2435, 2436, 2435, 2436, 1310, 1305, 1342, 1342, 440, 447, 502, 474, 475, 449, 464, 475, 449, 408, 497, 476, 454, 453, 474, 454, 476, 449, 476, 474, 475, 399, 405, 467, 474, 455, 472, 408, 465, 468, 449, 468, 398, 405, 475, 468, 472, 464, 392, 407, 449, 476, 472, 464, 454, 449, 468, 472, 453, 407, 440, 447, 440, 447, 1164, 1164, 1196, 1195, 1196, 1195, 1481, 1519, 1529, 1518, 1457, 1501, 1531, 1529, 1522, 1512, 2983, 2979, 2976, 3004, 3004, 3000, 3045, 2983, 2979, 2991, 2983, 3047, 2978, 2989, 2985, 3003, 2983, 2982, 2980, 2994, 2993, 2057, 2065, 2056, 2064, 2061, 2068, 2053, 2070, 2064, 2123, 2050, 2059, 2070, 2057, 2121, 2048, 2053, 2064, 2053, 2143, 2116, 2054, 2059, 2065, 2058, 2048, 2053, 2070, 2077, 2137, 2588, 2576, 2577, 2571, 2586, 2577, 2571, 2642, 2571, 2566, 2575, 2586, 3319, 3319, 3319, -32478, 28497, 20976, -31260, 1998, 2014, 2003, 1992, 2621, 2597, 2620, 2596, 2617, 2592, 2609, 2594, 2596, 2687, 2614, 2623, 2594, 2621, 2685, 2612, 2609, 2596, 2609, 2667, 2672, 2610, 2623, 2597, 2622, 2612, 2609, 2594, 2601, 2669, 2660, 2610, 2664, 2609, 2656, 2610, 2660, 2663, 2685, 2664, 2660, 2610, 2611, 2685, 2660, 2610, 2662, 2613, 2685, 2610, 2658, 2661, 2658, 2685, 2612, 2610, 2658, 2661, 2610, 2660, 2610, 2665, 2609, 2610, 2612, 2658, 3063, 3063, 3054, 3000, 3042, 3003, 3050, 3000, 3054, 3053, 3063, 3042, 3054, 3000, 3001, 3063, 3054, 3000, 3052, 3007, 3063, 3000, 3048, 3055, 3048, 3063, 3006, 3000, 3048, 3055, 3000, 3054, 3000, 3043, 3003, 3000, 3006, 3048, 3031, 3024, 2969, 2997, 2996, 2990, 3007, 2996, 2990, 3063, 2974, 2995, 2985, 2986, 2997, 2985, 2995, 2990, 2995, 2997, 2996, 3040, 3066, 3004, 2997, 2984, 2999, 3063, 3006, 3003, 2990, 3003, 3041, 3066, 2996, 3003, 2999, 3007, 3047, 3064, 2985, 2995, 3005, 2996, 3064, 3031, 3024, 3031, 3024, 3017, 3022, 3049, 3049, 3056, 2982, 3068, 2981, 3060, 2982, 3056, 3059, 3049, 3068, 3056, 2982, 2983, 3049, 3056, 2982, 3058, 2977, 3049, 2982, 3062, 3057, 3062, 3049, 2976, 2982, 3062, 3057, 2982, 3056, 2982, 3069, 2981, 2982, 2976, 3062, 3017, 3022, 2951, 2987, 2986, 2992, 2977, 2986, 2992, 3049, 2944, 2989, 2999, 2996, 2987, 2999, 2989, 2992, 2989, 2987, 2986, 3070, 3044, 2978, 2987, 2998, 2985, 3049, 2976, 2981, 2992, 2981, 3071, 3044, 2986, 2981, 2985, 2977, 3065, 3046, 2992, 2989, 2985, 2977, 2999, 2992, 2981, 2985, 2996, 3046, 3017, 3022, 3017, 3022, 2142, 2137, 2174, 2174, 2151, 2097, 2155, 2098, 2147, 2097, 2151, 2148, 2174, 2155, 2151, 2097, 2096, 2174, 2151, 2097, 2149, 2102, 2174, 2097, 2145, 2150, 2145, 2174, 2103, 2097, 2145, 2150, 2097, 2151, 2097, 2154, 2098, 2097, 2103, 2145, 2142, 2137, 2064, 2108, 2109, 2087, 2102, 2109, 2087, 2174, 2071, 2106, 2080, 2083, 2108, 2080, 2106, 2087, 2106, 2108, 2109, 2153, 2163, 2101, 2108,
    2081, 2110, 2174, 2103, 2098, 2087, 2098, 2152, 2163, 2109, 2098, 2110, 2102, 2158, 2161, 2111, 2106, 2110, 2106, 2087, 2161, 2142, 2137, 2142, 2137, 2146, 2145, 2142, 2137, 2174, 2174, 2151, 2097, 2155, 2098, 2147, 2097, 2151, 2148, 2174, 2155, 2151, 2097, 2096, 2174, 2151, 2097, 2149, 2102, 2174, 2097, 2145, 2150, 2145, 2174, 2103, 2097, 2145, 2150, 2097, 2151, 2097, 2154, 2098, 2097, 2103, 2145, 2142, 2137, 2064, 2108, 2109, 2087, 2102, 2109, 2087, 2174, 2071, 2106, 2080, 2083, 2108, 2080, 2106, 2087, 2106, 2108, 2109, 2153, 2163, 2101, 2108, 2081, 2110, 2174, 2103, 2098, 2087, 2098, 2152, 2163, 2109, 2098, 2110, 2102, 2158, 2161, 2087, 2090, 2083, 2102, 2060, 2106, 2103, 2161, 2142, 2137, 2142, 2137, 2559, 2552, 2527, 2527, 2502, 2448, 2506, 2451, 2498, 2448, 2502, 2501, 2527, 2506, 2502, 2448, 2449, 2527, 2502, 2448, 2500, 2455, 2527, 2448, 2496, 2503, 2496, 2527, 2454, 2448, 2496, 2503, 2448, 2502, 2448, 2507, 2451, 2448, 2454, 2496, 2559, 2552, 2481, 2461, 2460, 2438, 2455, 2460, 2438, 2527, 2486, 2459, 2433, 2434, 2461, 2433, 2459, 2438, 2459, 2461, 2460, 2504, 2514, 2452, 2461, 2432, 2463, 2527, 2454, 2451, 2438, 2451, 2505, 2514, 2460, 2451, 2463, 2455, 2511, 2512, 2434, 2451, 2453, 2455, 2512, 2559, 2552, 2559, 2552, 836, 835, 868, 868, 893, 811, 881, 808, 889, 811, 893, 894, 868, 881, 893, 811, 810, 868, 893, 811, 895, 812, 868, 811, 891, 892, 891, 868, 813, 811, 891, 892, 811, 893, 811, 880, 808, 811, 813, 891, 868, 868, 836, 835, 836, 835, 1640, 1614, 1624, 1615, 1552, 1660, 1626, 1624, 1619, 1609, 628, 624, 627, 623, 623, 619, 566, 628, 624, 636, 628, 564, 625, 638, 634, 616, 628, 629, 631, 609, 610, 866, 878, 879, 885, 868, 879, 885, 812, 885, 888, 881, 868, 1153, 1153, 1153, -29106, 24637, 24220, -30072, 626, 610, 623, 628, 2591, 2591, 2646, 2651, 2653, 2591, 2640, 2653, 2631, 2652, 2646, 2643, 2624, 2635, 2591, 3132, 3108, 3133, 3109, 3128, 3105, 3120, 3107, 3109, 3198, 3127, 3134, 3107, 3132, 3196, 3125, 3120, 3109, 3120, 3178, 3185, 2354, 2354, 2706, 2709, 2780, 2800, 2801, 2795, 2810, 2801, 2795, 2738, 2779, 2806, 2796, 2799, 2800, 2796, 2806, 2795, 2806, 2800, 2801, 2725, 2751, 2809, 2800, 2797, 2802, 2738, 2811, 2814, 2795, 2814, 2724, 2751, 2801, 2814, 2802, 2810, 2722, 2749, 2793, 2800, 2811, 2752, 2806, 2811, 2749, 2706, 2709, 2706, 2709, 2292, 2291, 2260, 2260, 1454, 1449, 1504, 1484, 1485, 1495, 1478, 1485, 1495, 1422, 1511, 1482, 1488, 1491, 1484, 1488, 1482, 1495, 1482, 1484, 1485, 1433, 1411, 1477, 1484, 1489, 1486, 1422, 1479, 1474, 1495, 1474, 1432, 1411, 1485, 1474, 1486, 1478, 1438, 1409, 1488, 1482, 1476, 1485, 1409, 1454, 1449, 1454, 1449, 363, 364, 293, 265, 264, 274, 259, 264, 274, 331, 290, 271, 277, 278, 265, 277, 271, 274, 271, 265, 264, 348, 326, 256, 265, 276, 267, 331, 258, 263, 274, 263, 349, 326, 264, 263, 267, 259, 347, 324, 274, 271, 267, 259, 277, 274, 263, 267, 278, 324, 363, 364, 363, 364, 3255, 3255, 3223, 3216, 3223, 3216, 2254, 2280, 2302, 2281, 2230, 2266, 2300, 2302, 2293, 2287, 893, 889, 890, 870, 870, 866, 831, 893, 889, 885, 893, 829, 888, 887, 883, 865, 893, 892, 894, 872, 875, 3066, 3042, 3067, 3043, 3070, 3047, 3062, 3045, 3043, 3000, 3057, 3064, 3045, 3066, 3002, 3059, 3062, 3043, 3062, 2988, 2999, 3061, 3064, 3042, 3065, 3059, 3062, 3045, 3054, 2986, 441, 437, 436, 430, 447, 436, 430, 503, 430, 419, 426, 447, 2271, 2271, 2271, -29281, 25580, 23885, -30375, 3254, 3238, 3243, 3248, 3175, 3175, 3118, 3107, 3109, 3175, 3112, 3109, 3135, 3108, 3118, 3115, 3128, 3123, 3175, 2337, 2361, 2336, 2360, 2341, 2364, 2349, 2366, 2360, 2403, 2346, 2339, 2366, 2337, 2401, 2344, 2349, 2360, 2349, 2423, 2412, 1161, 1161, 2257, 2262, 2207, 2227, 2226, 2216, 2233, 2226, 2216, 2289, 2200, 2229, 2223, 2220, 2227, 2223, 2229, 2216, 2229, 2227, 2226, 2278, 2300, 2234, 2227, 2222, 2225, 2289, 2232, 2237, 2216, 2237, 2279, 2300, 2226, 2237, 2225, 2233, 2273, 2302, 2231, 2233, 2213, 2219, 2227, 2222, 2232, 2302, 2257, 2262, 2257, 2262, 2110, 2105, 2078, 2078, 2558, 2553, 2480, 2460, 2461, 2439, 2454, 2461, 2439, 2526, 2487, 2458, 2432, 2435, 2460, 2432, 2458, 2439, 2458, 2460, 2461, 2505, 2515, 2453, 2460, 2433, 2462, 2526, 2455, 2450, 2439, 2450, 2504, 2515, 2461, 2450, 2462, 2454, 2510, 2513, 2432, 2458, 2452, 2461, 2513, 2558, 2553, 2558, 2553, 987, 988, 917, 953, 952, 930, 947, 952, 930, 1019, 914, 959, 933, 934, 953, 933, 959, 930, 959, 953, 952, 1004, 1014, 944, 953, 932, 955, 1019, 946, 951, 930, 951, 1005, 1014, 952, 951, 955, 947, 1003, 1012, 930, 959, 955, 947, 933, 930, 951, 955, 934, 1012, 987, 988, 987, 988, 2050, 2050, 2082, 2085, 2082, 2085, 585, 623, 633, 622, 561, 605, 635, 633, 626, 616, 1750, 1746, 1745, 1741, 1741, 1737, 1684, 1750, 1746, 1758, 1750, 1686, 1747, 1756, 1752, 1738, 1750, 1751, 1749, 1731, 1728, 2135, 2127, 2134, 2126, 2131, 2122, 2139, 2120, 2126, 2069, 2140, 2133, 2120, 2135, 2071, 2142, 2139, 2126, 2139, 2049, 2074, 2136, 2133, 2127, 2132, 2142, 2139, 2120, 2115, 2055, 1429, 1433, 1432, 1410, 1427, 1432, 1410, 1499, 1410, 1423, 1414, 1427, 1468, 1468, 1468, -32159, 27666, 21171, -31065, 2997, 3000, 2993, 2980, 2974, 2991, 2976, 2988, 2980, 1503, 1490, 1499, 1486, 1524, 1474, 1487, 2569, 2640, 2581, 2569, 2642, 2655, 2646, 2627, 2569, 2642, 2633, 2646, 2681, 2642, 2655, 2646, 2627, 679, 674, 695, 674, 2887, 2882, 2904, 2911, 2441, 2438, 2443, 2457, 2457, 878, 865, 868, 892, 877, 890, 891, 3036, 3013, 3022, 3061, 3032, 3023, 3015, 3019, 3032, 3009, 3033, 385, 408, 403, 424, 409, 406, 410, 402, 318, 295, 300, 279, 289, 300, 1301, 1292, 1287, 1340, 1299, 1290, 1280, 628, 557, 616, 628, 559, 546, 555, 574, 628, 559, 561, 516, 557, 564, 575, 523, 526, 539, 526, 814, 812, 804, 2058, 2067, 2072, 2083, 2060, 2069, 2079, 2083, 2056, 2068, 2057, 2065, 2078, 862, 859, 833,
    838, 2146, 2163, 2144, 2145, 2167, 2551, 2544, 2542, 1252, 1268, 1273, 1250, 2837, 2880, 2906, 2900, 2909, 2830, 1356, 1310, 1283, 1287, 1295, 1305, 1310, 1291, 1287, 1306, 1367, 759, 3182, 3178, 3182, 2987, 3001, -29095, 24618, 1999, 1992, 2006, 1935, 1920, 1707, 1719, 1719, 1715, 1712, 1785, 1772, 1772, 1710, 1698, 1719, 1702, 1713, 1706, 1698, 1711, 1774, 1715, 1713, 1708, 1774, 1717, 1706, 1703, 1702, 1708, 1774, 1778, 1777, 1782, 1782, 1786, 1780, 1782, 1780, 1777, 1776, 1773, 1696, 1708, 1712, 1773, 1698, 1715, 1774, 1697, 1702, 1706, 1705, 1706, 1709, 1700, 1773, 1710, 1722, 1714, 1696, 1711, 1708, 1718, 1703, 1773, 1696, 1708, 1710, 1351, 1284, 1370, 1308, 1361, 3140, 3164, 3156, 3162, 3167, 3164, -32133, 27656, 3053, 3050, 3060, 2978, 1296, 1307, 1297, 1046, 1075, 1080, 1074, 2739, 2875, 2879, 2875, 995, 999, 995, 19793, 975, 982, 989, 998, 971, 988, 980, 984, 971, 978, 970, 1291, 1298, 1305, 1314, 1299, 1308, 1296, 1304, 1637, 1660, 1655, 1612, 1658, 1655, 852, 849, 843, 844, 3303, 3326, 3317, 3278, 3297, 3320, 3314, 2411, 2354, 2423, 2411, 2348, 2347, 2345, 2337, 2411, 2359, 2337, 2341, 2358, 2343, 2348, 1549, 1544, 1565, 1544, 485, 508, 503, 460, 483, 506, 496, 460, 487, 507, 486, 510, 497};
    private String S;
    private String T4;
    private String l8 = "";

    public TTian() {
        String strE = "7gp0bnd2sr85ydii2j32pcypscoc4w6c7g5spl";
        this.S = strE;
        this.T4 = strE;
    }

    public static String getRandomNickname(int i) {
        Random random = new Random();
        String str = "";
        for (int i2 = 0; i2 < i; i2++) {
            str = str + String.valueOf(random.nextInt(10));
        }
        return str;
    }

    private HashMap<String, String> l8(String str) {
        String str2 = "۟ۤۧ";
        HashMap<String, String> map = null;
        String strE = null;
        String strB = null;
        short[] sArr = null;
        while (true) {
            switch (v.d(str2)) {
                case 1746694:
                    str2 = "ۢۨۤ";
                    strE = "Referer";
                    break;
                case 1746847:
                    map.put(strE, strB);
                    str2 = "ۣۦۡ";
                    break;
                case 1746850:
                    map = new HashMap<>();
                    str2 = "ۣ۠ۤ";
                    break;
                case 1747712:
                    str2 = "ۤۦۧ";
                    strB = "okhttp/4.9.3";
                    break;
                case 1747777:
                    str2 = "ۣ۟ۥ";
                    sArr = f50short;
                    break;
                case 1747871:
                    str2 = "۟ۤۤ";
                    strB = " ";
                    break;
                case 1749757:
                    str2 = "۟۟ۦ";
                    sArr = f50short;
                    break;
                case 1749854:
                    str2 = "۠ۦۥ";
                    sArr = f50short;
                    break;
                case 1750565:
                    str2 = "۠ۡۡ";
                    sArr = f50short;
                    break;
                case 1750750:
                    return map;
                case 1751717:
                    map.put(strE, strB);
                    str2 = "ۢۥ۠";
                    break;
                default:
                    str2 = "ۣ۠ۢ";
                    strE = "User-Agent";
                    break;
            }
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strB = com.github.catvod.parser."vod_remarks";
        String strE = "vod_name";
        String strC = "vod_id";
        String strC2 = "list";
        String strB2 = com.github.catvod.parser."vod_pic";
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONObject(formUploadCate(this.l8 + "/v3/home/type_search", str, str2)).optJSONObject("data").getJSONArray(strC2);
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(strC, jSONObjectOptJSONObject.optString(strC));
                jSONObject2.put(strE, jSONObjectOptJSONObject.optString(strE));
                if (jSONObjectOptJSONObject.has(strB2)) {
                    jSONObject2.put(strB2, jSONObjectOptJSONObject.optString(strB2));
                } else {
                    jSONObject2.put(strB2, jSONObjectOptJSONObject.optString(com.github.catvod.parser."vod_pic_thumb"));
                }
                jSONObject2.put(strB, jSONObjectOptJSONObject.optString(strB));
                jSONArray2.put(jSONObject2);
            }
            jSONObject.put("page", str2);
            jSONObject.put("pagecount", 100);
            jSONObject.put("limit", 12);
            jSONObject.put("total", 1200);
            jSONObject.put(strC2, jSONArray2);
            return jSONObject.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    // TODO: Method not decompiled by JADX - needs manual reconstruction
    public java.lang.String detailContent(java.util.List<java.lang.String> r23) {
        return "";
    }

    public String formUpload(String str) {
        String lowerCase;
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        boolean zContains = this.l8.contains("rbot");
        if (!zContains) {
            lowerCase = ZP.l8(this.S + strValueOf, ZP.S).toLowerCase();
        } else {
            lowerCase = ZP.l8(this.T4 + strValueOf, ZP.S).toLowerCase();
        }
        OkHttpClient okHttpClient = new OkHttpClient();
        String str2 = "--dio-boundary-" + getRandomNickname(10);
        MediaType mediaType = MediaType.parse("multipart/form-data; " + str2);
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(str2);
        sb.append("\r\nContent-Disposition: form-data; name=\"\"\r\n\r\n\r\n--");
        sb.append(str2);
        sb.append("\r\nContent-Disposition: form-data; name=\"sign\"\r\n\r\n");
        sb.append(lowerCase);
        String strE = "\r\n--";
        sb.append(strE);
        sb.append(str2);
        sb.append("\r\nContent-Disposition: form-data; name=\"timestamp\"\r\n\r\n");
        sb.append(strValueOf);
        sb.append(strE);
        sb.append(str2);
        sb.append("--\r\n\r\n");
        try {
            return okHttpClient.newCall(new Request.Builder().url(str).post(RequestBody.create(mediaType, sb.toString())).addHeader("User-Agent", "okhttp-okgo/jeasonlzy").addHeader("content-type", "multipart/form-data; boundary=" + str2).build()).execute().body().string();
        } catch (IOException e) {
            System.out.println("777" + e);
            return "解析失败";
        }
    }

    public String formUploadCate(String str, String str2, String str3) {
        String lowerCase;
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        boolean zContains = this.l8.contains("rbot");
        if (!zContains) {
            lowerCase = ZP.l8(this.S + strValueOf, ZP.S).toLowerCase();
        } else {
            lowerCase = ZP.l8(this.T4 + strValueOf, ZP.S).toLowerCase();
        }
        OkHttpClient okHttpClient = new OkHttpClient();
        String strE = "multipart/form-data; boundary=4b8a0b47-84bc-4b6e-b252-db25b4b9abd2";
        try {
            return okHttpClient.newCall(new Request.Builder().url(str).post(RequestBody.create(MediaType.parse(strE), "--4b8a0b47-84bc-4b6e-b252-db25b4b9abd2\r\nContent-Disposition: form-data; name=\"sign\"\r\n\r\n" + lowerCase + "\r\n--4b8a0b47-84bc-4b6e-b252-db25b4b9abd2\r\nContent-Disposition: form-data; name=\"timestamp\"\r\n\r\n" + strValueOf + "\r\n--4b8a0b47-84bc-4b6e-b252-db25b4b9abd2\r\nContent-Disposition: form-data; name=\"limit\"\r\n\r\n12\r\n--4b8a0b47-84bc-4b6e-b252-db25b4b9abd2\r\nContent-Disposition: form-data; name=\"type_id\"\r\n\r\n" + str2 + "\r\n--4b8a0b47-84bc-4b6e-b252-db25b4b9abd2\r\nContent-Disposition: form-data; name=\"page\"\r\n\r\n" + str3 + "\r\n--4b8a0b47-84bc-4b6e-b252-db25b4b9abd2\r\n--\r\n\r\n")).addHeader("User-Agent", "okhttp-okgo/jeasonlzy").addHeader("content-type", strE).build()).execute().body().string();
        } catch (IOException e) {
            System.out.println("777" + e);
            return "解析失败";
        }
    }

    public String formUploadDetail(String str, String str2) {
        String lowerCase;
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        boolean zContains = this.l8.contains("rbot");
        if (!zContains) {
            lowerCase = ZP.l8(this.S + strValueOf, ZP.S).toLowerCase();
        } else {
            lowerCase = ZP.l8(this.T4 + strValueOf, ZP.S).toLowerCase();
        }
        OkHttpClient okHttpClient = new OkHttpClient();
        String str3 = "--dio-boundary-" + getRandomNickname(10);
        MediaType mediaType = MediaType.parse("multipart/form-data; " + str3);
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(str3);
        sb.append("\r\nContent-Disposition: form-data; name=\"vod_id\"\r\n\r\n");
        sb.append(str2);
        String strB = "\r\n--";
        sb.append(strB);
        sb.append(str3);
        sb.append("\r\nContent-Disposition: form-data; name=\"sign\"\r\n\r\n");
        sb.append(lowerCase);
        sb.append(strB);
        sb.append(str3);
        sb.append("\r\nContent-Disposition: form-data; name=\"timestamp\"\r\n\r\n");
        sb.append(strValueOf);
        sb.append(strB);
        sb.append(str3);
        sb.append("--\r\n\r\n");
        try {
            return okHttpClient.newCall(new Request.Builder().url(str).post(RequestBody.create(mediaType, sb.toString())).addHeader("User-Agent", "okhttp-okgo/jeasonlzy").addHeader("content-type", "multipart/form-data; boundary=" + str3).build()).execute().body().string();
        } catch (IOException e) {
            System.out.println("777" + e);
            return "解析失败";
        }
    }

    public String formUploadSearch(String str, String str2) {
        String lowerCase;
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        boolean zContains = this.l8.contains("rbot");
        if (!zContains) {
            lowerCase = ZP.l8(this.S + strValueOf, ZP.S).toLowerCase();
        } else {
            lowerCase = ZP.l8(this.T4 + strValueOf, ZP.S).toLowerCase();
        }
        OkHttpClient okHttpClient = new OkHttpClient();
        String str3 = "--dio-boundary-" + getRandomNickname(10);
        MediaType mediaType = MediaType.parse("multipart/form-data; " + str3);
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(str3);
        sb.append("\r\nContent-Disposition: form-data; name=\"keyword\"\r\n\r\n");
        sb.append(str2);
        String strB = "\r\n--";
        sb.append(strB);
        sb.append(str3);
        sb.append("\r\nContent-Disposition: form-data; name=\"sign\"\r\n\r\n");
        sb.append(lowerCase);
        sb.append(strB);
        sb.append(str3);
        sb.append("\r\nContent-Disposition: form-data; name=\"timestamp\"\r\n\r\n");
        sb.append(strValueOf);
        sb.append(strB);
        sb.append(str3);
        sb.append("--\r\n\r\n");
        try {
            return okHttpClient.newCall(new Request.Builder().url(str).post(RequestBody.create(mediaType, sb.toString())).addHeader("User-Agent", "okhttp-okgo/jeasonlzy").addHeader("content-type", "multipart/form-data; boundary=" + str3).build()).execute().body().string();
        } catch (IOException e) {
            System.out.println("777" + e);
            return "解析失败";
        }
    }

    public String homeContent(boolean z) {
        String strC = "type_name";
        String strB = "type_id";
        try {
            JSONObject jSONObject = new JSONObject();
            String strFormUpload = formUpload(this.l8 + "/v3/type/top_type");
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONObject(strFormUpload).optJSONObject("data").getJSONArray("list");
            for (int i = 0; i < jSONArray2.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(strB, jSONObjectOptJSONObject.optString(strB));
                jSONObject2.put(strC, jSONObjectOptJSONObject.optString(strC));
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("class", jSONArray);
            if (z) {
                jSONObject.put("filters", new JSONObject("{\"1\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"警匪\",\"v\":\"警匪\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动画\",\"v\":\"动画\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"枪战\",\"v\":\"枪战\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"青春\",\"v\":\"青春\"},{\"n\":\"文艺\",\"v\":\"文艺\"},{\"n\":\"微电影\",\"v\":\"微电影\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"农村\",\"v\":\"农村\"},{\"n\":\"儿童\",\"v\":\"儿童\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"中国大陆\",\"v\":\"大陆\"},{\"n\":\"中国香港\",\"v\":\"香港\"},{\"n\":\"中国台湾\",\"v\":\"台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]}],\"2\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"青春偶像\",\"v\":\"青春偶像\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"家庭\",\"v\":\"家庭\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"乡村\",\"v\":\"乡村\"},{\"n\":\"情景\",\"v\":\"情景\"},{\"n\":\"商战\",\"v\":\"商战\"},{\"n\":\"网剧\",\"v\":\"网剧\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"中国大陆\",\"v\":\"大陆\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]}],\"4\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"热血\",\"v\":\"热血\"},{\"n\":\"推理\",\"v\":\"推理\"},{\"n\":\"搞笑\",\"v\":\"搞笑\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"萝莉\",\"v\":\"萝莉\"},{\"n\":\"校园\",\"v\":\"校园\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"机战\",\"v\":\"机战\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"少年\",\"v\":\"少年\"},{\"n\":\"少女\",\"v\":\"少女\"},{\"n\":\"社会\",\"v\":\"社会\"},{\"n\":\"原创\",\"v\":\"原创\"},{\"n\":\"亲子\",\"v\":\"亲子\"},{\"n\":\"益智\",\"v\":\"益智\"},{\"n\":\"励志\",\"v\":\"励志\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国\",\"v\":\"内地\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"欧美\",\"v\":\"欧美\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}],\"3\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"选秀\",\"v\":\"选秀\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"访谈\",\"v\":\"访谈\"},{\"n\":\"播报\",\"v\":\"播报\"},{\"n\":\"旅游\",\"v\":\"旅游\"},{\"n\":\"音乐\",\"v\":\"音乐\"},{\"n\":\"美食\",\"v\":\"美食\"},{\"n\":\"纪实\",\"v\":\"纪实\"},{\"n\":\"曲艺\",\"v\":\"曲艺\"},{\"n\":\"生活\",\"v\":\"生活\"},{\"n\":\"游戏互动\",\"v\":\"游戏互动\"},{\"n\":\"财经\",\"v\":\"财经\"},{\"n\":\"求职\",\"v\":\"求职\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"港台\",\"v\":\"港台\"},{\"n\":\"日韩\",\"v\":\"日韩\"},{\"n\":\"欧美\",\"v\":\"欧美\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]}]}]}"));
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            System.out.println(th);
            return "";
        }
    }

    public String homeVideoContent() {
        String strB = "vod_remarks";
        String strD = "vod_name";
        String strC = "vod_id";
        String strE = "vod_pic";
        try {
            JSONObject jSONObject = new JSONObject(formUpload(this.l8 + "/v3/type/tj_vod"));
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = jSONObject.optJSONObject("data").getJSONArray("cai");
            for (int i = 0; i < jSONArray2.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(strC, jSONObjectOptJSONObject.optString(strC));
                jSONObject2.put(strD, jSONObjectOptJSONObject.optString(strD));
                if (jSONObjectOptJSONObject.has(strE)) {
                    jSONObject2.put(strE, jSONObjectOptJSONObject.optString(strE));
                } else {
                    jSONObject2.put(strE, jSONObjectOptJSONObject.optString("vod_pic_thumb"));
                }
                jSONObject2.put(strB, jSONObjectOptJSONObject.optString(strB));
                jSONArray.put(jSONObject2);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("list", jSONArray);
            return jSONObject3.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context, str);
        this.l8 = C1370pv.l(str);
    }

    public String parseurl(String str, String str2) {
        String lowerCase;
        JSONObject jSONObject = new JSONObject();
        try {
            int length = str.length();
            String strE = "parse";
            String strB = "url";
            if (length >= 3) {
                String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
                boolean zContains = this.l8.contains("rbot");
                if (!zContains) {
                    lowerCase = ZP.l8(this.S + strValueOf, ZP.S).toLowerCase();
                } else {
                    lowerCase = ZP.l8(this.T4 + strValueOf, ZP.S).toLowerCase();
                }
                String strV = Yy.v(str + str2 + "&sign=" + lowerCase + "&timestamp=" + strValueOf, l8(str2));
                boolean zContains2 = strV.contains("{");
                String strE2 = "404";
                String strE3 = "jx";
                if (zContains2) {
                    JSONObject jSONObject2 = new JSONObject(strV);
                    if (jSONObject2.has(strB)) {
                        String strOptString = jSONObject2.optString(strB);
                        if (strOptString == "") {
                            String strOptString2 = jSONObject2.optString(strB);
                            System.out.println("解析url5:" + strOptString2);
                            if (strOptString2.length() < 5) {
                                return strE2;
                            }
                            boolean zContains3 = strOptString2.contains("https://material-pro-video-1255975723.cos.ap-beijing.myqcloud.com");
                            if (zContains3) {
                                jSONObject.put(strE3, 1);
                                jSONObject.put(strB, str2);
                                return jSONObject.toString();
                            } else {
                                jSONObject.put(strE, 0);
                                jSONObject.put(strB, strOptString2);
                                return jSONObject.toString();
                            }
                        } else {
                            jSONObject.put(strE, 0);
                            jSONObject.put(strB, str2);
                            return jSONObject.toString();
                        }
                    } else {
                        if (str2.contains(".m3u8")) {
                            jSONObject.put(strE, 0);
                            jSONObject.put(strB, str2);
                            return jSONObject.toString();
                        } else {
                            if (ZP.l(str2)) {
                                jSONObject.put(strE3, 1);
                                jSONObject.put(strB, str2);
                                return jSONObject.toString();
                            } else {
                                return jSONObject.toString();
                            }
                        }
                    }
                } else {
                    return strE2;
                }
            } else {
                jSONObject.put(strE, 0);
                jSONObject.put(strB, str2);
                return jSONObject.toString();
            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            Init2.lj();
            String[] strArrSplit = str2.split("qiaoji");
            String str3 = strArrSplit[1];
            String str4 = strArrSplit[0];
            System.out.println("解析url:" + str2);
            if (str3.contains("end")) {
                String[] strArrSplit2 = str3.replace("@end", "").split("@");
                for (int i2 = 0; i2 < strArrSplit2.length; i2++) {
                    String str5 = parseurl(strArrSplit2[i2], str4);
                    if (str5.contains("404")) {
                        System.out.println("404了");
                    } else {
                        return str5;
                    }
                }
                return "";
            } else {
                return parseurl(str3, str4);
            }
        } catch (Throwable th) {
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        String strB = "vod_remarks";
        String strD = "vod_name";
        String strB2 = "vod_id";
        String strB3 = "list";
        String strE = "vod_pic";
        try {
            JSONObject jSONObject = new JSONObject();
            String strFormUploadSearch = formUploadSearch(this.l8 + "/v3/home/search", str);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONObject(strFormUploadSearch).optJSONObject("data").getJSONArray(strB3);
            for (int i = 0; i < jSONArray2.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(strB2, jSONObjectOptJSONObject.optString(strB2));
                jSONObject2.put(strD, jSONObjectOptJSONObject.optString(strD));
                if (jSONObjectOptJSONObject.has(strE)) {
                    jSONObject2.put(strE, jSONObjectOptJSONObject.optString(strE));
                } else {
                    jSONObject2.put(strE, jSONObjectOptJSONObject.optString("vod_pic_thumb"));
                }
                jSONObject2.put(strB, jSONObjectOptJSONObject.optString(strB));
                jSONArray.put(jSONObject2);
            }
            jSONObject.put(strB3, jSONArray);
            return jSONObject.toString();
        } catch (Throwable th) {
            return "";
        }
    }
}
