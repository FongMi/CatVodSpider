package com.github.catvod.spider.merge.Em;

import com.github.catvod.spider.merge.Fs.F;
import com.github.catvod.spider.merge.ej.C1061g;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class o extends l {
    private final C1061g l;

    public o(F f, c cVar) {
        super(f, null, cVar);
        this.l = new C1061g();
    }

    @Override // com.github.catvod.spider.merge.Em.r
    protected final void D(r rVar) {
        super.D(rVar);
        this.l.remove(rVar);
    }

    public final o r0(l lVar) {
        this.l.add(lVar);
        return this;
    }

    @Override // com.github.catvod.spider.merge.Em.l, com.github.catvod.spider.merge.Em.r
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public final o j() {
        return (o) super.j();
    }
}
