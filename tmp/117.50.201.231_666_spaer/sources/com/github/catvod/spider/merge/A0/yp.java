package com.github.catvod.spider.merge.A0;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class yp implements Executor, Closeable {
    private volatile int _isTerminated;
    volatile long controlState;
    public final cr e;
    public final cr f;
    public final AtomicReferenceArray g;
    public final int h;
    public final int i;
    public final long j;
    private volatile long parkedWorkersStack;
    public static final xb d = new xb("NOT_IN_STACK", 3);
    public static final AtomicLongFieldUpdater a = AtomicLongFieldUpdater.newUpdater(yp.class, "parkedWorkersStack");
    public static final AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(yp.class, "controlState");
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(yp.class, "_isTerminated");

    public yp(int i, int i2, long j) {
        this.h = i;
        this.i = i2;
        this.j = j;
        if (i < 1) {
            throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.e = new cr();
        this.f = new cr();
        this.parkedWorkersStack = 0L;
        this.g = new AtomicReferenceArray(i2 + 1);
        this.controlState = ((long) i) << 42;
        this._isTerminated = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = com.github.catvod.spider.merge.A0.yp.c
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lc
            goto Lb6
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof com.github.catvod.spider.merge.A0.yo
            r3 = 0
            if (r1 != 0) goto L16
            r0 = r3
        L16:
            com.github.catvod.spider.merge.A0.yo r0 = (com.github.catvod.spider.merge.A0.yo) r0
            if (r0 == 0) goto L23
            com.github.catvod.spider.merge.A0.yp r1 = r0.h
            boolean r1 = com.github.catvod.spider.merge.A0.ko.b(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r8.g
            monitor-enter(r1)
            long r4 = r8.controlState     // Catch: java.lang.Throwable -> Lb7
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r5 = (int) r4
            monitor-exit(r1)
            if (r2 > r5) goto L71
            r1 = 1
        L32:
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r8.g
            java.lang.Object r4 = r4.get(r1)
            com.github.catvod.spider.merge.A0.ko.c(r4)
            com.github.catvod.spider.merge.A0.yo r4 = (com.github.catvod.spider.merge.A0.yo) r4
            if (r4 == r0) goto L6c
        L3f:
            boolean r6 = r4.isAlive()
            if (r6 == 0) goto L4e
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r6 = 10000(0x2710, double:4.9407E-320)
            r4.join(r6)
            goto L3f
        L4e:
            com.github.catvod.spider.merge.A0.gl r4 = r4.b
            com.github.catvod.spider.merge.A0.cr r6 = r8.f
            r4.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = com.github.catvod.spider.merge.A0.gl.a
            java.lang.Object r7 = r7.getAndSet(r4, r3)
            com.github.catvod.spider.merge.A0.adf r7 = (com.github.catvod.spider.merge.A0.adf) r7
            if (r7 == 0) goto L62
            r6.b(r7)
        L62:
            com.github.catvod.spider.merge.A0.adf r7 = r4.h()
            if (r7 == 0) goto L6c
            r6.b(r7)
            goto L62
        L6c:
            if (r1 == r5) goto L71
            int r1 = r1 + 1
            goto L32
        L71:
            com.github.catvod.spider.merge.A0.cr r1 = r8.f
            r1.c()
            com.github.catvod.spider.merge.A0.cr r1 = r8.e
            r1.c()
        L7b:
            if (r0 == 0) goto L84
            com.github.catvod.spider.merge.A0.adf r1 = r0.i(r2)
            if (r1 == 0) goto L84
            goto L8c
        L84:
            com.github.catvod.spider.merge.A0.cr r1 = r8.e
            java.lang.Object r1 = r1.e()
            com.github.catvod.spider.merge.A0.adf r1 = (com.github.catvod.spider.merge.A0.adf) r1
        L8c:
            if (r1 == 0) goto L8f
            goto L97
        L8f:
            com.github.catvod.spider.merge.A0.cr r1 = r8.f
            java.lang.Object r1 = r1.e()
            com.github.catvod.spider.merge.A0.adf r1 = (com.github.catvod.spider.merge.A0.adf) r1
        L97:
            if (r1 == 0) goto Laa
            r1.run()     // Catch: java.lang.Throwable -> L9d
            goto L7b
        L9d:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L7b
        Laa:
            if (r0 == 0) goto Lb0
            r1 = 5
            r0.p(r1)
        Lb0:
            r0 = 0
            r8.parkedWorkersStack = r0
            r8.controlState = r0
        Lb6:
            return
        Lb7:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.yp.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        l(runnable, jo.g, false);
    }

    public final int k() {
        synchronized (this.g) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.h) {
                return 0;
            }
            if (i >= this.i) {
                return 0;
            }
            int i3 = ((int) (this.controlState & 2097151)) + 1;
            if (i3 <= 0 || this.g.get(i3) != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            yo yoVar = new yo(this, i3);
            this.g.set(i3, yoVar);
            if (i3 != ((int) (2097151 & b.incrementAndGet(this)))) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            yoVar.start();
            return i2 + 1;
        }
    }

    public final void l(Runnable runnable, kj kjVar, boolean z) {
        adf ajVar;
        ak.e.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof adf) {
            ajVar = (adf) runnable;
            ajVar.z = jNanoTime;
            ajVar.aa = kjVar;
        } else {
            ajVar = new aj(runnable, jNanoTime, kjVar);
        }
        Thread threadCurrentThread = Thread.currentThread();
        adf adfVarF = null;
        if (!(threadCurrentThread instanceof yo)) {
            threadCurrentThread = null;
        }
        yo yoVar = (yo) threadCurrentThread;
        if (yoVar == null || !ko.b(yoVar.h, this)) {
            yoVar = null;
        }
        if (yoVar == null || yoVar.c == 5 || (ajVar.aa.o() == 0 && yoVar.c == 2)) {
            adfVarF = ajVar;
        } else {
            yoVar.g = true;
            gl glVar = yoVar.b;
            if (z) {
                adfVarF = glVar.f(ajVar);
            } else {
                glVar.getClass();
                adf adfVar = (adf) gl.a.getAndSet(glVar, ajVar);
                if (adfVar != null) {
                    adfVarF = glVar.f(adfVar);
                }
            }
        }
        if (adfVarF != null) {
            if (!(adfVarF.aa.o() == 1 ? this.f.b(adfVarF) : this.e.b(adfVarF))) {
                throw new RejectedExecutionException("DefaultDispatcher was terminated");
            }
        }
        boolean z2 = z && yoVar != null;
        if (ajVar.aa.o() == 0) {
            if (z2 || q() || p(this.controlState)) {
                return;
            }
            q();
            return;
        }
        long jAddAndGet = b.addAndGet(this, 2097152L);
        if (z2 || q() || p(jAddAndGet)) {
            return;
        }
        q();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean m() {
        return this._isTerminated;
    }

    public final void n(yo yoVar) {
        long j;
        int iJ;
        if (yoVar.k() != d) {
            return;
        }
        do {
            j = this.parkedWorkersStack;
            iJ = yoVar.j();
            yoVar.o(this.g.get((int) (2097151 & j)));
        } while (!a.compareAndSet(this, j, ((long) iJ) | ((2097152 + j) & (-2097152))));
    }

    public final void o(yo yoVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int iJ = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (iJ == i) {
                if (i2 == 0) {
                    Object objK = yoVar.k();
                    while (true) {
                        if (objK == d) {
                            iJ = -1;
                            break;
                        }
                        if (objK == null) {
                            iJ = 0;
                            break;
                        }
                        yo yoVar2 = (yo) objK;
                        iJ = yoVar2.j();
                        if (iJ != 0) {
                            break;
                        } else {
                            objK = yoVar2.k();
                        }
                    }
                } else {
                    iJ = i2;
                }
            }
            if (iJ >= 0 && a.compareAndSet(this, j, j2 | ((long) iJ))) {
                return;
            }
        }
    }

    public final boolean p(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.h;
        if (i < i2) {
            int iK = k();
            if (iK == 1 && i2 > 1) {
                k();
            }
            if (iK > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean q() {
        xb xbVar;
        int iJ;
        while (true) {
            long j = this.parkedWorkersStack;
            yo yoVar = (yo) this.g.get((int) (2097151 & j));
            if (yoVar != null) {
                long j2 = (2097152 + j) & (-2097152);
                Object objK = yoVar.k();
                while (true) {
                    xbVar = d;
                    if (objK == xbVar) {
                        iJ = -1;
                        break;
                    }
                    if (objK == null) {
                        iJ = 0;
                        break;
                    }
                    yo yoVar2 = (yo) objK;
                    iJ = yoVar2.j();
                    if (iJ != 0) {
                        break;
                    }
                    objK = yoVar2.k();
                }
                if (iJ >= 0 && a.compareAndSet(this, j, ((long) iJ) | j2)) {
                    yoVar.o(xbVar);
                }
            } else {
                yoVar = null;
            }
            if (yoVar == null) {
                return false;
            }
            if (yo.a.compareAndSet(yoVar, -1, 0)) {
                LockSupport.unpark(yoVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int length = this.g.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            yo yoVar = (yo) this.g.get(i6);
            if (yoVar != null) {
                int iG = yoVar.b.g();
                int iH = wb.h(yoVar.c);
                if (iH == 0) {
                    i++;
                    arrayList.add(String.valueOf(iG) + "c");
                } else if (iH == 1) {
                    i2++;
                    arrayList.add(String.valueOf(iG) + "b");
                } else if (iH == 2) {
                    i3++;
                } else if (iH == 3) {
                    i4++;
                    if (iG > 0) {
                        arrayList.add(String.valueOf(iG) + "d");
                    }
                } else if (iH == 4) {
                    i5++;
                }
            }
        }
        long j = this.controlState;
        return "DefaultDispatcher@" + rs.a(this) + "[Pool Size {core = " + this.h + ", max = " + this.i + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.e.d() + ", global blocking queue size = " + this.f.d() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.h - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }
}
