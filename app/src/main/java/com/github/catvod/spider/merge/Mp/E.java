package com.github.catvod.spider.merge.Mp;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
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
        return com.github.catvod.spider.merge.Bk.l.c(str.trim());
    }

    public final String b(String str) {
        String strTrim = str.trim();
        return !this.b ? com.github.catvod.spider.merge.Bk.l.c(strTrim) : strTrim;
    }

    @Nullable
    final com.github.catvod.spider.merge.UY.c c(@Nullable com.github.catvod.spider.merge.UY.c cVar) {
        if (cVar != null && !this.b) {
            cVar.u();
        }
        return cVar;
    }

    public final String d(String str) {
        String strTrim = str.trim();
        return !this.a ? com.github.catvod.spider.merge.Bk.l.c(strTrim) : strTrim;
    }

    public final boolean e() {
        return this.b;
    }

    public final boolean f() {
        return this.a;
    }
}
