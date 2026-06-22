package com.github.catvod.spider.merge.H;

import java.text.Format;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.H.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class C0026b {
    public final ConcurrentHashMap a = new ConcurrentHashMap(7);

    static {
        new ConcurrentHashMap(7);
    }

    public final Format a(String str, Locale locale) {
        Objects.requireNonNull(str, new com.github.catvod.spider.merge.E.e("pattern", new Object[0]));
        TimeZone timeZone = TimeZone.getDefault();
        Locale localeA = com.github.catvod.spider.merge.E.b.a(locale);
        D d = new D(str, timeZone, localeA);
        ConcurrentHashMap concurrentHashMap = this.a;
        Format format = (Format) concurrentHashMap.get(d);
        if (format != null) {
            return format;
        }
        C0027c c0027c = new C0027c(str, timeZone, localeA);
        Format format2 = (Format) concurrentHashMap.putIfAbsent(d, c0027c);
        return format2 != null ? format2 : c0027c;
    }
}
