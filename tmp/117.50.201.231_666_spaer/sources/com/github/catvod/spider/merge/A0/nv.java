package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum nv extends wa {
    public nv() {
        super("ScriptDataEscapedDashDash", 23);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        if (sfVar.ab()) {
            hmVar.ai(this);
            hmVar.al(wa.c);
            return;
        }
        char cT = sfVar.t();
        vc vcVar = wa.x;
        if (cT == 0) {
            hmVar.aj(this);
            hmVar.ab((char) 65533);
            hmVar.al(vcVar);
        } else {
            if (cT == '-') {
                hmVar.ab(cT);
                return;
            }
            if (cT == '<') {
                hmVar.al(wa.aa);
            } else if (cT != '>') {
                hmVar.ab(cT);
                hmVar.al(vcVar);
            } else {
                hmVar.ab(cT);
                hmVar.al(wa.h);
            }
        }
    }
}
