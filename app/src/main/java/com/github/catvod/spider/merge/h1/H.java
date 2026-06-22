package com.github.catvod.spider.merge.h1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class H extends AbstractC1239f {
    private List<G> o;
    private AbstractC1239f p;

    public H() {
        this.o = new ArrayList();
        this.b = 137;
    }

    public H(int i) {
        super(i);
        this.o = new ArrayList();
        this.b = 137;
    }

    @Override // com.github.catvod.spider.merge.h1.AbstractC1239f
    public final boolean V() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.G>] */
    public final void d0(G g) {
        this.o.add(g);
        g.a0(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.G>] */
    public final G e0() {
        return (G) this.o.get(0);
    }

    public final List<G> f0() {
        return this.o;
    }

    public final AbstractC1239f g0() {
        return this.p;
    }

    public final void h0(AbstractC1239f abstractC1239f) {
        this.p = abstractC1239f;
        abstractC1239f.a0(this);
    }
}
