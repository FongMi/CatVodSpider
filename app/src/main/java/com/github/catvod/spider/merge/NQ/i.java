package com.github.catvod.spider.merge.NQ;

import com.github.catvod.spider.merge.bY.U;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class i implements Runnable {
    public static final /* synthetic */ i b = new i(0);
    public static final /* synthetic */ i c = new i(1);
    public static final /* synthetic */ i d = new i(2);
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                com.github.catvod.spider.merge.pT.a.o(com.github.catvod.spider.merge.pT.a.n(com.github.catvod.spider.merge.XI.f.a(new byte[]{-92, 25, 74, -122, 100, -74, 32, 16}, new byte[]{-117, 55, 43, -22, 13, -49, 85, 126})), "");
                break;
            case 1:
                new Thread(e.c).start();
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
