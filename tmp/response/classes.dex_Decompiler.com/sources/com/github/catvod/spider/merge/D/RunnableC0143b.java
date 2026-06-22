package com.github.catvod.spider.merge.d;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.merge.b.x;
import com.github.catvod.spider.merge.p.C0206C;
import com.github.catvod.spider.merge.p.C0208a;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class RunnableC0143b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0143b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C0144c c0144c = (C0144c) this.b;
                c0144c.getClass();
                C0208a.n(x.p().q(), c0144c.toString());
                break;
            case 1:
                MainActivity.c((MainActivity) this.b);
                break;
            default:
                C0206C.e((C0206C) this.b);
                break;
        }
    }
}
