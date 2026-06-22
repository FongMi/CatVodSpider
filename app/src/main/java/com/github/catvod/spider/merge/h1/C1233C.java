package com.github.catvod.spider.merge.h1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h1.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1233C extends AbstractC1239f {
    private AbstractC1239f o;
    private AbstractC1239f p;
    private AbstractC1239f q;

    public C1233C() {
        this.b = 116;
    }

    public C1233C(int i) {
        super(i);
        this.b = 116;
    }

    public final AbstractC1239f d0() {
        return this.o;
    }

    public final AbstractC1239f e0() {
        return this.q;
    }

    public final AbstractC1239f f0() {
        return this.p;
    }

    public final void g0(AbstractC1239f abstractC1239f) {
        P(abstractC1239f);
        this.o = abstractC1239f;
        abstractC1239f.a0(this);
    }

    public final void h0(AbstractC1239f abstractC1239f) {
        this.q = abstractC1239f;
        if (abstractC1239f != null) {
            abstractC1239f.a0(this);
        }
    }

    public final void i0(AbstractC1239f abstractC1239f) {
        P(abstractC1239f);
        this.p = abstractC1239f;
        abstractC1239f.a0(this);
    }
}
