package com.github.catvod.spider.merge.C0.d0;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.d0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0127c extends A {
    C0127c() {
        super("InTableText", 9, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.A
    final boolean d(O o, C0125b c0125b) {
        A a = A.i;
        if (o.a == 5) {
            H h = (H) o;
            if (h.j().equals(A.z)) {
                c0125b.n(this);
                return false;
            }
            ((ArrayList) c0125b.v()).add(h.j());
            return true;
        }
        if (((ArrayList) c0125b.v()).size() > 0) {
            for (String str : (ArrayList) c0125b.v()) {
                if (com.github.catvod.spider.merge.C0.b0.b.c(str)) {
                    H h2 = new H();
                    h2.i(str);
                    c0125b.E(h2);
                } else {
                    c0125b.n(this);
                    if (com.github.catvod.spider.merge.C0.b0.b.b(c0125b.a().d0(), C0172z.C)) {
                        c0125b.g0(true);
                        H h3 = new H();
                        h3.i(str);
                        c0125b.X(h3, a);
                        c0125b.g0(false);
                    } else {
                        H h4 = new H();
                        h4.i(str);
                        c0125b.X(h4, a);
                    }
                }
            }
            c0125b.R();
        }
        c0125b.j0(c0125b.T());
        return c0125b.c(o);
    }
}
