package com.github.catvod.spider.merge.A0;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class adp extends ob {
    public final az a;

    public adp(long j, az azVar) {
        super(j);
        this.a = azVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        this.a.run();
    }

    @Override // com.github.catvod.spider.merge.A0.ob
    public final String toString() {
        return super.toString() + this.a.toString();
    }
}
