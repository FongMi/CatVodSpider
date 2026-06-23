package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum mw extends le {
    public mw() {
        super("InTable", 8);
    }

    @Override // com.github.catvod.spider.merge.A0.le
    public final boolean a(uz uzVar, zl zlVar) {
        if (uzVar.i() && ws.i(zlVar.ap().g.c, vu.ab)) {
            zlVar.ac.clear();
            zlVar.w = zlVar.v;
            zlVar.v = le.l;
            return zlVar.bp(uzVar);
        }
        if (uzVar.j()) {
            zlVar.be((gx) uzVar);
            return true;
        }
        if (uzVar.k()) {
            zlVar.as(this);
            return false;
        }
        boolean zN = uzVar.n();
        gh ghVar = le.f;
        if (!zN) {
            if (!uzVar.m()) {
                if (!uzVar.l()) {
                    b(uzVar, zlVar);
                    return true;
                }
                if (zlVar.aq("html")) {
                    zlVar.as(this);
                }
                return true;
            }
            String str = ((um) uzVar).d;
            if (str.equals("table")) {
                if (!zlVar.bb(str)) {
                    zlVar.as(this);
                    return false;
                }
                zlVar.bn("table");
                zlVar.bx();
            } else {
                if (ws.i(str, vu.aa)) {
                    zlVar.as(this);
                    return false;
                }
                if (!str.equals("template")) {
                    b(uzVar, zlVar);
                    return true;
                }
                ghVar.a(uzVar, zlVar);
            }
            return true;
        }
        w wVar = (w) uzVar;
        String str2 = wVar.d;
        if (str2.equals("caption")) {
            zlVar.am();
            zlVar.aa.add(null);
            zlVar.bf(wVar);
            zlVar.v = le.m;
        } else if (str2.equals("colgroup")) {
            zlVar.am();
            zlVar.bf(wVar);
            zlVar.v = le.n;
        } else {
            if (str2.equals("col")) {
                zlVar.am();
                zlVar.br("colgroup");
                return zlVar.bp(uzVar);
            }
            if (ws.i(str2, vu.t)) {
                zlVar.am();
                zlVar.bf(wVar);
                zlVar.v = le.o;
            } else {
                if (ws.i(str2, vu.u)) {
                    zlVar.am();
                    zlVar.br("tbody");
                    return zlVar.bp(uzVar);
                }
                if (str2.equals("table")) {
                    zlVar.as(this);
                    if (!zlVar.bb(str2)) {
                        return false;
                    }
                    zlVar.bn(str2);
                    if (zlVar.bx()) {
                        return zlVar.bp(uzVar);
                    }
                    zlVar.bf(wVar);
                    return true;
                }
                if (ws.i(str2, vu.v)) {
                    return ghVar.a(uzVar, zlVar);
                }
                if (str2.equals("input")) {
                    qh qhVar = wVar.f;
                    if (qhVar == null || !qhVar.h("type").equalsIgnoreCase("hidden")) {
                        b(uzVar, zlVar);
                        return true;
                    }
                    zlVar.bg(wVar);
                } else {
                    if (!str2.equals("form")) {
                        b(uzVar, zlVar);
                        return true;
                    }
                    zlVar.as(this);
                    if (zlVar.z != null || zlVar.bk("template")) {
                        return false;
                    }
                    zlVar.bi(wVar, false, false);
                }
            }
        }
        return true;
    }

    public final void b(uz uzVar, zl zlVar) {
        zlVar.as(this);
        zlVar.af = true;
        le.i.a(uzVar, zlVar);
        zlVar.af = false;
    }
}
