package com.github.catvod.spider;

import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.I.BuilderUtils;
import com.github.catvod.spider.merge.K.VodResult;
import com.github.catvod.spider.merge.K.VodItem;
import com.github.catvod.spider.merge.L1.l;
import com.github.catvod.spider.merge.c1.JsoupElement;
import com.github.catvod.spider.merge.e1.JsoupElements;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
public class PanSouQuark extends NetPan {
    private String searchContent(String str, String str2) {
        StringBuilder sbB = BuilderUtils.b("https://www.aipanso.com/search?k=");
        sbB.append(URLEncoder.encode(str));
        sbB.append("&page=");
        sbB.append(str2);
        sbB.append("&s=0&t=-1");
        String string = sbB.toString();
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
        JsoupElements c1036gL0 = l.e(com.github.catvod.spider.merge.f0.HttpClient.m(string, map, null)).l0("van-row > a");
        ArrayList arrayList = new ArrayList();
        for (GeneralUtils mVar : c1036gL0) {
            String strTrim = mVar.m0("template").s0().trim();
            if (strTrim.contains(str)) {
                VodItem iVar = new VodItem();
                iVar.l(mVar.c("href") + "#" + str);
                iVar.n("https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c7/6c/55/c76c5544-64a5-882a-3862-c68b28f16299/AppIcon-0-0-1x_U007ephone-0-11-0-0-85-220.png/350x350.png");
                iVar.m(strTrim);
                arrayList.add(iVar);
            }
        }
        return VodResult.n(arrayList);
    }

    @Override // com.github.catvod.en.NetPan
    public String detailContent(List<String> list) {
        if (NetPan.a.matcher(list.get(0).split("#")[0]).find()) {
            return super.detailContent(list);
        }
        StringBuilder sbB = BuilderUtils.b("https://www.aipanso.com");
        sbB.append(list.get(0).split("#")[0].replace("/s/", "/cv/"));
        String string = sbB.toString();
        String str = list.get(0).split("#")[0];
        HashMap mapC = BuilderUtils.c("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
        mapC.put("Referer", "https://www.aipanso.com" + str);
        mapC.put("_bid", "6d14a5dd6c07980d9dc089a693805ad8");
        return super.detailContent("", list.get(0).split("#")[1], Arrays.asList(com.github.catvod.spider.merge.f0.HttpClient.c(string, mapC)));
    }

    public String searchContent(String str, boolean z) {
        return searchContent(str, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        return searchContent(str, str2);
    }
}
