package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.FM.A.l;
import com.github.catvod.spider.merge.FM.K.h;
import com.github.catvod.spider.merge.FM.K.m;
import com.github.catvod.spider.merge.FM.L.F;
import com.github.catvod.spider.merge.FM.M.C0274g;
import com.github.catvod.spider.merge.FM.M.S;
import com.github.catvod.spider.merge.FM.c.C0323a;
import com.github.catvod.spider.merge.FM.c.C0329g;
import com.github.catvod.spider.merge.FM.c.C0332j;
import com.github.catvod.spider.merge.FM.m.C0378c;
import com.github.catvod.spider.merge.FM.n.C0384b;
import com.github.catvod.spider.merge.a.C0529a;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class PanWebShare extends Pan {
    private String f;

    static {
        new OkHttpClient();
    }

    public static String d(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("@Headers=");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("User-Agent", "Mozilla/5.0 (Linux; Android 13; V2049A Build/TP1A.220624.014; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/116.0.0.0 Mobile Safari/537.36");
            jSONObject.put("Referer", "https://www.douban.com");
            sb.append(jSONObject.toString());
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    private Map<String, String> g() {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
        map.put("Referer", this.f + "/");
        return map;
    }

    private String h(h hVar, String str) {
        for (m mVar : hVar.o0(".video-info-item")) {
            if (mVar.n0().v0().contains(str)) {
                List<String> listC = mVar.o0("a").c();
                StringBuilder sb = new StringBuilder();
                Iterator it = ((ArrayList) listC).iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        }
                        sb.append((CharSequence) ",");
                    }
                }
                return sb.toString();
            }
        }
        return "";
    }

    private String j(String str) {
        C0274g c0274gO0 = F.d(C0378c.n(this.f + "/index.php/vod/search/wd/" + URLEncoder.encode(str) + ".html", g())).o0(".module-search-item");
        ArrayList arrayList = new ArrayList();
        for (m mVar : c0274gO0) {
            String strA = mVar.o0(".video-info-header a").a("href");
            String strA2 = mVar.o0(".video-info-header a").a("title");
            String strA3 = mVar.o0(".module-item-pic img").a("data-src");
            C0274g c0274gO02 = mVar.o0(".video-info-header a.video-serial");
            C0384b.a(strA, strA2, strA3, !c0274gO02.isEmpty() ? c0274gO02.e().v0() : "", arrayList);
        }
        return C0329g.q(arrayList);
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3;
        String str4;
        String str5;
        String str6;
        if (map.get("cateId") != null) {
            str = map.get("cateId");
        }
        String str7 = "";
        if (map.get("area") != null) {
            str3 = "/area/" + map.get("area");
        } else {
            str3 = "";
        }
        if (map.get("by") != null) {
            str4 = "/by/" + map.get("by");
        } else {
            str4 = "";
        }
        if (map.get("year") != null) {
            str5 = "/year/" + map.get("year");
        } else {
            str5 = "";
        }
        if (map.get("class") != null) {
            str6 = "/class/" + map.get("class");
        } else {
            str6 = "";
        }
        if (map.get("lang") != null) {
            str7 = "/lang/" + map.get("lang");
        }
        String str8 = this.f + "/index.php/vod/show/id/" + str + "/page/" + str2 + str6 + str3 + str7 + str5 + str4 + ".html";
        SpiderDebug.log("categoryContent cateUrl: " + str8);
        List<C0332j> vodList = parseVodList(l.g(C0378c.n(str8, g())).o0(".module-item"));
        C0329g c0329g = new C0329g();
        c0329g.z(vodList);
        return c0329g.toString();
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) {
        String str;
        if (list.get(0).startsWith("http")) {
            str = list.get(0);
        } else {
            str = this.f + list.get(0);
        }
        h hVarG = l.g(C0378c.n(str, g()));
        C0332j c0332j = new C0332j();
        List<String> listB = hVarG.o0(".module-row-text").b("data-clipboard-text");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        String strV0 = S.a(".video-info-header > .page-title", hVarG).v0();
        int i = 0;
        while (true) {
            ArrayList arrayList6 = (ArrayList) listB;
            if (i >= arrayList6.size()) {
                break;
            }
            if (Pan.f6a.matcher((CharSequence) arrayList6.get(i)).find()) {
                arrayList.add((String) arrayList6.get(i));
            }
            if (Pan.b.matcher((CharSequence) arrayList6.get(i)).find()) {
                arrayList2.add((String) arrayList6.get(i));
            }
            if (Pan.c.matcher((CharSequence) arrayList6.get(i)).find()) {
                arrayList3.add((String) arrayList6.get(i));
            }
            if (Pan.d.matcher((CharSequence) arrayList6.get(i)).find()) {
                arrayList4.add((String) arrayList6.get(i));
            }
            if (Pan.e.matcher((CharSequence) arrayList6.get(i)).find()) {
                arrayList5.add((String) arrayList6.get(i));
            }
            if (Pan.f.matcher((CharSequence) arrayList6.get(i)).find()) {
                arrayList5.add((String) arrayList6.get(i));
            }
            i++;
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList);
        arrayList7.addAll(arrayList2);
        arrayList7.addAll(arrayList3);
        arrayList7.addAll(arrayList4);
        arrayList7.addAll(arrayList5);
        PanOrder.sort(arrayList7);
        c0332j.j(detailContentVodPlayFrom(arrayList7));
        c0332j.k(detailContentVodPlayUrl(arrayList7));
        String strC = S.a(".module-item-pic img", hVarG).c("data-src");
        String strV02 = hVarG.o0(".video-info-header a.tag-link").g().v0();
        List<String> listC = hVarG.o0(".video-info-header div.tag-link a").c();
        StringBuilder sb = new StringBuilder();
        Iterator it = ((ArrayList) listC).iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) ",");
            }
        }
        String string = sb.toString();
        String strI = hVarG.o0("p.sqjj_a").i();
        String strH = h(hVarG, "导演");
        String strH2 = h(hVarG, "主演");
        String strH3 = h(hVarG, "年代");
        String strH4 = h(hVarG, "备注");
        c0332j.g(list.get(0));
        c0332j.i(strC);
        c0332j.n(strH3);
        c0332j.h(strV0);
        c0332j.d(strV02);
        c0332j.c(strH2);
        c0332j.l(strH4);
        c0332j.e(strI);
        c0332j.f(strH);
        c0332j.b(string);
        return C0529a.processVodData(C0329g.p(c0332j));
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        h hVarG = l.g(C0378c.n(this.f, g()));
        for (m mVar : hVarG.o0("ul.grid-items > li > a")) {
            if (mVar.c("href").startsWith("/index.php/vod")) {
                if (arrayList.size() >= 7) {
                    break;
                }
                String strReplaceAll = mVar.c("href").replaceAll("\\D+", "");
                String strC = mVar.c("title");
                if (!strC.contains("115")) {
                    arrayList.add(new C0323a(strReplaceAll, strC));
                }
            }
        }
        return C0329g.u(arrayList, parseVodList(hVarG.o0(".module-item")), new JSONObject("{\"1\":[{\"key\":\"cateId\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"1\"},{\"n\":\"科幻片\",\"v\":\"6\"},{\"n\":\"爱情片\",\"v\":\"7\"},{\"n\":\"战争片\",\"v\":\"8\"},{\"n\":\"恐怖片\",\"v\":\"9\"},{\"n\":\"高码片\",\"v\":\"10\"},{\"n\":\"动画片\",\"v\":\"11\"},{\"n\":\"动作片\",\"v\":\"12\"}]},{\"key\":\"class\",\"name\":\"剧情\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"警匪\",\"v\":\"警匪\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动画\",\"v\":\"动画\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"枪战\",\"v\":\"枪战\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"经典\",\"v\":\"经典\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"2\":[{\"key\":\"cateId\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"2\"},{\"n\":\"国产剧\",\"v\":\"13\"},{\"n\":\"日韩剧\",\"v\":\"14\"},{\"n\":\"欧美剧\",\"v\":\"15\"},{\"n\":\"港台剧\",\"v\":\"16\"}]},{\"key\":\"class\",\"name\":\"剧情\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"青春偶像\",\"v\":\"青春偶像\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"家庭\",\"v\":\"家庭\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"乡村\",\"v\":\"乡村\"},{\"n\":\"情景\",\"v\":\"情景\"},{\"n\":\"商战\",\"v\":\"商战\"},{\"n\":\"网剧\",\"v\":\"网剧\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"3\":[{\"key\":\"cateId\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"3\"},{\"n\":\"日韩\",\"v\":\"22\"},{\"n\":\"国产\",\"v\":\"20\"},{\"n\":\"欧美\",\"v\":\"21\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"4\":[{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"欧美\",\"v\":\"欧美\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"5\":[{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"26\":[{\"key\":\"cateId\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"26\"},{\"n\":\"高分电影\",\"v\":\"29\"},{\"n\":\"高分剧集\",\"v\":\"27\"},{\"n\":\"高分外剧\",\"v\":\"30\"},{\"n\":\"国漫之光\",\"v\":\"28\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}]}"));
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        JSONArray jSONArray;
        int length;
        try {
            if (str.isEmpty() || (length = (jSONArray = new JSONObject(str).getJSONArray("site")).length()) == 0) {
                return;
            }
            for (int i = 0; i < length; i++) {
                String strTrim = jSONArray.getString(i).trim();
                if (!strTrim.isEmpty()) {
                    try {
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strTrim).openConnection();
                        httpURLConnection.setInstanceFollowRedirects(true);
                        httpURLConnection.setConnectTimeout(10000);
                        httpURLConnection.setReadTimeout(10000);
                        httpURLConnection.setRequestMethod("HEAD");
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode >= 200 && responseCode < 400) {
                            this.f = strTrim;
                            httpURLConnection.disconnect();
                            return;
                        } else {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    public List<C0332j> parseVodList(C0274g c0274g) {
        ArrayList arrayList = new ArrayList();
        for (m mVar : c0274g) {
            String strA = mVar.o0(".module-item-titlebox >a").a("href");
            String strA2 = mVar.o0(".module-item-titlebox >a").a("title");
            if (!"臻彩".equals(strA2)) {
                String strA3 = mVar.o0(".module-item-pic img").a("data-src");
                if (strA3.contains("url=")) {
                    strA3 = d(strA3.substring(strA3.indexOf("url=") + 4));
                }
                C0384b.a(strA, strA2, strA3, mVar.o0(".module-item-text").i(), arrayList);
            }
        }
        return arrayList;
    }

    public String searchContent(String str, boolean z) {
        return j(str);
    }

    public String searchContent(String str, boolean z, String str2) {
        return j(str);
    }
}
