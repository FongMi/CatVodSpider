package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class M extends N {
    M() {
        this.a = 2;
    }

    @Override // com.github.catvod.spider.merge.Fs.N, com.github.catvod.spider.merge.Fs.O
    final /* bridge */ /* synthetic */ O g() {
        g();
        return this;
    }

    public final String toString() {
        StringBuilder sbB;
        String strX;
        if (!r() || this.j.size() <= 0) {
            sbB = com.github.catvod.spider.merge.ka.d.b("<");
            strX = x();
        } else {
            sbB = com.github.catvod.spider.merge.ka.d.b("<");
            sbB.append(x());
            sbB.append(" ");
            strX = this.j.toString();
        }
        return com.github.catvod.spider.merge.dp.n.b(sbB, strX, ">");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.Fs.N
    /* JADX INFO: renamed from: v */
    public final N g() {
        super.g();
        this.j = null;
        return this;
    }
}
