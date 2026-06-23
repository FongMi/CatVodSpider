package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum vc extends wa {
    public vc() {
        super("ScriptDataEscaped", 21);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        if (sfVar.ab()) {
            hmVar.ai(this);
            hmVar.al(wa.c);
            return;
        }
        char cAa = sfVar.aa();
        if (cAa == 0) {
            hmVar.aj(this);
            sfVar.q();
            hmVar.ab((char) 65533);
        } else if (cAa == '-') {
            hmVar.ab('-');
            hmVar.w(wa.y);
        } else if (cAa != '<') {
            hmVar.ad(sfVar.y('-', '<', 0));
        } else {
            hmVar.w(wa.aa);
        }
    }
}
