package com.github.catvod.spider.merge.FM.M;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class V extends a0 {
    public V(N n) {
        this.a = n;
    }

    @Override // com.github.catvod.spider.merge.FM.M.N
    public final boolean a(com.github.catvod.spider.merge.FM.K.m mVar, com.github.catvod.spider.merge.FM.K.m mVar2) {
        com.github.catvod.spider.merge.FM.K.m mVarN0;
        return (mVar == mVar2 || (mVarN0 = mVar2.n0()) == null || !this.a.a(mVar, mVarN0)) ? false : true;
    }

    public final String toString() {
        return String.format("%s + ", this.a);
    }
}
