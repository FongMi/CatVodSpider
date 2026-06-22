package com.github.catvod.spider.merge.b;

import com.github.catvod.spider.Bili;
import com.github.catvod.spider.merge.d.C0146e;
import com.github.catvod.spider.merge.g.C0160b;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class RunnableC0121g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC0121g(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x.i((x) this.b, (C0146e) this.c);
                break;
            default:
                Bili.a((Bili) this.b, (C0160b) this.c);
                break;
        }
    }
}
