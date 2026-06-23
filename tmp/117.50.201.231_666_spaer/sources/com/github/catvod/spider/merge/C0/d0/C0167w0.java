package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.d0.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0167w0 extends h1 {
    C0167w0() {
        super("AttributeValue_doubleQuoted", 37, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        N n;
        h1 h1Var;
        String strF = c0123a.f(false);
        if (strF.length() > 0) {
            q.i.l(strF);
        } else {
            q.i.w();
        }
        char cE = c0123a.e();
        if (cE != 0) {
            if (cE == '\"') {
                h1Var = h1.Q;
            } else {
                if (cE == '&') {
                    int[] iArrD = q.d('\"', true);
                    N n2 = q.i;
                    if (iArrD != null) {
                        n2.m(iArrD);
                        return;
                    } else {
                        n2.k('&');
                        return;
                    }
                }
                if (cE != 65535) {
                    n = q.i;
                } else {
                    q.p(this);
                    h1Var = h1.c;
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
