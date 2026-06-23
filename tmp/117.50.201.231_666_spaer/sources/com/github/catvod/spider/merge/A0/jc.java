package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum jc extends wa {
    public jc() {
        super("BogusDoctype", 65);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        char cT = sfVar.t();
        cp cpVar = wa.c;
        if (cT == '>') {
            hmVar.ag();
            hmVar.al(cpVar);
        } else {
            if (cT != 65535) {
                return;
            }
            hmVar.ag();
            hmVar.al(cpVar);
        }
    }
}
