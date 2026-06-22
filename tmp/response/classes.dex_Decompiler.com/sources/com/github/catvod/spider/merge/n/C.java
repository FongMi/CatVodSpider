package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C extends N {
    public final /* synthetic */ int a;

    public /* synthetic */ C(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.N.N
    public final boolean a(com.github.catvod.spider.merge.L.m mVar, com.github.catvod.spider.merge.L.m mVar2) {
        switch (this.a) {
            case 0:
                com.github.catvod.spider.merge.L.m mVarK0 = mVar2.k0();
                if (mVarK0 == null || (mVarK0 instanceof com.github.catvod.spider.merge.L.h) || mVar2.Y() != 0) {
                }
                break;
            default:
                com.github.catvod.spider.merge.L.m mVarK02 = mVar2.k0();
                if (mVarK02 == null || (mVarK02 instanceof com.github.catvod.spider.merge.L.h) || !mVar2.r0().isEmpty()) {
                }
                break;
        }
        return false;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return oZP.d("4F091E331F21580C1F280031");
            default:
                return oZP.d("4F00192D157816071E2D08");
        }
    }
}
