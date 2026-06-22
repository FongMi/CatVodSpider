package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.Iw;
import com.github.catvod.spider.merge.YS;
import com.github.catvod.spider.merge.Yy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dygang extends Spider {

    private static final short[] f28short = {2863, 2856, 2908, 2899, 2859, 2857, 2863, 1274, 1166, 1153, 1273, 1275, 1363, 1292, 1296, 1309, 1285, 1363, 1364, 1312, 1327, 1367, 1365, 1363, 1108, 1026, 1032, 1108, 1042, 1045, 1055, 1054, 1027, 1060, 1107, 1063, 1055, 1104, 1106, 1109, 1043, 1039, 1046, 1467, 1466, 1448, 1475, 1494, 2215, 2210, 2290, 2291, 2289, 2290, 2657, 2631, 2641, 2630, 2585, 2677, 2643, 2641, 2650, 2624, 3067, 3033, 3020, 3039, 3034, 3034, 3031, 2969, 2947, 2968, 2950, 2966, 2974, 3041, 3039, 3032, 3026, 3033, 3009, 3013, 2966, 3064, 3042, 2966, 2951, 2950, 2968, 2950, 2957, 2966, 3041, 3039, 3032, 2944, 2946, 2957, 2966, 3022, 2944, 2946, 2975, 2966, 3063, 3014, 3014, 3034, 3027, 3041, 3027, 3028, 3069, 3039, 3010, 2969, 2947, 2949, 2945, 2968, 2949, 2944, 2966, 2974, 3069, 3070, 3042, 3067, 3066, 2970, 2966, 3034, 3039, 3037, 3027, 2966, 3057, 3027, 3029, 3037, 3033, 2975, 2966, 3061, 3038, 3012, 3033, 3035, 3027, 2969, 2951, 2951, 2950, 2968, 2950, 2968, 2950, 2968, 2950, 2966, 3045, 3031, 3024, 3031, 3012, 3039, 2969, 2947, 2949, 2945, 2968, 2949, 2944, 2966, 3059, 3026, 3025, 2969, 2951, 2951, 2950, 2968, 2950, 2968, 2951, 2947, 2958, 2945, 2968, 2947, 2945, 849, 893, 892, 870, 887, 892, 870, 831, 838, 875, 866, 887, 2844, 2829, 2829, 2833, 2836, 2846, 2844, 2825, 2836, 2834, 2835, 2898, 2821, 2896, 2826, 2826, 2826, 2896, 2843, 2834, 2831, 2832, 2896, 2824, 2831, 2833, 2840, 2835, 2846, 2834, 2841, 2840, 2841, 496, 466, 466, 468, 449, 453, 412, 500, 479, 466, 478, 469, 472, 479, 470, 1928, 1941, 1926, 1951, 1346, 1350, 1356, 3199, 3171, 3171, 3175, 3172, 3117, 3128, 3128, 3168, 3168, 3168, 3129, 3187, 3182, 3184, 3190, 3193, 3184, 3129, 3171, 3169, 3128, 865, 807, 800, 810, 811, 822, 864, 806, 826, 803, 2473, 2543, 2536, 2530, 2531, 2558, 2521, 2997, 3059, 3055, 3062, 1612, 1628, 1560, 1625, 1635, 1616, 1610, 1629, 1630, 1554, 1541, 1567, 1617, 1622, 1628, 1629, 1600, 1639, 1567, 1637, 714, 720, 711, 708, 2930, 22513, -27718, 25920, 28392, 27551, 23505, 26953, 26898, -32672, 32613, 30514, 28285, 23815, 544, 565, 566, 568, 561, 634, 566, 571, 550, 560, 561, 550, 613, 628, 565, 1864, 1861, 1885, 2144, 2145, 2160, 31899, 22209, 1179, 1154, 1161, 1202, 1156, 1161, 697, 672, 683, 656, 673, 686, 674, 682, 2684, 2661, 2670, 2645, 2682, 2659, 2665, 507, 482, 489, 466, 511, 488, 480, 492, 511, 486, 510, 1693, 1676, 1674, 1672, 2964, 2949, 2947, 2945, 2951, 2955, 2961, 2954, 2960, 2531, 2534, 2530, 2534, 2555, 2576, 2571, 2576, 2565, 2568, 2885, 2880, 2906, 2909, 2126, 2130, 2130, 2134, 2133, 2076, 2057, 2057, 2129, 2129, 2129, 2056, 2114, 2143, 2113, 2119, 2120, 2113, 2056, 2130, 2128, 1016, 1000, 943, 1000, 1001, 1000, 1001, 979, 1007, 995, 994, 1016, 1001, 994, 1016, 940, 997, 993, 1003, 2898, 2899, 2882, 2040, 2037, 2026, 1970, 2024, 2037, 2024, 2032, 2041, 1980, 2045, 1753, 1728, 1739, 1776, 1734, 1739, 2824, 2833, 2842, 2849, 2832, 2847, 2835, 2843, 1581, 1588, 1599, 1540, 1579, 1586, 1592, 2532, 2548, 2480, 2478, 2480, 2545, 2507, 2552, 2530, 2549, 2550, 2490, 2477, 2487, 2557, 2545, 2551, 2558, 2549, 2532, 2487, 2509, 2773, 2727, 2724, 3294, 3268, 3283, 3280, 1344, 2351, 2358, 2365, 2310, 2345, 2357, 2360, 2336, 2310, 2367, 2347, 2358, 2356, 31896, 22236, 26498, 3166, 3143, 3148, 3191, 3160, 3140, 3145, 3153, 3191, 3165, 3162, 3140, 2407, 2402, 2424, 2431, 3102, 3098, 3088, 1119, 1091, 1091, 1095, 1092, 1037, 1048, 1048, 1088, 1088, 1088, 1049, 1107, 1102, 1104, 1110, 1113, 1104, 1049, 1091, 1089, 2336, 2352, 2394, 2326, 2323, 2393, 2322, 2328, 2321, 2321, 2304, 2388, 2325, 2349, 2359, 2336, 2339, 21564, 20646, 28407, 27719, 31938, 22150, 30803, 22500, -25532, 26777, 21501, -27571, 28725, 23153, 30441, 22878, 26121, 31329, 2696, 2807, -28572, 25785, 22918, -28169, 25898, 22704, 32247, 24989, -27759, 22047, 32317, 21460, 31426, -31164, 23094, 26549, 2517, 2466, 31955, 22167, 29898, 21813, 30759, 3184, 3197, 3188, 3169, 3163, 3181, 3168, 481, 492, 485, 496, 458, 507, 500, 504, 496, 2945, 2958, 2955, 2963, 2946, 2965, 2964, 1778, 1789, 1776, 1762, 1762, 1025, 1044, 1047, 1049, 1040, 1115, 1047, 1050, 1031, 1041, 1040, 1031, 1092, 1109, 1044, 1873, 1884, 1860, 1843, 1842, 1827, 29332, 22734, 261, 284, 279, 300, 282, 279, 2628, 2653, 2646, 2669, 2652, 2643, 2655, 2647, 1027, 1050, 1041, 1066, 1029, 1052, 1046, 1728, 1753, 1746, 1769, 1732, 1747, 1755, 1751, 1732, 1757, 1733, 1821, 1816, 1794, 1797, 992, 953, 995, 1020, 964, 1018, 1003, 1003, 964, 1003, 1015, 1018, 994, 1022, 1001, 953, 929, 992, 953, 1000, 1011, 1012, 1004, 953, 929, 953, 1018, 1003, 1003, 21235, 24539, -30088, 25611, 953, 951, 953, 1023, 1022, 1000, 953, 929, 953, 953, 951, 953, 1003, 1000, 953, 929, 953, 1003, 1018, 1001, 1000, 1022, 953, 929, 953, 1011, 1007, 1007, 1003, 1000, 929, 967, 948, 967, 948, 1004, 1004, 1004, 949, 995, 950, 1013, 949, 1016, 1016, 967, 948, 1018, 1003, 1010, 949, 1003, 1011, 1003, 932, 1006, 1001, 1015, 934, 953, 998, 951, 953, 1003, 1003, 1018, 994, 1006, 1013, 937, 953, 929, 992, 953, 1000, 1011, 1012, 1004, 953, 929, 953, 19848, 32036, 13274, 953, 951, 953, 1023, 1022, 1000, 953, 929, 953, 1003, 1003, 19722, 953, 951, 953, 1003, 1000, 953, 929, 953, 939, 953, 951, 953, 1003, 1018, 1001, 1000, 1022, 953, 929, 953, 1011, 1007, 1007, 1003, 1000, 929, 967, 948, 967, 948, 1018, 1003, 1003, 949, 1017, 1018, 1013, 1004, 1015, 949, 1016, 1012, 1014, 967, 948, 1000, 1007, 1018, 1007, 1010, 1016, 967, 948, 1003, 1015, 1018, 994, 1022, 1001, 967, 948, 932, 1006, 1001, 1015, 934, 953, 998, 951, 953, 1003, 1003, 1018, 994, 1006, 1013, 953, 929, 992, 953, 1000, 1011, 1012, 1004, 953, 929, 953, 19867, 32036, 13274, 953, 951, 953, 1023, 1022, 1000, 953, 929, 953, 1003, 1003, 19722, 953, 951, 953, 1003, 1000, 953, 929, 953, 939, 953, 951, 953, 1003, 1018, 1001, 1000, 1022, 953, 929, 953, 1011, 1007, 1007, 1003, 1000, 929, 967, 948, 967, 948, 1018, 1003, 1003, 949, 1017, 1018, 1013, 1004, 1015, 949, 1016, 1012, 1014, 967, 948, 1000, 1007, 1018, 1007, 1010, 1016, 967, 948, 1003, 1015, 1018, 994, 1022, 1001, 967, 948, 932, 1006, 1001, 1015, 934, 953, 998, 951, 953, 1010, 1013, 1023, 1022, 995, 953, 929, 992, 953, 1000, 1011, 1012, 1004, 953, 929, 953, 22225, 28790, 19722, 953, 951, 953, 1023, 1022, 1000, 953, 929, 953, 1011, 1007, 1007, 1003, 929, 967, 948, 967, 948, 994, 1006, 1013, 949, 1017, 1018, 1013, 1004, 1015, 949, 1016, 1012, 1014, 953, 951, 953, 1003, 1000, 953, 929, 953, 938, 953, 951, 953, 1003, 1018, 1001, 1000, 1022, 953, 929, 953, 1011, 1007, 1007, 1003, 1000, 929, 967, 948, 967, 948, 1018, 1003, 1003, 949, 1017, 1018, 1013, 1004, 1015, 949, 1016, 1012, 1014, 967, 948, 1000, 1007, 1018, 1007, 1010, 1016, 967, 948, 1003, 1015, 1018, 994, 1022, 1001, 967, 948, 932, 1006, 1001, 1015, 934, 953, 998, 951, 953, 1023, 1012, 1013, 1020, 1014, 1018, 1013, 1014, 1010, 1018, 1012, 953, 929, 992, 953, 1000, 1011, 1012, 1004, 953, 929, 953, 20787, 27824, 22062, 953, 951, 953, 1023, 1022, 1000, 953, 929, 953, 953, 951, 953, 1003, 1000, 953, 929, 953, 939, 953, 951, 953, 1003, 1018, 1001, 1000, 1022, 953, 929, 953, 953, 998, 951, 953, 1017, 1010, 1015, 1010, 1017, 1010, 1015, 1010, 953, 929, 992, 953, 1000, 1011, 1012, 1004, 953, 929, 953, 1017, 1010, 1015, 1010, 1017, 1010, 1015, 1010, 953, 951, 953, 1023, 1022, 1000, 953, 929, 953, 953, 951, 953, 1003, 1000, 953, 929, 953, 939, 953, 951, 953, 1003, 1018, 1001, 1000, 1022, 953, 929, 953, 953, 998, 951, 953, 1016, 994, 1016, 1003, 953, 929, 992, 953, 1000, 1011, 1012, 1004, 953, 929, 953, 20787, 27824, 13274, 953, 951, 953, 1023, 1022, 1000, 953, 929, 953, 953, 951, 953, 1003, 1000, 953, 929, 953, 939, 953, 951, 953, 1003, 1018, 1001, 1000, 1022, 953, 929, 953, 953, 998, 951, 953, 1023, 1003, 953, 929, 992, 953, 1000, 1011, 1012, 1004, 953, 929, 953, 23714, 24014, 953, 951, 953, 1023, 1022, 1000, 953, 929, 953, 953, 951, 953, 1003, 1000, 953, 929, 953, 939, 953, 951, 953, 1003, 1018, 1001, 1000, 1022, 953, 929, 953, 953, 998, 951, 953, 1002, 1010, 994, 1010, 953, 929, 992, 953, 1000, 1011, 1012, 1004, 953, 929, 953, 29098, 23260, -32287, -30115, 953, 951, 953, 1023, 1022, 1000, 953, 929, 953, 953, 951, 953, 1003, 1000, 953, 929, 953, 939, 953, 951, 953, 1003, 1018, 1001, 1000, 1022, 953, 929, 953, 953, 998, 951, 953, 1002, 1002, 953, 929, 992, 953, 1000, 1011, 1012, 1004, 953, 929, 953, -32027, -30668, -30115, -25846, 953, 951, 953, 1023, 1022, 1000, 953, 929, 953, 953, 951, 953, 1003, 1000, 953, 929, 953, 939, 953, 951, 953, 1003, 1018, 1001, 1000, 1022, 953, 929, 953, 953, 998, 998, 1519, 1511, 1526, 1514, 1517, 1510, 916, 918, 903, 2571, 2605, 2619, 2604, 2675, 2591, 2617, 2619, 2608, 2602, 1025, 1059, 1078, 1061, 1056, 1056, 1069, 1123, 1145, 1122, 1148, 1132, 1124, 1025, 1069, 1071, 1061, 1058, 1080, 1059, 1087, 1060, 1143, 1132, 1029, 1058, 1080, 1065, 1056, 1132, 1025, 1069, 1071, 1132, 1027, 1055, 1132, 1044, 1132, 1149, 1148, 1043, 1149, 1145, 1043, 1147, 1125, 1132, 1037, 1084, 1084, 1056, 1065, 1051, 1065, 1070, 1031, 1061, 1080, 1123, 1145, 1151, 1147, 1122, 1151, 1146, 1132, 1124, 1031, 1028, 1048, 1025, 1024, 1120, 1132, 1056, 1061, 1063, 1065, 1132, 1035, 1065, 1071, 1063, 1059, 1125, 1132, 1039, 1060, 1086, 1059, 1057, 1065, 1123, 1141, 1149, 1122, 1148, 1122, 1144, 1144, 1147, 1150, 1122, 1149, 1149, 1144, 1132, 1055, 1069, 1066, 1069, 1086, 1061, 1123, 1145, 1151, 1147, 1122, 1151, 1146, 1550, 1580, 1580, 1578, 1599, 1595, 1118, 1103, 1106, 1118, 1029, 1090, 1118, 1095, 1094, 1030, 1099, 1114, 1114, 1094, 1091, 1097, 1099, 1118, 1091, 1093, 1092, 1029, 1106, 1090, 1118, 1095, 1094, 1025, 1106, 1095, 1094, 1030, 1099, 1114, 1114, 1094, 1091, 1097, 1099, 1118, 1091, 1093, 1092, 1029, 1106, 1095, 1094, 1041, 1115, 1047, 1050, 1028, 1043, 1030, 1091, 1095, 1099, 1101, 1103, 1029, 1099, 1116, 1091, 1100, 1030, 1091, 1095, 1099, 1101, 1103, 1029, 1117, 1103, 1096, 1114, 1030, 1091, 1095, 1099, 1101, 1103, 1029, 1099, 1114, 1092, 1101, 1030, 1024, 1029, 1024, 1041, 1115, 1047, 1050, 1028, 1042, 1030, 1099, 1114, 1114, 1094, 1091, 1097, 1099, 1118, 1091, 1093, 1092, 1029, 1113, 1091, 1101, 1092, 1103, 1102, 1031, 1103, 1106, 1097, 1090, 1099, 1092, 1101, 1103, 1041, 1116, 1047, 1096, 1049, 1041, 1115, 1047, 1050, 1028, 1043, 2976, 2946, 2946, 2948, 2961, 2965, 3020, 2989, 2944, 2959, 2950, 2964, 2944, 2950, 2948, 1031, 1045, 1104, 1086, 1075, 1105, 1031, 1045, 1094, 1036, 1088, 1101, 1107, 1092, 2378, 2423, 2412, 2402, 2412, 2411, 567, 555, 555, 559, 556, 613, 624, 624, 552, 552, 552, 625, 571, 550, 568, 574, 561, 568, 625, 555, 553, 260, 277, 262, 263, 273, 2795, 2807, 2810, 2786, 2766, 2793, 2807, 3196, 3195, 3173, 2220, 2216, 2210, 1495, 1490, 1480, 1487, 2431, 2403, 2403, 2407, 2404, 2349, 2360, 2360, 2400, 2400, 2400, 2361, 2419, 2414, 2416, 2422, 2425, 2416, 2361, 2403, 2401, 2360, 2418, 2360, 2404, 2418, 2422, 2405, 2420, 2431, 2360, 2430, 2425, 2419, 2418, 2415, 2342, 2341, 2340, 2361, 2407, 2431, 2407, 1135, 1121, 1149, 1126, 1131, 1125, 1142, 1120, 1637, 1635, 1652, 1659, 1663, 1634, 27958, 2305, 29704, 2173, 2150, 2145, 2169, 1957, 1976, 1957, 1981, 1972, 2045, 1954, 1980, 1968, 1981, 1981, 1957, 1972, 1961, 1957, 3303, 3318, 3326, 3299, 3322, 3319, 3029, 769, 791, 795, 788, 792, 784, 1999, 2012, 2010, 1991, 1997, 1986, 1995, 23649, -30603, 2376, 2388, 2388, 2384, 2387, 2330, 2319, 2319, 2391, 2391, 2391, 2318, 2372, 2393, 2375, 2369, 2382, 2375, 2318, 2388, 2390, 2319, 2373, 2319, 2387, 2373, 2369, 2386, 2371, 2376, 2319, 1275, 1262, 1261, 1251, 1258, 1185, 1261, 1248, 1277, 1259, 1258, 1277, 1214, 1199, 1262, 257, 268, 276, 3193, 3192, 3177, 31489, 20827, 721, 715, 732, 735, 1638, 1663, 1652, 1615, 1657, 1652, 1064, 1073,
    1082, 1025, 1072, 1087, 1075, 1083, 286, 263, 268, 311, 280, 257, 267, 907, 914, 921, 930, 911, 920, 912, 924, 911, 918, 910};
    private JSONObject S;
    private JSONObject l8;
    private Pattern T4 = Pattern.compile("/(\\S+)/");
    private Pattern b = Pattern.compile("(\\S+)");
    private Pattern OL = Pattern.compile("/play/(\\S+)/");
    private Pattern l = Pattern.compile("/ys/index_(\\d+).htm");

    public Dygang() {
    }

    public static String utf8ToGbk(String str) throws UnsupportedEncodingException {
        byte[] bytes = str.getBytes("UTF-8");
        return new String(bytes, "gb2312");
    }

    protected HashMap<String, String> S(String str) {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36 Edg/110.0.1587.57");
        map.put("Content-Type", "application/x-www-form-urlencoded");
        map.put("Accept-Encoding", "gzip");
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        int page;
        int pagecount;
        int length;
        try {
            int pageNum = Integer.parseInt(str2);
            String baseUrl = "https://www.dygang.tv/";
            String url = (pageNum != 1) ? baseUrl + str + "/index_" + str2 + ".htm" : baseUrl + str + "/index.htm";
            String strS = Yy.s(url, l8(url));
            g9 doc = YS.l8(strS);
            JSONObject jSONObject = new JSONObject();
            jk paginationLinks = doc.LD("td a[href*='index_']");
            int size = paginationLinks.size();
            if (size != 0) {
                int currentPage = -1;
                int totalPages = 0;
                for (int idx = 0; idx < paginationLinks.size(); idx++) {
                    Iw iwPu = paginationLinks.get(idx).pu(com.github.catvod.parser."a");
                    if (iwPu != null) {
                        String linkText = iwPu.GO();
                        Matcher matcher = this.l.matcher(iwPu.T4("href"));
                        if (matcher.find()) {
                            int parsed = Integer.parseInt(matcher.group(1));
                            if (linkText.equals("尾页")) {
                                totalPages = parsed;
                            } else if (currentPage == -1) {
                                currentPage = parsed - 1;
                            }
                        }
                    }
                }
                page = (currentPage != -1) ? currentPage : pageNum;
                pagecount = totalPages;
            } else {
                page = pageNum;
                pagecount = pageNum;
            }
            JSONArray jSONArray = new JSONArray();
            if (!strS.contains("没有找到您想要的结果哦")) {
                jk items = doc.LD("table.border1 a");
                for (int idx2 = 0; idx2 < items.size(); idx2++) {
                    Iw iw = items.get(idx2);
                    String vodName = iw.LD("img").l8("alt");
                    String vodPic = iw.LD("img").l8("src");
                    Matcher matcher2 = this.VodCategory.matcher(iw.T4("href"));
                    if (matcher2.find()) {
                        JSONObject item = new JSONObject();
                        item.put("vod_id", matcher2.group(1));
                        item.put("vod_name", vodName);
                        item.put("vod_pic", vodPic);
                        item.put("vod_remarks", "磁力");
                        jSONArray.put(item);
                    }
                }
            }
            jSONObject.put("page", page);
            jSONObject.put("pagecount", pagecount);
            jSONObject.put("limit", 8);
            if (pagecount <= 1) {
                length = jSONArray.length();
            } else {
                length = pagecount * 8;
            }
            jSONObject.put("total", length);
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String detailContent(List<String> list) {
        try {
            String url = "https://www.dygang.tv" + list.get(0);
            g9 doc = YS.l8(Yy.s(url, l8(url)));
            JSONObject result = new JSONObject();
            JSONObject vod = new JSONObject();
            String vodPic = doc.LD("td#dede_content img").l8("src");
            String vodName = doc.LD(com.github.catvod.parser."div.title a").OL();
            vod.put("vod_id", list.get(0));
            vod.put("vod_name", vodName);
            vod.put("vod_pic", vodPic);
            jk magnetLinks = doc.LD("td > a[href*='magnet']");
            ArrayList<String> playParts = new ArrayList<>();
            for (int i = 0; i < magnetLinks.size(); i++) {
                Iw iw = magnetLinks.get(i);
                playParts.add(iw.GO().split("\\.")[0] + "$" + iw.T4("href"));
            }
            String playUrl = (playParts.size() > 0) ? TextUtils.join("#", playParts) : "";
            vod.put("vod_play_from", "电影港");
            vod.put("vod_play_url", playUrl);
            JSONArray list2 = new JSONArray();
            list2.put(vod);
            result.put("list", list2);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String homeContent(boolean z) {
        String imgSelector = com.github.catvod.parser."img";
        String hrefSelector = com.github.catvod.parser."href";
        String baseUrl = "https://www.dygang.tv";
        try {
            g9 doc = YS.l8(Yy.s(baseUrl, l8(baseUrl)));
            jk navLinks = doc.LD(com.github.catvod.parser."TD.bg-fleet a");
            JSONArray categories = new JSONArray();
            Iterator<Iw> it = navLinks.iterator();
            while (it.hasNext()) {
                Iw next = it.next();
                String linkText = next.GO();
                if (linkText.equals("国剧") || linkText.equals("最新电影") || linkText.equals("经典高清")
                        || linkText.equals("国配电影") || linkText.equals("经典港片") || linkText.equals("4K高清区")
                        || linkText.equals("高清原盘") || linkText.equals("日韩剧") || linkText.equals("美剧")
                        || linkText.equals(com.github.catvod.parser."综艺") || linkText.equals("动漫")
                        || linkText.equals("3D电影") || linkText.equals("纪录片")) {
                    Matcher matcher = this.T4.matcher(next.T4(hrefSelector));
                    if (matcher.find()) {
                        JSONObject cat = new JSONObject();
                        cat.put("type_id", matcher.group(1).trim());
                        cat.put("type_name", linkText);
                        categories.put(cat);
                    }
                }
            }
            JSONObject result = new JSONObject();
            if (z) {
                result.put("filters", this.S);
            }
            result.put("class", categories);
            JSONArray list = new JSONArray();
            jk items = doc.LD("table.border1 a");
            for (int i = 0; i < items.size(); i++) {
                Iw iw = items.get(i);
                String vodName = iw.LD(imgSelector).l8("alt");
                String vodPic = iw.LD(imgSelector).l8("src");
                Matcher matcher2 = this.VodCategory.matcher(iw.T4(hrefSelector));
                if (matcher2.find()) {
                    JSONObject item = new JSONObject();
                    item.put("vod_id", matcher2.group(1));
                    item.put("vod_name", vodName);
                    item.put("vod_pic", vodPic);
                    item.put("vod_remarks", "磁力");
                    list.put(item);
                }
            }
            result.put("list", list);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public void init(Context context) throws Exception {
        super.init(context);
        try {
            this.l8 = new JSONObject("{\"xg_app_player\":{\"show\":\"app全局解析\",\"des\":\"\",\"ps\":\"1\",\"parse\":\"https:\\/\\/www.x-n.cc\\/api.php?url=\"},\"ppayun2\":{\"show\":\"专线ぁ\",\"des\":\"pp云\",\"ps\":\"0\",\"parse\":\"https:\\/\\/app.banwl.com\\/static\\/player\\/?url=\"},\"ppayun\":{\"show\":\"一线ぁ\",\"des\":\"pp云\",\"ps\":\"0\",\"parse\":\"https:\\/\\/app.banwl.com\\/static\\/player\\/?url=\"},\"index\":{\"show\":\"啊班云\",\"des\":\"http:\\/\\/yun.banwl.com\",\"ps\":\"1\",\"parse\":\"https:\\/\\/app.banwl.com\\/static\\/player\\/?url=\"},\"dongmanmiao\":{\"show\":\"动漫喵\",\"des\":\"\",\"ps\":\"0\",\"parse\":\"\"},\"bilibili\":{\"show\":\"bilibili\",\"des\":\"\",\"ps\":\"0\",\"parse\":\"\"},\"cycp\":{\"show\":\"动漫ぁ\",\"des\":\"\",\"ps\":\"0\",\"parse\":\"\"},\"dp\":{\"show\":\"弹幕\",\"des\":\"\",\"ps\":\"0\",\"parse\":\"\"},\"qiyi\":{\"show\":\"爱奇艺视\",\"des\":\"\",\"ps\":\"0\",\"parse\":\"\"},\"qq\":{\"show\":\"腾讯视频\",\"des\":\"\",\"ps\":\"0\",\"parse\":\"\"}}");
            this.S = new JSONObject("");
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
    }

    protected HashMap<String, String> l8(String str) {
        HashMap<String, String> map = new HashMap<>();
        map.put("method", "GET");
        map.put("Origin", "https://www.dygang.tv");
        map.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
        map.put("Accept-Language", "zh-CN,zh;q=0.9");
        map.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36");
        return map;
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            Init2.lj();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("parse", 0);
            jSONObject.put("playUrl", "");
            jSONObject.put("url", str2);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        JSONArray jSONArray = new JSONArray();
        try {
            String searchUrl = "https://www.dygang.tv/e/search/index123.php";
            HashMap<String, String> params = new HashMap<>();
            params.put("keyboard", str);
            params.put("submit", "搜+索");
            params.put("show", "title,smalltext");
            params.put("tempid", "1");
            params.put("tbname", "article");
            HashMap<String, String> headers = new HashMap<>();
            Yy.HM(Yy.l(), searchUrl, params, S(searchUrl), headers);
            String location = Yy.OL(headers);
            String resultUrl = "https://www.dygang.tv/e/search/" + location;
            jk items = YS.l8(Yy.s(resultUrl, l8(resultUrl))).LD("table.border1 a");
            for (int i = 0; i < items.size(); i++) {
                Iw iw = items.get(i);
                String vodName = iw.LD("img").l8("alt");
                String vodPic = iw.LD("img").l8("src");
                Matcher matcher = this.VodCategory.matcher(iw.T4("href"));
                if (matcher.find()) {
                    JSONObject item = new JSONObject();
                    item.put("vod_id", matcher.group(1));
                    item.put("vod_name", vodName);
                    item.put("vod_pic", vodPic);
                    item.put("vod_remarks", "磁力");
                    jSONArray.put(item);
                }
            }
            JSONObject result = new JSONObject();
            result.put("list", jSONArray);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
