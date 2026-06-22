package com.github.catvod.spider.merge.NQ;

import com.github.catvod.spider.Init;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class g implements Runnable {
    public static final /* synthetic */ g b = new g(0);
    public static final /* synthetic */ g c = new g(1);
    public static final /* synthetic */ g d = new g(2);
    public final /* synthetic */ int a;

    public /* synthetic */ g(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Init.run(d.c);
                break;
            case 1:
                new Thread(h.d).start();
                break;
            default:
                Init.b();
                break;
        }
    }
}
