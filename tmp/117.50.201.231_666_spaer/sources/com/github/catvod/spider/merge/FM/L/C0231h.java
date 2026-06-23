package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0231h extends B {
    C0231h() {
        super("InCell", 14, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.B
    final boolean d(Q q, C0219b c0219b) {
        C0229g c0229g = B.n;
        C0262x c0262x = B.g;
        if (!q.f()) {
            if (!q.g() || !com.github.catvod.spider.merge.FM.J.b.c(((N) q).e, A.y)) {
                return c0219b.f0(q, c0262x);
            }
            if (c0219b.I("td") || c0219b.I("th")) {
                c0219b.h(c0219b.I("td") ? "td" : "th");
                return c0219b.g(q);
            }
            c0219b.t(this);
            return false;
        }
        String str = ((M) q).e;
        if (!com.github.catvod.spider.merge.FM.J.b.c(str, A.v)) {
            if (com.github.catvod.spider.merge.FM.J.b.c(str, A.w)) {
                c0219b.t(this);
                return false;
            }
            if (!com.github.catvod.spider.merge.FM.J.b.c(str, A.x)) {
                return c0219b.f0(q, c0262x);
            }
            if (c0219b.I(str)) {
                c0219b.h(c0219b.I("td") ? "td" : "th");
                return c0219b.g(q);
            }
            c0219b.t(this);
            return false;
        }
        if (!c0219b.I(str)) {
            c0219b.t(this);
            c0219b.u0(c0229g);
            return false;
        }
        c0219b.x(false);
        if (!c0219b.b(str)) {
            c0219b.t(this);
        }
        c0219b.c0(str);
        c0219b.n();
        c0219b.u0(c0229g);
        return true;
    }
}
