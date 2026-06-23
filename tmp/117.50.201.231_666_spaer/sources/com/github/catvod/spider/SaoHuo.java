package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.FM.A.l;
import com.github.catvod.spider.merge.FM.K.h;
import com.github.catvod.spider.merge.FM.K.m;
import com.github.catvod.spider.merge.FM.L.P;
import com.github.catvod.spider.merge.FM.M.C0274g;
import com.github.catvod.spider.merge.FM.b.r;
import com.github.catvod.spider.merge.FM.c.C0323a;
import com.github.catvod.spider.merge.FM.c.C0329g;
import com.github.catvod.spider.merge.FM.c.C0332j;
import com.github.catvod.spider.merge.FM.m.C0378c;
import com.github.catvod.spider.merge.FM.m.C0380e;
import com.github.catvod.spider.merge.FM.n.C0383a;
import com.github.catvod.spider.merge.FM.n.C0384b;
import com.github.catvod.spider.merge.FM.n.k;
import com.github.catvod.spider.merge.a.C0529a;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class SaoHuo extends Spider {
    private String a;
    String b = "";

    private HashMap<String, String> a() {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Linux; Android 9; ALN-AL00 Build/PQ3B.190801.05281406; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/91.0.4472.114 Safari/537.36");
        map.put("accept-language", "zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7");
        if (!TextUtils.isEmpty(this.b)) {
            map.put("Cookie", this.b);
        }
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        h hVarG = l.g(C0378c.n(this.a + String.format("/list/%s-%s.html", str, str2), a()));
        ArrayList arrayList = new ArrayList();
        Iterator itC = r.c(new byte[]{0, -38, 31, 41, -50, -61, -14, -17, 0, -38, 31, 44, -54, -41}, new byte[]{46, -84, 64, 69, -89, -80, -122, -49}, hVarG);
        while (itC.hasNext()) {
            m mVar = (m) itC.next();
            C0384b.a(this.a + mVar.o0("a").a("href"), mVar.o0("a").a("title"), mVar.o0("img").a("data-original"), C0383a.a(new byte[]{-69, -2, 108, -24, 41, 14, -115}, new byte[]{-107, -120, 51, -122, 70, 122, -24, -13}, mVar), arrayList);
        }
        return C0329g.q(arrayList);
    }

    public String detailContent(List<String> list) {
        h hVarG = l.g(C0378c.n(list.get(0), a()));
        C0274g c0274gO0 = hVarG.o0("#play_link li");
        C0274g c0274gO02 = hVarG.o0(".play_from ul.from_list li");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= c0274gO0.size()) {
                String strA = k.a(new byte[]{104, 51, 18, 23, 55, -121, -16, 88, 108, 103}, new byte[]{0, 2, 60, 97, 104, -13, -103, 44}, hVarG);
                StringBuilder sbB = P.b(URLDecoder.decode(new String(Base64.getDecoder().decode("566A5LuL77ya")), "UTF-8"));
                sbB.append(hVarG.o0("p.p_txt").i());
                String string = sbB.toString();
                String[] strArrSplit = k.a(new byte[]{-128, -4, 43, 98, 100, 112, -79, 87, -52, -27, 12, 43, 122}, new byte[]{-82, -118, 116, 11, 10, 22, -34, 8}, hVarG).split(" / 导演:| / 主演:");
                String str = strArrSplit[0];
                String str2 = strArrSplit[1];
                String str3 = strArrSplit[2];
                C0332j c0332j = new C0332j();
                c0332j.g(list.get(0));
                c0332j.h(strA);
                c0332j.b(str);
                c0332j.c(str3);
                c0332j.e(string);
                c0332j.f(str2);
                c0332j.j(TextUtils.join("$$$", linkedHashMap.keySet()));
                c0332j.k(TextUtils.join("$$$", linkedHashMap.values()));
                return C0329g.p(c0332j);
            }
            String strV0 = c0274gO02.get(i2).v0();
            ArrayList arrayList = new ArrayList();
            C0274g c0274gO03 = c0274gO0.get(i2).o0("a");
            for (int size = c0274gO03.size() - 1; size >= 0; size--) {
                String strC = c0274gO03.get(size).c("href");
                StringBuilder sbB2 = P.b(c0274gO03.get(size).v0());
                sbB2.append("$");
                sbB2.append(strC);
                arrayList.add(sbB2.toString());
            }
            if (arrayList.size() > 0) {
                linkedHashMap.put(strV0, TextUtils.join("#", arrayList));
            }
            i = i2 + 1;
        }
    }

    public String homeContent(boolean z) {
        HashMap<String, String> mapA = a();
        mapA.put("User-Agent", "Mozilla/5.0 (Linux; Android 9; ALN-AL00 Build/PQ3B.190801.05281406; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/91.0.4472.114 Safari/537.36");
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("1", "2", "20", "4");
        List listAsList2 = Arrays.asList("电影", "电视剧", "国产剧", "动漫");
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new C0323a((String) listAsList.get(i), (String) listAsList2.get(i)));
        }
        JSONObject jSONObject = new JSONObject("{\"1\": [{\"key\": \"cateId\", \"name\": \"类型\", \"value\": [{\"n\": \"全部\", \"v\": \"1\"}, {\"n\": \"喜剧\", \"v\": \"6\"}, {\"n\": \"爱情\", \"v\": \"7\"}, {\"n\": \"恐怖\", \"v\": \"8\"}, {\"n\": \"动作\", \"v\": \"9\"}, {\"n\": \"科幻\", \"v\": \"10\"}, {\"n\": \"战争\", \"v\": \"11\"}, {\"n\": \"犯罪\", \"v\": \"12\"}, {\"n\": \"动画\", \"v\": \"13\"}, {\"n\": \"奇幻\", \"v\": \"14\"}, {\"n\": \"剧情\", \"v\": \"15\"}, {\"n\": \"冒险\", \"v\": \"16\"}, {\"n\": \"悬疑\", \"v\": \"17\"}, {\"n\": \"惊悚\", \"v\": \"18\"}, {\"n\": \"其他\", \"v\": \"20\"}]}],\"2\": [{\"key\": \"cateId\", \"name\": \"类型\", \"value\": [{\"n\": \"全部\", \"v\": \"2\"}, {\"n\": \"国产剧\", \"v\": \"20\"}, {\"n\": \"TVB\", \"v\": \"21\"}, {\"n\": \"韩剧\", \"v\": \"22\"}, {\"n\": \"美剧\", \"v\": \"23\"}, {\"n\": \"日剧\", \"v\": \"24\"}, {\"n\": \"英剧\", \"v\": \"25\"}, {\"n\": \"台剧\", \"v\": \"26\"}, {\"n\": \"其他\", \"v\": \"27\"}]}],\"3\": [{\"key\": \"cateId\", \"name\": \"类型\", \"value\": [{\"n\": \"全部\", \"v\": \"4\"}, {\"n\": \"搞笑\", \"v\": \"38\"}, {\"n\": \"恋爱\", \"v\": \"39\"}, {\"n\": \"热血\", \"v\": \"40\"}, {\"n\": \"格斗\", \"v\": \"41\"}, {\"n\": \"美少女\", \"v\": \"42\"}, {\"n\": \"魔法\", \"v\": \"43\"}, {\"n\": \"机战\", \"v\": \"44\"}, {\"n\": \"校园\", \"v\": \"45\"}, {\"n\": \"亲子\", \"v\": \"46\"}, {\"n\": \"童话\", \"v\": \"47\"}, {\"n\": \"冒险\", \"v\": \"48\"}, {\"n\": \"真人\", \"v\": \"49\"}, {\"n\": \"LOLI\", \"v\": \"50\"}, {\"n\": \"其他\", \"v\": \"51\"}]}]}");
        C0380e c0380eB = C0378c.b(this.a, mapA);
        List<String> list = c0380eB.c().get("set-cookie");
        if (!(list == null) && !list.isEmpty()) {
            this.b = list.get(0);
        }
        h hVarG = l.g(c0380eB.a());
        ArrayList arrayList2 = new ArrayList();
        Iterator itC = r.c(new byte[]{-15, -24, 22, 14, 84, -57, 72, 61, -15, -24, 22, 11, 80, -45}, new byte[]{-33, -98, 73, 98, 61, -76, 60, 29}, hVarG);
        while (itC.hasNext()) {
            m mVar = (m) itC.next();
            if (arrayList2.size() > 5) {
                break;
            }
            C0384b.a(this.a + mVar.o0("a").a("href"), mVar.o0("a").a("title"), mVar.o0("img").a("data-original"), C0383a.a(new byte[]{-71, 81, 65, 64, -95, 63, -117}, new byte[]{-105, 39, 30, 46, -50, 75, -18, -53}, mVar), arrayList2);
        }
        return C0329g.u(arrayList, arrayList2, jSONObject);
    }

    public void init(Context context, String str) {
        HashMap<String, String> mapA = a();
        mapA.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
        super.init(context, str);
        C0274g c0274gO0 = l.g(C0378c.n("http://shapp.us/", mapA)).o0(".content-top a");
        String strC = c0274gO0.isEmpty() ? "" : c0274gO0.get(0).c("href");
        if (!strC.isEmpty()) {
            str = strC;
        }
        this.a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strA = l.g(C0378c.n(this.a.concat(str2), a())).o0("iframe").a("src");
        C0329g c0329g = new C0329g();
        c0329g.x(strA);
        c0329g.l();
        c0329g.f(a());
        String string = c0329g.toString();
        try {
            JSONObject jSONObject = new JSONObject(string);
            String strOptString = jSONObject.optString("url");
            String strOptString2 = jSONObject.optString("header");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("url", strOptString);
            jSONObject2.put("header", strOptString2);
            jSONObject2.put("parse", 1);
            jSONObject2.put("jx", 0);
            return C0529a.addDanmaku(jSONObject2.toString());
        } catch (Exception e) {
            return string;
        }
    }

    public String searchContent(String str, boolean z) {
        h hVarG = l.g(C0378c.n(this.a + "/s----------.html?wd=" + URLEncoder.encode(str), a()));
        ArrayList arrayList = new ArrayList();
        Iterator itC = r.c(new byte[]{-109, 91, -53, 72, -13, -15, -114, 28, -109, 91, -53, 77, -9, -27}, new byte[]{-67, 45, -108, 36, -102, -126, -6, 60}, hVarG);
        while (itC.hasNext()) {
            m mVar = (m) itC.next();
            C0384b.a(this.a + mVar.o0("a").a("href"), mVar.o0("a").a("title"), mVar.o0("img").a("data-original"), C0383a.a(new byte[]{40, -102, -85, 109, 99, -36, 116}, new byte[]{6, -20, -12, 3, 12, -88, 17, -57}, mVar), arrayList);
        }
        return C0329g.q(arrayList);
    }
}
