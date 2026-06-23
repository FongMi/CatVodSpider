package com.github.catvod.spider.merge.FM.M;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class E extends N {
    public final /* synthetic */ int a;

    public /* synthetic */ E(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.FM.M.N
    public final boolean a(com.github.catvod.spider.merge.FM.K.m mVar, com.github.catvod.spider.merge.FM.K.m mVar2) {
        switch (this.a) {
            case 0:
                com.github.catvod.spider.merge.FM.K.m mVarK0 = mVar2.k0();
                if (mVarK0 == null || (mVarK0 instanceof com.github.catvod.spider.merge.FM.K.h) || mVar2.Y() != mVarK0.V().size() - 1) {
                }
                break;
            default:
                if (mVar instanceof com.github.catvod.spider.merge.FM.K.h) {
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
                return ":last-child";
            default:
                return ":root";
        }
    }
}
