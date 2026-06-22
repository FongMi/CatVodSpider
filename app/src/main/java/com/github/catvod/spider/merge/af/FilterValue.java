package com.github.catvod.spider.merge.af;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.nIe;
import okhttp3.OkHttpClient;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import java.util.concurrent.TimeUnit;

public final class FilterValue {
    private OkHttpClient a;

    public static OkHttpClient a() {
        if (b.a.a != null) {
            return b.a.a;
        }
        FilterValue cVar = b.a;
        OkHttpClient.Builder builderDns = new OkHttpClient.Builder().addInterceptor(new g()).dns(Spider.safeDns());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient okHttpClientBuild = builderDns.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).hostnameVerifier(new HostnameVerifier() {
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                return true;
            }
        }).sslSocketFactory(new i(), i.d).build();
        cVar.a = okHttpClientBuild;
        return okHttpClientBuild;
    }

    public static String b(String str) {
        return str.startsWith(nIe.d("2A122733")) ? new d(str).a(a()).a() : "";
    }
}
