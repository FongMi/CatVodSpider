package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ul extends bi {
    public final boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul(nr nrVar) {
        bi biVar;
        super(true);
        boolean z = true;
        x(nrVar);
        si siVarU = u();
        sj sjVar = (sj) (siVarU instanceof sj ? siVarU : null);
        if (sjVar == null || (biVar = (bi) sjVar.a) == null) {
            z = false;
            break;
        }
        while (!biVar.s()) {
            si siVarU2 = biVar.u();
            sj sjVar2 = (sj) (siVarU2 instanceof sj ? siVarU2 : null);
            if (sjVar2 == null || (biVar = (bi) sjVar2.a) == null) {
                z = false;
                break;
            }
        }
        this.a = z;
    }

    @Override // com.github.catvod.spider.merge.A0.bi
    public final boolean m(Throwable th) {
        return false;
    }

    @Override // com.github.catvod.spider.merge.A0.bi
    public final boolean s() {
        return this.a;
    }
}
