package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.C0165;
import com.github.catvod.parser.C0166;
import com.github.catvod.spider.merge.C0106ZJ;
import com.github.catvod.spider.merge.C0114dC;
import com.github.catvod.spider.merge.C0131mQ;
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
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class APPTT extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f812short = {2336, 2340, 2354, 2417, 2421, 2403, 2335, 2419, 2404, 2402, 2335, 2430, 2399, 2400, 2385, 2388, 2388, 2393, 2398, 2391, 3064, 3068, 3050, 1141, 1137, 1127, 1051, 1143, 1120, 1126, 1051, 1146, 1115, 1124, 1109, 1104, 1104, 1117, 1114, 1107, 1783, 1745, 1735, 1744, 1679, 1763, 1733, 1735, 1740, 1750, 1721, 1725, 1726, 1698, 1698, 1702, 1785, 1765, 1784, 1767, 1764, 1784, 1767, 1767, 708, 733, 726, 749, 704, 727, 735, 723, 704, 729, 705, 1356, 1365, 1374, 1381, 1354, 1363, 1369, 1788, 1765, 1774, 1749, 1764, 1771, 1767, 1775, 1665, 1688, 1683, 1704, 1694, 1683, 889, 864, 875, 848, 878, 893, 874, 878, 3017, 3032, 3038, 3036, 3084, 3095, 3084, 3097, 3092, 2540, 2537, 2547, 2548, 26760, 21909, 1556, 1563, 1558, 1540, 1540, 1090, 1095, 1091, 1095, 1114, 1873, 1884, 1877, 1856, 2355, 2351, 2347, 2360, 1562, 1545, 1566, 1562, 1745, 1756, 1747, 1754, 2541, 2556, 2533, 2466, 2556, 2532, 2556, 2467, 2554, 2493, 2466, 2554, 2531, 2536, 2483, 2552, 2549, 2556, 2537, 2481, 3165, 3096, 3095, 3098, 3080, 3080, 3142, 3073, 3147, 3142, 3145, 3136, 3098, 3259, 3324, 3311, 3320, 3324, 3232, 3035, 2948, 2968, 2972, 2959, 3008, 680, 766, 751, 745, 747, 691, 2977, 3045, 3070, 3002, 3061, 3049, 3043, 1581, 1639, 1634, 1638, 1634, 1663, 1590, 1593, 1599, 1581, 1663, 1636, 1632, 1646, 1637, 1590, 2570, 2564, 2584, 2471, 2466, 2487, 2466, 1726, 1703, 1708, 1687, 1713, 1709, 1705, 1722, 25096, 24769, 2954, 2963, 2968, 2979, 2960, 2973, 2962, 2971, 27837, 31858, 23235, 20534, 2672, 2657, 2663, 2661, 2659, 2671, 2677, 2670, 2676, 1412, 1432, 1429, 1421, 1425, 1414, 1451, 1437, 1434, 1426, 1435, 2535, 2535, 2535, 1091, 1114, 1105, 1130, 1110, 1114, 1115, 1089, 1104, 1115, 1089, 1568, 1593, 1586, 1545, 1586, 1599, 1572, 1587, 1589, 1570, 1593, 1572, 2716, 2693, 2702, 2741, 2699, 2697, 2718, 2693, 2712, 1117, 1092, 1103, 1140, 1113, 1102, 1094, 1098, 1113, 1088, 1112, 440, 417, 426, 401, 431, 444, 427, 431, 1239, 1230, 1221, 1278, 1240, 1220, 1216, 1235, 2687, 2662, 2669, 2646, 2681, 2656, 2666, 688, 681, 674, 665, 680, 679, 683, 675, 2525, 2500, 2511, 2548, 2498, 2511, 2747, 2750, 2731, 2750, 1542, 1559, 1550, 1609, 1559, 1551, 1559, 1608, 1553, 1622, 1609, 1553, 1544, 1539, 1608, 1539, 1538, 1555, 1550, 1547, 1547, 1539, 1542, 1555, 1542, 1624, 1553, 1544, 1539, 1592, 1550, 1539, 1626, 2867, 2913, 2938, 2942, 2928, 2939, 2856, 554, 548, 568, 1381, 1402, 1399, 1398, 1404, 1370, 1405, 1397, 1404, 2715, 2695, 2717, 2714, 2699, 2701, 2900, 2897, 2891, 2892, 883, 872, 879, 887, 2393, 2376, 2395, 2394, 2380, 2843, 2819, 2827, 2821, 2816, 2819, 2928, 1647, 639, 614, 621, 598, 633, 613, 616, 624, 598, 623, 635, 614, 612, 2307, 2330, 2321, 2346, 2309, 2329, 2324, 2316, 2346, 2304, 2311, 2329, 2225, 3004, 1255, 1168, 2437, 2858, 501, 951, 1635, 1556, 1405, 302, 270, 343, 257, 268, 261, 272, 298, 284, 273, 343, 335, 343, 324, 343, 345, 343, 257, 268, 261, 272, 298, 283, 276, 280, 272, 343, 335, 343, 29760, 24068, 343, 264, 345, 270, 343, 257, 268, 261, 272, 298, 284, 273, 343, 335, 343, 327, 343, 345, 343, 257, 268, 261, 272, 298, 283, 276, 280, 272, 343, 335, 343, 29760, -30541, 21266, 343, 264, 345, 270, 343, 257, 268, 261, 272, 298, 284, 273, 343, 335, 343, 321, 343, 345, 343, 257, 268, 261, 272, 298, 283, 276, 280, 272, 343, 335, 343, 32649, -31985, 343, 264, 345, 270, 343, 257, 268, 261, 272, 298, 284, 273, 343, 335, 343, 326, 343, 345, 343, 257, 268, 261, 272, 298, 283, 276, 280, 272, 343, 335, 343, 21469, 28254, 343, 264, 296, 3323, 3316, 3321, 3307, 3307, 1114, 1109, 1104, 1096, 1113, 1102, 1103, 2390, 2383, 2372, 2431, 2386, 2373, 2381, 2369, 2386, 2379, 2387, 2964, 2957, 2950, 3005, 2962, 2955, 2945, 2289, 2280, 2275, 2264, 2281, 2278, 2282, 2274, 1588, 1581, 1574, 1565, 1579, 1574, 2826, 2843, 2818, 2885, 2843, 2819, 2843, 2884, 2845, 2906, 2885, 2845, 2820, 2831, 2884, 2824, 2846, 2841, 2821, 2826, 2845, 2818, 2847, 2830, 2822, 2823, 2818, 2840, 2847, 2900, 2847, 2820, 2816, 2830, 2821, 2902, 456, 454, 474, 256, 261, 272, 261, 921, 925, 899, 922, 911, 920, 934, 899, 921, 926, 1381, 1376, 1402, 1405, 2218, 2186, 2969, 3001, 2884, 2823, 2905, 2847, 2898, 2696, 2713, 2698, 2699, 2717, 2971, 2972, 2946, 2878, 2941, 2912, 2852, 1391, 1341, 1318, 1314, 1324, 1319, 1396, 1328, 1381, 1397, 1323, 1613, 2679, 1095, 2518, 1558, 1559, 1541, 1646, 1659, 2820, 2845, 2838, 2861, 2816, 2839, 2847, 2835, 2816, 2841, 2817, 1631, 1606, 1613, 1654, 1625, 1600, 1610, 3009, 3032, 3027, 3048, 3033, 3030, 3034, 3026, 1391, 1398, 1405, 1350, 1392, 1405, 929, 932, 958, 953, 522, 539, 514, 581, 539, 515, 539, 580, 541, 602, 581, 541, 516, 527, 596, 539, 522, 524, 526, 598, 602, 589, 519, 514, 518, 514, 543, 598, 602, 603, 589, 540, 527, 598, 3108, 3190, 3181, 3177, 3175, 3180, 3135, 638, 624, 620, 1702, 1699, 1718, 1699};

    /* renamed from: q */
    private String f19q = "";

    /* renamed from: xC */
    private String f21xC = "";

    /* renamed from: QU */
    private String f17QU = "";

    /* renamed from: UJ */
    private String f18UJ = "";

    /* renamed from: u */
    private String f20u = "";

    /* renamed from: Mo */
    private String f16Mo = "MIIEpQIBAAKCAQEA5iLxDPp5E1Lr6TRSEWXHJ909jw63wXRG5U0kEsP1Ys+AgziF/G2vYplf28ZVFh2EROTu3fj6WSKhcWuzJ/tUpoNe0APCUabkFde+2B1PBviSNvSLLMli5mflXYVaXVkAq7eftIAxO6EHnZ1GNQt2F4HLjqHPtEWUEP+x0VszBdiHhcOl3ev2sKZzJKM3c8Qn+/aXXWIh9NxJwFztizfEWAaSLGHGDlLxetmaW1RmTLVpgtJOYzLoQrxPP/ghMOMstuM2VYP0fIKlXgG8Cmrs9AnrwlhwSl0Mc5+M1DRpF2JVxlxtoQuc+K4qQMtmBeA++9vWj7v78371DobHYcceLQIDAQABAoIBAQCOJcb+XTer1+wff1GxrUv2M5Fya4TU2R1xRNSjQqavAbw/UQpxgM5z+IhdF4Q2xMSOSVnBgaggpmNRy1Q9vd/refl2Qtwj0xHO7BPVKUVG6QJnL2VHpJyR9FqYCWZngjIH3sOmmgfO7QfnMt3KpemrW2CAGTJSBygN1+HdjpdVY91gsi1Q60ecwE74PYZ1Cg63hnqun2aKvQbX4Y88ZSmp9lczFdmmDPqJE0rTHWOBwsuZ3bQElG19cYHChwDJgDLPrP+9RbHOVJxPz0zSjPlPVhUl1OAkViY2E+CXGEKpQmmPOMytu3qbmIpwWiTtr/yl1b7AAEI/4QSuSEwGr0wBAoGBAPjNEtRyZMUI8n5usG/b7U+q6+HF0ezJCjbFIhF7pPrzOA66tFl2u98EySUZPAzG74bPQADELQZfTc7KxqywB3g+ErFnJ0f/DLNs87rLYlQwWQaL61z8RdSdoc2dPWGUgsiULct68pBfEQ/qR9alAhAWYbjOHGeHNLpNkD/uUUQ5AoGBAOzLnYEPF1RphlkiVyoH2T/ruNYKWGvzIk3xDuZlDCvaYnCQWvp7A4ogK9rO5M3kPZrhc3R2SvqqxiI6czRzFzm8AMnf9ZJB7EPfx5nSmgbgvDMmx7M4s2HaE3WvOAe0OEYNVetdssyBNT+EoCmJNb6lAa0ZqUeFXQVu66MUx7GVAoGBALzs1ECYQObRnXneSYIXSYO2cXm2gmrAWk4usWj/L88Tg1zD75EDtTNraeYO3GeDZH1EwQAT93CgS/AcUHLvFCz9TaqCfvSPurBAqm8MY7U0JVXwR6ALPGdv71636NVBNXJj+sZJrQlt9wHT0Aswr3lR1ZDEihMfOy3BGilBqVoZAoGBAIXe+3WqTXs4iW68/mBRvZ3oqz++64xkEYHVBaJ1gDMOrNaMlhLEFxUw6Po0O6C3J6j3SqmN8wfSIl/ZgaYmZvwJ8LwwtInyYRtiWVr6eH/o8B1PEFmfdbKdcqD25YtddO8NvQRqnZoGdk8psM6qtsrISLFPL6eymwtmUSuKpPcdAoGACxQPMb2wMxhexC8efCmDx85HY5yDBG3plejXLJ4pCBRJcUcCdWQnASsJracm05D09FZZcZjOaE13lHoeNj1zMipMnuHgn2vmMBGjeztSqIErnm1NzfRubByrpW+UfIdkLxck+Nga4Nby5I9r+OvKvRgqfJQbx9xPlVFZ5yhpEZE=";

    public APPTT() {
        int iM833 = C0175.m833();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = iM833 <= 0 ? 1709 : 1678;
                case 204:
                    System.out.println(Double.decode(C0172.m823("78Am2K656VIFoLrvSxs4v")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public static String decrypt(String str, String str2, String str3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            byte[] bytes = str2.getBytes();
            byte[] bytes2 = str3.getBytes();
            SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, C0168.m805(f812short, 0, 3, 2401));
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bytes2);
            byte[] bArrM678q = C0131mQ.m678q(str);
            Cipher cipher = Cipher.getInstance(C0176.m836(f812short, 3, 17, 2352));
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(bArrM678q));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String encrypt(String str, String str2, String str3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            byte[] bytes = str2.getBytes();
            byte[] bytes2 = str3.getBytes();
            SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, C0181.m856(f812short, 20, 3, 3001));
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bytes2);
            Cipher cipher = Cipher.getInstance(C0181.m856(f812short, 23, 17, 1076));
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return C0131mQ.m679xC(cipher.doFinal(str.getBytes()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: q */
    private HashMap<String, String> m4q(String str) {
        String str2 = "ۨۡ۟";
        String strM845 = null;
        String strM866 = null;
        HashMap<String, String> map = null;
        short[] sArr = null;
        while (true) {
            switch (C0174.m829(str2)) {
                case 56383:
                    str2 = "ۣ۠ۦ";
                    strM866 = C0183.m866(sArr, 50, 14, 1750);
                    break;
                case 1747779:
                    map.put(strM845, strM866);
                    str2 = "ۦۣ۠";
                    break;
                case 1753539:
                    return map;
                case 1754384:
                    str2 = "ۢۡ";
                    sArr = f812short;
                    break;
                case 1754657:
                    strM845 = C0178.m845(sArr, 40, 10, 1698);
                    str2 = "ۧ۟ۨ";
                    break;
                case 1755398:
                    str2 = "ۨۧۡ";
                    map = new HashMap<>();
                    break;
                default:
                    str2 = "ۧۨۢ";
                    sArr = f812short;
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:103:0x0467. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:66:0x0374. Please report as an issue. */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strM798 = C0165.m798(f812short, 64, 11, 690);
        String strM849 = C0179.m849(f812short, 75, 7, 1338);
        String strM841 = C0177.m841(f812short, 82, 8, 1674);
        String strM809 = C0169.m809(f812short, 90, 6, 1783);
        String strM828 = C0174.m828(f812short, 96, 8, 783);
        String strM845 = C0178.m845(f812short, 104, 4, 3001);
        String strM8092 = C0169.m809(f812short, 108, 5, 3192);
        String strM836 = C0176.m836(f812short, 113, 4, 2432);
        String strM816 = C0171.m816(f812short, 117, 2, 2842);
        String strM801 = C0166.m801(f812short, 119, 5, 1655);
        String strM861 = C0182.m861(f812short, 124, 5, 1070);
        String strM851 = C0180.m851(f812short, 129, 4, 1829);
        String strM856 = C0181.m856(f812short, 133, 4, 2378);
        String strM8562 = C0181.m856(f812short, 137, 4, 1659);
        String strM814 = C0170.m814(f812short, 141, 4, 1725);
        try {
            JSONObject jSONObject = new JSONObject();
            String str3 = this.f19q + C0172.m820(f812short, 145, 20, 2444) + str;
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = map == null ? 1709 : 1678;
                    case 204:
                        map = new HashMap<>();
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = 1771;
                                    continue;
                                case 54:
                                    break;
                                default:
                                    continue;
                            }
                        }
                    case 239:
                        break;
                }
            }
            boolean zContainsKey = map.containsKey(strM801);
            int i3 = 1864;
            while (true) {
                i3 ^= 1881;
                switch (i3) {
                    case 17:
                        i3 = !zContainsKey ? 48736 : 48705;
                    case 47384:
                        break;
                    case 47417:
                        map.put(strM801, "");
                        break;
                    case 47483:
                }
            }
            boolean zContainsKey2 = map.containsKey(strM814);
            int i4 = 48767;
            while (true) {
                i4 ^= 48784;
                switch (i4) {
                    case 14:
                        break;
                    case 45:
                        break;
                    case 76:
                        map.put(strM814, "");
                        break;
                    case 239:
                        if (zContainsKey2) {
                            break;
                        } else {
                            i4 = 48860;
                        }
                    default:
                        continue;
                }
                i4 = 48829;
            }
            boolean zContainsKey3 = map.containsKey(strM8562);
            int i5 = 48891;
            while (true) {
                i5 ^= 48908;
                switch (i5) {
                    case 22:
                    case 53:
                        break;
                    case 503:
                        i5 = !zContainsKey3 ? 49635 : 48953;
                    case 32495:
                        map.put(strM8562, "");
                        break;
                }
            }
            boolean zContainsKey4 = map.containsKey(strM856);
            int i6 = 49666;
            while (true) {
                i6 ^= 49683;
                switch (i6) {
                    case 17:
                        i6 = !zContainsKey4 ? 49759 : 49728;
                    case 50:
                    case 76:
                        map.put(strM856, "");
                        break;
                    case 83:
                        break;
                }
            }
            boolean zContainsKey5 = map.containsKey(strM851);
            int i7 = 49790;
            while (true) {
                i7 ^= 49807;
                switch (i7) {
                    case 18:
                    case 51:
                        break;
                    case 84:
                        map.put(strM851, "");
                        break;
                    case 241:
                        i7 = !zContainsKey5 ? 49883 : 49852;
                }
            }
            boolean zContainsKey6 = map.containsKey(strM816);
            int i8 = 49914;
            while (true) {
                i8 ^= 49931;
                switch (i8) {
                    case 497:
                        i8 = !zContainsKey6 ? 50658 : 50627;
                    case 1711:
                    case 1736:
                        break;
                    case 1769:
                        map.put(strM816, "");
                        break;
                }
            }
            String str4 = (((((str3 + C0178.m845(f812short, 165, 7, 3195) + map.get(strM851)) + C0181.m856(f812short, 172, 6, 3111) + map.get(strM814)) + C0180.m851(f812short, 178, 6, 3229) + map.get(strM8562)) + C0165.m798(f812short, 184, 6, 3069) + map.get(strM856)) + C0171.m816(f812short, 190, 6, 654) + str2 + C0179.m849(f812short, 196, 7, 2951)) + C0172.m820(f812short, 203, 16, 1547) + getToken2();
            TreeMap treeMap = new TreeMap();
            String strM482B = C0106ZJ.m482B(str4, m4q(str4), treeMap);
            List list = (List) treeMap.get(C0165.m798(f812short, 219, 3, 2657));
            int i9 = 0;
            String strM577q = C0114dC.m577q((String) list.get(0), this.f16Mo);
            JSONObject jSONObject2 = new JSONObject(decrypt(new JSONObject(strM482B).optString(C0171.m816(f812short, 222, 4, 2499)), strM577q.substring(16, 48), strM577q.substring(0, 16)));
            JSONArray jSONArray = jSONObject2.getJSONArray(strM836);
            JSONArray jSONArray2 = new JSONArray();
            while (true) {
                int length = jSONArray.length();
                int i10 = 50689;
                while (true) {
                    i10 ^= 50706;
                    switch (i10) {
                        case 19:
                            i10 = i9 < length ? 50782 : 50751;
                        case 45:
                            break;
                        case 50:
                        case 76:
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
                            JSONObject jSONObject3 = new JSONObject();
                            int i11 = Integer.parseInt(jSONObjectOptJSONObject.optString(C0174.m828(f812short, 226, 8, 1736)));
                            int i12 = 50813;
                            while (true) {
                                i12 ^= 50830;
                                switch (i12) {
                                    case 18:
                                    case 53:
                                        break;
                                    case 243:
                                        i12 = i11 > 2022 ? 51557 : 50875;
                                    case 4075:
                                        boolean zContains = jSONObjectOptJSONObject.optString(strM828).contains(C0180.m851(f812short, 234, 2, 2029));
                                        int i13 = 51588;
                                        while (true) {
                                            i13 ^= 51605;
                                            switch (i13) {
                                                case 17:
                                                    i13 = !zContains ? 51681 : 51650;
                                                case 54:
                                                case 87:
                                                    break;
                                                case 116:
                                                    boolean zContains2 = jSONObjectOptJSONObject.optString(C0177.m841(f812short, 236, 8, 3068)).contains(C0171.m816(f812short, 244, 2, 2967));
                                                    int i14 = 51712;
                                                    while (true) {
                                                        i14 ^= 51729;
                                                        switch (i14) {
                                                            case 14:
                                                            case 17:
                                                                i14 = !zContains2 ? 51805 : 51774;
                                                            case 47:
                                                                break;
                                                            case 76:
                                                                boolean zContains3 = jSONObjectOptJSONObject.optString(strM828).contains(C0179.m849(f812short, 246, 2, 2997));
                                                                int i15 = 51836;
                                                                while (true) {
                                                                    i15 ^= 51853;
                                                                    switch (i15) {
                                                                        case 241:
                                                                            i15 = zContains3 ? 52580 : 52549;
                                                                        case 1963:
                                                                        case 1992:
                                                                            jSONObject3.put(strM809, jSONObjectOptJSONObject.optString(strM809));
                                                                            jSONObject3.put(strM841, jSONObjectOptJSONObject.optString(strM841));
                                                                            jSONObject3.put(strM849, jSONObjectOptJSONObject.optString(strM849));
                                                                            jSONObject3.put(strM798, jSONObjectOptJSONObject.optString(strM798));
                                                                            jSONArray2.put(jSONObject3);
                                                                            break;
                                                                        case 2025:
                                                                            int i16 = 52611;
                                                                            while (true) {
                                                                                i16 ^= 52628;
                                                                                switch (i16) {
                                                                                    case 23:
                                                                                        i16 = 52642;
                                                                                    case 54:
                                                                                        break;
                                                                                }
                                                                                break;
                                                                            }
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                            int i17 = i9 + 1;
                            int i18 = 52735;
                            while (true) {
                                i18 ^= 52752;
                                switch (i18) {
                                    case 14:
                                        break;
                                    case 1007:
                                        i18 = 52766;
                                        break;
                                }
                            }
                            i9 = i17;
                            break;
                    }
                    int i19 = jSONObject2.getInt(strM8092);
                    int i20 = i19 / jSONObject2.getInt(strM861);
                    jSONObject.put(strM845, jSONObject2.getInt(strM845));
                    jSONObject.put(C0166.m801(f812short, 248, 9, 2560), i20);
                    jSONObject.put(strM861, jSONObject2.getInt(strM861));
                    jSONObject.put(strM8092, i19);
                    jSONObject.put(strM836, jSONArray2);
                    return jSONObject.toString();
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x02a1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:43:0x030f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0234. Please report as an issue. */
    public String detailContent(List<String> list) {
        String strM820 = C0172.m820(f812short, 257, 11, 1524);
        String strM814 = C0170.m814(f812short, 268, 3, 2499);
        String strM8142 = C0170.m814(f812short, 271, 11, 1077);
        String strM8202 = C0172.m820(f812short, 282, 12, 1622);
        String strM816 = C0171.m816(f812short, 294, 9, 2794);
        String strM8162 = C0171.m816(f812short, 303, 11, 1067);
        String strM845 = C0178.m845(f812short, 314, 8, 462);
        String strM856 = C0181.m856(f812short, 322, 8, 1185);
        String strM861 = C0182.m861(f812short, 330, 7, 2569);
        String strM836 = C0176.m836(f812short, 337, 8, 710);
        String strM8143 = C0170.m814(f812short, 345, 6, 2475);
        String strM841 = C0177.m841(f812short, 351, 4, 2783);
        try {
            Init.m46lj();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f19q);
            sb.append(C0166.m801(f812short, 355, 33, 1639));
            sb.append(list.get(0));
            sb.append(C0182.m861(f812short, 388, 7, 2837));
            sb.append(getToken2());
            String string = sb.toString();
            System.out.println(string);
            TreeMap treeMap = new TreeMap();
            String strM482B = C0106ZJ.m482B(string, m4q(string), treeMap);
            String strM577q = C0114dC.m577q((String) ((List) treeMap.get(C0177.m841(f812short, 395, 3, 577))).get(0), this.f16Mo);
            String strSubstring = strM577q.substring(0, 16);
            String strSubstring2 = strM577q.substring(16, 48);
            JSONObject jSONObjectOptJSONObject = new JSONObject(decrypt(new JSONObject(strM482B).optString(strM841), strSubstring2, strSubstring)).optJSONObject(C0165.m798(f812short, 398, 9, 1299));
            JSONObject jSONObject3 = new JSONObject(decrypt(new JSONObject(strM482B).optString(strM841), strSubstring2, strSubstring));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            jSONObject.put(strM8143, jSONObjectOptJSONObject.optString(strM8143));
            jSONObject.put(strM836, jSONObjectOptJSONObject.optString(strM836));
            jSONObject.put(strM861, jSONObjectOptJSONObject.optString(strM861));
            jSONObject.put(strM856, jSONObjectOptJSONObject.optString(strM856));
            jSONObject.put(strM845, jSONObjectOptJSONObject.optString(strM845));
            jSONObject.put(strM8162, jSONObjectOptJSONObject.optString(strM8162));
            jSONObject.put(strM816, jSONObjectOptJSONObject.optString(strM816));
            jSONObject.put(strM8202, jSONObjectOptJSONObject.optString(strM8202));
            jSONObject.put(strM8142, jSONObjectOptJSONObject.optString(strM8142));
            JSONArray jSONArray = jSONObject3.getJSONArray(C0174.m828(f812short, 407, 6, 2792));
            int i = 0;
            while (true) {
                int length = jSONArray.length();
                String strM8163 = C0171.m816(f812short, 413, 4, 2872);
                int i2 = 1616;
                while (true) {
                    i2 ^= 1633;
                    switch (i2) {
                        case 14:
                        case 49:
                            i2 = i < length ? 1709 : 1678;
                        case 204:
                            JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i);
                            String strOptString = jSONObjectOptJSONObject2.optJSONObject(strM820).optString(C0169.m809(f812short, 417, 4, 768));
                            String strOptString2 = jSONObjectOptJSONObject2.optJSONObject(strM820).optString(C0174.m828(f812short, 421, 5, 2345));
                            boolean zIsEmpty = strOptString2.isEmpty();
                            int i3 = 1740;
                            while (true) {
                                i3 ^= 1757;
                                switch (i3) {
                                    case 17:
                                        i3 = zIsEmpty ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case 500:
                                        strOptString2 = C0165.m798(f812short, 426, 6, 2922);
                                        break;
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            JSONArray jSONArray2 = new JSONArray(jSONObjectOptJSONObject2.optString(strM8163));
                            int i4 = 0;
                            while (true) {
                                int length2 = jSONArray2.length();
                                int i5 = 1864;
                                while (true) {
                                    i5 ^= 1881;
                                    switch (i5) {
                                        case 17:
                                            i5 = i4 < length2 ? 48736 : 48705;
                                        case 47384:
                                            break;
                                        case 47417:
                                            arrayList3.add(jSONArray2.get(i4).toString() + C0176.m836(f812short, 432, 1, 2828) + strOptString2);
                                            int i6 = i4 + 1;
                                            int i7 = 48767;
                                            while (true) {
                                                i7 ^= 48784;
                                                switch (i7) {
                                                    case 14:
                                                        break;
                                                    case 239:
                                                        i7 = 48798;
                                                        break;
                                                }
                                            }
                                            i4 = i6;
                                            break;
                                        case 47483:
                                    }
                                    boolean zIsEmpty2 = arrayList3.isEmpty();
                                    int i8 = 48891;
                                    while (true) {
                                        i8 ^= 48908;
                                        switch (i8) {
                                            case 22:
                                            case 53:
                                                arrayList.add(strOptString);
                                                arrayList2.add(TextUtils.join(C0171.m816(f812short, 433, 1, 1612), arrayList3));
                                                break;
                                            case 503:
                                                i8 = zIsEmpty2 ? 49635 : 48953;
                                            case 32495:
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
                                    int i10 = i + 1;
                                    int i11 = 49790;
                                    while (true) {
                                        i11 ^= 49807;
                                        switch (i11) {
                                            case 18:
                                                break;
                                            case 241:
                                                i11 = 49821;
                                                break;
                                        }
                                    }
                                    i = i10;
                                }
                            }
                            break;
                        case 239:
                            break;
                    }
                    String strJoin = TextUtils.join(strM814, arrayList);
                    String strJoin2 = TextUtils.join(strM814, arrayList2);
                    jSONObject.put(C0182.m861(f812short, 434, 13, 521), strJoin);
                    jSONObject.put(C0179.m849(f812short, 447, 12, 2421), strJoin2);
                    JSONArray jSONArray3 = new JSONArray();
                    jSONArray3.put(jSONObject);
                    jSONObject2.put(strM8163, jSONArray3);
                    return jSONObject2.toString();
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }

    public String getToken2() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        long jCurrentTimeMillis = 0;
        String str = "ۧۥۡ";
        String strM814 = null;
        String strReplaceAll = null;
        String strM866 = null;
        String strM836 = null;
        short[] sArr = null;
        while (true) {
            switch (C0174.m829(str)) {
                case 1746749:
                    str = "ۤۧۡ";
                    strM866 = C0168.m805(sArr, 463, 1, 2472);
                    break;
                case 1746908:
                    return strM836;
                case 1747741:
                    str = "ۧ۠ۦ";
                    strM836 = C0176.m836(sArr, 460, 1, 3043);
                    break;
                case 1749671:
                    str = "ۦۣۣ";
                    strReplaceAll = this.f17QU;
                    break;
                case 1749822:
                    str = "۠ۦ۟";
                    strM866 = String.valueOf(jCurrentTimeMillis);
                    break;
                case 1749854:
                    str = "ۤۧۨ";
                    sArr = f812short;
                    break;
                case 1750599:
                    str = "۟ۡ۟";
                    sArr = f812short;
                    break;
                case 1751742:
                    str = "۟ۦۣ";
                    strM836 = strReplaceAll.replaceAll(strM814, strM866);
                    break;
                case 1751749:
                    str = "ۣۧۤ";
                    strM866 = C0183.m866(sArr, 459, 1, 2206);
                    break;
                case 1752484:
                    strM814 = C0170.m814(sArr, 461, 2, 1211);
                    str = "ۣۡۥ";
                    break;
                case 1753542:
                    strM814 = encrypt(strM866, strM836, strReplaceAll);
                    str = "ۢۨۤ";
                    break;
                case 1754413:
                    str = "ۨۥ۟";
                    strReplaceAll = strM814.replaceAll(strM866, strM836);
                    break;
                case 1754504:
                    str = "۠ۢ۟";
                    sArr = f812short;
                    break;
                case 1754563:
                    jCurrentTimeMillis = System.currentTimeMillis();
                    str = "ۣۢۧ";
                    break;
                case 1755522:
                    str = "ۥ۠۟";
                    sArr = f812short;
                    break;
                default:
                    str = "ۢۢۧ";
                    strM836 = this.f21xC;
                    break;
            }
        }
    }

    public String getToken3(String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        long jCurrentTimeMillis = 0;
        String str2 = "ۣ۠ۤ";
        StringBuilder sb = null;
        String strReplaceAll = null;
        String strM856 = null;
        String strM866 = null;
        short[] sArr = null;
        while (true) {
            switch (C0174.m829(str2)) {
                case 56539:
                    str2 = "ۦ۟ۢ";
                    strM856 = C0181.m856(sArr, 467, 2, 1599);
                    break;
                case 1746878:
                    str2 = "ۢۥۧ";
                    strM866 = C0168.m805(sArr, 464, 1, 2816);
                    break;
                case 1746882:
                    str2 = "ۤ۟۟";
                    strM856 = encrypt(strM866, str, strReplaceAll);
                    break;
                case 1746971:
                    str2 = "۟ۥۤ";
                    sArr = f812short;
                    break;
                case 1747812:
                    str2 = "ۣۤۤ";
                    strM866 = C0183.m866(sArr, 469, 1, 1360);
                    break;
                case 1748830:
                    return str;
                case 1748859:
                    str = C0174.m828(sArr, 466, 1, 1000);
                    str2 = "ۧۦۣ";
                    break;
                case 1749604:
                    str2 = "ۥۣۡ";
                    strM866 = sb.toString();
                    break;
                case 1749764:
                    sb.append(strM866);
                    str2 = "ۧۤۧ";
                    break;
                case 1750536:
                    str2 = "ۡۧۡ";
                    sArr = f812short;
                    break;
                case 1750567:
                    jCurrentTimeMillis = System.currentTimeMillis();
                    str2 = "ۡۦ۟";
                    break;
                case 1750752:
                    sb.append(jCurrentTimeMillis);
                    str2 = "۟ۨۤ";
                    break;
                case 1751492:
                    str2 = "ۧۧۡ";
                    sArr = f812short;
                    break;
                case 1751554:
                    str2 = "ۧۢ";
                    sArr = f812short;
                    break;
                case 1751586:
                    str2 = "۟ۥۨ";
                    strReplaceAll = this.f20u;
                    break;
                case 1751651:
                    str = strReplaceAll.replaceAll(strM856, strM866);
                    str2 = "ۡۦۣ";
                    break;
                case 1752579:
                    str = this.f18UJ;
                    str2 = "ۤۢ۠";
                    break;
                case 1753417:
                    str2 = "۠ۤۨ";
                    sArr = f812short;
                    break;
                case 1754538:
                    sb.append(str);
                    str2 = "ۢ۠ۢ";
                    break;
                case 1754596:
                    str2 = "ۤۡ۟";
                    strReplaceAll = strM856.replaceAll(strM866, str);
                    break;
                case 1754625:
                    str2 = "ۣ۟ۤ";
                    strM866 = C0178.m845(sArr, 465, 1, 474);
                    break;
                default:
                    sb = new StringBuilder();
                    str2 = "ۣۦۣ";
                    break;
            }
        }
    }

    public String homeContent(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0177.m841(f812short, 604, 5, 3224), new JSONArray(C0182.m861(f812short, 470, 134, 373)));
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
                        jSONObject.put(C0169.m809(f812short, 609, 7, 1084), new JSONObject("{\"1\":[{\"key\":\"class\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"警匪\",\"v\":\"警匪\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动画\",\"v\":\"动画\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"枪战\",\"v\":\"枪战\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"青春\",\"v\":\"青春\"},{\"n\":\"文艺\",\"v\":\"文艺\"},{\"n\":\"微电影\",\"v\":\"微电影\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"农村\",\"v\":\"农村\"},{\"n\":\"儿童\",\"v\":\"儿童\"},{\"n\":\"网络电影\",\"v\":\"网络电影\"},{\"n\":\"情色\",\"v\":\"情色\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"key\":\"lang\",\"name\":\"语言\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国语\",\"v\":\"国语\"},{\"n\":\"英语\",\"v\":\"英语\"},{\"n\":\"粤语\",\"v\":\"粤语\"},{\"n\":\"闽南语\",\"v\":\"闽南语\"},{\"n\":\"韩语\",\"v\":\"韩语\"},{\"n\":\"日语\",\"v\":\"日语\"},{\"n\":\"法语\",\"v\":\"法语\"},{\"n\":\"德语\",\"v\":\"德语\"},{\"n\":\"其它\",\"v\":\"其它\"}]},{\"key\":\"排序\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"2\":[{\"key\":\"class\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"青春偶像\",\"v\":\"青春偶像\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"家庭\",\"v\":\"家庭\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"乡村\",\"v\":\"乡村\"},{\"n\":\"情景\",\"v\":\"情景\"},{\"n\":\"商战\",\"v\":\"商战\"},{\"n\":\"网剧\",\"v\":\"网剧\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"key\":\"lang\",\"name\":\"语言\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国语\",\"v\":\"国语\"},{\"n\":\"英语\",\"v\":\"英语\"},{\"n\":\"粤语\",\"v\":\"粤语\"},{\"n\":\"闽南语\",\"v\":\"闽南语\"},{\"n\":\"韩语\",\"v\":\"韩语\"},{\"n\":\"日语\",\"v\":\"日语\"},{\"n\":\"其它\",\"v\":\"其它\"}]},{\"key\":\"排序\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"4\":[{\"key\":\"class\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"选秀\",\"v\":\"选秀\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"访谈\",\"v\":\"访谈\"},{\"n\":\"播报\",\"v\":\"播报\"},{\"n\":\"旅游\",\"v\":\"旅游\"},{\"n\":\"音乐\",\"v\":\"音乐\"},{\"n\":\"美食\",\"v\":\"美食\"},{\"n\":\"纪实\",\"v\":\"纪实\"},{\"n\":\"曲艺\",\"v\":\"曲艺\"},{\"n\":\"生活\",\"v\":\"生活\"},{\"n\":\"游戏互动\",\"v\":\"游戏互动\"},{\"n\":\"财经\",\"v\":\"财经\"},{\"n\":\"求职\",\"v\":\"求职\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"港台\",\"v\":\"港台\"},{\"n\":\"日韩\",\"v\":\"日韩\"},{\"n\":\"欧美\",\"v\":\"欧美\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"key\":\"lang\",\"name\":\"语言\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国语\",\"v\":\"国语\"},{\"n\":\"英语\",\"v\":\"英语\"},{\"n\":\"粤语\",\"v\":\"粤语\"},{\"n\":\"闽南语\",\"v\":\"闽南语\"},{\"n\":\"韩语\",\"v\":\"韩语\"},{\"n\":\"日语\",\"v\":\"日语\"},{\"n\":\"其它\",\"v\":\"其它\"}]},{\"key\":\"排序\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"3\":[{\"key\":\"class\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"热血\",\"v\":\"热血\"},{\"n\":\"推理\",\"v\":\"推理\"},{\"n\":\"搞笑\",\"v\":\"搞笑\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"萝莉\",\"v\":\"萝莉\"},{\"n\":\"校园\",\"v\":\"校园\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"机战\",\"v\":\"机战\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"少年\",\"v\":\"少年\"},{\"n\":\"少女\",\"v\":\"少女\"},{\"n\":\"社会\",\"v\":\"社会\"},{\"n\":\"原创\",\"v\":\"原创\"},{\"n\":\"亲子\",\"v\":\"亲子\"},{\"n\":\"益智\",\"v\":\"益智\"},{\"n\":\"励志\",\"v\":\"励志\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国产\",\"v\":\"国产\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"欧美\",\"v\":\"欧美\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"key\":\"lang\",\"name\":\"语言\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国语\",\"v\":\"国语\"},{\"n\":\"英语\",\"v\":\"英语\"},{\"n\":\"粤语\",\"v\":\"粤语\"},{\"n\":\"闽南语\",\"v\":\"闽南语\"},{\"n\":\"韩语\",\"v\":\"韩语\"},{\"n\":\"日语\",\"v\":\"日语\"},{\"n\":\"其它\",\"v\":\"其它\"}]},{\"key\":\"排序\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}]}"));
                        break;
                    case 239:
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x00cc. Please report as an issue. */
    public String homeVideoContent() {
        int i = 0;
        String strM798 = C0165.m798(f812short, 616, 11, 2336);
        String strM820 = C0172.m820(f812short, 627, 7, 3042);
        String strM7982 = C0165.m798(f812short, 634, 8, 2183);
        String strM834 = C0175.m834(f812short, 642, 6, 1602);
        try {
            String str = this.f19q + C0170.m814(f812short, 648, 36, 2923) + getToken2();
            System.out.println(str);
            TreeMap treeMap = new TreeMap();
            String strM482B = C0106ZJ.m482B(str, m4q(str), treeMap);
            String strM577q = C0114dC.m577q((String) ((List) treeMap.get(C0177.m841(f812short, 684, 3, 419))).get(0), this.f16Mo);
            String strSubstring = strM577q.substring(0, 16);
            String strSubstring2 = strM577q.substring(16, 48);
            JSONObject jSONObject = new JSONObject(strM482B);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONObject(decrypt(jSONObject.optString(C0168.m805(f812short, 687, 4, 356)), strSubstring2, strSubstring)).getJSONArray(C0172.m820(f812short, 691, 10, 1002));
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
                            JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(strM834, jSONObjectOptJSONObject.optString(strM834));
                            jSONObject2.put(strM7982, jSONObjectOptJSONObject.optString(strM7982));
                            jSONObject2.put(strM820, jSONObjectOptJSONObject.optString(strM820));
                            jSONObject2.put(strM798, jSONObjectOptJSONObject.optString(strM798));
                            jSONArray.put(jSONObject2);
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
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(C0181.m856(f812short, 701, 4, 1289), jSONArray);
                    return jSONObject3.toString();
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context, str);
        String strM724Mo = C0152vp.m724Mo(str);
        String strM828 = C0174.m828(f812short, 705, 2, 2294);
        this.f18UJ = strM724Mo.split(strM828)[4];
        this.f20u = strM724Mo.split(strM828)[3];
        this.f19q = strM724Mo.split(strM828)[2];
        this.f21xC = strM724Mo.split(strM828)[1];
        this.f17QU = strM724Mo.split(strM828)[0];
        int iM807 = C0168.m807();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = iM807 <= 0 ? 1709 : 1678;
                case 204:
                    System.out.println(Float.parseFloat(C0178.m846("qBpedbC5GNcgyTX6K")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            String[] strArrSplit = str2.split(C0166.m801(f812short, 707, 2, 3013));
            String str3 = strArrSplit[0];
            String str4 = strArrSplit[1];
            boolean zContains = str3.contains(C0175.m834(f812short, 709, 5, 2922));
            String strM801 = C0166.m801(f812short, 714, 5, 2808);
            String strM816 = C0171.m816(f812short, 719, 3, 3054);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = !zContains ? 1709 : 1678;
                    case 204:
                        boolean zContains2 = str3.contains(C0175.m834(f812short, 722, 4, 2832));
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = zContains2 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    String str5 = str4 + str3 + C0178.m845(f812short, 726, 7, 1353) + getToken2() + C0168.m805(f812short, 733, 4, 1302) + getToken3(str3);
                                    String strOptString = new JSONObject(C0152vp.m731se(C0106ZJ.m484FN(str5, m4q(str5)).replace(C0176.m836(f812short, 737, 1, 1632), C0166.m801(f812short, 738, 1, 2652)).replace(C0179.m849(f812short, 739, 1, 1048), C0176.m836(f812short, 740, 1, 2553)), C0179.m849(f812short, 741, 5, 1603), this.f21xC, this.f17QU)).optString(strM816);
                                    jSONObject.put(strM801, 0);
                                    jSONObject.put(strM816, strOptString);
                                    return jSONObject.toString();
                                case 500:
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
                        break;
                    case 239:
                        break;
                }
            }
            jSONObject.put(strM801, 0);
            jSONObject.put(strM816, str3);
            return jSONObject.toString();
        } catch (Throwable th) {
            System.out.println(th);
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x00e8. Please report as an issue. */
    public String searchContent(String str, boolean z) {
        String strM820 = C0172.m820(f812short, 746, 11, 2930);
        String strM8202 = C0172.m820(f812short, 757, 7, 1577);
        String strM801 = C0166.m801(f812short, 764, 8, 2999);
        String strM856 = C0181.m856(f812short, 772, 6, 1305);
        String strM836 = C0176.m836(f812short, 778, 4, 973);
        try {
            JSONObject jSONObject = new JSONObject();
            String str2 = this.f19q + C0169.m809(f812short, 782, 34, 619) + URLEncoder.encode(str) + C0166.m801(f812short, 816, 7, 3074) + getToken2();
            TreeMap treeMap = new TreeMap();
            String strM482B = C0106ZJ.m482B(str2, m4q(str2), treeMap);
            List list = (List) treeMap.get(C0178.m845(f812short, 823, 3, 533));
            int i = 0;
            String strM577q = C0114dC.m577q((String) list.get(0), this.f16Mo);
            String strSubstring = strM577q.substring(0, 16);
            String strSubstring2 = strM577q.substring(16, 48);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONObject(decrypt(new JSONObject(strM482B).optString(C0177.m841(f812short, 826, 4, 1730)), strSubstring2, strSubstring)).getJSONArray(strM836);
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
                            JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(strM856, jSONObjectOptJSONObject.optString(strM856));
                            jSONObject2.put(strM801, jSONObjectOptJSONObject.optString(strM801));
                            jSONObject2.put(strM8202, jSONObjectOptJSONObject.optString(strM8202));
                            jSONObject2.put(strM820, jSONObjectOptJSONObject.optString(strM820));
                            jSONArray.put(jSONObject2);
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
                    jSONObject.put(strM836, jSONArray);
                    return jSONObject.toString();
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }
}
