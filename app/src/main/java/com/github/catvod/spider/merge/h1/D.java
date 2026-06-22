package com.github.catvod.spider.merge.h1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class D extends AbstractC1239f {
    protected AbstractC1239f o;
    protected AbstractC1239f p;

    public D() {
    }

    public D(int i) {
        super(i);
    }

    public D(int i, int i2) {
        super(i, i2);
    }

    public D(int i, AbstractC1239f abstractC1239f, AbstractC1239f abstractC1239f2) {
        N(i);
        int i2 = abstractC1239f.i;
        g0(abstractC1239f, abstractC1239f2);
    }

    @Override // com.github.catvod.spider.merge.h1.AbstractC1239f
    public final boolean V() {
        int iV = v();
        if (iV == 92) {
            AbstractC1239f abstractC1239f = this.p;
            return abstractC1239f != null && abstractC1239f.V();
        }
        if (iV != 108 && iV != 109) {
            return super.V();
        }
        AbstractC1239f abstractC1239f2 = this.o;
        if (abstractC1239f2 != null && abstractC1239f2.V()) {
            return true;
        }
        AbstractC1239f abstractC1239f3 = this.p;
        return abstractC1239f3 != null && abstractC1239f3.V();
    }

    public final AbstractC1239f d0() {
        return this.o;
    }

    public final AbstractC1239f e0() {
        return this.p;
    }

    public final void f0(AbstractC1239f abstractC1239f) {
        P(abstractC1239f);
        this.o = abstractC1239f;
        L(abstractC1239f.q());
        abstractC1239f.a0(this);
    }

    public final void g0(AbstractC1239f abstractC1239f, AbstractC1239f abstractC1239f2) {
        P(abstractC1239f);
        P(abstractC1239f2);
        X(abstractC1239f.i, abstractC1239f2.i + abstractC1239f2.j);
        f0(abstractC1239f);
        h0(abstractC1239f2);
    }

    public final void h0(AbstractC1239f abstractC1239f) {
        P(abstractC1239f);
        this.p = abstractC1239f;
        abstractC1239f.a0(this);
    }
}
