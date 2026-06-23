package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class dv extends ob {
    public final sa a;
    public final /* synthetic */ dx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv(dx dxVar, long j, sa saVar) {
        super(j);
        this.c = dxVar;
        this.a = saVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.v(this.c);
    }

    @Override // com.github.catvod.spider.merge.A0.ob
    public final String toString() {
        return super.toString() + this.a.toString();
    }
}
