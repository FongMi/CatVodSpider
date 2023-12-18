package com.github.catvod.utils;

import static fi.iki.elonen.NanoHTTPD.Response.Status;
import static fi.iki.elonen.NanoHTTPD.newFixedLengthResponse;

import android.os.SystemClock;
import android.text.TextUtils;

import com.github.catvod.net.OkHttp;
import com.github.catvod.spider.Proxy;

import org.json.JSONObject;

import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;

import fi.iki.elonen.NanoHTTPD;
import okhttp3.Response;

public class ProxyVideo {

    private static final String GO_SERVER = "http://127.0.0.1:7777/";

    public static void go() {
        boolean close = OkHttp.string(GO_SERVER).isEmpty();
        if (close) OkHttp.string("http://127.0.0.1:" + Proxy.getPort() + "/go");
        if (close) while (OkHttp.string(GO_SERVER).isEmpty()) SystemClock.sleep(20);
    }

    public static String goVer() {
        try {
            go();
            String result = OkHttp.string(GO_SERVER + "version");
            return new JSONObject(result).optString("version");
        } catch (Exception e) {
            return "";
        }
    }

    public static String url(String url, int thread) {
        if (!TextUtils.isEmpty(goVer()) && url.contains("/proxy?")) url += "&response=url";
        return String.format(Locale.getDefault(), "%s?url=%s&thread=%d", GO_SERVER, URLEncoder.encode(url), thread);
    }

    public static NanoHTTPD.Response proxy(String url, Map<String, String> headers) throws Exception {
        Status status = headers.containsKey("Range") ? Status.PARTIAL_CONTENT : Status.OK;
        if (!headers.containsKey("Range")) headers.put("Range", "bytes=0-");
        Response response = OkHttp.newCall(url, headers);
        String contentType = response.headers().get("Content-Type");
        String hContentLength = response.headers().get("Content-Length");
        String contentDisposition = response.headers().get("Content-Disposition");
        long contentLength = hContentLength != null ? Long.parseLong(hContentLength) : 0;
        if (contentDisposition != null) contentType = getMimeType(contentDisposition);
        NanoHTTPD.Response resp = newFixedLengthResponse(status, contentType, response.body().byteStream(), contentLength);
        for (String key : response.headers().names()) resp.addHeader(key, response.headers().get(key));
        return resp;
    }

    private static String getMimeType(String contentDisposition) {
        if (contentDisposition.endsWith(".mp4")) {
            return "video/mp4";
        } else if (contentDisposition.endsWith(".webm")) {
            return "video/webm";
        } else if (contentDisposition.endsWith(".avi")) {
            return "video/x-msvideo";
        } else if (contentDisposition.endsWith(".wmv")) {
            return "video/x-ms-wmv";
        } else if (contentDisposition.endsWith(".flv")) {
            return "video/x-flv";
        } else if (contentDisposition.endsWith(".mov")) {
            return "video/quicktime";
        } else if (contentDisposition.endsWith(".mkv")) {
            return "video/x-matroska";
        } else if (contentDisposition.endsWith(".mpeg")) {
            return "video/mpeg";
        } else if (contentDisposition.endsWith(".3gp")) {
            return "video/3gpp";
        } else if (contentDisposition.endsWith(".ts")) {
            return "video/MP2T";
        } else if (contentDisposition.endsWith(".mp3")) {
            return "audio/mp3";
        } else if (contentDisposition.endsWith(".wav")) {
            return "audio/wav";
        } else if (contentDisposition.endsWith(".aac")) {
            return "audio/aac";
        } else {
            return null;
        }
    }
}
