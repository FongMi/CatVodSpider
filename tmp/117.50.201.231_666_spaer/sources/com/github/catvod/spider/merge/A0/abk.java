package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class abk {
    public static final ThreadLocal a = new ThreadLocal();

    public static er b() {
        ThreadLocal threadLocal = a;
        er erVar = (er) threadLocal.get();
        if (erVar != null) {
            return erVar;
        }
        rl rlVar = new rl(Thread.currentThread());
        threadLocal.set(rlVar);
        return rlVar;
    }
}
