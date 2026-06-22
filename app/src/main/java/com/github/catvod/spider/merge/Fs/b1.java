package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum b1 extends h1 {
    b1() {
        super("BogusDoctype", 65, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        C0636c0 c0636c0 = h1.c;
        char cE = c0631a.e();
        if (cE == '>' || cE == 65535) {
            q.n();
            q.u(c0636c0);
        }
    }
}
