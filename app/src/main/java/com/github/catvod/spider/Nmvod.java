package com.github.catvod.spider;

import android.content.Context;
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
import com.github.catvod.spider.merge.g9;
import com.github.catvod.spider.merge.jk;
import com.github.catvod.spider.merge.xx;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Nmvod extends Spider {
    private static String l8 = "";

    private static final short[] f40short = {1109, 1036, 1045, 1054, 1111, 1038, 1027, 1034, 1055, 1111, 1043, 1054, 1111, 1106, 1062, 1054, 1105, 1107, 1111, 1034, 1053, 1111, 1106, 1062, 1054, 1105, 1107, 1108, 1042, 1038, 1047, 1046, 1428, 1485, 1492, 1503, 1487, 1474, 1483, 1502, 1491, 1487, 1494, 1495, 1428, 1427, 1511, 1503, 1424, 1426, 1429, 1491, 1487, 1494, 1495, 684, 757, 748, 743, 747, 759, 750, 751, 684, 683, 735, 743, 680, 682, 685, 747, 759, 750, 751, 985, 896, 921, 914, 987, 914, 915, 898, 919, 927, 922, 987, 927, 914, 987, 990, 938, 914, 989, 991, 984, 926, 898, 923, 922, 774, 863, 838, 845, 772, 857, 837, 840, 848, 772, 832, 845, 772, 769, 885, 890, 770, 768, 775, 833, 861, 836, 837, 2356, 2413, 2420, 2431, 2358, 2423, 2418, 2408, 2415, 2358, 2418, 2431, 2358, 2355, 2375, 2431, 2352, 2354, 2358, 2411, 2428, 2358, 2355, 2375, 2431, 2352, 2354, 2358, 2420, 2409, 2431, 2430, 2409, 2358, 2358, 2425, 2402, 2358, 2415, 2418, 2422, 2430, 2358, 2424, 2423, 2426, 2408, 2408, 2358, 2347, 2358, 2402, 2430, 2426, 2409, 2358, 2347, 2358, 2423, 2430, 2415, 2415, 2430, 2409, 2358, 2358, 2426, 2409, 2430, 2426, 2358, 2358, 2423, 2426, 2421, 2428, 2358, 2357, 2419, 2415, 2422, 2423, 2045, 2001, 2003, 2016, 2012, 2001, 1993, 2005, 1986, 2035, 2015, 2014, 2006, 2009, 2007, 1950, 1984, 2012, 2001, 1993, 2005, 1986, 2031, 2012, 2009, 1987, 1988, 1933, 1944, 2028, 1995, 1950, 1946, 2028, 1997, 1945, 2028, 1948, 2045, 2001, 2003, 2016, 2012, 2001, 1993, 2005, 1986, 2035, 2015, 2014, 2006, 2009, 2007, 1950, 2004, 2015, 1991, 2014, 2005, 1986, 2031, 2012, 2009, 1987, 1988, 1933, 974, 962, 960, 1020, 982, 977, 975, 926, 900, 907, 909, 905, 906, 900, 920, 3142, 3087, 3073, 3101, 3142, 3166, 3142, 3148, 3146, 3150, 3149, 3142, 3144, 1367, 1283, 1310, 1296, 1292, 1367, 1359, 1367, 1373, 1371, 1375, 1372, 1367, 1369, 837, 787, 782, 778, 770, 837, 861, 837, 847, 841, 845, 846, 837, 843, 1900, 1866, 1884, 1867, 1812, 1912, 1886, 1884, 1879, 1869, 1825, 1795, 1814, 1797, 1792, 1792, 1805, 1859, 1881, 1858, 1884, 1868, 1860, 1824, 1797, 1794, 1817, 1812, 1879, 1868, 1837, 1794, 1800, 1822, 1795, 1797, 1800, 1868, 1885, 1885, 1879, 1868, 1825, 1886, 1884, 1884, 1883, 1830, 1887, 1855, 1839, 1868, 1838, 1817, 1797, 1792, 1800, 1859, 1854, 1831, 1853, 1885, 1858, 1886, 1884, 1884, 1876, 1886, 1882, 1858, 1884, 1884, 1886, 1879, 1868, 1819, 1818, 1861, 1868, 1837, 1820, 1820, 1792, 1801, 1851, 1801, 1806, 1831, 1797, 1816, 1859, 1881, 1887, 1883, 1858, 1887, 1882, 1868, 1860, 1831, 1828, 1848, 1825, 1824, 1856, 1868, 1792, 1797, 1799, 1801, 1868, 1835, 1801, 1807, 1799, 1795, 1861, 1868, 1850, 1801, 1822, 1823, 1797, 1795, 1794, 1859, 1880, 1858, 1884, 1868, 1839, 1796, 1822, 1795, 1793, 1801, 1859, 1883, 1883, 1858, 1884, 1858, 1887, 1876, 1882, 1881, 1858, 1885, 1886, 1884, 1868, 1825, 1853, 1853, 1838, 1822, 1795, 1819, 1823, 1801, 1822, 1859, 1882, 1858, 1886, 1868, 1848, 1838, 1855, 1859, 1884, 1880, 1881, 1883, 1885, 1880, 1868, 1825, 1795, 1806, 1797, 1792, 1801, 1868, 1855, 1805, 1802, 1805, 1822, 1797, 1859, 1881, 1887, 1883, 1858, 1887, 1882, 1418, 1423, 1478, 1415, 1009, 1005, 1005, 1001, 1002, 931, 950, 950, 1007, 1008, 1001, 951, 1006, 1006, 1022, 995, 951, 1018, 1015, 931, 940, 939, 937, 937, 950, 1008, 1015, 1021, 1020, 993, 951, 1001, 1009, 1001, 934, 1012, 932, 1007, 1014, 1021, 948, 1013, 1008, 1002, 1005, 948, 1008, 1021, 948, 868, 825, 814, 868, 2990, 3052, 3057, 3047, 3046, 3057, 2990, 2990, 3041, 3066, 2990, 3063, 3050, 3054, 3046, 2990, 3040, 3055, 3042, 3056, 3056, 2990, 2995, 2990, 3066, 3046, 3042, 3057, 2990, 2995, 2990, 3055, 3046, 3063, 3063, 3046, 3057, 2990, 2990, 3042, 3057, 3046, 3042, 2990, 2990, 3055, 3042, 3053, 3044, 2990, 2989, 3051, 3063, 3054, 3055, 2598, 2603, 2612, 2668, 2610, 2595, 2597, 2599, 2684, 2595, 1548, 1558, 1537, 1538, 2521, 2504, 2510, 2508, 2501, 2496, 2503, 2498, 2550, 2507, 21567, -28556, 26110, 28246, 27425, 23407, 27127, 27052, -32546, 32731, 30604, 28355, 23993, 1163, 1170, 1232, 1164, 1179, 1165, 1175, 1156, 1179, 1185, 1170, 1175, 1165, 1162, 1246, 1170, 1175, 2519, 2506, 2519, 2511, 2502, 3068, 3065, 2992, 3057, 2992, 3060, 3065, 3046, 3006, 3040, 3065, 3059, 2992, 3065, 3069, 3063, 1073, 1072, 1057, 2366, 2363, 2418, 2355, 2418, 2358, 2363, 2340, 2428, 2338, 2363, 2353, 2418, 2337, 2338, 2355, 2364, 2428, 2337, 2320, 2365, 2342, 2342, 2365, 2367, 2418, 2337, 2338, 2355, 2364, 1187, 1210, 1201, 1162, 1212, 1201, 2757, 2780, 2775, 2796, 2781, 2770, 2782, 2774, 295, 318, 309, 270, 289, 312, 306, 692, 685, 678, 669, 688, 679, 687, 675, 688, 681, 689, 2349, 2364, 2362, 2360, 529, 512, 518, 516, 514, 526, 532, 527, 533, 3146, 3151, 3147, 3151, 3154, 1346, 1369, 1346, 1367, 1370, 871, 866, 888, 895, 1284, 1304, 1304, 1308, 1311, 1366, 1347, 1347, 1306, 1285, 1308, 1346, 1307, 1307, 1291, 1302, 1346, 1295, 1282, 1366, 1369, 1374, 1372, 1372, 1347, 1306, 1283, 1288, 1345, 1288, 1289, 1304, 1293, 1285, 1280, 1345, 1285, 1288, 1345, 1334, 1392, 1388, 1397, 1396, 2368, 2396, 2396, 2392, 2395, 2322, 2311, 2311, 2398, 2369, 2392, 2310, 2399, 2399, 2383, 2386, 2310, 2379, 2374, 2322, 2333, 2330, 2328, 2328, 2311, 2398, 2375, 2380, 2309, 2392, 2372, 2377, 2385, 2309, 2369, 2380, 2309, 3122, 3180, 3181, 3196, 3122, 3118, 3122, 3185, 3178, 3186, 3122, 3118, 3121, 3191, 3179, 3186, 3187, 2356, 2338, 2340, 2355, 2350, 2344, 2345, 2409, 2359, 2342, 2336, 2338, 2410, 2351, 2339, 2407, 2342, 2407, 2350, 2346, 2336, 2548, 2549, 2532, 1612, 1557, 1546, 1616, 1613, 1616, 1608, 1601, 1540, 1605, 896, 918, 912, 903, 922, 924, 925, 989, 899, 914, 916, 918, 990, 913, 919, 979, 919, 922, 901, 989, 919, 918, 896, 912, 940, 922, 903, 918, 926, 2602, 2601, 2616, 2615, 21310, 26582, 1247, 492, 501, 510, 453, 510, 499, 488, 511, 505, 494, 501, 488, 19130, 27541, 3137, 3160, 3155, 3176, 3158, 3156, 3139, 3160, 3141, 30576, 26055, 2465, 2488, 2483, 2440, 2469,
    2482, 2490, 2486, 2469, 2492, 629, 636, 637, 615, 23314, 19333, 1635, 1658, 1649, 1610, 1644, 1648, 1652, 1639, 1250, 1265, 1271, 1258, 1248, 1263, 1254, 1197, 1255, 1254, 1271, 1250, 1258, 1263, 1198, 1248, 1260, 1261, 1213, 1267, 3193, 3168, 3179, 3152, 3174, 3179, 315, 290, 297, 274, 291, 300, 288, 296, 2864, 2857, 2850, 2841, 2870, 2863, 2853, 751, 758, 765, 710, 762, 758, 759, 749, 764, 759, 749, 24868, 27109, 22947, 20940, 23336, 23309, -30855, -2740, -32329, 22719, 17482, 21779, 22935, -28457, -2751, -2751, 2744, 2741, 2730, 2802, 2744, 2745, 2728, 2749, 2741, 2736, 2700, 2739, 2735, 2728, 2745, 2734, 2709, 2738, 2728, 2734, 2739, 2812, 2735, 2751, 2734, 2741, 2732, 2728, 1986, 2011, 2000, 2027, 1988, 2008, 2005, 1997, 2027, 2002, 1990, 2011, 2009, -30783, 21077, 1103, 1110, 1117, 1126, 1097, 1109, 1112, 1088, 1126, 1100, 1099, 1109, 1643, 1646, 1652, 1651, 2193, 2196, 2269, 2204, 2457, 2437, 2437, 2433, 2434, 2507, 2526, 2526, 2439, 2456, 2433, 2527, 2438, 2438, 2454, 2443, 2527, 2450, 2463, 2507, 2500, 2499, 2497, 2497, 2964, 2969, 2950, 3027, 2948, 2975, 2944, 2974, 2961, 2950, 3024, 2949, 2972, 3038, 2947, 2951, 2969, 2944, 2965, 2946, 3037, 2951, 2946, 2961, 2944, 2944, 2965, 2946, 3024, 2972, 2969, 3024, 2961, 1177, 1155, 1172, 1175, 30516, 23920, -29100, 32615, 21485, 30528, -29754, 22338, 27329, 30304, 21482, 2282, 2279, 2286, 2299, 2241, 2295, 2298, 1213, 1200, 1209, 1196, 1174, 1191, 1192, 1188, 1196, 2595, 2604, 2601, 2609, 2592, 2615, 2614, 1553, 1566, 1555, 1537, 1537, 2419, 2410, 2344, 2420, 2403, 2421, 2415, 2428, 2403, 2393, 2410, 2415, 2421, 2418, 1588, 1577, 1588, 1580, 1573, 1258, 1263, 1190, 1255, 1190, 1250, 1263, 1264, 1192, 1270, 1263, 1253, 1190, 1263, 1259, 1249, 2160, 2161, 2144, 2714, 2719, 2774, 2711, 2774, 2706, 2719, 2688, 2776, 2694, 2719, 2709, 2774, 2693, 2694, 2711, 2712, 2776, 2693, 2740, 2713, 2690, 2690, 2713, 2715, 2774, 2693, 2694, 2711, 2712, 3031, 3022, 3013, 3070, 3016, 3013, 1002, 1011, 1016, 963, 1010, 1021, 1009, 1017, 2523, 2498, 2505, 2546, 2525, 2500, 2510, 2578, 2571, 2560, 2619, 2582, 2561, 2569, 2565, 2582, 2575, 2583, 2641, 2644, 2638, 2633, 483, 500, 487, 437, 480, 487, 505, 424, 434, 445, 443, 447, 444, 434, 430, 856, 841, 858, 859, 845, 1335, 1328, 1326, 1938, 1934, 1934, 1930, 1929, 1984, 2005, 2005, 1932, 1939, 1930, 2004, 1933, 1933, 1949, 1920, 2004, 1945, 1940, 1984, 1999, 1992, 1994, 1994, 2005, 1939, 1940, 1950, 1951, 1922, 2004, 1930, 1938, 1930, 1989, 1943, 1991, 1932, 1941, 1950, 2007, 1929, 1951, 1947, 1928, 1945, 1938, 615, 628, 1282, 1287, 1309, 1306};
    private Pattern A;
    private Pattern HM;
    private Pattern N;
    private JSONObject S;
    private Pattern cD;
    private Pattern n;
    private Pattern s;
    private Pattern v;
    private Pattern T4 = Pattern.compile("/vod-type-id-(\\d+)-pg-(\\d+).html");
    private Pattern b = Pattern.compile("/vodtypehtml/(\\d+).html");
    private Pattern OL = Pattern.compile("/vodhtml/(\\d+).html");
    private Pattern l = Pattern.compile("/vod-detail-id-(\\d+).html");
    private Pattern tT = Pattern.compile("/vod-play-id-(\\S+).html");

    public Nmvod() {
        String strE = "/vod-list-id-(\\d+)-pg-(\\d+)-order--by-time-class-0-year-0-letter--area--lang-.html";
        this.N = Pattern.compile(strE);
        this.HM = Pattern.compile(strE);
        this.n = Pattern.compile("MacPlayerConfig.player_list=(\\{.*\\})\\,MacPlayerConfig.downer_list=");
        this.v = Pattern.compile("mac_url='(.*)';");
        this.A = Pattern.compile("\"key\":\"(.*)\",");
        this.cD = Pattern.compile("\"vkey\":\"(.*)\",");
        this.s = Pattern.compile("\"time\":\"(.*)\",");
    }

    protected HashMap<String, String> S(String str) {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Linux; Android 11; M2007J3SC Build/RKQ1.200826.002; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/77.0.3865.120 MQQBrowser/6.2 TBS/045714 Mobile Safari/537.36");
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        int i;
        int i2;
        int i3;
        int length;
        String strE = "li a";
        try {
            String strV = Yy.v("https://vip.wwgz.cn:5200/index.php?m=vod-list-id-" + str + "-pg-" + str2 + "-order--by-time-class-0-year-0-letter--area--lang-.html", S(""));
            g9 g9VarL8 = YS.l8(strV);
            JSONObject jSONObject = new JSONObject();
            jk jkVarLD = g9VarL8.LD("div.page>a");
            int size = jkVarLD.size();
            String strE2 = "href";
            if (size != 0) {
                int i5 = Integer.parseInt(str2);
                i2 = i5;
                i3 = i5;
            } else {
                int i7 = -1;
                int i8 = 0;
                while (i8 < jkVarLD.size()) {
                    Iw iw = jkVarLD.get(i8);
                    if (iw != null) {
                        String strGO = iw.GO();
                        if (i7 != -1) {
                            // already found, skip
                        } else {
                            if (iw.Jb("pagelink_b")) {
                                boolean zFind = this.N.matcher(iw.T4(strE2)).find();
                                if (zFind) {
                                    i7 = Integer.parseInt(strGO);
                                } else {
                                    i7 = 0;
                                }
                            }
                        }
                        boolean zEquals = strGO.equals("尾页");
                        if (zEquals) {
                            Matcher matcher = this.N.matcher(iw.T4(strE2));
                            boolean zFind2 = matcher.find();
                            if (zFind2) {
                                int i17 = Integer.parseInt(matcher.group(2));
                                i2 = i17;
                                i3 = i7;
                            }
                        } else {
                            i = i7;
                            i8++;
                            i7 = i;
                        }
                    }
                    i8++;
                }
                i2 = 0;
                i3 = i7;
            }
            JSONArray jSONArray = new JSONArray();
            boolean zContains = strV.contains("没有找到您想要的结果哦");
            if (zContains) {
                // empty list
            } else {
                jk jkVarLD2 = g9VarL8.LD("ul.resize_list li");
                int i23 = 0;
                while (i23 < jkVarLD2.size()) {
                    Iw iw2 = jkVarLD2.get(i23);
                    String strL8 = iw2.LD(strE).l8("title");
                    String strL82 = iw2.LD("li a div.pic img").l8("src");
                    String strOL = iw2.LD("li a div.pic span.sBottom span").OL();
                    Matcher matcher2 = this.l.matcher(iw2.LD(strE).l8(strE2));
                    boolean zFind3 = matcher2.find();
                    if (zFind3) {
                        String strGroup = matcher2.group(1);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("vod_id", strGroup);
                        jSONObject2.put("vod_name", strL8);
                        jSONObject2.put("vod_pic", strL82);
                        jSONObject2.put("vod_remarks", strOL);
                        jSONArray.put(jSONObject2);
                    }
                    i23++;
                }
            }
            jSONObject.put("page", i3);
            jSONObject.put("pagecount", i2);
            jSONObject.put("limit", 30);
            String strB = "total";
            if (i2 <= 1) {
                length = jSONArray.length();
            } else {
                length = i2 * 30;
            }
            jSONObject.put(strB, length);
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String detailContent(List<String> list) {
        try {
            g9 g9VarL8 = YS.l8(Yy.v("https://vip.wwgz.cn:5200/vod-detail-id-" + list.get(0) + ".html", S("")));
            g9 g9VarL82 = YS.l8(Yy.v("https://vip.wwgz.cn:5200/vod-play-id-" + list.get(0) + "-src-1-num-1.html", S("")));
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String strL8 = g9VarL8.LD("section.page-hd a img").l8("src");
            String strOL = g9VarL8.LD("h1.title a").OL();
            jk jkVarLD = g9VarL8.LD("section.page-bd div.desc_item");
            int i = 0;
            while (i < jkVarLD.size()) {
                Iw iw = jkVarLD.get(i);
                jk jkVarLD2 = iw.LD("span");
                if (jkVarLD2 != null) {
                    String strOL2 = jkVarLD2.OL();
                    String strC = "a";
                    if (strOL2.contains("导演")) {
                        jSONObject2.put("vod_director", iw.LD(strC).OL());
                    } else if (strOL2.contains("主演")) {
                        jSONObject2.put("vod_actor", iw.LD(strC).OL());
                    } else if (strOL2.contains("状态")) {
                        jSONObject2.put("vod_remark", iw.LD("font").OL());
                    } else if (strOL2.contains("年代")) {
                        jSONObject2.put("vod_year", iw.LD(strC).OL());
                    }
                }
                i++;
            }
            String strTrim = g9VarL8.pu("article.detail-con>p").GO().trim();
            jSONObject2.put("vod_id", list.get(0));
            jSONObject2.put("vod_name", strOL);
            jSONObject2.put("vod_pic", strL8);
            jSONObject2.put("vod_content", "此接口完全免费，请勿上当受骗！！" + strTrim);
            Matcher matcher = this.v.matcher(g9VarL82.LD("div.detailPosterIntro script").get(0).Xc().trim());
            boolean zFind = matcher.find();
            if (zFind) {
                String strGroup = matcher.group(1);
                jSONObject2.put("vod_play_from", "蓝光");
                jSONObject2.put("vod_play_url", strGroup);
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject2);
                jSONObject.put("list", jSONArray);
                return jSONObject.toString();
            } else {
                return "";
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String homeContent(boolean z) {
        jk jkVarLD;
        JSONArray jSONArray;
        int i;
        String strB = "li a";
        try {
            g9 g9VarL8 = YS.l8(Yy.v("https://vip.wwgz.cn:5200", S("")));
            jk jkVarLD2 = g9VarL8.LD("div#topnav ul.swiper-wrapper li a");
            JSONArray jSONArray2 = new JSONArray();
            Iterator<Iw> it = jkVarLD2.iterator();
            while (it.hasNext()) {
                Iw next = it.next();
                String strGO = next.GO();
                boolean z2 = false;
                String strB2 = "href";
                if (strGO.equals("电影") || strGO.equals("连续剧") || strGO.equals("综艺") || strGO.equals("动漫") || strGO.equals("短剧")) {
                    z2 = true;
                    Matcher matcher = this.T4.matcher(next.T4(strB2));
                    boolean zFind = matcher.find();
                    if (zFind) {
                        String strTrim = matcher.group(1).trim();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("type_id", strTrim);
                        jSONObject.put("type_name", strGO);
                        jSONArray2.put(jSONObject);
                    }
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            if (z) {
                jSONObject2.put("filters", this.S);
            }
            jSONObject2.put("class", jSONArray2);
            try {
                jkVarLD = g9VarL8.LD("ul.resize_list");
                jSONArray = new JSONArray();
                i = 0;
            } catch (Exception e) {
                SpiderDebug.log(e);
                return jSONObject2.toString();
            }
            while (i < jkVarLD.size()) {
                Iw iw = jkVarLD.get(i);
                String strL8 = iw.LD(strB).l8("title");
                String strL82 = iw.LD("li a div.pic img").l8("src");
                String strOL = iw.LD("li a div.pic span.sBottom span").OL();
                Matcher matcher2 = this.l.matcher(iw.LD(strB).l8(strB2));
                boolean zFind2 = matcher2.find();
                if (zFind2) {
                    String strGroup = matcher2.group(1);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("vod_id", strGroup);
                    jSONObject3.put("vod_name", strL8);
                    jSONObject3.put("vod_pic", strL82);
                    jSONObject3.put("vod_remarks", strOL);
                    jSONArray.put(jSONObject3);
                }
                i++;
            }
            jSONObject2.put("list", jSONArray);
            return jSONObject2.toString();
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context);
        l8 = C1370pv.l(str);
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            Init2.lj();
            JSONObject jSONObject = new JSONObject();
            String str3 = l8 + str2;
            Matcher matcher = Pattern.compile("var url='(.*)';").matcher(Yy.v(str3, S(str3)));
            boolean zFind = matcher.find();
            if (zFind) {
                String strGroup = matcher.group(1);
                jSONObject.put("parse", 0);
                jSONObject.put("url", strGroup);
                return jSONObject.toString();
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    public String searchContent(String str, boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            String strE = "https://vip.wwgz.cn:5200/index.php?m=vod-search";
            HashMap map = new HashMap();
            map.put("wd", str);
            Yy.tT(Yy.T4(), strE, map, S(""), new xx.ut(this, jSONArray) {

                private static final short[] f41short = {827, 802, 877, 810, 815, 826, 815, 785, 802, 807, 829, 826, 878, 802, 807, 2450, 2463, 2432, 2520, 2434, 2446, 2434, 2494, 2451, 2463, 2449, 2462, 2434, 2518, 2437, 2438, 2455, 2456, 2520, 2437, 2466, 2463, 2434, 2619, 2614, 2601, 2673, 2607, 2614, 2620, 2687, 2622, 2687, 2614, 2610, 2616, 2478, 2479, 2494, 2993, 3004, 2979, 3067, 2981, 3004, 2998, 3061, 2996, 1721, 1699, 1716, 1719, 541, 516, 527, 564, 514, 527, 1141, 1132, 1127, 1116, 1133, 1122, 1134, 1126, 2450, 2443, 2432, 2491, 2452, 2445, 2439, 820, 813, 806, 797, 816, 807, 815, 803, 816, 809, 817};
                final JSONArray S;
                final Nmvod T4;

                {
                    this.T4 = this;
                    this.S = jSONArray;
                }

                @Override
                public void onFailure(Call call, Exception exc) {
                }

                @Override
                public String onResponse(String str2) {
                    jk jkVarLD;
                    int i;
                    try {
                        jkVarLD = YS.l8(str2).LD("ul#data_list li");
                        i = 0;
                    } catch (JSONException e) {
                        return str2;
                    }
                    while (i < jkVarLD.size()) {
                        Iw iw = jkVarLD.get(i);
                        String strOL = iw.LD("div.txtHeight span.sTit").OL();
                        String strL8 = iw.LD("div.pic a img").l8("src");
                        Matcher matcher = this.T4.l.matcher(iw.LD("div.pic a").get(0).T4("href"));
                        boolean zFind = matcher.find();
                        if (zFind) {
                            String strGroup = matcher.group(1);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("vod_id", strGroup);
                            jSONObject.put("vod_name", strOL);
                            jSONObject.put("vod_pic", strL8);
                            jSONObject.put("vod_remarks", "");
                            this.S.put(jSONObject);
                        }
                        i++;
                    }
                    return str2;
                }
            });
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }
}
