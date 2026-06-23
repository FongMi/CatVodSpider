package com.github.catvod.spider.merge.Fs;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0639e extends A {
    C0639e() {
        super("InColumnGroup", 11, null);
    }

    private boolean e(O o, i1 i1Var) {
        if (i1Var.d("colgroup")) {
            return i1Var.c(o);
        }
        return true;
    }

    @Override // com.github.catvod.spider.merge.Fs.A
    final boolean d(O o, C0633b c0633b) {
        if (A.a(o)) {
            c0633b.E((H) o);
            return true;
        }
        int iA = com.github.catvod.spider.merge.Dw.h.a(o.a);
        if (iA == 0) {
            c0633b.n(this);
        } else if (iA == 1) {
            M m = (M) o;
            String str = m.c;
            str.getClass();
            if (!str.equals("col")) {
                return !str.equals("html") ? e(o, c0633b) : c0633b.X(o, A.i);
            }
            c0633b.G(m);
        } else if (iA != 2) {
            if (iA != 3) {
                if (iA == 5 && c0633b.a().d0().equals("html")) {
                    return true;
                }
                return e(o, c0633b);
            }
            c0633b.F((I) o);
        } else {
            if (!((L) o).c.equals("colgroup")) {
                return e(o, c0633b);
            }
            if (c0633b.a().d0().equals("html")) {
                c0633b.n(this);
                return false;
            }
            c0633b.U();
            c0633b.j0(A.k);
        }
        return true;
    }
}
