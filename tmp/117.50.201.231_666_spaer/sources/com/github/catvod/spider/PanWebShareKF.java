package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.G.f;
import com.github.catvod.spider.merge.G.i;
import com.github.catvod.spider.merge.H.g;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.a.C0531c;
import com.github.catvod.spider.merge.b.v;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.k.C0575b;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class PanWebShareKF extends Pan {
    private static String j = "";
    private static String k = "";
    private long i;

    private String b(String str) {
        HashMap mapB = v.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36");
        mapB.put("Referer", j);
        mapB.put("Cookie", k);
        mapB.put("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,en-US;q=0.6");
        return C0575b.l(str, mapB);
    }

    private List<String> c(f fVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<i> it = fVar.n0("div.message > div > div.alert, div.message > div.alert, div.message > section > div.alert, div.message > h5 > div.alert").iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().t0().replace("您已通过回复满足要求，内容已解锁", "").replaceAll("\\s+", ""));
        }
        if (arrayList.size() == 1 && !((String) arrayList.get(0)).contains("http")) {
            String strA = (String) arrayList.get(0);
            Iterator<i> it2 = fVar.n0("a").iterator();
            while (it2.hasNext()) {
                String strFilterCloudDiskLinks = C0529a.filterCloudDiskLinks(it2.next().d("href"));
                if (strFilterCloudDiskLinks.contains("/s/") || strFilterCloudDiskLinks.contains("/t/")) {
                    if (strFilterCloudDiskLinks.contains(".123") && !strA.contains("码")) {
                        strA = C0531c.a("提取码：", strA);
                    }
                    if (strFilterCloudDiskLinks.contains("cloud.") && !strA.contains("码")) {
                        strA = C0531c.a("访问码：", strA);
                    }
                    arrayList.set(0, strFilterCloudDiskLinks + strA);
                }
            }
        }
        SpiderDebug.log(arrayList.toString());
        return arrayList;
    }

    private void d(String str) {
        String str2 = j;
        if (!str2.contains("https://www.kfjwzz.com") || !str2.contains("www.kfzy.cc")) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.i;
            if (jCurrentTimeMillis < 21000) {
                try {
                    Thread.sleep(21000 - jCurrentTimeMillis);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        String str3 = new String[]{"感谢楼主分享！", "这个资源太棒了！", "已收藏，谢谢！", "不错的资源，支持一下", "楼主辛苦了！", "内容很有用，感谢分享"}[new Random().nextInt(6)];
        String str4 = j + "/post-create-" + com.github.catvod.spider.merge.y.f.l(str, "thread-", ".") + "-1.htm";
        HashMap mapB = v.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36");
        mapB.put("Referer", j);
        mapB.put("Cookie", k);
        mapB.put("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,en-US;q=0.6");
        mapB.put("X-Requested-With", "XMLHttpRequest");
        mapB.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        HashMap map = new HashMap();
        map.put("doctype", "1");
        map.put("return_html", "0");
        map.put("quotepid", "");
        map.put("message", str3);
        map.put("quick_reply_message", "4");
        C0575b.g(str4, map, mapB).a();
        this.i = System.currentTimeMillis();
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            f fVarA = com.github.catvod.spider.merge.D.a.a(b(j + "/forum-" + str + "-" + str2 + ".htm"));
            ArrayList arrayList = new ArrayList();
            for (i iVar : fVarA.n0("ul.threadlist > li")) {
                if (!iVar.n0("i").a("data-placement").contains("top")) {
                    String strD = iVar.n0("div > div.subject > a,div > div.style3_subject > a").b().d("href");
                    String strT0 = iVar.n0("div > div.subject > a,div > div.style3_subject > a").b().t0();
                    if (!strT0.contains("福利")) {
                        String strA = iVar.n0("a > img").a("src");
                        if (!strA.startsWith("http")) {
                            strA = j + "/" + strA;
                        }
                        arrayList.add(new C0554e(strD, strT0, strA, iVar.n0("div > div.subject > a.badge,div > div.style3_subject > a.badge").c()));
                    }
                }
            }
            C0552c c0552c = new C0552c();
            c0552c.i(Integer.valueOf(str2).intValue(), 0, 0, 0);
            c0552c.w(arrayList);
            return c0552c.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) {
        try {
            String str = j + "/" + list.get(0);
            f fVar = new f("");
            for (int i = 1; i < 3; i++) {
                fVar = g.d(b(str));
                if (!fVar.n0("div.message").c().contains("<立即回复>")) {
                    break;
                }
                d(list.get(0));
            }
            List<String> listC = c(fVar);
            C0554e c0554e = new C0554e();
            c0554e.j(list.get(0));
            c0554e.k(fVar.n0("h4").c());
            c0554e.l("https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/El1L/1200X800/quark.jpg");
            StringBuilder sb = new StringBuilder();
            sb.append("资源id:");
            sb.append(list.get(0));
            sb.append(">>");
            c0554e.h(listC.toString().replace("[", "").replace("]", "").replace("网盘链接：", "").replace(",", "\n"));
            PanOrder.sort(listC);
            c0554e.m(detailContentVodPlayFrom(listC));
            c0554e.n(detailContentVodPlayUrl(listC));
            return C0529a.processVodData(C0552c.m(c0554e));
        } catch (Exception unused) {
            return "";
        }
    }

    public String homeContent(boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type_id", "1");
            jSONObject.put("type_name", "剧集");
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type_id", "2");
            jSONObject2.put("type_name", "短剧");
            jSONArray.put(jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("type_id", "3");
            jSONObject3.put("type_name", "动漫");
            jSONArray.put(jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("type_id", "4");
            jSONObject4.put("type_name", "综艺");
            jSONArray.put(jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("type_id", "9");
            jSONObject5.put("type_name", "电影");
            jSONArray.put(jSONObject5);
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("class", jSONArray);
            return jSONObject6.toString();
        } catch (Exception unused) {
            return "{\"class\":[]}";
        }
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        int length;
        try {
            if (str.isEmpty() || (length = (jSONArray = (jSONObject = new JSONObject(str)).getJSONArray("site")).length()) == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String strTrim = jSONArray.getString(i).trim();
                if (!strTrim.isEmpty()) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strTrim).openConnection();
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(10000);
                    httpURLConnection.setRequestMethod("HEAD");
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode >= 200 && responseCode < 400) {
                        j = strTrim;
                        httpURLConnection.disconnect();
                        break;
                    }
                    httpURLConnection.disconnect();
                }
                i++;
            }
            k = jSONObject.optString("cookie");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            ArrayList arrayList = new ArrayList();
            for (i iVar : com.github.catvod.spider.merge.D.a.a(b(j + "/search-" + str + "-1.htm")).n0("ul.threadlist > li")) {
                if (!iVar.n0("i").a("data-placement").contains("top")) {
                    String strD = iVar.n0("div > div.subject > a,div > div.style3_subject > a").b().d("href");
                    String strT0 = iVar.n0("div > div.subject > a,div > div.style3_subject > a").b().t0();
                    String strA = iVar.n0("a > img").a("src");
                    if (!strA.startsWith("http")) {
                        strA = j + "/" + strA;
                    }
                    arrayList.add(new C0554e(strD, strT0, strA, iVar.n0("div > div.subject > a.badge,div > div.style3_subject > a.badge").c()));
                }
            }
            C0552c c0552c = new C0552c();
            c0552c.i(1, 0, 0, 0);
            c0552c.w(arrayList);
            return c0552c.toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
