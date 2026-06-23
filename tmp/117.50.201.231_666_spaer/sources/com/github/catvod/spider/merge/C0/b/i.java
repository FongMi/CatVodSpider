package com.github.catvod.spider.merge.C0.b;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final int c;
    public final p d;

    public /* synthetic */ i(p pVar, int i) {
        this.c = i;
        this.d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                p.d(this.d);
                break;
            default:
                this.d.M();
                break;
        }
    }
}
