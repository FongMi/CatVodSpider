package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum oo extends wa {
    public oo() {
        super("Comment", 46);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        char cAa = sfVar.aa();
        if (cAa == 0) {
            hmVar.aj(this);
            sfVar.q();
            hmVar.p.d((char) 65533);
        } else if (cAa == '-') {
            hmVar.w(wa.ax);
        } else {
            if (cAa != 65535) {
                hmVar.p.e(sfVar.y('-', 0));
                return;
            }
            hmVar.ai(this);
            hmVar.af();
            hmVar.al(wa.c);
        }
    }
}
