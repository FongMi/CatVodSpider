package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum od extends le {
    public od() {
        super("AfterFrameset", 20);
    }

    @Override // com.github.catvod.spider.merge.A0.le
    public final boolean a(uz uzVar, zl zlVar) {
        if (le.ab(uzVar)) {
            zlVar.bc((im) uzVar);
            return true;
        }
        if (uzVar.j()) {
            zlVar.be((gx) uzVar);
            return true;
        }
        if (uzVar.k()) {
            zlVar.as(this);
            return false;
        }
        if (uzVar.n() && ((w) uzVar).d.equals("html")) {
            return le.i.a(uzVar, zlVar);
        }
        if (uzVar.m() && ((um) uzVar).d.equals("html")) {
            zlVar.v = le.y;
            return true;
        }
        if (uzVar.n() && ((w) uzVar).d.equals("noframes")) {
            return le.f.a(uzVar, zlVar);
        }
        if (uzVar.l()) {
            return true;
        }
        zlVar.as(this);
        return false;
    }
}
