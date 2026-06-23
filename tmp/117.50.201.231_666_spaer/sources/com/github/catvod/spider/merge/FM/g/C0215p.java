package com.github.catvod.spider.merge.FM.G;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.G.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class C0215p {
    final AbstractC0214o a;
    final int b;

    C0215p(AbstractC0214o abstractC0214o, int i) {
        this.a = abstractC0214o;
        this.b = i;
    }

    public final String toString() {
        StringBuilder sbB = com.github.catvod.spider.merge.FM.L.P.b("StrategyAndWidth [strategy=");
        sbB.append(this.a);
        sbB.append(", width=");
        sbB.append(this.b);
        sbB.append("]");
        return sbB.toString();
    }
}
