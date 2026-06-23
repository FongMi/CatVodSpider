package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum zj extends le {
    public zj() {
        super("InRow", 13);
    }

    @Override // com.github.catvod.spider.merge.A0.le
    public final boolean a(uz uzVar, zl zlVar) {
        boolean zN = uzVar.n();
        mw mwVar = le.k;
        dk dkVar = le.o;
        if (zN) {
            w wVar = (w) uzVar;
            String str = wVar.d;
            if (ws.i(str, vu.w)) {
                zlVar.an();
                zlVar.bf(wVar);
                zlVar.v = le.q;
                zlVar.aa.add(null);
                return true;
            }
            if (!ws.i(str, vu.ae)) {
                return mwVar.a(uzVar, zlVar);
            }
            if (!zlVar.bb("tr")) {
                zlVar.as(this);
                return false;
            }
            zlVar.an();
            zlVar.bm();
            zlVar.v = dkVar;
            return zlVar.bp(uzVar);
        }
        if (!uzVar.m()) {
            return mwVar.a(uzVar, zlVar);
        }
        String str2 = ((um) uzVar).d;
        if (str2.equals("tr")) {
            if (!zlVar.bb(str2)) {
                zlVar.as(this);
                return false;
            }
            zlVar.an();
            zlVar.bm();
            zlVar.v = dkVar;
            return true;
        }
        if (str2.equals("table")) {
            if (!zlVar.bb("tr")) {
                zlVar.as(this);
                return false;
            }
            zlVar.an();
            zlVar.bm();
            zlVar.v = dkVar;
            return zlVar.bp(uzVar);
        }
        if (!ws.i(str2, vu.t)) {
            if (!ws.i(str2, vu.af)) {
                return mwVar.a(uzVar, zlVar);
            }
            zlVar.as(this);
            return false;
        }
        if (!zlVar.bb(str2)) {
            zlVar.as(this);
            return false;
        }
        if (!zlVar.bb("tr")) {
            return false;
        }
        zlVar.an();
        zlVar.bm();
        zlVar.v = dkVar;
        return zlVar.bp(uzVar);
    }
}
