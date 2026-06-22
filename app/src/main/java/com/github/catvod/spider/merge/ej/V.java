package com.github.catvod.spider.merge.ej;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class V extends Z {
    public V(N n) {
        this.a = n;
    }

    @Override // com.github.catvod.spider.merge.ej.N
    public final boolean a(com.github.catvod.spider.merge.Em.l lVar, com.github.catvod.spider.merge.Em.l lVar2) {
        return !this.a.a(lVar, lVar2);
    }

    public final String toString() {
        return String.format(":not(%s)", this.a);
    }
}
