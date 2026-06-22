package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.M.E;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class o extends l {
    public final com.github.catvod.spider.merge.N.e j;

    public o(E e, c cVar) {
        super(e, null, cVar);
        this.j = new com.github.catvod.spider.merge.N.e();
    }

    @Override // com.github.catvod.spider.merge.L.l
    /* JADX INFO: renamed from: B */
    public final l clone() {
        return (o) super.clone();
    }

    @Override // com.github.catvod.spider.merge.L.l, com.github.catvod.spider.merge.L.q
    /* JADX INFO: renamed from: clone */
    public final Object g() {
        return (o) super.clone();
    }

    @Override // com.github.catvod.spider.merge.L.l, com.github.catvod.spider.merge.L.q
    public final q g() {
        return (o) super.clone();
    }

    @Override // com.github.catvod.spider.merge.L.q
    public final void v(q qVar) {
        super.v(qVar);
        this.j.remove(qVar);
    }
}
