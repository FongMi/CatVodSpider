package com.github.catvod.spider.merge.M;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class b implements com.github.catvod.spider.merge.L.a {
    @Override // com.github.catvod.spider.merge.L.a
    public final com.github.catvod.spider.merge.L.f a(com.github.catvod.spider.merge.I.c cVar) {
        LinkedList linkedList = new LinkedList();
        Iterator<com.github.catvod.spider.merge.G.i> it = cVar.iterator();
        while (it.hasNext()) {
            linkedList.addAll(it.next().k0());
        }
        return new com.github.catvod.spider.merge.L.f(new com.github.catvod.spider.merge.I.c(linkedList));
    }

    @Override // com.github.catvod.spider.merge.L.a
    public final String name() {
        return "ancestor";
    }
}
