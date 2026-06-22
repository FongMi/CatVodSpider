package com.github.catvod.spider.merge.ej;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ej.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1055a implements O {
    private final com.github.catvod.spider.merge.Em.l a;
    private final C1061g b;
    private final N c;

    C1055a(com.github.catvod.spider.merge.Em.l lVar, C1061g c1061g, N n) {
        this.a = lVar;
        this.b = c1061g;
        this.c = n;
    }

    @Override // com.github.catvod.spider.merge.ej.O
    public final void a(com.github.catvod.spider.merge.Em.r rVar, int i) {
        if (rVar instanceof com.github.catvod.spider.merge.Em.l) {
            com.github.catvod.spider.merge.Em.l lVar = (com.github.catvod.spider.merge.Em.l) rVar;
            if (this.c.a(this.a, lVar)) {
                this.b.add(lVar);
            }
        }
    }

    @Override // com.github.catvod.spider.merge.ej.O
    public final void b(com.github.catvod.spider.merge.Em.r rVar, int i) {
    }
}
