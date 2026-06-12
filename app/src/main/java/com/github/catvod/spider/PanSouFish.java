package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.K.VodResult;
import com.github.catvod.spider.merge.K.VodItem;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
public class PanSouFish extends NetPan {
    private static Gson p = new Gson();
    private static final Map<String, String> q;
    private String l = "https://so.252035.xyz";
    private String m = "";
    public String n = "";
    private ConcurrentHashMap<String, JSONArray> o = new ConcurrentHashMap<>();

    class Filter {
    }

    static {
        HashMap map = new HashMap();
        q = map;
        map.put("aliyun", "阿里云盘");
        map.put("baidu", "百度网盘");
        map.put("quark", "夸克网盘");
        map.put("tianyi", "天翼云盘");
        map.put("uc", "UC网盘");
        map.put("115", "115网盘");
        map.put("pikpak", "PikPak");
        map.put("xunlei", "迅雷网盘");
        map.put("123", "123盘");
        map.put("magnet", "磁力链接");
        map.put("ed2k", "电驴链接");
    }

    private void f(String str, String str2, List<VodItem> list) {
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("data");
            if (jSONObject.has("merged_by_type")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("merged_by_type");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!"pikpak".contains(next) && !"xunlei".contains(next) && !"thunder".contains(next) && !"magnet".contains(next) && !"ed2k".contains(next) && !"others".contains(next)) {
                        JSONArray jSONArray = jSONObject2.getJSONArray(next);
                        String str3 = next + "###" + str2;
                        this.o.put(str3, jSONArray);
                        String string = jSONArray.getJSONObject(0).getString("url");
                        if (NetPan.isNetPan(string)) {
                            list.add(new VodItem(str3, str2, NetPan.getYunPanPic(string), String.valueOf(jSONArray.length()), true));
                        }
                    }
                }
            }
        } catch (Exception e) {
            StringUtils.printStackTrace();
        }
    }

    private String g(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("kw", str);
            jsonObject.addProperty("res", "merge");
            jsonObject.addProperty("src", "all");
            if (com.github.catvod.spider.merge.P0.StringUtils.d(this.m)) {
                jsonObject.add("filter", (JsonObject) p.fromJson(this.m, JsonObject.class));
            }
            String str2 = this.l + "/api/search";
            String json = p.toJson(jsonObject);
            HashMap map = new HashMap();
            map.put("cookie", this.n);
            map.put("referer", str2);
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
            map.put("Content-Type", "application/json");
            f(com.github.catvod.spider.merge.f0.HttpClient.f(str2, json, map).a(), str, arrayList);
        } catch (Exception e) {
            StringUtils.printStackTrace();
        }
        return VodResult.n(arrayList);
    }

    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException {
        String str3;
        JSONArray jSONArray = this.o.get(str);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String str4 = str.split("###")[0];
            String str5 = str.split("###")[1];
            VodItem iVar = null;
            try {
                String strOptString = jSONObject.optString("url", jSONObject.optString("link", jSONObject.optString("share_url", "")));
                if (!TextUtils.isEmpty(strOptString) || NetPan.isNetPan(strOptString)) {
                    String strOptString2 = jSONObject.optString("title", jSONObject.optString("note", jSONObject.optString("file_name", "未知资源")));
                    jSONObject.optString("description", jSONObject.optString("desc", ""));
                    String strOptString3 = jSONObject.optString("time", jSONObject.optString("created_at", jSONObject.optString("update_time", "")));
                    String strOptString4 = jSONObject.optString("size", jSONObject.optString("file_size", ""));
                    String str6 = strOptString + "#" + str5;
                    String yunPanPic = NetPan.getYunPanPic(strOptString);
                    StringBuilder sb = new StringBuilder();
                    ?? r9 = q;
                    if (r9.containsKey(str4)) {
                        str4 = (String) r9.get(str4);
                    }
                    sb.append("[");
                    sb.append(str4);
                    sb.append("]");
                    if (!TextUtils.isEmpty(strOptString4)) {
                        sb.append(" ");
                        sb.append(strOptString4);
                    }
                    if (!TextUtils.isEmpty(strOptString3)) {
                        sb.append(" ");
                        if (strOptString3.contains("T")) {
                            str3 = strOptString3.split("T")[0];
                            sb.append(str3);
                        } else {
                            if (strOptString3.contains(" ")) {
                                strOptString3 = strOptString3.split(" ")[0];
                            }
                            str3 = strOptString3;
                            sb.append(str3);
                        }
                    }
                    iVar = new VodItem(str6, strOptString2, yunPanPic, sb.toString());
                }
            } catch (Exception e) {
                StringUtils.printStackTrace();
            }
            if (iVar != null) {
                arrayList.add(iVar);
            }
        }
        VodResult gVar = new VodResult();
        gVar.y(arrayList);
        gVar.j(1, 1, 0, 1);
        return gVar.toString();
    }

    @Override // com.github.catvod.en.NetPan
    public String detailContent(List<String> list) {
        String[] strArrSplit = list.get(0).split("#", 2);
        return super.detailContent("", strArrSplit.length > 1 ? strArrSplit[1] : "", Arrays.asList(strArrSplit[0]));
    }

    @Override // com.github.catvod.en.NetPan
    public void init(Context context, String str) {
        super.init(context, str);
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("siteUrl")) {
                this.l = jSONObject.getString("siteUrl");
            }
            if (jSONObject.has("filter")) {
                this.m = jSONObject.getString("filter");
            }
        } catch (Exception e) {
            StringUtils.printStackTrace();
        }
    }

    public String searchContent(String str, boolean z) {
        return g(str);
    }

    public String searchContent(String str, boolean z, String str2) {
        return g(str);
    }
}
