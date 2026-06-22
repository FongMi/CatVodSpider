package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class V extends a0 {
    public V(N n) {
        this.a = n;
    }

    @Override // com.github.catvod.spider.merge.N.N
    public final boolean a(com.github.catvod.spider.merge.L.m mVar, com.github.catvod.spider.merge.L.m mVar2) {
        com.github.catvod.spider.merge.L.m mVarN0;
        return (mVar == mVar2 || (mVarN0 = mVar2.n0()) == null || !this.a.a(mVar, mVarN0)) ? false : true;
    }

    public final String toString() {
        return String.format(oZP.d("501C576A4C"), this.a);
    }
}
