package com.github.catvod.spider.merge.A0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class zs extends qd {
    public zo e;
    public final n f;
    public final /* synthetic */ bi g;
    public final /* synthetic */ v h;

    public zs(n nVar, bi biVar, v vVar) {
        this.g = biVar;
        this.h = vVar;
        this.f = nVar;
    }

    @Override // com.github.catvod.spider.merge.A0.qd
    public final void c(Object obj, Object obj2) {
        ik ikVar = (ik) obj;
        boolean z = obj2 == null;
        ik ikVar2 = this.f;
        ik ikVar3 = z ? ikVar2 : this.e;
        if (ikVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ik.g;
            while (!atomicReferenceFieldUpdater.compareAndSet(ikVar, this, ikVar3)) {
                if (atomicReferenceFieldUpdater.get(ikVar) != this) {
                    return;
                }
            }
            if (z) {
                ik ikVar4 = this.e;
                ko.c(ikVar4);
                ikVar2.k(ikVar4);
            }
        }
    }

    @Override // com.github.catvod.spider.merge.A0.qd
    public final xb d(Object obj) {
        if (this.g.v() == this.h) {
            return null;
        }
        return zb.a;
    }
}
