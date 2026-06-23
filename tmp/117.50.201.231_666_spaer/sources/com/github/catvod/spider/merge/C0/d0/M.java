package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class M extends N {
    M() {
        this.a = 2;
    }

    @Override // com.github.catvod.spider.merge.C0.d0.N, com.github.catvod.spider.merge.C0.d0.O
    final /* bridge */ /* synthetic */ O g() {
        g();
        return this;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.github.catvod.spider.merge.C0.Z.a */
    public final String toString() throws com.github.catvod.spider.merge.C0.Z.a {
        StringBuilder sbB;
        String strX;
        if (!r() || this.j.size() <= 0) {
            sbB = com.github.catvod.spider.merge.C0.d.d.b("<");
            strX = x();
        } else {
            sbB = com.github.catvod.spider.merge.C0.d.d.b("<");
            sbB.append(x());
            sbB.append(" ");
            strX = this.j.toString();
        }
        return com.github.catvod.spider.merge.C0.b.n.b(sbB, strX, ">");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.C0.d0.N
    /* JADX INFO: renamed from: v */
    public final N g() {
        super.g();
        this.j = null;
        return this;
    }
}
