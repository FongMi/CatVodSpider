package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class Y extends a0 {
    public Y(N n) {
        this.a = n;
    }

    @Override // com.github.catvod.spider.merge.HR.N
    public final boolean a(com.github.catvod.spider.merge.UY.m mVar, com.github.catvod.spider.merge.UY.m mVar2) {
        if (mVar == mVar2) {
            return false;
        }
        do {
            mVar2 = mVar2.n0();
            if (mVar2 == null) {
                return false;
            }
        } while (!this.a.a(mVar, mVar2));
        return true;
    }

    public final String toString() {
        return String.format(ZrJ.d("5C306B3368"), this.a);
    }
}
