package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum gh extends le {
    public gh() {
        super("InHead", 3);
    }

    @Override // com.github.catvod.spider.merge.A0.le
    public final boolean a(uz uzVar, zl zlVar) {
        if (le.ab(uzVar)) {
            zlVar.bc((im) uzVar);
            return true;
        }
        int iH = wb.h(uzVar.g);
        if (iH == 0) {
            zlVar.as(this);
            return false;
        }
        if (iH == 1) {
            w wVar = (w) uzVar;
            String str = wVar.d;
            if (str.equals("html")) {
                return le.i.a(uzVar, zlVar);
            }
            if (ws.i(str, vu.a)) {
                ed edVarBg = zlVar.bg(wVar);
                if (str.equals("base") && edVarBg.av("href") && !zlVar.x) {
                    String strAs = edVarBg.as("href");
                    if (strAs.length() != 0) {
                        zlVar.p = strAs;
                        zlVar.x = true;
                        em emVar = zlVar.n;
                        emVar.getClass();
                        emVar.aa(strAs);
                    }
                }
            } else if (str.equals("meta")) {
                zlVar.bg(wVar);
            } else {
                boolean zEquals = str.equals("title");
                fn fnVar = le.j;
                if (zEquals) {
                    zlVar.m.al(wa.e);
                    zlVar.w = zlVar.v;
                    zlVar.v = fnVar;
                    zlVar.bf(wVar);
                } else if (ws.i(str, vu.b)) {
                    le.ac(wVar, zlVar);
                } else if (str.equals("noscript")) {
                    zlVar.bf(wVar);
                    zlVar.v = le.g;
                } else if (str.equals("script")) {
                    zlVar.m.al(wa.h);
                    zlVar.w = zlVar.v;
                    zlVar.v = fnVar;
                    zlVar.bf(wVar);
                } else {
                    if (str.equals("head")) {
                        zlVar.as(this);
                        return false;
                    }
                    if (!str.equals("template")) {
                        zlVar.bq("head");
                        return zlVar.bp(uzVar);
                    }
                    zlVar.bf(wVar);
                    zlVar.aa.add(null);
                    zlVar.ae = false;
                    cq cqVar = le.t;
                    zlVar.v = cqVar;
                    zlVar.bs(cqVar);
                }
            }
        } else if (iH == 2) {
            String str2 = ((um) uzVar).d;
            if (str2.equals("head")) {
                zlVar.bm();
                zlVar.v = le.h;
            } else {
                if (ws.i(str2, vu.c)) {
                    zlVar.bq("head");
                    return zlVar.bp(uzVar);
                }
                if (!str2.equals("template")) {
                    zlVar.as(this);
                    return false;
                }
                if (zlVar.bk(str2)) {
                    zlVar.au(true);
                    if (!zlVar.aq(str2)) {
                        zlVar.as(this);
                    }
                    zlVar.bn(str2);
                    zlVar.ak();
                    zlVar.bo();
                    zlVar.bx();
                } else {
                    zlVar.as(this);
                }
            }
        } else {
            if (iH != 3) {
                zlVar.bq("head");
                return zlVar.bp(uzVar);
            }
            zlVar.be((gx) uzVar);
        }
        return true;
    }
}
