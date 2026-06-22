package com.github.catvod.spider.merge.h1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h1.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1253u extends AbstractC1239f {
    private AbstractC1239f o;

    public C1253u() {
        this.b = 137;
    }

    public C1253u(int i, int i2, AbstractC1239f abstractC1239f) {
        super(i, i2);
        this.b = 137;
        this.o = abstractC1239f;
        abstractC1239f.a0(this);
        L(abstractC1239f.q());
    }

    @Override // com.github.catvod.spider.merge.h1.AbstractC1239f
    public final boolean V() {
        return this.b == 138 || this.o.V();
    }

    public final AbstractC1239f d0() {
        return this.o;
    }

    public C1253u(AbstractC1239f abstractC1239f) {
        this(abstractC1239f.i, abstractC1239f.j, abstractC1239f);
    }

    public C1253u(AbstractC1239f abstractC1239f, boolean z) {
        this(abstractC1239f.i, abstractC1239f.j, abstractC1239f);
        if (z) {
            this.b = 138;
        }
    }
}
