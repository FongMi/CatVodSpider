package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum cs extends le {
    public cs() {
        super("AfterAfterBody", 21);
    }

    @Override // com.github.catvod.spider.merge.A0.le
    public final boolean a(uz uzVar, zl zlVar) {
        if (uzVar.j()) {
            zlVar.be((gx) uzVar);
            return true;
        }
        if (uzVar.k() || (uzVar.n() && ((w) uzVar).d.equals("html"))) {
            return le.i.a(uzVar, zlVar);
        }
        if (le.ab(uzVar)) {
            zlVar.bd((im) uzVar, zlVar.n);
            return true;
        }
        if (uzVar.l()) {
            return true;
        }
        zlVar.as(this);
        zlVar.bw();
        return zlVar.bp(uzVar);
    }
}
