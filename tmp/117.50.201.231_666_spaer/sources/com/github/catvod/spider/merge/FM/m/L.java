package com.github.catvod.spider.merge.FM.M;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class L extends N {
    @Override // com.github.catvod.spider.merge.FM.M.N
    public final boolean a(com.github.catvod.spider.merge.FM.K.m mVar, com.github.catvod.spider.merge.FM.K.m mVar2) {
        if (mVar2 instanceof com.github.catvod.spider.merge.FM.K.u) {
            return true;
        }
        for (com.github.catvod.spider.merge.FM.K.v vVar : mVar2.w0()) {
            com.github.catvod.spider.merge.FM.K.u uVar = new com.github.catvod.spider.merge.FM.K.u(com.github.catvod.spider.merge.FM.L.G.m(mVar2.t0(), com.github.catvod.spider.merge.FM.L.E.d), mVar2.e(), mVar2.d());
            vVar.D(uVar);
            uVar.L(vVar);
        }
        return false;
    }

    public final String toString() {
        return ":matchText";
    }
}
