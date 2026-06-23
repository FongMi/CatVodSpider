package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum cz extends wa {
    public cz() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        int iAk = sfVar.ak();
        String strU = sfVar.u(true);
        if (strU.length() > 0) {
            hmVar.m.w(strU, iAk, sfVar.ak());
        } else {
            hmVar.m.u = true;
        }
        int iAk2 = sfVar.ak();
        char cT = sfVar.t();
        if (cT == 0) {
            hmVar.aj(this);
            hmVar.m.v((char) 65533, iAk2, sfVar.ak());
            return;
        }
        if (cT == 65535) {
            hmVar.ai(this);
            hmVar.al(wa.c);
            return;
        }
        if (cT != '&') {
            if (cT != '\'') {
                hmVar.m.v(cT, iAk2, sfVar.ak());
                return;
            } else {
                hmVar.al(wa.aq);
                return;
            }
        }
        int[] iArrY = hmVar.y('\'', true);
        if (iArrY != null) {
            hmVar.m.x(iArrY, iAk2, sfVar.ak());
        } else {
            hmVar.m.v('&', iAk2, sfVar.ak());
        }
    }
}
