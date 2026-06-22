package com.github.catvod.spider.merge.bY;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Bili;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.bY.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0907a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0907a(Object obj, int i) {
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
                F.e((F) this.b);
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
