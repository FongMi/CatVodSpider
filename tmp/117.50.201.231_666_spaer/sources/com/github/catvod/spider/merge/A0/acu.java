package com.github.catvod.spider.merge.A0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class acu extends acw implements yw, xl {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(acu.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;
    public Object b;
    public final Object c;
    public final ym d;
    public final xm e;

    public acu(ym ymVar, xm xmVar) {
        super(-1);
        this.d = ymVar;
        this.e = xmVar;
        this.b = qf.a;
        Object objFold = xmVar.getContext().fold(0, te.c);
        ko.c(objFold);
        this.c = objFold;
        this._reusableCancellableContinuation = null;
    }

    public final Throwable f(sa saVar) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            xb xbVar = qf.b;
            if (obj == xbVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, xbVar, saVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != xbVar) {
                        break;
                    }
                }
                return null;
            }
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            return (Throwable) obj;
        }
    }

    public final sa g() {
        Object obj = this._reusableCancellableContinuation;
        if (!(obj instanceof sa)) {
            obj = null;
        }
        return (sa) obj;
    }

    @Override // com.github.catvod.spider.merge.A0.xl
    public final yg getContext() {
        return this.e.getContext();
    }

    public final boolean h(sa saVar) {
        Object obj = this._reusableCancellableContinuation;
        if (obj != null) {
            return !(obj instanceof sa) || obj == saVar;
        }
        return false;
    }

    public final boolean i(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            xb xbVar = qf.b;
            if (ko.b(obj, xbVar)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, xbVar, th)) {
                    if (atomicReferenceFieldUpdater.get(this) != xbVar) {
                        break;
                    }
                }
                return true;
            }
            if (obj instanceof Throwable) {
                return true;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    break;
                }
            }
            return false;
        }
    }

    @Override // com.github.catvod.spider.merge.A0.acw
    public final void j(Object obj, CancellationException cancellationException) {
        if (obj instanceof tu) {
            ((tu) obj).getClass();
            throw null;
        }
    }

    @Override // com.github.catvod.spider.merge.A0.acw
    public final xl k() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.A0.acw
    public final Object n() {
        Object obj = this.b;
        this.b = qf.a;
        return obj;
    }

    @Override // com.github.catvod.spider.merge.A0.xl
    public final void resumeWith(Object obj) {
        xm xmVar = this.e;
        yg context = xmVar.getContext();
        Throwable thB = vx.b(obj);
        Object ttVar = thB == null ? obj : new tt(thB, false);
        ym ymVar = this.d;
        if (ymVar.g()) {
            this.b = ttVar;
            this.x = 0;
            ymVar.e(context, this);
            return;
        }
        er erVarB = abk.b();
        if (erVarB.m >= 4294967296L) {
            this.b = ttVar;
            this.x = 0;
            erVarB.r(this);
            return;
        }
        erVarB.t(true);
        try {
            yg context2 = xmVar.getContext();
            Object objD = zr.d(context2, this.c);
            try {
                xmVar.resumeWith(obj);
                while (erVarB.u()) {
                }
            } finally {
                zr.c(context2, objD);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + rs.b(this.e) + ']';
    }
}
