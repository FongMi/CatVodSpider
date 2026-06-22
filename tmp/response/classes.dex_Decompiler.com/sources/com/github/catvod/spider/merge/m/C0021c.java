package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0021c extends B {
    C0021c() {
        super(oZP.d("3C0123200E39103B123918"), 9, null);
    }

    @Override // com.github.catvod.spider.merge.M.B
    final boolean d(Q q, C0019b c0019b) {
        B b = B.g;
        if (q.a == 5) {
            I i = (I) q;
            if (i.l().equals(B.y)) {
                c0019b.t(this);
                return false;
            }
            ((ArrayList) c0019b.C()).add(i.l());
            return true;
        }
        if (((ArrayList) c0019b.C()).size() > 0) {
            for (String str : (ArrayList) c0019b.C()) {
                if (com.github.catvod.spider.merge.K.b.d(str)) {
                    I i2 = new I();
                    i2.k(str);
                    c0019b.K(i2);
                } else {
                    c0019b.t(this);
                    if (com.github.catvod.spider.merge.K.b.c(c0019b.a().i0(), A.A)) {
                        c0019b.q0(true);
                        I i3 = new I();
                        i3.k(str);
                        c0019b.f0(i3, b);
                        c0019b.q0(false);
                    } else {
                        I i4 = new I();
                        i4.k(str);
                        c0019b.f0(i4, b);
                    }
                }
            }
            c0019b.W();
        }
        c0019b.u0(c0019b.a0());
        return c0019b.g(q);
    }
}
