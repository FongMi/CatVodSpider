package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum wn extends le {
    public wn() {
        super("InCell", 14);
    }

    @Override // com.github.catvod.spider.merge.A0.le
    public final boolean a(uz uzVar, zl zlVar) {
        boolean zM = uzVar.m();
        bn bnVar = le.i;
        if (!zM) {
            if (!uzVar.n() || !ws.i(((w) uzVar).d, vu.z)) {
                return bnVar.a(uzVar, zlVar);
            }
            if (!zlVar.bb("td") && !zlVar.bb("th")) {
                zlVar.as(this);
                return false;
            }
            if (zlVar.bb("td")) {
                zlVar.bq("td");
            } else {
                zlVar.bq("th");
            }
            return zlVar.bp(uzVar);
        }
        String str = ((um) uzVar).d;
        if (!ws.i(str, vu.w)) {
            if (ws.i(str, vu.x)) {
                zlVar.as(this);
                return false;
            }
            if (!ws.i(str, vu.y)) {
                return bnVar.a(uzVar, zlVar);
            }
            if (!zlVar.bb(str)) {
                zlVar.as(this);
                return false;
            }
            if (zlVar.bb("td")) {
                zlVar.bq("td");
            } else {
                zlVar.bq("th");
            }
            return zlVar.bp(uzVar);
        }
        boolean zBb = zlVar.bb(str);
        zj zjVar = le.p;
        if (!zBb) {
            zlVar.as(this);
            zlVar.v = zjVar;
            return false;
        }
        zlVar.au(false);
        if (!zlVar.aq(str)) {
            zlVar.as(this);
        }
        zlVar.bn(str);
        zlVar.ak();
        zlVar.v = zjVar;
        return true;
    }
}
