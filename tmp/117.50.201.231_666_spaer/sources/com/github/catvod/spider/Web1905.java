package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.G.i;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.b.C0544h;
import com.github.catvod.spider.merge.b.C0547k;
import com.github.catvod.spider.merge.b.u;
import com.github.catvod.spider.merge.b.x;
import com.github.catvod.spider.merge.c.C0550a;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.k.C0575b;
import com.github.catvod.spider.merge.m.C0590I;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class Web1905 extends Spider {
    private static final Pattern a = Pattern.compile("play/(.*?).sh");

    private String a(String str) {
        HashMap mapC = C0544h.c("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36", "Referer", "https://www.1905.com");
        mapC.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        return C0575b.l(str, mapC);
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (i iVar : com.github.catvod.spider.merge.D.a.a(a("https://www.1905.com/vod/list/" + str + "/o3p" + str2 + ".html")).n0("n_2".equals(str) ? "div.mod > div > a" : "section.search-list > div > a")) {
            String strD = iVar.d("href");
            Matcher matcher = a.matcher(strD);
            if (matcher.find()) {
                strD = matcher.group(1);
            }
            C0547k.b(strD, iVar.d("title"), iVar.n0("img").a("src"), iVar.n0("p").c(), arrayList);
        }
        return C0544h.a(str2, new C0552c(), 0, 0, 0, arrayList);
    }

    public String detailContent(List<String> list) {
        String str = list.get(0);
        JSONObject jSONObject = new JSONObject(a(u.a("https://www.1905.com/api/content/?m=Vod&a=getVodSidebar&id=", str, "&fomat=json")));
        C0554e c0554e = new C0554e();
        c0554e.j(str);
        String strOptString = jSONObject.optString("title");
        c0554e.k(strOptString);
        c0554e.l(jSONObject.optString("thumb"));
        c0554e.o(jSONObject.optString("commendreason"));
        c0554e.h(jSONObject.optString("description"));
        c0554e.i(jSONObject.optString("direct"));
        c0554e.f(jSONObject.optString("starring"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(strOptString + "$" + str);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONObject("info").optJSONArray("series_data");
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            arrayList.add(jSONObjectOptJSONObject.optString("title") + "$" + jSONObjectOptJSONObject.optString("contentid"));
        }
        c0554e.m("1905");
        c0554e.n(TextUtils.join("#", arrayList));
        return C0552c.m(c0554e);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("n_1", "n_1_c_922", "n_2", "c_927", "n_1_c_586", "n_1_c_178", "n_1_c_1024", "n_1_c_1053");
        List listAsList2 = Arrays.asList("电影", "微电影", "系列电影", "记录片", "晚会", "独家", "综艺", "体育");
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new C0550a((String) listAsList.get(i), (String) listAsList2.get(i), null));
        }
        return C0552c.p(arrayList, new ArrayList());
    }

    public void init(Context context, String str) {
        super.init(context, str);
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strOptString;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        long j = 600 + jCurrentTimeMillis;
        String string = UUID.randomUUID().toString();
        String str3 = "";
        String strSubstring = string.replace("-", "").substring(5, 20);
        String strK = C0590I.k(String.format("cid=%s&expiretime=%d&nonce=%d&page=%s&playerid=%s&type=hls&uuid=%s.dde3d61a0411511d", str2, Long.valueOf(j), Long.valueOf(jCurrentTimeMillis), u.a("https://www.1905.com/vod/play/", str2, ".shtml").replace(":", "%3A").replace("/", "%2F"), strSubstring, string));
        StringBuilder sb = new StringBuilder();
        sb.append("https://profile.m1905.com/mvod/getVideoinfo.php?nonce=");
        sb.append(jCurrentTimeMillis);
        sb.append("&expiretime=");
        sb.append(j);
        sb.append("&cid=");
        sb.append(str2);
        x.a(sb, "&uuid=", string, "&playerid=", strSubstring);
        x.a(sb, "&page=https%3A%2F%2Fwww.1905.com%2Fvod%2Fplay%2F", str2, ".shtml&type=hls&signature=", strK);
        sb.append("&callback=");
        JSONObject jSONObjectOptJSONObject = new JSONObject(a(sb.toString()).replace("(", "").replace(")", "")).optJSONObject("data");
        Iterator<String> itKeys = jSONObjectOptJSONObject.optJSONObject("sign").keys();
        ArrayList arrayList = new ArrayList();
        while (itKeys.hasNext()) {
            arrayList.add(itKeys.next());
        }
        if (arrayList.contains("uhd")) {
            strOptString = jSONObjectOptJSONObject.optJSONObject("sign").optJSONObject("uhd").optString("sign");
            str3 = "uhd";
        } else if (arrayList.contains("hd")) {
            strOptString = jSONObjectOptJSONObject.optJSONObject("sign").optJSONObject("hd").optString("sign");
            str3 = "hd";
        } else if (arrayList.contains("sd")) {
            strOptString = jSONObjectOptJSONObject.optJSONObject("sign").optJSONObject("sd").optString("sign");
            str3 = "sd";
        } else {
            strOptString = "";
        }
        String strA = u.a(jSONObjectOptJSONObject.optJSONObject("quality").optJSONObject(str3).optString("host"), strOptString, jSONObjectOptJSONObject.optJSONObject("path").optJSONObject(str3).optString("path"));
        C0552c c0552c = new C0552c();
        c0552c.k(0);
        c0552c.u(strA);
        return c0552c.toString();
    }

    public String searchContent(String str, boolean z) {
        StringBuilder sbA = C0529a.a("https://www.1905.com/search/index-p-type-all-q-");
        sbA.append(URLEncoder.encode(str));
        sbA.append(".html");
        ArrayList arrayList = new ArrayList();
        for (i iVar : com.github.catvod.spider.merge.D.a.a(a(sbA.toString())).n0("div.movie_box > div > div")) {
            String strA = iVar.n0("div > ul > li.paly-tab-icon > a").a("href");
            if (!TextUtils.isEmpty(strA)) {
                Matcher matcher = a.matcher(strA);
                if (matcher.find()) {
                    strA = matcher.group(1);
                }
                C0547k.b(strA, iVar.n0("div > div.movie-pic > a > img").a("alt"), iVar.n0("div > div.movie-pic > a > img").a("src"), "", arrayList);
            }
        }
        return C0552c.n(arrayList);
    }
}
