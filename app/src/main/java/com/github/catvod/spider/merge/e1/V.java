package com.github.catvod.spider.merge.e1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class V extends Z {
    public V(N n) {
        this.a = n;
    }

    @Override // com.github.catvod.spider.merge.e1.N
    public final boolean a(com.github.catvod.spider.merge.c1.m mVar, com.github.catvod.spider.merge.c1.m mVar2) {
        return !this.a.a(mVar, mVar2);
    }

    public final String toString() {
        return String.format(":not(%s)", this.a);
    }
}
