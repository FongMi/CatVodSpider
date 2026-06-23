package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.github.catvod.spider.merge.k.C0575b;
import com.github.catvod.spider.merge.m.C0602k;
import com.github.catvod.spider.merge.m.C0603l;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class PanSou extends Pan {
    private static HashMap<String, JsonElement> cacheMap = new HashMap<>();

    public static String E(String str, String str2) {
        String str3;
        String str4;
        if (!str2.equals("1")) {
            return new JsonObject().toString();
        }
        clearCache();
        String str5 = ((JsonObject) new Gson().fromJson(C0602k.a(C0602k.c("/config.json")), JsonObject.class)).get("pansouUrl").getAsString().replaceAll("\\/", "/") + "/api/search?kw=" + URLEncoder.encode(str) + "&cloud_types=aliyun,quark,uc,baidu,tianyi,123,mobile";
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36");
        String strL = C0575b.l(str5, map);
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        JsonObject asJsonObject = JsonParser.parseString(strL).getAsJsonObject().getAsJsonObject("data").getAsJsonObject("merged_by_type");
        for (Map.Entry entry : asJsonObject.entrySet()) {
            String str6 = (String) entry.getKey();
            JsonElement jsonElement = (JsonElement) entry.getValue();
            String str7 = str6 + "_json";
            synchronized (cacheMap) {
                cacheMap.put(str7, jsonElement);
            }
        }
        for (Map.Entry entry2 : asJsonObject.entrySet()) {
            String str8 = (String) entry2.getKey();
            int size = ((JsonElement) entry2.getValue()).getAsJsonArray().size();
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("vod_id", str8);
            if (str8.equals("aliyun")) {
                str3 = "阿里";
                str4 = "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/50zE/1200X800/aliyun.jpg";
            } else if (str8.equals("quark")) {
                str3 = "夸克";
                str4 = "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/El1L/1200X800/quark.jpg";
            } else if (str8.equals("uc")) {
                str3 = "UC";
                str4 = "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/OSYH/1200X800/uc.jpg";
            } else if (str8.equals("baidu")) {
                str3 = "百度";
                str4 = "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/0rBz/1200X800/baidu.jpg";
            } else if (str8.equals("tianyi")) {
                str3 = "天翼";
                str4 = "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/xiFH/1200X800/189.jpg";
            } else if (str8.equals("123")) {
                str3 = "123";
                str4 = "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/wF1k/1200X800/123.jpg";
            } else if (str8.equals("mobile")) {
                str3 = "移动";
                str4 = "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/cZvf/1200X800/139.jpg";
            } else {
                str3 = str8;
                str4 = "";
            }
            jsonObject2.addProperty("vod_name", str3 + " (" + size + "个)");
            jsonObject2.addProperty("vod_pic", str4);
            jsonObject2.addProperty("vod_tag", "folder");
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty("type", "list");
            jsonObject2.add("style", jsonObject3);
            jsonArray.add(jsonObject2);
        }
        jsonObject.add("list", jsonArray);
        return jsonObject.toString();
    }

    private static void clearCache() {
        synchronized (cacheMap) {
            cacheMap.clear();
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap map) {
        JsonElement jsonElement;
        Log.d("PanSou", "categoryContent - path: " + str + ", page: " + str2);
        if (!TextUtils.isEmpty(str2) && Integer.parseInt(str2) > 1) {
            return "{\"list\":[]}";
        }
        String str3 = str + "_json";
        synchronized (cacheMap) {
            jsonElement = cacheMap.get(str3);
        }
        if (jsonElement == null) {
            Log.e("PanSou", "No cache found for: " + str);
            return "{\"list\":[]}";
        }
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        JsonArray asJsonArray = jsonElement.getAsJsonArray();
        int size = asJsonArray.size();
        for (int i = 0; i < size; i++) {
            JsonElement jsonElement2 = asJsonArray.get(i);
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.add("vod_id", jsonElement2.getAsJsonObject().get("url"));
            jsonObject2.add("vod_name", jsonElement2.getAsJsonObject().get("note"));
            jsonObject2.addProperty("vod_remarks", "");
            jsonObject2.addProperty("vod_pic", str.equals("aliyun") ? "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/50zE/1200X800/aliyun.jpg" : str.equals("quark") ? "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/El1L/1200X800/quark.jpg" : str.equals("uc") ? "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/OSYH/1200X800/uc.jpg" : str.equals("baidu") ? "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/0rBz/1200X800/baidu.jpg" : str.equals("tianyi") ? "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/xiFH/1200X800/189.jpg" : str.equals("123") ? "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/wF1k/1200X800/123.jpg" : str.equals("mobile") ? "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/cZvf/1200X800/139.jpg" : "");
            jsonArray.add(jsonObject2);
        }
        jsonObject.add("list", jsonArray);
        Log.d("PanSou", "Returning list with " + jsonArray.size() + " items");
        return jsonObject.toString();
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) {
        return super.detailContent(Collections.singletonList(list.get(0)));
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        try {
            super.init(context, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String searchContent(String str, boolean z) {
        C0603l.a("searchvodname", str);
        return E(str, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        return E(str, str2);
    }
}
