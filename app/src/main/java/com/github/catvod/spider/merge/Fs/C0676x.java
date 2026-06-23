package com.github.catvod.spider.merge.Fs;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0676x extends A {
    C0676x() {
        super("Text", 7, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.A
    final boolean d(O o, C0633b c0633b) {
        if (o.a()) {
            c0633b.E((H) o);
            return true;
        }
        if (o.d()) {
            c0633b.n(this);
            c0633b.U();
            c0633b.j0(c0633b.T());
            return c0633b.c(o);
        }
        if (!o.e()) {
            return true;
        }
        c0633b.U();
        c0633b.j0(c0633b.T());
        return true;
    }
}
