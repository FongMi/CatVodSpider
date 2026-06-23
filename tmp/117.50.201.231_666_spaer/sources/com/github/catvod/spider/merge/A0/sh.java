package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class sh extends mq {
    public final sa c;

    public sh(nr nrVar, sa saVar) {
        super(nrVar);
        this.c = saVar;
    }

    @Override // com.github.catvod.spider.merge.A0.n
    public final void f(Throwable th) {
        sa saVar = this.c;
        Throwable thB = saVar.b(this.a);
        boolean zI = false;
        boolean z = saVar.x == 2;
        xl xlVar = saVar.g;
        if (z) {
            acu acuVar = (acu) (!(xlVar instanceof acu) ? null : xlVar);
            if (acuVar != null) {
                zI = acuVar.i(thB);
            }
        }
        if (zI) {
            return;
        }
        saVar.q(thB);
        if ((xlVar instanceof acu) && ((acu) xlVar).h(saVar)) {
            return;
        }
        saVar.r();
    }

    @Override // com.github.catvod.spider.merge.A0.qw
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        f((Throwable) obj);
        return jo.i;
    }
}
