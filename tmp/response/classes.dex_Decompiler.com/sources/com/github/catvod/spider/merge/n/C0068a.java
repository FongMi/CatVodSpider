package com.github.catvod.spider.merge.N;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.N.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class C0068a implements O {
    private final com.github.catvod.spider.merge.L.m a;
    private final C0074g b;
    private final N c;

    C0068a(com.github.catvod.spider.merge.L.m mVar, C0074g c0074g, N n) {
        this.a = mVar;
        this.b = c0074g;
        this.c = n;
    }

    @Override // com.github.catvod.spider.merge.N.O
    public final void a(com.github.catvod.spider.merge.L.s sVar, int i) {
        if (sVar instanceof com.github.catvod.spider.merge.L.m) {
            com.github.catvod.spider.merge.L.m mVar = (com.github.catvod.spider.merge.L.m) sVar;
            if (this.c.a(this.a, mVar)) {
                this.b.add(mVar);
            }
        }
    }

    @Override // com.github.catvod.spider.merge.N.O
    public final void b(com.github.catvod.spider.merge.L.s sVar, int i) {
    }
}
