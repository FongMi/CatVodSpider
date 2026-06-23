package com.github.catvod.spider.merge.FM.M;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class Y extends a0 {
    public Y(N n) {
        this.a = n;
    }

    @Override // com.github.catvod.spider.merge.FM.M.N
    public final boolean a(com.github.catvod.spider.merge.FM.K.m mVar, com.github.catvod.spider.merge.FM.K.m mVar2) {
        if (mVar == mVar2) {
            return false;
        }
        do {
            mVar2 = mVar2.n0();
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
