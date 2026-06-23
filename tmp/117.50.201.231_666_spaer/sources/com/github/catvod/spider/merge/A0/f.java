package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum f extends wa {
    public f() {
        super("DoctypeSystemIdentifier_singleQuoted", 63);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        char cT = sfVar.t();
        if (cT == 0) {
            hmVar.aj(this);
            hmVar.o.e.append((char) 65533);
            return;
        }
        if (cT == '\'') {
            hmVar.al(wa.bo);
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
            hmVar.o.e.append(cT);
            return;
        }
        hmVar.ai(this);
        hmVar.o.f = true;
        hmVar.ag();
        hmVar.al(cpVar);
    }
}
