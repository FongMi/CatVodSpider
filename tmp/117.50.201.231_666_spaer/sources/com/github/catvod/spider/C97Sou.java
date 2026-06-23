package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.b.C0547k;
import com.github.catvod.spider.merge.b.v;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.k.C0575b;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.97Sou, reason: invalid class name */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class C97Sou extends Pan {
    public static String a = "";

    public static HashMap b() {
        HashMap mapB = v.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36  115Browser/26.0.7.2");
        mapB.put("Cookie", "_ga=GA1.1.783843535.1763309407; Hm_lvt_fd3a1b3ad442bde8548894bb5babb351=1765736693,1767339130; HMACCOUNT=F48156E7283776CE; Hm_lpvt_fd3a1b3ad442bde8548894bb5babb351=1767340586;  " + a);
        mapB.put("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoyODIsInVzZXJuYW1lIjoiY2FpbmlhbzAwMTEiLCJlbWFpbCI6Im9yYWRlNTlAZGVlcG1haWxzLm9yZyIsInJvbGUiOiJ1c2VyIiwicGVybWlzc2lvbnMiOlsicmVzb3VyY2Uuc3VibWl0IiwicmVzb3VyY2UudmlldyIsImZlZWRiYWNrLmNyZWF0ZSIsImZlZWRiYWNrLnZpZXciLCJwcm9maWxlLm1hbmFnZSJdLCJleHAiOjE3NjczNDIzOTcsImlhdCI6MTc2NzM0MDU5NywiaXNzIjoicGFuLXNvLWJhY2tlbmQiLCJ0eXBlIjoiYWNjZXNzIn0.TyAssSa5wQ6kpBt2TfYefNTw5JdLTdbbE-O7WJDFYW4");
        mapB.put("referer", "https://pansoo.cn/");
        return mapB;
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) throws JSONException {
        String string = new JSONObject(C0575b.l("https://pansoo.cn/api/check_resource_status?" + list.get(0), b())).getString("share_url");
        new C0554e().j(list.get(0));
        ArrayList arrayList = new ArrayList();
        arrayList.add(string);
        return super.detailContent(arrayList);
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        try {
            super.init(context, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String searchContent(String str, String str2) throws JSONException {
        String strJ = com.github.catvod.spider.merge.A.a.j("https://pansoo.cn/search?q=", str, "&type=online");
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36  115Browser/26.0.7.2");
        a = com.github.catvod.spider.merge.A.a.a(strJ, map);
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayM7c = com.github.catvod.spider.merge.A.a.m7c(C0575b.l("https://pansoo.cn/api/search?keyword=" + URLEncoder.encode(str) + "&pan_types=0&page=" + str2 + "&limit=30&file_type=video", b()), "results");
        for (int i = 0; i < jSONArrayM7c.length(); i++) {
            JSONObject jSONObject = jSONArrayM7c.getJSONObject(i);
            String strA = com.github.catvod.spider.merge.A.a.a(jSONObject, "resource_id", new StringBuilder("resource_id="), "&pan_type=", "pan_type");
            int i2 = jSONObject.getInt("pan_type");
            if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5) {
                String string = jSONObject.getString("pan_type");
                String str3 = "";
                String str4 = string.equals("2") ? "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/El1L/1200X800/quark.jpg" : string.equals("3") ? "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/50zE/1200X800/aliyun.jpg" : string.equals("1") ? "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/0rBz/1200X800/baidu.jpg" : string.equals("5") ? "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/wF1k/1200X800/123.jpg" : "";
                String string2 = jSONObject.getString("title");
                String string3 = jSONObject.getString("pan_type");
                if (string3.equals("2")) {
                    str3 = "夸克";
                } else if (string3.equals("3")) {
                    str3 = "阿里";
                } else if (string3.equals("1")) {
                    str3 = "百度";
                } else if (string3.equals("5")) {
                    str3 = "123";
                }
                C0547k.b(strA, string2, str4, str3, arrayList);
            }
        }
        return C0552c.i(arrayList);
    }

    public String searchContent(String str, boolean z) {
        return searchContent(str, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        return searchContent(str, str2);
    }
}
