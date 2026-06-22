package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class E extends N {
    public final /* synthetic */ int a;

    public /* synthetic */ E(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.HR.N
    public final boolean a(com.github.catvod.spider.merge.UY.m mVar, com.github.catvod.spider.merge.UY.m mVar2) {
        switch (this.a) {
            case 0:
                com.github.catvod.spider.merge.UY.m mVarK0 = mVar2.k0();
                if (mVarK0 == null || (mVarK0 instanceof com.github.catvod.spider.merge.UY.h) || mVar2.Y() != mVarK0.V().size() - 1) {
                }
                break;
            default:
                if (mVar instanceof com.github.catvod.spider.merge.UY.h) {
                    mVar = mVar.T();
                }
                if (mVar2 == mVar) {
                }
                break;
        }
        return true;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return ZrJ.d("432F2A3E3C681A2B22212C");
            default:
                return ZrJ.d("433124223C");
        }
    }
}
