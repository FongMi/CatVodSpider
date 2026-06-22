package com.github.catvod.spider.merge.P;

import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class d extends com.github.catvod.spider.merge.z.r {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.github.catvod.spider.merge.z.r rVar, int i, int i2) {
        super(i, rVar);
        this.e = i2;
    }

    @Override // com.github.catvod.spider.merge.z.r, com.github.catvod.spider.merge.D.b
    public final Object a(com.github.catvod.spider.merge.Q.c cVar) {
        switch (this.e) {
            case 0:
                if (!(cVar instanceof com.github.catvod.spider.merge.Q.c)) {
                    return cVar.d(this);
                }
                cVar.getClass();
                List listF = f(m.class);
                int size = listF.size();
                com.github.catvod.spider.merge.D.b bVar = (com.github.catvod.spider.merge.D.b) listF.get(0);
                if (size == 1) {
                    return (com.github.catvod.spider.merge.Q.b) cVar.c(bVar);
                }
                Double dC = ((com.github.catvod.spider.merge.Q.b) cVar.c(bVar)).c();
                String text = null;
                for (int i = 1; i < d(); i++) {
                    com.github.catvod.spider.merge.D.b bVarC = c(i);
                    if (bVarC instanceof m) {
                        com.github.catvod.spider.merge.Q.b bVar2 = (com.github.catvod.spider.merge.Q.b) cVar.c(bVarC);
                        if ("+".equals(text)) {
                            dC = Double.valueOf(bVar2.c().doubleValue() + dC.doubleValue());
                        } else {
                            if (!"-".equals(text)) {
                                throw new com.github.catvod.spider.merge.I.a("syntax error, " + getText());
                            }
                            dC = Double.valueOf(dC.doubleValue() - bVar2.c().doubleValue());
                        }
                    } else {
                        text = bVarC.getText();
                    }
                }
                return new com.github.catvod.spider.merge.Q.b(dC);
            default:
                if (!(cVar instanceof com.github.catvod.spider.merge.Q.c)) {
                    return cVar.d(this);
                }
                cVar.getClass();
                return (com.github.catvod.spider.merge.Q.b) ((h) e(h.class)).a(cVar);
        }
    }
}
