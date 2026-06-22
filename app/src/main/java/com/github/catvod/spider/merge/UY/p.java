package com.github.catvod.spider.merge.UY;

import com.github.catvod.spider.merge.HR.C0724g;
import com.github.catvod.spider.merge.Mp.G;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class p extends m {
    private final C0724g j;

    public p(G g, c cVar) {
        super(g, null, cVar);
        this.j = new C0724g();
    }

    @Override // com.github.catvod.spider.merge.UY.s
    protected final void C(s sVar) {
        super.C(sVar);
        this.j.remove(sVar);
    }

    public final p y0(m mVar) {
        this.j.add(mVar);
        return this;
    }

    @Override // com.github.catvod.spider.merge.UY.m, com.github.catvod.spider.merge.UY.s
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public final p i() {
        return (p) super.i();
    }
}
