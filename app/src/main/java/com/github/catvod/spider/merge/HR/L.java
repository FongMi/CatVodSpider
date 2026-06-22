package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class L extends N {
    @Override // com.github.catvod.spider.merge.HR.N
    public final boolean a(com.github.catvod.spider.merge.UY.m mVar, com.github.catvod.spider.merge.UY.m mVar2) {
        if (mVar2 instanceof com.github.catvod.spider.merge.UY.u) {
            return true;
        }
        for (com.github.catvod.spider.merge.UY.v vVar : mVar2.w0()) {
            com.github.catvod.spider.merge.UY.u uVar = new com.github.catvod.spider.merge.UY.u(com.github.catvod.spider.merge.Mp.G.m(mVar2.t0(), com.github.catvod.spider.merge.Mp.E.d), mVar2.e(), mVar2.d());
            vVar.D(uVar);
            uVar.L(vVar);
        }
        return false;
    }

    public final String toString() {
        return ZrJ.d("432E2A392B2D2D263339");
    }
}
