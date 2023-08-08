package com.github.catvod.net;

import com.github.catvod.crawler.Spider;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Dns;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHttp {

    public static final String POST = "POST";
    public static final String GET = "GET";

    private final OkHttpClient noRedirect;
    private final OkHttpClient client;

    private static class Loader {
        static volatile OkHttp INSTANCE = new OkHttp();
    }

    public static OkHttp get() {
        return Loader.INSTANCE;
    }

    public OkHttp() {
        client = getBuilder().build();
        noRedirect = client.newBuilder().followRedirects(false).followSslRedirects(false).build();
    }

    public static OkHttpClient.Builder getBuilder() {
        return new OkHttpClient.Builder().dns(safeDns()).readTimeout(30, TimeUnit.SECONDS).writeTimeout(30, TimeUnit.SECONDS).connectTimeout(30, TimeUnit.SECONDS).hostnameVerifier(SSLCompat.VERIFIER).sslSocketFactory(new SSLCompat(), SSLCompat.TM);
    }

    public static OkHttpClient client() {
        return get().client;
    }

    private static OkHttpClient noRedirect() {
        return get().noRedirect;
    }

    public static Dns safeDns() {
        try {
            return (Dns) Spider.class.getMethod("safeDns").invoke(null);
        } catch (Exception e) {
            return Dns.SYSTEM;
        }
    }

    public static Response newCall(String url) throws IOException {
        return client().newCall(new Request.Builder().url(url).build()).execute();
    }

    public static Response newCall(String url, Map<String, String> header) throws IOException {
        return client().newCall(new Request.Builder().url(url).headers(Headers.of(header)).build()).execute();
    }

    public static void stringNoRedirect(String url, Map<String, String> header, Map<String, List<String>> respHeader) {
        string(noRedirect(), GET, url, null, null, header, respHeader);
    }

    public static String string(OkHttpClient client, String method, String url, String tag, Map<String, String> params, Map<String, String> header, Map<String, List<String>> respHeader) {
        return new OkRequest(method, url, params, header, respHeader).tag(tag).execute(client).getBody();
    }

    public static String string(String url) {
        return string(url, null);
    }

    public static String string(String url, Map<String, String> header) {
        return string(url, header, null);
    }

    public static String string(String url, Map<String, String> header, Map<String, List<String>> respHeader) {
        return string(url, null, header, respHeader);
    }

    public static String string(String url, Map<String, String> params, Map<String, String> header, Map<String, List<String>> respHeader) {
        return string(url, null, params, header, respHeader);
    }

    public static String string(String url, String tag, Map<String, String> header) {
        return string(url, tag, null, header, null);
    }

    public static String string(String url, String tag, Map<String, String> params, Map<String, String> header, Map<String, List<String>> respHeader) {
        return string(client(), GET, url, tag, params, header, respHeader);
    }

    public static String post(String url, Map<String, String> params) {
        return post(url, params, null);
    }

    public static String post(String url, Map<String, String> params, Map<String, String> header) {
        return post(url, params, header, null);
    }

    public static String post(String url, Map<String, String> params, Map<String, String> header, Map<String, List<String>> respHeader) {
        return string(client(), POST, url, null, params, header, respHeader);
    }

    public static OkResult postJson(String url, String json) {
        return postJson(url, json, null);
    }

    public static OkResult postJson(String url, String json, Map<String, String> header) {
        return new OkRequest(POST, url, json, header).execute(client());
    }

    public static void cancel(Object tag) {
        for (Call call : client().dispatcher().queuedCalls()) {
            if (tag.equals(call.request().tag())) {
                call.cancel();
            }
        }
        for (Call call : client().dispatcher().runningCalls()) {
            if (tag.equals(call.request().tag())) {
                call.cancel();
            }
        }
    }

    public static String getRedirectLocation(Map<String, List<String>> headers) {
        if (headers == null) return null;
        if (headers.containsKey("location")) return headers.get("location").get(0);
        if (headers.containsKey("Location")) return headers.get("Location").get(0);
        return null;
    }
}
