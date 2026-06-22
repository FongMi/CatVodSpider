package com.github.catvod.spider.merge.h1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1236c extends AbstractC1239f implements InterfaceC1248o {
    private static final List<AbstractC1239f> r = Collections.unmodifiableList(new ArrayList());
    private List<AbstractC1239f> o;
    private int p;
    private boolean q;

    public C1236c() {
        this.b = 66;
    }

    public C1236c(int i) {
        super(i);
        this.b = 66;
    }

    @Override // com.github.catvod.spider.merge.h1.InterfaceC1248o
    public final boolean a() {
        return this.q;
    }

    @Override // com.github.catvod.spider.merge.h1.InterfaceC1248o
    public final void b() {
        this.q = true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.f>] */
    public final void d0(AbstractC1239f abstractC1239f) {
        P(abstractC1239f);
        if (this.o == null) {
            this.o = new ArrayList();
        }
        this.o.add(abstractC1239f);
        abstractC1239f.a0(this);
    }

    public final int e0() {
        return this.p;
    }

    public final List<AbstractC1239f> f0() {
        List<AbstractC1239f> list = this.o;
        return list != null ? list : r;
    }

    public final void g0(int i) {
        this.p = i;
    }
}
