package com.github.catvod.spider.merge.b;

import android.widget.EditText;
import com.github.catvod.spider.Wogg;
import com.github.catvod.spider.merge.d.C0146e;
import com.github.catvod.spider.merge.p.C0206C;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class RunnableC0126l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ RunnableC0126l(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    public /* synthetic */ RunnableC0126l(String str, AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.a = 1;
        this.b = str;
        this.c = atomicReference;
        this.d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x.j((x) this.c, (String) this.b, (C0146e) this.d);
                break;
            case 1:
                Wogg.d((String) this.b, (AtomicReference) this.c, (CountDownLatch) this.d);
                break;
            default:
                C0206C.i((C0206C) this.c, (EditText) this.b, (EditText) this.d);
                break;
        }
    }
}
