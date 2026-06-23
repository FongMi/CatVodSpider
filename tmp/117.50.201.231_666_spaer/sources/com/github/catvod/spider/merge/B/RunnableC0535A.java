package com.github.catvod.spider.merge.b;

import com.github.catvod.spider.merge.m.C0588G;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0535A implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC0535A(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((C0536B) this.b).b((String) this.c, true);
                break;
            default:
                ((C0588G) this.b).z((Map) this.c);
                break;
        }
    }
}
