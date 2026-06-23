package com.github.catvod.spider.merge.A0;

import java.util.Map;
import okhttp3.Headers;
import rxhttp.wrapper.param.IHeaders;
import rxhttp.wrapper.param.Param;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract /* synthetic */ class ll {
    public static Param a(IHeaders iHeaders, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            iHeaders.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        return (Param) iHeaders;
    }

    public static Param b(IHeaders iHeaders, Headers headers) {
        iHeaders.getHeadersBuilder().addAll(headers);
        return (Param) iHeaders;
    }

    public static Param c(IHeaders iHeaders, String str) {
        iHeaders.getHeadersBuilder().add(str);
        return (Param) iHeaders;
    }

    public static Param d(IHeaders iHeaders, String str, String str2) {
        iHeaders.getHeadersBuilder().add(str, str2);
        return (Param) iHeaders;
    }

    public static Param e(IHeaders iHeaders, String str, String str2) {
        iHeaders.getHeadersBuilder().addUnsafeNonAscii(str, str2);
        return (Param) iHeaders;
    }

    public static String f(IHeaders iHeaders, String str) {
        return iHeaders.getHeadersBuilder().get(str);
    }

    public static Param g(IHeaders iHeaders, String str) {
        iHeaders.getHeadersBuilder().removeAll(str);
        return (Param) iHeaders;
    }

    public static Param h(IHeaders iHeaders, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            iHeaders.setHeader((String) entry.getKey(), (String) entry.getValue());
        }
        return (Param) iHeaders;
    }

    public static Param i(IHeaders iHeaders, String str, String str2) {
        iHeaders.getHeadersBuilder().set(str, str2);
        return (Param) iHeaders;
    }

    public static Param j(IHeaders iHeaders, String str, String str2) {
        Headers.Builder headersBuilder = iHeaders.getHeadersBuilder();
        headersBuilder.removeAll(str);
        headersBuilder.addUnsafeNonAscii(str, str2);
        return (Param) iHeaders;
    }

    public static Param k(IHeaders iHeaders, long j) {
        return iHeaders.setRangeHeader(j, -1L);
    }

    public static Param l(IHeaders iHeaders, long j, long j2) {
        if (j2 < j) {
            j2 = -1;
        }
        String str = "bytes=" + j + "-";
        if (j2 >= 0) {
            str = str + j2;
        }
        return iHeaders.addHeader("RANGE", str);
    }
}
