package com.github.catvod.spider.merge.L1;

import com.github.catvod.spider.merge.l.C1290c;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class m {
    private static final Pattern a = Pattern.compile("(https?)?://m\\.");
    private static final Pattern b = Pattern.compile("(https?)?://www\\.");
    public static final /* synthetic */ int c = 0;

    public static void a(Pattern pattern, String str) throws com.github.catvod.spider.merge.p1.i {
        if (j(str)) {
            throw new IllegalArgumentException("Url can't be null or empty");
        }
        if (!pattern.matcher(str.toLowerCase()).find()) {
            throw new com.github.catvod.spider.merge.p1.i("Url doesn't match the pattern");
        }
    }

    public static String b(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    public static String c(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    public static String d(String str) {
        try {
            URL urlQ = q(str);
            return (urlQ.getHost().contains("google") && urlQ.getPath().equals("/url")) ? b(k.d("&url=([^&]+)(?:&|$)", str, 1)) : str;
        } catch (Exception unused) {
            return str;
        }
    }

    public static String e(String str) throws com.github.catvod.spider.merge.p1.i {
        try {
            URL urlQ = q(str);
            return urlQ.getProtocol() + "://" + urlQ.getAuthority();
        } catch (MalformedURLException e) {
            String message = e.getMessage();
            if (message.startsWith("unknown protocol: ")) {
                return message.substring(18);
            }
            throw new com.github.catvod.spider.merge.p1.i(C1290c.a("Malformed url: ", str), e);
        }
    }

    public static String f(URL url, String str) {
        String query = url.getQuery();
        if (query == null) {
            return null;
        }
        for (String str2 : query.split("&")) {
            String[] strArrSplit = str2.split("=", 2);
            if (b(strArrSplit[0]).equals(str)) {
                return b(strArrSplit[1]);
            }
        }
        return null;
    }

    public static String g(String str, String[] strArr) throws j {
        String strE;
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            if (str2 != null) {
                arrayList.add(Pattern.compile(str2));
            }
        }
        for (Pattern pattern : (Pattern[]) arrayList.toArray(new Pattern[0])) {
            try {
                strE = k.e(pattern, str, 1);
            } catch (j unused) {
            }
            if (strE != null) {
                return strE;
            }
        }
        throw new j("No regex matched the input on group 1");
    }

    public static boolean h(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static boolean i(URL url) {
        String protocol = url.getProtocol();
        if (!protocol.equals("http") && !protocol.equals("https")) {
            return false;
        }
        return (url.getPort() == -1) || (url.getPort() == url.getDefaultPort());
    }

    public static boolean j(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean k(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static <K, V> boolean l(Map<K, V> map) {
        return map == null || map.isEmpty();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long m(java.lang.String r6) {
        /*
            r0 = 2
            java.lang.String r1 = "[\\d]+([\\.,][\\d]+)?([KMBkmb])+"
            java.lang.String r1 = com.github.catvod.spider.merge.L1.k.d(r1, r6, r0)     // Catch: com.github.catvod.spider.merge.p1.i -> L8
            goto La
        L8:
            java.lang.String r1 = ""
        La:
            java.lang.String r2 = "([\\d]+([\\.,][\\d]+)?)"
            r3 = 1
            java.lang.String r6 = com.github.catvod.spider.merge.L1.k.d(r2, r6, r3)
            java.lang.String r2 = ","
            java.lang.String r4 = "."
            java.lang.String r6 = r6.replace(r2, r4)
            double r4 = java.lang.Double.parseDouble(r6)
            java.lang.String r6 = r1.toUpperCase()
            r6.getClass()
            r1 = -1
            int r2 = r6.hashCode()
            switch(r2) {
                case 66: goto L42;
                case 75: goto L37;
                case 77: goto L2e;
                default: goto L2c;
            }
        L2c:
            r0 = -1
            goto L4c
        L2e:
            java.lang.String r2 = "M"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L4c
            goto L2c
        L37:
            java.lang.String r0 = "K"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L40
            goto L2c
        L40:
            r0 = 1
            goto L4c
        L42:
            java.lang.String r0 = "B"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L4b
            goto L2c
        L4b:
            r0 = 0
        L4c:
            switch(r0) {
                case 0: goto L60;
                case 1: goto L5a;
                case 2: goto L51;
                default: goto L4f;
            }
        L4f:
            long r0 = (long) r4
            return r0
        L51:
            r0 = 4696837146684686336(0x412e848000000000, double:1000000.0)
        L56:
            double r4 = r4 * r0
            long r0 = (long) r4
            return r0
        L5a:
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            goto L56
        L60:
            r0 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.L1.m.m(java.lang.String):long");
    }

    public static String n(String str) {
        String str2;
        if (a.matcher(str).find()) {
            str2 = "m.";
        } else {
            if (!b.matcher(str).find()) {
                return str;
            }
            str2 = "www.";
        }
        return str.replace(str2, "");
    }

    public static String o(String str) {
        return str.replaceAll("\\D+", "");
    }

    public static String p(String str) {
        if (str == null) {
            return null;
        }
        return str.startsWith("http://") ? C1290c.a("https://", str.substring(7)) : str;
    }

    public static URL q(String str) throws MalformedURLException {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            if (e.getMessage().equals("no protocol: " + str)) {
                return new URL(C1290c.a("https://", str));
            }
            throw e;
        }
    }
}
