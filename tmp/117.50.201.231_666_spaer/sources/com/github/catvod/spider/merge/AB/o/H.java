package com.github.catvod.spider.merge.AB.o;

import android.os.SystemClock;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Proxy;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import okhttp3.Response;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class H {
    private static final String a = "http://127.0.0.1:7777/";
    private static final String b = "http://127.0.0.1:7989";

    public static String a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", str);
            return com.github.catvod.spider.merge.AB.m.c.g("http://127.0.0.1:7989/api/decode", jSONObject.toString(), null).a();
        } catch (Exception e) {
            SpiderDebug.log("DecodeByGo Exception:  " + e.getMessage());
            return "";
        }
    }

    public static Boolean b(int i) {
        if (i <= 0) {
            i = 1;
        }
        int i2 = 0;
        while (i2 < i) {
            try {
                if ("ok".equals(com.github.catvod.spider.merge.AB.m.c.l("http://127.0.0.1:7989/api/ping", null))) {
                    return Boolean.TRUE;
                }
            } catch (Exception e) {
                SpiderDebug.log("goVer Exception: " + e.getMessage());
            }
            i2++;
            if (i2 < i) {
                try {
                    Thread.sleep(3000L);
                } catch (InterruptedException e2) {
                    SpiderDebug.log("Sleep interrupted: " + e2.getMessage());
                }
            }
        }
        return Boolean.FALSE;
    }

    public static String c() {
        return b;
    }

    public static String d(String str, int i, int i2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Pattern pattern = c0.a;
        return String.format(Locale.getDefault(), "%s?url=%s&thread=%d&chunk=%d&key=quark&type=quark&timestamp=%d&sign=%s", b, URLEncoder.encode(str), Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(jCurrentTimeMillis), c0.a(String.format("%d%s", Long.valueOf(jCurrentTimeMillis), G.b("jarmd5"))).substring(0, 10));
    }

    public static String e(String str) {
        return String.format(Locale.getDefault(), "%s?url=%s&thread=%d", a, URLEncoder.encode(str), 10);
    }

    public static void f() {
        boolean zIsEmpty = com.github.catvod.spider.merge.AB.m.c.l(a, null).isEmpty();
        if (zIsEmpty) {
            com.github.catvod.spider.merge.AB.m.c.k("http://127.0.0.1:" + Proxy.getPort() + "/go");
        }
        if (zIsEmpty) {
            for (int i = 0; com.github.catvod.spider.merge.AB.m.c.l(a, null).isEmpty() && i < 3; i++) {
                SystemClock.sleep(20L);
            }
        }
    }

    public static String g() {
        try {
            f();
            return new JSONObject(com.github.catvod.spider.merge.AB.m.c.l("http://127.0.0.1:7777/version", null)).optString("version");
        } catch (Exception e) {
            SpiderDebug.log("goVer Exception:  " + e.getMessage());
            return "";
        }
    }

    public static Object[] h(String str, Map<String, String> map) {
        Response responseE = com.github.catvod.spider.merge.AB.m.c.e(str, map);
        HashMap map2 = new HashMap();
        for (String str2 : responseE.headers().names()) {
            map2.put(str2, responseE.headers().get(str2));
        }
        return new Object[]{206, "application/oct-stream", responseE.body().byteStream(), map2};
    }
}
