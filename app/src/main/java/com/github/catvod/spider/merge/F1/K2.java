package com.github.catvod.spider.merge.f1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class K2 extends C1096L {
    private Throwable j;

    public K2(Throwable th) {
        super("Wrapped " + th);
        this.j = th;
        initCause(th);
        int[] iArr = {0};
        String strP = C1185v.p(iArr);
        int i = iArr[0];
        if (strP != null) {
            f(strP);
        }
        if (i != 0) {
            e(i);
        }
    }

    public final Throwable k() {
        return this.j;
    }
}
