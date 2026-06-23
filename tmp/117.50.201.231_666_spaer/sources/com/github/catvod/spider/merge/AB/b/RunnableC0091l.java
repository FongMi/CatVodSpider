package com.github.catvod.spider.merge.AB.b;

import com.github.catvod.spider.Wogg;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.AB.b.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0091l implements Runnable {
    public final int a = 0;
    public final String b;
    public final Object c;
    public final Object d;

    public /* synthetic */ RunnableC0091l(x xVar, String str, com.github.catvod.spider.merge.AB.d.d dVar) {
        this.c = xVar;
        this.b = str;
        this.d = dVar;
    }

    public /* synthetic */ RunnableC0091l(String str, AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.b = str;
        this.c = atomicReference;
        this.d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a != 0) {
            Wogg.d(this.b, (AtomicReference) this.c, (CountDownLatch) this.d);
        } else {
            x.j((x) this.c, this.b, (com.github.catvod.spider.merge.AB.d.d) this.d);
        }
    }
}
