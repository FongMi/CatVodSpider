package com.github.catvod.spider.merge;

import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ǃ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0034 {
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static void m276(String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static void m277(boolean z) {
        if (z) {
            throw new IllegalArgumentException(SOY.d("3727220254151F72371718041F"));
        }
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static void m278(boolean z) {
        if (!z) {
            throw new IllegalArgumentException(SOY.d("3727220254151F7225040112"));
        }
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public static void m279(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public static void m280(Object[] objArr) {
        m281(objArr, SOY.d("3B2023170D57172722025419152671151B190E3338185416142B7118011B16723E141E12192622"));
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public static void m281(Object[] objArr, String str) {
        for (Object obj : objArr) {
            if (obj == null) {
                throw new IllegalArgumentException(str);
            }
        }
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public static void m282(@Nullable String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(SOY.d("2926231F1A105A3F24050057143D255616125A373C06000E"));
        }
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public static void m283(@Nullable String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    public static void m284(@Nullable Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(SOY.d("35303B1317035A3F24050057143D255616125A3C241A18"));
        }
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public static void m285(@Nullable Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }
}
