package com.github.catvod.spider.merge.h1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class Y extends E {
    private static final List<X> t = Collections.unmodifiableList(new ArrayList());
    private AbstractC1239f r;
    private List<X> s;

    public Y() {
        this.b = 118;
    }

    public Y(int i) {
        this.b = 118;
        this.i = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.X>] */
    public final void m0(X x) {
        if (this.s == null) {
            this.s = new ArrayList();
        }
        this.s.add(x);
        x.a0(this);
    }

    public final List<X> n0() {
        List<X> list = this.s;
        return list != null ? list : t;
    }

    public final AbstractC1239f o0() {
        return this.r;
    }

    public final void p0(AbstractC1239f abstractC1239f) {
        this.r = abstractC1239f;
        abstractC1239f.a0(this);
    }
}
