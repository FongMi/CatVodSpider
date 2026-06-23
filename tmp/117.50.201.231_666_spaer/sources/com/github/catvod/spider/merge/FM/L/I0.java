package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum I0 extends j1 {
    I0() {
        super("Comment", 46, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        char cU = c0217a.u();
        if (cU == 0) {
            t.r(this);
            c0217a.a();
            t.n.k((char) 65533);
        } else if (cU == '-') {
            t.a(j1.V);
        } else {
            if (cU != 65535) {
                t.n.l(c0217a.q('-', 0));
                return;
            }
            t.q(this);
            t.n();
            t.v(j1.a);
        }
    }
}
