package com.github.catvod.spider;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.b.C0547k;
import com.github.catvod.spider.merge.b.v;
import com.github.catvod.spider.merge.c.C0550a;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.k.C0575b;
import com.github.catvod.spider.merge.m.C0590I;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class WeiguanDJ extends Spider {
    public String c = "";
    public String a = "";
    public String b = "";

    public static HashMap d() {
        return v.b("User-Agent", "okhttp/5.1.0");
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException {
        HashMap map2 = new HashMap();
        if (map != null && map.size() > 0) {
            map2.putAll(map);
        }
        if (map2.get("cateId") != null) {
            str = (String) map2.get("cateId");
        }
        String str3 = this.c;
        String str4 = this.a;
        String str5 = this.b;
        StringBuilder sbF = com.github.catvod.spider.merge.A.a.f("/search?version_code=1500&version_name=1.5.0&device_name=", str3, "&device_type=phone&is_first_day=true&is_first_24h=true&app_launch_way=icon&default_homepage=homepage_interaction&device_owning_firm=", str4, "&font_scale=default&os_type=1&clientInfo=");
        sbF.append(str5);
        String strA = C0575b.f("https://api.drama.9ddm.com/drama/home".concat(sbF.toString()), com.github.catvod.spider.merge.A.a.g("{\"audience\":\"全部\",\"order\":\"最新\",\"page\":", str2, ",\"pageSize\":30,\"searchWord\":\"\",\"subject\":\"", str, "\"}"), d()).a();
        int i = Integer.parseInt(str2);
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONObject(strA).getJSONArray("data");
        int iC = 0;
        while (iC < jSONArray.length()) {
            JSONObject jSONObject = jSONArray.getJSONObject(iC);
            iC = C0547k.c(jSONObject.getString("oneId"), jSONObject.getString("title"), jSONObject.getString("horzPoster"), jSONObject.optString("episodeCount"), arrayList, iC, 1);
        }
        return com.github.catvod.spider.merge.A.a.d(arrayList, i, arrayList.size() < 30 ? i : i + 1, 30, 0);
    }

    public String detailContent(List<String> list) throws JSONException {
        String str = list.get(0);
        JSONObject jSONObject = new JSONObject(C0575b.l("https://api.drama.9ddm.com/drama/home".concat(com.github.catvod.spider.merge.A.a.h(com.github.catvod.spider.merge.A.a.f("/shortVideoDetail?version_code=1500&version_name=1.5.0&device_name=", this.c, "&device_type=phone&is_first_day=true&is_first_24h=true&app_launch_way=icon&default_homepage=homepage_interaction&device_owning_firm=", this.a, "&font_scale=default&os_type=1&clientInfo="), this.b, "&oneId=", str, "&page=1&pageSize=10&userId=0&queryAll=true")), d()));
        C0554e c0554eB = com.github.catvod.spider.merge.A.a.b(str);
        c0554eB.k(jSONObject.getString("title"));
        c0554eB.l(jSONObject.getString("vertPoster"));
        c0554eB.h(jSONObject.getString("description"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = jSONObject.getJSONArray("data");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            arrayList.add(jSONObject2.getString("playOrder") + "$" + com.github.catvod.spider.merge.A.a.af(jSONObject2.getJSONArray("videoClarityList").toString()));
        }
        if (arrayList.size() > 0) {
            linkedHashMap.put("短剧", TextUtils.join("#", arrayList));
        }
        if (linkedHashMap.size() > 0) {
            com.github.catvod.spider.merge.A.a.p(linkedHashMap, "$$$", c0554eB, "$$$");
        }
        return C0552c.m(c0554eB);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayM7c = com.github.catvod.spider.merge.A.a.m7c(C0575b.l("https://api.drama.9ddm.com/drama/home/shortVideoTags?version_code=1500&version_name=1.5.0&device_name=" + this.c + "&device_type=phone&is_first_day=true&is_first_24h=true&app_launch_way=icon&default_homepage=homepage_interaction&device_owning_firm=" + this.a + "&font_scale=default&os_type=1&clientInfo=" + this.b, d()), "tags");
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < jSONArrayM7c.length(); i++) {
            arrayList2.add(jSONArrayM7c.getString(i));
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            arrayList.add(new C0550a((String) arrayList2.get(i2), (String) arrayList2.get(i2), null));
        }
        return com.github.catvod.spider.merge.A.a.a("{}", arrayList);
    }

    public void init(Context context) {
        this.c = Build.MODEL;
        this.a = Build.BRAND;
        this.b = C0590I.a(com.github.catvod.spider.merge.A.a.ao(10));
    }

    public String playerContent(String str, String str2, List<String> list) throws JSONException {
        JSONArray jSONArray = new JSONArray(com.github.catvod.spider.merge.A.a.at(str2));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            arrayList.add(jSONObject.getString("name"));
            arrayList.add(jSONObject.getString("url"));
        }
        C0552c c0552c = new C0552c();
        c0552c.y(arrayList);
        c0552c.m94e((Map) d());
        return c0552c.toString();
    }

    public String searchContent(String str, String str2) throws JSONException {
        ArrayList arrayList = new ArrayList();
        String str3 = this.c;
        String str4 = this.a;
        String str5 = this.b;
        StringBuilder sbF = com.github.catvod.spider.merge.A.a.f("/search?version_code=1500&version_name=1.5.0&device_name=", str3, "&device_type=phone&is_first_day=true&is_first_24h=true&app_launch_way=icon&default_homepage=homepage_interaction&device_owning_firm=", str4, "&font_scale=default&os_type=1&clientInfo=");
        sbF.append(str5);
        JSONArray jSONArrayM7c = com.github.catvod.spider.merge.A.a.m7c(C0575b.f("https://api.drama.9ddm.com/drama/home".concat(sbF.toString()), com.github.catvod.spider.merge.A.a.g("{\"audience\":\"\",\"order\":\"\",\"page\":", str2, ",\"pageSize\":30,\"searchWord\":\"", str, "\",\"subject\":\"\"}"), d()).a(), "data");
        int iC = 0;
        while (iC < jSONArrayM7c.length()) {
            JSONObject jSONObject = jSONArrayM7c.getJSONObject(iC);
            iC = C0547k.c(jSONObject.getString("oneId"), jSONObject.getString("title"), jSONObject.getString("horzPoster"), jSONObject.optString("episodeCount"), arrayList, iC, 1);
        }
        return C0552c.n(arrayList);
    }

    public String searchContent(String str, boolean z) {
        return searchContent(str, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        return searchContent(str, str2);
    }
}
