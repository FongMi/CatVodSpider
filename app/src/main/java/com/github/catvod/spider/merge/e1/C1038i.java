package com.github.catvod.spider.merge.e1;

import com.github.catvod.spider.merge.b1.C0906c;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.e1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1038i extends N {
    public final /* synthetic */ int a;
    private final String b;

    public C1038i(String str, int i) {
        this.a = i;
        if (i != 1) {
            this.b = str;
            return;
        }
        StringBuilder sbB = C0906c.b();
        C0906c.a(sbB, str, false);
        this.b = com.github.catvod.spider.merge.g.b.b(C0906c.h(sbB));
    }

    @Override // com.github.catvod.spider.merge.e1.N
    public final boolean a(com.github.catvod.spider.merge.c1.m mVar, com.github.catvod.spider.merge.c1.m mVar2) {
        switch (this.a) {
            case 0:
                return mVar2.n(this.b);
            default:
                return com.github.catvod.spider.merge.g.b.b(mVar2.g0()).contains(this.b);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return String.format("[%s]", this.b);
            default:
                return String.format(":containsOwn(%s)", this.b);
        }
    }
}
