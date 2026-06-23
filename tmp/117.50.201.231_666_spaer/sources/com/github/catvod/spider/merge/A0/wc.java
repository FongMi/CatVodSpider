package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class wc {
    public static void a(boolean z) {
        if (!z) {
            throw new gg("Must be true");
        }
    }

    public static int b(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static void c(String str) {
        if (str == null || str.length() == 0) {
            throw new gg("String must not be empty");
        }
    }

    public static void d(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new gg(str2);
        }
    }

    public static void e(Object obj) {
        if (obj == null) {
            throw new gg("Object must not be null");
        }
    }
}
