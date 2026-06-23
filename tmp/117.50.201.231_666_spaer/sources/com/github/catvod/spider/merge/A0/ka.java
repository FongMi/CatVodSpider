package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum ka extends wa {
    public ka() {
        super("CharacterReferenceInRcdata", 3);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        jt jtVar = wa.e;
        int[] iArrY = hmVar.y(null, false);
        if (iArrY == null) {
            hmVar.ab('&');
        } else {
            hmVar.ad(new String(iArrY, 0, iArrY.length));
        }
        hmVar.al(jtVar);
    }
}
