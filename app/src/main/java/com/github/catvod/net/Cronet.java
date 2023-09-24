package com.github.catvod.net;

import com.github.catvod.spider.Init;
import com.google.net.cronet.okhttptransport.CronetInterceptor;

import org.chromium.net.CronetEngine;

import java.util.Map;

import okhttp3.OkHttpClient;

public class Cronet {

    private OkHttpClient client;

    private static class Loader {
        static volatile Cronet INSTANCE = new Cronet();
    }

    public static Cronet get() {
        return Loader.INSTANCE;
    }

    public static OkHttpClient client() {
        if (get().client != null) return get().client;
        return get().client = getBuilder().build();
    }

    public static OkHttpClient noRedirect() {
        return client().newBuilder().followRedirects(false).followSslRedirects(false).build();
    }

    public static String string(String url) {
        return string(url, null);
    }

    public static String string(String url, Map<String, String> header) {
        return string(url, null, header);
    }

    public static String string(String url, Map<String, String> params, Map<String, String> header) {
        return new OkRequest(OkHttp.GET, url, params, header).execute(client()).getBody();
    }

    public static String post(String url, Map<String, String> params) {
        return post(url, params, null).getBody();
    }

    public static OkResult post(String url, Map<String, String> params, Map<String, String> header) {
        return new OkRequest(OkHttp.POST, url, params, header).execute(client());
    }

    public static String post(String url, String json) {
        return post(url, json, null).getBody();
    }

    public static OkResult post(String url, String json, Map<String, String> header) {
        return new OkRequest(OkHttp.POST, url, json, header).execute(client());
    }

    private static OkHttpClient.Builder getBuilder() {
        return OkHttp.getBuilder().addInterceptor(CronetInterceptor.newBuilder(new CronetEngine.Builder(Init.context()).build()).build());
    }
}
