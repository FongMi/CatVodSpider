package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.HR.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0736t extends N {
    public final /* synthetic */ int a;
    private final String b;

    public /* synthetic */ C0736t(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // com.github.catvod.spider.merge.HR.N
    public final boolean a(com.github.catvod.spider.merge.UY.m mVar, com.github.catvod.spider.merge.UY.m mVar2) {
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
                return String.format(ZrJ.d("432024233C24102D381A202A1526043A26111C3B3F656D3650"), this.b);
            default:
                return String.format(ZrJ.d("5C30"), this.b);
        }
    }
}
