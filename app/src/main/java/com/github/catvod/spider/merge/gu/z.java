package com.github.catvod.spider.merge.gu;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class z extends RuntimeException {
    private final B<?, ?> c;
    private final x d;
    private final r e;
    private D f;
    private int g;

    public z(B<?, ?> b, r rVar, x xVar) {
        this.g = -1;
        this.c = b;
        this.e = rVar;
        this.d = xVar;
        if (b != null) {
            this.g = b.i();
        }
    }

    public final com.github.catvod.spider.merge.Mm.j a() {
        B<?, ?> b = this.c;
        if (b != null) {
            return b.f().c(this.g, this.d);
        }
        return null;
    }

    public final r b() {
        return this.e;
    }

    public final D c() {
        return this.f;
    }

    protected final void d(int i) {
        this.g = i;
    }

    protected final void e(D d) {
        this.f = d;
    }
}
