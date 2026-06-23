package com.github.catvod.spider.merge.A0;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class lu extends us {
    public final ch a;
    public final aav d;
    public final oa e;
    public final fj f;
    public final vq g;
    public final jo h = new jo(23);
    public final boolean i;
    public volatile kv j;

    public lu(ch chVar, aav aavVar, oa oaVar, fj fjVar, vq vqVar, boolean z) {
        this.a = chVar;
        this.d = aavVar;
        this.e = oaVar;
        this.f = fjVar;
        this.g = vqVar;
        this.i = z;
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) {
        aav aavVar = this.d;
        if (aavVar == null) {
            return l().b(rdVar);
        }
        il ilVarB = rk.b(rdVar);
        if (this.i) {
            ilVarB.getClass();
            if (ilVarB instanceof aas) {
                return null;
            }
        }
        return aavVar.deserialize(ilVarB, this.f.b, this.h);
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final void c(aag aagVar, Object obj) throws IOException {
        ch chVar = this.a;
        if (chVar == null) {
            l().c(aagVar, obj);
            return;
        }
        if (this.i && obj == null) {
            aagVar.w();
            return;
        }
        il ilVarSerialize = chVar.serialize(obj, this.f.b, this.h);
        ado.z.getClass();
        vd.d(aagVar, ilVarSerialize);
    }

    @Override // com.github.catvod.spider.merge.A0.us
    public final kv k() {
        return this.a != null ? this : l();
    }

    public final kv l() {
        kv kvVar = this.j;
        if (kvVar != null) {
            return kvVar;
        }
        kv kvVarAb = this.e.ab(this.g, this.f);
        this.j = kvVarAb;
        return kvVarAb;
    }
}
