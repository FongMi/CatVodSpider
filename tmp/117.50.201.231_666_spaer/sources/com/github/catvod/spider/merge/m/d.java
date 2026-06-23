package com.github.catvod.spider.merge.M;

import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class d implements com.github.catvod.spider.merge.L.a {
    @Override // com.github.catvod.spider.merge.L.a
    public final com.github.catvod.spider.merge.L.f a(com.github.catvod.spider.merge.I.c cVar) {
        com.github.catvod.spider.merge.I.c cVar2 = new com.github.catvod.spider.merge.I.c();
        Iterator<com.github.catvod.spider.merge.G.i> it = cVar.iterator();
        while (it.hasNext()) {
            cVar2.addAll(it.next().V());
        }
        return new com.github.catvod.spider.merge.L.f(cVar2);
    }

    @Override // com.github.catvod.spider.merge.L.a
    public final String name() {
        return "child";
    }
}
