package com.github.catvod.spider.merge.o;

import com.github.catvod.spider.Bili;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0099A;
import com.github.catvod.spider.merge.b.C0110L;
import com.github.catvod.spider.merge.p.C0207D;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
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
                C0099A.e().getClass();
                C0207D.d(C0098a.a(new byte[]{75, 21, 73, 48, -117, -48}, new byte[]{101, 119, 40, 89, -17, -91, -101, 81}));
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
                    C0110L c0110lP = C0110L.p();
                    c0110lP.getClass();
                    Init.checkPermission();
                    c0110lP.j();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
                break;
        }
    }
}
