package com.github.catvod.spider.merge.FM.n;

import com.github.catvod.spider.Wogg;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ CountDownLatch c;

    public /* synthetic */ o(String str, AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.a = str;
        this.b = atomicReference;
        this.c = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Wogg.e(this.a, this.b, this.c);
    }
}
