package com.github.catvod.spider.merge.A0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class rx extends mq {
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(rx.class, "_invoked");
    private volatile int _invoked;
    public final n q;

    public rx(bi biVar, n nVar) {
        super(biVar);
        this.q = nVar;
        this._invoked = 0;
    }

    @Override // com.github.catvod.spider.merge.A0.n
    public final void f(Throwable th) {
        if (c.compareAndSet(this, 0, 1)) {
            this.q.invoke(th);
        }
    }

    @Override // com.github.catvod.spider.merge.A0.qw
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        f((Throwable) obj);
        return jo.i;
    }
}
