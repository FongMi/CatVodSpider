package com.github.catvod.spider.merge.A0;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class az extends cj implements Runnable {
    public final long a;

    public az(long j, xl xlVar) {
        super(xlVar.getContext(), xlVar);
        this.a = j;
    }

    @Override // com.github.catvod.spider.merge.A0.pb, com.github.catvod.spider.merge.A0.bi
    public final String b() {
        return super.b() + "(timeMillis=" + this.a + ')';
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        j(new qq("Timed out waiting for " + this.a + " ms", this));
    }
}
