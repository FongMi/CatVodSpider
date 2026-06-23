package com.github.catvod.spider.merge.A0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class gl {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(gl.class, Object.class, "lastScheduledTask");
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(gl.class, "producerIndex");
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(gl.class, "consumerIndex");
    public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(gl.class, "blockingTasksInBuffer");
    public final AtomicReferenceArray e = new AtomicReferenceArray(128);
    private volatile Object lastScheduledTask = null;
    private volatile int producerIndex = 0;
    private volatile int consumerIndex = 0;
    private volatile int blockingTasksInBuffer = 0;

    public final adf f(adf adfVar) {
        if (adfVar.aa.o() == 1) {
            d.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return adfVar;
        }
        int i = this.producerIndex & 127;
        while (this.e.get(i) != null) {
            Thread.yield();
        }
        this.e.lazySet(i, adfVar);
        b.incrementAndGet(this);
        return null;
    }

    public final int g() {
        return this.lastScheduledTask != null ? (this.producerIndex - this.consumerIndex) + 1 : this.producerIndex - this.consumerIndex;
    }

    public final adf h() {
        adf adfVar;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (c.compareAndSet(this, i, i + 1) && (adfVar = (adf) this.e.getAndSet(i2, null)) != null) {
                if (adfVar.aa.o() == 1) {
                    d.decrementAndGet(this);
                }
                return adfVar;
            }
        }
    }

    public final long i(gl glVar) {
        int i = glVar.producerIndex;
        AtomicReferenceArray atomicReferenceArray = glVar.e;
        for (int i2 = glVar.consumerIndex; i2 != i; i2++) {
            int i3 = i2 & 127;
            if (glVar.blockingTasksInBuffer == 0) {
                break;
            }
            adf adfVar = (adf) atomicReferenceArray.get(i3);
            if (adfVar != null && adfVar.aa.o() == 1) {
                while (!atomicReferenceArray.compareAndSet(i3, adfVar, null)) {
                    if (atomicReferenceArray.get(i3) != adfVar) {
                        break;
                    }
                }
                d.decrementAndGet(glVar);
                adf adfVar2 = (adf) a.getAndSet(this, adfVar);
                if (adfVar2 == null) {
                    return -1L;
                }
                f(adfVar2);
                return -1L;
            }
        }
        return j(glVar, true);
    }

    public final long j(gl glVar, boolean z) {
        while (true) {
            adf adfVar = (adf) glVar.lastScheduledTask;
            if (adfVar == null) {
                return -2L;
            }
            if (z && adfVar.aa.o() != 1) {
                return -2L;
            }
            ak.e.getClass();
            long jNanoTime = System.nanoTime() - adfVar.z;
            long j = ak.a;
            if (jNanoTime < j) {
                return j - jNanoTime;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            while (!atomicReferenceFieldUpdater.compareAndSet(glVar, adfVar, null)) {
                if (atomicReferenceFieldUpdater.get(glVar) != adfVar) {
                    break;
                }
            }
            adf adfVar2 = (adf) a.getAndSet(this, adfVar);
            if (adfVar2 == null) {
                return -1L;
            }
            f(adfVar2);
            return -1L;
        }
    }
}
