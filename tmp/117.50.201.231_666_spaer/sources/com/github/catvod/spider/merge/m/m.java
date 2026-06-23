package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.m.C0595d;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class m implements com.github.catvod.spider.merge.L.a {
    @Override // com.github.catvod.spider.merge.L.a
    public final com.github.catvod.spider.merge.L.f a(com.github.catvod.spider.merge.I.c cVar) {
        LinkedList linkedList = new LinkedList();
        Iterator<com.github.catvod.spider.merge.G.i> it = cVar.iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.I.c cVarC = C0595d.c(it.next());
            if (cVarC != null) {
                linkedList.addAll(cVarC);
            }
        }
        com.github.catvod.spider.merge.I.c cVar2 = new com.github.catvod.spider.merge.I.c();
        cVar2.addAll(linkedList);
        return new com.github.catvod.spider.merge.L.f(cVar2);
    }

    @Override // com.github.catvod.spider.merge.L.a
    public final String name() {
        return "preceding-sibling";
    }
}
