package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum fi extends wa {
    public fi() {
        super("CommentEndDash", 47);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        char cT = sfVar.t();
        oo ooVar = wa.aw;
        if (cT == 0) {
            hmVar.aj(this);
            gx gxVar = hmVar.p;
            gxVar.d('-');
            gxVar.d((char) 65533);
            hmVar.al(ooVar);
            return;
        }
        if (cT == '-') {
            hmVar.al(wa.ay);
            return;
        }
        if (cT == 65535) {
            hmVar.ai(this);
            hmVar.af();
            hmVar.al(wa.c);
        } else {
            gx gxVar2 = hmVar.p;
            gxVar2.d('-');
            gxVar2.d(cT);
            hmVar.al(ooVar);
        }
    }
}
