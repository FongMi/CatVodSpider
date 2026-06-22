package com.github.catvod.spider.merge;

import com.github.catvod.crawler.SpiderDebug;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ތ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0295 {

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private static OkHttpClient f728;

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static final Object f727 = new Object();

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static HashMap<String, List<Cookie>> f729 = new HashMap<>();

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private static OkHttpClient f730 = null;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ތ$Ϳ, reason: contains not printable characters */
    class C0296 implements CookieJar {
        C0296() {
        }

        public List<Cookie> loadForRequest(HttpUrl httpUrl) {
            List<Cookie> list = C0295.f729.get(httpUrl.host());
            return list != null ? list : new ArrayList();
        }

        public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
            C0295.f729.put(httpUrl.host(), list);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ތ$Ԩ, reason: contains not printable characters */
    class C0297 extends AbstractC0291<String> {

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        final /* synthetic */ Map f731;

        C0297(Map map) {
            this.f731 = map;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0291
        public void onFailure(Call call, Exception exc) {
            m1073("");
            SpiderDebug.log(exc);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0291
        public void onResponse(String str) {
        }

        @Override // com.github.catvod.spider.merge.AbstractC0291
        public String onParseResponse(Call call, Response response) {
            try {
                Map map = this.f731;
                if (map != null) {
                    map.clear();
                    this.f731.putAll(response.headers().toMultimap());
                }
                return response.body().string();
            } catch (IOException unused) {
                return "";
            }
        }
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static void m1080(Object obj) {
        m1081(m1082(), obj);
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static void m1081(OkHttpClient okHttpClient, Object obj) {
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

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static OkHttpClient m1082() {
        OkHttpClient okHttpClient;
        synchronized (f727) {
            if (f728 == null) {
                OkHttpClient.Builder builderCookieJar = new OkHttpClient.Builder().cookieJar(new C0296());
                TimeUnit timeUnit = TimeUnit.SECONDS;
                OkHttpClient.Builder builderRetryOnConnectionFailure = builderCookieJar.readTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).connectTimeout(10L, timeUnit).retryOnConnectionFailure(true);
                X509TrustManager x509TrustManager = C0298.f734;
                f728 = builderRetryOnConnectionFailure.sslSocketFactory(new C0298(x509TrustManager), x509TrustManager).build();
            }
            okHttpClient = f728;
        }
        return okHttpClient;
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public static void m1083(OkHttpClient okHttpClient, String str, Map<String, String> map, Map<String, String> map2, AbstractC0291 abstractC0291) {
        new C0294(SOY.d("3D1705"), str, map, map2, abstractC0291).m1078(okHttpClient);
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public static String m1084(Map<String, List<String>> map) {
        if (map == null) {
            return null;
        }
        String strD = SOY.d("163D3217001E153C");
        if (map.containsKey(strD)) {
            return map.get(strD).get(0);
        }
        String strD2 = SOY.d("363D3217001E153C");
        if (map.containsKey(strD2)) {
            return map.get(strD2).get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public static OkHttpClient m1085() {
        OkHttpClient okHttpClient;
        synchronized (f727) {
            if (f730 == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                OkHttpClient.Builder builderRetryOnConnectionFailure = builder.readTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).connectTimeout(10L, timeUnit).followRedirects(false).followSslRedirects(false).retryOnConnectionFailure(true);
                X509TrustManager x509TrustManager = C0298.f734;
                f730 = builderRetryOnConnectionFailure.sslSocketFactory(new C0298(x509TrustManager), x509TrustManager).build();
            }
            okHttpClient = f730;
        }
        return okHttpClient;
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public static void m1086(OkHttpClient okHttpClient, String str, Map<String, String> map, Map<String, String> map2, AbstractC0291 abstractC0291) {
        new C0294(SOY.d("2A1D0222"), str, map, map2, abstractC0291).m1078(okHttpClient);
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public static void m1087(OkHttpClient okHttpClient, String str, String str2, Map<String, String> map, AbstractC0291 abstractC0291) {
        new C0294(SOY.d("2A1D0222"), str, str2, map, abstractC0291).m1078(okHttpClient);
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    public static String m1088(String str, String str2, Map<String, String> map) {
        return m1091(m1082(), str, str2, null, map, null);
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public static String m1089(String str, Map<String, String> map) {
        return m1091(m1082(), str, null, null, map, null);
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    public static String m1090(String str, Map<String, String> map, Map<String, List<String>> map2) {
        return m1091(m1082(), str, null, null, map, map2);
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    public static String m1091(OkHttpClient okHttpClient, String str, String str2, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        C0297 c0297 = new C0297(map3);
        C0294 c0294 = new C0294(SOY.d("3D1705"), str, map, map2, c0297);
        c0294.m1079(str2);
        c0294.m1078(okHttpClient);
        return c0297.getResult();
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    public static String m1092(String str, Map<String, String> map, Map<String, List<String>> map2) {
        return m1091(m1085(), str, null, null, map, map2);
    }
}
