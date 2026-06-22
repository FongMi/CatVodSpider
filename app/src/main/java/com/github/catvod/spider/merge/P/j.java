package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.A.T;
import java.util.LinkedList;
import java.util.Stack;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class j extends com.github.catvod.spider.merge.z.r {
    public j(int i, com.github.catvod.spider.merge.z.r rVar) {
        super(i, rVar);
    }

    @Override // com.github.catvod.spider.merge.z.r, com.github.catvod.spider.merge.D.b
    public final Object a(com.github.catvod.spider.merge.Q.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.Q.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        LinkedList linkedList = new LinkedList();
        com.github.catvod.spider.merge.Q.b bVar = (com.github.catvod.spider.merge.Q.b) ((k) e(k.class)).a(cVar);
        for (h hVar : f(h.class)) {
            Stack stack = cVar.a;
            com.github.catvod.spider.merge.Q.a aVarA = cVar.a();
            com.github.catvod.spider.merge.Q.a aVar = new com.github.catvod.spider.merge.Q.a(aVarA.a);
            aVar.c = aVarA;
            stack.push(aVar);
            linkedList.add(hVar.a(cVar));
            stack.pop();
        }
        String strE = bVar.e();
        T.j(com.github.catvod.spider.merge.V.a.c.get(strE));
        throw new com.github.catvod.spider.merge.I.a(T.f("not support function: ", strE));
    }
}
