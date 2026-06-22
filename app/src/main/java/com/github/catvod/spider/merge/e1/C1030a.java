package com.github.catvod.spider.merge.e1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.e1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1030a implements O {
    private final com.github.catvod.spider.merge.c1.m a;
    private final C1036g b;
    private final N c;

    C1030a(com.github.catvod.spider.merge.c1.m mVar, C1036g c1036g, N n) {
        this.a = mVar;
        this.b = c1036g;
        this.c = n;
    }

    @Override // com.github.catvod.spider.merge.e1.O
    public final void a(com.github.catvod.spider.merge.c1.s sVar, int i) {
    }

    @Override // com.github.catvod.spider.merge.e1.O
    public final void b(com.github.catvod.spider.merge.c1.s sVar, int i) {
        if (sVar instanceof com.github.catvod.spider.merge.c1.m) {
            com.github.catvod.spider.merge.c1.m mVar = (com.github.catvod.spider.merge.c1.m) sVar;
            if (this.c.a(this.a, mVar)) {
                this.b.add(mVar);
            }
        }
    }
}
