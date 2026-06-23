package com.github.catvod.spider.merge.Fs;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0636c0 extends h1 {
    C0636c0() {
        super("Data", 0, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        h1 h1Var;
        char cS = c0631a.s();
        if (cS == 0) {
            q.q(this);
            q.i(c0631a.e());
            return;
        }
        if (cS == '&') {
            h1Var = h1.d;
        } else {
            if (cS != '<') {
                if (cS != 65535) {
                    q.k(c0631a.g());
                    return;
                } else {
                    q.j(new K());
                    return;
                }
            }
            h1Var = h1.j;
        }
        q.a(h1Var);
    }
}
