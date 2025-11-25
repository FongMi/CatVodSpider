package com.github.catvod.spider;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.net.OkHttp;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class Proxy {

    private static Method method;
    private static int port;

    public static Object[] proxy(Map<String, String> params) {
        if ("ck".equals(params.get("do"))) return new Object[]{200, "text/plain; charset=utf-8", new ByteArrayInputStream("ok".getBytes(StandardCharsets.UTF_8))};
        return null;
    }

    public static void init() {
        try {
            Class<?> clz = Class.forName("com.github.catvod.Proxy");
            port = (int) clz.getMethod("getPort").invoke(null);
            method = clz.getMethod("getUrl", boolean.class);
            SpiderDebug.log("本地代理端口:" + port);
        } catch (Throwable e) {
            findPort();
        }
    }

    public static int getPort() {
        return port;
    }

    public static String getUrl(String siteKey, String param) {
        return "proxy://do=csp&siteKey=" + siteKey + param;
    }

    public static String getUrl() {
        return getUrl(true);
    }

    public static String getUrl(boolean local) {
        try {
            return (String) method.invoke(null, local);
        } catch (Throwable e) {
            return "http://127.0.0.1:" + port + "/proxy";
        }
    }

    private static void findPort() {
        if (port > 0) return;
        for (int p = 8964; p < 9999; p++) {
            if ("ok".equals(OkHttp.string("http://127.0.0.1:" + p + "/proxy?do=ck", null))) {
                SpiderDebug.log("本地代理端口:" + p);
                port = p;
                break;
            }
        }
    }
}
