package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.oZP;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class i extends q {
    public i(String str, String str2, String str3) {
        String strD;
        com.github.catvod.spider.merge.J.c.g(str);
        com.github.catvod.spider.merge.J.c.g(str2);
        com.github.catvod.spider.merge.J.c.g(str3);
        super.H(oZP.d("1B0E1A24"), str);
        String strD2 = oZP.d("051A152D05363C0B");
        super.H(strD2, str2);
        String strD3 = oZP.d("0616043509383C0B");
        super.H(strD3, str3);
        if (K(strD2)) {
            strD = oZP.d("253A350D2516");
        } else if (!K(strD3)) {
            return;
        } else {
            strD = oZP.d("263624152918");
        }
        super.H(oZP.d("051A151215263E0A0E"), strD);
    }

    private boolean K(String str) {
        return !com.github.catvod.spider.merge.K.b.d(super.c(str));
    }

    public final void L(String str) {
        if (str != null) {
            super.H(oZP.d("051A151215263E0A0E"), str);
        }
    }

    @Override // com.github.catvod.spider.merge.L.q, com.github.catvod.spider.merge.L.s
    public final /* bridge */ /* synthetic */ int g() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.L.q, com.github.catvod.spider.merge.L.s
    public final s l() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.L.s
    public final String s() {
        return oZP.d("560B1822182C050A");
    }

    @Override // com.github.catvod.spider.merge.L.s
    final void v(Appendable appendable, int i, g gVar) throws IOException {
        if (this.b > 0 && gVar.i()) {
            appendable.append('\n');
        }
        int iK = gVar.k();
        String strD = oZP.d("0616043509383C0B");
        String strD2 = oZP.d("051A152D05363C0B");
        appendable.append((iK != 1 || K(strD2) || K(strD)) ? oZP.d("494E330E2F012C3F32") : oZP.d("494E132E0F210C1F12"));
        String strD3 = oZP.d("1B0E1A24");
        boolean zK = K(strD3);
        String strD4 = oZP.d("55");
        if (zK) {
            appendable.append(strD4).append(super.c(strD3));
        }
        String strD5 = oZP.d("051A151215263E0A0E");
        if (K(strD5)) {
            appendable.append(strD4).append(super.c(strD5));
        }
        boolean zK2 = K(strD2);
        String strD6 = oZP.d("554D");
        if (zK2) {
            appendable.append(strD6).append(super.c(strD2)).append('\"');
        }
        if (K(strD)) {
            appendable.append(strD6).append(super.c(strD)).append('\"');
        }
        appendable.append('>');
    }

    @Override // com.github.catvod.spider.merge.L.s
    final void w(Appendable appendable, int i, g gVar) {
    }
}
