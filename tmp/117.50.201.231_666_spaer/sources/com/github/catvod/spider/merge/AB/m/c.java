package com.github.catvod.spider.merge.AB.m;

import com.github.catvod.crawler.Spider;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import okhttp3.Dns;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class c {
    public static final String b = "POST";
    public static final String c = "GET";
    private OkHttpClient a;

    public static OkHttpClient a() {
        Dns dnsSafeDns;
        if (b.a.a != null) {
            return b.a.a;
        }
        c cVar = b.a;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        try {
            dnsSafeDns = Spider.safeDns();
            dnsSafeDns.getClass();
        } catch (Throwable unused) {
            dnsSafeDns = Dns.SYSTEM;
        }
        OkHttpClient.Builder builderDns = builder.dns(dnsSafeDns);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient okHttpClientBuild = builderDns.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).hostnameVerifier(new HostnameVerifier() { // from class: com.github.catvod.spider.merge.AB.m.a
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                String str2 = c.b;
                return true;
            }
        }).sslSocketFactory(new g(), g.d).build();
        cVar.a = okHttpClientBuild;
        return okHttpClientBuild;
    }

    public static e b(String str, Map<String, String> map) {
        return new d(c, str, (Map<String, String>) null, map).a(a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        if (r2.containsKey("Location") != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(java.lang.String r2, java.util.Map<java.lang.String, java.lang.String> r3) {
        /*
            okhttp3.OkHttpClient r0 = f()
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
            if (r0 == 0) goto L35
            goto L3d
        L35:
            java.lang.String r3 = "Location"
            boolean r0 = r2.containsKey(r3)
            if (r0 == 0) goto L4b
        L3d:
            java.lang.Object r2 = r2.get(r3)
            java.util.List r2 = (java.util.List) r2
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            goto L4c
        L4b:
            r2 = 0
        L4c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.AB.m.c.c(java.lang.String, java.util.Map):java.lang.String");
    }

    public static Response d(String str) {
        return a().newCall(new Request.Builder().url(str).build()).execute();
    }

    public static Response e(String str, Map<String, String> map) {
        return a().newCall(new Request.Builder().url(str).headers(Headers.of(map)).build()).execute();
    }

    public static OkHttpClient f() {
        return a().newBuilder().followRedirects(false).followSslRedirects(false).build();
    }

    public static e g(String str, String str2, Map<String, String> map) {
        return new d(b, str, str2, map).a(a());
    }

    public static e h(String str, Map<String, String> map, Map<String, String> map2) {
        return new d(b, str, map, map2).a(a());
    }

    public static String i(String str, Map<String, String> map) {
        return new d(b, str, map, (Map<String, String>) null).a(a()).a();
    }

    public static e j(OkHttpClient okHttpClient, String str, Map map, Map map2) {
        return new d(c, str, (Map<String, String>) map, (Map<String, String>) map2).a(okHttpClient);
    }

    public static String k(String str) {
        return l(str, null);
    }

    public static String l(String str, Map<String, String> map) {
        return str.startsWith("http") ? new d(c, str, (Map<String, String>) null, map).a(a()).a() : "";
    }
}
