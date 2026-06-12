package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.g;
import com.github.catvod.spider.merge.C0948d;
import com.github.catvod.spider.merge.C1024e;
import com.github.catvod.spider.merge.C1080f;
import com.github.catvod.spider.merge.C1200g;
import com.github.catvod.spider.merge.C1228h;
import com.github.catvod.spider.merge.C1370pv;
import com.github.catvod.spider.merge.Yy;
import com.github.catvod.spider.merge.ZP;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Jpys extends Spider {

    private static final short[] f33short = {512, 516, 519, 539, 539, 543, 576, 602, 577, 607, 577, 607, 578, 526, 515, 543, 519, 526, 577, 606, 603, 2175, 2169, 2159, 2168, 2087, 2155, 2157, 2159, 2148, 2174, 2445, 2444, 2463, 2432, 2442, 2444, 2432, 2445, 646, 679, 692, 683, 673, 679, 683, 678, 2673, 2635, 2629, 2636, 1563, 2118, 2115, 2137, 2142, 2612, 2682, 2667, 2674, 2612, 2678, 2668, 2614, 2678, 2676, 2669, 2674, 2686, 2612, 2682, 2677, 2676, 2677, 2658, 2678, 2676, 2670, 2664, 2612, 2669, 2674, 2687, 2686, 2676, 2612, 2679, 2674, 2664, 2671, 2596, 2671, 2658, 2667, 2686, 2602, 2598, 846, 792, 777, 783, 781, 806, 797, 773, 853, 1728, 1671, 1684, 1667, 1671, 1755, 1728, 1695, 1667, 1671, 1684, 1755, 2461, 2446, 2457, 2461, 2497, 2522, 2444, 2461, 2459, 2457, 2482, 2441, 2449, 2497, 2711, 2757, 2760, 2753, 2772, 2688, 2700, 1646, 1585, 1581, 1577, 1594, 1653, 1646, 1571, 1581, 1585, 1653, 1579, 1578, 1648, 1656, 1648, 1661, 1658, 1649, 1578, 1577, 1581, 1662, 1578, 1662, 1578, 1581, 1660, 1661, 1581, 1579, 1582, 1577, 1578, 1658, 1649, 1577, 1660, 1648, 1648, 1649, 1578, 1579, 1646, 1596, 1653, 2480, 2485, 2464, 2485, 785, 776, 771, 824, 782, 771, 2621, 2596, 2607, 2562, 2607, 2966, 2959, 2948, 3007, 2958, 2945, 2957, 2949, 784, 777, 770, 808, 775, 779, 771, 2959, 2966, 2973, 2982, 2953, 2960, 2970, 2346, 2355, 2360, 2316, 2357, 2367, 2890, 2899, 2904, 2926, 2905, 2897, 2909, 2894, 2903, 2895, 3101, 3078, 3103, 3103, 2401, 2424, 2419, 2376, 2405, 2418, 2426, 2422, 2405, 2428, 2404, 2872, 2857, 2863, 2861, 1385, 1400, 1406, 1404, 1402, 1398, 1388, 1399, 1389, 2159, 2154, 2158, 2154, 2167, 767, 740, 767, 746, 743, 1657, 1634, 1659, 1659, 395, 453, 468, 461, 395, 457, 467, 393, 457, 459, 466, 461, 449, 395, 453, 458, 459, 458, 477, 457, 459, 465, 471, 395, 466, 461, 448, 449, 459, 395, 448, 449, 464, 453, 461, 456, 411, 461, 448, 409, 2642, 2655, 2566, 1071, 1122, 1132, 1136, 1076, 1130, 1131, 1073, 1081, 1073, 1084, 1083, 1072, 1131, 1128, 1132, 1087, 1131, 1087, 1131, 1132, 1085, 1084, 1132, 1130, 1135, 1128, 1131, 1083, 1072, 1128, 1085, 1073, 1073, 1072, 1131, 1130, 1071, 1149, 1076, 946, 951, 930, 951, 275, 266, 257, 314, 268, 257, 2284, 2293, 2302, 2259, 2302, 913, 904, 899, 952, 905, 902, 906, 898, 1926, 1951, 1940, 1982, 1937, 1949, 1941, 3122, 3115, 3104, 3099, 3124, 3117, 3111, 1992, 2001, 2010, 2030, 2007, 2013, 622, 611, 618, 639, 581, 628, 635, 631, 639, 1930, 1927, 1934, 1947, 1968, 1951, 1939, 1947, 1539, 1562, 1553, 1578, 1548, 1552, 1556, 1543, 3159, 3150, 3141, 3192, 3140, 3136, 3155, 2132, 2125, 2118, 2173, 2115, 2128, 2119, 2115, 410, 387, 392, 429, 414, 393, 397, 1891, 1914, 1905, 1863, 1904, 1912, 1908, 1895, 1918, 1894, 2918, 2943, 2932, 2895, 2914, 2933, 2941, 2929, 2914, 2939, 2915, 1013, 1004, 999, 988, 994, 992, 1015, 1004, 1009, 2684, 2661, 2670, 2635, 2665, 2686, 2661, 2680, 3128, 3105, 3114, 3089, 3114, 3111, 3132, 3115, 3117, 3130, 3105, 3132, 821, 812, 807, 775, 810, 817, 806, 800, 823, 812, 817, 2992, 2985, 2978, 2949, 2985, 2984, 2994, 2979, 2984, 2994, 799, 774, 781, 822, 778, 774, 775, 797, 780, 775, 797, 27968, 25985, 21959, 23976, 22348, 22377, -29923, -1752, -29229, 21723, 18478, 22903, 22003, -25421, -1755, -1755, 257, 276, 269, 279, 267, 256, 257, 296, 269, 279, 272, 862, 849, 861, 853, 1915, 1098, 1101, 1088, 1558, 1188, 994, 994, 994, 1267, 1258, 1249, 1242, 1269, 1257, 1252, 1276, 1242, 1251, 1271, 1258, 1256, -28855, 23261, 29254, 28473, 1736, 1745, 1754, 1761, 1742, 1746, 1759, 1735, 1761, 1739, 1740, 1746, 1585, 1588, 1582, 1577, 768, 800, 889, 815, 802, 811, 830, 772, 818, 831, 889, 865, 889, 874, 889, 887, 889, 815, 802, 811, 830, 772, 821, 826, 822, 830, 889, 865, 889, 30318, 23594, 889, 806, 887, 800, 889, 815, 802, 811, 830, 772, 818, 831, 889, 865, 889, 873, 889, 887, 889, 815, 802, 811, 830, 772, 821, 826, 822, 830, 889, 865, 889, 30318, -30051, 20796, 889, 806, 887, 800, 889, 815, 802, 811, 830, 772, 818, 831, 889, 865, 889, 872, 889, 887, 889, 815, 802, 811, 830, 772, 821, 826, 822, 830, 889, 865, 889, 32167, -32479, 889, 806, 887, 800, 889, 815, 802, 811, 830, 772, 818, 831, 889, 865, 889, 879, 889, 887, 889, 815, 802, 811, 830, 772, 821, 826, 822, 830, 889, 865, 889, 20979, 27760, 889, 806, 774, 2230, 2233, 2228, 2214, 2214, 1134, 1056, 1073, 1064, 1134, 1068, 1078, 1132, 1068, 1070, 1079, 1064, 1060, 1134, 1056, 1071, 1070, 1071, 1080, 1068, 1070, 1076, 1074, 1134, 1065, 1070, 1068, 1060, 1134, 1065, 1070, 1077, 1042, 1060, 1056, 1075, 1058, 1065, 1965, 1955, 1983, 2043, 1957, 1956, 2046, 2038, 2046, 2035, 2036, 2047, 1956, 1959, 1955, 2032, 1956, 2032, 1956, 1955, 2034, 2035, 1955, 1957, 1952, 1959, 1956, 2036, 2047, 1959, 2034, 2046, 2046, 2047, 1956, 1957, 2016, 1970, 2043, 461, 456, 477, 456, 2684, 2661, 2670, 2627, 2670, 2183, 2206, 2197, 2239, 2192, 2204, 2196, 1638, 1663, 1652, 1600, 1657, 1651, 2647, 2638, 2629, 2675, 2628, 2636, 2624, 2643, 2634, 2642, 696, 673, 682, 657, 679, 682, 1325, 1332, 1343, 1284, 1333, 1338, 1334, 1342, 2965, 2956, 2951, 3004, 2963, 2954, 2944, 1239, 1230, 1221, 1278, 1235, 1220, 1228, 1216, 1235, 1226, 1234, 1148, 1145, 1123, 1124, 2943, 2938, 2927, 2938, 755, 699, 700, 689, 744, 2875, 2876, 2850, 1960, 1928, 1120, 1070, 1087, 1062, 1120, 1058, 1080, 1122, 1058, 1056, 1081, 1062, 1066, 1120, 1070, 1057, 1056, 1057, 1078, 1058, 1056, 1082, 1084, 1120, 1081, 1149, 1120, 1081, 1062, 1067, 1066, 1056, 1120, 1066, 1087, 1062, 1084, 1056, 1067, 1066, 1120, 1082, 1085, 1059, 1136, 1068, 1059, 1062, 1066, 1057, 1083, 1051, 1078, 1087, 1066, 1138, 1148, 1129, 1062, 1067, 1138, 979, 988, 985, 981, 990, 964, 996, 969, 960, 981, 909, 899, 918, 985, 980, 909, 1207, 1274, 1268, 1256, 1196, 1266, 1267, 1193, 1185, 1193, 1188, 1187, 1192, 1267, 1264, 1268, 1191,
    1267, 1191, 1267, 1268, 1189, 1188, 1268, 1266, 1271, 1264, 1267, 1187, 1192, 1264, 1189, 1193, 1193, 1192, 1267, 1266, 1207, 1253, 1196, 390, 387, 409, 414, 2714, 2699, 2712, 2713, 2703, 802, 830, 819, 811, 775, 800, 830, 2840, 2845, 2823, 2816, 2361, 2423, 2406, 2431, 2361, 2427, 2401, 2363, 2427, 2425, 2400, 2431, 2419, 2361, 2423, 2424, 2425, 2424, 2415, 2427, 2425, 2403, 2405, 2361, 2400, 2431, 2418, 2419, 2425, 2361, 2405, 2419, 2423, 2404, 2421, 2430, 2388, 2415, 2369, 2425, 2404, 2418, 2345, 2429, 2419, 2415, 2401, 2425, 2404, 2418, 2347, 3259, 3309, 3324, 3322, 3320, 3283, 3304, 3312, 3232, 3244, 3259, 3309, 3324, 3322, 3320, 3278, 3316, 3303, 3320, 3232, 3237, 1877, 1883, 1863, 1865, 1873, 1868, 1882, 1795, 3217, 3271, 3286, 3280, 3282, 3321, 3266, 3290, 3210, 3206, 3217, 3271, 3286, 3280, 3282, 3300, 3294, 3277, 3282, 3210, 3215, 3217, 3292, 3282, 3278, 3210, 3284, 3285, 3215, 3207, 3215, 3202, 3205, 3214, 3285, 3286, 3282, 3201, 3285, 3201, 3285, 3282, 3203, 3202, 3282, 3284, 3281, 3286, 3285, 3205, 3214, 3286, 3203, 3215, 3215, 3214, 3285, 3284, 3217, 3267, 3210, 1092, 1089, 1108, 1089, 1498, 1485, 1499, 1501, 1476, 1500, 2108, 2085, 2094, 2069, 2083, 2094, 1335, 1326, 1317, 1288, 1317, 2647, 2638, 2629, 2686, 2639, 2624, 2636, 2628, 2131, 2122, 2113, 2155, 2116, 2120, 2112, 698, 675, 680, 659, 700, 677, 687, 1686, 1679, 1668, 1712, 1673, 1667, 690, 683, 672, 662, 673, 681, 677, 694, 687, 695, 1772, 1783, 1774, 1774, 2692, 2717, 2710, 2733, 2688, 2711, 2719, 2707, 2688, 2713, 2689};
    private String l8 = "";
    private String S = "okhttp/5.0.0-alpha.14";
    private String T4 = "";

    public Jpys() {
    }

    private HashMap<String, String> S(String str, String str2) {
        HashMap<String, String> map = new HashMap<>();
        map.put("user-agent", this.S);
        map.put("deviceid", "Deviceid");
        map.put("t", str2);
        return map;
    }

    private void l8() {
        this.l8 = C1370pv.l(this.T4);
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            if (this.l8.isEmpty()) {
                l8();
            }
            int page = Integer.parseInt(str2);
            if (page == 0) {
                page = 1;
            }
            String url = this.l8 + "/api/mw-movie/anonymous/video/list?type1=" + str + "&pageNum=" + str2 + "&area=&year=";
            JSONArray jSONArray = new JSONArray();
            String timestamp = String.valueOf(System.currentTimeMillis());
            JSONArray list = new JSONObject(Yy.v(url, S("area=&pageNum=" + str2 + "&type1=" + str + "&year=&key=cb808529bae6b6be45ecfab29a4889bc&t=" + timestamp, timestamp))).optJSONObject("data").getJSONArray("list");
            for (int i = 0; i < list.length(); i++) {
                JSONObject item = list.optJSONObject(i);
                JSONObject vod = new JSONObject();
                vod.put("vod_id", item.optString("vodId"));
                vod.put("vod_name", item.optString("vodName"));
                vod.put("vod_pic", item.optString("vodPic"));
                String remarks = item.optString("vodRemarks");
                if (remarks.equals("null")) {
                    remarks = "";
                }
                vod.put("vod_remarks", remarks);
                jSONArray.put(vod);
            }
            JSONObject result = new JSONObject();
            result.put("page", page);
            if (jSONArray.length() == 48) {
                page++;
            }
            result.put("pagecount", page);
            result.put("limit", 48);
            result.put("total", Integer.MAX_VALUE);
            result.put("list", jSONArray);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String detailContent(List<String> list) {
        int i = 0;
        String strE = "null";
        try {
            if (this.l8.isEmpty()) {
                l8();
            }
            ArrayList<String> episodes = new ArrayList<>();
            String url = this.l8 + "/api/mw-movie/anonymous/video/detail?id=" + list.get(0);
            JSONObject vod = new JSONObject();
            String timestamp = String.valueOf(System.currentTimeMillis());
            JSONObject data = new JSONObject(Yy.v(url, S("id=" + list.get(0) + "&key=cb808529bae6b6be45ecfab29a4889bc&t=" + timestamp, timestamp))).optJSONObject("data");
            vod.put("vod_id", data.optString("vodId"));
            vod.put("vod_name", data.optString("vodName"));
            vod.put("vod_pic", data.optString("vodPic"));
            vod.put("type_name", data.optString("typeName"));
            vod.put("vod_year", data.optString("vodYear"));
            vod.put("vod_area", data.optString("vodArea"));
            String remarks = data.optString("vodRemarks");
            if (remarks.equals(strE)) {
                remarks = "";
            }
            vod.put("vod_remarks", remarks);
            vod.put("vod_actor", data.optString("vodActor"));
            vod.put("vod_director", data.optString("vodDirector"));
            String content = data.optString("vodContent");
            if (content.equals(strE)) {
                content = "";
            }
            vod.put("vod_content", "此接口完全免费，请勿上当受骗！！" + content);
            JSONArray episodeList = data.getJSONArray("episodeList");
            ArrayList<String> episodeUrls = new ArrayList<>();
            for (i = 0; i < episodeList.length(); i++) {
                JSONObject ep = episodeList.optJSONObject(i);
                episodeUrls.add(ep.optString("name") + "$" + ep.optString("nid") + "|" + list.get(0));
            }
            episodes.add(TextUtils.join("#", episodeUrls));
            String playUrl = TextUtils.join("$$$", episodes);
            vod.put("vod_play_from", "蓝光秒播");
            vod.put("vod_play_url", playUrl);
            JSONObject result = new JSONObject();
            JSONArray list2 = new JSONArray();
            list2.put(vod);
            result.put("list", list2);
            return result.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public String homeContent(boolean z) {
        try {
            if (this.l8.isEmpty()) {
                l8();
            }
            JSONObject result = new JSONObject();
            result.put("class", new JSONArray("[{\"type_id\":\"1\",\"type_name\":\"电影\"},{\"type_id\":\"2\",\"type_name\":\"电视剧\"},{\"type_id\":\"3\",\"type_name\":\"综艺\"},{\"type_id\":\"4\",\"type_name\":\"动漫\"}]"));
            return result.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public String homeVideoContent() {
        try {
            if (this.l8.isEmpty()) {
                l8();
            }
            JSONArray jSONArray = new JSONArray();
            String url = this.l8 + "/api/mw-movie/anonymous/home/hotSearch";
            String timestamp = String.valueOf(System.currentTimeMillis());
            JSONArray list = new JSONObject(Yy.v(url, S("key=cb808529bae6b6be45ecfab29a4889bc&t=" + timestamp, timestamp))).getJSONArray("data");
            for (int i = 0; i < list.length(); i++) {
                JSONObject item = list.optJSONObject(i);
                JSONObject vod = new JSONObject();
                vod.put("vod_id", item.optString("vodId"));
                vod.put("vod_name", item.optString("vodName"));
                vod.put("vod_pic", item.optString("vodPic"));
                vod.put("vod_remarks", item.optString("vodRemarks"));
                jSONArray.put(vod);
            }
            JSONObject result = new JSONObject();
            result.put("list", jSONArray);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context);
        this.T4 = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String result;
        try {
            Init2.lj();
            String[] parts = str2.split("\\|");
            String nid = parts[0];
            String id = parts[1];
            String url = this.l8 + "/api/mw-movie/anonymous/v2/video/episode/url?clientType=3&id=" + id + "&nid=" + nid;
            String timestamp = String.valueOf(System.currentTimeMillis());
            JSONObject episodeData = new JSONObject(Yy.v(url, S("clientType=3&id=" + id + "&nid=" + nid + "&key=cb808529bae6b6be45ecfab29a4889bc&t=" + timestamp, timestamp))).getJSONObject("data").optJSONArray("list").getJSONObject(0);
            if (episodeData.has("url")) {
                String videoUrl = episodeData.optString("url");
                JSONObject playResult = new JSONObject();
                playResult.put("url", videoUrl);
                playResult.put("parse", 0);
                result = playResult.toString();
            } else {
                String videoUrl = episodeData.optJSONObject("data").optString("playUrl");
                JSONObject playResult = new JSONObject();
                playResult.put("url", videoUrl);
                playResult.put("parse", 0);
                result = playResult.toString();
            }
            return result;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            if (this.l8.isEmpty()) {
                l8();
            }
            String url = this.l8 + "/api/mw-movie/anonymous/video/searchByWord?keyword=" + URLEncoder.encode(str) + "&pageNum=1&pageSize=8";
            String timestamp = String.valueOf(System.currentTimeMillis());
            JSONArray list = new JSONObject(Yy.v(url, S("keyword=" + str + "&pageNum=1&pageSize=8&key=cb808529bae6b6be45ecfab29a4889bc&t=" + timestamp, timestamp))).optJSONObject("data").optJSONObject("result").getJSONArray("list");
            for (int i = 0; i < list.length(); i++) {
                JSONObject item = list.optJSONObject(i);
                JSONObject vod = new JSONObject();
                vod.put("vod_id", item.optString("vodId"));
                vod.put("vod_name", item.optString("vodName"));
                vod.put("vod_pic", item.optString("vodPic"));
                String remarks = item.optString("vodRemarks");
                if (remarks.equals("null")) {
                    remarks = "";
                }
                vod.put("vod_remarks", remarks);
                jSONArray.put(vod);
            }
            JSONObject result = new JSONObject();
            result.put("list", jSONArray);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
