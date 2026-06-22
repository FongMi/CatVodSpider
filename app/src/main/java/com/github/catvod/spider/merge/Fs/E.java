package com.github.catvod.spider.merge.Fs;

import java.io.StringReader;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class E {
    private i1 a;
    private C b = new C();

    public E(i1 i1Var) {
        this.a = i1Var;
    }

    public static com.github.catvod.spider.merge.Em.h c(String str) {
        O oT;
        C0633b c0633b = new C0633b();
        c0633b.C(new StringReader(str), new E(c0633b));
        Q q = c0633b.c;
        do {
            oT = q.t();
            c0633b.c(oT);
            oT.g();
        } while (oT.a != 6);
        c0633b.b.d();
        c0633b.b = null;
        c0633b.c = null;
        c0633b.e = null;
        return c0633b.d;
    }

    public final C a() {
        return this.b;
    }

    public final boolean b(String str) {
        return this.a.b(str);
    }
}
