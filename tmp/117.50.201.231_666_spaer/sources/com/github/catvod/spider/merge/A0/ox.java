package com.github.catvod.spider.merge.A0;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class ox extends mj {
    public yp a;

    @Override // com.github.catvod.spider.merge.A0.ym
    public final void e(yg ygVar, acw acwVar) {
        try {
            yp ypVar = this.a;
            AtomicLongFieldUpdater atomicLongFieldUpdater = yp.a;
            ypVar.l(acwVar, jo.g, false);
        } catch (RejectedExecutionException unused) {
            acj.x._a(acwVar);
        }
    }
}
