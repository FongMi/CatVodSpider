package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.M.G;
import com.github.catvod.spider.merge.N.C0074g;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class p extends m {
    private final C0074g j;

    public p(G g, c cVar) {
        super(g, null, cVar);
        this.j = new C0074g();
    }

    @Override // com.github.catvod.spider.merge.L.s
    protected final void C(s sVar) {
        super.C(sVar);
        this.j.remove(sVar);
    }

    public final p y0(m mVar) {
        this.j.add(mVar);
        return this;
    }

    @Override // com.github.catvod.spider.merge.L.m, com.github.catvod.spider.merge.L.s
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public final p i() {
        return (p) super.i();
    }
}
