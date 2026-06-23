package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum iv extends wa {
    public iv() {
        super("ScriptDataDoubleEscapedDash", 29);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        char cT = sfVar.t();
        jq jqVar = wa.ae;
        if (cT == 0) {
            hmVar.aj(this);
            hmVar.ab((char) 65533);
            hmVar.al(jqVar);
        } else if (cT == '-') {
            hmVar.ab(cT);
            hmVar.al(wa.ag);
        } else if (cT == '<') {
            hmVar.ab(cT);
            hmVar.al(wa.ah);
        } else if (cT != 65535) {
            hmVar.ab(cT);
            hmVar.al(jqVar);
        } else {
            hmVar.ai(this);
            hmVar.al(wa.c);
        }
    }
}
