package com.github.catvod.spider.merge.FM.K;

import com.github.catvod.spider.merge.FM.L.G;
import com.github.catvod.spider.merge.FM.M.C0274g;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class p extends m {
    private final C0274g j;

    public p(G g, c cVar) {
        super(g, null, cVar);
        this.j = new C0274g();
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    protected final void C(s sVar) {
        super.C(sVar);
        this.j.remove(sVar);
    }

    public final p y0(m mVar) {
        this.j.add(mVar);
        return this;
    }

    @Override // com.github.catvod.spider.merge.FM.K.m, com.github.catvod.spider.merge.FM.K.s
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public final p i() {
        return (p) super.i();
    }
}
