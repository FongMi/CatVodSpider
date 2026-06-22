package com.github.catvod.spider.merge.ej;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ej.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1066l extends AbstractC1064j {
    public C1066l(String str, String str2) {
        super(str, str2, true);
    }

    @Override // com.github.catvod.spider.merge.ej.N
    public final boolean a(com.github.catvod.spider.merge.Em.l lVar, com.github.catvod.spider.merge.Em.l lVar2) {
        return lVar2.o(this.a) && this.b.equalsIgnoreCase(lVar2.c(this.a).trim());
    }

    public final String toString() {
        return String.format("[%s=%s]", this.a, this.b);
    }
}
