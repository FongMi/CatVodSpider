package com.github.catvod.net;

import com.github.catvod.spider.Init;
import com.github.catvod.utils.Prefers;
import com.google.net.cronet.okhttptransport.CronetInterceptor;

import org.chromium.net.CronetEngine;

import java.util.Map;

import okhttp3.OkHttpClient;

public class Cronet {

    private OkHttpClient proxy;
    private OkHttpClient client;

    private static class Loader {
        static volatile Cronet INSTANCE = new Cronet();
    }

    public static Cronet get() {
        return Loader.INSTANCE;
    }

    public static OkHttpClient client() {
        if (get().client != null) return get().client;
        return get().client = getBuilder(OkHttp.getBuilder()).build();
    }

    public static OkHttpClient proxy() {
        if (get().proxy != null) return get().proxy;
        return get().proxy = getBuilder(OkHttp.getBuilder(Prefers.getString("proxy"))).build();
    }

    public static OkHttpClient client(boolean proxy) {
        return proxy ? proxy() : client();
    }

    public static OkHttpClient noRedirect(boolean proxy) {
        return client(proxy).newBuilder().followRedirects(false).followSslRedirects(false).build();
    }

    public static String string(String url) {
        return string(false, url);
    }

    public static String string(boolean proxy, String url) {
        return string(proxy, url, null);
    }

    public static String string(String url, Map<String, String> header) {
        return string(false, url, header);
    }

    public static String string(boolean proxy, String url, Map<String, String> header) {
        return string(proxy, url, null, header);
    }

    public static String string(String url, Map<String, String> params, Map<String, String> header) {
        return string(false, url, params, header);
    }

    public static String string(boolean proxy, String url, Map<String, String> params, Map<String, String> header) {
        return string(client(proxy), url, params, header);
    }

    public static String string(OkHttpClient client, String url, Map<String, String> params, Map<String, String> header) {
        return new OkRequest(OkHttp.GET, url, params, header).execute(client).getBody();
    }

    public static String post(String url, Map<String, String> params) {
        return post(false, url, params);
    }

    public static String post(boolean proxy, String url, Map<String, String> params) {
        return post(proxy, url, params, null).getBody();
    }

    public static OkResult post(String url, Map<String, String> params, Map<String, String> header) {
        return post(false, url, params, header);
    }

    public static OkResult post(boolean proxy, String url, Map<String, String> params, Map<String, String> header) {
        return new OkRequest(OkHttp.POST, url, params, header).execute(client(proxy));
    }

    public static String post(String url, String json) {
        return post(false, url, json);
    }

    public static String post(boolean proxy, String url, String json) {
        return post(proxy, url, json, null).getBody();
    }

    public static OkResult post(String url, String json, Map<String, String> header) {
        return post(false, url, json, header);
    }

    public static OkResult post(boolean proxy, String url, String json, Map<String, String> header) {
        return new OkRequest(OkHttp.POST, url, json, header).execute(client(proxy));
    }

    private static OkHttpClient.Builder getBuilder(OkHttpClient.Builder builder) {
        addInterceptor(builder);
        return builder;
    }

    private static void addInterceptor(OkHttpClient.Builder builder) {
        try {
            builder.addInterceptor(CronetInterceptor.newBuilder(new CronetEngine.Builder(Init.context()).build()).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
