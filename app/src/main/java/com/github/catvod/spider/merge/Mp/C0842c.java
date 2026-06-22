package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0842c extends B {
    C0842c() {
        super(ZrJ.d("302D1F2C2A291C172E353C"), 9, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.B
    final boolean d(Q q, C0840b c0840b) {
        B b = B.g;
        if (q.a == 5) {
            I i = (I) q;
            if (i.l().equals(B.y)) {
                c0840b.t(this);
                return false;
            }
            ((ArrayList) c0840b.C()).add(i.l());
            return true;
        }
        if (((ArrayList) c0840b.C()).size() > 0) {
            for (String str : (ArrayList) c0840b.C()) {
                if (com.github.catvod.spider.merge.XU.n.d(str)) {
                    I i2 = new I();
                    i2.k(str);
                    c0840b.K(i2);
                } else {
                    c0840b.t(this);
                    if (com.github.catvod.spider.merge.XU.n.c(c0840b.a().i0(), A.A)) {
                        c0840b.q0(true);
                        I i3 = new I();
                        i3.k(str);
                        c0840b.f0(i3, b);
                        c0840b.q0(false);
                    } else {
                        I i4 = new I();
                        i4.k(str);
                        c0840b.f0(i4, b);
                    }
                }
            }
            c0840b.W();
        }
        c0840b.u0(c0840b.a0());
        return c0840b.g(q);
    }
}
