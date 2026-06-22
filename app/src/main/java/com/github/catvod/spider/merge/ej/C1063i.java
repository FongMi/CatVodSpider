package com.github.catvod.spider.merge.ej;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ej.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1063i extends N {
    public final /* synthetic */ int a;
    private final String b;

    public /* synthetic */ C1063i(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // com.github.catvod.spider.merge.ej.N
    public final boolean a(com.github.catvod.spider.merge.Em.l lVar, com.github.catvod.spider.merge.Em.l lVar2) {
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
