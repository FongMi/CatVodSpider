package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.C0165;
import com.github.catvod.parser.C0166;
import com.github.catvod.spider.merge.C0106ZJ;
import com.github.catvod.spider.merge.C0152vp;
import com.github.catvod.spider.merge.C0168;
import com.github.catvod.spider.merge.C0169;
import com.github.catvod.spider.merge.C0170;
import com.github.catvod.spider.merge.C0171;
import com.github.catvod.spider.merge.C0172;
import com.github.catvod.spider.merge.C0174;
import com.github.catvod.spider.merge.C0175;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.AI */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0001AI extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f810short = {2729, 2703, 2713, 2702, 2769, 2749, 2715, 2713, 2706, 2696, 872, 881, 890, 833, 878, 882, 895, 871, 833, 875, 876, 882, 2467, 2490, 2481, 2442, 2469, 2489, 2484, 2476, 2442, 2483, 2471, 2490, 2488, 1851, 1826, 1833, 1810, 1838, 1826, 1827, 1849, 1832, 1827, 1849, 994, 1019, 1008, 971, 1008, 1021, 998, 1009, 1015, 992, 1019, 998, 1144, 1121, 1130, 1105, 1135, 1133, 1146, 1121, 1148, 2317, 2324, 2335, 2340, 2313, 2334, 2326, 2330, 2313, 2320, 2312, 2774, 2767, 2756, 2815, 2753, 2770, 2757, 2753, 3016, 3025, 3034, 3041, 3015, 3035, 3039, 3020, 2794, 2803, 2808, 2755, 2796, 2805, 2815, 574, 551, 556, 535, 550, 553, 549, 557, 1577, 1584, 1595, 1536, 1590, 1595, 2921, 2924, 2934, 2929, 1592, 1576, 1654, 1652, 1578, 1651, 1650, 1635, 1654, 1662, 1659, 1585, 1662, 1651, 1636, 1578, 972, 961, 968, 989, 999, 982, 985, 981, 989, 1381, 1404, 1399, 1356, 1392, 1407, 1394, 1376, 1376, 27897, 25656, 21630, 23569, 22261, 22224, -30044, -1903, -29590, 21858, 18839, 22734, 21578, -25334, -1892, -1892, 766, 734, 627, 580, 583, 580, 595, 580, 595, 411, 472, 390, 448, 397, 1557, 1560, 1564, 1561, 1560, 1551, 2920, 2928, 2936, 2934, 2931, 2928, 1678, 1673, 1687, 2671, 2686, 2669, 2668, 2682, 2762, 2697, 2708, 2768, 3098, 3080, 256, 281, 274, 297, 260, 275, 283, 279, 260, 285, 261, 2993, 2984, 2979, 2968, 2999, 2990, 2980, 1490, 1483, 1472, 1531, 1482, 1477, 1481, 1473, 1790, 1767, 1772, 1751, 1761, 1772, 2117, 2112, 2138, 2141, 1768, 1784, 1702, 1700, 1786, 1713, 1710, 1699, 1698, 1704, 1707, 1710, 1716, 1715, 1761, 1712, 1699, 1786};

    /* renamed from: q */
    private String f8q = "";

    /* renamed from: xC */
    private String f9xC = "";

    /* renamed from: QU */
    private String f7QU = "";

    public C0001AI() {
        int iM818 = C0171.m818();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                case 49:
                    i = iM818 >= 0 ? 1709 : 1678;
                case 204:
                    System.out.println(Long.parseLong(C0177.m839("2XjaVdhkeEp57KzrQM2Qh96G8")));
                    break;
                case 239:
                    break;
            }
            return;
        }
    }

    /* renamed from: q */
    private HashMap<String, String> m1q(String str) {
        String str2 = "ۤۦ۟";
        HashMap<String, String> map = null;
        short[] sArr = null;
        String str3 = null;
        String strM845 = null;
        while (true) {
            switch (C0174.m829(str2)) {
                case 1746812:
                    str2 = "ۧ۠۟";
                    strM845 = C0178.m845(sArr, 0, 10, 2812);
                    break;
                case 1749701:
                    return map;
                case 1751709:
                    map = new HashMap<>();
                    str2 = "ۦ۠ۢ";
                    break;
                case 1754380:
                    str2 = "ۣ۟۠";
                    sArr = f810short;
                    break;
                case 1754406:
                    map.put(strM845, str3);
                    str2 = "ۣۢۦ";
                    break;
                default:
                    str2 = "ۧ۟ۤ";
                    str3 = this.f9xC;
                    break;
            }
        }
    }

    public String detailContent(List<String> list) {
        String strM801 = C0166.m801(f810short, 10, 12, 798);
        String strM856 = C0181.m856(f810short, 22, 13, 2517);
        String strM805 = C0168.m805(f810short, 35, 11, 1869);
        String strM828 = C0174.m828(f810short, 46, 12, 916);
        String strM866 = C0183.m866(f810short, 58, 9, 1038);
        String strM8282 = C0174.m828(f810short, 67, 11, 2427);
        String strM834 = C0175.m834(f810short, 78, 8, 2720);
        String strM798 = C0165.m798(f810short, 86, 8, 3006);
        String strM861 = C0182.m861(f810short, 94, 7, 2716);
        String strM8012 = C0166.m801(f810short, 101, 8, 584);
        String strM816 = C0171.m816(f810short, 109, 6, 1631);
        String strM8013 = C0166.m801(f810short, 115, 4, 2821);
        try {
            Init.m46lj();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f8q);
            sb.append(C0178.m845(f810short, 119, 16, 1559));
            sb.append(list.get(0));
            String string = sb.toString();
            JSONObject jSONObjectOptJSONObject = new JSONObject(C0106ZJ.m484FN(string, m1q(string))).getJSONArray(strM8013).optJSONObject(0);
            jSONObject.put(strM816, jSONObjectOptJSONObject.optString(strM816));
            jSONObject.put(strM8012, jSONObjectOptJSONObject.optString(strM8012));
            jSONObject.put(strM861, jSONObjectOptJSONObject.optString(strM861));
            jSONObject.put(C0172.m820(f810short, 135, 9, 952), jSONObjectOptJSONObject.optString(C0181.m856(f810short, 144, 9, 1299)));
            jSONObject.put(strM798, jSONObjectOptJSONObject.optString(strM798));
            jSONObject.put(strM834, jSONObjectOptJSONObject.optString(strM834));
            jSONObject.put(strM8282, jSONObjectOptJSONObject.optString(strM8282));
            jSONObject.put(strM866, jSONObjectOptJSONObject.optString(strM866));
            jSONObject.put(strM828, jSONObjectOptJSONObject.optString(strM828));
            jSONObject.put(strM805, C0174.m828(f810short, 153, 16, 1949) + jSONObjectOptJSONObject.optString(strM805));
            jSONObject.put(strM856, jSONObjectOptJSONObject.optString(strM856));
            jSONObject.put(strM801, jSONObjectOptJSONObject.optString(strM801));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            jSONObject2.put(strM8013, jSONArray);
            return jSONObject2.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public void init(Context context, String str) {
        String str2 = "ۧۨ";
        short[] sArr = null;
        String[] strArrSplit = null;
        String str3 = null;
        String strM724Mo = null;
        while (true) {
            switch (C0174.m829(str2)) {
                case 56418:
                    this.f9xC = str;
                    str2 = "ۥۣ۟";
                    break;
                case 56545:
                    super.init(context, str);
                    str2 = "۠ۨ۟";
                    break;
                case 1746847:
                    sArr = f810short;
                    str2 = "۠ۧۡ";
                    break;
                case 1747684:
                    str2 = "۠ۥۤ";
                    strArrSplit = strM724Mo.split(str);
                    break;
                case 1747839:
                    str2 = "ۣۤۨ";
                    strM724Mo = strArrSplit[0];
                    break;
                case 1747927:
                    str2 = "۟ۤۤ";
                    strM724Mo = C0152vp.m724Mo(str);
                    break;
                case 1751528:
                    return;
                case 1751775:
                    this.f8q = strM724Mo;
                    str2 = "ۤۨۨ";
                    break;
                case 1751780:
                    str = strArrSplit[1];
                    str2 = "ۣۥ";
                    break;
                case 1752457:
                    str2 = "ۧۦۢ";
                    str3 = strArrSplit[2];
                    break;
                case 1754595:
                    this.f7QU = str3;
                    str2 = "ۤ۠ۤ";
                    break;
                default:
                    str = C0183.m866(sArr, 169, 2, 674);
                    str2 = "۠۠ۤ";
                    break;
            }
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0169.m809(f810short, 171, 7, 545), this.f7QU);
            JSONObject jSONObject2 = new JSONObject();
            boolean zContains = str2.contains(C0169.m809(f810short, 178, 5, 437));
            String strM834 = C0175.m834(f810short, 183, 6, 1661);
            String strM866 = C0183.m866(f810short, 189, 6, 2841);
            String strM809 = C0169.m809(f810short, 195, 3, 1787);
            String strM861 = C0182.m861(f810short, 198, 5, 2591);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = !zContains ? 1709 : 1678;
                    case 204:
                        boolean zContains2 = str2.contains(C0170.m814(f810short, 203, 4, 2788));
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = zContains2 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    jSONObject2.put(C0172.m820(f810short, 207, 2, 3184), 1);
                                    jSONObject2.put(strM861, 0);
                                    jSONObject2.put(strM809, str2);
                                    boolean zContains3 = this.f7QU.contains(strM866);
                                    int i3 = 48767;
                                    while (true) {
                                        i3 ^= 48784;
                                        switch (i3) {
                                            case 14:
                                                break;
                                            case 45:
                                                break;
                                            case 76:
                                                jSONObject2.put(strM834, jSONObject.toString());
                                                break;
                                            case 239:
                                                if (zContains3) {
                                                    break;
                                                } else {
                                                    i3 = 48860;
                                                }
                                            default:
                                                continue;
                                        }
                                        i3 = 48829;
                                    }
                                    break;
                                case 500:
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                i4 = 48674;
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
                return jSONObject2.toString();
            }
            jSONObject2.put(strM861, 0);
            jSONObject2.put(strM809, str2);
            boolean zContains4 = this.f7QU.contains(strM866);
            int i5 = 48891;
            while (true) {
                i5 ^= 48908;
                switch (i5) {
                    case 22:
                    case 53:
                        break;
                    case 503:
                        i5 = !zContains4 ? 49635 : 48953;
                    case 32495:
                        jSONObject2.put(strM834, jSONObject.toString());
                        break;
                }
            }
            return jSONObject2.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0083. Please report as an issue. */
    public String searchContent(String str, boolean z) {
        String strM866 = C0183.m866(f810short, 209, 11, 374);
        String strM809 = C0169.m809(f810short, 220, 7, 3015);
        String strM798 = C0165.m798(f810short, 227, 8, 1444);
        String strM861 = C0182.m861(f810short, 235, 6, 1672);
        String strM801 = C0166.m801(f810short, 241, 4, 2089);
        try {
            JSONObject jSONObject = new JSONObject();
            String str2 = this.f8q + C0169.m809(f810short, 245, 18, 1735) + str;
            System.out.println(str2);
            String strM484FN = C0106ZJ.m484FN(str2, m1q(str2));
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONObject(strM484FN).getJSONArray(strM801);
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
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(strM861, jSONObjectOptJSONObject.optString(strM861));
                            jSONObject2.put(strM798, jSONObjectOptJSONObject.optString(strM798));
                            jSONObject2.put(strM809, jSONObjectOptJSONObject.optString(strM809));
                            jSONObject2.put(strM866, jSONObjectOptJSONObject.optString(strM866));
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
                    jSONObject.put(strM801, jSONArray);
                    return jSONObject.toString();
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }
}
