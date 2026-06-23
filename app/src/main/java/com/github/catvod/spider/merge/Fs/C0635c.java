package com.github.catvod.spider.merge.Fs;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0635c extends A {
    C0635c() {
        super("InTableText", 9, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.A
    final boolean d(O o, C0633b c0633b) {
        A a = A.i;
        if (o.a == 5) {
            H h = (H) o;
            if (h.j().equals(A.z)) {
                c0633b.n(this);
                return false;
            }
            ((ArrayList) c0633b.v()).add(h.j());
            return true;
        }
        if (((ArrayList) c0633b.v()).size() > 0) {
            for (String str : (ArrayList) c0633b.v()) {
                if (com.github.catvod.spider.merge.Dw.e.c(str)) {
                    H h2 = new H();
                    h2.i(str);
                    c0633b.E(h2);
                } else {
                    c0633b.n(this);
                    if (com.github.catvod.spider.merge.Dw.e.b(c0633b.a().d0(), C0680z.C)) {
                        c0633b.g0(true);
                        H h3 = new H();
                        h3.i(str);
                        c0633b.X(h3, a);
                        c0633b.g0(false);
                    } else {
                        H h4 = new H();
                        h4.i(str);
                        c0633b.X(h4, a);
                    }
                }
            }
            c0633b.R();
        }
        c0633b.j0(c0633b.T());
        return c0633b.c(o);
    }
}
