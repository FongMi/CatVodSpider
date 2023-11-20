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
        Map<String, String> reqHeaders = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        for (String key : params.keySet()) reqHeaders.put(key, params.get(key));
        if (reqHeaders.containsKey("do")) reqHeaders.remove("do");
        if (reqHeaders.containsKey("url")) reqHeaders.remove("url");
        if (reqHeaders.containsKey("thread")) reqHeaders.remove("thread");
        MultiThreadedDownloader downloader = new MultiThreadedDownloader(url, reqHeaders, thread);
        NanoHTTPD.Response response = downloader.start();
        return new Object[]{response};
    }
}
