package com.github.catvod.spider.merge.AC;

import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import java.io.IOException;
import java.net.Proxy;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import okhttp3.Dns;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class d {
    public static final String c = "POST";
    public static final String d = "GET";
    private OkHttpClient a;
    private OkHttpClient b;

    public static String A(String str, Map<String, String> map) {
        return y(str, null, map);
    }

    public static String B(int i, String str) {
        if (!str.startsWith("http")) {
            return "";
        }
        g gVar = new g(d, str, (HashMap) null, (Map) null);
        OkHttpClient.Builder builderDns = new OkHttpClient.Builder().dns(v());
        long j = i;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return gVar.a(builderDns.connectTimeout(j, timeUnit).readTimeout(j, timeUnit).writeTimeout(j, timeUnit).hostnameVerifier(new a()).sslSocketFactory(new j(), j.d).proxy(Proxy.NO_PROXY).build()).a();
    }

    public static OkHttpClient a() {
        if (c.a.a != null) {
            return c.a.a;
        }
        d dVar = c.a;
        OkHttpClient okHttpClientBuild = d().build();
        dVar.a = okHttpClientBuild;
        return okHttpClientBuild;
    }

    public static Response b(Request request) {
        return new Response.Builder().request(request).protocol(Protocol.HTTP_1_1).code(403).message("").body(ResponseBody.create((MediaType) null, "")).build();
    }

    public static h c(String str, HashMap map) {
        return new g(d, str, (HashMap) null, map).a(d().build());
    }

    private static OkHttpClient.Builder d() {
        OkHttpClient.Builder builderDns = new OkHttpClient.Builder().dns(v());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderHostnameVerifier = builderDns.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).hostnameVerifier(new a());
        SSLContext sSLContext = null;
        try {
            SSLContext sSLContext2 = SSLContext.getInstance("TLS");
            sSLContext2.init(null, new TrustManager[]{new b()}, new SecureRandom());
            sSLContext = sSLContext2;
        } catch (Throwable unused) {
        }
        return builderHostnameVerifier.sslSocketFactory(sSLContext.getSocketFactory(), new b()).proxy(Proxy.NO_PROXY).addInterceptor(new e()).addInterceptor(new f());
    }

    private static OkHttpClient.Builder e(int i) {
        OkHttpClient.Builder builderDns = new OkHttpClient.Builder().dns(v());
        long j = i;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return builderDns.connectTimeout(j, timeUnit).readTimeout(j, timeUnit).writeTimeout(j, timeUnit).hostnameVerifier(new a()).sslSocketFactory(new j(), j.d).addInterceptor(new e());
    }

    public static OkHttpClient.Builder f() {
        OkHttpClient.Builder builderDns = new OkHttpClient.Builder().dns(v());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return builderDns.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).hostnameVerifier(new a()).sslSocketFactory(new j(), j.d).proxy(Proxy.NO_PROXY);
    }

    public static Response g(String str, HashMap map) {
        Request.Builder builder = new Request.Builder();
        for (String str2 : map.keySet()) {
            builder.addHeader(str2, (String) map.get(str2));
        }
        try {
            return e(300).build().newCall(builder.url(str).build()).execute();
        } catch (IOException unused) {
            return null;
        }
    }

    public static Response h(String str, Map map) {
        Request.Builder builder = new Request.Builder();
        if (map != null) {
            for (String str2 : map.keySet()) {
                builder.addHeader(str2, (String) map.get(str2));
            }
        }
        try {
            return d().build().newCall(builder.url(str).build()).execute();
        } catch (IOException unused) {
            return null;
        }
    }

    public static Response i(String str, HashMap map) {
        Request.Builder builder = new Request.Builder();
        if (map != null) {
            for (String str2 : map.keySet()) {
                builder.addHeader(str2, (String) map.get(str2));
            }
        }
        try {
            return d().followRedirects(false).build().newCall(builder.url(str).build()).execute();
        } catch (IOException unused) {
            return null;
        }
    }

    public static Response j(String str, HashMap map) {
        Request.Builder builder = new Request.Builder();
        if (map != null) {
            for (String str2 : map.keySet()) {
                builder.addHeader(str2, (String) map.get(str2));
            }
        }
        try {
            return f().build().newCall(builder.url(str).build()).execute();
        } catch (IOException unused) {
            return null;
        }
    }

    public static Response k(String str) {
        return a().newCall(new Request.Builder().url(str).build()).execute();
    }

    public static Response l(String str, Map<String, String> map) {
        return a().newCall(new Request.Builder().url(str).headers(Headers.of(map)).build()).execute();
    }

    public static Response m(String str) {
        return e(300).build().newCall(new Request.Builder().url(str).build()).execute();
    }

    public static Response n(String str) {
        OkHttpClient okHttpClient;
        if (c.a.b != null) {
            okHttpClient = c.a.b;
        } else {
            d dVar = c.a;
            OkHttpClient okHttpClientBuild = f().build();
            dVar.b = okHttpClientBuild;
            okHttpClient = okHttpClientBuild;
        }
        return okHttpClient.newCall(new Request.Builder().url(str).build()).execute();
    }

    public static Response o(String str, TreeMap treeMap) {
        OkHttpClient okHttpClient;
        if (c.a.b != null) {
            okHttpClient = c.a.b;
        } else {
            d dVar = c.a;
            OkHttpClient okHttpClientBuild = f().build();
            dVar.b = okHttpClientBuild;
            okHttpClient = okHttpClientBuild;
        }
        return okHttpClient.newCall(new Request.Builder().url(str).headers(Headers.of(treeMap)).build()).execute();
    }

    public static h p(String str, String str2, HashMap map) {
        return new g(c, str, str2, map).a(a());
    }

    public static h q(String str, HashMap map, HashMap map2) {
        return new g(c, str, map, map2).a(a());
    }

    public static Response r(String str, HashMap map, HashMap map2) {
        RequestBody requestBodyBuild;
        Request.Builder builder = new Request.Builder();
        for (String str2 : map2.keySet()) {
            builder.addHeader(str2, (String) map2.get(str2));
        }
        if (TextUtils.isEmpty(null)) {
            FormBody.Builder builder2 = new FormBody.Builder();
            for (String str3 : map.keySet()) {
                builder2.add(str3, (String) map.get(str3));
            }
            requestBodyBuild = builder2.build();
        } else {
            requestBodyBuild = RequestBody.create(MediaType.get("application/json; charset=utf-8"), (String) null);
        }
        try {
            return d().build().newCall(builder.url(str).post(requestBodyBuild).build()).execute();
        } catch (IOException unused) {
            return null;
        }
    }

    public static Response s(String str, HashMap map, Map map2, Long[] lArr) {
        RequestBody requestBodyBuild;
        Request.Builder builder = new Request.Builder();
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                builder.addHeader(str2, (String) map2.get(str2));
            }
        }
        if (TextUtils.isEmpty(null)) {
            FormBody.Builder builder2 = new FormBody.Builder();
            for (String str3 : map.keySet()) {
                builder2.add(str3, (String) map.get(str3));
            }
            for (Long l : lArr) {
                builder2.add("nonce[]", String.valueOf(l));
            }
            requestBodyBuild = builder2.build();
        } else {
            requestBodyBuild = RequestBody.create(MediaType.get("application/json; charset=utf-8"), (String) null);
        }
        try {
            return d().build().newCall(builder.url(str).post(requestBodyBuild).build()).execute();
        } catch (IOException unused) {
            return null;
        }
    }

    public static String t(String str, HashMap map, HashMap map2) {
        return new g(c, str, map, map2).a(a()).a();
    }

    public static Response u(String str, String str2) {
        try {
            return d().build().newCall(new Request.Builder().url(str).post(!TextUtils.isEmpty(str2) ? RequestBody.create(MediaType.get("application/xml; charset=utf-8"), str2) : new FormBody.Builder().build()).build()).execute();
        } catch (IOException unused) {
            return null;
        }
    }

    public static Dns v() {
        try {
            Dns dnsSafeDns = Spider.safeDns();
            Objects.requireNonNull(dnsSafeDns);
            return dnsSafeDns;
        } catch (Throwable unused) {
            return Dns.SYSTEM;
        }
    }

    public static Response w(String str, String str2) {
        try {
            return d().build().newCall(new Request.Builder().url(str).method("PUT", RequestBody.create(MediaType.parse("text/plain;charset=UTF-8"), str2)).addHeader("Accept", "*/*").addHeader("Accept-Language", "zh-CN,zh;q=0.9").addHeader("Connection", "keep-alive").addHeader("Content-Type", "text/plain;charset=UTF-8").addHeader("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36").build()).execute();
        } catch (IOException unused) {
            return null;
        }
    }

    public static String x(String str, HashMap map, int i) {
        return str.startsWith("http") ? new g(d, str, (HashMap) null, map).a(e(i).build()).a() : "";
    }

    public static String y(String str, HashMap map, Map map2) {
        return str.startsWith("http") ? new g(d, str, map, map2).a(a()).a() : "";
    }

    public static String z(String str, HashMap map, OkHttpClient okHttpClient) {
        return str.startsWith("http") ? new g(d, str, (HashMap) null, map).a(okHttpClient).a() : "";
    }
}
