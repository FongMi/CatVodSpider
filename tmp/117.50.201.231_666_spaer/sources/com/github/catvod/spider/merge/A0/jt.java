package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum jt extends wa {
    public jt() {
        super("Rcdata", 2);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        char cAa = sfVar.aa();
        if (cAa == 0) {
            hmVar.aj(this);
            sfVar.q();
            hmVar.ab((char) 65533);
        } else {
            if (cAa == '&') {
                hmVar.w(wa.f);
                return;
            }
            if (cAa == '<') {
                hmVar.w(wa.m);
            } else if (cAa != 65535) {
                hmVar.ad(sfVar.v());
            } else {
                hmVar.ac(new aaw());
            }
        }
    }
}
