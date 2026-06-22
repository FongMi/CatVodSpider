package com.github.catvod.spider.merge.h1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h1.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C1254v extends J {
    protected AbstractC1239f w;
    protected AbstractC1239f x;
    protected boolean y;
    protected boolean z;

    public C1254v() {
        this.b = 123;
    }

    public C1254v(int i) {
        super(i);
        this.b = 123;
    }

    public final AbstractC1239f A0() {
        return this.x;
    }

    public final AbstractC1239f B0() {
        return this.w;
    }

    public boolean C0() {
        return this.y;
    }

    public final boolean D0() {
        return this.z;
    }

    public void E0(boolean z) {
        this.y = z;
    }

    public final void F0(boolean z) {
        this.z = z;
    }

    public final void G0(AbstractC1239f abstractC1239f) {
        this.x = abstractC1239f;
        abstractC1239f.a0(this);
    }

    public final void H0(AbstractC1239f abstractC1239f) {
        this.w = abstractC1239f;
        abstractC1239f.a0(this);
    }
}
