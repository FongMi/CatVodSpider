package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.merge.j0.C1275b;
import java.io.PipedOutputStream;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class E implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ E(Object obj, Object obj2, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                G.a((G) this.c, (com.github.catvod.spider.merge.O.b) this.d);
                break;
            case 1:
                O.c((O) this.c, (String) this.d);
                break;
            case 2:
                Q0 q0 = (Q0) this.c;
                String strL = (String) this.d;
                q0.getClass();
                if (strL.startsWith("http")) {
                    strL = com.github.catvod.spider.merge.f0.d.l(strL);
                }
                q0.l(strL, true);
                break;
            default:
                C1275b.c((C1275b) this.c, (PipedOutputStream) this.d);
                break;
        }
    }
}
