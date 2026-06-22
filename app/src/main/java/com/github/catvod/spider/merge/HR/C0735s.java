package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.HR.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0735s extends N {
    public final /* synthetic */ int a;
    private final String b;

    public C0735s(String str, int i) {
        this.a = i;
        if (i == 1) {
            this.b = str;
            return;
        }
        StringBuilder sbB = com.github.catvod.spider.merge.XU.n.b();
        com.github.catvod.spider.merge.XU.n.a(sbB, str, false);
        this.b = com.github.catvod.spider.merge.Bk.l.c(com.github.catvod.spider.merge.XU.n.h(sbB));
    }

    @Override // com.github.catvod.spider.merge.HR.N
    public final boolean a(com.github.catvod.spider.merge.UY.m mVar, com.github.catvod.spider.merge.UY.m mVar2) {
        switch (this.a) {
            case 0:
                return com.github.catvod.spider.merge.Bk.l.c(mVar2.v0()).contains(this.b);
            default:
                return mVar2.i0().equals(this.b);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return String.format(ZrJ.d("432024233C24102D38656D3650"), this.b);
            default:
                return String.format(ZrJ.d("5C30"), this.b);
        }
    }
}
