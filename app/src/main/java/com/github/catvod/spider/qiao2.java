package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.g;
import com.github.catvod.spider.merge.C0948d;
import com.github.catvod.spider.merge.C1024e;
import com.github.catvod.spider.merge.C1080f;
import com.github.catvod.spider.merge.C1200g;
import com.github.catvod.spider.merge.C1228h;
import com.github.catvod.spider.merge.C1370pv;
import com.github.catvod.spider.merge.Yy;
import com.github.catvod.spider.merge.lE;
import com.github.catvod.spider.merge.xv;
import com.github.catvod.spider.merge.xx;
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

public class qiao2 extends Spider {
    public static String l8 = "";

    private static final short[] f1314short = {3149, 3179, 3197, 3178, 3125, 3161, 3199, 3197, 3190, 3180, 1493, 1520, 1507, 1509, 1470, 1442, 1471, 1441, 1457, 1465, 1525, 1520, 1507, 1509, 1451, 1528, 1534, 1464, 472, 478, 456, 479, 384, 460, 458, 456, 451, 473, 282, 319, 300, 298, 369, 364, 368, 367, 359, 382, 374, 314, 319, 300, 298, 356, 311, 305, 375, 768, 785, 785, 789, 782, 844, 781, 782, 770, 768, 781, 844, 788, 788, 776, 773, 1164, 1184, 1185, 1211, 1194, 1185, 1211, 1250, 1179, 1206, 1215, 1194, 1178, 1163, 1163, 1175, 1170, 1176, 1178, 1167, 1170, 1172, 1173, 1236, 1169, 1160, 1172, 1173, 1428, 1423, 1419, 1413, 1422, 263, 285, 256, 273, 3042, 3055, 3046, 3059, 1916, 1916, 1845, 1848, 1854, 1916, 1843, 1854, 1828, 1855, 1845, 1840, 1827, 1832, 1916, 1131, 1139, 1130, 1138, 1135, 1142, 1127, 1140, 1138, 1065, 1120, 1129, 1140, 1131, 1067, 1122, 1127, 1138, 1127, 1085, 1062, 2905, 2905, 3211, 3212, 3269, 3305, 3304, 3314, 3299, 3304, 3314, 3243, 3266, 3311, 3317, 3318, 3305, 3317, 3311, 3314, 3311, 3305, 3304, 3260, 3238, 3296, 3305, 3316, 3307, 3243, 3298, 3303, 3314, 3303, 3261, 3238, 3304, 3303, 3307, 3299, 3259, 3236, 3318, 3306, 3303, 3327, 3289, 3315, 3316, 3306, 3236, 3211, 3212, 3211, 3212, 2960, 2967, 2992, 2992, 1227, 1228, 1157, 1193, 1192, 1202, 1187, 1192, 1202, 1259, 1154, 1199, 1205, 1206, 1193, 1205, 1199, 1202, 1199, 1193, 1192, 1276, 1254, 1184, 1193, 1204, 1195, 1259, 1186, 1191, 1202, 1191, 1277, 1254, 1192, 1191, 1195, 1187, 1275, 1252, 1194, 1191, 1188, 1187, 1194, 1252, 1227, 1228, 1227, 1228, 1286, 1281, 1352, 1380, 1381, 1407, 1390, 1381, 1407, 1318, 1359, 1378, 1400, 1403, 1380, 1400, 1378, 1407, 1378, 1380, 1381, 1329, 1323, 1389, 1380, 1401, 1382, 1318, 1391, 1386, 1407, 1386, 1328, 1323, 1381, 1386, 1382, 1390, 1334, 1321, 1376, 1390, 1394, 1321, 1286, 1281, 1286, 1281, 1825, 1825, 1793, 1798, 1793, 1798, 2971, 3005, 2987, 3004, 3043, 2959, 2985, 2987, 2976, 3002, 1233, 1226, 1230, 1216, 1227, 1239, 1231, 1238, 1230, 1235, 1226, 1243, 1224, 1230, 1173, 1244, 1237, 1224, 1239, 1175, 1246, 1243, 1230, 1243, 1153, 1178, 1240, 1237, 1231, 1236, 1246, 1243, 1224, 1219, 1159, 778, 774, 775, 797, 780, 775, 797, 836, 797, 784, 793, 780, 760, 760, 760, -29969, 25756, 23101, -29143, 765, 765, 692, 697, 703, 765, 690, 703, 677, 702, 692, 689, 674, 681, 765, 3246, 3254, 3247, 3255, 3242, 3251, 3234, 3249, 3255, 3308, 3237, 3244, 3249, 3246, 3310, 3239, 3234, 3255, 3234, 3320, 3299, 1139, 1139, 2227, 2228, 2301, 2257, 2256, 2250, 2267, 2256, 2250, 2195, 2298, 2263, 2253, 2254, 2257, 2253, 2263, 2250, 2263, 2257, 2256, 2180, 2206, 2264, 2257, 2252, 2259, 2195, 2266, 2271, 2250, 2271, 2181, 2206, 2256, 2271, 2259, 2267, 2179, 2204, 2254, 2258, 2271, 2247, 2273, 2251, 2252, 2258, 2204, 2227, 2228, 2227, 2228, 2560, 2567, 2592, 2592, 424, 431, 486, 458, 459, 465, 448, 459, 465, 392, 481, 460, 470, 469, 458, 470, 460, 465, 460, 458, 459, 415, 389, 451, 458, 471, 456, 392, 449, 452, 465, 452, 414, 389, 459, 452, 456, 448, 408, 391, 457, 452, 455, 448, 457, 391, 424, 431, 424, 431, 2180, 2179, 2250, 2278, 2279, 2301, 2284, 2279, 2301, 2212, 2253, 2272, 2298, 2297, 2278, 2298, 2272, 2301, 2272, 2278, 2279, 2227, 2217, 2287, 2278, 2299, 2276, 2212, 2285, 2280, 2301, 2280, 2226, 2217, 2279, 2280, 2276, 2284, 2228, 2219, 2274, 2284, 2288, 2219, 2180, 2179, 2180, 2179, 3139, 3140, 3085, 3105, 3104, 3130, 3115, 3104, 3130, 3171, 3082, 3111, 3133, 3134, 3105, 3133, 3111, 3130, 3111, 3105, 3104, 3188, 3182, 3112, 3105, 3132, 3107, 3171, 3114, 3119, 3130, 3119, 3189, 3182, 3104, 3119, 3107, 3115, 3187, 3180, 3133, 3111, 3113, 3104, 3180, 3139, 3140, 3139, 3140, 882, 882, 850, 853, 850, 853, 2040, 2019, 2023, 2025, 2018, 2883, 2917, 2931, 2916, 2875, 2903, 2929, 2931, 2936, 2914, 1211, 1182, 1165, 1163, 1232, 1229, 1233, 1230, 1222, 1247, 1239, 1179, 1182, 1165, 1163, 1221, 1174, 1168, 1238, 2302, 2287, 2287, 2283, 2288, 2226, 2291, 2288, 2300, 2302, 2291, 2226, 2282, 2282, 2294, 2299, 1258, 1266, 1259, 1267, 1262, 1271, 1254, 1269, 1267, 1192, 1249, 1256, 1269, 1258, 1194, 1251, 1254, 1267, 1254, 1212, 1191, 1253, 1256, 1266, 1257, 1251, 1254, 1269, 1278, 1210, 2545, 2557, 2556, 2534, 2551, 2556, 2534, 2495, 2534, 2539, 2530, 2551, 2674, 2684, 2656, 1264, 1264, 1260, 1249, 1754, 1733, 2965, 2959, 2945, 2952, 2963, 2964, 2954, 1709, 1724, 1724, 1698, 1709, 1697, 1705, 2825, 2834, 2838, 2840, 2835, 1194, 1164, 1178, 1165, 1234, 1214, 1176, 1178, 1169, 1163, 2441, 2476, 2495, 2489, 2530, 2558, 2531, 2557, 2541, 2533, 2473, 2476, 2495, 2489, 2551, 2468, 2466, 2532, 1700, 1704, 1705, 1697, 1710, 1696, 878, 869, 871, 875, 867, 868, 2973, 2956, 2965, 1671, 1675, 1674, 1666, 1677, 1667, 1681, 1686, 1672, 1867, 1874, 1881, 1890, 1871, 1880, 1872, 1884, 1871, 1878, 1870, 523, 530, 537, 546, 525, 532, 542, 2835, 2826, 2817, 2874, 2827, 2820, 2824, 2816, 3296, 3321, 3314, 3273, 3327, 3314, 2503, 2524, 2503, 2514, 2527, 2696, 2695, 2698, 2712, 2712, 1704, 1716, 1712, 1699, 849, 834, 853, 849, 1190, 1195, 1186, 1207, 405, 460, 469, 478, 405, 470, 467, 457, 462, 457, 2881, 2826, 2823, 2830, 2843, 2849, 2839, 2842, 2883, 1931, 1996, 2015, 1992, 1996, 1936, 933, 1007, 994, 1005, 996, 958, 1988, 1947, 1927, 1923, 1936, 2015, 2632, 2561, 2588, 2570, 2571, 2588, 2643, 2586, 2567, 2563, 2571, 3087, 3165, 3152, 3161, 3148, 3190, 3143, 3144, 3140, 3148, 3092, 1735, 1681, 1664, 1670, 1668, 1756, 1540, 1618, 1603, 1605, 1607, 1649, 1611, 1624, 1607, 1567, 1552, 1555, 3245, 3284, 3284, 3323, 3303, 3306, 3327, 3309, 3300, 3321, 3302, 3254, 3306, 3301, 3311, 3321, 3300, 3298, 3311, 3245, 3320, 3298, 3308, 3301, 3254, 1129, 1122, 1135, 1150, 1141, 1148, 1144, 1125, 1123, 1122, 1933, 1928, 1949, 1928, 1042, 1043, 1045, 2247, 2249, 2261, 259, 284, 1633, 1633, 1574, 1645, 1032, 1140, 1075, 1033, 1025, 1025, 1025, 1025, 1025, 1025, 1025, 1025, 1025, 796, 781, 779, 777, 826, 811, 813, 815,
    809, 805, 831, 804, 830, 1337, 1340, 1336, 1340, 1313, 1752, 1757, 1735, 1728, 2014, 1986, 1999, 2007, 1995, 2012, 2033, 1991, 1984, 1992, 1985, 2282, 2282, 2282, 1887, 1862, 1869, 1910, 1866, 1862, 1863, 1885, 1868, 1863, 1885, 1225, 1232, 1243, 1248, 1243, 1238, 1229, 1242, 1244, 1227, 1232, 1229, 1161, 1168, 1179, 1184, 1182, 1180, 1163, 1168, 1165, 1906, 1899, 1888, 1883, 1910, 1889, 1897, 1893, 1910, 1903, 1911, 2792, 2801, 2810, 2753, 2815, 2796, 2811, 2815, 1059, 1082, 1073, 1034, 1068, 1072, 1076, 1063, 1590, 1583, 1572, 1567, 1584, 1577, 1571, 2016, 2041, 2034, 1993, 2040, 2039, 2043, 2035, 3123, 3114, 3105, 3098, 3116, 3105, 1647, 1590, 1583, 1572, 1647, 1575, 1573, 1588, 1558, 1583, 1572, 1663, 1577, 1572, 1661, 954, 963, 963, 1004, 1008, 1021, 1000, 1018, 1011, 1006, 1009, 929, 1021, 1010, 1016, 1006, 1011, 1013, 1016, 954, 1007, 1013, 1019, 1010, 929, 3072, 3073, 3088, 3077, 3085, 3080, 302, 293, 296, 313, 306, 315, 319, 290, 292, 293, 2138, 2143, 2122, 2143, 2548, 2549, 2547, 714, 708, 728, 1076, 1067, 2312, 2312, 2383, 2308, 484, 408, 479, 485, 493, 493, 493, 493, 493, 493, 493, 493, 493, 3162, 3159, 3166, 3147, 3185, 3136, 3151, 3139, 3147, 2209, 2232, 2227, 2184, 2228, 2235, 2230, 2212, 2212, 27021, 24908, 20746, 22885, 21377, 21412, -28720, -539, -30434, 20502, 19683, 23994, 20798, -26498, -536, -536, 1269, 1260, 1255, 1244, 1267, 1263, 1250, 1274, 1244, 1263, 1258, 1264, 1271, 2822, 2845, 2842, 2818, 664, 652, 657, 659, 26086, 23696, 22181, 508, 507, 485, 506, 3100, 3091, 3103, 3095, 906, 3041, 3046, 3064, 2748, 1207, 2620, 2597, 2606, 2581, 2618, 2598, 2603, 2611, 2581, 2604, 2616, 2597, 2599, 1422, 1431, 1436, 1447, 1416, 1428, 1433, 1409, 1447, 1421, 1418, 1428, 1162, 1167, 1173, 1170, 395, 393, 412, 397, 2526, 2443, 2449, 2463, 2454, 2501, 2428, 2416, 2417, 2425, 2422, 2424, 2233, 2226, 2239, 2222, 2213, 2220, 2216, 2229, 2227, 2226, 1321, 1323, 1338, 1297, 1318, 1313, 1315, 1323, 1297, 1325, 1327, 1338, 1323, 667, 670, 651, 670, 781, 780, 778, 2345, 2343, 2363, 2183, 2200, 684, 684, 747, 672, 2122, 2102, 2161, 2123, 2115, 2115, 2115, 2115, 2115, 2115, 2115, 2115, 2115, 1701, 1704, 958, 956, 959, 951, 3191, 3194, 3187, 3174, 3164, 3178, 3175, 1104, 1117, 1108, 1089, 1147, 1098, 1093, 1097, 1089, 547, 574, 547, 571, 562, 2361, 2358, 2363, 2345, 2345, 785, 798, 795, 771, 786, 773, 772, 2315, 2322, 2329, 2338, 2319, 2328, 2320, 2332, 2319, 2326, 2318, 2446, 2455, 2460, 2471, 2440, 2449, 2459, 959, 934, 941, 918, 935, 936, 932, 940, 1604, 1629, 1622, 1645, 1627, 1622, 2442, 2509, 2506, 2504, 2496, 2442, 2497, 2500, 2513, 2500, 2458, 2508, 2497, 2456, 789, 862, 860, 863, 855, 782, 393, 496, 496, 479, 451, 462, 475, 457, 448, 477, 450, 402, 462, 449, 459, 477, 448, 454, 459, 393, 476, 454, 456, 449, 402, 935, 928, 930, 938, 1704, 1699, 1710, 1727, 1716, 1725, 1721, 1700, 1698, 1699, 2108, 2081, 2096, 2104, 2086, 658, 644, 642, 661, 648, 654, 655, 658, 1745, 1748, 1729, 1748, 3198, 3199, 3193, 2814, 2800, 2796, 1201, 1198, 1749, 1749, 1682, 1753, 2783, 2723, 2788, 2782, 2774, 2774, 2774, 2774, 2774, 2774, 2774, 2774, 2774, 720, 725, 719, 712, 853, 836, 855, 854, 832, 1410, 3058, 2989, 3004, 2991, 2990, 2996, 2995, 3002, 3058, 2989, 2991, 2994, 2981, 2980, 3042, 2946, 2946, 2989, 2993, 3004, 2985, 3003, 2994, 2991, 2992, 3040, 3004, 2995, 3001, 2991, 2994, 2996, 3001, 3067, 2990, 2996, 3002, 2995, 3040, 793, 869, 802, 792, 784, 784, 784, 784, 784, 784, 784, 784, 784, 2951, 2951, 3008, 2955, 861, 834, 2492, 2493, 2491, 3146, 3137, 3148, 3165, 3158, 3167, 3163, 3142, 3136, 3137, 2052, 2056, 2057, 2049, 2062, 2048, 400, 414, 386, 2814, 2811, 2798, 2811, 2097, 2148, 2174, 2160, 2169, 2090, 3149, 3144, 3154, 3157, 3154, 2964, 2966, 2951, 2988, 2947, 2962, 2945, 2944, 2970, 2973, 2964, 2330, 2333, 2307, 2102, 2107, 2104, 2111, 2102, 2421, 2412, 2407, 2396, 2417, 2406, 2414, 2402, 2417, 2408, 2416, 1302, 1295, 1284, 1343, 1296, 1289, 1283, 1799, 1822, 1813, 1838, 1823, 1808, 1820, 1812, 1934, 1943, 1948, 1959, 1937, 1948, 2201, 2245, 2259, 2263, 2244, 2261, 2270, 2201, 2266, 2271, 2245, 2242, 2245, 2185, 2241, 2258, 2187, 2037, 1955, 1970, 1972, 1974, 2030, 2018, 2037, 1959, 1962, 1955, 1974, 2030, 2037, 1932, 1932, 1955, 1983, 1970, 1959, 1973, 1980, 1953, 1982, 2030, 1970, 1981, 1975, 1953, 1980, 1978, 1975, 2037, 1952, 1978, 1972, 1981, 2030, 3091, 3077, 3073, 3090, 3075, 3080, 1029, 1038, 1027, 1042, 1049, 1040, 1044, 1033, 1039, 1038, 384, 389, 400, 389, 1039, 1038, 1032, 2614, 2616, 2596, 2160, 2159, 487, 487, 416, 491, 2810, 2694, 2753, 2811, 2803, 2803, 2803, 2803, 2803, 2803, 2803, 2803, 2803, 3187, 3190, 3180, 3179};
    private String S = "";
    private String T4 = "";
    private String b = "";
    private String OL = "";
    private String l = "";
    private String tT = "";
    private String N = "";
    private String HM = "";
    private String n = "";
    private String v = "";
    private String A = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDA+5YTt3w1q/0WGw+TWyCSHTAeYiwBqAqDWot1u/1hoeANpED8gtW1AxB1mYNDQ+9eR8Ml+JC13+ME6RHjEbN4+n9V9OP90c81G0qSjBQ/DKQiMIFjbTH97RjVMtswf96tqwe4Rs/DT2ym6MP4P7QvJcxrFz5VVQXyOtUxhpMc9oktWuk0XKE8Mozu1FM879RknlM6WmJL85Wl/BnZrd+/AQbzziceELGrBfjbc1UOFAxYq2kA10H3o+Z4oOIODxUtXeh4R2oH3vHb4Ynnw6reXED5KsE3u1EO5HMQZyN16TZMTIps32bPe+vQlAT6V5nGcqXGT9fntjqIxJB0T9G3AgMBAAECggEBAKP6Yuh4BZP5g0CwV8jHKuLc6FE469mwdtZsLooo5cF68c3Fnu6xIXQAmZDDk3SpmhCLe7edASF5jwZSIL/H/68xcteQEdZP2/htKy1g16dHT4Q5oQfh9hOkznACGZuZW5ZH+HRNvyZfK5ybtkEPqERTouHwSyfo6feMpDDD/+cf3h1//7JKXKA7JPEU420YucsjQwjMuu5xdPa0TPqEc5mIbOBj753Pzn4GCScM+FRqJWr2x8e+KDPcPY8CUDLBSWxGLsB0A7+bEq/EiAQkbx09QKTwwxRLgVXjBbvyPB8BOuJpPM9BHx+vFcm5WSbkJdRI4qVFtEdsN/gDfFkwcjkCgYEA8Z8i/fTFRnzyvp9Pp8E+bSaYlvpTLUZ1KYNStaDg/BqlYGgGK1Jh90qjvRbBoiIjeBQd3IFLT4pFdd7Z9drLFdvqB22SNeVQU57kir/B6NY5G7yOjXB4qN17F4S3GubYIEcjF0W1tG/uOqqzb8FxrLJTK8WiFudbBt2ioCO4pJsCgYEAzHd8MctmD1Z1eM/xusvX1yCwGpxBuHT+ymThzLXyI6Ej0Q50jOQlf3cTyY/FgGbvAMz+oBybkEwE80gu7CPi0WPs+yCpAIB4+Th7afsrRylQI1ZWoRovaRmsyjnkIw0Mnj06VYNYPtkzm/OViRIqf4ESTTGas24bDm5DuwM9gxUCgYBwg4BR7gdnWYvYRGtdXNlrDowD0jGlZaftWt/LAE2EWAwmpooo5kYEV9eDl/M3QtptckCti++77FGIH+wzVl03op6KMvXg7xXGurkF+2GawRb62YUwS+2EBQ7q1rxFZLXD4hxvG+EPUwgGfbLtGZGLr8aXHYLrU3TJ769pDvlOfQKBgAFlAzzXtU9/eHele3GZuFQoTeswi6Y1bhN1UrDxwMALdlITtinL2JGg/0qNp3wzt4ea3lW7PDhkvFfocyF7MS3ab6Ba3aw6NBkHEJhtdSMcHgbPrPGWWyJtYWdTs8GlciOWKVKx/aUYGCkFJUz1CcMq3zQVlYeJxbd4ew/Iet/tAoGBAMRfvG1iLQAlS3AGaQeRwVxnvpciDn+7/sUCf8DEOk8Bqg4/ytJDTDrWufCtwmpsXmp6AUQig9mNKj7z26wSNbwYdzPsncK+sGRlS7eLAzzcv1a+1pghOOGDuQNzwlFOcauhkrcqjeKmu7OiKD48pvh3ZICiIWS1YL7LuMfUwHRJ";
    JSONArray cD = null;

    public qiao2() {
    }

    private HashMap<String, String> S() {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Dart/3.0 (dart:io)");
        return map;
    }

    private HashMap<String, String> T4(String str) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Content-Type", "application/json");
        map.put("token", l8);
        map.put("user-agent", "Dart/2.19 (dart:io)");
        map.put("appto-local-uuid", this.v);
        return map;
    }

    private String b(String str) {
        xx.ut utVar = new xx.ut(this) {
            final qiao2 S;

            {
                this.S = qiao2.this;
            }

            @Override
            public void onFailure(Call call, Exception exc) {
            }

            @Override
            public String onResponse(String str2) {
                return str2;
            }
        };
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("site", this.n);
            jSONObject.put("type", str);
            Yy.N(Yy.T4(), this.HM, jSONObject.toString(), S(), utVar);
            return utVar.getResult();
        } catch (Throwable th) {
            return "";
        }
    }

    public static String formUpload(String str, String str2, String str3, String str4, String str5) {
        OkHttpClient okHttpClient = new OkHttpClient();
        String str6 = "--dio-boundary-" + getRandomNickname(10);
        MediaType mediaType = MediaType.parse("multipart/form-data; " + str6);
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(str6);
        sb.append("\r\nContent-Disposition: form-data; name=\"play_url\"\r\n\r\n");
        sb.append(str2);
        String strD = "\r\n--";
        sb.append(strD);
        sb.append(str6);
        sb.append("\r\nContent-Disposition: form-data; name=\"label\"\r\n\r\n");
        sb.append(str3);
        sb.append(strD);
        sb.append(str6);
        sb.append("\r\nContent-Disposition: form-data; name=\"key\"\r\n\r\n");
        sb.append(str4);
        sb.append(strD);
        sb.append(str6);
        sb.append("--\r\n\r\n");
        try {
            return okHttpClient.newCall(new Request.Builder().url(str).post(RequestBody.create(mediaType, sb.toString())).addHeader("User-Agent", "").addHeader("token", str5).addHeader("content-type", "multipart/form-data; boundary=" + str6).build()).execute().body().string();
        } catch (IOException e) {
            System.out.println("777" + e);
            return "解析失败";
        }
    }

    public static String formUploadV5(String str, String str2, String str3, String str4, String str5, String str6) {
        OkHttpClient okHttpClient = new OkHttpClient();
        String str7 = "--dio-boundary-" + getRandomNickname(10);
        MediaType mediaType = MediaType.parse("multipart/form-data; " + str7);
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(str7);
        sb.append("\r\nContent-Disposition: form-data; name=\"play_url\"\r\n\r\n");
        sb.append(str2);
        String strB = "\r\n--";
        sb.append(strB);
        sb.append(str7);
        sb.append("\r\nContent-Disposition: form-data; name=\"label\"\r\n\r\n");
        sb.append(str3);
        sb.append(strB);
        sb.append(str7);
        sb.append("\r\nContent-Disposition: form-data; name=\"key\"\r\n\r\n");
        sb.append(str4);
        sb.append(strB);
        sb.append(str7);
        sb.append("\r\nContent-Disposition: form-data; name=\"sign\"\r\n\r\n");
        sb.append(str5);
        sb.append(strB);
        sb.append(str7);
        sb.append("--\r\n\r\n");
        try {
            return okHttpClient.newCall(new Request.Builder().url(str).post(RequestBody.create(mediaType, sb.toString())).addHeader("token", str6).addHeader("User-Agent", "Dart/2.19 (dart:io)").addHeader("appto-local-uuid", l8).addHeader("content-type", "multipart/form-data; boundary=" + str7).build()).execute().body().string();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getRandomNickname(int i) {
        Random random = new Random();
        String str = "";
        for (int i2 = 0; i2 < i; i2++) {
            str = str + String.valueOf(random.nextInt(10));
        }
        return str;
    }

    private void l8() {
        JSONObject jSONObject = new JSONObject(xv.S(this.N.substring(1), this.A));
        this.tT = jSONObject.optString("key");
        l8 = jSONObject.optString("uuid");
        this.b = jSONObject.optString("iv");
        this.HM = jSONObject.optString("signurl");
        this.n = jSONObject.optString("appname");
        String strE = "token";
        if (jSONObject.has(strE)) {
            this.v = jSONObject.optString(strE);
        }
        HashMap map = new HashMap();
        map.put("User-Agent", "Dart/3.0 (dart:io)");
        String strV = Yy.v(jSONObject.optString("config"), map);
        StringBuilder sb = new StringBuilder();
        JSONObject jSONObject2 = new JSONObject(strV);
        String strE2 = "domain";
        sb.append(jSONObject2.optString(strE2));
        sb.append(jSONObject.optString("api"));
        this.S = sb.toString();
        this.T4 = new JSONObject(strV).optString(strE2) + jSONObject.optString("configurl");
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strC = "vod_remarks";
        String strE = "vod_pic";
        String strD = "vod_name";
        String strE2 = "vod_id";
        String strB = "total";
        String strD2 = "class";
        String strB2 = "year";
        String strB3 = "area";
        String strC2 = "type";
        try {
            if (this.S.isEmpty()) {
                l8();
            }
            JSONObject jSONObject2 = new JSONObject();
            String str3 = this.S + "/vod/lists";
            if (map == null) {
                map = new HashMap<>();
            }
            if (!map.containsKey(strB3)) {
                map.put(strB3, "");
            }
            if (!map.containsKey(strC2)) {
                map.put(strC2, "");
            }
            if (!map.containsKey(strB2)) {
                map.put(strB2, "");
            }
            if (!map.containsKey(strD2)) {
                map.put(strD2, "");
            }
            JSONObject jSONObject3 = new JSONObject(Yy.v(((((((((str3 + "?type_id=" + str) + "&area=" + map.get(strB3)) + com.github.catvod.parser."&lang=") + "&year=" + map.get(strB2)) + "&order=time") + "&type_name=" + map.get(strC2)) + "&page=" + str2) + "&pageSize=21") + "&__platform=android&sign=" + b(strC2), T4("")));
            int i8 = jSONObject3.getInt("ENCRYPTION");
            String strE3 = "data";
            JSONObject jSONObject;
            if (i8 != 0) {
                String strS = xv.S(b("dec").substring(1), this.A);
                jSONObject = new JSONObject(C1370pv.v(lE.S(jSONObject3.optString(strE3).replace("##d/", "H4sIAAAAAAAAA")), new JSONObject(strS).optString("key"), new JSONObject(strS).optString("iv")));
            } else {
                jSONObject = new JSONObject(jSONObject3.optString(strE3));
            }
            JSONArray jSONArray = jSONObject.getJSONArray(strE3);
            JSONArray jSONArray2 = new JSONArray();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i11);
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put(strE2, jSONObjectOptJSONObject.optString(strE2));
                jSONObject5.put(strD, jSONObjectOptJSONObject.optString(strD));
                jSONObject5.put(strE, jSONObjectOptJSONObject.optString(strE));
                jSONObject5.put(strC, jSONObjectOptJSONObject.optString(strC));
                jSONArray2.put(jSONObject5);
            }
            int i14 = jSONObject.getInt(strB);
            jSONObject2.put("page", str2);
            jSONObject2.put("pagecount", i14 / 21);
            jSONObject2.put(com.github.catvod.parser."limit", 21);
            jSONObject2.put(strB, i14);
            jSONObject2.put("list", jSONArray2);
            return jSONObject2.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public String detailContent(List<String> list) {
        String strC = "player_info";
        String strD = "$$$";
        String strE = "vod_content";
        String strE2 = "vod_director";
        String strE3 = "vod_actor";
        String strB = "vod_remarks";
        String strB2 = com.github.catvod.parser."vod_area";
        String strE4 = "vod_year";
        String strB3 = "vod_pic";
        String strB4 = "vod_name";
        String strE5 = "vod_id";
        try {
            if (this.S.isEmpty()) {
                l8();
            }
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject(Yy.v(this.S + "/vod/getVod?id=" + list.get(0) + "&__platform=android&sign=" + b("detail"), T4("")));
            int i2 = jSONObject4.getInt("ENCRYPTION");
            String strC2 = "data";
            JSONObject jSONObject;
            if (i2 != 0) {
                try {
                    String strS = xv.S(b("dec").substring(1), this.A);
                    jSONObject = new JSONObject(C1370pv.v(lE.S(jSONObject4.optString(strC2).replace("##d/", "H4sIAAAAAAAAA")), new JSONObject(strS).optString("key"), new JSONObject(strS).optString("iv")));
                } catch (Throwable th) {
                    return "";
                }
            } else {
                jSONObject = new JSONObject(jSONObject4.optString(strC2));
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            jSONObject2.put(strE5, jSONObject.optString(strE5));
            jSONObject2.put(strB4, jSONObject.optString(strB4));
            jSONObject2.put(strB3, jSONObject.optString(strB3));
            jSONObject2.put("type_name", jSONObject.optString("vod_class"));
            jSONObject2.put(strE4, jSONObject.optString(strE4));
            jSONObject2.put(strB2, jSONObject.optString(strB2));
            jSONObject2.put(strB, jSONObject.optString(strB));
            jSONObject2.put(strE3, jSONObject.optString(strE3));
            jSONObject2.put(strE2, jSONObject.optString(strE2));
            jSONObject2.put(strE, "此接口完全免费，请勿上当受骗！！" + jSONObject.optString(strE));
            JSONArray jSONArray = jSONObject.getJSONArray("vod_play_list");
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i6);
                String strOptString = jSONObjectOptJSONObject.optJSONObject(strC).optString("show");
                String strOptString2 = jSONObjectOptJSONObject.optJSONObject(strC).optString("from");
                if (!strOptString.contains("有广告")) {
                    ArrayList arrayList3 = new ArrayList();
                    JSONArray jSONArray2 = jSONObjectOptJSONObject.getJSONArray("urls");
                    for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                        JSONObject jSONObjectOptJSONObject2 = jSONArray2.optJSONObject(i10);
                        arrayList3.add(jSONObjectOptJSONObject2.optString(com.github.catvod.parser."name") + "$" + jSONObjectOptJSONObject2.optString("url") + "&" + strOptString2);
                    }
                    if (!arrayList3.isEmpty()) {
                        arrayList.add(strOptString);
                        arrayList2.add(TextUtils.join("#", arrayList3));
                    }
                }
            }
            String strJoin = TextUtils.join(strD, arrayList);
            String strJoin2 = TextUtils.join(strD, arrayList2);
            jSONObject2.put("vod_play_from", strJoin);
            jSONObject2.put("vod_play_url", strJoin2);
            JSONArray jSONArray3 = new JSONArray();
            jSONArray3.put(jSONObject2);
            jSONObject3.put("list", jSONArray3);
            return jSONObject3.toString();
        } catch (Throwable th2) {
            return "";
        }
    }

    public String homeContent(boolean z) {
        JSONArray jSONArray;
        String strE = "cate";
        try {
            if (this.S.isEmpty()) {
                l8();
            }
            String strV = Yy.v(this.T4 + "&sign=" + b("config"), T4(""));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            JSONObject jSONObject2 = new JSONObject(strV);
            int i2 = jSONObject2.getInt(com.github.catvod.parser."ENCRYPTION");
            String strC = "get_home_cate";
            String strE2 = "data";
            if (i2 != 0) {
                String strS = xv.S(b("dec").substring(1), this.A);
                jSONArray = new JSONObject(C1370pv.v(lE.S(jSONObject2.optString(strE2).replace("##d/", "H4sIAAAAAAAAA")), new JSONObject(strS).optString("key"), new JSONObject(strS).optString("iv"))).getJSONArray(strC);
            } else {
                jSONArray = new JSONObject(jSONObject2.optString(strE2)).getJSONArray(strC);
            }
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i5);
                if (jSONObjectOptJSONObject.has(strE)) {
                    this.OL = jSONObjectOptJSONObject.optString("id");
                    this.l = jSONObjectOptJSONObject.optString("mold");
                } else {
                    JSONObject jSONObject3 = new JSONObject();
                    String strB = "type_id";
                    if (jSONObjectOptJSONObject.has(strE)) {
                        jSONObject3.put(strB, jSONObjectOptJSONObject.optString(strE));
                    } else {
                        jSONObject3.put(strB, jSONObjectOptJSONObject.optString("id"));
                    }
                    jSONObject3.put("type_name", jSONObjectOptJSONObject.optString("title"));
                    jSONArray2.put(jSONObject3);
                }
            }
            jSONObject.put("class", jSONArray2);
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
        JSONArray jSONArray;
        String strE = "vod_remarks";
        String strB = "vod_pic";
        String strE2 = "vod_name";
        String strB2 = "vod_id";
        try {
            JSONObject jSONObject = new JSONObject(Yy.v(this.S + "/home/data?id=" + this.OL + "&mold=" + this.l + "&__platform=android&sign=" + b("home"), T4("")));
            JSONArray jSONArray2 = new JSONArray();
            int i = jSONObject.getInt("ENCRYPTION");
            String strB3 = "items";
            String strB4 = com.github.catvod.parser."sections";
            String strE3 = "data";
            if (i != 0) {
                String strS = xv.S(b("dec").substring(1), this.A);
                jSONArray = new JSONObject(C1370pv.v(lE.S(jSONObject.optString(strE3).replace("##d/", "H4sIAAAAAAAAA")), new JSONObject(strS).optString("key"), new JSONObject(strS).optString("iv"))).getJSONArray(strB4).optJSONObject(1).getJSONArray(strB3);
            } else {
                jSONArray = new JSONObject(jSONObject.optString(strE3)).getJSONArray(strB4).optJSONObject(1).getJSONArray(strB3);
            }
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i4);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(strB2, jSONObjectOptJSONObject.optString(strB2));
                jSONObject2.put(strE2, jSONObjectOptJSONObject.optString(strE2));
                jSONObject2.put(strB, jSONObjectOptJSONObject.optString(strB));
                jSONObject2.put(strE, jSONObjectOptJSONObject.optString(strE));
                jSONArray2.put(jSONObject2);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("list", jSONArray2);
            return jSONObject3.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context, str);
        this.N = Yy.v(C1370pv.l(str), S());
    }

    public String playerContent(String str, String str2, List<String> list) {
        // TODO: Method not decompiled by JADX - needs manual reconstruction
        return "";
    }

    public String searchContent(String str, boolean z) {
        JSONArray jSONArray;
        String strE = "vod_remarks";
        String strC = "vod_pic";
        String strB = "vod_name";
        String strE2 = "vod_id";
        try {
            if (this.S.isEmpty()) {
                l8();
            }
            JSONObject jSONObject = new JSONObject();
            String strV = Yy.v(this.S + "/search/lists?wd=" + URLEncoder.encode(str) + "&page=1&type=&__platform=android&sign=" + b("search"), T4(""));
            JSONArray jSONArray2 = new JSONArray();
            JSONObject jSONObject2 = new JSONObject(strV);
            int i2 = jSONObject2.getInt(com.github.catvod.parser."ENCRYPTION");
            String strB2 = "data";
            if (i2 != 0) {
                String strS = xv.S(b("dec").substring(1), this.A);
                jSONArray = new JSONObject(C1370pv.v(lE.S(jSONObject2.optString(strB2).replace("##d/", "H4sIAAAAAAAAA")), new JSONObject(strS).optString("key"), new JSONObject(strS).optString("iv"))).getJSONArray(strB2);
            } else {
                jSONArray = new JSONObject(jSONObject2.optString(strB2)).getJSONArray(strB2);
            }
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i5);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(strE2, jSONObjectOptJSONObject.optString(strE2));
                jSONObject3.put(strB, jSONObjectOptJSONObject.optString(strB));
                jSONObject3.put(strC, jSONObjectOptJSONObject.optString(strC));
                jSONObject3.put(strE, jSONObjectOptJSONObject.optString(strE));
                jSONArray2.put(jSONObject3);
            }
            jSONObject.put("list", jSONArray2);
            return jSONObject.toString();
        } catch (Throwable th) {
            return "";
        }
    }
}
