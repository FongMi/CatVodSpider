package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.FM.A.l;
import com.github.catvod.spider.merge.FM.K.h;
import com.github.catvod.spider.merge.FM.K.m;
import com.github.catvod.spider.merge.FM.M.C0274g;
import com.github.catvod.spider.merge.FM.M.S;
import com.github.catvod.spider.merge.FM.b.v;
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
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class PanWebShareKK extends Pan {
    private String f;

    static {
        new OkHttpClient();
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

    private String j(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        C0274g c0274gO0 = l.g(C0378c.n(v.a("/index.php/search/%s----------%s---.html", new Object[]{URLEncoder.encode(str), str2}, sb), g())).o0(".module-search-item");
        ArrayList arrayList = new ArrayList();
        for (m mVar : c0274gO0) {
            String strA = mVar.o0(".video-serial").a("href");
            String strA2 = mVar.o0(".video-serial").a("title");
            String strA3 = mVar.o0(".module-item-pic > img").a("data-src");
            C0274g c0274gO02 = mVar.o0(".video-info-header a.video-serial");
            C0384b.a(strA, strA2, strA3, !c0274gO02.isEmpty() ? c0274gO02.e().v0() : "", arrayList);
        }
        return C0329g.q(arrayList);
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        if (map.get("cateId") != null) {
            str = map.get("cateId");
        }
        String str3 = map.get("area") == null ? "" : map.get("area");
        String str4 = map.get("year") == null ? "" : map.get("year");
        String str5 = map.get("by") == null ? "" : map.get("by");
        String str6 = map.get("class") != null ? map.get("class") : "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        List<C0332j> vodList = parseVodList(l.g(C0378c.n(v.a("/show/%s-%s-%s-%s-----%s---%s.html", new Object[]{str, str3, str5, str6, str2, str4}, sb), g())).o0(".module-item"));
        C0329g c0329g = new C0329g();
        c0329g.z(vodList);
        return c0329g.toString();
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) {
        h hVarG = l.g(C0378c.n(this.f + list.get(0), g()));
        C0332j c0332j = new C0332j();
        List<String> listB = hVarG.o0("#source-kua .btn-quark.cloud-direct-link").b("data-url");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            ArrayList arrayList3 = (ArrayList) listB;
            if (i >= arrayList3.size()) {
                break;
            }
            if (Pan.f6a.matcher((CharSequence) arrayList3.get(i)).find()) {
                arrayList.add((String) arrayList3.get(i));
            }
            if (Pan.b.matcher((CharSequence) arrayList3.get(i)).find()) {
                arrayList.add((String) arrayList3.get(i));
            }
            if (Pan.c.matcher((CharSequence) arrayList3.get(i)).find()) {
                arrayList2.add((String) arrayList3.get(i));
            }
            i++;
        }
        if (arrayList2.size() > 1) {
            Collections.reverse(arrayList2);
        }
        String strV0 = S.a(".video-info-header > .page-title", hVarG).v0();
        ArrayList arrayList4 = new ArrayList(arrayList);
        arrayList4.addAll(arrayList2);
        PanOrder.sort(arrayList4);
        c0332j.j(detailContentVodPlayFrom(arrayList4));
        c0332j.k(detailContentVodPlayUrl(arrayList4));
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
        String strReplace = hVarG.o0(".vod_content").i().replace("收起", "");
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
        c0332j.e(strReplace);
        c0332j.f(strH);
        c0332j.b(string);
        return C0529a.processVodData(C0329g.p(c0332j));
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("dy", "juji", "dongman", "zongyi");
        List listAsList2 = Arrays.asList("电影", "剧集", "动漫", "综艺");
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new C0323a((String) listAsList.get(i), (String) listAsList2.get(i)));
        }
        C0274g c0274gO0 = l.g(C0378c.n(this.f, g())).o0(".module-item");
        return C0329g.u(arrayList, parseVodList(new C0274g(c0274gO0.subList(0, Math.min(c0274gO0.size(), 12)))), new JSONObject("{\"dy\":[{\"key\":\"class\",\"name\":\"剧情\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"战争\",\"v\":\"战争\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"juji\":[{\"key\":\"class\",\"name\":\"剧情\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国产剧\",\"v\":\"国产剧\"},{\"n\":\"美剧\",\"v\":\"美剧\"},{\"n\":\"韩国剧\",\"v\":\"韩国剧\"},{\"n\":\"港剧\",\"v\":\"港剧\"},{\"n\":\"台湾剧\",\"v\":\"台湾剧\"},{\"n\":\"日本剧\",\"v\":\"日本剧\"},{\"n\":\"港剧\",\"v\":\"港剧\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"dongman\":[{\"key\":\"class\",\"name\":\"剧情\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国产动漫\",\"v\":\"国产动漫\"},{\"n\":\"日韩动漫\",\"v\":\"日韩动漫\"},{\"n\":\"欧美动漫\",\"v\":\"欧美动漫\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"zongyi\":[{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}]}"));
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
            C0384b.a(mVar.o0(".module-item-titlebox >a").a("href"), mVar.o0(".module-item-titlebox >a").a("title"), mVar.o0(".module-item-pic img").a("data-src"), mVar.o0(".module-item-text").i(), arrayList);
        }
        return arrayList;
    }

    public String searchContent(String str, boolean z) {
        return j(str, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        return j(str, str2);
    }
}
