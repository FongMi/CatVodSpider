package com.github.catvod.spider.merge.J;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public abstract class b {
    public static void c(boolean z) {
        if (!z) {
            throw new c("Must be true");
        }
    }

    public static void d(String str) {
        if (str == null || str.length() == 0) {
            throw new c("String must not be empty");
        }
    }

    public static void e(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new c(str2);
        }
    }

    public static void f(Object obj) {
        if (obj == null) {
            throw new c("Object must not be null");
        }
    }

    public abstract boolean a(Object obj, Object obj2);

    public abstract int b(Object obj);
}
