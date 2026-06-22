package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class U extends a0 {
    public U(N n) {
        this.a = n;
    }

    @Override // com.github.catvod.spider.merge.N.N
    public final boolean a(com.github.catvod.spider.merge.L.m mVar, com.github.catvod.spider.merge.L.m mVar2) {
        com.github.catvod.spider.merge.L.m mVarK0;
        return (mVar == mVar2 || (mVarK0 = mVar2.k0()) == null || !this.a.a(mVar, mVarK0)) ? false : true;
    }

    public final String toString() {
        return String.format(oZP.d("501C577F4C"), this.a);
    }
}
