package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class a1 extends h1 {
    a1() {
        super("AfterDoctypeSystemIdentifier", 64, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        C0636c0 c0636c0 = h1.c;
        char cE = c0631a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            return;
        }
        if (cE != '>') {
            if (cE != 65535) {
                q.q(this);
                q.u(h1.p0);
                return;
            } else {
                q.p(this);
                q.m.f = true;
            }
        }
        q.n();
        q.u(c0636c0);
    }
}
