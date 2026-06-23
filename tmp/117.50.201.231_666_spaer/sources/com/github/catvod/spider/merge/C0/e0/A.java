package com.github.catvod.spider.merge.C0.e0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class A extends N {
    public final int a;

    public /* synthetic */ A(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.C0.e0.N
    public final boolean a(com.github.catvod.spider.merge.C0.c0.l lVar, com.github.catvod.spider.merge.C0.c0.l lVar2) {
        switch (this.a) {
            case 0:
                com.github.catvod.spider.merge.C0.c0.l lVarF0 = lVar2.f0();
                return (lVarF0 == null || (lVarF0 instanceof com.github.catvod.spider.merge.C0.c0.h) || lVar2.U() != 0) ? false : true;
            default:
                com.github.catvod.spider.merge.C0.c0.l lVarF02 = lVar2.f0();
                return (lVarF02 == null || (lVarF02 instanceof com.github.catvod.spider.merge.C0.c0.h) || !lVar2.l0().isEmpty()) ? false : true;
        }
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
