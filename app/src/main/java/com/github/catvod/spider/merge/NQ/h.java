package com.github.catvod.spider.merge.NQ;

import com.github.catvod.spider.Bili;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.bY.A;
import com.github.catvod.spider.merge.bY.L;
import com.github.catvod.spider.merge.pT.C;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
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
                A.e().getClass();
                C.d(com.github.catvod.spider.merge.XI.f.a(new byte[]{-53, -13, 65, -56, -111, -3}, new byte[]{-27, -111, 32, -95, -11, -120, -101, 73}));
                break;
            case 1:
                try {
                    Bili.get().getQRCode();
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
                break;
            default:
                try {
                    L lP = L.p();
                    lP.getClass();
                    Init.checkPermission();
                    lP.j();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
                break;
        }
    }
}
