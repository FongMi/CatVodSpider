package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum df extends wa {
    public df() {
        super("Doctype", 50);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        char cT = sfVar.t();
        uf ufVar = wa.bb;
        if (cT == '\t' || cT == '\n' || cT == '\f' || cT == '\r' || cT == ' ') {
            hmVar.al(ufVar);
            return;
        }
        if (cT != '>') {
            if (cT != 65535) {
                hmVar.aj(this);
                hmVar.al(ufVar);
                return;
            }
            hmVar.ai(this);
        }
        hmVar.aj(this);
        nk nkVar = hmVar.o;
        nkVar.a();
        nkVar.f = true;
        hmVar.ag();
        hmVar.al(wa.c);
    }
}
