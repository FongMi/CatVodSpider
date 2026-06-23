package com.github.catvod.spider.merge.A0;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class tl implements ThreadFactory {
    public final /* synthetic */ AtomicInteger a;

    public tl(AtomicInteger atomicInteger) {
        this.a = atomicInteger;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "CommonPool-worker-" + this.a.incrementAndGet());
        thread.setDaemon(true);
        return thread;
    }
}
