package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.FM.A.l;
import com.github.catvod.spider.merge.FM.K.h;
import com.github.catvod.spider.merge.FM.K.m;
import com.github.catvod.spider.merge.FM.M.C0274g;
import com.github.catvod.spider.merge.FM.m.C0378c;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class YGP extends Spider {
    private static final String b = "https://www.6huo.com/";
    private static final String c = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.198 Safari/537.36";
    private JSONObject a;

    private static String b(Pattern pattern, String str) {
        if (pattern == null) {
            return str;
        }
        try {
            Matcher matcher = pattern.matcher(str);
            return matcher.find() ? matcher.group(1).trim() : str;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return str;
        }
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

    public static boolean isNumeric(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    protected final HashMap<String, String> a() {
        HashMap<String, String> map = new HashMap<>();
        map.put("method", "GET");
        map.put("User-Agent", c);
        map.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
        map.put("Accept-Language", "zh-CN,zh;q=0.9");
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        int i;
        int i2;
        try {
            String[] strArr = new String[5];
            strArr[0] = "";
            strArr[1] = "";
            strArr[2] = "";
            strArr[3] = "";
            strArr[4] = "";
            String str3 = b + str;
            strArr[4] = str2;
            if (map != null && map.size() > 0) {
                for (String str4 : map.keySet()) {
                    strArr[Integer.parseInt(str4)] = URLEncoder.encode(map.get(str4));
                }
            }
            String strN = C0378c.n(str3 + TextUtils.join("_", strArr), a());
            h hVarG = l.g(strN);
            JSONObject jSONObject = new JSONObject();
            C0274g c0274gO0 = hVarG.o0("p.page-nav a");
            if (c0274gO0.size() == 0) {
                int i3 = Integer.parseInt(str2);
                i = i3;
                i2 = i3;
            } else {
                int i4 = 0;
                int i5 = 0;
                while (i5 < c0274gO0.size()) {
                    m mVar = c0274gO0.get(i5);
                    i5++;
                    i4 = !isNumeric(mVar.v0()) ? i4 : i4 < Integer.parseInt(mVar.v0()) ? Integer.parseInt(mVar.v0()) : i4;
                }
                i = Integer.parseInt(hVarG.o0("p.page-nav a.current").i());
                i2 = i4;
            }
            JSONArray jSONArray = new JSONArray();
            if (!strN.contains("没有找到您想要的结果哦")) {
                C0274g c0274gO02 = hVarG.o0("div.inner-2col-main div.movlist > ul li > a");
                for (int i6 = 0; i6 < c0274gO02.size(); i6++) {
                    m mVar2 = c0274gO02.get(i6);
                    String strC = mVar2.c("href");
                    String strC2 = mVar2.p0("span").c("title");
                    String strC3 = mVar2.p0("img").c("src");
                    if (!strC3.contains("http")) {
                        strC3 = b + strC3;
                    }
                    String strV0 = mVar2.o0("span").g().v0();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("vod_id", strC);
                    jSONObject2.put("vod_name", strC2);
                    jSONObject2.put("vod_pic", d(strC3));
                    jSONObject2.put("vod_remarks", strV0);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("page", i);
            jSONObject.put("pagecount", i2);
            jSONObject.put("limit", 30);
            jSONObject.put("total", i2 <= 1 ? jSONArray.length() : i2 * 30);
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String detailContent(List<String> list) {
        try {
            StringBuilder sb = new StringBuilder();
            String str = b;
            sb.append(str);
            sb.append(list.get(0));
            h hVarG = l.g(C0378c.n(sb.toString(), a()));
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            hVarG.o0("div.inner-wrapper").get(0);
            String strA = hVarG.o0("div.movie-title-mpic > a >img").a("src");
            String strD = strA.contains("http") ? d(strA) : str + strA;
            String strI = hVarG.o0("h1.movie-name").i();
            String str2 = "";
            String strV0 = "";
            C0274g c0274gO0 = hVarG.o0("div.movie-title-detail a");
            int i = 0;
            while (i < c0274gO0.size()) {
                if (c0274gO0.get(i).c("href").contains("country")) {
                    strV0 = c0274gO0.get(i).v0();
                }
                String str3 = c0274gO0.get(i).c("href").contains("movietype") ? str2 + c0274gO0.get(i).v0() + "/" : str2;
                i++;
                str2 = str3;
            }
            String strB = b(Pattern.compile("导演：(.+)主演"), hVarG.o0("div.movie-title-detail p").i());
            String strB2 = b(Pattern.compile("上映：(\\w+)"), hVarG.o0("div.movie-title-detail p").i());
            String strB3 = b(Pattern.compile("主演：(.+)剧情"), hVarG.o0("div.movie-title-detail p").i());
            String strB4 = b(Pattern.compile("剧情：(.+)\\(详细\\)"), hVarG.o0("div.movie-title-detail p").i());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C0274g c0274gO02 = hVarG.o0("#tabwrapper-all > .tlist");
            String strJoin = "";
            String strJoin2 = "";
            for (int i2 = 0; i2 < c0274gO02.size(); i2++) {
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(c0274gO02.h("th").e().v0());
                C0274g c0274gO03 = c0274gO02.get(i2).o0("td a.tlist-bbs-tdtitle");
                for (int i3 = 0; i3 < c0274gO03.size(); i3++) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(c0274gO03.get(i3).v0());
                    sb2.append("$");
                    sb2.append(c0274gO03.get(i3).c("href"));
                    arrayList3.add(sb2.toString());
                }
                strJoin2 = arrayList3.size() > 1 ? TextUtils.join("#", arrayList3) : (String) arrayList3.get(0);
                arrayList2.add(strJoin2);
                if (arrayList2.size() > 1) {
                    strJoin2 = TextUtils.join("$$$", arrayList2);
                    strJoin = TextUtils.join("$$$", arrayList);
                } else {
                    strJoin = (String) arrayList.get(0);
                }
            }
            if (strJoin.equals("")) {
                strJoin2 = "暂无预告$www";
                strJoin = "暂无预告";
            }
            jSONObject2.put("vod_id", list.get(0));
            jSONObject2.put("vod_name", strI);
            jSONObject2.put("vod_pic", strD);
            jSONObject2.put("type_name", str2);
            jSONObject2.put("vod_year", strB2);
            jSONObject2.put("vod_area", strV0);
            jSONObject2.put("vod_remarks", "");
            jSONObject2.put("vod_actor", strB3);
            jSONObject2.put("vod_director", strB);
            jSONObject2.put("vod_content", strB4);
            jSONObject2.put("vod_play_from", strJoin);
            jSONObject2.put("vod_play_url", strJoin2);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String homeContent(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type_id", "movlist/");
            jSONObject2.put("type_name", "预告片世界");
            jSONArray.put(jSONObject2);
            jSONObject.put("class", jSONArray);
            if (z) {
                try {
                    jSONObject.put("filters", this.a);
                } catch (Exception e) {
                    e = e;
                    SpiderDebug.log(e);
                    return "";
                }
            }
            C0274g c0274gO0 = l.g(C0378c.n(b, a())).o0("div.inner-2col-main div.movlist > ul li > a");
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < c0274gO0.size(); i++) {
                m mVar = c0274gO0.get(i);
                String strC = mVar.c("href");
                String strC2 = mVar.p0("span").c("title");
                String strC3 = mVar.p0("img").c("src");
                if (!strC3.contains("http")) {
                    strC3 = b + strC3;
                }
                String strV0 = mVar.o0("span").g().v0();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("vod_id", strC);
                jSONObject3.put("vod_name", strC2);
                jSONObject3.put("vod_pic", d(strC3));
                jSONObject3.put("vod_remarks", strV0);
                jSONArray2.put(jSONObject3);
            }
            jSONObject.put("list", jSONArray2);
            return jSONObject.toString();
        } catch (Exception e2) {
            e = e2;
        }
    }

    public void init(Context context) {
        super.init(context);
        try {
            this.a = new JSONObject("{\"movlist/\":[{\"key\":\"1\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"灾难\",\"v\":\"灾难\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"冒险\",\"v\":\"冒险\"}]},{\"key\":\"0\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"2\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"v\":\"2026\",\"n\":\"2026\"},{\"v\":\"2025\",\"n\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"},{\"n\":\"1999\",\"v\":\"1999\"},{\"n\":\"1998\",\"v\":\"1998\"},{\"n\":\"1980\",\"v\":\"1980\"}]},{\"key\":\"3\",\"name\":\"排序\",\"value\":[{\"n\":\"最近更新\",\"v\":\"\"},{\"n\":\"热门\",\"v\":\"hot\"},{\"n\":\"上映时间\",\"v\":\"pubtime\"}]}]}");
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str3 = b + str2;
            jSONObject.put("parse", 1);
            jSONObject.put("url", str3);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            C0274g c0274gO0 = l.g(C0378c.n("https://www.6huo.com/?keyword=" + URLEncoder.encode(str) + "&view=search", a())).o0("div.inner-2col-main div.movlist > ul li > a");
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < c0274gO0.size(); i++) {
                m mVar = c0274gO0.get(i);
                String strC = mVar.c("href");
                String strC2 = mVar.p0("span").c("title");
                String strC3 = mVar.p0("img").c("src");
                if (!strC3.contains("http")) {
                    strC3 = b + strC3;
                }
                String strV0 = mVar.o0("span").g().v0();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vod_id", strC);
                jSONObject2.put("vod_name", strC2);
                jSONObject2.put("vod_pic", d(strC3));
                jSONObject2.put("vod_remarks", strV0);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
