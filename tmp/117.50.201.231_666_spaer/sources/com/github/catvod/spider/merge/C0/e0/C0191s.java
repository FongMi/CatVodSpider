package com.github.catvod.spider.merge.C0.e0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.e0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0191s extends N {
    private final String a;

    public C0191s(String str) {
        this.a = com.github.catvod.spider.merge.C0.x.a.c(str);
    }

    @Override // com.github.catvod.spider.merge.C0.e0.N
    public final boolean a(com.github.catvod.spider.merge.C0.c0.l lVar, com.github.catvod.spider.merge.C0.c0.l lVar2) {
        return com.github.catvod.spider.merge.C0.x.a.c(lVar2.p0()).contains(this.a);
    }

    public final String toString() {
        return String.format(":contains(%s)", this.a);
    }
}
