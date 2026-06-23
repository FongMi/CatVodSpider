package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum zu extends le {
    public zu() {
        super("InHeadNoscript", 4);
    }

    @Override // com.github.catvod.spider.merge.A0.le
    public final boolean a(uz uzVar, zl zlVar) {
        if (uzVar.k()) {
            zlVar.as(this);
        } else {
            if (uzVar.n() && ((w) uzVar).d.equals("html")) {
                return le.i.a(uzVar, zlVar);
            }
            boolean zM = uzVar.m();
            gh ghVar = le.f;
            if (!zM || !((um) uzVar).d.equals("noscript")) {
                if (le.ab(uzVar) || uzVar.j() || (uzVar.n() && ws.i(((w) uzVar).d, vu.f))) {
                    return ghVar.a(uzVar, zlVar);
                }
                if (uzVar.m() && ((um) uzVar).d.equals("br")) {
                    zlVar.as(this);
                    im imVar = new im(5);
                    imVar.b = uzVar.toString();
                    zlVar.bc(imVar);
                    return true;
                }
                if ((uzVar.n() && ws.i(((w) uzVar).d, vu.aj)) || uzVar.m()) {
                    zlVar.as(this);
                    return false;
                }
                zlVar.as(this);
                im imVar2 = new im(5);
                imVar2.b = uzVar.toString();
                zlVar.bc(imVar2);
                return true;
            }
            zlVar.bm();
            zlVar.v = ghVar;
        }
        return true;
    }
}
