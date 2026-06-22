package com.github.catvod.spider.merge.e1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class W extends Z {
    public W(N n) {
        this.a = n;
    }

    @Override // com.github.catvod.spider.merge.e1.N
    public final boolean a(com.github.catvod.spider.merge.c1.m mVar, com.github.catvod.spider.merge.c1.m mVar2) {
        if (mVar == mVar2) {
            return false;
        }
        do {
            mVar2 = mVar2.h0();
            if (mVar2 == null) {
                break;
            }
            if (this.a.a(mVar, mVar2)) {
                return true;
            }
        } while (mVar2 != mVar);
        return false;
    }

    public final String toString() {
        return String.format("%s ", this.a);
    }
}
