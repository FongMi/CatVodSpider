package com.github.catvod.spider.merge.A0;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class acj extends dx implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final long v;
    public static final acj x;

    static {
        Long l;
        acj acjVar = new acj();
        x = acjVar;
        acjVar.t(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        v = timeUnit.toNanos(l.longValue());
    }

    @Override // com.github.catvod.spider.merge.A0.dx, com.github.catvod.spider.merge.A0.acp
    public final adh c(long j, az azVar, yg ygVar) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return m.a;
        }
        long jNanoTime = System.nanoTime();
        adp adpVar = new adp(j2 + jNanoTime, azVar);
        l(jNanoTime, adpVar);
        return adpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zI;
        abk.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zI) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long j2 = j();
                    if (j2 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = v + jNanoTime;
                        }
                        long j3 = j - jNanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            y();
                            if (i()) {
                                return;
                            }
                            s();
                            return;
                        }
                        if (j2 > j3) {
                            j2 = j3;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (j2 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            y();
                            if (i()) {
                                return;
                            }
                            s();
                            return;
                        }
                        LockSupport.parkNanos(this, j2);
                    }
                }
            }
        } finally {
            _thread = null;
            y();
            if (!i()) {
                s();
            }
        }
    }

    @Override // com.github.catvod.spider.merge.A0.er
    public final Thread s() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    public final synchronized void y() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            k();
            notifyAll();
        }
    }
}
