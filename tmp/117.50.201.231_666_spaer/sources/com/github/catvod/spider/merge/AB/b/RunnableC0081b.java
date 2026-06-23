package com.github.catvod.spider.merge.AB.b;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.JSDemo;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.merge.AB.o.Z;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.AB.b.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0081b implements Runnable {
    public final int a;
    public final Object b;

    public /* synthetic */ RunnableC0081b(Object obj, int i) {
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
            ((J) this.b).N();
            return;
        }
        if (i == 2) {
            ((Q) this.b).B();
            return;
        }
        if (i == 3) {
            ((MainActivity) this.b).j();
            return;
        }
        if (i == 4) {
            JSDemo.a((JSDemo) this.b);
            return;
        }
        Object obj = this.b;
        if (i != 5) {
            Z.e((Z) obj);
        } else {
            Market.b((Market) obj);
        }
    }
}
