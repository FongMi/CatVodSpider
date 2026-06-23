package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum vh extends wa {
    public vh() {
        super("BeforeAttributeValue", 36);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        char cT = sfVar.t();
        dh dhVar = wa.ap;
        if (cT == 0) {
            hmVar.aj(this);
            hmVar.m.v((char) 65533, sfVar.ak() - 1, sfVar.ak());
            hmVar.al(dhVar);
            return;
        }
        if (cT != ' ') {
            if (cT == '\"') {
                hmVar.al(wa.an);
                return;
            }
            if (cT != '`') {
                cp cpVar = wa.c;
                if (cT == 65535) {
                    hmVar.ai(this);
                    hmVar.ah();
                    hmVar.al(cpVar);
                    return;
                }
                if (cT == '\t' || cT == '\n' || cT == '\f' || cT == '\r') {
                    return;
                }
                if (cT == '&') {
                    sfVar.an();
                    hmVar.al(dhVar);
                    return;
                }
                if (cT == '\'') {
                    hmVar.al(wa.ao);
                    return;
                }
                switch (cT) {
                    case '<':
                    case '=':
                        break;
                    case '>':
                        hmVar.aj(this);
                        hmVar.ah();
                        hmVar.al(cpVar);
                        break;
                    default:
                        sfVar.an();
                        hmVar.al(dhVar);
                        break;
                }
                return;
            }
            hmVar.aj(this);
            hmVar.m.v(cT, sfVar.ak() - 1, sfVar.ak());
            hmVar.al(dhVar);
        }
    }
}
