package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.g;
import com.github.catvod.spider.merge.C0948d;
import com.github.catvod.spider.merge.C1024e;
import com.github.catvod.spider.merge.C1080f;
import com.github.catvod.spider.merge.C1200g;
import com.github.catvod.spider.merge.C1228h;
import com.github.catvod.spider.merge.C1370pv;
import com.github.catvod.spider.merge.Iw;
import com.github.catvod.spider.merge.YS;
import com.github.catvod.spider.merge.Yy;
import com.github.catvod.spider.merge.ZP;
import com.github.catvod.spider.merge.g9;
import com.github.catvod.spider.merge.jk;
import com.github.catvod.spider.merge.lE;
import com.github.catvod.spider.merge.xx;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URLEncoder;
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
import javax.crypto.spec.SecretKeySpec;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Bdys01 extends Spider {

    private static final short[] f24short = {2410, 2334, 2321, 2409, 2411, 2412, 2346, 2358, 2351, 2531, 2501, 2515, 2500, 2459, 2551, 2513, 2515, 2520, 2498, 1917, 1887, 1866, 1881, 1884, 1884, 1873, 1823, 1797, 1822, 1792, 1808, 1816, 1917, 1873, 1875, 1881, 1886, 1860, 1887, 1859, 1880, 1803, 1808, 1913, 1886, 1860, 1877, 1884, 1808, 1917, 1873, 1875, 1808, 1919, 1891, 1808, 1896, 1808, 1793, 1792, 1903, 1793, 1797, 1903, 1799, 1817, 1808, 1905, 1856, 1856, 1884, 1877, 1895, 1877, 1874, 1915, 1881, 1860, 1823, 1797, 1795, 1799, 1822, 1795, 1798, 1808, 1816, 1915, 1912, 1892, 1917, 1916, 1820, 1808, 1884, 1881, 1883, 1877, 1808, 1911, 1877, 1875, 1883, 1887, 1817, 1808, 1907, 1880, 1858, 1887, 1885, 1877, 1823, 1801, 1793, 1822, 1792, 1822, 1796, 1796, 1799, 1794, 1822, 1793, 1793, 1796, 1808, 1891, 1873, 1878, 1873, 1858, 1881, 1823, 1797, 1795, 1799, 1822, 1795, 1798, 967, 975, 975, 967, 972, 965, 1505, 1493, 1492, 1480, 1487, 1490, 1481, 1492, 1497, 1241, 1241, 1241, 1152, 1238, 1218, 1239, 1245, 1182, 1183, 1152, 1229, 1217, 1219, 1043, 1060, 1063, 1060, 1075, 1060, 1075, 283, 311, 311, 307, 305, 317, 654, 684, 684, 682, 703, 699, 738, 643, 686, 673, 680, 698, 686, 680, 682, 1474, 1488, 1429, 1531, 1526, 1428, 1474, 1488, 1411, 1481, 1413, 1416, 1430, 1408, 1428, 1474, 1488, 1429, 1516, 1519, 1411, 1481, 1413, 1416, 1430, 1423, 1428, 1474, 1488, 1429, 1520, 1523, 1411, 1481, 1413, 1416, 1430, 1421, 1428, 1501, 1494, 1429, 1517, 1515, 1411, 1481, 1413, 1416, 1430, 1419, 1428, 1501, 1494, 1411, 1481, 1413, 1416, 1430, 1418, 1123, 1127, 1137, 1037, 1127, 1121, 1120, 1037, 1138, 1129, 1121, 1137, 1045, 1138, 1091, 1094, 1094, 1099, 1100, 1093, 1807, 1803, 1821, 436, 481, 481, 481, 481, 481, 3019, 3037, 3020, 2965, 3035, 3031, 3031, 3027, 3025, 3037, 412, 425, 422, 431, 411, 425, 422, 2074, 542, 522, 535, 513, 512, 535, 536, 2769, 2777, 2775, 1747, 1679, 1747, 1060, 1085, 1135, 1122, 1131, 1150, 1062, 708, 2556, 2548, 2554, 2472, 2706, 2699, 2764, 2783, 2760, 2764, 2704, 2774, 2764, 2783, 2760, 2764, 2768, 2699, 2772, 2760, 2764, 2783, 2704, 2774, 2772, 2760, 2764, 2783, 2768, 2699, 2754, 2783, 2761, 2760, 2783, 2704, 2774, 2754, 2783, 2761, 2760, 2783, 2768, 3216, 3287, 3268, 3283, 3287, 3211, 3277, 3287, 3268, 3283, 3287, 3275, 3216, 3279, 3283, 3287, 3268, 3211, 3277, 3279, 3283, 3287, 3268, 3275, 3216, 3289, 3268, 3282, 3283, 3268, 3211, 3277, 3289, 3268, 3282, 3283, 3268, 3275, 2612, 3048, 701, 688, 688, 1807, 1813, 1798, 1809, 1813, 1801, 1642, 1581, 1598, 1577, 1581, 1649, 1591, 1581, 1598, 1577, 1581, 1585, 434, 432, 428, 424, 443, 436, 2881, 2846, 2818, 2822, 2837, 2906, 2844, 2846, 2818, 2822, 2837, 2842, 3081, 1062, 1067, 1067, 1128, 716, 725, 668, 641, 663, 662, 641, 718, 707, 1651, 1594, 1575, 1585, 1584, 1575, 1640, 1637, 460, 27104, 25160, 26431, 22385, 26089, 26034, -29504, 29637, 31634, 25309, 20903, 3118, 3107, 3132, 3172, 3113, 3109, 3110, 3175, 3110, 3117, 3175, 3186, 1199, 1268, 1257, 1194, 1189, 1258, 1271, 736, 740, 750, 679, 766, 676, 696, 697, 697, 1465, 1464, 1449, 590, 528, 595, 604, 531, 526, 1378, 1325, 1383, 1326, 1377, 1391, 1388, 1376, 1384, 1190, 1212, 1195, 1192, 2753, 2776, 2766, 2776, 2776, 2754, 2756, 2757, 2754, 2767, 1253, 1992, 2001, 2010, 2017, 2007, 2010, 1499, 1474, 1481, 1522, 1475, 1484, 1472, 1480, 2704, 2697, 2690, 2745, 2710, 2703, 2693, 824, 801, 810, 785, 828, 811, 803, 815, 828, 805, 829, 807, 822, 816, 818, 464, 449, 455, 453, 451, 463, 469, 462, 468, 1129, 1132, 1128, 1132, 1137, 746, 753, 746, 767, 754, 706, 711, 733, 730, 2872, 2872, 2872, 31304, 20920, -1751, 884, 889, 870, 830, 883, 895, 892, 829, 893, 884, 829, 881, 869, 868, 895, 816, 889, 893, 887, 877, 876, 893, 2155, 2098, 2093, 2151, 2094, 2157, 2156, 2157, 2150, 2093, 2151, 2094, 2158, 2151, 2094, 2145, 2159, 2156, 2144, 2152, 3300, 3305, 3318, 3246, 3299, 3297, 3314, 3300, 3246, 3299, 3311, 3308, 3308, 3297, 3312, 3315, 3301, 3232, 3262, 3232, 3300, 3305, 3318, 3246, 3299, 3297, 3314, 3300, 3245, 3298, 3311, 3300, 3321, 1711, 1708, 1725, 1714, 1778, 1726, 1725, 1720, 1723, 1721, 1778, 1726, 1723, 1777, 1708, 1705, 1710, 1708, 1712, 1721, 1777, 1712, 1704, 27897, 28605, 28667, -24583, -2793, 745, 2259, 2270, 2241, 2201, 2260, 2264, 2267, 2201, 2266, 2261, 2202, 2181, 1473, 2950, 2945, 2951, 2970, 2971, 2962, 621, 2299, 21923, 20905, 664, 2600, -31743, 31908, -29751, 29548, 1973, 23148, 28292, -374, 17858, 25837, -2845, 659, 650, 641, 698, 652, 641, 1650, 1643, 1632, 1627, 1642, 1637, 1641, 1633, 828, 805, 814, 789, 826, 803, 809, 800, 813, 804, 817, 779, 826, 821, 825, 817, 3047, 3070, 3061, 3022, 3048, 3060, 3056, 3043, 2861, 2868, 2879, 2820, 2874, 2857, 2878, 2874, 1629, 1604, 1615, 1652, 1625, 1614, 1606, 1610, 1625, 1600, 1624, 2087, 2110, 2101, 2062, 2096, 2098, 2085, 2110, 2083, 1117, 1092, 1103, 1140, 1103, 1090, 1113, 1102, 1096, 1119, 1092, 1113, 1591, 1582, 1573, 1566, 1570, 1582, 1583, 1589, 1572, 1583, 1589, 2548, 2491, 2551, 2529, 2555, 2491, 2551, 2529, 2555, 2488, 2534, 2532, 2528, 2548, 2535, 2544, 27728, 28099, 23274, -32619, 3027, 3017, 3038, 3037, 1770, 1779, 1765, 1779, 1779, 1769, 1775, 1774, 1769, 1764, 2396, 447, 2756, 832, 857, 850, 873, 838, 858, 855, 847, 873, 848, 836, 857, 859, 679, 702, 693, 654, 673, 701, 688, 680, 654, 676, 675, 701, 1372, 1369, 1347, 1348, 1949, 1243, 1154, 21960, -27576, 1154, 1178, 1152, 1154, 1217, 1154, 1164, 1154, 29077, 23505, 1154, 1178, 1152, 1154, 1168, 1154, 1164, 1154, 29077, -29338, 22215, 1154, 1178, 1152, 1154, 1169, 1154, 1245, 1978, 1975, 1982, 1963, 1937, 1952, 1967, 1955, 1963, 3193, 3188, 3197, 3176, 3154, 3172, 3177, 2312, 2311, 2314, 2328, 2328, 2347, 2340, 2337, 2361, 2344, 2367, 2366, 1906, 1919, 1888, 1848, 1892, 1913, 1889, 1848, 1892, 1913, 1889, 1851, 1909, 1911, 1892, 1906, 1893, 1588, 1593, 1574, 1662, 1587, 1599, 1596, 1661, 1636, 1662, 1570, 1599, 1575, 1571, 1661, 1597, 1588, 1661, 1639, 3243, 3312, 3309, 3232, 3234, 3249, 3239, 3310, 3255, 3242, 3255, 3247, 3238, 2293, 2289, 2299, 2226, 2283, 2225, 2221, 2220, 2220, 899, 902, 915, 902, 970, 916, 917, 900, 1836, 1906, 1832, 1849, 1828, 1832, 1905, 1841, 1833, 1832, 1849, 1848, 759, 696, 754, 699, 756, 762, 761, 757, 765, 696, 757, 761, 736, 755, 740, 2310, 2332, 2315, 2312, 2664, 2673, 2682, 2625, 2679, 2682, 1625, 1600, 1611, 1648, 1601, 1614, 1602, 1610, 1732, 1757, 1750, 1773, 1730, 1755, 1745, 965, 988, 983, 1004, 961, 982, 990, 978, 961, 984, 960, 2098, 2103, 2093, 2090, 2169, 2149, 2149, 2145, 2146, 2091, 2110, 2110, 1371, 1336, 1310, 1288, 1311, 1344, 1324, 1290, 1288, 1283, 1305, 2316, 2350, 2363, 2344, 2349, 2349, 2336, 2414, 2420, 2415, 2417, 2401, 2409, 2316, 2336, 2338, 2344, 2351, 2357, 2350, 2354, 2345, 2426, 2401, 2312, 2351, 2357, 2340, 2349, 2401, 2316, 2336, 2338, 2401, 2318, 2322, 2401, 2329, 2401, 2416, 2417, 2334, 2416, 2420, 2334, 2422, 2408, 2401, 2304, 2353, 2353, 2349, 2340, 2326, 2340, 2339, 2314, 2344, 2357, 2414, 2420, 2418, 2422, 2415, 2418, 2423, 2401, 2409, 2314, 2313, 2325, 2316, 2317, 2413, 2401, 2349, 2344, 2346, 2340, 2401, 2310, 2340, 2338, 2346, 2350, 2408, 2401, 2306, 2345, 2355, 2350, 2348, 2340, 2414, 2424, 2416, 2415, 2417, 2415, 2421, 2421, 2422, 2419, 2415, 2416, 2416, 2421, 2401, 2322, 2336, 2343, 2336, 2355, 2344, 2414, 2420, 2418, 2422, 2415, 2418, 2423, 966, 1010, 1011, 1007, 1000, 1013, 1006, 1011, 1022, 2529, 2524, 2503, 2505, 2503, 2496, 2557, 2557, 2557, 2468, 2546, 2534, 2547, 2553, 2490, 2491, 2468, 2537, 2533, 2535, 782, 812, 812, 810, 831, 827, 866, 771, 814, 801, 808, 826, 814, 808, 810, 1657, 1643, 1582, 1600, 1613, 1583, 1657, 1643, 1592, 1650, 1598, 1587, 1581, 1595, 1583, 1657, 1643, 1582, 1623, 1620, 1592, 1650, 1598, 1587, 1581, 1588, 1583, 1657, 1643, 1582, 1611, 1608, 1592, 1650, 1598, 1587, 1581, 1590, 1583, 1638, 1645, 1582, 1622, 1616, 1592, 1650, 1598, 1587, 1581, 1584, 1583, 1638, 1645, 1592, 1650, 1598, 1587, 1581, 1585, 754, 440, 486, 416, 493, 394, 487, 1565, 1603, 1541, 1608, 2540, 2539, 2549, 2474, 991, 1032, 1055, 1036, 1118, 1038, 1047, 1050, 1118, 1091, 1280, 1296, 1281, 1306, 1283, 1287, 2453, 2434, 2449, 2499, 2455, 2442, 2446, 2438, 1287, 1301, 2806, 2741, 2736, 2743, 2748, 2730, 2790, 2733, 2788, 2921, 2876, 2856, 2930, 2374, 2320, 2313, 2308, 2397, 531, 534, 515, 534, 1055, 1042, 1046, 1043, 1042, 1029, 454, 449, 479, 905, 917, 920, 896, 940, 907, 917, 1282, 1299, 1280, 1281, 1303, 525, 525, 525, 596, 536, 542, 515, 521, 586, 587, 596, 537, 533, 535, 3091, 3091, 3091, 3146, 3078, 3072, 3073, 3152, 3146, 3079, 3079, 371, 1239, 1226, 1166, 810, 822, 822, 818, 817, 888, 877, 877, 820, 813, 806, 876, 800, 806, 827, 817, 876, 815, 807, 877, 2320, 2378, 2381, 665, 668, 649, 668, 711, 668, 653, 653, 657, 660, 670, 668, 649, 660, 658, 659, 722, 651, 659, 665, 723, 668, 653, 653, 657, 664, 723, 656, 653, 664, 666, 648, 655, 657, 710, 671, 668, 654, 664, 715, 713, 721, 1505, 1505, 1505, 1464, 1518, 1530, 1519, 1509, 1446, 1447, 1464, 1525, 1529, 1531, 822, 810, 810, 814, 813, 868, 881, 881, 829, 816, 880, 828, 823, 816, 825, 880, 829, 817, 819, 881, 813, 827, 831, 812, 829, 822, 865, 815, 867, 861, 773, 799, 770, 787, 844, 769, 769, 769, 856, 782, 794, 783, 773, 838, 839, 856, 789, 793, 795, 1705, 1697, 1697, 1705, 1698, 1707, 2089, 2090, 2149, 2084, 2073, 2100, 2083, 2101, 2099, 2090, 2098, 2101, 2150, 2090, 2095, 1026, 1112, 263, 349, 335, 270, 2767, 2773, 2754, 2753, 494, 433, 429, 416, 440, 494, 1983, 2022, 2041, 1971, 2042, 1978, 1971, 2042, 1973, 1979, 1976, 1972, 1980, 1916, 1905, 1902, 1846, 1915, 1911, 1908, 1845, 1909, 1916, 1845, 1913, 1901, 1900, 1911, 1848, 1905, 1909, 1919, 2270, 2271, 2254, 3149, 3156, 3167, 3172, 3157, 3162, 3158, 3166, 21010, 2780, 2757, 2766, 2805, 2776, 2767, 2759, 2763, 2776, 2753, 2777, 917, 908, 903, 956, 906, 903, 1102, 1032, 1044, 1037, 2463, 2438, 2445, 2486, 2457, 2432, 2442, 2495, 2490, 2464, 2471};
    private JSONObject OL;
    private String l8 = "";
    private String S = "";
    private String T4 = "";
    private Pattern b = Pattern.compile("(\\S+).htm");

    public Bdys01() {
    }

    protected HashMap<String, String> OL(String str, String str2) {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36");
        if (!str2.equals("google")) {
            map.put("Authority", "www.xlys01.com");
            if (str2.length() > 0) {
                map.put("Referer", str2);
            }
            if (this.S.length() > 0) {
                map.put("Cookie", this.S);
            }
        }
        map.put("Accept-Language", "zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2");
        return map;
    }

    protected String S(String str, String str2) {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
            cipher.init(1, new SecretKeySpec(str2.getBytes(), "AES"));
            return l8(cipher.doFinal(str.getBytes())).toUpperCase();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    protected void T4() {
        this.S = "";
        String str = this.l8 + "/zzzzz";
        HashMap map = new HashMap();
        Yy.A(str, OL(str, ""), map);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((String) entry.getKey()).equals("set-cookie")) {
                this.S = "TangSan" + TextUtils.join(";", (Iterable) entry.getValue());
            }
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strReplace;
        String strReplace2;
        String strC = "{order}";
        String strE = "{s}";
        try {
            String str3 = this.l8 + "/s/";
            String strE2 = "?&type=";
            String strD = "a";
            if (map != null && map.size() > 0) {
                if (str.equals(strD)) {
                    strReplace2 = str3 + "{s}/" + str2 + "?&area={area}&year={year}&order={order}";
                } else {
                    strReplace2 = str3 + "{s}/" + str2 + strE2 + str + "&area={area}&year={year}&order={order}";
                }
                Iterator<String> it = map.keySet().iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    String str4 = map.get(next);
                    if (str4.length() > 0) {
                        strReplace2 = strReplace2.replace("{" + next + "}", URLEncoder.encode(str4));
                    }
                }
                int i8 = 0;
                strReplace = strReplace2;
                while (i8 < 4) {
                    if (strReplace.contains(strE)) {
                        strReplace = strReplace.replace(strE, "all");
                    }
                    if (strReplace.contains("{area}")) {
                        strReplace = strReplace.replace("&area={area}", "");
                    }
                    if (strReplace.contains("{year}")) {
                        strReplace = strReplace.replace("&year={year}", "");
                    }
                    if (strReplace.contains(strC)) {
                        strReplace = strReplace.replace(strC, "0");
                    }
                    i8++;
                }
            } else {
                String strE4 = "all/";
                if (str.equals(strD)) {
                    strReplace = str3 + strE4 + str2 + "?&order=0";
                } else {
                    strReplace = str3 + strE4 + str2 + strE2 + str + "&order=0";
                }
            }
            String str5 = this.l8 + "/";
            this.T4 = str5;
            String strV = Yy.v(strReplace, OL(strReplace, str5));
            this.T4 = strReplace;
            g9 g9VarL8 = YS.l8(strV);
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (!strV.contains("没有找到您想要的结果哦")) {
                jk jkVarLD = g9VarL8.LD("div.col-lg-8");
                int i21 = 0;
                while (i21 < jkVarLD.size()) {
                    Iw iw = jkVarLD.get(i21);
                    String strGO = iw.pu("h3.mb-0").GO();
                    String strT4 = iw.pu("img.w-100").T4("src");
                    String strGO2 = iw.pu("p.mb-0").GO();
                    String strT42 = iw.pu("a.d-block").T4("href");
                    if (strT42.contains("JSESSIONID")) {
                        strT42 = strT42.substring(0, strT42.indexOf(";"));
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("vod_id", strT42);
                    jSONObject2.put("vod_name", strGO);
                    jSONObject2.put("vod_pic", strT4);
                    jSONObject2.put("vod_remarks", strGO2);
                    jSONArray.put(jSONObject2);
                    i21++;
                }
            }
            int i26 = Integer.parseInt(str2);
            jSONObject.put("page", i26);
            if (jSONArray.length() == 24) {
                i26++;
            }
            jSONObject.put("pagecount", i26);
            jSONObject.put("limit", 24);
            jSONObject.put("total", Integer.MAX_VALUE);
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String detailContent(List<String> list) {
        try {
            String str2 = this.l8 + list.get(0);
            g9 g9VarL8 = YS.l8(Yy.v(str2, OL(str2, this.T4)));
            this.T4 = str2;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String strT4 = g9VarL8.pu("div.col-md-auto img").T4("src");
            String strGO = g9VarL8.pu("h1.d-none.d-md-block").GO();
            String strOL = g9VarL8.LD("div.card.collapse > div.card-body").OL();
            String str3 = g9VarL8.LD("span.badge.bg-purple-lt").OL().replace("更新时间：", "").split("-")[0];
            jk jkVarLD = g9VarL8.LD("div.col.mb-2").get(0).LD("p");
            String str4 = "";
            String strSubstring = "";
            String str5 = "";
            String str6 = "";
            String strGO2 = "";
            int i = 0;
            while (i < jkVarLD.size()) {
                Iw iw = jkVarLD.get(i);
                String strGO3 = iw.pu("strong").GO();
                if (strGO3.equals("类型：")) {
                    ArrayList arrayList = new ArrayList();
                    jk jkVarLD3 = iw.LD("a");
                    int i14 = 0;
                    while (i14 < jkVarLD3.size()) {
                        arrayList.add(jkVarLD3.get(i14).GO());
                        i14++;
                    }
                    str4 = "类型：" + TextUtils.join(",", arrayList);
                } else if (strGO3.contains("地区")) {
                    strSubstring = iw.GO().substring(iw.GO().indexOf("[") + 1, iw.GO().indexOf("]"));
                } else if (strGO3.contains("豆瓣")) {
                    str5 = "豆瓣:" + iw.GO();
                } else if (strGO3.contains("导演：")) {
                    strGO2 = iw.pu("a").GO();
                } else if (strGO3.contains("主演：")) {
                    ArrayList arrayList = new ArrayList();
                    jk jkVarLD2 = iw.LD("a");
                    int i9 = 0;
                    while (i9 < jkVarLD2.size()) {
                        arrayList.add(jkVarLD2.get(i9).GO());
                        i9++;
                    }
                    str6 = TextUtils.join(",", arrayList);
                }
                i++;
            }
            jSONObject2.put("vod_id", list.get(0));
            jSONObject2.put("vod_name", strGO);
            jSONObject2.put("vod_pic", strT4);
            jSONObject2.put("type_name", str4);
            jSONObject2.put("vod_year", str3);
            jSONObject2.put("vod_area", strSubstring);
            jSONObject2.put("vod_remarks", str5);
            jSONObject2.put("vod_actor", str6);
            jSONObject2.put("vod_director", strGO2);
            jSONObject2.put("vod_content", strOL);
            TreeMap treeMap = new TreeMap();
            jk jkVarLD4 = g9VarL8.LD("a.btn.btn-square");
            String strC2 = "播放列表";
            ArrayList arrayList3 = new ArrayList();
            int i21 = 0;
            while (i21 < jkVarLD4.size()) {
                Iw iw2 = jkVarLD4.get(i21);
                String strT42 = iw2.T4("href");
                if (strT42.contains("JSESSIONID")) {
                    strT42 = strT42.substring(0, strT42.indexOf(";"));
                }
                arrayList3.add(iw2.GO() + "$" + strT42);
                i21++;
            }
            String strJoin2;
            if (arrayList3.size() > 0) {
                strJoin2 = TextUtils.join("#", arrayList3);
            } else {
                strJoin2 = "";
            }
            treeMap.put(strC2, strJoin2);
            if (treeMap.size() > 0) {
                String strJoin3 = TextUtils.join("$$$", treeMap.keySet());
                String strJoin4 = TextUtils.join("$$$", treeMap.values());
                jSONObject2.put("vod_play_from", strJoin3);
                jSONObject2.put("vod_play_url", strJoin4);
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String homeContent(boolean z) {
        try {
            T4();
            String str = this.l8;
            g9 g9VarL8 = YS.l8(Yy.v(str, OL(str, this.T4)));
            this.T4 = this.l8 + "/";
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            JSONObject jSONObject2 = new JSONObject("{\"全部\": \"a\",\"电影\": \"0\",\"电视剧\": \"1\"}");
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                JSONObject jSONObject3 = new JSONObject();
                String next = itKeys.next();
                jSONObject3.put("type_name", next);
                jSONObject3.put("type_id", jSONObject2.optString(next));
                jSONArray2.put(jSONObject3);
            }
            jSONObject.put("class", jSONArray2);
            if (z) {
                jSONObject.put("filters", this.OL);
            }
            try {
                jk jkVarLD = g9VarL8.LD("div.row.row-cards").get(0).LD("div.col-4.rows-md-7");
                JSONArray jSONArray = new JSONArray();
                int i = 0;
                while (i < jkVarLD.size()) {
                    Iw iw = jkVarLD.get(i);
                    String strGO = iw.pu("h3.card-title").GO();
                    String strT4 = iw.pu("img.w-100").T4("data-src");
                    String strGO2 = iw.pu("p.text-muted").GO();
                    String strT42 = iw.pu("a.d-block.cover").T4("href");
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("vod_id", strT42);
                    jSONObject4.put("vod_name", strGO);
                    jSONObject4.put("vod_pic", strT4);
                    jSONObject4.put("vod_remarks", strGO2);
                    jSONArray.put(jSONObject4);
                    i++;
                }
                jSONObject.put("list", jSONArray);
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
            return jSONObject.toString();
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context, str);
        this.l8 = C1370pv.l(str);
        try {
            this.OL = new JSONObject("{\"0\":[{\"key\":\"s\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"all\"},{\"n\":\"动作\",\"v\":\"dongzuo\"},{\"n\":\"爱情\",\"v\":\"aiqing\"},{\"n\":\"喜剧\",\"v\":\"xiju\"},{\"n\":\"科幻\",\"v\":\"kehuan\"},{\"n\":\"恐怖\",\"v\":\"kongbu\"},{\"n\":\"战争\",\"v\":\"zhanzheng\"},{\"n\":\"武侠\",\"v\":\"wuxia\"},{\"n\":\"魔幻\",\"v\":\"mohuan\"},{\"n\":\"剧情\",\"v\":\"juqing\"},{\"n\":\"动画\",\"v\":\"donghua\"},{\"n\":\"惊悚\",\"v\":\"jingsong\"},{\"n\":\"3D\",\"v\":\"3D\"},{\"n\":\"灾难\",\"v\":\"zainan\"},{\"n\":\"悬疑\",\"v\":\"xuanyi\"},{\"n\":\"警匪\",\"v\":\"jingfei\"},{\"n\":\"文艺\",\"v\":\"wenyi\"},{\"n\":\"青春\",\"v\":\"qingchun\"},{\"n\":\"冒险\",\"v\":\"maoxian\"},{\"n\":\"犯罪\",\"v\":\"fanzui\"},{\"n\":\"纪录\",\"v\":\"jilu\"},{\"n\":\"古装\",\"v\":\"guzhuang\"},{\"n\":\"奇幻\",\"v\":\"qihuan\"},{\"n\":\"国语\",\"v\":\"guoyu\"},{\"n\":\"综艺\",\"v\":\"zongyi\"},{\"n\":\"历史\",\"v\":\"lishi\"},{\"n\":\"运动\",\"v\":\"yundong\"},{\"n\":\"原创压制\",\"v\":\"yuanchuang\"},{\"n\":\"美剧\",\"v\":\"meiju\"},{\"n\":\"韩剧\",\"v\":\"hanju\"},{\"n\":\"国产电视剧\",\"v\":\"guoju\"},{\"n\":\"日剧\",\"v\":\"riju\"},{\"n\":\"英剧\",\"v\":\"yingju\"},{\"n\":\"德剧\",\"v\":\"deju\"},{\"n\":\"俄剧\",\"v\":\"eju\"},{\"n\":\"巴剧\",\"v\":\"baju\"},{\"n\":\"加剧\",\"v\":\"jiaju\"},{\"n\":\"西剧\",\"v\":\"anish\"},{\"n\":\"意大利剧\",\"v\":\"yidaliju\"},{\"n\":\"泰剧\",\"v\":\"taiju\"},{\"n\":\"港台剧\",\"v\":\"gangtaiju\"},{\"n\":\"法剧\",\"v\":\"faju\"},{\"n\":\"澳剧\",\"v\":\"aoju\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"不限\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"澳大利亚\",\"v\":\"澳大利亚\"},{\"n\":\"比利时\",\"v\":\"比利时\"},{\"n\":\"瑞典\",\"v\":\"瑞典\"},{\"n\":\"荷兰\",\"v\":\"荷兰\"},{\"n\":\"丹麦\",\"v\":\"丹麦\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"俄罗斯\",\"v\":\"俄罗斯\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]},{\"key\":\"order\",\"name\":\"排序\",\"value\":[{\"n\":\"更新时间\",\"v\":\"0\"},{\"n\":\"豆瓣评分\",\"v\":\"1\"}]}],\"1\":[{\"key\":\"s\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"all\"},{\"n\":\"动作\",\"v\":\"dongzuo\"},{\"n\":\"爱情\",\"v\":\"aiqing\"},{\"n\":\"喜剧\",\"v\":\"xiju\"},{\"n\":\"科幻\",\"v\":\"kehuan\"},{\"n\":\"恐怖\",\"v\":\"kongbu\"},{\"n\":\"战争\",\"v\":\"zhanzheng\"},{\"n\":\"武侠\",\"v\":\"wuxia\"},{\"n\":\"魔幻\",\"v\":\"mohuan\"},{\"n\":\"剧情\",\"v\":\"juqing\"},{\"n\":\"动画\",\"v\":\"donghua\"},{\"n\":\"惊悚\",\"v\":\"jingsong\"},{\"n\":\"3D\",\"v\":\"3D\"},{\"n\":\"灾难\",\"v\":\"zainan\"},{\"n\":\"悬疑\",\"v\":\"xuanyi\"},{\"n\":\"警匪\",\"v\":\"jingfei\"},{\"n\":\"文艺\",\"v\":\"wenyi\"},{\"n\":\"青春\",\"v\":\"qingchun\"},{\"n\":\"冒险\",\"v\":\"maoxian\"},{\"n\":\"犯罪\",\"v\":\"fanzui\"},{\"n\":\"纪录\",\"v\":\"jilu\"},{\"n\":\"古装\",\"v\":\"guzhuang\"},{\"n\":\"奇幻\",\"v\":\"qihuan\"},{\"n\":\"国语\",\"v\":\"guoyu\"},{\"n\":\"综艺\",\"v\":\"zongyi\"},{\"n\":\"历史\",\"v\":\"lishi\"},{\"n\":\"运动\",\"v\":\"yundong\"},{\"n\":\"原创压制\",\"v\":\"yuanchuang\"},{\"n\":\"美剧\",\"v\":\"meiju\"},{\"n\":\"韩剧\",\"v\":\"hanju\"},{\"n\":\"国产电视剧\",\"v\":\"guoju\"},{\"n\":\"日剧\",\"v\":\"riju\"},{\"n\":\"英剧\",\"v\":\"yingju\"},{\"n\":\"德剧\",\"v\":\"deju\"},{\"n\":\"俄剧\",\"v\":\"eju\"},{\"n\":\"巴剧\",\"v\":\"baju\"},{\"n\":\"加剧\",\"v\":\"jiaju\"},{\"n\":\"西剧\",\"v\":\"anish\"},{\"n\":\"意大利剧\",\"v\":\"yidaliju\"},{\"n\":\"泰剧\",\"v\":\"taiju\"},{\"n\":\"港台剧\",\"v\":\"gangtaiju\"},{\"n\":\"法剧\",\"v\":\"faju\"},{\"n\":\"澳剧\",\"v\":\"aoju\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"不限\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"澳大利亚\",\"v\":\"澳大利亚\"},{\"n\":\"比利时\",\"v\":\"比利时\"},{\"n\":\"瑞典\",\"v\":\"瑞典\"},{\"n\":\"荷兰\",\"v\":\"荷兰\"},{\"n\":\"丹麦\",\"v\":\"丹麦\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"俄罗斯\",\"v\":\"俄罗斯\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]},{\"key\":\"order\",\"name\":\"排序\",\"value\":[{\"n\":\"更新时间\",\"v\":\"0\"},{\"n\":\"豆瓣评分\",\"v\":\"1\"}]}],\"a\":[{\"key\":\"s\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"all\"},{\"n\":\"动作\",\"v\":\"dongzuo\"},{\"n\":\"爱情\",\"v\":\"aiqing\"},{\"n\":\"喜剧\",\"v\":\"xiju\"},{\"n\":\"科幻\",\"v\":\"kehuan\"},{\"n\":\"恐怖\",\"v\":\"kongbu\"},{\"n\":\"战争\",\"v\":\"zhanzheng\"},{\"n\":\"武侠\",\"v\":\"wuxia\"},{\"n\":\"魔幻\",\"v\":\"mohuan\"},{\"n\":\"剧情\",\"v\":\"juqing\"},{\"n\":\"动画\",\"v\":\"donghua\"},{\"n\":\"惊悚\",\"v\":\"jingsong\"},{\"n\":\"3D\",\"v\":\"3D\"},{\"n\":\"灾难\",\"v\":\"zainan\"},{\"n\":\"悬疑\",\"v\":\"xuanyi\"},{\"n\":\"警匪\",\"v\":\"jingfei\"},{\"n\":\"文艺\",\"v\":\"wenyi\"},{\"n\":\"青春\",\"v\":\"qingchun\"},{\"n\":\"冒险\",\"v\":\"maoxian\"},{\"n\":\"犯罪\",\"v\":\"fanzui\"},{\"n\":\"纪录\",\"v\":\"jilu\"},{\"n\":\"古装\",\"v\":\"guzhuang\"},{\"n\":\"奇幻\",\"v\":\"qihuan\"},{\"n\":\"国语\",\"v\":\"guoyu\"},{\"n\":\"综艺\",\"v\":\"zongyi\"},{\"n\":\"历史\",\"v\":\"lishi\"},{\"n\":\"运动\",\"v\":\"yundong\"},{\"n\":\"原创压制\",\"v\":\"yuanchuang\"},{\"n\":\"美剧\",\"v\":\"meiju\"},{\"n\":\"韩剧\",\"v\":\"hanju\"},{\"n\":\"国产电视剧\",\"v\":\"guoju\"},{\"n\":\"日剧\",\"v\":\"riju\"},{\"n\":\"英剧\",\"v\":\"yingju\"},{\"n\":\"德剧\",\"v\":\"deju\"},{\"n\":\"俄剧\",\"v\":\"eju\"},{\"n\":\"巴剧\",\"v\":\"baju\"},{\"n\":\"加剧\",\"v\":\"jiaju\"},{\"n\":\"西剧\",\"v\":\"anish\"},{\"n\":\"意大利剧\",\"v\":\"yidaliju\"},{\"n\":\"泰剧\",\"v\":\"taiju\"},{\"n\":\"港台剧\",\"v\":\"gangtaiju\"},{\"n\":\"法剧\",\"v\":\"faju\"},{\"n\":\"澳剧\",\"v\":\"aoju\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"不限\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"澳大利亚\",\"v\":\"澳大利亚\"},{\"n\":\"比利时\",\"v\":\"比利时\"},{\"n\":\"瑞典\",\"v\":\"瑞典\"},{\"n\":\"荷兰\",\"v\":\"荷兰\"},{\"n\":\"丹麦\",\"v\":\"丹麦\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"俄罗斯\",\"v\":\"俄罗斯\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]},{\"key\":\"order\",\"name\":\"排序\",\"value\":[{\"n\":\"更新时间\",\"v\":\"0\"},{\"n\":\"豆瓣评分\",\"v\":\"1\"}]}]}");
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
    }

    protected HashMap<String, String> l(String str) {
        String str2 = "ۧ۟ۨ";
        HashMap<String, String> map = null;
        String[] strArrSplit = null;
        String strD = null;
        String strB = null;
        short[] sArr = null;
        while (true) {
            switch (v.d(str2)) {
                case 56511:
                    return map;
                case 56567:
                    map.put(strB, strD);
                    str2 = "ۤۦۡ";
                    break;
                case 1746785:
                    map.put(strD, str);
                    str2 = "ۦۥ";
                    break;
                case 1746820:
                    str = "Origin";
                    str2 = "ۥ۠ۡ";
                    break;
                case 1747714:
                    str2 = "ۣۢ۠";
                    sArr = f24short;
                    break;
                case 1747716:
                    map.put(strB, str);
                    str2 = "ۡ۠ۡ";
                    break;
                case 1747746:
                    str2 = "ۢۥۦ";
                    strB = "www.xlys01.com";
                    break;
                case 1748642:
                    str2 = "ۧۡ۠";
                    sArr = f24short;
                    break;
                case 1749695:
                    str = "zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2";
                    str2 = "۟ۢۤ";
                    break;
                case 1749697:
                    str2 = "ۥ۠ۢ";
                    sArr = f24short;
                    break;
                case 1749758:
                    str2 = "ۧۦ۟";
                    strD = "https://";
                    break;
                case 1749763:
                    map.put(str, strB);
                    str2 = "ۣ۠ۢ";
                    break;
                case 1750565:
                    str2 = "ۥ۟ۨ";
                    sArr = f24short;
                    break;
                case 1750695:
                    str2 = "ۨۦۢ";
                    strB = "User-Agent";
                    break;
                case 1751711:
                    str2 = "ۣ۟ۨ";
                    sArr = f24short;
                    break;
                case 1752460:
                    str2 = "ۣۤۨ";
                    sArr = f24short;
                    break;
                case 1752462:
                    str2 = "ۣ۠ۡ";
                    strD = "Accept-Language";
                    break;
                case 1752486:
                    str2 = "۠ۢۤ";
                    sArr = f24short;
                    break;
                case 1752487:
                    str = "/";
                    str2 = "ۤۦ";
                    break;
                case 1752554:
                    str2 = "ۢۥۡ";
                    sArr = f24short;
                    break;
                case 1752678:
                    str2 = "ۥ۟ۦ";
                    strD = strArrSplit[0];
                    break;
                case 1753510:
                    str = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36";
                    str2 = "۠ۡۥ";
                    break;
                case 1754384:
                    map = new HashMap<>();
                    str2 = "ۥۢۧ";
                    break;
                case 1754438:
                    str2 = "ۨ۟";
                    strB = "Authority";
                    break;
                case 1754592:
                    str2 = "ۣۢۢ";
                    strB = str.replace(strD, "");
                    break;
                case 1755556:
                    str2 = "ۦۢۢ";
                    sArr = f24short;
                    break;
                default:
                    str2 = "ۥۦۧ";
                    strArrSplit = strB.split(str);
                    break;
            }
        }
    }

    protected String l8(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i] & 255);
            if (hexString.length() == 1) {
                hexString = '0' + hexString;
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strSubstring;
        String strJoin;
        String strC = "\n";
        String strB = "m3u8_2";
        String strE = "m3u8";
        String strB2 = "url3";
        String strB3 = "-";
        String strB4 = "var pid =";
        try {
            Init2.lj();
            String str3 = this.l8 + str2;
            jk jkVarLD = YS.l8(Yy.v(str3, OL(str3, this.T4))).LD("script");
            JSONObject jSONObject = new JSONObject();
            strSubstring = "";
            for (int i = 0; i < jkVarLD.size(); i++) {
                String string = jkVarLD.get(i).toString();
                if (string.contains(strB4)) {
                    String strSubstring2 = string.substring(string.indexOf(strB4), string.lastIndexOf("var time") + 1);
                    strSubstring = strSubstring2.substring(strSubstring2.indexOf("=") + 2, strSubstring2.lastIndexOf(";"));
                    break;
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str4 = this.l8 + "/lines?t=" + jCurrentTimeMillis + "&sg=" + S(strSubstring + strB3 + jCurrentTimeMillis, ZP.l8(strSubstring + strB3 + jCurrentTimeMillis, ZP.S).substring(0, 16)) + "&pid=" + strSubstring;
            JSONObject jSONObjectOptJSONObject = new JSONObject(Yy.v(str4, OL(str4, ""))).optJSONObject("data");
            ArrayList arrayList = new ArrayList();
            if (!jSONObjectOptJSONObject.isNull(strB2)) {
                String strOptString = jSONObjectOptJSONObject.optString(strB2);
                jSONObject.put("parse", 0);
                jSONObject.put("playUrl", "");
                jSONObject.put("url", strOptString);
                jSONObject.put("header", "");
            } else {
                if (!jSONObjectOptJSONObject.isNull(strE)) {
                    arrayList.add(jSONObjectOptJSONObject.optString(strE).replace("www.bde4.cc", "www.bdys01.com"));
                }
                if (!jSONObjectOptJSONObject.isNull(strB)) {
                    String[] strArrSplit = jSONObjectOptJSONObject.optString(strB).split(",");
                    for (int i9 = 0; i9 < strArrSplit.length; i9++) {
                        arrayList.add(strArrSplit[i9].replace("www.bde4.cc", "www.bdys01.com"));
                    }
                }
                String str5 = (String) arrayList.get(new Random().nextInt(arrayList.size()));
                if (str5.contains("mp4")) {
                    jSONObject.put("parse", 0);
                    jSONObject.put("playUrl", "");
                    jSONObject.put("url", str5);
                    jSONObject.put("header", "");
                } else {
                    HashMap map = new HashMap();
                    Yy.Kf(str5, OL(str5, ""), map);
                    String strOL = Yy.OL(map);
                    xx.aA aAVar = new xx.aA(this) { // from class: com.github.catvod.spider.Bdys01.1
                        final Bdys01 S;

                        {
                            this.S = this;
                        }

                        @Override // com.github.catvod.spider.merge.xx
                        protected void onFailure(Call call, Exception exc) {
                        }

                        @Override // com.github.catvod.spider.merge.xx
                        public String onResponse(Response response) {
                            return null;
                        }
                    };
                    Yy.b(Yy.T4(), strOL, null, l(strOL), aAVar);
                    int iCode = aAVar.getResult().code();
                    String strB6 = "https://vod.bdys.me/";
                    if (iCode != 200) {
                        strJoin = "";
                    } else {
                        InputStream inputStreamByteStream = aAVar.getResult().body().byteStream();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[4];
                        int i14;
                        while ((i14 = inputStreamByteStream.read(bArr, 0, 4)) != -1) {
                            byteArrayOutputStream.write(bArr, 0, i14);
                        }
                        byteArrayOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        inputStreamByteStream.close();
                        String[] strArrSplit2 = lE.l8(Arrays.copyOfRange(byteArray, 3354, byteArray.length)).split(strC);
                        for (int i17 = 0; i17 < strArrSplit2.length; i17++) {
                            String str6 = strArrSplit2[i17];
                            if (str6.contains(".ts")) {
                                strArrSplit2[i17] = strB6 + str6;
                            }
                        }
                        strJoin = TextUtils.join(strC, strArrSplit2);
                    }
                    jSONObject.put("url", "data:application/vnd.apple.mpegurl;base64," + Base64.encodeToString(strJoin.getBytes(), 2));
                    jSONObject.put("parse", 0);
                    jSONObject.put("playUrl", "");
                    jSONObject.put("header", new JSONObject(l(strB6)).toString());
                }
            }
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            String str2 = "https://cn.bing.com/search?q=" + str + "+site:www.xlys01.com";
            g9 g9VarL8 = YS.l8(Yy.v(str2, OL(str2, "google")));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jk jkVarLD = g9VarL8.LD("ol#b_results li");
            if (jkVarLD.size() > 0) {
                for (int i2 = 0; i2 < jkVarLD.size(); i2++) {
                    Iw iw = jkVarLD.get(i2);
                    String strOL = iw.LD("h2").OL();
                    String strL8 = iw.LD("h2 a").l8("href");
                    if (!strOL.isEmpty() && strOL.contains(str) && strL8.contains("www.xlys01.com")) {
                        Matcher matcher = this.VodCategory.matcher(strL8);
                        if (matcher.find() && !strL8.contains("/play/")) {
                            g9 g9VarL82 = YS.l8(Yy.v(strL8, OL(strL8, "")));
                            JSONObject jSONObject2 = new JSONObject();
                            String strGroup = matcher.group(1);
                            String strGO = g9VarL82.pu("h1.d-md-block").GO();
                            String strL82 = g9VarL82.LD("div.col-md-auto img").l8("src");
                            jSONObject2.put("vod_name", strGO);
                            jSONObject2.put("vod_remarks", "全");
                            jSONObject2.put("vod_id", strGroup.replace(this.l8, "") + ".htm");
                            jSONObject2.put("vod_pic", strL82);
                            jSONArray.put(jSONObject2);
                        }
                    }
                }
            }
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }
}
