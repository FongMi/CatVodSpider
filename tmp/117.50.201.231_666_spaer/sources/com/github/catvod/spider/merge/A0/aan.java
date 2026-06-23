package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum aan extends wa {
    public aan() {
        super("AttributeName", 34);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        int iAk = sfVar.ak();
        String strZ = sfVar.z(wa.br);
        wk wkVar = hmVar.m;
        int iAk2 = sfVar.ak();
        wkVar.getClass();
        String strReplace = strZ.replace((char) 0, (char) 65533);
        wkVar.z(iAk, iAk2);
        StringBuilder sb = wkVar.p;
        if (sb.length() == 0) {
            wkVar.o = strReplace;
        } else {
            sb.append(strReplace);
        }
        int iAk3 = sfVar.ak();
        char cT = sfVar.t();
        if (cT == '\t' || cT == '\n' || cT == '\f' || cT == '\r' || cT == ' ') {
            hmVar.al(wa.al);
            return;
        }
        if (cT != '\"' && cT != '\'') {
            if (cT == '/') {
                hmVar.al(wa.ar);
                return;
            }
            cp cpVar = wa.c;
            if (cT == 65535) {
                hmVar.ai(this);
                hmVar.al(cpVar);
                return;
            }
            switch (cT) {
                case '<':
                    break;
                case '=':
                    hmVar.al(wa.am);
                    break;
                case '>':
                    hmVar.ah();
                    hmVar.al(cpVar);
                    break;
                default:
                    wk wkVar2 = hmVar.m;
                    wkVar2.z(iAk3, sfVar.ak());
                    wkVar2.p.append(cT);
                    break;
            }
            return;
        }
        hmVar.aj(this);
        wk wkVar3 = hmVar.m;
        wkVar3.z(iAk3, sfVar.ak());
        wkVar3.p.append(cT);
    }
}
