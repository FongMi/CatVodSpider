package com.github.catvod.spider.merge.FM.b;

import com.github.catvod.spider.Bili;
import com.github.catvod.spider.merge.FM.g.C0346b;
import com.github.catvod.spider.merge.FM.m.C0378c;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class H implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ H(Object obj, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                J j = (J) this.c;
                String strN = (String) this.b;
                j.getClass();
                if (strN.startsWith("http")) {
                    strN = C0378c.n(strN, null);
                }
                j.K(strN);
                break;
            case 1:
                Q.f((Q) this.c, (String) this.b);
                break;
            case 2:
                Bili.d((Bili) this.c, (C0346b) this.b);
                break;
            default:
                ((com.github.catvod.spider.merge.FM.o.y) this.c).x((Map) this.b);
                break;
        }
    }
}
