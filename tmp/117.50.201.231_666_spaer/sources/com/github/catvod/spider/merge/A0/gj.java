package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum gj extends le {
    public gj() {
        super("InCaption", 10);
    }

    @Override // com.github.catvod.spider.merge.A0.le
    public final boolean a(uz uzVar, zl zlVar) {
        boolean zM = uzVar.m();
        mw mwVar = le.k;
        if (zM && ((um) uzVar).d.equals("caption")) {
            if (!zlVar.bb("caption")) {
                zlVar.as(this);
                return false;
            }
            zlVar.au(false);
            if (!zlVar.aq("caption")) {
                zlVar.as(this);
            }
            zlVar.bn("caption");
            zlVar.ak();
            zlVar.v = mwVar;
            return true;
        }
        if ((!uzVar.n() || !ws.i(((w) uzVar).d, vu.z)) && (!uzVar.m() || !((um) uzVar).d.equals("table"))) {
            if (!uzVar.m() || !ws.i(((um) uzVar).d, vu.ak)) {
                return le.i.a(uzVar, zlVar);
            }
            zlVar.as(this);
            return false;
        }
        if (!zlVar.bb("caption")) {
            zlVar.as(this);
            return false;
        }
        zlVar.au(false);
        if (!zlVar.aq("caption")) {
            zlVar.as(this);
        }
        zlVar.bn("caption");
        zlVar.ak();
        zlVar.v = mwVar;
        mwVar.a(uzVar, zlVar);
        return true;
    }
}
