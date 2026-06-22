package com.github.catvod.spider.merge.m0;

import com.github.catvod.spider.merge.I.t0;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class ThreadFactoryC1306a implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);

    ThreadFactoryC1306a() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        SecurityManager securityManager = System.getSecurityManager();
        ThreadGroup threadGroup = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        StringBuilder sbB = t0.b("yt-downloader-");
        sbB.append(this.a.getAndIncrement());
        Thread thread = new Thread(threadGroup, runnable, sbB.toString());
        thread.setDaemon(true);
        return thread;
    }
}
