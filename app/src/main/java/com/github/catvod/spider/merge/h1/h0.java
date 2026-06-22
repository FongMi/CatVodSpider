package com.github.catvod.spider.merge.h1;

import com.github.catvod.spider.merge.f1.Q1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class h0 extends AbstractC1239f {
    private List<i0> o;

    public h0() {
        this.o = new ArrayList();
        this.b = 126;
    }

    public h0(int i) {
        super(i);
        this.o = new ArrayList();
        this.b = 126;
    }

    @Override // com.github.catvod.spider.merge.f1.Q1
    public final Q1 N(int i) {
        if (i != 126 && i != 158 && i != 157) {
            throw new IllegalArgumentException(com.github.catvod.spider.merge.C.u.b("invalid decl type: ", i));
        }
        super.N(i);
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.i0>] */
    public final void d0(i0 i0Var) {
        this.o.add(i0Var);
        i0Var.a0(this);
    }

    public final List<i0> e0() {
        return this.o;
    }
}
