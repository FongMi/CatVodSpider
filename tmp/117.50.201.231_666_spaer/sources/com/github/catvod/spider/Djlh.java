package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.G.f;
import com.github.catvod.spider.merge.G.i;
import com.github.catvod.spider.merge.H.g;
import com.github.catvod.spider.merge.b.C0544h;
import com.github.catvod.spider.merge.b.C0547k;
import com.github.catvod.spider.merge.b.v;
import com.github.catvod.spider.merge.c.C0550a;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.k.C0575b;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class Djlh extends Spider {
    public final String a = "https://www.dj92.cc";

    public static String extractToken(String str) {
        Matcher matcher = Pattern.compile("token:\\s*'([^']+)'").matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public final String b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("/search.html?key=" + URLEncoder.encode(str) + "&page=" + str2);
        String string = sb.toString();
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
        com.github.catvod.spider.merge.I.c cVarN0 = g.d(C0575b.l(string, map)).n0("div.layui-col-md8 > div > div.music-body > ul > li");
        ArrayList arrayList = new ArrayList();
        for (i iVar : cVarN0) {
            com.github.catvod.spider.merge.I.c cVarN02 = iVar.n0("div.center > span.name > a");
            String strA = cVarN02 != null ? cVarN02.a("href") : "";
            com.github.catvod.spider.merge.I.c cVarN03 = iVar.n0("div.user > a > img");
            String str3 = cVarN03 != null ? "https:" + cVarN03.a("src") : "";
            com.github.catvod.spider.merge.I.c cVarN04 = iVar.n0("div.center > span.name > a");
            String strA2 = cVarN04 != null ? cVarN04.a("title") : "";
            com.github.catvod.spider.merge.I.c cVarN05 = iVar.n0("div.center > span.nickname > a");
            String strA3 = cVarN05 != null ? cVarN05.a("title") : "";
            if (!strA.isEmpty() && !str3.isEmpty() && !strA2.isEmpty() && !strA3.isEmpty()) {
                C0547k.b(strA, strA2, str3, strA3, arrayList);
            }
        }
        return C0552c.i(arrayList);
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        if (map.get("cateId") != null) {
            str = map.get("cateId");
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sbF = com.github.catvod.spider.merge.A.a.f(sb, this.a, "/djlist/", str, "/");
        sbF.append(str2);
        sbF.append(".html");
        sb.append(sbF.toString());
        String string = sb.toString();
        HashMap map2 = new HashMap();
        map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
        f fVarD = g.d(C0575b.l(string, map2));
        int i = Integer.parseInt(str2);
        ArrayList arrayList = new ArrayList();
        for (i iVar : fVarD.n0("div.layui-row.layui-col-space20 > div.layui-col-md8 > div > div.music-body > ul > li")) {
            com.github.catvod.spider.merge.I.c cVarN0 = iVar.n0("div.center > span.name > a");
            String strA = cVarN0 != null ? cVarN0.a("href") : "";
            com.github.catvod.spider.merge.I.c cVarN02 = iVar.n0("div.user > a > img");
            String str3 = cVarN02 != null ? "https:" + cVarN02.a("src") : "";
            com.github.catvod.spider.merge.I.c cVarN03 = iVar.n0("div.center > span.name > a");
            String strA2 = cVarN03 != null ? cVarN03.a("title") : "";
            com.github.catvod.spider.merge.I.c cVarN04 = iVar.n0("div.center > span.nickname > a");
            String strA3 = cVarN04 != null ? cVarN04.a("title") : "";
            if (!strA.isEmpty() && !str3.isEmpty() && !strA2.isEmpty() && !strA3.isEmpty()) {
                C0547k.b(strA, strA2, str3, strA3, arrayList);
            }
        }
        return com.github.catvod.spider.merge.A.a.d(arrayList, i, arrayList.size() < 20 ? i : i + 1, 20, 0);
    }

    public String detailContent(List<String> list) throws JSONException {
        String str = list.get(0);
        String strB = C0544h.b(new StringBuilder(), this.a, str);
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
        String strL = C0575b.l(strB, map);
        f fVarD = g.d(strL);
        C0554e c0554eB = com.github.catvod.spider.merge.A.a.b(str);
        c0554eB.k(fVarD.n0("div.music-info-box > div.music-play-box > h3 > span.name").c());
        c0554eB.l("");
        c0554eB.h("");
        c0554eB.m("轮回DJ");
        HashMap mapB = v.b("token", extractToken(strL));
        HashMap map2 = new HashMap();
        map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
        String string = new JSONObject(C0575b.g("https://www.dj92.cc/ajax/info", mapB, map2).a()).getString("playurl");
        if (!string.contains("http")) {
            string = "https:".concat(string);
        }
        c0554eB.n("点击播放$" + string);
        return C0552c.m(c0554eB);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("1", "2", "3", "4", "5", "7", "8");
        List listAsList2 = Arrays.asList("电音House", "中文舞曲", "外文舞曲", "酒吧风格", "串烧舞曲", "私改舞曲", "大赛作品");
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new C0550a((String) listAsList.get(i), (String) listAsList2.get(i), null));
        }
        return com.github.catvod.spider.merge.A.a.a("{}", arrayList);
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0552c c0552c = new C0552c();
        c0552c.w(str2);
        return c0552c.toString();
    }

    public String searchContent(String str, boolean z) {
        return b(str, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        return b(str, str2);
    }
}
