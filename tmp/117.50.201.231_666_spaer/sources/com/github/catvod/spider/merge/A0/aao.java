package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class aao extends kv {
    public final nx a;
    public final nx d;
    public final ub e;
    public final /* synthetic */ sv f;

    public aao(sv svVar, oa oaVar, Type type, kv kvVar, Type type2, kv kvVar2, ub ubVar) {
        this.f = svVar;
        this.a = new nx(oaVar, kvVar, type);
        this.d = new nx(oaVar, kvVar2, type2);
        this.e = ubVar;
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) throws IOException {
        int iAk = rdVar.ak();
        if (iAk == 9) {
            rdVar.ag();
            return null;
        }
        Map map = (Map) this.e.m();
        if (iAk == 1) {
            rdVar.p();
            while (rdVar.x()) {
                rdVar.p();
                Object objB = ((kv) this.a.e).b(rdVar);
                if (map.put(objB, ((kv) this.d.e).b(rdVar)) != null) {
                    throw new yc("duplicate key: " + objB);
                }
                rdVar.t();
            }
            rdVar.t();
        } else {
            rdVar.q();
            while (rdVar.x()) {
                jo.j.getClass();
                int iS = rdVar.g;
                if (iS == 0) {
                    iS = rdVar.s();
                }
                if (iS == 13) {
                    rdVar.g = 9;
                } else if (iS == 12) {
                    rdVar.g = 8;
                } else {
                    if (iS != 14) {
                        throw rdVar.at("a name");
                    }
                    rdVar.g = 10;
                }
                Object objB2 = ((kv) this.a.e).b(rdVar);
                if (map.put(objB2, ((kv) this.d.e).b(rdVar)) != null) {
                    throw new yc("duplicate key: " + objB2);
                }
            }
            rdVar.u();
        }
        return map;
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final void c(aag aagVar, Object obj) throws IOException {
        Map map = (Map) obj;
        if (map == null) {
            aagVar.w();
            return;
        }
        this.f.getClass();
        nx nxVar = this.d;
        aagVar.q();
        for (Map.Entry entry : map.entrySet()) {
            aagVar.u(String.valueOf(entry.getKey()));
            nxVar.c(aagVar, entry.getValue());
        }
        aagVar.t();
    }
}
