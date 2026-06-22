package com.github.catvod.spider.merge.ej;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ej.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1070p extends AbstractC1064j {
    public C1070p(String str, String str2) {
        super(str, str2, true);
    }

    @Override // com.github.catvod.spider.merge.ej.N
    public final boolean a(com.github.catvod.spider.merge.Em.l lVar, com.github.catvod.spider.merge.Em.l lVar2) {
        return !this.b.equalsIgnoreCase(lVar2.c(this.a));
    }

    public final String toString() {
        return String.format("[%s!=%s]", this.a, this.b);
    }
}
