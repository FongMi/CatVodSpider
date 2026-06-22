package com.github.catvod.spider.merge.e1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.e1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1042m extends AbstractC1039j {
    public C1042m(String str, String str2) {
        super(str, str2, true);
    }

    @Override // com.github.catvod.spider.merge.e1.N
    public final boolean a(com.github.catvod.spider.merge.c1.m mVar, com.github.catvod.spider.merge.c1.m mVar2) {
        return mVar2.n(this.a) && com.github.catvod.spider.merge.g.b.b(mVar2.c(this.a)).contains(this.b);
    }

    public final String toString() {
        return String.format("[%s*=%s]", this.a, this.b);
    }
}
