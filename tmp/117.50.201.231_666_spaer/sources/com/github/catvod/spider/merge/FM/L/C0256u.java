package com.github.catvod.spider.merge.FM.L;

import com.github.catvod.spider.merge.FM.x.C0440g;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0256u extends B {
    C0256u() {
        super("InHead", 3, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.B
    final boolean d(Q q, C0219b c0219b) {
        B b;
        C0264y c0264y = B.h;
        if (B.a(q)) {
            c0219b.K((I) q);
            return true;
        }
        int iA = C0440g.a(q.a);
        if (iA == 0) {
            c0219b.t(this);
            return false;
        }
        if (iA == 1) {
            N n = (N) q;
            String str = n.e;
            if (str.equals("html")) {
                return B.g.d(q, c0219b);
            }
            if (com.github.catvod.spider.merge.FM.J.b.c(str, A.a)) {
                com.github.catvod.spider.merge.FM.K.m mVarM = c0219b.M(n);
                if (str.equals("base") && mVarM.n("href")) {
                    c0219b.V(mVarM);
                }
            } else if (str.equals("meta")) {
                c0219b.M(n);
            } else if (str.equals("title")) {
                c0219b.c.v(j1.c);
                c0219b.U();
                c0219b.u0(c0264y);
                c0219b.J(n);
            } else if (com.github.catvod.spider.merge.FM.J.b.c(str, A.b)) {
                B.b(n, c0219b);
            } else if (str.equals("noscript")) {
                c0219b.J(n);
                b = B.e;
                c0219b.u0(b);
            } else if (str.equals("script")) {
                c0219b.c.v(j1.f);
                c0219b.U();
                c0219b.u0(c0264y);
                c0219b.J(n);
            } else {
                if (str.equals("head")) {
                    c0219b.t(this);
                    return false;
                }
                if (!str.equals("template")) {
                    c0219b.h("head");
                    return c0219b.g(q);
                }
                c0219b.J(n);
                c0219b.P();
                c0219b.u(false);
                C0237k c0237k = B.r;
                c0219b.u0(c0237k);
                c0219b.h0(c0237k);
            }
        } else if (iA == 2) {
            String str2 = ((M) q).e;
            if (str2.equals("head")) {
                c0219b.b0();
                b = B.f;
                c0219b.u0(b);
            } else {
                if (com.github.catvod.spider.merge.FM.J.b.c(str2, A.c)) {
                    c0219b.h("head");
                    return c0219b.g(q);
                }
                if (!str2.equals("template")) {
                    c0219b.t(this);
                    return false;
                }
                if (c0219b.Y(str2)) {
                    c0219b.x(true);
                    if (!str2.equals(c0219b.a().i0())) {
                        c0219b.t(this);
                    }
                    c0219b.c0(str2);
                    c0219b.n();
                    c0219b.d0();
                    c0219b.o0();
                } else {
                    c0219b.t(this);
                }
            }
        } else {
            if (iA != 3) {
                c0219b.h("head");
                return c0219b.g(q);
            }
            c0219b.L((J) q);
        }
        return true;
    }
}
