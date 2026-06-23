package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.c.C0552c;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class AppFox extends Spider {
    public static final String vodindex = "";
    public static final String vodname = "";
    private final Map<String, String> a = new HashMap<String, String>() { // from class: com.github.catvod.spider.AppFox.1
        {
            put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36");
            put("Connection", "Keep-Alive");
            put("Accept-Language", "zh-CN,zh;q=0.8");
            put("Cache-Control", "no-cache");
        }
    };
    private int b = 5;
    private int c = 1;
    private final HashMap d = new HashMap();
    private final HashMap e = new HashMap();
    private final HashMap f = new HashMap();
    private String g = "";
    private String h = "";
    private final ArrayList i = new ArrayList();
    private int j = 0;
    private int k = 1;
    private String l = "";
    private final Pattern m = Pattern.compile("https?://.*\\.(m3u8|mp4|flv|mkv)");

    private static void a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        HashMap<String, String> map = new HashMap<String, String>() { // from class: com.github.catvod.spider.AppFox.2
            {
                put("class", "类型");
                put("area", "地区");
                put("lang", "语言");
                put("year", "年份");
                put("sort", "排序");
            }
        };
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("filter_type_list");
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i);
            String string = jSONObject3.getString("name");
            JSONArray jSONArrayOptJSONArray2 = jSONObject3.optJSONArray("list");
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() != 0) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                    String string2 = jSONArrayOptJSONArray2.getString(i2);
                    jSONArray2.put(new JSONObject().put("n", string2).put("v", string2));
                }
                String str = map.containsKey(string) ? map.get(string) : string;
                if ("sort".equals(string)) {
                    string = "by";
                }
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("key", string);
                jSONObject4.put("name", str);
                jSONObject4.put("value", jSONArray2);
                jSONArray.put(jSONObject4);
            }
        }
        String string3 = jSONObject.getString("type_id");
        if (jSONArray.length() > 0) {
            jSONObject2.put(string3, jSONArray);
        }
    }

    private static ArrayList b(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                arrayList.add(c((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                arrayList.add(b((JSONArray) obj));
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private static HashMap c(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                map.put(next, c((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                map.put(next, b((JSONArray) obj));
            } else {
                map.put(next, obj);
            }
        }
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(this.g)) {
            return new C0552c().toString();
        }
        HashMap map2 = new HashMap(this.a);
        String str3 = (String) this.d.get("category");
        if (!TextUtils.isEmpty(str3)) {
            map2.put("User-Agent", str3);
        }
        HashMap<String, String> map3 = new HashMap<String, String>(map) { // from class: com.github.catvod.spider.AppFox.3
            {
                put("area", map.containsKey("area") ? (String) map.get("area") : "全部");
                put("year", map.containsKey("year") ? (String) map.get("area") : "全部");
                put("lang", map.containsKey("lang") ? (String) map.get("area") : "全部");
                put("class", map.containsKey("class") ? (String) map.get("area") : "全部");
                put("sort", map.containsKey("sort") ? (String) map.get("area") : "全部");
            }
        };
        try {
            if (TextUtils.isEmpty(this.l) || this.k == 2) {
                JSONArray jSONArray = new JSONObject(com.github.catvod.spider.merge.AC.d.x(this.g + "/api.php/Appfox/vodList?type_id=" + str + "&page=" + str2 + "&class=" + map3.get("class") + "&area=" + map3.get("area") + "&lang=" + map3.get("lang") + "&year=" + map3.get("year") + "&sort=" + map3.get("sort"), map2, this.b)).getJSONObject("data").getJSONArray("recommend_list");
                jSONObject = new JSONObject();
                jSONObject.put("list", jSONArray);
            } else {
                StringBuilder sb = new StringBuilder(this.l);
                sb.append("pg=");
                sb.append(str2);
                sb.append("&t=");
                sb.append(str);
                for (Map.Entry<String, String> entry : map3.entrySet()) {
                    if (!"全部".equals(entry.getValue())) {
                        sb.append("&");
                        sb.append(entry.getKey());
                        sb.append("=");
                        sb.append(entry.getValue());
                    }
                }
                jSONObject = new JSONObject(com.github.catvod.spider.merge.AC.d.x(sb.toString(), map2, this.b));
            }
            if (this.k == 2 && jSONObject.has("list")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("list");
                for (int i = 0; i < jSONArray2.length(); i++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                    jSONObject2.put("vod_id", "msearch:" + jSONObject2.getString("vod_id"));
                }
            }
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return new C0552c().toString();
        }
    }

    public String detailContent(List<String> list) {
        JSONObject jSONObject;
        String[] strArr;
        String[] strArr2;
        Map<String, String> map = this.a;
        HashMap map2 = new HashMap(map);
        HashMap map3 = this.d;
        String str = (String) map3.get(map3.containsKey("detail") ? "detail" : "search");
        if (!TextUtils.isEmpty(str)) {
            map2.put("User-Agent", str);
        }
        try {
            String str2 = list.get(0);
            Iterator it = this.i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    jSONObject = null;
                    break;
                }
                JSONObject jSONObject2 = (JSONObject) it.next();
                if (jSONObject2.getString("vod_id").equals(str2)) {
                    jSONObject = new JSONObject(jSONObject2.toString());
                    break;
                }
            }
            if (jSONObject == null) {
                if (TextUtils.isEmpty(this.l)) {
                    JSONArray jSONArray = new JSONObject(com.github.catvod.spider.merge.AC.d.x(this.g + "/api.php/Appfox/vod?ac=detail&ids=" + str2, map2, this.b)).getJSONArray("list");
                    if (jSONArray.length() > 0) {
                        jSONObject = jSONArray.getJSONObject(0);
                    }
                } else {
                    String str3 = this.l;
                    if (str3.contains("?")) {
                        str3 = this.l.split("\\?")[0] + "?";
                    }
                    JSONArray jSONArray2 = new JSONObject(com.github.catvod.spider.merge.AC.d.x(str3 + "ac=detail&ids=" + str2, map2, this.b)).getJSONArray("list");
                    if (jSONArray2.length() > 0) {
                        jSONObject = jSONArray2.getJSONObject(0);
                    }
                }
            }
            if (jSONObject == null) {
                return new JSONObject().put("list", new JSONArray()).toString();
            }
            String string = jSONObject.getString("vod_name");
            String[] strArrSplit = jSONObject.getString("vod_play_from").split("\\$\\$\\$");
            String[] strArrSplit2 = jSONObject.getString("vod_play_url").split("\\$\\$\\$");
            try {
                HashMap map4 = new HashMap(map);
                String str4 = (String) map3.get("config");
                if (!TextUtils.isEmpty(str4)) {
                    map4.put("User-Agent", str4);
                }
                JSONObject jSONObject3 = new JSONObject(com.github.catvod.spider.merge.AC.d.x(this.g + "/api.php/Appfox/config", map4, this.b));
                JSONArray jSONArrayOptJSONArray = jSONObject3.getJSONObject("data").optJSONArray("playerList");
                JSONArray jSONArrayOptJSONArray2 = jSONObject3.getJSONObject("data").optJSONArray("jiexiDataList");
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray2 != null) {
                    HashMap map5 = new HashMap();
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        JSONObject jSONObject4 = jSONArrayOptJSONArray.getJSONObject(i);
                        map5.put(jSONObject4.getString("playerCode"), jSONObject4);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (String str5 : strArrSplit) {
                        if (map5.containsKey(str5)) {
                            JSONObject jSONObject5 = (JSONObject) map5.get(str5);
                            if (jSONObject5.getString("playerCode").equals(jSONObject5.getString("playerName"))) {
                                arrayList.add(str5);
                            } else {
                                arrayList.add(jSONObject5.getString("playerName") + "\u2005(" + str5 + ")");
                            }
                        } else {
                            arrayList.add(str5);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int i2 = 0;
                    while (i2 < strArrSplit.length) {
                        if (i2 >= strArrSplit2.length) {
                            strArr = strArrSplit2;
                        } else {
                            String[] strArrSplit3 = strArrSplit2[i2].split("#");
                            ArrayList arrayList3 = new ArrayList();
                            int length = strArrSplit3.length;
                            int i3 = 0;
                            while (i3 < length) {
                                String str6 = strArrSplit3[i3];
                                String[] strArrSplit4 = str6.split("\\$");
                                if (strArrSplit4.length >= 2) {
                                    StringBuilder sb = new StringBuilder();
                                    String str7 = strArrSplit4[0];
                                    sb.append(str7);
                                    strArr2 = strArrSplit2;
                                    sb.append("$");
                                    sb.append(strArrSplit[i2]);
                                    sb.append("@");
                                    sb.append(strArrSplit4[1]);
                                    sb.append("@");
                                    sb.append(string);
                                    sb.append("@");
                                    sb.append(str7);
                                    arrayList3.add(sb.toString());
                                } else {
                                    strArr2 = strArrSplit2;
                                    arrayList3.add(str6);
                                }
                                i3++;
                                strArrSplit2 = strArr2;
                            }
                            strArr = strArrSplit2;
                            arrayList2.add(TextUtils.join("#", arrayList3));
                        }
                        i2++;
                        strArrSplit2 = strArr;
                    }
                    jSONObject.put("vod_play_from", TextUtils.join("$$$", arrayList));
                    jSONObject.put("vod_play_url", TextUtils.join("$$$", arrayList2));
                    HashMap map6 = this.e;
                    map6.clear();
                    for (int i4 = 0; i4 < jSONArrayOptJSONArray2.length(); i4++) {
                        JSONObject jSONObject6 = jSONArrayOptJSONArray2.getJSONObject(i4);
                        if (jSONObject6.has("url") && jSONObject6.getString("url").startsWith("http")) {
                            map6.put(jSONObject6.getString("playerCode"), jSONObject6.getString("url"));
                        }
                    }
                    return new JSONObject().put("list", new JSONArray().put(jSONObject)).toString();
                }
                return new JSONObject().put("list", new JSONArray().put(jSONObject)).toString();
            } catch (Exception unused) {
                return new JSONObject().put("list", new JSONArray().put(jSONObject)).toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject().put("list", new JSONArray()).toString();
        }
    }

    public String homeContent(boolean z) {
        if (TextUtils.isEmpty(this.g) || this.k == 0) {
            return new C0552c().toString();
        }
        HashMap map = new HashMap(this.a);
        String str = (String) this.d.get("home");
        if (!TextUtils.isEmpty(str)) {
            map.put("User-Agent", str);
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        try {
            int i = 0;
            if (TextUtils.isEmpty(this.l) || this.k == 2) {
                JSONArray jSONArray2 = new JSONObject(com.github.catvod.spider.merge.AC.d.x(this.g + "/api.php/Appfox/init", map, this.b)).getJSONObject("data").getJSONArray("type_list");
                while (i < jSONArray2.length()) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i);
                    String string = jSONObject3.getString("type_name");
                    if (!string.equals("全部") && !string.equals("QQ") && !string.equals("juo.one") && !string.contains("企鹅群")) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("type_id", jSONObject3.getString("type_id"));
                        jSONObject4.put("type_name", string);
                        jSONArray.put(jSONObject4);
                        a(jSONObject3, jSONObject2);
                    }
                    i++;
                }
            } else {
                jSONArray = new JSONObject(com.github.catvod.spider.merge.AC.d.x(this.l.replaceAll("&$", "").replace("&ac=videolist", "").replace("ac=videolist&", "").replace("ac=videolist", "").replace("ac=detail", "ac=list"), map, this.b)).getJSONArray("class");
                JSONObject jSONObject5 = new JSONObject(com.github.catvod.spider.merge.AC.d.x(this.l.replaceAll("&$", ""), map, this.b));
                jSONObject5.put("class", jSONArray);
                if (this.k == 2) {
                    JSONArray jSONArray3 = jSONObject5.getJSONArray("list");
                    while (i < jSONArray3.length()) {
                        jSONArray3.getJSONObject(i).put("vod_id", "msearch:" + jSONArray3.getJSONObject(i).getString("vod_id"));
                        i++;
                    }
                }
            }
            jSONObject.put("class", jSONArray);
            jSONObject.put("filters", jSONObject2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public String homeVideoContent() {
        String str;
        if (TextUtils.isEmpty(this.g) || this.k == 0) {
            return new C0552c().toString();
        }
        if (!TextUtils.isEmpty(this.l) && this.k != 2) {
            return new C0552c().toString();
        }
        HashMap map = new HashMap(this.a);
        HashMap map2 = this.d;
        String str2 = (String) map2.get(map2.containsKey("homeVideo") ? "homeVideo" : "home");
        if (!TextUtils.isEmpty(str2)) {
            map.put("User-Agent", str2);
        }
        try {
            if (this.c == 2) {
                JSONArray jSONArray = new JSONObject(com.github.catvod.spider.merge.AC.d.x(this.g + "/api.php/appfox/nav", map, this.b)).getJSONArray("data");
                String string = "";
                int i = 0;
                while (true) {
                    if (i >= jSONArray.length()) {
                        break;
                    }
                    if (jSONArray.get(i) instanceof JSONObject) {
                        string = jSONArray.getJSONObject(i).getString("navigationId");
                        break;
                    }
                    i++;
                }
                if (TextUtils.isEmpty(string)) {
                    return new C0552c().toString();
                }
                str = "nav_video?id=" + string;
            } else {
                str = "index";
            }
            JSONArray jSONArray2 = new JSONObject(com.github.catvod.spider.merge.AC.d.x(this.g + "/api.php/Appfox/" + str, map, this.b)).getJSONArray("data");
            JSONArray jSONArray3 = new JSONArray();
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONObject jSONObject = jSONArray2.getJSONObject(i2);
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("banner");
                if (jSONArrayOptJSONArray != null) {
                    for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                        jSONArray3.put(jSONArrayOptJSONArray.getJSONObject(i3));
                    }
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("categories");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i4 = 0; i4 < jSONArrayOptJSONArray2.length(); i4++) {
                        JSONArray jSONArrayOptJSONArray3 = jSONArrayOptJSONArray2.getJSONObject(i4).optJSONArray("videos");
                        if (jSONArrayOptJSONArray3 != null) {
                            for (int i5 = 0; i5 < jSONArrayOptJSONArray3.length(); i5++) {
                                jSONArray3.put(jSONArrayOptJSONArray3.getJSONObject(i5));
                            }
                        }
                    }
                }
            }
            if (this.k == 2) {
                for (int i6 = 0; i6 < jSONArray3.length(); i6++) {
                    JSONObject jSONObject2 = jSONArray3.getJSONObject(i6);
                    jSONObject2.put("vod_id", "msearch:" + jSONObject2.getString("vod_id"));
                }
            }
            return new JSONObject().put("list", jSONArray3).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return new C0552c().toString();
        }
    }

    public void init(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            boolean zStartsWith = str.startsWith("http");
            Map<String, String> map = this.a;
            HashMap map2 = this.d;
            if (zStartsWith) {
                this.g = str;
            } else {
                JSONObject jSONObject = new JSONObject(str);
                this.g = jSONObject.getString("host");
                if (jSONObject.has("ver") && jSONObject.getInt("ver") == 2) {
                    this.c = 2;
                }
                if (jSONObject.has("cms")) {
                    String strReplaceAll = jSONObject.getString("cms").replaceAll("/$", "");
                    this.l = strReplaceAll;
                    if (strReplaceAll.matches("^https?:\\/\\/.*\\/vod")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.l);
                        sb.append(this.l.contains("?") ? "&" : "?");
                        this.l = sb.toString();
                    }
                }
                if (jSONObject.has("from")) {
                    this.h = jSONObject.getString("from");
                }
                if (jSONObject.has("parse")) {
                    this.f.putAll(c(jSONObject.getJSONObject("parse")));
                }
                if (jSONObject.has("custom_first")) {
                    this.j = jSONObject.getInt("custom_first");
                }
                if (jSONObject.has("category")) {
                    this.k = jSONObject.getInt("category");
                }
                if (jSONObject.has("ua")) {
                    Object obj = jSONObject.get("ua");
                    if (obj instanceof String) {
                        ((HashMap) map).put("User-Agent", (String) obj);
                    } else if (obj instanceof JSONObject) {
                        JSONObject jSONObject2 = (JSONObject) obj;
                        if (jSONObject2.has("host")) {
                            map2.put("host", jSONObject2.getString("host"));
                        }
                        if (jSONObject2.has("config")) {
                            map2.put("config", jSONObject2.getString("config"));
                        }
                        if (jSONObject2.has("home")) {
                            map2.put("home", jSONObject2.getString("home"));
                        }
                        if (jSONObject2.has("category")) {
                            map2.put("category", jSONObject2.getString("category"));
                        }
                        if (jSONObject2.has("search")) {
                            map2.put("search", jSONObject2.getString("search"));
                        }
                        if (jSONObject2.has("parse")) {
                            map2.put("parse", jSONObject2.getString("parse"));
                        }
                        if (jSONObject2.has("player")) {
                            map2.put("player", jSONObject2.getString("player"));
                        }
                    }
                }
                if (jSONObject.has("timeout")) {
                    this.b = jSONObject.getInt("timeout");
                }
            }
            if (!this.g.matches("^https?:\\/\\/[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(:\\d+)?(\\/)?$")) {
                HashMap map3 = new HashMap(map);
                String str2 = (String) map2.get("host");
                if (!TextUtils.isEmpty(str2)) {
                    map3.put("User-Agent", str2);
                }
                String strX = com.github.catvod.spider.merge.AC.d.x(this.g, map3, this.b);
                try {
                    this.g = new JSONObject(strX).getString("apiDomain");
                } catch (JSONException unused) {
                    this.g = strX.trim();
                }
                if (this.g.startsWith("http")) {
                    this.g = this.g;
                }
            }
            this.g = this.g.replaceAll("/$", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String playerContent(String str, String str2, List<String> list) throws JSONException {
        int i;
        int i2;
        int i3;
        JSONObject jSONObject;
        Pattern pattern = this.m;
        int i4 = 1;
        String[] strArrSplit = str2.split("@", 4);
        if (strArrSplit.length != 4) {
            return new C0552c().toString();
        }
        String str3 = strArrSplit[0];
        String str4 = strArrSplit[1];
        vodname = strArrSplit[2];
        vodindex = strArrSplit[3];
        String str5 = str4;
        HashMap map = new HashMap(this.a);
        HashMap map2 = this.d;
        String str6 = (String) map2.get("parse");
        if (!TextUtils.isEmpty(str6)) {
            map.put("User-Agent", str6);
        }
        String str7 = map2.containsKey("player") ? (String) map2.get("player") : "Mozilla/5.0 (iPhone; CPU iPhone OS 13_2_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/13.0.3 Mobile/15E148 Safari/604.1";
        ArrayList<Map> arrayList = new ArrayList();
        int i5 = this.j;
        HashMap map3 = this.e;
        HashMap map4 = this.f;
        if (i5 == 1) {
            arrayList.add(map4);
            arrayList.add(map3);
        } else {
            arrayList.add(map3);
            arrayList.add(map4);
        }
        try {
            if (pattern.matcher(str5).matches()) {
                i = 0;
                i2 = 0;
            } else {
                String string = str5;
                i = 0;
                i2 = 0;
                for (Map map5 : arrayList) {
                    if (i == i4 || i2 == i4) {
                        break;
                    }
                    Iterator it = map5.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            if (((String) entry.getKey()).contains(str3)) {
                                Object value = entry.getValue();
                                if (value instanceof List) {
                                    Iterator it2 = ((List) value).iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        String string2 = it2.next().toString();
                                        if (string2.startsWith("parse:")) {
                                            string = string2.split("parse:")[1] + str5;
                                            i2 = 1;
                                            break;
                                        }
                                        try {
                                            jSONObject = new JSONObject(com.github.catvod.spider.merge.AC.d.x(string2 + str5, map, this.b));
                                        } catch (Exception unused) {
                                        }
                                        if (jSONObject.has("url") && jSONObject.getString("url").startsWith("http")) {
                                            string = jSONObject.getString("url");
                                            i = 1;
                                            break;
                                        }
                                    }
                                    i3 = 1;
                                } else {
                                    String string3 = value.toString();
                                    if (string3.startsWith("parse:")) {
                                        string = string3.split("parse:")[1] + str5;
                                        i2 = 1;
                                        break;
                                    }
                                    try {
                                        JSONObject jSONObject2 = new JSONObject(com.github.catvod.spider.merge.AC.d.x(string3 + str5, map, this.b));
                                        if (jSONObject2.has("url")) {
                                            try {
                                                if (jSONObject2.getString("url").startsWith("http")) {
                                                    string = jSONObject2.getString("url");
                                                    i = 1;
                                                    break;
                                                }
                                            } catch (Exception unused2) {
                                            }
                                        }
                                    } catch (Exception unused3) {
                                    }
                                    i3 = 1;
                                }
                                if (i == i3 || i2 == i3) {
                                    break;
                                }
                            }
                        }
                    }
                    i4 = 1;
                }
                str5 = string;
            }
            int i6 = (pattern.matcher(str5).matches() || i != 0) ? 0 : 1;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("jx", i6);
            jSONObject3.put("parse", i2);
            jSONObject3.put("url", str5);
            jSONObject3.put("danmaku", Proxy.getUrl() + "?do=appdanmu&vodName=" + vodname + "&vodIndex=" + vodindex);
            jSONObject3.put("header", new JSONObject().put("User-Agent", str7));
            return jSONObject3.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return new C0552c().toString();
        }
    }

    public String searchContent(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(this.g)) {
            return new C0552c().toString();
        }
        HashMap map = new HashMap(this.a);
        String str3 = (String) this.d.get("search");
        if (!TextUtils.isEmpty(str3)) {
            map.put("User-Agent", str3);
        }
        try {
            if (TextUtils.isEmpty(this.l)) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.g);
                sb.append("/api.php/Appfox/vod?ac=detail&wd=");
                Pattern pattern = C0529a.a;
                sb.append(URLEncoder.encode(str));
                String string = sb.toString();
                if (!TextUtils.isEmpty(this.h)) {
                    string = string + "&from=" + this.h;
                }
                jSONObject = new JSONObject(com.github.catvod.spider.merge.AC.d.x(string, map, this.b));
            } else {
                String str4 = this.l;
                if (str4.contains("?")) {
                    str4 = this.l.split("\\?")[0] + "?";
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str4);
                sb2.append("ac=detail&wd=");
                Pattern pattern2 = C0529a.a;
                sb2.append(URLEncoder.encode(str));
                jSONObject = new JSONObject(com.github.catvod.spider.merge.AC.d.x(sb2.toString(), map, this.b));
            }
            ArrayList arrayList = this.i;
            arrayList.clear();
            if (jSONObject.has("list")) {
                JSONArray jSONArray = jSONObject.getJSONArray("list");
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getJSONObject(i));
                }
            }
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return new C0552c().toString();
        }
    }
}
