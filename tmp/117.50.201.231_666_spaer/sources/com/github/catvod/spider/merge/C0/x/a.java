package com.github.catvod.spider.merge.C0.x;

import com.github.catvod.spider.merge.C0.A.c;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class a {
    public static void a(Throwable th, Throwable th2) {
        com.github.catvod.spider.merge.C0.E.f.e(th, "<this>");
        com.github.catvod.spider.merge.C0.E.f.e(th2, "exception");
        if (th != th2) {
            c.a.a(th, th2);
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
            com.github.catvod.spider.merge.C0.u0.a aVar = (com.github.catvod.spider.merge.C0.u0.a) it.next();
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
