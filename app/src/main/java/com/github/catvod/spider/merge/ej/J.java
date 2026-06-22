package com.github.catvod.spider.merge.ej;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class J extends N {
    @Override // com.github.catvod.spider.merge.ej.N
    public final boolean a(com.github.catvod.spider.merge.Em.l lVar, com.github.catvod.spider.merge.Em.l lVar2) {
        if (lVar2 instanceof com.github.catvod.spider.merge.Em.t) {
            return true;
        }
        for (com.github.catvod.spider.merge.Em.u uVar : lVar2.q0()) {
            com.github.catvod.spider.merge.Em.t tVar = new com.github.catvod.spider.merge.Em.t(com.github.catvod.spider.merge.Fs.F.l(lVar2.n0(), com.github.catvod.spider.merge.Fs.D.d), lVar2.e(), lVar2.d());
            uVar.E(tVar);
            tVar.L(uVar);
        }
        return false;
    }

    public final String toString() {
        return ":matchText";
    }
}
