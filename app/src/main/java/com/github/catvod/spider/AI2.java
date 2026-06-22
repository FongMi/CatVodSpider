package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C1370pv;
import com.github.catvod.spider.merge.Yy;
import com.github.catvod.spider.merge.ZP;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AI2 extends Spider {

    private static final short[] f1short = {1919, 1881, 1871, 1880, 1799, 1899, 1869, 1871, 1860, 1886, 1197, 1215, 1207, 1190, 1203, 1199, 2988, 1718, 1556, 1556, 1556, 2317, 2324, 2335, 2340, 2328, 2324, 2325, 2319, 2334, 2325, 2319, 1990, 2015, 2004, 2031, 2004, 2009, 1986, 2005, 2003, 1988, 2015, 1986, 3023, 3030, 3037, 3046, 3032, 3034, 3021, 3030, 3019, 1052, 1029, 1038, 1077, 1048, 1039, 1031, 1035, 1048, 1025, 1049, 3296, 3321, 3314, 3273, 3319, 3300, 3315, 3319, 2232, 2209, 2218, 2193, 2231, 2219, 2223, 2236, 2969, 2944, 2955, 2992, 2975, 2950, 2956, 2791, 2814, 2805, 2766, 2815, 2800, 2812, 2804, 2902, 2895, 2884, 2943, 2889, 2884, 3175, 3113, 3128, 3105, 3174, 3128, 3104, 3128, 3175, 3113, 3128, 3128, 3175, 3134, 3105, 3116, 3117, 3111, 3095, 3116, 3117, 3132, 3113, 3105, 3108, 3191, 3105, 3116, 3189, 1282, 1287, 1298, 1287, 2874, 2851, 2856, 2835, 2873, 2878, 2848, 2835, 2875, 2853, 2872, 2852, 2835, 2876, 2848, 2861, 2869, 2857, 2878, 937, 932, 941, 952, 898, 947, 956, 944, 952, 1355, 1362, 1369, 1378, 1374, 1361, 1372, 1358, 1358, 24911, 27022, 22984, 20903, 23363, 23398, -30958, -2777, -32292, 22740, 17441, 21880, 23036, -28484, -2774, -2774, 798, 785, 797, 789, 879, 867, 872, 873, 1508, 1507, 1533, 2623, 2598, 2605, 2582, 2617, 2597, 2600, 2608, 2582, 2607, 2619, 2598, 2596, 2179, 2202, 2193, 2218, 2181, 2201, 2196, 2188, 2218, 2176, 2183, 2201, 1193, 1196, 1206, 1201, -29725, 26000, 21363, -26834, -30259, -31860, 28159, -25822, 29953, 822, 804, 829, 812, 821, 2649, 2681, 661, 739, 1630, 1656, 1646, 1657, 1574, 1610, 1644, 1646, 1637, 1663, 2026, 1927, 1957, 1968, 1955, 1958, 1958, 1963, 2021, 2047, 2020, 2042, 2026, 2018, 1961, 1957, 1959, 1978, 1963, 1982, 1955, 1960, 1958, 1967, 2033, 2026, 1927, 1945, 1923, 1935, 2026, 2045, 2020, 2042, 2033, 2026, 1949, 1955, 1956, 1966, 1957, 1981, 1977, 2026, 2035, 2047, 2033, 2026, 1950, 1976, 1955, 1966, 1967, 1956, 1982, 2021, 2047, 2020, 2042, 2019, 2023, 1945, 1950, 1974, 1948, 1552, 1548, 1548, 1544, 1916, 1901, 1918, 1919, 1897, 1686, 1681, 1679, 2786, 3037, 3024, 3028, 3025, 3024, 3015, 3310, 3302, 3310, 3302, 3310, 3302, 3310, 3251, 1526, 1523, 1510, 1523, 608, 626, 1917, 1827, 1893, 1832, 2414, 2419, 2359, 885, 876, 871, 860, 881, 870, 878, 866, 881, 872, 880, 1313, 1336, 1331, 1288, 1319, 1342, 1332, 2381, 2388, 2399, 2404, 2389, 2394, 2390, 2398, 3255, 3246, 3237, 3230, 3240, 3237, 405, 400, 394, 397, 404, 474, 459, 466, 405, 459, 467, 459, 404, 474, 459, 459, 404, 456, 478, 474, 457, 472, 467, 388, 459, 476, 390, 394, 413, 463, 478, 451, 463, 390};
    JSONArray l;
    private String l8 = "";
    private String S = "";
    private String T4 = "";
    private String b = "";
    private String OL = "";

    public AI2() {
    }

    private HashMap<String, String> S(String str) {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", this.S);
        return map;
    }

    private void l8() {
        try {
            String str = this.OL;
            this.l = new JSONObject(C1370pv.l8(Yy.v(str, S(str)), this.b)).getJSONArray("jxpath");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public String detailContent(List<String> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            StringBuilder sb = new StringBuilder();
            sb.append(this.l8);
            sb.append("/api.php/app/video_detail?id=");
            sb.append(list.get(0));
            String string = sb.toString();
            JSONObject jSONObject3 = new JSONObject(C1370pv.l8(Yy.v(string, S(string)), this.T4)).getJSONObject("data");
            JSONArray jSONArray = jSONObject3.getJSONArray("vod_url_with_player");
            jSONObject.put("vod_id", jSONObject3.optString("vod_id"));
            jSONObject.put("vod_name", jSONObject3.optString("vod_name"));
            jSONObject.put("vod_pic", jSONObject3.optString("vod_pic"));
            jSONObject.put("type_name", jSONObject3.optString("vod_class"));
            jSONObject.put("vod_year", jSONObject3.optString("vod_year"));
            jSONObject.put("vod_area", jSONObject3.optString("vod_area"));
            jSONObject.put("vod_remarks", jSONObject3.optString("vod_remarks"));
            jSONObject.put("vod_actor", jSONObject3.optString("vod_actor"));
            jSONObject.put("vod_director", jSONObject3.optString("vod_director"));
            jSONObject.put("vod_content", "此接口完全免费，请勿上当受骗！！" + jSONObject3.optString("vod_content"));
            int i = 0;
            while (i < jSONArray.length()) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                String strOptString = jSONObjectOptJSONObject.optString("name");
                String strOptString2 = jSONObjectOptJSONObject.optString("code");
                String str = jSONObjectOptJSONObject.optString("url") + "*" + strOptString2;
                arrayList.add(strOptString);
                arrayList2.add(str.replaceAll("#", "*" + strOptString2 + "#"));
                i++;
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

    public String findJxApi(JSONArray jSONArray, String str) {
        try {
            int i = 0;
            while (i < jSONArray.length()) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.getString("解析关键词").equalsIgnoreCase(str)) {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("解析配置");
                    if (jSONArray2.length() > 0) {
                        return jSONArray2.getJSONObject(0).getString("jxapi");
                    }
                    return null;
                }
                i++;
            }
        } catch (Exception e) {
            StringUtils.printStackTrace();
        }
        return null;
    }

    public void init(Context context, String str) {
        super.init(context, str);
        this.T4 = str;
        String strL = C1370pv.l(str);
        String[] strArrSplit = strL.split("\\|");
        this.l8 = strArrSplit[0];
        String str4 = strArrSplit[2];
        String str3 = strArrSplit[3];
        String str5 = strArrSplit[4];
        this.S = str5;
        this.OL = str4;
        this.b = str3;
        l8();
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            Init2.lj();
            String[] strArrSplit = str2.split("\\*");
            String str3 = strArrSplit[1];
            String str4 = strArrSplit[0];
            String strFindJxApi = findJxApi(this.l, str3);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("User-Agent", " Mozilla/5.0 (compatible; MSIE 7.0; Windows 95; Trident/5.0)-ST|V");
            if (strFindJxApi.contains("http")) {
                String strV = Yy.v(strFindJxApi + str4, S(""));
                JSONObject jSONObject;
                if (strV.contains("{")) {
                    jSONObject = new JSONObject(strV);
                } else {
                    jSONObject = new JSONObject(C1370pv.l8(strV, this.T4));
                }
                boolean zHas = jSONObject.has("url");
                String strB = "header";
                if (zHas) {
                    String strOptString = jSONObject.optJSONObject("data").optString("url");
                    if (strOptString != null) {
                        if (ZP.l(str4)) {
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("url", str4);
                            jSONObject4.put("jx", 1);
                            jSONObject4.put(strB, jSONObject2.toString());
                            return jSONObject4.toString();
                        }
                    }
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("url", strOptString);
                    jSONObject5.put("parse", 0);
                    jSONObject5.put(strB, jSONObject2.toString());
                    return jSONObject5.toString();
                } else {
                    String strOptString2 = jSONObject.optString("url");
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("url", strOptString2);
                    jSONObject6.put("parse", 0);
                    jSONObject6.put(strB, jSONObject2.toString());
                    return jSONObject6.toString();
                }
            } else {
                if (str4.contains("m3u8") || str4.contains("mp4")) {
                    return "";
                }
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("url", str4);
                jSONObject7.put("parse", 0);
                return jSONObject7.toString();
            }
        } catch (Throwable th) {
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str2 = this.l8 + "/api.php/app/search?pg=1&text=" + str;
            String strL8 = C1370pv.l8(Yy.v(str2, S(str2)), this.T4);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONObject(strL8).getJSONArray("list");
            int i = 0;
            while (i < jSONArray2.length()) {
                JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vod_id", jSONObjectOptJSONObject.optString("vod_id"));
                jSONObject2.put("vod_name", jSONObjectOptJSONObject.optString("vod_name"));
                jSONObject2.put("vod_pic", jSONObjectOptJSONObject.optString("vod_pic"));
                jSONObject2.put("vod_remarks", jSONObjectOptJSONObject.optString("vod_remarks"));
                jSONArray.put(jSONObject2);
                i++;
            }
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Throwable th) {
            return "";
        }
    }
}
