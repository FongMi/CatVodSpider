package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class aaa extends pk {
    public final int a;
    public final int f;
    public final boolean h;

    public aaa(lq lqVar, int i, int i2, boolean z) {
        super(lqVar);
        this.a = i;
        this.f = i2;
        this.h = z;
    }

    @Override // com.github.catvod.spider.merge.A0.nw
    public final int b() {
        return 4;
    }

    @Override // com.github.catvod.spider.merge.A0.nw
    public final boolean d(int i, int i2) {
        return false;
    }

    @Override // com.github.catvod.spider.merge.A0.nw
    public final boolean e() {
        return true;
    }

    public final String toString() {
        return "pred_" + this.a + ":" + this.f;
    }
}
