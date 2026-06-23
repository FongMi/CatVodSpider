package com.github.catvod.spider.merge.C0.e0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class T extends Z {
    public T(N n) {
        this.a = n;
    }

    @Override // com.github.catvod.spider.merge.C0.e0.N
    public final boolean a(com.github.catvod.spider.merge.C0.c0.l lVar, com.github.catvod.spider.merge.C0.c0.l lVar2) {
        com.github.catvod.spider.merge.C0.c0.l lVarF0;
        return (lVar == lVar2 || (lVarF0 = lVar2.f0()) == null || !this.a.a(lVar, lVarF0)) ? false : true;
    }

    public final String toString() {
        return String.format("%s > ", this.a);
    }
}
