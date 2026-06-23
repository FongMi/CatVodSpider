package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum dk extends le {
    public dk() {
        super("InTableBody", 12);
    }

    @Override // com.github.catvod.spider.merge.A0.le
    public final boolean a(uz uzVar, zl zlVar) {
        int iH = wb.h(uzVar.g);
        mw mwVar = le.k;
        if (iH == 1) {
            w wVar = (w) uzVar;
            String str = wVar.d;
            if (!str.equals("tr")) {
                if (!ws.i(str, vu.w)) {
                    return ws.i(str, vu.ac) ? b(uzVar, zlVar) : mwVar.a(uzVar, zlVar);
                }
                zlVar.as(this);
                zlVar.br("tr");
                return zlVar.bp(wVar);
            }
            zlVar.al("tbody", "tfoot", "thead", "template");
            zlVar.bf(wVar);
            zlVar.v = le.p;
        } else {
            if (iH != 2) {
                return mwVar.a(uzVar, zlVar);
            }
            String str2 = ((um) uzVar).d;
            if (!ws.i(str2, vu.ai)) {
                if (str2.equals("table")) {
                    return b(uzVar, zlVar);
                }
                if (!ws.i(str2, vu.ad)) {
                    return mwVar.a(uzVar, zlVar);
                }
                zlVar.as(this);
                return false;
            }
            if (!zlVar.bb(str2)) {
                zlVar.as(this);
                return false;
            }
            zlVar.al("tbody", "tfoot", "thead", "template");
            zlVar.bm();
            zlVar.v = mwVar;
        }
        return true;
    }

    public final boolean b(uz uzVar, zl zlVar) {
        if (!zlVar.bb("tbody") && !zlVar.bb("thead") && !zlVar.ay("tfoot")) {
            zlVar.as(this);
            return false;
        }
        zlVar.al("tbody", "tfoot", "thead", "template");
        zlVar.bq(zlVar.ap().g.c);
        return zlVar.bp(uzVar);
    }
}
