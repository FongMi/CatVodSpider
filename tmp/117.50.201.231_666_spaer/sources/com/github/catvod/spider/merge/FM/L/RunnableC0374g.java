package com.github.catvod.spider.merge.FM.l;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.merge.FM.o.C0394j;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.l.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0374g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0374g(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MainActivity) this.b).l();
                break;
            case 1:
                Bili.b((Bili) this.b);
                break;
            case 2:
                Config.a((Config) this.b);
                break;
            case 3:
                Market.b((Market) this.b);
                break;
            default:
                C0394j.a((String) this.b);
                break;
        }
    }
}
