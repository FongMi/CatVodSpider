package com.github.catvod.spider.merge.A0;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class vo extends aco {
    public final xl a;

    /* JADX WARN: Multi-variable type inference failed */
    public vo(yg ygVar, ha haVar) {
        super(ygVar, false);
        this.a = ((qi) haVar).create(this, this);
    }

    @Override // com.github.catvod.spider.merge.A0.pb
    public final void an() throws IllegalAccessException, InvocationTargetException {
        try {
            qf.e(jo.i, hj.a(this.a));
        } catch (Throwable th) {
            resumeWith(act.b(th));
        }
    }
}
