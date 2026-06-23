package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum abg extends wa {
    public abg() {
        super("DoctypeName", 52);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        if (sfVar.ai()) {
            hmVar.o.b.append(sfVar.w());
            return;
        }
        char cT = sfVar.t();
        if (cT == 0) {
            hmVar.aj(this);
            hmVar.o.b.append((char) 65533);
            return;
        }
        if (cT != ' ') {
            cp cpVar = wa.c;
            if (cT == '>') {
                hmVar.ag();
                hmVar.al(cpVar);
                return;
            }
            if (cT == 65535) {
                hmVar.ai(this);
                hmVar.o.f = true;
                hmVar.ag();
                hmVar.al(cpVar);
                return;
            }
            if (cT != '\t' && cT != '\n' && cT != '\f' && cT != '\r') {
                hmVar.o.b.append(cT);
                return;
            }
        }
        hmVar.al(wa.bd);
    }
}
