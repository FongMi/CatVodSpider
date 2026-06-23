package com.github.catvod.spider.merge.b;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w b;
    public final /* synthetic */ String c;

    public /* synthetic */ n(w wVar, String str, int i) {
        this.a = i;
        this.b = wVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d(this.c, true);
                break;
            default:
                this.b.d(this.c, true);
                break;
        }
    }
}
