package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.k.C0575b;
import com.github.catvod.spider.merge.m.C0603l;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class Baiku extends Pan {
    public static String E(String str) {
        String str2 = "https://api.kuleu.com/api/bddj?text=" + URLEncoder.encode(str);
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36");
        String strL = C0575b.l(str2, map);
        ArrayList arrayList = new ArrayList();
        Iterator it = JsonParser.parseString(strL).getAsJsonObject().getAsJsonArray("data").iterator();
        while (it.hasNext()) {
            JsonObject asJsonObject = ((JsonElement) it.next()).getAsJsonObject();
            String asString = asJsonObject.get("name").getAsString();
            if (asString.contains(str)) {
                C0554e c0554e = new C0554e();
                c0554e.j(asJsonObject.get("viewlink").getAsString());
                c0554e.o(asJsonObject.get("addtime").getAsString());
                c0554e.l("https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/0rBz/1200X800/baidu.jpg");
                c0554e.k(asString);
                arrayList.add(c0554e);
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
