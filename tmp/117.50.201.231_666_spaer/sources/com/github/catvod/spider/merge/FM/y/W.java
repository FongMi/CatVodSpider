package com.github.catvod.spider.merge.FM.y;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class W extends AbstractC0472n {
    public final int b;
    public final int c;
    public final boolean d;

    public W(AbstractC0471m abstractC0471m, int i, int i2, boolean z) {
        super(abstractC0471m);
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    @Override // com.github.catvod.spider.merge.FM.y.t0
    public final int a() {
        return 4;
    }

    @Override // com.github.catvod.spider.merge.FM.y.t0
    public final boolean b() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.FM.y.t0
    public final boolean d(int i, int i2) {
        return false;
    }

    public final String toString() {
        StringBuilder sbB = com.github.catvod.spider.merge.FM.L.P.b("pred_");
        sbB.append(this.b);
        sbB.append(":");
        sbB.append(this.c);
        return sbB.toString();
    }
}
