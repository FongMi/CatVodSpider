package com.github.catvod.spider.merge.Fs;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0648i0 extends h1 {
    C0648i0() {
        super("ScriptDataEscapedLessthanSign", 24, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        h1 h1Var;
        if (c0631a.C()) {
            q.h();
            q.h.append(c0631a.s());
            q.k("<");
            q.i(c0631a.s());
            h1Var = h1.D;
        } else if (!c0631a.y('/')) {
            q.i('<');
            q.u(h1.x);
            return;
        } else {
            q.h();
            h1Var = h1.B;
        }
        q.a(h1Var);
    }
}
