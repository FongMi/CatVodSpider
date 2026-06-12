package com.github.catvod.spider;

import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.I.BuilderUtils;
import com.github.catvod.spider.merge.K.VodResult;
import com.github.catvod.spider.merge.K.VodItem;
import com.github.catvod.spider.merge.L1.l;
import com.github.catvod.spider.merge.c1.JsoupDocument;
import com.github.catvod.spider.merge.c1.JsoupElement;
import com.github.catvod.spider.merge.e1.JsoupElements;
import com.github.catvod.spider.merge.l.ConcatUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
public class Ikanbot extends NetPan {
    private HashMap<String, String> f() {
        return BuilderUtils.c("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
    }

    private String g(String str) {
        try {
            return str + "@Referer=https://api.douban.com/@User-Agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36";
        } catch (Exception unused) {
            return "";
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strA = ConcatUtils.a("https://v.ikanbot.com/hot", str);
        if (!"1".equals(str2)) {
            strA = BuilderUtils.a(strA, "-p-", str2);
        }
        Subtitle hVarE = l.e(com.github.catvod.spider.merge.f0.HttpClient.m(strA.concat(".html"), f(), null));
        ArrayList arrayList = new ArrayList();
        for (GeneralUtils mVar : hVarE.l0("a.item")) {
            String strA2 = mVar.l0("img").a("data-src");
            String strC = mVar.c("href");
            arrayList.add(new VodItem(strC.split("/")[2], mVar.l0("img").a("alt"), g(strA2)));
        }
        Integer numValueOf = Integer.valueOf((Integer.parseInt(str2) + 1) * 24);
        VodResult gVar = new VodResult();
        gVar.y(arrayList);
        gVar.j(Integer.parseInt(str2), Integer.parseInt(str2) + 1, 24, numValueOf.intValue());
        return gVar.toString();
    }

    @Override // com.github.catvod.en.NetPan
    public String detailContent(List<String> list) {
        String strGroup;
        String strGroup2;
        StringBuilder sbB;
        StringBuilder sb;
        Subtitle hVarE = l.e(com.github.catvod.spider.merge.f0.HttpClient.m("https://v.ikanbot.com/play/".concat(list.get(0)), f(), null));
        String strJ = hVarE.l0("h1").j();
        String strA = hVarE.l0("meta[property=og:image]").a("content");
        JsoupElements c1036gL0 = hVarE.l0("div.detail > h3");
        int i = 1;
        String strS0 = c1036gL0.get(1).s0();
        String strS02 = c1036gL0.get(2).s0();
        String strS03 = c1036gL0.get(3).s0();
        String strA2 = hVarE.l0("input#current_id").a("value");
        String strA3 = hVarE.l0("input#e_token").a("value");
        String strA4 = hVarE.l0("input#mtype").a("value");
        String str = get_tks(strA2, strA3);
        StringBuilder sbB2 = BuilderUtils.b("https://v.ikanbot.com/api/getResN?videoId=");
        sbB2.append(list.get(0));
        sbB2.append("&mtype=");
        sbB2.append(strA4);
        sbB2.append(" &token=");
        sbB2.append(str);
        Iterator it = ((JsonObject) com.github.catvod.spider.merge.C.u.a(com.github.catvod.spider.merge.f0.HttpClient.m(sbB2.toString(), f(), null), JsonObject.class)).getAsJsonObject("data").getAsJsonArray("list").iterator();
        String string = "";
        String string2 = string;
        while (it.hasNext()) {
            Matcher matcher = Pattern.compile("\\\"flag\\\":\\\"(.*?)\\\",\\\"url\\\":\\\"(.*?)\\\"").matcher(String.valueOf(((JsonElement) it.next()).getAsJsonObject().get("resData")).replace("\\", ""));
            if (matcher.find()) {
                strGroup = matcher.group(i);
                strGroup2 = matcher.group(2);
            } else {
                strGroup = "";
                strGroup2 = strGroup;
            }
            boolean zEquals = "".equals(string);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            if (!zEquals) {
                sb2.append("$$$");
            }
            sb2.append(strGroup);
            string = sb2.toString();
            if ("".equals(string2)) {
                sbB = BuilderUtils.b(string2);
                sb = new StringBuilder();
            } else {
                sbB = com.github.catvod.spider.merge.C1.a.a(string2, "$$$");
                sb = new StringBuilder();
            }
            sb.append("$");
            sb.append(strGroup);
            sbB.append(strGroup2.replace(sb.toString(), ""));
            string2 = sbB.toString();
            i = 1;
        }
        VodItem iVar = new VodItem();
        iVar.l(list.get(0));
        iVar.n(g(strA));
        iVar.s(strS0);
        iVar.h(strS03);
        iVar.i(strS02);
        iVar.m(strJ);
        iVar.o(string);
        iVar.p(string2.replace("##", "#").replace("#$$$", "$$$"));
        return VodResult.m(iVar);
    }

    public String get_tks(String str, String str2) {
        System.out.printf(ConcatUtils.a("current_id ", str), new Object[0]);
        System.out.printf(ConcatUtils.a("e_token ", str2), new Object[0]);
        if ("".equals(str) || "".equals(str2)) {
            return "";
        }
        String[] strArr = new String[4];
        int length = str.length();
        String strSubstring = str.substring(length - 4, length);
        for (int i = 0; i < strSubstring.length(); i++) {
            int numericValue = (Character.getNumericValue(strSubstring.charAt(i)) % 3) + 1;
            int i2 = numericValue + 8;
            strArr[i] = str2.substring(numericValue, i2);
            str2 = str2.substring(i2);
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < 4; i3++) {
            sb.append(strArr[i3]);
        }
        return sb.toString();
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"/index-movie-热门", "/index-tv-热门", "/index-tv-国产剧", "/index-tv-韩剧"};
        String[] strArr2 = {"热门电影", "热门剧集", "国产剧", "韩剧"};
        for (int i = 0; i < 4; i++) {
            arrayList.add(new com.github.catvod.spider.merge.K.VodCategory(strArr[i], strArr2[i]));
        }
        Subtitle hVarE = l.e(com.github.catvod.spider.merge.f0.HttpClient.m("https://v.ikanbot.com/billboard.html", f(), null));
        ArrayList arrayList2 = new ArrayList();
        for (GeneralUtils mVar : hVarE.l0("div.item-root")) {
            String strA = mVar.l0("img").a("data-src");
            try {
                arrayList2.add(new VodItem(mVar.l0("a").a("href").split("/")[2], mVar.l0("img").a("alt"), g(strA)));
            } catch (Exception unused) {
            }
        }
        return VodResult.q(arrayList, arrayList2);
    }

    @Override // com.github.catvod.en.NetPan
    public String playerContent(String str, String str2, List<String> list) {
        VodResult gVar = new VodResult();
        gVar.w(str2);
        gVar.g(f());
        return gVar.toString();
    }

    public String searchContent(String str, boolean z) {
        Subtitle hVarE = l.e(com.github.catvod.spider.merge.f0.HttpClient.m("https://v.ikanbot.com/search?q=".concat(URLEncoder.encode(str)), f(), null));
        ArrayList arrayList = new ArrayList();
        for (GeneralUtils mVar : hVarE.l0("a.cover-link")) {
            String strA = mVar.l0("img").a("data-src");
            String strC = mVar.c("href");
            arrayList.add(new VodItem(strC.split("/")[2], mVar.l0("img").a("alt"), g(strA)));
        }
        return VodResult.n(arrayList);
    }
}
