package com.github.catvod.spider.merge.FM.b;

import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class N implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ N(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Q.d((Q) this.b, (String) this.c);
                break;
            default:
                ((com.github.catvod.spider.merge.FM.o.y) this.b).x((Map) this.c);
                break;
        }
    }
}
