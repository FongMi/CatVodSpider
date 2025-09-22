package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0165;
import com.github.catvod.parser.C0166;
import com.github.catvod.spider.merge.C0082OO;
import com.github.catvod.spider.merge.C0093Tt;
import com.github.catvod.spider.merge.C0106ZJ;
import com.github.catvod.spider.merge.C0116dX;
import com.github.catvod.spider.merge.C0127lK;
import com.github.catvod.spider.merge.C0168;
import com.github.catvod.spider.merge.C0169;
import com.github.catvod.spider.merge.C0170;
import com.github.catvod.spider.merge.C0171;
import com.github.catvod.spider.merge.C0172;
import com.github.catvod.spider.merge.C0174;
import com.github.catvod.spider.merge.C0175;
import com.github.catvod.spider.merge.C0176;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Dygang Spider - A readable version for video content crawling
 * This spider handles content from Dygang movie site
 */
public class Dygang extends Spider {

    // Encryption keys array for string decoding
    private static final short[] ENCRYPTION_KEYS = {629, 626, 518, 521, 625, 627, 629, 3227, 3311, 3296, 3224, 3226, 500, 427, 439, 442, 418, 500, 499, 391, 392, 496, 498, 500, 934, 1008, 1018, 934, 992, 999, 1005, 1004, 1009, 982, 929, 981, 1005, 930, 928, 935, 993, 1021, 996, 1031, 1030, 1044, 1151, 1130, 564, 561, 609, 608, 610, 609, 1549, 1545, 1539, 1707, 1719, 1719, 1715, 1712, 1785, 1772, 1772, 1716, 1716, 1716, 1773, 1703, 1722, 1700, 1698, 1709, 1700, 1773, 1719, 1717, 1772, 323, 261, 258, 264, 265, 276, 322, 260, 280, 257, 3198, 3128, 3135, 3125, 3124, 3113, 3086, 1937, 2007, 1995, 2002, 1936, 1920, 1988, 1925, 1983, 1932, 1942, 1921, 1922, 1998, 2009, 1987, 1933, 1930, 1920, 1921, 1948, 1979, 1987, 1977, 1789, 1767, 1776, 1779, 720, 23457, -24598, 25635, 28555, 27388, 23218, 26666, 26737, -32509, 32262, 30289, 28446, 23652, 2149, 2160, 2163, 2173, 2164, 2111, 2163, 2174, 2147, 2165, 2164, 2147, 2080, 2097, 2160, 2594, 2607, 2615, 1207, 1206, 1191, 31162, 21472, 1728, 1753, 1746, 1769, 1759, 1746, 1503, 1478, 1485, 1526, 1479, 1480, 1476, 1484, 2452, 2445, 2438, 2493, 2450, 2443, 2433, 1402, 1379, 1384, 1363, 1406, 1385, 1377, 1389, 1406, 1383, 1407, 2708, 2693, 2691, 2689, 758, 743, 737, 739, 741, 745, 755, 744, 754, 986, 991, 987, 991, 962, 2053, 2078, 2053, 2064, 2077, 425, 428, 438, 433, 2881, 2909, 2909, 2905, 2906, 2835, 2822, 2822, 2910, 2910, 2910, 2823, 2893, 2896, 2894, 2888, 2887, 2894, 2823, 2909, 2911, 2762, 2778, 2717, 2778, 2779, 2778, 2779, 2785, 2781, 2769, 2768, 2762, 2779, 2768, 2762, 2718, 2775, 2771, 2777, 2512, 2513, 2496, 718, 707, 732, 644, 734, 707, 734, 710, 719, 650, 715, 2440, 2449, 2458, 2465, 2455, 2458, 609, 632, 627, 584, 633, 630, 634, 626, 3057, 3048, 3043, 3032, 3063, 3054, 3044, 1706, 1722, 1790, 1760, 1790, 1727, 1669, 1718, 1708, 1723, 1720, 1780, 1763, 1785, 1715, 1727, 1721, 1712, 1723, 1706, 1785, 1667, 530, 608, 1905, 630, 620, 635, 632, 3060, 1344, 1369, 1362, 1385, 1350, 1370, 1367, 1359, 1385, 1360, 1348, 1369, 1371, 31907, 22247, 26553, 1140, 1133, 1126, 1117, 1138, 1134, 1123, 1147, 1117, 1143, 1136, 1134, 618, 623, 629, 626, 2945, 2949, 2959, 1683, 1679, 1679, 1675, 1672, 1729, 1748, 1748, 1676, 1676, 1676, 1749, 1695, 1666, 1692, 1690, 1685, 1692, 1749, 1679, 1677, 1583, 1599, 1621, 1561, 1564, 1622, 1565, 1559, 1566, 1566, 1551, 1627, 1562, 2785, 2811, 2796, 2799, 20585, 21747, 27557, 26901, 31120, 21460, 30622, 22569, -27767, 26452, 24289, -26287, 32041, 22381, 30265, 22926, 26329, 31409, 3198, 3073, -26990, 25167, 24432, -27854, 26607, 23157, 32562, 28623, -25149, 22605, 30469, 23276, 29321, -29169, 21519, 27020, 2093, 2138, 32043, 22383, 30697, 22038, 31492, 2478, 2467, 2474, 2495, 2437, 2483, 2494, 2005, 2008, 2001, 1988, 2046, 1999, 1984, 1996, 1988, 2549, 2554, 2559, 2535, 2550, 2529, 2528, 1569, 1582, 1571, 1585, 1585, 1899, 1918, 1917, 1907, 1914, 1841, 1917, 1904, 1901, 1915, 1914, 1901, 1838, 1855, 1918, 1779, 1790, 1766, 1874, 1875, 1858, 31364, 20702, 1871, 1878, 1885, 1894, 1872, 1885, 2546, 2539, 2528, 2523, 2538, 2533, 2537, 2529, 1965, 1972, 1983, 1924, 1963, 1970, 1976, 2031, 2038, 2045, 1990, 2027, 2044, 2036, 2040, 2027, 2034, 2026, 843, 846, 852, 851, 1070, 1143, 1069, 1074, 1034, 1076, 1061, 1061, 1034, 1061, 1081, 1076, 1068, 1072, 1063, 1143, 1135, 1070, 1143, 1062, 1085, 1082, 1058, 1143, 1135, 1143, 1076, 1061, 1061, 21821, 22549, -29258, 25541, 1143, 1145, 1143, 1073, 1072, 1062, 1143, 1135, 1143, 1143, 1145, 1143, 1061, 1062, 1143, 1135, 1143, 1124, 1143, 1145, 1143, 1061, 1076, 1063, 1062, 1072, 1143, 1135, 1143, 1085, 1057, 1057, 1061, 1062, 1135, 1033, 1146, 1033, 1146, 1058, 1058, 1058, 1147, 1069, 1144, 1083, 1147, 1078, 1078, 1033, 1146, 1076, 1061, 1084, 1147, 1061, 1085, 1061, 1130, 1056, 1063, 1081, 1128, 1143, 1064, 1145, 1143, 1061, 1061, 1076, 1068, 1056, 1083, 1127, 1143, 1135, 1070, 1143, 1062, 1085, 1082, 1058, 1143, 1135, 1143, 19014, 31466, 13332, 1143, 1145, 1143, 1073, 1072, 1062, 1143, 1135, 1143, 1061, 1061, 19140, 1143, 1145, 1143, 1061, 1062, 1143, 1135, 1143, 1125, 1143, 1145, 1143, 1061, 1076, 1063, 1062, 1072, 1143, 1135, 1143, 1085, 1057, 1057, 1061, 1062, 1135, 1033, 1146, 1033, 1146, 1076, 1061, 1061, 1147, 1079, 1076, 1083, 1058, 1081, 1147, 1078, 1082, 1080, 1033, 1146, 1062, 1057, 1076, 1057, 1084, 1078, 1033, 1146, 1061, 1081, 1076, 1068, 1072, 1063, 1033, 1146, 1130, 1056, 1063, 1081, 1128, 1143, 1064, 1145, 1143, 1061, 1061, 1076, 1068, 1056, 1083, 1143, 1135, 1070, 1143, 1062, 1085, 1082, 1058, 1143, 1135, 1143, 19029, 31466, 13332, 1143, 1145, 1143, 1073, 1072, 1062, 1143, 1135, 1143, 1061, 1061, 19140, 1143, 1145, 1143, 1061, 1062, 1143, 1135, 1143, 1125, 1143, 1145, 1143, 1061, 1076, 1063, 1062, 1072, 1143, 1135, 1143, 1085, 1057, 1057, 1061, 1062, 1135, 1033, 1146, 1033, 1146, 1076, 1061, 1061, 1147, 1079, 1076, 1083, 1058, 1081, 1147, 1078, 1082, 1080, 1033, 1146, 1062, 1057, 1076, 1057, 1084, 1078, 1033, 1146, 1061, 1081, 1076, 1068, 1072, 1063, 1033, 1146, 1130, 1056, 1063, 1081, 1128, 1143, 1064, 1145, 1143, 1084, 1083, 1073, 1072, 1069, 1143, 1135, 1070, 1143, 1062, 1085, 1082, 1058, 1143, 1135, 1143, 20767, 30648, 19140, 1143, 1145, 1143, 1073, 1072, 1062, 1143, 1135, 1143, 1085, 1057, 1057, 1061, 1135, 1033, 1146, 1033, 1146, 1068, 1056, 1083, 1147, 1079, 1076, 1083, 1058, 1081, 1147, 1078, 1082, 1080, 1143, 1145, 1143, 1061, 1062, 1143, 1135, 1143, 1124, 1143, 1145, 1143, 1061, 1076, 1063, 1062, 1072, 1143, 1135, 1143, 1085, 1057, 1057, 1061, 1062, 1135, 1033, 1146, 1033, 1146, 1076, 1061, 1061, 1147, 1079, 1076, 1083, 1058, 1081, 1147, 1078, 1082, 1080, 1033, 1146, 1062, 1057, 1076, 1057, 1084, 1078, 1033, 1146, 1061, 1081, 1076, 1068, 1072, 1063, 1033, 1146, 1130, 1056, 1063, 1081, 1128, 1143, 1064, 1145, 1143, 1073, 1082, 1083, 1074, 1080, 1076, 1083, 1080, 1084, 1076, 1082, 1143, 1135, 1070, 1143, 1062, 1085, 1082, 1058, 1143, 1135, 1143, 22269, 27518, 20960, 1143, 1145, 1143, 1073, 1072, 1062, 1143, 1135, 1143, 1143, 1145, 1143, 1061, 1062, 1143, 1135, 1143, 1125, 1143, 1145, 1143, 1061, 1076, 1063, 1062, 1072, 1143, 1135, 1143, 1143, 1064, 1145, 1143, 1079, 1084, 1081, 1084, 1079, 1084, 1081, 1084, 1143, 1135, 1070, 1143, 1062, 1085, 1082, 1058, 1143, 1135, 1143, 1079, 1084, 1081, 1084, 1079, 1084, 1081, 1084, 1143, 1145, 1143, 1073, 1072, 1062, 1143, 1135, 1143, 1143, 1145, 1143, 1061, 1062, 1143, 1135, 1143, 1125, 1143, 1145, 1143, 1061, 1076, 1063, 1062, 1072, 1143, 1135, 1143, 1143, 1064, 1145, 1143, 1078, 1068, 1078, 1061, 1143, 1135, 1070, 1143, 1062, 1085, 1082, 1058, 1143, 1135, 1143, 22269, 27518, 13332, 1143, 1145, 1143, 1073, 1072, 1062, 1143, 1135, 1143, 1143, 1145, 1143, 1061, 1062, 1143, 1135, 1143, 1125, 1143, 1145, 1143, 1061, 1076, 1063, 1062, 1072, 1143, 1135, 1143, 1143, 1064, 1145, 1143, 1073, 1061, 1143, 1135, 1070, 1143, 1062, 1085, 1082, 1058, 1143, 1135, 1143, 23404, 23040, 1143, 1145, 1143, 1073, 1072, 1062, 1143, 1135, 1143, 1143, 1145, 1143, 1061, 1062, 1143, 1135, 1143, 1125, 1143, 1145, 1143, 1061, 1076, 1063, 1062, 1072, 1143, 1135, 1143, 1143, 1064, 1145, 1143, 1060, 1084, 1068, 1084, 1143, 1135, 1070, 1143, 1062, 1085, 1082, 1058, 1143, 1135, 1143, 30308, 23826, -31185, -29293, 1143, 1145, 1143, 1073, 1072, 1062, 1143, 1135, 1143, 1143, 1145, 1143, 1061, 1062, 1143, 1135, 1143, 1125, 1143, 1145, 1143, 1061, 1076, 1063, 1062, 1072, 1143, 1135, 1143, 1143, 1064, 1145, 1143, 1060, 1060, 1143, 1135, 1070, 1143, 1062, 1085, 1082, 1058, 1143, 1135, 1143, -31445, -28678, -29293, -25404, 1143, 1145, 1143, 1073, 1072, 1062, 1143, 1135, 1143, 1143, 1145, 1143, 1061, 1062, 1143, 1135, 1143, 1125, 1143, 1145, 1143, 1061, 1076, 1063, 1062, 1072, 1143, 1135, 1143, 1143, 1064, 1064, 2378, 2395, 2376, 2377, 2399, 1043, 1039, 1026, 1050, 1078, 1041, 1039, 984, 991, 961, 2344, 2336, 2353, 2349, 2346, 2337, 911, 909, 924, 3046, 3008, 3030, 3009, 2974, 3058, 3028, 3030, 3037, 3015, 2154, 2120, 2141, 2126, 2123, 2123, 2118, 2056, 2066, 2057, 2071, 2055, 2063, 2154, 2118, 2116, 2126, 2121, 2131, 2120, 2132, 2127, 2076, 2055, 2158, 2121, 2131, 2114, 2123, 2055, 2154, 2118, 2116, 2055, 2152, 2164, 2055, 2175, 2055, 2070, 2071, 2168, 2070, 2066, 2168, 2064, 2062, 2055, 2150, 2135, 2135, 2123, 2114, 2160, 2114, 2117, 2156, 2126, 2131, 2056, 2066, 2068, 2064, 2057, 2068, 2065, 2055, 2063, 2156, 2159, 2163, 2154, 2155, 2059, 2055, 2123, 2126, 2124, 2114, 2055, 2144, 2114, 2116, 2124, 2120, 2062, 2055, 2148, 2127, 2133, 2120, 2122, 2114, 2056, 2078, 2070, 2057, 2071, 2057, 2067, 2067, 2064, 2069, 2057, 2070, 2070, 2067, 2055, 2164, 2118, 2113, 2118, 2133, 2126, 2056, 2066, 2068, 2064, 2057, 2068, 2065, 2689, 2723, 2723, 2725, 2736, 2740, 640, 657, 652, 640, 731, 668, 640, 665, 664, 728, 661, 644, 644, 664, 669, 663, 661, 640, 669, 667, 666, 731, 652, 668, 640, 665, 664, 735, 652, 665, 664, 728, 661, 644, 644, 664, 669, 663, 661, 640, 669, 667, 666, 731, 652, 665, 664, 719, 645, 713, 708, 730, 717, 728, 669, 665, 661, 659, 657, 731, 661, 642, 669, 658, 728, 669, 665, 661, 659, 657, 731, 643, 657, 662, 644, 728, 669, 665, 661, 659, 657, 731, 661, 644, 666, 659, 728, 734, 731, 734, 719, 645, 713, 708, 730, 716, 728, 661, 644, 644, 664, 669, 663, 661, 640, 669, 667, 666, 731, 647, 669, 659, 666, 657, 656, 729, 657, 652, 663, 668, 661, 666, 659, 657, 719, 642, 713, 662, 711, 719, 645, 713, 708, 730, 717, 2615, 2581, 2581, 2579, 2566, 2562, 2651, 2618, 2583, 2584, 2577, 2563, 2583, 2577, 2579, 2477, 2495, 2554, 2452, 2457, 2555, 2477, 2495, 2540, 2470, 2538, 2535, 2553, 2542, 1553, 1580, 1591, 1593, 1591, 1584, 1860, 1880, 1880, 1884, 1887, 1814, 1795, 1795, 1883, 1883, 1883, 1794, 1864, 1877, 1867, 1869, 1858, 1867, 1794, 1880, 1882, 1702, 1698, 1704, 2642, 2647, 2637, 2634, 837, 857, 857, 861, 862, 791, 770, 770, 858, 858, 858, 771, 841, 852, 842, 844, 835, 842, 771, 857, 859, 770, 840, 770, 862, 840, 844, 863, 846, 837, 770, 836, 835, 841, 840, 853, 796, 799, 798, 771, 861, 837, 861, 2294, 2296, 2276, 2303, 2290, 2300, 2287, 2297, 2057, 2063, 2072, 2071, 2067, 2062, 25966, 345, 31824, 1558, 1549, 1546, 1554, 757, 744, 757, 749, 740, 685, 754, 748, 736, 749, 749, 757, 740, 761, 757, 1704, 1721, 1713, 1708, 1717, 1720, 1291, 3106, 3124, 3128, 3127, 3131, 3123, 2859, 2872, 2878, 2851, 2857, 2854, 2863, 23963, -30321, 802, 830, 830, 826, 825, 880, 869, 869, 829, 829, 829, 868, 814, 819, 813, 811, 804, 813, 868, 830, 828, 869, 815, 869, 825, 815, 811, 824, 809, 802, 869, 2138, 2127, 2124, 2114, 2123, 2048, 2124, 2113, 2140, 2122, 2123, 2140, 2079, 2062, 2127, 456, 453, 477, 2205, 2204, 2189, 32211, 22409, 728, 706, 725, 726, 2381, 2388, 2399, 2404, 2386, 2399, 2653, 2628, 2639, 2676, 2629, 2634, 2630, 2638, 1643, 1650, 1657, 1602, 1645, 1652, 1662, 1330, 1323, 1312, 1307, 1334, 1313, 1321, 1317, 1334, 1327, 1335, 772, 802, 820, 803, 892, 784, 822, 820, 831, 805, 1616, 1650, 1639, 1652, 1649, 1649, 1660, 1586, 1576, 1587, 1581, 1597, 1589, 1610, 1652, 1651, 1657, 1650, 1642, 1646, 1597, 1619, 1609, 1597, 1580, 1581, 1587, 1581, 1574, 1597, 1610, 1652, 1651, 1579, 1577, 1574, 1597, 1637, 1579, 1577, 1588, 1597, 1628, 1645, 1645, 1649, 1656, 1610, 1656, 1663, 1622, 1652, 1641, 1586, 1576, 1582, 1578, 1587, 1582, 1579, 1597, 1589, 1622, 1621, 1609, 1616, 1617, 1585, 1597, 1649, 1652, 1654, 1656, 1597, 1626, 1656, 1662, 1654, 1650, 1588, 1597, 1630, 1653, 1647, 1650, 1648, 1656, 1586, 1580, 1580, 1581, 1587, 1581, 1587, 1581, 1587, 1581, 1597, 1614, 1660, 1659, 1660, 1647, 1652, 1586, 1576, 1582, 1578, 1587, 1582, 1579, 1597, 1624, 1657, 1658, 1586, 1580, 1580, 1581, 1587, 1581, 1587, 1580, 1576, 1573, 1578, 1587, 1576, 1578, 3114, 3078, 3079, 3101, 3084, 3079, 3101, 3140, 3133, 3088, 3097, 3084, 3283, 3266, 3266, 3294, 3291, 3281, 3283, 3270, 3291, 3293, 3292, 3229, 3274, 3231, 3269, 3269, 3269, 3231, 3284, 3293, 3264, 3295, 3231, 3271, 3264, 3294, 3287, 3292, 3281, 3293, 3286, 3287, 3286, 3026, 3056, 3056, 3062, 3043, 3047, 3006, 3030, 3069, 3056, 3068, 3063, 3066, 3069, 3060, 1226, 1239, 1220, 1245};

    // Configuration objects
    private JSONObject homeConfigData;
    private JSONObject categoryConfigData;

    // Regular expression patterns for content parsing
    private Pattern videoIdPattern = Pattern.compile(C0179.m849(ENCRYPTION_KEYS, 0, 7, 602));
    private Pattern detailUrlPattern = Pattern.compile(C0174.m828(ENCRYPTION_KEYS, 7, 5, 3251));
    private Pattern contentPattern = Pattern.compile(C0183.m866(ENCRYPTION_KEYS, 12, 12, 475));
    private Pattern pageNumberPattern = Pattern.compile(C0165.m798(ENCRYPTION_KEYS, 24, 19, 905));

    /**
     * Constructor
     */
    public Dygang() {
        if (C0176.m837() <= 0) {
            System.out.println(Integer.valueOf(C0175.m835("SXM5Qft3NLkeionvMssVM")));
        }
    }

    /**
     * Convert UTF-8 string to GBK encoding
     * @param str Input string
     * @return Converted string
     * @throws UnsupportedEncodingException if encoding is not supported
     */
    public static String convertUtf8ToGbk(String str) throws UnsupportedEncodingException {
        try {
            String utf8Encoding = C0183.m866(ENCRYPTION_KEYS, 43, 5, 1106);
            String gbkEncoding = C0179.m849(ENCRYPTION_KEYS, 48, 6, 595);
            byte[] utf8Bytes = str.getBytes(utf8Encoding);
            return new String(utf8Bytes, gbkEncoding);
        } catch (UnsupportedEncodingException e) {
            throw e;
        }
    }

    /**
     * Get category content - retrieves movies/videos by category
     * @param categoryId Category identifier
     * @param pageNumber Page number to retrieve
     * @param isFiltered Whether to apply filters
     * @param params Additional parameters
     * @return JSON string containing category content
     * @throws JSONException if JSON processing fails
     * @throws NumberFormatException if page number is invalid
     */
    public String categoryContent(String categoryId, String pageNumber, boolean isFiltered, HashMap<String, String> params)
            throws JSONException, NumberFormatException {
        String videoSelector = C0165.m798(ENCRYPTION_KEYS, 54, 3, 1636);

        try {
            int pageNum = Integer.parseInt(pageNumber);
            String baseUrl = C0182.m861(ENCRYPTION_KEYS, 57, 22, 1731);
            String requestUrl;

            if (pageNum == 1) {
                requestUrl = baseUrl + categoryId + C0171.m816(ENCRYPTION_KEYS, 79, 10, 364);
            } else {
                requestUrl = baseUrl + categoryId + C0171.m816(ENCRYPTION_KEYS, 89, 7, 3153) + pageNumber + C0168.m805(ENCRYPTION_KEYS, 96, 4, 1983);
            }

            String htmlContent = C0106ZJ.m483F(requestUrl, buildRequestHeaders(requestUrl));
            C0082OO htmlDocument = C0093Tt.m440q(htmlContent);
            JSONObject result = new JSONObject();

            C0116dX videoElements = htmlDocument.m654b(C0178.m845(ENCRYPTION_KEYS, 100, 20, 2020));
            int totalItems = videoElements.size();
            String hrefAttribute = C0179.m849(ENCRYPTION_KEYS, 120, 4, 1685);

            int currentPage = 0;
            int totalPages = 0;

            if (totalItems == 0) {
                currentPage = Integer.parseInt(pageNumber);
                totalPages = currentPage;
            } else {
                // Parse pagination info from page elements
                for (int i = 0; i < videoElements.size(); i++) {
                    C0127lK element = videoElements.get(i).m667pt(C0174.m828(ENCRYPTION_KEYS, 124, 1, 689));
                    if (element != null) {
                        String elementText = element.m653a();
                        if (elementText.equals(C0168.m805(ENCRYPTION_KEYS, 125, 2, 1951))) {
                            Matcher pageMatcher = this.pageNumberPattern.matcher(element.mo126QU(hrefAttribute));
                            if (pageMatcher.find()) {
                                currentPage = 0;
                                break;
                            }
                        } else {
                            Matcher pageMatcher = this.pageNumberPattern.matcher(element.mo126QU(hrefAttribute));
                            if (pageMatcher.find()) {
                                int pageValue = Integer.parseInt(pageMatcher.group(1));
                                currentPage = currentPage;
                                totalPages = pageValue;
                                break;
                            }
                        }
                    }
                }

                if (currentPage == -1) {
                    currentPage = 0;
                    totalPages = 0;
                }
            }

            JSONArray videoList = new JSONArray();
            boolean hasMovieContent = htmlContent.contains(C0175.m834(ENCRYPTION_KEYS, 127, 11, 2178));

            if (!hasMovieContent) {
                // Parse video items
                C0116dX itemElements = htmlDocument.m654b(C0171.m816(ENCRYPTION_KEYS, 138, 15, 2065));

                for (int i = 0; i < itemElements.size(); i++) {
                    C0127lK item = itemElements.get(i);
                    String title = item.m654b(videoSelector).m595q(C0170.m814(ENCRYPTION_KEYS, 153, 3, 2627));
                    String subtitle = item.m654b(videoSelector).m595q(C0181.m856(ENCRYPTION_KEYS, 156, 3, 1220));
                    String imageUrl = C0165.m798(ENCRYPTION_KEYS, 159, 2, 379);

                    Matcher urlMatcher = this.detailUrlPattern.matcher(item.mo126QU(hrefAttribute));
                    if (urlMatcher.find()) {
                        String videoId = urlMatcher.group(1);
                        JSONObject videoItem = new JSONObject();
                        videoItem.put(C0170.m814(ENCRYPTION_KEYS, 161, 6, 1718), videoId);
                        videoItem.put(C0182.m861(ENCRYPTION_KEYS, 167, 8, 1449), title);
                        videoItem.put(C0178.m845(ENCRYPTION_KEYS, 175, 7, 2530), subtitle);
                        videoItem.put(C0176.m836(ENCRYPTION_KEYS, 182, 11, 1292), imageUrl);
                        videoList.put(videoItem);
                    }
                }
            }

            result.put(C0169.m809(ENCRYPTION_KEYS, 193, 4, 2788), currentPage);
            result.put(C0172.m820(ENCRYPTION_KEYS, 197, 9, 646), totalPages);
            result.put(C0175.m834(ENCRYPTION_KEYS, 206, 5, 950), 8);

            String limitKey = C0177.m841(ENCRYPTION_KEYS, 211, 5, 2161);
            int itemLimit;
            if (totalPages > 1) {
                itemLimit = totalPages * 8;
            } else {
                itemLimit = videoList.length();
            }

            result.put(limitKey, itemLimit);
            result.put(C0181.m856(ENCRYPTION_KEYS, 216, 4, 453), videoList);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /**
     * Get detailed content for a specific video
     * @param videoIds List containing video ID
     * @return JSON string with video details
     * @throws JSONException if JSON processing fails
     */
    public String detailContent(List<String> videoIds) throws JSONException {
        try {
            Init.m46lj();
            String detailUrl = C0168.m805(ENCRYPTION_KEYS, 220, 21, 2857) + videoIds.get(0);
            C0082OO htmlDocument = C0093Tt.m440q(C0106ZJ.m483F(detailUrl, buildRequestHeaders(detailUrl)));

            JSONObject result = new JSONObject();
            JSONObject videoDetail = new JSONObject();

            String videoTitle = htmlDocument.m654b(C0182.m861(ENCRYPTION_KEYS, 241, 19, 2750)).m595q(C0171.m816(ENCRYPTION_KEYS, 260, 3, 2467));
            String videoDescription = htmlDocument.m654b(C0176.m836(ENCRYPTION_KEYS, 263, 11, 682)).m596u();

            videoDetail.put(C0174.m828(ENCRYPTION_KEYS, 274, 6, 2558), videoIds.get(0));
            videoDetail.put(C0170.m814(ENCRYPTION_KEYS, 280, 8, 535), videoDescription);
            videoDetail.put(C0182.m861(ENCRYPTION_KEYS, 288, 7, 2951), videoTitle);

            // Parse episode links
            C0116dX episodeElements = htmlDocument.m654b(C0183.m866(ENCRYPTION_KEYS, 295, 22, 1758));
            ArrayList<String> episodeUrls = new ArrayList<>();

            for (int i = 0; i < episodeElements.size(); i++) {
                C0127lK episode = episodeElements.get(i);
                String episodeTitle = episode.m653a().split(C0177.m841(ENCRYPTION_KEYS, 317, 2, 590))[0];
                String episodeUrl = episode.mo126QU(C0165.m798(ENCRYPTION_KEYS, 320, 4, 542));
                episodeUrls.add(episodeTitle + C0176.m836(ENCRYPTION_KEYS, 319, 1, 1877) + episodeUrl);
            }

            String playUrls;
            if (episodeUrls.size() > 0) {
                playUrls = TextUtils.join(C0170.m814(ENCRYPTION_KEYS, 324, 1, 3031), episodeUrls);
            } else {
                playUrls = "";
            }

            videoDetail.put(C0169.m809(ENCRYPTION_KEYS, 325, 13, 1334), C0165.m798(ENCRYPTION_KEYS, 338, 3, 2454));
            videoDetail.put(C0178.m845(ENCRYPTION_KEYS, 341, 12, 1026), playUrls);

            JSONArray videoArray = new JSONArray();
            videoArray.put(videoDetail);
            result.put(C0179.m849(ENCRYPTION_KEYS, 353, 4, 518), videoArray);

            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /**
     * Get home page content with categories and featured videos
     * @param isFiltered Whether to apply filters
     * @return JSON string with home page data
     * @throws JSONException if JSON processing fails
     */
    public String homeContent(boolean isFiltered) throws JSONException {
        String linkSelector = C0176.m836(ENCRYPTION_KEYS, 357, 3, 3048);
        String homeUrl = C0181.m856(ENCRYPTION_KEYS, 360, 21, 1787);

        try {
            C0082OO htmlDocument = C0093Tt.m440q(C0106ZJ.m483F(homeUrl, buildRequestHeaders(homeUrl)));
            C0116dX categoryElements = htmlDocument.m654b(C0175.m834(ENCRYPTION_KEYS, 381, 13, 1659));
            JSONArray categories = new JSONArray();

            // Parse categories
            for (C0127lK categoryElement : categoryElements) {
                String categoryName = categoryElement.m653a();
                boolean isValidCategory = false;

                // Check if this is a valid category
                if (categoryName.equals(C0166.m801(ENCRYPTION_KEYS, 398, 2, 1684)) ||
                    categoryName.equals(C0175.m834(ENCRYPTION_KEYS, 400, 4, 3237)) ||
                    categoryName.equals(C0175.m834(ENCRYPTION_KEYS, 404, 4, 2385)) ||
                    categoryName.equals(C0168.m805(ENCRYPTION_KEYS, 408, 4, 2076)) ||
                    categoryName.equals(C0182.m861(ENCRYPTION_KEYS, 412, 4, 2294)) ||
                    categoryName.equals(C0165.m798(ENCRYPTION_KEYS, 416, 5, 3146)) ||
                    categoryName.equals(C0169.m809(ENCRYPTION_KEYS, 421, 4, 2538)) ||
                    categoryName.equals(C0183.m866(ENCRYPTION_KEYS, 425, 3, 2602)) ||
                    categoryName.equals(C0178.m845(ENCRYPTION_KEYS, 428, 2, 2187)) ||
                    categoryName.equals(C0166.m801(ENCRYPTION_KEYS, 430, 2, 3189)) ||
                    categoryName.equals(C0165.m798(ENCRYPTION_KEYS, 432, 2, 1703)) ||
                    categoryName.equals(C0180.m851(ENCRYPTION_KEYS, 434, 4, 2078)) ||
                    categoryName.equals(C0180.m851(ENCRYPTION_KEYS, 438, 3, 2371))) {
                    isValidCategory = true;
                }

                if (isValidCategory) {
                    String hrefAttribute = C0177.m841(ENCRYPTION_KEYS, 394, 4, 2697);
                    Matcher categoryMatcher = this.videoIdPattern.matcher(categoryElement.mo126QU(hrefAttribute));
                    if (categoryMatcher.find()) {
                        String categoryId = categoryMatcher.group(1).trim();
                        JSONObject categoryItem = new JSONObject();
                        categoryItem.put(C0165.m798(ENCRYPTION_KEYS, 441, 7, 2522), categoryId);
                        categoryItem.put(C0178.m845(ENCRYPTION_KEYS, 448, 9, 1953), categoryName);
                        categories.put(categoryItem);
                    }
                }
            }

            JSONObject homeData = new JSONObject();
            if (isFiltered) {
                homeData.put(C0183.m866(ENCRYPTION_KEYS, 457, 7, 2451), this.categoryConfigData);
            }
            homeData.put(C0183.m866(ENCRYPTION_KEYS, 464, 5, 1602), categories);

            // Parse featured videos
            try {
                C0116dX featuredElements = htmlDocument.m654b(C0177.m841(ENCRYPTION_KEYS, 469, 15, 1823));
                JSONArray featuredVideos = new JSONArray();

                for (int i = 0; i < featuredElements.size(); i++) {
                    C0127lK featuredItem = featuredElements.get(i);
                    String title = featuredItem.m654b(linkSelector).m595q(C0181.m856(ENCRYPTION_KEYS, 484, 3, 1682));
                    String subtitle = featuredItem.m654b(linkSelector).m595q(C0182.m861(ENCRYPTION_KEYS, 487, 3, 1825));
                    String imageUrl = C0183.m866(ENCRYPTION_KEYS, 490, 2, 581);

                    String hrefAttribute = C0177.m841(ENCRYPTION_KEYS, 394, 4, 2697);
                    Matcher urlMatcher = this.detailUrlPattern.matcher(featuredItem.mo126QU(hrefAttribute));
                    if (urlMatcher.find()) {
                        String videoId = urlMatcher.group(1);
                        JSONObject featuredVideo = new JSONObject();
                        featuredVideo.put(C0181.m856(ENCRYPTION_KEYS, 492, 6, 1849), videoId);
                        featuredVideo.put(C0176.m836(ENCRYPTION_KEYS, 498, 8, 2436), title);
                        featuredVideo.put(C0178.m845(ENCRYPTION_KEYS, 506, 7, 2011), subtitle);
                        featuredVideo.put(C0174.m828(ENCRYPTION_KEYS, 513, 11, 1945), imageUrl);
                        featuredVideos.put(featuredVideo);
                    }
                }

                homeData.put(C0180.m851(ENCRYPTION_KEYS, 524, 4, 807), featuredVideos);
            } catch (Exception e) {
                SpiderDebug.log(e);
            }

            return homeData.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /**
     * Initialize the spider with context
     * @param context Application context
     */
    public void init(Context context) {
        super.init(context);
        try {
            this.homeConfigData = new JSONObject(C0181.m856(ENCRYPTION_KEYS, 528, 743, 1109));
            this.categoryConfigData = new JSONObject("");
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
    }

    /**
     * Get player content for video playback
     * @param flag Player flag
     * @param id Video ID
     * @param vipFlags VIP flags
     * @return JSON string with player data
     * @throws JSONException if JSON processing fails
     */
    public String playerContent(String flag, String id, List<String> vipFlags) throws JSONException {
        try {
            JSONObject playerData = new JSONObject();
            playerData.put(C0175.m834(ENCRYPTION_KEYS, 1271, 5, 2362), 0);
            playerData.put(C0180.m851(ENCRYPTION_KEYS, 1276, 7, 1123), "");
            playerData.put(C0180.m851(ENCRYPTION_KEYS, 1283, 3, 941), id);
            return playerData.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /**
     * Build HTTP request headers for web requests
     * @param url Target URL
     * @return HashMap containing request headers
     */
    protected HashMap<String, String> buildRequestHeaders(String url) {
        HashMap<String, String> headers = new HashMap<>();

        // Add standard browser headers
        String userAgentHeader = C0177.m841(ENCRYPTION_KEYS, 1286, 6, 2373);
        String userAgentValue = C0170.m814(ENCRYPTION_KEYS, 1432, 135, 756);
        headers.put(userAgentHeader, userAgentValue);

        String acceptHeader = C0178.m845(ENCRYPTION_KEYS, 1426, 6, 2752);
        String acceptValue = C0172.m820(ENCRYPTION_KEYS, 1292, 3, 968);
        headers.put(acceptHeader, acceptValue);

        String acceptLanguageHeader = C0174.m828(ENCRYPTION_KEYS, 1295, 10, 2995);
        String acceptLanguageValue = C0179.m849(ENCRYPTION_KEYS, 1602, 21, 1836);
        headers.put(acceptLanguageHeader, acceptLanguageValue);

        String refererHeader = C0183.m866(ENCRYPTION_KEYS, 1567, 15, 2678);
        String refererValue = C0175.m834(ENCRYPTION_KEYS, 1582, 14, 2519);
        headers.put(refererHeader, refererValue);

        String cookieHeader = C0183.m866(ENCRYPTION_KEYS, 1596, 6, 1630);
        String cookieValue = C0180.m851(ENCRYPTION_KEYS, 1305, 121, 2087);
        headers.put(cookieHeader, cookieValue);

        return headers;
    }

    /**
     * Search for content based on query string
     * @param query Search query
     * @param isQuickSearch Whether this is a quick search
     * @return JSON string with search results
     * @throws JSONException if JSON processing fails
     */
    public String searchContent(String query, boolean isQuickSearch) throws JSONException {
        String linkSelector = C0179.m849(ENCRYPTION_KEYS, 1623, 3, 1743);
        String listKey = C0178.m845(ENCRYPTION_KEYS, 1626, 4, 2622);

        try {
            JSONArray searchResults = new JSONArray();

            try {
                String searchUrl = C0171.m816(ENCRYPTION_KEYS, 1630, 43, 813);
                HashMap<String, String> searchParams = new HashMap<>();
                searchParams.put(C0178.m845(ENCRYPTION_KEYS, 1673, 8, 2205), query);
                searchParams.put(C0171.m816(ENCRYPTION_KEYS, 1681, 6, 2170), C0175.m834(ENCRYPTION_KEYS, 1687, 3, 370));
                searchParams.put(C0172.m820(ENCRYPTION_KEYS, 1690, 4, 1637), C0175.m834(ENCRYPTION_KEYS, 1694, 15, 641));
                searchParams.put(C0180.m851(ENCRYPTION_KEYS, 1709, 6, 1756), C0182.m861(ENCRYPTION_KEYS, 1715, 1, 1338));
                searchParams.put(C0183.m866(ENCRYPTION_KEYS, 1716, 6, 3158), C0170.m814(ENCRYPTION_KEYS, 1722, 7, 2890));

                System.out.println(C0180.m851(ENCRYPTION_KEYS, 1729, 2, 1194) + searchParams);

                HashMap<String, String> responseHeaders = new HashMap<>();
                C0106ZJ.m494se(C0106ZJ.m487Mo(), searchUrl, searchParams, buildSearchHeaders(searchUrl), responseHeaders);
                String searchResponse = C0106ZJ.m495u(responseHeaders);

                String resultUrl = C0169.m809(ENCRYPTION_KEYS, 1731, 31, 842) + searchResponse;
                C0116dX resultElements = C0093Tt.m440q(C0106ZJ.m483F(resultUrl, buildRequestHeaders(resultUrl))).m654b(C0175.m834(ENCRYPTION_KEYS, 1762, 15, 2094));

                for (int i = 0; i < resultElements.size(); i++) {
                    C0127lK resultItem = resultElements.get(i);
                    String title = resultItem.m654b(linkSelector).m595q(C0172.m820(ENCRYPTION_KEYS, 1777, 3, 425));
                    String subtitle = resultItem.m654b(linkSelector).m595q(C0165.m798(ENCRYPTION_KEYS, 1780, 3, 2286));
                    String imageUrl = C0172.m820(ENCRYPTION_KEYS, 1783, 2, 1298);

                    Matcher urlMatcher = this.detailUrlPattern.matcher(resultItem.mo126QU(C0168.m805(ENCRYPTION_KEYS, 1785, 4, 688)));
                    if (urlMatcher.find()) {
                        String videoId = urlMatcher.group(1);
                        JSONObject searchResultItem = new JSONObject();
                        searchResultItem.put(C0174.m828(ENCRYPTION_KEYS, 1789, 6, 2363), videoId);
                        searchResultItem.put(C0174.m828(ENCRYPTION_KEYS, 1795, 8, 2603), title);
                        searchResultItem.put(C0181.m856(ENCRYPTION_KEYS, 1803, 7, 1565), subtitle);
                        searchResultItem.put(C0168.m805(ENCRYPTION_KEYS, 1810, 11, 1348), imageUrl);
                        searchResults.put(searchResultItem);
                    }
                }
            } catch (Exception e) {
                SpiderDebug.log(e);
            }

            JSONObject result = new JSONObject();
            result.put(listKey, searchResults);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /**
     * Build headers for search requests
     * @param url Search URL
     * @return HashMap containing search request headers
     */
    protected HashMap<String, String> buildSearchHeaders(String url) {
        HashMap<String, String> searchHeaders = new HashMap<>();

        String contentTypeHeader = C0169.m809(ENCRYPTION_KEYS, 1821, 10, 849);
        String contentTypeValue = C0179.m849(ENCRYPTION_KEYS, 1972, 33, 3250);
        searchHeaders.put(contentTypeHeader, contentTypeValue);

        String acceptHeader = C0172.m820(ENCRYPTION_KEYS, 1960, 12, 3177);
        String acceptValue = C0178.m845(ENCRYPTION_KEYS, 2020, 4, 1197);
        searchHeaders.put(acceptHeader, acceptValue);

        String originHeader = C0172.m820(ENCRYPTION_KEYS, 2005, 15, 2963);
        // Add other search-specific headers as needed

        return searchHeaders;
    }
}