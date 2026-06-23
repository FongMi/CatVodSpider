package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum ty extends wa {
    public ty() {
        super("AfterDoctypeName", 53);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        boolean zAb = sfVar.ab();
        cp cpVar = wa.c;
        if (zAb) {
            hmVar.ai(this);
            hmVar.o.f = true;
            hmVar.ag();
            hmVar.al(cpVar);
            return;
        }
        if (sfVar.ag('\t', '\n', '\r', '\f', ' ')) {
            sfVar.q();
            return;
        }
        if (sfVar.af('>')) {
            hmVar.ag();
            hmVar.w(cpVar);
            return;
        }
        if (sfVar.ae("PUBLIC")) {
            hmVar.o.c = "PUBLIC";
            hmVar.al(wa.be);
        } else if (sfVar.ae("SYSTEM")) {
            hmVar.o.c = "SYSTEM";
            hmVar.al(wa.bk);
        } else {
            hmVar.aj(this);
            hmVar.o.f = true;
            hmVar.w(wa.bp);
        }
    }
}
