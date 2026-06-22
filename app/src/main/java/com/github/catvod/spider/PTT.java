package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.B.JsonUtils;
import com.github.catvod.spider.merge.I.BuilderUtils;
import com.github.catvod.spider.merge.I0.GeneralUtils;
import com.github.catvod.spider.merge.K.VodItem;
import com.github.catvod.spider.merge.K.VodResult;
import com.github.catvod.spider.merge.KI.Subtitle;
import com.github.catvod.spider.merge.L1.l;
import com.github.catvod.spider.merge.e1.JsoupElements;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PTT extends Spider {
    private String a = "https://ptt.red/";
    private String b;

    private Map<String, String> a() {
        return com.github.catvod.spider.merge.B.MapBuilder.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36", "Accept-Language", "zh-TW,zh;q=0.9,en-US;q=0.8,en;q=0.7");
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.a + "p/" + str).buildUpon();
        if (!TextUtils.isEmpty(map.get("c"))) {
            StringBuilder sbB = BuilderUtils.b("c/");
            sbB.append(map.get("c"));
            builderBuildUpon.appendEncodedPath(sbB.toString());
        }
        if (!TextUtils.isEmpty(map.get("area"))) {
            builderBuildUpon.appendQueryParameter("area_id", map.get("area"));
        }
        if (!TextUtils.isEmpty(map.get("year"))) {
            builderBuildUpon.appendQueryParameter("year", map.get("year"));
        }
        if (!TextUtils.isEmpty(map.get("sort"))) {
            builderBuildUpon.appendQueryParameter("sort", map.get("sort"));
        }
        builderBuildUpon.appendQueryParameter("page", str2);
        Subtitle hVarE = l.e(com.github.catvod.spider.merge.f0.HttpClient.m(builderBuildUpon.toString(), a(), null));
        ArrayList arrayList = new ArrayList();
        for (GeneralUtils mVar : hVarE.l0("div.card > div.embed-responsive")) {
            GeneralUtils mVar2 = mVar.l0("a").get(0);
            GeneralUtils mVar3 = mVar2.l0("img").get(0);
            String strS0 = mVar.l0("span.badge.badge-success").get(0).s0();
            String strC = mVar3.c("src").startsWith("http") ? mVar3.c("src") : this.a + mVar3.c("src");
            String strC2 = mVar3.c("alt");
            if (!TextUtils.isEmpty(strC2)) {
                arrayList.add(new VodItem(mVar2.c("href").substring(3), strC2, strC, strS0));
            }
        }
        return VodResult.n(arrayList);
    }

    public String detailContent(List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        Subtitle hVarE = l.e(com.github.catvod.spider.merge.f0.HttpClient.m(ConcatUtils.b(sb, list.get(0), "/1"), a(), null));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (GeneralUtils mVar : hVarE.l0("ul#w1 > li > a")) {
            linkedHashMap.put(mVar.c("href").split("/")[3], mVar.c("title"));
        }
        JsoupElements c1036gL0 = hVarE.l0("div > a.seq.border");
        for (String str : linkedHashMap.keySet()) {
            ArrayList arrayList2 = new ArrayList();
            for (GeneralUtils mVar2 : c1036gL0) {
                arrayList2.add(mVar2.s0() + "$" + list.get(0) + "/" + mVar2.c("href").split("/")[2] + "/" + str);
            }
            if (arrayList2.isEmpty()) {
                StringBuilder sbB = BuilderUtils.b("1$");
                sbB.append(list.get(0));
                sbB.append("/1/");
                sbB.append(str);
                arrayList2.add(sbB.toString());
            }
            arrayList.add(TextUtils.join("#", arrayList2));
        }
        VodItem iVar = new VodItem();
        iVar.o(TextUtils.join("$$$", linkedHashMap.values()));
        iVar.p(TextUtils.join("$$$", arrayList));
        return VodResult.m(iVar);
    }

    public String homeContent(boolean z) {
        Subtitle hVarE = l.e(com.github.catvod.spider.merge.f0.HttpClient.m(this.a, a(), null));
        ArrayList arrayList = new ArrayList();
        for (GeneralUtils mVar : hVarE.l0("li > a.px-2.px-sm-3.py-2.nav-link")) {
            arrayList.add(new com.github.catvod.spider.merge.K.VodCategory(mVar.c("href").replace("/p/", ""), mVar.s0()));
        }
        return VodResult.o(arrayList, JsonUtils.c(TextUtils.isEmpty(this.b) ? "{}" : com.github.catvod.spider.merge.f0.HttpClient.l(this.b)));
    }

    public void init(Context context, String str) {
        this.b = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        Matcher matcher = Pattern.compile("contentUrl\":\"(.*?)\"").matcher(com.github.catvod.spider.merge.f0.HttpClient.l(this.a + str2));
        if (!matcher.find()) {
            return VodResult.c("");
        }
        VodResult gVar = new VodResult();
        gVar.w(matcher.group(1).replace("\\", ""));
        return gVar.toString();
    }

    public String searchContent(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        Subtitle hVarE = l.e(com.github.catvod.spider.merge.f0.HttpClient.m(this.a + String.format("q/%s?page=%s", str, str2), a(), null));
        ArrayList arrayList = new ArrayList();
        for (GeneralUtils mVar : hVarE.l0("div.card > div.embed-responsive")) {
            GeneralUtils mVar2 = mVar.l0("a").get(0);
            GeneralUtils mVar3 = mVar2.l0("img").get(0);
            String strS0 = mVar.l0("span.badge.badge-success").get(0).s0();
            String strC = mVar3.c("src").startsWith("http") ? mVar3.c("src") : this.a + mVar3.c("src");
            String strC2 = mVar3.c("alt");
            if (!TextUtils.isEmpty(strC2)) {
                arrayList.add(new VodItem(mVar2.c("href").substring(3), strC2, strC, strS0));
            }
        }
        return VodResult.n(arrayList);
    }
}
