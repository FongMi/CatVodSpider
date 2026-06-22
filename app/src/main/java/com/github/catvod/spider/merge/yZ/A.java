package com.github.catvod.spider.merge.yZ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class A extends RuntimeException {
    private final C<?, ?> a;
    private final y b;
    private final s c;
    private E d;
    private int e;

    public A(C<?, ?> c, s sVar, y yVar) {
        this.e = -1;
        this.a = c;
        this.c = sVar;
        this.b = yVar;
        if (c != null) {
            this.e = c.g();
        }
    }

    public final com.github.catvod.spider.merge.Bk.k a() {
        C<?, ?> c = this.a;
        if (c != null) {
            return c.d().c(this.e, this.b);
        }
        return null;
    }

    public final s b() {
        return this.c;
    }

    public final E c() {
        return this.d;
    }

    protected final void d(int i) {
        this.e = i;
    }

    protected final void e(E e) {
        this.d = e;
    }
}
