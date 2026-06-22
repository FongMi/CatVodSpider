package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class T extends a0 {
    final C0069b b;

    public T(N n) {
        this.a = n;
        this.b = new C0069b(n);
    }

    @Override // com.github.catvod.spider.merge.N.N
    public final boolean a(com.github.catvod.spider.merge.L.m mVar, com.github.catvod.spider.merge.L.m mVar2) {
        for (int i = 0; i < mVar2.g(); i++) {
            com.github.catvod.spider.merge.L.s sVarF = mVar2.f(i);
            if ((sVarF instanceof com.github.catvod.spider.merge.L.m) && this.b.a(mVar2, (com.github.catvod.spider.merge.L.m) sVarF) != null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format(oZP.d("4F07163244700646"), this.a);
    }
}
