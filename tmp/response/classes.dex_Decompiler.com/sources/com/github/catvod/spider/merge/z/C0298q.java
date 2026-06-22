package com.github.catvod.spider.merge.z;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0298q extends t0 {
    public final int b;

    public C0298q(AbstractC0294m abstractC0294m, int i) {
        super(abstractC0294m);
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.z.t0
    public final int a() {
        return 5;
    }

    @Override // com.github.catvod.spider.merge.z.t0
    public final com.github.catvod.spider.merge.B.k c() {
        int i = this.b;
        com.github.catvod.spider.merge.B.k kVar = new com.github.catvod.spider.merge.B.k(new int[0]);
        kVar.a(i);
        return kVar;
    }

    @Override // com.github.catvod.spider.merge.z.t0
    public final boolean d(int i, int i2) {
        return this.b == i;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
