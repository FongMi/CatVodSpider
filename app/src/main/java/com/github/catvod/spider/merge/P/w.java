package com.github.catvod.spider.merge.P;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class w extends com.github.catvod.spider.merge.z.r {
    public w(int i, com.github.catvod.spider.merge.z.r rVar) {
        super(i, rVar);
    }

    @Override // com.github.catvod.spider.merge.z.r, com.github.catvod.spider.merge.D.b
    public final Object a(com.github.catvod.spider.merge.Q.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.Q.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        com.github.catvod.spider.merge.Q.b bVar = null;
        for (int i = 0; i < d(); i++) {
            com.github.catvod.spider.merge.D.b bVarC = c(i);
            if (bVarC instanceof x) {
                bVar = (com.github.catvod.spider.merge.Q.b) cVar.c(bVarC);
                Object obj = bVar.a;
                if (obj instanceof com.github.catvod.spider.merge.N.e) {
                    cVar.b((com.github.catvod.spider.merge.N.e) obj);
                }
            } else if ("//".equals(bVarC.getText())) {
                cVar.a().b = true;
            } else {
                cVar.a().b = false;
            }
        }
        return bVar;
    }
}
