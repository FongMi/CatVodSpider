package com.github.catvod.spider.merge.h1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class J extends U {
    protected AbstractC1239f v;

    public J() {
    }

    public J(int i) {
        super(i);
    }

    public AbstractC1239f y0() {
        return this.v;
    }

    public void z0(AbstractC1239f abstractC1239f) {
        this.v = abstractC1239f;
        this.j = (abstractC1239f.i + abstractC1239f.j) - this.i;
        abstractC1239f.a0(this);
    }
}
