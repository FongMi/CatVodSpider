package com.github.catvod.net;

import com.github.catvod.crawler.Spider;

import java.io.IOException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import okhttp3.Dns;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHttp {

    public static final String POST = "POST";
    public static final String GET = "GET";

    private OkHttpClient client;

    private static class Loader {
        static volatile OkHttp INSTANCE = new OkHttp();
    }

    public static OkHttp get() {
        return Loader.INSTANCE;
    }

    public static Dns dns() {
        return Spider.safeDns();
    }

    public static OkHttpClient client() {
        if (get().client != null) return get().client;
        return get().client = getBuilder().build();
    }

    public static OkHttpClient noRedirect() {
        return client().newBuilder().followRedirects(false).followSslRedirects(false).build();
    }

    public static Response newCall(String url) throws IOException {
        return client().newCall(new Request.Builder().url(url).build()).execute();
    }

    public static Response newCall(String url, Map<String, String> header) throws IOException {
        return client().newCall(new Request.Builder().url(url).headers(Headers.of(header)).build()).execute();
    }

    public static String string(String url) {
        return string(url, null);
    }

    public static String string(String url, Map<String, String> header) {
        return string(client(), url, null, header);
    }

    public static String string(OkHttpClient client, String url, Map<String, String> header) {
        return string(client, url, null, header);
    }

    public static String string(OkHttpClient client, String url, Map<String, String> params, Map<String, String> header) {
        return url.startsWith("http") ? new OkRequest(GET, url, params, header).execute(client).getBody() : "";
    }

    public static String post(String url, Map<String, String> params) {
        return post(client(), url, params, null).getBody();
    }

    public static OkResult post(String url, Map<String, String> params, Map<String, String> header) {
        return post(client(), url, params, header);
    }

    public static OkResult post(OkHttpClient client, String url, Map<String, String> params, Map<String, String> header) {
        return new OkRequest(POST, url, params, header).execute(client);
    }

    public static String post(String url, String json) {
        return post(url, json, null).getBody();
    }

    public static OkResult post(String url, String json, Map<String, String> header) {
        return post(client(), url, json, header);
    }

    public static OkResult post(OkHttpClient client, String url, String json, Map<String, String> header) {
        return new OkRequest(POST, url, json, header).execute(client);
    }

    public static String getLocation(String url, Map<String, String> header) throws IOException {
        return getLocation(noRedirect().newCall(new Request.Builder().url(url).headers(Headers.of(header)).build()).execute().headers().toMultimap());
    }

    public static String getLocation(Map<String, List<String>> headers) {
        if (headers == null) return null;
        if (headers.containsKey("location")) return headers.get("location").get(0);
        if (headers.containsKey("Location")) return headers.get("Location").get(0);
        return null;
    }

    public static OkHttpClient.Builder getBuilder() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder().addInterceptor(new OkhttpInterceptor()).dns(dns()).connectTimeout(30, TimeUnit.SECONDS).readTimeout(30, TimeUnit.SECONDS).writeTimeout(30, TimeUnit.SECONDS);
        ignoreSSLErrors(builder);
        return builder;
    }

    private static void ignoreSSLErrors(OkHttpClient.Builder builder) {
        try {
            SSLContext context = SSLContext.getInstance("SSL");
            context.init(null, TM, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(context.getSocketFactory());
            builder.sslSocketFactory(context.getSocketFactory(), (X509TrustManager) TM[0]);
            builder.hostnameVerifier((hostname, session) -> true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final TrustManager[] TM = new TrustManager[]{new X509TrustManager() {
        @Override
        public void checkClientTrusted(X509Certificate[] chain, String authType) {
        }

        @Override
        public void checkServerTrusted(X509Certificate[] chain, String authType) {
        }

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[]{};
        }
    }};
}
