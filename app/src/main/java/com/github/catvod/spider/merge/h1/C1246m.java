package com.github.catvod.spider.merge.h1;

import com.github.catvod.spider.merge.f1.C1162n0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1246m extends AbstractC1239f {
    private AbstractC1239f o;
    private AbstractC1239f p;
    private AbstractC1239f q;

    public C1246m() {
        this.b = 106;
    }

    public C1246m(int i, int i2) {
        super(i, i2);
        this.b = 106;
    }

    @Override // com.github.catvod.spider.merge.h1.AbstractC1239f
    public final boolean V() {
        AbstractC1239f abstractC1239f;
        if (this.o != null && (abstractC1239f = this.p) != null && this.q != null) {
            return abstractC1239f.V() && this.q.V();
        }
        C1162n0.c();
        throw null;
    }

    public final AbstractC1239f d0() {
        return this.q;
    }

    public final AbstractC1239f e0() {
        return this.o;
    }

    public final AbstractC1239f f0() {
        return this.p;
    }

    public final void g0(AbstractC1239f abstractC1239f) {
        this.q = abstractC1239f;
        abstractC1239f.a0(this);
    }

    public final void h0(AbstractC1239f abstractC1239f) {
        this.o = abstractC1239f;
        abstractC1239f.a0(this);
    }

    public final void i0(AbstractC1239f abstractC1239f) {
        P(abstractC1239f);
        this.p = abstractC1239f;
        abstractC1239f.a0(this);
    }
}
