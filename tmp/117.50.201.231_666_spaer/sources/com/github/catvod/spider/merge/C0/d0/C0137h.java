package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.d0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0137h extends A {
    C0137h() {
        super("InCell", 14, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.A
    final boolean d(O o, C0125b c0125b) {
        C0135g c0135g = A.p;
        C0166w c0166w = A.i;
        if (!o.e()) {
            if (!o.f() || !com.github.catvod.spider.merge.C0.b0.b.b(((M) o).c, C0172z.A)) {
                return c0125b.X(o, c0166w);
            }
            if (c0125b.B("td") || c0125b.B("th")) {
                c0125b.d(c0125b.B("td") ? "td" : "th");
                return c0125b.c(o);
            }
            c0125b.n(this);
            return false;
        }
        String str = ((L) o).c;
        if (com.github.catvod.spider.merge.C0.b0.b.b(str, C0172z.x)) {
            if (!c0125b.B(str)) {
                c0125b.n(this);
                c0125b.j0(c0135g);
                return false;
            }
            if (!c0125b.a().d0().equals(str)) {
                c0125b.n(this);
            }
            c0125b.V(str);
            c0125b.i();
            c0125b.j0(c0135g);
            return true;
        }
        if (com.github.catvod.spider.merge.C0.b0.b.b(str, C0172z.y)) {
            c0125b.n(this);
            return false;
        }
        if (!com.github.catvod.spider.merge.C0.b0.b.b(str, C0172z.z)) {
            return c0125b.X(o, c0166w);
        }
        if (c0125b.B(str)) {
            c0125b.d(c0125b.B("td") ? "td" : "th");
            return c0125b.c(o);
        }
        c0125b.n(this);
        return false;
    }
}
