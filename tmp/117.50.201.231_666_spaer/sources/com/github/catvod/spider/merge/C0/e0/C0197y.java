package com.github.catvod.spider.merge.C0.e0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.e0.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0197y extends AbstractC0195w {
    public C0197y(int i) {
        super(i);
    }

    @Override // com.github.catvod.spider.merge.C0.e0.N
    public final boolean a(com.github.catvod.spider.merge.C0.c0.l lVar, com.github.catvod.spider.merge.C0.c0.l lVar2) {
        return lVar != lVar2 && lVar2.U() < this.a;
    }

    public final String toString() {
        return String.format(":lt(%d)", Integer.valueOf(this.a));
    }
}
