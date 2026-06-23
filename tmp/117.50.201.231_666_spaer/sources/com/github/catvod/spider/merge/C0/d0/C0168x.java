package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.d0.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0168x extends A {
    C0168x() {
        super("Text", 7, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.A
    final boolean d(O o, C0125b c0125b) {
        if (o.a()) {
            c0125b.E((H) o);
        } else {
            if (o.d()) {
                c0125b.n(this);
                c0125b.U();
                c0125b.j0(c0125b.T());
                return c0125b.c(o);
            }
            if (o.e()) {
                c0125b.U();
                c0125b.j0(c0125b.T());
            }
        }
        return true;
    }
}
