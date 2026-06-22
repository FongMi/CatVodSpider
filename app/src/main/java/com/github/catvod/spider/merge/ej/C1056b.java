package com.github.catvod.spider.merge.ej;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ej.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1056b {
    private final com.github.catvod.spider.merge.Em.l a;
    private com.github.catvod.spider.merge.Em.l b = null;
    private final N c;

    C1056b(com.github.catvod.spider.merge.Em.l lVar, N n) {
        this.a = lVar;
        this.c = n;
    }

    public final int b(com.github.catvod.spider.merge.Em.r rVar) {
        if (!(rVar instanceof com.github.catvod.spider.merge.Em.l)) {
            return 1;
        }
        com.github.catvod.spider.merge.Em.l lVar = (com.github.catvod.spider.merge.Em.l) rVar;
        if (!this.c.a(this.a, lVar)) {
            return 1;
        }
        this.b = lVar;
        return 5;
    }
}
