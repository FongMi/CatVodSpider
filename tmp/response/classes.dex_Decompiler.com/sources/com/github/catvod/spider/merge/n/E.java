package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class E extends N {
    public final /* synthetic */ int a;

    public /* synthetic */ E(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.N.N
    public final boolean a(com.github.catvod.spider.merge.L.m mVar, com.github.catvod.spider.merge.L.m mVar2) {
        switch (this.a) {
            case 0:
                com.github.catvod.spider.merge.L.m mVarK0 = mVar2.k0();
                if (mVarK0 == null || (mVarK0 instanceof com.github.catvod.spider.merge.L.h) || mVar2.Y() != mVarK0.V().size() - 1) {
                }
                break;
            default:
                if (mVar instanceof com.github.catvod.spider.merge.L.h) {
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
                return oZP.d("4F031632187816071E2D08");
            default:
                return oZP.d("4F1D182E18");
        }
    }
}
