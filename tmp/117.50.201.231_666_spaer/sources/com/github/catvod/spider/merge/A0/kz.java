package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class kz extends n {
    public final bi c;
    public final lm q;
    public final sj r;
    public final Object s;

    public kz(bi biVar, lm lmVar, sj sjVar, Object obj) {
        super(sjVar.q);
        this.c = biVar;
        this.q = lmVar;
        this.r = sjVar;
        this.s = obj;
    }

    @Override // com.github.catvod.spider.merge.A0.n
    public final void f(Throwable th) {
        sj sjVar = this.r;
        bi biVar = this.c;
        biVar.getClass();
        sj sjVarD = bi.d(sjVar);
        lm lmVar = this.q;
        Object obj = this.s;
        if (sjVarD != null) {
            while (bo.a(sjVarD.q, false, new kz(biVar, lmVar, sjVarD, obj), 1) == m.a) {
                sjVarD = bi.d(sjVarD);
                if (sjVarD != null) {
                }
            }
            return;
        }
        biVar.h(biVar.p(lmVar, obj));
    }

    @Override // com.github.catvod.spider.merge.A0.qw
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        f((Throwable) obj);
        return jo.i;
    }
}
