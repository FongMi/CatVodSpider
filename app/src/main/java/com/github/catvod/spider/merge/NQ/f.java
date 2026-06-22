package com.github.catvod.spider.merge.NQ;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.bY.L;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class f implements Runnable {
    public static final /* synthetic */ f b = new f(0);
    public static final /* synthetic */ f c = new f(1);
    public static final /* synthetic */ f d = new f(2);
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                L.p().k();
                break;
            case 1:
                new Thread(h.c).start();
                break;
            default:
                Init.a();
                break;
        }
    }
}
