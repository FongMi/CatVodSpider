package com.github.catvod.spider.merge.C0.e0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.e0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0189p extends AbstractC0183j {
    public C0189p(String str, String str2) {
        super(str, str2, true);
    }

    @Override // com.github.catvod.spider.merge.C0.e0.N
    public final boolean a(com.github.catvod.spider.merge.C0.c0.l lVar, com.github.catvod.spider.merge.C0.c0.l lVar2) {
        return !this.b.equalsIgnoreCase(lVar2.c(this.a));
    }

    public final String toString() {
        return String.format("[%s!=%s]", this.a, this.b);
    }
}
