package com.github.catvod.spider.merge.dp;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ p d;

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
