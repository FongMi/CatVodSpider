package com.github.catvod.spider.merge.S;

import java.util.Queue;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class a implements com.github.catvod.spider.merge.R.b {
    String a;
    com.github.catvod.spider.merge.T.c b;
    Queue<c> c;

    public a(com.github.catvod.spider.merge.T.c cVar, Queue<c> queue) {
        this.b = cVar;
        this.a = cVar.getName();
        this.c = queue;
    }

    @Override // com.github.catvod.spider.merge.R.b
    public final void a(String str, Throwable th) {
        c cVar = new c();
        System.currentTimeMillis();
        cVar.a = this.b;
        Thread.currentThread().getName();
        this.c.add(cVar);
    }

    @Override // com.github.catvod.spider.merge.R.b
    public final String getName() {
        return this.a;
    }
}
