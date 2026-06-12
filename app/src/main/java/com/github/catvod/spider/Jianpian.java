package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.I.BuilderUtils;
import com.github.catvod.spider.merge.K.VodResult;
import com.github.catvod.spider.merge.K.VodItem;
import com.github.catvod.spider.merge.l.ConcatUtils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
public class Jianpian extends Spider {
    private String a = "https://ev5356.970xw.com";
    private String b;
    private String c;

    private Map<String, String> a() {
        HashMap mapC = BuilderUtils.c("User-Agent", "Mozilla/5.0 (Linux; Android 9; V2196A Build/PQ3A.190705.08211809; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/91.0.4472.114 Mobile Safari/537.36;webank/h5face;webank/1.0;netType:NETWORK_WIFI;appVersion:416;packageName:com.jp3.xg3");
        mapC.put("Referer", this.a);
        return mapC;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        if (str.endsWith("/{pg}")) {
            return searchContent(str.split("/")[0], str2);
        }
        if (str.equals("50") || str.equals("99") || str.equals("111")) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.github.catvod.spider.merge.Q.d> it = com.github.catvod.spider.merge.Q.f.b(com.github.catvod.spider.merge.f0.HttpClient.m(this.a + String.format("/api/dyTag/list?category_id=%s&page=%s", str, str2), a(), null)).a().iterator();
            while (it.hasNext()) {
                Iterator<com.github.catvod.spider.merge.Q.d> it2 = it.next().c().iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().m(this.b));
                }
            }
            VodResult gVar = new VodResult();
            gVar.j(1, 1, 0, 1);
            gVar.y(arrayList);
            return gVar.toString();
        }
        ArrayList arrayList2 = new ArrayList();
        HashMap map2 = new HashMap();
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        Iterator<com.github.catvod.spider.merge.Q.d> it3 = com.github.catvod.spider.merge.Q.f.b(com.github.catvod.spider.merge.f0.HttpClient.m(this.a + String.format("/api/crumb/list?fcate_pid=%s&area=%s&year=%s&type=0&sort=%s&page=%s&category_id=", str, map2.get("area") == null ? "0" : (String) map2.get("area"), map2.get("year") != null ? (String) map2.get("year") : "0", map2.get("by") == null ? "updata" : (String) map2.get("by"), str2), a(), null)).a().iterator();
        while (it3.hasNext()) {
            arrayList2.add(it3.next().m(this.b));
        }
        return VodResult.n(arrayList2);
    }

    public String detailContent(List<String> list) {
        com.github.catvod.spider.merge.Q.FilterGroup dVarA = ((com.github.catvod.spider.merge.Q.e) com.github.catvod.spider.merge.C.u.a(com.github.catvod.spider.merge.f0.HttpClient.m(this.a + "/api/video/detailv2?id=" + list.get(0), a(), null), com.github.catvod.spider.merge.Q.StringUtils.class)).a();
        VodItem iVarM = dVarA.m(this.b);
        iVarM.o(dVarA.i());
        iVarM.s(dVarA.k());
        iVarM.i(dVarA.b());
        iVarM.g(dVarA.g());
        iVarM.h(dVarA.a());
        iVarM.p(dVarA.j());
        iVarM.k(dVarA.e());
        iVarM.j(dVarA.d());
        return VodResult.m(iVarM);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("1", "2", "3", "4", "50", "99");
        List listAsList2 = Arrays.asList("电影", "电视剧", "动漫", "综艺", "纪录片", "Netflix");
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new com.github.catvod.spider.merge.K.VodCategory((String) listAsList.get(i), (String) listAsList2.get(i)));
        }
        return VodResult.o(arrayList, JsonParser.parseString(com.github.catvod.spider.merge.f0.HttpClient.l(this.c)));
    }

    public String homeVideoContent() {
        ArrayList arrayList = new ArrayList();
        Iterator<com.github.catvod.spider.merge.Q.d> it = com.github.catvod.spider.merge.Q.f.b(com.github.catvod.spider.merge.f0.HttpClient.m(ConcatUtils.b(new StringBuilder(), this.a, "/api/slide/list?pos_id=88"), a(), null)).a().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().l(this.b));
        }
        return VodResult.n(arrayList);
    }

    public void init(Context context, String str) {
        this.c = str;
        for (String str2 : ((JsonObject) new Gson().fromJson(com.github.catvod.spider.merge.f0.HttpClient.l("https://dns.alidns.com/resolve?name=swrdsfeiujo25sw.cc&type=TXT"), JsonObject.class)).getAsJsonArray("Answer").get(0).getAsJsonObject().get("data").getAsString().replace("\"", "").split(",")) {
            this.a = ConcatUtils.a("https://wangerniu.", str2);
            String strL = com.github.catvod.spider.merge.f0.HttpClient.l(this.a + "/api/v2/settings/resourceDomainConfig");
            if (!strL.isEmpty()) {
                this.b = ((JsonObject) com.github.catvod.spider.merge.C.u.a(strL, JsonObject.class)).getAsJsonObject("data").get("imgDomain").getAsString();
                return;
            }
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        VodResult gVar = new VodResult();
        gVar.w(str2);
        gVar.g(a());
        return gVar.toString();
    }

    public String searchContent(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator<com.github.catvod.spider.merge.Q.g> it = ((com.github.catvod.spider.merge.Q.g) com.github.catvod.spider.merge.C.u.a(com.github.catvod.spider.merge.f0.HttpClient.m(this.a + String.format("/api/v2/search/videoV2?key=%s&category_id=88&page=%s&pageSize=20", URLEncoder.encode(str), str2), a(), null), com.github.catvod.spider.merge.Q.VodResult.class)).a().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b(this.b));
        }
        return VodResult.n(arrayList);
    }

    public String searchContent(String str, boolean z) {
        return searchContent(str, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        return searchContent(str, str2);
    }
}
