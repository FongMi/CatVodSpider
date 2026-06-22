package com.github.catvod.spider.merge.ej;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class T extends Z {
    public T(N n) {
        this.a = n;
    }

    @Override // com.github.catvod.spider.merge.ej.N
    public final boolean a(com.github.catvod.spider.merge.Em.l lVar, com.github.catvod.spider.merge.Em.l lVar2) {
        com.github.catvod.spider.merge.Em.l lVarF0;
        return (lVar == lVar2 || (lVarF0 = lVar2.f0()) == null || !this.a.a(lVar, lVarF0)) ? false : true;
    }

    public final String toString() {
        return String.format("%s > ", this.a);
    }
}
