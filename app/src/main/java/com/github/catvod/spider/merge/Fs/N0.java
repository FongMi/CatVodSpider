package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class N0 extends h1 {
    N0() {
        super("DoctypeName", 52, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        StringBuilder sb;
        C0636c0 c0636c0 = h1.c;
        if (c0631a.C()) {
            q.m.b.append(c0631a.j());
            return;
        }
        char cE = c0631a.e();
        if (cE != 0) {
            if (cE != ' ') {
                if (cE != '>') {
                    if (cE == 65535) {
                        q.p(this);
                        q.m.f = true;
                    } else if (cE != '\t' && cE != '\n' && cE != '\f' && cE != '\r') {
                        sb = q.m.b;
                    }
                }
                q.n();
                q.u(c0636c0);
                return;
            }
            q.u(h1.d0);
            return;
        }
        q.q(this);
        sb = q.m.b;
        cE = 65533;
        sb.append(cE);
    }
}
