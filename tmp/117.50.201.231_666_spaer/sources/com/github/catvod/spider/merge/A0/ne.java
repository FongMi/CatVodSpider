package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ne extends sa {
    public final aco a;

    public ne(xl xlVar, aco acoVar) {
        super(xlVar);
        this.a = acoVar;
    }

    @Override // com.github.catvod.spider.merge.A0.sa
    public final Throwable b(nr nrVar) {
        Throwable thC;
        Object objV = this.a.v();
        return (!(objV instanceof lm) || (thC = ((lm) objV).c()) == null) ? objV instanceof tt ? ((tt) objV).c : ((bi) nrVar).q() : thC;
    }

    @Override // com.github.catvod.spider.merge.A0.sa
    public final String c() {
        return "AwaitContinuation";
    }
}
