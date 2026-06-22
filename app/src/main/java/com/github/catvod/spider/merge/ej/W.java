package com.github.catvod.spider.merge.ej;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class W extends Z {
    public W(N n) {
        this.a = n;
    }

    @Override // com.github.catvod.spider.merge.ej.N
    public final boolean a(com.github.catvod.spider.merge.Em.l lVar, com.github.catvod.spider.merge.Em.l lVar2) {
        if (lVar == lVar2) {
            return false;
        }
        do {
            lVar2 = lVar2.f0();
            if (lVar2 == null) {
                break;
            }
            if (this.a.a(lVar, lVar2)) {
                return true;
            }
        } while (lVar2 != lVar);
        return false;
    }

    public final String toString() {
        return String.format("%s ", this.a);
    }
}
