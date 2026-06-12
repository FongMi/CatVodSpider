package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.K.VodResult;
import com.github.catvod.spider.merge.K.VodItem;
import com.github.catvod.spider.merge.L1.l;
import com.github.catvod.spider.merge.e1.JsoupElements;
import com.github.catvod.spider.merge.i0.GeneralUtils;
import com.google.gson.JsonParser;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
public class PanSou extends NetPan {
    private String l = "https://www.tianyiso.com";
    public String m = "";

    private String searchContent(String str, String str2) {
        String str3 = this.l + "/search?k=" + URLEncoder.encode(str) + "&page=" + str2 + "&s=1&t=-1";
        SpiderDebug.log(str3);
        HashMap<String, String> mapP = GeneralUtils.p(str3, new HashMap());
        this.m = mapP.get("cookies");
        JsoupElements c1036gL0 = l.e(mapP.get("html")).l0(".van-card__header");
        ArrayList arrayList = new ArrayList();
        for (com.github.catvod.spider.merge.c1.JsoupElement mVar : c1036gL0) {
            String strTrim = mVar.m0(".van-card__content").s0().trim();
            if (strTrim.contains(str)) {
                VodItem iVar = new VodItem();
                iVar.l(mVar.l0("a").a("href") + "#" + str);
                iVar.n(NetPan.getYunPanPic(iVar.c()));
                iVar.m(strTrim);
                arrayList.add(iVar);
            }
        }
        return VodResult.n(arrayList);
    }

    @Override // com.github.catvod.en.NetPan
    public String detailContent(List<String> list) {
        SpiderDebug.log(list.get(0));
        HashMap map = new HashMap();
        String str = this.l + list.get(0).split("#")[0].replace("/s/", "/cv/");
        String str2 = this.l + list.get(0).split("#")[0].replace("/s/", "/cv/");
        HashMap map2 = new HashMap();
        map2.put("cookie", this.m);
        map2.put("referer", str2);
        map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36 Edg/138.0.0.0");
        com.github.catvod.spider.merge.f0.HttpClient.p(str, map2, map);
        SpiderDebug.log(this.m);
        SpiderDebug.log(map.toString());
        return super.detailContent("", list.get(0).split("#")[1], (List) map.get("location"));
    }

    @Override // com.github.catvod.en.NetPan
    public void init(Context context, String str) {
        super.init(context, str);
        this.l = JsonParser.parseString(str).getAsJsonObject().get("siteUrl").getAsString();
    }

    public String searchContent(String str, boolean z) {
        return searchContent(str, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        return searchContent(str, str2);
    }
}
