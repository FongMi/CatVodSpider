package com.github.catvod.spider.merge.Dw;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class s {
    public static void a(Throwable th, Throwable th2) {
        com.github.catvod.spider.merge.E.f.e(th, "<this>");
        com.github.catvod.spider.merge.E.f.e(th2, "exception");
        if (th != th2) {
            com.github.catvod.spider.merge.A.c.a.a(th, th2);
        }
    }

    public static HttpUrl b(String str, List list) {
        HttpUrl httpUrl = HttpUrl.get(str);
        if (list == null || list.size() == 0) {
            return httpUrl;
        }
        HttpUrl.Builder builderNewBuilder = httpUrl.newBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.c()) {
                builderNewBuilder.addEncodedQueryParameter(aVar.a(), aVar.b().toString());
            } else {
                builderNewBuilder.addQueryParameter(aVar.a(), aVar.b().toString());
            }
        }
        return builderNewBuilder.build();
    }

    public static String c(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static String d(String str) {
        return c(str).trim();
    }
}
