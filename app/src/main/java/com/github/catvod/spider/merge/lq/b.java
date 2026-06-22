package com.github.catvod.spider.merge.lq;

import com.github.catvod.crawler.Spider;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;
import okhttp3.Dns;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class b {
    private final OkHttpClient a;

    public b() {
        Dns dns;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        try {
            dns = (Dns) Spider.class.getMethod("safeDns", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            dns = Dns.SYSTEM;
        }
        OkHttpClient.Builder builderDns = builder.dns(dns);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderConnectTimeout = builderDns.readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).connectTimeout(30L, timeUnit);
        X509TrustManager x509TrustManager = g.b;
        OkHttpClient okHttpClientBuild = builderConnectTimeout.hostnameVerifier(new HostnameVerifier() { // from class: com.github.catvod.spider.merge.lq.e
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                X509TrustManager x509TrustManager2 = g.b;
                return true;
            }
        }).sslSocketFactory(new g(), g.b).build();
        this.a = okHttpClientBuild;
        okHttpClientBuild.newBuilder().followRedirects(false).followSslRedirects(false).build();
    }

    public static Response a(String str) {
        return a.a.a.newCall(new Request.Builder().url(str).build()).execute();
    }

    public static Response b(String str, Map<String, String> map) {
        return a.a.a.newCall(new Request.Builder().url(str).headers(Headers.of(map)).build()).execute();
    }

    public static String c(String str, Map<String, String> map, Map<String, String> map2) {
        return i(a.a.a, "POST", str, map, map2, null);
    }

    public static String d(String str, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        return i(a.a.a, "POST", str, map, map2, map3);
    }

    public static String e(Map map) {
        return i(a.a.a, "POST", "https://passport.aliyundrive.com/newlogin/qrcode/query.do?appName=aliyun_drive&fromSite=52&_bx-v=2.2.3", map, null, null);
    }

    public static d f(String str, String str2, Map<String, String> map) {
        return new c(str, str2, map).a(a.a.a);
    }

    public static String g(String str, Map<String, String> map) {
        return h(str, map, null);
    }

    public static String h(String str, Map<String, String> map, Map<String, List<String>> map2) {
        return i(a.a.a, "GET", str, null, map, map2);
    }

    public static String i(OkHttpClient okHttpClient, String str, String str2, Map map, Map map2, Map map3) {
        c cVar = new c(str, str2, map, map2, map3);
        cVar.b();
        return cVar.a(okHttpClient).a();
    }
}
