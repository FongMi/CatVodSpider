package com.github.catvod.spider.merge.h1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class N extends AbstractC1239f implements InterfaceC1248o {
    private static final List<O> q = Collections.unmodifiableList(new ArrayList());
    private List<O> o;
    boolean p;

    public N() {
        this.b = 67;
    }

    public N(int i, int i2) {
        super(i, i2);
        this.b = 67;
    }

    @Override // com.github.catvod.spider.merge.h1.InterfaceC1248o
    public final boolean a() {
        return this.p;
    }

    @Override // com.github.catvod.spider.merge.h1.InterfaceC1248o
    public final void b() {
        this.p = true;
    }

    public final List<O> d0() {
        List<O> list = this.o;
        return list != null ? list : q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.O>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.O>] */
    public final void e0(List<O> list) {
        Object r0 = this.o;
        if (r0 != 0) {
            r0.clear();
        }
        for (O o : list) {
            P(o);
            if (this.o == null) {
                this.o = new ArrayList();
            }
            this.o.add(o);
            o.a0(this);
        }
    }
}
