package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0245o extends B {
    C0245o() {
        super("AfterFrameset", 20, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.B
    final boolean d(Q q, C0219b c0219b) {
        B b;
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
            return false;
        }
        if (q.g() && ((N) q).e.equals("html")) {
            b = B.g;
        } else {
            if (q.f() && ((M) q).e.equals("html")) {
                c0219b.u0(B.w);
                return true;
            }
            if (!q.g() || !((N) q).e.equals("noframes")) {
                if (q.e()) {
                    return true;
                }
                c0219b.t(this);
                return false;
            }
            b = B.d;
        }
        return c0219b.f0(q, b);
    }
}
