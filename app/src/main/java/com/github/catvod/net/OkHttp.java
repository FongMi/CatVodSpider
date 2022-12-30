package com.github.catvod.net;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.Init;
import com.google.net.cronet.okhttptransport.CronetInterceptor;

import org.chromium.net.CronetEngine;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Dns;
import okhttp3.OkHttpClient;
import okhttp3.Response;

public class OkHttp {

    public static final String METHOD_POST = "POST";
    public static final String METHOD_GET = "GET";

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

    private OkHttpClient.Builder getBuilder() {
        CronetEngine engine = new CronetEngine.Builder(Init.context()).build();
        return new OkHttpClient.Builder().dns(safeDns()).addInterceptor(CronetInterceptor.newBuilder(engine).build()).callTimeout(30, TimeUnit.SECONDS).readTimeout(30, TimeUnit.SECONDS).writeTimeout(30, TimeUnit.SECONDS).connectTimeout(30, TimeUnit.SECONDS).retryOnConnectionFailure(true).hostnameVerifier(SSLSocketFactoryCompat.hostnameVerifier).sslSocketFactory(new SSLSocketFactoryCompat(), SSLSocketFactoryCompat.trustAllCert);
    }

    private static OkHttpClient client() {
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

    public static void stringNoRedirect(String url, Map<String, String> headerMap, Map<String, List<String>> respHeaderMap) {
        string(noRedirect(), url, null, null, headerMap, respHeaderMap, OkHttp.METHOD_GET);
    }

    public static String string(OkHttpClient client, String url, String tag, Map<String, String> paramsMap, Map<String, String> headerMap, Map<String, List<String>> respHeaderMap, String httpMethod) {
        CallBack callback = new CallBack() {
            @Override
            public String onParseResponse(Call call, Response response) {
                if (respHeaderMap != null) {
                    respHeaderMap.clear();
                    respHeaderMap.putAll(response.headers().toMultimap());
                }
                return super.onParseResponse(call, response);
            }
        };
        OkRequest req = new OkRequest(httpMethod, url, paramsMap, headerMap, callback);
        req.setTag(tag);
        req.execute(client);
        return callback.getResult();
    }

    public static String string(String url) {
        return string(url, null);
    }

    public static String string(String url, Map<String, String> headerMap) {
        return string(url, headerMap, null);
    }

    public static String string(String url, Map<String, String> headerMap, Map<String, List<String>> respHeaderMap) {
        return string(url, null, headerMap, respHeaderMap);
    }

    public static String string(String url, Map<String, String> paramsMap, Map<String, String> headerMap, Map<String, List<String>> respHeaderMap) {
        return string(url, null, paramsMap, headerMap, respHeaderMap);
    }

    public static String string(String url, String tag, Map<String, String> headerMap) {
        return string(url, tag, null, headerMap, null);
    }

    public static String string(String url, String tag, Map<String, String> paramsMap, Map<String, String> headerMap, Map<String, List<String>> respHeaderMap) {
        return string(client(), url, tag, paramsMap, headerMap, respHeaderMap, OkHttp.METHOD_GET);
    }

    public static void get(String url, CallBack callBack) {
        get(url, null, callBack);
    }

    public static void get(String url, Map<String, String> paramsMap, CallBack callBack) {
        get(url, paramsMap, null, callBack);
    }

    public static void get(String url, Map<String, String> paramsMap, Map<String, String> headerMap, CallBack callBack) {
        new OkRequest(METHOD_GET, url, paramsMap, headerMap, callBack).execute(client());
    }

    public static String post(String url) {
        return post(url, null);
    }

    public static String post(String url, Map<String, String> paramsMap) {
        return post(url, paramsMap, null);
    }

    public static String post(String url, Map<String, String> paramsMap, Map<String, String> headerMap) {
        return post(url, paramsMap, headerMap, null);
    }

    public static String post(String url, Map<String, String> paramsMap, Map<String, String> headerMap, Map<String, List<String>> respHeaderMap) {
        return string(client(), url, null, paramsMap, headerMap, respHeaderMap, METHOD_POST);
    }

    public static String postJson(String url, String json) {
        return postJson(url, json, null);
    }

    public static String postJson(String url, String json, Map<String, String> headerMap) {
        CallBack callback = new CallBack();
        new OkRequest(METHOD_POST, url, json, headerMap, callback).execute(client());
        return callback.getResult();
    }

    public static void cancel(OkHttpClient client, Object tag) {
        if (client == null || tag == null) return;
        for (Call call : client.dispatcher().queuedCalls()) {
            if (tag.equals(call.request().tag())) {
                call.cancel();
            }
        }
        for (Call call : client.dispatcher().runningCalls()) {
            if (tag.equals(call.request().tag())) {
                call.cancel();
            }
        }
    }

    public static void cancel(Object tag) {
        cancel(client(), tag);
    }

    public static String getRedirectLocation(Map<String, List<String>> headers) {
        if (headers == null) return null;
        if (headers.containsKey("location")) return headers.get("location").get(0);
        if (headers.containsKey("Location")) return headers.get("Location").get(0);
        return null;
    }
}
