package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum U extends h1 {
    U() {
        super("RCDATAEndTagOpen", 11, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        if (!c0631a.C()) {
            q.k("</");
            q.u(h1.e);
        } else {
            q.g(false);
            q.i.n(c0631a.s());
            q.h.append(c0631a.s());
            q.a(h1.o);
        }
    }
}
