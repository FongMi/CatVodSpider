package com.github.catvod.spider.merge.HN;

import java.text.Format;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.HN.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C0702b {
    private final ConcurrentMap<P, C0703c> a = new ConcurrentHashMap(7);

    static {
        new ConcurrentHashMap(7);
    }

    C0702b() {
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<com.github.catvod.spider.merge.HN.P, com.github.catvod.spider.merge.HN.c>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<com.github.catvod.spider.merge.HN.P, com.github.catvod.spider.merge.HN.c>] */
    public final Format a(String str, Locale locale) {
        com.github.catvod.spider.merge.VE.j.a(str, new Object[0]);
        TimeZone timeZone = TimeZone.getDefault();
        Locale localeA = com.github.catvod.spider.merge.VE.c.a(locale);
        P p = new P(str, timeZone, localeA);
        Format format = (Format) this.a.get(p);
        if (format != null) {
            return format;
        }
        C0703c c0703c = new C0703c(str, timeZone, localeA);
        Format format2 = (Format) this.a.putIfAbsent(p, c0703c);
        return format2 != null ? format2 : c0703c;
    }
}
