package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0165;
import com.github.catvod.parser.C0166;
import com.github.catvod.spider.merge.C0082OO;
import com.github.catvod.spider.merge.C0093Tt;
import com.github.catvod.spider.merge.C0106ZJ;
import com.github.catvod.spider.merge.C0116dX;
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
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class Slys extends Spider {

    /* renamed from: q */
    private static String f273q = "";

    /* renamed from: short, reason: not valid java name */
    private static final short[] f864short = {2860, 2857, 2867, 2868, 2926, 2849, 2867, 2864, 2844, 2943, 2819, 2860, 2849, 2867, 2867, 2857, 2852, 2941, 2920, 2844, 2852, 2923, 2921, 2130, 2128, 2121, 2134, 2138, 2065, 2142, 2124, 2127, 2147, 2048, 2172, 2131, 2142, 2124, 2124, 2134, 2139, 2050, 2071, 2147, 2139, 2068, 2070, 1578, 1651, 1642, 1633, 1576, 1653, 1641, 1636, 1660, 1576, 1644, 1633, 1576, 1581, 1625, 1622, 1582, 1580, 1579, 1645, 1649, 1640, 1641, 2671, 2634, 2640, 2647, 2573, 2626, 2640, 2643, 2687, 2588, 2624, 2639, 2626, 2640, 2640, 2634, 2631, 2590, 2578, 2579, 2565, 2640, 2630, 2626, 2641, 2624, 2635, 2644, 2636, 2641, 2631, 2590, 2565, 2643, 2626, 2628, 2630, 2590, 2571, 2687, 2631, 2568, 2570, 826, 829, 846, 804, 824, 812, 840, 830, 828, -25760, 1230, 1250, 1248, 1235, 1263, 1250, 1274, 1254, 1265, 1216, 1260, 1261, 1253, 1258, 1252, 1197, 1267, 1263, 1250, 1274, 1254, 1265, 1244, 1263, 1258, 1264, 1271, 1214, 1195, 1247, 1272, 1197, 1193, 1247, 1278, 1194, 1247, 1199, 1230, 1250, 1248, 1235, 1263, 1250, 1274, 1254, 1265, 1216, 1260, 1261, 1253, 1258, 1252, 1197, 1255, 1260, 1268, 1261, 1254, 1265, 1244, 1263, 1258, 1264, 1271, 1214, 1602, 1562, 1562, 1562, 1602, 1569, 1540, 1566, 1561, 1603, 1548, 1566, 1565, 1618, 1550, 1537, 1548, 1566, 1566, 1540, 1545, 1616, 3014, 2963, 2949, 2945, 2962, 2947, 2952, 2967, 2959, 2962, 2948, 3037, 3014, 2960, 2945, 2951, 2949, 3037, 640, 653, 658, 708, 730, 708, 645, 703, 652, 662, 641, 642, 718, 729, 707, 660, 645, 643, 641, 729, 707, 697, 2082, 2104, 2095, 2092, 17663, 17652, -28031, 26528, 27656, 27007, 22833, 27561, 27634, -32128, 32133, 30162, 27805, 24551, 1831, 1834, 1845, 1891, 1917, 1891, 1846, 1839, 1891, 1917, 1891, 1839, 1834, 1891, 1917, 1891, 1840, 1847, 1841, 1836, 1837, 1828, 1891, 1917, 1891, 1826, 1936, 1933, 1936, 1928, 1921, 1531, 1535, 1525, 1485, 1484, 1501, 874, 873, 888, 887, 803, 885, 888, 874, 877, 820, 890, 881, 880, 885, 893, 2254, 2263, 2268, 2279, 2257, 2268, 2729, 2736, 2747, 2688, 2737, 2750, 2738, 2746, 315, 290, 297, 274, 317, 292, 302, 1183, 1183, 1276, 1253, 1262, 1237, 1272, 1263, 1255, 1259, 1272, 1249, 1273, 1017, 1000, 1006, 1004, 3099, 3082, 3084, 3086, 3080, 3076, 3102, 3077, 3103, 2483, 2486, 2482, 2486, 2475, 1650, 1641, 1650, 1639, 1642, 530, 535, 525, 522, 19127, 27544, 1814, 1870, 1870, 1870, 1814, 1876, 1878, 1871, 1872, 1884, 1815, 1880, 1866, 1865, 1798, 1914, 1877, 1880, 1866, 1866, 1872, 1885, 1796, 1380, 1307, 1319, 1322, 1330, 1286, 1316, 1341, 1381, 1322, 1336, 1339, 1396, 1288, 1319, 1322, 1336, 1336, 1282, 1327, 1398, 1796, 1876, 1867, 1862, 1863, 1869, 1823, 1808, 1796, 1863, 1882, 1863, 1823, 1810, 1796, 1862, 1869, 1877, 1868, 1823, 1810, 1796, 1871, 1869, 1876, 1900, 1869, 1823, 1811, 1796, 1876, 1861, 1876, 1863, 1872, 1823, 1879, 1868, 1862, 1863, 1860, 1867, 1868, 1863, 1862, 1796, 1889, 1870, 1867, 1863, 1868, 1878, 1899, 1906, 1823, 771, 799, 799, 795, 849, 836, 836, 1562, 1542, 1542, 1538, 1537, 1608, 1629, 1629, 3263, 647, 643, 649, 2184, 2185, 2200, 1864, 1989, 2012, 2466, 2471, 2401, 2424, 2419, 2376, 2419, 2430, 2405, 2418, 2420, 2403, 2424, 2405, 1013, 1004, 999, 988, 994, 992, 1015, 1004, 1009, 31655, 26896, 1288, 1297, 1306, 1313, 1292, 1307, 1299, 1311, 1292, 1301, 2352, 2361, 2360, 2338, 24501, 20258, 452, 477, 470, 493, 459, 471, 467, 448, 3160, 3157, 3146, 2456, 2433, 2442, 2481, 2439, 2442, 1317, 1340, 1335, 1292, 1341, 1330, 1342, 1334, 404, 397, 390, 445, 402, 395, 385, 736, 736, 1336, 1313, 1322, 1297, 1325, 1313, 1312, 1338, 1323, 1312, 1338, 28523, 26538, 22508, 24451, 21863, 21826, -30410, -1277, -28680, 22256, 18949, 23388, 22488, -24936, -1266, -1266, 2532, 2555, 2550, 2551, 2557, 2547, 2528, 2528, 2510, 2492, 2530, 2535, 2529, 2554, 2510, 2490, 2485, 2490, 2505, 2508, 2485, 2511, 2488, 2491, 2485, 2510, 2491, 1592, 406, 2460, 2437, 2446, 2485, 2458, 2438, 2443, 2451, 2485, 2444, 2456, 2437, 2439, -28797, 23063, 2549, 2540, 2535, 2524, 2547, 2543, 2530, 2554, 2524, 2550, 2545, 2543, 1360, 1365, 1359, 1352, 1610, 1554, 1554, 1554, 1610, 1548, 1547, 1537, 1536, 1565, 1611, 1540, 1558, 1557, 2858, 2867, 2940, 2865, 2878, 2857, 2926, 2926, 2926, 2943, 2867, 2870, 2943, 2878, 2528, 2554, 2541, 2542, 3116, 3115, 3117, 3120, 3121, 3128, 31989, 22193, 28972, -29217, 22142, 30535, -29759, 23502, 26189, 2436, 2441, 2432, 2453, 2479, 2457, 2452, 1617, 1628, 1621, 1600, 1658, 1611, 1604, 1608, 1600, 2851, 2860, 2857, 2865, 2848, 2871, 2870, 607, 592, 605, 591, 591, 1245, 1220, 1163, 1226, 1217, 1231, 1275, 1220, 1217, 1228, 1229, 1277, 1220, 1160, 1220, 1217, 2018, 1955, 2032, 2035, 2018, 2029, 1776, 1713, 1784, 1788, 1782, 2008, 2009, 1992, 30026, -28593, 26127, -30985, 1258, 1886, 1863, 1868, 1911, 1857, 1868, 3047, 3070, 3061, 3022, 3071, 3056, 3068, 3060, 1897, 1904, 1915, 1856, 1903, 1910, 1916, 2052, 2052, 1516, 1525, 1534, 1477, 1512, 1535, 1527, 1531, 1512, 1521, 1513, 2089, 2092, 2102, 2097, 629, 612, 631, 630, 608, 1048, 1055, 1025, 578, 612, 626, 613, 570, 598, 624, 626, 633, 611, 764, 734, 715, 728, 733, 733, 720, 670, 644, 671, 641, 657, 665, 742, 728, 735, 725, 734, 710, 706, 657, 767, 741, 657, 640, 641, 671, 641, 650, 657, 742, 728, 735, 647, 645, 650, 657, 713, 647, 645, 664, 657, 752, 705, 705, 733, 724, 742, 724, 723, 762, 728, 709, 670, 644, 642, 646, 671, 642, 647, 657, 665, 762, 761, 741, 764, 765, 669, 657, 733, 728, 730, 724, 657, 758, 724, 722, 730, 734, 664, 657, 754, 729, 707, 734, 732, 724, 670, 640, 640, 649, 671, 641, 671, 641, 671, 641, 657, 738, 720, 727, 720, 707, 728, 670, 644, 642, 646, 671, 642, 647, 3074, 3162, 3162, 3162, 3074, 3169, 3140, 3166, 3161, 3075, 3148, 3166, 3165, 3090, 3166, 3144, 3148, 3167, 3150, 3141, 3162, 3138, 3167, 3145, 3088, 1212, 1209, 1225, 1224, 1226, 1225, 1119, 1082, 1045, 1048, 1034, 1034, 1072, 1053, 1092, 1098, 1097, 1271, 1262, 1766, 1763, 1706, 1771, 645, 664, 645, 669, 660, 
    275, 279, 285, 2762, 2763, 2778, 2380, 2383, 2398, 2385, 2309, 2387, 2398, 2380, 2379, 2322, 2396, 2391, 2390, 2387, 2395, 458, 464, 455, 452, 1643, 1650, 1657, 1602, 1652, 1657, 2594, 2619, 2608, 2571, 2618, 2613, 2617, 2609, 933, 956, 951, 908, 931, 954, 944, 2862, 2862, 769, 792, 787, 808, 773, 786, 794, 790, 773, 796, 772, 482, 487, 509, 506};

    /* renamed from: xC */
    private JSONObject f280xC;

    /* renamed from: QU */
    private Pattern f276QU = Pattern.compile(C0181.m856(f864short, 0, 23, 2880));

    /* renamed from: UJ */
    private Pattern f277UJ = Pattern.compile(C0171.m816(f864short, 23, 24, 2111));

    /* renamed from: u */
    private Pattern f279u = Pattern.compile(C0182.m861(f864short, 47, 23, 1541));

    /* renamed from: Mo */
    private Pattern f275Mo = Pattern.compile(C0170.m814(f864short, 70, 43, 2595));

    /* renamed from: i */
    private Pattern f278i = Pattern.compile(C0177.m841(f864short, 113, 10, 789));

    /* renamed from: MH */
    private Pattern f274MH = Pattern.compile(C0174.m828(f864short, 123, 66, 1155));

    public Slys() {
        int iM833 = C0175.m833();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = iM833 <= 0 ? 1709 : 1678;
                case 204:
                    System.out.println(Integer.valueOf(C0178.m846("FwKT7BQBXqHSka")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:110:0x026e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x00ed. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x0157. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:96:0x01ed. Please report as an issue. */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException, NumberFormatException {
        int i;
        int i2;
        int i3;
        int length;
        try {
            String strM483F = C0106ZJ.m483F(f273q + C0176.m836(f864short, 189, 22, 1645) + str + C0170.m814(f864short, 211, 18, 3040) + str2, m105q(""));
            C0082OO c0082ooM440q = C0093Tt.m440q(strM483F);
            JSONObject jSONObject = new JSONObject();
            C0116dX c0116dXM654b = c0082ooM440q.m654b(C0168.m805(f864short, 229, 22, 740));
            int size = c0116dXM654b.size();
            String strM851 = C0180.m851(f864short, 251, 4, 2122);
            int i4 = 1616;
            while (true) {
                i4 ^= 1633;
                switch (i4) {
                    case 14:
                    case 49:
                        i4 = size == 0 ? 1709 : 1678;
                    case 204:
                        int i5 = Integer.parseInt(str2);
                        int i6 = 1740;
                        while (true) {
                            i6 ^= 1757;
                            switch (i6) {
                                case 17:
                                    i6 = 1771;
                                    continue;
                                case 54:
                                    i2 = i5;
                                    i3 = i5;
                                    break;
                                default:
                                    continue;
                            }
                        }
                    case 239:
                        int i7 = -1;
                        int i8 = 0;
                        while (true) {
                            int size2 = c0116dXM654b.size();
                            int i9 = 1864;
                            while (true) {
                                i9 ^= 1881;
                                switch (i9) {
                                    case 17:
                                        i9 = i8 < size2 ? 48736 : 48705;
                                    case 47384:
                                        i = i7;
                                        break;
                                    case 47417:
                                        C0127lK c0127lK = c0116dXM654b.get(i8);
                                        int i10 = 48767;
                                        while (true) {
                                            i10 ^= 48784;
                                            switch (i10) {
                                                case 14:
                                                case 45:
                                                    String strM653a = c0127lK.m653a();
                                                    int i11 = 49666;
                                                    while (true) {
                                                        i11 ^= 49683;
                                                        switch (i11) {
                                                            case 17:
                                                                i11 = i7 == -1 ? 49759 : 49728;
                                                            case 50:
                                                            case 76:
                                                                Matcher matcher = this.f275Mo.matcher(c0127lK.mo126QU(strM851));
                                                                boolean zFind = matcher.find();
                                                                int i12 = 49790;
                                                                while (true) {
                                                                    i12 ^= 49807;
                                                                    switch (i12) {
                                                                        case 18:
                                                                        case 51:
                                                                            i = 0;
                                                                            break;
                                                                        case 84:
                                                                            i = Integer.parseInt(matcher.group(1)) - 1;
                                                                            int i13 = 49914;
                                                                            while (true) {
                                                                                i13 ^= 49931;
                                                                                switch (i13) {
                                                                                    case 497:
                                                                                        i13 = 50596;
                                                                                    case 1711:
                                                                                        break;
                                                                                }
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 241:
                                                                            i12 = zFind ? 49883 : 49852;
                                                                    }
                                                                }
                                                                break;
                                                            case 83:
                                                                i = i7;
                                                                break;
                                                        }
                                                    }
                                                    boolean zEquals = strM653a.equals(C0168.m805(f864short, 255, 3, 2804));
                                                    int i14 = 50689;
                                                    while (true) {
                                                        i14 ^= 50706;
                                                        switch (i14) {
                                                            case 19:
                                                                i14 = zEquals ? 50782 : 50751;
                                                            case 45:
                                                                break;
                                                            case 50:
                                                            case 76:
                                                                Matcher matcher2 = this.f278i.matcher(strM483F);
                                                                boolean zFind2 = matcher2.find();
                                                                int i15 = 50813;
                                                                while (true) {
                                                                    i15 ^= 50830;
                                                                    switch (i15) {
                                                                        case 18:
                                                                        case 53:
                                                                            break;
                                                                        case 243:
                                                                            i15 = zFind2 ? 51557 : 50875;
                                                                        case 4075:
                                                                            int i16 = Integer.parseInt(matcher2.group(1));
                                                                            int i17 = 51588;
                                                                            while (true) {
                                                                                i17 ^= 51605;
                                                                                switch (i17) {
                                                                                    case 17:
                                                                                        i17 = 51619;
                                                                                        continue;
                                                                                    case 54:
                                                                                        i2 = i;
                                                                                        i3 = i16;
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                }
                                                                            }
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 76:
                                                    int i18 = 48891;
                                                    while (true) {
                                                        i18 ^= 48908;
                                                        switch (i18) {
                                                            case 22:
                                                                break;
                                                            case 503:
                                                                i18 = 48922;
                                                        }
                                                        i = i7;
                                                        break;
                                                    }
                                                    break;
                                                case 239:
                                                    i10 = c0127lK == null ? 48860 : 48829;
                                            }
                                        }
                                        int i19 = i8 + 1;
                                        int i20 = 51712;
                                        while (true) {
                                            i20 ^= 51729;
                                            switch (i20) {
                                                case 17:
                                                    i20 = 51743;
                                                    break;
                                            }
                                        }
                                        i8 = i19;
                                        i7 = i;
                                        break;
                                    case 47483:
                                }
                            }
                        }
                        i2 = i;
                        i3 = 0;
                        break;
                }
            }
            JSONArray jSONArray = new JSONArray();
            boolean zContains = strM483F.contains(C0180.m851(f864short, 258, 11, 2817));
            int i21 = 51836;
            while (true) {
                i21 ^= 51853;
                switch (i21) {
                    case 241:
                        i21 = !zContains ? 52580 : 52549;
                    case 1963:
                    case 1992:
                        break;
                    case 2025:
                        C0116dX c0116dXM654b2 = c0082ooM440q.m654b(C0182.m861(f864short, 269, 26, 1859));
                        int i22 = 0;
                        while (true) {
                            int size3 = c0116dXM654b2.size();
                            int i23 = 52611;
                            while (true) {
                                i23 ^= 52628;
                                switch (i23) {
                                    case 23:
                                        i23 = i22 < size3 ? 52704 : 52673;
                                    case 54:
                                    case 85:
                                        break;
                                    case 116:
                                        C0127lK c0127lK2 = c0116dXM654b2.get(i22);
                                        String strMo126QU = c0127lK2.mo126QU(C0183.m866(f864short, 295, 5, 2020));
                                        String strM595q = c0127lK2.m654b(C0165.m798(f864short, 300, 3, 1426)).m595q(C0170.m814(f864short, 303, 3, 1470));
                                        String strM596u = c0127lK2.m654b(C0166.m801(f864short, 306, 15, 793)).m596u();
                                        Matcher matcher3 = this.f277UJ.matcher(c0127lK2.mo126QU(strM851));
                                        boolean zFind3 = matcher3.find();
                                        int i24 = 52735;
                                        while (true) {
                                            i24 ^= 52752;
                                            switch (i24) {
                                                case 14:
                                                case 45:
                                                    String strGroup = matcher3.group(1);
                                                    JSONObject jSONObject2 = new JSONObject();
                                                    jSONObject2.put(C0174.m828(f864short, 321, 6, 2232), strGroup);
                                                    jSONObject2.put(C0178.m845(f864short, 327, 8, 2783), strMo126QU);
                                                    jSONObject2.put(C0172.m820(f864short, 335, 7, 333), f273q + strM595q.replace(C0178.m845(f864short, 342, 2, 1201), ""));
                                                    jSONObject2.put(C0170.m814(f864short, 344, 11, 1162), strM596u);
                                                    jSONArray.put(jSONObject2);
                                                    break;
                                                case 1007:
                                                    i24 = !zFind3 ? 53479 : 52797;
                                                case 7927:
                                                    int i25 = 53510;
                                                    while (true) {
                                                        i25 ^= 53527;
                                                        switch (i25) {
                                                            case 17:
                                                                i25 = 53541;
                                                            case 50:
                                                                break;
                                                        }
                                                        break;
                                                    }
                                            }
                                        }
                                        int i26 = i22 + 1;
                                        int i27 = 53634;
                                        while (true) {
                                            i27 ^= 53651;
                                            switch (i27) {
                                                case 17:
                                                    i27 = 53665;
                                                    break;
                                                case 50:
                                                    break;
                                            }
                                        }
                                        i22 = i26;
                                        break;
                                }
                                break;
                            }
                        }
                }
            }
            jSONObject.put(C0177.m841(f864short, 355, 4, 905), i2);
            jSONObject.put(C0168.m805(f864short, 359, 9, 3179), i3);
            jSONObject.put(C0176.m836(f864short, 368, 5, 2527), 24);
            String strM801 = C0166.m801(f864short, 373, 5, 1542);
            int i28 = 53758;
            while (true) {
                i28 ^= 53775;
                switch (i28) {
                    case 1009:
                        if (i3 > 1) {
                            break;
                        } else {
                            i28 = 54502;
                        }
                    case 1703:
                        break;
                    case 1736:
                        length = i3 * 24;
                        break;
                    case 1769:
                        length = jSONArray.length();
                        int i29 = 54533;
                        while (true) {
                            i29 ^= 54550;
                            switch (i29) {
                                case 19:
                                    i29 = 54564;
                                    break;
                                case 50:
                                    break;
                            }
                        }
                        break;
                    default:
                        continue;
                }
                i28 = 54471;
            }
            jSONObject.put(strM801, length);
            jSONObject.put(C0183.m866(f864short, 378, 4, 638), jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0194. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x0239. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x013e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:83:0x0364. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:96:0x0399. Please report as an issue. */
    public String detailContent(List<String> list) throws JSONException {
        String strM861 = C0182.m861(f864short, 382, 2, 1164);
        try {
            Init.m46lj();
            StringBuilder sb = new StringBuilder();
            sb.append(f273q);
            sb.append(C0179.m849(f864short, 384, 23, 1849));
            int i = 0;
            sb.append(list.get(0));
            C0082OO c0082ooM440q = C0093Tt.m440q(C0106ZJ.m483F(sb.toString(), m105q("")));
            String strM483F = C0106ZJ.m483F(f273q + C0180.m851(f864short, 407, 21, 1355) + list.get(0) + C0176.m836(f864short, 428, 55, 1826) + f273q.replace(C0165.m798(f864short, 483, 7, 875), "").replace(C0176.m836(f864short, 490, 8, 1650), "").split(C0170.m814(f864short, 498, 1, 3205))[0], m105q(""));
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String strMo126QU = c0082ooM440q.m654b(C0176.m836(f864short, 499, 3, 750)).get(1).mo126QU(C0177.m841(f864short, 502, 3, 2299));
            String strM653a = c0082ooM440q.m654b(C0180.m851(f864short, 505, 1, 1834)).get(1).m653a();
            C0116dX c0116dXM654b = c0082ooM440q.m654b(C0170.m814(f864short, 506, 2, 1968)).get(1).m654b(C0176.m836(f864short, 508, 2, 2510));
            int i2 = 0;
            while (true) {
                int size = c0116dXM654b.size();
                int i3 = 1616;
                while (true) {
                    i3 ^= 1633;
                    switch (i3) {
                        case 14:
                        case 49:
                            i3 = i2 < size ? 1709 : 1678;
                        case 204:
                            C0127lK c0127lK = c0116dXM654b.get(i2);
                            int i4 = 1740;
                            while (true) {
                                i4 ^= 1757;
                                switch (i4) {
                                    case 17:
                                        i4 = c0127lK != null ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case 500:
                                        String strM653a2 = c0127lK.m653a();
                                        boolean zContains = strM653a2.contains(strM861);
                                        int i5 = 1864;
                                        while (true) {
                                            i5 ^= 1881;
                                            switch (i5) {
                                                case 17:
                                                    i5 = zContains ? 48736 : 48705;
                                                case 47384:
                                                    boolean zContains2 = strM653a2.contains(strM861);
                                                    int i6 = 48891;
                                                    while (true) {
                                                        i6 ^= 48908;
                                                        switch (i6) {
                                                            case 22:
                                                            case 53:
                                                                boolean zContains3 = strM653a2.contains(C0177.m841(f864short, 531, 2, 2321));
                                                                int i7 = 49790;
                                                                while (true) {
                                                                    i7 ^= 49807;
                                                                    switch (i7) {
                                                                        case 18:
                                                                        case 51:
                                                                            boolean zContains4 = strM653a2.contains(C0171.m816(f864short, 547, 2, 449));
                                                                            int i8 = 50689;
                                                                            while (true) {
                                                                                i8 ^= 50706;
                                                                                switch (i8) {
                                                                                    case 19:
                                                                                        i8 = zContains4 ? 50782 : 50751;
                                                                                    case 45:
                                                                                        break;
                                                                                    case 50:
                                                                                    case 76:
                                                                                        jSONObject2.put(C0177.m841(f864short, 549, 8, 434), strM653a2.trim());
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 84:
                                                                            jSONObject2.put(C0177.m841(f864short, 533, 10, 1406), c0127lK.m654b(C0168.m805(f864short, 543, 4, 2390)).m596u().trim());
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
                                                                            break;
                                                                        case 241:
                                                                            i7 = zContains3 ? 49883 : 49852;
                                                                    }
                                                                }
                                                                break;
                                                            case 503:
                                                                i6 = zContains2 ? 49635 : 48953;
                                                            case 32495:
                                                                jSONObject2.put(C0166.m801(f864short, 522, 9, 899), strM653a2.trim());
                                                                int i10 = 49666;
                                                                while (true) {
                                                                    i10 ^= 49683;
                                                                    switch (i10) {
                                                                        case 17:
                                                                            i10 = 49697;
                                                                        case 50:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 47417:
                                                    jSONObject2.put(C0183.m866(f864short, 510, 12, 2327), strM653a2.trim());
                                                    int i11 = 48767;
                                                    while (true) {
                                                        i11 ^= 48784;
                                                        switch (i11) {
                                                            case 14:
                                                                break;
                                                            case 239:
                                                                i11 = 48798;
                                                        }
                                                        break;
                                                    }
                                                case 47483:
                                            }
                                        }
                                        break;
                                }
                            }
                            int i12 = i2 + 1;
                            int i13 = 50813;
                            while (true) {
                                i13 ^= 50830;
                                switch (i13) {
                                    case 18:
                                        break;
                                    case 243:
                                        i13 = 50844;
                                        break;
                                }
                            }
                            i2 = i12;
                            break;
                        case 239:
                            break;
                    }
                    String strTrim = c0082ooM440q.m654b(C0182.m861(f864short, 557, 3, 3132)).get(14).m653a().trim();
                    jSONObject2.put(C0175.m834(f864short, 560, 6, 2542), list.get(0));
                    jSONObject2.put(C0170.m814(f864short, 566, 8, 1363), strM653a);
                    jSONObject2.put(C0178.m845(f864short, 574, 7, 482), f273q + strMo126QU.replace(C0172.m820(f864short, 581, 2, 718), ""));
                    jSONObject2.put(C0166.m801(f864short, 583, 11, 1358), C0172.m820(f864short, 594, 16, 1039) + strTrim);
                    Matcher matcher = Pattern.compile(C0172.m820(f864short, 610, 27, 2450)).matcher(strM483F);
                    boolean zFind = matcher.find();
                    int i14 = 51588;
                    while (true) {
                        i14 ^= 51605;
                        switch (i14) {
                            case 17:
                                if (zFind) {
                                    break;
                                } else {
                                    i14 = 51681;
                                }
                            case 54:
                                break;
                            case 87:
                                ArrayList arrayList = new ArrayList();
                                while (true) {
                                    boolean zFind2 = matcher.find();
                                    int i15 = 51712;
                                    while (true) {
                                        i15 ^= 51729;
                                        switch (i15) {
                                            case 14:
                                            case 17:
                                                i15 = zFind2 ? 51805 : 51774;
                                            case 47:
                                                break;
                                            case 76:
                                                arrayList.add(matcher.group(1));
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
                                        StringBuilder sb2 = new StringBuilder();
                                        while (true) {
                                            int size2 = arrayList.size();
                                            int i17 = 52611;
                                            while (true) {
                                                i17 ^= 52628;
                                                switch (i17) {
                                                    case 23:
                                                        i17 = i < size2 ? 52704 : 52673;
                                                    case 54:
                                                    case 85:
                                                        break;
                                                    case 116:
                                                        int i18 = 52735;
                                                        while (true) {
                                                            i18 ^= 52752;
                                                            switch (i18) {
                                                                case 14:
                                                                case 45:
                                                                    break;
                                                                case 1007:
                                                                    i18 = i > 0 ? 53479 : 52797;
                                                                case 7927:
                                                                    sb2.append(C0170.m814(f864short, 637, 1, 1563));
                                                                    break;
                                                            }
                                                        }
                                                        int i19 = i + 1;
                                                        sb2.append(i19);
                                                        sb2.append(C0177.m841(f864short, 638, 1, 434));
                                                        sb2.append((String) arrayList.get(i));
                                                        int i20 = 53510;
                                                        while (true) {
                                                            i20 ^= 53527;
                                                            switch (i20) {
                                                                case 17:
                                                                    i20 = 53541;
                                                                    break;
                                                                case 50:
                                                                    break;
                                                            }
                                                        }
                                                        i = i19;
                                                        break;
                                                }
                                                jSONObject2.put(C0182.m861(f864short, 639, 13, 2538), C0181.m856(f864short, 652, 2, 2910));
                                                jSONObject2.put(C0177.m841(f864short, 654, 12, 2435), sb2);
                                                JSONArray jSONArray = new JSONArray();
                                                jSONArray.put(jSONObject2);
                                                jSONObject.put(C0181.m856(f864short, 666, 4, 1340), jSONArray);
                                                return jSONObject.toString();
                                            }
                                        }
                                    }
                                }
                                break;
                            case 116:
                                return "";
                            default:
                                continue;
                        }
                        i14 = 51650;
                    }
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:57:0x0147. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:62:0x0184. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:77:0x01e5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x005a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:91:0x026e. Please report as an issue. */
    public String homeContent(boolean z) throws JSONException {
        C0116dX c0116dXM654b;
        JSONArray jSONArray;
        int i;
        try {
            C0082OO c0082ooM440q = C0093Tt.m440q(C0106ZJ.m483F(f273q + C0172.m820(f864short, 670, 14, 1637), m105q("")));
            C0116dX c0116dXM654b2 = c0082ooM440q.m654b(C0168.m805(f864short, 684, 14, 2911));
            JSONArray jSONArray2 = new JSONArray();
            Iterator<C0127lK> it = c0116dXM654b2.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                String strM845 = C0178.m845(f864short, 698, 4, 2440);
                boolean z2 = false;
                int i2 = 1616;
                while (true) {
                    i2 ^= 1633;
                    switch (i2) {
                        case 14:
                        case 49:
                            i2 = zHasNext ? 1709 : 1678;
                        case 204:
                            C0127lK next = it.next();
                            String strM596u = next.m654b(C0166.m801(f864short, 702, 6, 3167)).m596u();
                            boolean zEquals = strM596u.equals(C0178.m845(f864short, 708, 2, 2496));
                            int i3 = 1740;
                            while (true) {
                                i3 ^= 1757;
                                switch (i3) {
                                    case 17:
                                        i3 = !zEquals ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case 500:
                                        boolean zEquals2 = strM596u.equals(C0177.m841(f864short, 710, 3, 1049));
                                        int i4 = 1864;
                                        while (true) {
                                            i4 ^= 1881;
                                            switch (i4) {
                                                case 17:
                                                    i4 = !zEquals2 ? 48736 : 48705;
                                                case 47384:
                                                    break;
                                                case 47417:
                                                    boolean zEquals3 = strM596u.equals(C0180.m851(f864short, 713, 2, 2491));
                                                    int i5 = 48767;
                                                    while (true) {
                                                        i5 ^= 48784;
                                                        switch (i5) {
                                                            case 14:
                                                            case 45:
                                                                break;
                                                            case 76:
                                                                boolean zEquals4 = strM596u.equals(C0168.m805(f864short, 715, 2, 2406));
                                                                int i6 = 48891;
                                                                while (true) {
                                                                    i6 ^= 48908;
                                                                    switch (i6) {
                                                                        case 22:
                                                                        case 53:
                                                                            break;
                                                                        case 503:
                                                                            i6 = zEquals4 ? 49635 : 48953;
                                                                        case 32495:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 239:
                                                                i5 = !zEquals3 ? 48860 : 48829;
                                                        }
                                                    }
                                                    break;
                                                case 47483:
                                            }
                                        }
                                        break;
                                }
                            }
                            z2 = true;
                            int i7 = 49666;
                            while (true) {
                                i7 ^= 49683;
                                switch (i7) {
                                    case 17:
                                        i7 = z2 ? 49759 : 49728;
                                    case 50:
                                    case 76:
                                        Matcher matcher = this.f276QU.matcher(next.mo126QU(strM845));
                                        boolean zFind = matcher.find();
                                        int i8 = 49790;
                                        while (true) {
                                            i8 ^= 49807;
                                            switch (i8) {
                                                case 18:
                                                case 51:
                                                    String strTrim = matcher.group(1).trim();
                                                    JSONObject jSONObject = new JSONObject();
                                                    jSONObject.put(C0168.m805(f864short, 717, 7, 2544), strTrim);
                                                    jSONObject.put(C0183.m866(f864short, 724, 9, 1573), strM596u);
                                                    jSONArray2.put(jSONObject);
                                                    int i9 = 50689;
                                                    while (true) {
                                                        i9 ^= 50706;
                                                        switch (i9) {
                                                            case 19:
                                                                i9 = 50720;
                                                            case 50:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 84:
                                                    int i10 = 49914;
                                                    while (true) {
                                                        i10 ^= 49931;
                                                        switch (i10) {
                                                            case 497:
                                                                i10 = 50596;
                                                            case 1711:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 241:
                                                    i8 = !zFind ? 49883 : 49852;
                                            }
                                        }
                                        break;
                                    case 83:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            break;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    int i11 = 50813;
                    while (true) {
                        i11 ^= 50830;
                        switch (i11) {
                            case 18:
                                break;
                            case 53:
                                break;
                            case 243:
                                if (!z) {
                                    break;
                                } else {
                                    i11 = 51557;
                                }
                            case 4075:
                                jSONObject2.put(C0170.m814(f864short, 733, 7, 2885), this.f280xC);
                                break;
                            default:
                                continue;
                        }
                        i11 = 50875;
                    }
                    jSONObject2.put(C0181.m856(f864short, 740, 5, 572), jSONArray2);
                    try {
                        c0116dXM654b = c0082ooM440q.m654b(C0179.m849(f864short, 745, 16, 1192));
                        jSONArray = new JSONArray();
                        i = 0;
                    } catch (Exception e) {
                        SpiderDebug.log(e);
                    }
                    while (true) {
                        int size = c0116dXM654b.size();
                        int i12 = 51588;
                        while (true) {
                            i12 ^= 51605;
                            switch (i12) {
                                case 17:
                                    i12 = i < size ? 51681 : 51650;
                                case 54:
                                case 87:
                                    break;
                                case 116:
                                    C0127lK c0127lK = c0116dXM654b.get(i);
                                    String strM596u2 = c0127lK.m654b(C0177.m841(f864short, 761, 6, 1923)).m596u();
                                    String strM595q = c0127lK.m654b(C0175.m834(f864short, 767, 5, 1681)).m595q(C0181.m856(f864short, 772, 3, 1963));
                                    String strM801 = C0166.m801(f864short, 775, 4, 1447);
                                    Matcher matcher2 = this.f277UJ.matcher(c0127lK.m654b(C0171.m816(f864short, 779, 1, 1163)).m595q(strM845));
                                    boolean zFind2 = matcher2.find();
                                    int i13 = 51712;
                                    while (true) {
                                        i13 ^= 51729;
                                        switch (i13) {
                                            case 14:
                                            case 17:
                                                i13 = !zFind2 ? 51805 : 51774;
                                            case 47:
                                                String strGroup = matcher2.group(1);
                                                JSONObject jSONObject3 = new JSONObject();
                                                jSONObject3.put(C0181.m856(f864short, 780, 6, 1832), strGroup);
                                                jSONObject3.put(C0183.m866(f864short, 786, 8, 2961), strM596u2);
                                                jSONObject3.put(C0180.m851(f864short, 794, 7, 1823), f273q + strM595q.replace(C0174.m828(f864short, 801, 2, 2090), ""));
                                                jSONObject3.put(C0165.m798(f864short, 803, 11, 1434), strM801);
                                                jSONArray.put(jSONObject3);
                                                break;
                                            case 76:
                                                int i14 = 51836;
                                                while (true) {
                                                    i14 ^= 51853;
                                                    switch (i14) {
                                                        case 241:
                                                            i14 = 52518;
                                                        case 1963:
                                                            break;
                                                    }
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                    int i15 = i + 1;
                                    int i16 = 52611;
                                    while (true) {
                                        i16 ^= 52628;
                                        switch (i16) {
                                            case 23:
                                                i16 = 52642;
                                                break;
                                            case 54:
                                                break;
                                        }
                                    }
                                    i = i15;
                                    break;
                            }
                            jSONObject2.put(C0176.m836(f864short, 814, 4, 2117), jSONArray);
                            int i17 = 52735;
                            while (true) {
                                i17 ^= 52752;
                                switch (i17) {
                                    case 14:
                                        break;
                                    case 1007:
                                        i17 = 52766;
                                        break;
                                }
                            }
                        }
                        return jSONObject2.toString();
                    }
                }
            }
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    public void init(Context context, String str) {
        String strM724Mo = null;
        String str2 = "ۤۡۧ";
        while (true) {
            switch (C0174.m829(str2)) {
                case 56382:
                    strM724Mo = C0152vp.m724Mo(str);
                    str2 = "ۣۢۦ";
                    break;
                case 1750631:
                    f273q = strM724Mo;
                    str2 = "ۥۧ۟";
                    break;
                case 1752701:
                    return;
                default:
                    super.init(context);
                    str2 = "ۢ۠";
                    break;
            }
        }
    }

    public String playerContent(String str, String str2, List<String> list) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0176.m836(f864short, 818, 5, 517), 0);
            jSONObject.put(C0165.m798(f864short, 823, 3, 1133), str2);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* renamed from: q */
    protected HashMap<String, String> m105q(String str) {
        String str2 = "ۨۤۥ";
        String strM809 = null;
        String strM805 = null;
        HashMap<String, String> map = null;
        short[] sArr = null;
        while (true) {
            switch (C0174.m829(str2)) {
                case 56420:
                    str2 = "ۧۡۢ";
                    sArr = f864short;
                    break;
                case 1748865:
                    str2 = "ۨ۠ۧ";
                    strM805 = C0168.m805(sArr, 836, 111, 689);
                    break;
                case 1749637:
                    return map;
                case 1753516:
                    str2 = "ۡۧۧ";
                    sArr = f864short;
                    break;
                case 1755375:
                    map.put(strM809, strM805);
                    str2 = "ۢۡۤ";
                    break;
                case 1755497:
                    str2 = "ۣۧ";
                    map = new HashMap<>();
                    break;
                default:
                    strM809 = C0169.m809(sArr, 826, 10, 535);
                    str2 = "ۦۢۨ";
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x00be. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x012d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0085. Please report as an issue. */
    public String searchContent(String str, boolean z) throws JSONException {
        try {
            C0082OO c0082ooM440q = C0093Tt.m440q(C0106ZJ.m483F(f273q + C0176.m836(f864short, 947, 25, 3117) + URLEncoder.encode(str, C0176.m836(f864short, 972, 6, 1275)) + C0177.m841(f864short, 978, 11, 1145), m105q("")));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            C0116dX c0116dXM654b = c0082ooM440q.m654b(C0176.m836(f864short, 989, 2, 1154)).get(5).m654b(C0168.m805(f864short, 991, 4, 1674));
            int i = 0;
            while (true) {
                int i2 = i;
                int size = c0116dXM654b.size();
                int i3 = 1616;
                while (true) {
                    i3 ^= 1633;
                    switch (i3) {
                        case 14:
                        case 49:
                            i3 = i2 < size ? 1709 : 1678;
                        case 204:
                            C0127lK c0127lK = c0116dXM654b.get(i2);
                            String strMo126QU = c0127lK.mo126QU(C0178.m845(f864short, 995, 5, 753));
                            boolean zContains = strMo126QU.contains(str);
                            int i4 = 1740;
                            while (true) {
                                i4 ^= 1757;
                                switch (i4) {
                                    case 17:
                                        i4 = !zContains ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        String strM595q = c0127lK.m654b(C0177.m841(f864short, 1000, 3, 378)).m595q(C0166.m801(f864short, 1003, 3, 2745));
                                        String strM596u = c0127lK.m654b(C0169.m809(f864short, 1006, 15, 2367)).m596u();
                                        Matcher matcher = this.f277UJ.matcher(c0127lK.mo126QU(C0165.m798(f864short, 1021, 4, 418)));
                                        boolean zFind = matcher.find();
                                        int i5 = 48767;
                                        while (true) {
                                            i5 ^= 48784;
                                            switch (i5) {
                                                case 14:
                                                case 45:
                                                    String strGroup = matcher.group(1);
                                                    JSONObject jSONObject2 = new JSONObject();
                                                    jSONObject2.put(C0171.m816(f864short, 1025, 6, 1565), strGroup);
                                                    jSONObject2.put(C0168.m805(f864short, 1031, 8, 2644), strMo126QU);
                                                    jSONObject2.put(C0175.m834(f864short, 1039, 7, 979), f273q + strM595q.replace(C0183.m866(f864short, 1046, 2, 2816), ""));
                                                    jSONObject2.put(C0176.m836(f864short, 1048, 11, 887), strM596u);
                                                    jSONArray.put(jSONObject2);
                                                    break;
                                                case 76:
                                                    int i6 = 48891;
                                                    while (true) {
                                                        i6 ^= 48908;
                                                        switch (i6) {
                                                            case 22:
                                                                break;
                                                            case 503:
                                                                i6 = 48922;
                                                        }
                                                        break;
                                                    }
                                                case 239:
                                                    i5 = !zFind ? 48860 : 48829;
                                            }
                                        }
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
                                            break;
                                        }
                                        break;
                                }
                            }
                            i = i2 + 1;
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
                            break;
                        case 239:
                            break;
                    }
                    jSONObject.put(C0179.m849(f864short, 1059, 4, 398), jSONArray);
                    return jSONObject.toString();
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
