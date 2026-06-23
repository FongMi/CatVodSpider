package com.github.catvod.spider.merge.FM.L;

import java.io.StringReader;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class F {
    private k1 a;
    private D b = new D();
    private E c;

    public F(k1 k1Var) {
        this.a = k1Var;
        this.c = k1Var.c();
    }

    public static com.github.catvod.spider.merge.FM.K.h d(String str) {
        C0219b c0219b = new C0219b();
        return c0219b.f(new StringReader(str), "", new F(c0219b));
    }

    public final D a() {
        return this.b;
    }

    public final boolean b(String str) {
        return this.a.e(str);
    }

    public final boolean c() {
        return this.b.b() > 0;
    }

    public final com.github.catvod.spider.merge.FM.K.h e(String str, String str2) {
        return this.a.f(new StringReader(str), str2, this);
    }

    public final E f() {
        return this.c;
    }

    public final F g() {
        this.c = E.d;
        return this;
    }
}
