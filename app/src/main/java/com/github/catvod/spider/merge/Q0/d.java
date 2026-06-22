package com.github.catvod.spider.merge.q0;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class d extends AbstractC1379a<d, com.github.catvod.spider.merge.v0.d> {
    private final com.github.catvod.spider.merge.v0.c b;

    public d(com.github.catvod.spider.merge.v0.d dVar) {
        if (!(dVar instanceof com.github.catvod.spider.merge.v0.b)) {
            throw new IllegalArgumentException("Search result must have a continuation");
        }
        this.b = ((com.github.catvod.spider.merge.v0.b) dVar).b();
    }

    public final com.github.catvod.spider.merge.v0.c c() {
        return this.b;
    }
}
