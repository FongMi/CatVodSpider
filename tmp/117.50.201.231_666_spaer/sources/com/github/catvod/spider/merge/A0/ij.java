package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum ij extends le {
    public ij() {
        super("AfterHead", 5);
    }

    @Override // com.github.catvod.spider.merge.A0.le
    public final boolean a(uz uzVar, zl zlVar) {
        if (le.ab(uzVar)) {
            zlVar.bc((im) uzVar);
        } else if (uzVar.j()) {
            zlVar.be((gx) uzVar);
        } else if (uzVar.k()) {
            zlVar.as(this);
        } else {
            boolean zN = uzVar.n();
            gh ghVar = le.f;
            if (zN) {
                w wVar = (w) uzVar;
                String str = wVar.d;
                boolean zEquals = str.equals("html");
                bn bnVar = le.i;
                if (zEquals) {
                    return bnVar.a(uzVar, zlVar);
                }
                if (str.equals("body")) {
                    zlVar.bf(wVar);
                    zlVar.ae = false;
                    zlVar.v = bnVar;
                } else if (str.equals("frameset")) {
                    zlVar.bf(wVar);
                    zlVar.v = le.v;
                } else if (ws.i(str, vu.g)) {
                    zlVar.as(this);
                    ed edVar = zlVar.y;
                    zlVar.o.add(edVar);
                    ghVar.a(uzVar, zlVar);
                    zlVar.bv(edVar);
                } else {
                    if (str.equals("head")) {
                        zlVar.as(this);
                        return false;
                    }
                    zlVar.br("body");
                    zlVar.ae = true;
                    zlVar.bp(uzVar);
                }
            } else if (uzVar.m()) {
                String str2 = ((um) uzVar).d;
                if (ws.i(str2, vu.d)) {
                    zlVar.br("body");
                    zlVar.ae = true;
                    zlVar.bp(uzVar);
                } else {
                    if (!str2.equals("template")) {
                        zlVar.as(this);
                        return false;
                    }
                    ghVar.a(uzVar, zlVar);
                }
            } else {
                zlVar.br("body");
                zlVar.ae = true;
                zlVar.bp(uzVar);
            }
        }
        return true;
    }
}
