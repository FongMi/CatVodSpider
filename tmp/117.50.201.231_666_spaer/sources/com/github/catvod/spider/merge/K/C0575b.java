package com.github.catvod.spider.merge.k;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.t;
import com.github.catvod.spider.merge.A.u;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.k.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0575b {
    private OkHttpClient a;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.k.b$a */
    private static class a {
        static volatile C0575b a = new C0575b();
    }

    public static String a(String str, Map<String, String> map) {
        String str2 = a().newBuilder().followRedirects(false).followSslRedirects(false).build().newCall(new Request.Builder().url(str).headers(Headers.of(map)).build()).execute().headers().get("Location");
        if (str2 == null) {
            return null;
        }
        return str2;
    }

    public static OkHttpClient a() {
        if (a.a.a != null) {
            return a.a.a;
        }
        C0575b c0575b = a.a;
        OkHttpClient.Builder builderDns = new OkHttpClient.Builder().addInterceptor(new C0578e()).dns(Spider.safeDns());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient okHttpClientBuild = builderDns.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).hostnameVerifier(new HostnameVerifier() { // from class: com.github.catvod.spider.merge.k.a
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                return true;
            }
        }).sslSocketFactory(new f(), f.d).build();
        c0575b.a = okHttpClientBuild;
        return okHttpClientBuild;
    }

    public static u b(String str, byte[] bArr, HashMap map) {
        return new t("POST", str, bArr, map).a(a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        if (r2.containsKey("Location") != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.lang.String r2, java.util.Map<java.lang.String, java.lang.String> r3) {
        /*
            okhttp3.OkHttpClient r0 = e()
            okhttp3.Request$Builder r1 = new okhttp3.Request$Builder
            r1.<init>()
            okhttp3.Request$Builder r2 = r1.url(r2)
            okhttp3.Headers r3 = okhttp3.Headers.of(r3)
            okhttp3.Request$Builder r2 = r2.headers(r3)
            okhttp3.Request r2 = r2.build()
            okhttp3.Call r2 = r0.newCall(r2)
            okhttp3.Response r2 = r2.execute()
            okhttp3.Headers r2 = r2.headers()
            java.util.Map r2 = r2.toMultimap()
            if (r2 != 0) goto L2c
            goto L4b
        L2c:
            java.lang.String r3 = "location"
            boolean r0 = r2.containsKey(r3)
            r1 = 0
            if (r0 == 0) goto L36
            goto L3e
        L36:
            java.lang.String r3 = "Location"
            boolean r0 = r2.containsKey(r3)
            if (r0 == 0) goto L4b
        L3e:
            java.lang.Object r2 = r2.get(r3)
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            goto L4c
        L4b:
            r2 = 0
        L4c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.k.C0575b.b(java.lang.String, java.util.Map):java.lang.String");
    }

    public static Response c(String str) {
        return a().newCall(new Request.Builder().url(str).build()).execute();
    }

    public static Response d(String str, Map<String, String> map) {
        return a().newCall(new Request.Builder().url(str).headers(Headers.of(map)).build()).execute();
    }

    public static OkHttpClient e() {
        return a().newBuilder().followRedirects(false).followSslRedirects(false).build();
    }

    public static C0577d f(String str, String str2, Map<String, String> map) {
        return new C0576c(str, str2, map).a(a());
    }

    public static C0577d g(String str, Map<String, String> map, Map<String, String> map2) {
        return new C0576c("POST", str, map, map2).a(a());
    }

    public static String h(String str, String str2) {
        return f(str, str2, null).a();
    }

    public static String i(Map map) {
        return new C0576c("POST", "https://passport.aliyundrive.com/newlogin/qrcode/query.do?appName=aliyun_drive&fromSite=52&_bx-v=2.2.3", (Map<String, String>) map, (Map<String, String>) null).a(a()).a();
    }

    public static C0577d j(OkHttpClient okHttpClient, String str, Map map, Map map2, Map map3) {
        C0576c c0576c = new C0576c(str, map, map2, map3);
        c0576c.b();
        return c0576c.a(okHttpClient);
    }

    public static String k(String str) {
        return l(str, null);
    }

    public static String l(String str, Map<String, String> map) {
        return str.startsWith("http") ? new C0576c("GET", str, (Map<String, String>) null, map).a(a()).a() : "";
    }
}
