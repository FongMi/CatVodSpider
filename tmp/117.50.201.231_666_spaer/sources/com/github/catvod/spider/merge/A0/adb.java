package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum adb extends wa {
    public adb() {
        super("SelfClosingStartTag", 41);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        char cT = sfVar.t();
        cp cpVar = wa.c;
        if (cT == '>') {
            hmVar.m.e = true;
            hmVar.ah();
            hmVar.al(cpVar);
        } else if (cT == 65535) {
            hmVar.ai(this);
            hmVar.al(cpVar);
        } else {
            sfVar.an();
            hmVar.aj(this);
            hmVar.al(wa.aj);
        }
    }
}
