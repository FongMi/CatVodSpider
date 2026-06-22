package com.github.catvod.spider.merge.A;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class C0010k extends l0 {
    public final int b;
    public final int c;

    public C0010k(AbstractC0008i abstractC0008i, int i, int i2) {
        super(abstractC0008i);
        this.b = i;
        this.c = i2;
    }

    @Override // com.github.catvod.spider.merge.A.l0
    public final int a() {
        return 6;
    }

    @Override // com.github.catvod.spider.merge.A.l0
    public final boolean d(int i, int i2) {
        return false;
    }

    public final String toString() {
        return "action_" + this.b + ":" + this.c;
    }
}
