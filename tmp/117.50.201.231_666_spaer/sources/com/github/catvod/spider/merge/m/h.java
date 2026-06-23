package com.github.catvod.spider.merge.M;

import java.util.LinkedList;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class h implements com.github.catvod.spider.merge.L.a {
    @Override // com.github.catvod.spider.merge.L.a
    public final com.github.catvod.spider.merge.L.f a(com.github.catvod.spider.merge.I.c cVar) {
        LinkedList linkedList = new LinkedList();
        for (com.github.catvod.spider.merge.G.i iVar : cVar) {
            if (iVar.f0() != null) {
                linkedList.add(iVar.f0());
            }
        }
        com.github.catvod.spider.merge.I.c cVar2 = new com.github.catvod.spider.merge.I.c();
        cVar2.addAll(linkedList);
        return new com.github.catvod.spider.merge.L.f(cVar2);
    }

    @Override // com.github.catvod.spider.merge.L.a
    public final String name() {
        return "following-sibling-one";
    }
}
