package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.k.C0575b;
import com.github.catvod.spider.merge.m.C0603l;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class HunHePan extends Pan {
    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        try {
            super.init(context, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String searchContent(String str, String str2) {
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
            map.put("Accept", "application/json, text/plain, */*");
            map.put("Content-Type", "application/json; charset=UTF-8");
            map.put("Referer", "https://hunhepan.com/");
            JSONArray jSONArray = new JSONObject(C0575b.f("https://hunhepan.com/v1/search", "{\"q\":\"" + str + "\",\"exact\":false,\"page\":" + str2 + ",\"size\":15,\"type\":\"\",\"time\":\"\",\"from\":\"web\",\"user_id\":0,\"filter\":true}", map).a()).getJSONObject("data").getJSONArray("list");
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("disk_type");
                if (!string.equals("XUNLEI")) {
                    jSONArray2.put(new JSONObject().put("vod_id", jSONObject.getString("link")).put("vod_name", jSONObject.getString("disk_name").replace("<em>", "").replace("</em>", "")).put("vod_remarks", jSONObject.getString("update_time")).put("vod_pic", string.equals("UC") ? "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/OSYH/1200X800/uc.jpg" : string.equals("QUARK") ? "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/El1L/1200X800/quark.jpg" : string.equals("ALY") ? "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/50zE/1200X800/aliyun.jpg" : string.equals("BDY") ? "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/0rBz/1200X800/baidu.jpg" : ""));
                }
            }
            return new JSONObject().put("list", jSONArray2).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"list\":[]}";
        }
    }

    public String searchContent(String str, boolean z) {
        C0603l.a("searchvodname", str);
        return searchContent(str, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        return searchContent(str, str2);
    }
}
