package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum ht extends wa {
    public ht() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        char cT = sfVar.t();
        tx txVar = wa.aj;
        if (cT == '\t' || cT == '\n' || cT == '\f' || cT == '\r' || cT == ' ') {
            hmVar.al(txVar);
            return;
        }
        if (cT == '/') {
            hmVar.al(wa.ar);
            return;
        }
        cp cpVar = wa.c;
        if (cT == '>') {
            hmVar.ah();
            hmVar.al(cpVar);
        } else if (cT == 65535) {
            hmVar.ai(this);
            hmVar.al(cpVar);
        } else {
            sfVar.an();
            hmVar.aj(this);
            hmVar.al(txVar);
        }
    }
}
