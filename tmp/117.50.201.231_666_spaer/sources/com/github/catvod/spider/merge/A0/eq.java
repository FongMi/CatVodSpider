package com.github.catvod.spider.merge.A0;

import java.text.Format;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class eq {
    public final ConcurrentHashMap a = new ConcurrentHashMap(7);

    static {
        new ConcurrentHashMap(7);
    }

    public final Format b(String str, Locale locale) {
        Objects.requireNonNull(str, new hc("pattern", new Object[0]));
        TimeZone timeZone = TimeZone.getDefault();
        Locale localeA = at.a(locale);
        ab abVar = new ab(str, timeZone, localeA);
        ConcurrentHashMap concurrentHashMap = this.a;
        Format format = (Format) concurrentHashMap.get(abVar);
        if (format != null) {
            return format;
        }
        lx lxVar = new lx(str, timeZone, localeA);
        Format format2 = (Format) concurrentHashMap.putIfAbsent(abVar, lxVar);
        return format2 != null ? format2 : lxVar;
    }
}
