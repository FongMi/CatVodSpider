package com.github.catvod.net;

import com.github.catvod.spider.Init;
import com.google.net.cronet.okhttptransport.CronetInterceptor;

import org.chromium.net.CronetEngine;

import java.io.IOException;
import java.util.Map;

import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class Cronet {

    public static final String POST = "POST";
    public static final String GET = "GET";

    private final OkHttpClient noRedirect;
    private final OkHttpClient client;

    private static class Loader {
        static volatile Cronet INSTANCE = new Cronet();
    }

    public static Cronet get() {
        return Loader.INSTANCE;
    }

    public Cronet() {
        client = getBuilder().build();
        noRedirect = client.newBuilder().followRedirects(false).followSslRedirects(false).build();
    }

    private OkHttpClient.Builder getBuilder() {
        OkHttpClient.Builder builder = OkHttp.getBuilder();
        addInterceptor(builder);
        return builder;
    }

    private void addInterceptor(OkHttpClient.Builder builder) {
        try {
            builder.addInterceptor(CronetInterceptor.newBuilder(new CronetEngine.Builder(Init.context()).build()).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static OkHttpClient client() {
        return get().client;
    }

    private static OkHttpClient noRedirect() {
        return get().noRedirect;
    }

    public static String string(String url) {
        return string(url, null);
    }

    public static String string(String url, Map<String, String> header) {
        return string(url, null, header);
    }

    public static String string(String url, Map<String, String> params, Map<String, String> header) {
        return string(client(), GET, url, params, header);
    }

    public static String string(OkHttpClient client, String method, String url, Map<String, String> params, Map<String, String> header) {
        return new OkRequest(method, url, params, header).execute(client).getBody();
    }

    public static String post(String url, Map<String, String> params) {
        return post(url, params, null);
    }

    public static String post(String url, Map<String, String> params, Map<String, String> header) {
        return string(client(), POST, url, params, header);
    }

    public static OkResult postJson(String url, String json) {
        return postJson(url, json, null);
    }

    public static OkResult postJson(String url, String json, Map<String, String> header) {
        return new OkRequest(POST, url, json, header).execute(client());
    }

    public static String getLocation(String url, Map<String, String> header) throws IOException {
        return OkHttp.getLocation(noRedirect().newCall(new Request.Builder().url(url).headers(Headers.of(header)).build()).execute().headers().toMultimap());
    }
}
