package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class N extends O {
    N() {
        this.a = 2;
    }

    @Override // com.github.catvod.spider.merge.M.O, com.github.catvod.spider.merge.M.Q
    final /* bridge */ /* synthetic */ Q h() {
        h();
        return this;
    }

    public final String toString() {
        StringBuilder sbC;
        String strA;
        boolean zU = u();
        String strD = oZP.d("4B");
        String strD2 = oZP.d("49");
        if (!zU || this.n.size() <= 0) {
            sbC = C0133t.c(strD2);
            strA = A();
        } else {
            sbC = C0133t.c(strD2);
            sbC.append(A());
            sbC.append(oZP.d("55"));
            strA = this.n.toString();
        }
        return C0133t.a(sbC, strA, strD);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.M.O
    /* JADX INFO: renamed from: y */
    public final O h() {
        super.h();
        this.n = null;
        return this;
    }
}
