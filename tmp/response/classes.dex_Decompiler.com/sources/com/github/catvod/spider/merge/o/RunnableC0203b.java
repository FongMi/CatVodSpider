package com.github.catvod.spider.merge.o;

import com.github.catvod.spider.merge.b.U;
import com.github.catvod.spider.merge.b.x;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.o.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class RunnableC0203b implements Runnable {
    public static final /* synthetic */ RunnableC0203b b = new RunnableC0203b(0);
    public static final /* synthetic */ RunnableC0203b c = new RunnableC0203b(1);
    public final /* synthetic */ int a;

    public /* synthetic */ RunnableC0203b(int i) {
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
