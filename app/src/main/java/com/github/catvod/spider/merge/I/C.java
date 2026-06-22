package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.Init;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class C implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ C(Object obj, Object obj2, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                G.e((G) this.c, (com.github.catvod.spider.merge.O.b) this.d);
                break;
            case 1:
                C0754f0.h((C0754f0) this.c, (String) this.d);
                break;
            default:
                Init.e((Init) this.c, (Boolean) this.d);
                break;
        }
    }
}
