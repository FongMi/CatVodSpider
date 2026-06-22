package com.github.catvod.spider.merge.o;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.b.U;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.o.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class RunnableC0202a implements Runnable {
    public static final /* synthetic */ RunnableC0202a b = new RunnableC0202a(0);
    public static final /* synthetic */ RunnableC0202a c = new RunnableC0202a(1);
    public final /* synthetic */ int a;

    public /* synthetic */ RunnableC0202a(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Init.run(f.c);
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
