package com.github.catvod.net;

import com.github.catvod.crawler.Spider;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Dns;
import okhttp3.OkHttpClient;
import okhttp3.Response;

public class OkHttpUtil {

    public static final String METHOD_GET = "GET";
    public static final String METHOD_POST = "POST";

    private static final Object lockO = new Object();
    private static OkHttpClient defaultClient = null;
    private static final int DEFAULT_TIMEOUT = 15;

    public static OkHttpClient defaultClient() {
        synchronized (lockO) {
            if (defaultClient == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder().dns(safeDns()).readTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS).writeTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS).connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS).retryOnConnectionFailure(true).sslSocketFactory(new SSLSocketFactoryCompat(SSLSocketFactoryCompat.trustAllCert), SSLSocketFactoryCompat.trustAllCert);
                defaultClient = builder.build();
            }
            return defaultClient;
        }
    }

    public static Dns safeDns() {
        try {
            return (Dns) Spider.class.getMethod("safeDns").invoke(null);
        } catch (Exception e) {
            return Dns.SYSTEM;
        }
    }

    public static String string(OkHttpClient client, String url, String tag, Map<String, String> paramsMap, Map<String, String> headerMap, Map<String, List<String>> respHeaderMap, String httpMethod) {
        OKCallBack.OKCallBackString callback = new OKCallBack.OKCallBackString() {
            @Override
            public String onParseResponse(Call call, Response response) {
                try {
                    if (respHeaderMap != null) {
                        respHeaderMap.clear();
                        respHeaderMap.putAll(response.headers().toMultimap());
                    }
                    return response.body().string();
                } catch (IOException e) {
                    return "";
                }
            }
        };
        OKRequest req = new OKRequest(httpMethod, url, paramsMap, headerMap, callback);
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
        return string(defaultClient(), url, tag, paramsMap, headerMap, respHeaderMap, OkHttpUtil.METHOD_GET);
    }

    public static void get(String url, OKCallBack callBack) {
        get(url, null, callBack);
    }

    public static void get(String url, Map<String, String> paramsMap, OKCallBack callBack) {
        get(url, paramsMap, null, callBack);
    }

    public static void get(String url, Map<String, String> paramsMap, Map<String, String> headerMap, OKCallBack callBack) {
        new OKRequest(METHOD_GET, url, paramsMap, headerMap, callBack).execute(defaultClient());
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
        return string(defaultClient(), url, null, paramsMap, headerMap, respHeaderMap, METHOD_POST);
    }

    public static String postJson(String url, String json) {
        return postJson(url, json, null);
    }

    public static String postJson(String url, String json, Map<String, String> headerMap) {
        OKCallBack.OKCallBackString callback = new OKCallBack.OKCallBackString();
        new OKRequest(METHOD_POST, url, json, headerMap, callback).execute(defaultClient());
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
        cancel(defaultClient(), tag);
    }
}
