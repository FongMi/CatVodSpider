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
import com.github.catvod.spider.merge.C0152vp;
import com.github.catvod.spider.merge.C0168;
import com.github.catvod.spider.merge.C0169;
import com.github.catvod.spider.merge.C0170;
import com.github.catvod.spider.merge.C0171;
import com.github.catvod.spider.merge.C0172;
import com.github.catvod.spider.merge.C0174;
import com.github.catvod.spider.merge.C0175;
import com.github.catvod.spider.merge.C0176;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class Bdys01 extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f816short = {1854, 1866, 1861, 1853, 1855, 1848, 1918, 1890, 1915, 2860, 2937, 2937, 2937, 2937, 2937, 2166, 2144, 2161, 2088, 2150, 2154, 2154, 2158, 2156, 2144, 3043, 3030, 3033, 3024, 3044, 3030, 3033, 2746, 2627, 2661, 2675, 2660, 2619, 2647, 2673, 2675, 2680, 2658, 2154, 2120, 2141, 2126, 2123, 2123, 2118, 2056, 2066, 2057, 2071, 2055, 2063, 2154, 2118, 2116, 2126, 2121, 2131, 2120, 2132, 2127, 2076, 2055, 2158, 2121, 2131, 2114, 2123, 2055, 2154, 2118, 2116, 2055, 2152, 2164, 2055, 2175, 2055, 2070, 2071, 2168, 2070, 2066, 2168, 2064, 2062, 2055, 2150, 2135, 2135, 2123, 2114, 2160, 2114, 2117, 2156, 2126, 2131, 2056, 2066, 2068, 2064, 2057, 2068, 2065, 2055, 2063, 2156, 2159, 2163, 2154, 2155, 2059, 2055, 2123, 2126, 2124, 2114, 2055, 2144, 2114, 2116, 2124, 2120, 2062, 2055, 2148, 2127, 2133, 2120, 2122, 2114, 2056, 2078, 2070, 2057, 2071, 2057, 2067, 2067, 2064, 2069, 2057, 2070, 2070, 2067, 2055, 2164, 2118, 2113, 2118, 2133, 2126, 2056, 2066, 2068, 2064, 2057, 2068, 2065, 2069, 2077, 2077, 2069, 2078, 2071, 1298, 1318, 1319, 1339, 1340, 1313, 1338, 1319, 1322, 1947, 1947, 1947, 1986, 1940, 1920, 1941, 1951, 2012, 2013, 1986, 1935, 1923, 1921, 1905, 1862, 1861, 1862, 1873, 1862, 1873, 2990, 2946, 2946, 2950, 2948, 2952, 1555, 1585, 1585, 1591, 1570, 1574, 1663, 1566, 1587, 1596, 1589, 1575, 1587, 1589, 1591, 1033, 1051, 1118, 1072, 1085, 1119, 1033, 1051, 1096, 1026, 1102, 1091, 1117, 1099, 1119, 1033, 1051, 1118, 1063, 1060, 1096, 1026, 1102, 1091, 1117, 1092, 1119, 1033, 1051, 1118, 1083, 1080, 1096, 1026, 1102, 1091, 1117, 1094, 1119, 1046, 1053, 1118, 1062, 1056, 1096, 1026, 1102, 1091, 1117, 1088, 1119, 1046, 1053, 1096, 1026, 1102, 1091, 1117, 1089, 1351, 1363, 1358, 1368, 1369, 1358, 1345, 2169, 2161, 2175, 2604, 2672, 2604, 2424, 2401, 2355, 2366, 2359, 2338, 2426, 2418, 3051, 3043, 3053, 3007, 1599, 1574, 1633, 1650, 1637, 1633, 1597, 1659, 1633, 1650, 1637, 1633, 1661, 1574, 1657, 1637, 1633, 1650, 1597, 1659, 1657, 1637, 1633, 1650, 1661, 1574, 1647, 1650, 1636, 1637, 1650, 1597, 1659, 1647, 1650, 1636, 1637, 1650, 1661, 1725, 1786, 1769, 1790, 1786, 1702, 1760, 1786, 1769, 1790, 1786, 1766, 1725, 1762, 1790, 1786, 1769, 1702, 1760, 1762, 1790, 1786, 1769, 1766, 1725, 1780, 1769, 1791, 1790, 1769, 1702, 1760, 1780, 1769, 1791, 1790, 1769, 1766, 2355, 927, 1010, 1023, 1023, 2561, 2587, 2568, 2591, 2587, 2567, 2162, 2101, 2086, 2097, 2101, 2153, 2095, 2101, 2086, 2097, 2101, 2089, 1362, 1360, 1356, 1352, 1371, 1364, 3104, 3199, 3171, 3175, 3188, 3131, 3197, 3199, 3171, 3175, 3188, 3195, 2556, 1684, 1689, 1689, 1754, 2275, 2298, 2227, 2222, 2232, 2233, 2222, 2273, 2284, 1538, 1611, 1622, 1600, 1601, 1622, 1561, 1556, 1673, 27023, 25127, 26448, 22302, 25990, 26077, -29521, 29610, 31741, 25266, 20936, 1508, 1513, 1526, 1454, 1507, 1519, 1516, 1453, 1516, 1511, 1453, 1464, 2431, 2340, 2361, 2426, 2421, 2362, 2343, 1557, 1553, 1563, 1618, 1547, 1617, 1613, 1612, 1612, 867, 866, 883, 2274, 2236, 2303, 2288, 2239, 2210, 1589, 1658, 1584, 1657, 1590, 1592, 1595, 1591, 1599, 719, 725, 706, 705, 2533, 2556, 2538, 2556, 2556, 2534, 2528, 2529, 2534, 2539, 2226, 1535, 1510, 1517, 1494, 1504, 1517, 1563, 1538, 1545, 1586, 1539, 1548, 1536, 1544, 2105, 2080, 2091, 2064, 2111, 2086, 2092, 1465, 1440, 1451, 1424, 1469, 1450, 1442, 1454, 1469, 1444, 1468, 2411, 2426, 2428, 2430, 1763, 1778, 1780, 1782, 1776, 1788, 1766, 1789, 1767, 2102, 2099, 2103, 2099, 2094, 1251, 1272, 1251, 1270, 1275, 386, 391, 413, 410, 2763, 2763, 2763, 31314, 20898, -1741, 2844, 2833, 2830, 2902, 2843, 2839, 2836, 2901, 2837, 2844, 2901, 2841, 2829, 2828, 2839, 2904, 2833, 2837, 2847, 1469, 1468, 1453, 1256, 1201, 1198, 1252, 1197, 1262, 1263, 1262, 1253, 1198, 1252, 1197, 1261, 1252, 1197, 1250, 1260, 1263, 1251, 1259, 2097, 2108, 2083, 2171, 2102, 2100, 2087, 2097, 2171, 2102, 2106, 2105, 2105, 2100, 2085, 2086, 2096, 2165, 2155, 2165, 2097, 2108, 2083, 2171, 2102, 2100, 2087, 2097, 2168, 2103, 2106, 2097, 2092, 1156, 1159, 1174, 1177, 1241, 1173, 1174, 1171, 1168, 1170, 1241, 1173, 1168, 1242, 1159, 1154, 1157, 1159, 1179, 1170, 1242, 1179, 1155, 28376, 28060, 28122, -25128, -2250, 2108, 785, 796, 771, 859, 790, 794, 793, 859, 792, 791, 856, 839, 1476, 1878, 1873, 1879, 1866, 1867, 1858, 996, 427, 23391, 24405, 2591, 2675, -30043, 29184, -31413, 32238, 2359, 23093, 28381, -301, 17057, 25486, -3200, 2174, 2151, 2156, 2135, 2145, 2156, 2430, 2407, 2412, 2391, 2406, 2409, 2405, 2413, 1955, 1978, 1969, 1930, 1957, 1980, 1974, 2898, 2911, 2902, 2883, 2937, 2888, 2887, 2891, 2883, 298, 307, 312, 259, 293, 313, 317, 302, 781, 788, 799, 804, 794, 777, 798, 794, 2698, 2707, 2712, 2723, 2702, 2713, 2705, 2717, 2702, 2711, 2703, 1222, 1247, 1236, 1263, 1233, 1235, 1220, 1247, 1218, 283, 258, 265, 306, 265, 260, 287, 264, 270, 281, 258, 287, 1989, 2012, 2007, 2028, 2000, 2012, 2013, 1991, 2006, 2013, 1991, 573, 626, 574, 552, 562, 626, 574, 552, 562, 625, 559, 557, 553, 573, 558, 569, 25957, 25846, 21471, -30304, 906, 912, 903, 900, 1331, 1322, 1340, 1322, 1322, 1328, 1334, 1335, 1328, 1341, 2077, 2285, 1786, 2273, 2296, 2291, 2248, 2279, 2299, 2294, 2286, 2248, 2289, 2277, 2296, 2298, 658, 651, 640, 699, 660, 648, 645, 669, 699, 657, 662, 648, 1696, 1701, 1727, 1720, 3149, 2675, 2602, 23392, -25888, 2602, 2610, 2600, 2602, 2665, 2602, 2596, 2602, 32573, 21881, 2602, 2610, 2600, 2602, 2616, 2602, 2596, 2602, 32573, -31794, 22639, 2602, 2610, 2600, 2602, 2617, 2602, 2677, 2204, 2193, 2200, 2189, 2231, 2182, 2185, 2181, 2189, 1842, 1855, 1846, 1827, 1817, 1839, 1826, 3232, 3247, 3234, 3248, 3248, 1704, 1703, 1698, 1722, 1707, 1724, 1725, 2736, 2749, 2722, 2810, 2726, 2747, 2723, 2810, 2726, 2747, 2723, 2809, 2743, 2741, 2726, 2736, 2727, 1854, 1843, 1836, 1908, 1849, 1845, 1846, 1911, 1902, 1908, 1832, 1845, 1837, 1833, 1911, 1847, 1854, 1911, 1901, 2574, 2645, 2632, 2565, 2567, 2580, 2562, 2635, 2578, 2575, 2578, 2570, 2563, 2492, 2488, 2482, 2555, 2466, 2552, 2532, 2533, 2533, 3286, 3283, 3270, 
    3283, 3231, 3265, 3264, 3281, 705, 671, 709, 724, 713, 709, 668, 732, 708, 709, 724, 725, 2157, 2082, 2152, 2081, 2158, 2144, 2147, 2159, 2151, 2082, 2159, 2147, 2170, 2153, 2174, 2993, 2987, 3004, 3007, 1937, 1928, 1923, 1976, 1934, 1923, 1218, 1243, 1232, 1259, 1242, 1237, 1241, 1233, 2241, 2264, 2259, 2280, 2247, 2270, 2260, 3044, 3069, 3062, 3021, 3040, 3063, 3071, 3059, 3040, 3065, 3041, 1257, 1260, 1270, 1265, 2042, 2138, 2052, 2114, 2063, 2152, 2053, 983, 905, 975, 898, 2063, 2056, 2070, 2121, 748, 1343, 1320, 1339, 1385, 1337, 1312, 1325, 1385, 1396, 2424, 2408, 2425, 2402, 2427, 2431, 759, 736, 755, 673, 757, 744, 748, 740, 2133, 2696, 2454, 2517, 2512, 2519, 2524, 2506, 2438, 2509, 2436, 1935, 2010, 1998, 1940, 2726, 2800, 2793, 2788, 2749, 2514, 2519, 2498, 2519, 598, 603, 607, 602, 603, 588, 1217, 1222, 1240, 805, 825, 820, 812, 768, 807, 825, 1727, 1710, 1725, 1724, 1706, 1763, 1763, 1763, 1722, 1782, 1776, 1773, 1767, 1700, 1701, 1722, 1783, 1787, 1785, 2286, 2286, 2286, 2231, 2299, 2301, 2300, 2221, 2231, 2298, 2298, 2410, 776, 789, 849, 1562, 1542, 1542, 1538, 1537, 1608, 1629, 1629, 1540, 1565, 1558, 1628, 1552, 1558, 1547, 1537, 1628, 1567, 1559, 1629, 2219, 2289, 2294, 1296, 1301, 1280, 1301, 1358, 1301, 1284, 1284, 1304, 1309, 1303, 1301, 1280, 1309, 1307, 1306, 1371, 1282, 1306, 1296, 1370, 1301, 1284, 1284, 1304, 1297, 1370, 1305, 1284, 1297, 1299, 1281, 1286, 1304, 1359, 1302, 1301, 1287, 1297, 1346, 1344, 1368, 3094, 3094, 3094, 3151, 3097, 3085, 3096, 3090, 3153, 3152, 3151, 3074, 3086, 3084, 1575, 1595, 1595, 1599, 1596, 1653, 1632, 1632, 1580, 1569, 1633, 1581, 1574, 1569, 1576, 1633, 1580, 1568, 1570, 1632, 1596, 1578, 1582, 1597, 1580, 1575, 1648, 1598, 1650, 2992, 3048, 3058, 3055, 3070, 2977, 3052, 3052, 3052, 2997, 3043, 3063, 3042, 3048, 2987, 2986, 2997, 3064, 3060, 3062, 2963, 2971, 2971, 2963, 2968, 2961, 836, 839, 776, 841, 884, 857, 846, 856, 862, 839, 863, 856, 779, 839, 834, 3048, 2994, 948, 1006, 1020, 957, 1202, 1192, 1215, 1212, 729, 646, 666, 663, 655, 729, 2048, 2137, 2118, 2060, 2117, 2053, 2060, 2117, 2058, 2052, 2055, 2059, 2051, 3280, 3293, 3266, 3226, 3287, 3291, 3288, 3225, 3289, 3280, 3225, 3285, 3265, 3264, 3291, 3220, 3293, 3289, 3283, 822, 823, 806, 1562, 1539, 1544, 1587, 1538, 1549, 1537, 1545, 21496, 1602, 1627, 1616, 1643, 1606, 1617, 1625, 1621, 1606, 1631, 1607, 839, 862, 853, 878, 856, 853, 426, 492, 496, 489, 899, 922, 913, 938, 901, 924, 918, 2236, 2233, 2211, 2212, 716, 720, 720, 724, 727, 670, 651, 651, 2870, 3038, 3064, 3054, 3065, 2982, 3018, 3052, 3054, 3045, 3071, 1835, 1801, 1820, 1807, 1802, 1802, 1799, 1865, 1875, 1864, 1878, 1862, 1870, 1835, 1799, 1797, 1807, 1800, 1810, 1801, 1813, 1806, 1885, 1862, 1839, 1800, 1810, 1795, 1802, 1862, 1835, 1799, 1797, 1862, 1833, 1845, 1862, 1854, 1862, 1879, 1878, 1849, 1879, 1875, 1849, 1873, 1871, 1862, 1831, 1814, 1814, 1802, 1795, 1841, 1795, 1796, 1837, 1807, 1810, 1865, 1875, 1877, 1873, 1864, 1877, 1872, 1862, 1870, 1837, 1838, 1842, 1835, 1834, 1866, 1862, 1802, 1807, 1805, 1795, 1862, 1825, 1795, 1797, 1805, 1801, 1871, 1862, 1829, 1806, 1812, 1801, 1803, 1795, 1865, 1887, 1879, 1864, 1878, 1864, 1874, 1874, 1873, 1876, 1864, 1879, 1879, 1874, 1862, 1845, 1799, 1792, 1799, 1812, 1807, 1865, 1875, 1877, 1873, 1864, 1877, 1872, 1250, 1238, 1239, 1227, 1228, 1233, 1226, 1239, 1242, 1774, 1747, 1736, 1734, 1736, 1743, 736, 736, 736, 697, 751, 763, 750, 740, 679, 678, 697, 756, 760, 762, 2482, 2448, 2448, 2454, 2435, 2439, 2526, 2495, 2450, 2461, 2452, 2438, 2450, 2452, 2454, 2893, 2911, 2842, 2932, 2937, 2843, 2893, 2911, 2828, 2886, 2826, 2823, 2841, 2831, 2843, 2893, 2911, 2842, 2915, 2912, 2828, 2886, 2826, 2823, 2841, 2816, 2843, 2893, 2911, 2842, 2943, 2940, 2828, 2886, 2826, 2823, 2841, 2818, 2843, 2898, 2905, 2842, 2914, 2916, 2828, 2886, 2826, 2823, 2841, 2820, 2843, 2898, 2905, 2828, 2886, 2826, 2823, 2841, 2821, 1894, 1890, 1908, 1800, 1890, 1892, 1893, 1800, 1911, 1900, 1892, 1908, 1808, 1911, 1862, 1859, 1859, 1870, 1865, 1856, 2213, 2209, 2231};

    /* renamed from: u */
    private JSONObject f40u;

    /* renamed from: q */
    private String f39q = "";

    /* renamed from: xC */
    private String f41xC = "";

    /* renamed from: QU */
    private String f37QU = "";

    /* renamed from: UJ */
    private Pattern f38UJ = Pattern.compile(C0168.m805(f816short, 0, 9, 1814));

    public Bdys01() {
        int iM857 = C0181.m857();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = iM857 <= 0 ? 1709 : 1678;
                case 204:
                    System.out.println(Long.decode(C0180.m852("YZEDXCrIjwDpB0inpXGS8rfhU")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* renamed from: QU */
    protected void m24QU() {
        this.f41xC = "";
        String str = this.f39q + C0169.m809(f816short, 9, 6, 2819);
        HashMap map = new HashMap();
        C0106ZJ.m482B(str, m25UJ(str, ""), map);
        Iterator it = map.entrySet().iterator();
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
                        Map.Entry entry = (Map.Entry) it.next();
                        boolean zEquals = ((String) entry.getKey()).equals(C0182.m861(f816short, 15, 10, 2053));
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = zEquals ? 1833 : 1802;
                                case 54:
                                case 471:
                                    break;
                                case 500:
                                    this.f41xC = C0179.m849(f816short, 25, 7, 2999) + TextUtils.join(C0181.m856(f816short, 32, 1, 2689), (Iterable) entry.getValue());
                                    break;
                            }
                        }
                        break;
                    case 239:
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0086. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0033. Please report as an issue. */
    /* renamed from: UJ */
    protected HashMap<String, String> m25UJ(String str, String str2) {
        HashMap<String, String> map = new HashMap<>();
        map.put(C0182.m861(f816short, 33, 10, 2582), C0168.m805(f816short, 43, 121, 2087));
        boolean zEquals = str2.equals(C0177.m841(f816short, 164, 6, 2162));
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = !zEquals ? 1709 : 1678;
                case 204:
                    map.put(C0179.m849(f816short, 170, 9, 1363), C0165.m798(f816short, 179, 14, 2028));
                    int length = str2.length();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = length > 0 ? 1833 : 1802;
                            case 54:
                            case 471:
                                break;
                            case 500:
                                map.put(C0183.m866(f816short, 193, 7, 1827), str2);
                                break;
                        }
                    }
                    int length2 = this.f41xC.length();
                    int i3 = 1864;
                    while (true) {
                        i3 ^= 1881;
                        switch (i3) {
                            case 17:
                                i3 = length2 > 0 ? 48736 : 48705;
                            case 47384:
                                break;
                            case 47417:
                                map.put(C0179.m849(f816short, 200, 6, 3053), this.f41xC);
                                break;
                            case 47483:
                        }
                    }
                    break;
                case 239:
                    break;
            }
        }
        map.put(C0179.m849(f816short, 206, 15, 1618), C0168.m805(f816short, 221, 59, 1139));
        return map;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:134:0x037b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x00ce. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:49:0x0168. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x0179. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:70:0x01b7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:87:0x020d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:99:0x0252. Please report as an issue. */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException, NumberFormatException {
        String strReplace;
        String strReplace2;
        String strM841 = C0177.m841(f816short, 280, 7, 1340);
        String strM851 = C0180.m851(f816short, 287, 3, 2050);
        try {
            String str3 = this.f39q + C0171.m816(f816short, 290, 3, 2563);
            String strM845 = C0178.m845(f816short, 293, 7, 2375);
            String strM8412 = C0177.m841(f816short, 300, 1, 2323);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = map != null ? 1709 : 1678;
                    case 204:
                        int size = map.size();
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = size > 0 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    break;
                                case 500:
                                    boolean zEquals = str.equals(strM8412);
                                    String strM856 = C0181.m856(f816short, 301, 4, 2960);
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                i3 = zEquals ? 48736 : 48705;
                                            case 47384:
                                                strReplace2 = str3 + strM856 + str2 + strM845 + str + C0165.m798(f816short, 344, 38, 1691);
                                                break;
                                            case 47417:
                                                strReplace2 = str3 + strM856 + str2 + C0174.m828(f816short, 305, 39, 1536);
                                                int i4 = 48767;
                                                while (true) {
                                                    i4 ^= 48784;
                                                    switch (i4) {
                                                        case 14:
                                                            break;
                                                        case 239:
                                                            i4 = 48798;
                                                            continue;
                                                        default:
                                                            continue;
                                                    }
                                                }
                                            case 47483:
                                        }
                                    }
                                    Iterator<String> it = map.keySet().iterator();
                                    while (true) {
                                        boolean zHasNext = it.hasNext();
                                        int i5 = 48891;
                                        while (true) {
                                            i5 ^= 48908;
                                            switch (i5) {
                                                case 22:
                                                case 53:
                                                    break;
                                                case 503:
                                                    i5 = zHasNext ? 49635 : 48953;
                                                case 32495:
                                                    String next = it.next();
                                                    String str4 = map.get(next);
                                                    int length = str4.length();
                                                    int i6 = 49666;
                                                    while (true) {
                                                        i6 ^= 49683;
                                                        switch (i6) {
                                                            case 17:
                                                                i6 = length > 0 ? 49759 : 49728;
                                                            case 50:
                                                            case 76:
                                                                strReplace2 = strReplace2.replace(C0171.m816(f816short, 382, 1, 2376) + next + C0165.m798(f816short, 383, 1, 994), URLEncoder.encode(str4));
                                                                int i7 = 49790;
                                                                while (true) {
                                                                    i7 ^= 49807;
                                                                    switch (i7) {
                                                                        case 18:
                                                                            break;
                                                                        case 241:
                                                                            i7 = 49821;
                                                                    }
                                                                }
                                                                break;
                                                            case 83:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                            int i8 = 0;
                                            strReplace = strReplace2;
                                            while (true) {
                                                int i9 = 49914;
                                                while (true) {
                                                    i9 ^= 49931;
                                                    switch (i9) {
                                                        case 497:
                                                            i9 = i8 < 4 ? 50658 : 50627;
                                                        case 1711:
                                                        case 1736:
                                                            break;
                                                        case 1769:
                                                            boolean zContains = strReplace.contains(strM851);
                                                            int i10 = 50689;
                                                            while (true) {
                                                                i10 ^= 50706;
                                                                switch (i10) {
                                                                    case 19:
                                                                        i10 = zContains ? 50782 : 50751;
                                                                    case 45:
                                                                        boolean zContains2 = strReplace.contains(C0177.m841(f816short, 387, 6, 2682));
                                                                        int i11 = 51588;
                                                                        while (true) {
                                                                            i11 ^= 51605;
                                                                            switch (i11) {
                                                                                case 17:
                                                                                    i11 = zContains2 ? 51681 : 51650;
                                                                                case 54:
                                                                                case 87:
                                                                                    boolean zContains3 = strReplace.contains(C0168.m805(f816short, 405, 6, 1321));
                                                                                    int i12 = 51836;
                                                                                    while (true) {
                                                                                        i12 ^= 51853;
                                                                                        switch (i12) {
                                                                                            case 241:
                                                                                                i12 = zContains3 ? 52580 : 52549;
                                                                                            case 1963:
                                                                                            case 1992:
                                                                                                boolean zContains4 = strReplace.contains(strM841);
                                                                                                int i13 = 52735;
                                                                                                while (true) {
                                                                                                    i13 ^= 52752;
                                                                                                    switch (i13) {
                                                                                                        case 14:
                                                                                                        case 45:
                                                                                                            break;
                                                                                                        case 1007:
                                                                                                            i13 = zContains4 ? 53479 : 52797;
                                                                                                        case 7927:
                                                                                                            strReplace = strReplace.replace(strM841, C0172.m820(f816short, 423, 1, 2508));
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 2025:
                                                                                                strReplace = strReplace.replace(C0178.m845(f816short, 411, 12, 3078), "");
                                                                                                int i14 = 52611;
                                                                                                while (true) {
                                                                                                    i14 ^= 52628;
                                                                                                    switch (i14) {
                                                                                                        case 23:
                                                                                                            i14 = 52642;
                                                                                                        case 54:
                                                                                                            break;
                                                                                                    }
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 116:
                                                                                    strReplace = strReplace.replace(C0182.m861(f816short, 393, 12, 2132), "");
                                                                                    int i15 = 51712;
                                                                                    while (true) {
                                                                                        i15 ^= 51729;
                                                                                        switch (i15) {
                                                                                            case 17:
                                                                                                i15 = 51743;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 50:
                                                                    case 76:
                                                                        strReplace = strReplace.replace(strM851, C0178.m845(f816short, 384, 3, 915));
                                                                        int i16 = 50813;
                                                                        while (true) {
                                                                            i16 ^= 50830;
                                                                            switch (i16) {
                                                                                case 18:
                                                                                    break;
                                                                                case 243:
                                                                                    i16 = 50844;
                                                                            }
                                                                            break;
                                                                        }
                                                                }
                                                            }
                                                            i8++;
                                                            int i17 = 53510;
                                                            while (true) {
                                                                i17 ^= 53527;
                                                                switch (i17) {
                                                                    case 17:
                                                                        i17 = 53541;
                                                                        break;
                                                                    case 50:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                    break;
                                                }
                                            }
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
            boolean zEquals2 = str.equals(strM8412);
            String strM8562 = C0181.m856(f816short, 424, 4, 1781);
            int i18 = 53634;
            while (true) {
                i18 ^= 53651;
                switch (i18) {
                    case 17:
                        i18 = zEquals2 ? 53727 : 53696;
                    case 50:
                    case 76:
                        strReplace = str3 + strM8562 + str2 + C0182.m861(f816short, 428, 9, 2268);
                        int i19 = 53758;
                        while (true) {
                            i19 ^= 53775;
                            switch (i19) {
                                case 1009:
                                    i19 = 54440;
                                    continue;
                                case 1703:
                                    break;
                                default:
                                    continue;
                            }
                        }
                    case 83:
                        strReplace = str3 + strM8562 + str2 + strM845 + str + C0170.m814(f816short, 437, 8, 1572);
                        break;
                }
            }
            String str5 = this.f39q + C0180.m851(f816short, 445, 1, 1702);
            this.f37QU = str5;
            String strM484FN = C0106ZJ.m484FN(strReplace, m25UJ(strReplace, str5));
            this.f37QU = strReplace;
            C0082OO c0082ooM440q = C0093Tt.m440q(strM484FN);
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            boolean zContains5 = strM484FN.contains(C0175.m834(f816short, 446, 11, 1326));
            int i20 = 54533;
            while (true) {
                i20 ^= 54550;
                switch (i20) {
                    case 19:
                        i20 = !zContains5 ? 54626 : 54595;
                    case 50:
                    case 85:
                        break;
                    case 116:
                        C0116dX c0116dXM654b = c0082ooM440q.m654b(C0181.m856(f816short, 457, 12, 1408));
                        int i21 = 0;
                        while (true) {
                            int size2 = c0116dXM654b.size();
                            int i22 = 54657;
                            while (true) {
                                i22 ^= 54674;
                                switch (i22) {
                                    case 19:
                                        i22 = i21 < size2 ? 55401 : 54719;
                                    case 45:
                                        break;
                                    case 50:
                                    case 3579:
                                        C0127lK c0127lK = c0116dXM654b.get(i21);
                                        String strM653a = c0127lK.m667pt(C0183.m866(f816short, 469, 7, 2327)).m653a();
                                        String strMo126QU = c0127lK.m667pt(C0166.m801(f816short, 476, 9, 1660)).mo126QU(C0170.m814(f816short, 485, 3, 784));
                                        String strM653a2 = c0127lK.m667pt(C0166.m801(f816short, 488, 6, 2194)).m653a();
                                        String strMo126QU2 = c0127lK.m667pt(C0174.m828(f816short, 494, 9, 1620)).mo126QU(C0177.m841(f816short, 503, 4, 679));
                                        boolean zContains6 = strMo126QU2.contains(C0165.m798(f816short, 507, 10, 2479));
                                        int i23 = 55432;
                                        while (true) {
                                            i23 ^= 55449;
                                            switch (i23) {
                                                case 17:
                                                    i23 = zContains6 ? 55525 : 55494;
                                                case 62:
                                                case 95:
                                                    break;
                                                case 124:
                                                    strMo126QU2 = strMo126QU2.substring(0, strMo126QU2.indexOf(C0175.m834(f816short, 517, 1, 2185)));
                                                    break;
                                            }
                                        }
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put(C0177.m841(f816short, 518, 6, 1417), strMo126QU2);
                                        jSONObject2.put(C0172.m820(f816short, 524, 8, 1645), strM653a);
                                        jSONObject2.put(C0177.m841(f816short, 532, 7, 2127), strMo126QU);
                                        jSONObject2.put(C0180.m851(f816short, 539, 11, 1487), strM653a2);
                                        jSONArray.put(jSONObject2);
                                        int i24 = i21 + 1;
                                        int i25 = 55556;
                                        while (true) {
                                            i25 ^= 55573;
                                            switch (i25) {
                                                case 17:
                                                    i25 = 55587;
                                                    break;
                                                case 54:
                                                    break;
                                            }
                                        }
                                        i21 = i24;
                                        break;
                                }
                                break;
                            }
                        }
                        break;
                }
            }
            int i26 = Integer.parseInt(str2);
            jSONObject.put(C0170.m814(f816short, 550, 4, 2331), i26);
            String strM8512 = C0180.m851(f816short, 554, 9, 1683);
            int length2 = jSONArray.length();
            int i27 = 55680;
            while (true) {
                i27 ^= 55697;
                switch (i27) {
                    case 17:
                        if (length2 != 24) {
                            break;
                        } else {
                            i27 = 56424;
                        }
                    case 1467:
                        break;
                    case 1496:
                        break;
                    case 1529:
                        i26++;
                        break;
                    default:
                        continue;
                }
                i27 = 56393;
            }
            jSONObject.put(strM8512, i26);
            jSONObject.put(C0180.m851(f816short, 563, 5, 2138), 24);
            jSONObject.put(C0176.m836(f816short, 568, 5, 1175), Integer.MAX_VALUE);
            jSONObject.put(C0177.m841(f816short, 573, 4, 494), jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:109:0x048c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:123:0x04f6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x018a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x01d7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:53:0x0260. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:79:0x030f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:93:0x0361. Please report as an issue. */
    public String detailContent(List<String> list) throws JSONException {
        String str;
        String strJoin;
        String strJoin2;
        String strM866 = C0183.m866(f816short, 577, 3, 2799);
        String strM856 = C0181.m856(f816short, 580, 3, 1577);
        try {
            Init.m46lj();
            String str2 = this.f39q + list.get(0);
            C0082OO c0082ooM440q = C0093Tt.m440q(C0106ZJ.m484FN(str2, m25UJ(str2, this.f37QU)));
            this.f37QU = str2;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String strMo126QU = c0082ooM440q.m667pt(C0166.m801(f816short, 583, 19, 2936)).mo126QU(C0179.m849(f816short, 602, 3, 1486));
            String strM653a = c0082ooM440q.m667pt(C0171.m816(f816short, 605, 20, 1152)).m653a();
            String strM596u = c0082ooM440q.m654b(C0181.m856(f816short, 625, 33, 2133)).m596u();
            String str3 = c0082ooM440q.m654b(C0174.m828(f816short, 658, 23, 1271)).m596u().replace(C0168.m805(f816short, 681, 5, 2092), "").split(C0177.m841(f816short, 686, 1, 2065))[0];
            C0116dX c0116dXM654b = c0082ooM440q.m654b(C0182.m861(f816short, 687, 12, 885)).get(0).m654b(C0165.m798(f816short, 699, 1, 1460));
            String str4 = "";
            String str5 = "";
            String strSubstring = "";
            String str6 = "";
            String strM653a2 = "";
            int i = 0;
            while (true) {
                int size = c0116dXM654b.size();
                int i2 = 1616;
                while (true) {
                    i2 ^= 1633;
                    switch (i2) {
                        case 14:
                        case 49:
                            i2 = i < size ? 1709 : 1678;
                        case 204:
                            C0127lK c0127lK = c0116dXM654b.get(i);
                            String strM653a3 = c0127lK.m667pt(C0165.m798(f816short, 700, 6, 1829)).m653a();
                            boolean zEquals = strM653a3.equals(strM856);
                            String strM816 = C0171.m816(f816short, 706, 1, 968);
                            String strM805 = C0168.m805(f816short, 707, 1, 458);
                            int i3 = 1740;
                            while (true) {
                                i3 ^= 1757;
                                switch (i3) {
                                    case 17:
                                        i3 = zEquals ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        boolean zContains = strM653a3.contains(C0182.m861(f816short, 708, 2, 3183));
                                        int i4 = 49666;
                                        while (true) {
                                            i4 ^= 49683;
                                            switch (i4) {
                                                case 17:
                                                    i4 = zContains ? 49759 : 49728;
                                                case 50:
                                                case 76:
                                                    strSubstring = c0127lK.m653a().substring(c0127lK.m653a().indexOf(C0182.m861(f816short, 710, 1, 2628)) + 1, c0127lK.m653a().indexOf(C0170.m814(f816short, 711, 1, 2606)));
                                                    int i5 = 49790;
                                                    while (true) {
                                                        i5 ^= 49807;
                                                        switch (i5) {
                                                            case 18:
                                                                break;
                                                            case 241:
                                                                i5 = 49821;
                                                        }
                                                        strJoin = str5;
                                                        break;
                                                    }
                                                    break;
                                                case 83:
                                                    boolean zContains2 = strM653a3.contains(C0175.m834(f816short, 712, 2, 1763));
                                                    int i6 = 49914;
                                                    while (true) {
                                                        i6 ^= 49931;
                                                        switch (i6) {
                                                            case 497:
                                                                i6 = zContains2 ? 50658 : 50627;
                                                            case 1711:
                                                            case 1736:
                                                                boolean zContains3 = strM653a3.contains(C0170.m814(f816short, 717, 3, 457));
                                                                int i7 = 50813;
                                                                while (true) {
                                                                    i7 ^= 50830;
                                                                    switch (i7) {
                                                                        case 18:
                                                                        case 53:
                                                                            boolean zContains4 = strM653a3.contains(C0183.m866(f816short, 720, 3, 3226));
                                                                            int i8 = 51712;
                                                                            while (true) {
                                                                                i8 ^= 51729;
                                                                                switch (i8) {
                                                                                    case 14:
                                                                                    case 17:
                                                                                        i8 = zContains4 ? 51805 : 51774;
                                                                                    case 47:
                                                                                        strJoin = str5;
                                                                                        break;
                                                                                    case 76:
                                                                                        ArrayList arrayList = new ArrayList();
                                                                                        C0116dX c0116dXM654b2 = c0127lK.m654b(strM805);
                                                                                        int i9 = 0;
                                                                                        while (true) {
                                                                                            int size2 = c0116dXM654b2.size();
                                                                                            int i10 = 51836;
                                                                                            while (true) {
                                                                                                i10 ^= 51853;
                                                                                                switch (i10) {
                                                                                                    case 241:
                                                                                                        i10 = i9 < size2 ? 52580 : 52549;
                                                                                                    case 1963:
                                                                                                    case 1992:
                                                                                                        break;
                                                                                                    case 2025:
                                                                                                        arrayList.add(c0116dXM654b2.get(i9).m653a());
                                                                                                        i9++;
                                                                                                        int i11 = 52611;
                                                                                                        while (true) {
                                                                                                            i11 ^= 52628;
                                                                                                            switch (i11) {
                                                                                                                case 23:
                                                                                                                    i11 = 52642;
                                                                                                                    break;
                                                                                                                case 54:
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                }
                                                                                                strJoin = TextUtils.join(strM816, arrayList);
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 243:
                                                                            i7 = zContains3 ? 51557 : 50875;
                                                                        case 4075:
                                                                            strM653a2 = c0127lK.m667pt(strM805).m653a();
                                                                            int i12 = 51588;
                                                                            while (true) {
                                                                                i12 ^= 51605;
                                                                                switch (i12) {
                                                                                    case 17:
                                                                                        i12 = 51619;
                                                                                    case 54:
                                                                                        break;
                                                                                }
                                                                                strJoin = str5;
                                                                                break;
                                                                            }
                                                                    }
                                                                }
                                                                break;
                                                            case 1769:
                                                                str6 = C0165.m798(f816short, 714, 3, 2317) + c0127lK.m653a();
                                                                int i13 = 50689;
                                                                while (true) {
                                                                    i13 ^= 50706;
                                                                    switch (i13) {
                                                                        case 19:
                                                                            i13 = 50720;
                                                                        case 50:
                                                                            strJoin = str5;
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
                                        try {
                                            ArrayList arrayList2 = new ArrayList();
                                            C0116dX c0116dXM654b3 = c0127lK.m654b(strM805);
                                            int i14 = 0;
                                            while (true) {
                                                int size3 = c0116dXM654b3.size();
                                                int i15 = 1864;
                                                while (true) {
                                                    i15 ^= 1881;
                                                    switch (i15) {
                                                        case 17:
                                                            i15 = i14 < size3 ? 48736 : 48705;
                                                        case 47384:
                                                            break;
                                                        case 47417:
                                                            arrayList2.add(c0116dXM654b3.get(i14).m653a());
                                                            i14++;
                                                            int i16 = 48767;
                                                            while (true) {
                                                                i16 ^= 48784;
                                                                switch (i16) {
                                                                    case 14:
                                                                        break;
                                                                    case 239:
                                                                        i16 = 48798;
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 47483:
                                                    }
                                                    str4 = strM856 + TextUtils.join(strM816, arrayList2);
                                                    int i17 = 48891;
                                                    while (true) {
                                                        i17 ^= 48908;
                                                        switch (i17) {
                                                            case 22:
                                                                break;
                                                            case 503:
                                                                i17 = 48922;
                                                        }
                                                        strJoin = str5;
                                                        break;
                                                    }
                                                }
                                            }
                                        } catch (Exception e) {
                                            e = e;
                                            int i18 = 55680;
                                            while (true) {
                                                i18 ^= 55697;
                                                switch (i18) {
                                                    case 17:
                                                        i18 = 56362;
                                                        continue;
                                                    case 1467:
                                                        str = "";
                                                        break;
                                                }
                                                SpiderDebug.log(e);
                                                return str;
                                            }
                                        }
                                        break;
                                }
                            }
                            int i19 = i + 1;
                            int i20 = 52735;
                            while (true) {
                                i20 ^= 52752;
                                switch (i20) {
                                    case 14:
                                        break;
                                    case 1007:
                                        i20 = 52766;
                                        break;
                                }
                            }
                            str5 = strJoin;
                            i = i19;
                            break;
                        case 239:
                            jSONObject2.put(C0181.m856(f816short, 723, 6, 2056), list.get(0));
                            jSONObject2.put(C0172.m820(f816short, 729, 8, 2312), strM653a);
                            jSONObject2.put(C0172.m820(f816short, 737, 7, 2005), strMo126QU);
                            jSONObject2.put(C0170.m814(f816short, 744, 9, 2854), str4);
                            jSONObject2.put(C0166.m801(f816short, 753, 8, 348), str3);
                            jSONObject2.put(C0175.m834(f816short, 761, 8, 891), strSubstring);
                            jSONObject2.put(C0171.m816(f816short, 769, 11, 2812), str6);
                            jSONObject2.put(C0180.m851(f816short, 780, 9, 1200), str5);
                            jSONObject2.put(C0179.m849(f816short, 789, 12, 365), strM653a2);
                            jSONObject2.put(C0174.m828(f816short, 801, 11, 1971), strM596u);
                            TreeMap treeMap = new TreeMap();
                            C0116dX c0116dXM654b4 = c0082ooM440q.m654b(C0165.m798(f816short, 812, 16, 604));
                            String strM801 = C0166.m801(f816short, 828, 4, 456);
                            ArrayList arrayList3 = new ArrayList();
                            int i21 = 0;
                            while (true) {
                                int size4 = c0116dXM654b4.size();
                                int i22 = 53510;
                                while (true) {
                                    i22 ^= 53527;
                                    switch (i22) {
                                        case 17:
                                            i22 = i21 < size4 ? 53603 : 53572;
                                        case 50:
                                        case 83:
                                            break;
                                        case 116:
                                            C0127lK c0127lK2 = c0116dXM654b4.get(i21);
                                            String strMo126QU2 = c0127lK2.mo126QU(C0168.m805(f816short, 832, 4, 994));
                                            boolean zContains5 = strMo126QU2.contains(C0176.m836(f816short, 836, 10, 1401));
                                            int i23 = 53634;
                                            while (true) {
                                                i23 ^= 53651;
                                                switch (i23) {
                                                    case 17:
                                                        i23 = zContains5 ? 53727 : 53696;
                                                    case 50:
                                                    case 76:
                                                        strMo126QU2 = strMo126QU2.substring(0, strMo126QU2.indexOf(C0176.m836(f816short, 846, 1, 2086)));
                                                        int i24 = 53758;
                                                        while (true) {
                                                            i24 ^= 53775;
                                                            switch (i24) {
                                                                case 1009:
                                                                    i24 = 54440;
                                                                case 1703:
                                                                    break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    case 83:
                                                        break;
                                                }
                                            }
                                            arrayList3.add(c0127lK2.m653a() + C0178.m845(f816short, 847, 1, 2249) + strMo126QU2);
                                            int i25 = i21 + 1;
                                            int i26 = 54533;
                                            while (true) {
                                                i26 ^= 54550;
                                                switch (i26) {
                                                    case 19:
                                                        i26 = 54564;
                                                        break;
                                                    case 50:
                                                        break;
                                                }
                                            }
                                            i21 = i25;
                                            break;
                                    }
                                    int size5 = arrayList3.size();
                                    int i27 = 54657;
                                    while (true) {
                                        i27 ^= 54674;
                                        switch (i27) {
                                            case 19:
                                                if (size5 <= 0) {
                                                    break;
                                                } else {
                                                    i27 = 55401;
                                                }
                                            case 45:
                                                strJoin2 = "";
                                                break;
                                            case 50:
                                                break;
                                            case 3579:
                                                strJoin2 = TextUtils.join(C0166.m801(f816short, 848, 1, 1753), arrayList3);
                                                int i28 = 55432;
                                                while (true) {
                                                    i28 ^= 55449;
                                                    switch (i28) {
                                                        case 17:
                                                            i28 = 55463;
                                                            break;
                                                        case 62:
                                                            break;
                                                    }
                                                }
                                                break;
                                            default:
                                                continue;
                                        }
                                        i27 = 54719;
                                    }
                                    treeMap.put(strM801, strJoin2);
                                    int size6 = treeMap.size();
                                    int i29 = 55556;
                                    while (true) {
                                        i29 ^= 55573;
                                        switch (i29) {
                                            case 17:
                                                if (size6 <= 0) {
                                                    break;
                                                } else {
                                                    i29 = 55649;
                                                }
                                            case 54:
                                                break;
                                            case 87:
                                                break;
                                            case 116:
                                                String strJoin3 = TextUtils.join(strM866, treeMap.keySet());
                                                String strJoin4 = TextUtils.join(strM866, treeMap.values());
                                                jSONObject2.put(C0171.m816(f816short, 849, 13, 2199), strJoin3);
                                                jSONObject2.put(C0179.m849(f816short, 862, 12, 740), strJoin4);
                                                break;
                                            default:
                                                continue;
                                        }
                                        i29 = 55618;
                                    }
                                    JSONArray jSONArray = new JSONArray();
                                    jSONArray.put(jSONObject2);
                                    jSONObject.put(C0175.m834(f816short, 874, 4, 1740), jSONArray);
                                    return jSONObject.toString();
                                }
                            }
                    }
                }
            }
        } catch (Exception e2) {
            e = e2;
            str = "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x00b1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0106. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0059. Please report as an issue. */
    public String homeContent(boolean z) throws JSONException {
        C0116dX c0116dXM654b;
        JSONArray jSONArray;
        int i = 0;
        try {
            m24QU();
            String str = this.f39q;
            C0082OO c0082ooM440q = C0093Tt.m440q(C0106ZJ.m484FN(str, m25UJ(str, this.f37QU)));
            this.f37QU = this.f39q + C0166.m801(f816short, 878, 1, 3170);
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            JSONObject jSONObject2 = new JSONObject(C0183.m866(f816short, 879, 32, 2568));
            Iterator<String> itKeys = jSONObject2.keys();
            while (true) {
                boolean zHasNext = itKeys.hasNext();
                int i2 = 1616;
                while (true) {
                    i2 ^= 1633;
                    switch (i2) {
                        case 14:
                        case 49:
                            i2 = zHasNext ? 1709 : 1678;
                        case 204:
                            JSONObject jSONObject3 = new JSONObject();
                            String next = itKeys.next();
                            jSONObject3.put(C0171.m816(f816short, 911, 9, 2280), next);
                            jSONObject3.put(C0177.m841(f816short, 920, 7, 1862), jSONObject2.optString(next));
                            jSONArray2.put(jSONObject3);
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
                    jSONObject.put(C0171.m816(f816short, 927, 5, 3267), jSONArray2);
                    int i4 = 1864;
                    while (true) {
                        i4 ^= 1881;
                        switch (i4) {
                            case 17:
                                i4 = z ? 48736 : 48705;
                            case 47384:
                                break;
                            case 47417:
                                jSONObject.put(C0179.m849(f816short, 932, 7, 1742), this.f40u);
                                break;
                            case 47483:
                        }
                    }
                    try {
                        c0116dXM654b = c0082ooM440q.m654b(C0182.m861(f816short, 939, 17, 2772)).get(0).m654b(C0181.m856(f816short, 956, 19, 1882));
                        jSONArray = new JSONArray();
                    } catch (Exception e) {
                        SpiderDebug.log(e);
                    }
                    while (true) {
                        int size = c0116dXM654b.size();
                        int i5 = 48767;
                        while (true) {
                            i5 ^= 48784;
                            switch (i5) {
                                case 14:
                                case 45:
                                    break;
                                case 76:
                                    C0127lK c0127lK = c0116dXM654b.get(i);
                                    String strM653a = c0127lK.m667pt(C0166.m801(f816short, 975, 13, 2662)).m653a();
                                    String strMo126QU = c0127lK.m667pt(C0182.m861(f816short, 988, 9, 2517)).mo126QU(C0170.m814(f816short, 997, 8, 3250));
                                    String strM653a2 = c0127lK.m667pt(C0183.m866(f816short, 1005, 12, 689)).m653a();
                                    String strMo126QU2 = c0127lK.m667pt(C0183.m866(f816short, 1017, 15, 2060)).mo126QU(C0172.m820(f816short, 1032, 4, 3033));
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put(C0182.m861(f816short, 1036, 6, 2023), strMo126QU2);
                                    jSONObject4.put(C0175.m834(f816short, 1042, 8, 1204), strM653a);
                                    jSONObject4.put(C0177.m841(f816short, 1050, 7, 2231), strMo126QU);
                                    jSONObject4.put(C0176.m836(f816short, 1057, 11, 2962), strM653a2);
                                    jSONArray.put(jSONObject4);
                                    int i6 = i + 1;
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
                                    i = i6;
                                    break;
                                case 239:
                                    i5 = i < size ? 48860 : 48829;
                            }
                            jSONObject.put(C0174.m828(f816short, 1068, 4, 1157), jSONArray);
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
                        }
                        return jSONObject.toString();
                    }
                }
            }
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    public void init(Context context, String str) {
        int i;
        super.init(context, str);
        this.f39q = C0152vp.m724Mo(str);
        try {
            this.f40u = new JSONObject("{\"0\":[{\"key\":\"s\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"all\"},{\"n\":\"动作\",\"v\":\"dongzuo\"},{\"n\":\"爱情\",\"v\":\"aiqing\"},{\"n\":\"喜剧\",\"v\":\"xiju\"},{\"n\":\"科幻\",\"v\":\"kehuan\"},{\"n\":\"恐怖\",\"v\":\"kongbu\"},{\"n\":\"战争\",\"v\":\"zhanzheng\"},{\"n\":\"武侠\",\"v\":\"wuxia\"},{\"n\":\"魔幻\",\"v\":\"mohuan\"},{\"n\":\"剧情\",\"v\":\"juqing\"},{\"n\":\"动画\",\"v\":\"donghua\"},{\"n\":\"惊悚\",\"v\":\"jingsong\"},{\"n\":\"3D\",\"v\":\"3D\"},{\"n\":\"灾难\",\"v\":\"zainan\"},{\"n\":\"悬疑\",\"v\":\"xuanyi\"},{\"n\":\"警匪\",\"v\":\"jingfei\"},{\"n\":\"文艺\",\"v\":\"wenyi\"},{\"n\":\"青春\",\"v\":\"qingchun\"},{\"n\":\"冒险\",\"v\":\"maoxian\"},{\"n\":\"犯罪\",\"v\":\"fanzui\"},{\"n\":\"纪录\",\"v\":\"jilu\"},{\"n\":\"古装\",\"v\":\"guzhuang\"},{\"n\":\"奇幻\",\"v\":\"qihuan\"},{\"n\":\"国语\",\"v\":\"guoyu\"},{\"n\":\"综艺\",\"v\":\"zongyi\"},{\"n\":\"历史\",\"v\":\"lishi\"},{\"n\":\"运动\",\"v\":\"yundong\"},{\"n\":\"原创压制\",\"v\":\"yuanchuang\"},{\"n\":\"美剧\",\"v\":\"meiju\"},{\"n\":\"韩剧\",\"v\":\"hanju\"},{\"n\":\"国产电视剧\",\"v\":\"guoju\"},{\"n\":\"日剧\",\"v\":\"riju\"},{\"n\":\"英剧\",\"v\":\"yingju\"},{\"n\":\"德剧\",\"v\":\"deju\"},{\"n\":\"俄剧\",\"v\":\"eju\"},{\"n\":\"巴剧\",\"v\":\"baju\"},{\"n\":\"加剧\",\"v\":\"jiaju\"},{\"n\":\"西剧\",\"v\":\"anish\"},{\"n\":\"意大利剧\",\"v\":\"yidaliju\"},{\"n\":\"泰剧\",\"v\":\"taiju\"},{\"n\":\"港台剧\",\"v\":\"gangtaiju\"},{\"n\":\"法剧\",\"v\":\"faju\"},{\"n\":\"澳剧\",\"v\":\"aoju\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"不限\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"澳大利亚\",\"v\":\"澳大利亚\"},{\"n\":\"比利时\",\"v\":\"比利时\"},{\"n\":\"瑞典\",\"v\":\"瑞典\"},{\"n\":\"荷兰\",\"v\":\"荷兰\"},{\"n\":\"丹麦\",\"v\":\"丹麦\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"俄罗斯\",\"v\":\"俄罗斯\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]},{\"key\":\"order\",\"name\":\"排序\",\"value\":[{\"n\":\"更新时间\",\"v\":\"0\"},{\"n\":\"豆瓣评分\",\"v\":\"1\"}]}],\"1\":[{\"key\":\"s\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"all\"},{\"n\":\"动作\",\"v\":\"dongzuo\"},{\"n\":\"爱情\",\"v\":\"aiqing\"},{\"n\":\"喜剧\",\"v\":\"xiju\"},{\"n\":\"科幻\",\"v\":\"kehuan\"},{\"n\":\"恐怖\",\"v\":\"kongbu\"},{\"n\":\"战争\",\"v\":\"zhanzheng\"},{\"n\":\"武侠\",\"v\":\"wuxia\"},{\"n\":\"魔幻\",\"v\":\"mohuan\"},{\"n\":\"剧情\",\"v\":\"juqing\"},{\"n\":\"动画\",\"v\":\"donghua\"},{\"n\":\"惊悚\",\"v\":\"jingsong\"},{\"n\":\"3D\",\"v\":\"3D\"},{\"n\":\"灾难\",\"v\":\"zainan\"},{\"n\":\"悬疑\",\"v\":\"xuanyi\"},{\"n\":\"警匪\",\"v\":\"jingfei\"},{\"n\":\"文艺\",\"v\":\"wenyi\"},{\"n\":\"青春\",\"v\":\"qingchun\"},{\"n\":\"冒险\",\"v\":\"maoxian\"},{\"n\":\"犯罪\",\"v\":\"fanzui\"},{\"n\":\"纪录\",\"v\":\"jilu\"},{\"n\":\"古装\",\"v\":\"guzhuang\"},{\"n\":\"奇幻\",\"v\":\"qihuan\"},{\"n\":\"国语\",\"v\":\"guoyu\"},{\"n\":\"综艺\",\"v\":\"zongyi\"},{\"n\":\"历史\",\"v\":\"lishi\"},{\"n\":\"运动\",\"v\":\"yundong\"},{\"n\":\"原创压制\",\"v\":\"yuanchuang\"},{\"n\":\"美剧\",\"v\":\"meiju\"},{\"n\":\"韩剧\",\"v\":\"hanju\"},{\"n\":\"国产电视剧\",\"v\":\"guoju\"},{\"n\":\"日剧\",\"v\":\"riju\"},{\"n\":\"英剧\",\"v\":\"yingju\"},{\"n\":\"德剧\",\"v\":\"deju\"},{\"n\":\"俄剧\",\"v\":\"eju\"},{\"n\":\"巴剧\",\"v\":\"baju\"},{\"n\":\"加剧\",\"v\":\"jiaju\"},{\"n\":\"西剧\",\"v\":\"anish\"},{\"n\":\"意大利剧\",\"v\":\"yidaliju\"},{\"n\":\"泰剧\",\"v\":\"taiju\"},{\"n\":\"港台剧\",\"v\":\"gangtaiju\"},{\"n\":\"法剧\",\"v\":\"faju\"},{\"n\":\"澳剧\",\"v\":\"aoju\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"不限\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"澳大利亚\",\"v\":\"澳大利亚\"},{\"n\":\"比利时\",\"v\":\"比利时\"},{\"n\":\"瑞典\",\"v\":\"瑞典\"},{\"n\":\"荷兰\",\"v\":\"荷兰\"},{\"n\":\"丹麦\",\"v\":\"丹麦\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"俄罗斯\",\"v\":\"俄罗斯\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]},{\"key\":\"order\",\"name\":\"排序\",\"value\":[{\"n\":\"更新时间\",\"v\":\"0\"},{\"n\":\"豆瓣评分\",\"v\":\"1\"}]}],\"a\":[{\"key\":\"s\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"all\"},{\"n\":\"动作\",\"v\":\"dongzuo\"},{\"n\":\"爱情\",\"v\":\"aiqing\"},{\"n\":\"喜剧\",\"v\":\"xiju\"},{\"n\":\"科幻\",\"v\":\"kehuan\"},{\"n\":\"恐怖\",\"v\":\"kongbu\"},{\"n\":\"战争\",\"v\":\"zhanzheng\"},{\"n\":\"武侠\",\"v\":\"wuxia\"},{\"n\":\"魔幻\",\"v\":\"mohuan\"},{\"n\":\"剧情\",\"v\":\"juqing\"},{\"n\":\"动画\",\"v\":\"donghua\"},{\"n\":\"惊悚\",\"v\":\"jingsong\"},{\"n\":\"3D\",\"v\":\"3D\"},{\"n\":\"灾难\",\"v\":\"zainan\"},{\"n\":\"悬疑\",\"v\":\"xuanyi\"},{\"n\":\"警匪\",\"v\":\"jingfei\"},{\"n\":\"文艺\",\"v\":\"wenyi\"},{\"n\":\"青春\",\"v\":\"qingchun\"},{\"n\":\"冒险\",\"v\":\"maoxian\"},{\"n\":\"犯罪\",\"v\":\"fanzui\"},{\"n\":\"纪录\",\"v\":\"jilu\"},{\"n\":\"古装\",\"v\":\"guzhuang\"},{\"n\":\"奇幻\",\"v\":\"qihuan\"},{\"n\":\"国语\",\"v\":\"guoyu\"},{\"n\":\"综艺\",\"v\":\"zongyi\"},{\"n\":\"历史\",\"v\":\"lishi\"},{\"n\":\"运动\",\"v\":\"yundong\"},{\"n\":\"原创压制\",\"v\":\"yuanchuang\"},{\"n\":\"美剧\",\"v\":\"meiju\"},{\"n\":\"韩剧\",\"v\":\"hanju\"},{\"n\":\"国产电视剧\",\"v\":\"guoju\"},{\"n\":\"日剧\",\"v\":\"riju\"},{\"n\":\"英剧\",\"v\":\"yingju\"},{\"n\":\"德剧\",\"v\":\"deju\"},{\"n\":\"俄剧\",\"v\":\"eju\"},{\"n\":\"巴剧\",\"v\":\"baju\"},{\"n\":\"加剧\",\"v\":\"jiaju\"},{\"n\":\"西剧\",\"v\":\"anish\"},{\"n\":\"意大利剧\",\"v\":\"yidaliju\"},{\"n\":\"泰剧\",\"v\":\"taiju\"},{\"n\":\"港台剧\",\"v\":\"gangtaiju\"},{\"n\":\"法剧\",\"v\":\"faju\"},{\"n\":\"澳剧\",\"v\":\"aoju\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"不限\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"澳大利亚\",\"v\":\"澳大利亚\"},{\"n\":\"比利时\",\"v\":\"比利时\"},{\"n\":\"瑞典\",\"v\":\"瑞典\"},{\"n\":\"荷兰\",\"v\":\"荷兰\"},{\"n\":\"丹麦\",\"v\":\"丹麦\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"俄罗斯\",\"v\":\"俄罗斯\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]},{\"key\":\"order\",\"name\":\"排序\",\"value\":[{\"n\":\"更新时间\",\"v\":\"0\"},{\"n\":\"豆瓣评分\",\"v\":\"1\"}]}]}");
            i = 1616;
        } catch (JSONException e) {
            SpiderDebug.log(e);
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
                        System.out.println(Double.parseDouble(C0172.m823("5qbYuaxUWmi")));
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:102:0x03c1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x028d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:88:0x037c. Please report as an issue. */
    public String playerContent(String str, String str2, List<String> list) throws JSONException, IOException {
        String strSubstring;
        String strJoin;
        String strM798 = C0165.m798(f816short, 1072, 1, 2032);
        String strM809 = C0169.m809(f816short, 1073, 6, 2103);
        String strM8092 = C0169.m809(f816short, 1079, 4, 954);
        String strM834 = C0175.m834(f816short, 1083, 4, 2170);
        String strM856 = C0181.m856(f816short, 1087, 1, 705);
        String strM8342 = C0175.m834(f816short, 1088, 9, 1353);
        try {
            String str3 = this.f39q + str2;
            C0116dX c0116dXM654b = C0093Tt.m440q(C0106ZJ.m484FN(str3, m25UJ(str3, this.f37QU))).m654b(C0179.m849(f816short, 1097, 6, 2315));
            JSONObject jSONObject = new JSONObject();
            int i = 0;
            while (true) {
                int size = c0116dXM654b.size();
                int i2 = 1616;
                while (true) {
                    i2 ^= 1633;
                    switch (i2) {
                        case 14:
                        case 49:
                            i2 = i < size ? 1709 : 1678;
                        case 204:
                            String string = c0116dXM654b.get(i).toString();
                            boolean zContains = string.contains(strM8342);
                            int i3 = 1740;
                            while (true) {
                                i3 ^= 1757;
                                switch (i3) {
                                    case 17:
                                        i3 = zContains ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        i++;
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
                                    case 500:
                                        String strSubstring2 = string.substring(string.indexOf(strM8342), string.lastIndexOf(C0169.m809(f816short, 1103, 8, 641)) + 1);
                                        strSubstring = strSubstring2.substring(strSubstring2.indexOf(C0174.m828(f816short, 1111, 1, 2152)) + 2, strSubstring2.lastIndexOf(C0176.m836(f816short, 1112, 1, 2739)));
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
                            break;
                        case 239:
                            strSubstring = "";
                            break;
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str4 = this.f39q + C0165.m798(f816short, 1113, 9, 2489) + jCurrentTimeMillis + C0166.m801(f816short, 1122, 4, 1961) + m28xC(strSubstring + strM856 + jCurrentTimeMillis, C0118ga.m604q(strSubstring + strM856 + jCurrentTimeMillis, C0118ga.f677xC).substring(0, 16)) + C0177.m841(f816short, 1126, 5, 2688) + strSubstring;
            JSONObject jSONObjectOptJSONObject = new JSONObject(C0106ZJ.m484FN(str4, m25UJ(str4, ""))).optJSONObject(C0174.m828(f816short, 1131, 4, 2486));
            ArrayList arrayList = new ArrayList();
            boolean zIsNull = jSONObjectOptJSONObject.isNull(strM834);
            String strM851 = C0180.m851(f816short, 1135, 6, 574);
            String strM8343 = C0175.m834(f816short, 1141, 3, 1204);
            String strM866 = C0183.m866(f816short, 1144, 7, 853);
            String strM801 = C0166.m801(f816short, 1151, 5, 1743);
            int i6 = 48891;
            while (true) {
                i6 ^= 48908;
                switch (i6) {
                    case 22:
                    case 53:
                        boolean zIsNull2 = jSONObjectOptJSONObject.isNull(strM8092);
                        String strM828 = C0174.m828(f816short, 1156, 14, 1684);
                        String strM849 = C0179.m849(f816short, 1170, 11, 2201);
                        int i7 = 49666;
                        while (true) {
                            i7 ^= 49683;
                            switch (i7) {
                                case 17:
                                    i7 = !zIsNull2 ? 49759 : 49728;
                                case 50:
                                case 76:
                                    arrayList.add(jSONObjectOptJSONObject.optString(strM8092).replace(strM849, strM828));
                                    break;
                                case 83:
                                    break;
                            }
                        }
                        boolean zIsNull3 = jSONObjectOptJSONObject.isNull(strM809);
                        int i8 = 49790;
                        while (true) {
                            i8 ^= 49807;
                            switch (i8) {
                                case 18:
                                case 51:
                                    break;
                                case 84:
                                    String[] strArrSplit = jSONObjectOptJSONObject.optString(strM809).split(C0177.m841(f816short, 1181, 1, 2374));
                                    int i9 = 0;
                                    while (true) {
                                        int length = strArrSplit.length;
                                        int i10 = 49914;
                                        while (true) {
                                            i10 ^= 49931;
                                            switch (i10) {
                                                case 497:
                                                    i10 = i9 < length ? 50658 : 50627;
                                                case 1711:
                                                case 1736:
                                                    break;
                                                case 1769:
                                                    arrayList.add(strArrSplit[i9].replace(strM849, strM828));
                                                    i9++;
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
                                            }
                                            break;
                                        }
                                    }
                                    break;
                                case 241:
                                    i8 = !zIsNull3 ? 49883 : 49852;
                            }
                        }
                        String str5 = (String) arrayList.get(new Random().nextInt(arrayList.size()));
                        boolean zContains2 = str5.contains(C0175.m834(f816short, 1182, 3, 869));
                        int i12 = 50813;
                        while (true) {
                            i12 ^= 50830;
                            switch (i12) {
                                case 18:
                                    break;
                                case 53:
                                    HashMap map = new HashMap();
                                    C0106ZJ.m485KT(str5, m25UJ(str5, ""), map);
                                    String strM495u = C0106ZJ.m495u(map);
                                    AbstractC0099V3.p pVar = new AbstractC0099V3.p(this) { // from class: com.github.catvod.spider.Bdys01.1

                                        /* renamed from: xC */
                                        final Bdys01 f42xC;

                                        {
                                            this.f42xC = this;
                                            int iM840 = C0177.m840();
                                            int i13 = 1616;
                                            while (true) {
                                                i13 ^= 1633;
                                                switch (i13) {
                                                    case 14:
                                                    case 49:
                                                        i13 = iM840 >= 0 ? 1709 : 1678;
                                                    case 204:
                                                        System.out.println(Integer.valueOf(C0183.m863("rnr4x0")));
                                                        break;
                                                    case 239:
                                                        break;
                                                }
                                                return;
                                            }
                                        }

                                        @Override // com.github.catvod.spider.merge.AbstractC0099V3
                                        protected void onFailure(Call call, Exception exc) {
                                            int iM853 = C0180.m853();
                                            int i13 = 1616;
                                            while (true) {
                                                i13 ^= 1633;
                                                switch (i13) {
                                                    case 14:
                                                    case 49:
                                                        i13 = iM853 <= 0 ? 1709 : 1678;
                                                    case 204:
                                                        System.out.println(Integer.parseInt(C0174.m831("7IcHCIak")));
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
                                    C0106ZJ.m490UJ(C0106ZJ.m488QU(), strM495u, null, m27u(strM495u), pVar);
                                    int iCode = pVar.getResult().code();
                                    String strM8012 = C0166.m801(f816short, 1185, 20, 1650);
                                    int i13 = 51588;
                                    while (true) {
                                        i13 ^= 51605;
                                        switch (i13) {
                                            case 17:
                                                i13 = iCode == 200 ? 51681 : 51650;
                                            case 54:
                                            case 87:
                                                strJoin = "";
                                                break;
                                            case 116:
                                                InputStream inputStreamByteStream = pVar.getResult().body().byteStream();
                                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                byte[] bArr = new byte[4];
                                                while (true) {
                                                    int i14 = inputStreamByteStream.read(bArr, 0, 4);
                                                    int i15 = 51712;
                                                    while (true) {
                                                        i15 ^= 51729;
                                                        switch (i15) {
                                                            case 14:
                                                            case 17:
                                                                i15 = i14 != -1 ? 51805 : 51774;
                                                            case 47:
                                                                break;
                                                            case 76:
                                                                byteArrayOutputStream.write(bArr, 0, i14);
                                                                int i16 = 51836;
                                                                while (true) {
                                                                    i16 ^= 51853;
                                                                    switch (i16) {
                                                                        case 241:
                                                                            i16 = 52518;
                                                                            break;
                                                                        case 1963:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                        byteArrayOutputStream.flush();
                                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                        inputStreamByteStream.close();
                                                        String[] strArrSplit2 = C0117f4.m598q(Arrays.copyOfRange(byteArray, 3354, byteArray.length)).split(strM798);
                                                        int i17 = 0;
                                                        while (true) {
                                                            int length2 = strArrSplit2.length;
                                                            int i18 = 52611;
                                                            while (true) {
                                                                i18 ^= 52628;
                                                                switch (i18) {
                                                                    case 23:
                                                                        i18 = i17 < length2 ? 52704 : 52673;
                                                                    case 54:
                                                                    case 85:
                                                                        break;
                                                                    case 116:
                                                                        String str6 = strArrSplit2[i17];
                                                                        boolean zContains3 = str6.contains(C0178.m845(f816short, 1205, 3, 2181));
                                                                        int i19 = 52735;
                                                                        while (true) {
                                                                            i19 ^= 52752;
                                                                            switch (i19) {
                                                                                case 14:
                                                                                case 45:
                                                                                    break;
                                                                                case 1007:
                                                                                    i19 = zContains3 ? 53479 : 52797;
                                                                                case 7927:
                                                                                    strArrSplit2[i17] = strM8012 + str6;
                                                                                    break;
                                                                            }
                                                                        }
                                                                        int i20 = i17 + 1;
                                                                        int i21 = 53510;
                                                                        while (true) {
                                                                            i21 ^= 53527;
                                                                            switch (i21) {
                                                                                case 17:
                                                                                    i21 = 53541;
                                                                                    break;
                                                                                case 50:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        i17 = i20;
                                                                        break;
                                                                }
                                                                strJoin = TextUtils.join(strM798, strArrSplit2);
                                                                int i22 = 53634;
                                                                while (true) {
                                                                    i22 ^= 53651;
                                                                    switch (i22) {
                                                                        case 17:
                                                                            i22 = 53665;
                                                                            continue;
                                                                        case 50:
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    jSONObject.put(strM8343, C0165.m798(f816short, 1208, 42, 1396) + Base64.encodeToString(strJoin.getBytes(), 2));
                                    jSONObject.put(strM801, 0);
                                    jSONObject.put(strM866, "");
                                    jSONObject.put(strM851, new JSONObject(m27u(strM8012)).toString());
                                    break;
                                case 243:
                                    if (!zContains2) {
                                        break;
                                    } else {
                                        i12 = 51557;
                                    }
                                case 4075:
                                    jSONObject.put(strM801, 0);
                                    jSONObject.put(strM866, "");
                                    jSONObject.put(strM8343, str5);
                                    jSONObject.put(strM851, "");
                                    break;
                                default:
                                    continue;
                            }
                            i12 = 50875;
                        }
                        break;
                    case 503:
                        i6 = !zIsNull ? 49635 : 48953;
                    case 32495:
                        String strOptString = jSONObjectOptJSONObject.optString(strM834);
                        jSONObject.put(strM801, 0);
                        jSONObject.put(strM866, "");
                        jSONObject.put(strM8343, strOptString);
                        jSONObject.put(strM851, "");
                        break;
                }
                return jSONObject.toString();
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000b. Please report as an issue. */
    /* renamed from: q */
    protected String m26q(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
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
                        String hexString = Integer.toHexString(bArr[i] & 255);
                        int length2 = hexString.length();
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = length2 == 1 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    break;
                                case 500:
                                    hexString = '0' + hexString;
                                    break;
                            }
                        }
                        sb.append(hexString);
                        i++;
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
                    case 239:
                        break;
                }
                return sb.toString();
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0085. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x0117. Please report as an issue. */
    public String searchContent(String str, boolean z) throws JSONException {
        String strM828 = C0174.m828(f816short, 1250, 14, 3169);
        try {
            String str2 = C0169.m809(f816short, 1264, 29, 1615) + str + C0175.m834(f816short, 1293, 20, 2971);
            C0082OO c0082ooM440q = C0093Tt.m440q(C0106ZJ.m484FN(str2, m25UJ(str2, C0170.m814(f816short, 1313, 6, 3060))));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            C0116dX c0116dXM654b = c0082ooM440q.m654b(C0174.m828(f816short, 1319, 15, 811));
            int size = c0116dXM654b.size();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = size > 0 ? 1709 : 1678;
                    case 204:
                        int i2 = 0;
                        while (true) {
                            int size2 = c0116dXM654b.size();
                            int i3 = 1740;
                            while (true) {
                                i3 ^= 1757;
                                switch (i3) {
                                    case 17:
                                        i3 = i2 < size2 ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case 500:
                                        C0127lK c0127lK = c0116dXM654b.get(i2);
                                        String strM596u = c0127lK.m654b(C0175.m834(f816short, 1334, 2, 2944)).m596u();
                                        String strM595q = c0127lK.m654b(C0177.m841(f816short, 1336, 4, 988)).m595q(C0175.m834(f816short, 1340, 4, 1242));
                                        boolean zIsEmpty = strM596u.isEmpty();
                                        int i4 = 1864;
                                        while (true) {
                                            i4 ^= 1881;
                                            switch (i4) {
                                                case 17:
                                                    i4 = !zIsEmpty ? 48736 : 48705;
                                                case 47384:
                                                    break;
                                                case 47417:
                                                    boolean zContains = strM596u.contains(str);
                                                    int i5 = 48767;
                                                    while (true) {
                                                        i5 ^= 48784;
                                                        switch (i5) {
                                                            case 14:
                                                            case 45:
                                                                break;
                                                            case 76:
                                                                boolean zContains2 = strM595q.contains(strM828);
                                                                int i6 = 48891;
                                                                while (true) {
                                                                    i6 ^= 48908;
                                                                    switch (i6) {
                                                                        case 22:
                                                                        case 53:
                                                                            boolean zContains3 = strM596u.contains(str);
                                                                            int i7 = 49790;
                                                                            while (true) {
                                                                                i7 ^= 49807;
                                                                                switch (i7) {
                                                                                    case 18:
                                                                                    case 51:
                                                                                        break;
                                                                                    case 84:
                                                                                        boolean zContains4 = strM595q.contains(strM828);
                                                                                        int i8 = 49914;
                                                                                        while (true) {
                                                                                            i8 ^= 49931;
                                                                                            switch (i8) {
                                                                                                case 497:
                                                                                                    i8 = zContains4 ? 50658 : 50627;
                                                                                                case 1711:
                                                                                                case 1736:
                                                                                                    break;
                                                                                                case 1769:
                                                                                                    Matcher matcher = this.f38UJ.matcher(strM595q);
                                                                                                    boolean zFind = matcher.find();
                                                                                                    int i9 = 50689;
                                                                                                    while (true) {
                                                                                                        i9 ^= 50706;
                                                                                                        switch (i9) {
                                                                                                            case 19:
                                                                                                                i9 = zFind ? 50782 : 50751;
                                                                                                            case 45:
                                                                                                                break;
                                                                                                            case 50:
                                                                                                            case 76:
                                                                                                                boolean zContains5 = strM595q.contains(C0179.m849(f816short, 1344, 6, 758));
                                                                                                                int i10 = 50813;
                                                                                                                while (true) {
                                                                                                                    i10 ^= 50830;
                                                                                                                    switch (i10) {
                                                                                                                        case 18:
                                                                                                                        case 53:
                                                                                                                            break;
                                                                                                                        case 243:
                                                                                                                            i10 = !zContains5 ? 51557 : 50875;
                                                                                                                        case 4075:
                                                                                                                            C0082OO c0082ooM440q2 = C0093Tt.m440q(C0106ZJ.m484FN(strM595q, m25UJ(strM595q, "")));
                                                                                                                            JSONObject jSONObject2 = new JSONObject();
                                                                                                                            String strGroup = matcher.group(1);
                                                                                                                            String strM653a = c0082ooM440q2.m667pt(C0180.m851(f816short, 1350, 13, 2152)).m653a();
                                                                                                                            String strM595q2 = c0082ooM440q2.m654b(C0181.m856(f816short, 1363, 19, 3252)).m595q(C0176.m836(f816short, 1382, 3, 837));
                                                                                                                            jSONObject2.put(C0178.m845(f816short, 1385, 8, 1644), strM653a);
                                                                                                                            jSONObject2.put(C0181.m856(f816short, 1394, 11, 1588), C0171.m816(f816short, 1393, 1, 656));
                                                                                                                            jSONObject2.put(C0175.m834(f816short, 1405, 6, 817), strGroup.replace(this.f39q, "") + C0175.m834(f816short, 1411, 4, 388));
                                                                                                                            jSONObject2.put(C0170.m814(f816short, 1415, 7, 1013), strM595q2);
                                                                                                                            jSONArray.put(jSONObject2);
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
                                                                                        i7 = zContains3 ? 49883 : 49852;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 503:
                                                                            i6 = !zContains2 ? 49635 : 48953;
                                                                        case 32495:
                                                                            int i11 = 49666;
                                                                            while (true) {
                                                                                i11 ^= 49683;
                                                                                switch (i11) {
                                                                                    case 17:
                                                                                        i11 = 49697;
                                                                                    case 50:
                                                                                        break;
                                                                                }
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 239:
                                                                i5 = zContains ? 48860 : 48829;
                                                        }
                                                    }
                                                    break;
                                                case 47483:
                                            }
                                        }
                                        i2++;
                                        int i12 = 51588;
                                        while (true) {
                                            i12 ^= 51605;
                                            switch (i12) {
                                                case 17:
                                                    i12 = 51619;
                                                    break;
                                                case 54:
                                                    break;
                                            }
                                        }
                                        break;
                                }
                                jSONObject.put(C0169.m809(f816short, 1422, 4, 2256), jSONArray);
                                return jSONObject.toString();
                            }
                        }
                        break;
                    case 239:
                        break;
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    /* renamed from: u */
    protected HashMap<String, String> m27u(String str) {
        String str2 = "ۧۥۡ";
        HashMap<String, String> map = null;
        String[] strArrSplit = null;
        String strM798 = null;
        String strM834 = null;
        short[] sArr = null;
        while (true) {
            switch (C0174.m829(str2)) {
                case 56355:
                    map.put(strM834, str);
                    str2 = "ۡۦۤ";
                    break;
                case 56445:
                    str2 = "ۨ۠ۥ";
                    sArr = f816short;
                    break;
                case 56569:
                    str = C0174.m828(sArr, 1434, 1, 2841);
                    str2 = "ۢۡۢ";
                    break;
                case 1746907:
                    str = C0177.m841(sArr, 1610, 59, 2871);
                    str2 = "ۣۧۡ";
                    break;
                case 1747685:
                    str2 = "ۨۧۢ";
                    strM798 = C0165.m798(sArr, 1426, 8, 676);
                    break;
                case 1747834:
                    str = C0170.m814(sArr, 1575, 6, 1697);
                    str2 = "ۤۡ";
                    break;
                case 1747838:
                    str2 = "۠ۧۧ";
                    sArr = f816short;
                    break;
                case 1747904:
                    str2 = "ۣۤۧ";
                    strM834 = C0179.m849(sArr, 1435, 10, 2955);
                    break;
                case 1748610:
                    str2 = "ۥۥ۠";
                    strM798 = C0183.m866(sArr, 1595, 15, 2547);
                    break;
                case 1748831:
                    str2 = "ۣۨ۟";
                    sArr = f816short;
                    break;
                case 1748861:
                    str = C0177.m841(sArr, 1445, 121, 1894);
                    str2 = "ۡۤ";
                    break;
                case 1749574:
                    str2 = "۠۠ۥ";
                    sArr = f816short;
                    break;
                case 1749635:
                    str2 = "ۤ۟ۤ";
                    strArrSplit = strM834.split(str);
                    break;
                case 1749729:
                    map.put(str, strM834);
                    str2 = "ۦۡۡ";
                    break;
                case 1749734:
                    return map;
                case 1750781:
                    map.put(strM798, str);
                    str2 = "ۢۤۨ";
                    break;
                case 1751497:
                    str2 = "۠ۥۣ";
                    strM798 = strArrSplit[0];
                    break;
                case 1751624:
                    str2 = "ۣۡۧ";
                    sArr = f816short;
                    break;
                case 1752454:
                    str2 = "۠ۥ۟";
                    sArr = f816short;
                    break;
                case 1752640:
                    str2 = "۟ۦۢ";
                    sArr = f816short;
                    break;
                case 1752677:
                    str2 = "ۨۡ";
                    sArr = f816short;
                    break;
                case 1753478:
                    str2 = "ۡ۟۠";
                    sArr = f816short;
                    break;
                case 1753701:
                    map.put(strM834, strM798);
                    str2 = "ۥ۟۠";
                    break;
                case 1754563:
                    map = new HashMap<>();
                    str2 = "ۣۢ۟";
                    break;
                case 1755373:
                    str2 = "ۣۢۤ";
                    strM834 = C0181.m856(sArr, 1581, 14, 663);
                    break;
                case 1755587:
                    str2 = "ۥۦۦ";
                    strM834 = str.replace(strM798, "");
                    break;
                default:
                    str2 = "ۦۨۧ";
                    strM834 = C0175.m834(sArr, 1566, 9, 1187);
                    break;
            }
        }
    }

    /* renamed from: xC */
    protected String m28xC(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            Cipher cipher = Cipher.getInstance(C0165.m798(f816short, 1669, 20, 1831));
            cipher.init(1, new SecretKeySpec(str2.getBytes(), C0170.m814(f816short, 1689, 3, 2276)));
            return m26q(cipher.doFinal(str.getBytes())).toUpperCase();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }
}
