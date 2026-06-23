package com.github.catvod.spider.merge.C0.e0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.e0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class C0174a implements O {
    private final com.github.catvod.spider.merge.C0.c0.l a;
    private final C0180g b;
    private final N c;

    C0174a(com.github.catvod.spider.merge.C0.c0.l lVar, C0180g c0180g, N n) {
        this.a = lVar;
        this.b = c0180g;
        this.c = n;
    }

    @Override // com.github.catvod.spider.merge.C0.e0.O
    public final void a(com.github.catvod.spider.merge.C0.c0.r rVar, int i) {
        if (rVar instanceof com.github.catvod.spider.merge.C0.c0.l) {
            com.github.catvod.spider.merge.C0.c0.l lVar = (com.github.catvod.spider.merge.C0.c0.l) rVar;
            if (this.c.a(this.a, lVar)) {
                this.b.add(lVar);
            }
        }
    }

    @Override // com.github.catvod.spider.merge.C0.e0.O
    public final void b(com.github.catvod.spider.merge.C0.c0.r rVar, int i) {
    }
}
