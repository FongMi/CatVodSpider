package com.github.catvod.spider.merge.Fs;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0655m extends A {
    C0655m() {
        super("Initial", 0, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.A
    final boolean d(O o, C0633b c0633b) {
        r rVar = A.d;
        if (A.a(o)) {
            return true;
        }
        if (o.b()) {
            c0633b.F((I) o);
        } else {
            if (!o.c()) {
                c0633b.j0(rVar);
                return c0633b.c(o);
            }
            J j = (J) o;
            com.github.catvod.spider.merge.Em.i iVar = new com.github.catvod.spider.merge.Em.i(c0633b.h.c(j.b.toString()), j.d.toString(), j.e.toString());
            iVar.L(j.c);
            c0633b.d.L(iVar);
            if (j.f) {
                c0633b.d.v0();
            }
            c0633b.j0(rVar);
        }
        return true;
    }
}
