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
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
public class FourKZN extends NetPan {
    private Map<String, String> f() {
        return com.github.catvod.spider.merge.B.MapBuilder.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36", "Referer", "https://4kzn.com/");
    }

    private String g(String str, String str2) {
        Matcher matcher = Pattern.compile(str2 + ":\\s*(.*?)(?=\\s*(导演|主演|类型|制片|语言|上映|片长|又名|IMDb|$))").matcher(str);
        return matcher.find() ? matcher.group(1).trim().replace("/", ",") : "";
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3 = map.containsKey("type") ? map.get("type") : str;
        if (!str3.isEmpty()) {
            str = str3;
        }
        Subtitle hVarE = l.e(com.github.catvod.spider.merge.f0.HttpClient.m("https://4kzn.com/books/" + str + "/page/" + str2, f(), null));
        ArrayList arrayList = new ArrayList();
        for (GeneralUtils mVar : hVarE.l0(".posts-row .posts-item")) {
            arrayList.add(new VodItem(mVar.l0("a.item-image").a("href"), mVar.l0(".item-title").j().trim(), mVar.l0(".lazy").a("data-src"), mVar.l0(".text-muted").j().trim()));
        }
        VodResult gVar = new VodResult();
        gVar.y(arrayList);
        gVar.j(Integer.parseInt(str2), 999, 20, 19980);
        return gVar.toString();
    }

    @Override // com.github.catvod.en.NetPan
    public String detailContent(List<String> list) {
        String str = list.get(0);
        Subtitle hVarE = l.e(com.github.catvod.spider.merge.f0.HttpClient.m(str.startsWith("http") ? str : ConcatUtils.a("https://4kzn.com", str), f(), null));
        String strJ = hVarE.l0(".panel-body p").j();
        VodItem iVar = new VodItem();
        iVar.l(str);
        iVar.m(hVarE.l0(".site-name").j().trim());
        iVar.n(hVarE.l0(".lazy").a("data-src"));
        iVar.g(g(strJ, "类型"));
        Matcher matcher = Pattern.compile("\\d{4}").matcher(g(strJ, "上映日期"));
        if (matcher.find()) {
            iVar.s(matcher.group());
        }
        iVar.i(g(strJ, "制片国家/地区"));
        iVar.h(g(strJ, "主演"));
        iVar.k(g(strJ, "导演"));
        int iLastIndexOf = strJ.lastIndexOf("IMDb:");
        iVar.j(iLastIndexOf != -1 ? strJ.substring(iLastIndexOf + 5).trim() : strJ.trim());
        JsoupElements c1036gL0 = hVarE.l0(".site-go a");
        ArrayList arrayList = new ArrayList();
        Iterator<GeneralUtils> it = c1036gL0.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c("href"));
        }
        NetPan.initOrder(arrayList);
        iVar.o(super.detailContentVodPlayFrom(arrayList));
        iVar.p(super.detailContentVodPlayUrl(iVar.d(), arrayList));
        return VodResult.m(iVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.github.catvod.spider.merge.K.VodCategory("zuixin", "最新"));
        arrayList.add(new com.github.catvod.spider.merge.K.VodCategory("top250", "TOP250"));
        arrayList.add(new com.github.catvod.spider.merge.K.VodCategory("dianying", "电影"));
        arrayList.add(new com.github.catvod.spider.merge.K.VodCategory("juji", "剧集"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("dianying", Arrays.asList(new com.github.catvod.spider.merge.K.FilterGroup("type", "类型", Arrays.asList(new com.github.catvod.spider.merge.K.FilterValue("全部", ""), new com.github.catvod.spider.merge.K.FilterValue("电影", "dianying"), new com.github.catvod.spider.merge.K.FilterValue("喜剧", "xiju"), new com.github.catvod.spider.merge.K.FilterValue("爱情", "aiqing"), new com.github.catvod.spider.merge.K.FilterValue("剧情", "juqing"), new com.github.catvod.spider.merge.K.FilterValue("悬疑", "xuanyi"), new com.github.catvod.spider.merge.K.FilterValue("传记", "zhuanji"), new com.github.catvod.spider.merge.K.FilterValue("动作", "dongzuo"), new com.github.catvod.spider.merge.K.FilterValue("科幻", "kehuan"), new com.github.catvod.spider.merge.K.FilterValue("犯罪", "fanzui"), new com.github.catvod.spider.merge.K.FilterValue("奇幻", "qihuan"), new com.github.catvod.spider.merge.K.FilterValue("冒险", "maoxian"), new com.github.catvod.spider.merge.K.FilterValue("家庭", "jiating"), new com.github.catvod.spider.merge.K.FilterValue("运动", "yundong"), new com.github.catvod.spider.merge.K.FilterValue("歌舞", "gewu"), new com.github.catvod.spider.merge.K.FilterValue("战争", "zhanzheng"), new com.github.catvod.spider.merge.K.FilterValue("惊悚", "jingsong"), new com.github.catvod.spider.merge.K.FilterValue("西部", "xibu"), new com.github.catvod.spider.merge.K.FilterValue("动画", "donghua"), new com.github.catvod.spider.merge.K.FilterValue("灾难", "zainan"), new com.github.catvod.spider.merge.K.FilterValue("恐怖", "kongbu"), new com.github.catvod.spider.merge.K.FilterValue("历史", "lishi"), new com.github.catvod.spider.merge.K.FilterValue("音乐", "yinyue"), new com.github.catvod.spider.merge.K.FilterValue("同性", "tongxing"), new com.github.catvod.spider.merge.K.FilterValue("纪录片", "jilupian"), new com.github.catvod.spider.merge.K.FilterValue("古装", "guzhuang"), new com.github.catvod.spider.merge.K.FilterValue("儿童", "ertong"), new com.github.catvod.spider.merge.K.FilterValue("武侠", "武侠")))));
        linkedHashMap.put("juji", Arrays.asList(new com.github.catvod.spider.merge.K.FilterGroup("type", "类型", Arrays.asList(new com.github.catvod.spider.merge.K.FilterValue("全部", ""), new com.github.catvod.spider.merge.K.FilterValue("剧集", "juji"), new com.github.catvod.spider.merge.K.FilterValue("剧情", "juq"), new com.github.catvod.spider.merge.K.FilterValue("惊悚", "jings"), new com.github.catvod.spider.merge.K.FilterValue("犯罪", "fanzuii"), new com.github.catvod.spider.merge.K.FilterValue("动作", "jjdongzuo"), new com.github.catvod.spider.merge.K.FilterValue("历史", "jjlishi"), new com.github.catvod.spider.merge.K.FilterValue("战争", "jjzhanzheng"), new com.github.catvod.spider.merge.K.FilterValue("冒险", "jjmaoxian"), new com.github.catvod.spider.merge.K.FilterValue("古装", "古装"), new com.github.catvod.spider.merge.K.FilterValue("爱情", "爱情"), new com.github.catvod.spider.merge.K.FilterValue("喜剧", "喜剧"), new com.github.catvod.spider.merge.K.FilterValue("最新", "zuixin-juji"), new com.github.catvod.spider.merge.K.FilterValue("科幻", "科幻"), new com.github.catvod.spider.merge.K.FilterValue("悬疑", "悬疑"), new com.github.catvod.spider.merge.K.FilterValue("奇幻", "奇幻"), new com.github.catvod.spider.merge.K.FilterValue("家庭", "家庭"), new com.github.catvod.spider.merge.K.FilterValue("恐怖", "恐怖"), new com.github.catvod.spider.merge.K.FilterValue("西部", "西部"), new com.github.catvod.spider.merge.K.FilterValue("动画", "动画")))));
        return VodResult.p(arrayList, linkedHashMap);
    }

    public String searchContent(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        StringBuilder sbB = BuilderUtils.b("https://4kzn.com/?post_type=book&s=");
        sbB.append(URLEncoder.encode(str, "UTF-8"));
        sbB.append("&page=");
        sbB.append(str2);
        Subtitle hVarE = l.e(com.github.catvod.spider.merge.f0.HttpClient.m(sbB.toString(), f(), null));
        ArrayList arrayList = new ArrayList();
        for (GeneralUtils mVar : hVarE.l0(".posts-row .posts-item")) {
            arrayList.add(new VodItem(mVar.l0("a.item-image").a("href"), mVar.l0(".item-title").j().trim(), mVar.l0(".lazy").a("data-src"), mVar.l0(".text-muted").j().trim()));
        }
        VodResult gVar = new VodResult();
        gVar.y(arrayList);
        gVar.j(Integer.parseInt(str2), 999, 20, 19980);
        return gVar.toString();
    }
}
