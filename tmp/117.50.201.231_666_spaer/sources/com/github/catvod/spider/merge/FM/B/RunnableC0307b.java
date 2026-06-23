package com.github.catvod.spider.merge.FM.b;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.merge.FM.d.C0334b;
import com.github.catvod.spider.merge.FM.o.C0385a;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.b.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0307b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0307b(Object obj, int i) {
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
                ((J) this.b).L();
                break;
            case 2:
                ((Q) this.b).x();
                break;
            case 3:
                C0334b c0334b = (C0334b) this.b;
                c0334b.getClass();
                C0385a.m(t.a.q(), c0334b.toString());
                break;
            default:
                MainActivity.c((MainActivity) this.b);
                break;
        }
    }
}
