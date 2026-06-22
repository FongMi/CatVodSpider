package com.github.catvod.spider.merge.N;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class s extends u {
    public final a b;

    public s(o oVar) {
        this.a = oVar;
        this.b = new a(oVar);
    }

    @Override // com.github.catvod.spider.merge.N.o
    public final boolean a(com.github.catvod.spider.merge.L.l lVar, com.github.catvod.spider.merge.L.l lVar2) {
        for (int i = 0; i < lVar2.f.size(); i++) {
            com.github.catvod.spider.merge.L.q qVar = (com.github.catvod.spider.merge.L.q) lVar2.j().get(i);
            if ((qVar instanceof com.github.catvod.spider.merge.L.l) && this.b.d(lVar2, (com.github.catvod.spider.merge.L.l) qVar) != null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format(":has(%s)", this.a);
    }
}
