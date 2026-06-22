package com.github.catvod.spider.merge.M;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class E {
    public static final E c = new E(false, false);
    public static final E d = new E(true, true);
    private final boolean a;
    private final boolean b;

    public E(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    static String a(String str) {
        return com.github.catvod.spider.merge.B.l.c(str.trim());
    }

    public final String b(String str) {
        String strTrim = str.trim();
        return !this.b ? com.github.catvod.spider.merge.B.l.c(strTrim) : strTrim;
    }

    @Nullable
    final com.github.catvod.spider.merge.L.c c(@Nullable com.github.catvod.spider.merge.L.c cVar) {
        if (cVar != null && !this.b) {
            cVar.u();
        }
        return cVar;
    }

    public final String d(String str) {
        String strTrim = str.trim();
        return !this.a ? com.github.catvod.spider.merge.B.l.c(strTrim) : strTrim;
    }

    public final boolean e() {
        return this.b;
    }

    public final boolean f() {
        return this.a;
    }
}
