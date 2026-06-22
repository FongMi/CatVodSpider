package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class C0266j extends AbstractC0268l {
    private final int[] c;

    C0266j(int i, int i2, int[] iArr) {
        super(i2);
        this.c = iArr;
    }

    @Override // com.github.catvod.spider.merge.y.s
    public final int g(int i) {
        int iSignum = Integer.signum(1);
        if (iSignum == -1) {
            int i2 = this.b + 1;
            if (i2 < 0) {
                return -1;
            }
            return this.c[i2];
        }
        if (iSignum == 0) {
            return 0;
        }
        if (iSignum != 1) {
            throw new UnsupportedOperationException(oZP.d("3B0003611E30140C1F2408"));
        }
        int i3 = (this.b + 1) - 1;
        if (i3 >= this.a) {
            return -1;
        }
        return this.c[i3];
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC0260d
    public final String h(com.github.catvod.spider.merge.B.j jVar) {
        int iMin = Math.min(jVar.a, this.a);
        return new String(this.c, iMin, Math.min((jVar.b - jVar.a) + 1, this.a - iMin));
    }
}
