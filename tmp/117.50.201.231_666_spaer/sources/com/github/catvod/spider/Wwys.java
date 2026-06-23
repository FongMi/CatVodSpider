package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.FM.A.l;
import com.github.catvod.spider.merge.FM.K.h;
import com.github.catvod.spider.merge.FM.K.m;
import com.github.catvod.spider.merge.FM.b.r;
import com.github.catvod.spider.merge.FM.b.v;
import com.github.catvod.spider.merge.FM.c.C0323a;
import com.github.catvod.spider.merge.FM.c.C0329g;
import com.github.catvod.spider.merge.FM.c.C0332j;
import com.github.catvod.spider.merge.FM.g.C0354j;
import com.github.catvod.spider.merge.FM.m.C0378c;
import com.github.catvod.spider.merge.FM.n.C0383a;
import com.github.catvod.spider.merge.FM.n.C0384b;
import com.github.catvod.spider.merge.FM.n.k;
import com.github.catvod.spider.merge.a.C0529a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class Wwys extends Spider {
    private static String a;

    private HashMap<String, String> a() {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Linux; Android 13; SM-A037U) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Mobile Safari/537.36  uacq");
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        if (map.get("cateId") != null) {
            str = map.get("cateId");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        for (m mVar : l.g(C0378c.n(v.a("/vod-list-id-%s-pg-%s-order--by-time-class-0-year-0-letter--area--lang-.html", new Object[]{str, str2}, sb), a())).o0(".resize_list > li")) {
            C0384b.a(mVar.o0("a").a("href").replaceAll("\\D+", ""), mVar.o0("a[title]").a("title"), mVar.o0("div > img").a("src"), C0383a.a(new byte[]{69, 7, 57, -13, 81, 114, -13, -85, 66, 3, 55, -16}, new byte[]{54, 119, 88, -99, 127, 1, -79, -60}, mVar), arrayList);
        }
        return C0329g.q(arrayList);
    }

    public String detailContent(List<String> list) {
        h hVarG = l.g(C0378c.n(a.concat("/vod-detail-id-").concat(list.get(0)).concat(".html"), a()));
        String strA = hVarG.o0(".title > a:nth-child(1)").a("title");
        String strA2 = k.a(new byte[]{-81, -73, 43, -119, 63, -29, 40, 115, -108, -73, 41, -62, 54, -68, 53, 100, -93, -13, 62, -49, 50, -22, 63, 56, -7, -9, 125, -103, 123, -32, 52, 126, -65, -28, 51, -45, 51, -85, 56, 120, -94, -78, 57, -113, 105, -81}, new byte[]{-53, -34, 93, -89, 91, -122, 91, 16}, hVarG);
        String strA3 = hVarG.o0(".page-hd > a:nth-child(1) > img:nth-child(1)").a("src");
        String strA4 = k.a(new byte[]{56, -71, 62, -34, -23, 62, 36, 92, 3, -71, 60, -107, -32, 97, 57, 75, 52, -3, 43, -104, -28, 55, 51, 23, 111, -7, 104, -50, -83, 58}, new byte[]{92, -48, 72, -16, -115, 91, 87, 63}, hVarG);
        String strA5 = k.a(new byte[]{60, 70, 89, -66, -74, -113, 92, 81, 113, 77, 82, -22, -23, -58, 64, 70, 124, 86, 84, -25, -76, -114, 89, 16, 118, 10, 15, -29}, new byte[]{18, 34, 60, -54, -41, -26, 48, 124}, hVarG);
        String strA6 = k.a(new byte[]{-82, -62, -77, -82, -108, 13, 79, -59, -107, -62, -79, -27, -99, 82, 82, -46, -94, -122, -90, -24, -103, 4, 88, -114, -2, -126, -27, -66, -48, 9}, new byte[]{-54, -85, -59, -128, -16, 104, 60, -90}, hVarG);
        Matcher matcher = Pattern.compile("mac_url='([^']*)'").matcher(l.g(C0378c.n(a.concat("/vod-play-id-").concat(list.get(0)).concat("-src-1-num-1.html"), a())).c0());
        if (!matcher.find()) {
            return "";
        }
        String strGroup = matcher.group(1);
        C0332j c0332j = new C0332j();
        c0332j.g(list.get(0));
        c0332j.i(strA3);
        c0332j.h(strA);
        c0332j.c(strA4);
        c0332j.l(strA2);
        c0332j.e(strA5);
        c0332j.f(strA6);
        c0332j.j("在线播放");
        c0332j.k(strGroup);
        return C0329g.p(c0332j);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONObject jSONObject = new JSONObject("{\"1\": [{\"key\": \"cateId\", \"name\": \"类型\", \"value\": [{\"n\": \"全部\", \"v\": \"1\"}, {\"n\": \"动作片\", \"v\": \"5\"}, {\"n\": \"喜剧片\", \"v\": \"6\"}, {\"n\": \"爱情片\", \"v\": \"7\"}, {\"n\": \"科幻片\", \"v\": \"8\"}, {\"n\": \"恐怖片\", \"v\": \"9\"}, {\"n\": \"剧情片\", \"v\": \"10\"}, {\"n\": \"战争片\", \"v\": \"11\"}, {\"n\": \"惊悚片\", \"v\": \"16\"}, {\"n\": \"奇幻片\", \"v\": \"17\"}]}], \"2\": [{\"key\": \"cateId\", \"name\": \"类型\", \"value\": [{\"n\": \"全部\", \"v\": \"2\"}, {\"n\": \"国产剧\", \"v\": \"12\"}, {\"n\": \"港台剧\", \"v\": \"13\"}, {\"n\": \"日韩剧\", \"v\": \"14\"}, {\"n\": \"欧美剧\", \"v\": \"15\"}]}]}");
        h hVarG = l.g(C0378c.n(a, a()));
        for (m mVar : hVarG.o0("#topnav > ul:nth-child(1) li")) {
            arrayList2.add(new C0323a(mVar.o0("a").a("href").split("-")[3], mVar.o0("a").i()));
        }
        for (m mVar2 : hVarG.o0("section.mod:nth-child(3) > div:nth-child(2) ul.resize_list")) {
            String strA = mVar2.o0("a div.pic img").a("data-src");
            C0384b.a(mVar2.o0("a").a("href").replaceAll("\\D+", ""), mVar2.o0("a").a("title"), strA, mVar2.o0("a > div > span > span").i(), arrayList);
        }
        return C0329g.u(arrayList2, arrayList, jSONObject);
    }

    public void init(Context context, String str) {
        if (str.isEmpty()) {
            return;
        }
        a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        Matcher matcher = Pattern.compile("src=\"(.*?)'").matcher(C0378c.n(a + "/player/wwgz.js", a()));
        Matcher matcher2 = Pattern.compile("src\\s*=\\s*'([^']+)'\\s*\\+\\s*videoUrl").matcher(C0378c.n(C0354j.b(matcher.find() ? matcher.group(1) : "", str2), a()));
        Matcher matcher3 = Pattern.compile("url: '([^']*)'").matcher(C0378c.n(C0354j.b(matcher2.find() ? matcher2.group(1) : "", str2), a()));
        String strGroup = matcher3.find() ? matcher3.group(1) : "";
        if (strGroup.isEmpty()) {
            Matcher matcher4 = Pattern.compile("src=\"(.*?)'").matcher(C0378c.n(a + "/player/lzm3u8.js", a()));
            Matcher matcher5 = Pattern.compile("\"url\":\\s*\"([^\"]+)\"").matcher(C0378c.n(C0354j.b(matcher4.find() ? matcher4.group(1) : "", str2), a()));
            strGroup = matcher5.find() ? matcher5.group(1) : "";
        }
        C0329g c0329g = new C0329g();
        c0329g.x(strGroup);
        c0329g.f(a());
        return C0529a.addDanmaku(c0329g.toString());
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator itC = r.c(new byte[]{-9, -27, -11, -19, -78, 113, -70, 8, -89, -11, -76, -89, -13, 66, -65}, new byte[]{-44, -127, -108, -103, -45, 46, -42, 97}, l.g(C0378c.n(a.concat("/index.php?m=vod-search&wd=").concat(str), a())));
        while (itC.hasNext()) {
            m mVar = (m) itC.next();
            String strA = mVar.o0("div:nth-child(1) > a:nth-child(1) > img:nth-child(1)").a("data-src");
            C0384b.a(mVar.o0("div:nth-child(1) > a:nth-child(1)").a("href").replaceAll("\\D+", ""), C0383a.a(new byte[]{-93, -44, 47, -29, -37, -90, -54, 100, -92, -43, 48, -75, -47, -6, -112, 96, -25, -125, 121, -86, -59, -77, -52, 115, -87, -55, 49, -12, -42, -70, -53, 37, -93, -107, 104, -16}, new byte[]{-57, -67, 89, -39, -75, -46, -94, 73}, mVar), strA, C0383a.a(new byte[]{51, -55, 12, -122, -95, -31, 0, 45, 52, -56, 19, -48, -85, -67, 90, 41, 119, -98, 90, -49, -65, -12, 6, 58, 57, -44, 18, -111, -84, -3, 1, 108, 51, -120, 73, -107}, new byte[]{87, -96, 122, -68, -49, -107, 104, 0}, mVar), arrayList);
        }
        return C0329g.q(arrayList);
    }
}
