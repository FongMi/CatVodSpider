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
import com.github.catvod.spider.merge.xx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import okhttp3.Call;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Xdai extends Spider {

    private static final short[] f97short = { /* ... obfuscated table ... */ };
    private String l8 = "";
    private String S = "okhttp/3.14.9";
    private String T4 = "";
    private String b = "";
    private String OL = "";
    private String l = "";

    public Xdai() {
        // dead code removed
    }

    private HashMap<String, String> OL(String str) {
        String strB = "app-api-verify-sign";
        HashMap<String, String> map = new HashMap<>();
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        map.put("app-ui-mode", "light");
        map.put("user-agent", str);
        map.put("app-user-device-id", "");
        map.put("app-api-verify-time", strValueOf);
        try {
            map.put(strB, C1370pv.cD(strValueOf, this.T4, this.b));
        } catch (Exception e) {
            map.put(strB, "");
        }
        map.put("app-version-code", this.OL);
        return map;
    }

    private void b() {
        String[] strArrSplit = C1370pv.l(this.l).split("\\|");
        if (strArrSplit[0].endsWith(".txt")) {
            this.l8 = strArrSplit[0];
        } else if (strArrSplit[0].endsWith(".json")) {
            // no-op for .json case
        } else {
            this.l8 = Yy.v(strArrSplit[0], null).split("\n")[0].trim();
        }
        if (this.l8.contains(".php")) {
            this.l8 += "/api.php";
        }
        this.T4 = strArrSplit[1];
        this.b = strArrSplit[2];
        if (strArrSplit.length > 3) {
            this.OL = strArrSplit[3];
        } else {
            this.OL = "100";
        }
    }

    private HashMap<String, String> l(String str) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Referer", "https://servicewechat.com/wx34cc68eb0f369774/15/page-frame.html");
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strD = "page";
        String strD2 = "全部";
        try {
            if (this.l8.isEmpty()) {
                b();
            }
            int i2 = Integer.parseInt(str2);
            if (i2 == 0) {
                i2 = 1;
            }
            String str3 = this.l8 + "/getappapi.index/typeFilterVodList";
            HashMap map2 = new HashMap();
            map2.put("class", strD2);
            map2.put("area", strD2);
            map2.put("lang", strD2);
            map2.put("sort", "最新");
            map2.put("type_id", str);
            map2.put(strD, str2);
            map2.put("year", strD2);
            JSONArray jSONArray = new JSONArray();
            Yy.tT(Yy.T4(), str3, map2, OL(this.S), new xx.ut(this, jSONArray) {
                final JSONArray S;
                final Xdai T4;

                {
                    this.T4 = this;
                    this.S = jSONArray;
                }

                @Override
                public void onFailure(Call call, Exception exc) {
                }

                @Override
                public String onResponse(String str4) {
                    JSONArray jSONArray2;
                    int i4 = 0;
                    String strB = "vod_remarks";
                    String strD3 = "vod_pic";
                    String strE = "vod_name";
                    String strE2 = "vod_id";
                    try {
                        jSONArray2 = new JSONObject(C1370pv.n(new JSONObject(str4).optString("data"), this.T4.T4, this.T4.b)).getJSONArray("recommend_list");
                    } catch (JSONException e) {
                        return str4;
                    }
                    while (true) {
                        int i6 = i4;
                        int length = jSONArray2.length();
                        if (i6 >= length) break;
                        JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i6);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(strE2, jSONObjectOptJSONObject.optString(strE2));
                        jSONObject.put(strE, jSONObjectOptJSONObject.optString(strE));
                        jSONObject.put(strD3, jSONObjectOptJSONObject.optString(strD3));
                        String strOptString = jSONObjectOptJSONObject.optString(strB);
                        if (strOptString.equals("null")) {
                            strOptString = "";
                        }
                        jSONObject.put(strB, strOptString);
                        this.S.put(jSONObject);
                        i4 = i6 + 1;
                    }
                    return str4;
                }
            });
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(strD, i2);
            int length = jSONArray.length();
            if (length == 12) {
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
            String str = this.l8 + "/getappapi.index/vodDetail";
            HashMap map = new HashMap();
            map.put("vod_id", list.get(0));
            JSONObject jSONObject = new JSONObject();
            Yy.tT(Yy.T4(), str, map, OL(this.S), new xx.ut(this, jSONObject, new ArrayList(), new ArrayList()) {
                final Xdai OL;
                final JSONObject S;
                final ArrayList T4;
                final ArrayList b;

                {
                    this.OL = this;
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
                    String strC = "token";
                    String strE = "$$";
                    String strE2 = "vod_content";
                    String strD = "vod_director";
                    String strE3 = "vod_actor";
                    String strC2 = "null";
                    String strB = "vod_area";
                    String strC3 = "vod_year";
                    String strD2 = "vod_pic";
                    String strB2 = "vod_name";
                    String strD3 = "vod_id";
                    String strC4 = "*";
                    String strB3 = "$";
                    String strE4 = "player_info";
                    try {
                        JSONObject jSONObject2 = new JSONObject(C1370pv.n(new JSONObject(str2).optString("data"), this.OL.T4, this.OL.b));
                        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("vod");
                        this.S.put(strD3, jSONObjectOptJSONObject.optString(strD3));
                        this.S.put(strB2, jSONObjectOptJSONObject.optString(strB2));
                        this.S.put(strD2, jSONObjectOptJSONObject.optString(strD2));
                        this.S.put("type_name", jSONObjectOptJSONObject.optString("vod_class"));
                        this.S.put(strC3, jSONObjectOptJSONObject.optString(strC3));
                        this.S.put(strB, jSONObjectOptJSONObject.optString(strB));
                        String strOptString = jSONObjectOptJSONObject.optString("vod_remarks ");
                        if (strOptString.equals(strC2)) {
                            strOptString = "";
                        }
                        this.S.put("vod_remarks", strOptString);
                        this.S.put(strE3, jSONObjectOptJSONObject.optString(strE3));
                        this.S.put(strD, jSONObjectOptJSONObject.optString(strD));
                        String strOptString2 = jSONObjectOptJSONObject.optString(strE2);
                        String str4 = "";
                        if (!strOptString2.equals(strC2)) {
                            str4 = strOptString2;
                        }
                        this.S.put(strE2, "此接口完全免费，请勿上当受骗！！" + str4);
                        jSONArray = jSONObject2.getJSONArray("vod_play_list");
                        i2 = 0;
                    } catch (JSONException e) {
                        return str2;
                    }
                    while (i2 < jSONArray.length()) {
                        JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i2);
                        JSONArray jSONArray2 = jSONObjectOptJSONObject2.getJSONArray("urls");
                        ArrayList arrayList = new ArrayList();
                        String strOptString3 = jSONObjectOptJSONObject2.optJSONObject(strE4).optString("show");
                        String strOptString4 = jSONObjectOptJSONObject2.optJSONObject(strE4).optString("parse");
                        if (strOptString4.contains(strB3)) {
                            strOptString4 = strOptString4.replace(strB3, "qiaoer");
                        }
                        String strOptString5 = jSONObjectOptJSONObject2.optJSONObject(strE4).optString("user_agent");
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
                            String strOptString6 = jSONObjectOptJSONObject3.optString(strC);
                            if (strOptString6.isEmpty()) {
                                strOptString6 = "qiaoji";
                            }
                            arrayList.add(jSONObjectOptJSONObject3.optString("name") + strB3 + jSONObjectOptJSONObject3.optString("url") + strC4 + strOptString4 + strC4 + strOptString6 + strC4 + str3);
                        }
                        this.T4.add(strOptString3);
                        this.b.add(TextUtils.join("#", arrayList));
                        i2++;
                    }
                    String strJoin = TextUtils.join(strE, this.T4);
                    String strJoin2 = TextUtils.join(strE, this.b);
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
            String str = this.l8 + "/getappapi.index/init";
            System.out.println(str);
            HashMap map = new HashMap();
            JSONArray jSONArray = new JSONArray();
            Yy.tT(Yy.T4(), str, map, OL(this.S), new xx.ut(this, jSONArray) {
                final JSONArray S;
                final Xdai T4;

                {
                    this.T4 = this;
                    this.S = jSONArray;
                }

                @Override
                public void onFailure(Call call, Exception exc) {
                }

                @Override
                public String onResponse(String str2) {
                    JSONArray jSONArray2;
                    int i2 = 0;
                    String strD = "type_id";
                    String strC = "type_name";
                    try {
                        System.out.println("成归来" + str2);
                        jSONArray2 = new JSONObject(C1370pv.n(new JSONObject(str2).optString("data"), this.T4.T4, this.T4.b)).getJSONArray("type_list");
                    } catch (JSONException e) {
                        return str2;
                    }
                    while (true) {
                        int i4 = i2;
                        int length = jSONArray2.length();
                        if (i4 >= length) break;
                        JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i4);
                        String strOptString = jSONObjectOptJSONObject.optString(strC);
                        String strOptString2 = jSONObjectOptJSONObject.optString(strD);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(strD, strOptString2);
                        jSONObject.put(strC, strOptString);
                        this.S.put(jSONObject);
                        i2 = i4 + 1;
                    }
                    return str2;
                }
            });
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("class", jSONArray);
            return jSONObject.toString();
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
            Yy.tT(Yy.T4(), this.l8 + "/getappapi.index/init", new HashMap(), OL(this.S), new xx.ut(this, jSONArray) {
                final JSONArray S;
                final Xdai T4;

                {
                    this.T4 = this;
                    this.S = jSONArray;
                }

                @Override
                public void onFailure(Call call, Exception exc) {
                }

                @Override
                public String onResponse(String str) {
                    JSONArray jSONArray2;
                    int i2 = 0;
                    String strE = "vod_remarks";
                    String strB = "vod_pic";
                    String strE2 = "vod_name";
                    String strB2 = "vod_id";
                    try {
                        jSONArray2 = new JSONObject(C1370pv.n(new JSONObject(str).optString("data"), this.T4.T4, this.T4.b)).getJSONArray("banner_list");
                    } catch (JSONException e) {
                        return str;
                    }
                    while (true) {
                        int i4 = i2;
                        int length = jSONArray2.length();
                        if (i4 >= length) break;
                        JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i4);
                        String strOptString = jSONObjectOptJSONObject.optString(strB2);
                        String strOptString2 = jSONObjectOptJSONObject.optString(strE2);
                        String strOptString3 = jSONObjectOptJSONObject.optString(strB);
                        String strOptString4 = jSONObjectOptJSONObject.optString(strE);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(strB2, strOptString);
                        jSONObject.put(strE2, strOptString2);
                        jSONObject.put(strB, strOptString3);
                        jSONObject.put(strE, strOptString4);
                        this.S.put(jSONObject);
                        i2 = i4 + 1;
                    }
                    return str;
                }
            });
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context);
        String strE = "qiaoji";
        if (str.contains(strE)) {
            this.l = str.replace(strE, "");
            Yy.v("https://wmmys.cn/xcx/cxxf.php?type=xf&username=987654", l(""));
        } else {
            this.l = str;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String str3;
        String strD = "qiaoer";
        try {
            Init2.lj();
            String[] strArrSplit = str2.split("\\*");
            String strReplace = strArrSplit[1];
            if (strReplace.contains(strD)) {
                strReplace = strReplace.replace(strD, "$");
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
                if (str5.contains("m3u8") || str5.contains("mp4")) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("url", str5);
                    jSONObject3.put("parse", 0);
                    return jSONObject3.toString();
                }
                // fall through to server parse for non-m3u8/mp4 http URLs
            }
            String str4;
            if (!str3.isEmpty()) {
                str4 = strReplace + str5 + "&token=" + str3;
            } else {
                str4 = strReplace + str5;
            }
            JSONObject jSONObject4 = new JSONObject();
            Yy.tT(Yy.T4(), str4, new HashMap(), OL(str7), new xx.ut(this, jSONObject4, strReplace, str5, str7, jSONObject) {
                final String OL;
                final JSONObject S;
                final String T4;
                final String b;
                final JSONObject l;
                final Xdai tT;

                {
                    this.tT = this;
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
                    String strB = "url";
                    try {
                        this.S.put(strB, new JSONObject(new JSONObject(C1370pv.n(new JSONObject(str9).optString("data"), this.tT.T4, this.tT.b)).optString("json")).optString(strB));
                        this.S.put("parse", 0);
                        if (!this.T4.equals(this.tT.S)) {
                            this.S.put("header", this.l.toString());
                        }
                    } catch (JSONException e) {
                        // ignore
                    }
                    return str9;
                }
            });
            return jSONObject4.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            if (this.l8.isEmpty()) {
                b();
            }
            JSONArray jSONArray = new JSONArray();
            try {
                String str2 = this.l8 + "/getappapi.index/searchList";
                System.out.println(str2);
                HashMap map = new HashMap();
                map.put("page", "1");
                map.put("type_id", "0");
                map.put("keywords", str);
                Yy.tT(Yy.T4(), str2, map, OL(this.S), new xx.ut(this, jSONArray) {
                    final JSONArray S;
                    final Xdai T4;

                    {
                        this.T4 = this;
                        this.S = jSONArray;
                    }

                    @Override
                    public void onFailure(Call call, Exception exc) {
                    }

                    @Override
                    public String onResponse(String str3) {
                        JSONArray jSONArray2;
                        int i2 = 0;
                        String strD = "vod_remarks";
                        String strE = "vod_pic";
                        String strC = "vod_name";
                        String strC2 = "vod_id";
                        try {
                            jSONArray2 = new JSONObject(C1370pv.n(new JSONObject(str3).optString("data"), this.T4.T4, this.T4.b)).getJSONArray("search_list");
                        } catch (JSONException e) {
                            return str3;
                        }
                        while (true) {
                            int i4 = i2;
                            int length = jSONArray2.length();
                            if (i4 >= length) break;
                            JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i4);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(strC2, jSONObjectOptJSONObject.optString(strC2));
                            jSONObject.put(strC, jSONObjectOptJSONObject.optString(strC));
                            jSONObject.put(strE, jSONObjectOptJSONObject.optString(strE));
                            String strOptString = jSONObjectOptJSONObject.optString(strD);
                            if (strOptString.equals("null")) {
                                strOptString = "";
                            }
                            jSONObject.put(strD, strOptString);
                            this.S.put(jSONObject);
                            i2 = i4 + 1;
                        }
                        return str3;
                    }
                });
            } catch (Exception e) {
                // ignore
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }
}
