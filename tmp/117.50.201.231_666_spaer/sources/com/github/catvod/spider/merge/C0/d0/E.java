package com.github.catvod.spider.merge.C0.d0;

import java.io.StringReader;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class E {
    private i1 a;
    private C b = new C();

    public E(i1 i1Var) {
        this.a = i1Var;
    }

    public static com.github.catvod.spider.merge.C0.c0.h c(String str) {
        O oT;
        C0125b c0125b = new C0125b();
        c0125b.C(new StringReader(str), new E(c0125b));
        Q q = c0125b.c;
        do {
            oT = q.t();
            c0125b.c(oT);
            oT.g();
        } while (oT.a != 6);
        c0125b.b.d();
        c0125b.b = null;
        c0125b.c = null;
        c0125b.e = null;
        return c0125b.d;
    }

    public final C a() {
        return this.b;
    }

    public final boolean b(String str) {
        return this.a.b(str);
    }
}
