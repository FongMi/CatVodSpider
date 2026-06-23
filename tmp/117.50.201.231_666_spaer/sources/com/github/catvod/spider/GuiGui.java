package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.k.C0575b;
import com.github.catvod.spider.merge.m.C0603l;
import com.google.gson.Gson;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class GuiGui extends Pan {
    public static String E(String str) throws JSONException {
        String str2 = "https://api.guiguiya.com/api/video/duanju?act=search&name=" + URLEncoder.encode(str);
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36");
        String strL = C0575b.l(str2, map);
        ArrayList arrayList = new ArrayList();
        new Gson();
        JSONObject jSONObject = new JSONObject(strL);
        if (!jSONObject.getString("code").equals("200")) {
            return "[]";
        }
        JSONArray jSONArray = jSONObject.getJSONArray("data");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("name");
            if (string.contains(str)) {
                String string2 = jSONObject2.getString("url");
                String string3 = jSONObject2.getString("episodes");
                String string4 = jSONObject2.getString("cover");
                C0554e c0554e = new C0554e();
                c0554e.j(string2);
                String str3 = "共" + string3 + "集";
                c0554e.o(str3);
                c0554e.l(string4);
                c0554e.k(string);
                arrayList.add(c0554e);
                str = str3;
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
