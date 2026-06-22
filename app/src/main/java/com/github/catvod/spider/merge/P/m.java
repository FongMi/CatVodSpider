package com.github.catvod.spider.merge.P;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class m extends com.github.catvod.spider.merge.z.r {
    public com.github.catvod.spider.merge.z.f e;

    public m(int i, com.github.catvod.spider.merge.z.r rVar) {
        super(i, rVar);
    }

    @Override // com.github.catvod.spider.merge.z.r, com.github.catvod.spider.merge.D.b
    public final Object a(com.github.catvod.spider.merge.Q.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.Q.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        if (((m) e(m.class)) == null || ((m) e(m.class)).h()) {
            return (com.github.catvod.spider.merge.Q.b) ((y) e(y.class)).a(cVar);
        }
        com.github.catvod.spider.merge.Q.b bVar = (com.github.catvod.spider.merge.Q.b) ((y) e(y.class)).a(cVar);
        com.github.catvod.spider.merge.Q.b bVar2 = (com.github.catvod.spider.merge.Q.b) ((m) e(m.class)).a(cVar);
        switch (this.e.a) {
            case 17:
                return new com.github.catvod.spider.merge.Q.b(Double.valueOf(bVar2.c().doubleValue() * bVar.c().doubleValue()));
            case 18:
                return new com.github.catvod.spider.merge.Q.b(Double.valueOf(bVar.c().doubleValue() / bVar2.c().doubleValue()));
            case 19:
                return new com.github.catvod.spider.merge.Q.b(Double.valueOf(bVar.c().doubleValue() % bVar2.c().doubleValue()));
            default:
                throw new com.github.catvod.spider.merge.I.a("syntax error, " + getText());
        }
    }
}
