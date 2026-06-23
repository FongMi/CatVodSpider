package com.github.catvod.spider.merge.FM.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.M.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0285s extends N {
    public final /* synthetic */ int a;
    private final String b;

    public C0285s(String str, int i) {
        this.a = i;
        if (i == 1) {
            this.b = str;
            return;
        }
        StringBuilder sbB = com.github.catvod.spider.merge.FM.J.b.b();
        com.github.catvod.spider.merge.FM.J.b.a(sbB, str, false);
        this.b = com.github.catvod.spider.merge.FM.A.l.d(com.github.catvod.spider.merge.FM.J.b.h(sbB));
    }

    @Override // com.github.catvod.spider.merge.FM.M.N
    public final boolean a(com.github.catvod.spider.merge.FM.K.m mVar, com.github.catvod.spider.merge.FM.K.m mVar2) {
        switch (this.a) {
            case 0:
                return com.github.catvod.spider.merge.FM.A.l.d(mVar2.v0()).contains(this.b);
            default:
                return mVar2.i0().equals(this.b);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return String.format(":contains(%s)", this.b);
            default:
                return String.format("%s", this.b);
        }
    }
}
