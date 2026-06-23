package com.github.catvod.spider.merge.FM.y;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.y.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0473o extends t0 {
    public final int b;
    public final int c;

    public C0473o(AbstractC0471m abstractC0471m, int i, int i2) {
        super(abstractC0471m);
        this.b = i;
        this.c = i2;
    }

    @Override // com.github.catvod.spider.merge.FM.y.t0
    public final int a() {
        return 6;
    }

    @Override // com.github.catvod.spider.merge.FM.y.t0
    public final boolean d(int i, int i2) {
        return false;
    }

    public final String toString() {
        StringBuilder sbB = com.github.catvod.spider.merge.FM.L.P.b("action_");
        sbB.append(this.b);
        sbB.append(":");
        sbB.append(this.c);
        return sbB.toString();
    }
}
