package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.k.C0575b;
import com.github.catvod.spider.merge.m.C0603l;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class KuLe extends Pan {
    public static String E(String str) {
        String str2 = "https://api.kuleu.com/api/jhsj?type=ali,quark,uc,baidu,tianyi,123&name=" + URLEncoder.encode(str);
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36");
        String strL = C0575b.l(str2, map);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : JsonParser.parseString(strL).getAsJsonObject().getAsJsonObject("data").getAsJsonObject("merged_by_type").entrySet()) {
            String str3 = (String) entry.getKey();
            Iterator it = ((JsonElement) entry.getValue()).getAsJsonArray().iterator();
            while (it.hasNext()) {
                JsonObject asJsonObject = ((JsonElement) it.next()).getAsJsonObject();
                String asString = asJsonObject.get("name").getAsString();
                if (asString.contains(str) && asJsonObject.has("images")) {
                    JsonElement jsonElement = asJsonObject.get("images");
                    if (jsonElement.isJsonArray()) {
                        JsonArray asJsonArray = jsonElement.getAsJsonArray();
                        if (asJsonArray.size() != 0) {
                            String asString2 = asJsonArray.get(0).getAsString();
                            if (!asString2.startsWith("https://cdn1.") && !asString2.startsWith("https://cdn4.") && !asString2.startsWith("https://cdn5.")) {
                                C0554e c0554e = new C0554e();
                                c0554e.k(asString);
                                if (str3.equals("quark")) {
                                    c0554e.o("夸克网盘");
                                } else if (str3.equals("uc")) {
                                    c0554e.o("UC网盘");
                                } else if (str3.equals("baidu")) {
                                    c0554e.o("百度网盘");
                                } else if (str3.equals("ali")) {
                                    c0554e.o("阿里云盘");
                                } else if (str3.equals("tianyi")) {
                                    c0554e.o("天翼云盘");
                                } else if (str3.equals("123")) {
                                    c0554e.o("123云盘");
                                } else {
                                    c0554e.o(str3);
                                }
                                c0554e.j(asJsonObject.get("url").getAsString());
                                c0554e.l(asJsonArray.get(0).getAsString());
                                arrayList.add(c0554e);
                            }
                        }
                    }
                }
            }
        }
        return C0552c.n(arrayList);
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
        return E(str);
    }

    public String searchContent(String str, boolean z, String str2) {
        return E(str);
    }
}
