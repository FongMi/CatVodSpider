package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum va extends wa {
    public va() {
        super("TagOpen", 7);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        char cAa = sfVar.aa();
        if (cAa == '!') {
            hmVar.w(wa.at);
            return;
        }
        if (cAa == '/') {
            hmVar.w(wa.k);
            return;
        }
        if (cAa == '?') {
            hmVar.p.a();
            hmVar.al(wa.as);
        } else if (sfVar.ah()) {
            hmVar.z(true);
            hmVar.al(wa.l);
        } else {
            hmVar.aj(this);
            hmVar.ab('<');
            hmVar.al(wa.c);
        }
    }
}
