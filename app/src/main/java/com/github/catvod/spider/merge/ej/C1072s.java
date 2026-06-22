package com.github.catvod.spider.merge.ej;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ej.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1072s extends N {
    private final String a;

    public C1072s(String str) {
        this.a = com.github.catvod.spider.merge.Dw.s.c(str);
    }

    @Override // com.github.catvod.spider.merge.ej.N
    public final boolean a(com.github.catvod.spider.merge.Em.l lVar, com.github.catvod.spider.merge.Em.l lVar2) {
        return com.github.catvod.spider.merge.Dw.s.c(lVar2.p0()).contains(this.a);
    }

    public final String toString() {
        return String.format(":contains(%s)", this.a);
    }
}
