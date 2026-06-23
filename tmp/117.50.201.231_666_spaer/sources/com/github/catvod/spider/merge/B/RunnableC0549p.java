package com.github.catvod.spider.merge.b;

import com.github.catvod.spider.Config;
import com.github.catvod.spider.merge.i.C0571d;
import com.github.catvod.spider.merge.m.C0602k;
import java.io.File;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0549p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC0549p(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((w) this.b).d((String) this.c, true);
                break;
            case 1:
                C0602k.c((File) this.c, ((C0571d) this.b).toString());
                break;
            default:
                ((Config) this.b).p((String) this.c);
                break;
        }
    }
}
