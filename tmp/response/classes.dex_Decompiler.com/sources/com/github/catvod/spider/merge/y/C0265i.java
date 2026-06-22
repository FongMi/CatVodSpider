package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class C0265i extends AbstractC0268l {
    private final char[] c;

    C0265i(int i, int i2, char[] cArr) {
        super(i2);
        this.c = cArr;
    }

    @Override // com.github.catvod.spider.merge.y.s
    public final int g(int i) {
        char c;
        int iSignum = Integer.signum(1);
        if (iSignum == -1) {
            int i2 = this.b + 1;
            if (i2 < 0) {
                return -1;
            }
            c = this.c[i2];
        } else {
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
            c = this.c[i3];
        }
        return c & 65535;
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC0260d
    public final String h(com.github.catvod.spider.merge.B.j jVar) {
        int iMin = Math.min(jVar.a, this.a);
        return new String(this.c, iMin, Math.min((jVar.b - jVar.a) + 1, this.a - iMin));
    }
}
