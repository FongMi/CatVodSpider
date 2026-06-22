package com.github.catvod.spider.merge.b;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.Market;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class RunnableC0115a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0115a(Object obj, int i) {
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
                C0104F.e((C0104F) this.b);
                break;
            case 2:
                ((MainActivity) this.b).l();
                break;
            case 3:
                Bili.b((Bili) this.b);
                break;
            default:
                Market.b((Market) this.b);
                break;
        }
    }
}
