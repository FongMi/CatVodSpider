package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.m.C0595d;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class k implements com.github.catvod.spider.merge.L.a {
    @Override // com.github.catvod.spider.merge.L.a
    public final com.github.catvod.spider.merge.L.f a(com.github.catvod.spider.merge.I.c cVar) {
        com.github.catvod.spider.merge.I.c cVar2 = new com.github.catvod.spider.merge.I.c();
        LinkedList linkedList = new LinkedList();
        for (com.github.catvod.spider.merge.G.i iVar : cVar) {
            Iterator<com.github.catvod.spider.merge.G.i> it = iVar.k0().iterator();
            while (it.hasNext()) {
                com.github.catvod.spider.merge.I.c cVarC = C0595d.c(it.next());
                if (cVarC != null) {
                    linkedList.addAll(cVarC);
                }
            }
            com.github.catvod.spider.merge.I.c cVarC2 = C0595d.c(iVar);
            if (cVarC2 != null) {
                linkedList.addAll(cVarC2);
            }
        }
        cVar2.addAll(linkedList);
        return new com.github.catvod.spider.merge.L.f(cVar2);
    }

    @Override // com.github.catvod.spider.merge.L.a
    public final String name() {
        return "preceding";
    }
}
