package com.github.catvod.spider.merge.A0;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class bi implements nr, ux {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(bi.class, Object.class, "_state");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public bi(boolean z) {
        this._state = z ? xj.g : xj.f;
        this._parentHandle = null;
    }

    public static sj d(ik ikVar) {
        while (ikVar.o()) {
            ikVar = ikVar.n();
        }
        while (true) {
            ikVar = ikVar.m();
            if (!ikVar.o()) {
                if (ikVar instanceof sj) {
                    return (sj) ikVar;
                }
                if (ikVar instanceof zo) {
                    return null;
                }
            }
        }
    }

    public static String e(Object obj) {
        if (!(obj instanceof lm)) {
            return obj instanceof v ? ((v) obj).d() ? "Active" : "New" : obj instanceof tt ? "Cancelled" : "Completed";
        }
        lm lmVar = (lm) obj;
        return lmVar.f() ? "Cancelling" : lmVar.g() ? "Completing" : "Active";
    }

    public final Object aa(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objAh;
        do {
            objAh = ah(v(), obj);
            if (objAh == xj.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                if (!(obj instanceof tt)) {
                    obj = null;
                }
                tt ttVar = (tt) obj;
                throw new IllegalStateException(str, ttVar != null ? ttVar.c : null);
            }
        } while (objAh == xj.c);
        return objAh;
    }

    public final n ab(n nVar, boolean z) {
        if (!z) {
            return nVar;
        }
        n rxVar = (mq) (!(nVar instanceof mq) ? null : nVar);
        if (rxVar == null) {
            rxVar = new rx(this, nVar);
        }
        return rxVar;
    }

    public final void ac(zo zoVar, Throwable th) throws IllegalAccessException, InvocationTargetException {
        Object objL = zoVar.l();
        if (objL == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        }
        tv tvVar = null;
        for (ik ikVarM = (ik) objL; !ikVarM.equals(zoVar); ikVarM = ikVarM.m()) {
            if (ikVarM instanceof mq) {
                n nVar = (n) ikVarM;
                try {
                    nVar.f(th);
                } catch (Throwable th2) {
                    if (tvVar != null) {
                        cl.a(tvVar, th2);
                    } else {
                        tvVar = new tv("Exception in completion handler " + nVar + " for " + this, th2);
                    }
                }
            }
        }
        if (tvVar != null) {
            w(tvVar);
        }
        k(th);
    }

    public void ad(Object obj) {
    }

    public void ae() {
    }

    public final void af(n nVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        zo zoVar = new zo();
        nVar.getClass();
        ik.h.lazySet(zoVar, nVar);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ik.g;
        atomicReferenceFieldUpdater2.lazySet(zoVar, nVar);
        loop0: while (true) {
            if (nVar.l() == nVar) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(nVar, nVar, zoVar)) {
                    if (atomicReferenceFieldUpdater2.get(nVar) != nVar) {
                        break;
                    }
                }
                zoVar.k(nVar);
                break loop0;
            }
            break;
        }
        ik ikVarM = nVar.m();
        do {
            atomicReferenceFieldUpdater = c;
            if (atomicReferenceFieldUpdater.compareAndSet(this, nVar, ikVarM)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == nVar);
    }

    public final int ag(Object obj) {
        boolean z = obj instanceof eb;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        if (z) {
            if (((eb) obj).a) {
                return 0;
            }
            eb ebVar = xj.g;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, ebVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            ae();
            return 1;
        }
        if (!(obj instanceof io)) {
            return 0;
        }
        zo zoVar = ((io) obj).a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, zoVar)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        ae();
        return 1;
    }

    public final Object ah(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof v)) {
            return xj.a;
        }
        if (((obj instanceof eb) || (obj instanceof n)) && !(obj instanceof sj) && !(obj2 instanceof tt)) {
            v vVar = (v) obj;
            Object fmVar = obj2 instanceof v ? new fm((v) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = c;
                if (atomicReferenceFieldUpdater.compareAndSet(this, vVar, fmVar)) {
                    ad(obj2);
                    n(vVar, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == vVar);
            return xj.c;
        }
        v vVar2 = (v) obj;
        zo zoVarT = t(vVar2);
        if (zoVarT == null) {
            return xj.c;
        }
        sj sjVarD = null;
        lm lmVar = (lm) (!(vVar2 instanceof lm) ? null : vVar2);
        if (lmVar == null) {
            lmVar = new lm(zoVarT, null);
        }
        synchronized (lmVar) {
            if (lmVar.g()) {
                return xj.a;
            }
            lmVar.j();
            if (lmVar != vVar2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = c;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, vVar2, lmVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != vVar2) {
                        return xj.c;
                    }
                }
            }
            boolean zF = lmVar.f();
            tt ttVar = (tt) (!(obj2 instanceof tt) ? null : obj2);
            if (ttVar != null) {
                lmVar.b(ttVar.c);
            }
            Throwable thC = lmVar.c();
            if (zF) {
                thC = null;
            }
            if (thC != null) {
                ac(zoVarT, thC);
            }
            sj sjVar = (sj) (!(vVar2 instanceof sj) ? null : vVar2);
            if (sjVar != null) {
                sjVarD = sjVar;
            } else {
                zo zoVarE = vVar2.e();
                if (zoVarE != null) {
                    sjVarD = d(zoVarE);
                }
            }
            if (sjVarD != null) {
                while (bo.a(sjVarD.q, false, new kz(this, lmVar, sjVarD, obj2), 1) == m.a) {
                    sjVarD = d(sjVarD);
                    if (sjVarD != null) {
                    }
                }
                return xj.b;
            }
            return p(lmVar, obj2);
        }
    }

    public String b() {
        return getClass().getSimpleName();
    }

    @Override // com.github.catvod.spider.merge.A0.nr
    public boolean f() {
        Object objV = v();
        return (objV instanceof v) && ((v) objV).d();
    }

    @Override // com.github.catvod.spider.merge.A0.yg
    public final Object fold(Object obj, ha haVar) {
        return haVar.invoke(obj, this);
    }

    public final boolean g(v vVar, zo zoVar, n nVar) {
        char c2;
        zs zsVar = new zs(nVar, this, vVar);
        do {
            ik ikVarN = zoVar.n();
            ik.h.lazySet(nVar, ikVarN);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ik.g;
            atomicReferenceFieldUpdater.lazySet(nVar, zoVar);
            zsVar.e = zoVar;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(ikVarN, zoVar, zsVar)) {
                    c2 = zsVar.b(ikVarN) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater.get(ikVarN) != zoVar) {
                    c2 = 0;
                    break;
                }
            }
            if (c2 == 1) {
                return true;
            }
        } while (c2 != 2);
        return false;
    }

    @Override // com.github.catvod.spider.merge.A0.yg
    public final xo get(xp xpVar) {
        return ou.a(this, xpVar);
    }

    @Override // com.github.catvod.spider.merge.A0.xo
    public final xp getKey() {
        return nr.aj;
    }

    public void h(Object obj) {
    }

    public void i(Object obj) {
        h(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r0 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(java.lang.Object r10) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.bi.j(java.lang.Object):boolean");
    }

    public final boolean k(Throwable th) {
        if (z()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        si siVar = (si) this._parentHandle;
        return (siVar == null || siVar == m.a) ? z : siVar.c(th) || z;
    }

    public String l() {
        return "Job was cancelled";
    }

    public boolean m(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return j(th) && s();
    }

    @Override // com.github.catvod.spider.merge.A0.yg
    public final yg minusKey(xp xpVar) {
        return ou.b(this, xpVar);
    }

    public final void n(v vVar, Object obj) throws IllegalAccessException, InvocationTargetException {
        si siVar = (si) this._parentHandle;
        if (siVar != null) {
            siVar.b();
            this._parentHandle = m.a;
        }
        tv tvVar = null;
        if (!(obj instanceof tt)) {
            obj = null;
        }
        tt ttVar = (tt) obj;
        Throwable th = ttVar != null ? ttVar.c : null;
        if (vVar instanceof n) {
            try {
                ((n) vVar).f(th);
                return;
            } catch (Throwable th2) {
                w(new tv("Exception in completion handler " + vVar + " for " + this, th2));
                return;
            }
        }
        zo zoVarE = vVar.e();
        if (zoVarE != null) {
            Object objL = zoVarE.l();
            if (objL == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
            for (ik ikVarM = (ik) objL; !ikVarM.equals(zoVarE); ikVarM = ikVarM.m()) {
                if (ikVarM instanceof n) {
                    n nVar = (n) ikVarM;
                    try {
                        nVar.f(th);
                    } catch (Throwable th3) {
                        if (tvVar != null) {
                            cl.a(tvVar, th3);
                        } else {
                            tvVar = new tv("Exception in completion handler " + nVar + " for " + this, th3);
                        }
                    }
                }
            }
            if (tvVar != null) {
                w(tvVar);
            }
        }
    }

    public final Throwable o(Object obj) {
        Throwable thC;
        if (obj != null ? obj instanceof Throwable : true) {
            return obj != null ? (Throwable) obj : new xw(l(), null, this);
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
        bi biVar = (bi) ((ux) obj);
        Object objV = biVar.v();
        if (objV instanceof lm) {
            thC = ((lm) objV).c();
        } else if (objV instanceof tt) {
            thC = ((tt) objV).c;
        } else {
            if (objV instanceof v) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objV).toString());
            }
            thC = null;
        }
        Throwable xwVar = (CancellationException) (thC instanceof CancellationException ? thC : null);
        if (xwVar == null) {
            xwVar = new xw("Parent job is ".concat(e(objV)), thC, biVar);
        }
        return xwVar;
    }

    public final Object p(lm lmVar, Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thR;
        tt ttVar = (tt) (!(obj instanceof tt) ? null : obj);
        Throwable th = ttVar != null ? ttVar.c : null;
        synchronized (lmVar) {
            lmVar.f();
            ArrayList<Throwable> arrayListI = lmVar.i(th);
            thR = r(lmVar, arrayListI);
            if (thR != null && arrayListI.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListI.size()));
                for (Throwable th2 : arrayListI) {
                    if (th2 != thR && th2 != thR && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        cl.a(thR, th2);
                    }
                }
            }
        }
        if (thR != null && thR != th) {
            obj = new tt(thR, false);
        }
        if (thR != null && k(thR)) {
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            }
            tt.b.compareAndSet((tt) obj, 0, 1);
        }
        ad(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        Object fmVar = obj instanceof v ? new fm((v) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, lmVar, fmVar) && atomicReferenceFieldUpdater.get(this) == lmVar) {
        }
        n(lmVar, obj);
        return obj;
    }

    @Override // com.github.catvod.spider.merge.A0.yg
    public final yg plus(yg ygVar) {
        ko.f("context", ygVar);
        return ygVar == ek.a ? this : (yg) ygVar.fold(this, te.b);
    }

    public final CancellationException q() {
        Object objV = v();
        if (!(objV instanceof lm)) {
            if (objV instanceof v) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objV instanceof tt)) {
                return new xw(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((tt) objV).c;
            CancellationException cancellationException = (CancellationException) (th instanceof CancellationException ? th : null);
            return cancellationException != null ? cancellationException : new xw(l(), th, this);
        }
        Throwable thC = ((lm) objV).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException cancellationException2 = (CancellationException) (thC instanceof CancellationException ? thC : null);
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        if (strConcat == null) {
            strConcat = l();
        }
        return new xw(strConcat, thC, this);
    }

    public final Throwable r(lm lmVar, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (lmVar.f()) {
                return new xw(l(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof qq) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof qq)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean s() {
        return true;
    }

    public final zo t(v vVar) {
        zo zoVarE = vVar.e();
        if (zoVarE != null) {
            return zoVarE;
        }
        if (vVar instanceof eb) {
            return new zo();
        }
        if (vVar instanceof n) {
            af((n) vVar);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + vVar).toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(b() + '{' + e(v()) + '}');
        sb.append('@');
        sb.append(rs.a(this));
        return sb.toString();
    }

    public final si u() {
        return (si) this._parentHandle;
    }

    public final Object v() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof xt)) {
                return obj;
            }
            ((xt) obj).b(this);
        }
    }

    public void w(tv tvVar) {
        throw tvVar;
    }

    public final void x(nr nrVar) {
        int iAg;
        m mVar = m.a;
        if (nrVar == null) {
            this._parentHandle = mVar;
            return;
        }
        bi biVar = (bi) nrVar;
        do {
            iAg = biVar.ag(biVar.v());
            if (iAg == 0) {
                break;
            }
        } while (iAg != 1);
        si siVar = (si) bo.a(biVar, true, new sj(biVar, this), 2);
        this._parentHandle = siVar;
        if (v() instanceof v) {
            return;
        }
        siVar.b();
        this._parentHandle = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00a9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.github.catvod.spider.merge.A0.adh y(boolean r8, boolean r9, com.github.catvod.spider.merge.A0.n r10) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.bi.y(boolean, boolean, com.github.catvod.spider.merge.A0.n):com.github.catvod.spider.merge.A0.adh");
    }

    public boolean z() {
        return false;
    }
}
