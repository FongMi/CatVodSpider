package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum U extends h1 {
    U() {
        super("RCDATAEndTagOpen", 11, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        if (!c0123a.C()) {
            q.k("</");
            q.u(h1.e);
        } else {
            q.g(false);
            q.i.n(c0123a.s());
            q.h.append(c0123a.s());
            q.a(h1.o);
        }
    }
}
