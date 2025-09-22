package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0165;
import com.github.catvod.parser.C0166;
import com.github.catvod.spider.merge.AbstractC0099V3;
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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class Nmvod extends Spider {

    /* renamed from: q */
    private static String f201q = "";

    /* renamed from: short, reason: not valid java name */
    private static final short[] f849short = {2778, 2691, 2714, 2705, 2776, 2689, 2700, 2693, 2704, 2776, 2716, 2705, 2776, 2781, 2729, 2705, 2782, 2780, 2776, 2693, 2706, 2776, 2781, 2729, 2705, 2782, 2780, 2779, 2717, 2689, 2712, 2713, 3125, 3180, 3189, 3198, 3182, 3171, 3178, 3199, 3186, 3182, 3191, 3190, 3125, 3122, 3142, 3198, 3121, 3123, 3124, 3186, 3182, 3191, 3190, 2442, 2515, 2506, 2497, 2509, 2513, 2504, 2505, 2442, 2445, 2553, 2497, 2446, 2444, 2443, 2509, 2513, 2504, 2505, 3032, 2945, 2968, 2963, 3034, 2963, 2962, 2947, 2966, 2974, 2971, 3034, 2974, 2963, 3034, 3039, 2987, 2963, 3036, 3038, 3033, 2975, 2947, 2970, 2971, 962, 923, 898, 905, 960, 925, 897, 908, 916, 960, 900, 905, 960, 965, 945, 958, 966, 964, 963, 901, 921, 896, 897, 3175, 3134, 3111, 3116, 3173, 3108, 3105, 3131, 3132, 3173, 3105, 3116, 3173, 3168, 3092, 3116, 3171, 3169, 3173, 3128, 3119, 3173, 3168, 3092, 3116, 3171, 3169, 3173, 3111, 3130, 3116, 3117, 3130, 3173, 3173, 3114, 3121, 3173, 3132, 3105, 3109, 3117, 3173, 3115, 3108, 3113, 3131, 3131, 3173, 3192, 3173, 3121, 3117, 3113, 3130, 3173, 3192, 3173, 3108, 3117, 3132, 3132, 3117, 3130, 3173, 3173, 3113, 3130, 3117, 3113, 3173, 3173, 3108, 3113, 3110, 3119, 3173, 3174, 3104, 3132, 3109, 3108, 2538, 2502, 2500, 2551, 2507, 2502, 2526, 2498, 2517, 2532, 2504, 2505, 2497, 2510, 2496, 2441, 2519, 2507, 2502, 2526, 2498, 2517, 2552, 2507, 2510, 2516, 2515, 2458, 2447, 2555, 2524, 2441, 2445, 2555, 2522, 2446, 2555, 2443, 2538, 2502, 2500, 2551, 2507, 2502, 2526, 2498, 2517, 2532, 2504, 2505, 2497, 2510, 2496, 2441, 2499, 2504, 2512, 2505, 2498, 2517, 2552, 2507, 2510, 2516, 2515, 2458, 881, 893, 895, 835, 873, 878, 880, 801, 827, 820, 818, 822, 821, 827, 807, 614, 559, 545, 573, 614, 638, 614, 620, 618, 622, 621, 614, 616, 1417, 1501, 1472, 1486, 1490, 1417, 1425, 1417, 1411, 1413, 1409, 1410, 1417, 1415, 1648, 1574, 1595, 1599, 1591, 1648, 1640, 1648, 1658, 1660, 1656, 1659, 1648, 1662, 2488, 2493, 2548, 2485, 2952, 2964, 2964, 2960, 2963, 3034, 3023, 3023, 2966, 2953, 2960, 3022, 2967, 2967, 2951, 2970, 3022, 2947, 2958, 3034, 3029, 3026, 3024, 3024, 3023, 2953, 2958, 2948, 2949, 2968, 3022, 2960, 2952, 2960, 3039, 2957, 3037, 2966, 2959, 2948, 3021, 2956, 2953, 2963, 2964, 3021, 2953, 2948, 3021, 449, 412, 395, 449, 3107, 3169, 3196, 3178, 3179, 3196, 3107, 3107, 3180, 3191, 3107, 3194, 3175, 3171, 3179, 3107, 3181, 3170, 3183, 3197, 3197, 3107, 3134, 3107, 3191, 3179, 3183, 3196, 3107, 3134, 3107, 3170, 3179, 3194, 3194, 3179, 3196, 3107, 3107, 3183, 3196, 3179, 3183, 3107, 3107, 3170, 3183, 3168, 3177, 3107, 3104, 3174, 3194, 3171, 3170, 3237, 3240, 3255, 3311, 3249, 3232, 3238, 3236, 3327, 3232, 2363, 2337, 2358, 2357, 2654, 2639, 2633, 2635, 2626, 2631, 2624, 2629, 2673, 2636, 23980, -26137, 26330, 28018, 26629, 22603, 27347, 27272, -31750, 31999, 29864, 28135, 24221, 517, 540, 606, 514, 533, 515, 537, 522, 533, 559, 540, 537, 515, 516, 592, 540, 537, 644, 665, 644, 668, 661, 537, 540, 597, 532, 597, 529, 540, 515, 603, 517, 540, 534, 597, 540, 536, 530, 1253, 1252, 1269, 1634, 1639, 1582, 1647, 1582, 1642, 1639, 1656, 1568, 1662, 1639, 1645, 1582, 1661, 1662, 1647, 1632, 1568, 1661, 1612, 1633, 1658, 1658, 1633, 1635, 1582, 1661, 1662, 1647, 1632, 2901, 2892, 2887, 2940, 2890, 2887, 1244, 1221, 1230, 1269, 1220, 1227, 1223, 1231, 2258, 2251, 2240, 2299, 2260, 2253, 2247, 2594, 2619, 2608, 2571, 2598, 2609, 2617, 2613, 2598, 2623, 2599, 258, 275, 277, 279, 1738, 1755, 1757, 1759, 1753, 1749, 1743, 1748, 1742, 2946, 2951, 2947, 2951, 2970, 2445, 2454, 2445, 2456, 2453, 2761, 2764, 2774, 2769, 1680, 1676, 1676, 1672, 1675, 1730, 1751, 1751, 1678, 1681, 1672, 1750, 1679, 1679, 1695, 1666, 1750, 1691, 1686, 1730, 1741, 1738, 1736, 1736, 1751, 1678, 1687, 1692, 1749, 1692, 1693, 1676, 1689, 1681, 1684, 1749, 1681, 1692, 1749, 1767, 1697, 1725, 1700, 1701, 546, 574, 574, 570, 569, 624, 613, 613, 572, 547, 570, 612, 573, 573, 557, 560, 612, 553, 548, 624, 639, 632, 634, 634, 613, 572, 549, 558, 615, 570, 550, 555, 563, 615, 547, 558, 615, 2013, 1923, 1922, 1939, 2013, 1985, 2013, 1950, 1925, 1949, 2013, 1985, 2014, 1944, 1924, 1949, 1948, 3101, 3083, 3085, 3098, 3079, 3073, 3072, 3136, 3102, 3087, 3081, 3083, 3139, 3078, 3082, 3150, 3087, 3150, 3079, 3075, 3081, 404, 405, 388, 3167, 3078, 3097, 3139, 3166, 3139, 3163, 3154, 3095, 3158, 2726, 2736, 2742, 2721, 2748, 2746, 2747, 2811, 2725, 2740, 2738, 2736, 2808, 2743, 2737, 2805, 2737, 2748, 2723, 2811, 2737, 2736, 2726, 2742, 2698, 2748, 2721, 2736, 2744, 2003, 2000, 1985, 1998, 24405, 27581, 2143, 637, 612, 623, 596, 623, 610, 633, 622, 616, 639, 612, 633, 18195, 26172, 1940, 1933, 1926, 1981, 1923, 1921, 1942, 1933, 1936, 30391, 25600, 3109, 3132, 3127, 3084, 3105, 3126, 3134, 3122, 3105, 3128, 1712, 1721, 1720, 1698, 21654, 17409, 2932, 2925, 2918, 2909, 2939, 2919, 2915, 2928, 2668, 2687, 2681, 2660, 2670, 2657, 2664, 2595, 2665, 2664, 2681, 2668, 2660, 2657, 2592, 2670, 2658, 2659, 2611, 2685, 1709, 1716, 1727, 1668, 1714, 1727, 779, 786, 793, 802, 787, 796, 784, 792, 2985, 2992, 3003, 2944, 2991, 2998, 3004, 607, 582, 589, 630, 586, 582, 583, 605, 588, 583, 605, 25573, 27428, 23394, 21261, 23017, 22988, -31304, -2163, -31882, 23166, 18059, 22482, 23382, -28138, -2176, -2176, 877, 864, 895, 807, 877, 876, 893, 872, 864, 869, 857, 870, 890, 893, 876, 891, 832, 871, 893, 891, 870, 809, 890, 874, 891, 864, 889, 893, 624, 617, 610, 601, 630, 618, 615, 639, 601, 608, 628, 617, 619, -31768, 22140, 778, 787, 792, 803, 780, 784, 797, 773, 803, 777, 782, 784, 2450, 2455, 2445, 2442, 2396, 2393, 2320, 2385, 1204, 1192, 1192, 1196, 1199, 1254, 1267, 1267, 1194, 1205, 1196, 1266, 1195, 1195, 1211, 1190, 1266, 1215, 1202, 1254, 1257, 1262, 1260, 1260, 2063, 2050, 2077, 2120, 2079, 2052, 2075, 2053, 2058, 2077, 2123, 2078, 2055, 2117, 2072, 2076, 2050, 2075, 2062, 2073, 2118, 2076, 2073, 
    2058, 2075, 2075, 2062, 2073, 2123, 2055, 2050, 2123, 2058, 1534, 1508, 1523, 1520, 31017, 21357, -31597, 30112, 22826, 30702, -29848, 20785, 27826, 29030, 21740, 2500, 2505, 2496, 2517, 2543, 2521, 2516, 950, 955, 946, 935, 925, 940, 931, 943, 935, 3090, 3101, 3096, 3072, 3089, 3078, 3079, 1937, 1950, 1939, 1921, 1921, 1887, 1862, 1796, 1880, 1871, 1881, 1859, 1872, 1871, 1909, 1862, 1859, 1881, 1886, 1885, 1856, 1885, 1861, 1868, 1182, 1179, 1234, 1171, 1234, 1174, 1179, 1156, 1244, 1154, 1179, 1169, 1234, 1179, 1183, 1173, 1857, 1856, 1873, 2278, 2275, 2218, 2283, 2218, 2286, 2275, 2300, 2212, 2298, 2275, 2281, 2218, 2297, 2298, 2283, 2276, 2212, 2297, 2248, 2277, 2302, 2302, 2277, 2279, 2218, 2297, 2298, 2283, 2276, 853, 844, 839, 892, 842, 839, 2234, 2211, 2216, 2195, 2210, 2221, 2209, 2217, 1834, 1843, 1848, 1795, 1836, 1845, 1855, 449, 472, 467, 488, 453, 466, 474, 470, 453, 476, 452, 1251, 1254, 1276, 1275, 2810, 2797, 2814, 2732, 2809, 2814, 2784, 2737, 2731, 2724, 2722, 2726, 2725, 2731, 2743, 1804, 1821, 1806, 1807, 1817, 644, 643, 669, 804, 824, 824, 828, 831, 886, 867, 867, 826, 805, 828, 866, 827, 827, 811, 822, 866, 815, 802, 886, 889, 894, 892, 892, 867, 805, 802, 808, 809, 820, 866, 828, 804, 828, 883, 801, 881, 826, 803, 808, 865, 831, 809, 813, 830, 815, 804, 872, 891, 1509, 1504, 1530, 1533, 1436, 1466, 1452, 1467, 1508, 1416, 1454, 1452, 1447, 1469, 882, 848, 837, 854, 851, 851, 862, 784, 778, 785, 783, 799, 791, 883, 854, 849, 842, 839, 772, 799, 894, 849, 859, 845, 848, 854, 859, 799, 782, 782, 772, 799, 882, 781, 783, 783, 776, 885, 780, 876, 892, 799, 893, 842, 854, 851, 859, 784, 877, 884, 878, 782, 785, 781, 783, 783, 775, 781, 777, 785, 783, 783, 781, 772, 799, 840, 841, 790, 799, 894, 847, 847, 851, 858, 872, 858, 861, 884, 854, 843, 784, 778, 780, 776, 785, 780, 777, 799, 791, 884, 887, 875, 882, 883, 787, 799, 851, 854, 852, 858, 799, 888, 858, 860, 852, 848, 790, 799, 873, 858, 845, 844, 854, 848, 849, 784, 779, 785, 783, 799, 892, 855, 845, 848, 850, 858, 784, 776, 776, 785, 783, 785, 780, 775, 777, 778, 785, 782, 781, 783, 799, 882, 878, 878, 893, 845, 848, 840, 844, 858, 845, 784, 777, 785, 781, 799, 875, 893, 876, 784, 783, 779, 778, 776, 782, 779, 799, 882, 848, 861, 854, 851, 858, 799, 876, 862, 857, 862, 845, 854, 784, 778, 780, 776, 785, 780, 777};

    /* renamed from: B */
    private Pattern f202B;

    /* renamed from: F */
    private Pattern f203F;

    /* renamed from: FN */
    private Pattern f204FN;

    /* renamed from: MH */
    private Pattern f205MH;

    /* renamed from: W */
    private Pattern f209W;

    /* renamed from: se */
    private Pattern f211se;

    /* renamed from: w8 */
    private Pattern f213w8;

    /* renamed from: xC */
    private JSONObject f214xC;

    /* renamed from: QU */
    private Pattern f207QU = Pattern.compile(C0176.m836(f849short, 0, 32, 2805));

    /* renamed from: UJ */
    private Pattern f208UJ = Pattern.compile(C0165.m798(f849short, 32, 23, 3098));

    /* renamed from: u */
    private Pattern f212u = Pattern.compile(C0172.m820(f849short, 55, 19, 2469));

    /* renamed from: Mo */
    private Pattern f206Mo = Pattern.compile(C0174.m828(f849short, 74, 25, 3063));

    /* renamed from: i */
    private Pattern f210i = Pattern.compile(C0177.m841(f849short, 99, 23, 1005));

    public Nmvod() {
        String strM801 = C0166.m801(f849short, 122, 82, 3144);
        this.f205MH = Pattern.compile(strM801);
        this.f211se = Pattern.compile(strM801);
        this.f209W = Pattern.compile(C0166.m801(f849short, 204, 66, 2471));
        this.f204FN = Pattern.compile(C0175.m834(f849short, 270, 15, 796));
        this.f202B = Pattern.compile(C0168.m805(f849short, 285, 13, 580));
        this.f213w8 = Pattern.compile(C0172.m820(f849short, 298, 14, 1451));
        this.f203F = Pattern.compile(C0183.m866(f849short, 312, 14, 1618));
        int iM812 = C0169.m812();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = iM812 >= 0 ? 1709 : 1678;
                case 204:
                    System.out.println(Float.parseFloat(C0181.m858("YPO2q3")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:103:0x0221. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:117:0x02ab. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x0101. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:73:0x018a. Please report as an issue. */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException, NumberFormatException {
        int i;
        int i2;
        int i3;
        int length;
        String strM866 = C0183.m866(f849short, 326, 4, 2516);
        try {
            String strM484FN = C0106ZJ.m484FN(C0182.m861(f849short, 330, 49, 3040) + str + C0166.m801(f849short, 379, 4, 492) + str2 + C0170.m814(f849short, 383, 55, 3086), m83xC(""));
            C0082OO c0082ooM440q = C0093Tt.m440q(strM484FN);
            JSONObject jSONObject = new JSONObject();
            C0116dX c0116dXM654b = c0082ooM440q.m654b(C0171.m816(f849short, 438, 10, 3265));
            int size = c0116dXM654b.size();
            String strM841 = C0177.m841(f849short, 448, 4, 2387);
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
                                                                boolean zM670wt = c0127lK.m670wt(C0165.m798(f849short, 452, 10, 2606));
                                                                int i12 = 49790;
                                                                while (true) {
                                                                    i12 ^= 49807;
                                                                    switch (i12) {
                                                                        case 18:
                                                                        case 51:
                                                                            break;
                                                                        case 84:
                                                                            boolean zFind = this.f205MH.matcher(c0127lK.mo126QU(strM841)).find();
                                                                            int i13 = 49914;
                                                                            while (true) {
                                                                                i13 ^= 49931;
                                                                                switch (i13) {
                                                                                    case 497:
                                                                                        i13 = zFind ? 50658 : 50627;
                                                                                    case 1711:
                                                                                    case 1736:
                                                                                        i7 = 0;
                                                                                        break;
                                                                                    case 1769:
                                                                                        i7 = Integer.parseInt(strM653a);
                                                                                        int i14 = 50689;
                                                                                        while (true) {
                                                                                            i14 ^= 50706;
                                                                                            switch (i14) {
                                                                                                case 19:
                                                                                                    i14 = 50720;
                                                                                                case 50:
                                                                                                    break;
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 241:
                                                                            i12 = zM670wt ? 49883 : 49852;
                                                                    }
                                                                }
                                                                break;
                                                            case 83:
                                                                break;
                                                        }
                                                    }
                                                    boolean zEquals = strM653a.equals(C0169.m809(f849short, 462, 2, 402));
                                                    int i15 = 50813;
                                                    while (true) {
                                                        i15 ^= 50830;
                                                        switch (i15) {
                                                            case 18:
                                                            case 53:
                                                                i = i7;
                                                                break;
                                                            case 243:
                                                                i15 = zEquals ? 51557 : 50875;
                                                            case 4075:
                                                                Matcher matcher = this.f205MH.matcher(c0127lK.mo126QU(strM841));
                                                                boolean zFind2 = matcher.find();
                                                                int i16 = 51588;
                                                                while (true) {
                                                                    i16 ^= 51605;
                                                                    switch (i16) {
                                                                        case 17:
                                                                            i16 = zFind2 ? 51681 : 51650;
                                                                        case 54:
                                                                        case 87:
                                                                            break;
                                                                        case 116:
                                                                            int i17 = Integer.parseInt(matcher.group(2));
                                                                            int i18 = 51712;
                                                                            while (true) {
                                                                                i18 ^= 51729;
                                                                                switch (i18) {
                                                                                    case 14:
                                                                                        i2 = i17;
                                                                                        i3 = i7;
                                                                                        break;
                                                                                    case 15:
                                                                                    case 16:
                                                                                    default:
                                                                                        continue;
                                                                                    case 17:
                                                                                        i18 = 51743;
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
                                                    int i19 = 48891;
                                                    while (true) {
                                                        i19 ^= 48908;
                                                        switch (i19) {
                                                            case 22:
                                                                break;
                                                            case 503:
                                                                i19 = 48922;
                                                        }
                                                        i = i7;
                                                        break;
                                                    }
                                                    break;
                                                case 239:
                                                    i10 = c0127lK == null ? 48860 : 48829;
                                            }
                                        }
                                        i8++;
                                        int i20 = 51836;
                                        while (true) {
                                            i20 ^= 51853;
                                            switch (i20) {
                                                case 241:
                                                    i20 = 52518;
                                                    break;
                                                case 1963:
                                                    break;
                                            }
                                        }
                                        i7 = i;
                                        break;
                                    case 47483:
                                }
                            }
                        }
                        i2 = 0;
                        i3 = i7;
                        break;
                }
            }
            JSONArray jSONArray = new JSONArray();
            boolean zContains = strM484FN.contains(C0180.m851(f849short, 464, 11, 2683));
            int i21 = 52611;
            while (true) {
                i21 ^= 52628;
                switch (i21) {
                    case 23:
                        i21 = !zContains ? 52704 : 52673;
                    case 54:
                    case 85:
                        break;
                    case 116:
                        C0116dX c0116dXM654b2 = c0082ooM440q.m654b(C0183.m866(f849short, 475, 17, 624));
                        int i22 = 0;
                        while (true) {
                            int size3 = c0116dXM654b2.size();
                            int i23 = 52735;
                            while (true) {
                                i23 ^= 52752;
                                switch (i23) {
                                    case 14:
                                    case 45:
                                        break;
                                    case 1007:
                                        i23 = i22 < size3 ? 53479 : 52797;
                                    case 7927:
                                        C0127lK c0127lK2 = c0116dXM654b2.get(i22);
                                        String strM595q = c0127lK2.m654b(strM866).m595q(C0174.m828(f849short, 492, 5, 752));
                                        String strM595q2 = c0127lK2.m654b(C0169.m809(f849short, 497, 16, 629)).m595q(C0175.m834(f849short, 513, 3, 1174));
                                        String strM596u = c0127lK2.m654b(C0166.m801(f849short, 516, 30, 1550)).m596u();
                                        Matcher matcher2 = this.f206Mo.matcher(c0127lK2.m654b(strM866).m595q(strM841));
                                        boolean zFind3 = matcher2.find();
                                        int i24 = 53510;
                                        while (true) {
                                            i24 ^= 53527;
                                            switch (i24) {
                                                case 17:
                                                    i24 = !zFind3 ? 53603 : 53572;
                                                case 50:
                                                case 83:
                                                    String strGroup = matcher2.group(1);
                                                    JSONObject jSONObject2 = new JSONObject();
                                                    jSONObject2.put(C0174.m828(f849short, 546, 6, 2851), strGroup);
                                                    jSONObject2.put(C0169.m809(f849short, 552, 8, 1194), strM595q);
                                                    jSONObject2.put(C0182.m861(f849short, 560, 7, 2212), strM595q2);
                                                    jSONObject2.put(C0177.m841(f849short, 567, 11, 2644), strM596u);
                                                    jSONArray.put(jSONObject2);
                                                    break;
                                                case 116:
                                                    int i25 = 53634;
                                                    while (true) {
                                                        i25 ^= 53651;
                                                        switch (i25) {
                                                            case 17:
                                                                i25 = 53665;
                                                            case 50:
                                                                break;
                                                        }
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                        int i26 = i22 + 1;
                                        int i27 = 53758;
                                        while (true) {
                                            i27 ^= 53775;
                                            switch (i27) {
                                                case 1009:
                                                    i27 = 54440;
                                                    break;
                                                case 1703:
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
            jSONObject.put(C0170.m814(f849short, 578, 4, 370), i3);
            jSONObject.put(C0181.m856(f849short, 582, 9, 1722), i2);
            jSONObject.put(C0174.m828(f849short, 591, 5, 3054), 30);
            String strM836 = C0176.m836(f849short, 596, 5, 2553);
            int i28 = 54533;
            while (true) {
                i28 ^= 54550;
                switch (i28) {
                    case 19:
                        if (i2 > 1) {
                            break;
                        } else {
                            i28 = 54626;
                        }
                    case 50:
                        break;
                    case 85:
                        length = i2 * 30;
                        break;
                    case 116:
                        length = jSONArray.length();
                        int i29 = 54657;
                        while (true) {
                            i29 ^= 54674;
                            switch (i29) {
                                case 19:
                                    i29 = 54688;
                                    break;
                                case 50:
                                    break;
                            }
                        }
                        break;
                    default:
                        continue;
                }
                i28 = 54595;
            }
            jSONObject.put(strM836, length);
            jSONObject.put(C0165.m798(f849short, 601, 4, 2725), jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x015e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x01b8. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x020d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x00df. Please report as an issue. */
    public String detailContent(List<String> list) throws JSONException {
        try {
            Init.m46lj();
            C0082OO c0082ooM440q = C0093Tt.m440q(C0106ZJ.m484FN(C0178.m845(f849short, 605, 39, 1784) + list.get(0) + C0166.m801(f849short, 644, 5, 1737), m83xC("")));
            C0082OO c0082ooM440q2 = C0093Tt.m440q(C0106ZJ.m484FN(C0172.m820(f849short, 649, 37, 586) + list.get(0) + C0166.m801(f849short, 686, 17, 2032), m83xC("")));
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String strM595q = c0082ooM440q.m654b(C0176.m836(f849short, 703, 21, 3182)).m595q(C0170.m814(f849short, 724, 3, 487));
            String strM596u = c0082ooM440q.m654b(C0171.m816(f849short, 727, 10, 3127)).m596u();
            C0116dX c0116dXM654b = c0082ooM440q.m654b(C0165.m798(f849short, 737, 29, 2773));
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
                            C0116dX c0116dXM654b2 = c0127lK.m654b(C0170.m814(f849short, 766, 4, 1952));
                            int i3 = 1740;
                            while (true) {
                                i3 ^= 1757;
                                switch (i3) {
                                    case 17:
                                        i3 = c0116dXM654b2 != null ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case 500:
                                        String strM596u2 = c0116dXM654b2.m596u();
                                        boolean zContains = strM596u2.contains(C0168.m805(f849short, 770, 2, 1193));
                                        String strM809 = C0169.m809(f849short, 772, 1, 2110);
                                        int i4 = 1864;
                                        while (true) {
                                            i4 ^= 1881;
                                            switch (i4) {
                                                case 17:
                                                    i4 = zContains ? 48736 : 48705;
                                                case 47384:
                                                    boolean zContains2 = strM596u2.contains(C0179.m849(f849short, 785, 2, 2344));
                                                    int i5 = 48891;
                                                    while (true) {
                                                        i5 ^= 48908;
                                                        switch (i5) {
                                                            case 22:
                                                            case 53:
                                                                boolean zContains3 = strM596u2.contains(C0171.m816(f849short, 796, 2, 1025));
                                                                int i6 = 49790;
                                                                while (true) {
                                                                    i6 ^= 49807;
                                                                    switch (i6) {
                                                                        case 18:
                                                                        case 51:
                                                                            boolean zContains4 = strM596u2.contains(C0166.m801(f849short, 812, 2, 2786));
                                                                            int i7 = 50689;
                                                                            while (true) {
                                                                                i7 ^= 50706;
                                                                                switch (i7) {
                                                                                    case 19:
                                                                                        i7 = zContains4 ? 50782 : 50751;
                                                                                    case 45:
                                                                                        break;
                                                                                    case 50:
                                                                                    case 76:
                                                                                        jSONObject2.put(C0178.m845(f849short, 814, 8, 2818), c0127lK.m654b(strM809).m596u());
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 84:
                                                                            jSONObject2.put(C0183.m866(f849short, 798, 10, 3155), c0127lK.m654b(C0176.m836(f849short, 808, 4, 1750)).m596u());
                                                                            int i8 = 49914;
                                                                            while (true) {
                                                                                i8 ^= 49931;
                                                                                switch (i8) {
                                                                                    case 497:
                                                                                        i8 = 50596;
                                                                                    case 1711:
                                                                                        break;
                                                                                }
                                                                                break;
                                                                            }
                                                                        case 241:
                                                                            i6 = zContains3 ? 49883 : 49852;
                                                                    }
                                                                }
                                                                break;
                                                            case 503:
                                                                i5 = zContains2 ? 49635 : 48953;
                                                            case 32495:
                                                                jSONObject2.put(C0182.m861(f849short, 787, 9, 2018), c0127lK.m654b(strM809).m596u());
                                                                int i9 = 49666;
                                                                while (true) {
                                                                    i9 ^= 49683;
                                                                    switch (i9) {
                                                                        case 17:
                                                                            i9 = 49697;
                                                                        case 50:
                                                                            break;
                                                                    }
                                                                    break;
                                                                }
                                                        }
                                                    }
                                                    break;
                                                case 47417:
                                                    jSONObject2.put(C0168.m805(f849short, 773, 12, 523), c0127lK.m654b(strM809).m596u());
                                                    int i10 = 48767;
                                                    while (true) {
                                                        i10 ^= 48784;
                                                        switch (i10) {
                                                            case 14:
                                                                break;
                                                            case 239:
                                                                i10 = 48798;
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                case 47483:
                                            }
                                        }
                                        break;
                                }
                            }
                            int i11 = i + 1;
                            int i12 = 50813;
                            while (true) {
                                i12 ^= 50830;
                                switch (i12) {
                                    case 18:
                                        break;
                                    case 243:
                                        i12 = 50844;
                                        break;
                                }
                            }
                            i = i11;
                            break;
                        case 239:
                            break;
                    }
                    String strTrim = c0082ooM440q.m667pt(C0182.m861(f849short, 822, 20, 2573)).m653a().trim();
                    jSONObject2.put(C0165.m798(f849short, 842, 6, 1755), list.get(0));
                    jSONObject2.put(C0181.m856(f849short, 848, 8, 893), strM596u);
                    jSONObject2.put(C0182.m861(f849short, 856, 7, 3039), strM595q);
                    jSONObject2.put(C0181.m856(f849short, 863, 11, 553), C0168.m805(f849short, 874, 16, 2177) + strTrim);
                    Matcher matcher = this.f204FN.matcher(c0082ooM440q2.m654b(C0168.m805(f849short, 890, 28, 777)).get(0).m671y().trim());
                    boolean zFind = matcher.find();
                    int i13 = 51588;
                    while (true) {
                        i13 ^= 51605;
                        switch (i13) {
                            case 17:
                                if (zFind) {
                                    break;
                                } else {
                                    i13 = 51681;
                                }
                            case 54:
                                break;
                            case 87:
                                String strGroup = matcher.group(1);
                                jSONObject2.put(C0177.m841(f849short, 918, 13, 518), C0166.m801(f849short, 931, 2, 1845));
                                jSONObject2.put(C0171.m816(f849short, 933, 12, 892), strGroup);
                                JSONArray jSONArray = new JSONArray();
                                jSONArray.put(jSONObject2);
                                jSONObject.put(C0182.m861(f849short, 945, 4, 2558), jSONArray);
                                return jSONObject.toString();
                            case 116:
                                return "";
                            default:
                                continue;
                        }
                        i13 = 51650;
                    }
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:64:0x0155. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:69:0x0192. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0053. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:84:0x01f3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:98:0x027b. Please report as an issue. */
    public String homeContent(boolean z) throws JSONException {
        C0116dX c0116dXM654b;
        JSONArray jSONArray;
        int i;
        String strM861 = C0182.m861(f849short, 949, 4, 2352);
        try {
            C0082OO c0082ooM440q = C0093Tt.m440q(C0106ZJ.m484FN(C0170.m814(f849short, 953, 24, 1244), m83xC("")));
            C0116dX c0116dXM654b2 = c0082ooM440q.m654b(C0175.m834(f849short, 977, 33, 2155));
            JSONArray jSONArray2 = new JSONArray();
            Iterator<C0127lK> it = c0116dXM654b2.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                boolean z2 = false;
                String strM809 = C0169.m809(f849short, 1010, 4, 1430);
                int i2 = 1616;
                while (true) {
                    i2 ^= 1633;
                    switch (i2) {
                        case 14:
                        case 49:
                            i2 = zHasNext ? 1709 : 1678;
                        case 204:
                            C0127lK next = it.next();
                            String strM653a = next.m653a();
                            boolean zEquals = strM653a.equals(C0174.m828(f849short, 1014, 2, 3100));
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
                                        boolean zEquals2 = strM653a.equals(C0179.m849(f849short, 1016, 3, 2893));
                                        int i4 = 1864;
                                        while (true) {
                                            i4 ^= 1881;
                                            switch (i4) {
                                                case 17:
                                                    i4 = !zEquals2 ? 48736 : 48705;
                                                case 47384:
                                                    break;
                                                case 47417:
                                                    boolean zEquals3 = strM653a.equals(C0168.m805(f849short, 1019, 2, 2322));
                                                    int i5 = 48767;
                                                    while (true) {
                                                        i5 ^= 48784;
                                                        switch (i5) {
                                                            case 14:
                                                            case 45:
                                                                break;
                                                            case 76:
                                                                boolean zEquals4 = strM653a.equals(C0176.m836(f849short, 1021, 2, 921));
                                                                int i6 = 48891;
                                                                while (true) {
                                                                    i6 ^= 48908;
                                                                    switch (i6) {
                                                                        case 22:
                                                                        case 53:
                                                                            break;
                                                                        case 503:
                                                                            i6 = !zEquals4 ? 49635 : 48953;
                                                                        case 32495:
                                                                            boolean zEquals5 = strM653a.equals(C0181.m856(f849short, 1023, 2, 1675));
                                                                            int i7 = 49666;
                                                                            while (true) {
                                                                                i7 ^= 49683;
                                                                                switch (i7) {
                                                                                    case 17:
                                                                                        i7 = zEquals5 ? 49759 : 49728;
                                                                                    case 50:
                                                                                    case 76:
                                                                                        break;
                                                                                    case 83:
                                                                                        break;
                                                                                }
                                                                            }
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
                            int i8 = 49790;
                            while (true) {
                                i8 ^= 49807;
                                switch (i8) {
                                    case 18:
                                    case 51:
                                        break;
                                    case 84:
                                        Matcher matcher = this.f207QU.matcher(next.mo126QU(strM809));
                                        boolean zFind = matcher.find();
                                        int i9 = 49914;
                                        while (true) {
                                            i9 ^= 49931;
                                            switch (i9) {
                                                case 497:
                                                    i9 = !zFind ? 50658 : 50627;
                                                case 1711:
                                                case 1736:
                                                    String strTrim = matcher.group(1).trim();
                                                    JSONObject jSONObject = new JSONObject();
                                                    jSONObject.put(C0168.m805(f849short, 1025, 7, 2480), strTrim);
                                                    jSONObject.put(C0175.m834(f849short, 1032, 9, 962), strM653a);
                                                    jSONArray2.put(jSONObject);
                                                    int i10 = 50813;
                                                    while (true) {
                                                        i10 ^= 50830;
                                                        switch (i10) {
                                                            case 18:
                                                                break;
                                                            case 243:
                                                                i10 = 50844;
                                                        }
                                                    }
                                                    break;
                                                case 1769:
                                                    int i11 = 50689;
                                                    while (true) {
                                                        i11 ^= 50706;
                                                        switch (i11) {
                                                            case 19:
                                                                i11 = 50720;
                                                            case 50:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                    case 241:
                                        i8 = z2 ? 49883 : 49852;
                                }
                            }
                            break;
                        case 239:
                            break;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    int i12 = 51588;
                    while (true) {
                        i12 ^= 51605;
                        switch (i12) {
                            case 17:
                                if (!z) {
                                    break;
                                } else {
                                    i12 = 51681;
                                }
                            case 54:
                                break;
                            case 87:
                                break;
                            case 116:
                                jSONObject2.put(C0169.m809(f849short, 1041, 7, 3188), this.f214xC);
                                break;
                            default:
                                continue;
                        }
                        i12 = 51650;
                    }
                    jSONObject2.put(C0176.m836(f849short, 1048, 5, 2034), jSONArray2);
                    try {
                        c0116dXM654b = c0082ooM440q.m654b(C0179.m849(f849short, 1053, 14, 1834));
                        jSONArray = new JSONArray();
                        i = 0;
                    } catch (Exception e) {
                        SpiderDebug.log(e);
                    }
                    while (true) {
                        int size = c0116dXM654b.size();
                        int i13 = 51712;
                        while (true) {
                            i13 ^= 51729;
                            switch (i13) {
                                case 14:
                                case 17:
                                    i13 = i < size ? 51805 : 51774;
                                case 47:
                                    break;
                                case 76:
                                    C0127lK c0127lK = c0116dXM654b.get(i);
                                    String strM595q = c0127lK.m654b(strM861).m595q(C0172.m820(f849short, 1067, 5, 1833));
                                    String strM595q2 = c0127lK.m654b(C0170.m814(f849short, 1072, 16, 1266)).m595q(C0178.m845(f849short, 1088, 3, 1842));
                                    String strM596u = c0127lK.m654b(C0178.m845(f849short, 1091, 30, 2186)).m596u();
                                    Matcher matcher2 = this.f206Mo.matcher(c0127lK.m654b(strM861).m595q(strM809));
                                    boolean zFind2 = matcher2.find();
                                    int i14 = 51836;
                                    while (true) {
                                        i14 ^= 51853;
                                        switch (i14) {
                                            case 241:
                                                i14 = !zFind2 ? 52580 : 52549;
                                            case 1963:
                                            case 1992:
                                                String strGroup = matcher2.group(1);
                                                JSONObject jSONObject3 = new JSONObject();
                                                jSONObject3.put(C0175.m834(f849short, 1121, 6, 803), strGroup);
                                                jSONObject3.put(C0174.m828(f849short, 1127, 8, 2252), strM595q);
                                                jSONObject3.put(C0183.m866(f849short, 1135, 7, 1884), strM595q2);
                                                jSONObject3.put(C0175.m834(f849short, 1142, 11, 439), strM596u);
                                                jSONArray.put(jSONObject3);
                                                break;
                                            case 2025:
                                                int i15 = 52611;
                                                while (true) {
                                                    i15 ^= 52628;
                                                    switch (i15) {
                                                        case 23:
                                                            i15 = 52642;
                                                        case 54:
                                                            break;
                                                    }
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                    int i16 = i + 1;
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
                                    i = i16;
                                    break;
                            }
                            jSONObject2.put(C0168.m805(f849short, 1153, 4, 1167), jSONArray);
                            int i18 = 53510;
                            while (true) {
                                i18 ^= 53527;
                                switch (i18) {
                                    case 17:
                                        i18 = 53541;
                                        break;
                                    case 50:
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
        String str2 = "ۣ۠ۧ";
        while (true) {
            switch (C0174.m829(str2)) {
                case 1747780:
                    super.init(context);
                    str2 = "ۥۧۥ";
                    break;
                case 1752707:
                    strM724Mo = C0152vp.m724Mo(str);
                    str2 = "ۧۢ۠";
                    break;
                case 1754469:
                    f201q = strM724Mo;
                    str2 = "ۤۤۨ";
                    break;
                default:
                    return;
            }
        }
    }

    public String playerContent(String str, String str2, List<String> list) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            String str3 = f201q + str2;
            Matcher matcher = Pattern.compile(C0172.m820(f849short, 1157, 15, 2700)).matcher(C0106ZJ.m484FN(str3, m83xC(str3)));
            boolean zFind = matcher.find();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = zFind ? 1709 : 1678;
                    case 204:
                        String strGroup = matcher.group(1);
                        jSONObject.put(C0182.m861(f849short, 1172, 5, 1916), 0);
                        jSONObject.put(C0178.m845(f849short, 1177, 3, 753), strGroup);
                        return jSONObject.toString();
                    case 239:
                        break;
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    public String searchContent(String str, boolean z) throws JSONException {
        try {
            JSONArray jSONArray = new JSONArray();
            try {
                String strM866 = C0183.m866(f849short, 1180, 47, 844);
                HashMap map = new HashMap();
                map.put(C0177.m841(f849short, 1227, 2, 799), str);
                C0106ZJ.m492i(C0106ZJ.m488QU(), strM866, map, m83xC(""), new AbstractC0099V3.Qe(this, jSONArray) { // from class: com.github.catvod.spider.Nmvod.1

                    /* renamed from: short, reason: not valid java name */
                    private static final short[] f850short = {3183, 3190, 3129, 3198, 3195, 3182, 3195, 3141, 3190, 3187, 3177, 3182, 3130, 3190, 3187, 740, 745, 758, 686, 756, 760, 756, 712, 741, 745, 743, 744, 756, 672, 755, 752, 737, 750, 686, 755, 724, 745, 756, 3276, 3265, 3294, 3206, 3288, 3265, 3275, 3208, 3273, 3208, 3265, 3269, 3279, 1327, 1326, 1343, 1887, 1874, 1869, 1813, 1867, 1874, 1880, 1819, 1882, 2931, 2921, 2942, 2941, 2743, 2734, 2725, 2718, 2728, 2725, 1569, 1592, 1587, 1544, 1593, 1590, 1594, 1586, 2450, 2443, 2432, 2491, 2452, 2445, 2439, 3265, 3288, 3283, 3304, 3269, 3282, 3290, 3286, 3269, 3292, 3268};

                    /* renamed from: QU */
                    final Nmvod f215QU;

                    /* renamed from: xC */
                    final JSONArray f216xC;

                    {
                        this.f215QU = this;
                        this.f216xC = jSONArray;
                        int iM807 = C0168.m807();
                        int i = 1616;
                        while (true) {
                            i ^= 1633;
                            switch (i) {
                                case 14:
                                case 49:
                                    i = iM807 <= 0 ? 1709 : 1678;
                                case 204:
                                    System.out.println(Integer.valueOf(C0171.m817("UPUmVxUEwRZ3Opa9WfbHXWn")));
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

                    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x009a. Please report as an issue. */
                    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x00aa. Please report as an issue. */
                    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001d. Please report as an issue. */
                    @Override // com.github.catvod.spider.merge.AbstractC0099V3
                    public String onResponse(String str2) throws JSONException {
                        C0116dX c0116dXM654b;
                        int i;
                        try {
                            c0116dXM654b = C0093Tt.m440q(str2).m654b(C0181.m856(f850short, 0, 15, 3098));
                            i = 0;
                        } catch (JSONException e) {
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
                            int size = c0116dXM654b.size();
                            int i3 = 1616;
                            while (true) {
                                i3 ^= 1633;
                                switch (i3) {
                                    case 14:
                                    case 49:
                                        i3 = i < size ? 1709 : 1678;
                                    case 204:
                                        C0127lK c0127lK = c0116dXM654b.get(i);
                                        String strM596u = c0127lK.m654b(C0182.m861(f850short, 15, 23, 640)).m596u();
                                        String strM595q = c0127lK.m654b(C0182.m861(f850short, 38, 13, 3240)).m595q(C0177.m841(f850short, 51, 3, 1372));
                                        Matcher matcher = this.f215QU.f206Mo.matcher(c0127lK.m654b(C0180.m851(f850short, 54, 9, 1851)).get(0).mo126QU(C0179.m849(f850short, 63, 4, 2843)));
                                        boolean zFind = matcher.find();
                                        int i4 = 1740;
                                        while (true) {
                                            i4 ^= 1757;
                                            switch (i4) {
                                                case 17:
                                                    i4 = !zFind ? 1833 : 1802;
                                                case 54:
                                                case 471:
                                                    String strGroup = matcher.group(1);
                                                    JSONObject jSONObject = new JSONObject();
                                                    jSONObject.put(C0180.m851(f850short, 67, 6, 2753), strGroup);
                                                    jSONObject.put(C0178.m845(f850short, 73, 8, 1623), strM596u);
                                                    jSONObject.put(C0182.m861(f850short, 81, 7, 2532), strM595q);
                                                    jSONObject.put(C0169.m809(f850short, 88, 11, 3255), "");
                                                    this.f216xC.put(jSONObject);
                                                    break;
                                                case 500:
                                                    int i5 = 1864;
                                                    while (true) {
                                                        i5 ^= 1881;
                                                        switch (i5) {
                                                            case 17:
                                                                i5 = 48674;
                                                            case 47483:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        i++;
                                        int i6 = 48767;
                                        while (true) {
                                            i6 ^= 48784;
                                            switch (i6) {
                                                case 14:
                                                    break;
                                                case 239:
                                                    i6 = 48798;
                                                    break;
                                            }
                                        }
                                        break;
                                    case 239:
                                        break;
                                }
                            }
                            return str2;
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
            jSONObject.put(C0169.m809(f849short, 1229, 4, 1417), jSONArray);
            return jSONObject.toString();
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    /* renamed from: xC */
    protected HashMap<String, String> m83xC(String str) {
        String str2 = "ۣۨۦ";
        HashMap<String, String> map = null;
        String strM861 = null;
        String strM820 = null;
        short[] sArr = null;
        while (true) {
            switch (C0174.m829(str2)) {
                case 56355:
                    str2 = "ۤۢۡ";
                    sArr = f849short;
                    break;
                case 1748680:
                    str2 = "ۥۢۦ";
                    sArr = f849short;
                    break;
                case 1748766:
                    map.put(strM861, strM820);
                    str2 = "ۤۤۡ";
                    break;
                case 1751587:
                    str2 = "ۡۤۡ";
                    strM820 = C0172.m820(sArr, 1243, 187, 831);
                    break;
                case 1751649:
                    return map;
                case 1752553:
                    str2 = "ۡۤ";
                    strM861 = C0182.m861(sArr, 1233, 10, 1481);
                    break;
                default:
                    map = new HashMap<>();
                    str2 = "ۡۡۨ";
                    break;
            }
        }
    }
}
