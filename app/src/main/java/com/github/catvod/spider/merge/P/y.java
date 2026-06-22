package com.github.catvod.spider.merge.P;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class y extends com.github.catvod.spider.merge.z.r {
    public com.github.catvod.spider.merge.z.f e;

    public y(int i, com.github.catvod.spider.merge.z.r rVar) {
        super(i, rVar);
    }

    @Override // com.github.catvod.spider.merge.z.r, com.github.catvod.spider.merge.D.b
    public final Object a(com.github.catvod.spider.merge.Q.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.Q.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        com.github.catvod.spider.merge.Q.b bVar = (com.github.catvod.spider.merge.Q.b) ((z) e(z.class)).a(cVar);
        return this.e == null ? bVar : new com.github.catvod.spider.merge.Q.b(Double.valueOf(-bVar.c().doubleValue()));
    }
}
