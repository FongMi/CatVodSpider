package com.github.catvod.spider.merge.e1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class D extends N {
    @Override // com.github.catvod.spider.merge.e1.N
    public final boolean a(com.github.catvod.spider.merge.c1.m mVar, com.github.catvod.spider.merge.c1.m mVar2) {
        com.github.catvod.spider.merge.c1.m mVarH0 = mVar2.h0();
        return (mVarH0 == null || (mVarH0 instanceof com.github.catvod.spider.merge.c1.h) || mVar2.W() != mVarH0.T().size() - 1) ? false : true;
    }

    public final String toString() {
        return ":last-child";
    }
}
