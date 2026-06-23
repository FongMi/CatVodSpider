package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum c1 extends h1 {
    c1() {
        super("CdataSection", 66, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        q.h.append(c0123a.n());
        if (c0123a.w("]]>") || c0123a.t()) {
            q.j(new G(q.h.toString()));
            q.u(h1.c);
        }
    }
}
