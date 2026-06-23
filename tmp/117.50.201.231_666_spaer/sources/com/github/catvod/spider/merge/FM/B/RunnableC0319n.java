package com.github.catvod.spider.merge.FM.b;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.b.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0319n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;

    public /* synthetic */ RunnableC0319n(u uVar, int i) {
        this.a = i;
        this.b = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u.b(this.b);
                break;
            default:
                this.b.o();
                break;
        }
    }
}
