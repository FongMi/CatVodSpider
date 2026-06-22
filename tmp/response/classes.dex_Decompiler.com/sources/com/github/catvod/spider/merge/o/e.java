package com.github.catvod.spider.merge.o;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.b.C0110L;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class e implements Runnable {
    public static final /* synthetic */ e b = new e(0);
    public static final /* synthetic */ e c = new e(1);
    public static final /* synthetic */ e d = new e(2);
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C0110L.p().k();
                break;
            case 1:
                new Thread(g.c).start();
                break;
            default:
                Init.a();
                break;
        }
    }
}
