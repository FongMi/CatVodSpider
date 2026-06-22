package com.github.catvod.spider.merge.n;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.a.C0098a;
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

/* JADX INFO: renamed from: com.github.catvod.spider.merge.n.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0197c {
    public static final String b = C0098a.a(new byte[]{33, 98, 70, 47}, new byte[]{113, 45, 21, 123, 98, -3, -61, -65});
    public static final String c = C0098a.a(new byte[]{-122, 78, -48}, new byte[]{-63, 11, -124, 106, 122, 115, -21, -86});
    private OkHttpClient a;

    public static OkHttpClient a() {
        Dns dnsSafeDns;
        if (C0196b.a.a != null) {
            return C0196b.a.a;
        }
        C0197c c0197c = C0196b.a;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        try {
            dnsSafeDns = Spider.safeDns();
            dnsSafeDns.getClass();
        } catch (Throwable unused) {
            dnsSafeDns = Dns.SYSTEM;
        }
        OkHttpClient.Builder builderDns = builder.dns(dnsSafeDns);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient okHttpClientBuild = builderDns.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).hostnameVerifier(new HostnameVerifier() { // from class: com.github.catvod.spider.merge.n.a
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                String str2 = C0197c.b;
                return true;
            }
        }).sslSocketFactory(new C0201g(), C0201g.d).build();
        c0197c.a = okHttpClientBuild;
        return okHttpClientBuild;
    }

    public static C0199e b(String str, Map<String, String> map) {
        return new C0198d(c, str, (Map<String, String>) null, map).a(a());
    }

    public static String c(String str, Map<String, String> map) {
        String strA;
        Map multimap = f().newCall(new Request.Builder().url(str).headers(Headers.of(map)).build()).execute().headers().toMultimap();
        if (multimap != null) {
            if (multimap.containsKey(C0098a.a(new byte[]{-91, -96, -71, -85, -71, 98, -64, 71}, new byte[]{-55, -49, -38, -54, -51, 11, -81, 41}))) {
                strA = C0098a.a(new byte[]{-71, 6, 45, 95, 87, 120, -122, 105}, new byte[]{-43, 105, 78, 62, 35, 17, -23, 7});
            } else if (multimap.containsKey(C0098a.a(new byte[]{6, -58, 110, 36, 73, -86, 90, -106}, new byte[]{74, -87, 13, 69, 61, -61, 53, -8}))) {
                strA = C0098a.a(new byte[]{-100, 6, -4, 123, -91, -109, -29, -86}, new byte[]{-48, 105, -97, 26, -47, -6, -116, -60});
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

    public static C0199e g(String str, String str2, Map<String, String> map) {
        return new C0198d(b, str, str2, map).a(a());
    }

    public static C0199e h(String str, Map<String, String> map, Map<String, String> map2) {
        return new C0198d(b, str, map, map2).a(a());
    }

    public static String i(String str, Map<String, String> map) {
        return new C0198d(b, str, map, (Map<String, String>) null).a(a()).a();
    }

    public static C0199e j(OkHttpClient okHttpClient, String str, Map map, Map map2) {
        return new C0198d(c, str, (Map<String, String>) map, (Map<String, String>) map2).a(okHttpClient);
    }

    public static String k(String str) {
        return l(str, null);
    }

    public static String l(String str, Map<String, String> map) {
        return str.startsWith(C0098a.a(new byte[]{6, -12, 61, -16}, new byte[]{110, -128, 73, -128, 91, -9, 16, 39})) ? new C0198d(c, str, (Map<String, String>) null, map).a(a()).a() : "";
    }
}
