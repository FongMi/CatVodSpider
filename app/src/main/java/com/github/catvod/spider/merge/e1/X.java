package com.github.catvod.spider.merge.e1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class X extends Z {
    public X(N n) {
        this.a = n;
    }

    @Override // com.github.catvod.spider.merge.e1.N
    public final boolean a(com.github.catvod.spider.merge.c1.m mVar, com.github.catvod.spider.merge.c1.m mVar2) {
        if (mVar == mVar2) {
            return false;
        }
        do {
            mVar2 = mVar2.k0();
            if (mVar2 == null) {
                return false;
            }
        } while (!this.a.a(mVar, mVar2));
        return true;
    }

    public final String toString() {
        return String.format("%s ~ ", this.a);
    }
}
