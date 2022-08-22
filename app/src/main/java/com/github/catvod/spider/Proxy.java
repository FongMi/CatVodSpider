package com.github.catvod.spider;

import android.util.Base64;

import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.live.TxtSubscribe;
import com.github.catvod.net.OkHttpUtil;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Objects;

public class Proxy extends Spider {

    private static int port = -1;

    public static Object[] proxy(Map<String, String> params) {
        switch (Objects.requireNonNull(params.get("do"))) {
            case "ck":
                return new Object[]{200, "text/plain; charset=utf-8", new ByteArrayInputStream("ok".getBytes(StandardCharsets.UTF_8))};
            case "live":
                return TxtSubscribe.load(new String(Base64.decode(params.get("ext"), Base64.DEFAULT | Base64.URL_SAFE | Base64.NO_WRAP), StandardCharsets.UTF_8));
            default:
                return null;
        }
    }

    static void adjustPort() {
        if (Proxy.port > 0) return;
        int port = 9978;
        while (port < 10000) {
            String resp = OkHttpUtil.string("http://127.0.0.1:" + port + "/proxy?do=ck", null);
            if (resp.equals("ok")) {
                SpiderDebug.log("Found local server port " + port);
                Proxy.port = port;
                break;
            }
            port++;
        }
    }

    public static String getUrl() {
        adjustPort();
        return "http://127.0.0.1:" + port + "/proxy";
    }
}
