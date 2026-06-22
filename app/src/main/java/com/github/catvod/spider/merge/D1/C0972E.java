package com.github.catvod.spider.merge.d1;

import com.github.catvod.spider.merge.c1.C0947c;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0972E {
    public static final C0972E c = new C0972E(false, false);
    public static final C0972E d = new C0972E(true, true);
    private final boolean a;
    private final boolean b;

    public C0972E(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    static String a(String str) {
        return com.github.catvod.spider.merge.g.b.b(str.trim());
    }

    public final String b(String str) {
        String strTrim = str.trim();
        return !this.b ? com.github.catvod.spider.merge.g.b.b(strTrim) : strTrim;
    }

    final C0947c c(C0947c c0947c) {
        if (c0947c != null && !this.b) {
            c0947c.x();
        }
        return c0947c;
    }

    public final String d(String str) {
        String strTrim = str.trim();
        return !this.a ? com.github.catvod.spider.merge.g.b.b(strTrim) : strTrim;
    }

    public final boolean e() {
        return this.b;
    }

    public final boolean f() {
        return this.a;
    }
}
