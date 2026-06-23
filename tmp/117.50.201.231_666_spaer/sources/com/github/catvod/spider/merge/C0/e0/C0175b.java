package com.github.catvod.spider.merge.C0.e0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.e0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class C0175b {
    private final com.github.catvod.spider.merge.C0.c0.l a;
    private com.github.catvod.spider.merge.C0.c0.l b = null;
    private final N c;

    C0175b(com.github.catvod.spider.merge.C0.c0.l lVar, N n) {
        this.a = lVar;
        this.c = n;
    }

    public final int b(com.github.catvod.spider.merge.C0.c0.r rVar) {
        if (rVar instanceof com.github.catvod.spider.merge.C0.c0.l) {
            com.github.catvod.spider.merge.C0.c0.l lVar = (com.github.catvod.spider.merge.C0.c0.l) rVar;
            if (this.c.a(this.a, lVar)) {
                this.b = lVar;
                return 5;
            }
        }
        return 1;
    }
}
