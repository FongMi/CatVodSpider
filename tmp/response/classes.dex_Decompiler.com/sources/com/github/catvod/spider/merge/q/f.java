package com.github.catvod.spider.merge.q;

import com.github.catvod.spider.merge.a.C0098a;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class f {
    public static final String a = C0098a.a(new byte[]{-53, -58, -12}, new byte[]{-116, -125, -96, -113, -32, 80, -117, -87});
    public static final String b = C0098a.a(new byte[]{-22, 78, 93, -90}, new byte[]{-70, 1, 14, -14, 120, 34, 70, -20});
    private static final Object c = new Object();
    private static OkHttpClient d = null;

    public static void a(Object obj) {
        OkHttpClient okHttpClientB = b();
        if (okHttpClientB == null || obj == null) {
            return;
        }
        for (Call call : okHttpClientB.dispatcher().queuedCalls()) {
            if (obj.equals(call.request().tag())) {
                call.cancel();
            }
        }
        for (Call call2 : okHttpClientB.dispatcher().runningCalls()) {
            if (obj.equals(call2.request().tag())) {
                call2.cancel();
            }
        }
    }

    public static OkHttpClient b() {
        OkHttpClient okHttpClient;
        synchronized (c) {
            if (d == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                OkHttpClient.Builder builderRetryOnConnectionFailure = builder.readTimeout(15L, timeUnit).writeTimeout(15L, timeUnit).connectTimeout(15L, timeUnit).retryOnConnectionFailure(true);
                X509TrustManager x509TrustManager = h.d;
                d = builderRetryOnConnectionFailure.sslSocketFactory(new h(x509TrustManager), x509TrustManager).build();
            }
            okHttpClient = d;
        }
        return okHttpClient;
    }

    public static void c(OkHttpClient okHttpClient, String str, Map map, AbstractC0224c abstractC0224c) {
        new d(a, str, (Map<String, String>) null, (Map<String, String>) map, abstractC0224c).a(okHttpClient);
    }

    public static void d(OkHttpClient okHttpClient, String str, Map<String, String> map, Map<String, String> map2, AbstractC0224c abstractC0224c) {
        new d(b, str, map, map2, abstractC0224c).a(okHttpClient);
    }

    public static void e(OkHttpClient okHttpClient, String str, String str2, Map<String, String> map, AbstractC0224c abstractC0224c) {
        new d(b, str, str2, map, abstractC0224c).a(okHttpClient);
    }

    public static String f(String str, Map<String, String> map) {
        return g(b(), str, null, map, null);
    }

    public static String g(OkHttpClient okHttpClient, String str, String str2, Map map, Map map2) {
        e eVar = new e(map2);
        d dVar = new d(a, str, (Map<String, String>) null, (Map<String, String>) map, eVar);
        dVar.b(str2);
        dVar.a(okHttpClient);
        return eVar.getResult();
    }
}
