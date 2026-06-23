package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.FM.c.C0323a;
import com.github.catvod.spider.merge.FM.c.C0329g;
import com.github.catvod.spider.merge.FM.c.C0332j;
import com.github.catvod.spider.merge.FM.m.C0378c;
import com.github.catvod.spider.merge.m.C0603l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class MiSou extends Pan {
    private final String f = "http://misopan.fun";

    private Map<String, String> e() {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
        map.put("Referer", this.f);
        return map;
    }

    private List<C0332j> f(String str, String str2, String str3) {
        String str4;
        String str5;
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("page", Integer.parseInt(str2));
            jSONObject.put("q", str);
            jSONObject.put("user", str3);
            jSONObject.put("exact", true);
            new ArrayList();
            jSONObject.put("share_time", "");
            jSONObject.put("size", 15);
            jSONObject.put("type", "");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("wechat_pwd", "");
            jSONObject.put("adv_params", jSONObject2);
            JSONArray jSONArray = new JSONObject(C0378c.g("http://misopan.fun/v1/search/disk", jSONObject.toString(), e()).a()).getJSONObject("data").getJSONArray("list");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                C0332j c0332j = new C0332j();
                c0332j.g(jSONObject3.getString("link"));
                if (jSONObject3.getString("link").contains("https://drive.uc.cn")) {
                    str4 = "FROM UC网盘";
                    str5 = "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/OSYH/1200X800/uc.jpg";
                } else if (jSONObject3.getString("link").contains("https://pan.baidu.com")) {
                    str4 = "FROM 百度网盘";
                    str5 = "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/0rBz/1200X800/baidu.jpg";
                } else {
                    str4 = "FROM 夸克网盘";
                    str5 = "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/El1L/1200X800/quark.jpg";
                }
                c0332j.l(str4);
                c0332j.i(str5);
                c0332j.h(jSONObject3.getString("disk_name").replace("<em>", "").replace("</em>", ""));
                arrayList.add(c0332j);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    private String g(String str) {
        return C0329g.q(f(str, "1", ""));
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        return C0329g.q(f("", str2, "唐僧*飘柔"));
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) {
        return super.detailContent(Collections.singletonList(list.get(0)));
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContentVodPlayFrom(List<String> list) {
        return super.detailContentVodPlayFrom(list);
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContentVodPlayUrl(List<String> list) {
        return super.detailContentVodPlayUrl(list);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listSingletonList = Collections.singletonList("1");
        List listSingletonList2 = Collections.singletonList("自用");
        for (int i = 0; i < listSingletonList.size(); i++) {
            arrayList.add(new C0323a((String) listSingletonList.get(i), (String) listSingletonList2.get(i)));
        }
        return C0329g.s(arrayList, f("", "1", "唐僧*飘柔"));
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        try {
            super.init(context, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.github.catvod.spider.Pan
    public String playerContent(String str, String str2, List<String> list) {
        return super.playerContent(str, str2, list);
    }

    public String searchContent(String str, boolean z) {
        C0603l.a("searchvodname", str);
        return g(str);
    }

    public String searchContent(String str, boolean z, String str2) {
        return g(str);
    }
}
