package com.github.catvod.spider.merge.H0;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class p extends Exception {
    private final n b;

    public p(n nVar, String str) {
        super(str);
        this.b = nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, Exception exc) {
        super(str, exc);
        n nVar = n.INTERNAL_ERROR;
        this.b = nVar;
    }

    public final n a() {
        return this.b;
    }
}
