package com.github.catvod.spider.merge.FM.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.M.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0286t extends N {
    public final /* synthetic */ int a;
    private final String b;

    public /* synthetic */ C0286t(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // com.github.catvod.spider.merge.FM.M.N
    public final boolean a(com.github.catvod.spider.merge.FM.K.m mVar, com.github.catvod.spider.merge.FM.K.m mVar2) {
        switch (this.a) {
            case 0:
                return mVar2.x0().contains(this.b);
            default:
                return mVar2.i0().endsWith(this.b);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return String.format(":containsWholeOwnText(%s)", this.b);
            default:
                return String.format("%s", this.b);
        }
    }
}
