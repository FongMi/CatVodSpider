package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.K.VodResult;
import com.github.catvod.spider.merge.K.VodItem;
import com.github.catvod.spider.merge.L1.l;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
public class PanSearch extends NetPan {
    @Override // com.github.catvod.en.NetPan
    public String detailContent(List<String> list) {
        return super.detailContent("", list.get(0).split("#")[1], Collections.singletonList(list.get(0).split("#")[0]));
    }

    @Override // com.github.catvod.en.NetPan
    public void init(Context context, String str) {
        super.init(context, str);
    }

    public String searchContent(String str, boolean z) throws JSONException {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
        String str2 = "https://www.pansearch.me/_next/data/" + new JSONObject(l.e(com.github.catvod.spider.merge.f0.HttpClient.m("https://www.pansearch.me/", map, null)).l0("script[id=__NEXT_DATA__]").get(0).V()).getString("buildId") + "/search.json?keyword=" + URLEncoder.encode(str);
        HashMap mapB = com.github.catvod.spider.merge.B.MapBuilder.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36", "x-nextjs-data", "1");
        mapB.put("referer", "https://www.pansearch.me/");
        JSONArray jSONArray = new JSONObject(com.github.catvod.spider.merge.f0.HttpClient.m(str2, mapB, null)).getJSONObject("pageProps").getJSONObject("data").getJSONArray("data");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String strOptString = jSONObject.optString("content");
            String[] strArrSplit = strOptString.split("\\n");
            if (strArrSplit.length != 0) {
                arrayList.add(new VodItem(l.e(strOptString).l0("a").a("href") + "#" + str, strArrSplit[0].replaceAll("</?[^>]+>", ""), jSONObject.optString("image"), jSONObject.optString("time")));
            }
        }
        return VodResult.n(arrayList);
    }
}
