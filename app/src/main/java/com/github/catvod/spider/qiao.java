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
import com.github.catvod.spider.merge.xv;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONObject;

public class qiao extends Spider {

    private static final short[] f1313short = {2157, 2120, 2139, 2141, 2054, 2075, 2055, 2072, 2064, 2057, 2049, 2125, 2120, 2139, 2141, 2067, 2112, 2118, 2048, 2702, 2701, 2700, 2695, 2700, 2695, 2694, 2699, 2695, 2700, 2696, 2697, 2701, 2695, 2700, 2696, 622, 584, 606, 585, 534, 634, 604, 606, 597, 591, 1065, 1036, 1055, 1049, 1090, 1118, 1091, 1117, 1101, 1093, 1033, 1036, 1055, 1049, 1111, 1028, 1026, 1092, 2732, 2698, 2716, 2699, 2772, 2744, 2718, 2716, 2711, 2701, 1598, 1573, 1569, 1583, 1572, 1057, 1057, 1128, 1125, 1123, 1057, 1134, 1123, 1145, 1122, 1128, 1133, 1150, 1141, 1057, 2507, 2515, 2506, 2514, 2511, 2518, 2503, 2516, 2514, 2441, 2496, 2505, 2516, 2507, 2443, 2498, 2503, 2514, 2503, 2461, 2438, 3162, 3162, 523, 524, 581, 617, 616, 626, 611, 616, 626, 555, 578, 623, 629, 630, 617, 629, 623, 626, 623, 617, 616, 572, 550, 608, 617, 628, 619, 555, 610, 615, 626, 615, 573, 550, 616, 615, 619, 611, 571, 548, 630, 618, 615, 639, 601, 627, 628, 618, 548, 523, 524, 523, 524, 3063, 3056, 3031, 3031, 2846, 2841, 2896, 2940, 2941, 2919, 2934, 2941, 2919, 2878, 2903, 2938, 2912, 2915, 2940, 2912, 2938, 2919, 2938, 2940, 2941, 2857, 2867, 2933, 2940, 2913, 2942, 2878, 2935, 2930, 2919, 2930, 2856, 2867, 2941, 2930, 2942, 2934, 2862, 2865, 2943, 2930, 2929, 2934, 2943, 2865, 2846, 2841, 2846, 2841, 2028, 2027, 1954, 1934, 1935, 1941, 1924, 1935, 1941, 1996, 1957, 1928, 1938, 1937, 1934, 1938, 1928, 1941, 1928, 1934, 1935, 2011, 1985, 1927, 1934, 1939, 1932, 1996, 1925, 1920, 1941, 1920, 2010, 1985, 1935, 1920, 1932, 1924, 2012, 1987, 1930, 1924, 1944, 1987, 2028, 2027, 2028, 2027, 2762, 2762, 2794, 2797, 2794, 2797, 1196, 1162, 1180, 1163, 1236, 1208, 1182, 1180, 1175, 1165, 1564, 1543, 1539, 1549, 1542, 732, 708, 733, 709, 728, 705, 720, 707, 709, 670, 727, 734, 707, 732, 668, 725, 720, 709, 720, 650, 657, 723, 734, 708, 735, 725, 720, 707, 712, 652, 1372, 1360, 1361, 1355, 1370, 1361, 1355, 1298, 1355, 1350, 1359, 1370, 1421, 1421, 1421, -28703, 24978, 24371, -29913, 859, 859, 786, 799, 793, 859, 788, 793, 771, 792, 786, 791, 772, 783, 859, 656, 648, 657, 649, 660, 653, 668, 655, 649, 722, 667, 658, 655, 656, 720, 665, 668, 649, 668, 710, 733, 2849, 2849, 1271, 1264, 1209, 1173, 1172, 1166, 1183, 1172, 1166, 1239, 1214, 1171, 1161, 1162, 1173, 1161, 1171, 1166, 1171, 1173, 1172, 1216, 1242, 1180, 1173, 1160, 1175, 1239, 1182, 1179, 1166, 1179, 1217, 1242, 1172, 1179, 1175, 1183, 1223, 1240, 1162, 1174, 1179, 1155, 1189, 1167, 1160, 1174, 1240, 1271, 1264, 1271, 1264, 2889, 2894, 2921, 2921, 696, 703, 758, 730, 731, 705, 720, 731, 705, 664, 753, 732, 710, 709, 730, 710, 732, 705, 732, 730, 731, 655, 661, 723, 730, 711, 728, 664, 721, 724, 705, 724, 654, 661, 731, 724, 728, 720, 648, 663, 729, 724, 727, 720, 729, 663, 696, 703, 696, 703, 2200, 2207, 2262, 2298, 2299, 2273, 2288, 2299, 2273, 2232, 2257, 2300, 2278, 2277, 2298, 2278, 2300, 2273, 2300, 2298, 2299, 2223, 2229, 2291, 2298, 2279, 2296, 2232, 2289, 2292, 2273, 2292, 2222, 2229, 2299, 2292, 2296, 2288, 2216, 2231, 2302, 2288, 2284, 2231, 2200, 2207, 2200, 2207, 2481, 2486, 2559, 2515, 2514, 2504, 2521, 2514, 2504, 2449, 2552, 2517, 2511, 2508, 2515, 2511, 2517, 2504, 2517, 2515, 2514, 2438, 2460, 2522, 2515, 2510, 2513, 2449, 2520, 2525, 2504, 2525, 2439, 2460, 2514, 2525, 2513, 2521, 2433, 2462, 2511, 2517, 2523, 2514, 2462, 2481, 2486, 2481, 2486, 1154, 1154, 1186, 1189, 1186, 1189, 2261, 2291, 2277, 2290, 2221, 2241, 2279, 2277, 2286, 2292, 3304, 3315, 3319, 3321, 3314, 2573, 2581, 2572, 2580, 2569, 2576, 2561, 2578, 2580, 2639, 2566, 2575, 2578, 2573, 2637, 2564, 2561, 2580, 2561, 2651, 2624, 2562, 2575, 2581, 2574, 2564, 2561, 2578, 2585, 2653, 864, 876, 877, 887, 870, 877, 887, 814, 887, 890, 883, 870, 514, 524, 528, 649, 658, 662, 664, 659, 1195, 1191, 1190, 1198, 1185, 1199, 2306, 2318, 2319, 2311, 2312, 2310, 2324, 2323, 2317, 259, 274, 267, 2924, 2890, 2908, 2891, 2836, 2936, 2910, 2908, 2903, 2893, 313, 284, 271, 265, 338, 334, 339, 333, 349, 341, 281, 284, 271, 265, 327, 276, 274, 340, 2876, 2871, 2869, 2873, 2865, 2870, 2950, 2945, 2975, 1769, 1776, 1787, 1728, 1773, 1786, 1778, 1790, 1773, 1780, 1772, 2613, 2604, 2599, 2588, 2611, 2602, 2592, 407, 398, 389, 446, 399, 384, 396, 388, 3018, 3027, 3032, 3043, 3029, 3032, 518, 541, 518, 531, 542, 2466, 2477, 2464, 2482, 2482, 2449, 2445, 2441, 2458, 2491, 2486, 2495, 2474, 1663, 1644, 1659, 1663, 684, 757, 748, 743, 684, 740, 742, 759, 719, 746, 752, 759, 752, 2639, 2564, 2569, 2560, 2581, 2607, 2585, 2580, 2637, 2522, 2461, 2446, 2457, 2461, 2497, 1905, 1851, 1846, 1849, 1840, 1898, 1160, 1239, 1227, 1231, 1244, 1171, 1731, 1674, 1687, 1665, 1664, 1687, 1752, 1681, 1676, 1672, 1664, 1062, 1140, 1145, 1136, 1125, 1119, 1134, 1121, 1133, 1125, 1085, 2371, 2325, 2308, 2306, 2304, 2392, 989, 907, 922, 924, 926, 936, 914, 897, 926, 966, 969, 970, 2264, 2259, 2270, 2255, 2244, 2253, 2249, 2260, 2258, 2259, 1002, 1007, 1018, 1007, 2068, 2073, 2059, 2060, 2087, 2056, 2073, 2079, 2077, 1988, 2001, 1990, 2027, 1988, 2005, 2003, 2001, 1007, 1022, 1016, 1018, 537, 520, 526, 524, 522, 518, 540, 519, 541, 3189, 3184, 3188, 3184, 3181, 3239, 3234, 3256, 3263, 1100, 1104, 1117, 1093, 1113, 1102, 1123, 1109, 1106, 1114, 1107, 1971, 1971, 1971, 2758, 2783, 2772, 2799, 2771, 2783, 2782, 2756, 2773, 2782, 2756, 1376, 1401, 1394, 1353, 1394, 1407, 1380, 1395, 1397, 1378, 1401, 1380, 660, 653, 646, 701, 643, 641, 662, 653, 656, 774, 799, 788, 815, 770, 789, 797, 785, 770, 795, 771, 756, 749, 742, 733, 739, 752, 743, 739, 2795, 2802, 2809, 2754, 2788, 2808, 2812, 2799, 869, 892, 887, 844, 867, 890, 880, 2882, 2907, 2896, 2923, 2906, 2901, 2905, 2897, 772, 797, 790, 813, 795, 790, 2381, 2324, 2317, 2310, 2381, 2309, 2311, 2326, 2356, 2317,
    2310, 2397, 2315, 2310, 2399, 301, 294, 299, 314, 305, 312, 316, 289, 295, 294, 3272, 3277, 3288, 3277, 1604, 1609, 1600, 1621, 1647, 1630, 1617, 1629, 1621, 1679, 1686, 1693, 1702, 1690, 1685, 1688, 1674, 1674, 2310, 2335, 2324, 2351, 2304, 2332, 2321, 2313, 2351, 2332, 2329, 2307, 2308, 2496, 2523, 2524, 2500, 611, 631, 618, 616, 26319, 24505, 21900, 1872, 1879, 1865, 1878, 2607, 2592, 2604, 2596, 3023, 1637, 1634, 1660, 2708, 1337, 2706, 2699, 2688, 2747, 2708, 2696, 2693, 2717, 2747, 2690, 2710, 2699, 2697, 2209, 2232, 2227, 2184, 2215, 2235, 2230, 2222, 2184, 2210, 2213, 2235, 1058, 1063, 1085, 1082, 878, 876, 889, 872, 688, 699, 694, 679, 684, 677, 673, 700, 698, 699, 1103, 1101, 1116, 1143, 1088, 1095, 1093, 1101, 1143, 1099, 1097, 1116, 1101, 972, 969, 988, 969, 2902, 2907, 2576, 2578, 2577, 2585, 2460, 2449, 2456, 2445, 2487, 2433, 2444, 3159, 3162, 3155, 3142, 3196, 3149, 3138, 3150, 3142, 619, 630, 619, 627, 634, 1827, 1836, 1825, 1843, 1843, 1242, 1237, 1232, 1224, 1241, 1230, 1231, 290, 315, 304, 267, 294, 305, 313, 309, 294, 319, 295, 1046, 1039, 1028, 1087, 1040, 1033, 1027, 1381, 1404, 1399, 1356, 1405, 1394, 1406, 1398, 3271, 3294, 3285, 3310, 3288, 3285, 1863, 1792, 1799, 1797, 1805, 1863, 1803, 1801, 1820, 1805, 1836, 1801, 1820, 1801, 1879, 1793, 1804, 1877, 2970, 2961, 2972, 2957, 2950, 2959, 2955, 2966, 2960, 2961, 2239, 2210, 2227, 2235, 2213, 2274, 2292, 2290, 2277, 2296, 2302, 2303, 2274, 2884, 2881, 2900, 2881, 3177, 3180, 3190, 3185, 1448, 1415, 1496, 1481, 1498, 1499, 1473, 1478, 1487, 1415, 1496, 1498, 1479, 1488, 1489, 2439, 2444, 2433, 2448, 2459, 2450, 2454, 2443, 2445, 2444, 2538, 2543, 2554, 2543, 1413, 1415, 1430, 1469, 1426, 1411, 1424, 1425, 1419, 1420, 1413, 268, 285, 270, 271, 281, 1151, 1144, 1126, 1264, 1278, 1250, 1049, 1045, 1044, 1052, 1043, 1053, 1616, 1629, 1630, 1625, 1616, -31342, 27617, 21824, -32428, 859, 834, 841, 882, 863, 840, 832, 844, 863, 838, 862, 1500, 1477, 1486, 1525, 1498, 1475, 1481, 649, 656, 667, 672, 657, 670, 658, 666, 2689, 2712, 2707, 2728, 2718, 2707, 1898, 1843, 1834, 1825, 1898, 1826, 1824, 1841, 1811, 1834, 1825, 1814, 1824, 1828, 1847, 1830, 1837, 1914, 1842, 1825, 1912, 1971, 2021, 2036, 2034, 2032, 1960, 1956, 1971, 2017, 2028, 2021, 2032, 1960, 2359, 2364, 2353, 2336, 2347, 2338, 2342, 2363, 2365, 2364, 3286, 3283, 3270, 3283, 453, 448, 474, 477};
    public static String l8 = "Dart/2.19 (dart:io)";
    private String S = "";
    private String T4 = "";
    private String b = "1238389483762837";
    private String OL = "";
    private String l = "";
    public String tT = "";
    private String N = "";
    private String HM = "";
    private String n = "";
    private String v = "";
    private String A = "";
    private String cD = "";
    private String s = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDA+5YTt3w1q/0WGw+TWyCSHTAeYiwBqAqDWot1u/1hoeANpED8gtW1AxB1mYNDQ+9eR8Ml+JC13+ME6RHjEbN4+n9V9OP90c81G0qSjBQ/DKQiMIFjbTH97RjVMtswf96tqwe4Rs/DT2ym6MP4P7QvJcxrFz5VVQXyOtUxhpMc9oktWuk0XKE8Mozu1FM879RknlM6WmJL85Wl/BnZrd+/AQbzziceELGrBfjbc1UOFAxYq2kA10H3o+Z4oOIODxUtXeh4R2oH3vHb4Ynnw6reXED5KsE3u1EO5HMQZyN16TZMTIps32bPe+vQlAT6V5nGcqXGT9fntjqIxJB0T9G3AgMBAAECggEBAKP6Yuh4BZP5g0CwV8jHKuLc6FE469mwdtZsLooo5cF68c3Fnu6xIXQAmZDDk3SpmhCLe7edASF5jwZSIL/H/68xcteQEdZP2/htKy1g16dHT4Q5oQfh9hOkznACGZuZW5ZH+HRNvyZfK5ybtkEPqERTouHwSyfo6feMpDDD/+cf3h1//7JKXKA7JPEU420YucsjQwjMuu5xdPa0TPqEc5mIbOBj753Pzn4GCScM+FRqJWr2x8e+KDPcPY8CUDLBSWxGLsB0A7+bEq/EiAQkbx09QKTwwxRLgVXjBbvyPB8BOuJpPM9BHx+vFcm5WSbkJdRI4qVFtEdsN/gDfFkwcjkCgYEA8Z8i/fTFRnzyvp9Pp8E+bSaYlvpTLUZ1KYNStaDg/BqlYGgGK1Jh90qjvRbBoiIjeBQd3IFLT4pFdd7Z9drLFdvqB22SNeVQU57kir/B6NY5G7yOjXB4qN17F4S3GubYIEcjF0W1tG/uOqqzb8FxrLJTK8WiFudbBt2ioCO4pJsCgYEAzHd8MctmD1Z1eM/xusvX1yCwGpxBuHT+ymThzLXyI6Ej0Q50jOQlf3cTyY/FgGbvAMz+oBybkEwE80gu7CPi0WPs+yCpAIB4+Th7afsrRylQI1ZWoRovaRmsyjnkIw0Mnj06VYNYPtkzm/OViRIqf4ESTTGas24bDm5DuwM9gxUCgYBwg4BR7gdnWYvYRGtdXNlrDowD0jGlZaftWt/LAE2EWAwmpooo5kYEV9eDl/M3QtptckCti++77FGIH+wzVl03op6KMvXg7xXGurkF+2GawRb62YUwS+2EBQ7q1rxFZLXD4hxvG+EPUwgGfbLtGZGLr8aXHYLrU3TJ769pDvlOfQKBgAFlAzzXtU9/eHele3GZuFQoTeswi6Y1bhN1UrDxwMALdlITtinL2JGg/0qNp3wzt4ea3lW7PDhkvFfocyF7MS3ab6Ba3aw6NBkHEJhtdSMcHgbPrPGWWyJtYWdTs8GlciOWKVKx/aUYGCkFJUz1CcMq3zQVlYeJxbd4ew/Iet/tAoGBAMRfvG1iLQAlS3AGaQeRwVxnvpciDn+7/sUCf8DEOk8Bqg4/ytJDTDrWufCtwmpsXmp6AUQig9mNKj7z26wSNbwYdzPsncK+sGRlS7eLAzzcv1a+1pghOOGDuQNzwlFOcauhkrcqjeKmu7OiKD48pvh3ZICiIWS1YL7LuMfUwHRJ";
    private String hR = "";
    JSONArray Kf = null;

    public qiao() {
    }

    private HashMap<String, String> S() {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Dart/3.0 (dart:io)");
        return map;
    }

    private HashMap<String, String> T4(String str) {
        HashMap<String, String> map = new HashMap<>();
        map.put("token", this.tT);
        map.put("User-Agent", this.tT);
        return map;
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
        String strE = "\r\n--";
        sb.append(strE);
        sb.append(str6);
        sb.append("\r\nContent-Disposition: form-data; name=\"label\"\r\n\r\n");
        sb.append(str3);
        sb.append(strE);
        sb.append(str6);
        sb.append("\r\nContent-Disposition: form-data; name=\"key\"\r\n\r\n");
        sb.append(str4);
        sb.append(strE);
        sb.append(str6);
        sb.append("--\r\n\r\n");
        try {
            return okHttpClient.newCall(new Request.Builder().url(str).post(RequestBody.create(mediaType, sb.toString())).addHeader("User-Agent", l8).addHeader("token", str5).addHeader("content-type", "multipart/form-data; boundary=" + str6).build()).execute().body().string();
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
        sb.append(str6);
        sb.append(strB);
        sb.append(str7);
        sb.append("--\r\n\r\n");
        try {
            return okHttpClient.newCall(new Request.Builder().url(str).post(RequestBody.create(mediaType, sb.toString())).addHeader("User-Agent", l8).addHeader("token", str5).addHeader("content-type", "multipart/form-data; boundary=" + str7).build()).execute().body().string();
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
        JSONObject jSONObject = new JSONObject(xv.S(this.n.substring(1), this.s));
        this.N = jSONObject.getString("key");
        this.tT = jSONObject.getString("token");
        if (!this.S.isEmpty()) {
            String strE = "config";
            if (jSONObject.has(strE)) {
                String strB = "configurl";
                String strE2 = "api";
                HashMap map = new HashMap();
                map.put("User-Agent", "Dart/3.0 (dart:io)");
                String strV = Yy.v(jSONObject.getString(strE), map);
                JSONObject jSONObject2 = new JSONObject(strV);
                String strD = "domain";
                StringBuilder sb2 = new StringBuilder();
                sb2.append(jSONObject2.getString(strD));
                sb2.append(jSONObject.getString(strE2));
                this.S = sb2.toString();
                this.T4 = new JSONObject(strV).getString(strD) + jSONObject.getString(strB);
            } else {
                StringBuilder sb = new StringBuilder();
                String strC = "url";
                sb.append(jSONObject.getString(strC));
                sb.append(jSONObject.getString(strE2));
                this.S = sb.toString();
                this.T4 = jSONObject.getString(strC) + jSONObject.getString(strB);
            }
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            if (this.S.isEmpty()) {
                l8();
            }
            JSONObject jSONObject2 = new JSONObject();
            String str3 = this.S + "/vod/getLists";
            if (map == null) {
                map = new HashMap<>();
            }
            if (!map.containsKey("area")) {
                map.put("area", "");
            }
            if (!map.containsKey("type")) {
                map.put("type", "");
            }
            if (!map.containsKey("year")) {
                map.put("year", "");
            }
            if (!map.containsKey("class")) {
                map.put("class", "");
            }
            JSONObject jSONObject3 = new JSONObject(Yy.v((((((((str3 + "?type_id=" + str) + "&area=" + map.get("area")) + "&lang=") + "&year=" + map.get("year")) + "&order=time") + "&type_name=" + map.get("type")) + "&page=" + str2) + "&pageSize=21", T4(l8)));
            int i8 = jSONObject3.getInt("ENCRYPTION");
            String strC2 = "data";
            JSONObject jSONObject;
            if (i8 != 0) {
                jSONObject = new JSONObject(C1370pv.v(jSONObject3.getString(strC2), this.N, this.b));
            } else {
                jSONObject = new JSONObject(jSONObject3.getString(strC2));
            }
            JSONArray jSONArray = jSONObject.getJSONArray(strC2);
            JSONArray jSONArray2 = new JSONArray();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject jSONObject5 = jSONArray.getJSONObject(i11);
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("vod_id", jSONObject5.getString("vod_id"));
                jSONObject6.put("vod_name", jSONObject5.getString("vod_name"));
                jSONObject6.put("vod_pic", jSONObject5.getString("vod_pic"));
                jSONObject6.put("vod_remarks", jSONObject5.getString("vod_remarks"));
                jSONArray2.put(jSONObject6);
            }
            int i15 = jSONObject.getInt("total");
            int i16 = jSONObject.getInt("last_page");
            int i17 = jSONObject.getInt("per_page");
            jSONObject2.put("page", str2);
            jSONObject2.put("pagecount", i16);
            jSONObject2.put("limit", i17);
            jSONObject2.put("total", i15);
            jSONObject2.put("list", jSONArray2);
            return jSONObject2.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public String detailContent(List<String> list) {
        return "";
    }

    public String homeContent(boolean z) {
        try {
            if (this.S.isEmpty()) {
                l8();
            }
            String strV = Yy.v(this.T4, T4(l8));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            JSONObject jSONObject2 = new JSONObject(strV);
            int i2 = jSONObject2.getInt("ENCRYPTION");
            String strC = "get_home_cate";
            String strB = "data";
            JSONArray jSONArray;
            if (i2 != 0) {
                jSONArray = new JSONObject(C1370pv.v(jSONObject2.getString(strB), this.N, this.b)).getJSONArray(strC);
            } else {
                jSONArray = new JSONObject(jSONObject2.getString(strB)).getJSONArray(strC);
            }
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i5);
                if (!jSONObject3.has("cate")) {
                    this.OL = jSONObject3.getString("id");
                    this.l = jSONObject3.getString("mold");
                } else {
                    JSONObject jSONObject4 = new JSONObject();
                    String strB2 = "type_id";
                    if (jSONObject3.has("cate")) {
                        jSONObject4.put(strB2, jSONObject3.getString("cate"));
                    } else {
                        jSONObject4.put(strB2, jSONObject3.getString("id"));
                    }
                    jSONObject4.put("type_name", jSONObject3.getString("title"));
                    jSONArray2.put(jSONObject4);
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
        try {
            JSONObject jSONObject = new JSONObject(Yy.v(this.S + "/home/cateData?id=" + this.OL, T4(l8)));
            JSONArray jSONArray2 = new JSONArray();
            int i = jSONObject.getInt("ENCRYPTION");
            String strC2 = "items";
            String strE4 = "sections";
            String strE5 = "data";
            JSONArray jSONArray;
            if (i != 0) {
                jSONArray = new JSONObject(jSONObject.getString(strE5)).getJSONArray(strE4).getJSONObject(1).getJSONArray(strC2);
            } else {
                jSONArray = new JSONObject(C1370pv.v(jSONObject.getString(strE5), this.N, this.b)).getJSONArray(strE4).getJSONObject(1).getJSONArray(strC2);
            }
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("vod_id", jSONObject2.getString("vod_id"));
                jSONObject3.put("vod_name", jSONObject2.getString("vod_name"));
                jSONObject3.put("vod_pic", jSONObject2.getString("vod_pic"));
                jSONObject3.put("vod_remarks", jSONObject2.getString("vod_remarks"));
                jSONArray2.put(jSONObject3);
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("list", jSONArray2);
            return jSONObject4.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context, str);
        this.n = str;
        String strL = C1370pv.l(str);
        HashMap<String, String> mapS = S();
        str = Yy.v(strL, mapS);
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            Init2.lj();
            JSONObject jSONObject2 = new JSONObject();
            String[] strArrSplit = str2.split("&");
            String str3 = strArrSplit[0];
            String str4 = strArrSplit[1];
            String str5 = this.S + "/parsing/proxy";
            if (this.Kf == null || this.Kf.length() == 0) {
                JSONObject jSONObject3 = new JSONObject(Yy.v(this.T4, T4(l8)));
                int i3 = jSONObject3.getInt("ENCRYPTION");
                String strE = "get_parsing";
                String strD = "data";
                if (i3 != 0) {
                    this.Kf = new JSONObject(jSONObject3.getString(strD)).getJSONArray(strE);
                } else {
                    this.Kf = new JSONObject(C1370pv.v(jSONObject3.getString(strD), this.N, this.b)).getJSONArray(strE);
                }
            }
            for (int i6 = 0; i6 < this.Kf.length(); i6++) {
                JSONObject jSONObject6 = this.Kf.getJSONObject(i6);
                if (jSONObject6.getString("key").contains(str4)) {
                    JSONArray jSONArray = jSONObject6.getJSONArray("config");
                    if (jSONArray.length() != 0) {
                        if (ZP.OL(str3)) {
                            jSONObject2.put("parse", 0);
                            jSONObject2.put("url", str3);
                        }
                    } else if (ZP.OL(str3)) {
                        jSONObject2.put("parse", 0);
                        jSONObject2.put("url", str3);
                    }
                    for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                        String label = jSONArray.getJSONObject(i8).getString("label");
                        String string2 = jSONArray.getJSONObject(i8).getString("url");
                        String strFormUpload = formUpload(str5, str3, label, str4, this.tT);
                        if (strFormUpload.contains("解析失败")) {
                            JSONObject jSONObject4 = new JSONObject(Yy.v(string2 + str3, T4(l8)));
                            if (jSONObject4.has("url")) {
                                String string3 = jSONObject4.getString("url");
                                if (string3 != "") {
                                    String string4 = jSONObject4.getString("url");
                                    jSONObject2.put("parse", 0);
                                    jSONObject2.put("url", string4);
                                }
                            }
                        } else {
                            int i13 = new JSONObject(strFormUpload).getInt("ENCRYPTION");
                            JSONObject jSONObject;
                            if (i13 != 0) {
                                jSONObject = new JSONObject(new JSONObject(strFormUpload).getString("data"));
                            } else {
                                jSONObject = new JSONObject(C1370pv.v(new JSONObject(strFormUpload).getString("data"), this.N, this.b));
                            }
                            if (jSONObject.has("url")) {
                                String string5 = jSONObject.getString("url");
                                if (string5 != "") {
                                    String string6 = jSONObject.getString("url");
                                    jSONObject2.put("parse", 0);
                                    jSONObject2.put("url", string6);
                                }
                            }
                        }
                    }
                }
            }
            return jSONObject2.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            if (this.S.isEmpty()) {
                l8();
            }
            JSONObject jSONObject = new JSONObject();
            String strV = Yy.v(this.S + "/vod/getVodSearch?wd=" + URLEncoder.encode(str) + "&page=1&type=", T4(l8));
            JSONArray jSONArray2 = new JSONArray();
            JSONObject jSONObject2 = new JSONObject(strV);
            int i2 = jSONObject2.getInt("ENCRYPTION");
            String strB2 = "data";
            JSONArray jSONArray;
            if (i2 != 0) {
                jSONArray = new JSONObject(jSONObject2.getString(strB2)).getJSONArray(strB2);
            } else {
                jSONArray = new JSONObject(C1370pv.v(jSONObject2.getString(strB2), this.N, this.b)).getJSONArray(strB2);
            }
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i5);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("vod_id", jSONObject3.getString("vod_id"));
                jSONObject4.put("vod_name", jSONObject3.getString("vod_name"));
                jSONObject4.put("vod_pic", jSONObject3.getString("vod_pic"));
                jSONObject4.put("vod_remarks", jSONObject3.getString("vod_remarks"));
                jSONArray2.put(jSONObject4);
            }
            jSONObject.put("list", jSONArray2);
            return jSONObject.toString();
        } catch (Throwable th) {
            return "";
        }
    }
}
