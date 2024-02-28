package com.github.catvod.net;

import android.text.TextUtils;

import com.github.catvod.utils.Util;

import java.io.IOException;
import java.util.Map;

import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

class OkRequest {

    private final Map<String, String> header;
    private final Map<String, String> params;
    private final String method;
    private final String json;
    private Request request;
    private String url;

    OkRequest(String method, String url, Map<String, String> params, Map<String, String> header) {
        this(method, url, params, null, header);
    }

    OkRequest(String method, String url, String json, Map<String, String> header) {
        this(method, url, null, json, header);
    }

    private OkRequest(String method, String url, Map<String, String> params, String json, Map<String, String> header) {
        this.url = url;
        this.json = json;
        this.method = method;
        this.params = params;
        this.header = header;
        getInstance();
    }

    private void getInstance() {
        Request.Builder builder = new Request.Builder();
        if (method.equals(OkHttp.GET) && params != null) setParams();
        if (method.equals(OkHttp.POST)) builder.post(getRequestBody());
        if (header != null) for (String key : header.keySet()) builder.addHeader(key, header.get(key));
        request = builder.url(url).build();
    }

    private RequestBody getRequestBody() {
        if (!TextUtils.isEmpty(json)) return RequestBody.create(MediaType.get("application/json; charset=utf-8"), json);
        FormBody.Builder formBody = new FormBody.Builder();
        if (params != null) for (String key : params.keySet()) formBody.add(key, params.get(key));
        return formBody.build();
    }

    private void setParams() {
        url = url + "?";
        for (String key : params.keySet()) url = url.concat(key + "=" + params.get(key) + "&");
        url = Util.substring(url);
    }

    public OkResult execute(OkHttpClient client) {
        try {
            Response response = client.newCall(request).execute();
            return new OkResult(response.code(), response.body().string(), response.headers().toMultimap());
        } catch (IOException e) {
            return new OkResult();
        }
    }
}
