package com.github.catvod.spider.merge.FM.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.M.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class C0268a implements O {
    private final com.github.catvod.spider.merge.FM.K.m a;
    private final C0274g b;
    private final N c;

    C0268a(com.github.catvod.spider.merge.FM.K.m mVar, C0274g c0274g, N n) {
        this.a = mVar;
        this.b = c0274g;
        this.c = n;
    }

    @Override // com.github.catvod.spider.merge.FM.M.O
    public final void a(com.github.catvod.spider.merge.FM.K.s sVar, int i) {
    }

    @Override // com.github.catvod.spider.merge.FM.M.O
    public final void b(com.github.catvod.spider.merge.FM.K.s sVar, int i) {
        if (sVar instanceof com.github.catvod.spider.merge.FM.K.m) {
            com.github.catvod.spider.merge.FM.K.m mVar = (com.github.catvod.spider.merge.FM.K.m) sVar;
            if (this.c.a(this.a, mVar)) {
                this.b.add(mVar);
            }
        }
    }
}
