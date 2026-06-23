package com.github.catvod.spider.merge.u;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0644m extends i0 {
    public final int b;

    public C0644m(AbstractC0640i abstractC0640i, int i) {
        super(abstractC0640i);
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.u.i0
    public final int a() {
        return 5;
    }

    @Override // com.github.catvod.spider.merge.u.i0
    public final com.github.catvod.spider.merge.w.i c() {
        int i = this.b;
        com.github.catvod.spider.merge.w.i iVar = new com.github.catvod.spider.merge.w.i(new int[0]);
        iVar.a(i);
        return iVar;
    }

    @Override // com.github.catvod.spider.merge.u.i0
    public final boolean d(int i, int i2) {
        return this.b == i;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
