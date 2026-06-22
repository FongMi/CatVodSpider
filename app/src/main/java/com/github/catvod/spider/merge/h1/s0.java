package com.github.catvod.spider.merge.h1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class s0 extends AbstractC1239f {
    protected K o;
    protected int p;

    public s0() {
        this.p = -1;
    }

    public s0(int i, int i2) {
        super(i, i2);
        this.p = -1;
    }

    public final K d0() {
        return this.o;
    }

    public final boolean e0() {
        return this.p >= 0;
    }

    public final void f0(int i) {
        this.p = i;
    }

    public final void g0(K k) {
        this.o = k;
        if (k != null) {
            k.a0(this);
        }
    }
}
