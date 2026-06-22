package com.github.catvod.spider.merge.yZ;

import com.github.catvod.spider.merge.ZrJ;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.yZ.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1446k extends l {
    private final byte[] c;

    C1446k(int i, int i2, byte[] bArr) {
        super(i2);
        this.c = bArr;
    }

    @Override // com.github.catvod.spider.merge.yZ.s
    public final int g(int i) {
        byte b;
        int iSignum = Integer.signum(1);
        if (iSignum == -1) {
            int i2 = this.b + 1;
            if (i2 < 0) {
                return -1;
            }
            b = this.c[i2];
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
            b = this.c[i3];
        }
        return b & 255;
    }

    @Override // com.github.catvod.spider.merge.yZ.InterfaceC1439d
    public final String h(com.github.catvod.spider.merge.Bk.j jVar) {
        int iMin = Math.min(jVar.a, this.a);
        return new String(this.c, iMin, Math.min((jVar.b - jVar.a) + 1, this.a - iMin), StandardCharsets.ISO_8859_1);
    }
}
