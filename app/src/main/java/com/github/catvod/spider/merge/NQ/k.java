package com.github.catvod.spider.merge.NQ;

import com.github.catvod.spider.Duopan;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ Duopan a;
    public final /* synthetic */ String b;
    public final /* synthetic */ AtomicReference c;
    public final /* synthetic */ CountDownLatch d;

    public /* synthetic */ k(Duopan duopan, String str, AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.a = duopan;
        this.b = str;
        this.c = atomicReference;
        this.d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Duopan.d(this.a, this.b, this.c, this.d);
    }
}
