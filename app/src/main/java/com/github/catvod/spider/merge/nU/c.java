package com.github.catvod.spider.merge.nU;

import com.github.catvod.crawler.Spider;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import okhttp3.Dns;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class c {
    public static final String b = com.github.catvod.spider.merge.XI.f.a(new byte[]{7, 20, 41, 65}, new byte[]{87, 91, 122, 21, 11, 63, 67, -5});
    public static final String c = com.github.catvod.spider.merge.XI.f.a(new byte[]{29, -72, -75}, new byte[]{90, -3, -31, 115, -109, -86, 116, 81});
    private OkHttpClient a;

    public static OkHttpClient a() {
        Dns dnsSafeDns;
        if (b.a.a != null) {
            return b.a.a;
        }
        c cVar = b.a;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        try {
            dnsSafeDns = Spider.safeDns();
            dnsSafeDns.getClass();
        } catch (Throwable unused) {
            dnsSafeDns = Dns.SYSTEM;
        }
        OkHttpClient.Builder builderDns = builder.dns(dnsSafeDns);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient okHttpClientBuild = builderDns.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).hostnameVerifier(new HostnameVerifier() { // from class: com.github.catvod.spider.merge.nU.a
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                String str2 = c.b;
                return true;
            }
        }).sslSocketFactory(new g(), g.d).build();
        cVar.a = okHttpClientBuild;
        return okHttpClientBuild;
    }

    public static e b(String str, Map<String, String> map) {
        return new d(c, str, (Map<String, String>) null, map).a(a());
    }

    public static String c(String str, Map<String, String> map) {
        String strA;
        Map multimap = f().newCall(new Request.Builder().url(str).headers(Headers.of(map)).build()).execute().headers().toMultimap();
        if (multimap != null) {
            if (multimap.containsKey(com.github.catvod.spider.merge.XI.f.a(new byte[]{-69, -112, 13, -12, -41, -124, -14, 60}, new byte[]{-41, -1, 110, -107, -93, -19, -99, 82}))) {
                strA = com.github.catvod.spider.merge.XI.f.a(new byte[]{23, 70, 14, 111, 47, -124, 5, -88}, new byte[]{123, 41, 109, 14, 91, -19, 106, -58});
            } else if (multimap.containsKey(com.github.catvod.spider.merge.XI.f.a(new byte[]{76, -15, -102, 38, 45, -40, -16, -96}, new byte[]{0, -98, -7, 71, 89, -79, -97, -50}))) {
                strA = com.github.catvod.spider.merge.XI.f.a(new byte[]{-85, 121, -70, 21, 126, -50, -127, -68}, new byte[]{-25, 22, -39, 116, 10, -89, -18, -46});
            }
            return (String) ((List) multimap.get(strA)).get(0);
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

    public static e g(String str, String str2, Map<String, String> map) {
        return new d(b, str, str2, map).a(a());
    }

    public static e h(String str, Map<String, String> map, Map<String, String> map2) {
        return new d(b, str, map, map2).a(a());
    }

    public static String i(String str, Map<String, String> map) {
        return new d(b, str, map, (Map<String, String>) null).a(a()).a();
    }

    public static e j(OkHttpClient okHttpClient, String str, Map map, Map map2) {
        return new d(c, str, (Map<String, String>) map, (Map<String, String>) map2).a(okHttpClient);
    }

    public static String k(String str) {
        return l(str, null);
    }

    public static String l(String str, Map<String, String> map) {
        return str.startsWith(com.github.catvod.spider.merge.XI.f.a(new byte[]{-40, 10, 63, -103}, new byte[]{-80, 126, 75, -23, 54, 7, -22, 74})) ? new d(c, str, (Map<String, String>) null, map).a(a()).a() : "";
    }
}
