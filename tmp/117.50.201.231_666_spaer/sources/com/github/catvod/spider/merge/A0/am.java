package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum am extends wa {
    public am() {
        super("ScriptDataEscapedEndTagOpen", 25);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        if (!sfVar.ah()) {
            hmVar.ad("</");
            hmVar.al(wa.x);
            return;
        }
        hmVar.z(false);
        wk wkVar = hmVar.m;
        char cAa = sfVar.aa();
        wkVar.getClass();
        wkVar.y(String.valueOf(cAa));
        hmVar.j.append(sfVar.aa());
        hmVar.w(wa.ac);
    }
}
