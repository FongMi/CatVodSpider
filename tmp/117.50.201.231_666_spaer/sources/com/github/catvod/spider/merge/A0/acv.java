package com.github.catvod.spider.merge.A0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class acv extends cj {
    public static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(acv.class, "_decision");
    private volatile int _decision;

    public acv(yg ygVar, xl xlVar) {
        super(ygVar, xlVar);
        this._decision = 0;
    }

    public final Object ao() throws Throwable {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object objJ = xj.j(v());
                if (objJ instanceof tt) {
                    throw ((tt) objJ).c;
                }
                return objJ;
            }
        } while (!a.compareAndSet(this, 0, 1));
        return ys.a;
    }

    @Override // com.github.catvod.spider.merge.A0.cj, com.github.catvod.spider.merge.A0.bi
    public final void h(Object obj) {
        i(obj);
    }

    @Override // com.github.catvod.spider.merge.A0.cj, com.github.catvod.spider.merge.A0.bi
    public final void i(Object obj) {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                qf.e(tw.a(obj), hj.a(this.ai));
                return;
            }
        } while (!a.compareAndSet(this, 0, 2));
    }
}
