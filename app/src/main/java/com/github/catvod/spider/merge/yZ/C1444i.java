package com.github.catvod.spider.merge.yZ;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.yZ.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1444i extends l {
    private final char[] c;

    C1444i(int i, int i2, char[] cArr) {
        super(i2);
        this.c = cArr;
    }

    @Override // com.github.catvod.spider.merge.yZ.s
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
                throw new UnsupportedOperationException(ZrJ.d("372C3F6D3A20182023282C"));
            }
            int i3 = (this.b + 1) - 1;
            if (i3 >= this.a) {
                return -1;
            }
            c = this.c[i3];
        }
        return c & 65535;
    }

    @Override // com.github.catvod.spider.merge.yZ.InterfaceC1439d
    public final String h(com.github.catvod.spider.merge.Bk.j jVar) {
        int iMin = Math.min(jVar.a, this.a);
        return new String(this.c, iMin, Math.min((jVar.b - jVar.a) + 1, this.a - iMin));
    }
}
