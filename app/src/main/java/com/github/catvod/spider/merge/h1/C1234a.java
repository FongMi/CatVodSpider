package com.github.catvod.spider.merge.h1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1234a extends U {
    private AbstractC1239f v;
    private List<C1235b> w;
    private AbstractC1239f x;

    public C1234a() {
        this.w = new ArrayList();
        this.b = 161;
    }

    public C1234a(int i, int i2) {
        super(i);
        this.j = i2;
        this.w = new ArrayList();
        this.b = 161;
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

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.b>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.b>] */
    public final void C0(List<C1235b> list) {
        this.w.clear();
        for (C1235b c1235b : list) {
            P(c1235b);
            this.w.add(c1235b);
            c1235b.a0(this);
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

    public final List<C1235b> z0() {
        return this.w;
    }
}
