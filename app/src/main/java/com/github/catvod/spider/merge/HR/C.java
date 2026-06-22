package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C extends N {
    public final /* synthetic */ int a;

    public /* synthetic */ C(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.HR.N
    public final boolean a(com.github.catvod.spider.merge.UY.m mVar, com.github.catvod.spider.merge.UY.m mVar2) {
        switch (this.a) {
            case 0:
                com.github.catvod.spider.merge.UY.m mVarK0 = mVar2.k0();
                if (mVarK0 == null || (mVarK0 instanceof com.github.catvod.spider.merge.UY.h) || mVar2.Y() != 0) {
                }
                break;
            default:
                com.github.catvod.spider.merge.UY.m mVarK02 = mVar2.k0();
                if (mVarK02 == null || (mVarK02 instanceof com.github.catvod.spider.merge.UY.h) || !mVar2.r0().isEmpty()) {
                }
                break;
        }
        return false;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return ZrJ.d("4325223F3B31542023242421");
            default:
                return ZrJ.d("432C252131681A2B22212C");
        }
    }
}
