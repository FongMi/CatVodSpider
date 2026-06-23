package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum gu extends wa {
    public gu() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        if (sfVar.ah()) {
            hmVar.aa();
            hmVar.j.append(sfVar.aa());
            hmVar.ad("<");
            hmVar.ab(sfVar.aa());
            hmVar.w(wa.ad);
            return;
        }
        if (sfVar.af('/')) {
            hmVar.aa();
            hmVar.w(wa.ab);
        } else {
            hmVar.ab('<');
            hmVar.al(wa.x);
        }
    }
}
