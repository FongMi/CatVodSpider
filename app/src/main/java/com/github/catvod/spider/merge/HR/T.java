package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class T extends a0 {
    final C0719b b;

    public T(N n) {
        this.a = n;
        this.b = new C0719b(n);
    }

    @Override // com.github.catvod.spider.merge.HR.N
    public final boolean a(com.github.catvod.spider.merge.UY.m mVar, com.github.catvod.spider.merge.UY.m mVar2) {
        for (int i = 0; i < mVar2.g(); i++) {
            com.github.catvod.spider.merge.UY.s sVarF = mVar2.f(i);
            if ((sVarF instanceof com.github.catvod.spider.merge.UY.m) && this.b.a(mVar2, (com.github.catvod.spider.merge.UY.m) sVarF) != null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format(ZrJ.d("432B2A3E60600A6A"), this.a);
    }
}
