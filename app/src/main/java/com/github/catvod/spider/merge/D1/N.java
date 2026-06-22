package com.github.catvod.spider.merge.d1;

import com.github.catvod.spider.merge.l.C1290c;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class N extends O {
    N() {
        this.a = 2;
    }

    @Override // com.github.catvod.spider.merge.d1.O, com.github.catvod.spider.merge.d1.P
    final /* bridge */ /* synthetic */ P h() {
        h();
        return this;
    }

    public final String toString() {
        StringBuilder sbB;
        String strA;
        if (!u() || this.n.size() <= 0) {
            sbB = com.github.catvod.spider.merge.I.t0.b("<");
            strA = A();
        } else {
            sbB = com.github.catvod.spider.merge.I.t0.b("<");
            sbB.append(A());
            sbB.append(" ");
            strA = this.n.toString();
        }
        return C1290c.b(sbB, strA, ">");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d1.O
    /* JADX INFO: renamed from: y */
    public final O h() {
        super.h();
        this.n = null;
        return this;
    }
}
