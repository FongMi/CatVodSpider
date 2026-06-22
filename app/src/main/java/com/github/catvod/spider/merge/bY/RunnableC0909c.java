package com.github.catvod.spider.merge.bY;

import com.github.catvod.debug.MainActivity;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.bY.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0909c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0909c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x.b((x) this.b);
                break;
            case 1:
                ((L) this.b).M();
                break;
            case 2:
                ((U) this.b).B();
                break;
            case 3:
                ((MainActivity) this.b).j();
                break;
            case 4:
                Market.c((Market) this.b);
                break;
            default:
                com.github.catvod.spider.merge.pT.k.a((String) this.b);
                break;
        }
    }
}
