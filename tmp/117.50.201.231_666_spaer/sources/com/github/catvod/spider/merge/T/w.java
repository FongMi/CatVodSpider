package com.github.catvod.spider.merge.t;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class w extends RuntimeException {
    private final x<?, ?> a;
    private final u b;
    private final p c;
    private z d;
    private int e;

    public w(x<?, ?> xVar, p pVar, u uVar) {
        this.e = -1;
        this.a = xVar;
        this.c = pVar;
        this.b = uVar;
        if (xVar != null) {
            this.e = xVar.f();
        }
    }

    public final com.github.catvod.spider.merge.w.i a() {
        x<?, ?> xVar = this.a;
        if (xVar != null) {
            return xVar.c().c(this.e, this.b);
        }
        return null;
    }

    public final p b() {
        return this.c;
    }

    public final z c() {
        return this.d;
    }

    protected final void d(int i) {
        this.e = i;
    }

    protected final void e(z zVar) {
        this.d = zVar;
    }
}
