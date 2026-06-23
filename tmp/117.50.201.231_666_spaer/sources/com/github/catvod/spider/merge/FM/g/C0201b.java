package com.github.catvod.spider.merge.FM.G;

import java.text.Format;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.G.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class C0201b {
    private final ConcurrentMap<P, C0202c> a = new ConcurrentHashMap(7);

    static {
        new ConcurrentHashMap(7);
    }

    C0201b() {
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<com.github.catvod.spider.merge.FM.G.P, com.github.catvod.spider.merge.FM.G.c>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<com.github.catvod.spider.merge.FM.G.P, com.github.catvod.spider.merge.FM.G.c>] */
    public final Format a(String str, Locale locale) {
        com.github.catvod.spider.merge.FM.C.j.a(str, new Object[0]);
        TimeZone timeZone = TimeZone.getDefault();
        Locale localeA = com.github.catvod.spider.merge.FM.C.c.a(locale);
        P p = new P(str, timeZone, localeA);
        Format format = (Format) this.a.get(p);
        if (format != null) {
            return format;
        }
        C0202c c0202c = new C0202c(str, timeZone, localeA);
        Format format2 = (Format) this.a.putIfAbsent(p, c0202c);
        return format2 != null ? format2 : c0202c;
    }
}
