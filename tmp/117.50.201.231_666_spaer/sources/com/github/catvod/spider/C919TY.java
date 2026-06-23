package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.k.C0575b;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.919TY, reason: invalid class name */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class C919TY extends Spider {
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            HashMap map2 = new HashMap();
            map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
            JSONObject jSONObject = new JSONObject(C0575b.l("https://01cs01.fusk39cd.com/api/web/live_lists/" + str, map2));
            if (jSONObject.getInt("code") != 200) {
                return "{\"list\":[],\"page\":1,\"pagecount\":1,\"limit\":20,\"total\":0}";
            }
            JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("data");
            if (jSONArray.length() == 0) {
                return "{\"list\":[],\"page\":1,\"pagecount\":1,\"limit\":20,\"total\":0}";
            }
            JSONArray jSONArray2 = new JSONArray();
            int i = 0;
            while (i < jSONArray.length()) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2.has("tournament_id")) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("vod_id", jSONObject2.getString("type") + "|" + jSONObject2.getString("tournament_id") + "|" + jSONObject2.getString("member_id"));
                    StringBuilder sb = new StringBuilder();
                    sb.append(jSONObject2.getString("home_team_zh"));
                    sb.append(" VS ");
                    sb.append(jSONObject2.getString("away_team_zh"));
                    jSONObject3.put("vod_name", sb.toString());
                    jSONObject3.put("vod_pic", jSONObject2.getString("cover"));
                    jSONObject3.put("vod_remarks", jSONObject2.getString("league_name_zh"));
                    jSONArray2.put(jSONObject3);
                    i++;
                } else {
                    i++;
                }
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("list", jSONArray2);
            jSONObject4.put("page", str2);
            jSONObject4.put("pagecount", 1);
            jSONObject4.put("limit", 20);
            jSONObject4.put("total", jSONArray2.length());
            return jSONObject4.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return "{\"list\":[],\"page\":1,\"pagecount\":1,\"limit\":20,\"total\":0}";
        }
    }

    public String detailContent(List<String> list) {
        try {
            String str = list.get(0);
            String[] strArrSplit = str.split("\\|");
            if (strArrSplit.length != 3) {
                return "{\"list\":[]}";
            }
            String str2 = "https://01cs01.fusk39cd.com/api/web/live_lists/" + strArrSplit[0] + "/detail/" + strArrSplit[1] + "?member_id=" + strArrSplit[2];
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
            JSONObject jSONObject = new JSONObject(C0575b.l(str2, map));
            if (jSONObject.getInt("code") != 200) {
                return "{\"list\":[]}";
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("detail");
            JSONArray jSONArray = jSONObject2.getJSONArray("more");
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            String string = jSONObject3.getString("home_team_zh");
            String string2 = jSONObject3.getString("away_team_zh");
            jSONObject3.getString("member_id");
            String string3 = jSONObject3.getString("room_notice");
            String str3 = string + " VS " + string2;
            for (int i = 0; i < jSONArray.length(); i++) {
                String string4 = jSONArray.getJSONObject(i).getString("username");
                if (i > 0) {
                    sb.append("$$$");
                }
                sb.append(string4);
            }
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(i2);
                String string5 = jSONObject4.getString("screen_url");
                String string6 = jSONObject4.getString("screen_url_m3u8");
                if (i2 > 0) {
                    sb2.append("$$$");
                }
                sb2.append("线路一$");
                sb2.append(string5);
                sb2.append("#线路二$");
                sb2.append(string6);
            }
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("vod_id", str);
            jSONObject5.put("vod_name", str3);
            jSONObject5.put("vod_pic", "");
            jSONObject5.put("vod_play_from", sb.toString());
            jSONObject5.put("vod_play_url", sb2.toString());
            jSONObject5.put("vod_actor", "");
            jSONObject5.put("vod_director", "");
            jSONObject5.put("vod_content", string3);
            jSONObject5.put("vod_year", "");
            jSONObject5.put("vod_area", "");
            jSONObject5.put("vod_remarks", "");
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONObject5);
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("list", jSONArray2);
            return jSONObject6.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"list\":[]}";
        }
    }

    public String homeContent(boolean z) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type_id", "1");
            jSONObject.put("type_name", "全部");
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type_id", "2");
            jSONObject2.put("type_name", "足球");
            jSONArray.put(jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("type_id", "3");
            jSONObject3.put("type_name", "篮球");
            jSONArray.put(jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("class", jSONArray);
            return jSONObject4.toString();
        } catch (Exception e) {
            return "{\"class\":[]}";
        }
    }

    public void init(Context context, String str) {
        try {
            super.init(context, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            return "{\"parse\":0,\"url\":\"" + str2 + "\",\"header\":{\"User-Agent\":\"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36\"}}";
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"parse\":0,\"url\":\"\"}";
        }
    }
}
