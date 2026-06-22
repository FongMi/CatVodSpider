package com.github.catvod.spider.merge.P;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class b extends com.github.catvod.spider.merge.z.r {
    public b(int i, com.github.catvod.spider.merge.z.r rVar) {
        super(i, rVar);
    }

    @Override // com.github.catvod.spider.merge.z.r, com.github.catvod.spider.merge.D.b
    public final Object a(com.github.catvod.spider.merge.Q.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.Q.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        if (!"..".equals(getText())) {
            return new com.github.catvod.spider.merge.Q.b(cVar.a().a);
        }
        HashSet hashSet = new HashSet();
        com.github.catvod.spider.merge.N.e eVar = new com.github.catvod.spider.merge.N.e();
        Iterator<E> it = cVar.a().a.iterator();
        while (it.hasNext()) {
            hashSet.add((com.github.catvod.spider.merge.L.l) ((com.github.catvod.spider.merge.L.l) it.next()).a);
        }
        eVar.addAll(hashSet);
        return new com.github.catvod.spider.merge.Q.b(eVar);
    }
}
