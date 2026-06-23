package com.github.catvod.spider.merge.FM.b;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.JSDemo;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.b.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0322q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0322q(Object obj, int i) {
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
                ((MainActivity) this.b).i();
                break;
            case 2:
                JSDemo.b((JSDemo) this.b);
                break;
            default:
                com.github.catvod.spider.merge.FM.o.y.e((com.github.catvod.spider.merge.FM.o.y) this.b);
                break;
        }
    }
}
