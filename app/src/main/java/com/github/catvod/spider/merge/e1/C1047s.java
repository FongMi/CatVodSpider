package com.github.catvod.spider.merge.e1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.e1.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1047s extends N {
    private final String a;

    public C1047s(String str) {
        this.a = com.github.catvod.spider.merge.g.b.b(str);
    }

    @Override // com.github.catvod.spider.merge.e1.N
    public final boolean a(com.github.catvod.spider.merge.c1.m mVar, com.github.catvod.spider.merge.c1.m mVar2) {
        return com.github.catvod.spider.merge.g.b.b(mVar2.V()).contains(this.a);
    }

    public final String toString() {
        return String.format(":containsData(%s)", this.a);
    }
}
