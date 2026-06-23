package com.github.catvod.spider.merge.AB.b;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Market;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.AB.b.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0080a implements Runnable {
    public final int a;
    public final Object b;

    public /* synthetic */ RunnableC0080a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        if (i == 0) {
            x.b((x) this.b);
            return;
        }
        if (i == 1) {
            ((J) this.b).n();
            return;
        }
        Object obj = this.b;
        if (i != 2) {
            Market.c((Market) obj);
        } else {
            ((MainActivity) obj).m();
        }
    }
}
