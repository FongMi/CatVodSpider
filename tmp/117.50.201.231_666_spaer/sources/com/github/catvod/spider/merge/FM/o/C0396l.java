package com.github.catvod.spider.merge.FM.o;

import android.os.SystemClock;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.FM.m.C0378c;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import okhttp3.Response;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.o.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0396l {
    private static final String a = "http://127.0.0.1:7777/";
    private static final String b = "http://127.0.0.1:1314";

    public static String a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", str);
            return C0378c.g("http://127.0.0.1:1314/api/decode", jSONObject.toString(), null).a();
        } catch (Exception e) {
            SpiderDebug.log("DecodeByGo Exception:  " + e.getMessage());
            return "";
        }
    }

    public static Boolean b(int i) {
        int i2 = i <= 0 ? 1 : i;
        int i3 = 0;
        while (i3 < i2) {
            try {
                if ("ok".equals(C0378c.n("http://127.0.0.1:1314/api/ping", null))) {
                    return Boolean.TRUE;
                }
            } catch (Exception e) {
                SpiderDebug.log("goVer Exception: " + e.getMessage());
            }
            i3++;
            if (i3 < i2) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e2) {
                    SpiderDebug.log("Sleep interrupted: " + e2.getMessage());
                }
            }
        }
        return Boolean.FALSE;
    }

    public static String c(String str, int i, int i2) {
        return String.format(Locale.getDefault(), "%s?url=%s&thread=%d&chunk=%d&key=quark&type=quark", b, URLEncoder.encode(str), Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static String d(String str) {
        return String.format(Locale.getDefault(), "%s?url=%s&thread=%d", a, URLEncoder.encode(str), 10);
    }

    public static void e() {
        boolean zIsEmpty = C0378c.n(a, null).isEmpty();
        if (zIsEmpty) {
            C0378c.m("http://127.0.0.1:" + Proxy.getPort() + "/go");
        }
        if (zIsEmpty) {
            for (int i = 0; C0378c.n(a, null).isEmpty() && i < 3; i++) {
                SystemClock.sleep(20L);
            }
        }
    }

    public static String f() {
        try {
            e();
            return new JSONObject(C0378c.n("http://127.0.0.1:7777/version", null)).optString("version");
        } catch (Exception e) {
            SpiderDebug.log("goVer Exception:  " + e.getMessage());
            return "";
        }
    }

    public static Object[] g(String str, Map<String, String> map) {
        Response responseE = C0378c.e(str, map);
        HashMap map2 = new HashMap();
        for (String str2 : responseE.headers().names()) {
            map2.put(str2, responseE.headers().get(str2));
        }
        return new Object[]{206, "application/oct-stream", responseE.body().byteStream(), map2};
    }
}
