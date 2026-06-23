package com.github.catvod.spider.merge.A0;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class vp extends mj implements kj, Executor {
    public static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(vp.class, "inFlightTasks");
    public final acl c;
    public final int d;
    public final String f = "Dispatchers.IO";
    public final int h = 1;
    public final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    private volatile int inFlightTasks = 0;

    public vp(acl aclVar, int i) {
        this.c = aclVar;
        this.d = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher");
    }

    @Override // com.github.catvod.spider.merge.A0.ym
    public final void e(yg ygVar, acw acwVar) {
        i(acwVar, false);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        i(runnable, false);
    }

    public final void i(Runnable runnable, boolean z) {
        adf ajVar;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = a;
            int iIncrementAndGet = atomicIntegerFieldUpdater.incrementAndGet(this);
            int i = this.d;
            if (iIncrementAndGet <= i) {
                yp ypVar = this.c.a;
                try {
                    ypVar.l(runnable, this, z);
                    return;
                } catch (RejectedExecutionException unused) {
                    acj acjVar = acj.x;
                    ypVar.getClass();
                    ak.e.getClass();
                    long jNanoTime = System.nanoTime();
                    if (runnable instanceof adf) {
                        ajVar = (adf) runnable;
                        ajVar.z = jNanoTime;
                        ajVar.aa = this;
                    } else {
                        ajVar = new aj(runnable, jNanoTime, this);
                    }
                    acjVar._a(ajVar);
                    return;
                }
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = this.b;
            concurrentLinkedQueue.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= i) {
                return;
            } else {
                runnable = (Runnable) concurrentLinkedQueue.poll();
            }
        } while (runnable != null);
    }

    @Override // com.github.catvod.spider.merge.A0.kj
    public final int o() {
        return this.h;
    }

    @Override // com.github.catvod.spider.merge.A0.kj
    public final void p() {
        adf ajVar;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.b;
        Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
        if (runnable == null) {
            a.decrementAndGet(this);
            Runnable runnable2 = (Runnable) concurrentLinkedQueue.poll();
            if (runnable2 != null) {
                i(runnable2, true);
                return;
            }
            return;
        }
        yp ypVar = this.c.a;
        try {
            ypVar.l(runnable, this, true);
        } catch (RejectedExecutionException unused) {
            acj acjVar = acj.x;
            ypVar.getClass();
            ak.e.getClass();
            long jNanoTime = System.nanoTime();
            if (runnable instanceof adf) {
                ajVar = (adf) runnable;
                ajVar.z = jNanoTime;
                ajVar.aa = this;
            } else {
                ajVar = new aj(runnable, jNanoTime, this);
            }
            acjVar._a(ajVar);
        }
    }

    @Override // com.github.catvod.spider.merge.A0.ym
    public final String toString() {
        String str = this.f;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.c + ']';
    }
}
