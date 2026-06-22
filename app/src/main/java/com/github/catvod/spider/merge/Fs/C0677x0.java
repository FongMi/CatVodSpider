package com.github.catvod.spider.merge.Fs;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0677x0 extends h1 {
    C0677x0() {
        super("AttributeValue_singleQuoted", 38, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        N n;
        h1 h1Var;
        String strF = c0631a.f(true);
        if (strF.length() > 0) {
            q.i.l(strF);
        } else {
            q.i.w();
        }
        char cE = c0631a.e();
        if (cE != 0) {
            if (cE == 65535) {
                q.p(this);
                h1Var = h1.c;
            } else {
                if (cE == '&') {
                    int[] iArrD = q.d('\'', true);
                    N n2 = q.i;
                    if (iArrD != null) {
                        n2.m(iArrD);
                        return;
                    } else {
                        n2.k('&');
                        return;
                    }
                }
                if (cE != '\'') {
                    n = q.i;
                } else {
                    h1Var = h1.Q;
                }
            }
            q.u(h1Var);
            return;
        }
        q.q(this);
        n = q.i;
        cE = 65533;
        n.k(cE);
    }
}
