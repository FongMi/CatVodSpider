package com.github.catvod.spider.merge.p;

import android.os.SystemClock;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.n.C0197c;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import okhttp3.Response;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.p.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0221n {
    private static final String a = C0098a.a(new byte[]{9, -95, -33, -65, 15, -88, 45, 117, 83, -30, -123, -1, 27, -73, 44, 117, 91, -30, -100, -8, 2, -88}, new byte[]{97, -43, -85, -49, 53, -121, 2, 68});
    private static final String b = C0098a.a(new byte[]{-106, 17, 84, -113, -43, 102, -91, -112, -52, 82, 14, -49, -63, 121, -92, -112, -60, 82, 25, -57, -42}, new byte[]{-2, 101, 32, -1, -17, 73, -118, -95});

    public static String a(String str) {
        try {
            String strA = C0098a.a(new byte[]{-107, 57, -107, 48, -16, 90, -85, 22, -49, 122, -49, 112, -28, 69, -86, 22, -57, 122, -40, 120, -13, 90, -27, 87, -108, 98, -123, 37, -87, 26, -32, 66}, new byte[]{-3, 77, -31, 64, -54, 117, -124, 39});
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0098a.a(new byte[]{62, 19, 20, -7}, new byte[]{90, 114, 96, -104, -25, 34, 57, -33}), str);
            return C0197c.g(strA, jSONObject.toString(), null).a();
        } catch (Exception e) {
            SpiderDebug.log(C0098a.a(new byte[]{36, -69, 124, 45, 79, 54, -55, -7, 39, -79, 63, 7, 83, 48, -18, -16, 20, -73, 112, 44, 17, 115, -85}, new byte[]{96, -34, 31, 66, 43, 83, -117, -128}) + e.getMessage());
            return "";
        }
    }

    public static Boolean b() {
        int i = 0;
        while (i < 5) {
            try {
                if (C0098a.a(new byte[]{-7, -63}, new byte[]{-106, -86, 54, -85, -112, -121, -92, 96}).equals(C0197c.l(C0098a.a(new byte[]{-11, -67, 20, -94, -76, -6, -126, -52, -81, -2, 78, -30, -96, -27, -125, -52, -89, -2, 89, -22, -73, -6, -52, -115, -12, -26, 16, -69, -32, -78}, new byte[]{-99, -55, 96, -46, -114, -43, -83, -3}), null))) {
                    return Boolean.TRUE;
                }
            } catch (Exception e) {
                SpiderDebug.log(C0098a.a(new byte[]{-21, -112, 70, 78, -58, 33, -90, 105, -17, -102, 96, 95, -35, 110, -115, 43, -84}, new byte[]{-116, -1, 16, 43, -76, 1, -29, 17}) + e.getMessage());
            }
            i++;
            if (i < 5) {
                try {
                    Thread.sleep(3000L);
                } catch (InterruptedException e2) {
                    SpiderDebug.log(C0098a.a(new byte[]{80, 23, -38, -9, 120, 100, 37, -7, 119, 30, -51, -32, 125, 52, 56, -14, 103, 65, -97}, new byte[]{3, 123, -65, -110, 8, 68, 76, -105}) + e2.getMessage());
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
        Pattern pattern = C0207D.a;
        return String.format(Locale.getDefault(), C0098a.a(new byte[]{66, -68, -40, -2, 40, -60, -43, 108, 20, -23, -109, -29, 40, -51, -119, 45, 90, -22, -125, -83, 57, -64, -99, 39, 12, -14, -62, -17, 124, -61, -115, 48, 90, -66, -110, -22, 40, -61, -50, 61, 30, -65, -126, -74, 43, -35, -119, 59, 12, -23, -109, -30, 55, -51, -101, 61, 6, -94, -105, -74, 127, -52, -50, 58, 14, -88, -119, -74, 127, -37}, new byte[]{103, -49, -25, -117, 90, -88, -24, 73}), b, URLEncoder.encode(str), Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(jCurrentTimeMillis), C0207D.a(String.format(C0098a.a(new byte[]{-112, -97, 20, -59}, new byte[]{-75, -5, 49, -74, 8, 80, -103, -11}), Long.valueOf(jCurrentTimeMillis), C0220m.c(C0098a.a(new byte[]{-33, 3, -17, -112, 53, 42}, new byte[]{-75, 98, -99, -3, 81, 31, 101, 36})))).substring(0, 10));
    }

    public static String e(String str) {
        return String.format(Locale.getDefault(), C0098a.a(new byte[]{-19, 26, 108, -103, 127, -118, -70, 11, -69, 79, 39, -124, 127, -125, -26, 74, -11, 76, 55}, new byte[]{-56, 105, 83, -20, 13, -26, -121, 46}), a, URLEncoder.encode(str), 10);
    }

    public static void f() {
        boolean zIsEmpty = C0197c.l(a, null).isEmpty();
        if (zIsEmpty) {
            C0197c.k(C0098a.a(new byte[]{-9, 75, -53, -2, -76, -53, 106, -73, -83, 8, -111, -66, -96, -44, 107, -73, -91}, new byte[]{-97, 63, -65, -114, -114, -28, 69, -122}) + Proxy.getPort() + C0098a.a(new byte[]{79, -81, 37}, new byte[]{96, -56, 74, 70, 7, 116, -110, -71}));
        }
        if (zIsEmpty) {
            for (int i = 0; C0197c.l(a, null).isEmpty() && i < 3; i++) {
                SystemClock.sleep(20L);
            }
        }
    }

    public static String g() {
        try {
            f();
            return new JSONObject(C0197c.l(C0098a.a(new byte[]{45, -120, -114, -124, 22, -9, -81, -72, 119, -53, -44, -60, 2, -24, -82, -72, 127, -53, -51, -61, 27, -9, -10, -20, 55, -113, -109, -101, 66}, new byte[]{69, -4, -6, -12, 44, -40, -128, -119}), null)).optString(C0098a.a(new byte[]{84, -17, -127, 87, 32, 44, 84}, new byte[]{34, -118, -13, 36, 73, 67, 58, 125}));
        } catch (Exception e) {
            SpiderDebug.log(C0098a.a(new byte[]{55, -79, 67, 45, 52, 88, -8, 29, 51, -69, 101, 60, 47, 23, -45, 95, 112, -2}, new byte[]{80, -34, 21, 72, 70, 120, -67, 101}) + e.getMessage());
            return "";
        }
    }

    public static Object[] h(String str, Map<String, String> map) {
        Response responseE = C0197c.e(str, map);
        String strA = C0098a.a(new byte[]{-2, 120, -44, -35, 81, -23, 83, 126, -10, 103, -54, -98, 87, -23, 70, 39, -20, 124, -42, -44, 89, -25}, new byte[]{-97, 8, -92, -79, 56, -118, 50, 10});
        HashMap map2 = new HashMap();
        for (String str2 : responseE.headers().names()) {
            map2.put(str2, responseE.headers().get(str2));
        }
        return new Object[]{206, strA, responseE.body().byteStream(), map2};
    }
}
