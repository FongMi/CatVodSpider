package com.github.catvod.spider.merge.h1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class Z {
    private int a;
    private int b = -1;
    private String c;
    private U d;

    public Z() {
    }

    public Z(int i, String str) {
        this.c = str;
        if (i != 113 && i != 90 && i != 126 && i != 157 && i != 158) {
            throw new IllegalArgumentException(com.github.catvod.spider.merge.C.u.b("Invalid declType: ", i));
        }
        this.a = i;
    }

    public final U a() {
        return this.d;
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final void e(U u) {
        this.d = u;
    }

    public final void f(int i) {
        this.b = i;
    }

    public final String toString() {
        StringBuilder sbB = com.github.catvod.spider.merge.I.t0.b("Symbol (");
        sbB.append(com.github.catvod.spider.merge.L1.k.g(this.a));
        sbB.append(") name=");
        sbB.append(this.c);
        return sbB.toString();
    }
}
