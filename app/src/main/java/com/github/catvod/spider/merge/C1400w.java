package com.github.catvod.spider.merge;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1400w {
    private static final Object a = new Object();
    private static OkHttpClient b;

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
                X509TrustManager x509TrustManager = C1408y.d;
                b = builderRetryOnConnectionFailure.sslSocketFactory(new C1408y(x509TrustManager), x509TrustManager).build();
            }
            okHttpClient = b;
        }
        return okHttpClient;
    }

    public static void c(OkHttpClient okHttpClient, String str, Map map, t tVar) {
        new C1391u("GET", str, null, map, tVar).a(okHttpClient);
    }

    public static void d(OkHttpClient okHttpClient, String str, Map<String, String> map, Map<String, String> map2, t tVar) {
        new C1391u("POST", str, map, map2, tVar).a(okHttpClient);
    }

    public static void e(OkHttpClient okHttpClient, String str, String str2, Map<String, String> map, t tVar) {
        new C1391u(str, str2, map, tVar).a(okHttpClient);
    }

    public static String f(String str, Map<String, String> map) {
        return g(b(), str, null, map, null);
    }

    public static String g(OkHttpClient okHttpClient, String str, String str2, Map map, Map map2) {
        v vVar = new v(map2);
        C1391u c1391u = new C1391u("GET", str, null, map, vVar);
        c1391u.b(str2);
        c1391u.a(okHttpClient);
        return vVar.getResult();
    }
}
