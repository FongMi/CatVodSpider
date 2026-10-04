package com.github.catvod.spider;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class Proxy {

    public static Object[] proxy(Map<String, String> params) {
        if ("ck".equals(params.get("do"))) return new Object[]{200, "text/plain; charset=utf-8", new ByteArrayInputStream("ok".getBytes(StandardCharsets.UTF_8))};
        return null;
    }

    public static String getUrl(String siteKey, String param) {
        return "proxy://do=csp&siteKey=" + siteKey + param;
    }
}
