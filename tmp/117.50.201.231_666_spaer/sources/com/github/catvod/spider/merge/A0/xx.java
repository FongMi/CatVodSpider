package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum xx extends le {
    public xx() {
        super("InSelectInTable", 16);
    }

    @Override // com.github.catvod.spider.merge.A0.le
    public final boolean a(uz uzVar, zl zlVar) {
        boolean zN = uzVar.n();
        String[] strArr = vu.ah;
        if (zN && ws.i(((w) uzVar).d, strArr)) {
            zlVar.as(this);
            zlVar.bn("select");
            zlVar.bx();
            return zlVar.bp(uzVar);
        }
        if (uzVar.m()) {
            um umVar = (um) uzVar;
            if (ws.i(umVar.d, strArr)) {
                zlVar.as(this);
                if (!zlVar.bb(umVar.d)) {
                    return false;
                }
                zlVar.bn("select");
                zlVar.bx();
                return zlVar.bp(uzVar);
            }
        }
        return le.r.a(uzVar, zlVar);
    }
}
