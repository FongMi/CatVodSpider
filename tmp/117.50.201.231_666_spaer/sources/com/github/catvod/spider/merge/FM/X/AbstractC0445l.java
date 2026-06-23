package com.github.catvod.spider.merge.FM.x;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.x.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class AbstractC0445l implements InterfaceC0437d {
    protected final int a;
    protected int b = 0;

    AbstractC0445l(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.FM.x.s
    public final void a() {
    }

    @Override // com.github.catvod.spider.merge.FM.x.s
    public final int d() {
        return -1;
    }

    @Override // com.github.catvod.spider.merge.FM.x.s
    public final void f(int i) {
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.FM.x.s
    public final int i() {
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.FM.x.s
    public final void j() {
        int i = this.a;
        int i2 = this.b;
        if (i - i2 == 0) {
            throw new IllegalStateException("cannot consume EOF");
        }
        this.b = i2 + 1;
    }

    @Override // com.github.catvod.spider.merge.FM.x.s
    public final int size() {
        return this.a;
    }

    public final String toString() {
        return e(com.github.catvod.spider.merge.FM.A.j.b(0, this.a - 1));
    }
}
