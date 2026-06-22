//package com.github.catvod.spider;
//
//import android.content.Context;
//import com.github.catvod.crawler.SpiderDebug;
//import com.github.catvod.en.NetPan;
//import com.github.catvod.spider.merge.I.BuilderUtils;
//import com.github.catvod.spider.merge.I0.GeneralUtils;
//import com.github.catvod.spider.merge.K.VodItem;
//import com.github.catvod.spider.merge.K.VodResult;
//import com.github.catvod.spider.merge.e1.JsoupElements;
//import com.google.gson.JsonParser;
//
//import java.net.URLEncoder;
//import java.util.*;
//
//
//public class Star2 extends NetPan {
//    private static String m = "";
//    public String l = "https://1.star2.cn/";
//
//    private String f(String str) {
//        if (GeneralUtils.isEmpty()) {
//            try {
//                HashMap map = new HashMap();
//                HashMap map2 = new HashMap();
//                map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
//                com.github.catvod.spider.merge.f0.HttpClient.o(this.l, map2, map);
//                m = GeneralUtils.A(map, "");
//                SpiderDebug.log("Star2 fetchCookie: " + m);
//            } catch (Exception e) {
//                SpiderDebug.log("Star2 fetchCookie error: " + e);
//            }
//        }
//        return com.github.catvod.spider.merge.f0.HttpClient.m(str, getHeader(), null);
//    }
//
//    private List<VodItem> g(String str, JsoupElements c1036g) {
//        ArrayList arrayList = new ArrayList();
//        Iterator<com.github.catvod.spider.merge.c1.JsoupElement> it = c1036g.iterator();
//        while (it.hasNext()) {
//            com.github.catvod.spider.merge.c1.JsoupElement mVarM0 = it.next().m0("a[href]");
//            if (!mVarM0.c("href").startsWith("https")) {
//                String strReplaceAll = com.github.catvod.spider.merge.P0.StringUtils.b(str) ? mVarM0.c("title").replaceAll("〖置顶〗", "") : str;
//                VodItem iVar = new VodItem();
//                iVar.r("file");
//                iVar.l(mVarM0.c("href") + "#" + strReplaceAll);
//                iVar.m(strReplaceAll);
//                iVar.n("https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c7/6c/55/c76c5544-64a5-882a-3862-c68b28f16299/AppIcon-0-0-1x_U007ephone-0-11-0-0-85-220.png/350x350.png");
//                arrayList.add(iVar);
//            }
//        }
//        return arrayList;
//    }
//
//    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
//        JsoupElements c1036gL0 = l.e(f(this.l)).l0(".ranking-box").get(Integer.parseInt(str)).l0("li");
//        VodResult gVar = new VodResult();
//        gVar.y(g("", c1036gL0));
//        gVar.j(1, 1, 0, 1);
//        return gVar.toString();
//    }
//
//    @Override // com.github.catvod.en.NetPan
//    public String detailContent(List<String> list) {
//        JsoupElements c1036gL0 = l.e(f(this.l + list.get(0).split("#")[0])).l0("a.dlipp-dl-btn.j-wbdlbtn-dlipp");
//        if (c1036gL0.get(0) == null) {
//            return null;
//        }
//        VodItem iVar = new VodItem();
//        iVar.l(list.get(0).split("#")[0]);
//        iVar.m(list.get(0).split("#")[1]);
//        ArrayList arrayList = new ArrayList();
//        Iterator<com.github.catvod.spider.merge.c1.JsoupElement> it = c1036gL0.iterator();
//        while (it.hasNext()) {
//            arrayList.add(it.next().c("href"));
//        }
//        for (int i = 0; i < arrayList.size(); i++) {
//            arrayList.set(i, ((String) arrayList.get(i)).trim());
//        }
//        NetPan.initOrder(arrayList);
//        iVar.o(super.detailContentVodPlayFrom(arrayList));
//        iVar.p(super.detailContentVodPlayUrl(list.get(0).split("#")[1], arrayList));
//        return VodResult.m(iVar);
//    }
//
//    public HashMap<String, String> getHeader() {
//        HashMap<String, String> mapC = BuilderUtils.c("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
//        mapC.put("Referer", this.l);
//        if (!GeneralUtils.isEmpty()) {
//            mapC.put("Cookie", m);
//        }
//        return mapC;
//    }
//
//    public String homeContent(boolean z) {
//        ArrayList arrayList = new ArrayList();
//        LinkedHashMap linkedHashMap = new LinkedHashMap();
//        JsoupElements c1036gL0 = l.e(f(this.l)).l0(".tab-item");
//        for (int i = 0; i < c1036gL0.size(); i++) {
//            arrayList.add(new com.github.catvod.spider.merge.K.VodCategory(String.valueOf(i), c1036gL0.get(i).s0(), "1"));
//        }
//        return VodResult.p(arrayList, linkedHashMap);
//    }
//
//    @Override // com.github.catvod.en.NetPan
//    public void init(Context context, String str) {
//        super.init(context, str);
//        this.l = JsonParser.parseString(str).getAsJsonObject().get("siteUrl").getAsString();
//    }
//
//    public String searchContent(String str, boolean z) {
//        try {
//            return VodResult.n(g(str, l.e(f(this.l + "/search/?keyword=" + URLEncoder.encode(str))).l0("li.item")));
//        } catch (Exception e) {
//            SpiderDebug.log("star2 searchContent error" + e);
//            return "";
//        }
//    }
//}
