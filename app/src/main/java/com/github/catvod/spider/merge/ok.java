package com.github.catvod.spider.merge;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class ok extends U {
    private final transient Sj S;
    private final boolean T4;

    public ok(Sj sj) {
        this.S = sj;
        this.T4 = false;
    }

    private static Sj l8(Class<?> cls) {
        return cls == null ? PV.n("") : PV.HM(cls);
    }

    public ok(Class<?> cls) {
        this(l8(cls));
    }
}
