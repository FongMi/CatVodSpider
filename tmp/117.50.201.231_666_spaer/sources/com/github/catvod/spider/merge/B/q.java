package com.github.catvod.spider.merge.b;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ String c;

    public /* synthetic */ q(Object obj, String str, int i) {
        this.a = i;
        this.b = obj;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((w) this.b).d(this.c, true);
                break;
            case 1:
                ((w) this.b).d(this.c, true);
                break;
            default:
                C0536B c0536b = (C0536B) this.b;
                String str = this.c;
                int i = C0536B.e;
                c0536b.b(str, true);
                break;
        }
    }
}
