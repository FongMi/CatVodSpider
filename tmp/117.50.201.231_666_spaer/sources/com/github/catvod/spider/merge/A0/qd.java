package com.github.catvod.spider.merge.A0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class qd extends xt {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(qd.class, Object.class, "_consensus");
    private volatile Object _consensus = pp.a;

    @Override // com.github.catvod.spider.merge.A0.xt
    public final Object b(Object obj) {
        Object obj2 = this._consensus;
        xb xbVar = pp.a;
        if (obj2 == xbVar) {
            xb xbVarD = d(obj);
            obj2 = this._consensus;
            if (obj2 == xbVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, xbVar, xbVarD)) {
                        obj2 = xbVarD;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != xbVar) {
                        obj2 = this._consensus;
                        break;
                    }
                }
            }
        }
        c(obj, obj2);
        return obj2;
    }

    public abstract void c(Object obj, Object obj2);

    public abstract xb d(Object obj);
}
