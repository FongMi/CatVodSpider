package com.github.catvod.spider.merge.A;

import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public abstract class Q {
    public static final C0017s b = new C0017s();
    public final int a;

    public Q(int i) {
        this.a = i;
    }

    public static f0 a(C0000a c0000a, com.github.catvod.spider.merge.z.r rVar) {
        com.github.catvod.spider.merge.z.r rVar2 = com.github.catvod.spider.merge.z.r.d;
        if (rVar == null) {
            rVar = rVar2;
        }
        com.github.catvod.spider.merge.z.r rVar3 = rVar.a;
        return (rVar3 == null || rVar == rVar2) ? b : f0.i(a(c0000a, rVar3), ((X) ((AbstractC0008i) c0000a.a.get(rVar.b)).c(0)).c.b);
    }

    public static Q b(Q q, C0019u c0019u, IdentityHashMap identityHashMap) {
        if (q.f()) {
            return q;
        }
        Q q2 = (Q) identityHashMap.get(q);
        if (q2 != null) {
            return q2;
        }
        Q q3 = (Q) ((HashMap) c0019u.a).get(q);
        if (q3 != null) {
            identityHashMap.put(q, q3);
            return q3;
        }
        Q[] qArr = new Q[q.h()];
        boolean z = false;
        for (int i = 0; i < qArr.length; i++) {
            Q qB = b(q.c(i), c0019u, identityHashMap);
            if (z || qB != q.c(i)) {
                if (!z) {
                    qArr = new Q[q.h()];
                    for (int i2 = 0; i2 < q.h(); i2++) {
                        qArr[i2] = q.c(i2);
                    }
                    z = true;
                }
                qArr[i] = qB;
            }
        }
        C0017s c0017s = b;
        HashMap map = (HashMap) c0019u.a;
        if (!z) {
            if (q != c0017s && ((Q) map.get(q)) == null) {
                map.put(q, q);
            }
            identityHashMap.put(q, q);
            return q;
        }
        Q qI = qArr.length == 0 ? c0017s : qArr.length == 1 ? f0.i(qArr[0], q.d(0)) : new C0011l(qArr, ((C0011l) q).d);
        if (qI != c0017s && ((Q) map.get(qI)) == null) {
            map.put(qI, qI);
        }
        identityHashMap.put(qI, qI);
        identityHashMap.put(q, qI);
        return qI;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0099 A[PHI: r2
      0x0099: PHI (r2v22 com.github.catvod.spider.merge.A.Q) = (r2v18 com.github.catvod.spider.merge.A.Q), (r2v24 com.github.catvod.spider.merge.A.Q) binds: [B:66:0x00e8, B:45:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.github.catvod.spider.merge.A.Q g(com.github.catvod.spider.merge.A.Q r18, com.github.catvod.spider.merge.A.Q r19, boolean r20, com.github.catvod.spider.merge.A.C0019u r21) {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A.Q.g(com.github.catvod.spider.merge.A.Q, com.github.catvod.spider.merge.A.Q, boolean, com.github.catvod.spider.merge.A.u):com.github.catvod.spider.merge.A.Q");
    }

    public abstract Q c(int i);

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
