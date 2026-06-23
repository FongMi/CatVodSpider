package com.github.catvod.spider.merge.d1;

import com.github.catvod.spider.merge.b1.C0906c;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0977c extends EnumC0969B {
    C0977c() {
        super("InTableText", 9, null);
    }

    @Override // com.github.catvod.spider.merge.d1.EnumC0969B
    final boolean d(P p, C0975b c0975b) {
        EnumC0969B enumC0969B = EnumC0969B.h;
        if (p.a == 5) {
            I i = (I) p;
            if (i.l().equals(EnumC0969B.z)) {
                c0975b.r(this);
                return false;
            }
            ((ArrayList) c0975b.A()).add(i.l());
            return true;
        }
        if (((ArrayList) c0975b.A()).size() > 0) {
            for (String str : (ArrayList) c0975b.A()) {
                if (C0906c.d(str)) {
                    I i2 = new I();
                    i2.k(str);
                    c0975b.I(i2);
                } else {
                    c0975b.r(this);
                    if (C0906c.c(c0975b.a().f0(), C0968A.A)) {
                        c0975b.o0(true);
                        I i3 = new I();
                        i3.k(str);
                        c0975b.d0(i3, enumC0969B);
                        c0975b.o0(false);
                    } else {
                        I i4 = new I();
                        i4.k(str);
                        c0975b.d0(i4, enumC0969B);
                    }
                }
            }
            c0975b.U();
        }
        c0975b.s0(c0975b.Y());
        return c0975b.e(p);
    }
}
