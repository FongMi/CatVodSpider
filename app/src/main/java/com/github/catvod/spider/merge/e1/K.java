package com.github.catvod.spider.merge.e1;

import com.github.catvod.spider.merge.d1.C0972E;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class K extends N {
    @Override // com.github.catvod.spider.merge.e1.N
    public final boolean a(com.github.catvod.spider.merge.c1.m mVar, com.github.catvod.spider.merge.c1.m mVar2) {
        if (mVar2 instanceof com.github.catvod.spider.merge.c1.u) {
            return true;
        }
        for (com.github.catvod.spider.merge.c1.v vVar : mVar2.t0()) {
            com.github.catvod.spider.merge.c1.u uVar = new com.github.catvod.spider.merge.c1.u(com.github.catvod.spider.merge.d1.G.m(mVar2.r0(), C0972E.d), mVar2.e(), mVar2.d());
            vVar.D(uVar);
            uVar.K(vVar);
        }
        return false;
    }

    public final String toString() {
        return ":matchText";
    }
}
