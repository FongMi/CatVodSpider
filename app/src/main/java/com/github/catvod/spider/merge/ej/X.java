package com.github.catvod.spider.merge.ej;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class X extends Z {
    public X(N n) {
        this.a = n;
    }

    @Override // com.github.catvod.spider.merge.ej.N
    public final boolean a(com.github.catvod.spider.merge.Em.l lVar, com.github.catvod.spider.merge.Em.l lVar2) {
        if (lVar == lVar2) {
            return false;
        }
        do {
            lVar2 = lVar2.i0();
            if (lVar2 == null) {
                return false;
            }
        } while (!this.a.a(lVar, lVar2));
        return true;
    }

    public final String toString() {
        return String.format("%s ~ ", this.a);
    }
}
