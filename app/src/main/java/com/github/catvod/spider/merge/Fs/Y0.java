package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class Y0 extends h1 {
    Y0() {
        super("DoctypeSystemIdentifier_doubleQuoted", 62, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        StringBuilder sb;
        C0636c0 c0636c0 = h1.c;
        char cE = c0631a.e();
        if (cE != 0) {
            if (cE == '\"') {
                q.u(h1.o0);
                return;
            }
            if (cE == '>') {
                q.q(this);
            } else if (cE != 65535) {
                sb = q.m.e;
            } else {
                q.p(this);
            }
            q.m.f = true;
            q.n();
            q.u(c0636c0);
            return;
        }
        q.q(this);
        sb = q.m.e;
        cE = 65533;
        sb.append(cE);
    }
}
