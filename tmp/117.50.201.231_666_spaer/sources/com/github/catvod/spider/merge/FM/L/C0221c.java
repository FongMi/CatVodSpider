package com.github.catvod.spider.merge.FM.L;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0221c extends B {
    C0221c() {
        super("InTableText", 9, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.B
    final boolean d(Q q, C0219b c0219b) {
        B b = B.g;
        if (q.a == 5) {
            I i = (I) q;
            if (i.l().equals(B.y)) {
                c0219b.t(this);
                return false;
            }
            ((ArrayList) c0219b.C()).add(i.l());
            return true;
        }
        if (((ArrayList) c0219b.C()).size() > 0) {
            for (String str : (ArrayList) c0219b.C()) {
                if (com.github.catvod.spider.merge.FM.J.b.d(str)) {
                    I i2 = new I();
                    i2.k(str);
                    c0219b.K(i2);
                } else {
                    c0219b.t(this);
                    if (com.github.catvod.spider.merge.FM.J.b.c(c0219b.a().i0(), A.A)) {
                        c0219b.q0(true);
                        I i3 = new I();
                        i3.k(str);
                        c0219b.f0(i3, b);
                        c0219b.q0(false);
                    } else {
                        I i4 = new I();
                        i4.k(str);
                        c0219b.f0(i4, b);
                    }
                }
            }
            c0219b.W();
        }
        c0219b.u0(c0219b.a0());
        return c0219b.g(q);
    }
}
