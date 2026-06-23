package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum hw extends le {
    public hw() {
        super("AfterAfterFrameset", 22);
    }

    @Override // com.github.catvod.spider.merge.A0.le
    public final boolean a(uz uzVar, zl zlVar) {
        if (uzVar.j()) {
            zlVar.be((gx) uzVar);
            return true;
        }
        if (uzVar.k() || le.ab(uzVar) || (uzVar.n() && ((w) uzVar).d.equals("html"))) {
            return le.i.a(uzVar, zlVar);
        }
        if (uzVar.l()) {
            return true;
        }
        if (uzVar.n() && ((w) uzVar).d.equals("noframes")) {
            return le.f.a(uzVar, zlVar);
        }
        zlVar.as(this);
        return false;
    }
}
