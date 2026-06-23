package com.github.catvod.spider.merge.AB.b;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.JSDemo;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.merge.AB.o.C0101e;
import com.github.catvod.spider.merge.AB.o.C0113q;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.AB.b.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0083d implements Runnable {
    public final int a;
    public final Object b;

    public /* synthetic */ RunnableC0083d(Object obj, int i) {
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
                ((MainActivity) this.b).l();
                break;
            case 2:
                Bili.b((Bili) this.b);
                break;
            case 3:
                Config.b((Config) this.b);
                break;
            case 4:
                JSDemo.b((JSDemo) this.b);
                break;
            case 5:
                Market market = (Market) this.b;
                market.getClass();
                Init.run(new RunnableC0080a(market, 3));
                break;
            case 6:
                C0101e.b((C0101e) this.b);
                break;
            default:
                C0113q.a((C0113q) this.b);
                break;
        }
    }
}
