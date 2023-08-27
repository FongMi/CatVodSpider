package com.github.catvod.net;

import android.text.TextUtils;

import com.github.catvod.utils.Utils;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

class OkRequest {

    private final Map<String, List<String>> respHeader;
    private final Map<String, String> header;
    private final Map<String, String> params;
    private final String method;
    private final String json;
    private Request request;
    private String url;
    private Object tag;

    OkRequest(String method, String url, Map<String, String> params, Map<String, String> header, Map<String, List<String>> respHeader) {
        this(method, url, null, params, header, respHeader);
    }

    OkRequest(String method, String url, String json, Map<String, String> header) {
        this(method, url, json, null, header, null);
    }

    private OkRequest(String method, String url, String json, Map<String, String> params, Map<String, String> header, Map<String, List<String>> respHeader) {
        this.url = url;
        this.json = json;
        this.method = method;
        this.params = params;
        this.header = header;
        this.respHeader = respHeader;
        getInstance();
    }

    public OkRequest tag(Object tag) {
        this.tag = tag;
        return this;
    }

    private void getInstance() {
        Request.Builder builder = new Request.Builder();
        if (method.equals(OkHttp.GET) && params != null) setParams();
        if (method.equals(OkHttp.POST)) builder.post(getRequestBody());
        if (header != null) for (String key : header.keySet()) builder.addHeader(key, header.get(key));
        if (tag != null) builder.tag(tag);
        request = builder.url(url).build();
    }

    private RequestBody getRequestBody() {
        if (!TextUtils.isEmpty(json)) return RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json);
        FormBody.Builder formBody = new FormBody.Builder();
        if (params != null) for (String key : params.keySet()) formBody.add(key, params.get(key));
        return formBody.build();
    }

    private void setParams() {
        url = url + "?";
        for (String key : params.keySet()) url = url.concat(key + "=" + params.get(key) + "&");
        url = Utils.substring(url);
    }

    public OkResult execute(OkHttpClient client) {
        try {
            Response response = client.newCall(request).execute();
            if (respHeader != null) respHeader.clear();
            if (respHeader != null) respHeader.putAll(response.headers().toMultimap());
            return new OkResult(response.code(), response.body().string());
        } catch (IOException e) {
            return new OkResult();
        }
    }
}
