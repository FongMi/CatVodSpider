package com.github.catvod.spider.merge.C0.e0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.e0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0190q extends AbstractC0183j {
    public C0190q(String str, String str2) {
        super(str, str2, false);
    }

    @Override // com.github.catvod.spider.merge.C0.e0.N
    public final boolean a(com.github.catvod.spider.merge.C0.c0.l lVar, com.github.catvod.spider.merge.C0.c0.l lVar2) {
        return lVar2.o(this.a) && com.github.catvod.spider.merge.C0.x.a.c(lVar2.c(this.a)).startsWith(this.b);
    }

    public final String toString() {
        return String.format("[%s^=%s]", this.a, this.b);
    }
}
