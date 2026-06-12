package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.Bk.l;
import com.github.catvod.spider.merge.HR.C0724g;
import com.github.catvod.spider.merge.KI.k;
import com.github.catvod.spider.merge.Mp.P;
import com.github.catvod.spider.merge.NQ.j;
import com.github.catvod.spider.merge.UY.h;
import com.github.catvod.spider.merge.UY.m;
import com.github.catvod.spider.merge.bY.C0925t;
import com.github.catvod.spider.merge.bY.C0926u;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
public class FirstAid extends Spider {
    private final String a = "https://m.youlai.cn";

    private Map<String, String> a() {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String[] strArrSplit = str.split("\\|");
        String str3 = strArrSplit[0];
        int i = Integer.parseInt(strArrSplit[1]);
        if (map.get("cateId") != null) {
            str3 = map.get("cateId");
        }
        Subtitle hVarE = l.e(com.github.catvod.spider.merge.nU.FilterValue.l(this.a + String.format("/%s", str3), a()));
        String str4 = "https:" + hVarE.o0(".block100").d(i).a("src");
        C0724g c0724gG = hVarE.o0(".jj-title-li").d(i).g(".list-br3");
        ArrayList arrayList = new ArrayList();
        for (GeneralUtils mVar : c0724gG) {
            arrayList.add(new k(this.a + mVar.o0("a").a("href"), P.a(new byte[]{37}, new byte[]{68, 73, 106, 127, 32, -2, -23, 69}, mVar), str4));
        }
        com.github.catvod.spider.merge.KI.Subtitle hVar = new com.github.catvod.spider.merge.KI.h();
        hVar.k(1, 1, 0, c0724gG.size());
        hVar.A(arrayList);
        return hVar.toString();
    }

    public String detailContent(List<String> list) {
        Subtitle hVarE = l.e(com.github.catvod.spider.merge.nU.FilterValue.l(list.get(0), a()));
        String strA = JsonUtils.a(new byte[]{-39, -121, -29, 6, 83, 62, -125, -126, -98, -123, -26, 7, 24, 57, -97, -37, -125, -104, -2, 14, 83}, new byte[]{-9, -15, -118, 98, 54, 81, -82, -10}, hVarE);
        String strA2 = hVarE.o0(".video-cover.list-flex-in img").a("src");
        String strA3 = JsonUtils.a(new byte[]{69, 118, -77, 97, -47, 69, -88, 107, 27, 104, -77, 98, -102}, new byte[]{54, 6, -46, 15, -1, 33, -57, 8}, hVarE);
        String strA4 = "中国";
        String strA5 = JsonUtils.a(new byte[]{-35, -106, 93, 3, -17, 114, 123, 44, -121, -46, 83, 11, -84}, new byte[]{-13, -1, 48, 100, -62, 6, 30, 84}, hVarE);
        String strA6 = hVarE.o0("#video source").a("src");
        if (strA6.isEmpty()) {
            strA6 = hVarE.o0("#video").a("src");
        }
        String strA7 = C0926u.a(new byte[]{91}, new byte[]{127, 90, -35, 121, 21, -96, -96, 46}, C0925t.b(strA), strA6);
        k kVar = new k();
        kVar.g(list.get(0));
        kVar.i(strA2);
        kVar.h(strA);
        kVar.c(strA3);
        kVar.d(strA4);
        kVar.e(strA5);
        kVar.j("Qile");
        kVar.k(strA7);
        return com.github.catvod.spider.merge.KI.Subtitle.p(kVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("jijiu|0", "jijiu|1", "jijiu|2", "jijiu|3", "jijiu|4", "jijiu|5", "jijiu|6", "jijiu|7");
        List listAsList2 = Arrays.asList("急救技能", "家庭生活", "急危重症", "常见损伤", "动物致伤", "海洋急救", "中毒急救", "意外事故");
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new com.github.catvod.spider.merge.KI.a((String) listAsList.get(i), (String) listAsList2.get(i)));
        }
        return com.github.catvod.spider.merge.KI.Subtitle.t(arrayList, Collections.emptyList());
    }

    public String playerContent(String str, String str2, List<String> list) {
        com.github.catvod.spider.merge.KI.Subtitle hVar = new com.github.catvod.spider.merge.KI.h();
        hVar.y(str2);
        hVar.f(a());
        return hVar.toString();
    }

    public String searchContent(String str, boolean z) {
        C0724g c0724gO0 = l.e(com.github.catvod.spider.merge.nU.FilterValue.l("https://m.youlai.cn/cse/search?q=" + URLEncoder.encode(str), a())).o0(".search-video-li.list-br2");
        ArrayList arrayList = new ArrayList();
        for (GeneralUtils mVar : c0724gO0) {
            String str2 = this.a + mVar.o0("a").a("href");
            String strA = P.a(new byte[]{2, -70, 17, 83, 112, 59, 6, 11, 9, -29, 94, 82, 105, 100}, new byte[]{106, -113, 63, 63, 25, 85, 99, 38}, mVar);
            String strA2 = mVar.o0("dt.logo-bg img").a("src");
            if (!strA2.startsWith("https")) {
                strA2 = C0926u.a(new byte[]{-9, 64, -106, 44, 13, 18}, new byte[]{-97, 52, -30, 92, 126, 40, -42, 29}, new StringBuilder(), strA2);
            }
            arrayList.add(new k(str2, strA, strA2));
        }
        return com.github.catvod.spider.merge.KI.Subtitle.q(arrayList);
    }
}
