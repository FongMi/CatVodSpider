package com.github.catvod.spider.merge.FM.n;

import com.github.catvod.spider.merge.FM.b.J;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class d implements Runnable {
    public static final /* synthetic */ d b = new d(0);
    public static final /* synthetic */ d c = new d(1);
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                J.p().k();
                break;
            default:
                new Thread(h.c).start();
                break;
        }
    }
}
