package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum tx extends wa {
    public tx() {
        super("BeforeAttributeName", 33);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        char cT = sfVar.t();
        aan aanVar = wa.ak;
        if (cT == 0) {
            sfVar.an();
            hmVar.aj(this);
            hmVar.m.ac();
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
                if (cT != '=') {
                    if (cT == '>') {
                        hmVar.ah();
                        hmVar.al(cpVar);
                        return;
                    } else {
                        hmVar.m.ac();
                        sfVar.an();
                        hmVar.al(aanVar);
                        return;
                    }
                }
            }
            hmVar.aj(this);
            hmVar.m.ac();
            wk wkVar = hmVar.m;
            wkVar.z(sfVar.ak() - 1, sfVar.ak());
            wkVar.p.append(cT);
            hmVar.al(aanVar);
        }
    }
}
