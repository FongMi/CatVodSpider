package com.github.catvod.spider.merge.C0.k;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.Cookie;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class g {
    private static OkHttpClient b;
    private static OkHttpClient c;
    private static final Object a = new Object();
    public static HashMap<String, List<Cookie>> d = new HashMap<>();

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
                OkHttpClient.Builder builderCookieJar = new OkHttpClient.Builder().cookieJar(new e());
                TimeUnit timeUnit = TimeUnit.SECONDS;
                OkHttpClient.Builder builderRetryOnConnectionFailure = builderCookieJar.readTimeout(15L, timeUnit).writeTimeout(15L, timeUnit).connectTimeout(15L, timeUnit).retryOnConnectionFailure(true);
                X509TrustManager x509TrustManager = i.d;
                b = builderRetryOnConnectionFailure.sslSocketFactory(new i(x509TrustManager), x509TrustManager).build();
            }
            okHttpClient = b;
        }
        return okHttpClient;
    }

    public static void c(OkHttpClient okHttpClient, String str, Map map, c cVar) {
        new d("GET", str, null, map, cVar).a(okHttpClient);
    }

    public static String d(Map<String, List<String>> map) {
        String str = "location";
        if (!map.containsKey("location")) {
            str = "Location";
            if (!map.containsKey("Location")) {
                return null;
            }
        }
        return map.get(str).get(0);
    }

    public static void e(OkHttpClient okHttpClient, String str, Map<String, String> map, Map<String, String> map2, c cVar) {
        new d("POST", str, map, map2, cVar).a(okHttpClient);
    }

    public static void f(OkHttpClient okHttpClient, String str, String str2, Map<String, String> map, c cVar) {
        new d(str, str2, map, cVar).a(okHttpClient);
    }

    public static String g(String str, Map<String, String> map) {
        return i(b(), str, null, map, null);
    }

    public static String h(String str, Map<String, String> map, Map<String, List<String>> map2) {
        return i(b(), str, null, map, map2);
    }

    public static String i(OkHttpClient okHttpClient, String str, String str2, Map map, Map map2) {
        f fVar = new f(map2);
        d dVar = new d("GET", str, null, map, fVar);
        dVar.b(str2);
        dVar.a(okHttpClient);
        return fVar.getResult();
    }

    public static String j(String str, Map<String, String> map, Map<String, List<String>> map2) {
        OkHttpClient okHttpClient;
        synchronized (a) {
            if (c == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                OkHttpClient.Builder builderRetryOnConnectionFailure = builder.readTimeout(15L, timeUnit).writeTimeout(15L, timeUnit).connectTimeout(15L, timeUnit).followRedirects(false).followSslRedirects(false).retryOnConnectionFailure(true);
                X509TrustManager x509TrustManager = i.d;
                c = builderRetryOnConnectionFailure.sslSocketFactory(new i(x509TrustManager), x509TrustManager).build();
            }
            okHttpClient = c;
        }
        return i(okHttpClient, str, null, map, map2);
    }
}
