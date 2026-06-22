package com.github.catvod.spider.merge.f1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class H1 {
    private boolean a = false;
    private final int b;

    H1(int i) {
        this.b = i;
    }

    final Object a(C1185v c1185v, n2 n2Var, Object obj, G1 g1) {
        if (this.a) {
            return G2.b;
        }
        this.a = true;
        g1.a.set(this.b, obj);
        int i = g1.b - 1;
        g1.b = i;
        if (i == 0) {
            g1.a(c1185v, n2Var);
        }
        return G2.b;
    }
}
