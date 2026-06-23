package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.d0.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0140i0 extends h1 {
    C0140i0() {
        super("ScriptDataEscapedLessthanSign", 24, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        h1 h1Var;
        if (c0123a.C()) {
            q.h();
            q.h.append(c0123a.s());
            q.k("<");
            q.i(c0123a.s());
            h1Var = h1.D;
        } else if (!c0123a.y('/')) {
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
