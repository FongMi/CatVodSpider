package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum xi extends wa {
    public xi() {
        super("CommentStart", 44);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        char cT = sfVar.t();
        oo ooVar = wa.aw;
        if (cT == 0) {
            hmVar.aj(this);
            hmVar.p.d((char) 65533);
            hmVar.al(ooVar);
            return;
        }
        if (cT == '-') {
            hmVar.al(wa.av);
            return;
        }
        cp cpVar = wa.c;
        if (cT == '>') {
            hmVar.aj(this);
            hmVar.af();
            hmVar.al(cpVar);
        } else if (cT != 65535) {
            sfVar.an();
            hmVar.al(ooVar);
        } else {
            hmVar.ai(this);
            hmVar.af();
            hmVar.al(cpVar);
        }
    }
}
