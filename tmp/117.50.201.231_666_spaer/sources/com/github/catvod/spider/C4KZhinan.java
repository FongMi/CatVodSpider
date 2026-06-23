package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.G.f;
import com.github.catvod.spider.merge.G.i;
import com.github.catvod.spider.merge.H.g;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.b.C0547k;
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

/* JADX INFO: renamed from: com.github.catvod.spider.4KZhinan, reason: invalid class name */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class C4KZhinan extends Pan {
    public final String a = "https://4kzn.com";

    public static List<String> extractQuarkLinks(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null && !str.isEmpty()) {
            Matcher matcher = Pattern.compile("href\\s*=\\s*\"(https://pan\\.quark\\.cn\\/s\\/[a-fA-F0-9]+)\"").matcher(str);
            while (matcher.find()) {
                arrayList.add(C0529a.filterCloudDiskLinks(matcher.group(1)));
            }
        }
        return arrayList;
    }

    public final String b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("/page/" + str2 + "?post_type=book&s=" + URLEncoder.encode(str));
        String string = sb.toString();
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
        com.github.catvod.spider.merge.I.c cVarN0 = g.d(C0575b.l(string, map)).n0(".posts-item.book-item.d-flex.style-book-v");
        ArrayList arrayList = new ArrayList();
        for (i iVar : cVarN0) {
            C0547k.b(iVar.n0("div.item-header > div > a").a("href"), iVar.n0("div.item-body.flex-fill > h3 > a").c(), iVar.n0("div.item-header > div > a > img").a("data-src"), iVar.n0("div.item-body.flex-fill > div").c(), arrayList);
        }
        return C0552c.i(arrayList);
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        if (map.get("cateId") != null) {
            str = map.get("cateId");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(str + "/page/" + str2);
        String string = sb.toString();
        HashMap map2 = new HashMap();
        map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
        f fVarD = g.d(C0575b.l(string, map2));
        int i = Integer.parseInt(str2);
        int iCeil = (int) Math.ceil(((double) Integer.MAX_VALUE) / ((double) 50));
        C0552c c0552c = new C0552c();
        ArrayList arrayList = new ArrayList();
        for (i iVar : fVarD.n0(".posts-item.book-item.d-flex.style-book-v")) {
            C0547k.b(iVar.n0("div.item-header > div > a").a("href"), iVar.n0("div.item-body.flex-fill > h3 > a").c(), iVar.n0("div.item-header > div > a > img").a("data-src"), iVar.n0("div.item-body.flex-fill > div").c(), arrayList);
        }
        c0552c.z(arrayList);
        c0552c.m95i(i, iCeil, 50, Integer.MAX_VALUE);
        return c0552c.toString();
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) {
        int i;
        String str = list.get(0);
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
        f fVarD = g.d(C0575b.l(str, map));
        C0554e c0554eB = com.github.catvod.spider.merge.A.a.b(str);
        c0554eB.k(fVarD.n0("div.d-flex.flex-wrap.mb-4 > div.site-name-box.flex-fill.mb-3 > h1").c());
        c0554eB.l(fVarD.n0("div.book-cover.text-center.mr-0.mr-md-3.mt-4.mt-md-0 > img").a("data-src"));
        String strC = fVarD.n0("div.panel.site-content.card > div > div > p").c();
        int iIndexOf = strC.indexOf("导演:");
        if (iIndexOf != -1) {
            int i2 = iIndexOf + 6;
            int iIndexOf2 = strC.indexOf("编剧:");
            if (iIndexOf2 != -1) {
                c0554eB.i(strC.substring(i2, iIndexOf2).trim());
            }
        }
        int iIndexOf3 = strC.indexOf("主演:");
        if (iIndexOf3 != -1) {
            int i3 = iIndexOf3 + 6;
            int iIndexOf4 = strC.indexOf("类型:");
            if (iIndexOf4 != -1) {
                c0554eB.f(strC.substring(i3, iIndexOf4).trim().replace(" / ", ","));
            }
        }
        int iIndexOf5 = strC.indexOf("制片国家/地区:");
        if (iIndexOf5 != -1) {
            int i4 = iIndexOf5 + 9;
            int iIndexOf6 = strC.indexOf("语言:");
            if (iIndexOf6 != -1) {
                c0554eB.g(strC.substring(i4, iIndexOf6).trim());
            }
        }
        int iIndexOf7 = strC.indexOf("IMDb: ");
        c0554eB.h((iIndexOf7 == -1 || (i = iIndexOf7 + 16) >= strC.length()) ? strC : strC.substring(i).trim());
        List<String> listExtractQuarkLinks = extractQuarkLinks(fVarD.n0("div.book-info.flex-fill > div.site-body.text-sm > div.mt-n2 > div.site-go.mt-3").toString());
        c0554eB.m(detailContentVodPlayFrom(listExtractQuarkLinks));
        c0554eB.n(detailContentVodPlayUrl(listExtractQuarkLinks));
        return C0529a.processVodData(C0552c.m(c0554eB));
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("/books/zuixin", "/books/top250", "/books/juji", "/books/dianying");
        List listAsList2 = Arrays.asList("最新", "top250", "剧集", "电影");
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

    public String searchContent(String str, boolean z) {
        return b(str, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        return b(str, str2);
    }
}
