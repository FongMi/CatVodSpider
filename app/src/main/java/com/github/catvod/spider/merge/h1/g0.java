package com.github.catvod.spider.merge.h1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class g0 extends AbstractC1239f {
    private AbstractC1239f o;
    private boolean p;

    public g0() {
    }

    public g0(int i, int i2, AbstractC1239f abstractC1239f, boolean z) {
        P(abstractC1239f);
        X(z ? abstractC1239f.i : i2, z ? i2 + 2 : abstractC1239f.i + abstractC1239f.j);
        if (!(i >= -1 && i <= 174)) {
            throw new IllegalArgumentException(com.github.catvod.spider.merge.C.u.b("Invalid token: ", i));
        }
        N(i);
        this.o = abstractC1239f;
        abstractC1239f.a0(this);
        this.p = z;
    }

    public final AbstractC1239f d0() {
        return this.o;
    }

    public final boolean e0() {
        return this.p;
    }

    public final boolean f0() {
        return !this.p;
    }
}
