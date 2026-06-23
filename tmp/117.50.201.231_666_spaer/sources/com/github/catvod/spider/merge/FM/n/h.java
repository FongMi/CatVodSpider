package com.github.catvod.spider.merge.FM.n;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.FM.b.C0301C;
import com.github.catvod.spider.merge.FM.b.J;
import com.github.catvod.spider.merge.FM.o.z;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
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
                z.m25b("UserInfo");
                break;
            case 1:
                try {
                    C0301C.j().o();
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
                break;
            default:
                try {
                    J jP = J.p();
                    jP.getClass();
                    Init.checkPermission();
                    jP.j();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
                break;
        }
    }
}
