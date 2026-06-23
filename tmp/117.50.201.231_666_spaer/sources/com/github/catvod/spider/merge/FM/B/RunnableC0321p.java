package com.github.catvod.spider.merge.FM.b;

import com.github.catvod.spider.JSDemo;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.b.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0321p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0321p(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u.b((u) this.b);
                break;
            case 1:
                C0301C.e((C0301C) this.b);
                break;
            default:
                JSDemo.a((JSDemo) this.b);
                break;
        }
    }
}
