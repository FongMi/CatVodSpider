package com.github.catvod.spider.merge.h1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class e0 extends AbstractC1239f {
    private static final List<C1244k> r = Collections.unmodifiableList(new ArrayList());
    private AbstractC1239f o;
    private List<C1244k> p;
    private AbstractC1239f q;

    public e0() {
        this.b = 84;
    }

    public e0(int i) {
        super(i);
        this.b = 84;
    }

    public final List<C1244k> d0() {
        List<C1244k> list = this.p;
        return list != null ? list : r;
    }

    public final AbstractC1239f e0() {
        return this.q;
    }

    public final AbstractC1239f f0() {
        return this.o;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.k>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.k>] */
    public final void g0(List<C1244k> list) {
        if (list == null) {
            this.p = null;
            return;
        }
        ?? r0 = this.p;
        if (r0 != 0) {
            r0.clear();
        }
        for (C1244k c1244k : list) {
            P(c1244k);
            if (this.p == null) {
                this.p = new ArrayList();
            }
            this.p.add(c1244k);
            c1244k.a0(this);
        }
    }

    public final void h0(AbstractC1239f abstractC1239f) {
        this.q = abstractC1239f;
        if (abstractC1239f != null) {
            abstractC1239f.a0(this);
        }
    }

    public final void i0(AbstractC1239f abstractC1239f) {
        this.o = abstractC1239f;
        abstractC1239f.a0(this);
    }
}
