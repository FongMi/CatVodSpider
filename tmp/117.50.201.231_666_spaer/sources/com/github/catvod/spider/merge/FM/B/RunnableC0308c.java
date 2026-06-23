package com.github.catvod.spider.merge.FM.b;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Market;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.b.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0308c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0308c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u.k((u) this.b);
                break;
            case 1:
                ((J) this.b).o();
                break;
            case 2:
                ((MainActivity) this.b).k();
                break;
            default:
                Market market = (Market) this.b;
                market.getClass();
                Init.run(new RunnableC0306a(market, 4));
                break;
        }
    }
}
