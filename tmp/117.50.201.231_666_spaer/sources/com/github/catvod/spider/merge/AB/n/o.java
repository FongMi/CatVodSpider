package com.github.catvod.spider.merge.AB.n;

import com.github.catvod.spider.PanWebShare;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final PanWebShare a;
    public final String b;
    public final AtomicReference c;
    public final CountDownLatch d;

    public /* synthetic */ o(PanWebShare panWebShare, String str, AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.a = panWebShare;
        this.b = str;
        this.c = atomicReference;
        this.d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PanWebShare.d(this.a, this.b, this.c, this.d);
    }
}
