package com.github.catvod.spider.merge.FM.L;

import com.github.catvod.spider.merge.FM.x.C0440g;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0227f extends B {
    C0227f() {
        super("InTableBody", 12, null);
    }

    private boolean e(Q q, C0219b c0219b) {
        if (!c0219b.I("tbody") && !c0219b.I("thead") && !c0219b.E("tfoot", null)) {
            c0219b.t(this);
            return false;
        }
        c0219b.p();
        c0219b.h(c0219b.a().i0());
        return c0219b.g(q);
    }

    @Override // com.github.catvod.spider.merge.FM.L.B
    final boolean d(Q q, C0219b c0219b) {
        B b = B.i;
        int iA = C0440g.a(q.a);
        if (iA == 1) {
            N n = (N) q;
            String str = n.e;
            if (!str.equals("tr")) {
                if (!com.github.catvod.spider.merge.FM.J.b.c(str, A.v)) {
                    return com.github.catvod.spider.merge.FM.J.b.c(str, A.B) ? e(q, c0219b) : c0219b.f0(q, b);
                }
                c0219b.t(this);
                c0219b.j("tr");
                return c0219b.g(n);
            }
            c0219b.p();
            c0219b.J(n);
            c0219b.u0(B.n);
        } else {
            if (iA != 2) {
                return c0219b.f0(q, b);
            }
            String str2 = ((M) q).e;
            if (!com.github.catvod.spider.merge.FM.J.b.c(str2, A.H)) {
                if (str2.equals("table")) {
                    return e(q, c0219b);
                }
                if (!com.github.catvod.spider.merge.FM.J.b.c(str2, A.C)) {
                    return c0219b.f0(q, b);
                }
                c0219b.t(this);
                return false;
            }
            if (!c0219b.I(str2)) {
                c0219b.t(this);
                return false;
            }
            c0219b.p();
            c0219b.b0();
            c0219b.u0(b);
        }
        return true;
    }
}
