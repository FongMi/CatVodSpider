package com.github.catvod.spider.merge.AB.o;

import android.widget.Toast;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.AB.o.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0107k implements Runnable {
    public final int a;
    public final C0113q b;

    public /* synthetic */ RunnableC0107k(C0113q c0113q, int i) {
        this.a = i;
        this.b = c0113q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        C0113q c0113q = this.b;
        if (i != 0) {
            Toast.makeText(c0113q.a, "弹幕加载失败", 0).show();
        } else {
            C0113q.f(c0113q);
        }
    }
}
