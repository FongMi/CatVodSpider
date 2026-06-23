package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.d0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0141j extends A {
    C0141j() {
        super("InSelectInTable", 16, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.A
    final boolean d(O o, C0125b c0125b) {
        if (o.f() && com.github.catvod.spider.merge.C0.b0.b.b(((M) o).c, C0172z.I)) {
            c0125b.n(this);
            c0125b.d("select");
            return c0125b.c(o);
        }
        if (o.e()) {
            L l = (L) o;
            if (com.github.catvod.spider.merge.C0.b0.b.b(l.c, C0172z.I)) {
                c0125b.n(this);
                if (!c0125b.B(l.c)) {
                    return false;
                }
                c0125b.d("select");
                return c0125b.c(o);
            }
        }
        return c0125b.X(o, A.r);
    }
}
