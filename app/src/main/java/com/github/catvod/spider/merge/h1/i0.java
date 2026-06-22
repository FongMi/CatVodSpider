package com.github.catvod.spider.merge.h1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class i0 extends AbstractC1239f {
    private AbstractC1239f o;
    private AbstractC1239f p;

    public i0() {
        this.b = 126;
    }

    public i0(int i, int i2) {
        super(i, i2);
        this.b = 126;
    }

    public final boolean a() {
        return !(this.o instanceof K);
    }

    public final AbstractC1239f d0() {
        return this.p;
    }

    public final AbstractC1239f e0() {
        return this.o;
    }

    public final void f0(AbstractC1239f abstractC1239f) {
        this.p = abstractC1239f;
        if (abstractC1239f != null) {
            abstractC1239f.a0(this);
        }
    }

    public final void g0(AbstractC1239f abstractC1239f) {
        if (abstractC1239f == null) {
            throw new IllegalArgumentException("invalid target arg");
        }
        this.o = abstractC1239f;
        abstractC1239f.a0(this);
    }
}
