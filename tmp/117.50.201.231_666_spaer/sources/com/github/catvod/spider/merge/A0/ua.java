package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum ua extends wa {
    public ua() {
        super("AfterAttributeName", 35);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        char cT = sfVar.t();
        aan aanVar = wa.ak;
        if (cT == 0) {
            hmVar.aj(this);
            wk wkVar = hmVar.m;
            wkVar.z(sfVar.ak() - 1, sfVar.ak());
            wkVar.p.append((char) 65533);
            hmVar.al(aanVar);
            return;
        }
        if (cT != ' ') {
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
                if (cT == '\t' || cT == '\n' || cT == '\f' || cT == '\r') {
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
                        hmVar.m.ac();
                        sfVar.an();
                        hmVar.al(aanVar);
                        break;
                }
                return;
            }
            hmVar.aj(this);
            hmVar.m.ac();
            wk wkVar2 = hmVar.m;
            wkVar2.z(sfVar.ak() - 1, sfVar.ak());
            wkVar2.p.append(cT);
            hmVar.al(aanVar);
        }
    }
}
