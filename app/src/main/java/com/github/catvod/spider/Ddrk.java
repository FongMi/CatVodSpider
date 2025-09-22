package com.github.catvod.spider;

import android.text.TextUtils;
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
import com.github.catvod.spider.merge.C0127lK;
import com.github.catvod.spider.merge.C0147tG;
import com.github.catvod.spider.merge.C0168;
import com.github.catvod.spider.merge.C0169;
import com.github.catvod.spider.merge.C0170;
import com.github.catvod.spider.merge.C0171;
import com.github.catvod.spider.merge.C0173;
import com.github.catvod.spider.merge.C0174;
import com.github.catvod.spider.merge.C0175;
import com.github.catvod.spider.merge.C0176;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class Ddrk extends Spider {

    /* renamed from: short */
    private static final short[] f819short = {1175, 1243, 1241, 1228, 1245, 1247, 1239, 1226, 1217, 1175, 1168, 1252, 1259, 1171, 1169, 1175, 1422, 1426, 1426, 1430, 1429, 1500, 1481, 1481, 1410, 1410, 1439, 1429, 1480, 1430, 1428, 1417, 1481, 1486, 1466, 1461, 1485, 1487, 1481, 1233, 1246, 1190, 1186, 1277, 1260, 1258, 1256, 1186, 1189, 1233, 1246, 1190, 1188, 1233, 1246, 1190, 2918, 2921, 2833, 2834, 2898, 2894, 2894, 2890, 2918, 2921, 2833, 2909, 2835, 1003, 996, 924, 927, 921, 925, 926, 2574, 2591, 2591, 2563, 2566, 2572, 2574, 2587, 2566, 2560, 2561, 2624, 2560, 2572, 2587, 2570, 2587, 2626, 2588, 2587, 2589, 2570, 2574, 2562, 2200, 2186, 2189, 2201, 2203, 2203, 3073, 3189, 3149, 3154, 3099, 3156, 3091, 3189, 3149, 3154, 3099, 3156, 3091, 3189, 3149, 3154, 3099, 3156, 3079, 3189, 3149, 3154, 3098, 3156, 3079, 3074, 3189, 3149, 3154, 3099, 3156, 3091, 3189, 3149, 3154, 3099, 3156, 3091, 3189, 3149, 3154, 3099, 3156, 3079, 3189, 3149, 3154, 3098, 3156, 3072, 3079, 3075, 2811, 2798, 2462, 2538, 2514, 2509, 2436, 2507, 2444, 2538, 2514, 2509, 2436, 2507, 2456, 2538, 2514, 2509, 2437, 2507, 2463, 2456, 2460, 2441, 2462, 2454, 2459, 2459, 2440, 2454, 2463, 2462, 2538, 2514, 2509, 2436, 2507, 2444, 2538, 2514, 2509, 2436, 2507, 2456, 2538, 2514, 2509, 2437, 2507, 2463, 2456, 2460, 3006, 3006, 2996, 2986, 3007, 2986, 3004, 3006, 3006, 2996, 2986, 3005, 3078, 3134, 3105, 3176, 3111, 3168, 3078, 3134, 3105, 3176, 3111, 3168, 3078, 3134, 3105, 3176, 3111, 3188, 3078, 3134, 3105, 3177, 3111, 3188, 3185, 3078, 3134, 3105, 3176, 3111, 3168, 3078, 3134, 3105, 3176, 3111, 3168, 3078, 3134, 3105, 3176, 3111, 3188, 3078, 3134, 3105, 3177, 3111, 834, 1758, 1784, 1774, 1785, 1702, 1738, 1772, 1774, 1765, 1791, 3026, 3007, 2973, 2952, 2971, 2974, 2974, 2963, 3037, 3015, 3036, 3010, 3026, 3034, 3007, 2963, 2961, 2971, 2972, 2950, 2973, 2945, 2970, 3017, 3026, 3003, 2972, 2950, 2967, 2974, 3026, 3007, 2963, 2961, 3026, 3005, 2977, 3026, 2986, 3026, 3011, 3010, 2989, 3011, 3015, 2989, 3013, 3035, 3026, 2995, 2946, 2946, 2974, 2967, 2981, 2967, 2960, 3001, 2971, 2950, 3037, 3015, 3009, 3013, 3036, 3009, 3012, 3026, 3034, 3001, 3002, 2982, 3007, 3006, 3038, 3026, 2974, 2971, 2969, 2967, 3026, 2997, 2967, 2961, 2969, 2973, 3035, 3026, 2993, 2970, 2944, 2973, 2975, 2967, 3037, 3019, 3011, 3036, 3010, 3036, 3014, 3014, 3013, 3008, 3036, 3011, 3011, 3014, 3026, 2977, 2963, 2964, 2963, 2944, 2971, 3037, 3015, 3009, 3013, 3036, 3009, 3012, 1060, 1043, 1040, 1043, 1028, 1043, 1028, 3114, 3170, 3198, 3198, 3194, 3193, 3120, 3109, 3109, 3182, 3182, 3187, 3193, 3108, 3194, 3192, 3173, 3109, 948, 914, 900, 915, 972, 928, 902, 900, 911, 917, 2158, 2051, 2081, 2100, 2087, 2082, 2082, 2095, 2145, 2171, 2144, 2174, 2158, 2150, 2073, 2087, 2080, 2090, 2081, 2105, 2109, 2158, 2048, 2074, 2158, 2175, 2174, 2144, 2174, 2165, 2158, 2073, 2087, 2080, 2168, 2170, 2165, 2158, 2102, 2168, 2170, 2151, 2158, 2063, 2110, 2110, 2082, 2091, 2073, 2091, 2092, 2053, 2087, 2106, 2145, 2171, 2173, 2169, 2144, 2173, 2168, 2158, 2150, 2053, 2054, 2074, 2051, 2050, 2146, 2158, 2082, 2087, 2085, 2091, 2158, 2057, 2091, 2093, 2085, 2081, 2151, 2158, 2061, 2086, 2108, 2081, 2083, 2091, 2145, 2175, 2175, 2175, 2144, 2174, 2144, 2174, 2144, 2174, 2158, 2077, 2095, 2088, 2095, 2108, 2087, 2145, 2171, 2173, 2169, 2144, 2173, 2168, 2158, 2059, 2090, 2089, 2145, 2175, 2175, 2175, 2144, 2174, 2144, 2175, 2168, 2168, 2175, 2144, 2170, 2170, 2091, 2076, 2079, 2076, 2059, 2076, 2059, 1937, 2009, 1989, 1989, 1985, 1986, 1931, 1950, 1950, 2005, 2005, 1992, 1986, 1951, 1985, 1987, 2014, 1950, 2058, 2132, 2123, 2135, 2128, 2057, 2118, 2123, 2140, 2057, 2128, 2125, 2128, 2120, 2113, 2052, 2117, 2939, 1602, 1630, 1630, 1626, 1625, 1552, 1541, 1541, 1614, 1614, 1619, 1625, 1540, 1626, 1624, 1605, 1541, 1609, 1611, 1630, 1615, 1613, 1605, 1624, 1619, 1541, 1098, 3056, 1179, 1220, 1237, 1235, 1233, 1179, 2639, 2626, 2653, 2565, 2629, 2634, 2653, 2566, 2631, 2626, 2629, 2624, 2648, 1183, 1157, 1170, 1169, 1560, 2296, 2293, 2282, 2226, 2290, 2301, 2282, 2225, 2288, 2293, 2290, 2295, 2287, 2236, 2301, 3090, 3089, 3072, 3087, 3151, 3074, 3092, 3091, 3091, 3076, 3087, 3093, 28257, 26057, 24766, 20720, 25192, 25139, -29887, 29764, 31763, 25948, 22054, 2956, 2945, 2974, 3014, 2968, 2951, 2971, 2972, 3013, 2954, 2951, 2960, 3013, 2955, 2951, 2950, 2972, 2953, 2945, 2950, 2957, 2970, 2976, 446, 423, 428, 407, 442, 429, 421, 425, 442, 419, 443, 2895, 2902, 2909, 2918, 2889, 2896, 2906, 2084, 2109, 2102, 2061, 2108, 2099, 2111, 2103, 1057, 1080, 1075, 1032, 1086, 1075, 1028, 1027, 1038, 1051, 1042, 1627, 1541, 1562, 1542, 1537, 1624, 1559, 1562, 1549, 1624, 1564, 1560, 1556, 1554, 1552, 2166, 2050, 1426, 2926, 2943, 2937, 2939, 3253, 3236, 3234, 3232, 3238, 3242, 3248, 3243, 3249, 1413, 1408, 1412, 1408, 1437, 1553, 1546, 1553, 1540, 1545, 2166, 2163, 2153, 2158, 2323, 2323, 2323, 2075, 2114, 2117, 2072, 2117, 2137, 2132, 2124, 2137, 2140, 2118, 2113, 2072, 2118, 2134, 2119, 2140, 2117, 2113, 2705, 1184, 1212, 1212, 1208, 1211, 1266, 1255, 1255, 1196, 1196, 1201, 1211, 1254, 1208, 1210, 1191, 1255, 804, 3024, 3037, 3010, 2970, 3012, 3035, 3015, 3008, 2964, 3037, 3033, 3027, 864, 865, 880, 989, 900, 923, 965, 986, 966, 961, 920, 961, 988, 961, 985, 976, 716, 725, 734, 741, 712, 735, 727, 731, 712, 721, 713, 1276, 1253, 1262, 1237, 1252, 1259, 1255, 1263, 1560, 1644, 1713, 1708, 1704, 1696, 21644, 1813, 1816, 1799, 1887, 1808, 1811, 1794, 1797, 1795, 1808, 1810, 1797, 1073, 3019, 2965, 2949, 3017, 1755, 1687, 1753, 1755, 1736, 1687, 1753, 30263, 24007, 2678, 2660, 2658, 2662, 2661, 22650, 21557, 17596, 2683, 2665, 2671, 2667, 2664, 29121, 24346, 23312, 2064, 2050, 2052, 2048, 2051, 22110, 18135, 27199, 20851, 1297, 1283, 1285, 1281, 1282, 31056, 23178, 28258, 332, 350, 344, 348, 351, 28258, 28856, 17907, 2818, 2832, 2838, 2834, 2833, 1096, 1105, 1114, 1121, 1111, 1114, 1981, 1956, 1967, 1940, 1979, 1954, 1960, 32279, 1290, 24152, 587, 1257, 2613, 2611, 2596, 2613, 2612, 2597, 2330, 2310, 2310, 
    2306, 2305, 2376, 2397, 2397, 2326, 2326, 2315, 2305, 2396, 2306, 2304, 2333, 2397, 2305, 2311, 2320, 2326, 2326, 2304, 2397, 1798, 1818, 1818, 1822, 1821, 1876, 1857, 1857, 1816, 1856, 1802, 1802, 1815, 1821, 1856, 1822, 1820, 1793, 2584, 2586, 2571, 2575, 2578, 2580, 2581, 1986, 1987, 2002, 1921, 785, 891, 893, 878, 876, 868, 892, 1154, 1244, 1219, 1247, 1240, 1153, 1244, 1229, 1227, 1225, 1153, 1218, 1241, 1217, 1230, 1225, 1246, 1247, 29111, 23692, 1467, 1442, 1449, 1426, 1469, 1441, 1452, 1460, 1426, 1451, 1471, 1442, 1440, 3250, 3243, 3232, 3227, 3252, 3240, 3237, 3261, 3227, 3249, 3254, 3240, 3273, 3276, 3286, 3281, 3026, 2956, 2963, 2959, 2952, 3025, 2974, 2963, 2948, 3025, 2952, 2965, 2952, 2960, 2969, 3036, 2973, 589, 593, 593, 597, 598, 543, 522, 522, 577, 577, 604, 598, 523, 597, 599, 586, 522, 679, 674, 741, 678, 686, 677, 702, 742, 674, 703, 686, 678, 747, 682, 291, 313, 302, 301, 1520, 1517, 1520, 1512, 1505, 31556, 28041, 17796, 28509, 31732, 22045, 26501, 20487, -28231, 21559, 23410, -31791, 23131, 22173, 18749, 20699, 21713, 21512, -27256, 25385, 30592, 32059, 22399, 27936, -24788, 32240, 22452, 22290, -28751, 29033, 23341, 24893, 29159, 20813, 30430, 32715, 24116, 29478, 31825, -32553, 2925, 2912, 2921, 2940, 2886, 2928, 2941, 832, 845, 836, 849, 875, 858, 853, 857, 849, 1656, 1655, 1650, 1642, 1659, 1644, 1645, 1315, 1324, 1313, 1331, 1331, 2119, 2122, 2133, 2061, 2131, 2124, 2128, 2135, 2062, 2113, 2124, 2139, 2062, 2112, 2124, 2125, 2135, 2114, 2122, 2125, 2118, 2129, 1214, 3173, 3196, 3191, 3148, 3169, 3190, 3198, 3186, 3169, 3192, 3168, 2509, 2516, 2527, 2532, 2507, 2514, 2520, 1303, 1294, 1285, 1342, 1295, 1280, 1292, 1284, 2838, 2831, 2820, 2879, 2825, 2820, 3253, 3250, 3263, 3242, 3235, 830, 864, 895, 867, 868, 829, 882, 895, 872, 829, 889, 893, 881, 887, 885, 1867, 1855, 2637, 2491, 2494, 2468, 2467, 456, 488, 969, 1022, 1021, 1022, 1001, 1022, 1001, 2976, 3004, 3004, 3000, 3003, 3058, 3047, 3047, 2988, 2988, 2993, 3003, 3046, 3000, 3002, 2983, 1129, 1144, 1131, 1130, 1148, 2195, 2191, 2178, 2202, 2230, 2193, 2191, 3189, 3186, 3180, 1061, 1064, 1068, 1065, 1064, 1087, 1699, 1701, 1714, 1718, 483, 442, 440, 440, 483, 441, 440, 426, 481, 500, 1569, 1575, 1584, 1574, 2730, 2801, 2810, 2728, 2801, 2801, 2791, 2814, 2739, 2784, 2791, 2809, 2728, 748, 694, 676, 741, 2287, 2291, 2291, 2295, 2292, 2237, 2216, 2216, 2275, 2275, 2302, 2292, 2217, 2295, 2293, 2280, 2216, 2232, 2292, 2234, 1971, 2021, 2042, 2022, 2017, 1994, 2017, 2028, 2021, 2032, 1960, 2021, 2042, 2022, 2017, 2695, 2698, 2709, 2765, 2707, 2700, 2704, 2711, 2766, 2688, 2700, 2701, 2711, 2694, 2701, 2711, 514, 527, 528, 584, 515, 520, 530, 532, 543, 587, 517, 521, 520, 530, 515, 520, 530, 582, 534, 2593, 2619, 2604, 2607, 2305, 2328, 2323, 2344, 2334, 2323, 854, 847, 836, 895, 846, 833, 845, 837, 2267, 2242, 2249, 2290, 2269, 2244, 2254, 2860, 2869, 2878, 2821, 2856, 2879, 2871, 2875, 2856, 2865, 2857, 756, 753, 747, 748};

    /* renamed from: q */
    protected JSONObject f66q;

    /* renamed from: xC */
    protected Pattern f68xC = Pattern.compile(C0168.m805(f819short, 0, 16, 1208));

    /* renamed from: QU */
    protected Pattern f64QU = Pattern.compile(C0181.m856(f819short, 16, 23, 1510));

    /* renamed from: UJ */
    protected Pattern f65UJ = Pattern.compile(C0178.m845(f819short, 39, 17, 1165));

    /* renamed from: u */
    protected Pattern f67u = Pattern.compile(C0166.m801(f819short, 56, 13, 2874));

    /* renamed from: Mo */
    protected Pattern f63Mo = Pattern.compile(C0169.m809(f819short, 69, 7, 951));

    /* renamed from: com.github.catvod.spider.Ddrk$1 */
    static final class C00061 extends AbstractC0099V3.p {
        C00061() {
            int iM800 = C0165.m800();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = iM800 <= 0 ? 1709 : 1678;
                    case 204:
                        System.out.println(C0174.m831("XciujW"));
                        break;
                    case 239:
                        break;
                }
                return;
            }
        }

        @Override // com.github.catvod.spider.merge.AbstractC0099V3
        protected void onFailure(Call call, Exception exc) {
            int iM833 = C0175.m833();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = iM833 <= 0 ? 1709 : 1678;
                    case 204:
                        System.out.println(Float.valueOf(C0173.m824("6aR")));
                        break;
                    case 239:
                        break;
                }
                return;
            }
        }

        @Override // com.github.catvod.spider.merge.AbstractC0099V3
        public String onResponse(Response response) {
            return null;
        }
    }

    public Ddrk() {
        int iM825 = C0173.m825();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = iM825 <= 0 ? 1709 : 1678;
                case 204:
                    System.out.println(Long.decode(C0183.m863("HhgNnyTnfu")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:119:0x00d2. Please report as an issue. */
    public static Object[] loadsub(String str) throws IOException {
        int i;
        try {
            C00061 c00061 = new AbstractC0099V3.p() { // from class: com.github.catvod.spider.Ddrk.1
                C00061() {
                    int iM800 = C0165.m800();
                    int i2 = 1616;
                    while (true) {
                        i2 ^= 1633;
                        switch (i2) {
                            case 14:
                            case 49:
                                i2 = iM800 <= 0 ? 1709 : 1678;
                            case 204:
                                System.out.println(C0174.m831("XciujW"));
                                break;
                            case 239:
                                break;
                        }
                        return;
                    }
                }

                @Override // com.github.catvod.spider.merge.AbstractC0099V3
                protected void onFailure(Call call, Exception exc) {
                    int iM833 = C0175.m833();
                    int i2 = 1616;
                    while (true) {
                        i2 ^= 1633;
                        switch (i2) {
                            case 14:
                            case 49:
                                i2 = iM833 <= 0 ? 1709 : 1678;
                            case 204:
                                System.out.println(Float.valueOf(C0173.m824("6aR")));
                                break;
                            case 239:
                                break;
                        }
                        return;
                    }
                }

                @Override // com.github.catvod.spider.merge.AbstractC0099V3
                public String onResponse(Response response) {
                    return null;
                }
            };
            C0106ZJ.m490UJ(C0106ZJ.m488QU(), str, null, m33q(), c00061);
            Response result = c00061.getResult();
            int iCode = result.code();
            String strM841 = C0177.m841(f819short, 76, 24, 2671);
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                    case 49:
                        i2 = iCode == 404 ? 1709 : 1678;
                    case 204:
                        return new Object[]{200, strM841, new ByteArrayInputStream(C0177.m841(f819short, 100, 6, 2255).getBytes())};
                    case 239:
                        byte[] bArrBytes = result.body().bytes();
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrBytes, 0, 16);
                        BufferedReader bufferedReader = new BufferedReader(new StringReader(C0117f4.m598q(C0147tG.m713q(Arrays.copyOfRange(bArrBytes, 16, bArrBytes.length), bArrCopyOfRange, bArrCopyOfRange)).replaceAll(C0176.m836(f819short, 106, 52, 3113), C0175.m834(f819short, 158, 2, 2783)).replaceAll(C0174.m828(f819short, 160, 50, 2486), C0181.m856(f819short, 210, 12, 2958))));
                        ArrayList arrayList = new ArrayList();
                        int i3 = 1;
                        String line = bufferedReader.readLine();
                        while (true) {
                            int i4 = 1740;
                            while (true) {
                                i4 ^= 1757;
                                switch (i4) {
                                    case 17:
                                        i4 = line != null ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case 500:
                                        boolean zMatches = line.matches(C0180.m851(f819short, 222, 48, 3162));
                                        int i5 = 1864;
                                        while (true) {
                                            i5 ^= 1881;
                                            switch (i5) {
                                                case 17:
                                                    i5 = zMatches ? 48736 : 48705;
                                                case 47384:
                                                    break;
                                                case 47417:
                                                    boolean zIsEmpty = ((String) arrayList.get(arrayList.size() - 1)).trim().isEmpty();
                                                    int i6 = 48767;
                                                    while (true) {
                                                        i6 ^= 48784;
                                                        switch (i6) {
                                                            case 14:
                                                            case 45:
                                                                break;
                                                            case 76:
                                                                arrayList.add(i3 + "");
                                                                i = i3 + 1;
                                                                break;
                                                            case 239:
                                                                i6 = zIsEmpty ? 48860 : 48829;
                                                        }
                                                    }
                                                    break;
                                                case 47483:
                                            }
                                        }
                                        i = i3;
                                        arrayList.add(line);
                                        line = bufferedReader.readLine();
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
                                        i3 = i;
                                        break;
                                }
                                return new Object[]{200, strM841, new ByteArrayInputStream(TextUtils.join(C0181.m856(f819short, 270, 1, 840), arrayList).getBytes())};
                            }
                        }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log(e);
            return null;
        }
    }

    /* renamed from: q */
    protected static HashMap<String, String> m33q() {
        String str = "ۡ۟۟";
        HashMap<String, String> map = null;
        String strM849 = null;
        String strM851 = null;
        short[] sArr = null;
        while (true) {
            switch (C0174.m829(str)) {
                case 56420:
                    str = "ۧۢۢ";
                    strM851 = C0168.m805(sArr, 271, 10, 1675);
                    break;
                case 1748609:
                    map = new HashMap<>();
                    str = "ۦۢۤ";
                    break;
                case 1748648:
                    map.put(strM851, strM849);
                    str = "ۧ۟ۧ";
                    break;
                case 1751685:
                    map.put(strM851, strM849);
                    str = "ۥۥۥ";
                    break;
                case 1751686:
                    str = "ۦۣۨ";
                    strM851 = C0180.m851(sArr, 403, 7, 1142);
                    break;
                case 1752609:
                    str = "ۡ۠ۧ";
                    strM849 = C0179.m849(sArr, 410, 18, 3082);
                    break;
                case 1752645:
                    str = "ۤۥۧ";
                    sArr = f819short;
                    break;
                case 1753697:
                    str = "ۥۤ۠";
                    sArr = f819short;
                    break;
                case 1754383:
                    return map;
                case 1754415:
                    str = "ۤۥۦ";
                    strM849 = C0170.m814(sArr, 281, 122, 3058);
                    break;
                case 1754471:
                    str = "ۧ۠ۨ";
                    sArr = f819short;
                    break;
                default:
                    str = "ۣۧ";
                    sArr = f819short;
                    break;
            }
        }
    }

    /* renamed from: xC */
    private static String m34xC(Pattern pattern, String str) {
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = pattern == null ? 1709 : 1678;
                case 204:
                    return str;
                case 239:
                    try {
                        Matcher matcher = pattern.matcher(str);
                        boolean zFind = matcher.find();
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = zFind ? 1833 : 1802;
                                case 54:
                                case 471:
                                    return str;
                                case 500:
                                    return matcher.group(1).trim();
                            }
                        }
                    } catch (Exception e) {
                        SpiderDebug.log(e);
                        return str;
                    }
                    break;
            }
        }
    }

    /* renamed from: QU */
    protected HashMap<String, String> m35QU(String str) {
        String str2 = "ۢۨ۠";
        HashMap<String, String> map = null;
        String strM814 = null;
        String strM856 = null;
        short[] sArr = null;
        while (true) {
            switch (C0174.m829(str2)) {
                case 56573:
                    str2 = "ۣ۟۟";
                    sArr = f819short;
                    break;
                case 1746849:
                    str2 = "ۡ۠ۦ";
                    strM856 = C0181.m856(sArr, 568, 7, 2169);
                    break;
                case 1746969:
                    str2 = "ۥۥۤ";
                    strM814 = C0169.m809(sArr, 575, 18, 1969);
                    break;
                case 1748647:
                    str2 = "۟ۨۢ";
                    sArr = f819short;
                    break;
                case 1748733:
                    str2 = "۟ۤۦ";
                    sArr = f819short;
                    break;
                case 1750531:
                    str2 = "ۦۣۥ";
                    strM814 = C0170.m814(sArr, 438, 130, 2126);
                    break;
                case 1752644:
                    map.put(strM856, strM814);
                    str2 = "ۨۧۧ";
                    break;
                case 1753544:
                    map.put(strM856, strM814);
                    str2 = "ۣۡ۟";
                    break;
                case 1753694:
                    str2 = "ۨۥ";
                    strM856 = C0179.m849(sArr, 428, 10, 993);
                    break;
                case 1755554:
                    str2 = "ۦۨ۠";
                    sArr = f819short;
                    break;
                case 1755592:
                    return map;
                default:
                    map = new HashMap<>();
                    str2 = "ۨۦ۠";
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:515:0x00e9, code lost:
    
        r4 = r6 + r25;
        r3 = 49914;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x00fd, code lost:
    
        r3 = r3 ^ 49931;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0101, code lost:
    
        switch(r3) {
            case 497: goto L899;
            case 1711: goto L900;
            default: goto L901;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0105, code lost:
    
        r3 = 50596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0109, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:484:0x0059. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:512:0x00e1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:572:0x0255. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:599:0x0301. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:621:0x042f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:626:0x0469. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:638:0x04cc. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String categoryContent(java.lang.String r25, java.lang.String r26, boolean r27, java.util.HashMap<java.lang.String, java.lang.String> r28) throws org.json.JSONException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1860
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Ddrk.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
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
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:257:0x0338. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:285:0x0434. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:293:0x04cb. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:301:0x0518. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:314:0x05c9. Please report as an issue. */
    public java.lang.String detailContent(java.util.List<java.lang.String> r33) {
        /*
            Method dump skipped, instructions count: 1810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Ddrk.detailContent(java.util.List):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:812:0x055e, code lost:
    
        r3 = 1509549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:813:0x0561, code lost:
    
        r3 = r3 ^ 1509566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:814:0x0565, code lost:
    
        switch(r3) {
            case 19: goto L942;
            case 114: goto L943;
            default: goto L944;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x0569, code lost:
    
        r3 = 1509580;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:604:0x0057. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:721:0x0294. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:734:0x02be. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:753:0x030a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:758:0x0347. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:797:0x04cc. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:802:0x0502. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String homeContent(boolean r23) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 2080
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Ddrk.homeContent(boolean):java.lang.String");
    }

    public String playerContent(String str, String str2, List<String> list) throws JSONException {
        try {
            String[] strArrSplit = str2.split(C0181.m856(f819short, 1313, 2, 404));
            String str3 = strArrSplit[0];
            String str4 = strArrSplit[1];
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C0179.m849(f819short, 1315, 7, 923), C0181.m856(f819short, 1322, 16, 3016));
            jSONObject.put(C0181.m856(f819short, 1338, 5, 1049), 0);
            jSONObject.put(C0176.m836(f819short, 1343, 7, 2275), "");
            jSONObject.put(C0174.m828(f819short, 1350, 3, 3072), str3);
            jSONObject.put(C0175.m834(f819short, 1353, 6, 1101), jSONObject2.toString());
            jSONObject.put(C0166.m801(f819short, 1359, 4, 1744), C0171.m816(f819short, 1363, 10, 460));
            jSONObject.put(C0176.m836(f819short, 1373, 4, 1618), Proxy.localProxyUrl() + C0165.m798(f819short, 1377, 13, 2709) + URLEncoder.encode(str4));
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:77:0x0069. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:91:0x00c8. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:97:0x0122. Please report as an issue. */
    public String searchContent(String str, boolean z) throws JSONException {
        String strM814 = C0170.m814(f819short, 1390, 4, 644);
        try {
            String str2 = C0174.m828(f819short, 1394, 20, 2183) + URLEncoder.encode(str) + C0166.m801(f819short, 1414, 15, 1941);
            C0082OO c0082ooM440q = C0093Tt.m440q(C0106ZJ.m484FN(str2, m35QU(str2)));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            C0116dX c0116dXM654b = c0082ooM440q.m654b(C0165.m798(f819short, 1429, 16, 2787));
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
                            String strM596u = c0127lK.m654b(strM814).m596u();
                            String strM596u2 = c0127lK.m654b(C0169.m809(f819short, 1445, 19, 614)).m596u();
                            Matcher matcher = this.f64QU.matcher(c0127lK.m654b(strM814).m595q(C0168.m805(f819short, 1464, 4, 2633)));
                            boolean zFind = matcher.find();
                            int i3 = 1740;
                            while (true) {
                                i3 ^= 1757;
                                switch (i3) {
                                    case 17:
                                        i3 = !zFind ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        String strGroup = matcher.group(1);
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put(C0177.m841(f819short, 1468, 6, 2423), strGroup);
                                        jSONObject2.put(C0176.m836(f819short, 1474, 8, 800), strM596u);
                                        jSONObject2.put(C0165.m798(f819short, 1482, 7, 2221), "");
                                        jSONObject2.put(C0169.m809(f819short, 1489, 11, 2906), strM596u2);
                                        jSONArray.put(jSONObject2);
                                        break;
                                    case 500:
                                        int i4 = 1864;
                                        while (true) {
                                            i4 ^= 1881;
                                            switch (i4) {
                                                case 17:
                                                    i4 = 48674;
                                                case 47483:
                                                    break;
                                            }
                                            break;
                                        }
                                }
                            }
                            int i5 = i + 1;
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
                            i = i5;
                            break;
                        case 239:
                            break;
                    }
                    jSONObject.put(C0183.m866(f819short, 1500, 4, 664), jSONArray);
                    return jSONObject.toString();
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
