package com.github.catvod.spider.merge;

import com.github.catvod.crawler.SpiderDebug;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class Yy {
    private static OkHttpClient S;
    private static OkHttpClient T4;
    private static final Object l8 = new Object();
    private static final MediaType b = MediaType.parse("application/x-protobuf");

    static class aA extends xx<String> {
        final /* synthetic */ Map S;

        aA(Map map) {
            this.S = map;
        }

        @Override // com.github.catvod.spider.merge.xx
        public void onFailure(Call call, Exception exc) {
            S("");
            SpiderDebug.log(exc);
        }

        @Override // com.github.catvod.spider.merge.xx
        public String onResponse(String str) {
            return str;
        }

        @Override // com.github.catvod.spider.merge.xx
        public String onParseResponse(Call call, Response response) {
            try {
                Map map = this.S;
                if (map != null) {
                    map.clear();
                    this.S.putAll(response.headers().toMultimap());
                }
                return new String(response.body().bytes(), "GB2312");
            } catch (IOException unused) {
                return "";
            }
        }
    }

    static class ut extends xx<String> {
        final /* synthetic */ Map S;

        ut(Map map) {
            this.S = map;
        }

        @Override // com.github.catvod.spider.merge.xx
        public void onFailure(Call call, Exception exc) {
            S("");
            SpiderDebug.log(exc);
        }

        @Override // com.github.catvod.spider.merge.xx
        public String onResponse(String str) {
            return str;
        }

        @Override // com.github.catvod.spider.merge.xx
        public String onParseResponse(Call call, Response response) {
            try {
                Map map = this.S;
                if (map != null) {
                    map.clear();
                    this.S.putAll(response.headers().toMultimap());
                }
                return response.body().string();
            } catch (IOException unused) {
                return "";
            }
        }
    }

    public static String A(String str, Map<String, String> map, Map<String, List<String>> map2) {
        return cD(T4(), str, null, null, map, map2);
    }

    public static void HM(OkHttpClient okHttpClient, String str, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        new H("POST", str, map, map2, map3).l8(okHttpClient);
    }

    public static String Kf(String str, Map<String, String> map, Map<String, List<String>> map2) {
        return cD(l(), str, null, null, map, map2);
    }

    public static void N(OkHttpClient okHttpClient, String str, String str2, Map<String, String> map, xx xxVar) {
        new vV("POST", str, str2, map, xxVar).l8(okHttpClient);
    }

    public static String OL(Map<String, List<String>> map) {
        if (map == null) {
            return null;
        }
        if (map.containsKey("location")) {
            return map.get("location").get(0);
        }
        if (map.containsKey("Location")) {
            return map.get("Location").get(0);
        }
        return null;
    }

    public static void S(OkHttpClient okHttpClient, Object obj) {
        if (okHttpClient == null || obj == null) {
            return;
        }
        for (Call call : okHttpClient.dispatcher().queuedCalls()) {
            if (obj.equals(call.request().tag())) {
                call.cancel();
            }
        }
        for (Call call2 : okHttpClient.dispatcher().runningCalls()) {
            if (obj.equals(call2.request().tag())) {
                call2.cancel();
            }
        }
    }

    public static OkHttpClient T4() {
        OkHttpClient okHttpClient;
        synchronized (l8) {
            if (S == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                OkHttpClient.Builder builderRetryOnConnectionFailure = builder.readTimeout(15L, timeUnit).writeTimeout(15L, timeUnit).connectTimeout(15L, timeUnit).retryOnConnectionFailure(true);
                X509TrustManager x509TrustManager = Cj.T4;
                S = builderRetryOnConnectionFailure.sslSocketFactory(new Cj(x509TrustManager), x509TrustManager).build();
            }
            okHttpClient = S;
        }
        return okHttpClient;
    }

    public static void b(OkHttpClient okHttpClient, String str, Map<String, String> map, Map<String, String> map2, xx xxVar) {
        new vV("GET", str, map, map2, xxVar).l8(okHttpClient);
    }

    public static String cD(OkHttpClient okHttpClient, String str, String str2, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        ut utVar = new ut(map3);
        vV vVVar = new vV("GET", str, map, map2, utVar);
        vVVar.l(str2);
        vVVar.l8(okHttpClient);
        return utVar.getResult();
    }

    public static String hR(OkHttpClient okHttpClient, String str, String str2, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        aA aAVar = new aA(map3);
        vV vVVar = new vV("GET", str, map, map2, aAVar);
        vVVar.l(str2);
        vVVar.l8(okHttpClient);
        return aAVar.getResult();
    }

    public static OkHttpClient l() {
        OkHttpClient okHttpClient;
        synchronized (l8) {
            if (T4 == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                OkHttpClient.Builder builderRetryOnConnectionFailure = builder.readTimeout(15L, timeUnit).writeTimeout(15L, timeUnit).connectTimeout(15L, timeUnit).followRedirects(false).followSslRedirects(false).retryOnConnectionFailure(true);
                X509TrustManager x509TrustManager = Cj.T4;
                T4 = builderRetryOnConnectionFailure.sslSocketFactory(new Cj(x509TrustManager), x509TrustManager).build();
            }
            okHttpClient = T4;
        }
        return okHttpClient;
    }

    public static void l8(Object obj) {
        S(T4(), obj);
    }

    public static String n(String str, String str2, Map<String, String> map) {
        return cD(T4(), str, str2, null, map, null);
    }

    public static String s(String str, Map<String, String> map) {
        return hR(T4(), str, null, null, map, null);
    }

    public static void tT(OkHttpClient okHttpClient, String str, Map<String, String> map, Map<String, String> map2, xx xxVar) {
        new vV("POST", str, map, map2, xxVar).l8(okHttpClient);
    }

    public static String v(String str, Map<String, String> map) {
        return cD(T4(), str, null, null, map, null);
    }
}
