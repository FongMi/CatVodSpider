package com.github.catvod.spider.merge.A0;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class sj extends mq implements si {
    public final bi q;

    public sj(bi biVar, bi biVar2) {
        super(biVar);
        this.q = biVar2;
    }

    @Override // com.github.catvod.spider.merge.A0.si
    public final boolean c(Throwable th) {
        return ((bi) this.a).m(th);
    }

    @Override // com.github.catvod.spider.merge.A0.n
    public final void f(Throwable th) throws IllegalAccessException, InvocationTargetException {
        this.q.j((ux) this.a);
    }

    @Override // com.github.catvod.spider.merge.A0.qw
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        f((Throwable) obj);
        return jo.i;
    }
}
