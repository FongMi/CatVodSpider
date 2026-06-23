package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum kt extends wa {
    public kt() {
        super("ScriptDataEndTagOpen", 17);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        vv vvVar = wa.u;
        fq fqVar = wa.h;
        if (sfVar.ah()) {
            hmVar.z(false);
            hmVar.al(vvVar);
        } else {
            hmVar.ad("</");
            hmVar.al(fqVar);
        }
    }
}
