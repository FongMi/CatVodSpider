package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum qu extends le {
    public qu() {
        super("BeforeHead", 2);
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
        if (uzVar.n()) {
            w wVar = (w) uzVar;
            if (wVar.d.equals("head")) {
                zlVar.y = zlVar.bf(wVar);
                zlVar.v = le.f;
                return true;
            }
        }
        if (uzVar.m() && ws.i(((um) uzVar).d, vu.e)) {
            zlVar.br("head");
            return zlVar.bp(uzVar);
        }
        if (uzVar.m()) {
            zlVar.as(this);
            return false;
        }
        zlVar.br("head");
        return zlVar.bp(uzVar);
    }
}
