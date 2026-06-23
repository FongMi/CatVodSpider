package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.m.C0595d;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class g implements com.github.catvod.spider.merge.L.a {
    @Override // com.github.catvod.spider.merge.L.a
    public final com.github.catvod.spider.merge.L.f a(com.github.catvod.spider.merge.I.c cVar) {
        LinkedList linkedList = new LinkedList();
        for (com.github.catvod.spider.merge.G.i iVar : cVar) {
            Iterator<com.github.catvod.spider.merge.G.i> it = iVar.k0().iterator();
            while (it.hasNext()) {
                com.github.catvod.spider.merge.I.c cVarA = C0595d.a(it.next());
                if (cVarA != null) {
                    Iterator<com.github.catvod.spider.merge.G.i> it2 = cVarA.iterator();
                    while (it2.hasNext()) {
                        linkedList.addAll(it2.next().Z());
                    }
                }
            }
            com.github.catvod.spider.merge.I.c cVarA2 = C0595d.a(iVar);
            if (cVarA2 != null) {
                Iterator<com.github.catvod.spider.merge.G.i> it3 = cVarA2.iterator();
                while (it3.hasNext()) {
                    linkedList.addAll(it3.next().Z());
                }
            }
        }
        return new com.github.catvod.spider.merge.L.f(new com.github.catvod.spider.merge.I.c(linkedList));
    }

    @Override // com.github.catvod.spider.merge.L.a
    public final String name() {
        return "following";
    }
}
