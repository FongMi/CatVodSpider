package com.github.catvod.spider.merge.u;

import java.util.IdentityHashMap;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class S {
    public static final C0649s b = new C0649s();
    public final int a;

    protected S(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    public static S a(C0632a c0632a, com.github.catvod.spider.merge.t.y yVar) {
        if (yVar == null) {
            yVar = com.github.catvod.spider.merge.t.y.c;
        }
        com.github.catvod.spider.merge.t.y yVar2 = yVar.a;
        return (yVar2 == null || yVar == com.github.catvod.spider.merge.t.y.c) ? b : d0.i(a(c0632a, yVar2), ((a0) ((AbstractC0640i) c0632a.a.get(yVar.b)).d(0)).c.b);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.u.S, com.github.catvod.spider.merge.u.S>] */
    public static S b(S s, T t, IdentityHashMap<S, S> identityHashMap) {
        if (s.f()) {
            return s;
        }
        S s2 = identityHashMap.get(s);
        if (s2 != null) {
            return s2;
        }
        S s3 = (S) t.a.get(s);
        if (s3 != null) {
            identityHashMap.put(s, s3);
            return s3;
        }
        S[] sArr = new S[s.h()];
        boolean z = false;
        for (int i = 0; i < sArr.length; i++) {
            S sB = b(s.c(i), t, identityHashMap);
            if (z || sB != s.c(i)) {
                if (!z) {
                    sArr = new S[s.h()];
                    for (int i2 = 0; i2 < s.h(); i2++) {
                        sArr[i2] = s.c(i2);
                    }
                    z = true;
                }
                sArr[i] = sB;
            }
        }
        if (!z) {
            t.a(s);
            identityHashMap.put(s, s);
            return s;
        }
        S sI = sArr.length == 0 ? b : sArr.length == 1 ? d0.i(sArr[0], s.d(0)) : new C0643l(sArr, ((C0643l) s).d);
        t.a(sI);
        identityHashMap.put(sI, sI);
        identityHashMap.put(s, sI);
        return sI;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00dc A[PHI: r4
      0x00dc: PHI (r4v21 com.github.catvod.spider.merge.u.S) = (r4v20 com.github.catvod.spider.merge.u.S), (r4v22 com.github.catvod.spider.merge.u.S) binds: [B:68:0x0104, B:62:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.github.catvod.spider.merge.u.S g(com.github.catvod.spider.merge.u.S r16, com.github.catvod.spider.merge.u.S r17, boolean r18, com.github.catvod.spider.merge.w.c<com.github.catvod.spider.merge.u.S, com.github.catvod.spider.merge.u.S, com.github.catvod.spider.merge.u.S> r19) {
        /*
            Method dump skipped, instruction units count: 627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.u.S.g(com.github.catvod.spider.merge.u.S, com.github.catvod.spider.merge.u.S, boolean, com.github.catvod.spider.merge.w.c):com.github.catvod.spider.merge.u.S");
    }

    public abstract S c(int i);

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
