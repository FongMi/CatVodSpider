package com.github.catvod.spider.merge.h1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class X extends AbstractC1239f {
    private AbstractC1239f o;
    private List<AbstractC1239f> p;

    public X() {
        this.b = 119;
    }

    public X(int i) {
        super(i);
        this.b = 119;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.f>] */
    public final void d0(AbstractC1239f abstractC1239f) {
        P(abstractC1239f);
        if (this.p == null) {
            this.p = new ArrayList();
        }
        this.j = (abstractC1239f.i + abstractC1239f.j) - this.i;
        this.p.add(abstractC1239f);
        abstractC1239f.a0(this);
    }

    public final AbstractC1239f e0() {
        return this.o;
    }

    public final List<AbstractC1239f> f0() {
        return this.p;
    }

    public final void g0(AbstractC1239f abstractC1239f) {
        this.o = abstractC1239f;
        if (abstractC1239f != null) {
            abstractC1239f.a0(this);
        }
    }
}
