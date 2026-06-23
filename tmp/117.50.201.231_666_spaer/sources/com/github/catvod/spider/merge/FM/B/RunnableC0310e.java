package com.github.catvod.spider.merge.FM.b;

import com.github.catvod.spider.merge.FM.d.C0336d;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.b.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0310e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC0310e(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u.i((u) this.b, (C0336d) this.c);
                break;
            case 1:
                C0301C.a((C0301C) this.b, (String[]) this.c);
                break;
            default:
                ((J) this.b).C((String) this.c);
                break;
        }
    }
}
