package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum vt extends le {
    public vt() {
        super("AfterBody", 18);
    }

    @Override // com.github.catvod.spider.merge.A0.le
    public final boolean a(uz uzVar, zl zlVar) {
        ed edVarAw = zlVar.aw("html");
        boolean zAb = le.ab(uzVar);
        bn bnVar = le.i;
        if (zAb) {
            if (edVarAw != null) {
                zlVar.bd((im) uzVar, edVarAw);
                return true;
            }
            bnVar.a(uzVar, zlVar);
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
            return bnVar.a(uzVar, zlVar);
        }
        if (uzVar.m() && ((um) uzVar).d.equals("html")) {
            zlVar.v = le.x;
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
