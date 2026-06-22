package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class X extends a0 {
    public X(N n) {
        this.a = n;
    }

    @Override // com.github.catvod.spider.merge.N.N
    public final boolean a(com.github.catvod.spider.merge.L.m mVar, com.github.catvod.spider.merge.L.m mVar2) {
        if (mVar == mVar2) {
            return false;
        }
        do {
            mVar2 = mVar2.k0();
            if (mVar2 == null) {
                break;
            }
            if (this.a.a(mVar, mVar2)) {
                return true;
            }
        } while (mVar2 != mVar);
        return false;
    }

    public final String toString() {
        return String.format(oZP.d("501C57"), this.a);
    }
}
