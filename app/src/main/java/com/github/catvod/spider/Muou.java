package com.github.catvod.spider;

import android.content.Context;
import android.os.Build;
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
import com.github.catvod.spider.merge.ZF;
import com.github.catvod.spider.merge.ZP;
import com.github.catvod.spider.merge.xx;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import okhttp3.Call;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Muou extends Spider {

    JSONArray HM;
    private String l8 = "";
    private String S = "";
    private String T4 = "";
    private String b = Build.BRAND;
    private String OL = "";
    private String l = "";
    private String tT = "";
    private String N = "";
    private String n = "";
    private String v = "";

    public Muou() {
    }

    private void HM() {
        String[] strArrSplit = C1370pv.l(this.N.replace("qiaoji", "")).split("\\|");
        if (strArrSplit[0].endsWith(".txt")) {
            this.v = strArrSplit[0];
        } else if (strArrSplit[0].endsWith(".json")) {
            // fall through
        }
        this.v = Yy.v(strArrSplit[0], null);
        this.S = strArrSplit[1];
        this.T4 = strArrSplit[2];
        String str = this.v + "/app_info.php";
        HashMap map = new HashMap();
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        String lowerCase = ZP.S(strValueOf + this.S).toLowerCase();
        String lowerCase2 = ZP.S(strValueOf + lowerCase + "muouapp").toLowerCase();
        map.put("t", strValueOf);
        map.put("m", lowerCase2);
        map.put("n", lowerCase);
        Yy.tT(Yy.T4(), str, map, N(strValueOf), new xx.ut(this, lowerCase2) {

            final String S;
            final Muou T4;

            {
                this.T4 = this;
                this.S = lowerCase2;
            }

            @Override
            public void onFailure(Call call, Exception exc) {
            }

            @Override
            public String onResponse(String str2) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    JSONObject jSONObject2 = new JSONObject(C1370pv.n(this.T4.n(jSONObject.optString("data"), jSONObject.optInt("s"), jSONObject.optInt("e")), ZP.l8(jSONObject.getString("a"), ZP.S).substring(0, 16), ZP.l8(this.S, ZP.S).substring(0, 16)));
                    this.T4.l = ZP.l8(jSONObject2.optString("key"), ZP.S).substring(0, 16);
                    this.T4.tT = ZP.l8(jSONObject2.optString("iv"), ZP.S).substring(0, 16);
                    this.T4.l8 = jSONObject2.optString("HBqq");
                    this.T4.n = jSONObject2.optString("HBrjjg");
                } catch (Exception e) {
                }
                return str2;
            }
        });
    }

    private HashMap<String, String> N(String str) {
        if (!str.isEmpty()) {
            str = String.valueOf(System.currentTimeMillis() / 1000);
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Linux; Android 12) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.105 MUOUAPP/10.8.4506.400");
        map.put("brand-model", this.b);
        map.put("app-device", "nodata");
        map.put("app-time", str);
        map.put("sys-version", "10");
        map.put("device", this.OL);
        map.put("os", "Android");
        map.put("app-version", this.T4);
        return map;
    }

    private void l() {
        String[] strArrSplit = C1370pv.l(this.N).split("\\|");
        if (strArrSplit[0].endsWith(".txt")) {
            this.v = strArrSplit[0];
        } else if (strArrSplit[0].endsWith(".json")) {
            // fall through
        }
        this.v = Yy.v(strArrSplit[0], null);
        this.S = strArrSplit[1];
        this.T4 = strArrSplit[2];
        String str = this.v + "/info.php";
        HashMap map = new HashMap();
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        String lowerCase = ZP.S(strValueOf + this.S).toLowerCase();
        String lowerCase2 = ZP.S(strValueOf + lowerCase).toLowerCase();
        map.put("t", strValueOf);
        map.put("m", lowerCase2);
        map.put("n", lowerCase);
        Yy.tT(Yy.T4(), str, map, N(strValueOf), new xx.ut(this, lowerCase2) {

            final String S;
            final Muou T4;

            {
                this.T4 = this;
                this.S = lowerCase2;
            }

            @Override
            public void onFailure(Call call, Exception exc) {
            }

            @Override
            public String onResponse(String str2) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    JSONObject jSONObject2 = new JSONObject(C1370pv.n(jSONObject.optString("data"), ZP.l8(String.valueOf(jSONObject.getLong("time")), ZP.S).substring(0, 16), ZP.l8(this.S, ZP.S).substring(0, 16)));
                    this.T4.l = ZP.l8(jSONObject2.optString("key"), ZP.S).substring(0, 16);
                    this.T4.tT = ZP.l8(jSONObject2.optString("iv"), ZP.S).substring(0, 16);
                    this.T4.l8 = jSONObject2.optString("HBqq");
                    this.T4.n = jSONObject2.optString("HBrjjg");
                } catch (Exception e) {
                }
                return str2;
            }
        });
    }

    private String n(String str, int i, int i2) {
        if (str == null) {
            return str;
        }
        if (str.isEmpty()) {
            return str;
        }
        int length = str.length();
        if (i < 0) {
            throw new IllegalArgumentException("参数不能为负数");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("参数不能为负数");
        }
        if (i + i2 <= length) {
            return str.substring(i, length - i2);
        }
        return "";
    }

    private String tT(String str) {
        for (int i = 0; i < this.HM.length(); i++) {
            JSONObject jSONObjectOptJSONObject = this.HM.optJSONObject(i);
            if (str.equals(jSONObjectOptJSONObject.optString("playername"))) {
                return jSONObjectOptJSONObject.optString("playerjiekou");
            }
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            if (!this.l8.isEmpty()) {
                if (this.N.contains("qiaoji")) {
                    l();
                }
            }
            HM();
            int i5 = Integer.parseInt(str2);
            if (i5 != 0) {
                // keep i5 as parsed
            } else {
                i5 = 1;
            }
            String str3 = this.l8 + "/api.php/v1.vod?type=" + str + "&class=&area=&year=&by=time&page=" + str2 + "&limit=" + 18;
            JSONArray jSONArray2 = new JSONArray();
            String strV = Yy.v(str3, N(""));
            JSONArray jSONArray;
            if (strV.contains("list")) {
                jSONArray = new JSONObject(strV).optJSONObject("data").getJSONArray("list");
            } else {
                jSONArray = new JSONObject(C1370pv.n(strV, this.l, this.tT)).optJSONObject("data").getJSONArray("list");
            }
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("vod_id", jSONObjectOptJSONObject.optString("vod_id"));
                jSONObject.put("vod_name", jSONObjectOptJSONObject.optString("vod_name"));
                jSONObject.put("vod_pic", jSONObjectOptJSONObject.optString("vod_pic"));
                String strOptString = jSONObjectOptJSONObject.optString("vod_remarks");
                if (strOptString.equals("null")) {
                    strOptString = "";
                }
                jSONObject.put("vod_remarks", strOptString);
                jSONArray2.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("page", i5);
            int length2 = jSONArray2.length();
            int i = length2 == 18 ? i5 + 1 : i5;
            jSONObject2.put("pagecount", i);
            jSONObject2.put("limit", 18);
            jSONObject2.put("total", Integer.MAX_VALUE);
            jSONObject2.put("list", jSONArray2);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String detailContent(List<String> list) {
        try {
            if (!this.l8.isEmpty()) {
                if (this.N.contains("qiaoji")) {
                    l();
                }
            }
            HM();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            String str = this.l8 + "/api.php/v1.vod/detail?vod_id=" + list.get(0);
            JSONObject jSONObject = new JSONObject();
            String strV = Yy.v(str, N(""));
            JSONObject jSONObjectOptJSONObject;
            if (strV.contains("list")) {
                jSONObjectOptJSONObject = new JSONObject(strV).optJSONObject("data");
            } else {
                jSONObjectOptJSONObject = new JSONObject(C1370pv.n(strV, this.l, this.tT)).optJSONObject("data");
            }
            jSONObject.put("vod_id", jSONObjectOptJSONObject.optString("vod_id"));
            jSONObject.put("vod_name", jSONObjectOptJSONObject.optString("vod_name"));
            jSONObject.put("vod_pic", jSONObjectOptJSONObject.optString("vod_pic"));
            jSONObject.put("type_name", jSONObjectOptJSONObject.optString("vod_class"));
            jSONObject.put("vod_year", jSONObjectOptJSONObject.optString("vod_year"));
            jSONObject.put("vod_area", jSONObjectOptJSONObject.optString("vod_area"));
            String strOptString = jSONObjectOptJSONObject.optString("vod_remarks ");
            if (strOptString.equals("null")) {
                strOptString = "";
            }
            jSONObject.put("vod_remarks", strOptString);
            jSONObject.put("vod_actor", jSONObjectOptJSONObject.optString("vod_actor"));
            jSONObject.put("vod_director", jSONObjectOptJSONObject.optString("vod_director"));
            String strOptString2 = jSONObjectOptJSONObject.optString("vod_content");
            if (strOptString2.equals("null")) {
                strOptString2 = "";
            }
            jSONObject.put("vod_content", "此接口完全免费，请勿上当受骗！！" + strOptString2);
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("vod_play_list");
            Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
            while (itKeys.hasNext()) {
                JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject(itKeys.next());
                String strTrim = jSONObjectOptJSONObject4.optJSONObject("player_info").optString("show").trim();
                String strTrim2 = jSONObjectOptJSONObject4.optJSONObject("player_info").optString("from").trim();
                arrayList2.add(strTrim);
                JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject4.optJSONObject("urls");
                ArrayList arrayList3 = new ArrayList();
                Iterator<String> itKeys2 = jSONObjectOptJSONObject5.keys();
                while (itKeys2.hasNext()) {
                    JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject5.optJSONObject(itKeys2.next());
                    arrayList3.add(jSONObjectOptJSONObject6.optString("name") + "$" + jSONObjectOptJSONObject6.optString("url") + "&" + strTrim2);
                }
                arrayList.add(TextUtils.join("#", arrayList3));
            }
            String strJoin = TextUtils.join("$$", arrayList2);
            String strJoin2 = TextUtils.join("$$", arrayList);
            jSONObject.put("vod_play_from", strJoin);
            jSONObject.put("vod_play_url", strJoin2);
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            jSONObject2.put("list", jSONArray);
            return jSONObject2.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public String homeContent(boolean z) {
        try {
            if (!this.l8.isEmpty()) {
                if (this.N.contains("qiaoji")) {
                    l();
                }
            }
            HM();
            String strV = Yy.v(this.l8 + "/api.php/v1.vod/types", N(""));
            JSONArray jSONArray;
            if (strV.contains("typelist")) {
                jSONArray = new JSONObject(strV).optJSONObject("data").getJSONArray("typelist");
            } else {
                jSONArray = new JSONObject(C1370pv.n(strV, this.l, this.tT)).optJSONObject("data").getJSONArray("typelist");
            }
            JSONArray jSONArray3 = new JSONArray();
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i6);
                String strOptString = jSONObjectOptJSONObject.optString("type_name");
                String strOptString2 = jSONObjectOptJSONObject.optString("type_id");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type_id", strOptString2);
                jSONObject.put("type_name", strOptString);
                jSONArray3.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("class", jSONArray3);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String homeVideoContent() {
        try {
            if (!this.l8.isEmpty()) {
                if (this.N.contains("qiaoji")) {
                    l();
                }
            }
            HM();
            JSONArray jSONArray2 = new JSONArray();
            String strV = Yy.v(this.l8 + "/api.php/v1.vod/HomeIndex?page=&limit=6", N(""));
            JSONArray jSONArray;
            if (strV.contains("vod_list")) {
                jSONArray = new JSONObject(strV).getJSONArray("data").optJSONObject(2).getJSONArray("vod_list");
            } else {
                jSONArray = new JSONObject(C1370pv.n(strV, this.l, this.tT)).getJSONArray("data").optJSONObject(2).getJSONArray("vod_list");
            }
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i6);
                String strOptString = jSONObjectOptJSONObject.optString("vod_id");
                String strOptString2 = jSONObjectOptJSONObject.optString("vod_name");
                String strOptString3 = jSONObjectOptJSONObject.optString("vod_pic");
                String strOptString4 = jSONObjectOptJSONObject.optString("vod_remarks");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("vod_id", strOptString);
                jSONObject.put("vod_name", strOptString2);
                jSONObject.put("vod_pic", strOptString3);
                jSONObject.put("vod_remarks", strOptString4);
                jSONArray2.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("list", jSONArray2);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context);
        this.N = str;
        this.OL = ZF.S(16);
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            Init2.lj();
            String strV = Yy.v(this.v + "/api.php?action=playerinfo", N(""));
            if (strV.contains("playerinfo")) {
                this.HM = new JSONObject(strV).optJSONObject("data").getJSONArray("playerinfo");
            } else {
                this.HM = new JSONObject(C1370pv.n(strV, this.l, this.tT)).optJSONObject("data").getJSONArray("playerinfo");
            }
            String[] strArrSplit = str2.split("&");
            String str4 = strArrSplit[1];
            String str5 = strArrSplit[0];
            String strTT = tT(str4);
            String str3;
            if (strTT == null) {
                str3 = this.n;
            } else {
                str3 = strTT;
            }
            if (!str3.contains("http")) {
                String strV2 = Yy.v(str3 + str5, N(""));
                JSONObject jSONObject;
                if (strV2.contains("{")) {
                    jSONObject = new JSONObject(C1370pv.n(strV2, this.l, this.tT));
                } else {
                    jSONObject = new JSONObject(strV2);
                }
                if (jSONObject.has("url")) {
                    String strOptString = jSONObject.optString("url");
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("url", strOptString);
                    jSONObject5.put("parse", 0);
                    return jSONObject5.toString();
                } else {
                    String strOptString = jSONObject.optJSONObject("data").optString("url");
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("url", strOptString);
                    jSONObject4.put("parse", 0);
                    return jSONObject4.toString();
                }
            } else {
                if (str5.contains("m3u8") || str5.contains("mp4")) {
                    // direct playback, fall through
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", str5);
                jSONObject2.put("parse", 0);
                return jSONObject2.toString();
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return null;
    }

    public String searchContent(String str, boolean z) {
        try {
            JSONArray jSONArray2 = new JSONArray();
            if (!this.l8.isEmpty()) {
                if (this.N.contains("qiaoji")) {
                    l();
                }
            }
            HM();
            String strV = Yy.v(this.l8 + "/api.php/v1.vod?wd=" + URLEncoder.encode(str) + "&limit=18&page=1", N(""));
            JSONArray jSONArray;
            if (strV.contains("list")) {
                jSONArray = new JSONObject(strV).optJSONObject("data").getJSONArray("list");
            } else {
                jSONArray = new JSONObject(C1370pv.n(strV, this.l, this.tT)).optJSONObject("data").getJSONArray("list");
            }
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i6);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("vod_id", jSONObjectOptJSONObject.optString("vod_id"));
                jSONObject.put("vod_name", jSONObjectOptJSONObject.optString("vod_name"));
                jSONObject.put("vod_pic", jSONObjectOptJSONObject.optString("vod_pic"));
                String strOptString = jSONObjectOptJSONObject.optString("vod_remarks");
                if (strOptString.equals("null")) {
                    strOptString = "";
                }
                jSONObject.put("vod_remarks", strOptString);
                jSONArray2.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("list", jSONArray2);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
