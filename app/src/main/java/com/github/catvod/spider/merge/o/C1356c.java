package com.github.catvod.spider.merge.o;

import android.os.Looper;
import com.github.catvod.spider.merge.b.AbstractC0901a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.o.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1356c extends AbstractC0901a {
    private final Object a = new Object();
    private final ExecutorService b = Executors.newFixedThreadPool(4, new ThreadFactoryC1355b());

    public final boolean o() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
