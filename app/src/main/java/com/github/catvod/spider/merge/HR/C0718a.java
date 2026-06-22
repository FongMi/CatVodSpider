package com.github.catvod.spider.merge.HR;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.HR.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C0718a implements O {
    private final com.github.catvod.spider.merge.UY.m a;
    private final C0724g b;
    private final N c;

    C0718a(com.github.catvod.spider.merge.UY.m mVar, C0724g c0724g, N n) {
        this.a = mVar;
        this.b = c0724g;
        this.c = n;
    }

    @Override // com.github.catvod.spider.merge.HR.O
    public final void a(com.github.catvod.spider.merge.UY.s sVar, int i) {
        if (sVar instanceof com.github.catvod.spider.merge.UY.m) {
            com.github.catvod.spider.merge.UY.m mVar = (com.github.catvod.spider.merge.UY.m) sVar;
            if (this.c.a(this.a, mVar)) {
                this.b.add(mVar);
            }
        }
    }

    @Override // com.github.catvod.spider.merge.HR.O
    public final void b(com.github.catvod.spider.merge.UY.s sVar, int i) {
    }
}
