package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0165;
import com.github.catvod.parser.C0166;
import com.github.catvod.spider.merge.AbstractC0099V3;
import com.github.catvod.spider.merge.C0082OO;
import com.github.catvod.spider.merge.C0093Tt;
import com.github.catvod.spider.merge.C0106ZJ;
import com.github.catvod.spider.merge.C0116dX;
import com.github.catvod.spider.merge.C0117f4;
import com.github.catvod.spider.merge.C0118ga;
import com.github.catvod.spider.merge.C0127lK;
import com.github.catvod.spider.merge.C0147tG;
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
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.net.URLEncoder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class Czsapp extends Spider {

    /* renamed from: k */
    private String f60k = "";

    /* renamed from: short, reason: not valid java name */
    private static final short[] f818short = {1513, 1507, 1424, 1429, 1513, 1430, 1504, 1506, 1513, 1520, 1469, 1450, 1465, 1515, 1424, 1431, 1455, 1431, 1468, 1430, 1504, 1526, 1453, 1470, 1445, 1448, 1471, 1442, 1444, 1445, 1515, 1455, 1445, 1448, 1465, 1458, 1509, 1505, 1446, 1455, 1534, 1509, 1454, 1445, 1448, 1509, 1438, 1471, 1453, 1523, 1509, 1467, 1450, 1465, 1464, 1454, 1431, 1507, 1513, 1507, 1424, 1431, 1455, 1431, 1468, 1430, 1504, 1506, 1513, 1509, 1505, 1446, 1455, 1534, 1509, 1454, 1445, 1448, 1509, 1438, 1471, 1453, 1523, 1509, 1467, 1450, 1465, 1464, 1454, 1431, 1507, 1507, 1424, 1431, 1455, 1430, 1504, 1506, 1431, 1506, 412, 387, 398, 399, 389, 464, 458, 438, 401, 415, 408, 390, 464, 458, 456, 450, 433, 436, 456, 439, 449, 451, 456, 677, 675, 692, 674, 703, 674, 698, 691, 748, 758, 650, 685, 675, 676, 698, 748, 756, 766, 653, 648, 756, 651, 765, 650, 760, 672, 674, 674, 767, 756, 3098, 3094, 3095, 3082, 3085, 3109, 3082, 3154, 3092, 3072, 3082, 3087, 3102, 3109, 3082, 3155, 3140, 3109, 3082, 3155, 3166, 3153, 3106, 3111, 3166, 3108, 3154, 3152, 3166, 1970, 2032, 2034, 2027, 2036, 2040, 1970, 1973, 1985, 2041, 1974, 1972, 1971, 2037, 2025, 2032, 2033, 1722, 1765, 1780, 1778, 1776, 1722, 1725, 1737, 1777, 1726, 1724, 2179, 2266, 2291, 2268, 2240, 2253, 2261, 2179, 2180, 2178, 2182, 2181, 2288, 2178, 2244, 2264, 2241, 2240, 2962, 2949, 2966, 3012, 2962, 2959, 2945, 2973, 3012, 3033, 3012, 3007, 3011, 3014, 3001, 3020, 3007, 3002, 3011, 3014, 3001, 3023, 3021, 3007, 3011, 3014, 3001, 1644, 1659, 1640, 1594, 1660, 1644, 1649, 1663, 1635, 1594, 1575, 1594, 1601, 1597, 1592, 1607, 1586, 1601, 1604, 1597, 1592, 1607, 1585, 1587, 1601, 1597, 1592, 1607, 2269, 2250, 2265, 2187, 2270, 2250, 2187, 2198, 2187, 2288, 2188, 2185, 2294, 2179, 2288, 2293, 2188, 2185, 2294, 2176, 2178, 2288, 2188, 2185, 2294, 1978, 1965, 1982, 2028, 1967, 1957, 1980, 2028, 2033, 2028, 1943, 2027, 2030, 1937, 2020, 1943, 1938, 2027, 2030, 1937, 2023, 2021, 1943, 2027, 2030, 1937, 2735, 2744, 2731, 2809, 2733, 2736, 2740, 2748, 2809, 2788, 2809, 2690, 2814, 2811, 2692, 2801, 2690, 2695, 2814, 2811, 2692, 2802, 2800, 2690, 2814, 2811, 2692, 1100, 1115, 1096, 1050, 1103, 1096, 1110, 1050, 1031, 1050, 1121, 1053, 1048, 1127, 1042, 1121, 1124, 1053, 1048, 1127, 1041, 1043, 1121, 1053, 1048, 1127, 1755, 1749, 1737, 1677, 1771, 1687, 1682, 1773, 1688, 1771, 1774, 1687, 1682, 1773, 1691, 1689, 1771, 1687, 1682, 1773, 2176, 2199, 2202, 2179, 2195, 2251, 2221, 2257, 2260, 2219, 2270, 2221, 2216, 2257, 2260, 2219, 2269, 2271, 2221, 2257, 2260, 2219, 1332, 1341, 1356, 445, 800, 2369, 3170, 495, 1683, 2571, 2636, 1742, 2707, 3156, 1053, 1879, 3080, 1607, 506, 476, 458, 477, 386, 494, 456, 458, 449, 475, 1557, 1591, 1570, 1585, 1588, 1588, 1593, 1655, 1645, 1654, 1640, 1656, 1648, 1585, 1544, 1584, 1591, 1590, 1597, 1635, 1656, 1563, 1544, 1549, 1656, 1585, 1544, 1584, 1591, 1590, 1597, 1656, 1559, 1547, 1656, 1641, 1643, 1543, 1642, 1543, 1643, 1656, 1588, 1585, 1587, 1597, 1656, 1557, 1593, 1595, 1656, 1559, 1547, 1656, 1536, 1649, 1656, 1561, 1576, 1576, 1588, 1597, 1551, 1597, 1594, 1555, 1585, 1580, 1655, 1645, 1643, 1647, 1654, 1643, 1646, 1656, 1656, 1648, 1555, 1552, 1548, 1557, 1556, 1652, 1656, 1588, 1585, 1587, 1597, 1656, 1567, 1597, 1595, 1587, 1591, 1649, 1656, 1550, 1597, 1578, 1579, 1585, 1591, 1590, 1655, 1641, 1643, 1654, 1640, 1656, 1557, 1591, 1594, 1585, 1588, 1597, 1655, 1641, 1645, 1565, 1641, 1644, 1632, 1656, 1547, 1593, 1598, 1593, 1578, 1585, 1655, 1645, 1643, 1647, 1654, 1643, 1646, 2679, 2624, 2627, 2624, 2647, 2624, 2647, 3036, 3070, 3070, 3064, 3053, 3049, 2992, 3057, 3068, 3059, 3066, 3048, 3068, 3066, 3064, 1996, 2014, 1947, 2037, 2040, 1946, 1996, 2014, 1933, 1991, 1931, 1926, 1944, 1935, 1381, 1296, 1391, 1368, 1356, 1352, 1368, 1358, 1353, 1368, 1369, 1296, 1386, 1364, 1353, 1365, 3055, 3066, 3067, 3071, 3011, 3011, 3015, 3045, 3026, 3014, 3010, 3012, 3026, 3011, 2259, 2303, 2303, 2299, 2297, 2293, 1374, 1370, 1360, 2933, 2927, 2936, 2939, 2624, 621, 562, 547, 549, 551, 621, 2324, 2329, 2310, 2398, 2304, 2321, 2327, 2325, 2334, 2321, 2310, 2329, 2351, 2308, 2312, 2308, 2384, 2384, 2321, 2398, 2325, 2312, 2308, 2325, 2334, 2324, 1954, 1967, 1968, 2024, 1963, 1967, 1945, 1960, 1955, 1945, 1965, 1954, 2022, 2040, 2022, 1971, 1962, 2022, 2040, 2022, 1962, 1967, 2696, 1737, 1732, 1756, 956, 953, 940, 953, 1013, 951, 938, 945, 959, 945, 950, 953, 948, 557, 544, 575, 615, 545, 557, 544, 551, 559, 550, 617, 631, 617, 570, 569, 552, 551, 2375, 2398, 2389, 2414, 2392, 2389, 1004, 1013, 1022, 965, 1012, 1019, 1015, 1023, 2417, 2408, 2403, 2392, 2423, 2414, 2404, 2375, 2398, 2389, 2414, 2371, 2388, 2396, 2384, 2371, 2394, 2370, 535, 530, 520, 527, 720, 705, 711, 709, 686, 703, 697, 699, 701, 689, 683, 688, 682, 2859, 2862, 2858, 2862, 2867, 869, 894, 869, 880, 893, 1121, 1059, 1057, 1080, 1063, 1067, 1121, 828, 890, 870, 895, 894, 1142, 1147, 1124, 1084, 1151, 1149, 1124, 1147, 1143, 1142, 1126, 1143, 1139, 1147, 1150, 1101, 1126, 1126, 1074, 1068, 1074, 1146, 1059, 2905, 2900, 2891, 2835, 2905, 2884, 2900, 2896, 2906, 2845, 2819, 2845, 2900, 2896, 2906, 1044, 1045, 1028, 812, 821, 887, 820, 822, 815, 816, 828, 829, 813, 828, 824, 816, 821, 774, 821, 816, 810, 813, 889, 871, 889, 821, 816, 32321, 21937, 24014, 22980, 23244, 19013, 20774, 26062, 17839, 25728, -30758, 32639, 1224, 1233, 1242, 1249, 1239, 1242, 942, 951, 956, 903, 950, 953, 949, 957, 1827, 1850, 1841, 1802, 1829, 1852, 1846, 2070, 2075, 2066, 2055, 2109, 2060, 2051, 2063, 2055, 2866, 2859, 2848, 2843, 2877, 2849, 2853, 2870, 1151, 1126, 1133, 1110, 1128, 1147, 1132, 1128, 3273, 3280, 3291, 3296, 3277, 3290, 3282, 3294, 3277, 3284, 3276, 3264, 3289, 3282, 3305, 3287, 3285, 3266, 3289, 3268, 1148, 1125, 1134, 1109, 1134, 1123, 1144, 1135, 1129, 1150, 1125, 1144, 2562, 2587, 2576, 2603, 2583, 2587, 2586, 2560, 2577, 2586, 2560, 27972, 
    25989, 21955, 23980, 22344, 22381, -29927, -1748, -29225, 21727, 18474, 22899, 22007, -25417, -1759, -1759, 1037, 1024, 1055, 1095, 1040, 1049, 1078, 1034, 1030, 1031, 1053, 1036, 1041, 1053, 2312, 2321, 2330, 2337, 2318, 2322, 2335, 2311, 2337, 2328, 2316, 2321, 2323, -32430, 21702, 31837, 24866, 891, 886, 873, 817, 879, 894, 883, 870, 832, 883, 886, 876, 875, 832, 893, 875, 881, 831, 801, 831, 894, 1239, 1229, 1242, 1241, 559, 2948, 2973, 2966, 2989, 2946, 2974, 2963, 2955, 2989, 2951, 2944, 2974, 2982, 3287, 3282, 3272, 3279, 3082, 3086, 3076, 1671, 1735, 1736, 1759, 1733, 1728, 1754, 1757, 1673, 1687, 1673, 1733, 1728, 1673, 1687, 1673, 1736, 2992, 2986, 3005, 3006, -28072, -27717, 2975, 2962, 2971, 2958, 2996, 2946, 2959, 2339, 2350, 2343, 2354, 2312, 2361, 2358, 2362, 2354, 830, 817, 828, 814, 814, 304, 317, 290, 378, 313, 317, 267, 314, 305, 267, 319, 304, 372, 362, 372, 289, 312, 372, 362, 372, 312, 317, 3294, 2926, 2915, 2939, 2146, 2151, 2162, 2151, 2091, 2153, 2164, 2159, 2145, 2159, 2152, 2151, 2154, 2821, 2824, 2839, 2895, 2825, 2821, 2824, 2831, 2823, 2830, 2881, 2911, 2881, 2834, 2833, 2816, 2831, 2345, 2352, 2363, 2304, 2358, 2363, 1739, 1746, 1753, 1762, 1747, 1756, 1744, 1752, 2061, 2068, 2079, 2084, 2059, 2066, 2072, 2394, 2371, 2376, 2419, 2398, 2377, 2369, 2381, 2398, 2375, 2399, 1896, 1901, 1911, 1904, 1808, 1797, 1254, 1271, 1271, 1259, 1262, 1252, 1254, 1267, 1262, 1256, 1257, 1192, 1256, 1252, 1267, 1250, 1267, 1194, 1268, 1267, 1269, 1250, 1254, 1258, 2404, 2422, 2417, 2405, 2407, 2407, 1979, 1999, 2039, 2024, 1953, 2030, 1961, 1999, 2039, 2024, 1953, 2030, 1961, 1999, 2039, 2024, 1953, 2030, 1981, 1999, 2039, 2024, 1952, 2030, 1981, 1976, 1999, 2039, 2024, 1953, 2030, 1961, 1999, 2039, 2024, 1953, 2030, 1961, 1999, 2039, 2024, 1953, 2030, 1981, 1999, 2039, 2024, 1952, 2030, 1978, 1981, 1977, 3025, 2981, 2973, 2946, 3019, 2948, 3011, 2981, 2973, 2946, 3019, 2948, 3031, 2981, 2973, 2946, 3018, 2948, 3024, 3031, 3027, 3014, 3025, 3033, 3028, 3028, 3015, 3033, 3024, 3025, 2981, 2973, 2946, 3019, 2948, 3011, 2981, 2973, 2946, 3019, 2948, 3031, 2981, 2973, 2946, 3018, 2948, 3024, 3031, 3027, 2740, 2740, 2750, 2720, 2741, 2720, 2742, 2740, 2740, 2750, 2720, 2743, 2352, 2338, 2342, 2354, 2352, 2338, 2342, 2354, 2340, 2338, 2342, 2341, 2352, 2338, 2342, 2354, 2352, 2338, 2342, 2354, 2949, 2955, 2957, 2953, 2954, 2968, 2817, 2821, 2913, 2912, 2939, 2922, 2817, 2821, 2972, 2980, 3003, 3058, 3005, 3066, 2972, 2980, 3003, 3058, 3005, 3066, 2972, 2980, 3003, 3058, 3005, 3054, 2972, 2980, 3003, 3059, 3005, 3054, 3051, 2972, 2980, 3003, 3058, 3005, 3066, 2972, 2980, 3003, 3058, 3005, 3066, 2972, 2980, 3003, 3058, 3005, 3054, 2972, 2980, 3003, 3059, 3005, 2932, 3099, 3138, 3179, 3140, 3160, 3157, 3149, 3099, 784, 854, 842, 851, 850, 1942, 1937, 1935, 3103, 3088, 3076, 3095, 3099, 3091, 3160, 3072, 3103, 3088, 3076, 3095, 3099, 3091, 1432, 1433, 1416, 1493, 1479, 1425, 1479, 1490, 1497, 1491, 1481, 1425, 1500, 1488, 1490, 2871, 2859, 2859, 2863, 2860, 2917, 2928, 2928, 2869, 2855, 2929, 2855, 2866, 2873, 2867, 2857, 2929, 2876, 2864, 2866, 2928, 2863, 2867, 2878, 2854, 2874, 2861, 2929, 2863, 2871, 2863, 2912, 2859, 2870, 2866, 2874, 2914, 1872, 1795, 1796, 1818, 1867, 910, 909, 926, 1002, 917, 911, 898, 1007, 918, 927, 898, 1001, 917, 906, 998, 998, 2583, 2579, 2565, 2681, 2581, 2580, 2581, 2681, 2584, 2617, 2566, 2615, 2610, 2610, 2623, 2616, 2609, 1875, 1879, 1857, 2404, 2425, 2429, 2421, 1098, 1118, 2460, 2454, 2447, 603, 582, 584, 596, 958, 942, 947, 957, 929, 2491, 2471, 2471, 2467, 2464, 2537, 2556, 2556, 2489, 2475, 2557, 2475, 2494, 2485, 2495, 2469, 2557, 2480, 2492, 2494, 2556, 2475, 2494, 2485, 2495, 2469, 2558, 2530, 2557, 2432, 2437, 2452, 2234, 2219, 2232, 2233, 2223, 2262, 883, 879, 866, 890, 854, 881, 879, 753, 764, 760, 765, 764, 747, 421, 419, 436, 432, 2085, 2172, 2174, 2174, 2085, 2175, 2174, 2156, 2087, 2098, 797, 795, 780, 794, 428, 503, 508, 430, 496, 489, 480, 483, 483, 437, 486, 481, 511, 430, 2873, 2877, 2871, 1754, 1728, 1751, 1748, 2006, 2180, 2264, 2254, 2250, 2265, 2248, 2243, 2196, 2266, 2198, 2407, 2410, 2421, 2349, 2414, 2410, 2396, 2413, 2406, 2396, 2408, 2407, 2339, 2365, 2339, 2422, 2415, 2339, 2365, 2339, 2415, 2410, 3286, 3291, 3267, 633, 632, 617, 2736, 2804, 2807, 2810, 2807, 1676, 1685, 1694, 1701, 1672, 1695, 1687, 1691, 1672, 1681, 1673, 373, 305, 306, 319, 306, 379, 296, 299, 314, 309, 1061, 1084, 1150, 1085, 1087, 1062, 1081, 1077, 1076, 1060, 1077, 1073, 1081, 1084, 1039, 1084, 1081, 1059, 1060, 1136, 1084, 1081, 1136, 1059, 1056, 1073, 1086, 977, 968, 963, 1016, 974, 963, 601, 576, 587, 624, 577, 590, 578, 586, 1755, 1730, 1737, 1778, 1757, 1732, 1742, 1274, 1279, 1253, 1250, 1330, 1324, 1323, 1313, 1322, 1330, 1387, 1321, 1322, 1318, 1316, 1329, 1324, 1322, 1323, 1387, 1325, 1335, 1312, 1315, 2087, 2704, 2694, 2711, 2766, 2688, 2700, 2700, 2696, 2698, 2694, 26530, 23515, -27649, -32078, 1413, 1493, 1474, 1487, 1494, 1478, 1438, 3139, 3086, 3143, 3141, 3156, 3195, 3196, 3080, 3197, 3195, 3196, 3074, 3197, 3080, 3195, 3198, 3079, 3074, 3197, 3083, 3081, 2826, 2827, 2842, 3288, 3272, 3289, 3266, 3291, 3295, 1291, 1282, 1291, 1282, 1361, 1361, 1369, 3042, 3029, 3032, 3009, 3025, 2958, 2964, 24649, 23554, -31503, -31898, 17808, 27664, -32532, 22785, 2152, 2150, 2170, 2110, 2136, 2084, 2081, 2142, 2091, 2136, 2141, 2084, 2081, 2142, 2088, 2090, 2136, 2084, 2081, 2142, 659, 644, 649, 656, 640, 728, 702, 706, 711, 696, 717, 702, 699, 706, 711, 696, 718, 716, 702, 706, 711, 696, 3001, 2991, 2988, 3002, 3005, 1916, 1912, 1903, 1904, 1806, 1793, 1913, 1840, 1830, 1829, 1843, 1844, 1903, 1914, 1806, 1846, 1913, 1915, 1904, 1916, 1912, 3010, 3017, 3017, 3039, 3035, 3016, 3033, 3026, 755, 686, 696, 699, 685, 682, 753, 2798, 2784, 2812, 2802, 2794, 2807, 2785, 2806};

    /* renamed from: q */
    private static final Pattern f55q = Pattern.compile(C0175.m834(f818short, 0, 100, 1483));

    /* renamed from: xC */
    private static final Pattern f59xC = Pattern.compile(C0166.m801(f818short, 100, 23, 490));

    /* renamed from: QU */
    private static final Pattern f50QU = Pattern.compile(C0175.m834(f818short, 123, 30, 726));

    /* renamed from: UJ */
    private static final Pattern f52UJ = Pattern.compile(C0178.m845(f818short, 153, 29, 3193));

    /* renamed from: u */
    private static final Pattern f57u = Pattern.compile(C0166.m801(f818short, 182, 17, 1949));

    /* renamed from: Mo */
    private static final Pattern f49Mo = Pattern.compile(C0180.m851(f818short, 199, 11, 1685));

    /* renamed from: i */
    private static final Pattern f54i = Pattern.compile(C0176.m836(f818short, 210, 18, 2220));

    /* renamed from: MH */
    private static final Pattern f48MH = Pattern.compile(C0181.m856(f818short, 228, 27, 3044));

    /* renamed from: se */
    private static final Pattern f56se = Pattern.compile(C0180.m851(f818short, 255, 28, 1562));

    /* renamed from: W */
    private static final Pattern f53W = Pattern.compile(C0172.m820(f818short, 283, 25, 2219));

    /* renamed from: FN */
    private static final Pattern f46FN = Pattern.compile(C0170.m814(f818short, 308, 26, 1996));

    /* renamed from: B */
    private static final Pattern f44B = Pattern.compile(C0179.m849(f818short, 334, 27, 2777));

    /* renamed from: w8 */
    private static final Pattern f58w8 = Pattern.compile(C0168.m805(f818short, 361, 26, 1082));

    /* renamed from: F */
    public static String f45F = "";

    /* renamed from: RH */
    private static final Pattern f51RH = Pattern.compile(C0166.m801(f818short, 387, 20, 1712));

    /* renamed from: KT */
    private static final Pattern f47KT = Pattern.compile(C0170.m814(f818short, 407, 22, 2294));

    public Czsapp() {
        int iM853 = C0180.m853();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = iM853 <= 0 ? 1709 : 1678;
                case 204:
                    System.out.println(Long.parseLong(C0166.m803("jHp6FxaotHRO4WwBm2JB8XuW")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0042. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0025. Please report as an issue. */
    /* renamed from: QU */
    private String m30QU(String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(C0180.m851(f818short, 429, 3, 1401));
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            int length = bArrDigest.length;
            int i = 0;
            while (true) {
                int i2 = 1616;
                while (true) {
                    i2 ^= 1633;
                    switch (i2) {
                        case 14:
                        case 49:
                            i2 = i < length ? 1709 : 1678;
                        case 204:
                            String hexString = Integer.toHexString(bArrDigest[i] & 255);
                            while (true) {
                                int length2 = hexString.length();
                                int i3 = 1740;
                                while (true) {
                                    i3 ^= 1757;
                                    switch (i3) {
                                        case 17:
                                            i3 = length2 < 2 ? 1833 : 1802;
                                        case 54:
                                        case 471:
                                            break;
                                        case 500:
                                            hexString = C0168.m805(f818short, 432, 1, 397) + hexString;
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
                                    sb.append(hexString);
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
                                }
                            }
                            break;
                        case 239:
                            break;
                    }
                    return sb.toString();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x00cf. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0008. Please report as an issue. */
    public static String escapeExprSpecialWord(String str) {
        boolean zIsEmpty = str.isEmpty();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = !zIsEmpty ? 1709 : 1678;
                case 204:
                    int i2 = 0;
                    String strM841 = C0177.m841(f818short, 433, 1, 892);
                    String strM856 = C0181.m856(f818short, 434, 1, 2405);
                    String strM866 = C0183.m866(f818short, 435, 1, 3146);
                    String strM816 = C0171.m816(f818short, 436, 1, 454);
                    String strM834 = C0175.m834(f818short, 437, 1, 1721);
                    String strM814 = C0170.m814(f818short, 438, 1, 2592);
                    String strM809 = C0169.m809(f818short, 439, 1, 2658);
                    String strM861 = C0182.m861(f818short, 440, 1, 1685);
                    String strM828 = C0174.m828(f818short, 441, 1, 2766);
                    String strM845 = C0178.m845(f818short, 442, 1, 3179);
                    String strM798 = C0165.m798(f818short, 443, 1, 1091);
                    String strM851 = C0180.m851(f818short, 444, 1, 1836);
                    String strM8612 = C0182.m861(f818short, 445, 1, 3189);
                    String strM8342 = C0175.m834(f818short, 446, 1, 1595);
                    while (true) {
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = i2 < 14 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    break;
                                case 500:
                                    String str2 = new String[]{strM841, strM856, strM866, strM816, strM834, strM814, strM809, strM861, strM828, strM845, strM798, strM851, strM8612, strM8342}[i2];
                                    boolean zContains = str.contains(str2);
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                i4 = zContains ? 48736 : 48705;
                                            case 47384:
                                                break;
                                            case 47417:
                                                str = str.replace(str2, strM841 + str2);
                                                break;
                                            case 47483:
                                        }
                                    }
                                    i2++;
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
                            }
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

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x006e. Please report as an issue. */
    /* renamed from: q */
    private HashMap<String, String> m31q() {
        HashMap<String, String> map = new HashMap<>();
        map.put(C0175.m834(f818short, 447, 10, 431), C0175.m834(f818short, 457, 137, 1624));
        map.put(C0178.m845(f818short, 594, 7, 2597), this.f60k);
        map.put(C0175.m834(f818short, 601, 15, 2973), C0170.m814(f818short, 616, 14, 1974));
        map.put(C0174.m828(f818short, 630, 16, 1341), C0182.m861(f818short, 646, 14, 2999));
        int length = f45F.length();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = length > 0 ? 1709 : 1678;
                case 204:
                    map.put(C0180.m851(f818short, 660, 6, 2192), f45F);
                    break;
                case 239:
                    break;
            }
        }
        return map;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000b. Please report as an issue. */
    public static String stringtoHex(String str) {
        String str2 = "";
        int i = 0;
        while (true) {
            int length = str.length();
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                    case 49:
                        i2 = i <= length + (-1) ? 1709 : 1678;
                    case 204:
                        str2 = str2 + (Integer.valueOf(str.charAt(i)).intValue() + 1);
                        i++;
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = 1771;
                                    break;
                                case 54:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        break;
                }
                return str2;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0105. Please report as an issue. */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException, NumberFormatException {
        C0082OO c0082ooM440q;
        int i;
        int length;
        String strM809 = C0169.m809(f818short, 666, 3, 1335);
        String strM8092 = C0169.m809(f818short, 669, 4, 2845);
        try {
            JSONObject jSONObject = new JSONObject();
            boolean zEquals = str2.equals(C0166.m801(f818short, 673, 1, 2673));
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                    case 49:
                        i2 = zEquals ? 1709 : 1678;
                    case 204:
                        C0082OO c0082ooM440q2 = C0093Tt.m440q(m32xC(this.f60k + str));
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = 1771;
                                    break;
                                case 54:
                                    c0082ooM440q = c0082ooM440q2;
                                    break;
                            }
                        }
                        break;
                    case 239:
                        c0082ooM440q = C0093Tt.m440q(m32xC(this.f60k + str + C0176.m836(f818short, 674, 6, 578) + str2));
                        break;
                }
            }
            int i4 = Integer.parseInt(str2);
            int i5 = Integer.parseInt(str2);
            Matcher matcher = f49Mo.matcher(c0082ooM440q.m654b(C0183.m866(f818short, 680, 26, 2416)).m593QU().mo126QU(strM8092));
            boolean zFind = matcher.find();
            int i6 = 1864;
            while (true) {
                i6 ^= 1881;
                switch (i6) {
                    case 17:
                        i6 = zFind ? 48736 : 48705;
                    case 47384:
                        i = i5;
                        break;
                    case 47417:
                        i = Integer.parseInt(matcher.group(1));
                        break;
                    case 47483:
                }
            }
            C0116dX c0116dXM654b = c0082ooM440q.m654b(C0171.m816(f818short, 706, 22, 1990));
            JSONArray jSONArray = new JSONArray();
            Iterator<C0127lK> it = c0116dXM654b.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                int i7 = 48767;
                while (true) {
                    i7 ^= 48784;
                    switch (i7) {
                        case 14:
                        case 45:
                            break;
                        case 76:
                            C0127lK next = it.next();
                            Matcher matcher2 = f57u.matcher(next.m654b(C0170.m814(f818short, 728, 1, 2793)).m595q(strM8092));
                            boolean zFind2 = matcher2.find();
                            int i8 = 48891;
                            while (true) {
                                i8 ^= 48908;
                                switch (i8) {
                                    case 22:
                                    case 53:
                                        break;
                                    case 503:
                                        i8 = zFind2 ? 49635 : 48953;
                                    case 32495:
                                        String strGroup = matcher2.group(1);
                                        String strTrim = next.m654b(strM809).m595q(C0170.m814(f818short, 729, 3, 1704)).trim();
                                        String strTrim2 = next.m654b(strM809).m595q(C0183.m866(f818short, 732, 13, 984)).trim();
                                        String strTrim3 = next.m654b(C0177.m841(f818short, 745, 17, 585)).m596u().trim();
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put(C0169.m809(f818short, 762, 6, 2353), strGroup);
                                        jSONObject2.put(C0181.m856(f818short, 768, 8, 922), strTrim);
                                        jSONObject2.put(C0176.m836(f818short, 776, 7, 2311), strTrim2);
                                        jSONObject2.put(C0170.m814(f818short, 783, 11, 2353), strTrim3);
                                        jSONArray.put(jSONObject2);
                                        int i9 = 49666;
                                        while (true) {
                                            i9 ^= 49683;
                                            switch (i9) {
                                                case 17:
                                                    i9 = 49697;
                                                case 50:
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                            break;
                        case 239:
                            i7 = zHasNext ? 48860 : 48829;
                    }
                    jSONObject.put(C0182.m861(f818short, 794, 4, 635), jSONArray);
                    jSONObject.put(C0177.m841(f818short, 798, 4, 672), i4);
                    jSONObject.put(C0169.m809(f818short, 802, 9, 734), i);
                    jSONObject.put(C0172.m820(f818short, 811, 5, 2887), 24);
                    String strM801 = C0166.m801(f818short, 816, 5, 785);
                    int i10 = 49790;
                    while (true) {
                        i10 ^= 49807;
                        switch (i10) {
                            case 18:
                                break;
                            case 51:
                                length = i * 24;
                                break;
                            case 84:
                                length = jSONArray.length();
                                int i11 = 49914;
                                while (true) {
                                    i11 ^= 49931;
                                    switch (i11) {
                                        case 497:
                                            i11 = 50596;
                                            break;
                                        case 1711:
                                            break;
                                    }
                                }
                                break;
                            case 241:
                                if (i > 1) {
                                    break;
                                } else {
                                    i10 = 49883;
                                }
                            default:
                                continue;
                        }
                        i10 = 49852;
                    }
                    jSONObject.put(strM801, length);
                    return jSONObject.toString();
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:110:0x03a2. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:124:0x0414. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x016d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:60:0x01ad. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:73:0x01ee. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    public String detailContent(List<String> list) throws JSONException {
        String str;
        String str2;
        try {
            Init.m46lj();
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            C0082OO c0082ooM440q = C0093Tt.m440q(m32xC(this.f60k + C0165.m798(f818short, 821, 7, 1102) + list.get(0) + C0171.m816(f818short, 828, 5, 786)));
            String strTrim = c0082ooM440q.m654b(C0182.m861(f818short, 833, 23, 1042)).m596u().trim();
            String strM595q = c0082ooM440q.m654b(C0175.m834(f818short, 856, 15, 2877)).m595q(C0180.m851(f818short, 871, 3, 1127));
            Iterator<C0127lK> it = c0082ooM440q.m654b(C0165.m798(f818short, 874, 24, 857)).iterator();
            String str3 = "";
            String str4 = "";
            String str5 = "";
            String str6 = "";
            String str7 = "";
            ?? r10 = "";
            while (true) {
                boolean zHasNext = it.hasNext();
                int i = 1616;
                while (true) {
                    i ^= 1633;
                    switch (i) {
                        case 14:
                        case 49:
                            i = zHasNext ? 1709 : 1678;
                        case 204:
                            String strTrim2 = it.next().m653a().trim();
                            int length = strTrim2.length();
                            int i2 = 1740;
                            while (true) {
                                i2 ^= 1757;
                                switch (i2) {
                                    case 17:
                                        i2 = length >= 4 ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case 500:
                                        try {
                                            String strSubstring = strTrim2.substring(0, 2);
                                            String strSubstring2 = strTrim2.substring(3);
                                            boolean zEquals = strSubstring.equals(C0176.m836(f818short, 898, 2, 570));
                                            int i3 = 1864;
                                            while (true) {
                                                i3 ^= 1881;
                                                switch (i3) {
                                                    case 17:
                                                        i3 = zEquals ? 48736 : 48705;
                                                    case 47384:
                                                        boolean zEquals2 = strSubstring.equals(C0177.m841(f818short, 900, 2, 2814));
                                                        int i4 = 48891;
                                                        while (true) {
                                                            i4 ^= 48908;
                                                            switch (i4) {
                                                                case 22:
                                                                case 53:
                                                                    boolean zEquals3 = strSubstring.equals(C0180.m851(f818short, 902, 2, 1208));
                                                                    int i5 = 49790;
                                                                    while (true) {
                                                                        i5 ^= 49807;
                                                                        switch (i5) {
                                                                            case 18:
                                                                            case 51:
                                                                                boolean zEquals4 = strSubstring.equals(C0175.m834(f818short, 904, 2, 2778));
                                                                                int i6 = 50689;
                                                                                while (true) {
                                                                                    i6 ^= 50706;
                                                                                    switch (i6) {
                                                                                        case 19:
                                                                                            i6 = zEquals4 ? 50782 : 50751;
                                                                                        case 45:
                                                                                            boolean zEquals5 = strSubstring.equals(C0174.m828(f818short, 906, 2, 2964));
                                                                                            int i7 = 51588;
                                                                                            while (true) {
                                                                                                i7 ^= 51605;
                                                                                                switch (i7) {
                                                                                                    case 17:
                                                                                                        i7 = zEquals5 ? 51681 : 51650;
                                                                                                    case 54:
                                                                                                    case 87:
                                                                                                        boolean zEquals6 = strSubstring.equals(C0171.m816(f818short, 908, 2, 2972));
                                                                                                        int i8 = 51836;
                                                                                                        while (true) {
                                                                                                            i8 ^= 51853;
                                                                                                            switch (i8) {
                                                                                                                case 241:
                                                                                                                    i8 = zEquals6 ? 52580 : 52549;
                                                                                                                case 1963:
                                                                                                                case 1992:
                                                                                                                    break;
                                                                                                                case 2025:
                                                                                                                    int i9 = 52611;
                                                                                                                    while (true) {
                                                                                                                        i9 ^= 52628;
                                                                                                                        switch (i9) {
                                                                                                                            case 23:
                                                                                                                                i9 = 52642;
                                                                                                                            case 54:
                                                                                                                                str = str5;
                                                                                                                                str7 = strSubstring2;
                                                                                                                                str2 = r10;
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    case 116:
                                                                                                        int i10 = 51712;
                                                                                                        while (true) {
                                                                                                            i10 ^= 51729;
                                                                                                            switch (i10) {
                                                                                                                case 14:
                                                                                                                    str = str5;
                                                                                                                    str6 = strSubstring2;
                                                                                                                    str2 = r10;
                                                                                                                    break;
                                                                                                                case 17:
                                                                                                                    i10 = 51743;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 50:
                                                                                        case 76:
                                                                                            int i11 = 50813;
                                                                                            while (true) {
                                                                                                i11 ^= 50830;
                                                                                                switch (i11) {
                                                                                                    case 18:
                                                                                                        break;
                                                                                                    case 243:
                                                                                                        i11 = 50844;
                                                                                                }
                                                                                                str = strSubstring2;
                                                                                                str2 = r10;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 84:
                                                                                int i12 = 49914;
                                                                                while (true) {
                                                                                    i12 ^= 49931;
                                                                                    switch (i12) {
                                                                                        case 497:
                                                                                            i12 = 50596;
                                                                                        case 1711:
                                                                                            break;
                                                                                    }
                                                                                    str = str5;
                                                                                    str3 = strSubstring2;
                                                                                    str2 = r10;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 241:
                                                                                i5 = zEquals3 ? 49883 : 49852;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 503:
                                                                    i4 = zEquals2 ? 49635 : 48953;
                                                                case 32495:
                                                                    int i13 = 49666;
                                                                    while (true) {
                                                                        i13 ^= 49683;
                                                                        switch (i13) {
                                                                            case 17:
                                                                                i13 = 49697;
                                                                            case 50:
                                                                                break;
                                                                        }
                                                                        str = str5;
                                                                        str4 = strSubstring2;
                                                                        str2 = r10;
                                                                        break;
                                                                    }
                                                            }
                                                        }
                                                        break;
                                                    case 47417:
                                                        int i14 = 48767;
                                                        while (true) {
                                                            r10 = 48784;
                                                            i14 ^= 48784;
                                                            switch (i14) {
                                                                case 14:
                                                                    str = str5;
                                                                    str2 = strSubstring2;
                                                                    break;
                                                                case 239:
                                                                    i14 = 48798;
                                                            }
                                                        }
                                                        break;
                                                    case 47483:
                                                }
                                            }
                                        } catch (Exception e) {
                                            SpiderDebug.log(e);
                                            str = str5;
                                            str2 = r10;
                                            break;
                                        }
                                        break;
                                }
                            }
                            str = str5;
                            str2 = r10;
                            int i15 = 52735;
                            while (true) {
                                i15 ^= 52752;
                                switch (i15) {
                                    case 14:
                                        break;
                                    case 1007:
                                        i15 = 52766;
                                        break;
                                }
                            }
                            str5 = str;
                            r10 = str2;
                            break;
                        case 239:
                            jSONObject2.put(C0177.m841(f818short, 910, 6, 1214), list.get(0));
                            jSONObject2.put(C0178.m845(f818short, 916, 8, 984), strTrim);
                            jSONObject2.put(C0168.m805(f818short, 924, 7, 1877), strM595q);
                            jSONObject2.put(C0183.m866(f818short, 931, 9, 2146), (Object) r10);
                            jSONObject2.put(C0166.m801(f818short, 940, 8, 2884), str3);
                            jSONObject2.put(C0183.m866(f818short, 948, 8, 1033), str4);
                            jSONObject2.put(C0181.m856(f818short, 956, 11, 3263), str7);
                            jSONObject2.put(C0170.m814(f818short, 967, 9, 3254), str6);
                            jSONObject2.put(C0175.m834(f818short, 976, 12, 1034), str5);
                            jSONObject2.put(C0174.m828(f818short, 988, 11, 2676), C0172.m820(f818short, 999, 16, 1568) + c0082ooM440q.m654b(C0179.m849(f818short, 1015, 14, 1129)).m596u().trim());
                            jSONObject2.put(C0182.m861(f818short, 1029, 13, 2430), C0170.m814(f818short, 1042, 4, 1423));
                            ArrayList arrayList = new ArrayList();
                            Iterator<C0127lK> it2 = c0082ooM440q.m654b(C0172.m820(f818short, 1046, 21, 799)).iterator();
                            while (true) {
                                boolean zHasNext2 = it2.hasNext();
                                int i16 = 53510;
                                while (true) {
                                    i16 ^= 53527;
                                    switch (i16) {
                                        case 17:
                                            i16 = zHasNext2 ? 53603 : 53572;
                                        case 50:
                                        case 83:
                                            break;
                                        case 116:
                                            C0127lK next = it2.next();
                                            Matcher matcher = f54i.matcher(next.mo126QU(C0172.m820(f818short, 1067, 4, 1215)));
                                            boolean zFind = matcher.find();
                                            int i17 = 53634;
                                            while (true) {
                                                i17 ^= 53651;
                                                switch (i17) {
                                                    case 17:
                                                        i17 = zFind ? 53727 : 53696;
                                                    case 50:
                                                    case 76:
                                                        arrayList.add(next.m653a() + C0177.m841(f818short, 1071, 1, 523) + matcher.group(1));
                                                        int i18 = 53758;
                                                        while (true) {
                                                            i18 ^= 53775;
                                                            switch (i18) {
                                                                case 1009:
                                                                    i18 = 54440;
                                                                case 1703:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 83:
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                    jSONObject2.put(C0180.m851(f818short, 1072, 12, 3058), TextUtils.join(C0165.m798(f818short, 1084, 1, 2949), arrayList));
                                    jSONArray.put(jSONObject2);
                                    jSONObject.put(C0171.m816(f818short, 1085, 4, 3259), jSONArray);
                                    return jSONObject.toString();
                                }
                            }
                    }
                }
            }
        } catch (Exception e2) {
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x00ab. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x00ec. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x0126. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:53:0x0201. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x004c. Please report as an issue. */
    public String homeContent(boolean z) throws JSONException {
        String strM849 = C0179.m849(f818short, 1089, 3, 3171);
        try {
            JSONObject jSONObject = new JSONObject();
            C0082OO c0082ooM440q = C0093Tt.m440q(m32xC(this.f60k));
            System.out.println(c0082ooM440q);
            C0116dX c0116dXM654b = c0082ooM440q.m654b(C0165.m798(f818short, 1092, 17, 1705));
            JSONArray jSONArray = new JSONArray();
            Iterator<C0127lK> it = c0116dXM654b.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                String strM801 = C0166.m801(f818short, 1109, 4, 3032);
                int i = 1616;
                while (true) {
                    i ^= 1633;
                    switch (i) {
                        case 14:
                        case 49:
                            i = zHasNext ? 1709 : 1678;
                        case 204:
                            C0127lK next = it.next();
                            String strMo126QU = next.mo126QU(strM801);
                            int length = strMo126QU.length();
                            int i2 = 1740;
                            while (true) {
                                i2 ^= 1757;
                                switch (i2) {
                                    case 17:
                                        i2 = length > 1 ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case 500:
                                        String strSubstring = strMo126QU.substring(1);
                                        String strTrim = next.m653a().trim();
                                        boolean zContains = strTrim.contains(C0180.m851(f818short, 1113, 2, 3022));
                                        int i3 = 1864;
                                        while (true) {
                                            i3 ^= 1881;
                                            switch (i3) {
                                                case 17:
                                                    i3 = zContains ? 48736 : 48705;
                                                case 47384:
                                                    JSONObject jSONObject2 = new JSONObject();
                                                    jSONObject2.put(C0175.m834(f818short, 1115, 7, 3051), strSubstring.replace(this.f60k.substring(1), ""));
                                                    jSONObject2.put(C0165.m798(f818short, 1122, 9, 2391), strTrim);
                                                    jSONArray.put(jSONObject2);
                                                    int i4 = 48891;
                                                    while (true) {
                                                        i4 ^= 48908;
                                                        switch (i4) {
                                                            case 22:
                                                                break;
                                                            case 503:
                                                                i4 = 48922;
                                                        }
                                                    }
                                                    break;
                                                case 47417:
                                                    int i5 = 48767;
                                                    while (true) {
                                                        i5 ^= 48784;
                                                        switch (i5) {
                                                            case 14:
                                                                break;
                                                            case 239:
                                                                i5 = 48798;
                                                        }
                                                    }
                                                    break;
                                                case 47483:
                                            }
                                        }
                                        break;
                                }
                            }
                            break;
                        case 239:
                            break;
                    }
                    jSONObject.put(C0181.m856(f818short, 1131, 5, 861), jSONArray);
                    C0116dX c0116dXM654b2 = c0082ooM440q.m654b(C0168.m805(f818short, 1136, 22, 340));
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator<C0127lK> it2 = c0116dXM654b2.iterator();
                    while (true) {
                        boolean zHasNext2 = it2.hasNext();
                        int i6 = 49666;
                        while (true) {
                            i6 ^= 49683;
                            switch (i6) {
                                case 17:
                                    i6 = zHasNext2 ? 49759 : 49728;
                                case 50:
                                case 76:
                                    C0127lK next2 = it2.next();
                                    Matcher matcher = f57u.matcher(next2.m654b(C0174.m828(f818short, 1158, 1, 3263)).m595q(strM801));
                                    boolean zFind = matcher.find();
                                    int i7 = 49790;
                                    while (true) {
                                        i7 ^= 49807;
                                        switch (i7) {
                                            case 18:
                                            case 51:
                                                break;
                                            case 84:
                                                String strGroup = matcher.group(1);
                                                String strTrim2 = next2.m654b(strM849).m595q(C0178.m845(f818short, 1159, 3, 2831)).trim();
                                                String strTrim3 = next2.m654b(strM849).m595q(C0176.m836(f818short, 1162, 13, 2054)).trim();
                                                String strTrim4 = next2.m654b(C0165.m798(f818short, 1175, 17, 2913)).m596u().trim();
                                                JSONObject jSONObject3 = new JSONObject();
                                                jSONObject3.put(C0182.m861(f818short, 1192, 6, 2399), strGroup);
                                                jSONObject3.put(C0174.m828(f818short, 1198, 8, 1725), strTrim2);
                                                jSONObject3.put(C0176.m836(f818short, 1206, 7, 2171), strTrim3);
                                                jSONObject3.put(C0169.m809(f818short, 1213, 11, 2348), strTrim4);
                                                jSONArray2.put(jSONObject3);
                                                int i8 = 49914;
                                                while (true) {
                                                    i8 ^= 49931;
                                                    switch (i8) {
                                                        case 497:
                                                            i8 = 50596;
                                                        case 1711:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 241:
                                                i7 = zFind ? 49883 : 49852;
                                        }
                                    }
                                    break;
                                case 83:
                                    break;
                            }
                            jSONObject.put(C0183.m866(f818short, 1224, 4, 1796), jSONArray2);
                            return jSONObject.toString();
                        }
                    }
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context, str);
        this.f60k = C0152vp.m724Mo(str);
        int iM864 = C0183.m864();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = iM864 <= 0 ? 1709 : 1678;
                case 204:
                    System.out.println(Integer.valueOf(C0182.m862("efQtDAA8xueJfnyO86")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0104. Please report as an issue. */
    public Object[] loadsub(String str) throws IOException {
        int i;
        String strM845 = C0178.m845(f818short, 1228, 2, 1844);
        try {
            AbstractC0099V3.p pVar = new AbstractC0099V3.p(this) { // from class: com.github.catvod.spider.Czsapp.1

                /* renamed from: xC */
                final Czsapp f61xC;

                {
                    this.f61xC = this;
                    int iM844 = C0178.m844();
                    int i2 = 1616;
                    while (true) {
                        i2 ^= 1633;
                        switch (i2) {
                            case 14:
                            case 49:
                                i2 = iM844 >= 0 ? 1709 : 1678;
                            case 204:
                                System.out.println(Float.parseFloat(C0168.m808("95nQZNj")));
                                break;
                            case 239:
                                break;
                        }
                        return;
                    }
                }

                @Override // com.github.catvod.spider.merge.AbstractC0099V3
                protected void onFailure(Call call, Exception exc) {
                    int iM857 = C0181.m857();
                    int i2 = 1616;
                    while (true) {
                        i2 ^= 1633;
                        switch (i2) {
                            case 14:
                            case 49:
                                i2 = iM857 <= 0 ? 1709 : 1678;
                            case 204:
                                System.out.println(Long.decode(C0172.m823("VUXoXXrAXRuB8DC0dbKg2c0")));
                                break;
                            case 239:
                                break;
                        }
                        return;
                    }
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.github.catvod.spider.merge.AbstractC0099V3
                public String onResponse(Response response) {
                    return null;
                }
            };
            C0106ZJ.m490UJ(C0106ZJ.m488QU(), str, null, m31q(), pVar);
            Response result = pVar.getResult();
            int iCode = result.code();
            String strM836 = C0176.m836(f818short, 1230, 24, 1159);
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                    case 49:
                        i2 = iCode == 404 ? 1709 : 1678;
                    case 204:
                        return new Object[]{200, strM836, new ByteArrayInputStream(C0168.m805(f818short, 1254, 6, 2355).getBytes())};
                    case 239:
                        byte[] bArrBytes = result.body().bytes();
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrBytes, 0, 16);
                        BufferedReader bufferedReader = new BufferedReader(new StringReader(C0117f4.m598q(C0147tG.m713q(Arrays.copyOfRange(bArrBytes, 16, bArrBytes.length), bArrCopyOfRange, bArrCopyOfRange)).replaceAll(C0179.m849(f818short, 1260, 52, 1939), strM845).replaceAll(C0165.m798(f818short, 1312, 50, 3065), C0166.m801(f818short, 1362, 12, 2692)).replaceAll(C0180.m851(f818short, 1374, 20, 2316), strM845).replaceAll(C0179.m849(f818short, 1394, 6, 2979), "").replaceAll(C0171.m816(f818short, 1400, 8, 2863), "")));
                        ArrayList arrayList = new ArrayList();
                        int i3 = 1;
                        String line = bufferedReader.readLine();
                        while (true) {
                            int i4 = 1740;
                            while (true) {
                                i4 ^= 1757;
                                switch (i4) {
                                    case 17:
                                        i4 = line != null ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case 500:
                                        boolean zMatches = line.matches(C0176.m836(f818short, 1408, 48, 3008));
                                        int i5 = 1864;
                                        while (true) {
                                            i5 ^= 1881;
                                            switch (i5) {
                                                case 17:
                                                    i5 = zMatches ? 48736 : 48705;
                                                case 47384:
                                                    break;
                                                case 47417:
                                                    boolean zIsEmpty = ((String) arrayList.get(arrayList.size() - 1)).trim().isEmpty();
                                                    int i6 = 48767;
                                                    while (true) {
                                                        i6 ^= 48784;
                                                        switch (i6) {
                                                            case 14:
                                                            case 45:
                                                                break;
                                                            case 76:
                                                                arrayList.add(i3 + "");
                                                                i = i3 + 1;
                                                                break;
                                                            case 239:
                                                                i6 = zIsEmpty ? 48860 : 48829;
                                                        }
                                                    }
                                                    break;
                                                case 47483:
                                            }
                                        }
                                        i = i3;
                                        arrayList.add(line);
                                        line = bufferedReader.readLine();
                                        int i7 = 48891;
                                        while (true) {
                                            i7 ^= 48908;
                                            switch (i7) {
                                                case 22:
                                                    break;
                                                case 503:
                                                    i7 = 48922;
                                                    break;
                                            }
                                        }
                                        i3 = i;
                                        break;
                                }
                                return new Object[]{200, strM836, new ByteArrayInputStream(TextUtils.join(C0179.m849(f818short, 1456, 1, 2942), arrayList).getBytes())};
                            }
                        }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log(e);
            return null;
        }
    }

    public String playerContent(String str, String str2, List<String> list) throws JSONException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        String strGroup;
        String str3;
        try {
            String strM32xC = m32xC(this.f60k + C0175.m834(f818short, 1457, 8, 3124) + str2 + C0171.m816(f818short, 1465, 5, 830));
            C0082OO c0082ooM440q = C0093Tt.m440q(strM32xC);
            Matcher matcher = f55q.matcher(strM32xC);
            boolean zFind = matcher.find();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = zFind ? 1709 : 1678;
                    case 204:
                        String strM723MH = C0152vp.m723MH(matcher.group(1), matcher.group(2), matcher.group(3));
                        Matcher matcher2 = f59xC.matcher(strM723MH);
                        boolean zFind2 = matcher2.find();
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = zFind2 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    strGroup = "";
                                    break;
                                case 500:
                                    strGroup = matcher2.group(1);
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
                        Matcher matcher3 = f50QU.matcher(strM723MH);
                        boolean zFind3 = matcher3.find();
                        int i4 = 48767;
                        while (true) {
                            i4 ^= 48784;
                            switch (i4) {
                                case 14:
                                case 45:
                                    int i5 = 49666;
                                    while (true) {
                                        i5 ^= 49683;
                                        switch (i5) {
                                            case 17:
                                                i5 = 49697;
                                                continue;
                                            case 50:
                                                str3 = "";
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                                case 76:
                                    String strGroup2 = matcher3.group(1);
                                    int i6 = 48891;
                                    while (true) {
                                        i6 ^= 48908;
                                        switch (i6) {
                                            case 22:
                                                str3 = strGroup2;
                                                break;
                                            case 503:
                                                i6 = 48922;
                                                continue;
                                            default:
                                                continue;
                                        }
                                    }
                                case 239:
                                    i4 = zFind3 ? 48860 : 48829;
                            }
                        }
                        break;
                    case 239:
                        strGroup = "";
                        str3 = "";
                        break;
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(strGroup);
            String strM849 = C0179.m849(f818short, 1470, 3, 2019);
            int i7 = 49790;
            while (true) {
                i7 ^= 49807;
                switch (i7) {
                    case 18:
                    case 51:
                        break;
                    case 84:
                        C0116dX c0116dXM654b = c0082ooM440q.m654b(C0179.m849(f818short, 1473, 14, 3190));
                        int i8 = 49914;
                        while (true) {
                            i8 ^= 49931;
                            switch (i8) {
                                case 497:
                                    i8 = c0116dXM654b != null ? 50658 : 50627;
                                case 1711:
                                case 1736:
                                    break;
                                case 1769:
                                    String strM595q = c0116dXM654b.m595q(C0168.m805(f818short, 1487, 3, 1515));
                                    boolean zContains = strM595q.contains(C0177.m841(f818short, 1490, 12, 1471));
                                    int i9 = 50689;
                                    while (true) {
                                        i9 ^= 50706;
                                        switch (i9) {
                                            case 19:
                                                i9 = zContains ? 50782 : 50751;
                                            case 45:
                                                Matcher matcher4 = f52UJ.matcher(C0106ZJ.m484FN(strM595q, m31q()));
                                                boolean zFind4 = matcher4.find();
                                                int i10 = 53758;
                                                while (true) {
                                                    i10 ^= 53775;
                                                    switch (i10) {
                                                        case 1009:
                                                            i10 = zFind4 ? 54502 : 54471;
                                                        case 1703:
                                                        case 1736:
                                                            break;
                                                        case 1769:
                                                            strGroup = matcher4.group(1);
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 50:
                                            case 76:
                                                String strM484FN = C0106ZJ.m484FN(strM595q, m31q());
                                                Pattern pattern = f44B;
                                                Matcher matcher5 = pattern.matcher(strM484FN);
                                                boolean zFind5 = matcher5.find();
                                                int i11 = 50813;
                                                while (true) {
                                                    i11 ^= 50830;
                                                    switch (i11) {
                                                        case 18:
                                                        case 53:
                                                            String strGroup3 = matcher5.group(1);
                                                            Matcher matcher6 = f58w8.matcher(strM484FN);
                                                            boolean zFind6 = matcher6.find();
                                                            int i12 = 51588;
                                                            while (true) {
                                                                i12 ^= 51605;
                                                                switch (i12) {
                                                                    case 17:
                                                                        i12 = !zFind6 ? 51681 : 51650;
                                                                    case 54:
                                                                    case 87:
                                                                        String strGroup4 = matcher6.group(1);
                                                                        String strM484FN2 = C0106ZJ.m484FN(C0178.m845(f818short, 1502, 37, 2911) + strGroup3 + C0166.m801(f818short, 1539, 5, 1910) + strGroup4, m31q());
                                                                        Matcher matcher7 = f48MH.matcher(strM484FN2);
                                                                        boolean zFind7 = matcher7.find();
                                                                        int i13 = 51712;
                                                                        while (true) {
                                                                            i13 ^= 51729;
                                                                            switch (i13) {
                                                                                case 14:
                                                                                case 17:
                                                                                    i13 = !zFind7 ? 51805 : 51774;
                                                                                case 47:
                                                                                    String strGroup5 = matcher7.group(1);
                                                                                    Matcher matcher8 = f56se.matcher(strM484FN2);
                                                                                    boolean zFind8 = matcher8.find();
                                                                                    int i14 = 51836;
                                                                                    while (true) {
                                                                                        i14 ^= 51853;
                                                                                        switch (i14) {
                                                                                            case 241:
                                                                                                i14 = !zFind8 ? 52580 : 52549;
                                                                                            case 1963:
                                                                                            case 1992:
                                                                                                String strGroup6 = matcher8.group(1);
                                                                                                Matcher matcher9 = f53W.matcher(strM484FN2);
                                                                                                boolean zFind9 = matcher9.find();
                                                                                                int i15 = 52611;
                                                                                                while (true) {
                                                                                                    i15 ^= 52628;
                                                                                                    switch (i15) {
                                                                                                        case 23:
                                                                                                            i15 = !zFind9 ? 52704 : 52673;
                                                                                                        case 54:
                                                                                                        case 85:
                                                                                                            String strGroup7 = matcher9.group(1);
                                                                                                            Matcher matcher10 = f46FN.matcher(strM484FN2);
                                                                                                            boolean zFind10 = matcher10.find();
                                                                                                            int i16 = 52735;
                                                                                                            while (true) {
                                                                                                                i16 ^= 52752;
                                                                                                                switch (i16) {
                                                                                                                    case 14:
                                                                                                                    case 45:
                                                                                                                        String strGroup8 = matcher10.group(1);
                                                                                                                        Matcher matcher11 = pattern.matcher(strM484FN2);
                                                                                                                        boolean zFind11 = matcher11.find();
                                                                                                                        int i17 = 53510;
                                                                                                                        while (true) {
                                                                                                                            i17 ^= 53527;
                                                                                                                            switch (i17) {
                                                                                                                                case 17:
                                                                                                                                    i17 = !zFind11 ? 53603 : 53572;
                                                                                                                                case 50:
                                                                                                                                case 83:
                                                                                                                                    String strGroup9 = matcher11.group(1);
                                                                                                                                    byte[] bytes = m30QU(strGroup6).getBytes();
                                                                                                                                    byte[] bytes2 = C0181.m856(f818short, 1544, 16, 987).getBytes();
                                                                                                                                    Cipher cipher = Cipher.getInstance(C0178.m845(f818short, 1560, 17, 2646));
                                                                                                                                    cipher.init(1, new SecretKeySpec(bytes, C0178.m845(f818short, 1577, 3, 1810)), new IvParameterSpec(bytes2));
                                                                                                                                    String strEncodeToString = Base64.encodeToString(cipher.doFinal(strGroup6.getBytes()), 0);
                                                                                                                                    AbstractC0099V3.p pVar = new AbstractC0099V3.p(this) { // from class: com.github.catvod.spider.Czsapp.2

                                                                                                                                        /* renamed from: xC */
                                                                                                                                        final Czsapp f62xC;

                                                                                                                                        {
                                                                                                                                            this.f62xC = this;
                                                                                                                                            int iM825 = C0173.m825();
                                                                                                                                            int i18 = 1616;
                                                                                                                                            while (true) {
                                                                                                                                                i18 ^= 1633;
                                                                                                                                                switch (i18) {
                                                                                                                                                    case 14:
                                                                                                                                                    case 49:
                                                                                                                                                        i18 = iM825 <= 0 ? 1709 : 1678;
                                                                                                                                                    case 204:
                                                                                                                                                        System.out.println(Float.valueOf(C0183.m863("pY")));
                                                                                                                                                        break;
                                                                                                                                                    case 239:
                                                                                                                                                        break;
                                                                                                                                                }
                                                                                                                                                return;
                                                                                                                                            }
                                                                                                                                        }

                                                                                                                                        @Override // com.github.catvod.spider.merge.AbstractC0099V3
                                                                                                                                        protected void onFailure(Call call, Exception exc) {
                                                                                                                                        }

                                                                                                                                        @Override // com.github.catvod.spider.merge.AbstractC0099V3
                                                                                                                                        public String onResponse(Response response) {
                                                                                                                                            return null;
                                                                                                                                        }
                                                                                                                                    };
                                                                                                                                    HashMap map = new HashMap();
                                                                                                                                    map.put(strM849, strGroup4);
                                                                                                                                    map.put(C0178.m845(f818short, 1580, 4, 2320), strGroup9);
                                                                                                                                    map.put(C0165.m798(f818short, 1584, 2, 1087), strGroup7);
                                                                                                                                    map.put(C0174.m828(f818short, 1586, 3, 2559), strGroup8);
                                                                                                                                    map.put(C0174.m828(f818short, 1589, 4, 557), strGroup5);
                                                                                                                                    map.put(C0165.m798(f818short, 1593, 5, 984), strEncodeToString);
                                                                                                                                    C0106ZJ.m492i(C0106ZJ.m488QU(), C0179.m849(f818short, 1598, 32, 2515), map, m31q(), pVar);
                                                                                                                                    strGroup = new JSONObject(pVar.getResult().body().string()).optString(strM849);
                                                                                                                                    int i18 = 53634;
                                                                                                                                    while (true) {
                                                                                                                                        i18 ^= 53651;
                                                                                                                                        switch (i18) {
                                                                                                                                            case 17:
                                                                                                                                                i18 = 53665;
                                                                                                                                                continue;
                                                                                                                                            case 50:
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                continue;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                case 116:
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 1007:
                                                                                                                        i16 = !zFind10 ? 53479 : 52797;
                                                                                                                    case 7927:
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                        case 116:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 2025:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 76:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 116:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 243:
                                                            i11 = !zFind5 ? 51557 : 50875;
                                                        case 4075:
                                                            break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case 241:
                        i7 = zIsEmpty ? 49883 : 49852;
                }
                return "";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0172.m820(f818short, 1630, 5, 2250), C0180.m851(f818short, 1635, 1, 2278));
            jSONObject.put(C0178.m845(f818short, 1636, 7, 771), "");
            jSONObject.put(strM849, strGroup);
            jSONObject.put(C0171.m816(f818short, 1643, 6, 665), "");
            boolean zIsEmpty2 = TextUtils.isEmpty(str3);
            int i19 = 54533;
            while (true) {
                i19 ^= 54550;
                switch (i19) {
                    case 19:
                        i19 = !zIsEmpty2 ? 54626 : 54595;
                    case 50:
                    case 85:
                        break;
                    case 116:
                        jSONObject.put(C0180.m851(f818short, 1649, 4, 470), C0179.m849(f818short, 1653, 10, 2058));
                        jSONObject.put(C0182.m861(f818short, 1663, 4, 878), Proxy.localProxyUrl() + C0178.m845(f818short, 1667, 14, 403) + URLEncoder.encode(str3));
                        break;
                }
            }
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x014b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x01be. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0077. Please report as an issue. */
    public String searchContent(String str, boolean z) throws JSONException {
        String strM820 = C0172.m820(f818short, 1681, 3, 2896);
        String strM841 = C0177.m841(f818short, 1684, 4, 1714);
        String strM801 = C0166.m801(f818short, 1688, 1, 1975);
        try {
            JSONObject jSONObject = new JSONObject();
            C0116dX c0116dXM654b = C0093Tt.m440q(m32xC(this.f60k + C0181.m856(f818short, 1689, 10, 2219) + URLEncoder.encode(str))).m654b(C0169.m809(f818short, 1699, 22, 2307));
            JSONArray jSONArray = new JSONArray();
            Iterator<C0127lK> it = c0116dXM654b.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                int i = 1616;
                while (true) {
                    i ^= 1633;
                    switch (i) {
                        case 14:
                        case 49:
                            i = zHasNext ? 1709 : 1678;
                        case 204:
                            C0127lK next = it.next();
                            Matcher matcher = f57u.matcher(next.m654b(strM801).m595q(strM841));
                            JSONObject jSONObject2 = new JSONObject();
                            boolean zFind = matcher.find();
                            int i2 = 1740;
                            while (true) {
                                i2 ^= 1757;
                                switch (i2) {
                                    case 17:
                                        i2 = zFind ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case 500:
                                        String strGroup = matcher.group(1);
                                        String strTrim = next.m654b(strM820).m595q(C0169.m809(f818short, 1721, 3, 3255)).trim();
                                        boolean zContains = strTrim.contains(str);
                                        int i3 = 1864;
                                        while (true) {
                                            i3 ^= 1881;
                                            switch (i3) {
                                                case 17:
                                                    i3 = zContains ? 48736 : 48705;
                                                case 47384:
                                                    break;
                                                case 47417:
                                                    String strTrim2 = next.m654b(strM820).m595q(C0166.m801(f818short, 1724, 3, 522)).trim();
                                                    boolean zM670wt = next.m670wt(C0175.m834(f818short, 1727, 5, 2718));
                                                    String strM816 = C0171.m816(f818short, 1732, 11, 1786);
                                                    int i4 = 48767;
                                                    while (true) {
                                                        i4 ^= 48784;
                                                        switch (i4) {
                                                            case 14:
                                                            case 45:
                                                                String strM653a = C0093Tt.m440q(C0106ZJ.m484FN(next.m654b(strM801).m595q(strM841), m31q())).m654b(C0177.m841(f818short, 1753, 27, 1104)).get(0).m653a();
                                                                jSONObject2.put(C0169.m809(f818short, 1780, 6, 935), strGroup);
                                                                jSONObject2.put(C0178.m845(f818short, 1786, 8, 559), strTrim);
                                                                jSONObject2.put(C0165.m798(f818short, 1794, 7, 1709), strTrim2);
                                                                jSONObject2.put(strM816, strM653a);
                                                                jSONArray.put(jSONObject2);
                                                                int i5 = 49666;
                                                                while (true) {
                                                                    i5 ^= 49683;
                                                                    switch (i5) {
                                                                        case 17:
                                                                            i5 = 49697;
                                                                        case 50:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 76:
                                                                jSONObject2.put(strM816, next.m654b(C0182.m861(f818short, 1743, 10, 347)).m596u());
                                                                int i6 = 48891;
                                                                while (true) {
                                                                    i6 ^= 48908;
                                                                    switch (i6) {
                                                                        case 22:
                                                                            break;
                                                                        case 503:
                                                                            i6 = 48922;
                                                                    }
                                                                }
                                                                break;
                                                            case 239:
                                                                i4 = zM670wt ? 48860 : 48829;
                                                        }
                                                    }
                                                    break;
                                                case 47483:
                                            }
                                        }
                                        break;
                                }
                            }
                            break;
                        case 239:
                            break;
                    }
                    jSONObject.put(C0171.m816(f818short, 1801, 4, 1174), jSONArray);
                    return jSONObject.toString();
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:140:0x048b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:161:0x051f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:48:0x01d0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:91:0x033a. Please report as an issue. */
    /* renamed from: xC */
    protected final String m32xC(String str) {
        String str2;
        f45F = "";
        String strM482B = C0106ZJ.m482B(str, m31q(), new TreeMap());
        boolean zContains = strM482B.contains(C0172.m820(f818short, 1805, 20, 1349));
        String strM834 = C0175.m834(f818short, 1825, 1, 2076);
        String strM809 = C0169.m809(f818short, 1826, 10, 2787);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = !zContains ? 1709 : 1678;
                case 204:
                    boolean zContains2 = strM482B.contains(C0177.m841(f818short, 1836, 4, 2419));
                    String strM849 = C0179.m849(f818short, 1840, 7, 1443);
                    String strM851 = C0180.m851(f818short, 1847, 21, 3104);
                    String strM8092 = C0169.m809(f818short, 1868, 3, 2937);
                    String strM841 = C0177.m841(f818short, 1871, 6, 3243);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = zContains2 ? 1833 : 1802;
                            case 54:
                            case 471:
                                boolean zContains3 = strM482B.contains(C0172.m820(f818short, 1891, 8, 2858));
                                int i3 = 50689;
                                while (true) {
                                    i3 ^= 50706;
                                    switch (i3) {
                                        case 19:
                                            i3 = zContains3 ? 50782 : 50751;
                                        case 45:
                                            break;
                                        case 50:
                                        case 76:
                                            String strM484FN = C0106ZJ.m484FN(this.f60k + C0093Tt.m440q(strM482B).m654b(strM841).m595q(strM8092), m31q());
                                            Matcher matcher = Pattern.compile(C0174.m828(f818short, 1899, 20, 2051)).matcher(strM484FN);
                                            Matcher matcher2 = Pattern.compile(C0175.m834(f818short, 1919, 22, 741)).matcher(strM484FN);
                                            Matcher matcher3 = Pattern.compile(strM851).matcher(strM484FN);
                                            boolean zFind = matcher.find();
                                            int i4 = 50813;
                                            while (true) {
                                                i4 ^= 50830;
                                                switch (i4) {
                                                    case 18:
                                                    case 53:
                                                        break;
                                                    case 243:
                                                        i4 = zFind ? 51557 : 50875;
                                                    case 4075:
                                                        boolean zFind2 = matcher2.find();
                                                        int i5 = 51588;
                                                        while (true) {
                                                            i5 ^= 51605;
                                                            switch (i5) {
                                                                case 17:
                                                                    i5 = zFind2 ? 51681 : 51650;
                                                                case 54:
                                                                case 87:
                                                                    break;
                                                                case 116:
                                                                    boolean zFind3 = matcher3.find();
                                                                    int i6 = 51712;
                                                                    while (true) {
                                                                        i6 ^= 51729;
                                                                        switch (i6) {
                                                                            case 14:
                                                                            case 17:
                                                                                i6 = zFind3 ? 51805 : 51774;
                                                                            case 47:
                                                                                break;
                                                                            case 76:
                                                                                String str3 = this.f60k + matcher3.group(1) + matcher.group(1) + strM849 + C0118ga.m604q(stringtoHex(matcher2.group(1)), C0118ga.f677xC).toLowerCase();
                                                                                f45F = "";
                                                                                TreeMap treeMap = new TreeMap();
                                                                                C0106ZJ.m482B(str3, m31q(), treeMap);
                                                                                List list = (List) treeMap.get(strM809);
                                                                                list.getClass();
                                                                                Iterator it = list.iterator();
                                                                                while (true) {
                                                                                    boolean zHasNext = it.hasNext();
                                                                                    int i7 = 51836;
                                                                                    while (true) {
                                                                                        i7 ^= 51853;
                                                                                        switch (i7) {
                                                                                            case 241:
                                                                                                i7 = zHasNext ? 52580 : 52549;
                                                                                            case 1963:
                                                                                            case 1992:
                                                                                                break;
                                                                                            case 2025:
                                                                                                f45F += ((String) it.next()).split(strM834)[0];
                                                                                                int i8 = 52611;
                                                                                                while (true) {
                                                                                                    i8 ^= 52628;
                                                                                                    switch (i8) {
                                                                                                        case 23:
                                                                                                            i8 = 52642;
                                                                                                            break;
                                                                                                        case 54:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                            case 500:
                                String strM484FN2 = C0106ZJ.m484FN(this.f60k + C0093Tt.m440q(strM482B).m654b(strM841).m595q(strM8092), m31q());
                                System.out.println(C0171.m816(f818short, 1877, 7, 1379) + strM484FN2);
                                Matcher matcher4 = f51RH.matcher(strM484FN2);
                                Matcher matcher5 = f47KT.matcher(strM484FN2);
                                Matcher matcher6 = Pattern.compile(strM851).matcher(strM484FN2);
                                boolean zFind4 = matcher4.find();
                                int i9 = 1864;
                                while (true) {
                                    i9 ^= 1881;
                                    switch (i9) {
                                        case 17:
                                            i9 = zFind4 ? 48736 : 48705;
                                        case 47384:
                                            break;
                                        case 47417:
                                            boolean zFind5 = matcher5.find();
                                            int i10 = 48767;
                                            while (true) {
                                                i10 ^= 48784;
                                                switch (i10) {
                                                    case 14:
                                                    case 45:
                                                        break;
                                                    case 76:
                                                        boolean zFind6 = matcher6.find();
                                                        int i11 = 48891;
                                                        while (true) {
                                                            i11 ^= 48908;
                                                            switch (i11) {
                                                                case 22:
                                                                case 53:
                                                                    break;
                                                                case 503:
                                                                    i11 = zFind6 ? 49635 : 48953;
                                                                case 32495:
                                                                    boolean zFind7 = matcher6.find();
                                                                    int i12 = 49666;
                                                                    while (true) {
                                                                        i12 ^= 49683;
                                                                        switch (i12) {
                                                                            case 17:
                                                                                i12 = zFind7 ? 49759 : 49728;
                                                                            case 50:
                                                                            case 76:
                                                                                System.out.println(C0175.m834(f818short, 1884, 7, 2996) + matcher6.group(1));
                                                                                break;
                                                                            case 83:
                                                                                break;
                                                                        }
                                                                    }
                                                                    String str4 = this.f60k + matcher6.group(1) + matcher4.group(1) + strM849 + C0118ga.m604q(stringtoHex(matcher5.group(1)), C0118ga.f677xC).toLowerCase();
                                                                    f45F = "";
                                                                    TreeMap treeMap2 = new TreeMap();
                                                                    C0106ZJ.m482B(str4, m31q(), treeMap2);
                                                                    List list2 = (List) treeMap2.get(strM809);
                                                                    list2.getClass();
                                                                    Iterator it2 = list2.iterator();
                                                                    while (true) {
                                                                        boolean zHasNext2 = it2.hasNext();
                                                                        int i13 = 49790;
                                                                        while (true) {
                                                                            i13 ^= 49807;
                                                                            switch (i13) {
                                                                                case 18:
                                                                                case 51:
                                                                                    break;
                                                                                case 84:
                                                                                    f45F += ((String) it2.next()).split(strM834)[0];
                                                                                    int i14 = 49914;
                                                                                    while (true) {
                                                                                        i14 ^= 49931;
                                                                                        switch (i14) {
                                                                                            case 497:
                                                                                                i14 = 50596;
                                                                                                break;
                                                                                            case 1711:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 241:
                                                                                    i13 = zHasNext2 ? 49883 : 49852;
                                                                            }
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 239:
                                                        i10 = zFind5 ? 48860 : 48829;
                                                }
                                            }
                                            break;
                                        case 47483:
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 239:
                    boolean zContains4 = strM482B.contains(C0179.m849(f818short, 1941, 5, 3035));
                    int i15 = 52735;
                    while (true) {
                        i15 ^= 52752;
                        switch (i15) {
                            case 14:
                            case 45:
                                boolean zContains5 = strM482B.contains(C0172.m820(f818short, 1982, 8, 2693));
                                int i16 = 55556;
                                while (true) {
                                    i16 ^= 55573;
                                    switch (i16) {
                                        case 17:
                                            i16 = !zContains5 ? 55649 : 55618;
                                        case 54:
                                        case 87:
                                            break;
                                        case 116:
                                            f45F = "";
                                            TreeMap treeMap3 = new TreeMap();
                                            C0106ZJ.m482B(str, m31q(), treeMap3);
                                            List list3 = (List) treeMap3.get(strM809);
                                            list3.getClass();
                                            Iterator it3 = list3.iterator();
                                            while (true) {
                                                boolean zHasNext3 = it3.hasNext();
                                                int i17 = 55680;
                                                while (true) {
                                                    i17 ^= 55697;
                                                    switch (i17) {
                                                        case 17:
                                                            i17 = zHasNext3 ? 56424 : 56393;
                                                        case 1467:
                                                        case 1496:
                                                            break;
                                                        case 1529:
                                                            f45F += ((String) it3.next()).split(strM834)[0];
                                                            int i18 = 56455;
                                                            while (true) {
                                                                i18 ^= 56472;
                                                                switch (i18) {
                                                                    case 31:
                                                                        i18 = 56486;
                                                                        break;
                                                                    case 62:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                            case 1007:
                                i15 = zContains4 ? 53479 : 52797;
                            case 7927:
                                Matcher matcher7 = Pattern.compile(C0174.m828(f818short, 1946, 21, 1874)).matcher(strM482B);
                                boolean zFind8 = matcher7.find();
                                int i19 = 53510;
                                while (true) {
                                    i19 ^= 53527;
                                    switch (i19) {
                                        case 17:
                                            i19 = zFind8 ? 53603 : 53572;
                                        case 50:
                                        case 83:
                                            break;
                                        case 116:
                                            String strM8093 = C0169.m809(f818short, 1967, 8, 3002);
                                            boolean zContains6 = str.contains(strM8093);
                                            String strM798 = C0165.m798(f818short, 1975, 7, 716);
                                            int i20 = 53634;
                                            while (true) {
                                                i20 ^= 53651;
                                                switch (i20) {
                                                    case 17:
                                                        i20 = zContains6 ? 53727 : 53696;
                                                    case 50:
                                                    case 76:
                                                        String str5 = str + strM798 + matcher7.group(1);
                                                        int i21 = 53758;
                                                        while (true) {
                                                            i21 ^= 53775;
                                                            switch (i21) {
                                                                case 1009:
                                                                    i21 = 54440;
                                                                    continue;
                                                                case 1703:
                                                                    str2 = str5;
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 83:
                                                        str2 = str + strM798 + matcher7.group(1);
                                                        break;
                                                }
                                            }
                                            f45F = "";
                                            String strM484FN3 = C0106ZJ.m484FN(str2, m31q());
                                            boolean zContains7 = strM484FN3.contains(strM8093);
                                            int i22 = 54533;
                                            while (true) {
                                                i22 ^= 54550;
                                                switch (i22) {
                                                    case 19:
                                                        i22 = zContains7 ? 54626 : 54595;
                                                    case 50:
                                                    case 85:
                                                        TreeMap treeMap4 = new TreeMap();
                                                        C0106ZJ.m482B(str2, m31q(), treeMap4);
                                                        List list4 = (List) treeMap4.get(strM809);
                                                        list4.getClass();
                                                        Iterator it4 = list4.iterator();
                                                        while (true) {
                                                            boolean zHasNext4 = it4.hasNext();
                                                            int i23 = 54657;
                                                            while (true) {
                                                                i23 ^= 54674;
                                                                switch (i23) {
                                                                    case 19:
                                                                        i23 = zHasNext4 ? 55401 : 54719;
                                                                    case 45:
                                                                        break;
                                                                    case 50:
                                                                    case 3579:
                                                                        f45F += ((String) it4.next()).split(strM834)[0];
                                                                        int i24 = 55432;
                                                                        while (true) {
                                                                            i24 ^= 55449;
                                                                            switch (i24) {
                                                                                case 17:
                                                                                    i24 = 55463;
                                                                                    break;
                                                                                case 62:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                    case 116:
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
            }
            return C0106ZJ.m484FN(str, m31q());
        }
    }
}
