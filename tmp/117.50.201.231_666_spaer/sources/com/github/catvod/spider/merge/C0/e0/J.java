package com.github.catvod.spider.merge.C0.e0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class J extends N {
    @Override // com.github.catvod.spider.merge.C0.e0.N
    public final boolean a(com.github.catvod.spider.merge.C0.c0.l lVar, com.github.catvod.spider.merge.C0.c0.l lVar2) {
        if (lVar2 instanceof com.github.catvod.spider.merge.C0.c0.t) {
            return true;
        }
        for (com.github.catvod.spider.merge.C0.c0.u uVar : lVar2.q0()) {
            com.github.catvod.spider.merge.C0.c0.t tVar = new com.github.catvod.spider.merge.C0.c0.t(com.github.catvod.spider.merge.C0.d0.F.l(lVar2.n0(), com.github.catvod.spider.merge.C0.d0.D.d), lVar2.e(), lVar2.d());
            uVar.E(tVar);
            tVar.L(uVar);
        }
        return false;
    }

    public final String toString() {
        return ":matchText";
    }
}
