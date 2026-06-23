package com.github.catvod.spider.merge.FM.M;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C extends N {
    public final /* synthetic */ int a;

    public /* synthetic */ C(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.FM.M.N
    public final boolean a(com.github.catvod.spider.merge.FM.K.m mVar, com.github.catvod.spider.merge.FM.K.m mVar2) {
        switch (this.a) {
            case 0:
                com.github.catvod.spider.merge.FM.K.m mVarK0 = mVar2.k0();
                if (mVarK0 == null || (mVarK0 instanceof com.github.catvod.spider.merge.FM.K.h) || mVar2.Y() != 0) {
                }
                break;
            default:
                com.github.catvod.spider.merge.FM.K.m mVarK02 = mVar2.k0();
                if (mVarK02 == null || (mVarK02 instanceof com.github.catvod.spider.merge.FM.K.h) || !mVar2.r0().isEmpty()) {
                }
                break;
        }
        return false;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return ":first-child";
            default:
                return ":only-child";
        }
    }
}
