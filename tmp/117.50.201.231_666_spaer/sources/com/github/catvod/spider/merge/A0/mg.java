package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum mg extends le {
    public mg() {
        super("InFrameset", 19);
    }

    @Override // com.github.catvod.spider.merge.A0.le
    public final boolean a(uz uzVar, zl zlVar) {
        w wVar;
        if (le.ab(uzVar)) {
            zlVar.bc((im) uzVar);
        } else if (uzVar.j()) {
            zlVar.be((gx) uzVar);
        } else {
            if (uzVar.k()) {
                zlVar.as(this);
                return false;
            }
            if (uzVar.n()) {
                wVar = (w) uzVar;
                String str = wVar.d;
                str.getClass();
                switch (str) {
                    case "frameset":
                        zlVar.bf(wVar);
                        break;
                    case "html":
                        return le.i.a(wVar, zlVar);
                    case "frame":
                        zlVar.bg(wVar);
                        break;
                    case "noframes":
                        return le.f.a(wVar, zlVar);
                    default:
                        zlVar.as(this);
                        return false;
                }
            } else if (uzVar.m() && ((um) uzVar).d.equals("frameset")) {
                if (zlVar.aq("html")) {
                    zlVar.as(this);
                    return false;
                }
                zlVar.bm();
                if (!zlVar.aq("frameset")) {
                    zlVar.v = le.w;
                }
            } else {
                if (!uzVar.l()) {
                    zlVar.as(this);
                    return false;
                }
                if (!zlVar.aq("html")) {
                    zlVar.as(this);
                }
            }
        }
        return true;
    }
}
