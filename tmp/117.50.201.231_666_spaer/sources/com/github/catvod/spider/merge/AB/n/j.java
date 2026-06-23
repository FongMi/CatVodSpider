package com.github.catvod.spider.merge.AB.n;

import com.github.catvod.spider.Bili;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.AB.b.x;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class j implements Runnable {
    public static final j b = new j(0);
    public static final j c = new j(1);
    public static final j d = new j(2);
    public final int a;

    public /* synthetic */ j(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        if (i == 0) {
            Init.run(k.c);
            return;
        }
        if (i != 1) {
            try {
                x.p().K();
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        try {
            Bili.get().getQRCode();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
