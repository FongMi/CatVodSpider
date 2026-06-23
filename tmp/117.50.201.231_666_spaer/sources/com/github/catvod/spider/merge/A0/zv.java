package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class zv extends fa {
    @Override // com.github.catvod.spider.merge.A0.dr
    public final int b() {
        return ((dr) this.f).b() * 3;
    }

    @Override // com.github.catvod.spider.merge.A0.dr
    public final boolean c(ed edVar, ed edVar2) {
        if (edVar == edVar2) {
            return false;
        }
        ed edVar3 = (ed) edVar2.ap;
        for (ed edVarAc = edVar3 != null ? edVar3.ac() : edVar2; edVarAc != null && edVarAc != edVar2; edVarAc = edVarAc.af()) {
            if (h(edVar, edVarAc)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format("%s ~ ", (dr) this.f);
    }
}
