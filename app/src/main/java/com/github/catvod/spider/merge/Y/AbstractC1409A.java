package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.l.C1290c;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
abstract class AbstractC1409A implements InterfaceC1420i {
    static long d = com.github.catvod.spider.merge.H.A.z("type");
    protected final String a;
    protected final long b;
    protected G c;

    protected AbstractC1409A(String str, boolean z) {
        G g;
        this.a = str;
        long jZ = com.github.catvod.spider.merge.H.A.z(str);
        this.b = jZ;
        if (z) {
            if (jZ == d) {
                g = K.a;
            } else {
                if (jZ != 5614464919154503228L) {
                    throw new O(C1290c.a("unsupported funciton : ", str));
                }
                g = H.a;
            }
            this.c = g;
        }
    }

    protected final Object b(N n, Object obj, Object obj2) {
        G g = this.c;
        return g != null ? g.a(n, obj, obj2) : n.k(obj2, this.a, this.b);
    }
}
