package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum aa extends wa {
    public aa() {
        super("BeforeDoctypeSystemIdentifier", 61);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        char cT = sfVar.t();
        if (cT == '\t' || cT == '\n' || cT == '\f' || cT == '\r' || cT == ' ') {
            return;
        }
        if (cT == '\"') {
            hmVar.al(wa.bm);
            return;
        }
        if (cT == '\'') {
            hmVar.al(wa.bn);
            return;
        }
        cp cpVar = wa.c;
        if (cT == '>') {
            hmVar.aj(this);
            hmVar.o.f = true;
            hmVar.ag();
            hmVar.al(cpVar);
            return;
        }
        if (cT != 65535) {
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
