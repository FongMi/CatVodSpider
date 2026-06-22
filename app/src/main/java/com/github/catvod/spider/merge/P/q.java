package com.github.catvod.spider.merge.P;

import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class q extends com.github.catvod.spider.merge.z.r {
    public q(int i, com.github.catvod.spider.merge.z.r rVar) {
        super(i, rVar);
    }

    @Override // com.github.catvod.spider.merge.z.r, com.github.catvod.spider.merge.D.b
    public final Object a(com.github.catvod.spider.merge.Q.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.Q.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        List listF = f(e.class);
        if (listF.size() <= 1) {
            return (com.github.catvod.spider.merge.Q.b) cVar.c((com.github.catvod.spider.merge.D.b) listF.get(0));
        }
        Boolean boolA = ((com.github.catvod.spider.merge.Q.b) cVar.c((com.github.catvod.spider.merge.D.b) listF.get(0))).a();
        for (int i = 1; i < listF.size(); i++) {
            boolA = Boolean.valueOf(boolA.booleanValue() | ((com.github.catvod.spider.merge.Q.b) cVar.c((com.github.catvod.spider.merge.D.b) listF.get(i))).a().booleanValue());
        }
        return new com.github.catvod.spider.merge.Q.b(boolA);
    }
}
