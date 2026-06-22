package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class V extends a0 {
    public V(N n) {
        this.a = n;
    }

    @Override // com.github.catvod.spider.merge.HR.N
    public final boolean a(com.github.catvod.spider.merge.UY.m mVar, com.github.catvod.spider.merge.UY.m mVar2) {
        com.github.catvod.spider.merge.UY.m mVarN0;
        return (mVar == mVar2 || (mVarN0 = mVar2.n0()) == null || !this.a.a(mVar, mVarN0)) ? false : true;
    }

    public final String toString() {
        return String.format(ZrJ.d("5C306B6668"), this.a);
    }
}
