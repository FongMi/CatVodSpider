package com.github.catvod.spider;

import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.k.C0575b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class QiutongTY extends Spider {
    public final String a = "https://aapi2.xbncs.com/api";

    private String buildDetailResult(HashMap map) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject(map));
            jSONObject.put("list", jSONArray);
            jSONObject.put("code", 1);
            jSONObject.put("msg", "");
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "{\"code\":500,\"msg\":\"build error\"}";
        }
    }

    private String buildResultJson(ArrayList<HashMap> arrayList, int i) {
        int iCeil = (int) Math.ceil(((double) Integer.MAX_VALUE) / ((double) 30));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("page", i);
            jSONObject.put("pagecount", iCeil);
            jSONObject.put("limit", 30);
            jSONObject.put("total", Integer.MAX_VALUE);
            JSONArray jSONArray = new JSONArray();
            Iterator<HashMap> it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put(new JSONObject(it.next()));
            }
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "{\"code\":500,\"msg\":\"error\"}";
        }
    }

    private String optStringSafe(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return "";
        }
        String strOptString = jSONObject.optString(str);
        return "null".equals(strOptString) ? "" : strOptString;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        JSONObject jSONObjectOptJSONObject;
        ArrayList<HashMap> arrayList = new ArrayList<>();
        try {
            if (str.equals("-1")) {
                str = "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append("/room/page?roomType=&navId=" + str + "&roomId=&word=&page=" + str2 + "&pageSize=30&channelId=3&platform=1");
            String string = sb.toString();
            HashMap map2 = new HashMap();
            map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
            jSONObjectOptJSONObject = new JSONObject(C0575b.l(string, map2)).optJSONObject("data");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (jSONObjectOptJSONObject == null) {
            throw new Exception("Missing data field");
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("list");
        if (jSONArrayOptJSONArray == null) {
            throw new Exception("Missing list field");
        }
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
            String strOptStringSafe = optStringSafe(jSONObject, "roomId");
            String strOptStringSafe2 = optStringSafe(jSONObject, "title");
            String strOptStringSafe3 = optStringSafe(jSONObject, "cover");
            String strOptStringSafe4 = optStringSafe(jSONObject, "navName");
            HashMap map3 = new HashMap();
            map3.put("vod_id", strOptStringSafe);
            map3.put("vod_name", strOptStringSafe2);
            map3.put("vod_pic", strOptStringSafe3);
            map3.put("vod_remarks", strOptStringSafe4);
            arrayList.add(map3);
        }
        return buildResultJson(arrayList, Integer.parseInt(str2));
    }

    public String detailContent(List<String> list) throws JSONException {
        HashMap map = new HashMap();
        try {
            String str = this.a + String.format("/room/info?roomId=%s&channelId=3&platform=1", list.get(0));
            HashMap map2 = new HashMap();
            map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
            JSONObject jSONObjectOptJSONObject = new JSONObject(C0575b.l(str, map2)).optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                throw new Exception("Missing data field");
            }
            map.put("vod_name", optStringSafe(jSONObjectOptJSONObject, "title"));
            map.put("vod_pic", optStringSafe(jSONObjectOptJSONObject, "cover"));
            map.put("vod_content", jSONObjectOptJSONObject.has("description") ? optStringSafe(jSONObjectOptJSONObject, "description") : "");
            map.put("type_name", jSONObjectOptJSONObject.has("nickName") ? optStringSafe(jSONObjectOptJSONObject, "nickName") : "");
            map.put("vod_play_from", "球通");
            ArrayList arrayList = new ArrayList();
            if (jSONObjectOptJSONObject.has("pushUrl")) {
                String strOptStringSafe = optStringSafe(jSONObjectOptJSONObject, "pushUrl");
                if (!TextUtils.isEmpty(strOptStringSafe)) {
                    arrayList.add("flv".concat("$").concat(com.github.catvod.spider.merge.A.a.af(strOptStringSafe)));
                }
            }
            if (jSONObjectOptJSONObject.has("pullUrl")) {
                String strOptStringSafe2 = optStringSafe(jSONObjectOptJSONObject, "pullUrl");
                if (!TextUtils.isEmpty(strOptStringSafe2)) {
                    arrayList.add("m3u8".concat("$").concat(com.github.catvod.spider.merge.A.a.af(strOptStringSafe2)));
                }
            }
            if (arrayList.size() != 0) {
                map.put("vod_play_url", TextUtils.join("#", arrayList));
                return buildDetailResult(map);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", -1);
            jSONObject.put("msg", "暂无播放数据");
            return jSONObject.toString();
        } catch (Throwable th) {
            String str2 = "数据获取异常:" + th.getMessage();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", -1);
            jSONObject2.put("msg", str2);
            return jSONObject2.toString();
        }
    }

    public String homeContent(boolean z) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type_id", "-1");
        jSONObject.put("type_name", "全部");
        jSONArray.put(jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type_id", "1");
        jSONObject2.put("type_name", "足球");
        jSONArray.put(jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("type_id", "2");
        jSONObject3.put("type_name", "篮球");
        jSONArray.put(jSONObject3);
        try {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("class", jSONArray);
            return jSONObject4.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "{\"class\":[]}";
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strAt = com.github.catvod.spider.merge.A.a.at(str2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", strAt);
            jSONObject.put("parse", 0);
            jSONObject.put("header", new JSONObject());
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "{\"parse\":0,\"url\":\"\",\"header\":{}}";
        }
    }
}
