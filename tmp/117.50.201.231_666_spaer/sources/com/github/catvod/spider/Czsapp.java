package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.FM.A.l;
import com.github.catvod.spider.merge.FM.K.h;
import com.github.catvod.spider.merge.FM.K.m;
import com.github.catvod.spider.merge.FM.c.C0323a;
import com.github.catvod.spider.merge.FM.c.C0329g;
import com.github.catvod.spider.merge.FM.c.C0332j;
import com.github.catvod.spider.merge.FM.m.C0378c;
import com.github.catvod.spider.merge.FM.o.C0385a;
import com.github.catvod.spider.merge.FM.p.AbstractC0399a;
import com.github.catvod.spider.merge.FM.p.f;
import com.github.catvod.spider.merge.a.C0529a;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Response;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class Czsapp extends Spider {
    private static final Pattern a = Pattern.compile("\"([^\"]+)\";var [\\d\\w]+=function dncry.*md5.enc.Utf8.parse\\(\"([\\d\\w]+)\".*md5.enc.Utf8.parse\\(([\\d]+)\\)");
    private static final Pattern b = Pattern.compile("video: \\{url: \"([^\"]+)\"");
    private static final Pattern c = Pattern.compile("subtitle: \\{url:\"([^\"]+\\.vtt)\"");
    private static String d;

    private Map<String, String> b() {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Linux; Android 15; PJZ110 Build/AP3A.240617.008; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/136.0.7103.127 Mobile Safari/537.36");
        map.put("Referer", d);
        map.put("Accept-Language", "zh-CN,zh;q=0.9");
        return map;
    }

    private void c(List<C0332j> list, h hVar) {
        for (m mVar : hVar.o0(".bt_img.mi_ne_kd > ul >li")) {
            list.add(new C0332j(mVar.o0("a").a("href"), mVar.o0(".dytit > a").i(), mVar.o0("img").a("data-original"), mVar.o0(".jidi span").i()));
        }
    }

    private void d(List<C0332j> list, h hVar) {
        for (m mVar : hVar.o0(".bt_img.mi_ne_kd > ul >li")) {
            String strA = mVar.o0("a").a("href");
            list.add(new C0332j(d + strA, mVar.o0(".dytit > a").i(), mVar.o0("img").a("src"), mVar.o0(".jidi span").i()));
        }
    }

    public static Object[] loadSub(Map<String, String> map) {
        int i;
        String str = map.get("url");
        try {
            AbstractC0399a abstractC0399a = new AbstractC0399a() { // from class: com.github.catvod.spider.Czsapp.1
                @Override // com.github.catvod.spider.merge.FM.p.AbstractC0401c
                protected final void a(Exception exc) {
                }

                @Override // com.github.catvod.spider.merge.FM.p.AbstractC0401c
                protected final /* bridge */ /* synthetic */ void b(Response response) {
                }
            };
            f.c(f.b(), str, b(), abstractC0399a);
            Response result = abstractC0399a.getResult();
            if (result.code() == 404) {
                return new Object[]{200, "application/octet-stream", new ByteArrayInputStream("WEBVTT".getBytes())};
            }
            byte[] bArrBytes = result.body().bytes();
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrBytes, 0, 16);
            BufferedReader bufferedReader = new BufferedReader(new StringReader(com.github.catvod.spider.merge.FM.E.a.a(C0385a.c(Arrays.copyOfRange(bArrBytes, 16, bArrBytes.length), bArrCopyOfRange, bArrCopyOfRange, "AES/CBC/PKCS7Padding")).replaceAll("(\\d{2}:\\d{2}:\\d{2}.\\d{3}.+\\d{2}:\\d{2}:\\d{2}.\\d{3}).*", "$1").replaceAll("(\\d{2}:\\d{2}.\\d{3}).*?( --> )(\\d{2}:\\d{2}.\\d{3}).*", "00:$1$200:$3").replaceAll("<.*><.*>(.*)<.*><.*>", "$1").replaceAll("&(.*);", "").replaceAll(".*NOTE.*", "")));
            ArrayList arrayList = new ArrayList();
            int i2 = 1;
            String line = bufferedReader.readLine();
            while (line != null) {
                if (line.matches("\\d{2}:\\d{2}:\\d{2}.\\d{3}.+\\d{2}:\\d{2}:\\d{2}.\\d{3}") && ((String) arrayList.get(arrayList.size() - 1)).trim().isEmpty()) {
                    arrayList.add(String.valueOf(i2));
                    i = i2 + 1;
                } else {
                    i = i2;
                }
                arrayList.add(line);
                line = bufferedReader.readLine();
                i2 = i;
            }
            return new Object[]{200, "application/octet-stream", new ByteArrayInputStream(TextUtils.join("\n", arrayList).getBytes())};
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log(e);
            return null;
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        String str3 = d + String.format("/%s/page/%s", str, str2);
        HashMap map2 = new HashMap();
        map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.81 Safari/537.36");
        map2.put("Referer", d);
        c(arrayList, l.g(C0378c.n(str3, map2)));
        return C0329g.q(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x00cd. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r15) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Czsapp.detailContent(java.util.List):java.lang.String");
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        new LinkedHashMap();
        String str = d;
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.81 Safari/537.36");
        map.put("Referer", str);
        h hVarG = l.g(C0378c.n(str, map));
        for (m mVar : hVarG.o0(".navlist > li")) {
            String strA = mVar.o0("a").a("href");
            String strI = mVar.o0("a").i();
            if (!strI.equals("首页")) {
                arrayList2.add(new C0323a(strA, strI));
            }
        }
        c(arrayList, hVarG);
        return C0329g.s(arrayList2, arrayList);
    }

    public void init(Context context, String str) {
        if (str.isEmpty()) {
            return;
        }
        d = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strGroup;
        String strG;
        try {
            String strN = C0378c.n(str2, b());
            h hVarG = l.g(strN);
            Matcher matcher = a.matcher(strN);
            if (matcher.find()) {
                String strD = C0385a.d(Base64.decode(matcher.group(1), 0), matcher.group(2).getBytes(), matcher.group(3).getBytes(), "AES/CBC/PKCS7Padding");
                Matcher matcher2 = b.matcher(strD);
                strG = matcher2.find() ? matcher2.group(1) : "";
                Matcher matcher3 = c.matcher(strD);
                strGroup = matcher3.find() ? matcher3.group(1) : "";
            } else {
                strGroup = "";
                strG = "";
            }
            if (TextUtils.isEmpty(strG)) {
                String strA = hVarG.o0("div.videoplay > iframe").a("src");
                HashMap map = new HashMap();
                map.put("User-Agent", "Mozilla/5.0 (Linux; Android 15; PJZ110 Build/AP3A.240617.008; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/136.0.7103.127 Mobile Safari/537.36");
                map.put("Upgrade-Insecure-Requests", "1");
                map.put("Sec-Fetch-Dest", "iframe");
                map.put("Referer", d);
                map.put("Sec-Fetch-Site", "cross-site");
                map.put("Sec-Fetch-Mode", "navigate");
                new JSONObject(map);
                Matcher matcher4 = Pattern.compile("var result_v2 = (\\{.*?\\});", 32).matcher(C0378c.n(strA, map));
                strG = C0385a.g(new StringBuilder(new JSONObject(matcher4.find() ? matcher4.group(1) : "").getString("data")).reverse().toString());
            }
            JSONObject jSONObject = new JSONObject(b());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("parse", "0");
            jSONObject2.put("playUrl", "");
            jSONObject2.put("url", strG);
            jSONObject2.put("header", jSONObject.toString());
            if (!TextUtils.isEmpty(strGroup)) {
                jSONObject2.put("subf", "/vtt/utf-8");
                jSONObject2.put("subt", Proxy.getUrl() + "?do=czspp&url=" + URLEncoder.encode(strGroup));
            }
            return jSONObject2.toString();
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log(e);
            C0329g c0329gE = C0329g.e();
            c0329gE.x(str2);
            c0329gE.l();
            c0329gE.f(b());
            return C0529a.addDanmaku(c0329gE.o());
        }
    }

    public String searchContent(String str, boolean z) {
        String str2 = (d + "/xsss1O1?q=") + str;
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.81 Safari/537.36");
        map.put("Referer", d);
        h hVarG = l.g(C0378c.n(str2, map));
        ArrayList arrayList = new ArrayList();
        d(arrayList, hVarG);
        return C0329g.q(arrayList);
    }
}
