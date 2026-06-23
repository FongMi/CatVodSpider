package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum uf extends wa {
    public uf() {
        super("BeforeDoctypeName", 51);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        boolean zAh = sfVar.ah();
        abg abgVar = wa.bc;
        if (zAh) {
            hmVar.o.a();
            hmVar.al(abgVar);
            return;
        }
        char cT = sfVar.t();
        if (cT == 0) {
            hmVar.aj(this);
            nk nkVar = hmVar.o;
            nkVar.a();
            nkVar.b.append((char) 65533);
            hmVar.al(abgVar);
            return;
        }
        if (cT != ' ') {
            if (cT == 65535) {
                hmVar.ai(this);
                nk nkVar2 = hmVar.o;
                nkVar2.a();
                nkVar2.f = true;
                hmVar.ag();
                hmVar.al(wa.c);
                return;
            }
            if (cT == '\t' || cT == '\n' || cT == '\f' || cT == '\r') {
                return;
            }
            hmVar.o.a();
            hmVar.o.b.append(cT);
            hmVar.al(abgVar);
        }
    }
}
