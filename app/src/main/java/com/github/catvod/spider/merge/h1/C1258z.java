package com.github.catvod.spider.merge.h1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h1.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1258z extends U {
    private AbstractC1239f v;
    private List<C1231A> w;
    private AbstractC1239f x;

    public C1258z() {
        this.w = new ArrayList();
        this.b = 166;
    }

    public C1258z(int i, int i2) {
        super(i);
        this.j = i2;
        this.w = new ArrayList();
        this.b = 166;
    }

    public final AbstractC1239f A0() {
        return this.v;
    }

    public final void B0(AbstractC1239f abstractC1239f) {
        this.x = abstractC1239f;
        if (abstractC1239f != null) {
            abstractC1239f.a0(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.A>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.A>] */
    public final void C0(List<C1231A> list) {
        this.w.clear();
        for (C1231A c1231a : list) {
            P(c1231a);
            this.w.add(c1231a);
            c1231a.a0(this);
        }
    }

    public final void D0(AbstractC1239f abstractC1239f) {
        P(abstractC1239f);
        this.v = abstractC1239f;
        abstractC1239f.a0(this);
    }

    public final AbstractC1239f y0() {
        return this.x;
    }

    public final List<C1231A> z0() {
        return this.w;
    }
}
