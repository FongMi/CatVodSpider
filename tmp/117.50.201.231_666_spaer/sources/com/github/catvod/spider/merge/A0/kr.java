package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum kr extends wa {
    public kr() {
        super("RawtextEndTagOpen", 14);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        y yVar = wa.r;
        ae aeVar = wa.g;
        if (sfVar.ah()) {
            hmVar.z(false);
            hmVar.al(yVar);
        } else {
            hmVar.ad("</");
            hmVar.al(aeVar);
        }
    }
}
