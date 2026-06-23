package com.github.catvod.spider.merge.Fs;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0649j extends A {
    C0649j() {
        super("InSelectInTable", 16, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.A
    final boolean d(O o, C0633b c0633b) {
        if (o.f() && com.github.catvod.spider.merge.Dw.e.b(((M) o).c, C0680z.I)) {
            c0633b.n(this);
            c0633b.d("select");
            return c0633b.c(o);
        }
        if (o.e()) {
            L l = (L) o;
            if (com.github.catvod.spider.merge.Dw.e.b(l.c, C0680z.I)) {
                c0633b.n(this);
                if (!c0633b.B(l.c)) {
                    return false;
                }
                c0633b.d("select");
                return c0633b.c(o);
            }
        }
        return c0633b.X(o, A.r);
    }
}
