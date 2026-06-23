package com.github.catvod.spider.merge.C0.e0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.e0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0182i extends N {
    public final int a;
    private final String b;

    public /* synthetic */ C0182i(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // com.github.catvod.spider.merge.C0.e0.N
    public final boolean a(com.github.catvod.spider.merge.C0.c0.l lVar, com.github.catvod.spider.merge.C0.c0.l lVar2) {
        switch (this.a) {
            case 0:
                return lVar2.o(this.b);
            case 1:
                return lVar2.W(this.b);
            default:
                return lVar2.d0().endsWith(this.b);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return String.format("[%s]", this.b);
            case 1:
                return String.format(".%s", this.b);
            default:
                return String.format("%s", this.b);
        }
    }
}
