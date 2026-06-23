package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class c1 extends h1 {
    c1() {
        super("CdataSection", 66, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        q.h.append(c0631a.n());
        if (c0631a.w("]]>") || c0631a.t()) {
            q.j(new G(q.h.toString()));
            q.u(h1.c);
        }
    }
}
