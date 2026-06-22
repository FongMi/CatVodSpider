package com.github.catvod.spider.merge.e1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.e1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1037h extends N {
    public final /* synthetic */ int a;

    public /* synthetic */ C1037h(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.e1.N
    public final boolean a(com.github.catvod.spider.merge.c1.m mVar, com.github.catvod.spider.merge.c1.m mVar2) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                com.github.catvod.spider.merge.c1.m mVarH0 = mVar2.h0();
                if (mVarH0 == null || (mVarH0 instanceof com.github.catvod.spider.merge.c1.h) || mVar2.W() != 0) {
                }
                break;
            default:
                if (mVar instanceof com.github.catvod.spider.merge.c1.h) {
                    mVar = mVar.R();
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
                return "*";
            case 1:
                return ":first-child";
            default:
                return ":root";
        }
    }
}
