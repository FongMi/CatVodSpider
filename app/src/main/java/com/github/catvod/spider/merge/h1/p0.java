package com.github.catvod.spider.merge.h1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class p0 extends AbstractC1239f {
    private List<o0> o;

    public p0() {
        this.o = new ArrayList();
        this.b = 149;
    }

    public p0(int i) {
        super(i);
        this.o = new ArrayList();
        this.b = 149;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.o0>] */
    public final void d0(o0 o0Var) {
        this.o.add(o0Var);
        o0Var.a0(this);
    }

    public final List<o0> e0() {
        return this.o;
    }
}
