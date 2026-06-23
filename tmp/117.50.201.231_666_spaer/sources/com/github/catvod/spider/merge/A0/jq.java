package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum jq extends wa {
    public jq() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        char cAa = sfVar.aa();
        if (cAa == 0) {
            hmVar.aj(this);
            sfVar.q();
            hmVar.ab((char) 65533);
        } else if (cAa == '-') {
            hmVar.ab(cAa);
            hmVar.w(wa.af);
        } else if (cAa == '<') {
            hmVar.ab(cAa);
            hmVar.w(wa.ah);
        } else if (cAa != 65535) {
            hmVar.ad(sfVar.y('-', '<', 0));
        } else {
            hmVar.ai(this);
            hmVar.al(wa.c);
        }
    }
}
