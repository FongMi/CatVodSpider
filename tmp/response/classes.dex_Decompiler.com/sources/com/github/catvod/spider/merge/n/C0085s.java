package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.N.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0085s extends N {
    public final /* synthetic */ int a;
    private final String b;

    public C0085s(String str, int i) {
        this.a = i;
        if (i == 1) {
            this.b = str;
            return;
        }
        StringBuilder sbB = com.github.catvod.spider.merge.K.b.b();
        com.github.catvod.spider.merge.K.b.a(sbB, str, false);
        this.b = com.github.catvod.spider.merge.B.l.c(com.github.catvod.spider.merge.K.b.h(sbB));
    }

    @Override // com.github.catvod.spider.merge.N.N
    public final boolean a(com.github.catvod.spider.merge.L.m mVar, com.github.catvod.spider.merge.L.m mVar2) {
        switch (this.a) {
            case 0:
                return com.github.catvod.spider.merge.B.l.c(mVar2.v0()).contains(this.b);
            default:
                return mVar2.i0().equals(this.b);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return String.format(oZP.d("4F0C182F18341C01046949265C"), this.b);
            default:
                return String.format(oZP.d("501C"), this.b);
        }
    }
}
