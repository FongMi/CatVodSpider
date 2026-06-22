package com.github.catvod.spider.merge.d1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum f1 extends i1 {
    f1() {
        super("PLAINTEXT", 6, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        char cU = c0973a.u();
        if (cU == 0) {
            s.r(this);
            c0973a.a();
            s.j((char) 65533);
        } else if (cU != 65535) {
            s.l(c0973a.p((char) 0));
        } else {
            s.k(new L());
        }
    }
}
