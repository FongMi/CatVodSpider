package com.github.catvod.spider.merge.G;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class k extends i {
    private final com.github.catvod.spider.merge.I.c j;

    public k(com.github.catvod.spider.merge.H.h hVar, b bVar) {
        super(hVar, null, bVar);
        this.j = new com.github.catvod.spider.merge.I.c();
    }

    @Override // com.github.catvod.spider.merge.G.m
    protected final void D(m mVar) {
        super.D(mVar);
        this.j.remove(mVar);
    }

    public final k w0(i iVar) {
        this.j.add(iVar);
        return this;
    }

    @Override // com.github.catvod.spider.merge.G.i, com.github.catvod.spider.merge.G.m
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public final k clone() {
        return (k) super.clone();
    }
}
