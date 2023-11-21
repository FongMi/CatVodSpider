package com.github.catvod.utils;

import com.github.catvod.spider.Proxy;

import java.net.URLEncoder;
import java.util.Map;
import java.util.TreeMap;

import fi.iki.elonen.NanoHTTPD;

public class MultiThread {

    public static String url(String url, int thread) {
        return String.format(Proxy.getUrl() + "?do=multi&url=%s&thread=%d", URLEncoder.encode(url), thread);
    }

    public static Object[] proxy(Map<String, String> params) throws Exception {
        String url = params.get("url");
        int thread = Integer.parseInt(params.get("thread"));
        Map<String, String> headers = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        for (String key : params.keySet()) headers.put(key, params.get(key));
        MultiThreadedDownloader downloader = new MultiThreadedDownloader(url, removeHeaders(headers), thread);
        NanoHTTPD.Response response = downloader.start();
        return new Object[]{response};
    }

    private static Map<String, String> removeHeaders(Map<String, String> headers) {
        headers.remove("do");
        headers.remove("url");
        headers.remove("host");
        headers.remove("thread");
        headers.remove("remote-addr");
        headers.remove("http-client-ip");
        return headers;
    }
}
