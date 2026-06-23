package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0229g extends B {
    C0229g() {
        super("InRow", 13, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.B
    final boolean d(Q q, C0219b c0219b) {
        C0227f c0227f = B.m;
        C0266z c0266z = B.i;
        if (q.g()) {
            N n = (N) q;
            String str = n.e;
            if (com.github.catvod.spider.merge.FM.J.b.c(str, A.v)) {
                c0219b.r();
                c0219b.J(n);
                c0219b.u0(B.o);
                c0219b.P();
                return true;
            }
            if (!com.github.catvod.spider.merge.FM.J.b.c(str, A.D)) {
                return c0219b.f0(q, c0266z);
            }
            if (c0219b.h("tr")) {
                return c0219b.g(q);
            }
            return false;
        }
        if (!q.f()) {
            return c0219b.f0(q, c0266z);
        }
        String str2 = ((M) q).e;
        if (str2.equals("tr")) {
            if (!c0219b.I(str2)) {
                c0219b.t(this);
                return false;
            }
        } else {
            if (str2.equals("table")) {
                if (c0219b.h("tr")) {
                    return c0219b.g(q);
                }
                return false;
            }
            if (!com.github.catvod.spider.merge.FM.J.b.c(str2, A.s)) {
                if (!com.github.catvod.spider.merge.FM.J.b.c(str2, A.E)) {
                    return c0219b.f0(q, c0266z);
                }
                c0219b.t(this);
                return false;
            }
            if (!c0219b.I(str2) || !c0219b.I("tr")) {
                c0219b.t(this);
                return false;
            }
        }
        c0219b.r();
        c0219b.b0();
        c0219b.u0(c0227f);
        return true;
    }
}
