package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.k.C0575b;
import com.google.protobuf.DescriptorProtos;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class TianquanDJ extends Spider {
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            try {
                if (TextUtils.isEmpty(str2)) {
                    str2 = "1";
                }
                Integer.parseInt(str2);
            } catch (Exception e) {
                return "{\"list\":[],\"page\":1,\"pagecount\":1,\"limit\":20,\"total\":0}";
            }
        } catch (NumberFormatException unused) {
            str2 = "1";
        }
        String str3 = "https://api.cenguigui.cn/api/duanju/api.php?name=" + URLEncoder.encode(str) + "&page=" + str2;
        HashMap map2 = new HashMap();
        map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
        JSONObject jSONObject = new JSONObject(C0575b.l(str3, map2));
        if (jSONObject.getInt("code") != 200) {
            return "{\"list\":[],\"page\":1,\"pagecount\":1,\"limit\":20,\"total\":0}";
        }
        JSONArray jSONArray = jSONObject.getJSONArray("data");
        if (jSONArray.length() == 0) {
            return "{\"list\":[],\"page\":1,\"pagecount\":1,\"limit\":20,\"total\":0}";
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("vod_id", jSONObject2.getString("book_id"));
            jSONObject3.put("vod_name", jSONObject2.getString("title"));
            jSONObject3.put("vod_pic", jSONObject2.getString("cover"));
            jSONObject3.put("vod_remarks", jSONObject2.getInt("episode_cnt") + "集");
            jSONArray2.put(jSONObject3);
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("list", jSONArray2);
        jSONObject4.put("page", str2);
        jSONObject4.put("pagecount", 20);
        jSONObject4.put("limit", 20);
        jSONObject4.put("total", DescriptorProtos.Edition.EDITION_2023_VALUE);
        return jSONObject4.toString();
    }

    public String detailContent(List<String> list) {
        String str = list.get(0);
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
            JSONObject jSONObject = new JSONObject(C0575b.l("https://api.cenguigui.cn/api/duanju/api.php?book_id=" + str, map));
            if (jSONObject.getInt("code") != 200) {
                return "{\"list\":[]}";
            }
            String string = jSONObject.getString("book_name");
            String string2 = jSONObject.getString("desc");
            String string3 = jSONObject.getString("category");
            JSONArray jSONArray = jSONObject.getJSONArray("data");
            if (jSONArray.length() == 0) {
                return "{\"list\":[]}";
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string4 = jSONObject2.getString("video_id");
                String string5 = jSONObject2.getString("title");
                if (i > 0) {
                    sb.append("#");
                }
                sb.append(string5);
                sb.append("$");
                sb.append(string4);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("vod_id", str);
            jSONObject3.put("vod_name", string);
            jSONObject3.put("vod_pic", "");
            jSONObject3.put("vod_play_from", "短剧");
            jSONObject3.put("vod_play_url", sb.toString());
            jSONObject3.put("vod_actor", "");
            jSONObject3.put("vod_director", "");
            jSONObject3.put("vod_content", string2);
            jSONObject3.put("vod_year", "");
            jSONObject3.put("vod_area", "");
            jSONObject3.put("vod_remarks", string3);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("list", jSONArray2);
            return jSONObject4.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"list\":[]}";
        }
    }

    public String homeContent(boolean z) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArray = new JSONArray();
        try {
            for (String str : "逆袭,霸总,现代言情,打脸虐渣,豪门恩怨,神豪,马甲,都市日常,战神归来,小人物,女性成长,大女主,穿越,都市修仙,强者回归,亲情,古装,重生,闪婚,赘婿逆袭,虐恋,追妻,天下无敌,家庭伦理,萌宝,古风权谋,职场,奇幻脑洞,异能,无敌神医,古风言情,传承觉醒,现言甜宠,奇幻爱情,乡村,历史古代,王妃,高手下山,娱乐圈,强强联合,破镜重圆,暗恋成真,民国,欢喜冤家,系统,真假千金,龙王,校园,穿书,女帝,团宠,年代爱情,玄幻仙侠,青梅竹马,悬疑推理,皇后,替身,大叔,喜剧,剧情".split(",")) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type_id", str);
                jSONObject.put("type_name", str);
                jSONArray.put(jSONObject);
            }
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
            JSONArray jSONArrayOptJSONArray = new JSONObject(C0575b.l("https://api.cenguigui.cn/api/duanju/api.php?type=recommend", map)).optJSONArray("data");
            JSONArray jSONArray2 = new JSONArray();
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("book_data")) != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("vod_id", jSONObjectOptJSONObject.optString("book_id"));
                        jSONObject2.put("vod_name", jSONObjectOptJSONObject.optString("book_name"));
                        jSONObject2.put("vod_pic", jSONObjectOptJSONObject.optString("thumb_url"));
                        jSONObject2.put("vod_remarks", jSONObjectOptJSONObject.optString("serial_count") + "集");
                        jSONArray2.put(jSONObject2);
                    }
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("class", jSONArray);
            jSONObject3.put("list", jSONArray2);
            return jSONObject3.toString();
        } catch (Exception e) {
            return "{\"class\":[],\"list\":[]}";
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
        String string = "{\"parse\":0,\"url\":[]}";
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
            String string2 = "";
            String string3 = "";
            try {
                string2 = new JSONObject(C0575b.l("https://api.cenguigui.cn/api/duanju/api.php?video_id=" + str2 + "&type=json&level=2160p", map)).getString("url");
            } catch (Exception unused) {
            }
            try {
                string3 = new JSONObject(C0575b.l("https://api.cenguigui.cn/api/duanju/api.php?video_id=" + str2 + "&type=json&level=1080p", map)).getString("url");
            } catch (Exception unused2) {
            }
            if (TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3)) {
                return "{\"parse\":0,\"url\":[]}";
            }
            JSONArray jSONArray = new JSONArray();
            if (!TextUtils.isEmpty(string2)) {
                jSONArray.put("原画");
                jSONArray.put(string2);
            }
            if (!TextUtils.isEmpty(string3)) {
                jSONArray.put("高清");
                jSONArray.put(string3);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", jSONArray);
            jSONObject.put("parse", 0);
            string = jSONObject.toString();
            return string;
        } catch (Exception e) {
            e.printStackTrace();
            return string;
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            String str2 = "https://api.cenguigui.cn/api/duanju/api.php?name=" + URLEncoder.encode(str);
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
            JSONObject jSONObject = new JSONObject(C0575b.l(str2, map));
            if (jSONObject.getInt("code") != 200) {
                return "{\"list\":[]}";
            }
            JSONArray jSONArray = jSONObject.getJSONArray("data");
            if (jSONArray.length() == 0) {
                return "{\"list\":[]}";
            }
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("vod_id", jSONObject2.getString("book_id"));
                jSONObject3.put("vod_name", jSONObject2.getString("title"));
                jSONObject3.put("vod_pic", jSONObject2.getString("cover"));
                jSONObject3.put("vod_remarks", jSONObject2.getInt("episode_cnt") + "集");
                jSONArray2.put(jSONObject3);
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("list", jSONArray2);
            return jSONObject4.toString();
        } catch (Exception e) {
            return "{\"list\":[]}";
        }
    }
}
