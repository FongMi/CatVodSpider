package com.github.catvod.spider.merge.K0;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class StringUtils {
    private static final Object a = new Object();
    private static OkHttpClient b;
    private static OkHttpClient c;

    public static void a() {
        OkHttpClient okHttpClientB = b();
        if (okHttpClientB != null) {
            for (Call call : okHttpClientB.dispatcher().queuedCalls()) {
                if ("p_json_parse".equals(call.request().tag())) {
                    call.cancel();
                }
            }
            for (Call call2 : okHttpClientB.dispatcher().runningCalls()) {
                if ("p_json_parse".equals(call2.request().tag())) {
                    call2.cancel();
                }
            }
        }
    }

    public static OkHttpClient b() {
        OkHttpClient okHttpClient;
        synchronized (a) {
            if (b == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                OkHttpClient.Builder builderRetryOnConnectionFailure = builder.readTimeout(15L, timeUnit).writeTimeout(15L, timeUnit).connectTimeout(15L, timeUnit).retryOnConnectionFailure(true);
                X509TrustManager x509TrustManager = g.d;
                b = builderRetryOnConnectionFailure.sslSocketFactory(new g(x509TrustManager), x509TrustManager).build();
            }
            okHttpClient = b;
        }
        return okHttpClient;
    }

    public static void c(OkHttpClient okHttpClient, String str, Map map, com.github.catvod.spider.merge.k0.AbstractC1279b abstractC1279b) {
        new com.github.catvod.spider.merge.k0.C1280c(str, map, abstractC1279b).a(okHttpClient);
    }

    public static String d(String str, Map<String, String> map) {
        return e(b(), str, null, map, null);
    }

    public static String e(OkHttpClient okHttpClient, String str, String str2, Map map, Map map2) {
        C1281d c1281d = new C1281d(map2);
        C1280c c1280c = new C1280c(str, map, c1281d);
        c1280c.b(str2);
        c1280c.a(okHttpClient);
        return c1281d.getResult();
    }

    public static String f(String str, Map<String, String> map, Map<String, List<String>> map2) {
        OkHttpClient okHttpClient;
        synchronized (a) {
            if (c == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                OkHttpClient.Builder builderRetryOnConnectionFailure = builder.readTimeout(15L, timeUnit).writeTimeout(15L, timeUnit).connectTimeout(15L, timeUnit).followRedirects(false).followSslRedirects(false).retryOnConnectionFailure(true);
                X509TrustManager x509TrustManager = g.d;
                c = builderRetryOnConnectionFailure.sslSocketFactory(new g(x509TrustManager), x509TrustManager).build();
            }
            okHttpClient = c;
        }
        return e(okHttpClient, str, null, map, map2);
    }
}
