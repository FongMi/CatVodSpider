package com.github.catvod.spider.merge.f0;

import android.net.Uri;
import com.github.catvod.crawler.Spider;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.X509TrustManager;
import okhttp3.Dns;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class g {
    public OkHttpClient a;

    public g() {
        Uri uri = null;
        try {
            uri = (Uri) Spider.class.getMethod("proxy", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
        }
        OkHttpClient okHttpClientBuild = c(uri).addInterceptor(new C1084c()).build();
        this.a = okHttpClientBuild;
        okHttpClientBuild.newBuilder().followRedirects(false).followSslRedirects(false).build();
    }

    public static OkHttpClient a() {
        return f.a.a;
    }

    public static g b() {
        return f.a;
    }

    public static OkHttpClient.Builder c(Uri uri) {
        Dns dns;
        Proxy proxy;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        try {
            dns = (Dns) Spider.class.getMethod("safeDns", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            dns = Dns.SYSTEM;
        }
        OkHttpClient.Builder builderDns = builder.dns(dns);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderConnectTimeout = builderDns.readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).connectTimeout(30L, timeUnit);
        X509TrustManager x509TrustManager = l.d;
        OkHttpClient.Builder builderSslSocketFactory = builderConnectTimeout.hostnameVerifier(j.a).sslSocketFactory(new l(), l.d);
        if (uri != null && uri.getScheme() != null && uri.getHost() != null && uri.getPort() > 0) {
            String userInfo = uri.getUserInfo();
            if (userInfo != null && userInfo.contains(":")) {
                Authenticator.setDefault(new e(userInfo));
            }
            if (uri.getScheme() == null || uri.getScheme().startsWith("socks")) {
                proxy = new Proxy(Proxy.Type.SOCKS, InetSocketAddress.createUnresolved(uri.getHost(), uri.getPort()));
            } else if (uri.getScheme().startsWith("http")) {
                proxy = new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(uri.getHost(), uri.getPort()));
            }
            builderSslSocketFactory.proxy(proxy);
        }
        return builderSslSocketFactory;
    }

    public static Response d(String str) {
        return f.a.a.newCall(new Request.Builder().url(str).build()).execute();
    }

    public static Response e(String str, Map<String, String> map) {
        return f.a.a.newCall(new Request.Builder().url(str).headers(Headers.of(map)).build()).execute();
    }

    public static void f(String str) {
        Authenticator.setDefault(new e(str));
    }

    public static String g(String str, Map<String, String> map) {
        OkHttpClient okHttpClient = f.a.a;
        h hVar = new h("GET", str, null, map, null);
        hVar.b();
        return hVar.a(okHttpClient).a();
    }
}
