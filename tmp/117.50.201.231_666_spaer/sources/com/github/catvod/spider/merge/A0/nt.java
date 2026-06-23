package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum nt extends wa {
    public nt() {
        super("BogusComment", 42);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        hmVar.p.e(sfVar.x('>'));
        char cAa = sfVar.aa();
        if (cAa == '>' || cAa == 65535) {
            sfVar.t();
            hmVar.af();
            hmVar.al(wa.c);
        }
    }
}
