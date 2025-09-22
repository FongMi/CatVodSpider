package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0165;
import com.github.catvod.parser.C0166;
import com.github.catvod.spider.merge.C0106ZJ;
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
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class Jpys extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f832short = {2326, 2322, 2321, 2317, 2317, 2313, 2390, 2380, 2391, 2377, 2391, 2377, 2388, 2328, 2325, 2313, 2321, 2328, 2391, 2376, 2381, 1803, 1805, 1819, 1804, 1875, 1823, 1817, 1819, 1808, 1802, 1854, 1855, 1836, 1843, 1849, 1855, 1843, 1854, 1069, 1036, 1055, 1024, 1034, 1036, 1024, 1037, 1370, 1376, 1390, 1383, 2360, 1485, 1480, 1490, 1493, 1673, 1735, 1750, 1743, 1673, 1739, 1745, 1675, 1739, 1737, 1744, 1743, 1731, 1673, 1735, 1736, 1737, 1736, 1759, 1739, 1737, 1747, 1749, 1673, 1744, 1743, 1730, 1731, 1737, 1673, 1738, 1743, 1749, 1746, 1689, 1746, 1759, 1750, 1731, 1687, 1691, 2177, 2263, 2246, 2240, 2242, 2281, 2258, 2250, 2202, 1284, 1347, 1360, 1351, 1347, 1311, 1284, 1371, 1351, 1347, 1360, 1311, 2910, 2893, 2906, 2910, 2818, 2841, 2895, 2910, 2904, 2906, 2929, 2890, 2898, 2818, 542, 588, 577, 584, 605, 521, 517, 3064, 2983, 3003, 3007, 2988, 3043, 3064, 2997, 3003, 2983, 3043, 3005, 3004, 3046, 3054, 3046, 3051, 3052, 3047, 3004, 3007, 3003, 3048, 3004, 3048, 3004, 3003, 3050, 3051, 3003, 3005, 3000, 3007, 3004, 3052, 3047, 3007, 3050, 3046, 3046, 3047, 3004, 3005, 3064, 2986, 3043, 1338, 1343, 1322, 1343, 1470, 1447, 1452, 1431, 1441, 1452, 1769, 1776, 1787, 1750, 1787, 2222, 2231, 2236, 2183, 2230, 2233, 2229, 2237, 1167, 1174, 1181, 1207, 1176, 1172, 1180, 2396, 2373, 2382, 2421, 2394, 2371, 2377, 1682, 1675, 1664, 1716, 1677, 1671, 2579, 2570, 2561, 2615, 2560, 2568, 2564, 2583, 2574, 2582, 618, 625, 616, 616, 2521, 2496, 2507, 2544, 2525, 2506, 2498, 2510, 2525, 2500, 2524, 1306, 1291, 1293, 1295, 3093, 3076, 3074, 3072, 3078, 3082, 3088, 3083, 3089, 2855, 2850, 2854, 2850, 2879, 1038, 1045, 1038, 1051, 1046, 491, 496, 489, 489, 855, 793, 776, 785, 855, 789, 783, 853, 789, 791, 782, 785, 797, 855, 793, 790, 791, 790, 769, 789, 791, 781, 779, 855, 782, 785, 796, 797, 791, 855, 796, 797, 780, 793, 785, 788, 839, 785, 796, 837, 3006, 2995, 3050, 1798, 1867, 1861, 1881, 1821, 1859, 1858, 1816, 1808, 1816, 1813, 1810, 1817, 1858, 1857, 1861, 1814, 1858, 1814, 1858, 1861, 1812, 1813, 1861, 1859, 1862, 1857, 1858, 1810, 1817, 1857, 1812, 1816, 1816, 1817, 1858, 1859, 1798, 1876, 1821, 807, 802, 823, 802, 1292, 1301, 1310, 1317, 1299, 1310, 436, 429, 422, 395, 422, 2627, 2650, 2641, 2666, 2651, 2644, 2648, 2640, 1740, 1749, 1758, 1780, 1755, 1751, 1759, 1559, 1550, 1541, 1598, 1553, 1544, 1538, 1688, 1665, 1674, 1726, 1671, 1677, 1098, 1095, 1102, 1115, 1121, 1104, 1119, 1107, 1115, 2628, 2633, 2624, 2645, 2686, 2641, 2653, 2645, 430, 439, 444, 391, 417, 445, 441, 426, 1370, 1347, 1352, 1397, 1353, 1357, 1374, 1617, 1608, 1603, 1656, 1606, 1621, 1602, 1606, 2466, 2491, 2480, 2453, 2470, 2481, 2485, 545, 568, 563, 517, 562, 570, 566, 549, 572, 548, 2036, 2029, 2022, 2013, 2032, 2023, 2031, 2019, 2032, 2025, 2033, 440, 417, 426, 401, 431, 429, 442, 417, 444, 823, 814, 805, 768, 802, 821, 814, 819, 1702, 1727, 1716, 1679, 1716, 1721, 1698, 1717, 1715, 1700, 1727, 1698, 825, 800, 811, 779, 806, 829, 810, 812, 827, 800, 829, 1798, 1823, 1812, 1843, 1823, 1822, 1796, 1813, 1822, 1796, 1470, 1447, 1452, 1431, 1451, 1447, 1446, 1468, 1453, 1446, 1468, 27949, 26092, 21930, 24005, 22305, 22276, -29840, -1723, -29250, 21686, 18499, 22810, 21918, -25378, -1720, -1720, 437, 416, 441, 419, 447, 436, 437, 412, 441, 419, 420, 734, 721, 733, 725, 1807, 950, 945, 956, 2469, 3070, 2330, 2330, 2330, 2450, 2443, 2432, 2491, 2452, 2440, 2437, 2461, 2491, 2434, 2454, 2443, 2441, -32568, 21852, 32199, 24760, 1043, 1034, 1025, 1082, 1045, 1033, 1028, 1052, 1082, 1040, 1047, 1033, 1044, 1041, 1035, 1036, 2395, 2427, 2338, 2420, 2425, 2416, 2405, 2399, 2409, 2404, 2338, 2362, 2338, 2353, 2338, 2348, 2338, 2420, 2425, 2416, 2405, 2399, 2414, 2401, 2413, 2405, 2338, 2362, 2338, 31797, 22129, 2338, 2429, 2348, 2427, 2338, 2420, 2425, 2416, 2405, 2399, 2409, 2404, 2338, 2362, 2338, 2354, 2338, 2348, 2338, 2420, 2425, 2416, 2405, 2399, 2414, 2401, 2413, 2405, 2338, 2362, 2338, 31797, -32570, 23399, 2338, 2429, 2348, 2427, 2338, 2420, 2425, 2416, 2405, 2399, 2409, 2404, 2338, 2362, 2338, 2355, 2338, 2348, 2338, 2420, 2425, 2416, 2405, 2399, 2414, 2401, 2413, 2405, 2338, 2362, 2338, 30716, -29830, 2338, 2429, 2348, 2427, 2338, 2420, 2425, 2416, 2405, 2399, 2409, 2404, 2338, 2362, 2338, 2356, 2338, 2348, 2338, 2420, 2425, 2416, 2405, 2399, 2414, 2401, 2413, 2405, 2338, 2362, 2338, 23464, 26155, 2338, 2429, 2397, 2804, 2811, 2806, 2788, 2788, 1032, 1094, 1111, 1102, 1032, 1098, 1104, 1034, 1098, 1096, 1105, 1102, 1090, 1032, 1094, 1097, 1096, 1097, 1118, 1098, 1096, 1106, 1108, 1032, 1103, 1096, 1098, 1090, 1032, 1103, 1096, 1107, 1140, 1090, 1094, 1109, 1092, 1103, 747, 741, 761, 701, 739, 738, 696, 688, 696, 693, 690, 697, 738, 737, 741, 694, 738, 694, 738, 741, 692, 693, 741, 739, 742, 737, 738, 690, 697, 737, 692, 696, 696, 697, 738, 739, 678, 756, 701, 830, 827, 814, 827, 807, 830, 821, 792, 821, 3307, 3314, 3321, 3283, 3324, 3312, 3320, 1303, 1294, 1285, 1329, 1288, 1282, 1881, 1856, 1867, 1917, 1866, 1858, 1870, 1885, 1860, 1884, 1922, 1947, 1936, 1963, 1949, 1936, 3288, 3265, 3274, 3313, 3264, 3279, 3267, 3275, 2408, 2417, 2426, 2369, 2414, 2423, 2429, 2304, 2329, 2322, 2345, 2308, 2323, 2331, 2327, 2308, 2333, 2309, 1257, 1260, 1270, 1265, 2600, 2605, 2616, 2605, 1037, 1093, 1090, 1103, 1046, 1317, 1314, 1340, 647, 679, 2082, 2156, 2173, 2148, 2082, 2144, 2170, 2080, 2144, 2146, 2171, 2148, 2152, 2082, 2156, 2147, 2146, 2147, 2164, 2144, 2146, 2168, 2174, 2082, 2171, 2111, 2082, 2171, 2148, 2153, 2152, 2146, 2082, 2152, 2173, 2148, 2174, 2146, 2153, 2152, 2082, 2168, 2175, 2145, 2098, 2158, 2145, 2148, 2152, 2147, 2169, 2137, 2164, 2173, 2152, 2096, 2110, 2091, 2148, 2153, 2096, 1181, 1170, 1175, 1179, 1168, 1162, 1194, 1159, 1166, 1179, 1219, 1229, 1240, 1175, 1178, 1219, 446, 499, 509, 481, 421, 507, 506, 416, 424, 416, 429, 426, 417, 506, 505, 509, 430, 
    506, 430, 506, 509, 428, 429, 509, 507, 510, 505, 506, 426, 417, 505, 428, 416, 416, 417, 506, 507, 446, 492, 421, 1493, 1488, 1482, 1485, 1051, 1034, 1049, 1048, 1038, 696, 676, 681, 689, 669, 698, 676, 580, 577, 603, 604, 1441, 1519, 1534, 1511, 1441, 1507, 1529, 1443, 1507, 1505, 1528, 1511, 1515, 1441, 1519, 1504, 1505, 1504, 1527, 1507, 1505, 1531, 1533, 1441, 1528, 1511, 1514, 1515, 1505, 1441, 1533, 1515, 1519, 1532, 1517, 1510, 1484, 1527, 1497, 1505, 1532, 1514, 1457, 1509, 1515, 1527, 1529, 1505, 1532, 1514, 1459, 1177, 1231, 1246, 1240, 1242, 1265, 1226, 1234, 1154, 1166, 1177, 1231, 1246, 1240, 1242, 1260, 1238, 1221, 1242, 1154, 1159, 632, 630, 618, 612, 636, 609, 631, 558, 2172, 2090, 2107, 2109, 2111, 2068, 2095, 2103, 2151, 2155, 2172, 2090, 2107, 2109, 2111, 2057, 2099, 2080, 2111, 2151, 2146, 2172, 2097, 2111, 2083, 2151, 2105, 2104, 2146, 2154, 2146, 2159, 2152, 2147, 2104, 2107, 2111, 2156, 2104, 2156, 2104, 2111, 2158, 2159, 2111, 2105, 2108, 2107, 2104, 2152, 2147, 2107, 2158, 2146, 2146, 2147, 2104, 2105, 2172, 2094, 2151, 2709, 2704, 2693, 2704, 3080, 3103, 3081, 3087, 3094, 3086, 1676, 1685, 1694, 1701, 1683, 1694, 2463, 2438, 2445, 2464, 2445, 1361, 1352, 1347, 1400, 1353, 1350, 1354, 1346, 1077, 1068, 1063, 1037, 1058, 1070, 1062, 3306, 3315, 3320, 3267, 3308, 3317, 3327, 3076, 3101, 3094, 3106, 3099, 3089, 2111, 2086, 2093, 2075, 2092, 2084, 2088, 2107, 2082, 2106, 2926, 2933, 2924, 2924, 1297, 1288, 1283, 1336, 1301, 1282, 1290, 1286, 1301, 1292, 1300};

    /* renamed from: q */
    private String f124q = "";

    /* renamed from: xC */
    private String f125xC = C0172.m820(f832short, 0, 21, 2425);

    /* renamed from: QU */
    private String f123QU = "";

    public Jpys() {
        int iM833 = C0175.m833();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = iM833 <= 0 ? 1709 : 1678;
                case 204:
                    System.out.println(Integer.parseInt(C0179.m847("w2RHeSLyNdxwCLnv71mPw9gDy")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* renamed from: q */
    private void m49q() {
        this.f124q = C0152vp.m724Mo(this.f123QU);
    }

    /* renamed from: xC */
    private HashMap<String, String> m50xC(String str, String str2) {
        String str3 = "ۥ۠ۢ";
        Charset charset = null;
        HashMap<String, String> map = null;
        String strM851 = null;
        String strM604q = null;
        short[] sArr = null;
        while (true) {
            switch (C0174.m829(str3)) {
                case 56350:
                    str3 = "ۡۢۧ";
                    sArr = f832short;
                    break;
                case 56388:
                    charset = C0118ga.f677xC;
                    str3 = "ۥۦ";
                    break;
                case 1746788:
                    map.put(strM604q, str2);
                    str3 = "ۦۦۨ";
                    break;
                case 1746812:
                    str3 = "ۧۦۡ";
                    sArr = f832short;
                    break;
                case 1748710:
                    str3 = "۟ۢۧ";
                    strM604q = C0181.m856(sArr, 51, 1, 2380);
                    break;
                case 1748771:
                    str3 = "ۢ۠ۤ";
                    sArr = f832short;
                    break;
                case 1748828:
                    str3 = "ۨۨۤ";
                    strM851 = C0166.m801(sArr, 47, 4, 1289);
                    break;
                case 1749606:
                    str3 = "ۨۧۥ";
                    strM851 = C0180.m851(sArr, 31, 8, 1882);
                    break;
                case 1750563:
                    map.put(strM851, strM604q);
                    str3 = "ۡۤۦ";
                    break;
                case 1750658:
                    str = C0118ga.m606xC(strM604q);
                    str3 = "ۨۦۦ";
                    break;
                case 1752487:
                    str3 = "ۢۦ";
                    map = new HashMap<>();
                    break;
                case 1752488:
                    map.put(strM851, strM604q);
                    str3 = "ۨۦۡ";
                    break;
                case 1753640:
                    return map;
                case 1754594:
                    str3 = "ۣ۠۠";
                    strM851 = C0177.m841(sArr, 21, 10, 1918);
                    break;
                case 1755435:
                    str3 = "ۥۣ۠";
                    strM604q = C0180.m851(sArr, 39, 8, 1129);
                    break;
                case 1755555:
                    str3 = "ۡۦۡ";
                    sArr = f832short;
                    break;
                case 1755560:
                    str3 = "ۣ۟۠";
                    strM604q = this.f125xC;
                    break;
                case 1755590:
                    str3 = "ۨۢۥ";
                    sArr = f832short;
                    break;
                case 1755620:
                    map.put(strM851, str);
                    str3 = "ۡ۟";
                    break;
                default:
                    str3 = "ۣۣۢ";
                    strM604q = C0118ga.m604q(str, charset);
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x00ef. Please report as an issue. */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException, NumberFormatException {
        String strM836 = C0176.m836(f832short, 52, 4, 1441);
        try {
            boolean zIsEmpty = this.f124q.isEmpty();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = zIsEmpty ? 1709 : 1678;
                    case 204:
                        m49q();
                        break;
                    case 239:
                        break;
                }
            }
            int i2 = Integer.parseInt(str2);
            int i3 = 1740;
            while (true) {
                i3 ^= 1757;
                switch (i3) {
                    case 17:
                        i3 = i2 == 0 ? 1833 : 1802;
                    case 54:
                    case 471:
                        break;
                    case 500:
                        i2 = 1;
                        break;
                }
            }
            String str3 = this.f124q + C0165.m798(f832short, 56, 41, 1702) + str + C0175.m834(f832short, 97, 9, 2215) + str2 + C0182.m861(f832short, 106, 12, 1314);
            JSONArray jSONArray = new JSONArray();
            String strValueOf = String.valueOf(System.currentTimeMillis());
            JSONArray jSONArray2 = new JSONObject(C0106ZJ.m484FN(str3, m50xC(C0172.m820(f832short, 118, 14, 2879) + str2 + C0178.m845(f832short, 132, 7, 568) + str + C0172.m820(f832short, 139, 46, 3038) + strValueOf, strValueOf))).optJSONObject(C0180.m851(f832short, 185, 4, 1374)).getJSONArray(strM836);
            int i4 = 0;
            while (true) {
                int length = jSONArray2.length();
                int i5 = 1864;
                while (true) {
                    i5 ^= 1881;
                    switch (i5) {
                        case 17:
                            i5 = i4 < length ? 48736 : 48705;
                        case 47384:
                            break;
                        case 47417:
                            JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i4);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(C0180.m851(f832short, 189, 6, 1480), jSONObjectOptJSONObject.optString(C0178.m845(f832short, 195, 5, 1695)));
                            jSONObject.put(C0174.m828(f832short, 200, 8, 2264), jSONObjectOptJSONObject.optString(C0170.m814(f832short, 208, 7, 1273)));
                            jSONObject.put(C0179.m849(f832short, 215, 7, 2346), jSONObjectOptJSONObject.optString(C0171.m816(f832short, 222, 6, 1764)));
                            String strOptString = jSONObjectOptJSONObject.optString(C0178.m845(f832short, 228, 10, 2661));
                            boolean zEquals = strOptString.equals(C0165.m798(f832short, 238, 4, 516));
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
                            jSONObject.put(C0172.m820(f832short, 242, 11, 2479), strOptString);
                            jSONArray.put(jSONObject);
                            int i7 = i4 + 1;
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
                            i4 = i7;
                            break;
                        case 47483:
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(C0179.m849(f832short, 253, 4, 1386), i2);
                    int length2 = jSONArray.length();
                    int i9 = 49666;
                    while (true) {
                        i9 ^= 49683;
                        switch (i9) {
                            case 17:
                                if (length2 != 48) {
                                    break;
                                } else {
                                    i9 = 49759;
                                }
                            case 50:
                                break;
                            case 76:
                                i2++;
                                break;
                            case 83:
                                break;
                            default:
                                continue;
                        }
                        i9 = 49728;
                    }
                    jSONObject2.put(C0179.m849(f832short, 257, 9, 3173), i2);
                    jSONObject2.put(C0182.m861(f832short, 266, 5, 2891), 48);
                    jSONObject2.put(C0183.m866(f832short, 271, 5, 1146), Integer.MAX_VALUE);
                    jSONObject2.put(strM836, jSONArray);
                    return jSONObject2.toString();
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x0253. Please report as an issue. */
    public String detailContent(List<String> list) throws JSONException {
        int i = 0;
        String strM845 = C0178.m845(f832short, 276, 4, 389);
        try {
            boolean zIsEmpty = this.f124q.isEmpty();
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                    case 49:
                        i2 = zIsEmpty ? 1709 : 1678;
                    case 204:
                        m49q();
                        break;
                    case 239:
                        break;
                }
            }
            Init.m46lj();
            ArrayList arrayList = new ArrayList();
            String str = this.f124q + C0181.m856(f832short, 280, 40, 888) + list.get(0);
            JSONObject jSONObject = new JSONObject();
            String strValueOf = String.valueOf(System.currentTimeMillis());
            JSONObject jSONObjectOptJSONObject = new JSONObject(C0106ZJ.m484FN(str, m50xC(C0181.m856(f832short, 320, 3, 3031) + list.get(0) + C0172.m820(f832short, 323, 40, 1824) + strValueOf, strValueOf))).optJSONObject(C0166.m801(f832short, 363, 4, 835));
            jSONObject.put(C0171.m816(f832short, 367, 6, 1402), jSONObjectOptJSONObject.optString(C0178.m845(f832short, 373, 5, 450)));
            jSONObject.put(C0175.m834(f832short, 378, 8, 2613), jSONObjectOptJSONObject.optString(C0169.m809(f832short, 386, 7, 1722)));
            jSONObject.put(C0168.m805(f832short, 393, 7, 1633), jSONObjectOptJSONObject.optString(C0179.m849(f832short, 400, 6, 1774)));
            jSONObject.put(C0181.m856(f832short, 406, 9, 1086), jSONObjectOptJSONObject.optString(C0179.m849(f832short, 415, 8, 2608)));
            jSONObject.put(C0176.m836(f832short, 423, 8, 472), jSONObjectOptJSONObject.optString(C0168.m805(f832short, 431, 7, 1324)));
            jSONObject.put(C0177.m841(f832short, 438, 8, 1575), jSONObjectOptJSONObject.optString(C0182.m861(f832short, 446, 7, 2516)));
            String strOptString = jSONObjectOptJSONObject.optString(C0169.m809(f832short, 453, 10, 599));
            boolean zEquals = strOptString.equals(strM845);
            String str2 = "";
            int i3 = 1740;
            while (true) {
                i3 ^= 1757;
                switch (i3) {
                    case 17:
                        i3 = zEquals ? 1833 : 1802;
                    case 54:
                    case 471:
                        break;
                    case 500:
                        strOptString = "";
                        break;
                }
            }
            jSONObject.put(C0179.m849(f832short, 463, 11, 1922), strOptString);
            jSONObject.put(C0179.m849(f832short, 474, 9, 462), jSONObjectOptJSONObject.optString(C0170.m814(f832short, 483, 8, 833)));
            jSONObject.put(C0181.m856(f832short, 491, 12, 1744), jSONObjectOptJSONObject.optString(C0175.m834(f832short, 503, 11, 847)));
            String strOptString2 = jSONObjectOptJSONObject.optString(C0169.m809(f832short, 514, 10, 1904));
            boolean zEquals2 = strOptString2.equals(strM845);
            int i4 = 1864;
            while (true) {
                i4 ^= 1881;
                switch (i4) {
                    case 17:
                        i4 = zEquals2 ? 48736 : 48705;
                    case 47384:
                        str2 = strOptString2;
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
                                    continue;
                                default:
                                    continue;
                            }
                        }
                    case 47483:
                }
            }
            jSONObject.put(C0177.m841(f832short, 524, 11, 1480), C0180.m851(f832short, 535, 16, 1609) + str2);
            JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray(C0170.m814(f832short, 551, 11, 464));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int length = jSONArray.length();
                int i6 = 48891;
                while (true) {
                    i6 ^= 48908;
                    switch (i6) {
                        case 22:
                        case 53:
                            break;
                        case 503:
                            i6 = i < length ? 49635 : 48953;
                        case 32495:
                            JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i);
                            arrayList2.add(jSONObjectOptJSONObject2.optString(C0183.m866(f832short, 562, 4, 688)) + C0174.m828(f832short, 566, 1, 1835) + jSONObjectOptJSONObject2.optString(C0179.m849(f832short, 567, 3, 984)) + C0180.m851(f832short, 570, 1, 2521) + list.get(0));
                            int i7 = i + 1;
                            int i8 = 49666;
                            while (true) {
                                i8 ^= 49683;
                                switch (i8) {
                                    case 17:
                                        i8 = 49697;
                                        break;
                                    case 50:
                                        break;
                                }
                            }
                            i = i7;
                            break;
                    }
                    arrayList.add(TextUtils.join(C0174.m828(f832short, 571, 1, 3037), arrayList2));
                    String strJoin = TextUtils.join(C0171.m816(f832short, 572, 3, 2366), arrayList);
                    jSONObject.put(C0169.m809(f832short, 575, 13, 2532), C0182.m861(f832short, 588, 4, 1045));
                    jSONObject.put(C0166.m801(f832short, 592, 12, 1125), strJoin);
                    JSONObject jSONObject2 = new JSONObject();
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(jSONObject);
                    jSONObject2.put(C0170.m814(f832short, 604, 4, 1144), jSONArray2);
                    return jSONObject2.toString();
                }
            }
        } catch (JSONException e) {
            RuntimeException runtimeException = new RuntimeException(e);
            int i9 = 49790;
            while (true) {
                i9 ^= 49807;
                switch (i9) {
                    case 18:
                        int i10 = 49914;
                        while (true) {
                            i10 ^= 49931;
                            switch (i10) {
                                case 497:
                                    i10 = 50596;
                                    break;
                                case 1711:
                                    throw runtimeException;
                            }
                        }
                        break;
                    case 241:
                        i9 = 49821;
                        break;
                }
            }
        }
    }

    public String homeContent(boolean z) {
        try {
            boolean zIsEmpty = this.f124q.isEmpty();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (!zIsEmpty) {
                            break;
                        } else {
                            i = 1709;
                        }
                    case 204:
                        m49q();
                        break;
                    case 239:
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0175.m834(f832short, 742, 5, 2711), new JSONArray(C0172.m820(f832short, 608, 134, 2304)));
            return jSONObject.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0084. Please report as an issue. */
    public String homeVideoContent() throws JSONException {
        try {
            boolean zIsEmpty = this.f124q.isEmpty();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = zIsEmpty ? 1709 : 1678;
                    case 204:
                        m49q();
                        break;
                    case 239:
                        break;
                }
            }
            JSONArray jSONArray = new JSONArray();
            String str = this.f124q + C0182.m861(f832short, 747, 38, 1063);
            String strValueOf = String.valueOf(System.currentTimeMillis());
            JSONArray jSONArray2 = new JSONObject(C0106ZJ.m484FN(str, m50xC(C0175.m834(f832short, 785, 39, 640) + strValueOf, strValueOf))).getJSONArray(C0170.m814(f832short, 824, 4, 858));
            int i2 = 0;
            while (true) {
                int length = jSONArray2.length();
                int i3 = 1740;
                while (true) {
                    i3 ^= 1757;
                    switch (i3) {
                        case 17:
                            i3 = i2 < length ? 1833 : 1802;
                        case 54:
                        case 471:
                            break;
                        case 500:
                            JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i2);
                            String strOptString = jSONObjectOptJSONObject.optString(C0175.m834(f832short, 828, 5, 849));
                            String strOptString2 = jSONObjectOptJSONObject.optString(C0168.m805(f832short, 833, 7, 3229));
                            String strOptString3 = jSONObjectOptJSONObject.optString(C0178.m845(f832short, 840, 6, 1377));
                            String strOptString4 = jSONObjectOptJSONObject.optString(C0172.m820(f832short, 846, 10, 1839));
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(C0181.m856(f832short, 856, 6, 2036), strOptString);
                            jSONObject.put(C0166.m801(f832short, 862, 8, 3246), strOptString2);
                            jSONObject.put(C0179.m849(f832short, 870, 7, 2334), strOptString3);
                            jSONObject.put(C0180.m851(f832short, 877, 11, 2422), strOptString4);
                            jSONArray.put(jSONObject);
                            int i4 = i2 + 1;
                            int i5 = 1864;
                            while (true) {
                                i5 ^= 1881;
                                switch (i5) {
                                    case 17:
                                        i5 = 48674;
                                        break;
                                    case 47483:
                                        break;
                                }
                            }
                            i2 = i4;
                            break;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(C0178.m845(f832short, 888, 4, 1157), jSONArray);
                    return jSONObject2.toString();
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public void init(Context context, String str) {
        String str2 = "ۦۦۡ";
        while (true) {
            switch (C0174.m829(str2)) {
                case 1748765:
                    return;
                case 1753633:
                    super.init(context);
                    str2 = "۠ۨۢ";
                    break;
                default:
                    this.f123QU = str;
                    str2 = "ۡۤ۠";
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x00cf. Please report as an issue. */
    public String playerContent(String str, String str2, List<String> list) throws JSONException {
        String string;
        String strM861 = C0182.m861(f832short, 892, 4, 2636);
        String strM816 = C0171.m816(f832short, 896, 5, 1067);
        String strM845 = C0178.m845(f832short, 901, 3, 1360);
        try {
            String[] strArrSplit = str2.split(C0179.m849(f832short, 904, 2, 731));
            String str3 = strArrSplit[0];
            String str4 = strArrSplit[1];
            String str5 = this.f124q + C0180.m851(f832short, 906, 61, 2061) + str4 + strM816 + str3;
            String strValueOf = String.valueOf(System.currentTimeMillis());
            JSONObject jSONObject = new JSONObject(C0106ZJ.m484FN(str5, m50xC(C0177.m841(f832short, 967, 16, 1278) + str4 + strM816 + str3 + C0179.m849(f832short, 983, 40, 408) + strValueOf, strValueOf))).getJSONObject(strM861).optJSONArray(C0175.m834(f832short, 1023, 4, 1465)).getJSONObject(0);
            boolean zHas = jSONObject.has(strM845);
            String strM805 = C0168.m805(f832short, 1027, 5, 1131);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = zHas ? 1709 : 1678;
                    case 204:
                        String strOptString = jSONObject.optString(strM845);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(strM845, strOptString);
                        jSONObject2.put(strM805, 0);
                        string = jSONObject2.toString();
                        break;
                    case 239:
                        String strOptString2 = jSONObject.optJSONObject(strM861).optString(C0181.m856(f832short, 1032, 7, 712));
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(strM845, strOptString2);
                        jSONObject3.put(strM805, 0);
                        string = jSONObject3.toString();
                        break;
                }
            }
            return string;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x00ca. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0185. Please report as an issue. */
    public String searchContent(String str, boolean z) throws JSONException {
        String strM856 = C0181.m856(f832short, 1039, 4, 552);
        try {
            JSONArray jSONArray = new JSONArray();
            boolean zIsEmpty = this.f124q.isEmpty();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = zIsEmpty ? 1709 : 1678;
                    case 204:
                        m49q();
                        break;
                    case 239:
                        break;
                }
            }
            String str2 = this.f124q + C0174.m828(f832short, 1043, 51, 1422) + URLEncoder.encode(str) + C0175.m834(f832short, 1094, 21, 1215);
            String strValueOf = String.valueOf(System.currentTimeMillis());
            JSONArray jSONArray2 = new JSONObject(C0106ZJ.m484FN(str2, m50xC(C0181.m856(f832short, 1115, 8, 531) + str + C0165.m798(f832short, 1123, 61, 2138) + strValueOf, strValueOf))).optJSONObject(C0168.m805(f832short, 1184, 4, 2801)).optJSONObject(C0165.m798(f832short, 1188, 6, 3194)).getJSONArray(strM856);
            int i2 = 0;
            while (true) {
                int length = jSONArray2.length();
                int i3 = 1740;
                while (true) {
                    i3 ^= 1757;
                    switch (i3) {
                        case 17:
                            i3 = i2 < length ? 1833 : 1802;
                        case 54:
                        case 471:
                            break;
                        case 500:
                            JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i2);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(C0177.m841(f832short, 1194, 6, 1786), jSONObjectOptJSONObject.optString(C0168.m805(f832short, 1200, 5, 2537)));
                            jSONObject.put(C0166.m801(f832short, 1205, 8, 1319), jSONObjectOptJSONObject.optString(C0181.m856(f832short, 1213, 7, 1091)));
                            jSONObject.put(C0170.m814(f832short, 1220, 7, 3228), jSONObjectOptJSONObject.optString(C0171.m816(f832short, 1227, 6, 3186)));
                            String strOptString = jSONObjectOptJSONObject.optString(C0180.m851(f832short, 1233, 10, 2121));
                            boolean zEquals = strOptString.equals(C0180.m851(f832short, 1243, 4, 2816));
                            int i4 = 1864;
                            while (true) {
                                i4 ^= 1881;
                                switch (i4) {
                                    case 17:
                                        i4 = zEquals ? 48736 : 48705;
                                    case 47384:
                                        break;
                                    case 47417:
                                        strOptString = "";
                                        break;
                                    case 47483:
                                }
                            }
                            jSONObject.put(C0183.m866(f832short, 1247, 11, 1383), strOptString);
                            jSONArray.put(jSONObject);
                            int i5 = i2 + 1;
                            int i6 = 48767;
                            while (true) {
                                i6 ^= 48784;
                                switch (i6) {
                                    case 14:
                                        break;
                                    case 239:
                                        i6 = 48798;
                                }
                            }
                            i2 = i5;
                            break;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(strM856, jSONArray);
                    return jSONObject2.toString();
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
