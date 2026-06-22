package com.github.catvod.spider.merge.UY;

import com.github.catvod.spider.merge.ZrJ;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class i extends q {
    public i(String str, String str2, String str3) {
        String strD;
        com.github.catvod.spider.merge.XU.k.g(str);
        com.github.catvod.spider.merge.XU.k.g(str2);
        com.github.catvod.spider.merge.XU.k.g(str3);
        super.H(ZrJ.d("17222628"), str);
        String strD2 = ZrJ.d("0936292121263027");
        super.H(strD2, str2);
        String strD3 = ZrJ.d("0A3A38392D283027");
        super.H(strD3, str3);
        if (K(strD2)) {
            strD = ZrJ.d("291609010106");
        } else if (!K(strD3)) {
            return;
        } else {
            strD = ZrJ.d("2A1A18190D08");
        }
        super.H(ZrJ.d("0936291E3136322632"), strD);
    }

    private boolean K(String str) {
        return !com.github.catvod.spider.merge.XU.n.d(super.c(str));
    }

    public final void L(String str) {
        if (str != null) {
            super.H(ZrJ.d("0936291E3136322632"), str);
        }
    }

    @Override // com.github.catvod.spider.merge.UY.q, com.github.catvod.spider.merge.UY.s
    public final /* bridge */ /* synthetic */ int g() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.UY.q, com.github.catvod.spider.merge.UY.s
    public final s l() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.UY.s
    public final String s() {
        return ZrJ.d("5A27242E3C3C0926");
    }

    @Override // com.github.catvod.spider.merge.UY.s
    final void v(Appendable appendable, int i, g gVar) throws IOException {
        if (this.b > 0 && gVar.i()) {
            appendable.append('\n');
        }
        int iK = gVar.k();
        String strD = ZrJ.d("0A3A38392D283027");
        String strD2 = ZrJ.d("0936292121263027");
        appendable.append((iK != 1 || K(strD2) || K(strD)) ? ZrJ.d("45620F020B1120130E") : ZrJ.d("45622F222B3100332E"));
        String strD3 = ZrJ.d("17222628");
        boolean zK = K(strD3);
        String strD4 = ZrJ.d("59");
        if (zK) {
            appendable.append(strD4).append(super.c(strD3));
        }
        String strD5 = ZrJ.d("0936291E3136322632");
        if (K(strD5)) {
            appendable.append(strD4).append(super.c(strD5));
        }
        boolean zK2 = K(strD2);
        String strD6 = ZrJ.d("5961");
        if (zK2) {
            appendable.append(strD6).append(super.c(strD2)).append('\"');
        }
        if (K(strD)) {
            appendable.append(strD6).append(super.c(strD)).append('\"');
        }
        appendable.append('>');
    }

    @Override // com.github.catvod.spider.merge.UY.s
    final void w(Appendable appendable, int i, g gVar) {
    }
}
