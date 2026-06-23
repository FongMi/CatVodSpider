package com.github.catvod.spider.merge.AB.n;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.AB.b.Q;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class k implements Runnable {
    public static final k b = new k(0);
    public static final k c = new k(1);
    public static final k d = new k(2);
    public final int a;

    public /* synthetic */ k(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        int i = this.a;
        if (i == 0) {
            Q.t().p();
        } else if (i != 1) {
            Init.a();
        } else {
            new Thread(m.e).start();
        }
    }
}
