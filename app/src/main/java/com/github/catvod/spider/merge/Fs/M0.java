package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum M0 extends h1 {
    M0() {
        super("BeforeDoctypeName", 51, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        N0 n0 = h1.c0;
        if (c0631a.C()) {
            q.f();
            q.u(n0);
            return;
        }
        char cE = c0631a.e();
        if (cE == 0) {
            q.q(this);
            q.f();
            q.m.b.append((char) 65533);
        } else {
            if (cE == ' ') {
                return;
            }
            if (cE == 65535) {
                q.p(this);
                q.f();
                q.m.f = true;
                q.n();
                q.u(h1.c);
                return;
            }
            if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r') {
                return;
            }
            q.f();
            q.m.b.append(cE);
        }
        q.u(n0);
    }
}
