package com.github.catvod.spider.merge.f0;

import android.net.Uri;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.I.t0;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.X509TrustManager;
import okhttp3.Authenticator;
import okhttp3.Credentials;
import okhttp3.Dns;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class d {
    private final OkHttpClient a;
    private final OkHttpClient b;

    public d() {
        Uri uri;
        Dns dns;
        try {
            uri = (Uri) Spider.class.getMethod("proxy", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            uri = null;
        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        try {
            dns = (Dns) Spider.class.getMethod("safeDns", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused2) {
            dns = Dns.SYSTEM;
        }
        OkHttpClient.Builder builderDns = builder.dns(dns);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderConnectTimeout = builderDns.readTimeout(5L, timeUnit).writeTimeout(5L, timeUnit).connectTimeout(5L, timeUnit);
        X509TrustManager x509TrustManager = l.d;
        OkHttpClient.Builder builderSslSocketFactory = builderConnectTimeout.hostnameVerifier(j.a).sslSocketFactory(new l(), l.d);
        if (uri != null && uri.getScheme() != null && uri.getHost() != null && uri.getPort() > 0) {
            final String userInfo = uri.getUserInfo();
            if (uri.getScheme() == null || uri.getScheme().startsWith("socks")) {
                builderSslSocketFactory.proxy(new Proxy(Proxy.Type.SOCKS, InetSocketAddress.createUnresolved(uri.getHost(), uri.getPort())));
            } else if (uri.getScheme().startsWith("http")) {
                builderSslSocketFactory.proxy(new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(uri.getHost(), uri.getPort())));
                if (userInfo != null && userInfo.contains(":")) {
                    builderSslSocketFactory.proxyAuthenticator(new Authenticator() { // from class: com.github.catvod.spider.merge.f0.a
                        public final Request authenticate(Route route, Response response) {
                            String str = userInfo;
                            return response.request().newBuilder().header("Proxy-Authorization", Credentials.basic(str.split(":")[0], str.split(":")[1])).build();
                        }
                    });
                }
            }
        }
        OkHttpClient okHttpClientBuild = builderSslSocketFactory.addInterceptor(new C1084c()).build();
        this.b = okHttpClientBuild;
        this.a = okHttpClientBuild.newBuilder().followRedirects(false).followSslRedirects(false).build();
    }

    public static OkHttpClient a() {
        return C1083b.a.b;
    }

    public static HashMap<String, String> b() {
        return t0.c("User-Agent", "netdisk;1.4.2;22021211RC;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        if (r2.containsKey("Location") != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(java.lang.String r2, java.util.Map<java.lang.String, java.lang.String> r3) {
        /*
            com.github.catvod.spider.merge.f0.d r0 = com.github.catvod.spider.merge.f0.C1083b.a
            okhttp3.OkHttpClient r0 = r0.a
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
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f0.d.c(java.lang.String, java.util.Map):java.lang.String");
    }

    public static Response d(String str) {
        return C1083b.a.b.newCall(new Request.Builder().url(str).build()).execute();
    }

    public static Response e(String str, Map<String, String> map) {
        return C1083b.a.b.newCall(new Request.Builder().url(str).headers(Headers.of(map)).build()).execute();
    }

    public static i f(String str, String str2, Map<String, String> map) {
        return new h(str, str2, map).a(C1083b.a.b);
    }

    public static String g(String str, Map<String, String> map, Map<String, String> map2) {
        return n(C1083b.a.b, "POST", str, map, map2, null);
    }

    public static String h(String str, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        return n(C1083b.a.b, "POST", str, map, map2, map3);
    }

    public static String i(String str, String str2, Map<String, String> map) {
        OkHttpClient okHttpClient = C1083b.a.b;
        SpiderDebug.log("get电影天堂: postForm" + str2 + "content:" + str);
        try {
            Response responseExecute = okHttpClient.newCall(new Request.Builder().url(str2).headers(Headers.of(map)).post(RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"), str)).build()).execute();
            if (!responseExecute.isSuccessful()) {
                SpiderDebug.log("Request failed with status code: " + responseExecute.code());
                return null;
            }
            String strString = responseExecute.body().string();
            SpiderDebug.log("Response data: " + strString);
            return strString;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static i j(String str, String str2, Map<String, String> map) {
        return new h(str, str2, map).a(C1083b.a.b);
    }

    public static i k(String str, String str2, Map<String, String> map, Map<String, List<String>> map2) {
        return new h(str, str2, map, map2).a(C1083b.a.b);
    }

    public static String l(String str) {
        return m(str, b(), null);
    }

    public static String m(String str, Map<String, String> map, Map<String, List<String>> map2) {
        return n(C1083b.a.b, "GET", str, null, map, map2);
    }

    public static String n(OkHttpClient okHttpClient, String str, String str2, Map map, Map map2, Map map3) {
        h hVar = new h(str, str2, map, map2, map3);
        hVar.b();
        return hVar.a(okHttpClient).a();
    }

    public static String o(String str, Map map, Map map2) {
        return n(C1083b.a.b, "GET", str, null, map, map2);
    }

    public static void p(String str, Map<String, String> map, Map<String, List<String>> map2) {
        n(C1083b.a.a, "GET", str, null, map, map2);
    }

    public static String q(String str, long j) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        try {
            Response responseExecute = builder.connectTimeout(j, timeUnit).readTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).build().newCall(new Request.Builder().url(str).get().build()).execute();
            return responseExecute.isSuccessful() ? responseExecute.body().string() : responseExecute.body().string();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
