package com.github.catvod.spider.merge.A0;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class yi {
    public static OkHttpClient b;
    public static final Object a = new Object();
    public static final HashMap c = new HashMap();
    public static OkHttpClient d = null;

    public static void e() {
        OkHttpClient okHttpClientF = f();
        if (okHttpClientF != null) {
            for (Call call : okHttpClientF.dispatcher().queuedCalls()) {
                if ("p_json_parse".equals(call.request().tag())) {
                    call.cancel();
                }
            }
            for (Call call2 : okHttpClientF.dispatcher().runningCalls()) {
                if ("p_json_parse".equals(call2.request().tag())) {
                    call2.cancel();
                }
            }
        }
    }

    public static OkHttpClient f() {
        OkHttpClient okHttpClient;
        synchronized (a) {
            try {
                if (b == null) {
                    OkHttpClient.Builder builderCookieJar = new OkHttpClient.Builder().cookieJar(new jo(21));
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    OkHttpClient.Builder builderRetryOnConnectionFailure = builderCookieJar.readTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).connectTimeout(10L, timeUnit).retryOnConnectionFailure(true);
                    cn cnVar = abr.b;
                    b = builderRetryOnConnectionFailure.sslSocketFactory(new abr(cnVar), cnVar).build();
                }
                okHttpClient = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return okHttpClient;
    }

    public static void g(OkHttpClient okHttpClient, String str, HashMap map, ya yaVar) {
        new Cdo("GET", str, null, null, map, yaVar).f(okHttpClient);
    }

    public static String h(AbstractMap abstractMap) {
        if (abstractMap.containsKey("location")) {
            return (String) ((List) abstractMap.get("location")).get(0);
        }
        if (abstractMap.containsKey("Location")) {
            return (String) ((List) abstractMap.get("Location")).get(0);
        }
        return null;
    }

    public static void i(OkHttpClient okHttpClient, String str, HashMap map, HashMap map2, xh xhVar) {
        new Cdo("POST", str, null, map, map2, xhVar).f(okHttpClient);
    }

    public static void j(OkHttpClient okHttpClient, String str, String str2, HashMap map, xh xhVar) {
        new Cdo("POST", str, str2, null, map, xhVar).f(okHttpClient);
    }

    public static String k(String str, HashMap map) {
        return m(f(), str, null, map, null);
    }

    public static String l(String str, HashMap map, HashMap map2) {
        return m(f(), str, null, map, map2);
    }

    public static String m(OkHttpClient okHttpClient, String str, String str2, HashMap map, AbstractMap abstractMap) {
        oq oqVar = new oq(abstractMap);
        Cdo cdo = new Cdo("GET", str, null, null, map, oqVar);
        cdo.b = str2;
        cdo.f(okHttpClient);
        return (String) oqVar.getResult();
    }

    public static String n(String str, HashMap map, AbstractMap abstractMap) {
        OkHttpClient okHttpClient;
        synchronized (a) {
            try {
                if (d == null) {
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    OkHttpClient.Builder builderRetryOnConnectionFailure = builder.readTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).connectTimeout(10L, timeUnit).followRedirects(false).followSslRedirects(false).retryOnConnectionFailure(true);
                    cn cnVar = abr.b;
                    d = builderRetryOnConnectionFailure.sslSocketFactory(new abr(cnVar), cnVar).build();
                }
                okHttpClient = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return m(okHttpClient, str, null, map, abstractMap);
    }
}
