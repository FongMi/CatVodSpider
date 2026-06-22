package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.A.T;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class p extends com.github.catvod.spider.merge.z.r {
    public p(int i, com.github.catvod.spider.merge.z.r rVar) {
        super(i, rVar);
    }

    @Override // com.github.catvod.spider.merge.z.r, com.github.catvod.spider.merge.D.b
    public final Object a(com.github.catvod.spider.merge.Q.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.Q.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        if (((o) e(o.class)) != null) {
            return (com.github.catvod.spider.merge.Q.b) ((o) e(o.class)).a(cVar);
        }
        if (g(5) == null) {
            return null;
        }
        String text = g(5).getText();
        T.j(com.github.catvod.spider.merge.V.a.b.get(text));
        throw new com.github.catvod.spider.merge.I.a(T.f("not support nodeTest: ", text));
    }
}
