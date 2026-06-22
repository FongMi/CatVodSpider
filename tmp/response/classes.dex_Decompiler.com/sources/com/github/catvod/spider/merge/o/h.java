package com.github.catvod.spider.merge.o;

import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.U;
import com.github.catvod.spider.merge.p.C0208a;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class h implements Runnable {
    public static final /* synthetic */ h b = new h(0);
    public static final /* synthetic */ h c = new h(1);
    public static final /* synthetic */ h d = new h(2);
    public final /* synthetic */ int a;

    public /* synthetic */ h(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C0208a.n(C0208a.m(C0098a.a(new byte[]{-59, 68, -70, -44, -59, 45, 86, 80}, new byte[]{-22, 106, -37, -72, -84, 84, 35, 62})), "");
                break;
            case 1:
                new Thread(d.c).start();
                break;
            default:
                try {
                    U.t().D();
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
                break;
        }
    }
}
