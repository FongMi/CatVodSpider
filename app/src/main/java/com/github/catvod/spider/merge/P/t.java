package com.github.catvod.spider.merge.P;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class t extends com.github.catvod.spider.merge.z.r {
    public t(int i, com.github.catvod.spider.merge.z.r rVar) {
        super(i, rVar);
    }

    @Override // com.github.catvod.spider.merge.z.r, com.github.catvod.spider.merge.D.b
    public final Object a(com.github.catvod.spider.merge.Q.c cVar) {
        com.github.catvod.spider.merge.Q.b bVar;
        Object objA;
        if (!(cVar instanceof com.github.catvod.spider.merge.Q.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        if (((h) e(h.class)) != null && !((h) e(h.class)).h()) {
            objA = ((h) e(h.class)).a(cVar);
        } else {
            if (((j) e(j.class)) == null || ((j) e(j.class)).h()) {
                if (g(39) != null) {
                    bVar = new com.github.catvod.spider.merge.Q.b(g(39).getText());
                    bVar.g();
                } else {
                    if (g(6) == null) {
                        throw new com.github.catvod.spider.merge.I.a("not support variableReference:" + getText());
                    }
                    String text = g(6).getText();
                    bVar = new com.github.catvod.spider.merge.Q.b(text == null ? null : Double.valueOf(text));
                }
                return bVar;
            }
            objA = ((j) e(j.class)).a(cVar);
        }
        return (com.github.catvod.spider.merge.Q.b) objA;
    }
}
