package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum ba extends wa {
    public ba() {
        super("EndTagOpen", 8);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        boolean zAb = sfVar.ab();
        cp cpVar = wa.c;
        if (zAb) {
            hmVar.ai(this);
            hmVar.ad("</");
            hmVar.al(cpVar);
        } else if (sfVar.ah()) {
            hmVar.z(false);
            hmVar.al(wa.l);
        } else {
            if (sfVar.af('>')) {
                hmVar.aj(this);
                hmVar.w(cpVar);
                return;
            }
            hmVar.aj(this);
            gx gxVar = hmVar.p;
            gxVar.a();
            gxVar.d('/');
            hmVar.al(wa.as);
        }
    }
}
