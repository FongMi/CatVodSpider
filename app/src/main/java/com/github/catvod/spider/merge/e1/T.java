package com.github.catvod.spider.merge.e1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class T extends Z {
    public T(N n) {
        this.a = n;
    }

    @Override // com.github.catvod.spider.merge.e1.N
    public final boolean a(com.github.catvod.spider.merge.c1.m mVar, com.github.catvod.spider.merge.c1.m mVar2) {
        com.github.catvod.spider.merge.c1.m mVarH0;
        return (mVar == mVar2 || (mVarH0 = mVar2.h0()) == null || !this.a.a(mVar, mVarH0)) ? false : true;
    }

    public final String toString() {
        return String.format("%s > ", this.a);
    }
}
