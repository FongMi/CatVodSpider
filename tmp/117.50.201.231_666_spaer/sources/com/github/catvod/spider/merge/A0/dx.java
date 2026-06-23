package com.github.catvod.spider.merge.A0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class dx extends er implements acp {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(dx.class, Object.class, "_queue");
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(dx.class, Object.class, "_delayed");
    private volatile Object _queue = null;
    private volatile Object _delayed = null;
    private volatile int _isCompleted = 0;

    public final void _a(adf adfVar) {
        if (!h(adfVar)) {
            acj.x._a(adfVar);
            return;
        }
        Thread threadS = s();
        if (Thread.currentThread() != threadS) {
            LockSupport.unpark(threadS);
        }
    }

    public adh c(long j, az azVar, yg ygVar) {
        return ack.a.c(j, azVar, ygVar);
    }

    @Override // com.github.catvod.spider.merge.A0.acp
    public final void d(long j, sa saVar) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            dv dvVar = new dv(this, j2 + jNanoTime, saVar);
            saVar.u(new adq(0, dvVar));
            l(jNanoTime, dvVar);
        }
    }

    @Override // com.github.catvod.spider.merge.A0.ym
    public final void e(yg ygVar, acw acwVar) {
        _a(acwVar);
    }

    @Override // com.github.catvod.spider.merge.A0.er
    public final void f() {
        ob obVarG;
        abk.a.set(null);
        this._isCompleted = 1;
        loop0: while (true) {
            Object obj = this._queue;
            xb xbVar = sk.b;
            if (obj != null) {
                if (!(obj instanceof oi)) {
                    if (obj != xbVar) {
                        oi oiVar = new oi(8, true);
                        oiVar.h((Runnable) obj);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oiVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((oi) obj).i();
                break;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, null, xbVar)) {
                if (atomicReferenceFieldUpdater2.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (j() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            lh lhVar = (lh) this._delayed;
            if (lhVar == null || (obVarG = lhVar.g()) == null) {
                return;
            } else {
                er.p(jNanoTime, obVarG);
            }
        }
    }

    public final boolean h(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                return true;
            }
            if (!(obj instanceof oi)) {
                if (obj == sk.b) {
                    return false;
                }
                oi oiVar = new oi(8, true);
                oiVar.h((Runnable) obj);
                oiVar.h(runnable);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, oiVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
            oi oiVar2 = (oi) obj;
            int iH = oiVar2.h(runnable);
            if (iH == 0) {
                return true;
            }
            if (iH == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = a;
                oi oiVarL = oiVar2.l();
                while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, oiVarL) && atomicReferenceFieldUpdater3.get(this) == obj) {
                }
            } else if (iH == 2) {
                return false;
            }
        }
    }

    public final boolean i() {
        py pyVar = this.o;
        if (!(pyVar == null || pyVar.b == pyVar.c)) {
            return false;
        }
        lh lhVar = (lh) this._delayed;
        if (lhVar != null && !lhVar.c()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof oi) {
                return ((oi) obj).k();
            }
            if (obj != sk.b) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long j() {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.dx.j():long");
    }

    public final void k() {
        this._queue = null;
        this._delayed = null;
    }

    public final void l(long j, ob obVar) {
        char c;
        Thread threadS;
        if (this._isCompleted == 0) {
            lh lhVar = (lh) this._delayed;
            if (lhVar == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
                lh lhVar2 = new lh();
                lhVar2.j = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, lhVar2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = this._delayed;
                ko.c(obj);
                lhVar = (lh) obj;
            }
            synchronized (obVar) {
                if (obVar.d == sk.a) {
                    c = 2;
                } else {
                    synchronized (lhVar) {
                        try {
                            ob[] obVarArr = lhVar.a;
                            c = 0;
                            ob obVar2 = obVarArr != null ? obVarArr[0] : null;
                            if (this._isCompleted != 0) {
                                c = 1;
                            } else {
                                if (obVar2 == null) {
                                    lhVar.j = j;
                                } else {
                                    long j2 = obVar2.f;
                                    if (j2 - j >= 0) {
                                        j2 = j;
                                    }
                                    if (j2 - lhVar.j > 0) {
                                        lhVar.j = j2;
                                    }
                                }
                                long j3 = obVar.f;
                                long j4 = lhVar.j;
                                if (j3 - j4 < 0) {
                                    obVar.f = j4;
                                }
                                lhVar.b(obVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        } else {
            c = 1;
        }
        if (c != 0) {
            if (c == 1) {
                er.p(j, obVar);
                return;
            } else {
                if (c != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        lh lhVar3 = (lh) this._delayed;
        if ((lhVar3 != null ? lhVar3.d() : null) != obVar || Thread.currentThread() == (threadS = s())) {
            return;
        }
        LockSupport.unpark(threadS);
    }
}
