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

/* renamed from: com.github.catvod.spider.merge.ZJ */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0106ZJ {

    /* renamed from: QU */
    private static OkHttpClient f557QU;

    /* renamed from: xC */
    private static OkHttpClient f560xC;

    /* renamed from: q */
    private static final Object f559q = new Object();

    /* renamed from: UJ */
    private static final MediaType f558UJ = MediaType.parse("application/x-protobuf");

    /* renamed from: com.github.catvod.spider.merge.ZJ$Qe */
    static class Qe extends AbstractC0099V3<String> {

        /* renamed from: xC */
        final /* synthetic */ Map f561xC;

        Qe(Map map) {
            this.f561xC = map;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0099V3
        public void onFailure(Call call, Exception exc) {
            m469xC("");
            SpiderDebug.log(exc);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0099V3
        public String onResponse(String str) {
            return str;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0099V3
        public String onParseResponse(Call call, Response response) {
            try {
                Map map = this.f561xC;
                if (map != null) {
                    map.clear();
                    this.f561xC.putAll(response.headers().toMultimap());
                }
                return response.body().string();
            } catch (IOException unused) {
                return "";
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.ZJ$p */
    static class p extends AbstractC0099V3<String> {

        /* renamed from: xC */
        final /* synthetic */ Map f562xC;

        p(Map map) {
            this.f562xC = map;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0099V3
        public void onFailure(Call call, Exception exc) {
            m469xC("");
            SpiderDebug.log(exc);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0099V3
        public String onResponse(String str) {
            return str;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0099V3
        public String onParseResponse(Call call, Response response) {
            try {
                Map map = this.f562xC;
                if (map != null) {
                    map.clear();
                    this.f562xC.putAll(response.headers().toMultimap());
                }
                return new String(response.body().bytes(), "GB2312");
            } catch (IOException unused) {
                return "";
            }
        }
    }

    /* renamed from: B */
    public static String m482B(String str, Map<String, String> map, Map<String, List<String>> map2) {
        return m496w8(m488QU(), str, null, null, map, map2);
    }

    /* renamed from: F */
    public static String m483F(String str, Map<String, String> map) {
        return m489RH(m488QU(), str, null, null, map, null);
    }

    /* renamed from: FN */
    public static String m484FN(String str, Map<String, String> map) {
        return m496w8(m488QU(), str, null, null, map, null);
    }

    /* renamed from: KT */
    public static String m485KT(String str, Map<String, String> map, Map<String, List<String>> map2) {
        return m496w8(m487Mo(), str, null, null, map, map2);
    }

    /* renamed from: MH */
    public static void m486MH(OkHttpClient okHttpClient, String str, String str2, Map<String, String> map, AbstractC0099V3 abstractC0099V3) {
        new C0107ZM("POST", str, str2, map, abstractC0099V3).m503q(okHttpClient);
    }

    /* renamed from: Mo */
    public static OkHttpClient m487Mo() {
        OkHttpClient okHttpClient;
        synchronized (f559q) {
            if (f557QU == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                OkHttpClient.Builder builderRetryOnConnectionFailure = builder.readTimeout(15L, timeUnit).writeTimeout(15L, timeUnit).connectTimeout(15L, timeUnit).followRedirects(false).followSslRedirects(false).retryOnConnectionFailure(true);
                X509TrustManager x509TrustManager = C0151v2.f744QU;
                f557QU = builderRetryOnConnectionFailure.sslSocketFactory(new C0151v2(x509TrustManager), x509TrustManager).build();
            }
            okHttpClient = f557QU;
        }
        return okHttpClient;
    }

    /* renamed from: QU */
    public static OkHttpClient m488QU() {
        OkHttpClient okHttpClient;
        synchronized (f559q) {
            if (f560xC == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                OkHttpClient.Builder builderRetryOnConnectionFailure = builder.readTimeout(15L, timeUnit).writeTimeout(15L, timeUnit).connectTimeout(15L, timeUnit).retryOnConnectionFailure(true);
                X509TrustManager x509TrustManager = C0151v2.f744QU;
                f560xC = builderRetryOnConnectionFailure.sslSocketFactory(new C0151v2(x509TrustManager), x509TrustManager).build();
            }
            okHttpClient = f560xC;
        }
        return okHttpClient;
    }

    /* renamed from: RH */
    public static String m489RH(OkHttpClient okHttpClient, String str, String str2, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        p pVar = new p(map3);
        C0107ZM c0107zm = new C0107ZM("GET", str, map, map2, pVar);
        c0107zm.m502Mo(str2);
        c0107zm.m503q(okHttpClient);
        return pVar.getResult();
    }

    /* renamed from: UJ */
    public static void m490UJ(OkHttpClient okHttpClient, String str, Map<String, String> map, Map<String, String> map2, AbstractC0099V3 abstractC0099V3) {
        new C0107ZM("GET", str, map, map2, abstractC0099V3).m503q(okHttpClient);
    }

    /* renamed from: W */
    public static String m491W(String str, String str2, Map<String, String> map) {
        return m496w8(m488QU(), str, str2, null, map, null);
    }

    /* renamed from: i */
    public static void m492i(OkHttpClient okHttpClient, String str, Map<String, String> map, Map<String, String> map2, AbstractC0099V3 abstractC0099V3) {
        new C0107ZM("POST", str, map, map2, abstractC0099V3).m503q(okHttpClient);
    }

    /* renamed from: q */
    public static void m493q(Object obj) {
        m497xC(m488QU(), obj);
    }

    /* renamed from: se */
    public static void m494se(OkHttpClient okHttpClient, String str, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        new C0083Os("POST", str, map, map2, map3).m334q(okHttpClient);
    }

    /* renamed from: u */
    public static String m495u(Map<String, List<String>> map) {
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

    /* renamed from: w8 */
    public static String m496w8(OkHttpClient okHttpClient, String str, String str2, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        Qe qe = new Qe(map3);
        C0107ZM c0107zm = new C0107ZM("GET", str, map, map2, qe);
        c0107zm.m502Mo(str2);
        c0107zm.m503q(okHttpClient);
        return qe.getResult();
    }

    /* renamed from: xC */
    public static void m497xC(OkHttpClient okHttpClient, Object obj) {
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
}
