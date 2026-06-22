package com.github.catvod.spider.merge.e1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.e1.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1054z extends AbstractC1053y {
    public C1054z(int i) {
        super(i);
    }

    @Override // com.github.catvod.spider.merge.e1.N
    public final boolean a(com.github.catvod.spider.merge.c1.m mVar, com.github.catvod.spider.merge.c1.m mVar2) {
        return mVar2.W() > this.a;
    }

    public final String toString() {
        return String.format(":gt(%d)", Integer.valueOf(this.a));
    }
}
