package com.github.catvod.spider;

import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.b.C0547k;
import com.github.catvod.spider.merge.b.v;
import com.github.catvod.spider.merge.c.C0550a;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.k.C0575b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class QingtingFM extends Spider {
    public final String a = "https://www.qtfm.cn";

    public final HashMap b() {
        HashMap mapB = v.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
        mapB.put("Referer", this.a);
        return mapB;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException {
        if (map.get("cateId") != null) {
            str = map.get("cateId");
        }
        String strA = C0575b.f("https://webbff.qtfm.cn/www", com.github.catvod.spider.merge.A.a.g("{\"query\":\"{\\n    radioPage(cid:", str, ", page:", str2, "){\\n      contents\\n    }\\n  }\"}"), b()).a();
        int i = Integer.parseInt(str2);
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONObject(strA).getJSONObject("data").getJSONObject("radioPage").getJSONObject("contents").getJSONArray("items");
        int iC = 0;
        while (iC < jSONArray.length()) {
            JSONObject jSONObject = jSONArray.getJSONObject(iC);
            String strOptString = jSONObject.optString("id");
            String strOptString2 = jSONObject.optString("imgUrl");
            if (!strOptString2.contains("https")) {
                strOptString2 = "https:".concat(strOptString2);
            }
            iC = C0547k.c(strOptString, jSONObject.optString("title"), strOptString2, jSONObject.optString("desc"), arrayList, iC, 1);
        }
        return com.github.catvod.spider.merge.A.a.d(arrayList, i, arrayList.size() < 12 ? i : i + 1, 12, 0);
    }

    public String detailContent(List<String> list) {
        String str = list.get(0);
        JSONObject jSONObjectM8c = com.github.catvod.spider.merge.A.a.m8c(C0575b.l(com.github.catvod.spider.merge.A.a.d("https://webapi.qtfm.cn/api/pc/radio/", str), b()), "album");
        C0554e c0554eB = com.github.catvod.spider.merge.A.a.b(str);
        c0554eB.k(jSONObjectM8c.getString("title"));
        c0554eB.l(jSONObjectM8c.getString("cover"));
        c0554eB.h(jSONObjectM8c.getString("description"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.github.catvod.spider.merge.A.a.a(jSONObjectM8c, "title", new StringBuilder(), "$", "id"));
        if (arrayList.size() > 0) {
            linkedHashMap.put("蜻蜓FM", TextUtils.join("#", arrayList));
        }
        if (linkedHashMap.size() > 0) {
            com.github.catvod.spider.merge.A.a.p(linkedHashMap, "$$$", c0554eB, "$$$");
        }
        return C0552c.m(c0554eB);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("217", "99", "3", "5", "7", "83", "19", "31", "44", "59", "69", "85", "111", "129", "139", "151", "169", "187", "202", "239", "254", "257", "259", "281", "291", "316", "327", "351", "357", "308", "342", "433", "442", "429", "439", "432", "441", "430", "431", "440", "438", "435", "436", "434");
        List listAsList2 = Arrays.asList("广东", "浙江", "北京", "天津", "河北", "上海", "山西", "内蒙古", "辽宁", "吉林", "黑龙江", "江苏", "安徽", "福建", "江西", "山东", "河南", "湖北", "湖南", "广西", "海南", "重庆", "四川", "贵州", "云南", "陕西", "甘肃", "宁夏", "新疆", "西藏", "青海", "资讯", "音乐", "交通", "经济", "文艺", "都市", "体育", "双语", "综合", "生活", "旅游", "曲艺", "方言");
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new C0550a((String) listAsList.get(i), (String) listAsList2.get(i), null));
        }
        return com.github.catvod.spider.merge.A.a.a("{}", arrayList);
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0552c c0552cZ = com.github.catvod.spider.merge.A.a.z(com.github.catvod.spider.merge.A.a.j("https://lhttp-hw.qtfm.cn/live/", str2, "/64k.mp3"));
        c0552cZ.m94e((Map) b());
        return c0552cZ.toString();
    }

    public String searchContent(String str, String str2) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONObject(C0575b.f("https://webbff.qtfm.cn/www", com.github.catvod.spider.merge.A.a.g("{\"query\":\"{\\n        searchResultsPage(keyword:\\\"", str, "\\\", page:", str2, ", include:\\\"channel_live\\\" ) {\\n          tdk,\\n          searchData,\\n          numFound\\n        }\\n      }\"}"), b()).a()).getJSONObject("data").getJSONObject("searchResultsPage").getJSONArray("searchData");
        int iC = 0;
        while (iC < jSONArray.length()) {
            JSONObject jSONObject = jSONArray.getJSONObject(iC);
            iC = C0547k.c(jSONObject.optString("id"), jSONObject.optString("title"), jSONObject.optString("cover"), jSONObject.optString("description"), arrayList, iC, 1);
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
