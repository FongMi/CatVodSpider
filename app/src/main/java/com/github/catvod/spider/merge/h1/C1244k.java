package com.github.catvod.spider.merge.h1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1244k extends AbstractC1239f {
    private K o;
    private AbstractC1239f p;
    private U q;

    public C1244k() {
        this.b = 128;
    }

    public C1244k(int i) {
        super(i);
        this.b = 128;
    }

    public final U d0() {
        return this.q;
    }

    public final AbstractC1239f e0() {
        return this.p;
    }

    public final K f0() {
        return this.o;
    }

    public final void g0(U u) {
        this.q = u;
        u.a0(this);
    }

    public final void h0(AbstractC1239f abstractC1239f) {
        this.p = abstractC1239f;
        if (abstractC1239f != null) {
            abstractC1239f.a0(this);
        }
    }

    public final void i0(K k) {
        this.o = k;
        if (k != null) {
            k.a0(this);
        }
    }
}
