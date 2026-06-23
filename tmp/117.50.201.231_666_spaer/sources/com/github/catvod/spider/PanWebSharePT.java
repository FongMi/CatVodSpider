package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.b.C0547k;
import com.github.catvod.spider.merge.c.C0550a;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.k.C0575b;
import com.github.catvod.spider.merge.m.C0602k;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class PanWebSharePT extends Pan {
    private static JSONObject a;
    private String c;

    private static String filter139Content(String str) {
        return (new JSONObject(C0602k.a(C0602k.c("/config.json"))).optString("panBlock").contains("移动云盘") && Pattern.compile("https?://(?:[a-zA-Z0-9.-]+\\.)?139\\.com/(?:[a-zA-Z0-9/#?=&_-]+)").matcher(str).find()) ? "" : str;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException {
        HashMap mapM6b = com.github.catvod.spider.merge.A.a.m6b();
        if (map != null && map.size() > 0) {
            mapM6b.putAll(map);
        }
        String string = Long.toString(System.currentTimeMillis());
        if (mapM6b.get("cateId") != null) {
            str = (String) mapM6b.get("cateId");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("https://www.91panta.cn");
        String strA = com.github.catvod.spider.merge.A.a.a("/queryTopicList?tagId=%s&page=%s&_=" + string, new Object[]{str, str2}, sb);
        HashMap map2 = new HashMap();
        map2.put("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 16_6 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.6 Mobile/15E148 Safari/604.1");
        map2.put("referer", "https://www.91panta.cn");
        String strL = C0575b.l(strA, map2);
        int i = Integer.parseInt(str2);
        C0552c c0552c = new C0552c();
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayM7c = com.github.catvod.spider.merge.A.a.m7c(strL, "records");
        int iC = 0;
        while (iC < jSONArrayM7c.length()) {
            JSONObject jSONObject = jSONArrayM7c.getJSONObject(iC);
            iC = C0547k.c(jSONObject.getString("id"), jSONObject.getString("title"), "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/cZvf/1200X800/139.jpg", jSONObject.getString("tagName"), arrayList, iC, 1);
        }
        c0552c.w(arrayList);
        c0552c.i(i, 5000, 30, 0);
        return c0552c.toString();
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) throws JSONException {
        String str = list.get(0);
        String str2 = "https://www.91panta.cn/queryTopicContent?topicId=" + str + "&_=" + Long.toString(System.currentTimeMillis());
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 16_6 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.6 Mobile/15E148 Safari/604.1");
        map.put("referer", "https://www.91panta.cn");
        JSONObject jSONObject = new JSONObject(C0575b.l(str2, map));
        C0554e c0554eB = com.github.catvod.spider.merge.A.a.b(str);
        c0554eB.k(jSONObject.getString("title"));
        c0554eB.q(jSONObject.getString("postTime"));
        c0554eB.e(jSONObject.getString("tagName"));
        jSONObject.getString("summary");
        String string = jSONObject.getString("content");
        HashSet hashSet = new HashSet();
        Matcher matcher = Pattern.compile("https?://(?:[a-zA-Z0-9.-]+\\.)?139\\.com/(?:[a-zA-Z0-9/#?=&_-]+)").matcher(filter139Content(string.replaceAll("<[^>]+>", "").replaceAll("amp;", "")));
        while (matcher.find()) {
            String strGroup = matcher.group();
            if (!strGroup.contains("139.com")) {
                break;
            }
            String strDecode = URLDecoder.decode(strGroup);
            c0554eB.h(strDecode);
            hashSet.add(strDecode);
        }
        ArrayList arrayList = new ArrayList(hashSet);
        PanOrder.sort(arrayList);
        c0554eB.m(detailContentVodPlayFrom(arrayList));
        c0554eB.n(detailContentVodPlayUrl(arrayList));
        JSONObject jSONObject2 = new JSONObject(C0552c.m(c0554eB));
        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("list");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i);
                if (jSONObject3 != null && jSONObject3.optString("vod_play_url").isEmpty()) {
                    jSONObject3.put("vod_play_from", "");
                    jSONObject3.put("vod_play_url", "");
                }
            }
        }
        return C0529a.processVodData(jSONObject2.toString());
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("39765285016165", "39765284616164", "39724838540291", "44732560408431", "39724839640293", "39724837340289", "39983744385926", "39956600861068", "000");
        List listAsList2 = Arrays.asList("电影", "剧集", "动漫", "短剧", "综艺", "音乐", "少儿", "记录", "其它");
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new C0550a((String) listAsList.get(i), (String) listAsList2.get(i), null));
        }
        return com.github.catvod.spider.merge.A.a.a("{}", arrayList);
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
        ArrayList arrayList = new ArrayList();
        String str3 = "https://www.91panta.cn/search?keyword=" + str + "&page=" + str2 + "&_=" + Long.toString(System.currentTimeMillis());
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 16_6 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.6 Mobile/15E148 Safari/604.1");
        map.put("referer", "https://www.91panta.cn");
        map.put("x-requested-with", "XMLHttpRequest");
        JSONArray jSONArrayB = com.github.catvod.spider.merge.A.a.b(C0575b.l(str3, map), "searchResultPage", "records");
        int iC = 0;
        while (iC < jSONArrayB.length()) {
            JSONObject jSONObject = jSONArrayB.getJSONObject(iC).getJSONObject("topic");
            iC = C0547k.c(jSONObject.getString("id"), jSONObject.getString("title").replaceAll("<[^>]+>", ""), "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/cZvf/1200X800/139.jpg", jSONObject.getString("tagName"), arrayList, iC, 1) + 1;
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
