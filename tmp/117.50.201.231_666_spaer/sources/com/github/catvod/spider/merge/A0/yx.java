package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum yx extends wa {
    public yx() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        if (sfVar.ad("--")) {
            hmVar.p.a();
            hmVar.al(wa.au);
        } else {
            if (sfVar.ae("DOCTYPE")) {
                hmVar.al(wa.ba);
                return;
            }
            if (sfVar.ad("[CDATA[")) {
                hmVar.aa();
                hmVar.al(wa.bq);
            } else {
                hmVar.aj(this);
                hmVar.p.a();
                hmVar.al(wa.as);
            }
        }
    }
}
