package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.d0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0131e extends A {
    C0131e() {
        super("InColumnGroup", 11, null);
    }

    private boolean e(O o, i1 i1Var) {
        if (i1Var.d("colgroup")) {
            return i1Var.c(o);
        }
        return true;
    }

    @Override // com.github.catvod.spider.merge.C0.d0.A
    final boolean d(O o, C0125b c0125b) {
        if (A.a(o)) {
            c0125b.E((H) o);
            return true;
        }
        int iA = com.github.catvod.spider.merge.C0.l.a.a(o.a);
        if (iA == 0) {
            c0125b.n(this);
        } else if (iA == 1) {
            M m = (M) o;
            String str = m.c;
            str.getClass();
            if (!str.equals("col")) {
                return !str.equals("html") ? e(o, c0125b) : c0125b.X(o, A.i);
            }
            c0125b.G(m);
        } else if (iA != 2) {
            if (iA != 3) {
                if (iA == 5 && c0125b.a().d0().equals("html")) {
                    return true;
                }
                return e(o, c0125b);
            }
            c0125b.F((I) o);
        } else {
            if (!((L) o).c.equals("colgroup")) {
                return e(o, c0125b);
            }
            if (c0125b.a().d0().equals("html")) {
                c0125b.n(this);
                return false;
            }
            c0125b.U();
            c0125b.j0(A.k);
        }
        return true;
    }
}
