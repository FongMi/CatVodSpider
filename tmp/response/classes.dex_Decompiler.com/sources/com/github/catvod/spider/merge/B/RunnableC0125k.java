package com.github.catvod.spider.merge.b;

import com.github.catvod.spider.Bili;
import com.github.catvod.spider.merge.g.C0160b;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class RunnableC0125k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC0125k(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x.d((x) this.b, (Map) this.c);
                break;
            default:
                Bili.d((Bili) this.b, (C0160b) this.c);
                break;
        }
    }
}
