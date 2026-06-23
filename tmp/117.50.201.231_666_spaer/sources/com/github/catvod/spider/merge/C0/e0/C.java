package com.github.catvod.spider.merge.C0.e0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C extends N {
    public final int a;

    public /* synthetic */ C(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.C0.e0.N
    public final boolean a(com.github.catvod.spider.merge.C0.c0.l lVar, com.github.catvod.spider.merge.C0.c0.l lVar2) {
        switch (this.a) {
            case 0:
                com.github.catvod.spider.merge.C0.c0.l lVarF0 = lVar2.f0();
                if (lVarF0 == null || (lVarF0 instanceof com.github.catvod.spider.merge.C0.c0.h) || lVar2.U() != lVarF0.R().size() - 1) {
                }
                break;
            default:
                if (lVar instanceof com.github.catvod.spider.merge.C0.c0.h) {
                    lVar = lVar.P();
                }
                if (lVar2 != lVar) {
                    break;
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
