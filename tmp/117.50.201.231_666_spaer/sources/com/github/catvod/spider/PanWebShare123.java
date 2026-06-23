package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
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
import com.github.catvod.spider.merge.m.C0602k;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class PanWebShare123 extends Pan {
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
        Iterator<i> it = fVar.n0("div.message > div > div.alert,div.message > div.alert,div.message > section > div.alert,div.message").iterator();
        while (it.hasNext()) {
            String strT0 = it.next().t0();
            Matcher matcher = Pattern.compile("www\\.123\\w{3}\\.com/s/([^/]+)?").matcher(strT0);
            Matcher matcher2 = Pattern.compile("(https?://[^\\s]+(?:\\.html)?)").matcher(strT0);
            if (matcher.find() || matcher2.find()) {
                String strReplace = strT0.replace("请您务必转存保存后再进行下载，以免消耗分享者的免登流量", "").replaceAll("\\s+", "").replace(".html", "");
                if (matcher.find()) {
                    arrayList.add(processExtractionCode((Object) strReplace));
                } else if (matcher2.find()) {
                    String strReplace2 = matcher2.group().replace(".html", "");
                    Matcher matcher3 = Pattern.compile("提取码[:：]\\s*([a-zA-Z0-9]{4})").matcher(strReplace);
                    if (matcher3.find()) {
                        strReplace2 = strReplace2 + "?pwd=" + matcher3.group(1);
                    }
                    String str = (String) processExtractionCode((Object) strReplace2);
                    if (!str.isEmpty() && str.contains("http")) {
                        arrayList.add(str);
                    }
                }
            }
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
        if (!str2.contains("123panfx.com") || !str2.contains("pan1.me")) {
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

    public static Object processExtractionCode(Object obj) {
        String strReplaceAll;
        if (!(obj instanceof String)) {
            return obj;
        }
        String strReplaceAll2 = Pattern.compile("(\\?pwd=[a-zA-Z0-9]+)(.*?)\\?pwd=[a-zA-Z0-9]+").matcher(Pattern.compile("链接：").matcher((String) obj).replaceAll("")).replaceAll("$1$2");
        Pattern.compile("\\?").matcher(strReplaceAll2).find();
        if (Pattern.compile("\\?pwd=[a-zA-Z0-9]{4}").matcher(strReplaceAll2).find()) {
            strReplaceAll = Pattern.compile("(提取码[\\s:：]*[a-zA-Z0-9]{4}|密码[\\s:：]*[a-zA-Z0-9]{4}|码[\\s:：]*[a-zA-Z0-9]{4})").matcher(strReplaceAll2).replaceAll("").trim();
        } else {
            Pattern.compile("(提取码[\\s:：]*)([a-zA-Z0-9]{4})").matcher(strReplaceAll2);
            strReplaceAll = Pattern.compile("(https?://[^\\s]+)(提取码[\\s:：]*)([a-zA-Z0-9]{4})").matcher(strReplaceAll2).replaceAll("$1?pwd=$3");
        }
        return Pattern.compile("#$").matcher(Pattern.compile("\\?\\?pwd=").matcher(strReplaceAll).replaceAll("?pwd=")).replaceAll("");
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            f fVarA = com.github.catvod.spider.merge.D.a.a(b(j + "/forum-" + str + "-" + str2 + ".htm"));
            ArrayList arrayList = new ArrayList();
            for (i iVar : fVarA.n0("ul.threadlist > li")) {
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
                if (!fVar.n0("div.message").c().contains("请回复后再查看")) {
                    break;
                }
                d(list.get(0));
            }
            List<String> listC = c(fVar);
            HashSet hashSet = new HashSet();
            Iterator<String> it = listC.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
            ArrayList arrayList = new ArrayList(hashSet);
            if (arrayList.size() == 2) {
                ArrayList arrayList2 = new ArrayList();
                if (arrayList.get(0).contains("pwd")) {
                    arrayList2.add(arrayList.get(0));
                }
                if (arrayList.get(1).contains("pwd")) {
                    arrayList2.add(arrayList.get(1));
                }
                if (!arrayList2.isEmpty()) {
                    arrayList = arrayList2;
                }
            }
            ArrayList arrayList3 = arrayList;
            C0554e c0554e = new C0554e();
            c0554e.j(list.get(0));
            c0554e.k(fVar.n0("h4").c());
            c0554e.l("https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/wF1k/1200X800/123.jpg");
            StringBuilder sb = new StringBuilder();
            sb.append("资源id:");
            sb.append(list.get(0));
            sb.append(">>");
            c0554e.h(arrayList3.toString().replace("[", "").replace("]", "").replace(",", "\n"));
            PanOrder.sort(arrayList3);
            c0554e.m(detailContentVodPlayFrom(arrayList3));
            c0554e.n(detailContentVodPlayUrl(arrayList3));
            return C0529a.processVodData(C0552c.m(c0554e));
        } catch (Exception unused) {
            return "";
        }
    }

    public String homeContent(boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type_id", "2");
            jSONObject.put("type_name", "电影");
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type_id", "48");
            jSONObject2.put("type_name", "剧集");
            jSONArray.put(jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("type_id", "56");
            jSONObject3.put("type_name", "4K原盘");
            jSONArray.put(jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("type_id", "52");
            jSONObject4.put("type_name", "综艺");
            jSONArray.put(jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("type_id", "37");
            jSONObject5.put("type_name", "动漫");
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
        JSONArray jSONArray;
        int length;
        try {
            if (str.isEmpty() || (length = (jSONArray = new JSONObject(str).getJSONArray("site")).length()) == 0) {
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
            String strA = C0602k.a(C0602k.b("/diy_cookie.txt"));
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            k = new JSONObject(strA).optString("123panfx_cookie");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = j + "/search.htm?keyword=" + str;
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 16_6 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.6 Mobile/15E148 Safari/604.1");
            map.put("Referer", j);
            map.put("x-requested-with", "XMLHttpRequest");
            JSONObject jSONObject = new JSONObject(C0575b.l(str2, map));
            SpiderDebug.log(jSONObject.toString());
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("message");
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                String strOptString = jSONObjectOptJSONObject.optString("url");
                String strReplaceAll = jSONObjectOptJSONObject.optString("subject").replaceAll("<[^>]+>|&(?:#\\d+;|#x[\\da-fA-F]+;|[a-z]+;)", "");
                String strOptString2 = jSONObjectOptJSONObject.optString("user_avatar_url");
                if (!strOptString2.startsWith("http")) {
                    strOptString2 = j + "/" + strOptString2;
                }
                arrayList.add(new C0554e(strOptString, strReplaceAll, strOptString2, ""));
            }
            return C0552c.n(arrayList);
        } catch (Exception unused) {
            return "";
        }
    }
}
