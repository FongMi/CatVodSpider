package com.github.catvod.spider.merge;

import java.text.Format;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.آ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
abstract class AbstractC0233<F extends Format> {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static final ConcurrentMap<C0234, String> f603 = new ConcurrentHashMap(7);

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private final ConcurrentMap<C0234, F> f604 = new ConcurrentHashMap(7);

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.آ$Ϳ, reason: contains not printable characters */
    private static final class C0234 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final Object[] f605;

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        private final int f606;

        C0234(Object... objArr) {
            this.f605 = objArr;
            this.f606 = m828(objArr);
        }

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private static int m828(Object[] objArr) {
            return 31 + Arrays.hashCode(objArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C0234.class == obj.getClass()) {
                return Arrays.deepEquals(this.f605, ((C0234) obj).f605);
            }
            return false;
        }

        public int hashCode() {
            return this.f606;
        }
    }

    AbstractC0233() {
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    protected abstract F mo826(String str, TimeZone timeZone, Locale locale);

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public F m827(String str, TimeZone timeZone, Locale locale) {
        C0164.m578(str, SOY.d("0A332502110514"), new Object[0]);
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        Locale localeM482 = C0152.m482(locale);
        C0234 c0234 = new C0234(str, timeZone, localeM482);
        F f = this.f604.get(c0234);
        if (f != null) {
            return f;
        }
        F f2 = (F) mo826(str, timeZone, localeM482);
        F fPutIfAbsent = this.f604.putIfAbsent(c0234, f2);
        return fPutIfAbsent != null ? fPutIfAbsent : f2;
    }
}
