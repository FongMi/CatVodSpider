package com.github.catvod.spider.merge.b;

import com.github.catvod.spider.Config;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0539c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0539c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C0545i.a((C0545i) this.b);
                break;
            case 1:
                C0545i.a((C0545i) this.b);
                break;
            default:
                Config.b((Config) this.b);
                break;
        }
    }
}
