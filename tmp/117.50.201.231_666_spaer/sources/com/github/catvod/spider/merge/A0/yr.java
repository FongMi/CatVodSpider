package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum yr extends wa {
    public yr() {
        super("BetweenDoctypePublicAndSystemIdentifiers", 59);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        char cT = sfVar.t();
        if (cT == '\t' || cT == '\n' || cT == '\f' || cT == '\r' || cT == ' ') {
            return;
        }
        if (cT == '\"') {
            hmVar.aj(this);
            hmVar.al(wa.bm);
            return;
        }
        if (cT == '\'') {
            hmVar.aj(this);
            hmVar.al(wa.bn);
            return;
        }
        cp cpVar = wa.c;
        if (cT == '>') {
            hmVar.ag();
            hmVar.al(cpVar);
        } else if (cT != 65535) {
            hmVar.aj(this);
            hmVar.o.f = true;
            hmVar.al(wa.bp);
        } else {
            hmVar.ai(this);
            hmVar.o.f = true;
            hmVar.ag();
            hmVar.al(cpVar);
        }
    }
}
