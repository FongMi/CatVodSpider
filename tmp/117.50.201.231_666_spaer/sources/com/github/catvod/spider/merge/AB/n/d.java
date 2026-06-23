package com.github.catvod.spider.merge.AB.n;

import com.github.catvod.spider.Bili;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final Bili a;
    public final com.github.catvod.spider.merge.AB.g.b b;

    public /* synthetic */ d(Bili bili, com.github.catvod.spider.merge.AB.g.b bVar) {
        this.a = bili;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bili.a(this.a, this.b);
    }
}
