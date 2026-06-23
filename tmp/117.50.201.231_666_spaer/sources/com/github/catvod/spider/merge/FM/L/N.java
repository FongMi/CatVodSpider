package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class N extends O {
    N() {
        this.a = 2;
    }

    @Override // com.github.catvod.spider.merge.FM.L.O, com.github.catvod.spider.merge.FM.L.Q
    final /* bridge */ /* synthetic */ Q h() {
        h();
        return this;
    }

    public final String toString() {
        StringBuilder sbB;
        String strA;
        if (!u() || this.n.size() <= 0) {
            sbB = P.b("<");
            strA = A();
        } else {
            sbB = P.b("<");
            sbB.append(A());
            sbB.append(" ");
            strA = this.n.toString();
        }
        return com.github.catvod.spider.merge.FM.b.v.b(sbB, strA, ">");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.FM.L.O
    /* JADX INFO: renamed from: y */
    public final O h() {
        super.h();
        this.n = null;
        return this;
    }
}
