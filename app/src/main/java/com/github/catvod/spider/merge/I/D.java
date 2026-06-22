package com.github.catvod.spider.merge.I;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class D implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ D(Object obj, Object obj2, int i) {
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
                O.i((O) this.c, (String) this.d);
                break;
            case 2:
                C0754f0.h((C0754f0) this.c, (String) this.d);
                break;
            default:
                v0 v0Var = (v0) this.c;
                String strL = (String) this.d;
                v0Var.getClass();
                if (strL.startsWith("http")) {
                    strL = com.github.catvod.spider.merge.f0.d.l(strL);
                }
                v0Var.L(strL, true);
                break;
        }
    }
}
