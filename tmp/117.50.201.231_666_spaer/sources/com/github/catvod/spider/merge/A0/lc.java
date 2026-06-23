package com.github.catvod.spider.merge.A0;

import java.util.UUID;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class lc {
    public static final abf o;
    public final jj p;
    public final xa q;

    static {
        UUID uuid = lb.a;
        abf abfVar = new abf(new jn(true));
        o = abfVar;
        abfVar.a = Integer.MAX_VALUE;
    }

    public lc(jj jjVar, xa xaVar) {
        this.p = jjVar;
        this.q = xaVar;
    }

    public abstract void i();
}
