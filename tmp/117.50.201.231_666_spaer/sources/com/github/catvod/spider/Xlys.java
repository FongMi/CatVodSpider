package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.FM.A.l;
import com.github.catvod.spider.merge.FM.K.h;
import com.github.catvod.spider.merge.FM.K.m;
import com.github.catvod.spider.merge.FM.L.P;
import com.github.catvod.spider.merge.FM.M.C0274g;
import com.github.catvod.spider.merge.FM.b.r;
import com.github.catvod.spider.merge.FM.b.s;
import com.github.catvod.spider.merge.FM.b.v;
import com.github.catvod.spider.merge.FM.c.C0323a;
import com.github.catvod.spider.merge.FM.c.C0329g;
import com.github.catvod.spider.merge.FM.c.C0332j;
import com.github.catvod.spider.merge.FM.m.C0378c;
import com.github.catvod.spider.merge.FM.n.C0383a;
import com.github.catvod.spider.merge.FM.n.C0384b;
import com.github.catvod.spider.merge.FM.n.k;
import com.github.catvod.spider.merge.FM.o.z;
import com.github.catvod.spider.merge.a.C0529a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class Xlys extends Spider {
    private static String a = "https://www.xlys01.com";

    private Map<String, String> a() {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
        map.put("Accept-Language", "zh-CN,zh;q=0.9");
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        if (map.get("cateId") != null) {
            str = map.get("cateId");
        }
        h hVarG = l.g(C0378c.n(a + String.format("/s/%s/%s?type=%s&area=%s&year=%s&order=%s", map.get("class") == null ? "all" : map.get("class"), str2, str, map.get("area") == null ? "中国大陆" : map.get("area"), map.get("year") == null ? "" : map.get("year"), map.get("by") == null ? "" : map.get("by")), a()));
        ArrayList arrayList = new ArrayList();
        for (m mVar : hVarG.o0(".col-4")) {
            C0384b.a(a + mVar.o0("a.d-block").a("href"), mVar.o0("h3.card-title").i(), mVar.o0("img").a("src"), mVar.o0(".text-red-fg").i(), arrayList);
        }
        return C0329g.q(arrayList);
    }

    public String detailContent(List<String> list) throws JSONException {
        h hVarG = l.g(C0378c.n(list.get(0), a()));
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String strC = hVarG.p0("div.col-md-auto img").c("src");
        String strV0 = hVarG.p0("h2.d-sm-block").v0();
        String strV02 = "";
        String strReplaceAll = k.a(new byte[]{-88, 48, -12, -36, -33, -15, -124, -61, -8, 99, -93, -47, -47, -13, -109, -121, -23, 44, -23, -53}, new byte[]{-117, 67, -115, -78, -80, -127, -9, -86}, hVarG).replaceAll("\\s+", "");
        String str = k.a(new byte[]{70, 59, -84, 100, -34, -53, -114, 23, 82, 46, -29, 104, -105, -124, -97, 6, 71, 59, -95, 111, -35, -59, -101}, new byte[]{53, 75, -51, 10, -16, -87, -17, 115}, hVarG).replace("更新时间：", "").split("-")[0];
        C0274g c0274gO0 = hVarG.o0("div.col.mb-2").get(0).o0("p");
        int i = 0;
        String str2 = "";
        String strSubstring = "";
        String str3 = "";
        String strJoin = "";
        while (i < c0274gO0.size()) {
            m mVar = c0274gO0.get(i);
            String strV03 = mVar.p0("strong").v0();
            if (strV03.equals("类型：")) {
                ArrayList arrayList = new ArrayList();
                C0274g c0274gO02 = mVar.o0("a");
                int i2 = 0;
                while (true) {
                    int i3 = i2;
                    if (i3 >= c0274gO02.size()) {
                        break;
                    }
                    arrayList.add(c0274gO02.get(i3).v0());
                    i2 = i3 + 1;
                }
                str2 = "类型：" + TextUtils.join(",", arrayList);
            } else if (strV03.contains("地区")) {
                strSubstring = mVar.v0().substring(mVar.v0().indexOf("[") + 1, mVar.v0().indexOf("]"));
            } else if (strV03.contains("豆瓣")) {
                str3 = "豆瓣:" + mVar.v0();
            } else if (strV03.contains("导演：")) {
                strV02 = mVar.p0("a").v0();
            } else if (strV03.contains("主演：")) {
                ArrayList arrayList2 = new ArrayList();
                C0274g c0274gO03 = mVar.o0("a");
                int i4 = 0;
                while (true) {
                    int i5 = i4;
                    if (i5 >= c0274gO03.size()) {
                        break;
                    }
                    arrayList2.add(c0274gO03.get(i5).v0());
                    i4 = i5 + 1;
                }
                strJoin = TextUtils.join(",", arrayList2);
            }
            i++;
            str2 = str2;
        }
        jSONObject2.put("vod_id", list.get(0));
        jSONObject2.put("vod_name", strV0);
        jSONObject2.put("vod_pic", strC);
        jSONObject2.put("type_name", str2);
        jSONObject2.put("vod_year", str);
        jSONObject2.put("vod_area", strSubstring);
        jSONObject2.put("vod_remarks", str3);
        jSONObject2.put("vod_actor", strJoin);
        jSONObject2.put("vod_director", strV02);
        jSONObject2.put("vod_content", strReplaceAll);
        TreeMap treeMap = new TreeMap();
        C0274g c0274gO04 = hVarG.o0("a.btn.btn-square");
        ArrayList arrayList3 = new ArrayList();
        int i6 = 0;
        while (true) {
            int i7 = i6;
            if (i7 >= c0274gO04.size()) {
                break;
            }
            m mVar2 = c0274gO04.get(i7);
            String strC2 = mVar2.c("href");
            if (strC2.contains("JSESSIONID")) {
                strC2 = strC2.substring(0, strC2.indexOf(";"));
            }
            arrayList3.add(mVar2.v0() + "$" + strC2);
            i6 = i7 + 1;
        }
        treeMap.put("磁力播放", arrayList3.size() > 0 ? TextUtils.join("#", arrayList3) : "");
        if (treeMap.size() > 0) {
            String strJoin2 = TextUtils.join("$$$", treeMap.keySet());
            String strJoin3 = TextUtils.join("$$$", treeMap.values());
            jSONObject2.put("vod_play_from", strJoin2);
            jSONObject2.put("vod_play_url", strJoin3);
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject2);
        jSONObject.put("list", jSONArray);
        return jSONObject.toString();
    }

    public String homeContent(boolean z) {
        int i = 0;
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("0", "1");
        List listAsList2 = Arrays.asList("电影", "电视剧");
        while (true) {
            int i2 = i;
            if (i2 >= listAsList.size()) {
                break;
            }
            arrayList.add(new C0323a((String) listAsList.get(i2), (String) listAsList2.get(i2)));
            i = i2 + 1;
        }
        JSONObject jSONObject = new JSONObject("{\"0\":[{\"key\":\"class\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"all\"},{\"n\":\"动作\",\"v\":\"dongzuo\"},{\"n\":\"爱情\",\"v\":\"aiqing\"},{\"n\":\"喜剧\",\"v\":\"xiju\"},{\"n\":\"科幻\",\"v\":\"kehuan\"},{\"n\":\"恐怖\",\"v\":\"kongbu\"},{\"n\":\"战争\",\"v\":\"zhanzheng\"},{\"n\":\"武侠\",\"v\":\"wuxia\"},{\"n\":\"魔幻\",\"v\":\"mohuan\"},{\"n\":\"剧情\",\"v\":\"juqing\"},{\"n\":\"动画\",\"v\":\"donghua\"},{\"n\":\"惊悚\",\"v\":\"jingsong\"},{\"n\":\"3D\",\"v\":\"3D\"},{\"n\":\"灾难\",\"v\":\"zainan\"},{\"n\":\"悬疑\",\"v\":\"xuanyi\"},{\"n\":\"警匪\",\"v\":\"jingfei\"},{\"n\":\"文艺\",\"v\":\"wenyi\"},{\"n\":\"青春\",\"v\":\"qingchun\"},{\"n\":\"冒险\",\"v\":\"maoxian\"},{\"n\":\"犯罪\",\"v\":\"fanzui\"},{\"n\":\"纪录\",\"v\":\"jilu\"},{\"n\":\"古装\",\"v\":\"guzhuang\"},{\"n\":\"奇幻\",\"v\":\"qihuan\"},{\"n\":\"国语\",\"v\":\"guoyu\"},{\"n\":\"综艺\",\"v\":\"zongyi\"},{\"n\":\"历史\",\"v\":\"lishi\"},{\"n\":\"运动\",\"v\":\"yundong\"},{\"n\":\"原创压制\",\"v\":\"yuanchuang\"},{\"n\":\"美剧\",\"v\":\"meiju\"},{\"n\":\"韩剧\",\"v\":\"hanju\"},{\"n\":\"国产电视剧\",\"v\":\"guoju\"},{\"n\":\"日剧\",\"v\":\"riju\"},{\"n\":\"英剧\",\"v\":\"yingju\"},{\"n\":\"德剧\",\"v\":\"deju\"},{\"n\":\"俄剧\",\"v\":\"eju\"},{\"n\":\"巴剧\",\"v\":\"baju\"},{\"n\":\"加剧\",\"v\":\"jiaju\"},{\"n\":\"西剧\",\"v\":\"anish\"},{\"n\":\"意大利剧\",\"v\":\"yidaliju\"},{\"n\":\"泰剧\",\"v\":\"taiju\"},{\"n\":\"港台剧\",\"v\":\"gangtaiju\"},{\"n\":\"法剧\",\"v\":\"faju\"},{\"n\":\"澳剧\",\"v\":\"aoju\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"不限\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"澳大利亚\",\"v\":\"澳大利亚\"},{\"n\":\"比利时\",\"v\":\"比利时\"},{\"n\":\"瑞典\",\"v\":\"瑞典\"},{\"n\":\"荷兰\",\"v\":\"荷兰\"},{\"n\":\"丹麦\",\"v\":\"丹麦\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"俄罗斯\",\"v\":\"俄罗斯\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"更新时间\",\"v\":\"0\"},{\"n\":\"豆瓣评分\",\"v\":\"1\"}]}],\"1\":[{\"key\":\"class\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"all\"},{\"n\":\"动作\",\"v\":\"dongzuo\"},{\"n\":\"爱情\",\"v\":\"aiqing\"},{\"n\":\"喜剧\",\"v\":\"xiju\"},{\"n\":\"科幻\",\"v\":\"kehuan\"},{\"n\":\"恐怖\",\"v\":\"kongbu\"},{\"n\":\"战争\",\"v\":\"zhanzheng\"},{\"n\":\"武侠\",\"v\":\"wuxia\"},{\"n\":\"魔幻\",\"v\":\"mohuan\"},{\"n\":\"剧情\",\"v\":\"juqing\"},{\"n\":\"动画\",\"v\":\"donghua\"},{\"n\":\"惊悚\",\"v\":\"jingsong\"},{\"n\":\"3D\",\"v\":\"3D\"},{\"n\":\"灾难\",\"v\":\"zainan\"},{\"n\":\"悬疑\",\"v\":\"xuanyi\"},{\"n\":\"警匪\",\"v\":\"jingfei\"},{\"n\":\"文艺\",\"v\":\"wenyi\"},{\"n\":\"青春\",\"v\":\"qingchun\"},{\"n\":\"冒险\",\"v\":\"maoxian\"},{\"n\":\"犯罪\",\"v\":\"fanzui\"},{\"n\":\"纪录\",\"v\":\"jilu\"},{\"n\":\"古装\",\"v\":\"guzhuang\"},{\"n\":\"奇幻\",\"v\":\"qihuan\"},{\"n\":\"国语\",\"v\":\"guoyu\"},{\"n\":\"综艺\",\"v\":\"zongyi\"},{\"n\":\"历史\",\"v\":\"lishi\"},{\"n\":\"运动\",\"v\":\"yundong\"},{\"n\":\"原创压制\",\"v\":\"yuanchuang\"},{\"n\":\"美剧\",\"v\":\"meiju\"},{\"n\":\"韩剧\",\"v\":\"hanju\"},{\"n\":\"国产电视剧\",\"v\":\"guoju\"},{\"n\":\"日剧\",\"v\":\"riju\"},{\"n\":\"英剧\",\"v\":\"yingju\"},{\"n\":\"德剧\",\"v\":\"deju\"},{\"n\":\"俄剧\",\"v\":\"eju\"},{\"n\":\"巴剧\",\"v\":\"baju\"},{\"n\":\"加剧\",\"v\":\"jiaju\"},{\"n\":\"西剧\",\"v\":\"anish\"},{\"n\":\"意大利剧\",\"v\":\"yidaliju\"},{\"n\":\"泰剧\",\"v\":\"taiju\"},{\"n\":\"港台剧\",\"v\":\"gangtaiju\"},{\"n\":\"法剧\",\"v\":\"faju\"},{\"n\":\"澳剧\",\"v\":\"aoju\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"不限\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"澳大利亚\",\"v\":\"澳大利亚\"},{\"n\":\"比利时\",\"v\":\"比利时\"},{\"n\":\"瑞典\",\"v\":\"瑞典\"},{\"n\":\"荷兰\",\"v\":\"荷兰\"},{\"n\":\"丹麦\",\"v\":\"丹麦\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"俄罗斯\",\"v\":\"俄罗斯\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"更新时间\",\"v\":\"0\"},{\"n\":\"豆瓣评分\",\"v\":\"1\"}]}]}");
        h hVarG = l.g(C0378c.n(a, a()));
        ArrayList arrayList2 = new ArrayList();
        Iterator itC = r.c(new byte[]{-117, -28, -38, -18, -112, -34}, new byte[]{-91, -121, -75, -126, -67, -22, -3, -49}, hVarG);
        while (itC.hasNext()) {
            m mVar = (m) itC.next();
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            C0384b.a(r.a(new byte[]{-9, 71, -53, -1}, new byte[]{-97, 53, -82, -103, -102, -85, 111, 89}, mVar.o0("a.d-block"), sb), C0383a.a(new byte[]{-82, 1, 41, -95, -28, 48, -1, -2, -78, 91, 115, -82, -32}, new byte[]{-58, 50, 7, -62, -123, 66, -101, -45}, mVar), mVar.o0("img").a("data-src"), C0383a.a(new byte[]{-105, 30, -57, -54, -45, 77, 82, -52, -35, 71, -60, -43}, new byte[]{-71, 106, -94, -78, -89, 96, 32, -87}, mVar), arrayList2);
        }
        return C0329g.u(arrayList, arrayList2, jSONObject);
    }

    public void init(Context context, String str) {
        if (str.isEmpty()) {
            return;
        }
        a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strSubstring;
        String upperCase;
        C0274g c0274gO0 = l.g(C0378c.n(v.b(new StringBuilder(), a, str2), a())).o0("script");
        new JSONObject();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= c0274gO0.size()) {
                strSubstring = "";
                break;
            }
            String strT = c0274gO0.get(i2).t();
            if (strT.contains("var pid =")) {
                String strSubstring2 = strT.substring(strT.indexOf("var pid ="), strT.lastIndexOf("var time") + 1);
                strSubstring = strSubstring2.substring(strSubstring2.indexOf("=") + 2, strSubstring2.lastIndexOf(";"));
                break;
            }
            i = i2 + 1;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbB = P.b(strSubstring);
        sbB.append("-");
        sbB.append(jCurrentTimeMillis);
        String strSubstring3 = z.a(sbB.toString()).substring(0, 16);
        StringBuilder sbB2 = P.b(strSubstring);
        sbB2.append("-");
        sbB2.append(jCurrentTimeMillis);
        String string = sbB2.toString();
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
            cipher.init(1, new SecretKeySpec(strSubstring3.getBytes(), "AES"));
            byte[] bArrDoFinal = cipher.doFinal(string.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDoFinal) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    hexString = '0' + hexString;
                }
                sb.append(hexString);
            }
            upperCase = sb.toString().toUpperCase();
        } catch (Exception e) {
            SpiderDebug.log(e);
            upperCase = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a);
        sb2.append("/lines?t=");
        sb2.append(jCurrentTimeMillis);
        s.b(new byte[]{-117, -16, 94, 32}, new byte[]{-83, -125, 57, 29, -71, -51, -42, -11}, sb2, upperCase);
        String strTrim = new JSONObject(C0378c.n(r.b(new byte[]{120, 109, 74, -72, 125}, new byte[]{94, 29, 35, -36, 64, 4, -51, 9}, sb2, strSubstring), a())).getJSONObject("data").getString("url3").split(",")[0].trim();
        C0329g c0329g = new C0329g();
        c0329g.x(strTrim);
        c0329g.f(a());
        return C0529a.addDanmaku(c0329g.toString());
    }

    public String searchContent(String str, boolean z) throws JSONException {
        JSONArray jSONArray = new JSONObject(C0378c.n("https://so.xn--m7r412advb92j21st65a.tk/crawl/bidi?keywords=" + str, null)).getJSONArray("result");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            arrayList.add(new C0332j(a + jSONObject.getString("id"), jSONObject.getString("name"), jSONObject.getString("img")));
        }
        return C0329g.q(arrayList);
    }
}
