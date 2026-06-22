package com.github.catvod.spider.merge.P;

import java.util.Stack;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class c extends com.github.catvod.spider.merge.z.r {
    public com.github.catvod.spider.merge.z.f e;

    public c(int i, com.github.catvod.spider.merge.z.r rVar) {
        super(i, rVar);
    }

    @Override // com.github.catvod.spider.merge.z.r, com.github.catvod.spider.merge.D.b
    public final Object a(com.github.catvod.spider.merge.Q.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.Q.c)) {
            return cVar.d(this);
        }
        Stack stack = cVar.a;
        com.github.catvod.spider.merge.Q.a aVar = new com.github.catvod.spider.merge.Q.a(cVar.b.a);
        aVar.c = cVar.a();
        stack.push(aVar);
        String strA = this.e.a();
        if (strA == "//" || (strA != null && strA.equals("//"))) {
            cVar.a().b = true;
        }
        com.github.catvod.spider.merge.Q.b bVar = (com.github.catvod.spider.merge.Q.b) ((w) e(w.class)).a(cVar);
        stack.pop();
        return bVar;
    }
}
