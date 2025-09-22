package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.C0165;
import com.github.catvod.parser.C0166;
import com.github.catvod.spider.merge.AbstractC0099V3;
import com.github.catvod.spider.merge.C0106ZJ;
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
import java.io.PrintStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import okhttp3.Call;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class Hudie extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f825short = {2901, 2899, 2885, 2898, 2829, 2881, 2887, 2885, 2894, 2900, 3192, 3196, 3199, 3171, 3171, 3175, 3128, 3107, 3129, 3118, 3129, 3110, 977, 968, 963, 1016, 981, 962, 970, 966, 981, 972, 980, 506, 483, 488, 467, 508, 485, 495, 953, 928, 939, 912, 929, 942, 930, 938, 1073, 1064, 1059, 1048, 1070, 1059, 1579, 1582, 1588, 1587, 2605, 2659, 2674, 2667, 2604, 2674, 2666, 2674, 2605, 2676, 2669, 2662, 2605, 2670, 2667, 2673, 2678, 2621, 2673, 2678, 2659, 2678, 2663, 2623, 2113, 2052, 2059, 2054, 2068, 2068, 2138, 2114, 2082, 2130, 2114, 2143, 2130, 2114, 2086, 2143, 2114, 2082, 2142, 2114, 2143, 2132, 2114, 2086, 2143, 2113, 2054, 2069, 2050, 2054, 2138, 2114, 2082, 2130, 2114, 2143, 2130, 2114, 2086, 2143, 2114, 2082, 2142, 2114, 2143, 2132, 2114, 2086, 2143, 2113, 2078, 2050, 2054, 2069, 2138, 2114, 2082, 2130, 2114, 2143, 2130, 2114, 2086, 2143, 2114, 2082, 2142, 2114, 2143, 2132, 2114, 2086, 2143, 2113, 2065, 2050, 2069, 2068, 2062, 2056, 2057, 2138, 2114, 2082, 2130, 2114, 2143, 2130, 2114, 2086, 2143, 2114, 2082, 2142, 2114, 2143, 2132, 2114, 2086, 2143, 2113, 2071, 2048, 2138, 1732, 1729, 1748, 1729, 2153, 2168, 2174, 2172, 296, 313, 319, 317, 315, 311, 301, 310, 300, 2726, 2723, 2727, 2723, 2750, 2271, 2244, 2271, 2250, 2247, 2005, 2005, 2005, 500, 442, 427, 434, 501, 427, 435, 427, 500, 429, 436, 447, 500, 447, 446, 431, 442, 434, 439, 489, 1004, 993, 1014, 1218, 1241, 1246, 1256, 1236, 1240, 1235, 1234, 1782, 1780, 1021, 1020, 1005, 1016, 1008, 1013, 283, 256, 260, 266, 257, 582, 607, 596, 623, 576, 604, 593, 585, 623, 598, 578, 607, 605, 1147, 1122, 1129, 1106, 1149, 1121, 1132, 1140, 1106, 1144, 1151, 1121, 1192, 1197, 1207, 1200, 3293, 3295, 3293, 3274, 3295, 1215, 1202, 1211, 1198, 1172, 1189, 1194, 1190, 1198, 2501, 2443, 2458, 2435, 2500, 2458, 2434, 2458, 2501, 2460, 2437, 2446, 2501, 2462, 2451, 2458, 2447, 2372, 2369, 2395, 2396, 32311, 27758, 719, 706, 715, 734, 740, 722, 735, 2340, 2347, 2342, 2356, 2356, 1736, 1735, 1730, 1754, 1739, 1756, 1757, 1168, 1161, 1154, 1209, 1172, 1155, 1163, 1159, 1172, 1165, 1173, 1349, 1372, 1367, 1388, 1347, 1370, 1360, 1119, 1094, 1101, 1142, 1095, 1096, 1092, 1100, 1106, 1099, 1088, 1147, 1101, 1088, 3137, 3140, 3166, 3161, 993, 943, 958, 935, 992, 958, 934, 958, 993, 952, 929, 938, 993, 930, 935, 933, 939, 913, 930, 935, 957, 954, 1009, 958, 937, 1011, 1023, 2576, 2662, 2472, 2479, 2481, 2644, 2586, 2571, 2578, 2645, 2571, 2579, 2571, 2644, 2573, 2580, 2591, 2644, 2582, 2596, 2577, 2578, 2590, 2596, 2563, 2578, 1795, 1818, 1809, 1834, 1799, 1808, 1816, 1812, 1799, 1822, 1798, 1635, 1658, 1649, 1610, 1637, 1660, 1654, 995, 1018, 1009, 970, 1019, 1012, 1016, 1008, 3308, 3317, 3326, 3269, 3315, 3326, 1952, 1957, 1983, 1976, 2456, 2518, 2503, 2526, 2457, 2503, 2527, 2503, 2456, 2497, 2520, 2515, 2456, 2500, 2514, 2518, 2501, 2516, 2527, 2440, 2524, 2514, 2510, 2496, 2520, 2501, 2515, 2500, 2442, 809, 895, 872, 818, 830, 809, 891, 886, 895, 874, 818, 830};

    /* renamed from: q */
    private String f100q = "";

    /* renamed from: xC */
    JSONArray f101xC = null;

    public Hudie() {
        int iM853 = C0180.m853();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = iM853 <= 0 ? 1709 : 1678;
                case 204:
                    System.out.println(Integer.decode(C0175.m835("yg20KN")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* renamed from: q */
    private HashMap<String, String> m43q() {
        String str = "ۧۢ۟";
        String strM841 = null;
        HashMap<String, String> map = null;
        String strM828 = null;
        short[] sArr = null;
        while (true) {
            switch (C0174.m829(str)) {
                case 56541:
                    str = "ۣۡۨ";
                    sArr = f825short;
                    break;
                case 1746784:
                    str = "ۢۨ۟";
                    sArr = f825short;
                    break;
                case 1749637:
                    map.put(strM841, strM828);
                    str = "ۥ۠۠";
                    break;
                case 1749849:
                    str = "ۢۡۤ";
                    strM828 = C0174.m828(sArr, 10, 12, 3095);
                    break;
                case 1752485:
                    return map;
                case 1754468:
                    str = "ۧۤ";
                    map = new HashMap<>();
                    break;
                default:
                    strM841 = C0177.m841(sArr, 0, 10, 2848);
                    str = "ۣ۟ۢ";
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x00a3. Please report as an issue. */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strM834 = C0175.m834(f825short, 22, 11, 935);
        String strM809 = C0169.m809(f825short, 33, 7, 396);
        String strM849 = C0179.m849(f825short, 40, 8, 975);
        String strM851 = C0180.m851(f825short, 48, 6, 1095);
        String strM805 = C0168.m805(f825short, 54, 4, 1607);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONObject(C0106ZJ.m484FN(this.f100q + C0165.m798(f825short, 58, 24, 2562) + URLEncoder.encode(str) + C0176.m836(f825short, 82, 104, 2151) + str2, m43q())).optJSONObject(C0183.m866(f825short, 186, 4, 1696)).getJSONArray(strM805);
            JSONArray jSONArray2 = new JSONArray();
            int i = 0;
            while (true) {
                int length = jSONArray.length();
                int i2 = 1616;
                while (true) {
                    i2 ^= 1633;
                    switch (i2) {
                        case 14:
                        case 49:
                            i2 = i < length ? 1709 : 1678;
                        case 204:
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(strM851, jSONObjectOptJSONObject.optString(strM851));
                            jSONObject2.put(strM849, jSONObjectOptJSONObject.optString(strM849));
                            jSONObject2.put(strM809, jSONObjectOptJSONObject.optString(strM809));
                            jSONObject2.put(strM834, jSONObjectOptJSONObject.optString(strM834));
                            jSONArray2.put(jSONObject2);
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
                    jSONObject.put(C0180.m851(f825short, 190, 4, 2073), str2);
                    jSONObject.put(C0183.m866(f825short, 194, 9, 344), 40);
                    jSONObject.put(C0166.m801(f825short, 203, 5, 2762), 18);
                    jSONObject.put(C0175.m834(f825short, 208, 5, 2219), 999);
                    jSONObject.put(strM805, jSONArray2);
                    return jSONObject.toString();
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }

    public String detailContent(List<String> list) {
        String strM828 = C0174.m828(f825short, 213, 3, 2033);
        try {
            Init.m46lj();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String str = this.f100q + C0168.m805(f825short, 216, 20, 475);
            HashMap map = new HashMap();
            map.put(C0175.m834(f825short, 236, 3, 901), list.get(0));
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            String strM679xC = C0131mQ.m679xC(UUID.randomUUID().toString().getBytes());
            map.put(C0183.m866(f825short, 239, 8, 1207), strM679xC);
            map.put(C0168.m805(f825short, 247, 2, 1687), C0171.m816(f825short, 249, 6, 921));
            map.put(C0174.m828(f825short, 255, 5, 367), "");
            System.out.println(strM679xC);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C0106ZJ.m492i(C0106ZJ.m488QU(), str, map, m43q(), new AbstractC0099V3.Qe(this, jSONObject, arrayList, arrayList2) { // from class: com.github.catvod.spider.Hudie.1

                /* renamed from: short, reason: not valid java name */
                private static final short[] f826short = {1312, 1319, 1317, 1323, 1396, 1390, 23679, -30613, 1950, 2698, 2715, 2696, 2697, 2719, 2760, 2571, 2578, 2585, 2594, 2590, 2578, 2579, 2569, 2584, 2579, 2569, 3041, 3064, 3059, 3016, 3059, 3070, 3045, 3058, 3060, 3043, 3064, 3045, 1726, 1703, 1708, 1687, 1705, 1707, 1724, 1703, 1722, 1211, 1186, 1193, 1170, 1215, 1192, 1184, 1196, 1215, 1190, 1214, 850, 843, 832, 891, 837, 854, 833, 837, 808, 817, 826, 769, 807, 827, 831, 812, 2683, 2658, 2665, 2642, 2685, 2660, 2670, 2174, 2151, 2156, 2135, 2150, 2153, 2149, 2157, 963, 986, 977, 1002, 988, 977, 1754, 1734, 1739, 1747, 1743, 1752, 1781, 1731, 1732, 1740, 1733, 3181, 3176, 3197, 3176, 1668, 1673, 1664, 1685, 1711, 1694, 1681, 1693, 1685, 849, 840, 835, 888, 836, 843, 838, 852, 852, 25457, 27568, 23542, 21401, 22909, 22872, -31444, -2279, -31774, 23274, 17951, 22342, 23490, -28030, -2284, -2284, 655, 662, 669, 678, 649, 661, 664, 640, 678, 661, 656, 650, 653, 1519, 1524, 1523, 1515, 3036, 3016, 3029, 3031, 1714, 1728, 1733, 3122, 1785, 1768, 1787, 1786, 1772, 923, 924, 898, 925, 2027, 2020, 2024, 2016, 2739, 730, 733, 707, 1824};

                /* renamed from: QU */
                final ArrayList f102QU;

                /* renamed from: UJ */
                final ArrayList f103UJ;

                /* renamed from: u */
                final Hudie f104u;

                /* renamed from: xC */
                final JSONObject f105xC;

                {
                    this.f104u = this;
                    this.f105xC = jSONObject;
                    this.f102QU = arrayList;
                    this.f103UJ = arrayList2;
                    int iM800 = C0165.m800();
                    int i = 1616;
                    while (true) {
                        i ^= 1633;
                        switch (i) {
                            case 14:
                            case 49:
                                i = iM800 <= 0 ? 1709 : 1678;
                            case 204:
                                System.out.println(Double.parseDouble(C0176.m789("aGwj8hAmo3Zp73DY")));
                                break;
                            case 239:
                                break;
                        }
                        return;
                    }
                }

                @Override // com.github.catvod.spider.merge.AbstractC0099V3
                public void onFailure(Call call, Exception exc) {
                    String str2 = "ۣۥۢ";
                    StringBuilder sb = null;
                    short[] sArr = null;
                    PrintStream printStream = null;
                    String string = null;
                    while (true) {
                        switch (C0174.m829(str2)) {
                            case 56350:
                                sb.append(exc);
                                str2 = "۠ۨ۠";
                                break;
                            case 56358:
                                return;
                            case 1748643:
                                sb.append(string);
                                str2 = "ۡ۟";
                                break;
                            case 1749789:
                                str2 = "ۡ۠ۢ";
                                string = C0170.m814(sArr, 0, 8, 1358);
                                break;
                            case 1750720:
                                str2 = "ۦۥۤ";
                                printStream = System.out;
                                break;
                            case 1751526:
                                str2 = "ۢۦۡ";
                                sArr = f826short;
                                break;
                            case 1753414:
                                printStream.println(string);
                                str2 = "ۡۧ";
                                break;
                            case 1753605:
                                sb = new StringBuilder();
                                str2 = "ۤ۠ۢ";
                                break;
                            default:
                                str2 = "ۦ۟۟";
                                string = sb.toString();
                                break;
                        }
                    }
                }

                /* JADX WARN: Failed to find 'out' block for switch in B:20:0x01d4. Please report as an issue. */
                /* JADX WARN: Failed to find 'out' block for switch in B:47:0x02a7. Please report as an issue. */
                @Override // com.github.catvod.spider.merge.AbstractC0099V3
                public String onResponse(String str2) throws JSONException {
                    JSONArray jSONArray;
                    int i;
                    String strOptString;
                    String strM851 = C0180.m851(f826short, 8, 1, 1972);
                    String strM8282 = C0174.m828(f826short, 9, 6, 2810);
                    String strM805 = C0168.m805(f826short, 15, 11, 2685);
                    String strM798 = C0165.m798(f826short, 26, 12, 2967);
                    String strM866 = C0183.m866(f826short, 38, 9, 1736);
                    String strM814 = C0170.m814(f826short, 47, 11, 1229);
                    String strM809 = C0169.m809(f826short, 58, 8, 804);
                    String strM8092 = C0169.m809(f826short, 66, 8, 862);
                    String strM849 = C0179.m849(f826short, 74, 7, 2573);
                    String strM8492 = C0179.m849(f826short, 81, 8, 2056);
                    String strM8142 = C0170.m814(f826short, 89, 6, 949);
                    String strM8662 = C0183.m866(f826short, 95, 11, 1706);
                    try {
                        JSONObject jSONObjectOptJSONObject = new JSONObject(str2).optJSONObject(C0178.m845(f826short, 106, 4, 3081));
                        this.f105xC.put(strM8142, jSONObjectOptJSONObject.optString(strM8142));
                        this.f105xC.put(strM8492, jSONObjectOptJSONObject.optString(strM8492));
                        this.f105xC.put(strM849, jSONObjectOptJSONObject.optString(strM849));
                        this.f105xC.put(C0169.m809(f826short, 110, 9, 1776), jSONObjectOptJSONObject.optString(C0178.m845(f826short, 119, 9, 807)));
                        this.f105xC.put(strM8092, jSONObjectOptJSONObject.optString(strM8092));
                        this.f105xC.put(strM809, jSONObjectOptJSONObject.optString(strM809));
                        this.f105xC.put(strM814, jSONObjectOptJSONObject.optString(strM814));
                        this.f105xC.put(strM866, jSONObjectOptJSONObject.optString(strM866));
                        this.f105xC.put(strM798, jSONObjectOptJSONObject.optString(strM798));
                        this.f105xC.put(strM805, C0183.m866(f826short, 128, 16, 2069) + jSONObjectOptJSONObject.optString(strM805));
                        jSONArray = jSONObjectOptJSONObject.getJSONArray(C0165.m798(f826short, 144, 13, 761));
                        i = 0;
                    } catch (JSONException e) {
                        int i2 = 50689;
                        while (true) {
                            i2 ^= 50706;
                            switch (i2) {
                                case 19:
                                    i2 = 50720;
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
                        int length = jSONArray.length();
                        int i4 = 1616;
                        while (true) {
                            i4 ^= 1633;
                            switch (i4) {
                                case 14:
                                case 49:
                                    i4 = i3 < length ? 1709 : 1678;
                                case 204:
                                    JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i3);
                                    String strOptString2 = jSONObjectOptJSONObject2.optJSONObject(strM8662).optString(C0183.m866(f826short, 157, 4, 1436));
                                    String strOptString3 = jSONObjectOptJSONObject2.optJSONObject(strM8662).optString(C0172.m820(f826short, 161, 4, 3002));
                                    boolean zHas = jSONObjectOptJSONObject2.optJSONObject(strM8662).has(strM8282);
                                    int i5 = 1740;
                                    while (true) {
                                        i5 ^= 1757;
                                        switch (i5) {
                                            case 17:
                                                i5 = zHas ? 1833 : 1802;
                                            case 54:
                                            case 471:
                                                strOptString = jSONObjectOptJSONObject2.optJSONObject(strM8662).getJSONArray(C0181.m856(f826short, 169, 5, 1673)).optString(0);
                                                break;
                                            case 500:
                                                strOptString = jSONObjectOptJSONObject2.optJSONObject(strM8662).optString(strM8282).replaceAll(C0183.m866(f826short, 165, 3, 1774), C0170.m814(f826short, 168, 1, 3100));
                                                int i6 = 1864;
                                                while (true) {
                                                    i6 ^= 1881;
                                                    switch (i6) {
                                                        case 17:
                                                            i6 = 48674;
                                                        case 47483:
                                                            break;
                                                    }
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    JSONArray jSONArray2 = jSONObjectOptJSONObject2.getJSONArray(C0168.m805(f826short, 174, 4, 1006));
                                    int i7 = 0;
                                    while (true) {
                                        int length2 = jSONArray2.length();
                                        int i8 = 48767;
                                        while (true) {
                                            i8 ^= 48784;
                                            switch (i8) {
                                                case 14:
                                                case 45:
                                                    boolean zIsEmpty = arrayList3.isEmpty();
                                                    int i9 = 49666;
                                                    while (true) {
                                                        i9 ^= 49683;
                                                        switch (i9) {
                                                            case 17:
                                                                i9 = zIsEmpty ? 49759 : 49728;
                                                            case 50:
                                                            case 76:
                                                                int i10 = 49790;
                                                                while (true) {
                                                                    i10 ^= 49807;
                                                                    switch (i10) {
                                                                        case 18:
                                                                            break;
                                                                        case 241:
                                                                            i10 = 49821;
                                                                    }
                                                                    break;
                                                                }
                                                            case 83:
                                                                this.f102QU.add(strOptString2);
                                                                this.f103UJ.add(TextUtils.join(C0179.m849(f826short, 186, 1, 1795), arrayList3));
                                                                break;
                                                        }
                                                    }
                                                    i = i3 + 1;
                                                    int i11 = 49914;
                                                    while (true) {
                                                        i11 ^= 49931;
                                                        switch (i11) {
                                                            case 497:
                                                                i11 = 50596;
                                                                break;
                                                            case 1711:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 76:
                                                    JSONObject jSONObjectOptJSONObject3 = jSONArray2.optJSONObject(i7);
                                                    arrayList3.add(jSONObjectOptJSONObject3.optString(C0174.m828(f826short, 178, 4, 1925)) + C0166.m801(f826short, 182, 1, 2711) + jSONObjectOptJSONObject3.optString(C0174.m828(f826short, 183, 3, 687)) + strM851 + strOptString + strM851 + strOptString3);
                                                    int i12 = i7 + 1;
                                                    int i13 = 48891;
                                                    while (true) {
                                                        i13 ^= 48908;
                                                        switch (i13) {
                                                            case 22:
                                                                break;
                                                            case 503:
                                                                i13 = 48922;
                                                        }
                                                    }
                                                    i7 = i12;
                                                    break;
                                                case 239:
                                                    i8 = i7 < length2 ? 48860 : 48829;
                                            }
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
            String strJoin = TextUtils.join(strM828, arrayList);
            String strJoin2 = TextUtils.join(strM828, arrayList2);
            jSONObject.put(C0166.m801(f825short, 260, 13, 560), strJoin);
            jSONObject.put(C0175.m834(f825short, 273, 12, 1037), strJoin2);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            jSONObject2.put(C0179.m849(f825short, 285, 4, 1220), jSONArray);
            return jSONObject2.toString();
        } catch (Throwable th) {
            System.out.println(C0174.m828(f825short, 289, 5, 3257) + th);
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0090. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0059. Please report as an issue. */
    public String homeContent(boolean z) {
        String strM805 = C0168.m805(f825short, 294, 9, 1227);
        try {
            JSONObject jSONObject = new JSONObject();
            String strM484FN = C0106ZJ.m484FN(this.f100q + C0166.m801(f825short, 303, 17, 2538), m43q());
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONObject(strM484FN).getJSONArray(C0170.m814(f825short, 320, 4, 2344));
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
                            JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i);
                            boolean zContains = jSONObjectOptJSONObject.optString(strM805).contains(C0179.m849(f825short, 324, 2, 2243));
                            int i3 = 1740;
                            while (true) {
                                i3 ^= 1757;
                                switch (i3) {
                                    case 17:
                                        i3 = zContains ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put(C0169.m809(f825short, 326, 7, 699), jSONObjectOptJSONObject.optString(strM805));
                                        jSONObject2.put(strM805, jSONObjectOptJSONObject.optString(strM805));
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
                                        break;
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
                                        break;
                                }
                            }
                            i = i5;
                            break;
                        case 239:
                            break;
                    }
                    jSONObject.put(C0179.m849(f825short, 333, 5, 2375), jSONArray);
                    int i7 = 48891;
                    while (true) {
                        i7 ^= 48908;
                        switch (i7) {
                            case 22:
                                break;
                            case 53:
                                break;
                            case 503:
                                if (!z) {
                                    break;
                                } else {
                                    i7 = 49635;
                                }
                            case 32495:
                                jSONObject.put(C0166.m801(f825short, 338, 7, 1710), new JSONObject("{\"1\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"警匪\",\"v\":\"警匪\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动画\",\"v\":\"动画\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"枪战\",\"v\":\"枪战\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"青春\",\"v\":\"青春\"},{\"n\":\"文艺\",\"v\":\"文艺\"},{\"n\":\"微电影\",\"v\":\"微电影\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"农村\",\"v\":\"农村\"},{\"n\":\"儿童\",\"v\":\"儿童\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"中国大陆\",\"v\":\"大陆\"},{\"n\":\"中国香港\",\"v\":\"香港\"},{\"n\":\"中国台湾\",\"v\":\"台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]}],\"2\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"青春偶像\",\"v\":\"青春偶像\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"家庭\",\"v\":\"家庭\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"乡村\",\"v\":\"乡村\"},{\"n\":\"情景\",\"v\":\"情景\"},{\"n\":\"商战\",\"v\":\"商战\"},{\"n\":\"网剧\",\"v\":\"网剧\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"中国大陆\",\"v\":\"大陆\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]}],\"4\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"热血\",\"v\":\"热血\"},{\"n\":\"推理\",\"v\":\"推理\"},{\"n\":\"搞笑\",\"v\":\"搞笑\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"萝莉\",\"v\":\"萝莉\"},{\"n\":\"校园\",\"v\":\"校园\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"机战\",\"v\":\"机战\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"少年\",\"v\":\"少年\"},{\"n\":\"少女\",\"v\":\"少女\"},{\"n\":\"社会\",\"v\":\"社会\"},{\"n\":\"原创\",\"v\":\"原创\"},{\"n\":\"亲子\",\"v\":\"亲子\"},{\"n\":\"益智\",\"v\":\"益智\"},{\"n\":\"励志\",\"v\":\"励志\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国\",\"v\":\"内地\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"欧美\",\"v\":\"欧美\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}],\"3\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"选秀\",\"v\":\"选秀\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"访谈\",\"v\":\"访谈\"},{\"n\":\"播报\",\"v\":\"播报\"},{\"n\":\"旅游\",\"v\":\"旅游\"},{\"n\":\"音乐\",\"v\":\"音乐\"},{\"n\":\"美食\",\"v\":\"美食\"},{\"n\":\"纪实\",\"v\":\"纪实\"},{\"n\":\"曲艺\",\"v\":\"曲艺\"},{\"n\":\"生活\",\"v\":\"生活\"},{\"n\":\"游戏互动\",\"v\":\"游戏互动\"},{\"n\":\"财经\",\"v\":\"财经\"},{\"n\":\"求职\",\"v\":\"求职\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"港台\",\"v\":\"港台\"},{\"n\":\"日韩\",\"v\":\"日韩\"},{\"n\":\"欧美\",\"v\":\"欧美\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]}]}]}"));
                                break;
                            default:
                                continue;
                        }
                        i7 = 48953;
                    }
                    return jSONObject.toString();
                }
            }
        } catch (Throwable th) {
            System.out.println(th);
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0076. Please report as an issue. */
    public String homeVideoContent() {
        String strM809 = C0169.m809(f825short, 345, 11, 1254);
        String strM828 = C0174.m828(f825short, 356, 7, 1331);
        String strM814 = C0170.m814(f825short, 363, 8, 1065);
        String strM805 = C0168.m805(f825short, 371, 6, 1060);
        String strM8092 = C0169.m809(f825short, 377, 4, 3117);
        try {
            String strM484FN = C0106ZJ.m484FN(this.f100q + C0176.m836(f825short, 381, 27, 974), m43q());
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONObject(strM484FN).getJSONArray(strM8092);
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
                            JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(strM805, jSONObjectOptJSONObject.optString(strM805));
                            jSONObject.put(strM814, jSONObjectOptJSONObject.optString(strM814));
                            jSONObject.put(strM828, jSONObjectOptJSONObject.optString(strM828));
                            jSONObject.put(strM809, jSONObjectOptJSONObject.optString(strM809));
                            jSONArray.put(jSONObject);
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
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(strM8092, jSONArray);
                    return jSONObject2.toString();
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }

    public void init(Context context, String str) {
        String strM724Mo = null;
        String str2 = "ۣۨۧ";
        while (true) {
            switch (C0174.m829(str2)) {
                case 1747873:
                    strM724Mo = C0152vp.m724Mo(str);
                    str2 = "ۨۡۧ";
                    break;
                case 1748866:
                    return;
                case 1750818:
                    super.init(context, str);
                    str2 = "۠ۦۧ";
                    break;
                default:
                    this.f100q = strM724Mo;
                    str2 = "ۡۧۨ";
                    break;
            }
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            String[] strArrSplit = str2.split(C0169.m809(f825short, 408, 2, 2636));
            String str3 = strArrSplit[0];
            String str4 = strArrSplit[1];
            String str5 = strArrSplit[2];
            JSONObject jSONObject = new JSONObject();
            HashMap map = new HashMap();
            map.put(C0166.m801(f825short, 410, 3, 2525), URLEncoder.encode(str4) + str3);
            C0106ZJ.m492i(C0106ZJ.m488QU(), this.f100q + C0169.m809(f825short, 413, 21, 2683), map, m43q(), new AbstractC0099V3.Qe(this, jSONObject) { // from class: com.github.catvod.spider.Hudie.2

                /* renamed from: short, reason: not valid java name */
                private static final short[] f827short = {1264, 1271, 1257, 2679, 2662, 2677, 2676, 2658};

                /* renamed from: QU */
                final Hudie f106QU;

                /* renamed from: xC */
                final JSONObject f107xC;

                {
                    this.f106QU = this;
                    this.f107xC = jSONObject;
                    int iM850 = C0179.m850();
                    int i = 1616;
                    while (true) {
                        i ^= 1633;
                        switch (i) {
                            case 14:
                            case 49:
                                i = iM850 <= 0 ? 1709 : 1678;
                            case 204:
                                System.out.println(Long.decode(C0179.m847("nUqnZTZH4CN6")));
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
                public String onResponse(String str6) throws JSONException {
                    int i;
                    String strM816 = C0171.m816(f827short, 0, 3, 1157);
                    try {
                        String strOptString = new JSONObject(str6).optString(strM816);
                        this.f107xC.put(C0175.m834(f827short, 3, 5, 2567), 0);
                        this.f107xC.put(strM816, strOptString);
                        i = 1616;
                    } catch (JSONException e) {
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
                    } catch (Exception e2) {
                        throw new RuntimeException(e2);
                    }
                    while (true) {
                        i ^= 1633;
                        switch (i) {
                            case 14:
                                return str6;
                            case 49:
                                i = 1647;
                                break;
                        }
                    }
                }
            });
            return jSONObject.toString();
        } catch (Throwable th) {
            System.out.println(th);
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0091. Please report as an issue. */
    public String searchContent(String str, boolean z) {
        String strM841 = C0177.m841(f825short, 434, 11, 1909);
        String strM845 = C0178.m845(f825short, 445, 7, 1557);
        String strM814 = C0170.m814(f825short, 452, 8, 917);
        String strM798 = C0165.m798(f825short, 460, 6, 3226);
        String strM861 = C0182.m861(f825short, 466, 4, 1996);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONObject(C0106ZJ.m484FN(this.f100q + C0179.m849(f825short, 470, 29, 2487) + URLEncoder.encode(str) + C0174.m828(f825short, 499, 12, 783), m43q())).getJSONArray(strM861);
            JSONArray jSONArray2 = new JSONArray();
            int i = 0;
            while (true) {
                int length = jSONArray.length();
                int i2 = 1616;
                while (true) {
                    i2 ^= 1633;
                    switch (i2) {
                        case 14:
                        case 49:
                            i2 = i < length ? 1709 : 1678;
                        case 204:
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(strM798, jSONObjectOptJSONObject.optString(strM798));
                            jSONObject2.put(strM814, jSONObjectOptJSONObject.optString(strM814).trim());
                            jSONObject2.put(strM845, jSONObjectOptJSONObject.optString(strM845));
                            jSONObject2.put(strM841, jSONObjectOptJSONObject.optString(strM841));
                            jSONArray2.put(jSONObject2);
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
                    jSONObject.put(strM861, jSONArray2);
                    return jSONObject.toString();
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }
}
