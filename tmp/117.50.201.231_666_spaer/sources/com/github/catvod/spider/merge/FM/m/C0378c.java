package com.github.catvod.spider.merge.FM.m;

import com.github.catvod.crawler.Spider;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import okhttp3.Dns;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.m.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0378c {
    public static final String b = "POST";
    public static final String c = "GET";
    private OkHttpClient a;

    public static OkHttpClient a() {
        Dns dnsSafeDns;
        if (C0377b.a.a != null) {
            return C0377b.a.a;
        }
        C0378c c0378c = C0377b.a;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        try {
            dnsSafeDns = Spider.safeDns();
            dnsSafeDns.getClass();
        } catch (Throwable unused) {
            dnsSafeDns = Dns.SYSTEM;
        }
        OkHttpClient.Builder builderDns = builder.dns(dnsSafeDns);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient okHttpClientBuild = builderDns.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).hostnameVerifier(new HostnameVerifier() { // from class: com.github.catvod.spider.merge.FM.m.a
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                String str2 = C0378c.b;
                return true;
            }
        }).sslSocketFactory(new C0382g(), C0382g.d).build();
        c0378c.a = okHttpClientBuild;
        return okHttpClientBuild;
    }

    public static C0380e b(String str, Map<String, String> map) {
        return new C0379d(c, str, (Map<String, String>) null, map).a(a());
    }

    public static String c(String str, Map<String, String> map) {
        String str2;
        Map multimap = f().newCall(new Request.Builder().url(str).headers(Headers.of(map)).build()).execute().headers().toMultimap();
        if (multimap != null) {
            if (!multimap.containsKey("location")) {
                str2 = multimap.containsKey("Location") ? "Location" : "location";
            }
            return (String) ((List) multimap.get(str2)).get(0);
        }
        return null;
    }

    public static Response d(String str) {
        return a().newCall(new Request.Builder().url(str).build()).execute();
    }

    public static Response e(String str, Map<String, String> map) {
        return a().newCall(new Request.Builder().url(str).headers(Headers.of(map)).build()).execute();
    }

    public static OkHttpClient f() {
        return a().newBuilder().followRedirects(false).followSslRedirects(false).build();
    }

    public static C0380e g(String str, String str2, Map<String, String> map) {
        return new C0379d(b, str, str2, map).a(a());
    }

    public static C0380e h(String str, Map<String, String> map, Map<String, String> map2) {
        return new C0379d(b, str, map, map2).a(a());
    }

    public static String i(String str, Map<String, String> map) {
        return new C0379d(b, str, map, (Map<String, String>) null).a(a()).a();
    }

    public static Response j(String str, String str2, Map<String, String> map) {
        OkHttpClient okHttpClientA = a();
        Request.Builder builderMethod = new Request.Builder().url(str).method(b, RequestBody.create(MediaType.parse("application/x-www-form-urlencoded; charset=UTF-8"), str2));
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderMethod.addHeader(entry.getKey(), entry.getValue());
        }
        return okHttpClientA.newCall(builderMethod.build()).execute();
    }

    public static Response k(String str, String str2) {
        return a().newCall(new Request.Builder().url(str).method(b, RequestBody.create(MediaType.parse("text/plain"), str2)).addHeader("Content-Type", "text/plain").addHeader("Origin", "url").build()).execute();
    }

    public static C0380e l(OkHttpClient okHttpClient, String str, Map map, Map map2) {
        return new C0379d(c, str, (Map<String, String>) map, (Map<String, String>) map2).a(okHttpClient);
    }

    public static String m(String str) {
        return n(str, null);
    }

    public static String n(String str, Map<String, String> map) {
        return str.startsWith("http") ? new C0379d(c, str, (Map<String, String>) null, map).a(a()).a() : "";
    }
}
