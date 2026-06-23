package com.github.catvod.spider.merge.C0.c0;

import com.github.catvod.spider.merge.C0.d0.F;
import com.github.catvod.spider.merge.C0.e0.C0180g;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class o extends l {
    private final C0180g l;

    public o(F f, c cVar) {
        super(f, null, cVar);
        this.l = new C0180g();
    }

    @Override // com.github.catvod.spider.merge.C0.c0.r
    protected final void D(r rVar) {
        super.D(rVar);
        this.l.remove(rVar);
    }

    public final o r0(l lVar) {
        this.l.add(lVar);
        return this;
    }

    @Override // com.github.catvod.spider.merge.C0.c0.l, com.github.catvod.spider.merge.C0.c0.r
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public final o j() {
        return (o) super.j();
    }
}
