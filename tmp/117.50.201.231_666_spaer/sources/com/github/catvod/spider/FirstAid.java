package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.FM.A.l;
import com.github.catvod.spider.merge.FM.K.h;
import com.github.catvod.spider.merge.FM.K.m;
import com.github.catvod.spider.merge.FM.L.P;
import com.github.catvod.spider.merge.FM.M.C0274g;
import com.github.catvod.spider.merge.FM.b.v;
import com.github.catvod.spider.merge.FM.c.C0323a;
import com.github.catvod.spider.merge.FM.c.C0329g;
import com.github.catvod.spider.merge.FM.c.C0332j;
import com.github.catvod.spider.merge.FM.m.C0378c;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
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
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        h hVarG = l.g(C0378c.n(v.a("/%s", new Object[]{str3}, sb), a()));
        String str4 = hVarG.o0(".block100").d(i).a("src");
        C0274g c0274gH = hVarG.o0(".jj-title-li").d(i).h(".list-br3");
        ArrayList arrayList = new ArrayList();
        for (m mVar : c0274gH) {
            arrayList.add(new C0332j(this.a + mVar.o0("a").a("href"), mVar.o0("a").i(), str4));
        }
        C0329g c0329g = new C0329g();
        c0329g.k(1, 1, 0, c0274gH.size());
        c0329g.z(arrayList);
        return c0329g.toString();
    }

    public String detailContent(List<String> list) {
        h hVarG = l.g(C0378c.n(list.get(0), a()));
        String strI = hVarG.o0(".video-title.h1-title").i();
        String strA = hVarG.o0(".video-cover.list-flex-in img").a("src");
        String strI2 = hVarG.o0("span.doc-name").i();
        String strI3 = hVarG.o0(".img-text-con").i();
        String strA2 = hVarG.o0("#video source").a("src");
        if (strA2.isEmpty()) {
            strA2 = hVarG.o0("#video").a("src");
        }
        StringBuilder sbB = P.b(strI);
        sbB.append("$");
        sbB.append(strA2);
        String string = sbB.toString();
        C0332j c0332j = new C0332j();
        c0332j.g(list.get(0));
        c0332j.i(strA);
        c0332j.h(strI);
        c0332j.c(strI2);
        c0332j.d("中国");
        c0332j.e(strI3);
        c0332j.j("Qile");
        c0332j.k(string);
        return C0329g.p(c0332j);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("jijiu|0", "jijiu|1", "jijiu|2", "jijiu|3", "jijiu|4", "jijiu|5", "jijiu|6", "jijiu|7");
        List listAsList2 = Arrays.asList("急救技能", "家庭生活", "急危重症", "常见损伤", "动物致伤", "海洋急救", "中毒急救", "意外事故");
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new C0323a((String) listAsList.get(i), (String) listAsList2.get(i)));
        }
        return C0329g.s(arrayList, Collections.emptyList());
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0329g c0329g = new C0329g();
        c0329g.x(str2);
        c0329g.f(a());
        return c0329g.toString();
    }

    public String searchContent(String str, boolean z) {
        C0274g c0274gO0 = l.g(C0378c.n("https://m.youlai.cn/cse/search?q=" + URLEncoder.encode(str), a())).o0(".search-video-li.list-br2");
        ArrayList arrayList = new ArrayList();
        for (m mVar : c0274gO0) {
            String str2 = this.a + mVar.o0("a").a("href");
            String strI = mVar.o0("h5.line-clamp1").i();
            String strA = mVar.o0("dt.logo-bg img").a("src");
            if (!strA.startsWith("https")) {
                strA = "https:" + strA;
            }
            arrayList.add(new C0332j(str2, strI, strA));
        }
        return C0329g.q(arrayList);
    }
}
