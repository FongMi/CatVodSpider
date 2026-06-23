package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class acn extends xm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ aco c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acn(aco acoVar, xm xmVar) {
        super(xmVar);
        this.c = acoVar;
    }

    @Override // com.github.catvod.spider.merge.A0.qi
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return aco.ai(this.c, this);
    }
}
