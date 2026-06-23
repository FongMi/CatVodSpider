package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum dh extends wa {
    public dh() {
        super("AttributeValue_unquoted", 39);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        int iAk = sfVar.ak();
        String strZ = sfVar.z(wa.bs);
        if (strZ.length() > 0) {
            hmVar.m.w(strZ, iAk, sfVar.ak());
        }
        int iAk2 = sfVar.ak();
        char cT = sfVar.t();
        if (cT == 0) {
            hmVar.aj(this);
            hmVar.m.v((char) 65533, iAk2, sfVar.ak());
            return;
        }
        if (cT != ' ') {
            if (cT != '\"' && cT != '`') {
                cp cpVar = wa.c;
                if (cT == 65535) {
                    hmVar.ai(this);
                    hmVar.al(cpVar);
                    return;
                }
                if (cT != '\t' && cT != '\n' && cT != '\f' && cT != '\r') {
                    if (cT == '&') {
                        int[] iArrY = hmVar.y('>', true);
                        if (iArrY != null) {
                            hmVar.m.x(iArrY, iAk2, sfVar.ak());
                            return;
                        } else {
                            hmVar.m.v('&', iAk2, sfVar.ak());
                            return;
                        }
                    }
                    if (cT != '\'') {
                        switch (cT) {
                            case '<':
                            case '=':
                                break;
                            case '>':
                                hmVar.ah();
                                hmVar.al(cpVar);
                                break;
                            default:
                                hmVar.m.v(cT, iAk2, sfVar.ak());
                                break;
                        }
                        return;
                    }
                }
            }
            hmVar.aj(this);
            hmVar.m.v(cT, iAk2, sfVar.ak());
            return;
        }
        hmVar.al(wa.aj);
    }
}
