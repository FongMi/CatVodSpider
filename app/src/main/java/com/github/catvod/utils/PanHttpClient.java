package com.github.catvod.utils;
import com.github.catvod.utils.okhttp.OkHttpUtil;

import com.github.catvod.crawler.SpiderDebug;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * 网盘 HTTP 客户端工具类
 * <p>
 * 替代 merge.f0.d 和 merge.f0.i，提供简洁的 GET/POST 方法
 */
public final class PanHttpClient {

    private static final String DEFAULT_USER_AGENT =
            "netdisk;1.4.2;22021211RC;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;";

    private PanHttpClient() {
    }

    // ==================== 响应包装 ====================

    /**
     * HTTP 响应（替代 merge.f0.i）
     */
    public static class HttpResponse {
        private final String body;
        private final int code;

        public HttpResponse() { this.body = ""; this.code = -1; }
    public HttpResponse(String body, int code) {
            this.body = body;
            this.code = code;
        }

        /** 响应体（替代 .a()） */
    /** @deprecated Use body() instead */
    public String a() { return body; }
        public String body() { return body; }

        /** HTTP 状态码（替代 .b()） */
        public int code() { return code; }
    }

    // ==================== 默认头 ====================

    /**
     * 默认请求头（替代 f0.d.b()）
     */
    public static HashMap<String, String> defaultHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", DEFAULT_USER_AGENT);
        return headers;
    }

    // ==================== GET ====================

    /**
     * GET 请求，返回响应体字符串（替代 f0.d.l）
     */
    public static String get(String url) {
        return get(url, defaultHeaders(), null);
    }

    /**
     * GET 请求（带自定义头）（替代 f0.d.m）
     *
     * @param url            请求 URL
     * @param headers        请求头
     * @param responseHeaders 响应头输出 Map（可为 null）
     * @return 响应体字符串
     */
    public static String get(String url, Map<String, String> headers, Map<String, List<String>> responseHeaders) {
        try {
            Request.Builder reqBuilder = new Request.Builder().url(url).get();
            if (headers != null) {
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    reqBuilder.addHeader(entry.getKey(), entry.getValue());
                }
            }
            try (Response resp = OkHttpUtil.defaultClient().newCall(reqBuilder.build()).execute()) {
                if (responseHeaders != null) {
                    responseHeaders.putAll(resp.headers().toMultimap());
                }
                return resp.body() != null ? resp.body().string() : "";
            }
        } catch (IOException e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    // ==================== POST ====================

    /**
     * POST 请求（JSON body）（替代 f0.d.j）
     *
     * @param url     请求 URL
     * @param body    JSON 字符串
     * @param headers 请求头
     * @return HttpResponse 包装
     */
    public static HttpResponse post(String url, String body, Map<String, String> headers) {
        return post(url, body, headers, null);
    }

    /**
     * POST 请求（JSON body + 响应头）（替代 f0.d.k）
     */
    public static HttpResponse post(String url, String body, Map<String, String> headers,
                                     Map<String, List<String>> responseHeaders) {
        try {
            RequestBody reqBody = RequestBody.create(
                    okhttp3.MediaType.parse("application/json"), body);
            Request.Builder reqBuilder = new Request.Builder().url(url).post(reqBody);
            if (headers != null) {
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    reqBuilder.addHeader(entry.getKey(), entry.getValue());
                }
            }
            try (Response resp = OkHttpUtil.defaultClient().newCall(reqBuilder.build()).execute()) {
                if (responseHeaders != null) {
                    responseHeaders.putAll(resp.headers().toMultimap());
                }
                String respBody = resp.body() != null ? resp.body().string() : "";
                return new HttpResponse(respBody, resp.code());
            }
        } catch (IOException e) {
            SpiderDebug.log(e);
            return new HttpResponse("", -1);
        }
    }

    /**
     * POST 表单请求
     */
    public static HttpResponse postForm(String url, Map<String, String> formData, Map<String, String> headers) {
        try {
            FormBody.Builder formBuilder = new FormBody.Builder();
            if (formData != null) {
                for (Map.Entry<String, String> entry : formData.entrySet()) {
                    formBuilder.add(entry.getKey(), entry.getValue());
                }
            }
            Request.Builder reqBuilder = new Request.Builder().url(url).post(formBuilder.build());
            if (headers != null) {
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    reqBuilder.addHeader(entry.getKey(), entry.getValue());
                }
            }
            try (Response resp = OkHttpUtil.defaultClient().newCall(reqBuilder.build()).execute()) {
                String respBody = resp.body() != null ? resp.body().string() : "";
                return new HttpResponse(respBody, resp.code());
            }
        } catch (IOException e) {
            SpiderDebug.log(e);
            return new HttpResponse("", -1);
        }
    }
}
