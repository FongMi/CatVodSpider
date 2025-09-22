package com.github.catvod.spider.merge;

import javax.annotation.Nullable;

/* renamed from: com.github.catvod.spider.merge.bw */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public final class C0111bw {
    /* renamed from: MH */
    public static void m552MH(@Nullable String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: Mo */
    public static void m553Mo(Object[] objArr, String str) {
        for (Object obj : objArr) {
            if (obj == null) {
                throw new IllegalArgumentException(str);
            }
        }
    }

    /* renamed from: QU */
    public static void m554QU(boolean z) {
        if (!z) {
            throw new IllegalArgumentException("Must be true");
        }
    }

    /* renamed from: UJ */
    public static void m555UJ(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: W */
    public static void m556W(@Nullable Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: i */
    public static void m557i(@Nullable String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("String must not be empty");
        }
    }

    /* renamed from: q */
    public static void m558q(String str) {
        throw new IllegalArgumentException(str);
    }

    /* renamed from: se */
    public static void m559se(@Nullable Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
    }

    /* renamed from: u */
    public static void m560u(Object[] objArr) {
        m553Mo(objArr, "Array must not contain any null objects");
    }

    /* renamed from: xC */
    public static void m561xC(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Must be false");
        }
    }
}
