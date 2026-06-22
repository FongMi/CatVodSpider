package com.github.catvod.spider.merge.h1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h1.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1255w extends J {
    private AbstractC1239f w;
    private AbstractC1239f x;
    private AbstractC1239f y;

    public C1255w() {
        this.b = 123;
    }

    public C1255w(int i) {
        super(i);
        this.b = 123;
    }

    public final AbstractC1239f A0() {
        return this.x;
    }

    public final AbstractC1239f B0() {
        return this.y;
    }

    public final AbstractC1239f C0() {
        return this.w;
    }

    public final void D0(AbstractC1239f abstractC1239f) {
        this.x = abstractC1239f;
        abstractC1239f.a0(this);
    }

    public final void E0(AbstractC1239f abstractC1239f) {
        P(abstractC1239f);
        this.y = abstractC1239f;
        abstractC1239f.a0(this);
    }

    public final void F0(AbstractC1239f abstractC1239f) {
        this.w = abstractC1239f;
        abstractC1239f.a0(this);
    }
}
