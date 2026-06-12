package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
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
import com.github.catvod.spider.merge.xx;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Qiji extends Spider {

    private boolean A;
    private JSONObject cD;
    private JSONArray n;
    private JSONObject s;
    private JSONArray v;
    private String l8 = "";
    private String S = "okhttp/3.14.9";
    private String T4 = "http://113.45.243.233:8977/verification-code";
    private String b = "";
    private String OL = "";
    private String l = "";
    private String tT = "";
    private String N = "";
    private String HM = "";

    public Qiji() {
    }

    private String OL(String str) {
        xx.ut utVar = new xx.ut(this) {
            final Qiji S;

            {
                this.S = Qiji.this;
            }

            @Override
            public void onFailure(Call call, Exception exc) {
            }

            @Override
            public String onResponse(String str2) {
                return str2;
            }
        };
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("image_base64", str);
            Yy.N(Yy.T4(), this.T4, jSONObject.toString(), tT(this.S), utVar);
            return new JSONObject(utVar.getResult()).optString("captcha_value");
        } catch (Throwable th) {
            return "";
        }
    }

    private void b() {
        String[] strArrSplit = C1370pv.l(this.HM).split("\\|");
        if (!strArrSplit[0].endsWith(".txt")) {
            if (!strArrSplit[0].endsWith(".json")) {
                this.l8 = strArrSplit[0];
            }
        }
        this.l8 = Yy.v(strArrSplit[0], null).split("\n")[0].trim();
        if (!this.l8.contains(".php")) {
            this.l8 += "/api.php";
        }
        String str = strArrSplit[1];
        this.b = str;
        this.OL = strArrSplit[2];
        String string = new StringBuilder(str).reverse().toString();
        this.tT = ZP.l8(string, ZP.S).substring(0, 16);
        this.l = string;
        if (strArrSplit.length <= 3) {
            this.N = "100";
        } else {
            this.N = strArrSplit[3];
        }
        l();
        System.out.println("CCC" + this.cD);
        this.s = this.cD.optJSONObject("api_header");
    }

    private void l() {
        String strC = "box_config";
        xx.ut utVar = new xx.ut(this) {
            final Qiji S;

            {
                this.S = Qiji.this;
            }

            @Override
            public void onFailure(Call call, Exception exc) {
            }

            @Override
            public String onResponse(String str) {
                return str;
            }
        };
        try {
            if (this.l8.isEmpty()) {
                b();
            }
            String str = this.l8 + "/qijiappapi.index/initV122";
            HashMap map = new HashMap();
            new JSONArray();
            Yy.tT(Yy.T4(), str, map, tT(this.S), utVar);
            String strN = C1370pv.n(new JSONObject(utVar.getResult()).optString("data"), this.b, this.OL);
            this.v = new JSONObject(strN).optJSONArray("type_list");
            this.n = new JSONObject(strN).optJSONArray("banner_list");
            this.A = new JSONObject(strN).optJSONObject("config").optBoolean("system_search_verify_status");
            System.out.println(new JSONObject(strN).get(strC));
            this.cD = new JSONObject(C1370pv.n(new JSONObject(strN).optString(strC), this.l, this.tT));
        } catch (Throwable th) {
            return;
        }
    }

    private HashMap<String, String> tT(String str) {
        String strC = "app-api-verify-sign";
        HashMap<String, String> map = new HashMap<>();
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        map.put("app-ui-mode", "light");
        map.put("user-agent", str);
        map.put("app-user-device-id", "");
        map.put("app-api-verify-time", strValueOf);
        try {
            map.put(strC, C1370pv.cD(strValueOf, this.b, this.OL));
            if (!this.s.optString("key").isEmpty()) {
                map.put(this.s.optString("key"), this.s.optString("value"));
            }
        } catch (Exception e) {
            map.put(strC, "");
        }
        map.put("app-version-code", this.N);
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            if (this.l8.isEmpty()) {
                b();
            }
            int i2 = Integer.parseInt(str2);
            if (i2 == 0) {
                i2 = 1;
            }
            String str3 = this.l8 + "/qijiappapi.index/typeFilterVodList";
            HashMap map2 = new HashMap();
            map2.put("class", "全部");
            map2.put("area", "全部");
            map2.put("lang", "全部");
            map2.put("sort", "最新");
            map2.put("type_id", str);
            map2.put("page", str2);
            map2.put("year", "全部");
            JSONArray jSONArray = new JSONArray();
            Yy.tT(Yy.T4(), str3, map2, tT(this.S), new xx.ut(this, jSONArray) {

                private static final short[] f44short = {1782, 1775, 1764, 1759, 1778, 1765, 1773, 1761, 1778, 1771, 1779, 1610, 1619, 1624, 1635, 1612, 1621, 1631, 2635, 2642, 2649, 2658, 2643, 2652, 2640, 2648, 566, 559, 548, 543, 553, 548, 2877, 2872, 2861, 2872, 2953, 2974, 2968, 2964, 2966, 2966, 2974, 2965, 2975, 2980, 2967, 2962, 2952, 2959, 524, 535, 526, 526};
                final JSONArray S;
                final Qiji T4;

                {
                    this.T4 = Qiji.this;
                    this.S = jSONArray;
                }

                @Override
                public void onFailure(Call call, Exception exc) {
                }

                @Override
                public String onResponse(String str4) {
                    JSONArray jSONArray2;
                    int i4 = 0;
                    String strD = "vod_remarks";
                    String strB2 = "vod_pic";
                    String strB3 = "vod_name";
                    String strB4 = "vod_id";
                    try {
                        jSONArray2 = new JSONObject(C1370pv.n(new JSONObject(str4).optString("data"), this.T4.b, this.T4.OL)).getJSONArray("recommend_list");
                    } catch (JSONException e) {
                    }
                    for (i4 = 0; i4 < jSONArray2.length(); i4++) {
                        JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i4);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(strB4, jSONObjectOptJSONObject.optString(strB4));
                        jSONObject.put(strB3, jSONObjectOptJSONObject.optString(strB3));
                        jSONObject.put(strB2, jSONObjectOptJSONObject.optString(strB2));
                        String strOptString = jSONObjectOptJSONObject.optString(strD);
                        if (strOptString.equals("null")) {
                            strOptString = "";
                        }
                        jSONObject.put(strD, strOptString);
                        this.S.put(jSONObject);
                    }
                    return str4;
                }
            });
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("page", i2);
            if (jSONArray.length() == 12) {
                i2++;
            }
            jSONObject.put("pagecount", i2);
            jSONObject.put("limit", 12);
            jSONObject.put("total", Integer.MAX_VALUE);
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String detailContent(List<String> list) {
        try {
            if (this.l8.isEmpty()) {
                b();
            }
            String str = this.l8 + "/qijiappapi.index/vodDetail2";
            HashMap map = new HashMap();
            map.put("vod_id", list.get(0));
            JSONObject jSONObject = new JSONObject();
            Yy.tT(Yy.T4(), str, map, tT(this.S), new xx.ut(this, jSONObject, new ArrayList(), new ArrayList()) {

                private static final short[] f45short = {789, 782, 778, 772, 783, 3037, 3037, 3037, 1904, 1897, 1890, 1881, 1893, 1897, 1896, 1906, 1891, 1896, 1906, 2283, 2290, 2297, 2242, 2297, 2292, 2287, 2296, 2302, 2281, 2290, 2287, 655, 662, 669, 678, 664, 666, 653, 662, 651, 1158, 1181, 1156, 1156, 1691, 1666, 1673, 1714, 1676, 1695, 1672, 1676, 967, 990, 981, 1006, 968, 980, 976, 963, 609, 632, 627, 584, 615, 638, 628, 1709, 1716, 1727, 1668, 1717, 1722, 1718, 1726, 1958, 1983, 1972, 1935, 1977, 1972, 400, 1358, 2829, 2833, 2844, 2820, 2840, 2831, 2850, 2836, 2835, 2843, 2834, 1679, 1674, 1695, 1674, 2138, 2115, 2120, 2038, 2043, 2034, 2023, 2013, 2028, 2019, 2031, 2023, 2599, 2622, 2613, 2574, 2610, 2621, 2608, 2594, 2594, 2854, 2879, 2868, 2831, 2850, 2869, 2877, 2865, 2850, 2875, 2851, 2928, 2615, 2606, 2597, 2590, 2611, 2596, 2604, 2592, 2611, 2602, 2610, 25344, 27585, 23431, 21480, 22796, 22825, -31395, -2200, -31853, 23195, 18030, 22327, 23475, -27917, -2203, -2203, 1956, 1981, 1974, 1933, 1954, 1982, 1971, 1963, 1933, 1982, 1979, 1953, 1958, 1626, 1629, 1603, 1628, 2307, 2328, 2335, 2311, 682, 699, 680, 681, 703, 3076, 3100, 3092, 3098, 3088, 3079, 1872, 1878, 1856, 1879, 1914, 1860, 1858, 1856, 1867, 1873, 2168, 2144, 2152, 2150, 2454, 2446, 2438, 2440, 2445, 2446, 1576, 1575, 1579, 1571, 2233, 2238, 2208, 784, 1904, 1897, 1890, 1881, 1910, 1898, 1895, 1919, 1881, 1888, 1908, 1897, 1899, 1515, 1522, 1529, 1474, 1517, 1521, 1532, 1508, 1474, 1512, 1519, 1521};
                final Qiji OL;
                final JSONObject S;
                final ArrayList T4;
                final ArrayList b;

                {
                    this.OL = Qiji.this;
                    this.S = jSONObject;
                    this.T4 = arrayList;
                    this.b = arrayList;
                }

                @Override
                public void onFailure(Call call, Exception exc) {
                }

                @Override
                public String onResponse(String str2) {
                    JSONArray jSONArray;
                    int i2;
                    String str3;
                    String strB = "token";
                    String strD = "$$$";
                    String strB2 = "vod_content";
                    String strB3 = "vod_director";
                    String strC = "vod_actor";
                    String strB4 = "null";
                    String strB5 = "vod_area";
                    String strE = "vod_year";
                    String strE2 = "vod_pic";
                    String strB6 = "vod_name";
                    String strE3 = "vod_id";
                    String strC2 = "*";
                    String strE4 = "$";
                    String strE5 = "player_info";
                    try {
                        JSONObject jSONObject2 = new JSONObject(C1370pv.n(new JSONObject(str2).optString("data"), this.OL.b, this.OL.OL));
                        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("vod");
                        this.S.put(strE3, jSONObjectOptJSONObject.optString(strE3));
                        this.S.put(strB6, jSONObjectOptJSONObject.optString(strB6));
                        this.S.put(strE2, jSONObjectOptJSONObject.optString(strE2));
                        this.S.put("type_name", jSONObjectOptJSONObject.optString("vod_class"));
                        this.S.put(strE, jSONObjectOptJSONObject.optString(strE));
                        this.S.put(strB5, jSONObjectOptJSONObject.optString(strB5));
                        String strOptString = jSONObjectOptJSONObject.optString("vod_remarks ");
                        if (strOptString.equals(strB4)) {
                            strOptString = "";
                        }
                        this.S.put("vod_remarks", strOptString);
                        this.S.put(strC, jSONObjectOptJSONObject.optString(strC));
                        this.S.put(strB3, jSONObjectOptJSONObject.optString(strB3));
                        String strOptString2 = jSONObjectOptJSONObject.optString(strB2);
                        String str4 = "";
                        if (!strOptString2.equals(strB4)) {
                            str4 = strOptString2;
                        }
                        this.S.put(strB2, "此接口完全免费，请勿上当受骗！！" + str4);
                        jSONArray = jSONObject2.getJSONArray("vod_play_list");
                        i2 = 0;
                    } catch (JSONException e) {
                        return str2;
                    }
                    while (i2 < jSONArray.length()) {
                        JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i2);
                        JSONArray jSONArray2 = jSONObjectOptJSONObject2.getJSONArray("urls");
                        ArrayList arrayList = new ArrayList();
                        String strOptString3 = jSONObjectOptJSONObject2.optJSONObject(strE5).optString("show");
                        String strOptString4 = jSONObjectOptJSONObject2.optJSONObject(strE5).optString("parse");
                        if (strOptString4.contains(strE4)) {
                            strOptString4 = strOptString4.replace(strE4, "qiaoer");
                        }
                        String strOptString5 = jSONObjectOptJSONObject2.optJSONObject(strE5).optString("user_agent");
                        if (strOptString5.isEmpty()) {
                            str3 = this.OL.S;
                        } else {
                            str3 = strOptString5;
                        }
                        if (strOptString4.isEmpty()) {
                            strOptString4 = "qiao";
                        }
                        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                            JSONObject jSONObjectOptJSONObject3 = jSONArray2.optJSONObject(i11);
                            String strOptString6 = jSONObjectOptJSONObject3.optString(strB);
                            if (strOptString6.isEmpty()) {
                                strOptString6 = "qiaoji";
                            }
                            arrayList.add(jSONObjectOptJSONObject3.optString("name") + strE4 + jSONObjectOptJSONObject3.optString("url") + strC2 + strOptString4 + strC2 + strOptString6 + strC2 + str3);
                        }
                        this.T4.add(strOptString3);
                        this.b.add(TextUtils.join("#", arrayList));
                        i2++;
                    }
                    String strJoin = TextUtils.join(strD, this.T4);
                    String strJoin2 = TextUtils.join(strD, this.b);
                    this.S.put("vod_play_from", strJoin);
                    this.S.put("vod_play_url", strJoin2);
                    return str2;
                }
            });
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            jSONObject2.put("list", jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String homeContent(boolean z) {
        try {
            if (this.l8.isEmpty()) {
                b();
            }
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = this.v;
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i2);
                String strOptString = jSONObjectOptJSONObject.optString("type_name");
                String strOptString2 = jSONObjectOptJSONObject.optString("type_id");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type_id", strOptString2);
                jSONObject.put("type_name", strOptString);
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("class", jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String homeVideoContent() {
        try {
            if (this.l8.isEmpty()) {
                b();
            }
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = this.n;
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i2);
                String strOptString = jSONObjectOptJSONObject.optString("vod_id");
                String strOptString2 = jSONObjectOptJSONObject.optString("vod_name");
                String strOptString3 = jSONObjectOptJSONObject.optString("vod_pic");
                String strOptString4 = jSONObjectOptJSONObject.optString("vod_remarks");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("vod_id", strOptString);
                jSONObject.put("vod_name", strOptString2);
                jSONObject.put("vod_pic", strOptString3);
                jSONObject.put("vod_remarks", strOptString4);
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("list", jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context);
        this.HM = str;
    }

    public String parseImageToBase64(String str) {
        try {
            xx.aA aAVar = new xx.aA(this) {
                final Qiji S;

                {
                    this.S = Qiji.this;
                }

                @Override
                protected void onFailure(Call call, Exception exc) {
                    SpiderDebug.log(exc);
                }

                @Override
                public String onResponse(Response response) {
                    return null;
                }
            };
            Yy.b(Yy.T4(), str, null, tT(str), aAVar);
            Response result = aAVar.getResult();
            if (result != null) {
                int iCode = aAVar.getResult().code();
                if (iCode == 200) {
                    InputStream inputStreamByteStream = aAVar.getResult().body().byteStream();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[4096];
                    int i3;
                    while ((i3 = inputStreamByteStream.read(bArr, 0, 4096)) != -1) {
                        byteArrayOutputStream.write(bArr, 0, i3);
                    }
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStreamByteStream.close();
                    byteArrayOutputStream.close();
                    return "data:" + aAVar.getResult().header("Content-Type", "image/jpeg") + ";base64," + Base64.encodeToString(byteArray, 2);
                }
            }
            return "";
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String str3;
        String str4;
        String strB = "qiaoer";
        try {
            Init2.lj();
            String[] strArrSplit = str2.split("\\*");
            String strReplace = strArrSplit[1];
            if (strReplace.contains(strB)) {
                strReplace = strReplace.replace(strB, "$");
            }
            String str5 = strArrSplit[0];
            String str6 = strArrSplit[2];
            String str7 = strArrSplit[3];
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("User-Agent", str7);
            if (str6.contains("qiaoji")) {
                str3 = "";
            } else {
                str3 = str6;
            }
            if (strReplace.contains("http")) {
                if (!str3.isEmpty()) {
                    str4 = strReplace + str5 + "&token=" + str3;
                } else {
                    str4 = strReplace + str5;
                }
                JSONObject jSONObject4 = new JSONObject();
                Yy.tT(Yy.T4(), str4, new HashMap(), tT(str7), new xx.ut(this, jSONObject4, strReplace, str5, str7, jSONObject) {

                    private static final short[] f46short = {682, 673, 685, 698, 695, 702, 683, 718, 646, 666, 643, 642, 1817, 1812, 1808, 1813, 1812, 1795, 3050, 3067, 3048, 3049, 3071, 3080, 3087, 3089, 1696, 1701, 1712, 1701};
                    final String OL;
                    final JSONObject S;
                    final String T4;
                    final String b;
                    final JSONObject l;
                    final Qiji tT;

                    {
                        this.tT = Qiji.this;
                        this.S = jSONObject4;
                        this.T4 = strReplace;
                        this.b = str5;
                        this.OL = str7;
                        this.l = jSONObject;
                    }

                    @Override
                    public void onFailure(Call call, Exception exc) {
                    }

                    @Override
                    public String onResponse(String str9) {
                        String strC2 = "url";
                        try {
                            this.S.put(strC2, new JSONObject(new JSONObject(C1370pv.n(new JSONObject(str9).optString("data"), this.tT.b, this.tT.OL)).optString("json")).optString(strC2));
                            this.S.put("parse", 0);
                            if (!this.T4.equals(this.tT.S)) {
                                this.S.put("header", this.l.toString());
                            }
                        } catch (JSONException e) {
                        }
                        return str9;
                    }
                });
                return jSONObject4.toString();
            } else {
                boolean zContains4 = str5.contains("m3u8");
                if (!zContains4) {
                    if (!str5.contains("mp4")) {
                        String str8 = this.l8 + "/qijiappapi.index/vodParse";
                        HashMap map = new HashMap();
                        map.put("parse_api", strReplace);
                        map.put("url", C1370pv.cD(str5, this.b, this.OL));
                        map.put("token", str3);
                        JSONObject jSONObject2 = new JSONObject();
                        Yy.tT(Yy.T4(), str8, map, tT(str7), new xx.ut(this, jSONObject2, str7, jSONObject) {

                            private static final short[] f47short = {2087, 2080, 2110, 2196, 2193, 2180, 2193, 993, 1016, 996, 997, 2325, 2308, 2327, 2326, 2304, 1998, 1987, 1991, 1986, 1987, 2004};
                            final Qiji OL;
                            final JSONObject S;
                            final String T4;
                            final JSONObject b;

                            {
                                this.OL = Qiji.this;
                                this.S = jSONObject2;
                                this.T4 = str7;
                                this.b = jSONObject;
                            }

                            @Override
                            public void onFailure(Call call, Exception exc) {
                            }

                            @Override
                            public String onResponse(String str9) {
                                String strC2 = "url";
                                try {
                                    this.S.put(strC2, new JSONObject(new JSONObject(C1370pv.n(new JSONObject(str9).optString("data"), this.OL.b, this.OL.OL)).optString("json")).optString(strC2));
                                    this.S.put("parse", 0);
                                    if (!this.T4.equals(this.OL.S)) {
                                        this.S.put("header", this.b.toString());
                                    }
                                } catch (JSONException e) {
                                }
                                return str9;
                            }
                        });
                        return jSONObject2.toString();
                    }
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("url", str5);
                jSONObject3.put("parse", 0);
                return jSONObject3.toString();
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    public String searchContent(String str, boolean z) {
        String str2;
        try {
            if (this.l8.isEmpty()) {
                b();
            }
            JSONArray jSONArray = new JSONArray();
            HashMap map = new HashMap();
            map.put("page", "1");
            map.put("type_id", "0");
            map.put("keywords", str);
            if (this.A) {
                String strValueOf = String.valueOf(UUID.randomUUID());
                map.put("code", OL(parseImageToBase64(this.l8 + "/qijiappapi.verify/create?key=" + strValueOf)));
                map.put("key", strValueOf);
            }
            JSONObject jSONObject = this.cD;
            if (jSONObject != null && jSONObject.optString("search_name").length() != 0) {
                str2 = this.l8 + "/qijiappapi.index/" + this.cD.getString("search_name");
                String strOptString = this.cD.optString("signature_value");
                String string = new StringBuilder(strOptString).reverse().toString();
                String strOptString2 = this.cD.optString("signature_name");
                if (strOptString.length() > 0 && strOptString2.length() > 0) {
                    String strValueOf2 = String.valueOf(System.currentTimeMillis() / 1000);
                    StringBuilder sb = new StringBuilder();
                    sb.append(strValueOf2);
                    sb.append("-sb-0-");
                    sb.append(ZP.l8("/" + strOptString2 + "-" + strValueOf2 + "-sb-0-" + string.substring(8) + string.substring(0, 8), ZP.S));
                    map.put(strOptString2, sb.toString());
                }
            } else {
                str2 = this.l8 + "/qijiappapi.index/searchList";
            }
            System.out.println("验证码：");
            Yy.tT(Yy.T4(), str2, map, tT(this.S), new xx.ut(this, jSONArray) {

                private static final short[] f48short = {980, 973, 966, 1021, 976, 967, 975, 963, 976, 969, 977, 1551, 1558, 1565, 1574, 1545, 1552, 1562, 2754, 2779, 2768, 2795, 2778, 2773, 2777, 2769, 3030, 3023, 3012, 3071, 3017, 3012, 1419, 1422, 1435, 1422, 1507, 1525, 1521, 1506, 1523, 1528, 1487, 1532, 1529, 1507, 1508, 1825, 1850, 1827, 1827};
                final JSONArray S;
                final Qiji T4;

                {
                    this.T4 = Qiji.this;
                    this.S = jSONArray;
                }

                @Override
                public void onFailure(Call call, Exception exc) {
                }

                @Override
                public String onResponse(String str3) {
                    JSONArray jSONArray2;
                    int i8 = 0;
                    String strB2 = "vod_remarks";
                    String strE2 = "vod_pic";
                    String strC = "vod_name";
                    String strE3 = "vod_id";
                    try {
                        jSONArray2 = new JSONObject(C1370pv.n(new JSONObject(str3).optString("data"), this.T4.b, this.T4.OL)).getJSONArray("search_list");
                    } catch (JSONException e) {
                    }
                    for (i8 = 0; i8 < jSONArray2.length(); i8++) {
                        JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i8);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(strE3, jSONObjectOptJSONObject.optString(strE3));
                        jSONObject2.put(strC, jSONObjectOptJSONObject.optString(strC));
                        jSONObject2.put(strE2, jSONObjectOptJSONObject.optString(strE2));
                        String strOptString3 = jSONObjectOptJSONObject.optString(strB2);
                        if (strOptString3.equals("null")) {
                            strOptString3 = "";
                        }
                        jSONObject2.put(strB2, strOptString3);
                        this.S.put(jSONObject2);
                    }
                    return str3;
                }
            });
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("list", jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
