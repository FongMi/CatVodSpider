package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0260w extends B {
    C0260w() {
        super("AfterHead", 5, null);
    }

    private boolean e(Q q, C0219b c0219b) {
        c0219b.j("body");
        c0219b.u(true);
        return c0219b.g(q);
    }

    @Override // com.github.catvod.spider.merge.FM.L.B
    final boolean d(Q q, C0219b c0219b) {
        C0256u c0256u = B.d;
        C0262x c0262x = B.g;
        if (B.a(q)) {
            c0219b.K((I) q);
            return true;
        }
        if (q.c()) {
            c0219b.L((J) q);
            return true;
        }
        if (q.d()) {
            c0219b.t(this);
            return true;
        }
        if (q.g()) {
            N n = (N) q;
            String str = n.e;
            if (str.equals("html")) {
                return c0219b.f0(q, c0262x);
            }
            if (str.equals("body")) {
                c0219b.J(n);
                c0219b.u(false);
                c0219b.u0(c0262x);
                return true;
            }
            if (str.equals("frameset")) {
                c0219b.J(n);
                c0219b.u0(B.t);
                return true;
            }
            if (com.github.catvod.spider.merge.FM.J.b.c(str, A.g)) {
                c0219b.t(this);
                com.github.catvod.spider.merge.FM.K.m mVarB = c0219b.B();
                c0219b.e.add(mVarB);
                c0219b.f0(q, c0256u);
                c0219b.l0(mVarB);
                return true;
            }
            if (str.equals("head")) {
                c0219b.t(this);
                return false;
            }
        } else if (q.f()) {
            String str2 = ((M) q).e;
            if (!com.github.catvod.spider.merge.FM.J.b.c(str2, A.d)) {
                if (str2.equals("template")) {
                    c0219b.f0(q, c0256u);
                    return true;
                }
                c0219b.t(this);
                return false;
            }
        }
        e(q, c0219b);
        return true;
    }
}
