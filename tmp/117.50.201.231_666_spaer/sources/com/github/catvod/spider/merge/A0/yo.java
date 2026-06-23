package com.github.catvod.spider.merge.A0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class yo extends Thread {
    public static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(yo.class, "workerCtl");
    public final gl b;
    public int c;
    public long d;
    public long e;
    public int f;
    public boolean g;
    public final /* synthetic */ yp h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    volatile int workerCtl;

    public yo(yp ypVar, int i) {
        this.h = ypVar;
        setDaemon(true);
        this.b = new gl();
        this.c = 4;
        this.workerCtl = 0;
        this.nextParkedWorker = yp.d;
        cu.a.getClass();
        this.f = cu.b.d().nextInt();
        n(i);
    }

    public final adf i(boolean z) {
        adf adfVarM;
        adf adfVarM2;
        long j;
        adf adfVarH;
        if (this.c != 1) {
            yp ypVar = this.h;
            do {
                j = ypVar.controlState;
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    if (z) {
                        gl glVar = this.b;
                        glVar.getClass();
                        adfVarH = (adf) gl.a.getAndSet(glVar, null);
                        if (adfVarH == null) {
                            adfVarH = glVar.h();
                        }
                        if (adfVarH == null) {
                            adfVarH = (adf) this.h.f.e();
                        }
                    } else {
                        adfVarH = (adf) this.h.f.e();
                    }
                    return adfVarH != null ? adfVarH : q(true);
                }
            } while (!yp.b.compareAndSet(ypVar, j, j - 4398046511104L));
            this.c = 1;
        }
        if (z) {
            boolean z2 = l(this.h.h * 2) == 0;
            if (z2 && (adfVarM2 = m()) != null) {
                return adfVarM2;
            }
            gl glVar2 = this.b;
            glVar2.getClass();
            adf adfVar = (adf) gl.a.getAndSet(glVar2, null);
            adf adfVarH2 = adfVar != null ? adfVar : glVar2.h();
            if (adfVarH2 != null) {
                return adfVarH2;
            }
            if (!z2 && (adfVarM = m()) != null) {
                return adfVarM;
            }
        } else {
            adf adfVarM3 = m();
            if (adfVarM3 != null) {
                return adfVarM3;
            }
        }
        return q(false);
    }

    public final int j() {
        return this.indexInArray;
    }

    public final Object k() {
        return this.nextParkedWorker;
    }

    public final int l(int i) {
        int i2 = this.f;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    public final adf m() {
        int iL = l(2);
        yp ypVar = this.h;
        if (iL == 0) {
            adf adfVar = (adf) ypVar.e.e();
            return adfVar != null ? adfVar : (adf) ypVar.f.e();
        }
        adf adfVar2 = (adf) ypVar.f.e();
        return adfVar2 != null ? adfVar2 : (adf) ypVar.e.e();
    }

    public final void n(int i) {
        StringBuilder sb = new StringBuilder("DefaultDispatcher-worker-");
        this.h.getClass();
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void o(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean p(int i) {
        int i2 = this.c;
        boolean z = i2 == 1;
        if (z) {
            yp.b.addAndGet(this.h, 4398046511104L);
        }
        if (i2 != i) {
            this.c = i;
        }
        return z;
    }

    public final adf q(boolean z) {
        long j;
        yp ypVar = this.h;
        int i = (int) (ypVar.controlState & 2097151);
        if (i < 2) {
            return null;
        }
        int iL = l(i);
        long jMin = Long.MAX_VALUE;
        for (int i2 = 0; i2 < i; i2++) {
            iL++;
            if (iL > i) {
                iL = 1;
            }
            yo yoVar = (yo) ypVar.g.get(iL);
            if (yoVar != null && yoVar != this) {
                gl glVar = this.b;
                gl glVar2 = yoVar.b;
                if (z) {
                    j = glVar.i(glVar2);
                } else {
                    glVar.getClass();
                    adf adfVarH = glVar2.h();
                    if (adfVarH != null) {
                        adf adfVar = (adf) gl.a.getAndSet(glVar, adfVarH);
                        if (adfVar != null) {
                            glVar.f(adfVar);
                        }
                        j = -1;
                    } else {
                        j = glVar.j(glVar2, false);
                    }
                }
                if (j == -1) {
                    glVar.getClass();
                    adf adfVar2 = (adf) gl.a.getAndSet(glVar, null);
                    return adfVar2 != null ? adfVar2 : glVar.h();
                }
                if (j > 0) {
                    jMin = Math.min(jMin, j);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.e = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        loop0: while (true) {
            boolean z = false;
            while (!this.h.m() && this.c != 5) {
                adf adfVarI = i(this.g);
                if (adfVarI != null) {
                    this.e = 0L;
                    int iO = adfVarI.aa.o();
                    this.d = 0L;
                    if (this.c == 3) {
                        this.c = 2;
                    }
                    yp ypVar = this.h;
                    if (iO != 0 && p(2) && !ypVar.q() && !ypVar.p(ypVar.controlState)) {
                        ypVar.q();
                    }
                    ypVar.getClass();
                    try {
                        adfVarI.run();
                    } catch (Throwable th) {
                        Thread threadCurrentThread = Thread.currentThread();
                        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                    }
                    if (iO != 0) {
                        yp.b.addAndGet(ypVar, -2097152L);
                        if (this.c != 5) {
                            this.c = 4;
                        }
                    }
                } else {
                    this.g = false;
                    if (this.e != 0) {
                        if (z) {
                            p(3);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.e);
                            this.e = 0L;
                        } else {
                            z = true;
                        }
                    } else if (this.nextParkedWorker != yp.d) {
                        this.workerCtl = -1;
                        while (this.nextParkedWorker != yp.d && this.workerCtl == -1 && !this.h.m() && this.c != 5) {
                            p(3);
                            Thread.interrupted();
                            if (this.d == 0) {
                                this.d = System.nanoTime() + this.h.j;
                            }
                            LockSupport.parkNanos(this.h.j);
                            if (System.nanoTime() - this.d >= 0) {
                                this.d = 0L;
                                synchronized (this.h.g) {
                                    try {
                                        if (!this.h.m()) {
                                            if (((int) (this.h.controlState & 2097151)) > this.h.h) {
                                                if (a.compareAndSet(this, -1, 1)) {
                                                    int i = this.indexInArray;
                                                    n(0);
                                                    this.h.o(this, i, 0);
                                                    int andDecrement = (int) (yp.b.getAndDecrement(this.h) & 2097151);
                                                    if (andDecrement != i) {
                                                        Object obj = this.h.g.get(andDecrement);
                                                        ko.c(obj);
                                                        yo yoVar = (yo) obj;
                                                        this.h.g.set(i, yoVar);
                                                        yoVar.n(i);
                                                        this.h.o(yoVar, andDecrement, i);
                                                    }
                                                    this.h.g.set(andDecrement, null);
                                                    this.c = 5;
                                                }
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            }
                        }
                    } else {
                        this.h.n(this);
                    }
                }
            }
            break loop0;
        }
        p(5);
    }
}
