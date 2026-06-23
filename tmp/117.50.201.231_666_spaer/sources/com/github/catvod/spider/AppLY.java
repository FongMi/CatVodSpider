package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.b.C0544h;
import com.github.catvod.spider.merge.c.C0550a;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.k.C0575b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class AppLY extends Spider {
    private String a(String str, Map<String, Object> map) {
        try {
            HashMap map2 = new HashMap();
            map2.put("Content-Type", "application/json;charset=utf-8");
            map2.put("User-Agent", "okhttp/3.9.1");
            map2.put("md5", "SkvyrWqK9QHTdCT12Rhxunjx+WwMTe9y4KwgeASFDhbYabRSPskR0Q==");
            return C0575b.f(str, new JSONObject(map).toString(), map2).a();
        } catch (Exception unused) {
            return "";
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        HashMap mapC = C0544h.c("cur", str2, "free", "0");
        mapC.put("item", "o5");
        mapC.put("pageSize", "20");
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        mapC.put("sect", arrayList);
        JSONArray jSONArrayOptJSONArray = new JSONObject(a("https://fly.daoran.tv/API_ROP/search/album/list", mapC)).optJSONObject("pb").optJSONArray("dataList");
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            String strOptString = jSONObjectOptJSONObject.optString("code");
            String strOptString2 = jSONObjectOptJSONObject.optString("name");
            StringBuilder sbA = C0529a.a("https://ottphoto.daoran.tv/HD/");
            sbA.append(jSONObjectOptJSONObject.optString("img"));
            arrayList2.add(new C0554e(strOptString, strOptString2, sbA.toString(), jSONObjectOptJSONObject.optString("publishTime")));
        }
        return C0544h.a(str2, new C0552c(), 0, 0, 0, arrayList2);
    }

    public String detailContent(List<String> list) {
        HashMap map = new HashMap();
        map.put("albumCode", list.get(0));
        map.put("cur", "1");
        map.put("project", "lyhxcx");
        map.put("pageSize", "2147483647");
        map.put("selectFlag", "0");
        map.put("userId", "yszyz");
        JSONObject jSONObject = new JSONObject(a("https://fly.daoran.tv/API_ROP/album/res/list", map));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("album");
        C0554e c0554e = new C0554e();
        c0554e.j(list.get(0));
        c0554e.k(jSONObjectOptJSONObject.optString("name"));
        c0554e.l("https://ottphoto.daoran.tv/HD/" + jSONObjectOptJSONObject.optString("img"));
        c0554e.e(jSONObjectOptJSONObject.optString("sect"));
        c0554e.h(jSONObjectOptJSONObject.optString("des"));
        c0554e.f(jSONObjectOptJSONObject.optString("artistName"));
        c0554e.i(jSONObjectOptJSONObject.optString("vod_director"));
        c0554e.q(jSONObjectOptJSONObject.optString("publishTime"));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("在线播放");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONObject("pb").optJSONArray("dataList");
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
            arrayList3.add(jSONObjectOptJSONObject2.optString("name") + "$" + jSONObjectOptJSONObject2.optString("code"));
        }
        arrayList.add(TextUtils.join("#", arrayList3));
        c0554e.m(TextUtils.join("$$$", arrayList2));
        c0554e.n(TextUtils.join("$$$", arrayList));
        return C0552c.m(c0554e);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            HashMap map = new HashMap();
            map.put("leastNum", "0");
            map.put("memberId", "yszyz");
            map.put("project", "lyhxcx");
            map.put("userId", "yszyz");
            JSONArray jSONArrayOptJSONArray = new JSONObject(a("https://fly.daoran.tv/API_ROP/page/setinf/get", map)).optJSONArray("sects");
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                arrayList.add(new C0550a(jSONObjectOptJSONObject.optString("code"), jSONObjectOptJSONObject.optString("name"), null));
            }
        } catch (Exception unused) {
        }
        return C0552c.p(arrayList, arrayList2);
    }

    public void init(Context context, String str) {
        super.init(context, str);
    }

    public String playerContent(String str, String str2, List<String> list) {
        HashMap mapC = C0544h.c("item", "y9", "nodeCode", "001000");
        mapC.put("project", "lyhxcx");
        mapC.put("px", "2");
        mapC.put("resCode", str2);
        mapC.put("userId", "92315ec6e58a45ba7f47fd143b3d7956");
        String strOptString = new JSONObject(a("https://fly.daoran.tv/API_ROP/play/get/playurl", mapC)).optJSONObject("playres").optString("playurl");
        C0552c c0552c = new C0552c();
        c0552c.k(0);
        c0552c.u(strOptString);
        return c0552c.toString();
    }

    public String searchContent(String str, boolean z) {
        return super.searchContent(str, z);
    }
}
