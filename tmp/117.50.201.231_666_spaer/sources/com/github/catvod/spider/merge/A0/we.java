package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum we extends wa {
    public we() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        char cT = sfVar.t();
        if (cT == '!') {
            hmVar.ad("<!");
            hmVar.al(wa.v);
            return;
        }
        if (cT == '/') {
            hmVar.aa();
            hmVar.al(wa.t);
        } else if (cT != 65535) {
            hmVar.ad("<");
            sfVar.an();
            hmVar.al(wa.h);
        } else {
            hmVar.ad("<");
            hmVar.ai(this);
            hmVar.al(wa.c);
        }
    }
}
