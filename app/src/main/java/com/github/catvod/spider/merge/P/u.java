package com.github.catvod.spider.merge.P;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class u extends com.github.catvod.spider.merge.z.r {
    public u(int i, com.github.catvod.spider.merge.z.r rVar) {
        super(i, rVar);
    }

    @Override // com.github.catvod.spider.merge.z.r, com.github.catvod.spider.merge.D.b
    public final Object a(com.github.catvod.spider.merge.Q.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.Q.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        List listF = f(n.class);
        if (listF == null) {
            return null;
        }
        if (listF.size() <= 1) {
            return (com.github.catvod.spider.merge.Q.b) cVar.c((com.github.catvod.spider.merge.D.b) listF.get(0));
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.Q.b bVar = (com.github.catvod.spider.merge.Q.b) cVar.c((n) it.next());
            if (bVar != null) {
                linkedList.add(bVar.e());
            }
        }
        return new com.github.catvod.spider.merge.Q.b(com.github.catvod.spider.merge.E.c.c(linkedList, ":"));
    }
}
