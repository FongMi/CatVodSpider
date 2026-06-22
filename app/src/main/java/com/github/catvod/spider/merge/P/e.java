package com.github.catvod.spider.merge.P;

import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class e extends com.github.catvod.spider.merge.z.r {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(com.github.catvod.spider.merge.z.r rVar, int i, int i2) {
        super(i, rVar);
        this.e = i2;
    }

    @Override // com.github.catvod.spider.merge.z.r, com.github.catvod.spider.merge.D.b
    public final Object a(com.github.catvod.spider.merge.Q.c cVar) {
        switch (this.e) {
            case 0:
                if (cVar instanceof com.github.catvod.spider.merge.Q.c) {
                    cVar.getClass();
                    List listF = f(g.class);
                    if (listF.size() > 1) {
                        Boolean boolA = ((com.github.catvod.spider.merge.Q.b) cVar.c((com.github.catvod.spider.merge.D.b) listF.get(0))).a();
                        for (int i = 1; i < listF.size(); i++) {
                            boolA = Boolean.valueOf(boolA.booleanValue() & ((com.github.catvod.spider.merge.Q.b) cVar.c((com.github.catvod.spider.merge.D.b) listF.get(i))).a().booleanValue());
                        }
                    }
                }
                break;
            default:
                if (cVar instanceof com.github.catvod.spider.merge.Q.c) {
                }
                break;
        }
        return cVar.d(this);
    }
}
