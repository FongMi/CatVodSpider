package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.K.VodResult;
import com.github.catvod.spider.merge.K.VodItem;
import com.github.catvod.spider.merge.L1.l;
import com.github.catvod.spider.merge.c1.JsoupElement;
import com.github.catvod.spider.merge.e1.JsoupElements;
import com.github.catvod.spider.merge.l.ConcatUtils;
import com.github.catvod.spider.merge.y.z;
import com.google.gson.JsonParser;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
public class PanTa extends NetPan {
    public String l = "https://www.leijing1.com/";
    public String m = "";

    private HashMap<String, String> f() {
        HashMap<String, String> map = new HashMap<>();
        map.put("cookie", this.m);
        return map;
    }

    private String g(JsoupElements c1036g) {
        VodResult gVar = new VodResult();
        ArrayList arrayList = new ArrayList();
        for (GeneralUtils mVar : c1036g) {
            GeneralUtils mVarM0 = mVar.m0(".title");
            String strJ = mVarM0.l0("a").j();
            VodItem iVar = new VodItem();
            iVar.r("file");
            iVar.l(mVarM0.l0("a").a("href") + "#" + strJ);
            iVar.m(strJ);
            String strC = mVar.m0(".avatarLink img").c("src");
            if (!strC.startsWith("https")) {
                strC = ConcatUtils.b(new StringBuilder(), this.l, strC);
            }
            iVar.n(strC);
            arrayList.add(iVar);
        }
        gVar.y(arrayList);
        gVar.j(-1, -1, -1, -1);
        return gVar.toString();
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.l);
        sb.append(str);
        return g(l.e(com.github.catvod.spider.merge.i0.GeneralUtils.p(z.b(sb, com.github.catvod.spider.merge.P0.StringUtils.b(str) ? "?" : "&", "page=", str2), f()).get("html")).l0(".topicItem"));
    }

    @Override // com.github.catvod.en.NetPan
    public String detailContent(List<String> list) {
        return super.detailContent("", list.get(0).split("#")[1], NetPan.findMatches(com.github.catvod.spider.merge.i0.GeneralUtils.p(this.l + list.get(0).split("#")[0], f()).get("html"), "(https?://www\\.(?:123684|123865|123912|123pan|123pan\\.cn|123592)\\.com/s/[\\w-]+(?:\\?(?:pwd=[\\w]+|提取码:[^#\\s]*))?)|https?://(?:(?:www\\.(?:alipan|aliyundrive)\\.com|pan\\.quark\\.cn|drive\\.uc\\.cn)/s/\\w+(?:\\?public=1)?|(?:115|anxia|115cdn)\\.com/s/\\w+\\?password=\\w+#?|caiyun\\.139\\.com/m/i\\?\\w+|caiyun\\.139\\.com/w/i/\\w+|yun\\.139\\.com/shareweb/#/w/i/\\w+|cloud\\.189\\.cn/t/\\w{12}（访问码：\\w+）|pan\\.baidu\\.com/s/[\\w-]+(?:[?&]pwd=\\w{4})?|cloud\\.189\\.cn/t/\\w{12}|pan\\.xunlei\\.com/s/[^?]+\\?.*?pwd=[^&#]+|www\\\\.guangyapan\\\\.com/s/[^/#?]*(?:\\\\?code=[\\\\w]+)?(?:#/share/[\\\\w-]+)?)"));
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JsoupElements c1036gL0 = l.e(com.github.catvod.spider.merge.i0.GeneralUtils.p(this.l, f()).get("html")).l0(".tab,.tab_current");
        for (int i = 0; i < c1036gL0.size(); i++) {
            arrayList.add(new com.github.catvod.spider.merge.K.VodCategory(c1036gL0.get(i).l0("a").a("href"), c1036gL0.get(i).s0(), "1"));
        }
        return VodResult.p(arrayList, linkedHashMap);
    }

    @Override // com.github.catvod.en.NetPan
    public void init(Context context, String str) {
        super.init(context, str);
        this.l = JsonParser.parseString(str).getAsJsonObject().get("siteUrl").getAsString();
        if (JsonParser.parseString(str).getAsJsonObject().get("cookie") != null) {
            this.m = JsonParser.parseString(str).getAsJsonObject().get("cookie").getAsString();
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            return g(l.e(com.github.catvod.spider.merge.i0.GeneralUtils.p(this.l + "search?keyword=" + URLEncoder.encode(str), f()).get("html")).l0(".topicItem"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
