package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum A0 extends h1 {
    A0() {
        super("AfterAttributeValue_quoted", 40, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        C0636c0 c0636c0 = h1.c;
        C0667s0 c0667s0 = h1.J;
        char cE = c0631a.e();
        if (cE != '\t' && cE != '\n' && cE != '\f' && cE != '\r' && cE != ' ') {
            if (cE == '/') {
                q.u(h1.R);
                return;
            }
            if (cE == '>') {
                q.o();
            } else if (cE != 65535) {
                c0631a.G();
                q.q(this);
            } else {
                q.p(this);
            }
            q.u(c0636c0);
            return;
        }
        q.u(c0667s0);
    }
}
