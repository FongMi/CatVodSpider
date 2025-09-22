package com.github.catvod.spider;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0165;
import com.github.catvod.parser.C0166;
import com.github.catvod.spider.merge.AbstractC0099V3;
import com.github.catvod.spider.merge.C0106ZJ;
import com.github.catvod.spider.merge.C0118ga;
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
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.Call;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class Kuaikan extends Spider {

    /* renamed from: QU */
    private static String f126QU;

    /* renamed from: q */
    private static String f127q;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f833short = {618, 622, 575, 568, 617, 572, 573, 574, 569, 561, 573, 617, 621, 571, 561, 572, 569, 560, 572, 618, 570, 621, 568, 618, 569, 618, 572, 575, 569, 619, 617, 621, 569, 568, 568, 568, 571, 568, 568, 568, 568, 569, 620, 619, 572, 571, 569, 574, 560, 569, 618, 560, 568, 574, 568, 560, 561, 620, 617, 619, 569, 569, 573, 571, 622, 618, 569, 571, 561, 574, 568, 622, 560, 575, 572, 573, 550, 571, 561, 567, 1312, 1329, 1329, 1288, 1317, 2209, 2208, 2208, 2208, 2211, 2208, 2208, 2208, 2208, 2209, 1034, 1040, 1054, 1047, 2750, 2723, 2727, 2735, 2745, 2750, 2731, 2727, 2746, 393, 397, 476, 475, 394, 479, 478, 477, 474, 466, 478, 394, 398, 472, 466, 479, 1583, 1574, 1578, 1660, 1580, 1659, 1582, 1660, 1583, 1660, 1578, 1577, 1583, 1661, 1663, 1659, 2037, 2033, 1952, 1959, 2038, 1955, 1954, 1953, 1958, 1966, 1954, 2038, 2034, 1956, 1966, 1955, 1958, 1967, 1955, 2037, 1957, 2034, 1959, 2037, 1958, 2037, 1955, 1952, 1958, 2036, 2038, 2034, 1303, 1306, 1297, 1292, 823, 810, 800, 808, 806, 823, 1747, 1743, 1743, 1739, 1665, 1684, 1684, 1752, 1743, 1751, 1748, 1748, 1744, 1685, 1757, 1754, 1752, 1754, 1746, 1736, 1747, 1746, 1730, 1746, 1685, 1752, 1748, 1750, 1684, 1754, 1739, 1746, 1684, 1741, 1674, 1684, 1742, 1736, 1758, 1737, 1684, 1751, 1748, 1756, 1746, 1749, 1685, 1759, 1748, 593, 592, 578, 1191, 1190, 1204, 1242, 1200, 1206, 1207, 1242, 1189, 1214, 1206, 1190, 1220, 1189, 1172, 1169, 1169, 1180, 1179, 1170, 2438, 2434, 2452, 3320, 3324, 3306, 3222, 3322, 3323, 3322, 3222, 3305, 3314, 3322, 3306, 3212, 3305, 3288, 3293, 3293, 3280, 3287, 3294, 2633, 2632, 2650, 2609, 2596, 2076, 2077, 2077, 2077, 2078, 2077, 2077, 2077, 2077, 2076, 2121, 2126, 2073, 2078, 2076, 2075, 2069, 2076, 2127, 2069, 2077, 2075, 2077, 2069, 2068, 2121, 2124, 2126, 2076, 2076, 2072, 2078, 2123, 2127, 2076, 2078, 2068, 2075, 2077, 2123, 2069, 2074, 2077, 2077, 1668, 1669, 1694, 1667, 1673, 1679, 972, 969, 987, 902, 919, 919, 942, 899, 1667, 1666, 1666, 1666, 1665, 1666, 1666, 1666, 1666, 1667, 1897, 1894, 1905, 2346, 2352, 2366, 2359, 3254, 3243, 3247, 3239, 3249, 3254, 3235, 3247, 3250, 1872, 1864, 1900, 1857, 3282, 3295, 3284, 3273, 1739, 1750, 1756, 1748, 1754, 1739, 3186, 3182, 3182, 3178, 3104, 3125, 3125, 3193, 3182, 3190, 3189, 3189, 3185, 3124, 3196, 3195, 3193, 3195, 3187, 3177, 3186, 3187, 3171, 3187, 3124, 3193, 3189, 3191, 3125, 3195, 3178, 3187, 3125, 3180, 3115, 3125, 3183, 3177, 3199, 3176, 3125, 3193, 3189, 3188, 3196, 3187, 3197, 3124, 3198, 3189, 2803, 2802, 2784, 2702, 2788, 2786, 2787, 2702, 2801, 2794, 2786, 2802, 2704, 2801, 2752, 2757, 2757, 2760, 2767, 2758, 1916, 1917, 1903, 1909, 1908, 1894, 1805, 1816, 1415, 1435, 1439, 1420, 1463, 1434, 2842, 2831, 2825, 2855, 2826, 2355, 2336, 2359, 2355, 2331, 2358, 863, 862, 862, 862, 861, 862, 862, 862, 862, 863, 778, 781, 858, 861, 863, 856, 854, 863, 780, 854, 862, 856, 862, 854, 855, 778, 783, 781, 863, 863, 859, 861, 776, 780, 863, 861, 855, 856, 862, 776, 854, 857, 502, 503, 492, 497, 507, 509, 2983, 2998, 2998, 2959, 2978, 1862, 1863, 1863, 1863, 1860, 1863, 1863, 1863, 1863, 1862, 826, 823, 830, 811, 775, 810, 1940, 1925, 1923, 1921, 2349, 2364, 2362, 2360, 2318, 2356, 2343, 2360, 2196, 2190, 2176, 2185, 2460, 2433, 2437, 2445, 2459, 2460, 2441, 2437, 2456, 2706, 2719, 2708, 2697, 3189, 3176, 3170, 3178, 3172, 3189, 2710, 2698, 2698, 2702, 2756, 2769, 2769, 2717, 2698, 2706, 2705, 2705, 2709, 2768, 2712, 2719, 2717, 2719, 2711, 2701, 2710, 2711, 2695, 2711, 2768, 2717, 2705, 2707, 2769, 2719, 2702, 2711, 2769, 2696, 2767, 2769, 2701, 2715, 2719, 2700, 2717, 2710, 2769, 2696, 2711, 2714, 2715, 2705, 2768, 2714, 2705, 2615, 2614, 2614, 2614, 2613, 2614, 2614, 2614, 2614, 2615, 2658, 2661, 2610, 2613, 2615, 2608, 2622, 2615, 2660, 2622, 2614, 2608, 2614, 2622, 2623, 2658, 2663, 2661, 2615, 2615, 2611, 2613, 2656, 2660, 2615, 2613, 2623, 2608, 2614, 2656, 2622, 2609, 879, 878, 885, 872, 866, 868, 2310, 2327, 2327, 2350, 2307, 1582, 1583, 1583, 1583, 1580, 1583, 1583, 1583, 1583, 1582, 2494, 2483, 1984, 2010, 2004, 2013, 1596, 1569, 1573, 1581, 1595, 1596, 1577, 1573, 1592, 1656, 1653, 1662, 1635, 2122, 2135, 2141, 2133, 2139, 2122, 2513, 2509, 2509, 2505, 2435, 2454, 2454, 2522, 2509, 2517, 2518, 2518, 2514, 2455, 2527, 2520, 2522, 2520, 2512, 2506, 2513, 2512, 2496, 2512, 2455, 2522, 2518, 2516, 2454, 2520, 2505, 2512, 2454, 2511, 2440, 2454, 2511, 2512, 2525, 2524, 2518, 2454, 2505, 2517, 2520, 2496, 2454, 817, 891, 880, 831, 397, 396, 396, 396, 399, 396, 396, 396, 396, 397, 472, 479, 392, 399, 397, 394, 388, 397, 478, 388, 396, 394, 396, 388, 389, 472, 477, 479, 397, 397, 393, 399, 474, 478, 397, 399, 389, 394, 396, 474, 388, 395, 1947, 1946, 1921, 1948, 1942, 1936, 390, 407, 407, 430, 387, 2507, 2506, 2506, 2506, 2505, 2506, 2506, 2506, 2506, 2507, 1812, 1806, 1792, 1801, 3073, 3100, 3096, 3088, 3078, 3073, 3092, 3096, 3077, 3083, 3078, 3085, 3088, 1787, 1766, 1772, 1764, 1770, 1787, 2924, 2928, 2928, 2932, 2878, 2859, 2859, 2919, 2928, 2920, 2923, 2923, 2927, 2858, 2914, 2917, 2919, 2917, 2925, 2935, 2924, 2925, 2941, 2925, 2858, 2919, 2923, 2921, 2859, 2917, 2932, 2925, 2859, 2930, 2869, 2859, 2929, 2935, 2913, 2934, 2859, 2915, 2913, 2922, 2934, 2913, 2935, 2858, 2912, 2923, 409, 406, 411, 393, 393, 2907, 2900, 2897, 2889, 2904, 2895, 2894, 939, 938, 938, 938, 937, 938, 938, 938, 938, 939, 1022, 1017, 942, 937, 939, 940, 930, 939, 1016, 930, 938, 940, 938, 930, 931, 1022, 1019, 1017, 939, 939, 943, 937, 1020, 1016, 939, 937, 931, 940, 938, 1020, 930, 941, 939, 939, 943, 978, 979, 968, 981, 991, 985, 434, 419, 419, 410, 439, 2674, 2675, 2675, 2675, 2672, 2675, 2675, 2675, 2675, 2674, 2371, 2382, 665, 643, 653, 644, 702, 675, 679, 687, 697, 702, 683, 679, 698, 2168, 2165, 
    2174, 2147, 990, 963, 969, 961, 975, 990, 2311, 2331, 2331, 2335, 2389, 2368, 2368, 2316, 2331, 2307, 2304, 2304, 2308, 2369, 2313, 2318, 2316, 2318, 2310, 2332, 2311, 2310, 2326, 2310, 2369, 2316, 2304, 2306, 2368, 2318, 2335, 2310, 2368, 2329, 2398, 2368, 2330, 2332, 2314, 2333, 2368, 2312, 2314, 2305, 2333, 2314, 2368, 2398, 2398, 2394, 2369, 2315, 2304, 2081, 2084, 2110, 2105, 2416, 2408, 2380, 2401, 2739, 2736, 2729, 2724, 2725, 2738, 2719, 2699, 2741, 2721, 2729, 2731, 2721, 2734, 995, 1010, 1010, 971, 998, 1681, 1680, 1680, 1680, 1683, 1680, 1680, 1680, 1680, 1681, 1545, 1562, 1549, 1548, 1558, 1552, 1553, 2029, 453, 472, 476, 468, 450, 453, 464, 476, 449, 2058, 2059, 2059, 2059, 2056, 2059, 2059, 2059, 2059, 2058, 2143, 2136, 2063, 2056, 2058, 2061, 2051, 2058, 2137, 2051, 2059, 2061, 2059, 2051, 2050, 2143, 2138, 2136, 2058, 2058, 2062, 2056, 2141, 2137, 2058, 2056, 2050, 2061, 2059, 2141, 2051, 2060, 2063, 1629, 1628, 1607, 1626, 1616, 1622, 2565, 2590, 2586, 2580, 2591, 2546, 2516, 2498, 2517, 2442, 2534, 2496, 2498, 2505, 2515, 277, 273, 274, 270, 270, 266, 341, 335, 340, 330, 340, 330, 343, 283, 278, 266, 274, 283, 340, 328, 1734, 1735, 1749, 1726, 1707, 736, 704, 2722, 2725, 2747, 579, 578, 578, 578, 577, 578, 578, 578, 578, 579, 534, 529, 582, 577, 579, 580, 586, 579, 528, 586, 578, 580, 578, 586, 587, 534, 531, 529, 579, 579, 583, 577, 532, 528, 579, 577, 587, 580, 578, 532, 586, 581, 854, 855, 844, 849, 859, 861, 516, 533, 533, 556, 513, 816, 817, 817, 817, 818, 817, 817, 817, 817, 816, 1809, 1820, 2312, 2325, 2312, 2320, 2329, 3268, 3294, 3280, 3289, 1302, 1291, 1295, 1287, 1297, 1302, 1283, 1295, 1298, 1385, 1380, 1391, 1394, 1624, 1605, 1615, 1607, 1609, 1624, 1280, 1297, 1282, 1283, 1301, 518, 523, 527, 522, 523, 540, 385, 413, 400, 392, 420, 387, 413, 1305, 1309, 1291, 2762, 2766, 2776, 2724, 2760, 2761, 2760, 2724, 2779, 2752, 2760, 2776, 2750, 2779, 2794, 2799, 2799, 2786, 2789, 2796, 2668, 2661, 2580, 1193, 1192, 1192, 1192, 1195, 1192, 1192, 1192, 1192, 1193, 1276, 1275, 1196, 1195, 1193, 1198, 1184, 1193, 1274, 1184, 1192, 1198, 1192, 1184, 1185, 1276, 1273, 1275, 1193, 1193, 1197, 1195, 1278, 1274, 1193, 1195, 1185, 1198, 1192, 1278, 1184, 1199, 1193, 1193, 1194, 2691, 2690, 2713, 2692, 2702, 2696, 1254, 1271, 1271, 1230, 1251, 833, 832, 832, 832, 835, 832, 832, 832, 832, 833, 1131, 1125, 1145, 1143, 1135, 1138, 1124, 1385, 1400, 1406, 1404, 2823, 2838, 2832, 2834, 2852, 2846, 2829, 2834, 2051, 2073, 2071, 2078, 1318, 1339, 1343, 1335, 1313, 1318, 1331, 1343, 1314, 1249, 1260, 1255, 1274, 1745, 1740, 1734, 1742, 1728, 1745, 1040, 1036, 1036, 1032, 1090, 1111, 1111, 1051, 1036, 1044, 1047, 1047, 1043, 1110, 1054, 1049, 1051, 1049, 1041, 1035, 1040, 1041, 1025, 1041, 1110, 1051, 1047, 1045, 1111, 1049, 1032, 1041, 1111, 1038, 1097, 1111, 1035, 1053, 1049, 1034, 1051, 1040, 1111, 1032, 1049, 1055, 1053, 1110, 1052, 1047};

    /* renamed from: xC */
    private static long f128xC;

    /* renamed from: UJ */
    private HashMap<String, ArrayList<String>> f129UJ = new HashMap<>();

    /* renamed from: com.github.catvod.spider.Kuaikan$5 */
    class C00265 extends AbstractC0099V3.Qe {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f838short = {2803, 2814, 2805, 2792, 1054, 1027, 1033, 1025, 1039, 1054, 2767, 2763, 2757, 2788, 2767, 2755, 2738, 2757, 2753, 2769, 2803, 2757, 2769, 2763, 2784, 2737, 2758, 2771, 2759, 2752, 2755, 2771, 2775, 2755, 2755, 2742, 2757, 2764, 2755, 2758, 2753, 2752, 2795, 2771, 2761, 2752, 2789, 2771, 2753, 2795, 2779, 2760, 2743, 2775, 2756, 2792, 2791, 2759, 2789, 2791, 2775, 2795, 2743, 2811, 2796, 2766, 2761, 2794, 2792, 2743, 2759, 2767, 2756, 2738, 2696, 2737, 2801, 2787, 2805, 2774, 2811, 2755, 2761, 2797, 2770, 2784, 2788, 2775, 2753, 2769, 2776, 2776, 2771, 2743, 2771, 2790, 2800, 2762, 2794, 2800, 2763, 2764, 2789, 2789, 2800, 2779, 2810, 2758, 2806, 2752, 2733, 2774, 2773, 2778, 2797, 2803, 2769, 2756, 2729, 2752, 2760, 2770, 2746, 2743, 2756, 2738, 2804, 2803, 2746, 2752, 2740, 2789, 2765, 2803, 2756, 2773, 2794, 2761, 2733, 2696, 2739, 2770, 2763, 2761, 2791, 2736, 2805, 2761, 2798, 2768, 2768, 2807, 2776, 2769, 2765, 2790, 2775, 2808, 2761, 2733, 2737, 2804, 2808, 2768, 2762, 2799, 2768, 2737, 2760, 2737, 2761, 2757, 2800, 2804, 2764, 2808, 2804, 2805, 2755, 2768, 2762, 2746, 2789, 2789, 2746, 2810, 2776, 2792, 2784, 2801, 2787, 2798, 2785, 2733, 2789, 2752, 2793, 2785, 2772, 2810, 2769, 2810, 2757, 2790, 2696, 2746, 2792, 2746, 2800, 2760, 2742, 2771, 2794, 2765, 2769, 2756, 2794, 2747, 2756, 2746, 2752, 2736, 2805, 2763, 2758, 2755, 2771, 2755, 2752, 1056, 1058, 1065, 1077, 1058, 1076, 2037, 2042, 2038, 2046, 2451, 2462, 2455, 2434, 2478, 2435, 2339, 2350, 2343, 2354, 2312, 2366, 2355, 2734, 2723, 2730, 2751, 2693, 2740, 2747, 2743, 2751, 1527, 1526, 1526, 1526, 1525, 1526, 1526, 1526, 1526, 1527, 1442, 1445, 1522, 1525, 1527, 1520, 1534, 1527, 1444, 1534, 1526, 1520, 1526, 1534, 1535, 1442, 1447, 1445, 1527, 1527, 1523, 1525, 1440, 1444, 1527, 1525, 1535, 1520, 1526, 1440, 1534, 1521, 1487, 1486, 1493, 1480, 1474, 1476, 1648, 1633, 1633, 1624, 1653, 478, 479, 479, 479, 476, 479, 479, 479, 479, 478, 1201, 1196, 1185, 1012, 1006, 992, 1001, 1724, 1697, 1701, 1709, 1723, 1724, 1705, 1701, 1720, 2034, 2030, 2030, 2026, 1952, 1973, 1973, 2041, 2030, 2038, 2037, 2037, 2033, 1972, 2044, 2043, 2041, 2043, 2035, 2025, 2034, 2035, 2019, 2035, 1972, 2041, 2037, 2039, 1973, 2043, 2026, 2035, 1973, 2028, 1963, 1973, 2025, 2047, 2043, 2024, 2041, 2034, 1973, 2041, 2043, 2030, 2047, 2045, 2037, 2024, 2019, 1972, 2046, 2037};

        /* renamed from: QU */
        final JSONObject f138QU;

        /* renamed from: UJ */
        final Kuaikan f139UJ;

        /* renamed from: xC */
        final JSONArray f140xC;

        C00265(Kuaikan kuaikan, JSONArray jSONArray, JSONObject jSONObject) {
            this.f139UJ = kuaikan;
            this.f140xC = jSONArray;
            this.f138QU = jSONObject;
            int iM830 = C0174.m830();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = iM830 <= 0 ? 1709 : 1678;
                    case 204:
                        System.out.println(Integer.decode(C0176.m789("lA0mV0XqgSXlRnfVrhhTAAm")));
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

        /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0096. Please report as an issue. */
        /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0064. Please report as an issue. */
        @Override // com.github.catvod.spider.merge.AbstractC0099V3
        public String onResponse(String str) throws JSONException, NoSuchPaddingException, InvalidKeySpecException, NoSuchAlgorithmException, InvalidKeyException, IOException {
            JSONArray jSONArray;
            int i = 0;
            String strM809 = C0169.m809(f838short, 0, 4, 2705);
            String strM801 = C0166.m801(f838short, 4, 6, 1130);
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strM60W = this.f139UJ.m60W(C0165.m798(f838short, 10, 219, 2690), jSONObject.getString(strM801));
                jSONArray = new JSONObject(this.f139UJ.m58QU(strM60W.substring(0, 16), strM60W.substring(16, 32), jSONObject.getString(strM809))).getJSONArray(C0165.m798(f838short, 229, 6, 1095));
            } catch (JSONException e) {
                int i2 = 48767;
                while (true) {
                    i2 ^= 48784;
                    switch (i2) {
                        case 14:
                            break;
                        case 239:
                            i2 = 48798;
                            break;
                    }
                }
            }
            while (true) {
                int i3 = i;
                int length = jSONArray.length();
                int i4 = 1616;
                while (true) {
                    i4 ^= 1633;
                    switch (i4) {
                        case 14:
                        case 49:
                            i4 = i3 < length ? 1709 : 1678;
                        case 204:
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                            String string = jSONObject2.getString(C0175.m834(f838short, 235, 4, 1947));
                            int i5 = jSONObject2.getInt(C0172.m820(f838short, 239, 6, 2535));
                            int i6 = 1740;
                            while (true) {
                                i6 ^= 1757;
                                switch (i6) {
                                    case 17:
                                        i6 = i5 > 0 ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case 500:
                                        JSONObject jSONObject3 = new JSONObject();
                                        jSONObject3.put(C0168.m805(f838short, 245, 7, 2391), i5 + "");
                                        jSONObject3.put(C0177.m841(f838short, 252, 9, 2778), string);
                                        this.f140xC.put(jSONObject3);
                                        JSONObject jSONObject4 = new JSONObject();
                                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                                        String strM63se = this.f139UJ.m63se(C0170.m814(f838short, 261, 42, 1478) + i5 + jCurrentTimeMillis + C0178.m845(f838short, 303, 6, 1441));
                                        jSONObject4.put(C0176.m836(f838short, 309, 5, 1553), C0175.m834(f838short, 314, 10, 495));
                                        jSONObject4.put(C0166.m801(f838short, 324, 3, 1221), i5);
                                        jSONObject4.put(C0182.m861(f838short, 327, 4, 903), strM63se);
                                        jSONObject4.put(C0165.m798(f838short, 331, 9, 1736), jCurrentTimeMillis);
                                        String strM62q = this.f139UJ.m62q(Kuaikan.f127q.substring(0, 16), Kuaikan.f127q.substring(16, 32), jSONObject4.toString());
                                        String strM57FN = this.f139UJ.m57FN("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDitX/rWP6WWc3h\nDzUcfD8Hbw79yCB7rz18GEkjDapjlUVIa3P8FEQFoOchu7N+vdK6HQNsl2Bql4lv\nWOYuzRWNbLGQ7mNtMca28iCuPHck0AcJzOs9F6qruPL73eY7Ai7yvzs2IfEdyXSz\nHP/yXgEOi5ZEBfsBZEPMJw6vfHJVueuD/lh/LkoJ/gXEKMCM/pkIzGpBPd2TsIg8\nZdvOGMPy+MOnJb1Qfe0y3QQdc5VPVdZFWoWsM9RAenHmE3d1THb+uNZZZcnM1tV7\nxYgBbIhgHtXAZnWDWDRBM3xJPR3O9dfBHHt/tbyrZrSwK1IgwFgqfYm/tRbmp4y/\n1DhIF6mDAgMBAAECggEAIzDjS2gEFNiZ0a6nouVSb1f47sHq8OgR1jp619seMNkR\n6Rzs4xtON8VzO1REl47lsAgi6O9SgxlEtykIiglBqDNQGNw4SNHqM6nAEuvF3sv/\n27CYb2JGFuPdq+UVAOHk4b93dH6uS95ipA8DV97psRVP3P1EqkGjGISTjf/2S4IG\n10Q0UhP4xxiRS2iCtaIq0fbvnrChqYRlYQYpkkRCCH+Q4FNKquSsqmWyCu5yfeQM\nMek+aT9KgvmCh05UCeqC1x7xPtSneNbpJpLD5zW8CcG7EYFDtIP8b9BPDlud47ZH\n5Y4/wyQQFHHLOaniTJVvEJZ7cIoXy2gOhvgcHpNryQKBgQDxNNtXnCfVK0JYNhnU\n5WCOX9NeW9Q79HldhTM5/EqsjA5H21j5S7A/duBSRfX7iou1hyXaa2p+J7rxF9sj\nNlwHPsKhprskxXaHJ7qU84gSmwORsTQQPmtTsizGwVsM330+Q2ZROaSEfDoUqH9+\nKBKs6K+FOldcTOrCZ+ILk8werwKBgQDwnQUrKATzRThVdD6Hcgt/F/SAizDmvtiT\nVvRcGkiV3EtB5Rx8zFNJ9GWrqSAArwIxTWgfYCYsvpUjbJW02Mg0Ufj2+YhjT713\nO9yViwUq996St9eLwGQO5FDMD8FYi7bRAiZEAeAeIEeveDRsNK15++8VVJVo7b2l\nzcapp5k3bQKBgQDSiJNHRhqSet6+xgIIDGoZ+1Qv0TFPX5UrZt8OpsK7FshEOhXQ\nCxt8WZN03HHXK9fEC4GjwwxBrwYB+BOjCYiMHmCd3j0M3HoXgDrgViyYKMuVuDk8\nUG83r5ZbqVuCwfO8i/HbxddueEvtyiD2CZ47ZCIHxKOKAe0K4Mex2UBaKwKBgQDi\nrEouOelP9Kn5dyVhHENQXBTu9DIBb1FAnO5fxjMTWxFa5qhLuYHNbfxKF24atsRu\nBepNhJryFCkT0jvGv2L8Ry0wHiwqwvhO14obJ3ia3iBEQAVDlt+sV9L2KvGOpTB4\n/nlmIA4u02I1IBziw02aWYkGo0SOMUo0ZQL+2PEykQKBgAV1uqiJlWuA9uPdFFJP\nZPL2YoOuTWdWfIwIb/UdsbUuTckCgqPIqUPi3HhiVSunOgcO7HWK3GD3j8k4XEbW\nG4y+Ik0lLrWzBl728tZe1GENzTf8aapElHlUfFSM4OlrTRBsbMOsQBcJNh7QbyoZ\nBHiZZTbRUY6xUR4DGYkCOksF", Kuaikan.f127q);
                                        JSONObject jSONObject5 = new JSONObject();
                                        jSONObject5.put(strM809, strM62q);
                                        jSONObject5.put(strM801, strM57FN);
                                        new JSONArray();
                                        C0106ZJ.m486MH(C0106ZJ.m488QU(), C0175.m834(f838short, 340, 54, 1946), jSONObject5.toString(), this.f139UJ.m61j(jCurrentTimeMillis), new AbstractC0099V3.Qe(this, i5) { // from class: com.github.catvod.spider.Kuaikan.5.1

                                            /* renamed from: short, reason: not valid java name */
                                            private static final short[] f839short = {681, 702, 691, 682, 698, 281, 279, 267, 278, 281, 277, 285, 534, 530, 540, 573, 534, 538, 619, 540, 536, 520, 554, 540, 520, 530, 569, 616, 543, 522, 542, 537, 538, 522, 526, 538, 538, 623, 540, 533, 538, 543, 536, 537, 562, 522, 528, 537, 572, 522, 536, 562, 514, 529, 622, 526, 541, 561, 574, 542, 572, 574, 526, 562, 622, 546, 565, 535, 528, 563, 561, 622, 542, 534, 541, 619, 593, 616, 552, 570, 556, 527, 546, 538, 528, 564, 523, 569, 573, 526, 536, 520, 513, 513, 522, 622, 522, 575, 553, 531, 563, 553, 530, 533, 572, 572, 553, 514, 547, 543, 559, 537, 628, 527, 524, 515, 564, 554, 520, 541, 624, 537, 529, 523, 611, 622, 541, 619, 557, 554, 611, 537, 621, 572, 532, 554, 541, 524, 563, 528, 628, 593, 618, 523, 530, 528, 574, 617, 556, 528, 567, 521, 521, 558, 513, 520, 532, 575, 526, 545, 528, 628, 616, 557, 545, 521, 531, 566, 521, 616, 529, 616, 528, 540, 553, 557, 533, 545, 557, 556, 538, 521, 531, 611, 572, 572, 611, 547, 513, 561, 569, 552, 570, 567, 568, 628, 572, 537, 560, 568, 525, 547, 520, 547, 540, 575, 593, 611, 561, 611, 553, 529, 623, 522, 563, 532, 520, 541, 563, 610, 541, 611, 537, 617, 556, 530, 543, 538, 522, 538, 537, 518, 539, 529, 537, 535, 518, 2659, 2670, 2661, 2680, 1884, 1871, 1880, 1884, 1870, 1854, 1826, 1830, 1845, 1844, 497, 484, 482, 502, 1651, 1638, 1632, 1614, 1635, 31175, 21047, 3103, 3090, 1707, 2290, 306, 289, 310, 306, 282, 311, 21853, 20823, 428, 432, 436, 423, 412, 433, 22226, 18011};

                                            /* renamed from: QU */
                                            final C00265 f141QU;

                                            /* renamed from: xC */
                                            final int f142xC;

                                            {
                                                this.f141QU = this;
                                                this.f142xC = i5;
                                                int iM830 = C0174.m830();
                                                int i7 = 1616;
                                                while (true) {
                                                    i7 ^= 1633;
                                                    switch (i7) {
                                                        case 14:
                                                        case 49:
                                                            i7 = iM830 <= 0 ? 1709 : 1678;
                                                        case 204:
                                                            System.out.println(Float.decode(C0174.m831("u63Xt0cB6ZgKmR")));
                                                            break;
                                                        case 239:
                                                            break;
                                                    }
                                                    return;
                                                }
                                            }

                                            @Override // com.github.catvod.spider.merge.AbstractC0099V3
                                            public void onFailure(Call call, Exception exc) {
                                                int iM807 = C0168.m807();
                                                int i7 = 1616;
                                                while (true) {
                                                    i7 ^= 1633;
                                                    switch (i7) {
                                                        case 14:
                                                        case 49:
                                                            i7 = iM807 <= 0 ? 1709 : 1678;
                                                        case 204:
                                                            System.out.println(Long.decode(C0168.m808("pYcXnqKH5Cqj9UEy4dDM88q08Mj")));
                                                            break;
                                                        case 239:
                                                            break;
                                                    }
                                                    return;
                                                }
                                            }

                                            /* JADX WARN: Failed to find 'out' block for switch in B:20:0x017d. Please report as an issue. */
                                            /* JADX WARN: Failed to find 'out' block for switch in B:34:0x01f5. Please report as an issue. */
                                            /* JADX WARN: Failed to find 'out' block for switch in B:7:0x010e. Please report as an issue. */
                                            @Override // com.github.catvod.spider.merge.AbstractC0099V3
                                            public String onResponse(String str2) throws JSONException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException {
                                                JSONArray jSONArray2;
                                                JSONArray jSONArray3;
                                                JSONArray jSONArray4;
                                                JSONArray jSONArray5;
                                                JSONObject jSONObject6;
                                                JSONArray jSONArray6;
                                                int i7;
                                                String strM820 = C0172.m820(f839short, 0, 5, 735);
                                                String strM836 = C0176.m836(f839short, 5, 3, 370);
                                                String strM861 = C0182.m861(f839short, 8, 4, 376);
                                                try {
                                                    JSONObject jSONObject7 = new JSONObject(str2);
                                                    String strM60W2 = this.f141QU.f139UJ.m60W(C0172.m820(f839short, 12, 219, 603), jSONObject7.getString(C0172.m820(f839short, 231, 6, 626)));
                                                    JSONObject jSONObject8 = new JSONObject(this.f141QU.f139UJ.m58QU(strM60W2.substring(0, 16), strM60W2.substring(16, 32), jSONObject7.getString(C0175.m834(f839short, 237, 4, 2561))));
                                                    jSONArray2 = jSONObject8.getJSONArray(C0168.m805(f839short, 241, 5, 1853));
                                                    jSONArray3 = jSONObject8.getJSONArray(C0174.m828(f839short, 246, 5, 1863));
                                                    jSONArray4 = jSONObject8.getJSONArray(C0182.m861(f839short, 251, 4, 389));
                                                    jSONArray5 = new JSONArray();
                                                    jSONObject6 = new JSONObject();
                                                    jSONObject6.put(strM836, C0180.m851(f839short, 255, 5, 1543));
                                                    jSONObject6.put(strM861, C0169.m809(f839short, 260, 2, 1468));
                                                    jSONArray6 = new JSONArray();
                                                    i7 = 0;
                                                } catch (JSONException e2) {
                                                    int i8 = 49790;
                                                    while (true) {
                                                        i8 ^= 49807;
                                                        switch (i8) {
                                                            case 18:
                                                                break;
                                                            case 241:
                                                                i8 = 49821;
                                                                break;
                                                        }
                                                    }
                                                }
                                                while (true) {
                                                    int length2 = jSONArray4.length();
                                                    String strM8362 = C0176.m836(f839short, 262, 2, 3190);
                                                    String strM816 = C0171.m816(f839short, 264, 1, 1757);
                                                    String strM8162 = C0171.m816(f839short, 265, 1, 2204);
                                                    int i9 = 1616;
                                                    while (true) {
                                                        i9 ^= 1633;
                                                        switch (i9) {
                                                            case 14:
                                                            case 49:
                                                                i9 = i7 < length2 ? 1709 : 1678;
                                                            case 204:
                                                                JSONObject jSONObject9 = jSONArray4.getJSONObject(i7);
                                                                JSONObject jSONObject10 = new JSONObject();
                                                                jSONObject10.put(strM8162, jSONObject9.getString(strM861));
                                                                jSONObject10.put(strM816, jSONObject9.getString(strM8362));
                                                                jSONArray6.put(jSONObject10);
                                                                i7++;
                                                                int i10 = 1740;
                                                                while (true) {
                                                                    i10 ^= 1757;
                                                                    switch (i10) {
                                                                        case 17:
                                                                            i10 = 1771;
                                                                            break;
                                                                        case 54:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 239:
                                                                break;
                                                        }
                                                        jSONObject6.put(strM820, jSONArray6);
                                                        jSONArray5.put(jSONObject6);
                                                        JSONObject jSONObject11 = new JSONObject();
                                                        jSONObject11.put(strM836, C0182.m861(f839short, 266, 6, 339));
                                                        jSONObject11.put(strM861, C0168.m805(f839short, 272, 2, 621));
                                                        JSONArray jSONArray7 = new JSONArray();
                                                        int i11 = 0;
                                                        while (true) {
                                                            int length3 = jSONArray2.length();
                                                            int i12 = 1864;
                                                            while (true) {
                                                                i12 ^= 1881;
                                                                switch (i12) {
                                                                    case 17:
                                                                        i12 = i11 < length3 ? 48736 : 48705;
                                                                    case 47384:
                                                                        break;
                                                                    case 47417:
                                                                        JSONObject jSONObject12 = jSONArray2.getJSONObject(i11);
                                                                        JSONObject jSONObject13 = new JSONObject();
                                                                        jSONObject13.put(strM8162, jSONObject12.getString(strM861));
                                                                        jSONObject13.put(strM816, jSONObject12.getString(strM8362));
                                                                        jSONArray7.put(jSONObject13);
                                                                        int i13 = i11 + 1;
                                                                        int i14 = 48767;
                                                                        while (true) {
                                                                            i14 ^= 48784;
                                                                            switch (i14) {
                                                                                case 14:
                                                                                    break;
                                                                                case 239:
                                                                                    i14 = 48798;
                                                                                    break;
                                                                            }
                                                                        }
                                                                        i11 = i13;
                                                                        break;
                                                                    case 47483:
                                                                }
                                                                jSONObject11.put(strM820, jSONArray7);
                                                                jSONArray5.put(jSONObject11);
                                                                JSONObject jSONObject14 = new JSONObject();
                                                                jSONObject14.put(strM836, C0177.m841(f839short, 274, 6, 469));
                                                                jSONObject14.put(strM861, C0179.m849(f839short, 280, 2, 2214));
                                                                JSONArray jSONArray8 = new JSONArray();
                                                                int i15 = 0;
                                                                while (true) {
                                                                    int length4 = jSONArray3.length();
                                                                    int i16 = 48891;
                                                                    while (true) {
                                                                        i16 ^= 48908;
                                                                        switch (i16) {
                                                                            case 22:
                                                                            case 53:
                                                                                break;
                                                                            case 503:
                                                                                i16 = i15 < length4 ? 49635 : 48953;
                                                                            case 32495:
                                                                                JSONObject jSONObject15 = jSONArray3.getJSONObject(i15);
                                                                                JSONObject jSONObject16 = new JSONObject();
                                                                                jSONObject16.put(strM8162, jSONObject15.getString(strM861));
                                                                                jSONObject16.put(strM816, jSONObject15.getString(strM8362));
                                                                                jSONArray8.put(jSONObject16);
                                                                                int i17 = i15 + 1;
                                                                                int i18 = 49666;
                                                                                while (true) {
                                                                                    i18 ^= 49683;
                                                                                    switch (i18) {
                                                                                        case 17:
                                                                                            i18 = 49697;
                                                                                            break;
                                                                                        case 50:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                i15 = i17;
                                                                                break;
                                                                        }
                                                                        jSONObject14.put(strM820, jSONArray8);
                                                                        jSONArray5.put(jSONObject14);
                                                                        this.f141QU.f138QU.put(this.f142xC + "", jSONArray5);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return str2;
                                                }
                                            }
                                        });
                                        break;
                                }
                            }
                            i = i3 + 1;
                            int i7 = 1864;
                            while (true) {
                                i7 ^= 1881;
                                switch (i7) {
                                    case 17:
                                        i7 = 48674;
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
                return str;
            }
        }
    }

    public Kuaikan() {
        int iM818 = C0171.m818();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = iM818 >= 0 ? 1709 : 1678;
                case 204:
                    System.out.println(Long.parseLong(C0180.m852("Fsku6csTQy")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* renamed from: xC */
    private void m56xC() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = f128xC;
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = jCurrentTimeMillis > j ? 1709 : 1678;
                case 204:
                    try {
                        JSONObject jSONObject = new JSONObject();
                        long jCurrentTimeMillis2 = System.currentTimeMillis() / 1000;
                        String strM63se = m63se(C0178.m845(f833short, 0, 74, 520) + jCurrentTimeMillis2 + C0168.m805(f833short, 74, 6, 594));
                        jSONObject.put(C0179.m849(f833short, 80, 5, 1345), C0175.m834(f833short, 85, 10, 2192));
                        jSONObject.put(C0180.m851(f833short, 95, 4, 1145), strM63se);
                        jSONObject.put(C0170.m814(f833short, 99, 9, 2762), jCurrentTimeMillis2);
                        String strM62q = m62q(C0177.m841(f833short, 108, 16, 491), C0181.m856(f833short, 124, 16, 1566), jSONObject.toString());
                        String strM57FN = m57FN("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDitX/rWP6WWc3h\nDzUcfD8Hbw79yCB7rz18GEkjDapjlUVIa3P8FEQFoOchu7N+vdK6HQNsl2Bql4lv\nWOYuzRWNbLGQ7mNtMca28iCuPHck0AcJzOs9F6qruPL73eY7Ai7yvzs2IfEdyXSz\nHP/yXgEOi5ZEBfsBZEPMJw6vfHJVueuD/lh/LkoJ/gXEKMCM/pkIzGpBPd2TsIg8\nZdvOGMPy+MOnJb1Qfe0y3QQdc5VPVdZFWoWsM9RAenHmE3d1THb+uNZZZcnM1tV7\nxYgBbIhgHtXAZnWDWDRBM3xJPR3O9dfBHHt/tbyrZrSwK1IgwFgqfYm/tRbmp4y/\n1DhIF6mDAgMBAAECggEAIzDjS2gEFNiZ0a6nouVSb1f47sHq8OgR1jp619seMNkR\n6Rzs4xtON8VzO1REl47lsAgi6O9SgxlEtykIiglBqDNQGNw4SNHqM6nAEuvF3sv/\n27CYb2JGFuPdq+UVAOHk4b93dH6uS95ipA8DV97psRVP3P1EqkGjGISTjf/2S4IG\n10Q0UhP4xxiRS2iCtaIq0fbvnrChqYRlYQYpkkRCCH+Q4FNKquSsqmWyCu5yfeQM\nMek+aT9KgvmCh05UCeqC1x7xPtSneNbpJpLD5zW8CcG7EYFDtIP8b9BPDlud47ZH\n5Y4/wyQQFHHLOaniTJVvEJZ7cIoXy2gOhvgcHpNryQKBgQDxNNtXnCfVK0JYNhnU\n5WCOX9NeW9Q79HldhTM5/EqsjA5H21j5S7A/duBSRfX7iou1hyXaa2p+J7rxF9sj\nNlwHPsKhprskxXaHJ7qU84gSmwORsTQQPmtTsizGwVsM330+Q2ZROaSEfDoUqH9+\nKBKs6K+FOldcTOrCZ+ILk8werwKBgQDwnQUrKATzRThVdD6Hcgt/F/SAizDmvtiT\nVvRcGkiV3EtB5Rx8zFNJ9GWrqSAArwIxTWgfYCYsvpUjbJW02Mg0Ufj2+YhjT713\nO9yViwUq996St9eLwGQO5FDMD8FYi7bRAiZEAeAeIEeveDRsNK15++8VVJVo7b2l\nzcapp5k3bQKBgQDSiJNHRhqSet6+xgIIDGoZ+1Qv0TFPX5UrZt8OpsK7FshEOhXQ\nCxt8WZN03HHXK9fEC4GjwwxBrwYB+BOjCYiMHmCd3j0M3HoXgDrgViyYKMuVuDk8\nUG83r5ZbqVuCwfO8i/HbxddueEvtyiD2CZ47ZCIHxKOKAe0K4Mex2UBaKwKBgQDi\nrEouOelP9Kn5dyVhHENQXBTu9DIBb1FAnO5fxjMTWxFa5qhLuYHNbfxKF24atsRu\nBepNhJryFCkT0jvGv2L8Ry0wHiwqwvhO14obJ3ia3iBEQAVDlt+sV9L2KvGOpTB4\n/nlmIA4u02I1IBziw02aWYkGo0SOMUo0ZQL+2PEykQKBgAV1uqiJlWuA9uPdFFJP\nZPL2YoOuTWdWfIwIb/UdsbUuTckCgqPIqUPi3HhiVSunOgcO7HWK3GD3j8k4XEbW\nG4y+Ik0lLrWzBl728tZe1GENzTf8aapElHlUfFSM4OlrTRBsbMOsQBcJNh7QbyoZ\nBHiZZTbRUY6xUR4DGYkCOksF", C0169.m809(f833short, 140, 32, 1943));
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(C0181.m856(f833short, 172, 4, 1397), strM62q);
                        jSONObject2.put(C0166.m801(f833short, 176, 6, 835), strM57FN);
                        C0106ZJ.m486MH(C0106ZJ.m488QU(), C0165.m798(f833short, 182, 49, 1723), jSONObject2.toString(), m61j(jCurrentTimeMillis2), new AbstractC0099V3.Qe(this) { // from class: com.github.catvod.spider.Kuaikan.1

                            /* renamed from: short, reason: not valid java name */
                            private static final short[] f834short = {2971, 2975, 2961, 2992, 2971, 2967, 3046, 2961, 2965, 2949, 2983, 2961, 2949, 2975, 2996, 3045, 2962, 2951, 2963, 2964, 2967, 2951, 2947, 2967, 2967, 3042, 2961, 2968, 2967, 2962, 2965, 2964, 3007, 2951, 2973, 2964, 2993, 2951, 2965, 3007, 2959, 2972, 3043, 2947, 2960, 3004, 2995, 2963, 2993, 2995, 2947, 3007, 3043, 2991, 3000, 2970, 2973, 3006, 3004, 3043, 2963, 2971, 2960, 3046, 3036, 3045, 2981, 2999, 2977, 2946, 2991, 2967, 2973, 3001, 2950, 2996, 2992, 2947, 2965, 2949, 2956, 2956, 2951, 3043, 2951, 2994, 2980, 2974, 3006, 2980, 2975, 2968, 2993, 2993, 2980, 2959, 2990, 2962, 2978, 2964, 3065, 2946, 2945, 2958, 3001, 2983, 2949, 2960, 3069, 2964, 2972, 2950, 3054, 3043, 2960, 3046, 2976, 2983, 3054, 2964, 3040, 2993, 2969, 2983, 2960, 2945, 3006, 2973, 3065, 3036, 3047, 2950, 2975, 2973, 2995, 3044, 2977, 2973, 3002, 2948, 2948, 2979, 2956, 2949, 2969, 2994, 2947, 2988, 2973, 3065, 3045, 2976, 2988, 2948, 2974, 3003, 2948, 3045, 2972, 3045, 2973, 2961, 2980, 2976, 2968, 2988, 2976, 2977, 2967, 2948, 2974, 3054, 2993, 2993, 3054, 2990, 2956, 3004, 2996, 2981, 2999, 3002, 2997, 3065, 2993, 2964, 3005, 2997, 2944, 2990, 2949, 2990, 2961, 2994, 3036, 3054, 3004, 3054, 2980, 2972, 3042, 2951, 3006, 2969, 2949, 2960, 3006, 3055, 2960, 3054, 2964, 3044, 2977, 2975, 2962, 2967, 2951, 2967, 2964, 2114, 2143, 2133, 2141, 2131, 2114, 972, 961, 970, 983, 703, 686, 681, 698, 687, 690, 692, 693, 555, 558, 571, 558};

                            /* renamed from: xC */
                            final Kuaikan f130xC;

                            {
                                this.f130xC = this;
                                int iM837 = C0176.m837();
                                int i2 = 1616;
                                while (true) {
                                    i2 ^= 1633;
                                    switch (i2) {
                                        case 14:
                                        case 49:
                                            i2 = iM837 <= 0 ? 1709 : 1678;
                                        case 204:
                                            System.out.println(Double.decode(C0169.m810("B6WhpbDH6zvLsC3")));
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
                            public String onResponse(String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException {
                                try {
                                    JSONObject jSONObject3 = new JSONObject(str);
                                    String strM60W = this.f130xC.m60W(C0176.m836(f834short, 0, 219, 3030), jSONObject3.getString(C0169.m809(f834short, 219, 6, 2102)));
                                    JSONObject jSONObject4 = new JSONObject(this.f130xC.m58QU(strM60W.substring(0, 16), strM60W.substring(16, 32), jSONObject3.getString(C0165.m798(f834short, 225, 4, 942))));
                                    long unused = Kuaikan.f128xC = jSONObject4.getLong(C0176.m836(f834short, 229, 8, 731)) * 1000;
                                    String unused2 = Kuaikan.f127q = jSONObject4.getString(C0175.m834(f834short, 237, 4, 591));
                                    this.f130xC.m59Uf();
                                } catch (JSONException e) {
                                    int i2 = 1616;
                                    while (true) {
                                        i2 ^= 1633;
                                        switch (i2) {
                                            case 14:
                                                break;
                                            case 49:
                                                i2 = 1647;
                                                break;
                                        }
                                    }
                                }
                                return str;
                            }
                        });
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = 1771;
                                    break;
                                case 54:
                                    break;
                            }
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                        return;
                    }
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0067. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0095. Please report as an issue. */
    /* renamed from: FN */
    String m57FN(String str, String str2) throws InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException {
        int i;
        try {
            PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance(C0182.m861(f833short, 231, 3, 515)).generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str, 0)));
            Cipher cipher = Cipher.getInstance(C0175.m834(f833short, 234, 20, 1269));
            cipher.init(1, privateKeyGeneratePrivate);
            byte[] bytes = str2.getBytes();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int length = bytes.length;
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        if (length > 256) {
                            break;
                        } else {
                            i2 = 1709;
                        }
                    case 204:
                        byteArrayOutputStream.write(cipher.doFinal(bytes));
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
                        int length2 = bytes.length;
                        int i4 = 0;
                        while (true) {
                            int length3 = bytes.length;
                            int i5 = 1864;
                            while (true) {
                                i5 ^= 1881;
                                switch (i5) {
                                    case 17:
                                        i5 = i4 < length3 ? 48736 : 48705;
                                    case 47384:
                                        break;
                                    case 47417:
                                        int i6 = i4 + 256;
                                        int i7 = 48767;
                                        while (true) {
                                            i7 ^= 48784;
                                            switch (i7) {
                                                case 14:
                                                case 45:
                                                    i = 256;
                                                    break;
                                                case 76:
                                                    i = length2 - i4;
                                                    int i8 = 48891;
                                                    while (true) {
                                                        i8 ^= 48908;
                                                        switch (i8) {
                                                            case 22:
                                                                break;
                                                            case 503:
                                                                i8 = 48922;
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                case 239:
                                                    i7 = i6 > length2 ? 48860 : 48829;
                                            }
                                        }
                                        byteArrayOutputStream.write(cipher.doFinal(bytes, i4, i));
                                        int i9 = 49666;
                                        while (true) {
                                            i9 ^= 49683;
                                            switch (i9) {
                                                case 17:
                                                    i9 = 49697;
                                                    break;
                                                case 50:
                                                    break;
                                            }
                                        }
                                        i4 = i6;
                                        break;
                                    case 47483:
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        continue;
                }
                i2 = 1678;
            }
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: QU */
    String m58QU(String str, String str2, String str3) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), C0176.m836(f833short, 254, 3, 2503));
            Cipher cipher = Cipher.getInstance(C0179.m849(f833short, 257, 20, 3257));
            cipher.init(2, secretKeySpec, new IvParameterSpec(str2.getBytes()));
            return new String(cipher.doFinal(Base64.decode(str3, 0)), C0177.m841(f833short, 277, 5, 2588));
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    /* renamed from: Uf */
    public void m59Uf() {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            String strM63se = m63se(C0178.m845(f833short, 282, 44, 2093) + f126QU + jCurrentTimeMillis + C0175.m834(f833short, 326, 6, 1770));
            jSONObject.put(C0170.m814(f833short, 332, 3, 941), 0);
            jSONObject.put(C0180.m851(f833short, 335, 5, 999), C0182.m861(f833short, 340, 10, 1714));
            jSONObject.put(C0180.m851(f833short, 350, 3, 1799), 0);
            jSONObject.put(C0165.m798(f833short, 353, 4, 2393), strM63se);
            jSONObject.put(C0168.m805(f833short, 357, 9, 3266), jCurrentTimeMillis);
            jSONObject.put(C0169.m809(f833short, 366, 4, 1829), f126QU);
            String strM62q = m62q(f127q.substring(0, 16), f127q.substring(16, 32), jSONObject.toString());
            String strM57FN = m57FN("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDitX/rWP6WWc3h\nDzUcfD8Hbw79yCB7rz18GEkjDapjlUVIa3P8FEQFoOchu7N+vdK6HQNsl2Bql4lv\nWOYuzRWNbLGQ7mNtMca28iCuPHck0AcJzOs9F6qruPL73eY7Ai7yvzs2IfEdyXSz\nHP/yXgEOi5ZEBfsBZEPMJw6vfHJVueuD/lh/LkoJ/gXEKMCM/pkIzGpBPd2TsIg8\nZdvOGMPy+MOnJb1Qfe0y3QQdc5VPVdZFWoWsM9RAenHmE3d1THb+uNZZZcnM1tV7\nxYgBbIhgHtXAZnWDWDRBM3xJPR3O9dfBHHt/tbyrZrSwK1IgwFgqfYm/tRbmp4y/\n1DhIF6mDAgMBAAECggEAIzDjS2gEFNiZ0a6nouVSb1f47sHq8OgR1jp619seMNkR\n6Rzs4xtON8VzO1REl47lsAgi6O9SgxlEtykIiglBqDNQGNw4SNHqM6nAEuvF3sv/\n27CYb2JGFuPdq+UVAOHk4b93dH6uS95ipA8DV97psRVP3P1EqkGjGISTjf/2S4IG\n10Q0UhP4xxiRS2iCtaIq0fbvnrChqYRlYQYpkkRCCH+Q4FNKquSsqmWyCu5yfeQM\nMek+aT9KgvmCh05UCeqC1x7xPtSneNbpJpLD5zW8CcG7EYFDtIP8b9BPDlud47ZH\n5Y4/wyQQFHHLOaniTJVvEJZ7cIoXy2gOhvgcHpNryQKBgQDxNNtXnCfVK0JYNhnU\n5WCOX9NeW9Q79HldhTM5/EqsjA5H21j5S7A/duBSRfX7iou1hyXaa2p+J7rxF9sj\nNlwHPsKhprskxXaHJ7qU84gSmwORsTQQPmtTsizGwVsM330+Q2ZROaSEfDoUqH9+\nKBKs6K+FOldcTOrCZ+ILk8werwKBgQDwnQUrKATzRThVdD6Hcgt/F/SAizDmvtiT\nVvRcGkiV3EtB5Rx8zFNJ9GWrqSAArwIxTWgfYCYsvpUjbJW02Mg0Ufj2+YhjT713\nO9yViwUq996St9eLwGQO5FDMD8FYi7bRAiZEAeAeIEeveDRsNK15++8VVJVo7b2l\nzcapp5k3bQKBgQDSiJNHRhqSet6+xgIIDGoZ+1Qv0TFPX5UrZt8OpsK7FshEOhXQ\nCxt8WZN03HHXK9fEC4GjwwxBrwYB+BOjCYiMHmCd3j0M3HoXgDrgViyYKMuVuDk8\nUG83r5ZbqVuCwfO8i/HbxddueEvtyiD2CZ47ZCIHxKOKAe0K4Mex2UBaKwKBgQDi\nrEouOelP9Kn5dyVhHENQXBTu9DIBb1FAnO5fxjMTWxFa5qhLuYHNbfxKF24atsRu\nBepNhJryFCkT0jvGv2L8Ry0wHiwqwvhO14obJ3ia3iBEQAVDlt+sV9L2KvGOpTB4\n/nlmIA4u02I1IBziw02aWYkGo0SOMUo0ZQL+2PEykQKBgAV1uqiJlWuA9uPdFFJP\nZPL2YoOuTWdWfIwIb/UdsbUuTckCgqPIqUPi3HhiVSunOgcO7HWK3GD3j8k4XEbW\nG4y+Ik0lLrWzBl728tZe1GENzTf8aapElHlUfFSM4OlrTRBsbMOsQBcJNh7QbyoZ\nBHiZZTbRUY6xUR4DGYkCOksF", f127q);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C0176.m836(f833short, 370, 4, 3248), strM62q);
            jSONObject2.put(C0169.m809(f833short, 374, 6, 1727), strM57FN);
            C0106ZJ.m486MH(C0106ZJ.m488QU(), C0168.m805(f833short, 380, 50, 3098), jSONObject2.toString(), m61j(jCurrentTimeMillis), new AbstractC0099V3.Qe(this) { // from class: com.github.catvod.spider.Kuaikan.2

                /* renamed from: short, reason: not valid java name */
                private static final short[] f835short = {474, 478, 464, 497, 474, 470, 423, 464, 468, 452, 486, 464, 452, 478, 501, 420, 467, 454, 466, 469, 470, 454, 450, 470, 470, 419, 464, 473, 470, 467, 468, 469, 510, 454, 476, 469, 496, 454, 468, 510, 462, 477, 418, 450, 465, 509, 498, 466, 496, 498, 450, 510, 418, 494, 505, 475, 476, 511, 509, 418, 466, 474, 465, 423, 413, 420, 484, 502, 480, 451, 494, 470, 476, 504, 455, 501, 497, 450, 468, 452, 461, 461, 454, 418, 454, 499, 485, 479, 511, 485, 478, 473, 496, 496, 485, 462, 495, 467, 483, 469, 440, 451, 448, 463, 504, 486, 452, 465, 444, 469, 477, 455, 431, 418, 465, 423, 481, 486, 431, 469, 417, 496, 472, 486, 465, 448, 511, 476, 440, 413, 422, 455, 478, 476, 498, 421, 480, 476, 507, 453, 453, 482, 461, 452, 472, 499, 450, 493, 476, 440, 420, 481, 493, 453, 479, 506, 453, 420, 477, 420, 476, 464, 485, 481, 473, 493, 481, 480, 470, 453, 479, 431, 496, 496, 431, 495, 461, 509, 501, 484, 502, 507, 500, 440, 496, 469, 508, 500, 449, 495, 452, 495, 464, 499, 413, 431, 509, 431, 485, 477, 419, 454, 511, 472, 452, 465, 511, 430, 465, 431, 469, 421, 480, 478, 467, 470, 454, 470, 469, 2206, 2179, 2185, 2177, 2191, 2206, 1678, 1667, 1672, 1685, 2192, 2197, 2176, 2197, 2284, 2279, 2293, 2243, 2284, 2275, 2286, 2299, 2289, 2283, 2289, 2490, 2487, 1099, 1092, 1099, 1094, 1107, 1113, 1103, 1113, 1520, 1527, 1513};

                /* renamed from: xC */
                final Kuaikan f131xC;

                {
                    this.f131xC = this;
                    int iM844 = C0178.m844();
                    int i2 = 1616;
                    while (true) {
                        i2 ^= 1633;
                        switch (i2) {
                            case 14:
                            case 49:
                                i2 = iM844 >= 0 ? 1709 : 1678;
                            case 204:
                                System.out.println(Double.valueOf(C0165.m797("Oh13XnKNnuKrSIEHi4IjEqU4I3")));
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

                /* JADX WARN: Failed to find 'out' block for switch in B:14:0x00c6. Please report as an issue. */
                /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0080. Please report as an issue. */
                @Override // com.github.catvod.spider.merge.AbstractC0099V3
                public String onResponse(String str) throws JSONException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException {
                    JSONArray jSONArray;
                    int i2;
                    try {
                        JSONObject jSONObject3 = new JSONObject(str);
                        String strM60W = this.f131xC.m60W(C0165.m798(f835short, 0, 219, 407), jSONObject3.getString(C0170.m814(f835short, 219, 6, 2282)));
                        jSONArray = new JSONObject(this.f131xC.m58QU(strM60W.substring(0, 16), strM60W.substring(16, 32), jSONObject3.getString(C0168.m805(f835short, 225, 4, 1772)))).getJSONObject(C0170.m814(f835short, 229, 4, 2292)).getJSONArray(C0183.m866(f835short, 233, 11, 2178));
                        this.f131xC.f129UJ.clear();
                        i2 = 0;
                    } catch (JSONException e) {
                        int i3 = 48891;
                        while (true) {
                            i3 ^= 48908;
                            switch (i3) {
                                case 22:
                                    break;
                                case 503:
                                    i3 = 48922;
                                    break;
                            }
                        }
                    }
                    while (true) {
                        int length = jSONArray.length();
                        int i4 = 1616;
                        while (true) {
                            i4 ^= 1633;
                            switch (i4) {
                                case 14:
                                case 49:
                                    i4 = i2 < length ? 1709 : 1678;
                                case 204:
                                    JSONObject jSONObject4 = jSONArray.getJSONObject(i2);
                                    ArrayList arrayList = new ArrayList();
                                    this.f131xC.f129UJ.put(jSONObject4.getString(C0180.m851(f835short, 244, 2, 2515)), arrayList);
                                    JSONArray jSONArray2 = jSONObject4.getJSONArray(C0174.m828(f835short, 246, 8, 1066));
                                    int i5 = 0;
                                    while (true) {
                                        int length2 = jSONArray2.length();
                                        int i6 = 1740;
                                        while (true) {
                                            i6 ^= 1757;
                                            switch (i6) {
                                                case 17:
                                                    i6 = i5 < length2 ? 1833 : 1802;
                                                case 54:
                                                case 471:
                                                    int i7 = i2 + 1;
                                                    int i8 = 48767;
                                                    while (true) {
                                                        i8 ^= 48784;
                                                        switch (i8) {
                                                            case 14:
                                                                break;
                                                            case 239:
                                                                i8 = 48798;
                                                                break;
                                                        }
                                                    }
                                                    i2 = i7;
                                                    break;
                                                case 500:
                                                    arrayList.add(jSONArray2.getJSONObject(i5).getString(C0168.m805(f835short, 254, 3, 1413)));
                                                    i5++;
                                                    int i9 = 1864;
                                                    while (true) {
                                                        i9 ^= 1881;
                                                        switch (i9) {
                                                            case 17:
                                                                i9 = 48674;
                                                                break;
                                                            case 47483:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    }
                                    break;
                                case 239:
                                    break;
                            }
                        }
                        return str;
                    }
                }
            });
            i = 1616;
        } catch (Throwable th) {
            th.printStackTrace();
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
            int iM822 = C0172.m822();
            int i2 = 1740;
            while (true) {
                i2 ^= 1757;
                switch (i2) {
                    case 17:
                        i2 = iM822 >= 0 ? 1833 : 1802;
                    case 54:
                    case 471:
                        break;
                    case 500:
                        System.out.println(Long.valueOf(C0180.m852("LRKUDXWVKM5k9xXuiidD2d6BnYZL")));
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0069. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0097. Please report as an issue. */
    /* renamed from: W */
    String m60W(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException {
        int i;
        try {
            Cipher cipher = Cipher.getInstance(C0170.m814(f833short, 430, 20, 2721));
            cipher.init(2, (RSAPublicKey) KeyFactory.getInstance(C0178.m845(f833short, 450, 3, 1838)).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0))));
            byte[] bArrDecode = Base64.decode(str2, 0);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int length = bArrDecode.length;
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        if (length > 256) {
                            break;
                        } else {
                            i2 = 1709;
                        }
                    case 204:
                        byteArrayOutputStream.write(cipher.doFinal(bArrDecode));
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
                        int length2 = bArrDecode.length;
                        int i4 = 0;
                        while (true) {
                            int i5 = 1864;
                            while (true) {
                                i5 ^= 1881;
                                switch (i5) {
                                    case 17:
                                        i5 = i4 < length2 ? 48736 : 48705;
                                    case 47384:
                                        break;
                                    case 47417:
                                        int i6 = i4 + 256;
                                        int i7 = 48767;
                                        while (true) {
                                            i7 ^= 48784;
                                            switch (i7) {
                                                case 14:
                                                case 45:
                                                    i = 256;
                                                    break;
                                                case 76:
                                                    i = length2 - i4;
                                                    int i8 = 48891;
                                                    while (true) {
                                                        i8 ^= 48908;
                                                        switch (i8) {
                                                            case 22:
                                                                break;
                                                            case 503:
                                                                i8 = 48922;
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                case 239:
                                                    i7 = i6 > length2 ? 48860 : 48829;
                                            }
                                        }
                                        byteArrayOutputStream.write(cipher.doFinal(bArrDecode, i4, i));
                                        int i9 = 49666;
                                        while (true) {
                                            i9 ^= 49683;
                                            switch (i9) {
                                                case 17:
                                                    i9 = 49697;
                                                    break;
                                                case 50:
                                                    break;
                                            }
                                        }
                                        i4 = i6;
                                        break;
                                    case 47483:
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        continue;
                }
                i2 = 1678;
            }
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            return new String(byteArrayOutputStream.toByteArray(), C0170.m814(f833short, 453, 5, 1824));
        } catch (Exception e) {
            return "";
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException, NumberFormatException {
        int i;
        int i2;
        int i3;
        String strM841 = C0177.m841(f833short, 458, 6, 1534);
        String strM834 = C0175.m834(f833short, 464, 5, 2926);
        String strM8412 = C0177.m841(f833short, 469, 6, 2386);
        try {
            m56xC();
            boolean zContainsKey = map.containsKey(strM8412);
            int i4 = 1616;
            while (true) {
                i4 ^= 1633;
                switch (i4) {
                    case 14:
                    case 49:
                        i4 = zContainsKey ? 1709 : 1678;
                    case 204:
                        int i5 = Integer.parseInt(map.get(strM8412));
                        int i6 = 1740;
                        while (true) {
                            i6 ^= 1757;
                            switch (i6) {
                                case 17:
                                    i6 = 1771;
                                    break;
                                case 54:
                                    i = i5;
                                    break;
                            }
                        }
                        break;
                    case 239:
                        i = 0;
                        break;
                }
            }
            boolean zContainsKey2 = map.containsKey(strM834);
            int i7 = 1864;
            while (true) {
                i7 ^= 1881;
                switch (i7) {
                    case 17:
                        i7 = zContainsKey2 ? 48736 : 48705;
                    case 47384:
                        i2 = 0;
                        break;
                    case 47417:
                        int i8 = Integer.parseInt(map.get(strM834));
                        int i9 = 48767;
                        while (true) {
                            i9 ^= 48784;
                            switch (i9) {
                                case 14:
                                    i2 = i8;
                                    break;
                                case 239:
                                    i9 = 48798;
                                    continue;
                                default:
                                    continue;
                            }
                        }
                    case 47483:
                }
            }
            boolean zContainsKey3 = map.containsKey(strM841);
            int i10 = 48891;
            while (true) {
                i10 ^= 48908;
                switch (i10) {
                    case 22:
                        break;
                    case 53:
                        i3 = 0;
                        break;
                    case 503:
                        if (!zContainsKey3) {
                            break;
                        } else {
                            i10 = 49635;
                        }
                    case 32495:
                        i3 = Integer.parseInt(map.get(strM841));
                        int i11 = 49666;
                        while (true) {
                            i11 ^= 49683;
                            switch (i11) {
                                case 17:
                                    i11 = 49697;
                                    break;
                                case 50:
                                    break;
                            }
                        }
                        break;
                    default:
                        continue;
                }
                i10 = 48953;
            }
            JSONObject jSONObject = new JSONObject();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            String strM63se = m63se(C0166.m801(f833short, 475, 42, 878) + str2 + 18 + str + i2 + i + i3 + jCurrentTimeMillis + C0171.m816(f833short, 517, 6, 408));
            jSONObject.put(C0169.m809(f833short, 523, 5, 3014), C0166.m801(f833short, 528, 10, 1911));
            jSONObject.put(C0165.m798(f833short, 538, 6, 846), str);
            jSONObject.put(strM8412, i);
            jSONObject.put(strM834, i2);
            jSONObject.put(strM841, i3);
            jSONObject.put(C0177.m841(f833short, 544, 4, 2020), Integer.parseInt(str2));
            jSONObject.put(C0168.m805(f833short, 548, 8, 2397), 18);
            jSONObject.put(C0172.m820(f833short, 556, 4, 2279), strM63se);
            jSONObject.put(C0175.m834(f833short, 560, 9, 2536), jCurrentTimeMillis);
            String strM62q = m62q(f127q.substring(0, 16), f127q.substring(16, 32), jSONObject.toString());
            String strM57FN = m57FN("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDitX/rWP6WWc3h\nDzUcfD8Hbw79yCB7rz18GEkjDapjlUVIa3P8FEQFoOchu7N+vdK6HQNsl2Bql4lv\nWOYuzRWNbLGQ7mNtMca28iCuPHck0AcJzOs9F6qruPL73eY7Ai7yvzs2IfEdyXSz\nHP/yXgEOi5ZEBfsBZEPMJw6vfHJVueuD/lh/LkoJ/gXEKMCM/pkIzGpBPd2TsIg8\nZdvOGMPy+MOnJb1Qfe0y3QQdc5VPVdZFWoWsM9RAenHmE3d1THb+uNZZZcnM1tV7\nxYgBbIhgHtXAZnWDWDRBM3xJPR3O9dfBHHt/tbyrZrSwK1IgwFgqfYm/tRbmp4y/\n1DhIF6mDAgMBAAECggEAIzDjS2gEFNiZ0a6nouVSb1f47sHq8OgR1jp619seMNkR\n6Rzs4xtON8VzO1REl47lsAgi6O9SgxlEtykIiglBqDNQGNw4SNHqM6nAEuvF3sv/\n27CYb2JGFuPdq+UVAOHk4b93dH6uS95ipA8DV97psRVP3P1EqkGjGISTjf/2S4IG\n10Q0UhP4xxiRS2iCtaIq0fbvnrChqYRlYQYpkkRCCH+Q4FNKquSsqmWyCu5yfeQM\nMek+aT9KgvmCh05UCeqC1x7xPtSneNbpJpLD5zW8CcG7EYFDtIP8b9BPDlud47ZH\n5Y4/wyQQFHHLOaniTJVvEJZ7cIoXy2gOhvgcHpNryQKBgQDxNNtXnCfVK0JYNhnU\n5WCOX9NeW9Q79HldhTM5/EqsjA5H21j5S7A/duBSRfX7iou1hyXaa2p+J7rxF9sj\nNlwHPsKhprskxXaHJ7qU84gSmwORsTQQPmtTsizGwVsM330+Q2ZROaSEfDoUqH9+\nKBKs6K+FOldcTOrCZ+ILk8werwKBgQDwnQUrKATzRThVdD6Hcgt/F/SAizDmvtiT\nVvRcGkiV3EtB5Rx8zFNJ9GWrqSAArwIxTWgfYCYsvpUjbJW02Mg0Ufj2+YhjT713\nO9yViwUq996St9eLwGQO5FDMD8FYi7bRAiZEAeAeIEeveDRsNK15++8VVJVo7b2l\nzcapp5k3bQKBgQDSiJNHRhqSet6+xgIIDGoZ+1Qv0TFPX5UrZt8OpsK7FshEOhXQ\nCxt8WZN03HHXK9fEC4GjwwxBrwYB+BOjCYiMHmCd3j0M3HoXgDrgViyYKMuVuDk8\nUG83r5ZbqVuCwfO8i/HbxddueEvtyiD2CZ47ZCIHxKOKAe0K4Mex2UBaKwKBgQDi\nrEouOelP9Kn5dyVhHENQXBTu9DIBb1FAnO5fxjMTWxFa5qhLuYHNbfxKF24atsRu\nBepNhJryFCkT0jvGv2L8Ry0wHiwqwvhO14obJ3ia3iBEQAVDlt+sV9L2KvGOpTB4\n/nlmIA4u02I1IBziw02aWYkGo0SOMUo0ZQL+2PEykQKBgAV1uqiJlWuA9uPdFFJP\nZPL2YoOuTWdWfIwIb/UdsbUuTckCgqPIqUPi3HhiVSunOgcO7HWK3GD3j8k4XEbW\nG4y+Ik0lLrWzBl728tZe1GENzTf8aapElHlUfFSM4OlrTRBsbMOsQBcJNh7QbyoZ\nBHiZZTbRUY6xUR4DGYkCOksF", f127q);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C0182.m861(f833short, 569, 4, 2800), strM62q);
            jSONObject2.put(C0175.m834(f833short, 573, 6, 3073), strM57FN);
            JSONObject jSONObject3 = new JSONObject();
            C0106ZJ.m486MH(C0106ZJ.m488QU(), C0170.m814(f833short, 579, 51, 2814), jSONObject2.toString(), m61j(jCurrentTimeMillis), new AbstractC0099V3.Qe(this, jSONObject3, str2) { // from class: com.github.catvod.spider.Kuaikan.3

                /* renamed from: short, reason: not valid java name */
                private static final short[] f836short = {2363, 2367, 2353, 2320, 2363, 2359, 2374, 2353, 2357, 2341, 2311, 2353, 2341, 2367, 2324, 2373, 2354, 2343, 2355, 2356, 2359, 2343, 2339, 2359, 2359, 2370, 2353, 2360, 2359, 2354, 2357, 2356, 2335, 2343, 2365, 2356, 2321, 2343, 2357, 2335, 2351, 2364, 2371, 2339, 2352, 2332, 2323, 2355, 2321, 2323, 2339, 2335, 2371, 2319, 2328, 2362, 2365, 2334, 2332, 2371, 2355, 2363, 2352, 2374, 2428, 2373, 2309, 2327, 2305, 2338, 2319, 2359, 2365, 2329, 2342, 2324, 2320, 2339, 2357, 2341, 2348, 2348, 2343, 2371, 2343, 2322, 2308, 2366, 2334, 2308, 2367, 2360, 2321, 2321, 2308, 2351, 2318, 2354, 2306, 2356, 2393, 2338, 2337, 2350, 2329, 2311, 2341, 2352, 2397, 2356, 2364, 2342, 2382, 2371, 2352, 2374, 2304, 2311, 2382, 2356, 2368, 2321, 2361, 2311, 2352, 2337, 2334, 2365, 2393, 2428, 2375, 2342, 2367, 2365, 2323, 2372, 2305, 2365, 2330, 2340, 2340, 2307, 2348, 2341, 2361, 2322, 2339, 2316, 2365, 2393, 2373, 2304, 2316, 2340, 2366, 2331, 2340, 2373, 2364, 2373, 2365, 2353, 2308, 2304, 2360, 2316, 2304, 2305, 2359, 2340, 2366, 2382, 2321, 2321, 2382, 2318, 2348, 2332, 2324, 2309, 2327, 2330, 2325, 2393, 2321, 2356, 2333, 2325, 2336, 2318, 2341, 2318, 2353, 2322, 2428, 2382, 2332, 2382, 2308, 2364, 2370, 2343, 2334, 2361, 2341, 2352, 2334, 2383, 2352, 2382, 2356, 2372, 2305, 2367, 2354, 2359, 2343, 2359, 2356, 2618, 2599, 2605, 2597, 2603, 2618, 3274, 3271, 3276, 3281, 1620, 1603, 1621, 1619, 1610, 1618, 1621, 2381, 2388, 2399, 2404, 2386, 2399, 2018, 2031, 798, 775, 780, 823, 774, 777, 773, 781, 2155, 2148, 2152, 2144, 2278, 2303, 2292, 2255, 2272, 2297, 2291, 1396, 1389, 1383, 510, 487, 492, 471, 506, 493, 485, 489, 506, 483, 507, 1769, 1771, 1782, 1790, 1771, 1788, 1770, 1770, 1961, 1976, 1982, 1980, 569, 565, 559, 564, 558, 1200, 1185, 1191, 1189, 1187, 1199, 1205, 1198, 1204, 1464, 1469, 1465, 1469, 1440, 1792, 1819, 1792, 1813, 1816, 2357, 2352, 2346, 2349};

                /* renamed from: QU */
                final String f132QU;

                /* renamed from: UJ */
                final Kuaikan f133UJ;

                /* renamed from: xC */
                final JSONObject f134xC;

                {
                    this.f133UJ = this;
                    this.f134xC = jSONObject3;
                    this.f132QU = str2;
                    int iM804 = C0166.m804();
                    int i12 = 1616;
                    while (true) {
                        i12 ^= 1633;
                        switch (i12) {
                            case 14:
                            case 49:
                                i12 = iM804 <= 0 ? 1709 : 1678;
                            case 204:
                                System.out.println(Double.parseDouble(C0172.m823("OqM8lmI14mjWBt")));
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

                /* JADX WARN: Failed to find 'out' block for switch in B:6:0x006c. Please report as an issue. */
                @Override // com.github.catvod.spider.merge.AbstractC0099V3
                public String onResponse(String str3) throws JSONException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException {
                    JSONObject jSONObject4;
                    JSONArray jSONArray;
                    JSONArray jSONArray2;
                    int i12;
                    int i13;
                    try {
                        JSONObject jSONObject5 = new JSONObject(str3);
                        String strM60W = this.f133UJ.m60W(C0183.m866(f836short, 0, 219, 2422), jSONObject5.getString(C0178.m845(f836short, 219, 6, 2638)));
                        jSONObject4 = new JSONObject(this.f133UJ.m58QU(strM60W.substring(0, 16), strM60W.substring(16, 32), jSONObject5.getString(C0179.m849(f836short, 225, 4, 3240))));
                        jSONArray = new JSONArray();
                        jSONArray2 = jSONObject4.getJSONArray(C0172.m820(f836short, 229, 7, 1574));
                        i12 = 0;
                    } catch (JSONException e) {
                        int i14 = 48891;
                        while (true) {
                            i14 ^= 48908;
                            switch (i14) {
                                case 22:
                                    break;
                                case 503:
                                    i14 = 48922;
                                    break;
                            }
                        }
                    }
                    while (true) {
                        int length = jSONArray2.length();
                        int i15 = 1616;
                        while (true) {
                            i15 ^= 1633;
                            switch (i15) {
                                case 14:
                                case 49:
                                    i15 = i12 < length ? 1709 : 1678;
                                case 204:
                                    JSONObject jSONObject6 = jSONArray2.getJSONObject(i12);
                                    JSONObject jSONObject7 = new JSONObject();
                                    jSONObject7.put(C0165.m798(f836short, 236, 6, 2363), jSONObject6.getString(C0168.m805(f836short, 242, 2, 1931)));
                                    jSONObject7.put(C0177.m841(f836short, 244, 8, 872), jSONObject6.getString(C0165.m798(f836short, 252, 4, 2053)));
                                    jSONObject7.put(C0176.m836(f836short, 256, 7, 2192), jSONObject6.getString(C0175.m834(f836short, 263, 3, 1284)));
                                    jSONObject7.put(C0168.m805(f836short, 266, 11, 392), jSONObject6.getString(C0182.m861(f836short, 277, 8, 1689)));
                                    jSONArray.put(jSONObject7);
                                    int i16 = i12 + 1;
                                    int i17 = 1740;
                                    while (true) {
                                        i17 ^= 1757;
                                        switch (i17) {
                                            case 17:
                                                i17 = 1771;
                                                break;
                                            case 54:
                                                break;
                                        }
                                    }
                                    i12 = i16;
                                    break;
                                case 239:
                                    break;
                            }
                            this.f134xC.put(C0176.m836(f836short, 285, 4, 2009), Integer.parseInt(this.f132QU));
                            int i18 = jSONObject4.getInt(C0166.m801(f836short, 289, 5, 602));
                            JSONObject jSONObject8 = this.f134xC;
                            String strM861 = C0182.m861(f836short, 294, 9, 1216);
                            int i19 = 1864;
                            while (true) {
                                i19 ^= 1881;
                                switch (i19) {
                                    case 17:
                                        if (i18 % 20 != 0) {
                                            break;
                                        } else {
                                            i19 = 48736;
                                        }
                                    case 47384:
                                        i13 = (i18 / 20) + 1;
                                        break;
                                    case 47417:
                                        i13 = i18 / 20;
                                        int i20 = 48767;
                                        while (true) {
                                            i20 ^= 48784;
                                            switch (i20) {
                                                case 14:
                                                    break;
                                                case 239:
                                                    i20 = 48798;
                                                    break;
                                            }
                                        }
                                        break;
                                    case 47483:
                                        break;
                                    default:
                                        continue;
                                }
                                i19 = 48705;
                            }
                            jSONObject8.put(strM861, i13);
                            this.f134xC.put(C0176.m836(f836short, 303, 5, 1492), 20);
                            this.f134xC.put(C0166.m801(f836short, 308, 5, 1908), i18);
                            this.f134xC.put(C0177.m841(f836short, 313, 4, 2393), jSONArray);
                        }
                        return str3;
                    }
                }
            });
            return jSONObject3.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String detailContent(List<String> list) throws JSONException {
        try {
            m56xC();
            Init.m46lj();
            JSONObject jSONObject = new JSONObject();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            String strM63se = m63se(C0176.m836(f833short, 630, 42, 2566) + list.get(0) + jCurrentTimeMillis + C0183.m866(f833short, 672, 6, 769));
            jSONObject.put(C0183.m866(f833short, 678, 5, 2407), C0166.m801(f833short, 683, 10, 1567));
            jSONObject.put(C0182.m861(f833short, 693, 2, 2519), list.get(0));
            jSONObject.put(C0183.m866(f833short, 695, 4, 1971), strM63se);
            jSONObject.put(C0165.m798(f833short, 699, 9, 1608), jCurrentTimeMillis);
            String strM62q = m62q(f127q.substring(0, 16), f127q.substring(16, 32), jSONObject.toString());
            String strM57FN = m57FN("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDitX/rWP6WWc3h\nDzUcfD8Hbw79yCB7rz18GEkjDapjlUVIa3P8FEQFoOchu7N+vdK6HQNsl2Bql4lv\nWOYuzRWNbLGQ7mNtMca28iCuPHck0AcJzOs9F6qruPL73eY7Ai7yvzs2IfEdyXSz\nHP/yXgEOi5ZEBfsBZEPMJw6vfHJVueuD/lh/LkoJ/gXEKMCM/pkIzGpBPd2TsIg8\nZdvOGMPy+MOnJb1Qfe0y3QQdc5VPVdZFWoWsM9RAenHmE3d1THb+uNZZZcnM1tV7\nxYgBbIhgHtXAZnWDWDRBM3xJPR3O9dfBHHt/tbyrZrSwK1IgwFgqfYm/tRbmp4y/\n1DhIF6mDAgMBAAECggEAIzDjS2gEFNiZ0a6nouVSb1f47sHq8OgR1jp619seMNkR\n6Rzs4xtON8VzO1REl47lsAgi6O9SgxlEtykIiglBqDNQGNw4SNHqM6nAEuvF3sv/\n27CYb2JGFuPdq+UVAOHk4b93dH6uS95ipA8DV97psRVP3P1EqkGjGISTjf/2S4IG\n10Q0UhP4xxiRS2iCtaIq0fbvnrChqYRlYQYpkkRCCH+Q4FNKquSsqmWyCu5yfeQM\nMek+aT9KgvmCh05UCeqC1x7xPtSneNbpJpLD5zW8CcG7EYFDtIP8b9BPDlud47ZH\n5Y4/wyQQFHHLOaniTJVvEJZ7cIoXy2gOhvgcHpNryQKBgQDxNNtXnCfVK0JYNhnU\n5WCOX9NeW9Q79HldhTM5/EqsjA5H21j5S7A/duBSRfX7iou1hyXaa2p+J7rxF9sj\nNlwHPsKhprskxXaHJ7qU84gSmwORsTQQPmtTsizGwVsM330+Q2ZROaSEfDoUqH9+\nKBKs6K+FOldcTOrCZ+ILk8werwKBgQDwnQUrKATzRThVdD6Hcgt/F/SAizDmvtiT\nVvRcGkiV3EtB5Rx8zFNJ9GWrqSAArwIxTWgfYCYsvpUjbJW02Mg0Ufj2+YhjT713\nO9yViwUq996St9eLwGQO5FDMD8FYi7bRAiZEAeAeIEeveDRsNK15++8VVJVo7b2l\nzcapp5k3bQKBgQDSiJNHRhqSet6+xgIIDGoZ+1Qv0TFPX5UrZt8OpsK7FshEOhXQ\nCxt8WZN03HHXK9fEC4GjwwxBrwYB+BOjCYiMHmCd3j0M3HoXgDrgViyYKMuVuDk8\nUG83r5ZbqVuCwfO8i/HbxddueEvtyiD2CZ47ZCIHxKOKAe0K4Mex2UBaKwKBgQDi\nrEouOelP9Kn5dyVhHENQXBTu9DIBb1FAnO5fxjMTWxFa5qhLuYHNbfxKF24atsRu\nBepNhJryFCkT0jvGv2L8Ry0wHiwqwvhO14obJ3ia3iBEQAVDlt+sV9L2KvGOpTB4\n/nlmIA4u02I1IBziw02aWYkGo0SOMUo0ZQL+2PEykQKBgAV1uqiJlWuA9uPdFFJP\nZPL2YoOuTWdWfIwIb/UdsbUuTckCgqPIqUPi3HhiVSunOgcO7HWK3GD3j8k4XEbW\nG4y+Ik0lLrWzBl728tZe1GENzTf8aapElHlUfFSM4OlrTRBsbMOsQBcJNh7QbyoZ\nBHiZZTbRUY6xUR4DGYkCOksF", f127q);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C0175.m834(f833short, 708, 4, 1562), strM62q);
            jSONObject2.put(C0171.m816(f833short, 712, 6, 2110), strM57FN);
            JSONObject jSONObject3 = new JSONObject();
            C0106ZJ.m486MH(C0106ZJ.m488QU(), C0178.m845(f833short, 718, 47, 2489) + list.get(0) + C0182.m861(f833short, 765, 4, 799), jSONObject2.toString(), m61j(jCurrentTimeMillis), new AbstractC0099V3.Qe(this, list, jSONObject3) { // from class: com.github.catvod.spider.Kuaikan.4

                /* renamed from: short, reason: not valid java name */
                private static final short[] f837short = {2131, 2131, 2131, 3117, 3106, 3118, 3110, 2028, 2017, 3136, 2286, 2282, 2276, 2245, 2286, 2274, 2195, 2276, 2272, 2288, 2258, 2276, 2288, 2282, 2241, 2192, 2279, 2290, 2278, 2273, 2274, 2290, 2294, 2274, 2274, 2199, 2276, 2285, 2274, 2279, 2272, 2273, 2250, 2290, 2280, 2273, 2244, 2290, 2272, 2250, 2298, 2281, 2198, 2294, 2277, 2249, 2246, 2278, 2244, 2246, 2294, 2250, 2198, 2266, 2253, 2287, 2280, 2251, 2249, 2198, 2278, 2286, 2277, 2195, 2217, 2192, 2256, 2242, 2260, 2295, 2266, 2274, 2280, 2252, 2291, 2241, 2245, 2294, 2272, 2288, 2297, 2297, 2290, 2198, 2290, 2247, 2257, 2283, 2251, 2257, 2282, 2285, 2244, 2244, 2257, 2298, 2267, 2279, 2263, 2273, 2188, 2295, 2292, 2299, 2252, 2258, 2288, 2277, 2184, 2273, 2281, 2291, 2203, 2198, 2277, 2195, 2261, 2258, 2203, 2273, 2197, 2244, 2284, 2258, 2277, 2292, 2251, 2280, 2188, 2217, 2194, 2291, 2282, 2280, 2246, 2193, 2260, 2280, 2255, 2289, 2289, 2262, 2297, 2288, 2284, 2247, 2294, 2265, 2280, 2188, 2192, 2261, 2265, 2289, 2283, 2254, 2289, 2192, 2281, 2192, 2280, 2276, 2257, 2261, 2285, 2265, 2261, 2260, 2274, 2289, 2283, 2203, 2244, 2244, 2203, 2267, 2297, 2249, 2241, 2256, 2242, 2255, 2240, 2188, 2244, 2273, 2248, 2240, 2293, 2267, 2288, 2267, 2276, 2247, 2217, 2203, 2249, 2203, 2257, 2281, 2199, 2290, 2251, 2284, 2288, 2277, 2251, 2202, 2277, 2203, 2273, 2193, 2260, 2282, 2279, 2274, 2290, 2274, 2273, 720, 717, 711, 719, 705, 720, 2907, 2902, 2909, 2880, 1001, 1004, 1017, 1004, 1610, 1619, 1624, 1635, 1621, 1624, 3061, 3052, 3047, 3036, 3053, 3042, 3054, 3046, 821, 812, 807, 796, 819, 810, 800, 1813, 1804, 1798, 1912, 1889, 1898, 1873, 1911, 1899, 1903, 1916, 3166, 3138, 3142, 3157, 275, 266, 257, 314, 279, 256, 264, 260, 279, 270, 278, 2361, 2363, 2342, 2350, 2363, 2348, 2362, 2362, 3199, 3174, 3181, 3158, 3176, 3178, 3197, 3174, 3195, 960, 962, 981, 974, 979, 2354, 2347, 2336, 2331, 2336, 2349, 2358, 2337, 2343, 2352, 2347, 2358, 2823, 2826, 2833, 2822, 2816, 2839, 2828, 2833, 1386, 1395, 1400, 1347, 1407, 1395, 1394, 1384, 1401, 1394, 1384, 3186, 3198, 3199, 3173, 3188, 3199, 3173, 1980, 1980, 1980, 1976, 2028, 1979, 2024, 1969, 1979, 2024, 1979, 1976, 2024, 1968, 2024, 1976, 455, 403, 414, 400, 453, 403, 404, 405, 400, 404, 406, 400, 455, 404, 453, 452, 2032, 2043, 2025, 1998, 2034, 2047, 2023, 2044, 2047, 2045, 2037, 3285, 3264, 3289, 3267, 3295, 3284, 3285, 3267, 2170, 2151, 2170, 2146, 2155, 2725, 2722, 2748, 1277, 1276, 1262, 1157, 1168, 1294, 554, 854, 847, 836, 895, 848, 844, 833, 857, 895, 838, 850, 847, 845, 1528, 1505, 1514, 1489, 1534, 1506, 1519, 1527, 1489, 1531, 1532, 1506, 1726, 1723, 1697, 1702};

                /* renamed from: QU */
                final JSONObject f135QU;

                /* renamed from: UJ */
                final Kuaikan f136UJ;

                /* renamed from: xC */
                final List f137xC;

                {
                    this.f136UJ = this;
                    this.f137xC = list;
                    this.f135QU = jSONObject3;
                    int iM844 = C0178.m844();
                    int i = 1616;
                    while (true) {
                        i ^= 1633;
                        switch (i) {
                            case 14:
                            case 49:
                                i = iM844 >= 0 ? 1709 : 1678;
                            case 204:
                                System.out.println(Integer.parseInt(C0177.m839("4deLqjUHmhqIqJWgJbh")));
                                break;
                            case 239:
                                break;
                        }
                        return;
                    }
                }

                @Override // com.github.catvod.spider.merge.AbstractC0099V3
                public void onFailure(Call call, Exception exc) {
                    int iM807 = C0168.m807();
                    int i = 1616;
                    while (true) {
                        i ^= 1633;
                        switch (i) {
                            case 14:
                            case 49:
                                i = iM807 <= 0 ? 1709 : 1678;
                            case 204:
                                System.out.println(Long.parseLong(C0177.m839("bd5UwPLUBFIRjt")));
                                break;
                            case 239:
                                break;
                        }
                        return;
                    }
                }

                /* JADX WARN: Failed to find 'out' block for switch in B:14:0x01f3. Please report as an issue. */
                /* JADX WARN: Failed to find 'out' block for switch in B:6:0x01bc. Please report as an issue. */
                @Override // com.github.catvod.spider.merge.AbstractC0099V3
                public String onResponse(String str) {
                    JSONArray jSONArray;
                    JSONObject jSONObject4;
                    JSONArray jSONArray2;
                    LinkedHashMap linkedHashMap;
                    int i;
                    String strM805 = C0168.m805(f837short, 0, 3, 2167);
                    String strM849 = C0179.m849(f837short, 3, 4, 3139);
                    String strM816 = C0171.m816(f837short, 7, 2, 1925);
                    String strM861 = C0182.m861(f837short, 9, 1, 3132);
                    try {
                        JSONObject jSONObject5 = new JSONObject(str);
                        String strM60W = this.f136UJ.m60W(C0172.m820(f837short, 10, 219, 2211), jSONObject5.getString(C0174.m828(f837short, 229, 6, 676)));
                        JSONObject jSONObject6 = new JSONObject(this.f136UJ.m58QU(strM60W.substring(0, 16), strM60W.substring(16, 32), jSONObject5.getString(C0177.m841(f837short, 235, 4, 2873)))).getJSONObject(C0177.m841(f837short, 239, 4, 909));
                        jSONArray = new JSONArray();
                        jSONObject4 = new JSONObject();
                        jSONObject4.put(C0183.m866(f837short, 243, 6, 1596), jSONObject6.getString(strM816));
                        jSONObject4.put(C0175.m834(f837short, 249, 8, 2947), jSONObject6.getString(strM849));
                        jSONObject4.put(C0182.m861(f837short, 257, 7, 835), jSONObject6.getString(C0183.m866(f837short, 264, 3, 1893)));
                        jSONObject4.put(C0183.m866(f837short, 267, 8, 1806), jSONObject6.getString(C0172.m820(f837short, 275, 4, 3111)));
                        jSONObject4.put(C0174.m828(f837short, 279, 11, 357), jSONObject6.getString(C0171.m816(f837short, 290, 8, 2377)));
                        jSONObject4.put(C0178.m845(f837short, 298, 9, 3081), jSONObject6.getString(C0174.m828(f837short, 307, 5, 929)));
                        jSONObject4.put(C0178.m845(f837short, 312, 12, 2372), jSONObject6.getString(C0183.m866(f837short, 324, 8, 2915)));
                        jSONObject4.put(C0175.m834(f837short, 332, 11, 1308), jSONObject6.getString(C0166.m801(f837short, 343, 7, 3089)).trim());
                        jSONArray2 = new JSONArray(this.f136UJ.m58QU(C0182.m861(f837short, 350, 16, 1929), C0181.m856(f837short, 366, 16, 422), jSONObject6.getString(C0176.m836(f837short, 382, 11, 1950))));
                        linkedHashMap = new LinkedHashMap();
                        i = 0;
                    } catch (Throwable th) {
                        int i2 = 48891;
                        while (true) {
                            i2 ^= 48908;
                            switch (i2) {
                                case 22:
                                    break;
                                case 503:
                                    i2 = 48922;
                                    break;
                            }
                        }
                    }
                    while (true) {
                        int i3 = 0;
                        int length = jSONArray2.length();
                        int i4 = 1616;
                        while (true) {
                            i4 ^= 1633;
                            switch (i4) {
                                case 14:
                                case 49:
                                    i4 = i < length ? 1709 : 1678;
                                case 204:
                                    JSONObject jSONObject7 = jSONArray2.getJSONObject(i);
                                    String string = jSONObject7.getString(strM849);
                                    String string2 = jSONObject7.getString(strM816);
                                    JSONArray jSONArray3 = jSONObject7.getJSONArray(C0176.m836(f837short, 393, 8, 3248));
                                    ArrayList arrayList = new ArrayList();
                                    while (true) {
                                        int length2 = jSONArray3.length();
                                        int i5 = 1740;
                                        while (true) {
                                            i5 ^= 1757;
                                            switch (i5) {
                                                case 17:
                                                    i5 = i3 < length2 ? 1833 : 1802;
                                                case 54:
                                                case 471:
                                                    break;
                                                case 500:
                                                    JSONObject jSONObject8 = jSONArray3.getJSONObject(i3);
                                                    String string3 = jSONObject8.getString(C0183.m866(f837short, 401, 5, 2062));
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append(string3);
                                                    sb.append(strM861);
                                                    sb.append((String) this.f137xC.get(0));
                                                    sb.append(strM861);
                                                    sb.append(string2);
                                                    sb.append(strM861);
                                                    sb.append(jSONObject8.getString(C0170.m814(f837short, 406, 3, 2768)));
                                                    String strEncodeToString = Base64.encodeToString(sb.toString().getBytes(C0178.m845(f837short, 409, 5, 1192)), 10);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    sb2.append(string3);
                                                    sb2.append(C0178.m845(f837short, 414, 1, 1322));
                                                    sb2.append(strEncodeToString);
                                                    arrayList.add(sb2.toString());
                                                    i3++;
                                                    int i6 = 1864;
                                                    while (true) {
                                                        i6 ^= 1881;
                                                        switch (i6) {
                                                            case 17:
                                                                i6 = 48674;
                                                                break;
                                                            case 47483:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                            linkedHashMap.put(string, TextUtils.join(C0166.m801(f837short, 415, 1, 521), arrayList));
                                            int i7 = i + 1;
                                            int i8 = 48767;
                                            while (true) {
                                                i8 ^= 48784;
                                                switch (i8) {
                                                    case 14:
                                                        break;
                                                    case 239:
                                                        i8 = 48798;
                                                        break;
                                                }
                                            }
                                            i = i7;
                                        }
                                    }
                                    break;
                                case 239:
                                    break;
                            }
                            String strJoin = TextUtils.join(strM805, linkedHashMap.keySet());
                            String strJoin2 = TextUtils.join(strM805, linkedHashMap.values());
                            jSONObject4.put(C0171.m816(f837short, 416, 13, 800), strJoin);
                            jSONObject4.put(C0175.m834(f837short, 429, 12, 1422), strJoin2);
                            jSONArray.put(jSONObject4);
                            this.f135QU.put(C0168.m805(f837short, 441, 4, 1746), jSONArray);
                        }
                        return str;
                    }
                }
            });
            return jSONObject3.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String homeContent(boolean z) throws JSONException {
        try {
            m56xC();
            JSONObject jSONObject = new JSONObject();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            String strM63se = m63se(C0179.m849(f833short, 769, 42, 444) + jCurrentTimeMillis + C0174.m828(f833short, 811, 6, 2037));
            jSONObject.put(C0166.m801(f833short, 817, 5, 487), C0165.m798(f833short, 822, 10, 2554));
            jSONObject.put(C0174.m828(f833short, 832, 4, 1895), strM63se);
            jSONObject.put(C0169.m809(f833short, 836, 9, 3189), jCurrentTimeMillis);
            String strM62q = m62q(f127q.substring(0, 16), f127q.substring(16, 32), jSONObject.toString());
            String strM57FN = m57FN("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDitX/rWP6WWc3h\nDzUcfD8Hbw79yCB7rz18GEkjDapjlUVIa3P8FEQFoOchu7N+vdK6HQNsl2Bql4lv\nWOYuzRWNbLGQ7mNtMca28iCuPHck0AcJzOs9F6qruPL73eY7Ai7yvzs2IfEdyXSz\nHP/yXgEOi5ZEBfsBZEPMJw6vfHJVueuD/lh/LkoJ/gXEKMCM/pkIzGpBPd2TsIg8\nZdvOGMPy+MOnJb1Qfe0y3QQdc5VPVdZFWoWsM9RAenHmE3d1THb+uNZZZcnM1tV7\nxYgBbIhgHtXAZnWDWDRBM3xJPR3O9dfBHHt/tbyrZrSwK1IgwFgqfYm/tRbmp4y/\n1DhIF6mDAgMBAAECggEAIzDjS2gEFNiZ0a6nouVSb1f47sHq8OgR1jp619seMNkR\n6Rzs4xtON8VzO1REl47lsAgi6O9SgxlEtykIiglBqDNQGNw4SNHqM6nAEuvF3sv/\n27CYb2JGFuPdq+UVAOHk4b93dH6uS95ipA8DV97psRVP3P1EqkGjGISTjf/2S4IG\n10Q0UhP4xxiRS2iCtaIq0fbvnrChqYRlYQYpkkRCCH+Q4FNKquSsqmWyCu5yfeQM\nMek+aT9KgvmCh05UCeqC1x7xPtSneNbpJpLD5zW8CcG7EYFDtIP8b9BPDlud47ZH\n5Y4/wyQQFHHLOaniTJVvEJZ7cIoXy2gOhvgcHpNryQKBgQDxNNtXnCfVK0JYNhnU\n5WCOX9NeW9Q79HldhTM5/EqsjA5H21j5S7A/duBSRfX7iou1hyXaa2p+J7rxF9sj\nNlwHPsKhprskxXaHJ7qU84gSmwORsTQQPmtTsizGwVsM330+Q2ZROaSEfDoUqH9+\nKBKs6K+FOldcTOrCZ+ILk8werwKBgQDwnQUrKATzRThVdD6Hcgt/F/SAizDmvtiT\nVvRcGkiV3EtB5Rx8zFNJ9GWrqSAArwIxTWgfYCYsvpUjbJW02Mg0Ufj2+YhjT713\nO9yViwUq996St9eLwGQO5FDMD8FYi7bRAiZEAeAeIEeveDRsNK15++8VVJVo7b2l\nzcapp5k3bQKBgQDSiJNHRhqSet6+xgIIDGoZ+1Qv0TFPX5UrZt8OpsK7FshEOhXQ\nCxt8WZN03HHXK9fEC4GjwwxBrwYB+BOjCYiMHmCd3j0M3HoXgDrgViyYKMuVuDk8\nUG83r5ZbqVuCwfO8i/HbxddueEvtyiD2CZ47ZCIHxKOKAe0K4Mex2UBaKwKBgQDi\nrEouOelP9Kn5dyVhHENQXBTu9DIBb1FAnO5fxjMTWxFa5qhLuYHNbfxKF24atsRu\nBepNhJryFCkT0jvGv2L8Ry0wHiwqwvhO14obJ3ia3iBEQAVDlt+sV9L2KvGOpTB4\n/nlmIA4u02I1IBziw02aWYkGo0SOMUo0ZQL+2PEykQKBgAV1uqiJlWuA9uPdFFJP\nZPL2YoOuTWdWfIwIb/UdsbUuTckCgqPIqUPi3HhiVSunOgcO7HWK3GD3j8k4XEbW\nG4y+Ik0lLrWzBl728tZe1GENzTf8aapElHlUfFSM4OlrTRBsbMOsQBcJNh7QbyoZ\nBHiZZTbRUY6xUR4DGYkCOksF", f127q);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C0174.m828(f833short, 845, 4, 3177), strM62q);
            jSONObject2.put(C0165.m798(f833short, 849, 6, 1679), strM57FN);
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            C0106ZJ.m486MH(C0106ZJ.m488QU(), C0181.m856(f833short, 855, 50, 2820), jSONObject2.toString(), m61j(jCurrentTimeMillis), new C00265(this, jSONArray, jSONObject3));
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(C0179.m849(f833short, 905, 5, 506), jSONArray);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (!z) {
                            break;
                        } else {
                            i = 1709;
                        }
                    case 204:
                        jSONObject4.put(C0168.m805(f833short, 910, 7, 2877), jSONObject3);
                        break;
                    case 239:
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
            return jSONObject4.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String homeVideoContent() throws JSONException {
        try {
            m56xC();
            JSONObject jSONObject = new JSONObject();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            String strM63se = m63se(C0170.m814(f833short, 917, 45, 922) + jCurrentTimeMillis + C0180.m851(f833short, 962, 6, 956));
            jSONObject.put(C0169.m809(f833short, 968, 5, 467), C0181.m856(f833short, 973, 10, 2627));
            jSONObject.put(C0169.m809(f833short, 983, 2, 2346), 115);
            jSONObject.put(C0182.m861(f833short, 985, 4, 746), strM63se);
            jSONObject.put(C0178.m845(f833short, 989, 9, 714), jCurrentTimeMillis);
            String strM62q = m62q(f127q.substring(0, 16), f127q.substring(16, 32), jSONObject.toString());
            String strM57FN = m57FN("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDitX/rWP6WWc3h\nDzUcfD8Hbw79yCB7rz18GEkjDapjlUVIa3P8FEQFoOchu7N+vdK6HQNsl2Bql4lv\nWOYuzRWNbLGQ7mNtMca28iCuPHck0AcJzOs9F6qruPL73eY7Ai7yvzs2IfEdyXSz\nHP/yXgEOi5ZEBfsBZEPMJw6vfHJVueuD/lh/LkoJ/gXEKMCM/pkIzGpBPd2TsIg8\nZdvOGMPy+MOnJb1Qfe0y3QQdc5VPVdZFWoWsM9RAenHmE3d1THb+uNZZZcnM1tV7\nxYgBbIhgHtXAZnWDWDRBM3xJPR3O9dfBHHt/tbyrZrSwK1IgwFgqfYm/tRbmp4y/\n1DhIF6mDAgMBAAECggEAIzDjS2gEFNiZ0a6nouVSb1f47sHq8OgR1jp619seMNkR\n6Rzs4xtON8VzO1REl47lsAgi6O9SgxlEtykIiglBqDNQGNw4SNHqM6nAEuvF3sv/\n27CYb2JGFuPdq+UVAOHk4b93dH6uS95ipA8DV97psRVP3P1EqkGjGISTjf/2S4IG\n10Q0UhP4xxiRS2iCtaIq0fbvnrChqYRlYQYpkkRCCH+Q4FNKquSsqmWyCu5yfeQM\nMek+aT9KgvmCh05UCeqC1x7xPtSneNbpJpLD5zW8CcG7EYFDtIP8b9BPDlud47ZH\n5Y4/wyQQFHHLOaniTJVvEJZ7cIoXy2gOhvgcHpNryQKBgQDxNNtXnCfVK0JYNhnU\n5WCOX9NeW9Q79HldhTM5/EqsjA5H21j5S7A/duBSRfX7iou1hyXaa2p+J7rxF9sj\nNlwHPsKhprskxXaHJ7qU84gSmwORsTQQPmtTsizGwVsM330+Q2ZROaSEfDoUqH9+\nKBKs6K+FOldcTOrCZ+ILk8werwKBgQDwnQUrKATzRThVdD6Hcgt/F/SAizDmvtiT\nVvRcGkiV3EtB5Rx8zFNJ9GWrqSAArwIxTWgfYCYsvpUjbJW02Mg0Ufj2+YhjT713\nO9yViwUq996St9eLwGQO5FDMD8FYi7bRAiZEAeAeIEeveDRsNK15++8VVJVo7b2l\nzcapp5k3bQKBgQDSiJNHRhqSet6+xgIIDGoZ+1Qv0TFPX5UrZt8OpsK7FshEOhXQ\nCxt8WZN03HHXK9fEC4GjwwxBrwYB+BOjCYiMHmCd3j0M3HoXgDrgViyYKMuVuDk8\nUG83r5ZbqVuCwfO8i/HbxddueEvtyiD2CZ47ZCIHxKOKAe0K4Mex2UBaKwKBgQDi\nrEouOelP9Kn5dyVhHENQXBTu9DIBb1FAnO5fxjMTWxFa5qhLuYHNbfxKF24atsRu\nBepNhJryFCkT0jvGv2L8Ry0wHiwqwvhO14obJ3ia3iBEQAVDlt+sV9L2KvGOpTB4\n/nlmIA4u02I1IBziw02aWYkGo0SOMUo0ZQL+2PEykQKBgAV1uqiJlWuA9uPdFFJP\nZPL2YoOuTWdWfIwIb/UdsbUuTckCgqPIqUPi3HhiVSunOgcO7HWK3GD3j8k4XEbW\nG4y+Ik0lLrWzBl728tZe1GENzTf8aapElHlUfFSM4OlrTRBsbMOsQBcJNh7QbyoZ\nBHiZZTbRUY6xUR4DGYkCOksF", f127q);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C0183.m866(f833short, 998, 4, 2074), strM62q);
            jSONObject2.put(C0174.m828(f833short, 1002, 6, 938), strM57FN);
            JSONArray jSONArray = new JSONArray();
            C0106ZJ.m486MH(C0106ZJ.m488QU(), C0177.m841(f833short, 1008, 53, 2415), jSONObject2.toString(), m61j(jCurrentTimeMillis), new AbstractC0099V3.Qe(this, jSONArray) { // from class: com.github.catvod.spider.Kuaikan.6

                /* renamed from: short, reason: not valid java name */
                private static final short[] f840short = {705, 709, 715, 746, 705, 717, 700, 715, 719, 735, 765, 715, 735, 709, 750, 703, 712, 733, 713, 718, 717, 733, 729, 717, 717, 696, 715, 706, 717, 712, 719, 718, 741, 733, 711, 718, 747, 733, 719, 741, 725, 710, 697, 729, 714, 742, 745, 713, 747, 745, 729, 741, 697, 757, 738, 704, 711, 740, 742, 697, 713, 705, 714, 700, 646, 703, 767, 749, 763, 728, 757, 717, 711, 739, 732, 750, 746, 729, 719, 735, 726, 726, 733, 697, 733, 744, 766, 708, 740, 766, 709, 706, 747, 747, 766, 725, 756, 712, 760, 718, 675, 728, 731, 724, 739, 765, 735, 714, 679, 718, 710, 732, 692, 697, 714, 700, 762, 765, 692, 718, 698, 747, 707, 765, 714, 731, 740, 711, 675, 646, 701, 732, 709, 711, 745, 702, 763, 711, 736, 734, 734, 761, 726, 735, 707, 744, 729, 758, 711, 675, 703, 762, 758, 734, 708, 737, 734, 703, 710, 703, 711, 715, 766, 762, 706, 758, 762, 763, 717, 734, 708, 692, 747, 747, 692, 756, 726, 742, 750, 767, 749, 736, 751, 675, 747, 718, 743, 751, 730, 756, 735, 756, 715, 744, 646, 692, 742, 692, 766, 710, 696, 733, 740, 707, 735, 714, 740, 693, 714, 692, 718, 702, 763, 709, 712, 717, 733, 717, 718, 2507, 2518, 2524, 2516, 2522, 2507, 273, 284, 279, 266, 2370, 2372, 2387, 2422, 2388, 2399, 2371, 2388, 2370, 1996, 2013, 2005, 1992, 2004, 2009, 1996, 2013, 1904, 1903, 1890, 1891, 1897, 2357, 2348, 2343, 2332, 2346, 2343, 2904, 2901, 3114, 3123, 3128, 3075, 3122, 3133, 3121, 3129, 3326, 3313, 3325, 3317, 863, 838, 845, 886, 857, 832, 842, 794, 771, 777, 2794, 2803, 2808, 2755, 2798, 2809, 2801, 2813, 2798, 2807, 2799, 257, 259, 286, 278, 259, 276, 258, 258};

                /* renamed from: QU */
                final Kuaikan f143QU;

                /* renamed from: xC */
                final JSONArray f144xC;

                {
                    this.f143QU = this;
                    this.f144xC = jSONArray;
                    int iM822 = C0172.m822();
                    int i = 1616;
                    while (true) {
                        i ^= 1633;
                        switch (i) {
                            case 14:
                            case 49:
                                i = iM822 >= 0 ? 1709 : 1678;
                            case 204:
                                System.out.println(Double.decode(C0166.m803("4zMnySpRy")));
                                break;
                            case 239:
                                break;
                        }
                        return;
                    }
                }

                @Override // com.github.catvod.spider.merge.AbstractC0099V3
                public void onFailure(Call call, Exception exc) {
                    int iM804 = C0166.m804();
                    int i = 1616;
                    while (true) {
                        i ^= 1633;
                        switch (i) {
                            case 14:
                            case 49:
                                i = iM804 <= 0 ? 1709 : 1678;
                            case 204:
                                System.out.println(Double.decode(C0175.m835("NO3t8e7UA8wPMGlPafdMpe")));
                                break;
                            case 239:
                                break;
                        }
                        return;
                    }
                }

                /* JADX WARN: Failed to find 'out' block for switch in B:13:0x008c. Please report as an issue. */
                /* JADX WARN: Failed to find 'out' block for switch in B:22:0x00b5. Please report as an issue. */
                /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0068. Please report as an issue. */
                @Override // com.github.catvod.spider.merge.AbstractC0099V3
                public String onResponse(String str) throws JSONException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException {
                    JSONArray jSONArray2;
                    int i;
                    try {
                        JSONObject jSONObject3 = new JSONObject(str);
                        String strM60W = this.f143QU.m60W(C0180.m851(f840short, 0, 219, 652), jSONObject3.getString(C0174.m828(f840short, 219, 6, 2495)));
                        jSONArray2 = new JSONObject(this.f143QU.m58QU(strM60W.substring(0, 16), strM60W.substring(16, 32), jSONObject3.getString(C0165.m798(f840short, 225, 4, 371)))).getJSONArray(C0172.m820(f840short, 229, 9, 2353));
                        i = 0;
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
                    }
                    while (true) {
                        int length = jSONArray2.length();
                        int i3 = 1616;
                        while (true) {
                            i3 ^= 1633;
                            switch (i3) {
                                case 14:
                                case 49:
                                    i3 = i < length ? 1709 : 1678;
                                case 204:
                                    int i4 = jSONArray2.getJSONObject(i).getInt(C0182.m861(f840short, 238, 8, 1976));
                                    int i5 = 1740;
                                    while (true) {
                                        i5 ^= 1757;
                                        switch (i5) {
                                            case 17:
                                                i5 = i4 == 1 ? 1833 : 1802;
                                            case 54:
                                            case 471:
                                                break;
                                            case 500:
                                                JSONArray jSONArray3 = jSONArray2.getJSONObject(i).getJSONArray(C0179.m849(f840short, 246, 5, 1798));
                                                int i6 = 0;
                                                while (true) {
                                                    int length2 = jSONArray3.length();
                                                    int i7 = 1864;
                                                    while (true) {
                                                        i7 ^= 1881;
                                                        switch (i7) {
                                                            case 17:
                                                                i7 = i6 < length2 ? 48736 : 48705;
                                                            case 47384:
                                                                break;
                                                            case 47417:
                                                                JSONObject jSONObject4 = jSONArray3.getJSONObject(i6);
                                                                JSONObject jSONObject5 = new JSONObject();
                                                                jSONObject5.put(C0175.m834(f840short, 251, 6, 2371), jSONObject4.getString(C0174.m828(f840short, 257, 2, 2865)));
                                                                jSONObject5.put(C0169.m809(f840short, 259, 8, 3164), jSONObject4.getString(C0183.m866(f840short, 267, 4, 3216)));
                                                                jSONObject5.put(C0170.m814(f840short, 271, 7, 809), jSONObject4.getString(C0166.m801(f840short, 278, 3, 874)));
                                                                jSONObject5.put(C0177.m841(f840short, 281, 11, 2716), jSONObject4.getString(C0172.m820(f840short, 292, 8, 369)));
                                                                this.f144xC.put(jSONObject5);
                                                                i6++;
                                                                int i8 = 48767;
                                                                while (true) {
                                                                    i8 ^= 48784;
                                                                    switch (i8) {
                                                                        case 14:
                                                                            break;
                                                                        case 239:
                                                                            i8 = 48798;
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 47483:
                                                        }
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    int i9 = i + 1;
                                    int i10 = 48891;
                                    while (true) {
                                        i10 ^= 48908;
                                        switch (i10) {
                                            case 22:
                                                break;
                                            case 503:
                                                i10 = 48922;
                                                break;
                                        }
                                    }
                                    i = i9;
                                    break;
                                case 239:
                                    break;
                            }
                        }
                        return str;
                    }
                }
            });
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(C0169.m809(f833short, 1061, 4, 2125), jSONArray);
            return jSONObject3.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public void init(Context context, String str) {
        String strM805 = C0168.m805(f833short, 1065, 4, 2309);
        super.init(context, str);
        SharedPreferences sharedPreferences = context.getSharedPreferences(C0174.m828(f833short, 1069, 14, 2752), 0);
        try {
            String string = sharedPreferences.getString(strM805, null);
            f126QU = string;
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = string != null ? 1709 : 1678;
                    case 204:
                        int iM800 = C0165.m800();
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = iM800 <= 0 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    break;
                                case 500:
                                    System.out.println(Integer.valueOf(C0165.m797("mq2yWEEWbTTAPgSH6")));
                                    break;
                            }
                        }
                        break;
                    case 239:
                        break;
                }
                return;
            }
        } catch (Throwable th) {
            String str2 = f126QU;
            int i3 = 1864;
            while (true) {
                i3 ^= 1881;
                switch (i3) {
                    case 17:
                        i3 = str2 != null ? 48736 : 48705;
                    case 47384:
                        break;
                    case 47417:
                        break;
                    case 47483:
                }
                return;
            }
        }
        f126QU = m63se(UUID.randomUUID().toString()).toLowerCase();
        sharedPreferences.edit().putString(strM805, f126QU).commit();
    }

    /* renamed from: j */
    public HashMap<String, String> m61j(long j) {
        String str = "ۥۦۤ";
        HashMap<String, String> map = null;
        StringBuilder sbAppend = null;
        StringBuilder sbAppend2 = null;
        String strM63se = null;
        String strM841 = null;
        short[] sArr = null;
        while (true) {
            switch (C0174.m829(str)) {
                case 56413:
                    strM841 = sbAppend.toString();
                    str = "ۡۤ۠";
                    strM63se = m63se(strM841);
                    break;
                case 56505:
                    sbAppend2.append(j);
                    str = "ۢۡۡ";
                    sbAppend = sbAppend2.append("");
                    break;
                case 1746721:
                    StringBuilder sb = new StringBuilder();
                    sArr = f833short;
                    str = "ۦۢ۠";
                    sbAppend = sb;
                    break;
                case 1746756:
                    String strM866 = C0183.m866(sArr, 1179, 20, 378);
                    map.put(strM841, strM866);
                    str = "ۣۡۧ";
                    strM63se = strM866;
                    break;
                case 1746910:
                    String strM805 = C0168.m805(sArr, 1083, 5, 898);
                    sArr = f833short;
                    str = "ۣۧ۟";
                    strM63se = strM805;
                    break;
                case 1748765:
                    sArr = f833short;
                    str = "ۡۨ۟";
                    strM841 = C0177.m841(sArr, 1164, 5, 2673);
                    break;
                case 1748888:
                    map.put(strM841, strM63se);
                    str = "ۥ۠۟";
                    sArr = f833short;
                    break;
                case 1749634:
                    String string = sbAppend2.toString();
                    sArr = f833short;
                    str = "ۥ۟ۦ";
                    strM63se = string;
                    break;
                case 1749694:
                    StringBuilder sbAppend3 = sbAppend.append(j);
                    sArr = f833short;
                    str = "ۤۧۤ";
                    sbAppend2 = sbAppend3;
                    break;
                case 1749761:
                    sArr = f833short;
                    str = "۠ۦ۠";
                    strM63se = C0182.m861(sArr, 1098, 7, 1663);
                    break;
                case 1750601:
                    return map;
                case 1751744:
                    map.put(strM63se, strM841);
                    str = "ۦ۟";
                    sbAppend2 = new StringBuilder();
                    break;
                case 1751745:
                    strM63se = C0169.m809(sArr, 1158, 6, 1587);
                    str = "ۣ۠";
                    sbAppend2 = sbAppend.append(strM63se);
                    break;
                case 1752460:
                    String strM845 = C0178.m845(sArr, 1106, 9, 433);
                    map.put(strM845, strM63se);
                    str = "۟۠ۢ";
                    strM841 = strM845;
                    break;
                case 1752484:
                    String strM8662 = C0183.m866(sArr, 1169, 10, 2471);
                    sArr = f833short;
                    str = "۟ۡۦ";
                    strM841 = strM8662;
                    break;
                case 1752675:
                    map = new HashMap<>();
                    str = "۟ۦۥ";
                    sArr = f833short;
                    break;
                case 1753508:
                    strM841 = C0165.m798(sArr, 1115, 43, 2107);
                    str = "ۣۢ۟";
                    sbAppend2 = sbAppend.append(strM841);
                    break;
                case 1754499:
                    String strM8412 = C0177.m841(sArr, 1088, 10, 1696);
                    map.put(strM63se, strM8412);
                    str = "ۢۥۤ";
                    strM841 = strM8412;
                    break;
                default:
                    sArr = f833short;
                    str = "ۣۤۧ";
                    strM841 = C0177.m841(sArr, 1105, 1, 2009);
                    break;
            }
        }
    }

    public String playerContent(String str, String str2, List<String> list) throws JSONException {
        try {
            m56xC();
            String[] strArrSplit = new String(Base64.decode(str2, 10), C0171.m816(f833short, 1199, 5, 1683)).split(C0183.m866(f833short, 1204, 2, 700));
            ArrayList<String> arrayList = this.f129UJ.get(strArrSplit[2]);
            JSONObject jSONObject = new JSONObject();
            String strM836 = C0176.m836(f833short, 1206, 3, 2775);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = arrayList != null ? 1709 : 1678;
                    case 204:
                        int size = arrayList.size();
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
                                    Iterator<String> it = arrayList.iterator();
                                    while (true) {
                                        boolean zHasNext = it.hasNext();
                                        int i3 = 1864;
                                        while (true) {
                                            i3 ^= 1881;
                                            switch (i3) {
                                                case 17:
                                                    i3 = zHasNext ? 48736 : 48705;
                                                case 47384:
                                                    break;
                                                case 47417:
                                                    String next = it.next();
                                                    boolean zHas = jSONObject.has(strM836);
                                                    int i4 = 48767;
                                                    while (true) {
                                                        i4 ^= 48784;
                                                        switch (i4) {
                                                            case 14:
                                                            case 45:
                                                                JSONObject jSONObject2 = new JSONObject();
                                                                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                                                                String strM63se = m63se(C0171.m816(f833short, 1209, 42, 626) + strArrSplit[1] + strArrSplit[0] + strArrSplit[3] + jCurrentTimeMillis + C0171.m816(f833short, 1251, 6, 824));
                                                                jSONObject2.put(C0182.m861(f833short, 1257, 5, 613), C0177.m841(f833short, 1262, 10, 769));
                                                                jSONObject2.put(C0166.m801(f833short, 1272, 2, 1912), strArrSplit[1]);
                                                                jSONObject2.put(C0169.m809(f833short, 1274, 5, 2428), strArrSplit[0]);
                                                                jSONObject2.put(strM836, strArrSplit[3]);
                                                                jSONObject2.put(C0182.m861(f833short, 1279, 4, 3255), strM63se);
                                                                jSONObject2.put(C0175.m834(f833short, 1283, 9, 1378), jCurrentTimeMillis);
                                                                String strM62q = m62q(f127q.substring(0, 16), f127q.substring(16, 32), jSONObject2.toString());
                                                                String strM57FN = m57FN("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDitX/rWP6WWc3h\nDzUcfD8Hbw79yCB7rz18GEkjDapjlUVIa3P8FEQFoOchu7N+vdK6HQNsl2Bql4lv\nWOYuzRWNbLGQ7mNtMca28iCuPHck0AcJzOs9F6qruPL73eY7Ai7yvzs2IfEdyXSz\nHP/yXgEOi5ZEBfsBZEPMJw6vfHJVueuD/lh/LkoJ/gXEKMCM/pkIzGpBPd2TsIg8\nZdvOGMPy+MOnJb1Qfe0y3QQdc5VPVdZFWoWsM9RAenHmE3d1THb+uNZZZcnM1tV7\nxYgBbIhgHtXAZnWDWDRBM3xJPR3O9dfBHHt/tbyrZrSwK1IgwFgqfYm/tRbmp4y/\n1DhIF6mDAgMBAAECggEAIzDjS2gEFNiZ0a6nouVSb1f47sHq8OgR1jp619seMNkR\n6Rzs4xtON8VzO1REl47lsAgi6O9SgxlEtykIiglBqDNQGNw4SNHqM6nAEuvF3sv/\n27CYb2JGFuPdq+UVAOHk4b93dH6uS95ipA8DV97psRVP3P1EqkGjGISTjf/2S4IG\n10Q0UhP4xxiRS2iCtaIq0fbvnrChqYRlYQYpkkRCCH+Q4FNKquSsqmWyCu5yfeQM\nMek+aT9KgvmCh05UCeqC1x7xPtSneNbpJpLD5zW8CcG7EYFDtIP8b9BPDlud47ZH\n5Y4/wyQQFHHLOaniTJVvEJZ7cIoXy2gOhvgcHpNryQKBgQDxNNtXnCfVK0JYNhnU\n5WCOX9NeW9Q79HldhTM5/EqsjA5H21j5S7A/duBSRfX7iou1hyXaa2p+J7rxF9sj\nNlwHPsKhprskxXaHJ7qU84gSmwORsTQQPmtTsizGwVsM330+Q2ZROaSEfDoUqH9+\nKBKs6K+FOldcTOrCZ+ILk8werwKBgQDwnQUrKATzRThVdD6Hcgt/F/SAizDmvtiT\nVvRcGkiV3EtB5Rx8zFNJ9GWrqSAArwIxTWgfYCYsvpUjbJW02Mg0Ufj2+YhjT713\nO9yViwUq996St9eLwGQO5FDMD8FYi7bRAiZEAeAeIEeveDRsNK15++8VVJVo7b2l\nzcapp5k3bQKBgQDSiJNHRhqSet6+xgIIDGoZ+1Qv0TFPX5UrZt8OpsK7FshEOhXQ\nCxt8WZN03HHXK9fEC4GjwwxBrwYB+BOjCYiMHmCd3j0M3HoXgDrgViyYKMuVuDk8\nUG83r5ZbqVuCwfO8i/HbxddueEvtyiD2CZ47ZCIHxKOKAe0K4Mex2UBaKwKBgQDi\nrEouOelP9Kn5dyVhHENQXBTu9DIBb1FAnO5fxjMTWxFa5qhLuYHNbfxKF24atsRu\nBepNhJryFCkT0jvGv2L8Ry0wHiwqwvhO14obJ3ia3iBEQAVDlt+sV9L2KvGOpTB4\n/nlmIA4u02I1IBziw02aWYkGo0SOMUo0ZQL+2PEykQKBgAV1uqiJlWuA9uPdFFJP\nZPL2YoOuTWdWfIwIb/UdsbUuTckCgqPIqUPi3HhiVSunOgcO7HWK3GD3j8k4XEbW\nG4y+Ik0lLrWzBl728tZe1GENzTf8aapElHlUfFSM4OlrTRBsbMOsQBcJNh7QbyoZ\nBHiZZTbRUY6xUR4DGYkCOksF", f127q);
                                                                JSONObject jSONObject3 = new JSONObject();
                                                                jSONObject3.put(C0183.m866(f833short, 1292, 4, 1291), strM62q);
                                                                jSONObject3.put(C0182.m861(f833short, 1296, 6, 1580), strM57FN);
                                                                C0106ZJ.m486MH(C0106ZJ.m488QU(), next, jSONObject3.toString(), m61j(jCurrentTimeMillis), new AbstractC0099V3.Qe(this, jSONObject) { // from class: com.github.catvod.spider.Kuaikan.7

                                                                    /* renamed from: short, reason: not valid java name */
                                                                    private static final short[] f841short = {508, 507, 485, 2620, 2616, 2614, 2583, 2620, 2608, 2625, 2614, 2610, 2594, 2560, 2614, 2594, 2616, 2579, 2626, 2613, 2592, 2612, 2611, 2608, 2592, 2596, 2608, 2608, 2629, 2614, 2623, 2608, 2613, 2610, 2611, 2584, 2592, 2618, 2611, 2582, 2592, 2610, 2584, 2600, 2619, 2628, 2596, 2615, 2587, 2580, 2612, 2582, 2580, 2596, 2584, 2628, 2568, 2591, 2621, 2618, 2585, 2587, 2628, 2612, 2620, 2615, 2625, 2683, 2626, 2562, 2576, 2566, 2597, 2568, 2608, 2618, 2590, 2593, 2579, 2583, 2596, 2610, 2594, 2603, 2603, 2592, 2628, 2592, 2581, 2563, 2617, 2585, 2563, 2616, 2623, 2582, 2582, 2563, 2600, 2569, 2613, 2565, 2611, 2654, 2597, 2598, 2601, 2590, 2560, 2594, 2615, 2650, 2611, 2619, 2593, 2633, 2628, 2615, 2625, 2567, 2560, 2633, 2611, 2631, 2582, 2622, 2560, 2615, 2598, 2585, 2618, 2654, 2683, 2624, 2593, 2616, 2618, 2580, 2627, 2566, 2618, 2589, 2595, 2595, 2564, 2603, 2594, 2622, 2581, 2596, 2571, 2618, 2654, 2626, 2567, 2571, 2595, 2617, 2588, 2595, 2626, 2619, 2626, 2618, 2614, 2563, 2567, 2623, 2571, 2567, 2566, 2608, 2595, 2617, 2633, 2582, 2582, 2633, 2569, 2603, 2587, 2579, 2562, 2576, 2589, 2578, 2654, 2582, 2611, 2586, 2578, 2599, 2569, 2594, 2569, 2614, 2581, 2683, 2633, 2587, 2633, 2563, 2619, 2629, 2592, 2585, 2622, 2594, 2615, 2585, 2632, 2615, 2633, 2611, 2627, 2566, 2616, 2613, 2608, 2592, 2608, 2611, 262, 283, 273, 281, 279, 262, 2982, 2987, 2976, 3005, 283, 261, 273, 2644, 2642, 2628, 2628, 2626, 2644, 2644, 399, 387, 392, 393, 1199, 1214, 1197, 1196, 1210, 941, 928, 932, 929, 928, 951, 1401, 1381, 1384, 1392, 1372, 1403, 1381};

                                                                    /* renamed from: QU */
                                                                    final Kuaikan f145QU;

                                                                    /* renamed from: xC */
                                                                    final JSONObject f146xC;

                                                                    {
                                                                        this.f145QU = this;
                                                                        this.f146xC = jSONObject;
                                                                        int iM859 = C0182.m859();
                                                                        int i5 = 1616;
                                                                        while (true) {
                                                                            i5 ^= 1633;
                                                                            switch (i5) {
                                                                                case 14:
                                                                                case 49:
                                                                                    i5 = iM859 <= 0 ? 1709 : 1678;
                                                                                case 204:
                                                                                    System.out.println(Float.parseFloat(C0182.m862("MDbU8xHXWY0q87kTJ2bnY3dR")));
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

                                                                    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x009c. Please report as an issue. */
                                                                    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x007c. Please report as an issue. */
                                                                    @Override // com.github.catvod.spider.merge.AbstractC0099V3
                                                                    public String onResponse(String str3) throws JSONException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException {
                                                                        String strM805 = C0168.m805(f841short, 0, 3, 393);
                                                                        try {
                                                                            JSONObject jSONObject4 = new JSONObject(str3);
                                                                            String strM60W = this.f145QU.m60W(C0180.m851(f841short, 3, 219, 2673), jSONObject4.getString(C0177.m841(f841short, 222, 6, 370)));
                                                                            JSONObject jSONObject5 = new JSONObject(this.f145QU.m58QU(strM60W.substring(0, 16), strM60W.substring(16, 32), jSONObject4.getString(C0183.m866(f841short, 228, 4, 3012))));
                                                                            boolean zEquals = jSONObject5.optString(C0175.m834(f841short, 232, 3, 374), "").equals(C0183.m866(f841short, 235, 7, 2599));
                                                                            int i5 = 1616;
                                                                            while (true) {
                                                                                i5 ^= 1633;
                                                                                switch (i5) {
                                                                                    case 14:
                                                                                    case 49:
                                                                                        i5 = zEquals ? 1709 : 1678;
                                                                                    case 204:
                                                                                        int iOptInt = jSONObject5.optInt(C0181.m856(f841short, 242, 4, 492), -1);
                                                                                        int i6 = 1740;
                                                                                        while (true) {
                                                                                            i6 ^= 1757;
                                                                                            switch (i6) {
                                                                                                case 17:
                                                                                                    i6 = iOptInt == 0 ? 1833 : 1802;
                                                                                                case 54:
                                                                                                case 471:
                                                                                                    break;
                                                                                                case 500:
                                                                                                    this.f146xC.put(C0179.m849(f841short, 246, 5, 1247), 0);
                                                                                                    this.f146xC.put(C0170.m814(f841short, 251, 6, 965), "");
                                                                                                    this.f146xC.put(C0183.m866(f841short, 257, 7, 1289), "");
                                                                                                    this.f146xC.put(strM805, jSONObject5.getString(strM805));
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 239:
                                                                                        break;
                                                                                }
                                                                            }
                                                                        } catch (JSONException e) {
                                                                            int i7 = 1864;
                                                                            while (true) {
                                                                                i7 ^= 1881;
                                                                                switch (i7) {
                                                                                    case 17:
                                                                                        i7 = 48674;
                                                                                        break;
                                                                                    case 47483:
                                                                                        break;
                                                                                }
                                                                            }
                                                                        }
                                                                        return str3;
                                                                    }
                                                                });
                                                                int i5 = 49666;
                                                                while (true) {
                                                                    i5 ^= 49683;
                                                                    switch (i5) {
                                                                        case 17:
                                                                            i5 = 49697;
                                                                            break;
                                                                        case 50:
                                                                            break;
                                                                    }
                                                                }
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
                                                                            continue;
                                                                        default:
                                                                            continue;
                                                                    }
                                                                }
                                                            case 239:
                                                                i4 = zHas ? 48860 : 48829;
                                                        }
                                                    }
                                                    break;
                                                case 47483:
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
            boolean zHas2 = jSONObject.has(strM836);
            int i7 = 49790;
            while (true) {
                i7 ^= 49807;
                switch (i7) {
                    case 18:
                        break;
                    case 51:
                        boolean zM605u = C0118ga.m605u(strArrSplit[3]);
                        int i8 = 49914;
                        while (true) {
                            i8 ^= 49931;
                            switch (i8) {
                                case 497:
                                    if (zM605u) {
                                        break;
                                    } else {
                                        i8 = 50658;
                                    }
                                case 1711:
                                    break;
                                case 1736:
                                    jSONObject.put(C0178.m845(f833short, 1302, 5, 1392), 0);
                                    jSONObject.put(C0180.m851(f833short, 1307, 6, 622), "");
                                    jSONObject.put(C0178.m845(f833short, 1313, 7, 497), "");
                                    jSONObject.put(strM836, strArrSplit[3]);
                                    return jSONObject.toString();
                                case 1769:
                                    return "";
                                default:
                                    continue;
                            }
                            i8 = 50627;
                        }
                    case 84:
                        return jSONObject.toString();
                    case 241:
                        if (!zHas2) {
                            break;
                        } else {
                            i7 = 49883;
                        }
                    default:
                        continue;
                }
                i7 = 49852;
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* renamed from: q */
    String m62q(String str, String str2, String str3) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), C0168.m805(f833short, 1320, 3, 1368));
            Cipher cipher = Cipher.getInstance(C0177.m841(f833short, 1323, 20, 2699));
            cipher.init(1, secretKeySpec, new IvParameterSpec(str2.getBytes()));
            return Base64.encodeToString(cipher.doFinal(str3.getBytes()), 2);
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0022. Please report as an issue. */
    /* renamed from: se */
    String m63se(String str) {
        int i = 0;
        try {
            byte[] bArrDigest = MessageDigest.getInstance(C0168.m805(f833short, 1343, 3, 2593)).digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            int length = bArrDigest.length;
            while (true) {
                int i2 = 1616;
                while (true) {
                    i2 ^= 1633;
                    switch (i2) {
                        case 14:
                        case 49:
                            i2 = i < length ? 1709 : 1678;
                        case 204:
                            String hexString = Integer.toHexString(bArrDigest[i] & 255);
                            int length2 = hexString.length();
                            int i3 = 1740;
                            while (true) {
                                i3 ^= 1757;
                                switch (i3) {
                                    case 17:
                                        i3 = length2 < 2 ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case 500:
                                        sb.append(0);
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
                    return sb.toString().toLowerCase();
                }
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    public String searchContent(String str, boolean z) throws JSONException {
        try {
            m56xC();
            JSONObject jSONObject = new JSONObject();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            String strM63se = m63se(C0183.m866(f833short, 1346, 45, 1176) + str + jCurrentTimeMillis + C0180.m851(f833short, 1391, 6, 2797));
            jSONObject.put(C0178.m845(f833short, 1397, 5, 1159), C0174.m828(f833short, 1402, 10, 880));
            jSONObject.put(C0182.m861(f833short, 1412, 7, 1024), str);
            jSONObject.put(C0175.m834(f833short, 1419, 4, 1305), 1);
            jSONObject.put(C0166.m801(f833short, 1423, 8, 2935), 12);
            jSONObject.put(C0172.m820(f833short, 1431, 4, 2160), strM63se);
            jSONObject.put(C0178.m845(f833short, 1435, 9, 1362), jCurrentTimeMillis);
            String strM62q = m62q(f127q.substring(0, 16), f127q.substring(16, 32), jSONObject.toString());
            String strM57FN = m57FN("MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDitX/rWP6WWc3h\nDzUcfD8Hbw79yCB7rz18GEkjDapjlUVIa3P8FEQFoOchu7N+vdK6HQNsl2Bql4lv\nWOYuzRWNbLGQ7mNtMca28iCuPHck0AcJzOs9F6qruPL73eY7Ai7yvzs2IfEdyXSz\nHP/yXgEOi5ZEBfsBZEPMJw6vfHJVueuD/lh/LkoJ/gXEKMCM/pkIzGpBPd2TsIg8\nZdvOGMPy+MOnJb1Qfe0y3QQdc5VPVdZFWoWsM9RAenHmE3d1THb+uNZZZcnM1tV7\nxYgBbIhgHtXAZnWDWDRBM3xJPR3O9dfBHHt/tbyrZrSwK1IgwFgqfYm/tRbmp4y/\n1DhIF6mDAgMBAAECggEAIzDjS2gEFNiZ0a6nouVSb1f47sHq8OgR1jp619seMNkR\n6Rzs4xtON8VzO1REl47lsAgi6O9SgxlEtykIiglBqDNQGNw4SNHqM6nAEuvF3sv/\n27CYb2JGFuPdq+UVAOHk4b93dH6uS95ipA8DV97psRVP3P1EqkGjGISTjf/2S4IG\n10Q0UhP4xxiRS2iCtaIq0fbvnrChqYRlYQYpkkRCCH+Q4FNKquSsqmWyCu5yfeQM\nMek+aT9KgvmCh05UCeqC1x7xPtSneNbpJpLD5zW8CcG7EYFDtIP8b9BPDlud47ZH\n5Y4/wyQQFHHLOaniTJVvEJZ7cIoXy2gOhvgcHpNryQKBgQDxNNtXnCfVK0JYNhnU\n5WCOX9NeW9Q79HldhTM5/EqsjA5H21j5S7A/duBSRfX7iou1hyXaa2p+J7rxF9sj\nNlwHPsKhprskxXaHJ7qU84gSmwORsTQQPmtTsizGwVsM330+Q2ZROaSEfDoUqH9+\nKBKs6K+FOldcTOrCZ+ILk8werwKBgQDwnQUrKATzRThVdD6Hcgt/F/SAizDmvtiT\nVvRcGkiV3EtB5Rx8zFNJ9GWrqSAArwIxTWgfYCYsvpUjbJW02Mg0Ufj2+YhjT713\nO9yViwUq996St9eLwGQO5FDMD8FYi7bRAiZEAeAeIEeveDRsNK15++8VVJVo7b2l\nzcapp5k3bQKBgQDSiJNHRhqSet6+xgIIDGoZ+1Qv0TFPX5UrZt8OpsK7FshEOhXQ\nCxt8WZN03HHXK9fEC4GjwwxBrwYB+BOjCYiMHmCd3j0M3HoXgDrgViyYKMuVuDk8\nUG83r5ZbqVuCwfO8i/HbxddueEvtyiD2CZ47ZCIHxKOKAe0K4Mex2UBaKwKBgQDi\nrEouOelP9Kn5dyVhHENQXBTu9DIBb1FAnO5fxjMTWxFa5qhLuYHNbfxKF24atsRu\nBepNhJryFCkT0jvGv2L8Ry0wHiwqwvhO14obJ3ia3iBEQAVDlt+sV9L2KvGOpTB4\n/nlmIA4u02I1IBziw02aWYkGo0SOMUo0ZQL+2PEykQKBgAV1uqiJlWuA9uPdFFJP\nZPL2YoOuTWdWfIwIb/UdsbUuTckCgqPIqUPi3HhiVSunOgcO7HWK3GD3j8k4XEbW\nG4y+Ik0lLrWzBl728tZe1GENzTf8aapElHlUfFSM4OlrTRBsbMOsQBcJNh7QbyoZ\nBHiZZTbRUY6xUR4DGYkCOksF", f127q);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C0168.m805(f833short, 1444, 4, 1155), strM62q);
            jSONObject2.put(C0171.m816(f833short, 1448, 6, 1701), strM57FN);
            JSONObject jSONObject3 = new JSONObject();
            C0106ZJ.m486MH(C0106ZJ.m488QU(), C0177.m841(f833short, 1454, 50, 1144), jSONObject2.toString(), m61j(jCurrentTimeMillis), new AbstractC0099V3.Qe(this, jSONObject3) { // from class: com.github.catvod.spider.Kuaikan.8

                /* renamed from: short, reason: not valid java name */
                private static final short[] f842short = {1482, 1486, 1472, 1505, 1482, 1478, 1463, 1472, 1476, 1492, 1526, 1472, 1492, 1486, 1509, 1460, 1475, 1494, 1474, 1477, 1478, 1494, 1490, 1478, 1478, 1459, 1472, 1481, 1478, 1475, 1476, 1477, 1518, 1494, 1484, 1477, 1504, 1494, 1476, 1518, 1502, 1485, 1458, 1490, 1473, 1517, 1506, 1474, 1504, 1506, 1490, 1518, 1458, 1534, 1513, 1483, 1484, 1519, 1517, 1458, 1474, 1482, 1473, 1463, 1421, 1460, 1524, 1510, 1520, 1491, 1534, 1478, 1484, 1512, 1495, 1509, 1505, 1490, 1476, 1492, 1501, 1501, 1494, 1458, 1494, 1507, 1525, 1487, 1519, 1525, 1486, 1481, 1504, 1504, 1525, 1502, 1535, 1475, 1523, 1477, 1448, 1491, 1488, 1503, 1512, 1526, 1492, 1473, 1452, 1477, 1485, 1495, 1471, 1458, 1473, 1463, 1521, 1526, 1471, 1477, 1457, 1504, 1480, 1526, 1473, 1488, 1519, 1484, 1448, 1421, 1462, 1495, 1486, 1484, 1506, 1461, 1520, 1484, 1515, 1493, 1493, 1522, 1501, 1492, 1480, 1507, 1490, 1533, 1484, 1448, 1460, 1521, 1533, 1493, 1487, 1514, 1493, 1460, 1485, 1460, 1484, 1472, 1525, 1521, 1481, 1533, 1521, 1520, 1478, 1493, 1487, 1471, 1504, 1504, 1471, 1535, 1501, 1517, 1509, 1524, 1510, 1515, 1508, 1448, 1504, 1477, 1516, 1508, 1489, 1535, 1492, 1535, 1472, 1507, 1421, 1471, 1517, 1471, 1525, 1485, 1459, 1494, 1519, 1480, 1492, 1473, 1519, 1470, 1473, 1471, 1477, 1461, 1520, 1486, 1475, 1478, 1494, 1478, 1477, 3250, 3247, 3237, 3245, 3235, 3250, 1048, 1045, 1054, 1027, 293, 306, 292, 290, 315, 291, 292, 1187, 1210, 1201, 1162, 1212, 1201, 1244, 1233, 279, 270, 261, 318, 271, 256, 268, 260, 1760, 1775, 1763, 1771, 977, 968, 963, 1016, 983, 974, 964, 801, 824, 818, 1509, 1504, 1530, 1533};

                /* renamed from: QU */
                final Kuaikan f147QU;

                /* renamed from: xC */
                final JSONObject f148xC;

                {
                    this.f147QU = this;
                    this.f148xC = jSONObject3;
                    int iM830 = C0174.m830();
                    int i = 1616;
                    while (true) {
                        i ^= 1633;
                        switch (i) {
                            case 14:
                            case 49:
                                i = iM830 <= 0 ? 1709 : 1678;
                            case 204:
                                System.out.println(Integer.parseInt(C0183.m863("0VWvoXINGQL")));
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

                /* JADX WARN: Failed to find 'out' block for switch in B:6:0x006c. Please report as an issue. */
                @Override // com.github.catvod.spider.merge.AbstractC0099V3
                public String onResponse(String str2) throws JSONException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException {
                    JSONArray jSONArray;
                    JSONArray jSONArray2;
                    int i;
                    try {
                        JSONObject jSONObject4 = new JSONObject(str2);
                        String strM60W = this.f147QU.m60W(C0177.m841(f842short, 0, 219, 1415), jSONObject4.getString(C0177.m841(f842short, 219, 6, 3270)));
                        JSONObject jSONObject5 = new JSONObject(this.f147QU.m58QU(strM60W.substring(0, 16), strM60W.substring(16, 32), jSONObject4.getString(C0169.m809(f842short, 225, 4, 1146))));
                        jSONArray = new JSONArray();
                        jSONArray2 = jSONObject5.getJSONArray(C0176.m836(f842short, 229, 7, 343));
                        i = 0;
                    } catch (JSONException e) {
                        int i2 = 1864;
                        while (true) {
                            i2 ^= 1881;
                            switch (i2) {
                                case 17:
                                    i2 = 48674;
                                    break;
                                case 47483:
                                    break;
                            }
                        }
                    }
                    while (true) {
                        int length = jSONArray2.length();
                        int i3 = 1616;
                        while (true) {
                            i3 ^= 1633;
                            switch (i3) {
                                case 14:
                                case 49:
                                    i3 = i < length ? 1709 : 1678;
                                case 204:
                                    JSONObject jSONObject6 = jSONArray2.getJSONObject(i);
                                    JSONObject jSONObject7 = new JSONObject();
                                    jSONObject7.put(C0168.m805(f842short, 236, 6, 1237), jSONObject6.getString(C0180.m851(f842short, 242, 2, 1205)));
                                    jSONObject7.put(C0179.m849(f842short, 244, 8, 353), jSONObject6.getString(C0175.m834(f842short, 252, 4, 1678)));
                                    jSONObject7.put(C0168.m805(f842short, 256, 7, 935), jSONObject6.getString(C0179.m849(f842short, 263, 3, 849)));
                                    jSONArray.put(jSONObject7);
                                    int i4 = i + 1;
                                    int i5 = 1740;
                                    while (true) {
                                        i5 ^= 1757;
                                        switch (i5) {
                                            case 17:
                                                i5 = 1771;
                                                break;
                                            case 54:
                                                break;
                                        }
                                    }
                                    i = i4;
                                    break;
                                case 239:
                                    break;
                            }
                            this.f148xC.put(C0174.m828(f842short, 266, 4, 1417), jSONArray);
                        }
                        return str2;
                    }
                }
            });
            return jSONObject3.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
