package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum np extends le {
    public np() {
        super("BeforeHtml", 1);
    }

    @Override // com.github.catvod.spider.merge.A0.le
    public final boolean a(uz uzVar, zl zlVar) {
        if (uzVar.k()) {
            zlVar.as(this);
            return false;
        }
        if (uzVar.j()) {
            zlVar.be((gx) uzVar);
            return true;
        }
        if (le.ab(uzVar)) {
            zlVar.bc((im) uzVar);
            return true;
        }
        boolean zN = uzVar.n();
        qu quVar = le.e;
        if (zN) {
            w wVar = (w) uzVar;
            if (wVar.d.equals("html")) {
                zlVar.bf(wVar);
                zlVar.v = quVar;
                return true;
            }
        }
        if (uzVar.m() && ws.i(((um) uzVar).d, vu.e)) {
            zlVar.br("html");
            zlVar.v = quVar;
            return zlVar.bp(uzVar);
        }
        if (uzVar.m()) {
            zlVar.as(this);
            return false;
        }
        zlVar.br("html");
        zlVar.v = quVar;
        return zlVar.bp(uzVar);
    }
}
