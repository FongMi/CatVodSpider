package com.github.catvod.spider;

import android.content.Context;
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

/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class qiao extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f886short = {1825, 1796, 1815, 1809, 1866, 1879, 1867, 1876, 1884, 1861, 1869, 1793, 1796, 1815, 1809, 1887, 1804, 1802, 1868, 2730, 2729, 2728, 2723, 2728, 2723, 2722, 2735, 2723, 2728, 2732, 2733, 2729, 2723, 2728, 2732, 764, 730, 716, 731, 644, 744, 718, 716, 711, 733, 468, 463, 459, 453, 462, 1852, 1852, 1909, 1912, 1918, 1852, 1907, 1918, 1892, 1919, 1909, 1904, 1891, 1896, 1852, 1677, 1685, 1676, 1684, 1673, 1680, 1665, 1682, 1684, 1743, 1670, 1679, 1682, 1677, 1741, 1668, 1665, 1684, 1665, 1755, 1728, 1996, 1996, 1708, 1707, 1762, 1742, 1743, 1749, 1732, 1743, 1749, 1676, 1765, 1736, 1746, 1745, 1742, 1746, 1736, 1749, 1736, 1742, 1743, 1691, 1665, 1735, 1742, 1747, 1740, 1676, 1733, 1728, 1749, 1728, 1690, 1665, 1743, 1728, 1740, 1732, 1692, 1667, 1745, 1741, 1728, 1752, 1790, 1748, 1747, 1741, 1667, 1708, 1707, 1708, 1707, 2728, 2735, 2696, 2696, 2107, 2108, 2165, 2137, 2136, 2114, 2131, 2136, 2114, 2075, 2162, 2143, 2117, 2118, 2137, 2117, 2143, 2114, 2143, 2137, 2136, 2060, 2070, 2128, 2137, 2116, 2139, 2075, 2130, 2135, 2114, 2135, 2061, 2070, 2136, 2135, 2139, 2131, 2059, 2068, 2138, 2135, 2132, 2131, 2138, 2068, 2107, 2108, 2107, 2108, 2685, 2682, 2611, 2591, 2590, 2564, 2581, 2590, 2564, 2653, 2612, 2585, 2563, 2560, 2591, 2563, 2585, 2564, 2585, 2591, 2590, 2634, 2640, 2582, 2591, 2562, 2589, 2653, 2580, 2577, 2564, 2577, 2635, 2640, 2590, 2577, 2589, 2581, 2637, 2642, 2587, 2581, 2569, 2642, 2685, 2682, 2685, 2682, 2053, 2053, 2085, 2082, 2085, 2082, 2602, 2572, 2586, 2573, 2642, 2622, 2584, 2586, 2577, 2571, 1852, 1831, 1827, 1837, 1830, 2775, 2767, 2774, 2766, 2771, 2762, 2779, 2760, 2766, 2709, 2780, 2773, 2760, 2775, 2711, 2782, 2779, 2766, 2779, 2689, 2714, 2776, 2773, 2767, 2772, 2782, 2779, 2760, 2755, 2695, 898, 910, 911, 917, 900, 911, 917, 972, 917, 920, 913, 900, 2443, 2443, 2443, -31997, 28016, 21457, -30779, 1059, 1059, 1130, 1127, 1121, 1059, 1132, 1121, 1147, 1120, 1130, 1135, 1148, 1143, 1059, 427, 435, 426, 434, 431, 438, 423, 436, 434, 489, 416, 425, 436, 427, 491, 418, 423, 434, 423, 509, 486, 2063, 2063, 2221, 2218, 2275, 2255, 2254, 2260, 2245, 2254, 2260, 2189, 2276, 2249, 2259, 2256, 2255, 2259, 2249, 2260, 2249, 2255, 2254, 2202, 2176, 2246, 2255, 2258, 2253, 2189, 2244, 2241, 2260, 2241, 2203, 2176, 2254, 2241, 2253, 2245, 2205, 2178, 2256, 2252, 2241, 2265, 2303, 2261, 2258, 2252, 2178, 2221, 2218, 2221, 2218, 1162, 1165, 1194, 1194, 2632, 2639, 2566, 2602, 2603, 2609, 2592, 2603, 2609, 2664, 2561, 2604, 2614, 2613, 2602, 2614, 2604, 2609, 2604, 2602, 2603, 2687, 2661, 2595, 2602, 2615, 2600, 2664, 2593, 2596, 2609, 2596, 2686, 2661, 2603, 2596, 2600, 2592, 2680, 2663, 2601, 2596, 2599, 2592, 2601, 2663, 2632, 2639, 2632, 2639, 3041, 3046, 2991, 2947, 2946, 2968, 2953, 2946, 2968, 3009, 2984, 2949, 2975, 2972, 2947, 2975, 2949, 2968, 2949, 2947, 2946, 3030, 3020, 2954, 2947, 2974, 2945, 3009, 2952, 2957, 2968, 2957, 3031, 3020, 2946, 2957, 2945, 2953, 3025, 3022, 2951, 2953, 2965, 3022, 3041, 3046, 3041, 3046, 1746, 1749, 1692, 1712, 1713, 1707, 1722, 1713, 1707, 1778, 1691, 1718, 1708, 1711, 1712, 1708, 1718, 1707, 1718, 1712, 1713, 1765, 1791, 1721, 1712, 1709, 1714, 1778, 1723, 1726, 1707, 1726, 1764, 1791, 1713, 1726, 1714, 1722, 1762, 1789, 1708, 1718, 1720, 1713, 1789, 1746, 1749, 1746, 1749, 1930, 1930, 1962, 1965, 1962, 1965, 2491, 2461, 2443, 2460, 2499, 2479, 2441, 2443, 2432, 2458, 1236, 1231, 1227, 1221, 1230, 783, 791, 782, 790, 779, 786, 771, 784, 790, 845, 772, 781, 784, 783, 847, 774, 771, 790, 771, 857, 834, 768, 781, 791, 780, 774, 771, 784, 795, 863, 1998, 1986, 1987, 2009, 1992, 1987, 2009, 1920, 2009, 2004, 2013, 1992, 1460, 1466, 1446, 1480, 1491, 1495, 1497, 1490, 819, 831, 830, 822, 825, 823, 1009, 1021, 1020, 1012, 1019, 1013, 999, 992, 1022, 3015, 3030, 3023, 2415, 2377, 2399, 2376, 2327, 2427, 2397, 2399, 2388, 2382, 2909, 2936, 2923, 2925, 2870, 2858, 2871, 2857, 2873, 2865, 2941, 2936, 2923, 2925, 2851, 2928, 2934, 2864, 1271, 1276, 1278, 1266, 1274, 1277, 2059, 2060, 2066, 1872, 1910, 1888, 1911, 1832, 1860, 1890, 1888, 1899, 1905, 2647, 2674, 2657, 2663, 2620, 2592, 2621, 2595, 2611, 2619, 2679, 2674, 2657, 2663, 2601, 2682, 2684, 2618, 1978, 1955, 1960, 1939, 1982, 1961, 1953, 1965, 1982, 1959, 1983, 748, 757, 766, 709, 746, 755, 761, 1573, 1596, 1591, 1548, 1597, 1586, 1598, 1590, 1658, 1635, 1640, 1619, 1637, 1640, 2192, 2187, 2192, 2181, 2184, 1939, 1948, 1937, 1923, 1923, 931, 959, 955, 936, 276, 281, 272, 261, 2290, 2273, 2294, 2290, 2218, 2291, 2282, 2273, 2218, 2274, 2272, 2289, 2249, 2284, 2294, 2289, 2294, 2079, 2132, 2137, 2128, 2117, 2175, 2121, 2116, 2077, 2709, 2770, 2753, 2774, 2770, 2702, 3138, 3080, 3077, 3082, 3075, 3161, 3141, 3098, 3078, 3074, 3089, 3166, 1066, 1123, 1150, 1128, 1129, 1150, 1073, 1144, 1125, 1121, 1129, 1216, 1170, 1183, 1174, 1155, 1209, 1160, 1159, 1163, 1155, 1243, 1021, 939, 954, 956, 958, 998, 2016, 1974, 1959, 1953, 1955, 1941, 1967, 1980, 1955, 2043, 2036, 2039, 1336, 1331, 1342, 1327, 1316, 1325, 1321, 1332, 1330, 1331, 1156, 1153, 1172, 1153, 2288, 2301, 2287, 2280, 2243, 2284, 2301, 2299, 2297, 2574, 2587, 2572, 2593, 2574, 2591, 2585, 2587, 265, 280, 286, 284, 1253, 1268, 1266, 1264, 1270, 1274, 1248, 1275, 1249, 2711, 2706, 2710, 2706, 2703, 1308, 1305, 1283, 1284, 464, 460, 449, 473, 453, 466, 511, 457, 462, 454, 463, 2856, 2856, 2856, 479, 454, 461, 502, 458, 454, 455, 477, 460, 455, 477, 404, 397, 390, 445, 390, 395, 400, 391, 385, 406, 397, 400, 565, 556, 551, 540, 546, 544, 567, 556, 561, 1764, 1789, 1782, 1741, 1760, 1783, 1791, 1779, 1760, 1785, 1761, 454, 479, 468, 495, 465, 450, 469, 465, 1006, 1015, 1020, 967, 993, 1021, 1017, 1002, 1765, 1788, 1783, 1740, 1763, 1786, 1776, 2105, 2080, 2091, 2064, 2081, 2094, 2082, 2090, 720, 713, 706, 761, 719, 706, 515, 602, 579, 584, 515, 587, 585, 600, 634, 579, 
    584, 531, 581, 584, 529, 3162, 3153, 3164, 3149, 3142, 3151, 3147, 3158, 3152, 3153, 623, 618, 639, 618, 2864, 2877, 2868, 2849, 2843, 2858, 2853, 2857, 2849, 1701, 1724, 1719, 1676, 1712, 1727, 1714, 1696, 1696, 1991, 2014, 2005, 2030, 1985, 2013, 2000, 1992, 2030, 2013, 2008, 1986, 1989, 2467, 2488, 2495, 2471, 2578, 2566, 2587, 2585, 25145, 23375, 20858, 1171, 1172, 1162, 1173, 1863, 1864, 1860, 1868, 871, 2040, 2047, 2017, 1807, 3192, 558, 567, 572, 519, 552, 564, 569, 545, 519, 574, 554, 567, 565, 1170, 1163, 1152, 1211, 1172, 1160, 1157, 1181, 1211, 1169, 1174, 1160, 2479, 2474, 2480, 2487, 2277, 2279, 2290, 2275, 2877, 2870, 2875, 2858, 2849, 2856, 2860, 2865, 2871, 2870, 3194, 3192, 3177, 3138, 3189, 3186, 3184, 3192, 3138, 3198, 3196, 3177, 3192, 1322, 1327, 1338, 1327, 889, 884, 644, 646, 645, 653, 954, 951, 958, 939, 913, 935, 938, 862, 851, 858, 847, 885, 836, 843, 839, 847, 2544, 2541, 2544, 2536, 2529, 3124, 3131, 3126, 3108, 3108, 716, 707, 710, 734, 719, 728, 729, 915, 906, 897, 954, 919, 896, 904, 900, 919, 910, 918, 1581, 1588, 1599, 1540, 1579, 1586, 1592, 2133, 2124, 2119, 2172, 2125, 2114, 2126, 2118, 3004, 2981, 2990, 2965, 2979, 2990, 1558, 1617, 1622, 1620, 1628, 1558, 1626, 1624, 1613, 1628, 1661, 1624, 1613, 1624, 1542, 1616, 1629, 1540, 1740, 1735, 1738, 1755, 1744, 1753, 1757, 1728, 1734, 1735, 2518, 2507, 2522, 2514, 2508, 3117, 3131, 3133, 3114, 3127, 3121, 3120, 3117, 2324, 2321, 2308, 2321, 1472, 1477, 1503, 1496, 3022, 2368, 2335, 2318, 2333, 2332, 2310, 2305, 2312, 2368, 2335, 2333, 2304, 2327, 2326, 1309, 1302, 1307, 1290, 1281, 1288, 1292, 1297, 1303, 1302, 1713, 1716, 1697, 1716, 938, 936, 953, 914, 957, 940, 959, 958, 932, 931, 938, 1696, 1713, 1698, 1699, 1717, 315, 316, 290, 2285, 2275, 2303, 1668, 1672, 1673, 1665, 1678, 1664, 1881, 1876, 1879, 1872, 1881, -30123, 25638, 23175, -29037, 1803, 1810, 1817, 1826, 1807, 1816, 1808, 1820, 1807, 1814, 1806, 2277, 2300, 2295, 2252, 2275, 2298, 2288, 2699, 2706, 2713, 2722, 2707, 2716, 2704, 2712, 2981, 3004, 2999, 2956, 3002, 2999, 935, 1022, 999, 1004, 935, 1007, 1005, 1020, 990, 999, 1004, 987, 1005, 1001, 1018, 1003, 992, 951, 1023, 1004, 949, 3198, 3112, 3129, 3135, 3133, 3173, 3177, 3198, 3116, 3105, 3112, 3133, 3173, 1612, 1607, 1610, 1627, 1616, 1625, 1629, 1600, 1606, 1607, 588, 585, 604, 585, 1405, 1400, 1378, 1381};

    /* renamed from: q */
    public static String f778q = C0182.m861(f886short, 0, 19, 1893);

    /* renamed from: xC */
    private String f793xC = "";

    /* renamed from: QU */
    private String f785QU = "";

    /* renamed from: UJ */
    private String f787UJ = C0171.m816(f886short, 19, 16, 2715);

    /* renamed from: u */
    private String f791u = "";

    /* renamed from: Mo */
    private String f784Mo = "";

    /* renamed from: i */
    public String f789i = "";

    /* renamed from: MH */
    private String f783MH = "";

    /* renamed from: se */
    private String f790se = "";

    /* renamed from: W */
    private String f788W = "";

    /* renamed from: FN */
    private String f781FN = "";

    /* renamed from: B */
    private String f779B = "";

    /* renamed from: w8 */
    private String f792w8 = "";

    /* renamed from: F */
    private String f780F = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDA+5YTt3w1q/0WGw+TWyCSHTAeYiwBqAqDWot1u/1hoeANpED8gtW1AxB1mYNDQ+9eR8Ml+JC13+ME6RHjEbN4+n9V9OP90c81G0qSjBQ/DKQiMIFjbTH97RjVMtswf96tqwe4Rs/DT2ym6MP4P7QvJcxrFz5VVQXyOtUxhpMc9oktWuk0XKE8Mozu1FM879RknlM6WmJL85Wl/BnZrd+/AQbzziceELGrBfjbc1UOFAxYq2kA10H3o+Z4oOIODxUtXeh4R2oH3vHb4Ynnw6reXED5KsE3u1EO5HMQZyN16TZMTIps32bPe+vQlAT6V5nGcqXGT9fntjqIxJB0T9G3AgMBAAECggEBAKP6Yuh4BZP5g0CwV8jHKuLc6FE469mwdtZsLooo5cF68c3Fnu6xIXQAmZDDk3SpmhCLe7edASF5jwZSIL/H/68xcteQEdZP2/htKy1g16dHT4Q5oQfh9hOkznACGZuZW5ZH+HRNvyZfK5ybtkEPqERTouHwSyfo6feMpDDD/+cf3h1//7JKXKA7JPEU420YucsjQwjMuu5xdPa0TPqEc5mIbOBj753Pzn4GCScM+FRqJWr2x8e+KDPcPY8CUDLBSWxGLsB0A7+bEq/EiAQkbx09QKTwwxRLgVXjBbvyPB8BOuJpPM9BHx+vFcm5WSbkJdRI4qVFtEdsN/gDfFkwcjkCgYEA8Z8i/fTFRnzyvp9Pp8E+bSaYlvpTLUZ1KYNStaDg/BqlYGgGK1Jh90qjvRbBoiIjeBQd3IFLT4pFdd7Z9drLFdvqB22SNeVQU57kir/B6NY5G7yOjXB4qN17F4S3GubYIEcjF0W1tG/uOqqzb8FxrLJTK8WiFudbBt2ioCO4pJsCgYEAzHd8MctmD1Z1eM/xusvX1yCwGpxBuHT+ymThzLXyI6Ej0Q50jOQlf3cTyY/FgGbvAMz+oBybkEwE80gu7CPi0WPs+yCpAIB4+Th7afsrRylQI1ZWoRovaRmsyjnkIw0Mnj06VYNYPtkzm/OViRIqf4ESTTGas24bDm5DuwM9gxUCgYBwg4BR7gdnWYvYRGtdXNlrDowD0jGlZaftWt/LAE2EWAwmpooo5kYEV9eDl/M3QtptckCti++77FGIH+wzVl03op6KMvXg7xXGurkF+2GawRb62YUwS+2EBQ7q1rxFZLXD4hxvG+EPUwgGfbLtGZGLr8aXHYLrU3TJ769pDvlOfQKBgAFlAzzXtU9/eHele3GZuFQoTeswi6Y1bhN1UrDxwMALdlITtinL2JGg/0qNp3wzt4ea3lW7PDhkvFfocyF7MS3ab6Ba3aw6NBkHEJhtdSMcHgbPrPGWWyJtYWdTs8GlciOWKVKx/aUYGCkFJUz1CcMq3zQVlYeJxbd4ew/Iet/tAoGBAMRfvG1iLQAlS3AGaQeRwVxnvpciDn+7/sUCf8DEOk8Bqg4/ytJDTDrWufCtwmpsXmp6AUQig9mNKj7z26wSNbwYdzPsncK+sGRlS7eLAzzcv1a+1pghOOGDuQNzwlFOcauhkrcqjeKmu7OiKD48pvh3ZICiIWS1YL7LuMfUwHRJ";

    /* renamed from: RH */
    private String f786RH = "";

    /* renamed from: KT */
    JSONArray f782KT = null;

    public qiao() {
        int iM818 = C0171.m818();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = iM818 >= 0 ? 1709 : 1678;
                case 204:
                    System.out.println(Integer.decode(C0171.m817("d8Lmo4JXOlXwppqKrGlDZLTM")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* renamed from: QU */
    private HashMap<String, String> m790QU(String str) {
        String str2 = "۠ۨۡ";
        HashMap<String, String> map = null;
        String strM845 = null;
        short[] sArr = null;
        while (true) {
            switch (C0174.m829(str2)) {
                case 1746687:
                    str2 = "ۧۨۦ";
                    sArr = f886short;
                    break;
                case 1747929:
                    map = new HashMap<>();
                    str2 = "ۣۨۡ";
                    break;
                case 1752461:
                    map.put(strM845, str);
                    str2 = "ۧ۠ۡ";
                    break;
                case 1752493:
                    str2 = "ۥ۟ۧ";
                    strM845 = C0178.m845(sArr, 35, 10, 681);
                    break;
                case 1752585:
                    map.put(str, strM845);
                    str2 = "ۦ۠۟";
                    break;
                case 1753445:
                    return map;
                case 1754408:
                    str2 = "۟۟۟";
                    strM845 = this.f789i;
                    break;
                case 1754661:
                    str = C0168.m805(sArr, 45, 5, 416);
                    str2 = "ۥۣۧ";
                    break;
                default:
                    str2 = "ۥ۠ۨ";
                    sArr = f886short;
                    break;
            }
        }
    }

    public static String formUpload(String str, String str2, String str3, String str4, String str5) {
        OkHttpClient okHttpClient = new OkHttpClient();
        String str6 = C0165.m798(f886short, 50, 15, 1809) + getRandomNickname(10);
        MediaType mediaType = MediaType.parse(C0176.m836(f886short, 65, 21, 1760) + str6);
        StringBuilder sb = new StringBuilder();
        sb.append(C0179.m849(f886short, 86, 2, 2017));
        sb.append(str6);
        sb.append(C0179.m849(f886short, 88, 53, 1697));
        sb.append(str2);
        String strM820 = C0172.m820(f886short, 141, 4, 2725);
        sb.append(strM820);
        sb.append(str6);
        sb.append(C0175.m834(f886short, 145, 50, 2102));
        sb.append(str3);
        sb.append(strM820);
        sb.append(str6);
        sb.append(C0172.m820(f886short, 195, 48, 2672));
        sb.append(str4);
        sb.append(strM820);
        sb.append(str6);
        sb.append(C0180.m851(f886short, 243, 6, 2088));
        try {
            return okHttpClient.newCall(new Request.Builder().url(str).post(RequestBody.create(mediaType, sb.toString())).addHeader(C0169.m809(f886short, 249, 10, 2687), f778q).addHeader(C0176.m836(f886short, 259, 5, 1864), str5).addHeader(C0165.m798(f886short, 294, 12, 993), C0182.m861(f886short, 264, 30, 2746) + str6).build()).execute().body().string();
        } catch (IOException e) {
            System.out.println(C0177.m841(f886short, 306, 3, 2492) + e);
            return C0183.m866(f886short, 309, 4, 2784);
        }
    }

    public static String formUploadV5(String str, String str2, String str3, String str4, String str5, String str6) {
        OkHttpClient okHttpClient = new OkHttpClient();
        String str7 = C0178.m845(f886short, 313, 15, 1038) + getRandomNickname(10);
        MediaType mediaType = MediaType.parse(C0172.m820(f886short, 328, 21, 454) + str7);
        StringBuilder sb = new StringBuilder();
        sb.append(C0172.m820(f886short, 349, 2, 2082));
        sb.append(str7);
        sb.append(C0165.m798(f886short, 351, 53, 2208));
        sb.append(str2);
        String strM845 = C0178.m845(f886short, 404, 4, 1159);
        sb.append(strM845);
        sb.append(str7);
        sb.append(C0166.m801(f886short, 408, 50, 2629));
        sb.append(str3);
        sb.append(strM845);
        sb.append(str7);
        sb.append(C0177.m841(f886short, 458, 48, 3052));
        sb.append(str4);
        sb.append(strM845);
        sb.append(str7);
        sb.append(C0172.m820(f886short, 506, 49, 1759));
        sb.append(str6);
        sb.append(strM845);
        sb.append(str7);
        sb.append(C0166.m801(f886short, 555, 6, 1959));
        try {
            return okHttpClient.newCall(new Request.Builder().url(str).post(RequestBody.create(mediaType, sb.toString())).addHeader(C0183.m866(f886short, 561, 10, 2542), f778q).addHeader(C0168.m805(f886short, 571, 5, 1184), str5).addHeader(C0180.m851(f886short, 606, 12, 1965), C0174.m828(f886short, 576, 30, 866) + str7).build()).execute().body().string();
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
    private void m791q() {
        JSONObject jSONObject = new JSONObject(C0114dC.m577q(this.f788W.substring(1), this.f780F));
        this.f783MH = jSONObject.getString(C0174.m828(f886short, 618, 3, 1503));
        this.f789i = jSONObject.getString(C0172.m820(f886short, 621, 5, 1468));
        boolean zIsEmpty = this.f793xC.isEmpty();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = zIsEmpty ? 1709 : 1678;
                case 204:
                    String strM851 = C0180.m851(f886short, 626, 6, 848);
                    boolean zHas = jSONObject.has(strM851);
                    String strM816 = C0171.m816(f886short, 632, 9, 914);
                    String strM836 = C0176.m836(f886short, 641, 3, 2982);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = zHas ? 1833 : 1802;
                            case 54:
                            case 471:
                                StringBuilder sb = new StringBuilder();
                                String strM801 = C0166.m801(f886short, 678, 3, 2174);
                                sb.append(jSONObject.getString(strM801));
                                sb.append(jSONObject.getString(strM836));
                                this.f793xC = sb.toString();
                                this.f785QU = jSONObject.getString(strM801) + jSONObject.getString(strM816);
                                break;
                            case 500:
                                HashMap map = new HashMap();
                                map.put(C0180.m851(f886short, 644, 10, 2362), C0176.m836(f886short, 654, 18, 2841));
                                String strM484FN = C0106ZJ.m484FN(jSONObject.getString(strM851), map);
                                StringBuilder sb2 = new StringBuilder();
                                JSONObject jSONObject2 = new JSONObject(strM484FN);
                                String strM814 = C0170.m814(f886short, 672, 6, 1171);
                                sb2.append(jSONObject2.getString(strM814));
                                sb2.append(jSONObject.getString(strM836));
                                this.f793xC = sb2.toString();
                                this.f785QU = new JSONObject(strM484FN).getString(strM814) + jSONObject.getString(strM816);
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = 48674;
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
        int iM822 = C0172.m822();
        int i4 = 48767;
        while (true) {
            i4 ^= 48784;
            switch (i4) {
                case 14:
                case 45:
                    break;
                case 76:
                    System.out.println(Float.decode(C0168.m808("8zeD3n97aRl")));
                    break;
                case 239:
                    i4 = iM822 >= 0 ? 48860 : 48829;
            }
            return;
        }
    }

    /* renamed from: xC */
    private HashMap<String, String> m792xC() {
        String str = "ۦۥۤ";
        String strM841 = null;
        HashMap<String, String> map = null;
        String strM820 = null;
        short[] sArr = null;
        while (true) {
            switch (C0174.m829(str)) {
                case 56388:
                    str = "ۨۡ";
                    strM820 = C0172.m820(sArr, 681, 10, 1797);
                    break;
                case 56568:
                    strM841 = C0177.m841(sArr, 691, 18, 2579);
                    str = "۠ۢۥ";
                    break;
                case 56569:
                    str = "ۨ۠";
                    sArr = f886short;
                    break;
                case 1747747:
                    map.put(strM820, strM841);
                    str = "ۨۢۢ";
                    break;
                case 1753605:
                    str = "ۦۣۨ";
                    map = new HashMap<>();
                    break;
                case 1755432:
                    return map;
                default:
                    str = "ۢۦ";
                    sArr = f886short;
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:72:0x02bc. Please report as an issue. */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        JSONObject jSONObject;
        String strM861 = C0182.m861(f886short, 709, 11, 1996);
        String strM805 = C0168.m805(f886short, 720, 7, 666);
        String strM841 = C0177.m841(f886short, 727, 8, 1619);
        String strM851 = C0180.m851(f886short, 735, 6, 1548);
        String strM809 = C0169.m809(f886short, 741, 5, 2276);
        String strM820 = C0172.m820(f886short, 746, 5, 2032);
        String strM834 = C0175.m834(f886short, 751, 4, 986);
        String strM856 = C0181.m856(f886short, 755, 4, 352);
        String strM828 = C0174.m828(f886short, 759, 4, 2195);
        try {
            boolean zIsEmpty = this.f793xC.isEmpty();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = zIsEmpty ? 1709 : 1678;
                    case 204:
                        m791q();
                        break;
                    case 239:
                        break;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            String str3 = this.f793xC + C0170.m814(f886short, 763, 13, 2181);
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
            boolean zContainsKey = map.containsKey(strM828);
            int i4 = 48767;
            while (true) {
                i4 ^= 48784;
                switch (i4) {
                    case 14:
                    case 45:
                        break;
                    case 76:
                        map.put(strM828, "");
                        break;
                    case 239:
                        i4 = !zContainsKey ? 48860 : 48829;
                }
            }
            boolean zContainsKey2 = map.containsKey(strM856);
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
                        map.put(strM856, "");
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
            boolean zContainsKey4 = map.containsKey(strM820);
            int i7 = 49790;
            while (true) {
                i7 ^= 49807;
                switch (i7) {
                    case 18:
                    case 51:
                        break;
                    case 84:
                        map.put(strM820, "");
                        break;
                    case 241:
                        i7 = !zContainsKey4 ? 49883 : 49852;
                }
            }
            JSONObject jSONObject3 = new JSONObject(C0106ZJ.m484FN((((((((str3 + C0171.m816(f886short, 776, 9, 2080) + str) + C0169.m809(f886short, 785, 6, 2739) + map.get(strM828)) + C0171.m816(f886short, 791, 6, 3172)) + C0182.m861(f886short, 797, 6, 3171) + map.get(strM834)) + C0166.m801(f886short, 803, 11, 1036)) + C0183.m866(f886short, 814, 11, 1254) + map.get(strM856)) + C0182.m861(f886short, 825, 6, 987) + str2) + C0166.m801(f886short, 831, 12, 1990), m790QU(f778q)));
            int i8 = jSONObject3.getInt(C0182.m861(f886short, 843, 10, 1405));
            String strM816 = C0171.m816(f886short, 853, 4, 1248);
            int i9 = 49914;
            while (true) {
                i9 ^= 49931;
                switch (i9) {
                    case 497:
                        i9 = i8 == 0 ? 50658 : 50627;
                    case 1711:
                    case 1736:
                        jSONObject = new JSONObject(C0152vp.m722FN(jSONObject3.getString(strM816), this.f783MH, this.f787UJ));
                        break;
                    case 1769:
                        JSONObject jSONObject4 = new JSONObject(jSONObject3.getString(strM816));
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
            JSONArray jSONArray = jSONObject.getJSONArray(strM816);
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
                            JSONObject jSONObject5 = jSONArray.getJSONObject(i11);
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put(strM851, jSONObject5.getString(strM851));
                            jSONObject6.put(strM841, jSONObject5.getString(strM841));
                            jSONObject6.put(strM805, jSONObject5.getString(strM805));
                            jSONObject6.put(strM861, jSONObject5.getString(strM861));
                            jSONArray2.put(jSONObject6);
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
                    int i15 = jSONObject.getInt(strM809);
                    int i16 = jSONObject.getInt(C0171.m816(f886short, 857, 9, 2204));
                    int i17 = jSONObject.getInt(C0169.m809(f886short, 866, 8, 2686));
                    jSONObject2.put(C0175.m834(f886short, 874, 4, 377), str2);
                    jSONObject2.put(C0177.m841(f886short, 878, 9, 1173), i16);
                    jSONObject2.put(C0165.m798(f886short, 887, 5, 2811), i17);
                    jSONObject2.put(strM809, i15);
                    jSONObject2.put(C0172.m820(f886short, 892, 4, 1392), jSONArray2);
                    return jSONObject2.toString();
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x01f7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:48:0x0283. Please report as an issue. */
    public java.lang.String detailContent(java.util.List<java.lang.String> r23) {
        /*
            Method dump skipped, instructions count: 1102
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.qiao.detailContent(java.util.List):java.lang.String");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x00b1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:43:0x0105. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x0143. Please report as an issue. */
    public String homeContent(boolean z) {
        JSONArray jSONArray;
        String strM805 = C0168.m805(f886short, 1104, 4, 2182);
        try {
            boolean zIsEmpty = this.f793xC.isEmpty();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = zIsEmpty ? 1709 : 1678;
                    case 204:
                        m791q();
                        break;
                    case 239:
                        break;
                }
            }
            String strM484FN = C0106ZJ.m484FN(this.f785QU, m790QU(f778q));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            JSONObject jSONObject2 = new JSONObject(strM484FN);
            int i2 = jSONObject2.getInt(C0165.m798(f886short, 1108, 10, 2936));
            String strM861 = C0182.m861(f886short, 1118, 13, 3101);
            String strM814 = C0170.m814(f886short, 1131, 4, 1358);
            int i3 = 1740;
            while (true) {
                i3 ^= 1757;
                switch (i3) {
                    case 17:
                        i3 = i2 == 0 ? 1833 : 1802;
                    case 54:
                    case 471:
                        jSONArray = new JSONObject(C0152vp.m722FN(jSONObject2.getString(strM814), this.f783MH, this.f787UJ)).getJSONArray(strM861);
                        break;
                    case 500:
                        jSONArray = new JSONObject(jSONObject2.getString(strM814)).getJSONArray(strM861);
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
                            JSONObject jSONObject3 = jSONArray.getJSONObject(i5);
                            boolean zHas = jSONObject3.has(strM805);
                            String strM845 = C0178.m845(f886short, 1135, 2, 784);
                            int i7 = 48891;
                            while (true) {
                                i7 ^= 48908;
                                switch (i7) {
                                    case 22:
                                    case 53:
                                        JSONObject jSONObject4 = new JSONObject();
                                        boolean zHas2 = jSONObject3.has(strM805);
                                        String strM801 = C0166.m801(f886short, 1141, 7, 974);
                                        int i8 = 49790;
                                        while (true) {
                                            i8 ^= 49807;
                                            switch (i8) {
                                                case 18:
                                                case 51:
                                                    jSONObject4.put(strM801, jSONObject3.getString(strM845));
                                                    break;
                                                case 84:
                                                    jSONObject4.put(strM801, jSONObject3.getString(strM805));
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
                                        jSONObject4.put(C0170.m814(f886short, 1148, 9, 810), jSONObject3.getString(C0174.m828(f886short, 1157, 5, 2436)));
                                        jSONArray2.put(jSONObject4);
                                        break;
                                    case 503:
                                        i7 = !zHas ? 49635 : 48953;
                                    case 32495:
                                        this.f791u = jSONObject3.getString(strM845);
                                        this.f784Mo = jSONObject3.getString(C0183.m866(f886short, 1137, 4, 745));
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
                            int i11 = i5 + 1;
                            int i12 = 50689;
                            while (true) {
                                i12 ^= 50706;
                                switch (i12) {
                                    case 19:
                                        i12 = 50720;
                                        break;
                                    case 50:
                                        break;
                                }
                            }
                            i5 = i11;
                            break;
                        case 239:
                            i6 = i5 < length ? 48860 : 48829;
                    }
                    jSONObject.put(C0168.m805(f886short, 1162, 5, 3159), jSONArray2);
                    int i13 = 50813;
                    while (true) {
                        i13 ^= 50830;
                        switch (i13) {
                            case 18:
                                break;
                            case 53:
                                break;
                            case 243:
                                if (!z) {
                                    break;
                                } else {
                                    i13 = 51557;
                                }
                            case 4075:
                                jSONObject.put(C0171.m816(f886short, 1167, 7, 682), new JSONObject("{\"1\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"警匪\",\"v\":\"警匪\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动画\",\"v\":\"动画\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"枪战\",\"v\":\"枪战\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"青春\",\"v\":\"青春\"},{\"n\":\"文艺\",\"v\":\"文艺\"},{\"n\":\"微电影\",\"v\":\"微电影\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"农村\",\"v\":\"农村\"},{\"n\":\"儿童\",\"v\":\"儿童\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"中国大陆\",\"v\":\"大陆\"},{\"n\":\"中国香港\",\"v\":\"香港\"},{\"n\":\"中国台湾\",\"v\":\"台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]}],\"2\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"青春偶像\",\"v\":\"青春偶像\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"家庭\",\"v\":\"家庭\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"乡村\",\"v\":\"乡村\"},{\"n\":\"情景\",\"v\":\"情景\"},{\"n\":\"商战\",\"v\":\"商战\"},{\"n\":\"网剧\",\"v\":\"网剧\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"中国大陆\",\"v\":\"大陆\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]}],\"4\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"热血\",\"v\":\"热血\"},{\"n\":\"推理\",\"v\":\"推理\"},{\"n\":\"搞笑\",\"v\":\"搞笑\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"萝莉\",\"v\":\"萝莉\"},{\"n\":\"校园\",\"v\":\"校园\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"机战\",\"v\":\"机战\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"少年\",\"v\":\"少年\"},{\"n\":\"少女\",\"v\":\"少女\"},{\"n\":\"社会\",\"v\":\"社会\"},{\"n\":\"原创\",\"v\":\"原创\"},{\"n\":\"亲子\",\"v\":\"亲子\"},{\"n\":\"益智\",\"v\":\"益智\"},{\"n\":\"励志\",\"v\":\"励志\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国\",\"v\":\"内地\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"欧美\",\"v\":\"欧美\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}],\"3\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"选秀\",\"v\":\"选秀\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"访谈\",\"v\":\"访谈\"},{\"n\":\"播报\",\"v\":\"播报\"},{\"n\":\"旅游\",\"v\":\"旅游\"},{\"n\":\"音乐\",\"v\":\"音乐\"},{\"n\":\"美食\",\"v\":\"美食\"},{\"n\":\"纪实\",\"v\":\"纪实\"},{\"n\":\"曲艺\",\"v\":\"曲艺\"},{\"n\":\"生活\",\"v\":\"生活\"},{\"n\":\"游戏互动\",\"v\":\"游戏互动\"},{\"n\":\"财经\",\"v\":\"财经\"},{\"n\":\"求职\",\"v\":\"求职\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"港台\",\"v\":\"港台\"},{\"n\":\"日韩\",\"v\":\"日韩\"},{\"n\":\"欧美\",\"v\":\"欧美\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]}]}]}"));
                                break;
                            default:
                                continue;
                        }
                        i13 = 50875;
                    }
                    return jSONObject.toString();
                }
            }
        } catch (Throwable th) {
            System.out.println(th);
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x00ed. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x012c. Please report as an issue. */
    public String homeVideoContent() {
        JSONArray jSONArray;
        String strM866 = C0183.m866(f886short, 1174, 11, 997);
        String strM820 = C0172.m820(f886short, 1185, 7, 1627);
        String strM809 = C0169.m809(f886short, 1192, 8, 2083);
        String strM814 = C0170.m814(f886short, 1200, 6, 3018);
        try {
            JSONObject jSONObject = new JSONObject(C0106ZJ.m484FN(this.f793xC + C0166.m801(f886short, 1206, 18, 1593) + this.f791u, m790QU(f778q)));
            JSONArray jSONArray2 = new JSONArray();
            int i = jSONObject.getInt(C0177.m841(f886short, 1224, 10, 1673));
            String strM828 = C0174.m828(f886short, 1234, 5, 2495);
            String strM861 = C0182.m861(f886short, 1239, 8, 3166);
            String strM8282 = C0174.m828(f886short, 1247, 4, 2416);
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                    case 49:
                        i2 = i == 0 ? 1709 : 1678;
                    case 204:
                        jSONArray = new JSONObject(jSONObject.getString(strM8282)).getJSONArray(strM861).getJSONObject(1).getJSONArray(strM828);
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
                        jSONArray = new JSONObject(C0152vp.m722FN(jSONObject.getString(strM8282), this.f783MH, this.f787UJ)).getJSONArray(strM861).getJSONObject(1).getJSONArray(strM828);
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
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put(strM814, jSONObject2.getString(strM814));
                            jSONObject3.put(strM809, jSONObject2.getString(strM809));
                            jSONObject3.put(strM820, jSONObject2.getString(strM820));
                            jSONObject3.put(strM866, jSONObject2.getString(strM866));
                            jSONArray2.put(jSONObject3);
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
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(C0171.m816(f886short, 1251, 4, 1452), jSONArray2);
                    return jSONObject4.toString();
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }

    public void init(Context context, String str) {
        String str2 = "۠ۦۤ";
        String strM724Mo = null;
        HashMap<String, String> mapM792xC = null;
        while (true) {
            switch (C0174.m829(str2)) {
                case 56324:
                    str2 = "۟۟۟";
                    mapM792xC = m792xC();
                    break;
                case 1746687:
                    str = C0106ZJ.m484FN(strM724Mo, mapM792xC);
                    str2 = "ۦۢۦ";
                    break;
                case 1747870:
                    super.init(context, str);
                    str2 = "۠ۧۧ";
                    break;
                case 1747904:
                    strM724Mo = C0152vp.m724Mo(str);
                    str2 = "۠ۤ";
                    break;
                case 1752583:
                    return;
                default:
                    this.f788W = str;
                    str2 = "ۥۣۥ";
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:123:0x02e7. Please report as an issue. */
    public String playerContent(String str, String str2, List<String> list) {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            String[] strArrSplit = str2.split(C0168.m805(f886short, 1255, 1, 3048));
            String str3 = strArrSplit[0];
            String str4 = strArrSplit[1];
            JSONArray jSONArray = null;
            String str5 = this.f793xC + C0176.m836(f886short, 1256, 14, 2415);
            JSONArray jSONArray2 = this.f782KT;
            String strM801 = C0166.m801(f886short, 1270, 10, 1368);
            String strM861 = C0182.m861(f886short, 1280, 4, 1749);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = jSONArray2 != null ? 1709 : 1678;
                    case 204:
                        int length = jSONArray2.length();
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = length == 0 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    break;
                                case 500:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        break;
                }
            }
            JSONObject jSONObject3 = new JSONObject(C0106ZJ.m484FN(this.f785QU, m790QU(f778q)));
            int i3 = jSONObject3.getInt(strM801);
            String strM8612 = C0182.m861(f886short, 1284, 11, 973);
            int i4 = 1864;
            while (true) {
                i4 ^= 1881;
                switch (i4) {
                    case 17:
                        i4 = i3 == 0 ? 48736 : 48705;
                    case 47384:
                        this.f782KT = new JSONObject(C0152vp.m722FN(jSONObject3.getString(strM861), this.f783MH, this.f787UJ)).getJSONArray(strM8612);
                        break;
                    case 47417:
                        this.f782KT = new JSONObject(jSONObject3.getString(strM861)).getJSONArray(strM8612);
                        int i5 = 48767;
                        while (true) {
                            i5 ^= 48784;
                            switch (i5) {
                                case 14:
                                    break;
                                case 239:
                                    i5 = 48798;
                                    continue;
                                default:
                                    continue;
                            }
                        }
                    case 47483:
                }
            }
            int i6 = 0;
            while (true) {
                int length2 = this.f782KT.length();
                String strM805 = C0168.m805(f886short, 1295, 5, 1744);
                String strM834 = C0175.m834(f886short, 1300, 3, 334);
                int i7 = 48891;
                while (true) {
                    i7 ^= 48908;
                    switch (i7) {
                        case 22:
                        case 53:
                            int i8 = 0;
                            while (true) {
                                int length3 = jSONArray.length();
                                int i9 = 51588;
                                while (true) {
                                    i9 ^= 51605;
                                    switch (i9) {
                                        case 17:
                                            i9 = i8 < length3 ? 51681 : 51650;
                                        case 54:
                                        case 87:
                                            break;
                                        case 116:
                                            String string = jSONArray.getJSONObject(i8).getString(C0183.m866(f886short, 1312, 5, 1845));
                                            String string2 = jSONArray.getJSONObject(i8).getString(strM834);
                                            String strFormUpload = formUpload(str5, str3, string, str4, this.f789i);
                                            boolean zContains = strFormUpload.contains(C0170.m814(f886short, 1317, 4, 950));
                                            int i10 = 51712;
                                            while (true) {
                                                i10 ^= 51729;
                                                switch (i10) {
                                                    case 14:
                                                    case 17:
                                                        i10 = zContains ? 51805 : 51774;
                                                    case 47:
                                                        break;
                                                    case 76:
                                                        JSONObject jSONObject4 = new JSONObject(C0106ZJ.m484FN(string2 + str3, m790QU(f778q)));
                                                        boolean zHas = jSONObject4.has(strM834);
                                                        int i11 = 51836;
                                                        while (true) {
                                                            i11 ^= 51853;
                                                            switch (i11) {
                                                                case 241:
                                                                    i11 = zHas ? 52580 : 52549;
                                                                case 1963:
                                                                case 1992:
                                                                    break;
                                                                case 2025:
                                                                    String string3 = jSONObject4.getString(strM834);
                                                                    int i12 = 52611;
                                                                    while (true) {
                                                                        i12 ^= 52628;
                                                                        switch (i12) {
                                                                            case 23:
                                                                                i12 = string3 != "" ? 52704 : 52673;
                                                                            case 54:
                                                                            case 85:
                                                                                break;
                                                                            case 116:
                                                                                String string4 = jSONObject4.getString(strM834);
                                                                                jSONObject2.put(strM805, 0);
                                                                                jSONObject2.put(strM834, string4);
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            int i13 = new JSONObject(strFormUpload).getInt(strM801);
                                            int i14 = 52735;
                                            while (true) {
                                                i14 ^= 52752;
                                                switch (i14) {
                                                    case 14:
                                                    case 45:
                                                        jSONObject = new JSONObject(C0152vp.m722FN(new JSONObject(strFormUpload).getString(strM861), this.f783MH, this.f787UJ));
                                                        break;
                                                    case 1007:
                                                        i14 = i13 == 0 ? 53479 : 52797;
                                                    case 7927:
                                                        JSONObject jSONObject5 = new JSONObject(new JSONObject(strFormUpload).getString(strM861));
                                                        int i15 = 53510;
                                                        while (true) {
                                                            i15 ^= 53527;
                                                            switch (i15) {
                                                                case 17:
                                                                    i15 = 53541;
                                                                case 50:
                                                                    break;
                                                            }
                                                            jSONObject = jSONObject5;
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                            boolean zHas2 = jSONObject.has(strM834);
                                            int i16 = 53634;
                                            while (true) {
                                                i16 ^= 53651;
                                                switch (i16) {
                                                    case 17:
                                                        i16 = zHas2 ? 53727 : 53696;
                                                    case 50:
                                                    case 76:
                                                        String string5 = jSONObject.getString(strM834);
                                                        int i17 = 53758;
                                                        while (true) {
                                                            i17 ^= 53775;
                                                            switch (i17) {
                                                                case 1009:
                                                                    i17 = string5 != "" ? 54502 : 54471;
                                                                case 1703:
                                                                case 1736:
                                                                    break;
                                                                case 1769:
                                                                    String string6 = jSONObject.getString(strM834);
                                                                    jSONObject2.put(strM805, 0);
                                                                    jSONObject2.put(strM834, string6);
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 83:
                                                        break;
                                                }
                                            }
                                            int i18 = i8 + 1;
                                            int i19 = 54533;
                                            while (true) {
                                                i19 ^= 54550;
                                                switch (i19) {
                                                    case 19:
                                                        i19 = 54564;
                                                        break;
                                                    case 50:
                                                        break;
                                                }
                                            }
                                            i8 = i18;
                                            break;
                                    }
                                }
                            }
                            break;
                        case 503:
                            i7 = i6 < length2 ? 49635 : 48953;
                        case 32495:
                            JSONObject jSONObject6 = this.f782KT.getJSONObject(i6);
                            boolean zContains2 = jSONObject6.getString(C0180.m851(f886short, 1303, 3, 2182)).contains(str4);
                            int i20 = 49666;
                            while (true) {
                                i20 ^= 49683;
                                switch (i20) {
                                    case 17:
                                        i20 = zContains2 ? 49759 : 49728;
                                    case 50:
                                    case 76:
                                        jSONArray = jSONObject6.getJSONArray(C0174.m828(f886short, 1306, 6, 1767));
                                        int length4 = jSONArray.length();
                                        int i21 = 49790;
                                        while (true) {
                                            i21 ^= 49807;
                                            switch (i21) {
                                                case 18:
                                                case 51:
                                                    break;
                                                case 84:
                                                    boolean zM605u = C0118ga.m605u(str3);
                                                    int i22 = 49914;
                                                    while (true) {
                                                        i22 ^= 49931;
                                                        switch (i22) {
                                                            case 497:
                                                                i22 = zM605u ? 50658 : 50627;
                                                            case 1711:
                                                            case 1736:
                                                                break;
                                                            case 1769:
                                                                jSONObject2.put(strM805, 0);
                                                                jSONObject2.put(strM834, str3);
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 241:
                                                    i21 = length4 == 0 ? 49883 : 49852;
                                            }
                                        }
                                        break;
                                    case 83:
                                        boolean zM605u2 = C0118ga.m605u(str3);
                                        int i23 = 50689;
                                        while (true) {
                                            i23 ^= 50706;
                                            switch (i23) {
                                                case 19:
                                                    i23 = zM605u2 ? 50782 : 50751;
                                                case 45:
                                                    break;
                                                case 50:
                                                case 76:
                                                    jSONObject2.put(strM805, 0);
                                                    jSONObject2.put(strM834, str3);
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                            int i24 = i6 + 1;
                            int i25 = 50813;
                            while (true) {
                                i25 ^= 50830;
                                switch (i25) {
                                    case 18:
                                        break;
                                    case 243:
                                        i25 = 50844;
                                        break;
                                }
                            }
                            i6 = i24;
                            break;
                    }
                    return jSONObject2.toString();
                }
            }
        } catch (Throwable th) {
            int i26 = 54657;
            while (true) {
                i26 ^= 54674;
                switch (i26) {
                    case 19:
                        i26 = 54688;
                        continue;
                    case 50:
                        break;
                    default:
                        continue;
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x00f9. Please report as an issue. */
    public String searchContent(String str, boolean z) {
        JSONArray jSONArray;
        String strM805 = C0168.m805(f886short, 1321, 11, 1917);
        String strM798 = C0165.m798(f886short, 1332, 7, 2195);
        String strM866 = C0183.m866(f886short, 1339, 8, 2813);
        String strM841 = C0177.m841(f886short, 1347, 6, 3027);
        try {
            boolean zIsEmpty = this.f793xC.isEmpty();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = zIsEmpty ? 1709 : 1678;
                    case 204:
                        m791q();
                        break;
                    case 239:
                        break;
                }
            }
            JSONObject jSONObject = new JSONObject();
            String strM484FN = C0106ZJ.m484FN(this.f793xC + C0170.m814(f886short, 1353, 21, 904) + URLEncoder.encode(str) + C0171.m816(f886short, 1374, 13, 3160), m790QU(f778q));
            JSONArray jSONArray2 = new JSONArray();
            JSONObject jSONObject2 = new JSONObject(strM484FN);
            int i2 = jSONObject2.getInt(C0169.m809(f886short, 1387, 10, 1545));
            String strM856 = C0181.m856(f886short, 1397, 4, 552);
            int i3 = 1740;
            while (true) {
                i3 ^= 1757;
                switch (i3) {
                    case 17:
                        i3 = i2 == 0 ? 1833 : 1802;
                    case 54:
                    case 471:
                        jSONArray = new JSONObject(C0152vp.m722FN(jSONObject2.getString(strM856), this.f783MH, this.f787UJ)).getJSONArray(strM856);
                        break;
                    case 500:
                        jSONArray = new JSONObject(jSONObject2.getString(strM856)).getJSONArray(strM856);
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
                            JSONObject jSONObject3 = jSONArray.getJSONObject(i5);
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put(strM841, jSONObject3.getString(strM841));
                            jSONObject4.put(strM866, jSONObject3.getString(strM866));
                            jSONObject4.put(strM798, jSONObject3.getString(strM798));
                            jSONObject4.put(strM805, jSONObject3.getString(strM805));
                            jSONArray2.put(jSONObject4);
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
                    jSONObject.put(C0169.m809(f886short, 1401, 4, 1297), jSONArray2);
                    return jSONObject.toString();
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }
}
