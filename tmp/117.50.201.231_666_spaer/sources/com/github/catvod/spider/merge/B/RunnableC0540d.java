package com.github.catvod.spider.merge.b;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.merge.m.C0588G;
import com.github.catvod.spider.merge.m.C0597f;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0540d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0540d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C0545i.a((C0545i) this.b);
                break;
            case 1:
                ((MainActivity) this.b).p();
                break;
            case 2:
                C0597f.a((C0597f) this.b);
                break;
            default:
                C0588G.i((C0588G) this.b);
                break;
        }
    }
}
