package com.github.catvod.utils;

import static fi.iki.elonen.NanoHTTPD.newFixedLengthResponse;
import com.github.catvod.net.OkHttp;
import java.util.Map;
import fi.iki.elonen.NanoHTTPD;
import okhttp3.Response;

public class ProxyVideo {

    public static NanoHTTPD.Response proxy(String url, Map<String, String> headers) throws Exception {
        NanoHTTPD.Response.Status status = NanoHTTPD.Response.Status.PARTIAL_CONTENT;
        if (!headers.containsKey("Range")) {
            headers.put("Range", "bytes=0-");
            status = NanoHTTPD.Response.Status.OK;
        }
        Response dResponse = OkHttp.newCall(url, headers);
        String hContentLength = dResponse.headers().get("Content-Length");
        long contentLength = Long.parseLong(hContentLength);
        String contentType = dResponse.headers().get("Content-Type");
        String contentDisposition = dResponse.headers().get("Content-Disposition");
        if (contentDisposition != null) {
            if (contentDisposition.endsWith(".mp4")) {
                contentType = "video/mp4";
            } else if (contentDisposition.endsWith(".webm")) {
                contentType = "video/webm";
            } else if (contentDisposition.endsWith(".avi")) {
                contentType = "video/x-msvideo";
            } else if (contentDisposition.endsWith(".wmv")) {
                contentType = "video/x-ms-wmv";
            } else if (contentDisposition.endsWith(".flv")) {
                contentType = "video/x-flv";
            } else if (contentDisposition.endsWith(".mov")) {
                contentType = "video/quicktime";
            } else if (contentDisposition.endsWith(".mkv")) {
                contentType = "video/x-matroska";
            } else if (contentDisposition.endsWith(".mpeg")) {
                contentType = "video/mpeg";
            } else if (contentDisposition.endsWith(".3gp")) {
                contentType = "video/3gpp";
            } else if (contentDisposition.endsWith(".ts")) {
                contentType = "video/MP2T";
            } else if (contentDisposition.endsWith(".mp3")) {
                contentType = "audio/mp3";
            } else if (contentDisposition.endsWith(".wav")) {
                contentType = "audio/wav";
            } else if (contentDisposition.endsWith(".aac")) {
                contentType = "audio/aac";
            }
        }
        return newFixedLengthResponse(status, contentType, dResponse.body().byteStream(), contentLength);
    }


}
