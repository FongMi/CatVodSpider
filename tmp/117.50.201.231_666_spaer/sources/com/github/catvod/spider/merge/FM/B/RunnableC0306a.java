package com.github.catvod.spider.merge.FM.b;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Market;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.b.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0306a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0306a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u.b((u) this.b);
                break;
            case 1:
                ((C0301C) this.b).i();
                break;
            case 2:
                ((Q) this.b).K();
                break;
            case 3:
                ((MainActivity) this.b).j();
                break;
            default:
                Market.c((Market) this.b);
                break;
        }
    }
}
