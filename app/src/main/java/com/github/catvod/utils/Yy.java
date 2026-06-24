package com.github.catvod.utils;

import java.util.Map;

/**
 * HTTP utility stub (original in deleted merge package).
 */
public class Yy {

    public static String N(long timeout, String url, String body, Map<String, String> headers, OkHttpCallback<String> callback) {
        try {
            PanHttpClient.HttpResponse resp = PanHttpClient.post(url, body, headers);
            String result = resp != null ? resp.body() : "";
            if (callback != null) {
                callback.S(result);
            }
            return result;
        } catch (Exception e) {
            if (callback != null) {
                callback.S("");
            }
            return "";
        }
    }

    public static String v(String url, Map<String, String> headers) {
        try {
            return PanHttpClient.get(url, headers, null);
        } catch (Exception e) {
            return "";
        }
    }

    public static void Kf(String url, Map<String, String> headers, Map<String, String> result) {
        try {
            PanHttpClient.get(url, headers, (Map<String, java.util.List<String>>) null);
            if (url != null && !url.isEmpty()) {
                result.put("url", url);
            }
        } catch (Exception ignored) {
        }
    }

    public static String OL(Map<String, String> map) {
        return map != null ? map.getOrDefault("url", "") : "";
    }
}
