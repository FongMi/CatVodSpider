package com.github.catvod.spider.merge.H;

import java.text.Format;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.H.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class C0001b {
    private final ConcurrentMap<P, C0002c> a = new ConcurrentHashMap(7);

    static {
        new ConcurrentHashMap(7);
    }

    C0001b() {
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<com.github.catvod.spider.merge.H.P, com.github.catvod.spider.merge.H.c>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<com.github.catvod.spider.merge.H.P, com.github.catvod.spider.merge.H.c>] */
    public final Format a(String str, Locale locale) {
        com.github.catvod.spider.merge.D.j.a(str, new Object[0]);
        TimeZone timeZone = TimeZone.getDefault();
        Locale localeA = com.github.catvod.spider.merge.D.c.a(locale);
        P p = new P(str, timeZone, localeA);
        Format format = (Format) this.a.get(p);
        if (format != null) {
            return format;
        }
        C0002c c0002c = new C0002c(str, timeZone, localeA);
        Format format2 = (Format) this.a.putIfAbsent(p, c0002c);
        return format2 != null ? format2 : c0002c;
    }
}
