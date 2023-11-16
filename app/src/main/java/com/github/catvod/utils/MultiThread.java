package com.github.catvod.utils;

import com.github.catvod.downloader.MultiThreadedMemoryDownloader;
import com.github.catvod.spider.Proxy;

import java.net.URLEncoder;
import java.util.Map;
import java.util.TreeMap;

import fi.iki.elonen.NanoHTTPD;

public class MultiThread {

    public static String proxyUrl(String url, int thread) {
        return String.format(Proxy.getUrl() + "?do=multi&url=%s&thread=%d", URLEncoder.encode(url), thread);
    }

    public static Object[] proxy(Map<String, String> params) throws Exception {
        String url = params.get("url");
        int threadNum = Integer.parseInt(params.get("thread"));
        Map<String, String> reqHeaders = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (entry.getKey() != null) {
                reqHeaders.put(entry.getKey(), entry.getValue());
            }
        }
        if (reqHeaders.containsKey("do")) reqHeaders.remove("do");
        if (reqHeaders.containsKey("url")) reqHeaders.remove("url");
        if (reqHeaders.containsKey("thread")) reqHeaders.remove("thread");
        MultiThreadedMemoryDownloader downloader = new MultiThreadedMemoryDownloader(url, reqHeaders, threadNum);
        NanoHTTPD.Response response = downloader.start();
        Object[] result = new Object[1];
        result[0] = response;
        return result;
    }

}
