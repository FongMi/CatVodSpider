package com.github.catvod.spider.merge.FM.n;

import com.github.catvod.spider.PanWebShare;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ PanWebShare a;
    public final /* synthetic */ String b;
    public final /* synthetic */ AtomicReference c;
    public final /* synthetic */ CountDownLatch d;

    public /* synthetic */ l(PanWebShare panWebShare, String str, AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.a = panWebShare;
        this.b = str;
        this.c = atomicReference;
        this.d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PanWebShare.e(this.a, this.b, this.c, this.d);
    }
}
