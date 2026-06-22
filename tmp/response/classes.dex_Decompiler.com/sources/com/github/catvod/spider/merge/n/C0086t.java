package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.N.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0086t extends N {
    public final /* synthetic */ int a;
    private final String b;

    public /* synthetic */ C0086t(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // com.github.catvod.spider.merge.N.N
    public final boolean a(com.github.catvod.spider.merge.L.m mVar, com.github.catvod.spider.merge.L.m mVar2) {
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
                return String.format(oZP.d("4F0C182F18341C010416043A190A383602011017036949265C"), this.b);
            default:
                return String.format(oZP.d("501C"), this.b);
        }
    }
}
