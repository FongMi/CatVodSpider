package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.g;
import com.github.catvod.spider.merge.C0948d;
import com.github.catvod.spider.merge.C1024e;
import com.github.catvod.spider.merge.C1080f;
import com.github.catvod.spider.merge.C1200g;
import com.github.catvod.spider.merge.C1228h;
import com.github.catvod.spider.merge.C1370pv;
import com.github.catvod.spider.merge.Yy;
import com.github.catvod.spider.merge.xv;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppV6 extends Spider {

    private static final short[] f3short = {2546, 2547, 2529, 2509, 2485, 1024, 1051, 1049, 1044, 1424, 1409, 1434, 1469, 1428, 1439, 1430, 1413, 1433, 661, 666, 1315, 1325, 844, 859, 845, 884, 877, 870, 861, 880, 871, 879, 867, 880, 873, 881, 1926, 1951, 1940, 1967, 1920, 1945, 1939, 2716, 2713, 2717, 2713, 2692, 1496, 1473, 1482, 1521, 1472, 1487, 1475, 1483, 3192, 3177, 3183, 3181, 2398, 2375, 2380, 2423, 2369, 2380, 3028, 3013, 3011, 3009, 3015, 3019, 3025, 3018, 3024, 1224, 1235, 1224, 1245, 1232, 565, 620, 556, 565, 620, 627, 638, 639, 629, 549, 618, 637, 551, 969, 923, 902, 907, 978, 2813, 2744, 2743, 2746, 2728, 2728, 2790, 2813, 2746, 2729, 2750, 2746, 2790, 2813, 2743, 2746, 2741, 2748, 2790, 2813, 2722, 2750, 2746, 2729, 2790, 2813, 2740, 2729, 2751, 2750, 2729, 2790, 2735, 2738, 2742, 2750, 2813, 2735, 2740, 2736, 2750, 2741, 2790, 2813, 2744, 2728, 2729, 2749, 2790, 1325, 399, 394, 415, 394, 3003, 3006, 2980, 2979, 1077, 2131, 2131, 2131, 1955, 1978, 1969, 1930, 1974, 1978, 1979, 1953, 1968, 1979, 1953, 752, 745, 738, 729, 738, 751, 756, 739, 741, 754, 745, 756, 1648, 1641, 1634, 1625, 1639, 1637, 1650, 1641, 1652, 2632, 2641, 2650, 2657, 2636, 2651, 2643, 2655, 2636, 2645, 2637, 653, 660, 671, 676, 666, 649, 670, 666, 624, 617, 610, 601, 639, 611, 615, 628, 3058, 3051, 3040, 3035, 3060, 3053, 3047, 1243, 1218, 1225, 1266, 1219, 1228, 1216, 1224, 1792, 1817, 1810, 1833, 1823, 1810, 723, 650, 714, 723, 650, 661, 664, 665, 659, 675, 664, 665, 648, 669, 661, 656, 707, 661, 664, 705, 2923, 2862, 2854, 2928, 1685, 1735, 1756, 1752, 1750, 1757, 1678, 1685, 1731, 1752, 1754, 1751, 1678, 1731, 1752, 1754, 1751, 1685, 1744, 1728, 1729, 1749, 1678, 2082, 2909, 2884, 2895, 2932, 2882, 2885, 2893, 2884, 2070, 2067, 2054, 2067, 2582, 2575, 2564, 2623, 2581, 2578, 2572, 2623, 2583, 2569, 2580, 2568, 2623, 2576, 2572, 2561, 2585, 2565, 2578, 511, 494, 509, 508, 490, 464, 508, 490, 492, 509, 490, 507, 3029, 3026, 3020, 1473, 1497, 1489, 1503, 1498, 1497, 2008, 1993, 2010, 2011, 1997, 2039, 1993, 2008, 1985, 641, 654, 642, 650, 2195, 2038, 1937, 1949, 1942, 1943, 3278, 3287, 3292, 3303, 3272, 3284, 3289, 3265, 3303, 3294, 3274, 3287, 3285, 506, 483, 488, 467, 508, 480, 493, 501, 467, 505, 510, 480, 276, 273, 267, 268, 2053, 2072, 2076, 2068, 2773, 2772, 2758, 2794, 2706, 2413, 2428, 2407, 2368, 2409, 2402, 2411, 2424, 2404, 2336, 2359, 2347, 2350, 2342, 2326, 2347, 2351, 2343, 2400, 2401, 2419, 2328, 2317, 3187, 3198, 3191, 3170, 3160, 3182, 3171, 1470, 1459, 1466, 1455, 1429, 1444, 1451, 1447, 1455, 344, 257, 321, 344, 281, 278, 257, 328, 259, 280, 284, 274, 281, 330, 337, 276, 260, 261, 273, 330, 1113, 2923, 2926, 2939, 2926, 1850, 1845, 1848, 1834, 1834, 2337, 2360, 2355, 2312, 2341, 2354, 2362, 2358, 2341, 2364, 2340, 2607, 2614, 2621, 2566, 2601, 2608, 2618, 2599, 2622, 2613, 2574, 2623, 2608, 2620, 2612, 3050, 3059, 3064, 3011, 3061, 3064, 3171, 3130, 3194, 3171, 3109, 3106, 3112, 3113, 3124, 3091, 3130, 3109, 3112, 3113, 3107, 3187, 3128, 3107, 3111, 3113, 3106, 3185, 3178, 3119, 3135, 3134, 3114, 3185, 2707, 495, 490, 511, 490, 3057, 3051, 3054, 3060, 3059, 2668, 2665, 2675, 2676, 1482, 1514, 1030, 1031, 1045, 1081, 1089, 1852, 1837, 1846, 1809, 1848, 1843, 1850, 1833, 1845, 2984, 3007, 2979, 2982, 2990, 3047, 3006, 2979, 2983, 2991, 808, 807, 2084, 2090, 2127, 2132, 2134, 2139, 453, 466, 452, 538, 538, 538, 420, 466, 3167, 3143, 3151, 3137, 3140, 3143, 2854, 2871, 2852, 2853, 2867, 1033, 1038, 1040, 419, 480, 446, 504, 437, 1930, 1993, 2004, 1936, 2870, 1964, 2725, 2727, 1624, 1537, 1601, 1624, 1540, 1554, 1556, 1541, 1554, 1539, 1576, 1543, 1558, 1541, 1540, 1554, 1576, 1558, 1543, 1566, 1576, 1538, 1541, 1563, 1608, 1540, 1576, 1538, 1541, 1563, 1610, 380, 302, 309, 305, 319, 308, 359, 380, 313, 297, 296, 316, 359, 1204, 1201, 1188, 1201, 2760, 2769, 2778, 2785, 2764, 2779, 2771, 2783, 2764, 2773, 2765, 2726, 2751, 2740, 2703, 2720, 2745, 2739, 1345, 1368, 1363, 1384, 1369, 1366, 1370, 1362, 2712, 2689, 2698, 2737, 2695, 2698, 576, 537, 601, 576, 540, 522, 526, 541, 524, 519, 592, 543, 520, 594, 606, 585, 539, 518, 523, 594, 607, 585, 539, 522, 535, 539, 594, 3005, 3055, 3060, 3056, 3070, 3061, 2982, 3005, 3064, 3048, 3049, 3069, 2982, 2627, 1065, 1068, 1081, 1068, 2508, 2505, 2515, 2516, 2100, 2070, 2101, 2091, 2059, 2054, 2079, 2088, 2059, 2057, 2051, 2107, 2101, 2057, 2079, 2145, 2099, 2147, 2144, 2086, 2056, 2057, 2079, 2091, 2101, 2147, 2152, 2088, 2059, 2073, 2079, 2148, 2099, 2054, 2075, 2087, 2099, 2064, 2156, 2156, 25278, 25760, 24266, 29640, 24319, -29973};
    private String HM;
    private JSONObject N;
    private String OL;
    private String b;
    private String l;
    private String tT;
    private String l8 = "";
    private String S = "";
    private String T4 = "";

    public AppV6() {
    }

    private java.util.HashMap<java.lang.String, java.lang.String> l8(java.lang.String r8) {
        // TODO: Method not decompiled by JADX - needs manual reconstruction
        return new HashMap<>();
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            String str3 = this.l8 + "/v6/video?pg=" + str2 + "&tid=" + str + "&class=&area=&lang=&year=&order=time&token=&csrf=" + getCsrf(String.valueOf(System.currentTimeMillis()));
            String strV = Yy.v(str3, l8(str3));
            JSONObject jSONObject;
            if (strV.contains("{")) {
                jSONObject = new JSONObject(strV);
            } else {
                jSONObject = new JSONObject(xv.l8(splitData(strV), this.S));
            }
            JSONArray jSONArray = jSONObject.getJSONArray("data");
            JSONArray jSONArray2 = new JSONArray();
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i3);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("vod_id", jSONObjectOptJSONObject.optString("vod_id"));
                jSONObject4.put("vod_name", jSONObjectOptJSONObject.optString("vod_name"));
                jSONObject4.put("vod_pic", jSONObjectOptJSONObject.optString("vod_pic"));
                jSONObject4.put("vod_remarks", jSONObjectOptJSONObject.optString("vod_remarks"));
                jSONArray2.put(jSONObject4);
            }
            int i7 = jSONObject.getInt("total");
            int i8 = jSONObject.getInt("pagecount");
            jSONObject2.put("page", jSONObject.getInt("page"));
            jSONObject2.put("pagecount", i8);
            jSONObject2.put("limit", jSONObject.getInt("limit"));
            jSONObject2.put("total", i7);
            jSONObject2.put("list", jSONArray2);
            return jSONObject2.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public String detailContent(List<String> list) {
        try {
            String strValueOf = String.valueOf(System.currentTimeMillis());
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            StringBuilder sb = new StringBuilder();
            sb.append(this.l8);
            sb.append(com.github.catvod.parser."/v6/video_detail?id=");
            sb.append(list.get(0));
            sb.append("&ck=");
            sb.append(getCk(strValueOf));
            sb.append("&token=&pkid=pkid&csrf=");
            sb.append(getCsrf(strValueOf));
            String string = sb.toString();
            String strV = Yy.v(string, l8(string));
            JSONObject jSONObjectOptJSONObject;
            if (strV.contains("{")) {
                jSONObjectOptJSONObject = new JSONObject(strV).optJSONObject("data").optJSONObject("vod_info");
            } else {
                jSONObjectOptJSONObject = new JSONObject(xv.l8(splitData(strV), this.S)).optJSONObject("data").optJSONObject("vod_info");
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            jSONObject.put("vod_id", jSONObjectOptJSONObject.optString("vod_id"));
            jSONObject.put("vod_name", jSONObjectOptJSONObject.optString("vod_name"));
            jSONObject.put("vod_pic", jSONObjectOptJSONObject.optString("vod_pic"));
            jSONObject.put("vod_year", jSONObjectOptJSONObject.optString("vod_year"));
            jSONObject.put("vod_area", jSONObjectOptJSONObject.optString("vod_area"));
            jSONObject.put("vod_remarks", jSONObjectOptJSONObject.optString("vod_remarks"));
            jSONObject.put("vod_actor", jSONObjectOptJSONObject.optString("vod_actor"));
            jSONObject.put("vod_director", jSONObjectOptJSONObject.optString("vod_director"));
            jSONObject.put("vod_content", jSONObjectOptJSONObject.optString("vod_content"));
            JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("vod_url_with_player");
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i3);
                boolean z = jSONObjectOptJSONObject2.getBoolean("parse_secret");
                String strOptString = jSONObjectOptJSONObject2.optString("name");
                String strOptString2 = jSONObjectOptJSONObject2.optString("code");
                String parseApi = jSONObjectOptJSONObject2.optString(com.github.catvod.parser."parse_api");
                String url = jSONObjectOptJSONObject2.optString("url");
                if (z) {
                    String api = parseApi.isEmpty() ? "qiaoji" : parseApi;
                    String str = url + "*" + strOptString2 + "^" + api;
                    arrayList.add(strOptString);
                    arrayList2.add(str.replaceAll("#", "*" + strOptString2 + "^" + api + "#"));
                } else {
                    String api2 = parseApi.isEmpty() ? "qiaoji" : parseApi;
                    String str2 = url + "*" + api2;
                    arrayList.add(strOptString);
                    arrayList2.add(str2.replaceAll("#", "*" + api2 + "#"));
                }
            }
            String strJoin = TextUtils.join("$$$", arrayList);
            String strJoin2 = TextUtils.join("$$$", arrayList2);
            jSONObject.put("vod_play_from", strJoin);
            jSONObject.put("vod_play_url", strJoin2);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONObject);
            jSONObject2.put("list", jSONArray2);
            return jSONObject2.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public String getCk(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", str);
            jSONObject.put("rsaM5", this.b);
            jSONObject.put("apkLength", this.OL);
            jSONObject.put(com.github.catvod.parser."buildTime", this.l);
            System.out.println(jSONObject.toString());
            return URLEncoder.encode(xv.tT(String.valueOf(jSONObject), this.T4));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public String getCsrf(String str) {
        try {
            return URLEncoder.encode(xv.l(str, this.T4), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public String homeContent(boolean z) {
        try {
            String strV = Yy.v(this.l8 + "/v6/nav?token=&csrf=" + getCsrf(String.valueOf(System.currentTimeMillis())), l8(""));
            System.out.println(strV);
            JSONObject jSONObject;
            if (strV.contains("{")) {
                jSONObject = new JSONObject(strV);
            } else {
                jSONObject = new JSONObject(xv.l8(splitData(strV), this.S));
            }
            JSONArray jSONArray = jSONObject.getJSONArray(com.github.catvod.parser."data");
            JSONArray jSONArray2 = new JSONArray();
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i3);
                String strOptString = jSONObjectOptJSONObject.optString("type_name");
                jSONObject2.put("type_id", jSONObjectOptJSONObject.optString("type_id"));
                jSONObject2.put("type_name", strOptString);
                jSONArray2.put(jSONObject2);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("class", jSONArray2);
            return jSONObject3.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public String homeVideoContent() {
        try {
            String str = this.l8 + "/v6/index_video?token=&csrf=" + getCsrf(String.valueOf(System.currentTimeMillis()));
            System.out.println(str);
            String strV = Yy.v(str, l8(str));
            System.out.println(splitData(strV));
            System.out.println(xv.l8(splitData(strV), this.S));
            JSONObject jSONObject;
            if (strV.contains("{")) {
                jSONObject = new JSONObject(strV);
            } else {
                jSONObject = new JSONObject(xv.l8(splitData(strV), this.S));
            }
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = jSONObject.getJSONArray("data");
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                JSONArray jSONArrayOptJSONArray = jSONArray2.optJSONObject(i3).optJSONArray("vlist");
                for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i5);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("vod_id", jSONObjectOptJSONObject.optString("vod_id"));
                    jSONObject2.put("vod_name", jSONObjectOptJSONObject.optString("vod_name"));
                    jSONObject2.put("vod_pic", jSONObjectOptJSONObject.optString("vod_pic"));
                    jSONObject2.put("vod_remarks", jSONObjectOptJSONObject.optString("vod_remarks"));
                    jSONArray.put(jSONObject2);
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("list", jSONArray);
            return jSONObject3.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context, str);
        String[] strArrSplit = C1370pv.l(str).split(com.github.catvod.parser."\\|");
        this.l8 = strArrSplit[0];
        try {
            JSONObject jSONObject = new JSONObject(strArrSplit[1]);
            this.N = jSONObject;
            this.b = jSONObject.getString("rsaM5");
            this.OL = this.N.getString("apkLength");
            this.l = this.N.getString("build-time");
            this.S = this.N.getString("dk");
            this.T4 = this.N.getString("ek");
            this.tT = this.N.getString("pkid");
            System.out.println(this.T4);
            this.HM = this.N.getString("res");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            Init2.lj();
            JSONObject jSONObject = new JSONObject();
            String[] strArrSplit = str2.split("\\*");
            String str3 = strArrSplit[0];
            String str4 = strArrSplit[1];
            if (str4.contains(com.github.catvod.parser."qiaoji")) {
                jSONObject.put("parse", 0);
                jSONObject.put("url", str3);
            } else if (str3.contains(".m3u8")) {
                jSONObject.put("parse", 0);
                jSONObject.put("url", str3);
            } else if (str3.contains(".mp4")) {
                jSONObject.put("parse", 0);
                jSONObject.put("url", str3);
            } else {
                boolean zContains4 = str4.contains("^");
                if (zContains4) {
                    String strValueOf = String.valueOf(System.currentTimeMillis());
                    String[] strArrSplit2 = str2.split("\\^");
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.l8);
                    sb.append("/v6/secret_parse_api_url?s_url=");
                    sb.append(getCsrf(strValueOf + ";;;" + str3 + ";;;" + strArrSplit2[0]));
                    sb.append("&token=&csrf=");
                    sb.append(getCsrf(strValueOf));
                    String string = sb.toString();
                    System.out.println(string);
                    String strV2 = Yy.v(strArrSplit2[1] + string, l8(string));
                    String strOptString2;
                    if (strV2.contains("{")) {
                        strOptString2 = new JSONObject(strV2).optString("data");
                    } else {
                        strOptString2 = new JSONObject(xv.l8(splitData(strV2), this.S)).optString("data");
                    }
                    String strV3 = Yy.v(strArrSplit2[1] + strOptString2, l8(string));
                    String strOptString3;
                    if (strV3.contains("{")) {
                        strOptString3 = new JSONObject(strV3).optString("url");
                    } else {
                        strOptString3 = new JSONObject(xv.l8(strV3, this.S)).optString("url");
                    }
                    jSONObject.put("parse", 0);
                    jSONObject.put("url", strOptString3);
                } else {
                    String strV = Yy.v(str4 + str3, l8(""));
                    String strOptString;
                    if (strV.contains("{")) {
                        strOptString = new JSONObject(strV).optString("url");
                    } else {
                        strOptString = new JSONObject(xv.l8(strV, this.S)).optString("url");
                    }
                    jSONObject.put("parse", 0);
                    jSONObject.put("url", strOptString);
                }
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            System.out.println(th);
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str2 = this.l8 + "/v6/search?pg=1&tid=0&text=" + str + "&token=&csrf=" + getCsrf(String.valueOf(System.currentTimeMillis()));
            String strV = Yy.v(str2, l8(str2));
            System.out.println(strV);
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray;
            if (strV.contains("{")) {
                jSONArray = new JSONObject(strV).getJSONArray("data");
            } else {
                jSONArray = new JSONObject(xv.l8(splitData(strV), this.S)).getJSONArray("data");
            }
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i3);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vod_id", jSONObjectOptJSONObject.optString("vod_id"));
                jSONObject2.put("vod_name", jSONObjectOptJSONObject.optString("vod_name"));
                jSONObject2.put("vod_pic", jSONObjectOptJSONObject.optString("vod_pic"));
                jSONObject2.put("vod_remarks", jSONObjectOptJSONObject.optString("vod_remarks"));
                jSONArray2.put(jSONObject2);
            }
            jSONObject.put(com.github.catvod.parser."list", jSONArray2);
            return jSONObject.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public String splitData(String str) {
        try {
            String[] strArrSplit = str.split("eGdzZWNyZXRjdXN0b21wYXNzd29yZHN5bWJvbA==");
            String str2 = strArrSplit[0];
            int i = Integer.parseInt(new String(Base64.decode(strArrSplit[1], 0)));
            return Yy.v(this.HM + str2.substring(0, i), l8("")) + str2.substring(i);
        } catch (Exception e) {
            throw new RuntimeException("数据处理失败", e);
        }
    }
}
