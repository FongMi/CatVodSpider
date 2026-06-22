package com.github.catvod.spider.merge.P;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class o extends com.github.catvod.spider.merge.z.r {
    public o(int i, com.github.catvod.spider.merge.z.r rVar) {
        super(i, rVar);
    }

    @Override // com.github.catvod.spider.merge.z.r, com.github.catvod.spider.merge.D.b
    public final Object a(com.github.catvod.spider.merge.Q.c cVar) {
        Object objA;
        if (!(cVar instanceof com.github.catvod.spider.merge.Q.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        if ("*".equals(getText())) {
            com.github.catvod.spider.merge.Q.b bVar = new com.github.catvod.spider.merge.Q.b("*");
            bVar.g();
            return bVar;
        }
        if (((u) e(u.class)) != null && !((u) e(u.class)).h()) {
            objA = ((u) e(u.class)).a(cVar);
        } else {
            if (((n) e(n.class)) == null || ((n) e(n.class)).h()) {
                return null;
            }
            objA = ((n) e(n.class)).a(cVar);
        }
        return (com.github.catvod.spider.merge.Q.b) objA;
    }
}
