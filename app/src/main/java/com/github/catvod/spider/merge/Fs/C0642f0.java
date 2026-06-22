package com.github.catvod.spider.merge.Fs;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0642f0 extends h1 {
    C0642f0() {
        super("ScriptDataEscaped", 21, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        h1 h1Var;
        if (c0631a.t()) {
            q.p(this);
            q.u(h1.c);
            return;
        }
        char cS = c0631a.s();
        if (cS == 0) {
            q.q(this);
            c0631a.a();
            q.i((char) 65533);
            return;
        }
        if (cS == '-') {
            q.i('-');
            h1Var = h1.y;
        } else {
            if (cS != '<') {
                q.k(c0631a.p('-', '<', 0));
                return;
            }
            h1Var = h1.A;
        }
        q.a(h1Var);
    }
}
