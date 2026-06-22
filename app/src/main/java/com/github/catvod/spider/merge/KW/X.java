package com.github.catvod.spider.merge.KW;

import java.util.IdentityHashMap;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class X {
    public static final C0834w b = new C0834w();
    public final int a;

    protected X(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    public static X a(C0813a c0813a, com.github.catvod.spider.merge.yZ.D d) {
        if (d == null) {
            d = com.github.catvod.spider.merge.yZ.D.c;
        }
        com.github.catvod.spider.merge.yZ.D d2 = d.a;
        return (d2 == null || d == com.github.catvod.spider.merge.yZ.D.c) ? b : n0.i(a(c0813a, d2), ((f0) ((AbstractC0825m) c0813a.a.get(d.b)).d(0)).c.b);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.KW.X, com.github.catvod.spider.merge.KW.X>] */
    public static X b(X x, Y y, IdentityHashMap<X, X> identityHashMap) {
        if (x.f()) {
            return x;
        }
        X x2 = identityHashMap.get(x);
        if (x2 != null) {
            return x2;
        }
        X x3 = (X) y.a.get(x);
        if (x3 != null) {
            identityHashMap.put(x, x3);
            return x3;
        }
        X[] xArr = new X[x.h()];
        boolean z = false;
        for (int i = 0; i < xArr.length; i++) {
            X xB = b(x.c(i), y, identityHashMap);
            if (z || xB != x.c(i)) {
                if (!z) {
                    xArr = new X[x.h()];
                    for (int i2 = 0; i2 < x.h(); i2++) {
                        xArr[i2] = x.c(i2);
                    }
                    z = true;
                }
                xArr[i] = xB;
            }
        }
        if (!z) {
            y.a(x);
            identityHashMap.put(x, x);
            return x;
        }
        X xI = xArr.length == 0 ? b : xArr.length == 1 ? n0.i(xArr[0], x.d(0)) : new C0828p(xArr, ((C0828p) x).d);
        y.a(xI);
        identityHashMap.put(xI, xI);
        identityHashMap.put(x, xI);
        return xI;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00dc A[PHI: r4
      0x00dc: PHI (r4v21 com.github.catvod.spider.merge.KW.X) = (r4v20 com.github.catvod.spider.merge.KW.X), (r4v22 com.github.catvod.spider.merge.KW.X) binds: [B:68:0x0104, B:62:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.github.catvod.spider.merge.KW.X g(com.github.catvod.spider.merge.KW.X r16, com.github.catvod.spider.merge.KW.X r17, boolean r18, com.github.catvod.spider.merge.Bk.d<com.github.catvod.spider.merge.KW.X, com.github.catvod.spider.merge.KW.X, com.github.catvod.spider.merge.KW.X> r19) {
        /*
            Method dump skipped, instruction units count: 627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.KW.X.g(com.github.catvod.spider.merge.KW.X, com.github.catvod.spider.merge.KW.X, boolean, com.github.catvod.spider.merge.Bk.d):com.github.catvod.spider.merge.KW.X");
    }

    public abstract X c(int i);

    public abstract int d(int i);

    public final boolean e() {
        return d(h() - 1) == Integer.MAX_VALUE;
    }

    public abstract boolean equals(Object obj);

    public boolean f() {
        return this == b;
    }

    public abstract int h();

    public final int hashCode() {
        return this.a;
    }
}
