package com.github.catvod.spider.merge.A0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class sa extends acw implements rz, yw {
    public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(sa.class, "_decision");
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(sa.class, Object.class, "_state");
    private volatile int _decision;
    private volatile Object _parentHandle;
    private volatile Object _state;
    public final yg f;
    public final xl g;

    public sa(xl xlVar) {
        super(1);
        this.g = xlVar;
        this.f = xlVar.getContext();
        this._decision = 0;
        this._state = pm.a;
        this._parentHandle = null;
    }

    public static void h(qw qwVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + qwVar + ", already has " + obj).toString());
    }

    public static void i(sa saVar, Object obj, int i) {
        Object trVar;
        while (true) {
            Object obj2 = saVar._state;
            if (!(obj2 instanceof gf)) {
                if (obj2 instanceof sb) {
                    sb sbVar = (sb) obj2;
                    sbVar.getClass();
                    if (sb.a.compareAndSet(sbVar, 0, 1)) {
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            gf gfVar = (gf) obj2;
            if (!(obj instanceof tt) && hk.a(i) && (gfVar instanceof adq)) {
                if (!(gfVar instanceof adq)) {
                    gfVar = null;
                }
                trVar = new tr(obj, (adq) gfVar, null, 16);
            } else {
                trVar = obj;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            while (!atomicReferenceFieldUpdater.compareAndSet(saVar, obj2, trVar)) {
                if (atomicReferenceFieldUpdater.get(saVar) != obj2) {
                    break;
                }
            }
            xl xlVar = saVar.g;
            if (!(xlVar instanceof acu) || !((acu) xlVar).h(saVar)) {
                saVar.r();
            }
            saVar.s(i);
            return;
        }
    }

    public Throwable b(nr nrVar) {
        return ((bi) nrVar).q();
    }

    public String c() {
        return "CancellableContinuation";
    }

    @Override // com.github.catvod.spider.merge.A0.xl
    public final yg getContext() {
        return this.f;
    }

    @Override // com.github.catvod.spider.merge.A0.acw
    public final void j(Object obj, CancellationException cancellationException) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof gf) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof tt) {
                return;
            }
            if (!(obj2 instanceof tr)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
                tr trVar = new tr(obj2, null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, trVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            tr trVar2 = (tr) obj2;
            if (trVar2.e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            tr trVarF = tr.f(trVar2, null, cancellationException, 15);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = e;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, trVarF)) {
                if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                    break;
                }
            }
            adq adqVar = trVar2.b;
            if (adqVar != null) {
                o(adqVar, cancellationException);
            }
            qw qwVar = trVar2.c;
            if (qwVar != null) {
                try {
                    qwVar.invoke(cancellationException);
                    return;
                } catch (Throwable th) {
                    bj.a(this.f, new tv("Exception in resume onCancellation handler for " + this, th));
                    return;
                }
            }
            return;
        }
    }

    @Override // com.github.catvod.spider.merge.A0.acw
    public final xl k() {
        return this.g;
    }

    @Override // com.github.catvod.spider.merge.A0.acw
    public final Throwable l(Object obj) {
        Throwable thL = super.l(obj);
        if (thL != null) {
            return thL;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.A0.acw
    public final Object m(Object obj) {
        return obj instanceof tr ? ((tr) obj).a : obj;
    }

    @Override // com.github.catvod.spider.merge.A0.acw
    public final Object n() {
        return this._state;
    }

    public final void o(adq adqVar, Throwable th) {
        try {
            adqVar.c(th);
        } catch (Throwable th2) {
            bj.a(this.f, new tv("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void p(qw qwVar, Throwable th) {
        try {
            qwVar.invoke(th);
        } catch (Throwable th2) {
            bj.a(this.f, new tv("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void q(Throwable th) {
        while (true) {
            Object obj = this._state;
            if (obj instanceof gf) {
                boolean z = obj instanceof adq;
                sb sbVar = new sb(this, th, z);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, sbVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (!z) {
                    obj = null;
                }
                adq adqVar = (adq) obj;
                if (adqVar != null) {
                    o(adqVar, th);
                }
                xl xlVar = this.g;
                if (!(xlVar instanceof acu) || !((acu) xlVar).h(this)) {
                    r();
                }
                s(this.x);
                return;
            }
            return;
        }
    }

    public final void r() {
        adh adhVar = (adh) this._parentHandle;
        if (adhVar != null) {
            adhVar.b();
        }
        this._parentHandle = m.a;
    }

    @Override // com.github.catvod.spider.merge.A0.xl
    public final void resumeWith(Object obj) {
        Throwable thB = vx.b(obj);
        if (thB != null) {
            obj = new tt(thB, false);
        }
        i(this, obj, this.x);
    }

    public final void s(int i) {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                xl xlVar = this.g;
                boolean z = i == 4;
                if (z || !(xlVar instanceof acu) || hk.a(i) != hk.a(this.x)) {
                    hk.b(this, xlVar, z);
                    return;
                }
                ym ymVar = ((acu) xlVar).d;
                yg context = ((acu) xlVar).e.getContext();
                if (ymVar.g()) {
                    ymVar.e(context, this);
                    return;
                }
                er erVarB = abk.b();
                if (erVarB.m >= 4294967296L) {
                    erVarB.r(this);
                    return;
                }
                erVarB.t(true);
                try {
                    hk.b(this, this.g, true);
                    do {
                    } while (erVarB.u());
                } finally {
                    try {
                    } finally {
                    }
                }
                return;
            }
        } while (!d.compareAndSet(this, 0, 2));
    }

    public final Object t() throws Throwable {
        nr nrVar;
        w();
        do {
            int i = this._decision;
            if (i != 0) {
                if (i != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object obj = this._state;
                if (obj instanceof tt) {
                    throw ((tt) obj).c;
                }
                if (!hk.a(this.x) || (nrVar = (nr) this.f.get(nr.aj)) == null || nrVar.f()) {
                    return m(obj);
                }
                CancellationException cancellationExceptionQ = ((bi) nrVar).q();
                j(obj, cancellationExceptionQ);
                throw cancellationExceptionQ;
            }
        } while (!d.compareAndSet(this, 0, 1));
        return ys.a;
    }

    public final String toString() {
        return c() + '(' + rs.b(this.g) + "){" + this._state + "}@" + rs.a(this);
    }

    public final void u(qw qwVar) {
        adq adqVar = qwVar instanceof adq ? (adq) qwVar : new adq(1, qwVar);
        while (true) {
            Object obj = this._state;
            if (obj instanceof pm) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, adqVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof adq) {
                h(qwVar, obj);
                throw null;
            }
            if (obj instanceof tt) {
                tt ttVar = (tt) obj;
                ttVar.getClass();
                if (!tt.b.compareAndSet(ttVar, 0, 1)) {
                    h(qwVar, obj);
                    throw null;
                }
                if (obj instanceof sb) {
                    if (!(obj instanceof tt)) {
                        obj = null;
                    }
                    tt ttVar2 = (tt) obj;
                    p(qwVar, ttVar2 != null ? ttVar2.c : null);
                    return;
                }
                return;
            }
            if (!(obj instanceof tr)) {
                tr trVar = new tr(obj, adqVar, null, 28);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = e;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, trVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            tr trVar2 = (tr) obj;
            if (trVar2.b != null) {
                h(qwVar, obj);
                throw null;
            }
            Throwable th = trVar2.e;
            if (th != null) {
                p(qwVar, th);
                return;
            }
            tr trVarF = tr.f(trVar2, adqVar, null, 29);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = e;
            while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, trVarF)) {
                if (atomicReferenceFieldUpdater3.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final void v(ym ymVar) {
        jo joVar = jo.i;
        xl xlVar = this.g;
        if (!(xlVar instanceof acu)) {
            xlVar = null;
        }
        acu acuVar = (acu) xlVar;
        i(this, joVar, (acuVar != null ? acuVar.d : null) == ymVar ? 4 : this.x);
    }

    public final void w() {
        nr nrVar;
        Throwable thF;
        boolean z = this._state instanceof gf;
        boolean z2 = !z;
        if (this.x == 2) {
            xl xlVar = this.g;
            if (!(xlVar instanceof acu)) {
                xlVar = null;
            }
            acu acuVar = (acu) xlVar;
            if (acuVar != null && (thF = acuVar.f(this)) != null) {
                if (z) {
                    q(thF);
                }
                z2 = true;
            }
        }
        if (z2 || ((adh) this._parentHandle) != null || (nrVar = (nr) this.g.getContext().get(nr.aj)) == null) {
            return;
        }
        adh adhVarA = bo.a(nrVar, true, new sh(nrVar, this), 2);
        this._parentHandle = adhVarA;
        if (this._state instanceof gf) {
            return;
        }
        xl xlVar2 = this.g;
        if ((xlVar2 instanceof acu) && ((acu) xlVar2).h(this)) {
            return;
        }
        adhVarA.b();
        this._parentHandle = m.a;
    }
}
