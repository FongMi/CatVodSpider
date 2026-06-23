package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum g1 extends j1 {
    g1() {
        super("PLAINTEXT", 6, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        char cU = c0217a.u();
        if (cU == 0) {
            t.r(this);
            c0217a.a();
            t.j((char) 65533);
        } else if (cU != 65535) {
            t.l(c0217a.p((char) 0));
        } else {
            t.k(new L());
        }
    }
}
