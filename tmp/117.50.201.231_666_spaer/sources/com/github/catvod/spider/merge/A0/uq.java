package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum uq extends wa {
    public uq() {
        super("CommentEndBang", 49);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        char cT = sfVar.t();
        oo ooVar = wa.aw;
        if (cT == 0) {
            hmVar.aj(this);
            gx gxVar = hmVar.p;
            gxVar.e("--!");
            gxVar.d((char) 65533);
            hmVar.al(ooVar);
            return;
        }
        if (cT == '-') {
            hmVar.p.e("--!");
            hmVar.al(wa.ax);
            return;
        }
        cp cpVar = wa.c;
        if (cT == '>') {
            hmVar.af();
            hmVar.al(cpVar);
        } else if (cT == 65535) {
            hmVar.ai(this);
            hmVar.af();
            hmVar.al(cpVar);
        } else {
            gx gxVar2 = hmVar.p;
            gxVar2.e("--!");
            gxVar2.d(cT);
            hmVar.al(ooVar);
        }
    }
}
