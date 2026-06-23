package com.github.catvod.spider.merge.AB.n;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.AB.b.J;
import com.github.catvod.spider.merge.AB.b.Q;
import com.github.catvod.spider.merge.AB.o.F;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class m implements Runnable {
    public static final m b = new m(0);
    public static final m c = new m(1);
    public static final m d = new m(2);
    public static final m e = new m(3);
    public final int a;

    public /* synthetic */ m(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        if (i == 0) {
            F.g(F.f("/.aliyun"), "");
            return;
        }
        if (i == 1) {
            new Thread(d).start();
            return;
        }
        if (i != 2) {
            try {
                J jO = J.o();
                jO.getClass();
                Init.checkPermission();
                jO.j();
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        try {
            Q qT = Q.t();
            qT.getClass();
            Init.checkPermission();
            qT.o();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }
}
