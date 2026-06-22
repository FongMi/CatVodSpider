package com.github.catvod.spider.merge.P;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class r extends com.github.catvod.spider.merge.z.r {
    public com.github.catvod.spider.merge.z.f e;

    public r(int i, com.github.catvod.spider.merge.z.r rVar) {
        super(i, rVar);
    }

    @Override // com.github.catvod.spider.merge.z.r, com.github.catvod.spider.merge.D.b
    public final Object a(com.github.catvod.spider.merge.Q.c cVar) {
        Object objA;
        if (!(cVar instanceof com.github.catvod.spider.merge.Q.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        if (((l) e(l.class)) != null && !((l) e(l.class)).h()) {
            return (com.github.catvod.spider.merge.Q.b) ((l) e(l.class)).a(cVar);
        }
        com.github.catvod.spider.merge.z.f fVar = this.e;
        if (fVar == null) {
            objA = ((i) e(i.class)).a(cVar);
        } else {
            if ("//".equals(fVar.a())) {
                cVar.a().b = true;
            }
            objA = ((w) e(w.class)).a(cVar);
        }
        return (com.github.catvod.spider.merge.Q.b) objA;
    }
}
