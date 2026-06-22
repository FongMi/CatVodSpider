package com.github.catvod.spider.merge.bY;

import android.widget.EditText;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.bY.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0918l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ RunnableC0918l(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    public /* synthetic */ RunnableC0918l(String str, AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.a = 1;
        this.b = str;
        this.c = atomicReference;
        this.d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x.j((x) this.c, (String) this.b, (com.github.catvod.spider.merge.dO.e) this.d);
                break;
            case 1:
                Wogg.d((String) this.b, (AtomicReference) this.c, (CountDownLatch) this.d);
                break;
            default:
                com.github.catvod.spider.merge.pT.B.i((com.github.catvod.spider.merge.pT.B) this.c, (EditText) this.b, (EditText) this.d);
                break;
        }
    }
}
