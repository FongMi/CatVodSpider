package com.github.catvod.spider.merge.ej;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ej.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1078y extends AbstractC1076w {
    public C1078y(int i) {
        super(i);
    }

    @Override // com.github.catvod.spider.merge.ej.N
    public final boolean a(com.github.catvod.spider.merge.Em.l lVar, com.github.catvod.spider.merge.Em.l lVar2) {
        return lVar != lVar2 && lVar2.U() < this.a;
    }

    public final String toString() {
        return String.format(":lt(%d)", Integer.valueOf(this.a));
    }
}
