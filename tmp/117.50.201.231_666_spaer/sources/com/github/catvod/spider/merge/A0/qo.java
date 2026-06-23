package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum qo extends le {
    public qo() {
        super("InTableText", 9);
    }

    @Override // com.github.catvod.spider.merge.A0.le
    public final boolean a(uz uzVar, zl zlVar) {
        if (uzVar.g == 5) {
            im imVar = (im) uzVar;
            if (imVar.b.equals(le.aa)) {
                zlVar.as(this);
                return false;
            }
            zlVar.ac.add(imVar.clone());
            return true;
        }
        if (zlVar.ac.size() > 0) {
            uz uzVar2 = zlVar.q;
            for (im imVar2 : zlVar.ac) {
                zlVar.q = imVar2;
                if (le.ab(imVar2)) {
                    zlVar.bc(imVar2);
                } else {
                    zlVar.as(this);
                    boolean zI = ws.i(zlVar.ap().g.c, vu.ab);
                    bn bnVar = le.i;
                    if (zI) {
                        zlVar.af = true;
                        bnVar.a(imVar2, zlVar);
                        zlVar.af = false;
                    } else {
                        bnVar.a(imVar2, zlVar);
                    }
                }
            }
            zlVar.q = uzVar2;
            zlVar.ac.clear();
        }
        zlVar.v = zlVar.w;
        return zlVar.bp(uzVar);
    }
}
