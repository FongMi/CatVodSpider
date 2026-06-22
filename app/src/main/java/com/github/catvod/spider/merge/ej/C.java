package com.github.catvod.spider.merge.ej;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C extends N {
    public final /* synthetic */ int a;

    public /* synthetic */ C(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.ej.N
    public final boolean a(com.github.catvod.spider.merge.Em.l lVar, com.github.catvod.spider.merge.Em.l lVar2) {
        switch (this.a) {
            case 0:
                com.github.catvod.spider.merge.Em.l lVarF0 = lVar2.f0();
                if (lVarF0 == null || (lVarF0 instanceof com.github.catvod.spider.merge.Em.h) || lVar2.U() != lVarF0.R().size() - 1) {
                }
                break;
            default:
                if (lVar instanceof com.github.catvod.spider.merge.Em.h) {
                    lVar = lVar.P();
                }
                if (lVar2 == lVar) {
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
