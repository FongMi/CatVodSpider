package com.github.catvod.spider.merge.E;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class c {
    private c() {
    }

    public static void a(String str) {
        throw new d(str);
    }

    public static void b(boolean z) {
        if (z) {
            throw new d("Must be false");
        }
    }

    public static void c(boolean z) {
        if (!z) {
            throw new d("Must be true");
        }
    }

    public static void d(boolean z, String str) {
        if (!z) {
            throw new d(str);
        }
    }

    public static void e(@Nullable String str) {
        if (str == null || str.length() == 0) {
            throw new d("String must not be empty");
        }
    }

    public static void f(@Nullable String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new d(str2);
        }
    }

    public static void g(@Nullable Object obj) {
        if (obj == null) {
            throw new d("Object must not be null");
        }
    }
}
