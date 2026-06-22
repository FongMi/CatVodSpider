package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class N extends O {
    N() {
        this.a = 2;
    }

    @Override // com.github.catvod.spider.merge.Mp.O, com.github.catvod.spider.merge.Mp.Q
    final /* bridge */ /* synthetic */ Q h() {
        h();
        return this;
    }

    public final String toString() {
        StringBuilder sbB;
        String strA;
        boolean zU = u();
        String strD = ZrJ.d("47");
        String strD2 = ZrJ.d("45");
        if (!zU || this.n.size() <= 0) {
            sbB = C0925t.b(strD2);
            strA = A();
        } else {
            sbB = C0925t.b(strD2);
            sbB.append(A());
            sbB.append(ZrJ.d("59"));
            strA = this.n.toString();
        }
        return com.github.catvod.spider.merge.bY.v.b(sbB, strA, strD);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.Mp.O
    /* JADX INFO: renamed from: y */
    public final O h() {
        super.h();
        this.n = null;
        return this;
    }
}
