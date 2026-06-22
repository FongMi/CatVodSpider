package com.github.catvod.spider.merge.Mp;

import java.io.StringReader;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class F {
    private k1 a;
    private D b = new D();
    private E c;

    public F(k1 k1Var) {
        this.a = k1Var;
        this.c = k1Var.c();
    }

    public static com.github.catvod.spider.merge.UY.h d(String str) {
        C0840b c0840b = new C0840b();
        return c0840b.f(new StringReader(str), "", new F(c0840b));
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

    public final com.github.catvod.spider.merge.UY.h e(String str, String str2) {
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
