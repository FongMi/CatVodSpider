package com.github.catvod.spider;

import android.text.TextUtils;
import android.util.Log;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.b.r;
import com.github.catvod.spider.merge.f.C0563b;
import com.github.catvod.spider.merge.f.g;
import com.github.catvod.spider.merge.k.C0575b;
import com.github.catvod.spider.merge.m.C0602k;
import com.github.catvod.spider.merge.y.f;
import com.google.gson.JsonObject;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class AmuBiliV2 extends Spider {
    private static Map<String, String> b() {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
        String strOptString = null;
        try {
            String strA = C0602k.a(C0602k.b("/bili_cookie.txt"));
            if (!TextUtils.isEmpty(strA)) {
                strOptString = new JSONObject(strA).optString("cookie");
                if (!TextUtils.isEmpty(strOptString)) {
                    map.put("cookie", strOptString);
                    Log.d("AmuBiliV2", "Loaded cookie from file: " + strOptString);
                }
            }
        } catch (Exception e) {
            Log.e("AmuBiliV2", "Failed to load cookie from file", e);
        }
        if (TextUtils.isEmpty(strOptString)) {
            map.put("cookie", "buvid3=9AB9323A-F21B-1A49-93F8-ABBE7738F82787336infoc; b_nut=1730031187; b_lsid=C5DE8ADD_192CDE4F974; _uuid=39F105341-5ABB-297C-E8AC-193910249F69488356infoc; buvid4=3AAE7EBA-A505-6B5F-153E-EEFE17AA68A888888-024102712-wN48cfQQcbzwQQDk0fiimQ%3D%3D; buvid_fp=799be2784f8761d26ecab89ab3c5982f; bili_ticket=eyJhbGciOiJIUzI1NiIsImtpZCI6InMwMyIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MzAyOTAzODksImlhdCI6MTczMDAzMTEyOSwicGx0IjotMX0.XzvRhDap3hcbkoNoOeK8lkWjH_SAUCXk8N0JtAfxGhE; bili_ticket_expires=1730290329");
            Log.d("AmuBiliV2", "Using default cookie");
        }
        map.put("Referer", "https://www.bilibili.com");
        return map;
    }

    public static File getCache() {
        return C0602k.b("/bili_cookie.txt");
    }

    public static boolean refreshUser(String str) {
        try {
            Map<String, String> mapB = b();
            ((HashMap) mapB).put("cookie", str);
            C0563b c0563bA = com.github.catvod.spider.merge.f.e.b(C0575b.l("https://api.bilibili.com/x/web-interface/nav", mapB)).a();
            g gVar = new g();
            gVar.h(str);
            gVar.k(Boolean.valueOf(c0563bA.s()));
            gVar.j(c0563bA.p());
            gVar.i(c0563bA.i());
            JsonObject asJsonObject = c0563bA.r().getAsJsonObject();
            gVar.l(f.l(asJsonObject.get("img_url").getAsString(), "wbi/", "."));
            gVar.m(f.l(asJsonObject.get("sub_url").getAsString(), "wbi/", "."));
            Init.execute(new r(gVar, getCache(), 2));
            return gVar.g();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
