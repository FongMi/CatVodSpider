package com.github.catvod.spider.merge.h1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class f0 extends AbstractC1239f {
    private AbstractC1239f o;

    public f0() {
    }

    public f0(int i, int i2) {
        super(i, i2);
    }

    public f0(int i, AbstractC1239f abstractC1239f) {
        P(abstractC1239f);
        int i2 = abstractC1239f.i;
        X(i2, abstractC1239f.j + i2);
        f0(i);
        this.o = abstractC1239f;
        abstractC1239f.a0(this);
    }

    public final AbstractC1239f d0() {
        return this.o;
    }

    public final void e0(AbstractC1239f abstractC1239f) {
        this.o = abstractC1239f;
        abstractC1239f.a0(this);
    }

    public final void f0(int i) {
        if (!(i >= -1 && i <= 174)) {
            throw new IllegalArgumentException(com.github.catvod.spider.merge.C.u.b("Invalid token: ", i));
        }
        N(i);
    }
}
