package com.github.catvod.spider.merge.b;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.merge.p.C0219l;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class RunnableC0117c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0117c(Object obj, int i) {
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
                ((C0110L) this.b).M();
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
                C0219l.a((String) this.b);
                break;
        }
    }
}
