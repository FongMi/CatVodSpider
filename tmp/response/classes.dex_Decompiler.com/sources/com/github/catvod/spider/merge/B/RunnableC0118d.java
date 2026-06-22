package com.github.catvod.spider.merge.b;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Market;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class RunnableC0118d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0118d(Object obj, int i) {
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
                ((MainActivity) this.b).k();
                break;
            default:
                Market market = (Market) this.b;
                market.getClass();
                Init.run(new RunnableC0117c(market, 4));
                break;
        }
    }
}
