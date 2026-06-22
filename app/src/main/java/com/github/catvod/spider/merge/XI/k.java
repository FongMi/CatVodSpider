package com.github.catvod.spider.merge.XI;

import java.util.Queue;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class k implements i {
    String a;
    com.github.catvod.spider.merge.VB.c b;
    Queue<m> c;

    public k(com.github.catvod.spider.merge.VB.c cVar, Queue<m> queue) {
        this.b = cVar;
        this.a = cVar.getName();
        this.c = queue;
    }

    @Override // com.github.catvod.spider.merge.XI.i
    public final void a(String str, Throwable th) {
        m mVar = new m();
        System.currentTimeMillis();
        mVar.a = this.b;
        Thread.currentThread().getName();
        this.c.add(mVar);
    }

    @Override // com.github.catvod.spider.merge.XI.i
    public final String getName() {
        return this.a;
    }
}
