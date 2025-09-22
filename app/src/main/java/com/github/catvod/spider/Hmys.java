package com.github.catvod.spider;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0165;
import com.github.catvod.parser.C0166;
import com.github.catvod.spider.merge.AbstractC0099V3;
import com.github.catvod.spider.merge.C0079Nx;
import com.github.catvod.spider.merge.C0106ZJ;
import com.github.catvod.spider.merge.C0118ga;
import com.github.catvod.spider.merge.C0131mQ;
import com.github.catvod.spider.merge.C0154wT;
import com.github.catvod.spider.merge.C0168;
import com.github.catvod.spider.merge.C0169;
import com.github.catvod.spider.merge.C0170;
import com.github.catvod.spider.merge.C0171;
import com.github.catvod.spider.merge.C0172;
import com.github.catvod.spider.merge.C0174;
import com.github.catvod.spider.merge.C0175;
import com.github.catvod.spider.merge.C0176;
import java.io.ByteArrayInputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class Hmys extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f821short = {1089, 1123, 1030, 1125, 1126, 1125, 1101, 1039, 1134, 1101, 1115, 1101, 1123, 1104, 1145, 1029, 1025, 1095, 1150, 1135, 1145, 1149, 1024, 1146, 1118, 1025, 1026, 1117, 1090, 1088, 1124, 1127, 2667, 2591, 2576, 2664, 2669, 2615, 2608, 2666, 2623, 2667, 2656, 2566, 2587, 2583, 2670, 2587, 2670, 2568, 2566, 2586, 2681, 2591, 2576, 2664, 2657, 2666, 2667, 2591, 2576, 2664, 2666, 2667, 2657, 2666, 1913, 1890, 1891, 1901, 1919, 1899, 1892, 1901, 1232, 1235, 1243, 1227, 1223, 1244, 529, 531, 531, 531, 531, 1054, 1040, 1148, 1059, 1138, 1045, 1036, 1142, 1071, 1047, 1143, 1052, 1070, 1139, 1027, 1137, 1075, 1027, 1136, 1038, 1072, 1041, 1141, 1026, 390, 386, 390, 386, 395, 395, 395, 395, 1953, 1965, 1967, 2028, 1966, 1959, 1965, 1969, 1964, 1972, 27540, -25269, -28959, -24650, 1322, 1403, 1321, 1400, 1326, 1407, 1401, 1321, 1326, 1395, 1326, 1394, 1321, 1400, 1395, 1320, 1326, 1394, 1326, 1325, 1402, 1400, 1325, 1327, 1404, 1402, 1327, 1402, 1407, 1404, 1403, 1326, 2249, 2283, 2278, 2217, 2249, 2283, 2272, 2273, 2280, 602, 618, 635, 620, 620, 615, 548, 606, 608, 621, 637, 609, 3255, 3254, 3262, 3254, 3120, 3072, 3089, 3078, 3078, 3085, 3150, 3115, 3078, 3082, 3076, 3083, 3095, 1887, 1886, 1881, 1885, 544, 513, 530, 525, 519, 513, 585, 557, 512, 2829, 2863, 2863, 2857, 2876, 2872, 1966, 1983, 1983, 1955, 1958, 1964, 1966, 1979, 1958, 1952, 1953, 2016, 1977, 1953, 1963, 2017, 1974, 1952, 1978, 1981, 1966, 1983, 1958, 2017, 1977, 2046, 2017, 1961, 1978, 1955, 1955, 2020, 1957, 1980, 1952, 1953, 480, 454, 464, 455, 408, 500, 466, 464, 475, 449, 1049, 1078, 1084, 1066, 1079, 1073, 1084, 1698, 1664, 1677, 1730, 1698, 1673, 1693, 3070, 3068, 3051, 3048, 3051, 3068, 3069, 3051, 3062, 2626, 2494, 2437, 2433, 2447, 2436, 1112, 1138, 1144, 1062, 1113, 1134, 1127, 1134, 1130, 1144, 1134, 2572, 2598, 2604, 2674, 2575, 2611, 2622, 2603, 2617, 2608, 2605, 2610, 3128, 3113, 3113, 3120, 3133, 485, 462, 455, 456, 456, 451, 458, 537, 554, 573, 572, 550, 544, 545, 610, 524, 544, 555, 554, 2856, 2846, 2841, 2886, 2879, 2818, 2822, 2830, 3145, 3156, 3152, 3160, 3150, 3145, 3164, 3152, 3149, 1031, 754, 657, 750, 718, 3077, 1458, 1507, 1511, 1479, 1521, 1527, 1510, 1521, 1504, 1449, 2096, 2145, 2149, 2114, 2175, 2171, 2163, 2091, 2273, 2247, 2257, 2246, 2201, 2293, 2259, 2257, 2266, 2240, 2168, 2138, 2127, 2140, 936, 906, 906, 908, 921, 925, 1009, 1012, 1009, 740, 712, 713, 723, 706, 713, 723, 650, 755, 734, 727, 706, 2179, 2194, 2194, 2190, 2187, 2177, 2179, 2198, 2187, 2189, 2188, 2253, 2189, 2177, 2198, 2183, 2198, 2255, 2193, 2198, 2192, 2183, 2179, 2191, 1761, 1043, 1090, 1094, 1126, 1104, 1110, 1095, 1104, 1089, 1032, 2315, 2394, 2398, 2425, 2372, 2368, 2376, 2320, 1293, 1323, 1341, 1322, 1397, 1305, 1343, 1341, 1334, 1324, 1766, 1732, 1745, 1730, 3040, 3010, 3010, 3012, 3025, 3029, 2550, 2547, 2550, 2109, 2080, 2092, 2133, 2080, 2133, 2099, 2109, 2081, 1898, 1841, 1850, 1896, 1853, 1848, 1836, 1830, 1907, 1825, 1836, 1829, 1840, 1896, 1825, 1830, 1907, 1824, 1831, 1849, 1896, 1740, 1673, 1665, 1751, 2677, 3060, 1599, 1582, 1582, 1586, 1591, 1597, 1599, 1578, 1591, 1585, 1584, 1649, 1585, 1597, 1578, 1595, 1578, 1651, 1581, 1578, 1580, 1595, 1599, 1587, 788, 793, 784, 773, 1548, 1547, 1557, 3155, 3163, 1918, 1824, 1894, 1835, 2211, 2212, 1935, 1950, 1944, 1946, 1262, 1249, 1260, 1278, 1278, 2721, 2732, 2725, 2736, 2462, 2434, 2438, 2453, 2747, 2728, 2751, 2747, 485, 427, 442, 419, 485, 424, 422, 421, 425, 417, 485, 425, 427, 446, 431, 429, 421, 440, 435, 22021, -26747, 1113, 1115, 1102, 1119, 2252, 2257, 2247, 2246, 2257, 2508, 2497, 2504, 2525, 2535, 2504, 2513, 2524, 967, 974, 965, 972, 991, 963, 1607, 1604, 1203, 1186, 1188, 1190, 1184, 1196, 1206, 1197, 1207, 2853, 2848, 2852, 2848, 2877, 2735, 2740, 2735, 2746, 2743, 1910, 1907, 1897, 1902, 1338, 1396, 1381, 1404, 1338, 1379, 1402, 1393, 1338, 1404, 1403, 1395, 1402, 2867, 2858, 2849, 2842, 2860, 2849, 1571, 1594, 1585, 1546, 1573, 1593, 1588, 1580, 1546, 1568, 1575, 1593, 2213, 2213, 2213, 589, 584, 594, 597, 1705, 1700, 1709, 1720, 1666, 1715, 1724, 1712, 1720, 487, 425, 440, 417, 487, 426, 420, 423, 427, 419, 487, 427, 425, 444, 429, 431, 423, 442, 433, 407, 444, 433, 440, 429, 2932, 2929, 2916, 2929, 967, 1191, 1200, 1190, 1184, 1209, 1185, 3281, 3292, 3285, 3264, 3322, 3276, 3265, 1531, 1526, 1535, 1514, 1488, 1535, 1510, 1515, 3289, 3286, 3291, 3273, 3273, 3080, 3079, 3074, 3098, 3083, 3100, 3101, 2784, 2809, 2802, 2761, 2815, 2802, 561, 639, 622, 631, 561, 624, 639, 616, 561, 631, 624, 634, 635, 614, 545, 624, 639, 616, 577, 631, 634, 547, 551, 550, 430, 427, 446, 427, 2399, 1675, 1692, 1674, 1676, 1685, 1677, 1686, 1688, 1691, 1687, 1695, 1707, 1688, 1693, 1671, 1664, 919, 910, 901, 958, 909, 904, 914, 917, 2039, 2030, 2021, 2014, 2031, 2016, 2028, 2020, 2434, 2463, 2434, 2458, 2451, 2932, 2925, 2918, 2909, 2930, 2923, 2913, 1001, 1008, 1018, 1490, 1483, 1472, 1531, 1494, 1473, 1481, 1477, 1494, 1487, 1495, 2576, 2560, 2572, 2577, 2566, 2828, 2825, 2835, 2836, 2965, 2964, 2951, 2968, 2962, 2964, 2848, 2851, 2828, 2816, 2868, 2858, 2848, 305, 273, 2996, 2998, 814, 421, 425, 426, 426, 419, 421, 434, 431, 425, 424, 2584, 2561, 2570, 2609, 2563, 2575, 2590, 2609, 2567, 2570, 504, 481, 490, 465, 487, 490, 2775, 2713, 2696, 2705, 2775, 2702, 2711, 2716, 2775, 2696, 2708, 2713, 2689, 2727, 2701, 2698, 2708, 2011, 2014, 1995, 2014, 642, 2890, 2909, 2891, 2893, 2900, 2892, 2267, 2176, 2187, 2265, 2188, 2185, 2205, 2199, 2242, 2192, 2205, 2196, 2177, 2265, 2185, 2263, 2193, 2268, 2242, 2193, 2198, 2184, 2265, 2374, 2399, 2388, 2415, 2373, 2370, 2396, 1209, 1276, 1268, 1186, 3046, 3054, 564, 549, 566, 567, 545, 2100, 2099, 2093, 1966, 1970, 1983, 1959, 1931, 1964, 1970, 2162, 872, 877, 888, 877, 1708, 1708, 1708, 1865, 1867, 1884, 1857, 1863, 1862, 799, 2119, 2057, 
    2072, 2049, 2119, 2075, 2076, 2057, 2076, 2075, 2119, 2052, 2055, 2063, 2049, 2054, 3161, 3162, 3154, 3164, 3163, 3187, 3162, 3143, 3160, 3156, 3137, 3093, 3080, 3093, 1421, 1418, 1421, 1424, 1482, 1482, 1482, 1772, 1789, 1775, 1775, 1771, 1779, 1774, 1784, 2195, 2193, 2193, 2205, 2183, 2204, 2182, 1127, 1065, 1080, 1057, 1127, 1085, 1083, 1069, 1082, 1127, 1057, 1062, 1057, 1084, 3160, 3167, 3160, 3141, 3191, 3166, 3139, 3164, 3152, 3141, 3089, 3084, 3089, 3300, 3315, 3301, 3299, 3322, 3298, 2379, 2381, 2395, 2380, 2401, 2391, 2384, 2392, 2385, 1511, 1532, 1528, 1526, 1533, 927, 977, 960, 985, 927, 963, 981, 977, 962, 979, 984, 927, 962, 981, 963, 965, 988, 964, 257, 287, 3202, 2857, 2852, 2861, 2872, 2818, 2861, 2868, 2873, 2785, 1941, 1929, 2604, 2601, 2611, 2612};

    /* renamed from: q */
    private static String f75q = C0172.m820(f821short, 0, 32, 1079);

    /* renamed from: xC */
    private static final Pattern f76xC = Pattern.compile(C0166.m801(f821short, 32, 34, 2627));

    /* renamed from: QU */
    private String f82QU = "";

    /* renamed from: UJ */
    private String f83UJ = C0166.m801(f821short, 66, 8, 1802);

    /* renamed from: u */
    private String f87u = C0177.m841(f821short, 74, 6, 1202);

    /* renamed from: Mo */
    private String f81Mo = C0180.m851(f821short, 80, 5, 547);

    /* renamed from: i */
    private String f85i = C0165.m798(f821short, 85, 24, 1092);

    /* renamed from: MH */
    private String f80MH = C0171.m816(f821short, 109, 8, 435);

    /* renamed from: se */
    private String f86se = C0178.m845(f821short, 117, 10, 1986);

    /* renamed from: W */
    private String f84W = C0179.m849(f821short, 127, 4, 1831);

    /* renamed from: FN */
    private String f79FN = "";

    /* renamed from: B */
    private String f77B = "";

    /* renamed from: w8 */
    private String f88w8 = "";

    /* renamed from: F */
    private String f78F = C0169.m809(f821short, 131, 32, 1355);

    public Hmys() {
        int iM830 = C0174.m830();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = iM830 <= 0 ? 1709 : 1678;
                case 204:
                    System.out.println(Integer.parseInt(C0183.m863("bKw3IfygvzXWfCUOql")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* renamed from: QU */
    private HashMap<String, String> m38QU(String str) {
        HashMap<String, String> map = null;
        String strM801 = null;
        String strM828 = null;
        short[] sArr = null;
        String strM798 = null;
        StringBuilder sbAppend = null;
        int i = 0;
        StringBuilder sb = null;
        String str2 = "ۡۧۧ";
        while (true) {
            switch (C0174.m829(str2)) {
                case 56416:
                    strM828 = C0170.m814(sArr, 214, 6, 2892);
                    sArr = f821short;
                    strM801 = C0170.m814(sArr, 220, 36, 1999);
                    str2 = "۠ۡۥ";
                    break;
                case 1746785:
                    strM828 = C0171.m816(sArr, 205, 9, 612);
                    map.put(strM828, strM801);
                    sArr = f821short;
                    str2 = "ۣۣ";
                    break;
                case 1747716:
                    map.put(strM828, strM801);
                    sArr = f821short;
                    strM828 = C0171.m816(sArr, 256, 10, 437);
                    str2 = "ۢۡۡ";
                    break;
                case 1748865:
                    map = new HashMap<>();
                    strM801 = Build.MODEL;
                    strM828 = URLEncoder.encode(strM801);
                    str2 = "ۤۢۤ";
                    break;
                case 1748866:
                    strM828 = C0177.m841(sArr, 184, 4, 3206);
                    map.put(strM801, strM828);
                    sArr = f821short;
                    str2 = "ۣ۟ۧ";
                    break;
                case 1749605:
                    str = C0179.m849(sArr, 342, 8, 2923);
                    map.put(str, strM801);
                    sArr = f821short;
                    str2 = "ۢۤۢ";
                    break;
                case 1749634:
                    sArr = f821short;
                    strM801 = C0178.m845(sArr, 266, 7, 1112);
                    map.put(strM828, strM801);
                    str2 = "ۨۡۧ";
                    break;
                case 1749637:
                    sArr = f821short;
                    strM828 = C0178.m845(sArr, 295, 11, 1035);
                    map.put(strM828, strM798);
                    str2 = "ۦۧۡ";
                    break;
                case 1749697:
                    sbAppend = sb.append("");
                    strM801 = sb.toString();
                    sArr = f821short;
                    str2 = "ۣۢ۠";
                    break;
                case 1749728:
                    map.put(C0178.m845(sArr, 350, 9, 3133), strM801);
                    return map;
                case 1749763:
                    map.put(strM828, str);
                    sbAppend = new StringBuilder();
                    i = Build.VERSION.SDK_INT;
                    str2 = "ۣۢ۠";
                    break;
                case 1750539:
                    strM801 = C0168.m805(sArr, 188, 13, 3171);
                    sArr = f821short;
                    strM828 = C0181.m856(sArr, 201, 4, 1901);
                    str2 = "ۣۣۨ";
                    break;
                case 1750564:
                    strM828 = C0174.m828(sArr, 280, 9, 2958);
                    sArr = f821short;
                    strM798 = C0165.m798(sArr, 289, 1, 2675);
                    str2 = "ۤۡۡ";
                    break;
                case 1750625:
                    sbAppend.append(i);
                    sb = sbAppend.append("");
                    strM798 = sbAppend.toString();
                    str2 = "ۢۡۤ";
                    break;
                case 1750629:
                    strM801 = C0166.m801(f821short, 172, 12, 521);
                    sArr = f821short;
                    str2 = "ۡۧۨ";
                    break;
                case 1751556:
                    map.put(strM828, strM798);
                    sArr = f821short;
                    strM828 = C0168.m805(sArr, 290, 5, 2538);
                    str2 = "ۢۥۦ";
                    break;
                case 1751590:
                    sArr = f821short;
                    strM801 = C0175.m834(sArr, 163, 9, 2180);
                    map.put(strM801, strM828);
                    str2 = "ۣۢۤ";
                    break;
                case 1751714:
                    strM801 = C0178.m845(sArr, 323, 7, 422);
                    map.put(strM801, str);
                    strM798 = this.f81Mo;
                    str2 = "ۣۨۦ";
                    break;
                case 1753664:
                    sArr = f821short;
                    str = C0170.m814(sArr, 306, 12, 2655);
                    map.put(str, strM801);
                    str2 = "ۨۦ۟";
                    break;
                case 1754380:
                    strM828 = C0175.m834(sArr, 273, 7, 1775);
                    map.put(strM828, strM798);
                    sArr = f821short;
                    str2 = "ۣ۠ۡ";
                    break;
                case 1754506:
                    map.put(strM798, strM828);
                    str = this.f87u;
                    sArr = f821short;
                    str2 = "ۤۦۤ";
                    break;
                case 1755406:
                    strM828 = Build.BRAND;
                    strM798 = URLEncoder.encode(strM828);
                    sArr = f821short;
                    str2 = "ۧ۟ۤ";
                    break;
                case 1755464:
                    map.put(strM801, strM828);
                    strM801 = this.f79FN;
                    sArr = f821short;
                    str2 = "۟ۢۤ";
                    break;
                case 1755467:
                    sArr = f821short;
                    strM828 = C0165.m798(sArr, 330, 12, 591);
                    map.put(strM828, strM798);
                    str2 = "ۢۤ۟";
                    break;
                case 1755553:
                    strM828 = this.f83UJ;
                    sArr = f821short;
                    strM798 = C0175.m834(sArr, 318, 5, 3161);
                    str2 = "ۣۧۦ";
                    break;
                default:
                    sb = new StringBuilder();
                    sbAppend = sb.append(System.currentTimeMillis());
                    str2 = "ۣۢۢ";
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x012e. Please report as an issue. */
    /* renamed from: UJ */
    static Object[] m39UJ(String str, String str2) {
        String strM801 = C0166.m801(f821short, 359, 1, 1080);
        boolean zContains = str2.contains(strM801);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = zContains ? 1709 : 1678;
                case 204:
                    str2 = str2.split(C0172.m820(f821short, 360, 2, 686))[0];
                    break;
                case 239:
                    break;
            }
        }
        String path = Uri.parse(str).getPath();
        String hexString = Integer.toHexString((int) (System.currentTimeMillis() / 1000));
        String str3 = str + strM801 + str2.replaceAll(C0178.m845(f821short, 362, 2, 690), C0170.m814(f821short, 364, 1, 3107)) + C0176.m836(f821short, 365, 10, 1428) + C0118ga.m604q(f75q + path + hexString, C0118ga.f677xC).toLowerCase() + C0171.m816(f821short, 375, 8, 2070) + hexString;
        AbstractC0099V3.p pVar = new AbstractC0099V3.p() { // from class: com.github.catvod.spider.Hmys.7
            {
                int iM830 = C0174.m830();
                int i2 = 1616;
                while (true) {
                    i2 ^= 1633;
                    switch (i2) {
                        case 14:
                        case 49:
                            i2 = iM830 <= 0 ? 1709 : 1678;
                        case 204:
                            System.out.println(Integer.valueOf(C0177.m839("A4j")));
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
            public String onResponse(Response response) {
                return null;
            }
        };
        HashMap map = new HashMap();
        map.put(C0171.m816(f821short, 383, 10, 2228), C0174.m828(f821short, 393, 4, 2101));
        map.put(C0166.m801(f821short, 397, 6, 1001), C0172.m820(f821short, 403, 3, 987));
        C0106ZJ.m490UJ(C0106ZJ.m488QU(), str3, null, map, pVar);
        int iCode = pVar.getResult().code();
        int i2 = 1740;
        while (true) {
            i2 ^= 1757;
            switch (i2) {
                case 17:
                    i2 = iCode == 200 ? 1833 : 1802;
                case 54:
                case 471:
                    return null;
                case 500:
                    String strM798 = pVar.getResult().headers().get(C0183.m866(f821short, 406, 12, 679));
                    int i3 = 1864;
                    while (true) {
                        i3 ^= 1881;
                        switch (i3) {
                            case 17:
                                i3 = strM798 == null ? 48736 : 48705;
                            case 47384:
                                break;
                            case 47417:
                                strM798 = C0165.m798(f821short, 418, 24, 2274);
                                break;
                            case 47483:
                        }
                    }
                    return new Object[]{200, strM798, pVar.getResult().body().byteStream()};
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x00dd. Please report as an issue. */
    /* renamed from: u */
    static Object[] m41u(String str, String str2) {
        String path = Uri.parse(str).getPath();
        String hexString = Integer.toHexString((int) (System.currentTimeMillis() / 1000));
        String lowerCase = C0118ga.m604q(f75q + path + hexString, C0118ga.f677xC).toLowerCase();
        String str3 = new String(C0131mQ.m678q(str2));
        String str4 = str + C0171.m816(f821short, 442, 1, 1758) + str3 + C0179.m849(f821short, 443, 10, 1077) + lowerCase + C0174.m828(f821short, 453, 8, 2349) + hexString;
        HashMap map = new HashMap();
        map.put(C0179.m849(f821short, 461, 10, 1368), C0170.m814(f821short, 471, 4, 1707));
        map.put(C0175.m834(f821short, 475, 6, 2977), C0182.m861(f821short, 481, 3, 2524));
        String strM484FN = C0106ZJ.m484FN(str4, map);
        String strSubstring = str.substring(0, str.indexOf(Uri.parse(str).getLastPathSegment()));
        StringBuilder sb = new StringBuilder();
        Matcher matcher = f76xC.matcher(strM484FN);
        int iEnd = 0;
        while (true) {
            boolean zFind = matcher.find();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = zFind ? 1709 : 1678;
                    case 204:
                        sb.append((CharSequence) strM484FN, iEnd, matcher.start());
                        boolean zContains = matcher.group().contains(C0170.m814(f821short, 484, 9, 2168));
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = zContains ? 1833 : 1802;
                                case 54:
                                case 471:
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(Proxy.localProxyUrl());
                                    sb2.append(C0177.m841(f821short, 493, 21, 1877));
                                    sb2.append(Base64.encodeToString((strSubstring + matcher.group(1)).getBytes(C0118ga.f677xC), 10));
                                    sb2.append(C0177.m841(f821short, 514, 4, 1770));
                                    sb2.append(str3.replaceAll(C0170.m814(f821short, 518, 1, 2643), C0171.m816(f821short, 519, 1, 2952)));
                                    sb.append(sb2.toString());
                                    break;
                                case 500:
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                i3 = 48674;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        iEnd = matcher.end();
                        int i4 = 48767;
                        while (true) {
                            i4 ^= 48784;
                            switch (i4) {
                                case 14:
                                    break;
                                case 239:
                                    i4 = 48798;
                                    break;
                            }
                        }
                        break;
                    case 239:
                        break;
                }
                sb.append((CharSequence) strM484FN, iEnd, strM484FN.length());
                return new Object[]{200, C0175.m834(f821short, 520, 24, 1630), new ByteArrayInputStream(sb.toString().getBytes(C0118ga.f677xC))};
            }
        }
    }

    public static Object[] vod(Map<String, String> map) {
        String str = map.get(C0175.m834(f821short, 544, 4, 864));
        String str2 = map.get(C0168.m805(f821short, 548, 3, 1657));
        String str3 = map.get(C0169.m809(f821short, 551, 2, 3120));
        String str4 = new String(Base64.decode(str2, 10), C0118ga.f677xC);
        try {
            boolean zEquals = str.equals(C0176.m836(f821short, 553, 4, 1811));
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (!zEquals) {
                            break;
                        } else {
                            i = 1709;
                        }
                    case 204:
                        return m41u(str4, str3);
                    case 239:
                        boolean zEquals2 = str.equals(C0174.m828(f821short, 557, 2, 2263));
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    if (!zEquals2) {
                                        break;
                                    } else {
                                        i2 = 1833;
                                    }
                                case 54:
                                    break;
                                case 471:
                                    return null;
                                case 500:
                                    return m39UJ(str4, str3);
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                    default:
                        continue;
                }
                i = 1678;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException, NumberFormatException {
        String strM851 = C0180.m851(f821short, 559, 4, 2047);
        String strM834 = C0175.m834(f821short, 563, 5, 1165);
        String strM809 = C0169.m809(f821short, 568, 4, 2773);
        String strM805 = C0168.m805(f821short, 572, 4, 2535);
        String strM8092 = C0169.m809(f821short, 576, 4, 2778);
        try {
            int i = Integer.parseInt(str2);
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                    case 49:
                        i2 = i == 0 ? 1709 : 1678;
                    case 204:
                        i = 1;
                        break;
                    case 239:
                        break;
                }
            }
            JSONArray jSONArray = new JSONArray();
            String str3 = this.f82QU + C0169.m809(f821short, 580, 19, 458);
            int i3 = 1740;
            while (true) {
                i3 ^= 1757;
                switch (i3) {
                    case 17:
                        i3 = map == null ? 1833 : 1802;
                    case 54:
                    case 471:
                        break;
                    case 500:
                        map = new HashMap<>();
                        break;
                }
            }
            boolean zContainsKey = map.containsKey(strM8092);
            String strM845 = C0178.m845(f821short, 599, 2, 1901);
            int i4 = 1864;
            while (true) {
                i4 ^= 1881;
                switch (i4) {
                    case 17:
                        i4 = !zContainsKey ? 48736 : 48705;
                    case 47384:
                        break;
                    case 47417:
                        map.put(strM8092, strM845);
                        break;
                    case 47483:
                }
            }
            boolean zContainsKey2 = map.containsKey(strM809);
            int i5 = 48767;
            while (true) {
                i5 ^= 48784;
                switch (i5) {
                    case 14:
                    case 45:
                        break;
                    case 76:
                        map.put(strM809, strM845);
                        break;
                    case 239:
                        i5 = !zContainsKey2 ? 48860 : 48829;
                }
            }
            boolean zContainsKey3 = map.containsKey(strM805);
            int i6 = 48891;
            while (true) {
                i6 ^= 48908;
                switch (i6) {
                    case 22:
                    case 53:
                        break;
                    case 503:
                        i6 = !zContainsKey3 ? 49635 : 48953;
                    case 32495:
                        map.put(strM805, strM845);
                        break;
                }
            }
            boolean zContainsKey4 = map.containsKey(strM834);
            int i7 = 49666;
            while (true) {
                i7 ^= 49683;
                switch (i7) {
                    case 17:
                        i7 = !zContainsKey4 ? 49759 : 49728;
                    case 50:
                    case 76:
                        map.put(strM834, strM845);
                        break;
                    case 83:
                        break;
                }
            }
            HashMap map2 = new HashMap();
            map2.put(C0179.m849(f821short, 601, 4, 1082), map.get(strM809));
            map2.put(C0171.m816(f821short, 605, 5, 2211), strM845);
            map2.put(C0179.m849(f821short, 610, 8, 2488), str);
            map2.put(strM851, str2);
            map2.put(strM8092, map.get(strM8092));
            map2.put(C0176.m836(f821short, 618, 6, 939), C0177.m841(f821short, 624, 2, 1654));
            map2.put(strM805, map.get(strM805));
            C0106ZJ.m492i(C0106ZJ.m488QU(), str3, map2, m38QU(this.f88w8), new AbstractC0099V3.Qe(this, jSONArray) { // from class: com.github.catvod.spider.Hmys.2

                /* renamed from: short, reason: not valid java name */
                private static final short[] f822short = {3172, 3197, 3190, 3149, 3195, 3190, 3099, 3102, 3083, 3102, 2105, 2674, 2661, 2675, 2677, 2668, 2676, 2090, 2099, 2104, 2051, 2098, 2109, 2097, 2105, 788, 777, 788, 780, 773, 1323, 1330, 1337, 1282, 1325, 1332, 1342, 3154, 3147, 3137, 796, 780, 768, 797, 778, 771, 792, 769, 769, 2032, 2025, 2018, 2009, 2036, 2019, 2027, 2023, 2036, 2029, 2037};

                /* renamed from: QU */
                final Hmys f90QU;

                /* renamed from: xC */
                final JSONArray f91xC;

                {
                    this.f90QU = this;
                    this.f91xC = jSONArray;
                    int iM822 = C0172.m822();
                    int i8 = 1616;
                    while (true) {
                        i8 ^= 1633;
                        switch (i8) {
                            case 14:
                            case 49:
                                i8 = iM822 >= 0 ? 1709 : 1678;
                            case 204:
                                System.out.println(Long.decode(C0174.m831("YYsn0FTrHbKnVep95Fqmr2")));
                                break;
                            case 239:
                                break;
                        }
                        return;
                    }
                }

                @Override // com.github.catvod.spider.merge.AbstractC0099V3
                public void onFailure(Call call, Exception exc) {
                    int iM818 = C0171.m818();
                    int i8 = 1616;
                    while (true) {
                        i8 ^= 1633;
                        switch (i8) {
                            case 14:
                            case 49:
                                i8 = iM818 >= 0 ? 1709 : 1678;
                            case 204:
                                System.out.println(Integer.valueOf(C0176.m789("8nKmNUc0qbujPhR")));
                                break;
                            case 239:
                                break;
                        }
                        return;
                    }
                }

                @Override // com.github.catvod.spider.merge.AbstractC0099V3
                public String onResponse(String str4) throws JSONException {
                    JSONArray jSONArray2;
                    int i8 = 0;
                    String strM841 = C0177.m841(f822short, 0, 6, 3090);
                    try {
                        jSONArray2 = new JSONObject(C0079Nx.m309q(new JSONObject(str4).optString(C0177.m841(f822short, 6, 4, 3199)).replaceAll(C0170.m814(f822short, 10, 1, 2099), ""), this.f90QU.f85i, this.f90QU.f80MH)).getJSONArray(C0166.m801(f822short, 11, 6, 2560));
                    } catch (JSONException e) {
                        int i9 = 48767;
                        while (true) {
                            i9 ^= 48784;
                            switch (i9) {
                                case 14:
                                    break;
                                case 239:
                                    i9 = 48798;
                                    break;
                            }
                        }
                    } catch (Exception e2) {
                        throw new RuntimeException(e2);
                    }
                    while (true) {
                        int i10 = i8;
                        int length = jSONArray2.length();
                        int i11 = 1616;
                        while (true) {
                            i11 ^= 1633;
                            switch (i11) {
                                case 14:
                                case 49:
                                    i11 = i10 < length ? 1709 : 1678;
                                case 204:
                                    JSONObject jSONObject = jSONArray2.getJSONObject(i10);
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put(strM841, jSONObject.getString(strM841));
                                    jSONObject2.put(C0178.m845(f822short, 17, 8, 2140), jSONObject.getString(C0174.m828(f822short, 25, 5, 864)));
                                    jSONObject2.put(C0175.m834(f822short, 30, 7, 1373), jSONObject.optString(C0180.m851(f822short, 37, 3, 3106)));
                                    String strOptString = jSONObject.optString(C0181.m856(f822short, 40, 5, 879));
                                    boolean zEquals = strOptString.equals(C0171.m816(f822short, 45, 4, 877));
                                    int i12 = 1740;
                                    while (true) {
                                        i12 ^= 1757;
                                        switch (i12) {
                                            case 17:
                                                i12 = zEquals ? 1833 : 1802;
                                            case 54:
                                            case 471:
                                                break;
                                            case 500:
                                                strOptString = "";
                                                break;
                                        }
                                    }
                                    jSONObject2.put(C0179.m849(f822short, 49, 11, 1926), strOptString);
                                    this.f91xC.put(jSONObject2);
                                    i8 = i10 + 1;
                                    int i13 = 1864;
                                    while (true) {
                                        i13 ^= 1881;
                                        switch (i13) {
                                            case 17:
                                                i13 = 48674;
                                                break;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                                case 239:
                                    break;
                            }
                        }
                        return str4;
                    }
                }
            });
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(strM851, i);
            int length = jSONArray.length();
            int i8 = 49790;
            while (true) {
                i8 ^= 49807;
                switch (i8) {
                    case 18:
                        break;
                    case 51:
                        break;
                    case 84:
                        i++;
                        break;
                    case 241:
                        if (length != 12) {
                            break;
                        } else {
                            i8 = 49883;
                        }
                    default:
                        continue;
                }
                i8 = 49852;
            }
            jSONObject.put(C0179.m849(f821short, 626, 9, 1219), i);
            jSONObject.put(C0177.m841(f821short, 635, 5, 2889), 12);
            jSONObject.put(C0175.m834(f821short, 640, 5, 2779), Integer.MAX_VALUE);
            jSONObject.put(C0182.m861(f821short, 645, 4, 1818), jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String detailContent(List<String> list) throws JSONException {
        try {
            Init.m46lj();
            JSONObject jSONObject = new JSONObject();
            String str = this.f82QU + C0169.m809(f821short, 649, 13, 1301);
            HashMap map = new HashMap();
            map.put(C0171.m816(f821short, 662, 6, 2885), list.get(0));
            ArrayList arrayList = new ArrayList();
            C0106ZJ.m492i(C0106ZJ.m488QU(), str, map, m38QU(this.f88w8), new AbstractC0099V3.Qe(this, jSONObject, arrayList) { // from class: com.github.catvod.spider.Hmys.3

                /* renamed from: short, reason: not valid java name */
                private static final short[] f823short = {2675, 1121, 1148, 1121, 1145, 1136, 1302, 1307, 1937, 1940, 1921, 1940, 1136, 1823, 1800, 1822, 1816, 1793, 1817, 3241, 3237, 3252, 3227, 3240, 3245, 3255, 3248, 1197, 1204, 1215, 1156, 1202, 1215, 2641, 2632, 2627, 2680, 2633, 2630, 2634, 2626, 2249, 2256, 2267, 2272, 2255, 2262, 2268, 2262, 2255, 2245, 2578, 2571, 2560, 2619, 2582, 2561, 2569, 2565, 2582, 2575, 2583, 2499, 2516, 2524, 2512, 2499, 2522, 2498, 2996, 2989, 2982, 2973, 2979, 2977, 2998, 2989, 2992, 1697, 1699, 1716, 1711, 1714, 3324, 3301, 3310, 3285, 3310, 3299, 3320, 3311, 3305, 3326, 3301, 3320, 1015, 1018, 993, 1014, 1008, 999, 1020, 993, 2611, 2622, 2615, 2594, 2584, 2601, 2598, 2602, 2594, 3300, 3313, 3319, 3299, 2919, 2942, 2933, 2894, 2920, 2932, 2928, 2915, 455, 475, 479, 460, 418, 443, 432, 395, 437, 422, 433, 437, 1490, 1473, 1494, 1490, 544, 569, 562, 521, 565, 569, 568, 546, 563, 568, 546, 1459, 1460, 1454, 1448, 1461, 1920, 1945, 1938, 1961, 1926, 1946, 1943, 1935, 1961, 1936, 1924, 1945, 1947, 30119, 26840, 2366, 3121, 3133, 3134, 3134, 3127, 3121, 3110, 3131, 3133, 3132, 1036};

                /* renamed from: QU */
                final ArrayList f92QU;

                /* renamed from: UJ */
                final Hmys f93UJ;

                /* renamed from: xC */
                final JSONObject f94xC;

                {
                    this.f93UJ = this;
                    this.f94xC = jSONObject;
                    this.f92QU = arrayList;
                    int iM864 = C0183.m864();
                    int i = 1616;
                    while (true) {
                        i ^= 1633;
                        switch (i) {
                            case 14:
                            case 49:
                                i = iM864 <= 0 ? 1709 : 1678;
                            case 204:
                                System.out.println(Long.valueOf(C0166.m803("pTxI")));
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

                /* JADX WARN: Failed to find 'out' block for switch in B:6:0x01ca. Please report as an issue. */
                @Override // com.github.catvod.spider.merge.AbstractC0099V3
                public String onResponse(String str2) throws JSONException {
                    JSONArray jSONArray;
                    String string;
                    ArrayList arrayList2;
                    int i;
                    String strM828 = C0174.m828(f823short, 0, 1, 2575);
                    String strM805 = C0168.m805(f823short, 1, 5, 1045);
                    String strM851 = C0180.m851(f823short, 6, 2, 1407);
                    try {
                        JSONObject jSONObject2 = new JSONObject(C0079Nx.m309q(new JSONObject(str2).optString(C0179.m849(f823short, 8, 4, 2037)).replaceAll(C0170.m814(f823short, 12, 1, 1146), ""), this.f93UJ.f85i, this.f93UJ.f80MH)).getJSONObject(C0172.m820(f823short, 13, 6, 1901));
                        jSONArray = jSONObject2.getJSONArray(C0182.m861(f823short, 19, 8, 3268));
                        string = jSONObject2.getString(strM851);
                        this.f94xC.put(C0165.m798(f823short, 27, 6, 1243), string);
                        this.f94xC.put(C0170.m814(f823short, 33, 8, 2599), jSONObject2.getString(strM805));
                        this.f94xC.put(C0180.m851(f823short, 41, 7, 2239), jSONObject2.getString(C0168.m805(f823short, 48, 3, 2214)));
                        this.f94xC.put(C0182.m861(f823short, 51, 11, 2660), jSONObject2.getString(C0165.m798(f823short, 62, 7, 2481)));
                        this.f94xC.put(C0170.m814(f823short, 69, 9, 3010), jSONObject2.getString(C0165.m798(f823short, 78, 5, 1728)));
                        this.f94xC.put(C0166.m801(f823short, 83, 12, 3210), jSONObject2.getString(C0183.m866(f823short, 95, 8, 915)));
                        this.f94xC.put(C0168.m805(f823short, 103, 9, 2631), jSONObject2.getString(C0175.m834(f823short, 112, 4, 3216)));
                        this.f94xC.put(C0174.m828(f823short, 116, 8, 2833), jSONObject2.getString(C0171.m816(f823short, 124, 4, 446)));
                        this.f94xC.put(C0172.m820(f823short, 128, 8, 468), jSONObject2.getString(C0181.m856(f823short, 136, 4, 1459)));
                        this.f94xC.put(C0169.m809(f823short, 140, 11, 598), jSONObject2.getString(C0169.m809(f823short, 151, 5, 1498)));
                        this.f94xC.put(C0169.m809(f823short, 156, 13, 2038), C0166.m801(f823short, 169, 2, 3189));
                        arrayList2 = new ArrayList();
                        i = 0;
                    } catch (JSONException e) {
                        int i2 = 48767;
                        while (true) {
                            i2 ^= 48784;
                            switch (i2) {
                                case 14:
                                    break;
                                case 239:
                                    i2 = 48798;
                                    continue;
                            }
                        }
                    } catch (Exception e2) {
                        throw new RuntimeException(e2);
                    }
                    while (true) {
                        int length = jSONArray.length();
                        int i3 = 1616;
                        while (true) {
                            i3 ^= 1633;
                            switch (i3) {
                                case 14:
                                case 49:
                                    i3 = i < length ? 1709 : 1678;
                                case 204:
                                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                                    arrayList2.add(jSONObject3.getString(strM805) + C0175.m834(f823short, 171, 1, 2330) + string + strM828 + jSONObject3.getString(strM851) + strM828 + jSONObject3.getString(C0172.m820(f823short, 172, 10, 3154)));
                                    i++;
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
                            this.f92QU.add(TextUtils.join(C0172.m820(f823short, 182, 1, 1071), arrayList2));
                            int i5 = 1864;
                            while (true) {
                                i5 ^= 1881;
                                switch (i5) {
                                    case 17:
                                        i5 = 48674;
                                        continue;
                                    case 47483:
                                        break;
                                }
                            }
                        }
                        return str2;
                    }
                }
            });
            jSONObject.put(C0179.m849(f821short, 668, 12, 1621), TextUtils.join(C0180.m851(f821short, 680, 3, 2177), arrayList));
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            jSONObject2.put(C0176.m836(f821short, 683, 4, 545), jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x009b. Please report as an issue. */
    public String homeContent(boolean z) {
        String strM828 = C0174.m828(f821short, 687, 9, 1757);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            AbstractC0099V3.Qe qe = new AbstractC0099V3.Qe(this) { // from class: com.github.catvod.spider.Hmys.1

                /* renamed from: xC */
                final Hmys f89xC;

                {
                    this.f89xC = this;
                    int iM788 = C0170.m788();
                    int i = 1616;
                    while (true) {
                        i ^= 1633;
                        switch (i) {
                            case 14:
                            case 49:
                                i = iM788 <= 0 ? 1709 : 1678;
                            case 204:
                                System.out.println(Float.valueOf(C0179.m847("tOkgTzrp")));
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
                public String onResponse(String str) {
                    return str;
                }
            };
            HashMap map = new HashMap();
            C0106ZJ.m492i(C0106ZJ.m488QU(), this.f82QU + C0181.m856(f821short, 696, 24, 456), map, m38QU(this.f88w8), qe);
            JSONArray jSONArray2 = new JSONObject(C0079Nx.m309q(new JSONObject(qe.getResult()).optString(C0165.m798(f821short, 720, 4, 2832)).replaceAll(C0177.m841(f821short, 724, 1, 973), ""), this.f85i, this.f80MH)).getJSONArray(C0182.m861(f821short, 725, 6, 1237));
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
                            JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put(C0177.m841(f821short, 731, 7, 3237), jSONObject2.getString(C0168.m805(f821short, 738, 8, 1423)));
                            jSONObject3.put(strM828, jSONObject2.getString(strM828));
                            jSONArray.put(jSONObject3);
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
                    jSONObject.put(C0178.m845(f821short, 746, 5, 3258), jSONArray);
                    int i5 = 1864;
                    while (true) {
                        i5 ^= 1881;
                        switch (i5) {
                            case 17:
                                if (!z) {
                                    break;
                                } else {
                                    i5 = 48736;
                                }
                            case 47384:
                                break;
                            case 47417:
                                jSONObject.put(C0166.m801(f821short, 751, 7, 3182), new JSONObject("{\"1\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"警匪\",\"v\":\"警匪\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动画\",\"v\":\"动画\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"枪战\",\"v\":\"枪战\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"青春\",\"v\":\"青春\"},{\"n\":\"文艺\",\"v\":\"文艺\"},{\"n\":\"微电影\",\"v\":\"微电影\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"农村\",\"v\":\"农村\"},{\"n\":\"儿童\",\"v\":\"儿童\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"中国大陆\",\"v\":\"大陆\"},{\"n\":\"中国香港\",\"v\":\"香港\"},{\"n\":\"中国台湾\",\"v\":\"台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]}],\"2\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"青春偶像\",\"v\":\"青春偶像\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"家庭\",\"v\":\"家庭\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"乡村\",\"v\":\"乡村\"},{\"n\":\"情景\",\"v\":\"情景\"},{\"n\":\"商战\",\"v\":\"商战\"},{\"n\":\"网剧\",\"v\":\"网剧\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"中国大陆\",\"v\":\"大陆\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]}],\"4\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"热血\",\"v\":\"热血\"},{\"n\":\"推理\",\"v\":\"推理\"},{\"n\":\"搞笑\",\"v\":\"搞笑\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"萝莉\",\"v\":\"萝莉\"},{\"n\":\"校园\",\"v\":\"校园\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"机战\",\"v\":\"机战\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"少年\",\"v\":\"少年\"},{\"n\":\"少女\",\"v\":\"少女\"},{\"n\":\"社会\",\"v\":\"社会\"},{\"n\":\"原创\",\"v\":\"原创\"},{\"n\":\"亲子\",\"v\":\"亲子\"},{\"n\":\"益智\",\"v\":\"益智\"},{\"n\":\"励志\",\"v\":\"励志\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国\",\"v\":\"内地\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"欧美\",\"v\":\"欧美\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}],\"3\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"选秀\",\"v\":\"选秀\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"访谈\",\"v\":\"访谈\"},{\"n\":\"播报\",\"v\":\"播报\"},{\"n\":\"旅游\",\"v\":\"旅游\"},{\"n\":\"音乐\",\"v\":\"音乐\"},{\"n\":\"美食\",\"v\":\"美食\"},{\"n\":\"纪实\",\"v\":\"纪实\"},{\"n\":\"曲艺\",\"v\":\"曲艺\"},{\"n\":\"生活\",\"v\":\"生活\"},{\"n\":\"游戏互动\",\"v\":\"游戏互动\"},{\"n\":\"财经\",\"v\":\"财经\"},{\"n\":\"求职\",\"v\":\"求职\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"港台\",\"v\":\"港台\"},{\"n\":\"日韩\",\"v\":\"日韩\"},{\"n\":\"欧美\",\"v\":\"欧美\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]}]}]}"));
                                break;
                            case 47483:
                                break;
                            default:
                                continue;
                        }
                        i5 = 48705;
                    }
                    return jSONObject.toString();
                }
            }
        } catch (Throwable th) {
            System.out.println(th);
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x00ac. Please report as an issue. */
    public String homeVideoContent() throws JSONException {
        String strM845 = C0178.m845(f821short, 758, 6, 2710);
        try {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONObject(C0079Nx.m309q(new JSONObject(C0106ZJ.m484FN(this.f82QU + C0172.m820(f821short, 764, 24, 542), m38QU(this.f88w8))).optString(C0181.m856(f821short, 788, 4, 458)).replaceAll(C0176.m836(f821short, 792, 1, 2389), ""), this.f85i, this.f80MH)).getJSONArray(C0172.m820(f821short, 793, 6, 1785)).getJSONObject(1).getJSONArray(C0175.m834(f821short, 799, 10, 1780)).getJSONObject(0).getJSONArray(C0179.m849(f821short, 809, 8, 993));
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
                            JSONObject jSONObject = jSONArray2.getJSONObject(i);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(strM845, jSONObject.getString(strM845));
                            jSONObject2.put(C0165.m798(f821short, 817, 8, 1921), jSONObject.getString(C0169.m809(f821short, 825, 5, 2550)));
                            jSONObject2.put(C0174.m828(f821short, 830, 7, 2818), jSONObject.getString(C0183.m866(f821short, 837, 3, 921)));
                            jSONObject2.put(C0172.m820(f821short, 840, 11, 1444), jSONObject.getString(C0179.m849(f821short, 851, 5, 2659)));
                            jSONArray.put(jSONObject2);
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
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(C0171.m816(f821short, 856, 4, 2912), jSONArray);
                    return jSONObject3.toString();
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        r5.f79FN = com.github.catvod.spider.merge.C0154wT.m739xC(16);
        r2.edit().putString(r1, r5.f79FN).commit();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0049. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x002b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void init(android.content.Context r6, java.lang.String r7) {
        /*
            r5 = this;
            short[] r0 = com.github.catvod.spider.Hmys.f821short
            r1 = 860(0x35c, float:1.205E-42)
            r2 = 6
            r3 = 3057(0xbf1, float:4.284E-42)
            java.lang.String r1 = com.github.catvod.spider.C0180.m851(r0, r1, r2, r3)
            super.init(r6, r7)
            r5.f82QU = r7
            short[] r0 = com.github.catvod.spider.Hmys.f821short
            r2 = 866(0x362, float:1.214E-42)
            r3 = 7
            r4 = 2899(0xb53, float:4.062E-42)
            java.lang.String r0 = com.github.catvod.spider.C0182.m861(r0, r2, r3, r4)
            r2 = 0
            android.content.SharedPreferences r2 = r6.getSharedPreferences(r0, r2)
            r0 = 0
            java.lang.String r3 = r2.getString(r1, r0)     // Catch: java.lang.Throwable -> L42
            r5.f79FN = r3     // Catch: java.lang.Throwable -> L42
            r0 = 1616(0x650, float:2.264E-42)
        L29:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L2f;
                case 49: goto L32;
                case 204: goto L37;
                case 239: goto L6c;
                default: goto L2e;
            }
        L2e:
            goto L29
        L2f:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L29
        L32:
            if (r3 != 0) goto L2f
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L29
        L37:
            r0 = 1740(0x6cc, float:2.438E-42)
        L39:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L3f;
                case 54: goto L57;
                default: goto L3e;
            }
        L3e:
            goto L39
        L3f:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L39
        L42:
            r0 = move-exception
            java.lang.String r3 = r5.f79FN
            r0 = 1864(0x748, float:2.612E-42)
        L47:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L4d;
                case 47384: goto L6c;
                case 47417: goto L57;
                case 47483: goto L53;
                default: goto L4c;
            }
        L4c:
            goto L47
        L4d:
            if (r3 != 0) goto L53
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L47
        L53:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L47
        L57:
            r0 = 16
            java.lang.String r0 = com.github.catvod.spider.merge.C0154wT.m739xC(r0)
            r5.f79FN = r0
            android.content.SharedPreferences$Editor r0 = r2.edit()
            java.lang.String r2 = r5.f79FN
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)
            r0.commit()
        L6c:
            r5.regLogin()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Hmys.init(android.content.Context, java.lang.String):void");
    }

    public String playerContent(String str, String str2, List<String> list) throws JSONException {
        int i;
        JSONObject jSONObject = new JSONObject();
        String[] strArrSplit = str2.split(C0181.m856(f821short, 873, 2, 365));
        String str3 = strArrSplit[0];
        String str4 = strArrSplit[1];
        String str5 = strArrSplit[2];
        try {
            AbstractC0099V3.Qe qe = new AbstractC0099V3.Qe(this) { // from class: com.github.catvod.spider.Hmys.4

                /* renamed from: xC */
                final Hmys f95xC;

                {
                    this.f95xC = this;
                    int iM844 = C0178.m844();
                    int i2 = 1616;
                    while (true) {
                        i2 ^= 1633;
                        switch (i2) {
                            case 14:
                            case 49:
                                i2 = iM844 >= 0 ? 1709 : 1678;
                            case 204:
                                System.out.println(Double.valueOf(C0170.m815("W6oqzljS2NsblOZmeZ1")));
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
                public String onResponse(String str6) {
                    return str6;
                }
            };
            HashMap map = new HashMap();
            map.put(C0171.m816(f821short, 875, 2, 3020), C0176.m836(f821short, 877, 1, 798));
            map.put(C0175.m834(f821short, 878, 10, 454), str5);
            map.put(C0170.m814(f821short, 888, 10, 2670), str4);
            map.put(C0182.m861(f821short, 898, 6, 398), str3);
            C0106ZJ.m492i(C0106ZJ.m488QU(), this.f82QU + C0181.m856(f821short, 904, 17, 2808), map, m38QU(this.f88w8), qe);
            JSONObject jSONObject2 = new JSONObject(C0079Nx.m309q(new JSONObject(qe.getResult()).optString(C0181.m856(f821short, 921, 4, 1983)).replaceAll(C0168.m805(f821short, 925, 1, 648), ""), this.f85i, this.f80MH)).getJSONObject(C0178.m845(f821short, 926, 6, 2872));
            String str6 = Proxy.localProxyUrl() + C0174.m828(f821short, 932, 23, 2276) + Base64.encodeToString(jSONObject2.getString(C0177.m841(f821short, 955, 7, 2352)).getBytes(C0118ga.f677xC), 10) + C0169.m809(f821short, 962, 4, 1183) + jSONObject2.getString(C0178.m845(f821short, 966, 2, 2949));
            jSONObject.put(C0165.m798(f821short, 968, 5, 580), 0);
            jSONObject.put(C0174.m828(f821short, 973, 3, 2113), str6);
            jSONObject.put(C0175.m834(f821short, 976, 7, 2014), "");
            i = 1616;
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    return jSONObject.toString();
                case 49:
                    i = 1647;
                    break;
            }
        }
    }

    public void regLogin() {
        int i;
        String strM820 = C0172.m820(f821short, 983, 1, 2168);
        String strM861 = C0182.m861(f821short, 984, 4, 780);
        String strM841 = C0177.m841(f821short, 988, 3, 1784);
        try {
            C0154wT.m737QU();
            HashMap map = new HashMap();
            map.put(C0168.m805(f821short, 991, 6, 1832), C0171.m816(f821short, 997, 1, 809));
            AbstractC0099V3.Qe qe = new AbstractC0099V3.Qe(this) { // from class: com.github.catvod.spider.Hmys.6

                /* renamed from: xC */
                final Hmys f99xC;

                {
                    this.f99xC = this;
                    int iM837 = C0176.m837();
                    int i2 = 1616;
                    while (true) {
                        i2 ^= 1633;
                        switch (i2) {
                            case 14:
                            case 49:
                                i2 = iM837 <= 0 ? 1709 : 1678;
                            case 204:
                                System.out.println(C0166.m803("07RmX"));
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
                public String onResponse(String str) {
                    return str;
                }
            };
            C0106ZJ.m492i(C0106ZJ.m488QU(), this.f82QU + C0172.m820(f821short, 998, 16, 2152), map, m38QU(""), qe);
            Log.d(strM841, C0165.m798(f821short, 1014, 14, 3125) + C0079Nx.m309q(new JSONObject(qe.getResult()).optString(strM861).replaceAll(strM820, ""), this.f85i, this.f80MH));
            Log.d(strM841, C0177.m841(f821short, 1028, 7, 1508));
            HashMap map2 = new HashMap();
            map2.put(C0174.m828(f821short, 1035, 8, 1692), "");
            map2.put(C0165.m798(f821short, 1043, 7, 2290), "");
            C0106ZJ.m492i(C0106ZJ.m488QU(), this.f82QU + C0174.m828(f821short, 1050, 14, 1096), map, m38QU(""), qe);
            String strM309q = C0079Nx.m309q(new JSONObject(qe.getResult()).optString(strM861).replaceAll(strM820, ""), this.f85i, this.f80MH);
            Log.d(strM841, C0170.m814(f821short, 1064, 13, 3121) + strM309q);
            this.f77B = strM309q;
            this.f88w8 = new JSONObject(this.f77B).getJSONObject(C0177.m841(f821short, 1077, 6, 3222)).getJSONObject(C0172.m820(f821short, 1083, 9, 2366)).getString(C0174.m828(f821short, 1092, 5, 1427));
            i = 1616;
        } catch (Exception e) {
            e.printStackTrace();
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
            int iM818 = C0171.m818();
            int i2 = 1740;
            while (true) {
                i2 ^= 1757;
                switch (i2) {
                    case 17:
                        i2 = iM818 >= 0 ? 1833 : 1802;
                    case 54:
                    case 471:
                        break;
                    case 500:
                        System.out.println(Float.decode(C0170.m815("buF84w3Uwx")));
                        break;
                }
                return;
            }
        }
    }

    public String searchContent(String str, boolean z) throws JSONException {
        try {
            JSONArray jSONArray = new JSONArray();
            try {
                String str2 = this.f82QU + C0180.m851(f821short, 1097, 18, 944);
                HashMap map = new HashMap();
                map.put(C0178.m845(f821short, 1115, 2, 369), C0174.m828(f821short, 1117, 1, 3251));
                map.put(C0178.m845(f821short, 1118, 8, 2909), C0177.m841(f821short, 1126, 1, 2769));
                map.put(C0179.m849(f821short, 1127, 2, 2046), str);
                C0106ZJ.m492i(C0106ZJ.m488QU(), str2, map, m38QU(this.f88w8), new AbstractC0099V3.Qe(this, str, jSONArray) { // from class: com.github.catvod.spider.Hmys.5

                    /* renamed from: short, reason: not valid java name */
                    private static final short[] f824short = {1829, 1852, 1847, 1804, 1850, 1847, 693, 680, 693, 685, 676, 1179, 1182, 1163, 1182, 341, 1001, 1022, 1000, 1006, 1015, 1007, 2478, 2487, 2492, 2439, 2486, 2489, 2485, 2493, 524, 533, 542, 549, 522, 531, 537, 1114, 1091, 1097, 1137, 1127, 1136, 1131, 1123, 1134, 517, 542, 519, 519, 2722, 2747, 2736, 2699, 2726, 2737, 2745, 2741, 2726, 2751, 2727};

                    /* renamed from: QU */
                    final JSONArray f96QU;

                    /* renamed from: UJ */
                    final Hmys f97UJ;

                    /* renamed from: xC */
                    final String f98xC;

                    {
                        this.f97UJ = this;
                        this.f98xC = str;
                        this.f96QU = jSONArray;
                        int iM844 = C0178.m844();
                        int i = 1616;
                        while (true) {
                            i ^= 1633;
                            switch (i) {
                                case 14:
                                case 49:
                                    i = iM844 >= 0 ? 1709 : 1678;
                                case 204:
                                    System.out.println(Long.decode(C0175.m835("cM")));
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
                    public String onResponse(String str3) throws JSONException {
                        JSONArray jSONArray2;
                        int i = 0;
                        String strM836 = C0176.m836(f824short, 0, 6, 1875);
                        String strM834 = C0175.m834(f824short, 6, 5, 705);
                        try {
                            jSONArray2 = new JSONObject(C0079Nx.m309q(new JSONObject(str3).optString(C0179.m849(f824short, 11, 4, 1279)).replaceAll(C0169.m809(f824short, 15, 1, 351), ""), this.f97UJ.f85i, this.f97UJ.f80MH)).getJSONArray(C0175.m834(f824short, 16, 6, 923));
                        } catch (JSONException e) {
                            int i2 = 49666;
                            while (true) {
                                i2 ^= 49683;
                                switch (i2) {
                                    case 17:
                                        i2 = 49697;
                                        break;
                                    case 50:
                                        break;
                                }
                            }
                        } catch (Exception e2) {
                            throw new RuntimeException(e2);
                        }
                        while (true) {
                            int i3 = i;
                            int length = jSONArray2.length();
                            int i4 = 1616;
                            while (true) {
                                i4 ^= 1633;
                                switch (i4) {
                                    case 14:
                                    case 49:
                                        i4 = i3 < length ? 1709 : 1678;
                                    case 204:
                                        JSONObject jSONObject = jSONArray2.getJSONObject(i3);
                                        boolean zContains = jSONObject.getString(strM834).contains(this.f98xC);
                                        int i5 = 1740;
                                        while (true) {
                                            i5 ^= 1757;
                                            switch (i5) {
                                                case 17:
                                                    i5 = !zContains ? 1833 : 1802;
                                                case 54:
                                                case 471:
                                                    JSONObject jSONObject2 = new JSONObject();
                                                    jSONObject2.put(strM836, jSONObject.getString(strM836));
                                                    jSONObject2.put(C0169.m809(f824short, 22, 8, 2520), jSONObject.getString(strM834));
                                                    jSONObject2.put(C0174.m828(f824short, 30, 7, 634), jSONObject.optString(C0166.m801(f824short, 37, 3, 1066)));
                                                    String strOptString = jSONObject.optString(C0181.m856(f824short, 40, 6, 1026));
                                                    boolean zEquals = strOptString.equals(C0169.m809(f824short, 46, 4, 619));
                                                    int i6 = 48767;
                                                    while (true) {
                                                        i6 ^= 48784;
                                                        switch (i6) {
                                                            case 14:
                                                            case 45:
                                                                break;
                                                            case 76:
                                                                strOptString = "";
                                                                break;
                                                            case 239:
                                                                i6 = zEquals ? 48860 : 48829;
                                                        }
                                                    }
                                                    jSONObject2.put(C0168.m805(f824short, 50, 11, 2772), strOptString);
                                                    this.f96QU.put(jSONObject2);
                                                    break;
                                                case 500:
                                                    int i7 = 1864;
                                                    while (true) {
                                                        i7 ^= 1881;
                                                        switch (i7) {
                                                            case 17:
                                                                i7 = 48674;
                                                            case 47483:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        i = i3 + 1;
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
                                        break;
                                    case 239:
                                        break;
                                }
                            }
                            return str3;
                        }
                    }
                });
            } catch (Exception e) {
                int i = 1616;
                while (true) {
                    i ^= 1633;
                    switch (i) {
                        case 14:
                            break;
                        case 49:
                            i = 1647;
                            break;
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0165.m798(f821short, 1129, 4, 2624), jSONArray);
            return jSONObject.toString();
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }
}
