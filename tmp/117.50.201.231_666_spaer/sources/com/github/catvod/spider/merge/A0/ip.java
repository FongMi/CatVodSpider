package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class ip extends RuntimeException {
    public final uj a;
    public final rf b;
    public final uo c;
    public to d;
    public int e;

    public ip(uj ujVar, uo uoVar, rf rfVar) {
        this.e = -1;
        this.a = ujVar;
        this.c = uoVar;
        this.b = rfVar;
        if (ujVar != null) {
            this.e = ujVar.s;
        }
    }
}
