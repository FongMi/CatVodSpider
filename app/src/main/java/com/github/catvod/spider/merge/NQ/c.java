package com.github.catvod.spider.merge.NQ;

import com.github.catvod.spider.merge.bY.U;
import com.github.catvod.spider.merge.bY.x;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class c implements Runnable {
    public static final /* synthetic */ c b = new c(0);
    public static final /* synthetic */ c c = new c(1);
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                U.t().p();
                break;
            default:
                try {
                    x.p().K();
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
                break;
        }
    }
}
