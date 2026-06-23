package com.github.catvod.spider.merge.C0.e0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class X extends Z {
    public X(N n) {
        this.a = n;
    }

    @Override // com.github.catvod.spider.merge.C0.e0.N
    public final boolean a(com.github.catvod.spider.merge.C0.c0.l lVar, com.github.catvod.spider.merge.C0.c0.l lVar2) {
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
