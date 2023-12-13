package com.github.catvod.utils;

import static fi.iki.elonen.NanoHTTPD.Response.Status;
import static fi.iki.elonen.NanoHTTPD.newFixedLengthResponse;

import com.github.catvod.net.OkHttp;

import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;

import fi.iki.elonen.NanoHTTPD;
import okhttp3.Response;

public class ProxyVideo {

    public static NanoHTTPD.Response multi(String url, Map<String, String> headers, int thread) throws Exception {
        return proxy(String.format(Locale.getDefault(), "http://127.0.0.1:7777/?url=%s&thread=%d", URLEncoder.encode(url), thread), headers);
    }

    public static NanoHTTPD.Response proxy(String url, Map<String, String> headers) throws Exception {
        Status status = headers.containsKey("Range") ? Status.PARTIAL_CONTENT : Status.OK;
        if (!headers.containsKey("Range")) headers.put("Range", "bytes=0-");
        Response response = OkHttp.newCall(url, headers);
        String contentType = response.headers().get("Content-Type");
        String hContentLength = response.headers().get("Content-Length");
        String contentDisposition = response.headers().get("Content-Disposition");
        long contentLength = hContentLength != null ? Long.parseLong(hContentLength) : 0;
        if (contentDisposition != null) contentType = Utils.getMimeType(contentDisposition);
        NanoHTTPD.Response resp = newFixedLengthResponse(status, contentType, response.body().byteStream(), contentLength);
        for (String key : response.headers().names()) resp.addHeader(key, response.headers().get(key));
        return resp;
    }
}
