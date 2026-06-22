package com.github.catvod.spider.merge.c1;

import com.github.catvod.spider.merge.d1.G;
import com.github.catvod.spider.merge.e1.C1036g;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class p extends m {
    private final C1036g k;

    public p(G g, C0947c c0947c) {
        super(g, null, c0947c);
        this.k = new C1036g();
    }

    @Override // com.github.catvod.spider.merge.c1.s
    protected final void C(s sVar) {
        super.C(sVar);
        this.k.remove(sVar);
    }

    public final p v0(m mVar) {
        this.k.add(mVar);
        return this;
    }

    @Override // com.github.catvod.spider.merge.c1.m, com.github.catvod.spider.merge.c1.s
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public final p i() {
        return (p) super.i();
    }
}
