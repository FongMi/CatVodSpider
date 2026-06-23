package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class un extends zy implements qw {
    public final /* synthetic */ ft a;
    public final /* synthetic */ ca b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un(ft ftVar, ca caVar) {
        super(1);
        this.a = ftVar;
        this.b = caVar;
    }

    @Override // com.github.catvod.spider.merge.A0.qw
    public final Object invoke(Object obj) {
        this.a.b.removeCallbacks(this.b);
        return jo.i;
    }
}
