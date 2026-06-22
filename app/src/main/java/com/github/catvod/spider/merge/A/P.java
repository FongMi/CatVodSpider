package com.github.catvod.spider.merge.A;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class P extends AbstractC0009j {
    public final int b;
    public final int c;
    public final boolean d;

    public P(AbstractC0008i abstractC0008i, int i, int i2, boolean z) {
        super(abstractC0008i);
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    @Override // com.github.catvod.spider.merge.A.l0
    public final int a() {
        return 4;
    }

    @Override // com.github.catvod.spider.merge.A.l0
    public final boolean b() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.A.l0
    public final boolean d(int i, int i2) {
        return false;
    }

    public final String toString() {
        return "pred_" + this.b + ":" + this.c;
    }
}
