package com.github.catvod.spider.merge.AB.n;

import com.github.catvod.spider.merge.AB.b.J;
import com.github.catvod.spider.merge.AB.b.Q;
import com.github.catvod.spider.merge.AB.o.G;
import com.github.catvod.spider.merge.AB.o.c0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class l implements Runnable {
    public static final l b = new l(0);
    public static final l c = new l(1);
    public static final l d = new l(2);
    public final int a;

    public /* synthetic */ l(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        if (i == 0) {
            J.o().getClass();
            c0.u(".quark", "");
            G.c(".quarkMemberType", "");
            G.c(".quark", "");
            return;
        }
        if (i == 1) {
            new Thread(j.c).start();
            return;
        }
        try {
            Q.t().D();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
