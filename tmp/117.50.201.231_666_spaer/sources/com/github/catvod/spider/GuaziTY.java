package com.github.catvod.spider;

import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.b.C0544h;
import com.github.catvod.spider.merge.c.C0550a;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.k.C0575b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class GuaziTY extends Spider {
    public final String b = "KANGEQIU@8868!~.";
    public final String a = "0200010900030207";

    public static HashMap c() {
        HashMap mapC = C0544h.c("User-Agent", "okhttp/3.12.0", "content-type", "application/x-www-form-urlencoded");
        mapC.put("user-platform", "null");
        mapC.put("client-version", "3.0.1.1");
        mapC.put("client-channel", "");
        mapC.put("token", "");
        return mapC;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String categoryContent(java.lang.String r17, java.lang.String r18, boolean r19, java.util.HashMap<java.lang.String, java.lang.String> r20) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.GuaziTY.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    public String detailContent(List<String> list) throws JSONException {
        String str = list.get(0);
        String strJ = com.github.catvod.spider.merge.A.a.j("{\"mid\":\"", str, "\"}");
        HashMap map = new HashMap();
        String str2 = this.b;
        String str3 = this.a;
        map.put("parameter", com.github.catvod.spider.merge.A.a.bo(strJ, str2, str3));
        JSONObject jSONObject = new JSONObject(com.github.catvod.spider.merge.A.a.an(new JSONObject(C0575b.g("https://api.46d5umpk.com/gz/live/detail?parameter=key", map, c()).a()).getString("data"), str2, str3));
        String string = jSONObject.getJSONObject("home").getString("logo");
        String str4 = jSONObject.getJSONObject("home").getString("name") + " vs " + jSONObject.getJSONObject("visiting").getString("name");
        String string2 = jSONObject.getString("match_status_info");
        int i = jSONObject.getJSONObject("home").getInt("score");
        int i2 = jSONObject.getJSONObject("visiting").getInt("score");
        if (i > 0 || i2 > 0) {
            string2 = string2 + " 比分" + i + "-" + i2;
        }
        C0554e c0554e = new C0554e(str, str4, string, string2);
        c0554e.h(string2 + "");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(" 瓜子 ");
        ArrayList arrayList3 = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("live_line");
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
            arrayList3.add(jSONObject2.getString("name") + "$" + jSONObject2.getString("m3u8"));
        }
        arrayList.add(TextUtils.join("#", arrayList3));
        c0554e.m(TextUtils.join("$$$", arrayList2));
        c0554e.n(TextUtils.join("$$$", arrayList));
        return C0552c.m(c0554e);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("hot", "nba", "football", "basketball");
        List listAsList2 = Arrays.asList("热门", "NBA", "足球", "篮球");
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new C0550a((String) listAsList.get(i), (String) listAsList2.get(i), null));
        }
        return com.github.catvod.spider.merge.A.a.a("{}", arrayList);
    }

    public String playerContent(String str, String str2, List<String> list) {
        HashMap mapC = C0544h.c("User-Agent", "Lavf/57.83.100", "Referer", "http://WJiZxLXA2.com/");
        C0552c c0552c = new C0552c();
        c0552c.w(str2);
        c0552c.m94e((Map) mapC);
        return c0552c.toString();
    }
}
