package com.github.catvod.spider.merge.C;

import java.text.Format;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
abstract class g<F extends Format> {
    private final ConcurrentMap<a, F> a = new ConcurrentHashMap(7);

    private static final class a {
        private final Object[] a;
        private final int b;

        a(Object... objArr) {
            this.a = objArr;
            this.b = Arrays.hashCode(objArr) + 31;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                return Arrays.deepEquals(this.a, ((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.b;
        }
    }

    static {
        new ConcurrentHashMap(7);
    }

    g() {
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final Format a(String str, Locale locale) {
        com.github.catvod.spider.merge.y.h.a(str, new Object[0]);
        TimeZone timeZone = TimeZone.getDefault();
        Locale localeA = com.github.catvod.spider.merge.y.c.a(locale);
        a aVar = new a(str, timeZone, localeA);
        F f = this.a.get(aVar);
        if (f != null) {
            return f;
        }
        b bVar = new b(str, timeZone, localeA);
        F fPutIfAbsent = this.a.putIfAbsent(aVar, bVar);
        return fPutIfAbsent != null ? fPutIfAbsent : bVar;
    }
}
