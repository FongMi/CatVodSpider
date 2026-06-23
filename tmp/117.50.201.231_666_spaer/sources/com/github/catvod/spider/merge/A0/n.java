package com.github.catvod.spider.merge.A0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class n extends ik implements adh, v, qw {
    public final nr a;

    public n(nr nrVar) {
        this.a = nrVar;
    }

    @Override // com.github.catvod.spider.merge.A0.adh
    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        nr nrVar = this.a;
        if (nrVar == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobSupport");
        }
        bi biVar = (bi) nrVar;
        while (true) {
            Object objV = biVar.v();
            if (!(objV instanceof n)) {
                if (!(objV instanceof v) || ((v) objV).e() == null) {
                    return;
                }
                p();
                return;
            }
            if (objV != this) {
                return;
            }
            eb ebVar = xj.g;
            do {
                atomicReferenceFieldUpdater = bi.c;
                if (atomicReferenceFieldUpdater.compareAndSet(biVar, objV, ebVar)) {
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(biVar) == objV);
        }
    }

    @Override // com.github.catvod.spider.merge.A0.v
    public final boolean d() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.A0.v
    public final zo e() {
        return null;
    }

    public abstract void f(Throwable th);

    @Override // com.github.catvod.spider.merge.A0.ik
    public final String toString() {
        return getClass().getSimpleName() + '@' + rs.a(this) + "[job@" + rs.a(this.a) + ']';
    }
}
