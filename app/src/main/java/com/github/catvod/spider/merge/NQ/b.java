package com.github.catvod.spider.merge.NQ;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.bY.U;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class b implements Runnable {
    public static final /* synthetic */ b b = new b(0);
    public static final /* synthetic */ b c = new b(1);
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Init.run(g.c);
                break;
            default:
                try {
                    U uT = U.t();
                    uT.getClass();
                    Init.checkPermission();
                    uT.o();
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
                break;
        }
    }
}
